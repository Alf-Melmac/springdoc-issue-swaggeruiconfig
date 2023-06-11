package de.webalf.swaggeruiconfig;

import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alf
 * @since 11.06.2023
 */
@Configuration
public class SwaggerUiConfig {
	@Bean
	public SwaggerUiConfigProperties swaggerUiConfigProperties(SwaggerUiConfigProperties config) {
		return config;
	}
}
