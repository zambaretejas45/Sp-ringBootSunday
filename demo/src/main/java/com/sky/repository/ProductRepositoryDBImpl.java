package com.sky.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository("ProductRepositoryDBImpl")
public class ProductRepositoryDBImpl implements ProductRepository{

	
	private static String INSERT_PRODUCT_SQL = "insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_PRICE) values (?,?,?)";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	
	@Override
	public void addProduct(Product product) {
		jdbcTemplate.update(INSERT_PRODUCT_SQL,product.getProductId(),product.getProductName(),product.getPrice());
		
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Product updateByid(Product product) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
