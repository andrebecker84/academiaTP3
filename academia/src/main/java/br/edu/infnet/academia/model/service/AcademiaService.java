package br.edu.infnet.academia.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.academia.model.domain.Academia;

@Service
public class AcademiaService {

	private static Map<String, Academia> academias = new HashMap<String, Academia>();
	
	// CRUD
	public void incluir(Academia academia) {
		academias.put(academia.getNome(), academia);
	}

	public void excluir(String nome) {
		academias.remove(nome);
	}

	public Collection<Academia> obterLista() {
		return academias.values();
	}

	public Academia obter(String nome){
		return academias.get(nome);
	}

}