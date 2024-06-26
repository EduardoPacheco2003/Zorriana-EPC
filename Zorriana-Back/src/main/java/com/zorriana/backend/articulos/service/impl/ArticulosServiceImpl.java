package com.zorriana.backend.articulos.service.impl;

import com.zorriana.backend.articulos.entity.Articulos;
import com.zorriana.backend.articulos.repository.IArticulosRepository;
import com.zorriana.backend.articulos.service.IArticulosService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ArticulosServiceImpl implements IArticulosService {

  @Autowired
  private IArticulosRepository repository;

  @Override
  public List<Articulos> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Articulos> findById(Long id) {
    return repository.findById(id);
  }


  @Override
  public void save(Articulos articulo) {
    repository.save(articulo);
  }

  @Override
  public void update(Articulos articulo) {
    repository.update(articulo);
  }

  @Override
  public void deleteById(Long id) {
    Optional<Articulos> artOp = repository.findById(id);
    if (artOp.isPresent()) {
      repository.deleteById(id);
    }
  }
}
