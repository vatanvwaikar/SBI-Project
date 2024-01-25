package com.banking.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
 
	@Id
	private int id;
	 private String name;
	
	 @OneToOne(mappedBy="account")
	 @JsonManagedReference
	private BalanceInfo bal ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}
