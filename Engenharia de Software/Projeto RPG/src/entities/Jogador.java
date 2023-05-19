package entities;

public class Jogador {
	private String nome;
	private Detalhes det;
	
	
	public Jogador(String nome, Detalhes det) {
		this.nome = nome;
		this.det = det;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Detalhes getDet() {
		return det;
	}

	public void setDet(Detalhes det) {
		this.det = det;
	}

}
