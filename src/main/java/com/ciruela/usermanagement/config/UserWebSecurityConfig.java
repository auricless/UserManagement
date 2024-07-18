package com.ciruela.usermanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserWebSecurityConfig {
	
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
		
		return null;
	}

}
