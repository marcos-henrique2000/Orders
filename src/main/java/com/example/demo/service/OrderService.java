package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

	public List<Order> findAll() {
		List<Order> obj = new ArrayList<>();
		obj = repo.findAll();
		
		return obj;
	}
	
	@Transactional
	public Order insert(Order obj) {
		repo.save(obj);
		return obj;
	}
	
}
