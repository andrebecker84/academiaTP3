package br.edu.infnet.academia.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.academia.model.domain.Instrutor;
import br.edu.infnet.academia.model.service.InstrutorService;

@RestController
@RequestMapping("/api/instrutor")
public class InstrutorController {

	@Autowired
	private InstrutorService instrutorService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Instrutor instrutor) {
		instrutorService.incluir(instrutor);
	}
	
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		instrutorService.excluir(registro);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Instrutor> obterLista(){
		return instrutorService.obterLista();
	}
	
	@GetMapping(value = "/{registro}/listar")
	public Instrutor obter(@PathVariable int registro){
		return instrutorService.obter(registro);
	}	
}