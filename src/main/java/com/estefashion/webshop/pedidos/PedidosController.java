package com.estefashion.webshop.pedidos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.clientes.Clientes;
import com.estefashion.webshop.clientes.IClientesService;

@Controller
public class PedidosController {
	
	@Autowired
	private IPedidosService pedidosService;
	
	@Autowired
	private IClientesService clientesService;
	
	@RequestMapping(value = "/crearPedidos")
	// Definimos función y le damos sus parámetros
		public ModelAndView crearPedidos // ID, ID_CLIENTE, FECHA, IMPORTE , OBSERVACIONES
			(@RequestParam(required = false, name = "id_cliente") String id_cliente ,
			@RequestParam(required = false, name = "fecha") String fecha ,
			@RequestParam(required = false, name = "importe") Integer importe , //Hay que poner Integer porque puede venir null y los datos primitivos no pueden ser nulos
			@RequestParam(required = false, name = "observaciones") String observaciones ) {
			if (id_cliente != null) {
				Pedidos pd = new Pedidos(id_cliente, fecha , importe , observaciones);
				pedidosService.addPedidos(pd);
			}
			ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
			
			//Le damos a List<Pedidos> que ahora es p y tiene como valor la función pedidosService.findAll()
			List<Pedidos> pedidos = pedidosService.findAll();
			//Le damos a List<Pedidos> que ahora es p y tiene como valor la función pedidosService.findAll()
			List<Clientes> cli = clientesService.findAll();
			//Le damos nombre al ModelAndView
			mav.setViewName("crear_pedido.html");
			//Y añadimos el objeto con sus dos parametros 
			mav.addObject("Pedidos", pedidos);
			mav.addObject("Clientes" , cli);
			return mav;
		}

}
