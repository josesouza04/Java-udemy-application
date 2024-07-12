package com.example.app.repositories;

import com.example.app.entities.Order;
import com.example.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
