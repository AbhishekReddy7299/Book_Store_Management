package com.obsm.order.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.obsm.order.exception.OrderNotFound;
import com.obsm.order.model.Order;
import com.obsm.order.payload.OrderUpdateRequest;
import com.obsm.order.repository.OrderRepository;


@Service
@Transactional
public class OrderService implements IOrderService{
	
	@Autowired
    OrderRepository orderRepository;
	
	@Override
	public ResponseEntity<Order> addOrder(Order order) {
		try {
			if (order != null) {
				return new ResponseEntity<>(orderRepository.save(order), HttpStatus.CREATED);
			} else throw new OrderNotFound("Not a valid request");
		}catch(OrderNotFound orderNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	@Override
	public ResponseEntity deleteOrder(long orderId) throws OrderNotFound {
		try {
			Order deletedOrder = orderRepository.getOne(orderId);
			if (orderRepository.existsById(orderId)) {
				orderRepository.delete(deletedOrder);
				return new ResponseEntity(HttpStatus.OK);
			} else throw new OrderNotFound("Order is Null");
		}catch (OrderNotFound orderNotFound){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<Order> updateOrder(OrderUpdateRequest orderUpdateRequest, long orderId) throws OrderNotFound {
		try {
			Order updatedOrder = orderRepository.getOne(orderId);
			if (!orderRepository.existsById(orderId)) {
				throw new OrderNotFound("Order doesn't exists!");
			}
			// Helper.copyAdminDetails(updatedAdmin, adminUpdateRequest);
			return new ResponseEntity<>(orderRepository.save(updatedOrder),HttpStatus.ACCEPTED);
		}catch(OrderNotFound orderNotFound){
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Order> getOrder(long orderId) throws OrderNotFound {
		try {
			Order order = orderRepository.getOne(orderId);
			if(orderRepository.existsById(orderId))
				return new ResponseEntity<>(order, HttpStatus.FOUND);
			else throw new OrderNotFound("No Order is available");
		}catch (OrderNotFound orderNotFound){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Order>> getAllTasks() {
			return new ResponseEntity(orderRepository.findAll(),HttpStatus.FOUND);
	}

}
