package br.edu.infnet.academia.model.domain;

public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	@Override
	public String toString() {
		
		return "Endereço: " + cep + ";" + logradouro + ";" + bairro;
	}
	
	
	// construtor
	public Endereco() {
		this.setCep("05755090");
		this.setLogradouro("Avenida Anacé");
		this.setBairro("Jardim Umarizal");
	}
	
	public Endereco(String cep) {
		this();
		this.cep = cep;
	}
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this(cep);
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}


	// getters and setters 
	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}
	
}