package com.example.hw8_on_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @GetMapping
    public String createInfo(Model model) {
        model.addAttribute("something", "asdfewfe");
        return "info";
    }

}
