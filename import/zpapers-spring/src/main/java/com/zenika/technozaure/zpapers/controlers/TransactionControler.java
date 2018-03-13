package com.zenika.technozaure.zpapers.controlers;

import com.zenika.technozaure.zpapers.domains.Transaction;
import com.zenika.technozaure.zpapers.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class TransactionControler {


    final TransactionService transactionService;

    @Autowired
    public TransactionControler(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/transaction/{sens}")
    public List<Transaction> rechercheParSens(@PathVariable("sens")String sens){
        return transactionService.rechercheParSens(sens);
    }
}

