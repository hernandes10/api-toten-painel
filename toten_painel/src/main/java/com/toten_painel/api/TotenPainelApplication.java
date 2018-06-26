package com.toten_painel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.toten_painel.api.config.SwaggerConfig;

/*@EnableAutoConfiguration
@ComponentScan({"com.toten_painel.api.service","com.toten_painel.api.controller"})
@Import(SwaggerConfig.class)
@EntityScan("com.toten_painel.api.model")
@EnableJpaRepositories("com.toten_painel.api.repositories")
*/
@SpringBootApplication
public class TotenPainelApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TotenPainelApplication.class, args);
	}
	

}
