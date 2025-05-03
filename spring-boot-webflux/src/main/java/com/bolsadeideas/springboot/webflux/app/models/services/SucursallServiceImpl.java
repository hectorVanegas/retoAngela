package com.bolsadeideas.springboot.webflux.app.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.webflux.app.models.dao.SucursalDao;
import com.bolsadeideas.springboot.webflux.app.models.dao.FranquiciaDao;
import com.bolsadeideas.springboot.webflux.app.models.dao.ProductoDao;
import com.bolsadeideas.springboot.webflux.app.models.documents.Sucursal;
import com.bolsadeideas.springboot.webflux.app.models.documents.Franquicia;
import com.bolsadeideas.springboot.webflux.app.models.documents.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SucursallServiceImpl implements SucursalService{

	@Autowired
	private ProductoDao dao;
	
	@Autowired
	private SucursalDao sucursalDao;
	
	@Autowired
	private FranquiciaDao franquiciaDao;

	@Override
	public Mono<Sucursal> findSucursalById(String id) {
		return sucursalDao.findById(id);
	}

	@Override
	public Mono<Franquicia> saveFranquicia(Franquicia sucursal) {
		return franquiciaDao.save(sucursal);
	}

	public Flux<Franquicia> findAllFranquicias(){
		return franquiciaDao.findAll();
	}

	@Override
	public Flux<Sucursal> findAllSucursales() {
		
		return sucursalDao.findAll();
	}

	
}
