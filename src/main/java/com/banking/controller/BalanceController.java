package com.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.banking.Entity.BalanceInfo;
import com.banking.repository.BalanceRepo;

@RestController
public class BalanceController {
	
	@Autowired
	private BalanceRepo repo2;
	
	@PostMapping("/add-balance") 
	public String addbalance(@RequestBody BalanceInfo balance)
	{
		 repo2.save(balance);
		return "the balance added sucessfully..!";
	}
	
	@GetMapping("/get-all-balance")  
	public List<BalanceInfo> getallbalance(){
		return repo2.findAll();
	}
}
