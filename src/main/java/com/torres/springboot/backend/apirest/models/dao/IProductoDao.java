package com.torres.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.torres.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
