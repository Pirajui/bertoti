package pattern;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Assinante assinante1 = new Assinante("João");
        Assinante assinante2 = new Assinante("Maria");


        Revista revista = new Revista();


        revista.adicionarObservador(assinante1);
        revista.adicionarObservador(assinante2);


        revista.novaEdicaoLancada();


        revista.removerObservador(assinante2);


        revista.novaEdicaoLancada();
    }
}


interface Observador {
    void notificar(String mensagem);
}


class Assinante implements Observador {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " recebeu a notificação: " + mensagem);
    }
}


interface Assunto {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores(String mensagem);
}


class Revista implements Assunto {
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.notificar(mensagem);
        }
    }

    public void novaEdicaoLancada() {
        notificarObservadores("Nova edição lançada!");
    }

}


