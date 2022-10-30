package com.springdata.jpaexamples;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("order not found"));
//        Optional<Order> orderOptional = orderRepository.findById(id);
//        if (orderOptional.isEmpty()) {
//            throw new OrderNotFoundException("order not found")
//        }
//        return orderOptional.get();
    }

    public List<Order> findOrdersByLocalDateBetween(LocalDate after, LocalDate before) {
        return orderRepository.findOrdersByLocalDateBetween(after, before);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order, Long id) {
        Order orderToBeUpdate = orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("the order you want update does not exist"));
        orderToBeUpdate.setOrderStatus(order.getOrderStatus());
        orderToBeUpdate.setLocalDate(order.getLocalDate());
        orderToBeUpdate.setProductType(order.getProductType());
        return orderRepository.save(orderToBeUpdate);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
