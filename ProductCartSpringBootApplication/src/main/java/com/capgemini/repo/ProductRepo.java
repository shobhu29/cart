package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.beans.Products;

@Repository
public interface ProductRepo extends CrudRepository<Products,String>{

}
