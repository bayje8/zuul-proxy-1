package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.lfg.gp.spring.boot.security.annotation.EnableSecuredProperties;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxy1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxy1Application.class, args);
	}

}
