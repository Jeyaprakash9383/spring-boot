package com.techStack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techStack.entity.Product;

public interface ProductRepostiory extends JpaRepository<Product, Long> {

}
