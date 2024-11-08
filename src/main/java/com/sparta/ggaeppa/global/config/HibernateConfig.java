package com.sparta.ggaeppa.global.config;

import com.fasterxml.jackson.datatype.hibernate6.Hibernate6Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
    @Bean
    public Hibernate6Module hibernate6Module() {
        return new Hibernate6Module();
    }
}
