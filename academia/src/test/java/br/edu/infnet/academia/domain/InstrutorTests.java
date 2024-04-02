package br.edu.infnet.academia.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.academia.model.domain.Instrutor;

@SpringBootTest
public class InstrutorTests {

	private Instrutor instrutor;
	
	private final String NOME = "Andre";
	private final int REGISTRO = 1234;
	
	@BeforeEach
	void setUp() {
		instrutor = new Instrutor();
		instrutor.setNome(NOME);
		instrutor.setRegistro(REGISTRO);
		instrutor.setGraduado(false);
		instrutor.setSalario(0);
	}

	@Test
	void instrutorGraduadoSalarioMenor5000() {
		instrutor.setGraduado(true);
		instrutor.setSalario(2000);

		assertEquals(3250, instrutor.calcularSalario());
	}
	
	@Test
	void instrutorGraduadoSalarioMaior5000() {
		instrutor.setGraduado(true);
		instrutor.setSalario(6000);

		assertEquals(8250, instrutor.calcularSalario());
	}
	
	@Test
	void instrutorGraduadoSalarioIgual5000() {
		instrutor.setGraduado(true);
		instrutor.setSalario(5000);

		assertEquals(7250, instrutor.calcularSalario());
	}
	
	@Test
	void instrutorNaoGraduadoSalarioMenor5000() {
//		instrutor.setGraduado(false);
		instrutor.setSalario(2000);

		assertEquals(2750, instrutor.calcularSalario());
	}
	
	@Test
	void instrutorNaoGraduadoSalarioMaior5000() {
//		instrutor.setGraduado(false);
		instrutor.setSalario(6000);

		assertEquals(6750, instrutor.calcularSalario());
	}
	
	@Test
	void instrutorNaoGraduadoSalarioIgual5000() {
//		instrutor.setGraduado(false);
		instrutor.setSalario(5000);

		assertEquals(5750, instrutor.calcularSalario());
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, instrutor.getNome());
		assertEquals(REGISTRO, instrutor.getRegistro());
		assertEquals(false, instrutor.isGraduado());
		assertEquals(0, instrutor.getSalario());
	}
	
}