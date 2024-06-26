package com.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practica.entity.Libro;
import com.practica.service.LibroService;

@RestController
@RequestMapping("/rest/libro")
public class LibroController {

    @Autowired
	private LibroService service;

	@GetMapping("/lista")
	@ResponseBody
	public List<Libro> lista(){
		return service.listaLibro();
	}


	//Buscar por id 
	@GetMapping("/buscaLibroPorId/{_id}")
	@ResponseBody
	public Libro buscaLibroPorId(@PathVariable("_id") int _id) {
		return service.buscaLibroPorId(_id);
	}

	//Lista por nombre
	@GetMapping("/listaLibroPorCategoria/{cate}")    //http://localhost:8092/rest/libro/listaLibroPorCategoria/XML //http://localhost:8092/rest/libro/listaLibroPorCategoria/Internet
	@ResponseBody
	public List<Libro> listaLibroXCategoria(@PathVariable("cate") String categoria) {
		return service.listaLibroPorCategoria(categoria);
	}

	//Lista con In en Categorias  Aquii
	    @GetMapping("/listaLibroPorCategorias")  //http://localhost:8092/rest/libro/listaLibroPorCategorias?categories=Java&categories=mobile

	@ResponseBody
	public List<Libro> lista(@RequestParam("categories") List<String> categories) {
        return service.listaPorCategorias(categories);
	}

}
