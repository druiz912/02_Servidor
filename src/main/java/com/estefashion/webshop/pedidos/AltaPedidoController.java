package com.estefashion.webshop.pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AltaPedidoController {
	
	@Autowired
	private IPedidosService pedidosService;
	
	@RequestMapping(value="addPedidos",method=RequestMethod.GET)
	public String addPedidos
			(@RequestParam(required = false, name = "id_cliente") String id_cliente ,
			 @RequestParam(required = false, name = "fecha") String fecha ,
			 @RequestParam(required = false, name = "importe") Integer importe , //Hay que poner Integer porque puede venir null y los datos primitivos no pueden ser nulos
			 @RequestParam(required = false, name = "observaciones") String observaciones, Model model)
	{
	Pedidos p = new Pedidos(id_cliente, fecha , importe , observaciones);
	pedidosService.addPedidos(p);
	return "/crear_pedido";
	}


}
