package com.arindam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Order;
@Repository//object creation + data base operation
public interface OrderRepo extends JpaRepository<Order,Integer> {

}
