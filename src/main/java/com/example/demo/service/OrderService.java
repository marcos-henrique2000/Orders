package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.entities.Order;
import com.example.demo.service.exceptions.ObjectNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	public Order find(Integer id) {
		Optional<Order> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(""
				+ "Pedido não encontrado! ID: " + id + ", Tipo: " + Order.class.getName()));
	}
	
}
