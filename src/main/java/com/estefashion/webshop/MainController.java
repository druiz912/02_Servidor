package com.estefashion.webshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.productos.IProductosService;
import com.estefashion.webshop.productos.Productos;


@CrossOrigin(origins="*" , allowedHeaders= "*")
@Controller
public class MainController {
	
	@Autowired
	IProductosService servicioProductos;
	
	@RequestMapping(value="/principal")
	public ModelAndView mostrarPrincipal() {
		List<Productos> productos = servicioProductos.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("principal");
		mav.addObject("listado_productos",productos);//Indicación de los datos
		return mav;
	}
}
