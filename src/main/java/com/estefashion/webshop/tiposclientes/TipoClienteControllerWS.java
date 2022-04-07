package com.estefashion.webshop.tiposclientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TipoClienteControllerWS {

	@Autowired
	ITiposClientesService tipoclientesService;
	
	@RequestMapping(path="/tiposclientes/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<TiposClientes> getAll() {
	return tipoclientesService.findAll();
	}
	
	@RequestMapping(path="/tiposclientes/xml", produces = {MediaType.APPLICATION_XML_VALUE})
	List<TiposClientes> getAllXML() {
	return tipoclientesService.findAll();
	}
}
