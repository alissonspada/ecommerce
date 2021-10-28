package com.ecommerce.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("SELECT p FROM Cliente p WHERE LOWER(p.email) = LOWER(:email)")
    public List<Cliente> findByEmail(@Param("email") String email);
	

}

