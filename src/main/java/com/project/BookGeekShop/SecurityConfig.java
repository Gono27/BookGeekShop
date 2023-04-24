package com.project.BookGeekShop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService users() {
        UserDetails admin = User.builder().
                username("admin").
                password("{noop}admin1234").
                roles("USER", "OPERADOR", "ADMIN").
                build();
        UserDetails vendedor = User.builder().
                username("operador").
                password("{noop}operador1234").
                roles("USER", "VENDEDOR").
                build();
        UserDetails usuario = User.builder().
                username("usuario").
                password("{noop}usuario1234").
                roles("USER").build();
        return new InMemoryUserDetailsManager(usuario, vendedor, admin);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                .requestMatchers("/",
                        "/index",
                        "/categorias/**",
                        "/contacto/**",
                        "/errores/**",
                        "/libro/**",
                        "/novelaGrafica/**",
                        "/sobreNosotros/**",
                        "/ventaLibro/**",
                        "/ventaNovelaGrafica/**",
                        "/css/**",
                        "/carrito/**",
                        "/carrito/comprar/**",
                        "/img/**",
                        "/webjars/**").permitAll()
                .requestMatchers(
                        "/cliente/listado_cliente/**",
                        "/cliente/modifica_cliente/**",
                        "/cliente/modificar/**",
                        "/cliente/eliminar/**",
                        "/cliente/nuevo/**", 
                        "/empleado/listado_empleado/**",
                        "/empleado/modifica_empleado/**",
                        "/empleado/modificar/**",
                        "/empleado/eliminar/**",
                        "/empleado/nuevo/**",
                        "/novelaGrafica/listado_novelaGrafica/**",
                        "/novelaGrafica/modifica_novelaGrafica/**",
                        "/novelaGrafica/modificar/**",
                        "/novelaGrafica/eliminar/**",
                        "/novelaGrafica/nuevo/**",
                        "/libro/listado_libro/**",
                        "/libro/modifica_libro/**",
                        "/libro/modificar/**",
                        "/libro/eliminar/**",
                        "/libro/nuevo/**"
                ).hasRole("ADMIN")
                .requestMatchers(
                        "/cliente/listado_cliente/**",
                        "/empleado/listado_empleado/**",
                       "/novelaGrafica/listado_novelaGrafica/**",
                    "/libro/listado_libro/**"
                ).hasAnyRole("ADMIN", "VENDEDOR"))
                .formLogin((form) -> form
                .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll())
                .exceptionHandling()
                .accessDeniedPage("/errores/403");
        return http.build();
    }

}
