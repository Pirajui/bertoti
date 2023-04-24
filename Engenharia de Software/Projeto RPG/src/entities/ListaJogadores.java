package entities;

import java.util.LinkedList;
import java.util.List;

public class ListaJogadores {
	private List<Jogador>lista = new LinkedList<Jogador>();
	
	public void cadastrarJogador(Jogador jogador) {
		lista.add(jogador);
	}
	
	public List<Jogador> buscarJogadorNome(Detalhes detalhes) {
		List<Jogador> jogadorEncontrado = new LinkedList<Jogador>();
		for(Jogador jogador:lista) {
			if(jogador.getDet().comparar(detalhes)) {jogadorEncontrado.add(jogador);}		
		}
		return jogadorEncontrado;
	}
	
	public List<Jogador> getLista(){
		return this.lista;
	}
}
