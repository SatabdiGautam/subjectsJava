package com.satabdi.springBootCRUD.configuration;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.cors.CorsConfiguration;
	import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
	import org.springframework.web.filter.CorsFilter;

	@Configuration
	public class CorsConfig {
        @Bean
        CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        config.addAllowedOrigin("*"); // Adjust as needed for your environment
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("*");
	        source.registerCorsConfiguration("/**", config);
	        return new CorsFilter(source);
	    }
	}

