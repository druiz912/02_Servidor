package com.estefashion.webshop.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ClienteControllerWS {
	@Autowired
	IClientesService clientesService;

	@RequestMapping(path = "/clientes/json", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Clientes> getAll() {
		return clientesService.findAll();
	}

	@RequestMapping(path = "/clientes/xml", produces = { MediaType.APPLICATION_XML_VALUE })
	List<Clientes> getAllXML() {
		return clientesService.findAll();
	}

}
