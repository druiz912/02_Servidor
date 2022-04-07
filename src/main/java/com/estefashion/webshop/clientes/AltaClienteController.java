package com.estefashion.webshop.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AltaClienteController {
	
	@Autowired
	private IClientesService clientesService;
	
	@RequestMapping(path="/findAllClientes", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<Clientes> getAll() {
	return clientesService.findAll();
	}
	
	@RequestMapping(path="/buscarClientes", produces = {MediaType.APPLICATION_XML_VALUE})
	List<Clientes> getAllXML() {
	return clientesService.findAll();
	}
	

}
