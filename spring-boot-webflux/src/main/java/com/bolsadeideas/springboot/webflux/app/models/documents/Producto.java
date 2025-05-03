package com.bolsadeideas.springboot.webflux.app.models.documents;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="productos")
public class Producto {
	
	@Id
	private String id;
	
	@NotEmpty
	private String nombre;
	
	@Valid
	private Sucursal sucursal;
	
	private int cantidadSlock;

	public Producto() {}

	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		
	}
	
	public Producto(String nombre, Sucursal sucursal, int cantidadSlock) {
		this.nombre = nombre;
		this.sucursal = sucursal;
		this.cantidadSlock = cantidadSlock;
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
	
	public Sucursal getCategoria() {
		return sucursal;
	}

	public void setCategoria(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public int getCantidadSlock() {
		return cantidadSlock;
	}

	public void setCantidadSlock(int cantidadSlock) {
		this.cantidadSlock = cantidadSlock;
	}

	
	
	

}
