package br.edu.infnet.academia.model.domain;

import java.util.List;

public class Academia {
	
	private String nome;
	private String email;
	private List<Instrutor> instrutores;
	private Endereco endereco;
	
	
	// construtor
	public Academia() {
		this.setNome("Maromba Fitness");
		this.setEmail("maromba@marombafitness.com");
		this.setEndereco(new Endereco());
	}
	
	public Academia(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Academia(String nome, String email) {
		this(nome);
		this.setEmail(email);
	}
	
	public Academia(String nome, String email, Endereco endereco) {
		this(nome, email);
		this.setEndereco(endereco);
	}
	
	
	@Override
	public String toString() {
		return "Academia: " + nome + " - " + email + " - " + endereco;
	}
	
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}