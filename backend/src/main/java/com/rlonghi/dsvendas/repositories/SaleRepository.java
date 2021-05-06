package com.rlonghi.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlonghi.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
