package com.bink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
@MapperScan("com.bink.mybatis")
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

}
