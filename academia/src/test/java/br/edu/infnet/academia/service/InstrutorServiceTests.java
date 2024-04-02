package br.edu.infnet.academia.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.academia.model.domain.Instrutor;
import br.edu.infnet.academia.model.service.InstrutorService;

@SpringBootTest
public class InstrutorServiceTests {

	@Autowired
	private InstrutorService instrutorService;
	
	private Instrutor instrutor;
	
	private final int REGISTRO = 1234;

	@BeforeEach
	void setUp() {
		instrutor = new Instrutor(REGISTRO);
	}
	
	@Test
	void inclusao() {
		
		instrutorService.incluir(instrutor);
		
		assertEquals(instrutor, instrutorService.obter(REGISTRO));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		instrutorService.excluir(REGISTRO);
		
		assertEquals(null, instrutorService.obter(REGISTRO));		
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(instrutorService.obterLista().contains(instrutor));
	}
}