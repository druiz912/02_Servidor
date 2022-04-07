package com.estefashion.webshop.tiposclientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//Controller es darle indicaciones de que es un controlador y lo trate como tal pudiendo acceder después a la anotación @RequestMapping 
@Controller
public class TiposClienteController {

	@Autowired // se emplea para generar la inyección de dependenciaa de un tipo de Objeto que pertenece a una clase
	// 'Hablamos' con el servicio
	private ITiposClientesService TiposClienteService;

	@RequestMapping(value = "/crearTiposClientes") // Realizamos una petición HTTP con el valor de /crearCategorias
	// Definimos función y le damos sus parámetros
	public ModelAndView crearTiposCliente
	(@RequestParam(required = false, name = "nombre") String nombre) {
		if (nombre != null) {
			TiposClientes tp = new TiposClientes(nombre);
			TiposClienteService.addTiposClientes(tp);
		}
		//Le damos a List<TiposClientes> que ahora es tiposC y tiene como valor la función TiposClienteService.findAll()
		List<TiposClientes> tipoDeClientes = TiposClienteService.findAll();
		ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
		//Le damos nombre al ModelAndView
		mav.setViewName("crear_tiposClientes");
		//Y añadimos el objeto con sus dos parametros 
		mav.addObject("tiposclientes", tipoDeClientes);
		return mav;
	}

}

//Creamos package dentro del package en src/main/java/com.nombreproyecto -->
// --> y aqui en ese proyecto creamos un package añadiendo .entities
//Por cada tabla de la base de datos existe una entidad que s como se llama 