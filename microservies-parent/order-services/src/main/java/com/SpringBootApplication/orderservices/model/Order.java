package com.SpringBootApplication.orderservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "");
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long String orderNumber;

    private List<OrderLineItems> orderLineItemsList;
}