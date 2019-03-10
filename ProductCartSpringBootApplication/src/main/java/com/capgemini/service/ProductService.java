package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Products;

public interface ProductService {

	public Products createProduct(Products products);
	
//	public Products updateProduct(String id);
	
	public Products deleteProduct(String id);
	
	public List<Products> viewProducts();
	
	public Products findProduct(String id);

	public Products updateProduct(Products products, String id);
	
}
