package br.edu.infnet.academia.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.academia.model.domain.Endereco;
import br.edu.infnet.academia.model.service.EnderecoService;

@SpringBootTest
public class EnderecoServiceTests {

	@Autowired
	private EnderecoService enderecoService;
	
	private Endereco endereco;
	
	private final String CEP = "05755090";

	@BeforeEach
	void setUp() {
		endereco = new Endereco(CEP);
	}
	
	@Test
	void inclusao() {
		
		enderecoService.incluir(endereco);//id=1
		
		assertEquals(endereco, enderecoService.obter("05755090"));
	}
	
	@Test
	void exclusao() {
		inclusao();//id=2
		
		enderecoService.excluir("05755090");
		
		assertEquals(null, enderecoService.obter("05755090"));		
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();//id=3
		
		assertTrue(enderecoService.obterLista().contains(endereco));
	}
}