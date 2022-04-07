package com.estefashion.webshop.productos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity(name = "productos")
@CrossOrigin(origins = "http://localhost:4200")
public class Productos {
	// ID, NOMBRE, DESCRIPCION, PVP, SN, IMAGEN, COLORPREDOMINANTE, STOCK, TEMPORADA, REBAJADO, ID_CATEGORIA, ID_TIPO_CLIENTE
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Identificador")
	private int identificador;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column(name = "PVP")
	private float pvp;
	@Column(name = "SN")
	private String sn;
	@Column
	private String imagen;
	@Column
	private String colorpredominante;
	private int stock;
	@Column
	private boolean temporada;
	@Column
	private boolean rebajado;
	@Column
	private int id_categoria;
	@Column
	private int id_tipo_cliente;
	
	
	//CONSTRUCTORES
		//CONSTRUCTOR VACÍO
	public Productos() {
		super();
	}
		//CONSTRUCTOR COMPLETO
	public Productos(int identificador, String nombre, String descripcion, float pvp, String sn, String imagen,
			String colorpredominante, int stock, boolean temporada, boolean rebajado, int id_categoria,
			int id_tipo_cliente) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.sn = sn;
		this.imagen = imagen;
		this.colorpredominante = colorpredominante;
		this.stock = stock;
		this.temporada = temporada;
		this.rebajado = rebajado;
		this.id_categoria = id_categoria;
		this.id_tipo_cliente = id_tipo_cliente;
	}
		//CONSTRUCTOR SIN ID
	
	public Productos(String nombre, String descripcion, float pvp, String sn, String imagen,
			String colorpredominante, int stock, boolean temporada, boolean rebajado, int id_categoria,
			int id_tipo_cliente) {
			this(0, nombre, descripcion, pvp, sn, imagen, colorpredominante, stock, temporada, rebajado, id_categoria, id_tipo_cliente);
	}

	public Productos(String nombre2, String descripcion, Integer pvp2, String imagen2, String colorpredominante2,
			Integer stock2, boolean temporada2, boolean rebajado2, Integer id_categoria2, Integer id_tipo_cliente2) {
		
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getColorpredominante() {
		return colorpredominante;
	}
	public void setColorpredominante(String colorpredominante) {
		this.colorpredominante = colorpredominante;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isTemporada() {
		return temporada;
	}
	public void setTemporada(boolean temporada) {
		this.temporada = temporada;
	}
	public boolean isRebajado() {
		return rebajado;
	}
	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getId_tipo_cliente() {
		return id_tipo_cliente;
	}
	public void setId_tipo_cliente(int id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}


	
}