package com.pdev.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdev.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
