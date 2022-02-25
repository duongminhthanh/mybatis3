package com.example.mybatissimple3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.mybatissimple3.mapper"})
public class Mybatissimple3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatissimple3Application.class, args);
	}

}
