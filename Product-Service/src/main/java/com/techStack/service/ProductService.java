package com.techStack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techStack.entity.Product;
import com.techStack.repo.ProductRepostiory;

@Service
public class ProductService {

    @Autowired
    ProductRepostiory prodRepo;

    public List<Product> getAllProduct(){
        return prodRepo.findAll();
    }

    public Product getProductById(long id){
        return prodRepo.findById(id).orElse(null);
    }

    public Product createNewproduct(Product request) {
		Product prod=new Product();
		prod.setName(request.getName());
		prod.setPrice(request.getPrice());
		prod.setDescription(request.getDescription());
		prod.setImgUrl(request.getImgUrl());
		prodRepo.save(prod);
		return request;
	}

}
