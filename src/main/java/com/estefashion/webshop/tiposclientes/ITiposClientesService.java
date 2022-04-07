package com.estefashion.webshop.tiposclientes;

import java.util.List;

public interface ITiposClientesService {
	//	Añadimos la clase 'TiposClientes' 
	public void addTiposClientes(TiposClientes tp);
	//AÑADIMOS MÉTODO 
	public List<TiposClientes> findAll();
}
