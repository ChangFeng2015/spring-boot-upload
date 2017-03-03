package com.springboot.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configurable
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
			.authorizeRequests()
			.antMatchers("/","/login").permitAll()//根路径和/login路径不拦截
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")//2登陆页面路径为/login
			.defaultSuccessUrl("/chat")
			.permitAll()
			.and()
			.logout()
			.permitAll();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception
	{
		authenticationManagerBuilder
			.inMemoryAuthentication()
			.withUser("Dave").password("Dave").roles("USER")
			.and()
			.withUser("Tom").password("Tom").roles("USER");
	}
	
	@Override
	public void configure(WebSecurity webSecurity) throws Exception
	{
		webSecurity.ignoring().antMatchers("/resources/static/**");
	}
}
