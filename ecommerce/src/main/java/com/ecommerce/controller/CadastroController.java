package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CadastroController {
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastro() {
		return new ModelAndView("cadastro/cadastro");
		
	}

}
