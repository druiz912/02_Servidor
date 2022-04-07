package com.estefashion.webshop.pedidos;

import java.util.List;

public interface IPedidosService {
	public void addPedidos(Pedidos pd);
	public List<Pedidos> findAll();

}
