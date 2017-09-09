package com.java.springboot;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
@SpringBootApplication  
public class SpringBootExample {  
    public static void main(String[] args) {  
    	//System.getProperties().put( "server.port", 80 );
        SpringApplication.run(SpringBootExample.class, args);  
    }  
}  