package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.entities.Cliente;

@RestController
public class LoginController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping("/")
	public ModelAndView login() {
		return new ModelAndView("/login");

	}
	@RequestMapping(value = "/logar", method = RequestMethod.GET)
	public List<Cliente> logar() {
		return clienteRepository.findAll();

	}
	

}
