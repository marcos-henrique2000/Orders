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
		Client cli4 = new Client(null, "Carina Diniz", Department.RH);
		Client cli5 = new Client(null, "Henrique da Silva", Department.HelpDesk);
		Client cli6 = new Client(null, "Otavio Santos", Department.TI);
		Client cli7 = new Client(null, "Miriam Santos", Department.TI);
		Client cli8 = new Client(null, "Bruna da Silva", Department.RH);
		Client cli9 = new Client(null, "Matheus Santos", Department.HelpDesk);
		Client cli10 = new Client(null, "Carolina William", Department.HelpDesk);
		
		clientRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Order or1 = new Order(null, "Troca de monitor", "Preciso que troque o monitor", sdf.parse("15/03/2020 12:32"), cli1);
		Order or2 = new Order(null, "Falha na internet", "Minha internet não esta funcionando", sdf.parse("12/01/2020 14:12"), cli1);
		Order or3 = new Order(null, "Sem Acesso", "Não estou conseguindo acessar meus dados na rede", sdf.parse("9/07/2020 10:21"), cli2);
		Order or4 = new Order(null, "Cadeira quebra", "a cadeira quebrou", sdf.parse("12/05/2020 11:02"), cli4);
		Order or5 = new Order(null, "Monitor sem sinal", "Meu monitor esta sem sinal", sdf.parse("18/4/2020 09:20"), cli5);
		Order or6 = new Order(null, "Sem acesso a rede", "Não estou conseguindo acessar a rede", sdf.parse("05/07/2020 15:42"), cli4);
		Order or7 = new Order(null, "Mesa sem suporte", "Na minha mesa não tem o suporte para o monitor", sdf.parse("10/01/2020 14:32"), cli10);
		Order or8 = new Order(null, "Estabilizador não liga", "o estabilizador não liga", sdf.parse("8/03/2020 08:02"), cli7);
		Order or9 = new Order(null, "Tomada quebrada", "Não consigo carregar meu celular", sdf.parse("19/07/2020 14:12"), cli9);
		Order or10 = new Order(null, "Falta de energia na PA", "Meu computador não liga", sdf.parse("01/04/2020 14:27"), cli8);
		Order or11 = new Order(null, "Chão molhado", "Caiu agua no chão", sdf.parse("05/06/2020 13:15"), cli5);
		Order or12 = new Order(null, "Ar condicionado quebrado", "O ar parou", sdf.parse("14/07/2020 10:32"), cli6);
		Order or13 = new Order(null, "Barulho estranho", "Meu computador esta com um barulho estranho", sdf.parse("07/02/2020 20:09"), cli3);
		Order or14 = new Order(null, "Falta de cabo", "Esta faltando um cabinho de força", sdf.parse("26/05/2020 14:15"), cli10);
		Order or15 = new Order(null, "Monitor desligou", "Meu monitor desligou do nada", sdf.parse("04/05/2020 12:20"), cli2);
		Order or16 = new Order(null, "Head parou", "Meu head não esta pegando", sdf.parse("07/03/2020 12:45"), cli1);
		Order or17 = new Order(null, "Sem som", "Não esta saindo o som do meu pc", sdf.parse("01/07/2020 12:34"), cli9);
		Order or18 = new Order(null, "Pasta vazia", "Minha pasta esta vazia", sdf.parse("09/05/2020 18:21"), cli10);
		Order or19 = new Order(null, "Suporte monitor quebrado", "O suporte do monitor quebrou", sdf.parse("10/07/2020 17:45"), cli7);
		Order or20 = new Order(null, "Teclado sem peça", "Meu teclado esta faltando a tecla PageDn", sdf.parse("11/01/2020 10:03"), cli6);
		Order or21 = new Order(null, "Monitor sem cor", "Meu monitor esta preto e branco", sdf.parse("21/05/2020 09:56"), cli4);
		Order or22 = new Order(null, "Mouse sem bolinha", "meu mouse veio sem bolinha", sdf.parse("23/11/2019 12:45"), cli3);
		Order or23 = new Order(null, "Cadeira sem rodinha", "Minha cadeira esta sem rodinha", sdf.parse("17/02/2020 10:29"), cli7);
		Order or24 = new Order(null, "Sistema não abre", "Meu sistema não abre", sdf.parse("29/09/2019 15:42"), cli9);
		Order or25 = new Order(null, "Maquina desligou", "A maquina desligou do nada", sdf.parse("05/02/2020 15:42"), cli8);
		
		
		orderRepository.saveAll(Arrays.asList(or1, or2, or3, or4,or5,or6,or7,or8,or9,or10,or11,or12,or13,or14,or15,or16,or17,
				or18,or19,or20,or21,or22,or23,or24,or25));
		
	}
}
