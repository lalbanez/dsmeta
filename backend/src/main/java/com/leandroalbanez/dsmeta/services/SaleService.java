package com.leandroalbanez.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandroalbanez.dsmeta.entities.Sales;
import com.leandroalbanez.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    public List<Sales> findSales(){
        return saleRepository.findAll();
    }
}
