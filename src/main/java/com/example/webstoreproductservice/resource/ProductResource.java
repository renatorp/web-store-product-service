package com.example.webstoreproductservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webstoreproductservice.entity.Product;
import com.example.webstoreproductservice.exception.ProductNotFoundException;
import com.example.webstoreproductservice.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> findProducts() {
		return productService.findAllProducts();
	}
	
	@GetMapping("{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		Product customer = productService.getProduct(id);
		if (customer == null) {
			throw new ProductNotFoundException("Product does not exist");
		}
		return customer;
	}

}
