package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping("display")
	public List<Product> displayProducts(){
		return ps.display();
	}
	
	@PostMapping("add")
	public void addProduct(Product p) {
		ps.add(p);
	}
}
