package com.ecommerce.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
