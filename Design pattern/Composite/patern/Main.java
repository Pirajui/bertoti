package Composite.patern;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.addComponent(new Leaf("Leaf 1"));
        composite.addComponent(new Leaf("Leaf 2"));

        Composite composite2 = new Composite();
        composite2.addComponent(new Leaf("Leaf 3"));
        composite2.addComponent(new Leaf("Leaf 4"));

        composite.addComponent(composite2);

        composite.operation(); 
        
    }
}

interface Component {
    void operation();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " operation");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void addComponent(Component component) {
        children.add(component);
    }

    public void removeComponent(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation");
        for (Component component : children) {
            component.operation();
        }
    }
}

