package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CadastroController {

	@RequestMapping("/cadastro")
	 public ModelAndView cadastro() {
		return new ModelAndView("/cadastro");
		
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(String parametro) {
		return parametro;
		
	}
	
}
