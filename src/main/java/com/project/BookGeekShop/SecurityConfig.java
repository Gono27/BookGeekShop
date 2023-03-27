
package com.project.BookGeekShop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder().
                username("admin").
                password("{noop}admin1234").
                roles("USER","OPERADOR","ADMIN").
                build();
        UserDetails operador = User.builder().
                username("operador").
                password("{noop}operador1234").
                roles("USER","OPERADOR").
                build();
        UserDetails usuario = User.builder().
                username("usuario").
                password("{noop}usuario1234").
                roles("USER").build();
        return new InMemoryUserDetailsManager(usuario,operador,admin);
    }
}
