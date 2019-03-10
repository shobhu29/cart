package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Products;
import com.capgemini.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService proservice;

	@RequestMapping(method = RequestMethod.POST, value = "/addproduct")
	public Products createProduct(@RequestBody Products products) {
		return proservice.createProduct(products);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteproduct/{id}")
	public Products deleteProduct(@PathVariable String id) {
		return proservice.deleteProduct(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/viewproducts")
	public List<Products> viewProducts() {
		return (List<Products>) proservice.viewProducts();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/findproduct/{id}")
	public Products findProduct(@PathVariable String id) {
		return proservice.findProduct(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updateproduct/{id}")
	public Products findProduct(@RequestBody Products products ,@PathVariable String id) {
		return proservice.updateProduct(products,id);
	}

}
