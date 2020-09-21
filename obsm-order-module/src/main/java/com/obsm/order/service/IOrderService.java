package com.obsm.order.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.order.exception.OrderNotFound;
import com.obsm.order.model.Order;
import com.obsm.order.payload.OrderUpdateRequest;



public interface IOrderService {
	public ResponseEntity<Order> addOrder(Order order);
	public ResponseEntity deleteOrder(long orderId) throws OrderNotFound;
	public ResponseEntity<Order> updateOrder(OrderUpdateRequest orderUpdateRequest, long orderId) throws OrderNotFound;
	public ResponseEntity<Order> getOrder(long orderId) throws OrderNotFound;
	public ResponseEntity<List<Order>> getAllTasks();
}
