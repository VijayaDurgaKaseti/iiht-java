package com.CMS.coursemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class FormSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("durga").password("{noop}durga")
		.authorities("ROLE_USER").and().withUser("vijaya").password("{noop}vijaya")
		.authorities("ROLE_ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/admin")
		.hasRole("ADMIN").antMatchers("/student").hasRole("USER")
		.anyRequest().authenticated().and().formLogin()
		.permitAll().and().logout().permitAll();
		http.csrf().disable();
		
	}
	

}
