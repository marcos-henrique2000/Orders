package com.example.demo.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Order;
import com.example.demo.entities.enums.Department;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Order> lista() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client cli1 =  new Client(1, "Maria", Department.TI);
		Client cli2 =  new Client(1, "João", Department.HelpDesk);
		Client cli3 =  new Client(1, "Cintia", Department.RH);
		
		Order or1 = new Order(1, "Troca de monitor", "Preciso que seja trocado meu monitor", sdf.parse("02/03/2020"), cli1);
		Order or2 = new Order(1, "Problema com a rede", "Minha internet não esta funcionando", sdf.parse("05/08/2020"), cli2);
		Order or3 = new Order(1, "Mouse quebrado", "Caiu café no meu mouse, preciso que troque", sdf.parse("12/07/2020"), cli3);
		
		List<Order> list = new ArrayList<>();
		
		list.add(or1);
		list.add(or2);
		list.add(or3);
		
		return list;
	}
}
