package com.estefashion.webshop.pedidos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PedidosControllerWS {

	@Autowired
	IPedidosService pedidosService;
	
	@RequestMapping(path="/pedidos/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	List<Pedidos> getAll() {
	return pedidosService.findAll();
	}
	
	
	@RequestMapping(path="/pedidos/xml", produces = {MediaType.APPLICATION_XML_VALUE})
	List<Pedidos> getAllXML() {
	return pedidosService.findAll();
	}
}
