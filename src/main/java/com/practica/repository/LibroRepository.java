package com.practica.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.practica.entity.Libro;

public interface LibroRepository  extends MongoRepository <Libro,Integer>{

       //Agregamos para hacer las consultas
    @Query("{ '_id' : ?0 }")   
    public abstract Libro buscaLibroPorId(int id);

    //Agregamos para hacer las consultas para que busque por el mobre asi como el like
    @Query("{ 'categories':  ?0 }")
    public abstract List<Libro> listaLibroPorCategoria(String categoria);
}
