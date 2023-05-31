package com.epsi.Gestionnairedestock.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long price;
    private Integer quantity;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Transaction> transactionList;

    public Product(Long id, String name, List<Transaction> transactionList) {
        this.id = id;
        this.name = name;
        this.transactionList = transactionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Long getStorageAmount() {
        Long amount = 0L;
        try {
            for (Transaction trans: transactionList) {
                amount += trans.getAmount();
            }
        } catch (NullPointerException npe) {
            System.out.println("Transaction not found !");
        }


        return amount;
    }
}
