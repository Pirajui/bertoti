package entities;

import java.util.List;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaJogadores listaJogadores = new ListaJogadores();
		List<Jogador> lista = listaJogadores.getLista();
		//assertEquals(lista.getLista().size(),0);
		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("","Guerreiro","Orc")));
		listaJogadores.cadastrarJogador(new Jogador("Vicente Fagundes",new Detalhes("","Barado","Elfo")));
		listaJogadores.cadastrarJogador(new Jogador("Rogerio",new Detalhes("","Bardo","Humano")));
		listaJogadores.cadastrarJogador(new Jogador("Rodolfo Almeida",new Detalhes("","Guerreiro","Orc")));
		listaJogadores.cadastrarJogador(new Jogador("Amanda",new Detalhes("","Bardo","Anão")));

		
		
		String nomePesquisa = "Rodolfo Almeida";
		Detalhes classePesquisa = new Detalhes("","Bardo","");
		List<Jogador> econtrado = listaJogadores.buscarJogadorNome(nomePesquisa);
		List<Jogador> classeEcontrado = listaJogadores.buscarClasse(classePesquisa);
		
		for(Jogador j: lista) {
			System.out.print(j.getNome()+","+j.getDet().toString());
			System.out.println();
		}
		
		for(Jogador j: econtrado) {
			System.out.println("Jogador encontrado: ");
			System.out.print(j.getNome()+", "+j.getDet().toString());
		}
		System.out.println();
		System.out.println("Classe econtrada: ");
		for(Jogador j: classeEcontrado) {
			System.out.print(j.getNome()+", "+j.getDet().toString());
			System.out.println();
		}
	}
}
