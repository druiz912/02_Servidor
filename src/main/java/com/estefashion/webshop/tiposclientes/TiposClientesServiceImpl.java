package com.estefashion.webshop.tiposclientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiposClientesServiceImpl implements ITiposClientesService {
	@Autowired
	ITiposClientesRepo repo; //REPO ES REPOSITORIO DE TiposClientes

	@Override
	public void addTiposClientes(TiposClientes tp) {

		repo.save(tp); //Le decimos que use repo y a continuación el método save
	}

	@Override
	public List<TiposClientes> findAll() {
		return repo.findAll();
	}

}
