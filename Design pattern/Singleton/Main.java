package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.getAlert());

        Singleton singleton2 = Singleton.getInstance();

        singleton2.setAlert("Funcionou denovo!!!");
        System.out.println(singleton2.getAlert());
    }
}


 class Singleton {

    private static Singleton instance;

    private String alert;

    private Singleton() {

        alert = "Funcionou!!";
    }


    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

        return instance;
    }

    public String getAlert(){
        return alert;
    }

    public void setAlert(String alert){
        this.alert = alert;
    }

}

