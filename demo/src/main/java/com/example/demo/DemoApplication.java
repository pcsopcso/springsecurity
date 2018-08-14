package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EntityScan("com.example.model")
@EnableJpaRepositories(basePackages = "com.example.repositories")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/*
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	    @Bean
	    public UserDetailsService userDetailsService() {
	    	InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	    	manager.createUser(User.withUsername("user").password("test").roles("USER").build());
	        return manager;
	    }
	}
	*/
}
