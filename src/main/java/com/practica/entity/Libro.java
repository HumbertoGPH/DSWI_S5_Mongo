package com.practica.entity;


import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "libro")   //Aqui cambia porque es colleccion 

public class Libro {
    private ObjectId _id;  //Es por que asi lo dice el json  , el tipo y como se llama debe ser igual al json. //Esto es como un Pk autogenerado 
	private String title;
	private String isbn;
	private int pageCount;
	private Date publishedDate;
	private String thumbnailUrl;
	private String shortDescription;
	private String longDescription;
	private String status;
    private List<String> authors;
    private List<String> categories; 

}




	

