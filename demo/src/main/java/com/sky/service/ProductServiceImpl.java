package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	

	
	@Autowired
	@Qualifier("ProductRepositoryDBImpl")
	private ProductRepository productRepository;
	
	
	@Override
	public void addProduct(Product product) {
		System.out.println("in Service");
		if (product.getPrice()>20) {
			
			productRepository.addProduct(product);
		}
		
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepository.getProducts();
	}

//	@Override
//	public Product updateByid(Product product) {
//		// TODO Auto-generated method stub
//		return productRepository.updateByid(product);
//	}

//	@Override
//	public Product deleteByid(String id) {
//		// TODO Auto-generated method stub
//		return productRepository.deleteByid(id);
//	}


//	public Object getProductById(String id) {
//		
//		return getProductById(id);
//	}

	


}
