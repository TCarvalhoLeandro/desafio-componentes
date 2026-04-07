package com.leandro.desafio_componentes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leandro.desafio_componentes.entities.Order;
import com.leandro.desafio_componentes.services.OrderService;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesApplication.class, args);
	}
	
	@Autowired
	private OrderService orderService;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer code = Integer.parseInt(br.readLine());
		Double basic = Double.parseDouble(br.readLine());
		Double didcount = Double.parseDouble(br.readLine());
		
		Order order = new Order(code, basic, didcount);
		
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + String.format(Locale.US, "%.2f", orderService.total(order)));
		
	}

}
