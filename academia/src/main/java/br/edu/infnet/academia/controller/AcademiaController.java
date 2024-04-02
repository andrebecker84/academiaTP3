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

import br.edu.infnet.academia.model.domain.Academia;
import br.edu.infnet.academia.model.service.AcademiaService;

@RestController
@RequestMapping("/api/academia")
public class AcademiaController {

	@Autowired
	private AcademiaService academiaService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Academia academia) {
		academiaService.incluir(academia);
	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String nome) {
		academiaService.excluir(nome);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Academia> obterLista(){
		return academiaService.obterLista();
	}
	
	@GetMapping(value = "/{nome}/listar")
	public Academia obter(@PathVariable String nome){
		return academiaService.obter(nome);
	}	
}