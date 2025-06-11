package com.techStack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techStack.entity.Order;

public interface OrderRepository extends JpaRespository<Order,Long> {

}
