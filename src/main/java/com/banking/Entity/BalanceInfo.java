package com.banking.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class BalanceInfo {

	@Id
	 private int bid;
	 private String balance;
	 private String home_branche;
	 
	 @JoinColumn
	 @OneToOne
	 @JsonBackReference
	 private Account account ;
	   
	 @OneToOne(mappedBy="bal")
	 @JsonManagedReference
	 private Loan loan;
	 
	  
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getHome_branche() {
		return home_branche;
	}
	public void setHome_branche(String home_branche) {
		this.home_branche = home_branche;
	}
	
	 
	 
	 
	
	
	

}
