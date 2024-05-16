package Facade.patern;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        

        facade.operation1();
        facade.operation2();
    }
}

class SubsystemA {
    public void operationA() {
        System.out.println("SubsystemA operation");
    }
}

class SubsystemB {
    public void operationB() {
        System.out.println("SubsystemB operation");
    }
}

class SubsystemC {
    public void operationC() {
        System.out.println("SubsystemC operation");
    }
}

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public void operation1() {
        subsystemA.operationA();
        subsystemB.operationB();
    }

    public void operation2() {
        subsystemB.operationB();
        subsystemC.operationC();
    }
}



