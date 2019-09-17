package com.devant.notificarVencimientos.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devant.notificarVencimientos.model.Asignaciones;

public interface IAsignacionDao extends MongoRepository<Asignaciones, String>{
	
	List<Asignaciones> findById(String id);

}
