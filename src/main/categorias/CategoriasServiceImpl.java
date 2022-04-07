package com.estefashion.webshop.categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//CategoriasServiceImpl implementa ICategoriasService
@Service
public class CategoriasServiceImpl implements ICategoriasService {
	@Autowired
	ICategoriasRepository repo; //REPO ES REPOSITORIO DE CATEGORIAS

	//MÉTODO PARA AÑADIR CATEGORIAS Y GUARDARLOS EN LA BASE DE DATOS POR ESO HABLAMOS CON REPO
	@Override
	public Categorias addCategorias(Categorias c) {
		return repo.save(c);
	}
	
//MÉTODO DE MOSTRAR LISTA DE CATEGORÍAS
	@Override
	public List<Categorias> findAll() {
		return repo.findAll();
	}
}
