package com.example.SpringDataImovel.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //    Authentication
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Dani").password("{noop}123")
                .roles("LOCATARIO").and().withUser("Danielle").password("{noop}123")
                .roles("LOCADOR", "LOCATARIO");
    }

    //    Authorization
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/usuarios/**", "/imoveis/tipoImovel/**")
                .hasRole("LOCATARIO").antMatchers("/**").hasRole("LOCADOR").and()
                .csrf().disable().headers().frameOptions().disable();
    }
}

