package com.estefashion.webshop.tiposclientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AltaTipoClienteController {
	
	@Autowired
	private ITiposClientesService tipoclientesService;
	
	
	@RequestMapping(value="addTipoCliente",method=RequestMethod.GET)
	public String addTipoClientes(
		@RequestParam(required = false, name = "nombre") String nombre , Model model)
	{
	TiposClientes tp = new TiposClientes(nombre);
	tipoclientesService.addTiposClientes(tp);
	return "/crear_tipoClientes";
	}


}
