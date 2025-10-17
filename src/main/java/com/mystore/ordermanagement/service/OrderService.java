package com.mystore.ordermanagement.service;

import com.mystore.ordermanagement.model.Order;
import com.mystore.ordermanagement.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return repository.findById(id);
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        return repository.findById(id)
                .map(order -> {
                    order.setCustomerName(updatedOrder.getCustomerName());
                    order.setProductName(updatedOrder.getProductName());
                    order.setQuantity(updatedOrder.getQuantity());
                    order.setPrice(updatedOrder.getPrice());
                    return repository.save(order);
                }).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
