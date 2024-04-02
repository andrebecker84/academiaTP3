package br.edu.infnet.academia.model.domain;

public class Instrutor {

	private int registro;
	private String nome;
	private float salario;
	private boolean graduado;
	private Endereco endereco;
	
	
	public Instrutor() {
		this.setRegistro(1234);
		this.setNome("Fulano da Silva");
		this.setSalario(3000);
		this.setGraduado(true);
		this.setEndereco(new Endereco("03047000", "Rua 21 de Abril", "Casa", "Brás", "São Paulo", "SP"));
	}
	
	public Instrutor(int registro) {
		this();
		this.setRegistro(1234);
	}
	
	public Instrutor(Endereco endereco) {
		this();
		this.setEndereco(endereco);
	}
	
	
	public float calcularSalario() {
		float salarioTotal = salario + (graduado ? 1250 : 750);
		return bonificacao() ? salarioTotal + 1000 : salarioTotal;
	}
	
	public boolean bonificacao() {
		return salario >= 5000 && graduado;
	}
	
	
	@Override
	public String toString() {
		return "Instrutor: " + registro + " - " + nome + " - " + salario + " - " + graduado + " - " + endereco;
	}
	
	
	// getters and setters
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isGraduado() {
		return graduado;
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}