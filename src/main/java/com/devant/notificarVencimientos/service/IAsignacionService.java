package com.devant.notificarVencimientos.service;

import java.util.List;

import com.devant.notificarVencimientos.model.Asignaciones;


public interface IAsignacionService {
	
	List<Asignaciones> listaAsignaciones();
	
	Asignaciones obtenerAsignacionPorId(String id);

}