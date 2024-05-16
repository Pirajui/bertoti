package Strategy.antipatern;



public class Main {
    public static void main(String[] args) {
        Context contextA = new Context("Chegou");
        contextA.executeStrategy(); 
        
        Context contextB = new Context("Novo");
        contextB.executeStrategy(); 
    }
}


interface Strategy {
    void execute();
}

class Notify implements Strategy {
    @Override
    public void execute() {
        System.out.println("Seu pedido chegou!!!");
    }
}

class NotifyNew implements Strategy {
    @Override
    public void execute() {
        System.out.println("Há produto no na loja!!");
    }
}

class Context {
    private Strategy strategy;

    public Context(String strategyType) {

        if (strategyType.equals("Chegou")) {
            this.strategy = new Notify();
        } else if (strategyType.equals("Novo")) {
            this.strategy = new NotifyNew();
        }

    }

    public void executeStrategy() {
        strategy.execute();
    }
}

