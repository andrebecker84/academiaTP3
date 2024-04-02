package br.edu.infnet.academia.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.academia.model.domain.Endereco;

// Interface para direcionar pra API Viacep através da camada externa `LocalidadeService`

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient") 
public interface IEnderecoClient {
	
	@GetMapping(value = "/{cep}/json/")
	Endereco obterPorCep(@PathVariable String cep); 
	
}