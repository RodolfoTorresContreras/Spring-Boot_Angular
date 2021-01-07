package com.torres.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.torres.springboot.backend.apirest.models.dao.IClienteDao;
import com.torres.springboot.backend.apirest.models.dao.IFacturaDao;
import com.torres.springboot.backend.apirest.models.dao.IProductoDao;
import com.torres.springboot.backend.apirest.models.entity.Cliente;
import com.torres.springboot.backend.apirest.models.entity.Factura;
import com.torres.springboot.backend.apirest.models.entity.Producto;
import com.torres.springboot.backend.apirest.models.entity.Region;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Autowired
	private IFacturaDao facturaDao;

	@Autowired
	private IProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}

	@Transactional(readOnly = true)
	@Override
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Transactional
	@Override
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

}