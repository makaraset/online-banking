package com.onlinebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebanking.model.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
