package com.banking.Entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Loan {
	
	@Id
	private int loan_id;
	private float intrest_rate;
	private  double emi;
	private LocalDate loan_taken;
	private LocalDate loan_due;
	
	@JoinColumn
	@OneToOne
	@JsonBackReference
	private BalanceInfo bal;
	
	
	public BalanceInfo getBal() {
		return bal;
	}
	public void setBal(BalanceInfo bal) {
		this.bal = bal;
	}
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public float getIntrest_rate() {
		return intrest_rate;
	}
	public void setIntrest_rate(float intrest_rate) {
		this.intrest_rate = intrest_rate;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public LocalDate getLoan_taken() {
		return loan_taken;
	}
	public void setLoan_taken(LocalDate loan_taken) {
		this.loan_taken = loan_taken;
	}
	public LocalDate getLoan_due() {
		return loan_due;
	}
	public void setLoan_due(LocalDate loan_due) {
		this.loan_due = loan_due;
	}
	

}
