package com.example.OhjelmistoProjekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.OhjelmistoProjekti.web.UserDetailServiceImpl;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserDetailServiceImpl userDetailService;
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http
		
		.authorizeRequests()
		.antMatchers("/css/**", "/signup")
		.permitAll()
		.and()
		
		
		.authorizeRequests()
        .antMatchers("/questions", "/questions/{id}", "/answers", "/questions/answers", "/answers", "/types", "/types/{id}", "/users", "/users/{id}", "/add", "/edit/{id}", "/delete/{id}", "/save")
        .hasAuthority("ADMIN")
        .and()
        
        .authorizeRequests()
        .antMatchers("addQuestionAnswer/{id}", "/posttest")
        .hasAuthority("USER")
        .and()
        
        
		.authorizeRequests()
		.antMatchers("/h2-console/**")
		.permitAll()
		.and()
		
		.authorizeRequests()
		.antMatchers("/answers/**")
		.permitAll()
		.and()
		
		.csrf()
		.ignoringAntMatchers("/h2-console/**", "/answers/**")
		.and()
		
		.headers()
		.frameOptions()
		.sameOrigin()
        .and()
        
		.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/questionlist")
		.permitAll()
		.and()
		
		.logout()
		.permitAll();
	}
	
	@Autowired 
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailService).passwordEncoder(new BCryptPasswordEncoder());
	}
}