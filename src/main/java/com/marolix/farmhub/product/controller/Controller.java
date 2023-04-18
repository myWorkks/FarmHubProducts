package com.marolix.farmhub.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marolix.farmhub.product.dto.ProductDTO;
import com.marolix.farmhub.product.service.ProductService;

@Component
public class Controller {
	@Autowired
	private  ProductService productService;

	public  String addProduct() {
		ProductDTO p = new ProductDTO();
		p.setProductId(1);
		p.setProductName("potato");
		p.setDescription("startc will be more good foe health");
		p.setQuantityAvailable(200);
		return productService.addProduct(p);
	}
}
