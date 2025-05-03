package com.bolsadeideas.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bolsadeideas.springboot.webflux.app.models.documents.Sucursal;

public interface SucursalDao extends ReactiveMongoRepository<Sucursal, String>{

}
