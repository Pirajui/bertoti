package application;

public class Cliente {
	private String id;
	public String name;
	
	public String cadastrarCliente(String id) {
		this.id = id;
		return id + ", Nome: "+name;
	}
}
	
