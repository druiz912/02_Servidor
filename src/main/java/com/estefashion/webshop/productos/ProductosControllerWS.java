package com.estefashion.webshop.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductosControllerWS {

	@Autowired
	IProductosService productosService;

	@GetMapping(path = "/productos/json", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Productos> getAll() {
		return productosService.findAll();
	}

	@GetMapping(path = "/productos/xml", produces = { MediaType.APPLICATION_XML_VALUE })
	List<Productos> getAllXML() {
		return productosService.findAll();
	}
	// INNER CLASS
	public class Respuesta {
		int codigo;
		String descripcion;

		// CONSTRUCTOR VACÍO
		public Respuesta() {
			super();
		}

		// CONSTRUCTOR CON TODOS LOS PARAMETROS
		public Respuesta(int codigo, String descripcion) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
		}

		// GETTERS & SETTERS

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

	}
	
}
