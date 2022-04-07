package com.estefashion.webshop.pedidos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "pedidos")
public class Pedidos {
	// ID, ID_CLIENTE, FECHA, IMPORTE , OBSERVACIONES
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	@Column(name = "id_cliente")
	private String id_cliente;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "importe")
	private Integer importe;
	@Column(name = "observaciones")
	private String observaciones;
	
	
	//CONSTRUCTORES
	
	public Pedidos() {
		super();
	}

//CONSTRUCTOR COMPLETO
	public Pedidos(int identificador, String id_cliente, String fecha, int importe, String observaciones) {
		super();
		this.identificador = identificador;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.importe = importe;
		this.observaciones = observaciones;
	}
//CONSTRUCTOR SIN IDENTIFICADOR	
	public Pedidos(String id_cliente, String fecha, int importe, String observaciones) {
	super();
	this.id_cliente = id_cliente;
	this.fecha = fecha;
	this.importe = importe;
	this.observaciones = observaciones;
}
	
//CONSTRUCTOR SIN IDENTIFICADOR y SIN IDENTIFICADOR DE ID CLIENTE
	public Pedidos(String fecha, int importe, String observaciones) {
	super();
	this.fecha = fecha;
	this.importe = importe;
	this.observaciones = observaciones;
}




	//GETTERS & SETTERS
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String  getFecha() {
		return fecha;
	}

	public void setFecha(String  fecha) {
		this.fecha = fecha;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
	