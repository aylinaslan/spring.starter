package com.turkcell.spring.starter.repositories;
import com.turkcell.spring.starter.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepositories  extends JpaRepository<Order,Integer> {
}
