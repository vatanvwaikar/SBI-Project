package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.Entity.BalanceInfo;

@Repository
public interface BalanceRepo extends JpaRepository<BalanceInfo, Integer>{

	
	
}
