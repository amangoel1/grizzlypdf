package com.cts.product.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

//enable the use of mvc based components
@EnableWebMvc

//to find-out or to confirm these classes
@ComponentScan(basePackages= {"com.cts.product.controller"})

/* D.S related configurations*/
public class WebConfig extends WebMvcConfigurerAdapter {
	
	//only one object will be created using bean
	@Bean
	public InternalResourceViewResolver resolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	
	@Override
	public Validator getValidator(){
		
		return super.getValidator();
	}

}
