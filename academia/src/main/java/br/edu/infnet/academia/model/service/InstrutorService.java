package br.edu.infnet.academia.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.academia.model.domain.Instrutor;

@Service
public class InstrutorService {
	
	private static Map<Integer, Instrutor> instrutores = new HashMap<Integer, Instrutor>();
	
	
	public void incluir(Instrutor instrutor) {
		instrutores.put(instrutor.getRegistro(), instrutor);
	}
	
	public void excluir(int registro) {
		instrutores.remove(registro);
	}
	
	public Collection<Instrutor> obterLista(){
		return instrutores.values();
	}
	
	public Instrutor obter (int registro) {
		return instrutores.get(registro);
	}
}