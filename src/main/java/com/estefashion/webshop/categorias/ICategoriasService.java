package com.estefashion.webshop.categorias;

import java.util.List;

//LAS INTERFACES SIEMPRE NECESITAN UNA CLASE QUE RELLENE EL "BOTON" QUE NOS PROPORCIONA LA INTERFAZ
//Aqui se meten todos los metodos que queramos hacer con la entidad categoria (añadir, actualizar, eliminar...)
public interface ICategoriasService {
//Método añadir categorías
	public Categorias addCategorias(Categorias c);
//Método para que busque en la Lista de <categorías>
	public List<Categorias> findAll();
}
