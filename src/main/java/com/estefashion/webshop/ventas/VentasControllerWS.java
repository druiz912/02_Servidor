package com.estefashion.webshop.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class VentasControllerWS {
	
	@Autowired
	IVentasService ventasService;
	@RequestMapping(path="/ventas/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<Ventas> getAll() {
	return ventasService.findAll();
	}
	
	@RequestMapping(path="/ventas/xml", produces = {MediaType.APPLICATION_XML_VALUE})
	List<Ventas> getAllXML() {
	return ventasService.findAll();
	}

}
