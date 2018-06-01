package org.ajigile;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan("org.ajigile")
public class MyWebConfig implements WebMvcConfigurer {

	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		//WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}
	
}
