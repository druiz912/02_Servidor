package com.estefashion.webshop.pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

//ESTO LO USA SPRING PARA CONECTARSE CON LA CATEGORIA EN LA BASE DE DATOS
//La interfaz IPedidoRepo extiende de JpaRepository<Pedidos(entity), Integer(tipo de dato)>
public interface IPedidosRepo extends JpaRepository<Pedidos, Integer> {

}
