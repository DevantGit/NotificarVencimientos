package com.devant.notificarVencimientos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Miguel Mendoza
 *
 */

@SpringBootApplication
@ComponentScan("com.devant.notificarVencimientos")
@EnableWebMvc
public class NotificarVencimientos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NotificarVencimientos.class, args);
	}
}
