package com.example.hw8_on_spring.controller;

import com.example.hw8_on_spring.entity.CompanyEntity;
import com.example.hw8_on_spring.entity.OrderEntity;
import com.example.hw8_on_spring.service.CompanyService;
import com.example.hw8_on_spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllOrders(Model model) {
        List<OrderEntity> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        model.addAttribute("orderEntity", new OrderEntity());
        model.addAttribute("companies", companyService.getAllCompanies());
        return "orders";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addOrder(Model model, @ModelAttribute OrderEntity orderEntity) {
        orderService.registration(orderEntity);
        return "redirect:/orders";
    }
}
