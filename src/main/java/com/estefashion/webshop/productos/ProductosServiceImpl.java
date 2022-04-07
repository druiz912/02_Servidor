package com.estefashion.webshop.productos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements IProductosService {
	@Autowired
	IProductosRepo repo;

	@Override
	public void addProductos(Productos product) {
		repo.save(product);
		
	}

	@Override
	public List<Productos> findAll() {
		return repo.findAll();
	}
	
}
