package com.capg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.capg"})
public class MVCconfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getView()
	{
		InternalResourceViewResolver iv = new InternalResourceViewResolver();
		iv.setPrefix("/WEB-INF/views/");
		iv.setSuffix(".jsp");
		return iv;
	}
	
}
