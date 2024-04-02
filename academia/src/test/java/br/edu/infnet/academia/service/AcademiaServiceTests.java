package br.edu.infnet.academia.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.academia.model.domain.Academia;
import br.edu.infnet.academia.model.service.AcademiaService;

@SpringBootTest
public class AcademiaServiceTests {

	@Autowired
	private AcademiaService academiaService;
	
	private Academia academia;
	
	private final String NOME = "Maromba Fitness";
	
	@BeforeEach
	void setUp() {
		academia = new Academia(NOME);
	}
	
	@Test
	void inclusao() {
				
		academiaService.incluir(academia);
		
		assertEquals(academia, academiaService.obter(NOME));
	}
	
	@Test
	void exclusao( ) {
		inclusao();
		
		academiaService.excluir(NOME);
		
		assertEquals(null, academiaService.obter(NOME));
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(academiaService.obterLista().contains(academia));
	}
}