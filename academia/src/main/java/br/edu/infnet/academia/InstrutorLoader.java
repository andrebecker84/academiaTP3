package br.edu.infnet.academia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.academia.model.domain.Endereco;
import br.edu.infnet.academia.model.domain.Instrutor;
import br.edu.infnet.academia.model.service.InstrutorService;
import br.edu.infnet.academia.model.service.LocalidadeService;

@Component
public class InstrutorLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private InstrutorService instrutorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoInstrutor = localidadeService.obterPorCep("03047000");
		
		instrutorService.incluir(new Instrutor());
		instrutorService.excluir(1234);
		
		instrutorService.incluir(new Instrutor(enderecoInstrutor));
		
		Instrutor instrutor = new Instrutor();
		instrutor.setRegistro(4567);
		instrutor.setNome("Instrutor Ciclano Meireles");
		instrutor.setSalario(50000);
		instrutor.setGraduado(false);
		instrutor.setEndereco(new Endereco("03047000", "Rua 21 de Abril", "Apto 202", "Brás", "São Paulo", "SP"));
		
		instrutorService.incluir(instrutor);

		System.out.println(" - " + instrutorService.obterLista());
	}	
	
}