package com.pdev.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdev.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
