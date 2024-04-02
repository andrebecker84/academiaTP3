package br.edu.infnet.academia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.academia.model.domain.Academia;
import br.edu.infnet.academia.model.domain.Endereco;
import br.edu.infnet.academia.model.service.AcademiaService;
import br.edu.infnet.academia.model.service.LocalidadeService;

@Component //pra executar automaticamente
public class AcademiaLoader implements ApplicationRunner {

	// criar uma injeção de dependências, para evitar erros nessa linha... -> Endereco enderecoAcademia = enderecoClient.obterPorCep("05755090");
	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private AcademiaService academiaService;
	
	// criar um método run do AcademiaLoader pra executar isto abaixo sempre que iniciar a aplicação
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoAcademia = localidadeService.obterPorCep("05755090");
		
		academiaService.incluir(new Academia("Maromba Fitness", "maromba@marombafitness.com", enderecoAcademia));
		
		academiaService.excluir("Maromba Fitness");
		
		academiaService.incluir(new Academia("Trincados Fitness Center", "trincados@trincadosfitcenter.com", enderecoAcademia));
		
		System.out.println(" - " + academiaService.obter("Trincados Fitness Center"));
		
		academiaService.incluir(new Academia("Fibrados Gym", "fibrados@fibradosgym.com", enderecoAcademia));
		
		System.out.println(" -- " + academiaService.obterLista());
		
	}	
	
}