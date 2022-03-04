package com.example.hw8_on_spring.repository;

import com.example.hw8_on_spring.entity.CompanyEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepo extends CrudRepository<CompanyEntity, Long> {
}
