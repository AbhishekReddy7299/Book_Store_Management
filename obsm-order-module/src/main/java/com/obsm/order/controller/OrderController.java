package com.obsm.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.order.exception.OrderNotFound;
import com.obsm.order.model.Order;
import com.obsm.order.payload.OrderUpdateRequest;
import com.obsm.order.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	IOrderService service;
	
	@PostMapping("/addOrder")
	public ResponseEntity<Order> addTask(@RequestBody Order order){
		return (service.addOrder(order));
	}

	@DeleteMapping("/deleteOrder/{orderId}")
	public ResponseEntity deleteTask(@PathVariable long orderId) throws OrderNotFound {
		return service.deleteOrder(orderId);
	}

	@PutMapping("/updateOrder/{orderId}")
	public ResponseEntity<Order> updateTask(@RequestBody OrderUpdateRequest orderUpdateRequest, @PathVariable long orderId) throws OrderNotFound {
		return service.updateOrder(orderUpdateRequest, orderId);
	}

	@GetMapping("getOrder/{orderId}")
	public ResponseEntity<Order> getTask(@PathVariable long orderId) throws OrderNotFound {
		return service.getOrder(orderId);
	}

	@GetMapping("/getAllOrders")
	public ResponseEntity<List<Order>> getAllTasks() {
		return service.getAllTasks();
	}
}
