package com.estefashion.webshop.pedidos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements IPedidosService {
	
	@Autowired
	IPedidosRepo repo; // repositorio de pedidos

//MÉTODO PARA AÑADIR CLIENTES Y GUARDARLOS EN LA BASE DE DATOS POR ESO HABLAMOS CON REPO
	@Override
	public void addPedidos(Pedidos pd) {
		repo.save(pd);
	}
	@Override
	public List<Pedidos> findAll() {
		return repo.findAll();
	}
}