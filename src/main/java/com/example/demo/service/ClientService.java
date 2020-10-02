package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ClientRepository;
import com.example.demo.entities.Client;
import com.example.demo.service.exceptions.ObjectNotFoundException;

@Service 
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public Client find(Integer id) {
		Optional<Client> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Cliente não encontrado! ID: " + id + ", Tipo: " + Client.class.getName()));
	}

	public List<Client> findAll() {
		List<Client> obj = repo.findAll();
		return obj;
	}
	
	@Transactional
	public Client insert(Client obj) {
		repo.save(obj);
		return obj;
	}
	
	public Client update(Client obj) {
		Client newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Client newObj, Client obj) {
		newObj.setDepartment(obj.getDepartment(obj.getDepartment()));
		newObj.setName(obj.getName());
		newObj.setOrders(obj.getOrders());
	}
	
}
