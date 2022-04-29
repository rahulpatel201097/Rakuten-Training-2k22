package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/order")
public class OrderDemoController {
		
@Autowired
OrderDemoService service;
		
@PostMapping
void saveOrder(@RequestBody Order order) {
		service.save(order);
	}
		
@GetMapping
List<Order> getOrders() {
		return service.getAllOrders();
	}
		
@GetMapping("/get")
Order getById(@RequestParam int id) {
			return service.searchOrderById(id);
	
   }
}
