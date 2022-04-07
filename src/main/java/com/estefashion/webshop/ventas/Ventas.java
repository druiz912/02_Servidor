package com.estefashion.webshop.ventas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ventas")
public class Ventas {
//id, id_cliente, fecha, importe

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Identificador")
	private int identificador;
	private int id_cliente;
	private String fecha;
	private int importe;

	// Constructores
	// Constructor vacío
	public Ventas() {
		super();
	}

	// Constructor completo
	public Ventas(int identificador, int id_cliente, String fecha, int importe) {
		super();
		this.identificador = identificador;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.importe = importe;
	}

	// Constructor sin identificador
	public Ventas(int id_cliente, String fecha, int importe) {
		super();
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.importe = importe;
	}

	
	// GETTERS & SETTERS
	

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}
}
