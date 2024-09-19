package com.example;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class IetiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IetiApplication.class, args);

        


    }
}