package com.bolsadeideas.springboot.webflux.app.models.services;

import com.bolsadeideas.springboot.webflux.app.models.documents.Sucursal;
import com.bolsadeideas.springboot.webflux.app.models.documents.Franquicia;
import com.bolsadeideas.springboot.webflux.app.models.documents.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SucursalService {
	
	public Flux<Sucursal> findAllSucursales();
	
	public Mono<Sucursal> findSucursalById(String id);
	
	public Mono<Franquicia> saveFranquicia(Franquicia sucursal);
	
	public Flux<Franquicia> findAllFranquicias();

}
