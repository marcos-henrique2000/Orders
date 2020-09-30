package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.enums.Department;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Client> list() {
		
		Client cli1 = new Client(1, "Marcos Marins", Department.TI);
		Client cli2 = new Client(1, "Maria dos Santos", Department.RH);
		
		List<Client> list = new ArrayList<>();
		
		list.add(cli1);
		list.add(cli2);
		
		return list;
	}
}
