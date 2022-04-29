package com.rakuten;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class OrderDemoService {
		
		@Autowired
		OrderRepository repository;
		
		public void save(Order order) {
			repository.save(order);
			System.out.println("your order is saved please see in sql workbench");
		}
		
		public List<Order> getAllOrders() {
			return repository.findAll();
		}
		
		public Order searchOrderById(int id) {
			System.out.println("you searched by id");
			Optional<Order> order = repository.findById(id);
			
			if(order.isPresent()) {
				return order.get();
			} else {
				return new Order();
			}
			
		}
		
		public List<Order> searchByCustomerId(int id) {
			return repository.findAll().stream().filter(order -> order.getCustomerId() == id).collect(Collectors.toList());
		}
	}

