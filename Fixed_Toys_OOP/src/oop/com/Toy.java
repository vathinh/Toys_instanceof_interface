package oop.com;

abstract class Toy  {
    String name;
    public Toy(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
