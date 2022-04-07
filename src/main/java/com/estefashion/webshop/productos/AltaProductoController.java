package com.estefashion.webshop.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AltaProductoController {
	
	@Autowired
	private IProductosService productosService;
	
	@RequestMapping(value="addProductos",method=RequestMethod.GET)
	public String addProductos
	(@RequestParam(required = false, name = "nombre") String nombre,
			@RequestParam(required = false, name = "descripcion") String descripcion ,
			@RequestParam(required = false, name = "pvp") Integer pvp , //Hay que poner Integer porque puede venir null y los datos primitivos no pueden ser nulos
			@RequestParam(required = false, name = "imagen") String imagen,
			@RequestParam(required = false, name = "colopredominante") String colorpredominante,
			@RequestParam(required = false, name = "stock") Integer stock, 
			@RequestParam(required = false, name = "temporada") boolean temporada,
			@RequestParam(required = false, name = "rebajado") boolean rebajado,
			@RequestParam(required = false, name = "id_categoria") Integer id_categoria,
			@RequestParam(required = false, name = "id_tipo_cliente") Integer id_tipo_cliente)
	{
	Productos p = new Productos(nombre, descripcion, pvp, imagen, colorpredominante, stock, temporada, rebajado, id_categoria, id_tipo_cliente);
	productosService.addProductos(p);
	return "/crearProductos";
	}
}
