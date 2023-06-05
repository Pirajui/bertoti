package entities;


public class Jogador {
	private String nome;
	private Detalhes det;
	private String gui;
	
	
	public Jogador(String nome, Detalhes det, String guilda) {
		this.nome = nome;
		this.det = det;
		this.gui =  guilda;
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


	public String getGui() {
		return gui;
	}


	public void setGui(String  gui) {
		this.gui = gui;
	}

}
