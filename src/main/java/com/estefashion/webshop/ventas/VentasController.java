package com.estefashion.webshop.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.clientes.Clientes;
import com.estefashion.webshop.clientes.IClientesService;

@Controller
public class VentasController {

	@Autowired
	private IVentasService ventasService;
	@Autowired
	private IClientesService clientesService;
	
	@RequestMapping(value = "/crearVentas") // Realizamos una petición HTTP con el valor de /crearCategorias
	// Definimos función y le damos sus parámetros
	public ModelAndView crearVentas
			(@RequestParam(required = false, name = "id_cliente") Integer id_cliente,
			@RequestParam(required = false, name = "fecha") String fecha,
			@RequestParam(required = false, name = "importe") Integer importe) {
		if (id_cliente != null) {
			Ventas venta = new Ventas(id_cliente, fecha, importe);
			ventasService.addVentas(venta);
		}
		ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
		
		//Le damos a List<Ventas> que ahora es listaVentas y tiene como valor la función ventasService.findAll()
		List<Ventas> listaVentas = ventasService.findAll();
		//Le damos a List<Clientes> que ahora es cli y tiene como valor la función clientesService.findAll()
		List<Clientes> cli = clientesService.findAll();
		
		//Le damos nombre al ModelAndView
		mav.setViewName("crear_venta");
		//Y añadimos el objeto con sus dos parametros 
		mav.addObject("ventas", listaVentas);
		mav.addObject("Clientes" , cli);
		return mav;
	}

}
