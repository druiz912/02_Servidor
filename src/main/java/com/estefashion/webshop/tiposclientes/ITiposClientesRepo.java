package com.estefashion.webshop.tiposclientes;

import org.springframework.data.jpa.repository.JpaRepository;

//ESTO LO USA SPRING PARA CONECTARSE CON LA CATEGORIA EN LA BASE DE DATOS
//La interfaz ITiposClientesRepo extiende de JpaRepository<TiposClientes(entity), Integer(tipo de dato)>
public interface ITiposClientesRepo extends JpaRepository<TiposClientes, Integer> {

}
