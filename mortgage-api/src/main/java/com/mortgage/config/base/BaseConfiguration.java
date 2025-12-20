package com.mortgage.config.base;

import com.mortgage.config.base.properties.BaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author suyh
 * @since 2024-08-28
 */
@EnableConfigurationProperties(BaseProperties.class)
@Configuration
public class BaseConfiguration {
}
