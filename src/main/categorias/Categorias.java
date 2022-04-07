package com.estefashion.webshop.categorias;

//PERSISTENCIA DE JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

//CLASE CREADA PARA LA TABLA DE LA BASE DE DATOS "CATEGORIAS"

@Entity(name = "categoria") // SE INDICA EL NOMBRE DE LA TABLA (en el caso que tenga distinto nombre o no la encuentre)
public class Categorias {

	@Id // LE ESTAMOS INDICANDO QUE "IDENTIFICADOR" ES PRIMARY KEY Y AUTOINCREMENTAL
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	@Column(name = "nombre") 
	private String nombre;
	@Column
	private String imagen;

	// Constructores
	public Categorias() {
		super();
	}

//CONSTRUCTOR SIN IDENTIFICADOR
	public Categorias(String nombre, String imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}
	

	public Categorias(int identificador, String nombre, String imagen) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.imagen = imagen;
	}

	// getters & setters

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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
