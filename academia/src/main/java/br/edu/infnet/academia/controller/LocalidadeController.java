package br.edu.infnet.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.academia.model.domain.Endereco;
import br.edu.infnet.academia.model.service.LocalidadeService;

// classe para mapeamentos (caminhos que eu devo acessar pra conseguir executar alguma funcionalidade pra dentro da aplicação)
@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {

	@Autowired
	private LocalidadeService localidadeService;
	
	@GetMapping(value = "/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		return localidadeService.obterPorCep(cep);
	}
}