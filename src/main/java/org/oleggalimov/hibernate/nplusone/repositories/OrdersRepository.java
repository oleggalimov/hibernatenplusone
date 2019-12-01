package org.oleggalimov.hibernate.nplusone.repositories;

import org.oleggalimov.hibernate.nplusone.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
