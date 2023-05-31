package com.epsi.Gestionnairedestock.repo;

import com.epsi.Gestionnairedestock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository <Product, Long> {
}
