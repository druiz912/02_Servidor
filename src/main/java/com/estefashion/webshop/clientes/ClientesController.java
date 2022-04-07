package com.estefashion.webshop.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientesController {
	
	@Autowired(required=true)
	private IClientesService clientesService;
	
	@RequestMapping(value = "/crearClientes")
		public ModelAndView crearClientes // Definimos función y le damos sus parámetros
			(@RequestParam(required = false, name = "nombre") String nombre ,
			@RequestParam(required = false, name = "apellidos") String apellidos ,
			@RequestParam(required = false, name = "email") String email ,
			@RequestParam(required = false, name = "password") String password ,
			@RequestParam(required = false, name = "suscripcion_nl") boolean suscripcion_nl ,
			@RequestParam(required = false, name = "direccion_envio") String direccion_envio,
			@RequestParam(required = false, name = "telefono") String telefono,
			@RequestParam(required = false, name = "estado") boolean estado)
	{
			if (nombre != null) {
				Clientes c = new Clientes (nombre, apellidos, email, password, suscripcion_nl, direccion_envio, telefono, estado);
				clientesService.addClientes(c);
			}
			List<Clientes> clientesList = clientesService.findAll();
			ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
			//Le damos nombre al ModelAndView
			mav.setViewName("crear_cliente.html");
			//Y añadimos el objeto con sus dos parametros 
			mav.addObject("clientes", clientesList);
			return mav;
		}

}
