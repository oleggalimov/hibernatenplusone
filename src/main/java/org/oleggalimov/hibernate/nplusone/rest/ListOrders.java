package org.oleggalimov.hibernate.nplusone.rest;

import org.oleggalimov.hibernate.nplusone.model.Order;
import org.oleggalimov.hibernate.nplusone.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListOrders {
    @Autowired
    private
    OrdersRepository postgresOrderRepository;

    @GetMapping("/orders")
    public List<Order> getOrdersList() {
        return postgresOrderRepository.findAll();
    }
}
