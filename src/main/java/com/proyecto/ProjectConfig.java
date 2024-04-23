package com.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    /* Los siguiente métodos son para implementar el tema de seguridad dentro del proyecto */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }

    /* El siguiente método se utiliza para completar la clase no es 
    realmente funcional, la próxima semana se reemplaza con usuarios de BD */
 /*
    @Bean
    public UserDetailsService users() {
        UserDetails admin = User.builder()
                .username("rlopez")
                .password("{noop}123")
                .roles("USER","ADMIN")
                .build();
        UserDetails user = User.builder()
                .username("ctencio")
                .password("{noop}789")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
     */
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
        build.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                .requestMatchers("/", "/index", "/errores/**",
                        "/usuario/**", "/js/**", "/webjars/**", "/error/**", "/inicio/**",
                         "/inicio/paginaInicio", "/registro/**", "/usuario/listado")
                .permitAll()
                .requestMatchers(
                        "/casas/**", "/tickets/**",
                        "/reservacion/**", "/usuario/**", "/inicio/**", "/administrador/**", "/index", "/inicio"
                ).hasRole("ADMIN")
                .requestMatchers(
                        "/tickets/crear",
                        "/tickets/consultar",
                        "/tickets/eliminar",
                        "/usuario/**",
                        "reservacion/crear",
                        "reservacion/consultar",
                        "reservacion/eliminar",
                        "/inicio/**"
                ).hasAnyRole("USER")
                )
                .formLogin((form) -> form
                .loginPage("/login").permitAll().defaultSuccessUrl("/index", true))
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

}
