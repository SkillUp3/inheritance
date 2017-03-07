package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class Dog extends Animal {
    private  int tail;
    private String breed;
    private String coat;

    public Dog(String name, int body, int weight, int tail, String breed, String coat) {
        super(name, body, weight);
        this.tail = tail;
        this.breed = breed;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();

    }
    public void walk(){
        System.out.println("dog.walk() called");
        super.move(5);
    }
}
