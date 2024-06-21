package com.practica.service;

import java.util.List;

import com.practica.entity.Libro;

public interface LibroService {
    
    public abstract List<Libro>listaLibro();

	public abstract Libro buscaLibroPorId(int id);

	public abstract List<Libro> listaLibroPorCategoria(String categoria);
}
