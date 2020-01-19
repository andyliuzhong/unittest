package com.training.unittest.repository;

import com.training.unittest.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuch
 * @date 2020/1/19 - 23:25
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
