package com.training.unittest.entities;

import javax.persistence.*;

/**
 * @author liuch
 * @date 2020/1/19 - 23:18
 */
@Entity
@Table(name = "order_2")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private Integer id;

    @Column(name = "order_name")
    private String name;

}
