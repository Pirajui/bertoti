package Strategy.patern;


public class index {
    public static void main(String[] args) {

        Notify notify = new Notify();
        Execute executeNot = new Execute(notify);
        executeNot.executeOperation(notify);

        NotifyNew NotifyNew = new NotifyNew();
        Execute executeNew = new Execute(NotifyNew);
        executeNew.executeOperation(NotifyNew);


    }
}

interface Strategy{
    void execute();
}

class NotifyNew implements Strategy{

    @Override
    public void execute(){
        System.out.println("Há um novo produto na loja!!"); 
    }
}

class Notify implements Strategy{

    @Override
    public void execute(){
        System.out.println("Seu produto chegou na loja!!"); 
    }
}

class Execute{
    Strategy execute;

    public Execute(Strategy execute){
        this.execute = execute;
    }

    void executeOperation(Strategy execute){
        execute.execute();
    }

}