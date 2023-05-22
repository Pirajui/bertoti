package entities;

public class Detalhes {
	private String nome, classe, raca;

	public Detalhes(String nome, String classe, String raca) {
		this.nome = nome;
		this.classe = classe;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String toString() {
		return getClasse()+", "+getRaca();
	}
	
	public boolean comparar(Detalhes det) {
		if(classe.equals(det.classe)) {
			return true;
		}
		return false;
	}
	
}

