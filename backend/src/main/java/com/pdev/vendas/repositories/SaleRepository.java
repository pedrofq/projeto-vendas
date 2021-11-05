package com.pdev.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pdev.vendas.dto.SaleSucessDTO;
import com.pdev.vendas.dto.SaleSumDTO;
import com.pdev.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.pdev.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " + 
	" FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.pdev.vendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " + 
			" FROM Sale AS obj GROUP BY obj.seller")
			List<SaleSucessDTO> sucessGroupedBySeller();
}
