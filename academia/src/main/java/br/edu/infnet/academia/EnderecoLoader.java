package br.edu.infnet.academia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.academia.model.domain.Endereco;
import br.edu.infnet.academia.model.service.EnderecoService;
import br.edu.infnet.academia.model.service.LocalidadeService;

@Component
public class EnderecoLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoAcademia = localidadeService.obterPorCep("05755090");
		
		enderecoService.incluir(enderecoAcademia);//id=1
		
		enderecoService.excluir("05755090");
		
		Endereco e1 = new Endereco();
		e1.setCep("03047000");
		e1.setLogradouro("logradouro");
		e1.setBairro("bairro");
		
		
		enderecoService.incluir(e1);//id=2

		System.out.println(" - " + enderecoService.obter("03047000"));

		enderecoService.incluir(enderecoAcademia);//id=3

		System.out.println(" - " + enderecoService.obterLista());
		
	}	
	
}