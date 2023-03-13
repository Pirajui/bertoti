package application;

public class Banco {
	private float money;
	
	public double emprestimo(double money) {
		this.money+=money;
		return money;
	}
}
