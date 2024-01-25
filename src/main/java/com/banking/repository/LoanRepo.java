package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.Entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer> {

}
