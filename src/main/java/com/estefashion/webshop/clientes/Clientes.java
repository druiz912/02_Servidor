package com.estefashion.webshop.clientes;

//Persistencia de JPA
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "clientes")
public class Clientes {
	// nombre, apellidos, email, password, suscripcion_nl(boolean), direccion_envio,
	// telefono(int-20), activo (oolean)

	@Id // LE ESTAMOS INDICANDO QUE "IDENTIFICADOR" ES PRIMARY KEY Y AUTOINCREMENTAL
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "suscripcion_nl")
	private boolean suscripcion_nl;
	@Column(name = "direccion_envio")
	private String direccion_envio;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "estado")
	private boolean estado;

//CONSTRUCTORES
	public Clientes() {
		super();
	}

//CONSTRUCTOR COMPLETO
	public Clientes(int identificador, String nombre, String apellidos, String email, String password,
			boolean suscripcion_nl, String direccion_envio, String telefono, boolean estado) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.suscripcion_nl = suscripcion_nl;
		this.direccion_envio = direccion_envio;
		this.telefono = telefono;
		this.estado = estado;
	}

//
	public Clientes(String nombre, String apellidos, String email, String password, boolean suscripcion_nl,
			String direccion_envio, String telefono, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.suscripcion_nl = suscripcion_nl;
		this.direccion_envio = direccion_envio;
		this.telefono = telefono;
		this.estado = estado;
	}

//GETTERS & SETTERS
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSuscripcion_nl() {
		return suscripcion_nl;
	}

	public void setSuscripcion_nl(boolean suscripcion_nl) {
		this.suscripcion_nl = suscripcion_nl;
	}

	public String getDireccion_envio() {
		return direccion_envio;
	}

	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
