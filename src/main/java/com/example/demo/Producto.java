package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {

	private @Id @GeneratedValue Integer id;
	private String nombre;
	private Float precio;

	public Producto() {}

	
	public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Producto producto = (Producto) o;
		return Objects.equals(id, producto.id) &&
			Objects.equals(nombre, producto.nombre) &&
			Objects.equals(precio, producto.precio);
	}

	
	@Override
	public int hashCode() {

		return Objects.hash(id, nombre);
	}


	@Override
	public String toString() {
		return "Producto{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", precio=" + precio + '\'' +
			'}';
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	

}