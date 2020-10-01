package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Order;
import com.example.demo.entities.enums.Department;

@SpringBootApplication
public class OrdersApplication implements CommandLineRunner {
	
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		
		Client cli1 = new Client(null, "Marcos Marins", Department.TI);
		Client cli2 = new Client(null, "Maria da Silva", Department.RH);
		Client cli3 = new Client(null, "Carlos Eduardo", Department.HelpDesk);
		
		clientRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Order or1 = new Order(null, "Troca de monitor", "Preciso que troque o monitor", sdf.parse("15/03/2020 12:32"), cli1);
		Order or2 = new Order(null, "Falha na internet", "Minha internet não esta funcionando", sdf.parse("12/01/2020 14:12"), cli1);
		Order or3 = new Order(null, "Sem Acesso", "Não estou conseguindo acessar meus dados na rede", sdf.parse("9/07/2020 10:21"), cli2);
		
		orderRepository.saveAll(Arrays.asList(or1, or2, or3));
		
	}
}
