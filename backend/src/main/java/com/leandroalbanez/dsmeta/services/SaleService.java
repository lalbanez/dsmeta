package com.leandroalbanez.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.leandroalbanez.dsmeta.entities.Sales;
import com.leandroalbanez.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    public Page<Sales> findSales(String minDate, String maxDate, Pageable pageable){
        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate oneYearAgo = today.minusDays(365);

        LocalDate min = minDate.equals("") ? oneYearAgo : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return saleRepository.findSales(min, max, pageable);
    }
}
