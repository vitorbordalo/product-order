package com.vitorbordalo.desafio.services;

import com.vitorbordalo.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private double Total;
    private ShippingServices shippingServices;

    public OrderService(ShippingServices shippingServices) {
        this.shippingServices = shippingServices;
    }

    public double total (Order order) {
        return (order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))) + shippingServices.shipment(order);

    }
}
