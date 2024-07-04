package com.RetoTecnico.futbol_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Permitir solicitudes desde cualquier origen
        config.addAllowedMethod("*"); // Permitir cualquier método (GET, POST, PUT, etc.)
        config.addAllowedHeader("*"); // Permitir cualquier encabezado
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
