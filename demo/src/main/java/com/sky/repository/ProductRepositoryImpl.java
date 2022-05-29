package com.sky.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private List<Product> products= new ArrayList<Product>();
	private List<Product> deleteRecord= new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		System.out.println("in repository");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}

//	@Override
//	public Product deleteByid(String id) {
//		int index=0;
//		for (Product product : products) {
//			if(product.getProductId().equals(id))
//			{
// products.remove(index);
// return product;
//			}
//			index = index+1;
//		}
//		return null;
//	}

//	@Override
//	public Product updateByid(Product newProduct) {
//		int index=0;
//		for (Product product : products) {
//			if(product.getProductId().equals(newProduct.getProductId()))
//			{
//    products.set(index, newProduct);
//      return newProduct;
//			}
//			index = index+1;
//		}
//		return null;
//	}
//	
//	

//	public List<Product> getProductById(String id) {
//	 for (Product product : products) {
//		if (product.getProductId().equals(id)) {
//			System.out.println(product);
//		}
//	}
//	return getProductById();
//		
//	}
//
//	@Override
//	public List<Product> getProductById() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
