package oop.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        Dog dog = new Dog("Dog");
//        Bird bird = new Bird("Bird");
//        Fish fish = new Fish("Fish");
//        dog.jump();
//        dog.dogRun();
//        dog.dogBark();
//        System.out.println();
//
//        fish.fishSwim();
//
//
//        System.out.println();
//        bird.jump();
//        bird.birdSing();
//        bird.birdFly();

//        List<Object> toyList = new ArrayList<>();
//        toyList.add(dog);
//        toyList.add(bird);
//        toyList.add(fish);
//
//        if (dog instanceof ToyActions){
//            dog.jump();
//        }
//        if (bird instanceof ToyActions){
//            bird.jump();
//        }
//        if (fish instanceof ToyActions){
//            System.out.println("Yes");
//        }
        Test();

    }
    static void Test(){
        List<Toy> listOfToys = new ArrayList<Toy>();
        Dog dog = new Dog("Chihuahua");
        Bird bird = new Bird("Bird");
        Fish fish = new Fish("Fish");
        listOfToys.add(dog);
        listOfToys.add(bird);
        listOfToys.add(fish);
        for(int i=0; i<listOfToys.size(); i++){
            System.out.println("List of toy: "+listOfToys.get(i));
        }
        System.out.println("Toy that can jump: ");
        for(int i=0; i<listOfToys.size(); i++){
            if (listOfToys.get(i) instanceof ToyActions){
                System.out.println(listOfToys.get(i)+" can jump");
            }
            else
            {
                System.out.println(listOfToys.get(i)+" cant jump");
            }
        }
    }
}
