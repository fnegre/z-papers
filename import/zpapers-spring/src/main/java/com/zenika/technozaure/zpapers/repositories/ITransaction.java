package com.zenika.technozaure.zpapers.repositories;

import com.zenika.technozaure.zpapers.domains.Transaction;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface ITransaction extends Repository<Transaction, Long>{

    List<Transaction> findBySens(@Param("sens") String sens);

    List<Transaction> findByEmetteur(@Param("emetteur") String emetteur);

    List<Transaction> findByDateAndEmetteur(@Param("date") Date date, @Param("emetteur") String emetteur);
}
