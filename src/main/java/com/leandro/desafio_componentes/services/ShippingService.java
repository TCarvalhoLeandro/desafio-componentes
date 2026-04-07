package com.leandro.desafio_componentes.services;

import org.springframework.stereotype.Service;

import com.leandro.desafio_componentes.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if(order.getBasic() < 0) {
			throw new IllegalArgumentException("Valor invalido.");
		}
		else if(order.getBasic() < 100.0) {
			return 20.00;
		}
		else if(order.getBasic() < 200.00) {
			return 12.00;
		}
		else {
			return 0.0;
		}
	}
}
