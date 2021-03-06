package com.example.webstoreproductservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webstoreproductservice.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer>{

}
