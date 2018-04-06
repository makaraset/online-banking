package com.onlinebanking.service;

import java.security.Principal;

import com.onlinebanking.model.PrimaryAccount;
import com.onlinebanking.model.PrimaryTransaction;
import com.onlinebanking.model.SavingsAccount;
import com.onlinebanking.model.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
