package com.devant.notificarVencimientos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devant.notificarVencimientos.dao.IAsignacionDao;
import com.devant.notificarVencimientos.model.Asignaciones;


@Service
public class AsignacionServiceImpl implements IAsignacionService {
	
	@Autowired
	private IAsignacionDao asignacionDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignaciones> listaAsignaciones() {
		return asignacionDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Asignaciones obtenerAsignacionPorId(String id) {
		return asignacionDao.findOne(id);
	}

}