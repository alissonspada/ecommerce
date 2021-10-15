package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.entities.Cliente;

@RestController
public class CadastroController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	 public ModelAndView cadastro() {
		return new ModelAndView("/cadastro");
		
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public boolean cadastrar(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		
		return true;
		
	}
	
}
