package com.leandro.desafio_componentes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.desafio_componentes.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		double discount = order.getBasic() * (order.getDiscount() / 100);
		return  order.getBasic() - discount + shippingService.shipment(order);
		
	}
}
