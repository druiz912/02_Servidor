package com.estefashion.webshop.clientes;

import java.util.List;

public interface IClientesService {
//MÉTODO ADDCLIENTES Y SUS PARÁMETROS 
	public void addClientes(Clientes c);
	public List<Clientes> findAll();
}
