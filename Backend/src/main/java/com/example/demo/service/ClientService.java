package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ClientRepository;
import com.example.demo.entities.Client;
import com.example.demo.service.exceptions.DataIntegrityException;
import com.example.demo.service.exceptions.ObjectNotFoundException;
import com.sun.javafx.scene.traversal.Direction;

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
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException  e) {
			throw new DataIntegrityException("Não é possivel excluir um cliente que possui pedidos");
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	/*
	public Page<Client> search(String name, List<Integer> ids, int page, int linePerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linePerPage, Direction.valueOf(direction), orderBy);
		
		return repo.search(name, pageRequest);
	}
	*/
}
