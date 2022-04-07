package com.estefashion.webshop.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.categorias.Categorias;
import com.estefashion.webshop.categorias.ICategoriasService;
import com.estefashion.webshop.tiposclientes.ITiposClientesService;
import com.estefashion.webshop.tiposclientes.TiposClientes;



@Controller
public class ProductosController {
		
	@Autowired
	private IProductosService productosService;
	@Autowired
	private ICategoriasService categoriasService;
	@Autowired
	private ITiposClientesService tiposClientesService;
	
	@RequestMapping(value = "/crearProductos")
	// Definimos función y le damos sus parámetros
			public ModelAndView crearProductos // ID, NOMBRE, DESCRIPCION, PVP, SN, IMAGEN, COLORPREDOMINANTE, STOCK, TEMPORADA, REBAJADO, ID_CATEGORIA, ID_TIPO_CLIENTE
				(@RequestParam(required = false, name = "nombre") String nombre,
				@RequestParam(required = false, name = "descripcion") String descripcion ,
				@RequestParam(required = false, name = "pvp") Integer pvp , //Hay que poner Integer porque puede venir null y los datos primitivos no pueden ser nulos
				@RequestParam(required = false, name = "imagen") String imagen,
				@RequestParam(required = false, name = "colopredominante") String colorpredominante,
				@RequestParam(required = false, name = "stock") Integer stock, 
				@RequestParam(required = false, name = "temporada") boolean temporada,
				@RequestParam(required = false, name = "rebajado") boolean rebajado,
				@RequestParam(required = false, name = "id_categoria") Integer id_categoria,
				@RequestParam(required = false, name = "id_tipo_cliente") Integer id_tipo_cliente) {
				if (nombre != null) {
					Productos product = new Productos(nombre, descripcion, pvp, imagen, colorpredominante, stock, temporada, rebajado, id_categoria, id_tipo_cliente);
					productosService.addProductos(product);
				}
				//Creamos el ModelAndView
				ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
				//Obtenemos la lista de categorias
				List<Categorias> categorias = categoriasService.findAll();
				//Obtenemos la lista de tipo de clientes
				List<TiposClientes> tiposclientes = tiposClientesService.findAll();
				//Le damos a List<TiposClientes> que ahora es tiposC y tiene como valor la función TiposClienteService.findAll()
				List<Productos> productos = productosService.findAll();
				//Le damos nombre al ModelAndView
				mav.setViewName("crear_producto.html");
				//Y añadimos los objetos con sus dos parametros 
				//Añadimos en el modelo; el objeto Producto como un producto
				mav.addObject("Producto", productos);
				//Añadimos en el modelo; el objeto Categorias como una categoria
				mav.addObject("Categorias", categorias);
				//Añadimos en el modelo el objeto Tipo Cliente como un Tipo de cliente
				mav.addObject("TiposClientes" , tiposclientes);
				return mav;
			}

}



