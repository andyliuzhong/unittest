package com.training.unittest.controller;

import com.training.unittest.entities.Order;
import com.training.unittest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuch
 * @date 2020/1/19 - 23:13
 */
@RestController
@RequestMapping("/test")
public class UnitTestController {
    @Autowired
    private OrderService orderService;
    @RequestMapping(value = "/save-order",method = RequestMethod.POST)
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        return ResponseEntity.ok(orderService.save(order));
    }
}
