package test;

import java.util.LinkedList;
import java.util.List;

import entities.Detalhes;
import entities.Jogador;
import entities.ListaJogadores;

class Test {
	
	void test() {
		// TODO Auto-generated method stub
		ListaJogadores listaJogadores = new ListaJogadores();
		//assertEquals(lista.getLista().size(),0);
		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("Rodolfo Almeida","Guerreiro","Orc")));
		listaJogadores.cadastrarJogador(new Jogador("Vicente Fagundes",new Detalhes("Vicente Fagundes","Bardo","Elfo")));
		
	}
}
