package com.mystore.ordermanagement;

import com.mystore.ordermanagement.model.Order;
import com.mystore.ordermanagement.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OrderControllerTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void testCreateOrder() {
        Order order = new Order();
        order.setProductName("Laptop");
        order.setQuantity(2);
        order.setPrice(1500.0);

        Order savedOrder = orderRepository.save(order);

        assertThat(savedOrder).isNotNull();
        assertThat(savedOrder.getId()).isGreaterThan(0);
    }

    @Test
    void testReadOrders() {
        // Insertar registro antes de leer
        Order order = new Order();
        order.setProductName("Monitor");
        order.setQuantity(1);
        order.setPrice(500.0);
        orderRepository.save(order);

        Iterable<Order> orders = orderRepository.findAll();
        assertThat(orders).isNotEmpty();
    }

    @Test
    void testUpdateOrder() {
        Order order = new Order();
        order.setProductName("Keyboard");
        order.setQuantity(1);
        order.setPrice(100.0);
        order = orderRepository.save(order);

        // Modificar
        order.setPrice(120.0);
        Order updatedOrder = orderRepository.save(order);

        assertThat(updatedOrder.getPrice()).isEqualTo(120.0);
    }

    @Test
    void testDeleteOrder() {
        Order order = new Order();
        order.setProductName("Mouse");
        order.setQuantity(1);
        order.setPrice(50.0);
        order = orderRepository.save(order);

        Long id = order.getId();
        orderRepository.deleteById(id);

        boolean exists = orderRepository.findById(id).isPresent();
        assertThat(exists).isFalse();
    }
}
