 package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.banking.Entity.Account;

import jakarta.transaction.Transactional;

public interface AccountRepo extends JpaRepository <Account, Integer>{
	
	
	@Modifying
	@Transactional
	@Query (value="update account set name= :nn where name= :on",nativeQuery = true)
	public int changename(@Param("nn")String nn, @Param("on")String on);
	
	

}
