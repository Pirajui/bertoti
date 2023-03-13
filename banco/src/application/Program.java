package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		
		System.out.print("Qual o ID: ");
		String id = sc.next();
		System.out.print("Nome: ");
		cliente.name = sc.next();
		double money = sc.nextDouble();
		System.out.println(banco.emprestimo(money)+" ID: " +cliente.cadastrarCliente(id));
		
		sc.close();
	}

}
