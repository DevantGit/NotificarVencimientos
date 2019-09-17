package com.devant.notificarVencimientos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Miguel Mendoza
 *
 */
public class WebInicializador extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NotificarVencimientos.class);
	}

}
