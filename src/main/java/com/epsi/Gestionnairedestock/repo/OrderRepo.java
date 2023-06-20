package com.epsi.Gestionnairedestock.repo;

import com.epsi.Gestionnairedestock.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository <Order, Long> {
}
