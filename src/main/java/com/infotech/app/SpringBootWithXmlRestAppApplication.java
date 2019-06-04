package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")		//import beans in Beans.xml file and register with ApplicationContext
public class SpringBootWithXmlRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithXmlRestAppApplication.class, args);
	}

}
