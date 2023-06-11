package de.webalf.swaggeruiconfig;

import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alf
 * @since 11.06.2023
 */
@Configuration
public class SpringDocConfig {
	@Bean
	public SpringDocConfigProperties springDocConfigProperties(SpringDocConfigProperties config) {
		return config;
	}
}
