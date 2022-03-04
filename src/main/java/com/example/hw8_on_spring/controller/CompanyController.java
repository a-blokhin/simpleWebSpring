package com.example.hw8_on_spring.controller;

import com.example.hw8_on_spring.entity.CompanyEntity;
import com.example.hw8_on_spring.entity.OrderEntity;
import com.example.hw8_on_spring.service.CompanyService;
import com.example.hw8_on_spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllCompanies(Model model) {
        List<CompanyEntity> companies = companyService.getAllCompanies();
        model.addAttribute("companies", companies);
        model.addAttribute("companyEntity", new CompanyEntity());
        return "companies";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addCompany(Model model, @ModelAttribute CompanyEntity companyEntity) {
        companyService.registration(companyEntity);
        return "redirect:/companies";
    }
}
