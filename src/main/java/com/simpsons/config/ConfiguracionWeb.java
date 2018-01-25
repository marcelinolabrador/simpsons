package com.simpsons.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.simpsons")
public class ConfiguracionWeb implements WebMvcConfigurer {

	
	/*
	 * @Bean
	 * 
	 * @RequestScope
	 * 
	 * @Autowired public String[] generos(Servicio servicio) { return new String[]
	 * {"Masculino", "Femenino"}; }
	 */

}
