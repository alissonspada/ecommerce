package com.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.entities.Cliente;


@RestController
public class LoginController {
	
	private ClienteRepository clienteRepository;

	@RequestMapping("/")
	public ModelAndView login() {
		return new ModelAndView("/login");

	}
	
	@RequestMapping(value = "/logar", method = RequestMethod.POST)
	public List<Cliente> logar(@RequestBody Cliente cliente) {
		return clienteRepository.findAll();

	}
	

}
