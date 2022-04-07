package com.estefashion.webshop.productos;

import java.util.List;


public interface IProductosService {
	
	public void addProductos(Productos product);
	public List<Productos> findAll();
	
}
