package com.techStack.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.techStack.entity.Product;

@FeignClient(name = "order-service", url = "http://localhost:8080")
public interface ProductClient {
    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable("id") Long id);
}
