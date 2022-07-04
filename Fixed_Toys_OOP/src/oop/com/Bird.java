package oop.com;

public class Bird extends Toy implements ToyActions{

    public Bird(String name){
        super(name);
    }
    public void birdFly(){
        System.out.println("The "+ name+" is flying");
    }
    public void jump(){
        System.out.println("The "+name+" is jumping");
    }
    public void birdSing(){
        System.out.println("The "+ name+" is singing");
    }
}
