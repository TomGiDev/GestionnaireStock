package com.epsi.Gestionnairedestock.controller;

import com.epsi.Gestionnairedestock.model.Order;
import com.epsi.Gestionnairedestock.model.Product;
import com.epsi.Gestionnairedestock.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    public List<Order> getOrderList() {
        return orderRepo.findAll();
    }

    @GetMapping("/{orderId}")
    public Optional<Order> getOrderById(@PathVariable(name= "orderId") Long id) {
        return orderRepo.findById(id);
    }

    @PostMapping
    public Order saveOrder(@RequestBody Order order) {
        return orderRepo.save(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@RequestBody Order order, @PathVariable(name= "orderId") Long id) {
        order.setId(id);
        return orderRepo.save(order);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable(name= "orderId") Long id) {
        orderRepo.deleteById(id);
    }
}
