package com.estefashion.webshop.categorias;

import org.springframework.data.jpa.repository.JpaRepository;

//ESTO LO USA SPRING PARA CONECTARSE CON LA CATEGORIA EN LA BASE DE DATOS
//La interfaz ICategoriasRepository extiende de JpaRepository<Categorias(entity), Integer(tipo de dato)>
public interface ICategoriasRepository extends JpaRepository<Categorias, Integer>
{

}
