package com.estefashion.webshop.categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//Controller es darle indicaciones de que es un controlador y lo trate como tal pudiendo acceder después a la anotación @RequestMapping el cual nos va a permitir recibir de una manera y un compartamiento esperado peticiones HTTP
@Controller
public class CategoriasController {

	@Autowired // se emplea para generar la inyección de dependenciaa de un tipo de Objeto que pertenece a una clase
	// 'Hablamos' con el servicio
	private ICategoriasService categoriasService;

	@RequestMapping(value = "/crearCategorias") // Realizamos una petición HTTP con el valor de /crearCategorias
	// Definimos función y le damos sus parámetros
	public ModelAndView crearCategoria
			(@RequestParam(required = false, name = "identificador") Integer identificador,
			@RequestParam(required = false, name = "nombre") String nombre,
			@RequestParam(required = false, name = "imagen") String imagen) {
		if (nombre != null) {
			// Instancia de categoria
			Categorias categorias = new Categorias(identificador,nombre, imagen);
			categoriasService.addCategorias(categorias);
		}
		//Le damos a List<Categorias> que ahora es categorias y tiene como valor la función categoriasService.findAll()
		List<Categorias> categorias = categoriasService.findAll();
		ModelAndView mav = new ModelAndView(); //Ahora ModelAndView es mav
		//Le damos nombre al ModelAndView
		mav.setViewName("crear_categoria");
		//Y añadimos el objeto con sus dos parametros 
		mav.addObject("tipos_categorias", categorias);
		return mav;

	}

	@PostMapping("/add")
	public Categorias addCategorias(@Validated @RequestBody Categorias categorias) {
		return categoriasService.addCategorias(categorias);
	}
}
