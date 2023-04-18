package com.marolix.farmhub.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.marolix.farmhub.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
