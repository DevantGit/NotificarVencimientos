package com.devant.notificarVencimientos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.devant.notificarVencimientos.model.Asignaciones;
import com.devant.notificarVencimientos.service.IAsignacionService;


@RestController
@RequestMapping(value = "/")
public class asignacionesControllers {
	
	@Autowired
	private IAsignacionService asignacionService;
	
	@RequestMapping("/hola")
	public ModelAndView hola() {
		ModelAndView mav = new ModelAndView("hola");
		return mav;
	}
	
	@RequestMapping(value = "/listarAsignaciones", method = RequestMethod.GET)
	public void listarAsignaciones() {

		List<Asignaciones> asignacionesList = asignacionService.listaAsignaciones();


		for (Asignaciones asignaciones : asignacionesList) {
			
			//System.out.println("Fecha: " + asignaciones.getLogicalExpirationDate() );

		}

		//return salasHabilitadas;
	}

}
