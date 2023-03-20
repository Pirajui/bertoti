package application;

import java.util.LinkedList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new LinkedList<Produto>();

    public void addSala(Produto produto){
    	produtos.add(produto);
    }
	
    public List<Produto> buscarProdutoNome(String nome){
        List<Produto> encontrados = new LinkedList<Produto>();
        for (Produto produto: produtos){
            if (produto.getNome().equals(nome))
                encontrados.add(produto);
        }
        return encontrados;
    }

}