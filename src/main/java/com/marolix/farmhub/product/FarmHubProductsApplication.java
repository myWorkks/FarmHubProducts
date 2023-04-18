package com.marolix.farmhub.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.marolix.farmhub.product.controller.Controller;

@SpringBootApplication
public class FarmHubProductsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcon = SpringApplication.run(FarmHubProductsApplication.class, args);
		Controller con = applicationcon.getBean(Controller.class);
		String s = con.addProduct();
		System.out.println(s);
	}

}
