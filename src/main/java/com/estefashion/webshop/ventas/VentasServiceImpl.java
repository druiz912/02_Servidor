package com.estefashion.webshop.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiceImpl implements IVentasService {
	
	@Autowired
	IVentasRepo repo; //REPO ES REPOSITORIO DE TiposClientes

	@Override
	public void addVentas(Ventas venta) {

		repo.save(venta); //Le decimos que use repo y a continuación el método save
	}

	@Override
	public List<Ventas> findAll() {
		return repo.findAll();
	}

}
