package oop.com;

public class Fish extends  Toy{
    public Fish(String name) {
        super(name);
    }
    public void fishSwim(){
        System.out.println("The "+ name + " is swimming");
    }
}
