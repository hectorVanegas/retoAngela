package com.bolsadeideas.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bolsadeideas.springboot.webflux.app.models.documents.Franquicia;

public interface FranquiciaDao extends ReactiveMongoRepository<Franquicia, String>{

}
