package com.cts.product.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration 
@PropertySource("classpath:db.properties")

//implicitly take care of transaction
@EnableTransactionManagement 

/* used to find out all the classes annoted with 
the spring mvc and spring annotation*/
@ComponentScans(value = {@ComponentScan("com.cts.product.dao"), 
		@ComponentScan("com.cts.product.service")})
public class AppConfig {

	@Autowired
	private Environment environment;
}
