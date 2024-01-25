package com.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.banking.Entity.Loan;
import com.banking.repository.LoanRepo;

@RestController
public class LoanController {
	
	@Autowired
	private LoanRepo repo3;
	
	@PostMapping("/add-loan")
	public String addloan(@RequestBody Loan loan)
	{
		 repo3.save(loan);
		return "the loan added sucessfully..!";
	}
	
	@GetMapping("/get-all-loan")  
	public List<Loan> getallLoan(){
		return repo3.findAll();
	}

}
