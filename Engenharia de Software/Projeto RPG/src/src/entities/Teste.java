package entities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		ListaJogadores listaJogadores = new ListaJogadores();
		
		listaJogadores.cadastrarGuilda(new Guilda("Carecas"));
		listaJogadores.cadastrarGuilda(new Guilda("Flamenguistas"));
		assertEquals(listaJogadores.getGuilda().size(),2);
		
		listaJogadores.cadastrarJogador(new Jogador("Rodrigo Alberto",new Detalhes("","Bardo","Orc"), listaJogadores.getGuilda().get(0).toString()));
		listaJogadores.cadastrarJogador(new Jogador("Rogerio",new Detalhes("","Bardo","Humano"), listaJogadores.getGuilda().get(1).toString()));
		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("","Bardo","Orc"), listaJogadores.getGuilda().get(0).toString()));

		assertEquals(listaJogadores.getListaJogadores().size(),3);
		
		Jogador jogadorEcontrado = listaJogadores.buscarJogadorNome("Rogerio");
		
		assertEquals(jogadorEcontrado.getGui(), listaJogadores.getGuilda().get(1).toString());
		
		List<Jogador> classeEcontrada = listaJogadores.buscarClasse(new Detalhes("","Bardo",""));
		
		assertEquals(classeEcontrada.get(2).getDet().getClasse(),"Bardo");
		
		List<Jogador> racaEcontrada = listaJogadores.buscarRaca(new Detalhes("","","Humano"));
		
		assertEquals(racaEcontrada.get(0).getDet().getRaca(),"Humano");
		
		List<Guilda> guildaEcontrada = listaJogadores.buscarGuilda("Carecas");
		assertEquals(guildaEcontrada.size(), 1);
		
		listaJogadores.deletarJogador(jogadorEcontrado);
		assertEquals(listaJogadores.getListaJogadores().size(),2);
		
		listaJogadores.cadastrarJogador(new Jogador("Joao Almeida",new Detalhes("","Bardo","Orc"), listaJogadores.getGuilda().get(0).toString()));

		assertEquals(listaJogadores.getListaJogadores().size(),3);

		
	}

}
