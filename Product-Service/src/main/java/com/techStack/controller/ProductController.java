package com.techStack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techStack.entity.Product;
import com.techStack.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	@GetMapping
	public List<Product> getProductList(){
		return prodService.getAllProduct();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") int id){
		return prodService.getProductById(id);
	}

	@PostMapping("/product")
	public Product addNewProduct(@RequestBody Product requestBody){
		return prodService.createNewproduct(requestBody);
	}

}
