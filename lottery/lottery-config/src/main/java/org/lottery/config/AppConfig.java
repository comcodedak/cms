package org.lottery.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class AppConfig 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AppConfig.class, args);
    }
}
