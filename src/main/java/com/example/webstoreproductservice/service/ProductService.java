package com.example.webstoreproductservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webstoreproductservice.dao.ProductDAO;
import com.example.webstoreproductservice.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public Product getProduct(Integer id) {
		Optional<Product> opt = productDAO.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	public List<Product> findAllProducts(){
		return productDAO.findAll();
	}
	
}
