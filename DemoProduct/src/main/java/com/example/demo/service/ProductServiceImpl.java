package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pr;
	
	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public List<Product> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
