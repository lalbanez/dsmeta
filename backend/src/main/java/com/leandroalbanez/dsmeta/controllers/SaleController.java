package com.leandroalbanez.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandroalbanez.dsmeta.entities.Sales;
import com.leandroalbanez.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService saleService;

    @GetMapping
    public List<Sales> findSales() {
        return saleService.findSales();
    }

}
