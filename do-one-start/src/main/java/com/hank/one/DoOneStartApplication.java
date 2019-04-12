package com.hank.one;

import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DoOneStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoOneStartApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
       return args -> {
       	System.out.println("看看注入sprinboot了哪些bean");
       	String[] beanNames = ctx.getBeanDefinitionNames();
       	Arrays.sort(beanNames);
       	for (String beanName:beanNames){
       		//System.out.println(beanName+"\r\n");
		}

	   };
	}*/

}
