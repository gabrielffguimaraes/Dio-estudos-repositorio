package org.gabrielffguimaraes.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) { SpringApplication.run(App.class); }

    @Bean
    public ObjectMapper objectMapperInstance() {
        return new ObjectMapper();
    }
}
