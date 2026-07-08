package com.cognizant.ormlearn.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @Transactional(readOnly = true)
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Stock> getStocksByCode(String code) {
        return stockRepository.findByCode(code);
    }
    @Transactional(readOnly = true)
    public List<Stock> getStocksByCodeAndDate(
            String code,
            Date startDate,
            Date endDate) {

        return stockRepository.findByCodeAndDateBetween(code, startDate, endDate);
    }

    @Transactional(readOnly = true)
    public List<Stock> getStocksByClosePrice(BigDecimal price) {

        return stockRepository.findByCloseGreaterThan(price);
    }
}