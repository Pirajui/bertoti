import loja.Loja;
import loja.Usuario;

public class Teste {

    public static void main(String[] args) {

        Loja loja = new Loja();
        
        loja.cadastrarUsuario(new Usuario("gustavo@fatec.com.br"));
        loja.cadastrarUsuario(new Usuario("joao@fatec.com.br"));
        loja.cadastrarUsuario(new Usuario("gabriel@fatec.com.br"));
        loja.cadastrarUsuario(new Usuario("felipe@fatec.com.br"));
        loja.cadastrarUsuario(new Usuario("joaozinho@fatec.com.br"));
        System.out.println(loja.getUsuarios().size());
    }
}
