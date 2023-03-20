package application;

import java.util.List;

public class Program {

	public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.addSala(new Produto("Paçoca"));
        estoque.addSala(new Produto("Batata"));
        
        List<Produto> produtosEcontrados = estoque.buscarProdutoNome("Paçoca");

        for (Produto produto: produtosEcontrados){
            System.out.println(produto.getNome());
            
        }


	}

}
