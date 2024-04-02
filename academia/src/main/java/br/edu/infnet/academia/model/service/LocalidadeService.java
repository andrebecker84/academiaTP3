package br.edu.infnet.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.academia.clients.IEnderecoClient;
import br.edu.infnet.academia.model.domain.Endereco;

// encapsular a funcionalidade da API Viacep.

@Service
public class LocalidadeService {
	
	@Autowired 
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}