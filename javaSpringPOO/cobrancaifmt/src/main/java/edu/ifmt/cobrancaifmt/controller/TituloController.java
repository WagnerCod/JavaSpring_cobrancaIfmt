package edu.ifmt.cobrancaifmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt.model.Titulo;
import edu.ifmt.cobrancaifmt.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	@Autowired /////anotação qe irá injetar dependencia 
	private Titulos titulos;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		titulos.save(titulo);
		return "CadastroTitulo";
	}
	
	
}
