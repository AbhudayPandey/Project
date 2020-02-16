package com.vp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc  
@ComponentScan(basePackages="com.vp")
public class AppConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("resources/**").addResourceLocations("/resources");
	}
	
       @Bean
       public InternalResourceViewResolver viewResolver() {
    	   InternalResourceViewResolver Resolver=new InternalResourceViewResolver();
    	   Resolver.setViewClass(JstlView.class);
    	   Resolver.setPrefix("/WEB-INF/jsp/");
    	   Resolver.setSuffix(".jsp");
		return Resolver;
       }
}
