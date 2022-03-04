package com.example.hw8_on_spring.service;

import com.example.hw8_on_spring.entity.CompanyEntity;
import com.example.hw8_on_spring.entity.OrderEntity;
import com.example.hw8_on_spring.repository.CompanyRepo;
import com.example.hw8_on_spring.repository.OrderRepo;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepo companyRepo;

    public CompanyEntity registration(CompanyEntity company)  {
        try{
            return companyRepo.save(company);
        } catch (Exception e){
            return null;
        }
    }

    public List<CompanyEntity> getAllCompanies()  {
        List<CompanyEntity> companiesList = new ArrayList<>();
        companyRepo.findAll().forEach(companiesList::add);
        return companiesList;
    }

}
