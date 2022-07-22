package org.gabrielffguimaraes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Ioc , Feign , Tests
 *
 */
@SpringBootApplication
@EnableFeignClients
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
