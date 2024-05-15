package com.vitorbordalo.desafio;

import com.vitorbordalo.desafio.entities.Order;
import com.vitorbordalo.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vitorbordalo.desafio.services.ShippingServices;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private OrderService services;
	public DesafioApplication(OrderService services) {
		this.services = services;
	}

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	ShippingServices shippingServices =  new ShippingServices();

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150, 20);

		System.out.println(services.total(order));
	}
}
