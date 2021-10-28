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
	public ResponseEcommerce logar(@RequestBody Cliente cliente) {
		ResponseEcommerce response = new ResponseEcommerce();
		List<Cliente> clientes = clienteRepository.findByEmail(cliente.getEmail());
		if (clientes.isEmpty()) {
			response.setMensagem("dados incorretos");
			response.setOk(false);
			return response;
		}

		if(clientes.get(0).getSenha().equals(cliente.getSenha())) {
			response.setMensagem("login realizado com sucesso");
					 response.setOk(true);
	} else {
		response.setMensagem("dados incorretos");
		response.setOk(false);
	}
		return response;
	}

}
