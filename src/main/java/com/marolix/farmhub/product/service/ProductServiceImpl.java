package com.marolix.farmhub.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marolix.farmhub.product.dto.ProductDTO;
import com.marolix.farmhub.product.entity.Product;
import com.marolix.farmhub.product.repository.ProductRepository;

@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String addProduct(ProductDTO productdto) {
		Product p = new Product();
		// insert into products values(?,?,?,?);
		Integer prodId = productdto.getProductId();
		p.setProductId(prodId);
		p.setDescription(productdto.getDescription());
		p.setProductName(productdto.getProductName());
		p.setQuantityAvailable(productdto.getQuantityAvailable());
		productRepository.save(p);
		return "Product inserted Successfully";
	}

}
