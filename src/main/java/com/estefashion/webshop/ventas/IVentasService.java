package com.estefashion.webshop.ventas;

import java.util.List;

public interface IVentasService {
//	Añadimos la clase 'TiposClientes' 
	public void addVentas(Ventas venta);
	//AÑADIMOS MÉTODO 
	public List<Ventas> findAll();
}
