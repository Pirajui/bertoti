package Composite.antipatern;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
 
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");


        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");


        try {
            dir1.add(file1);
            dir1.add(file2);
            dir2.add(file3);
            dir1.add(dir2);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }


        dir1.display();
    }
}


// Component
interface FileSystemComponent {
    void add(FileSystemComponent component); 
    void remove(FileSystemComponent component);
    void display();
}

// Leaf
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(FileSystemComponent component) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}


class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
