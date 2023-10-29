package com.springboot.orderservices.model;

import lombok.AllAr


import javax.persistence.*;

@Entity
@Table(name = "t_orders");
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class OrderLineItems {
    @generatedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> orderLineItemsList;
}