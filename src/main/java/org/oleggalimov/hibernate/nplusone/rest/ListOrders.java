package org.oleggalimov.hibernate.nplusone.rest;

import org.oleggalimov.hibernate.nplusone.model.Order;
import org.oleggalimov.hibernate.nplusone.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ListOrders {
    @Autowired
    private
    OrdersRepository postgresOrderRepository;

    @GetMapping("/order/{id}")
    public Order getOrdersList(@PathVariable(name = "id") Integer id) {
        Optional<Order> order = postgresOrderRepository.findById(id);
        return order.orElse(null);
    }
}
