package com.bolsadeideas.springboot.webflux.app.models.documents;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sucursales")
public class Sucursal {
	
	@Id
	@NotEmpty
	private String id;
	
	private String nombre;
	
	@Valid
	private Franquicia franquicia;
	
	public Sucursal() {
	}
	
	public Sucursal(String nombre) {
		this.nombre = nombre;
	}

	public Sucursal(String nombre, Franquicia franquicia) {
			this.nombre = nombre;
			this.franquicia = franquicia;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
