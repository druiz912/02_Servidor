package com.estefashion.webshop.clientes;

import org.springframework.data.jpa.repository.JpaRepository;

//ESTO LO USA SPRING PARA CONECTARSE CON LA CATEGORIA EN LA BASE DE DATOS
//La interfaz IClientesRepo extiende de JpaRepository<Clientes(entity), Integer(tipo de dato)>
public interface IClientesRepo extends JpaRepository<Clientes, Integer> { 

}
