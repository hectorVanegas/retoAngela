package com.vanegas.angela.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.vanegas.angela.webflux.app.models.documents.Sucursal;

public interface SucursalDao extends ReactiveMongoRepository<Sucursal, String>{

}
