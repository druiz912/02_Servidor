package com.estefashion.webshop.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements IClientesService {

	@Autowired
	IClientesRepo repo; // repositorio de clientes

//MÉTODO PARA AÑADIR CLIENTES Y GUARDARLOS EN LA BASE DE DATOS POR ESO HABLAMOS CON REPO
	@Override
	public  void addClientes(Clientes cl) {
		repo.save(cl);
	}
	@Override
	public List<Clientes> findAll() {
		return repo.findAll();
	}
}