package com.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.entity.Libro;
import com.practica.repository.LibroRepository;

@Service
public class LibroServiceImpl  implements LibroService {

     	@Autowired
	private LibroRepository repository;


    @Override
    public Libro buscaLibroPorId(int _id) {
        return repository.buscaLibroPorId(_id);
    }

    @Override
    public List<Libro> listaLibroPorCategoria(String categoria) {
        return repository.listaLibroPorCategoria(categoria);
    }

    @Override
    public List<Libro> listaLibro() {
       return repository.findAll();
    }


    //Nueva Consulta
    @Override
    public List<Libro> listaPorCategorias(List<String> categories) {
        return repository.listaPorCategorias(categories);
    }
    
}
