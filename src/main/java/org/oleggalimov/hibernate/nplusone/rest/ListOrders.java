package org.oleggalimov.hibernate.nplusone.rest;

import org.oleggalimov.hibernate.nplusone.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ListOrders {
    @Autowired
    private
    DataSource postgresDataSource;

    @GetMapping("/orders")
    public List<Order> getOrdersList() {
        try (Connection connection = this.postgresDataSource.getConnection()) {
            String listAll = "SELECT * FROM orders";
            ResultSet resultSet = connection.prepareStatement(listAll).executeQuery();
            List<Order> ordersList = new ArrayList<>();
            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt(1));
                order.setFirstName(resultSet.getString(2));
                order.setLastName(resultSet.getString(3));
                order.setPhoneNumber(resultSet.getLong(4));
                order.setAddress(resultSet.getString(5));
                order.setStatus(resultSet.getInt(6));
                order.setCreationDate(resultSet.getTimestamp(7));
                order.setSendingDate(resultSet.getTimestamp(8));
                order.setRecevingDate(resultSet.getTimestamp(9));
                order.setComments(resultSet.getString(10));
                ordersList.add(order);
            }
            return ordersList;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
