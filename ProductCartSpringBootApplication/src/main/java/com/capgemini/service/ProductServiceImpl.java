package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.beans.Products;
import com.capgemini.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo prorepo;
	
	@Override
	public Products createProduct(Products products) {

		return prorepo.save(products) ;
	}

	@Override
	public Products deleteProduct(String id) {
	
	if (prorepo.existsById(id)){	
	prorepo.deleteById(id);
	
	}
	return null;
	}

	@Override
	public List<Products> viewProducts() {
		return (List<Products>) prorepo.findAll();
	}

	@Override
	public Products findProduct(String id) {
		return prorepo.findById(id).get();
	}

	@Override
	public Products updateProduct(Products products, String id) {
		Products prod = prorepo.findById(id).get();
		prod.setName(products.getName());
		prod.setModel(products.getModel());
		prod.setPrice(products.getPrice());
		
		return 	prorepo.save(prod);

	}
		
}


