package com.cognizant.ormlearn.repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCode(String code);

    List<Stock> findByCodeAndDateBetween(String code, Date startDate, Date endDate);

    List<Stock> findByCloseGreaterThan(BigDecimal price);
}