package com.rizky.wedding.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {
	
	@Value("${spring.datasource.driver-class-name}")
    private String databaseDriverClassName;
	
	@Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;
    
    @Value("${spring.datasource.password}")
    private String databasePassword;
    
    @Bean
    public HikariDataSource datasource() throws IOException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(datasourceUrl);
        config.setDriverClassName(databaseDriverClassName);
        config.setUsername(databaseUsername);
        config.setPassword(databasePassword);
        
        return new HikariDataSource(config);
    }

}
