package entities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		ListaJogadores listaJogadores = new ListaJogadores();

		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("","Guerreiro","Orc")));
		listaJogadores.cadastrarJogador(new Jogador("Vicente Fagundes",new Detalhes("","Barado","Elfo")));
		listaJogadores.cadastrarJogador(new Jogador("Rogerio",new Detalhes("","Bardo","Humano")));
		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("","Guerreiro","Orc")));
		listaJogadores.cadastrarJogador(new Jogador("Amanda",new Detalhes("","Bardo","Anão")));

		assertEquals(listaJogadores.getLista().size(),5);
		
		Jogador jogadorEcontrado = listaJogadores.buscarJogadorNome("Rogerio");
		
		assertEquals(jogadorEcontrado.getDet().getClasse(), "Bardo");
		
		List<Jogador> classeEcontrada = listaJogadores.buscarClasse(new Detalhes("","Bardo","Humano"));
		
		assertEquals(classeEcontrada.get(0).getNome(),"Rogerio");
		
	}

}
