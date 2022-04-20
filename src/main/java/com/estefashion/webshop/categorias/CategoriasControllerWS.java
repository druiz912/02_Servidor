package com.estefashion.webshop.categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RestController
public class CategoriasControllerWS {
	
	@Autowired
	ICategoriasService categoriasService;
	
	@RequestMapping(path="/categorias/xml", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<Categorias> getAll() {
	return categoriasService.findAll();
	}
	
	
	@RequestMapping(path="/categorias/json", produces = {MediaType.APPLICATION_XML_VALUE})
	List<Categorias> getAllXML() {
	return categoriasService.findAll();
	}

}
