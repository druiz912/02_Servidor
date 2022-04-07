package com.estefashion.webshop.tiposclientes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipos_clientes")
public class TiposClientes {

	@Id // LE ESTAMOS INDICANDO QUE "IDENTIFICADOR" ES PRIMARY KEY Y AUTOINCREMENTAL
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	@Column(name = "nombre")
	private String nombre;

	// CONSTRUCTORES
	public TiposClientes() {
		super();
	}

	public TiposClientes(int identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	
//CONSTRUCTOR SIN IDENTIFICADOR
	
	public TiposClientes(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTERS & SETTERS

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
