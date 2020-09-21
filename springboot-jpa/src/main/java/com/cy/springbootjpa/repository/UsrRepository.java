package com.cy.springbootjpa.repository;

import com.cy.springbootjpa.entity.Usr;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsrRepository extends JpaRepository<Usr, Integer> {
}
