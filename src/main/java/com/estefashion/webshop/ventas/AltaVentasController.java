package com.estefashion.webshop.ventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AltaVentasController {
	
	@Autowired
	private IVentasService ventasService;
	
	@RequestMapping(value="addVentas",method=RequestMethod.GET)
	public String addVenta(
			@RequestParam(required = false, name = "id_cliente") Integer id_cliente,
			@RequestParam(required = false, name = "fecha") String fecha,
			@RequestParam(required = false, name = "importe") Integer importe , Model model)
	{
	Ventas v = new Ventas(id_cliente , fecha , importe);
	ventasService.addVentas(v);
	return "/crear_venta";
	}
}
