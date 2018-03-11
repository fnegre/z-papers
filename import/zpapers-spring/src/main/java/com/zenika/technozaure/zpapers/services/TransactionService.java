package com.zenika.technozaure.zpapers.services;

import com.zenika.technozaure.zpapers.domains.Transaction;
import com.zenika.technozaure.zpapers.repositories.ITransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private ITransaction transaction;


    @Transactional(readOnly = true)
    public List<Transaction> rechercheParSens(final String sens) {
        List<Transaction> result = transaction.findBySens(sens);
        return result;
    }
}
