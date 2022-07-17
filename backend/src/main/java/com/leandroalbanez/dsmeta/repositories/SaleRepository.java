package com.leandroalbanez.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroalbanez.dsmeta.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long>{
    
}
