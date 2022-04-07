package com.estefashion.webshop.categorias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AltaCategoriaController {
	
	@Autowired
	private ICategoriasService categoriasService;
	
	@RequestMapping(value="addCategorias",method=RequestMethod.GET)
	
	public String addCategorias(
	@RequestParam(name="nombre", required=true) String nombre, 
	@RequestParam(name="imagen", required=false) String imagen,
	Model model)
	{
	Categorias c = new Categorias(nombre, imagen);
	categoriasService.addCategorias(c);
	return "/crear_categoria";
	}

}
