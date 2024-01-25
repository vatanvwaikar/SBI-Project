package com.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Entity.Account;
import com.banking.repository.AccountRepo;
  
@RestController
public class AccountController { 
	
	@Autowired
	private AccountRepo repo1 ;
	
	@PostMapping("/add-account")
	public String addaccount(@RequestBody Account account)
	{
		 repo1.save(account);
		return "the account added sucessfully..!";
	}
	@GetMapping("/get-all-account")  
	public List<Account> getallaccount(){
		return repo1.findAll();
	}
	
	
	@DeleteMapping("/delet-by-id")
	public String Deletebyid(@RequestParam ("input")int input ) {
		repo1.deleteById(input);
		return"user with id number  : "+input+"deleted successfully "; 
	}
	
	
	@PutMapping("/change-name")
	public String Changename(@RequestParam ("newname") String newname, @RequestParam ("oldname") String oldname) {
		
		repo1.changename(newname, oldname);
		return "name change to " + oldname +  "to" +  newname;
		
		
	}
	

}







