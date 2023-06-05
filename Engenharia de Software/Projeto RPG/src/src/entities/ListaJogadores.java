package entities;

import java.util.LinkedList;
import java.util.List;

public class ListaJogadores {
	private List<Jogador> lista = new LinkedList<Jogador>();
	private List<Guilda> guilda = new LinkedList<Guilda>();
	
	public void cadastrarJogador(Jogador jogador) {
		lista.add(jogador);
	}
	
	public void deletarJogador(Jogador jogador) {
		lista.remove(jogador);
	}
	
	public void cadastrarGuilda(Guilda gui) {
		guilda.add(gui);
	}
	
	public Jogador buscarJogadorNome(String nome) {
		for(Jogador j: lista) {
			if(j.getNome().equals(nome)) {
				return j;
			}		
		}
		return null;
	}
	
	public List<Guilda> buscarGuilda(String nomeGuilda) {
		List<Guilda> guildaEncontrada = new LinkedList<Guilda>();
		for(Guilda g: guilda) {
			if(g.getNome()==nomeGuilda) {
				guildaEncontrada.add(g);
			}
		}
		return guildaEncontrada;
	}
	
	public List<Jogador> buscarClasse(Detalhes det) {
		List<Jogador> classeEcontrada = new LinkedList<Jogador>();
		for(Jogador j: lista) {
			if(j.getDet().compararClasse(det)) {
				classeEcontrada.add(j);
			}
		}
		return classeEcontrada;
	}
	
	public List<Jogador> buscarRaca(Detalhes det) {
		List<Jogador> racaEncontrada = new LinkedList<Jogador>();
		for(Jogador j: lista) {
			if(j.getDet().compararRaca(det)) {
				racaEncontrada.add(j);
			}
		}
		return racaEncontrada;
	}
	
	public List<Jogador> getListaJogadores(){
		return this.lista;
	}
	
	public List<Guilda> getGuilda(){
		return this.guilda;
	}
} 
