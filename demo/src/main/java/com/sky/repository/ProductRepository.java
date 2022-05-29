package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {
	public void addProduct (Product product);
	public List<Product> getProducts();
//	public Product deleteByid(String id);
//	public Product updateByid(Product product);
	
	//public List<Product> getProductById();

}
