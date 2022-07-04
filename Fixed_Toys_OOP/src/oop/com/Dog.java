package oop.com;

public class Dog extends Toy implements ToyActions {
    public Dog(String name){
        super(name);
    }
    public void jump(){
        System.out.println("The " +name +" is jumping");
    }
    public void dogRun(){
        System.out.println("The " +name+ " is running");
    }
    public void dogBark(){
        System.out.println("The "+ name + " is barking");
    }
}
