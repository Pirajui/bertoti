package entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaJogadores {
	private List<Jogador> lista = new LinkedList<Jogador>();
	
	public void cadastrarJogador(Jogador jogador) {
		lista.add(jogador);
	}
	
	public List<Jogador> buscarJogadorNome(String nome) {
		List<Jogador> nomeEcontrado = new ArrayList<>();
		for(Jogador j: lista) {
			if(j.getNome().equals(nome)) {
				nomeEcontrado.add(j);
				return nomeEcontrado;
			}		
		}
		return null;
	}
	
	public List<Jogador> buscarClasse(Detalhes det) {
		List<Jogador> classeEcontrada = new LinkedList<Jogador>();
		for(Jogador j: lista) {
			if(j.getDet().comparar(det)) {
				classeEcontrada.add(j);
			}
		}
		return classeEcontrada;
	}
	
	public List<Jogador> getLista(){
		return this.lista;
	}
} 
