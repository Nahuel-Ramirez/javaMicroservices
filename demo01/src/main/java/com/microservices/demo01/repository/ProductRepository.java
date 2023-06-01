package com.microservices.demo01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.product.entity.Category;
import com.microservices.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByCategory(Category category);
}
