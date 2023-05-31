package com.epsi.Gestionnairedestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime transactionDateTime;
    private Integer amount;

    public Long getId() {
        return id;
    }

    public Transaction() {
        transactionDateTime = LocalDateTime.now();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
