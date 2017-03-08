package com.company;

/**
 * Created by ian on 08/03/2017.
 */

/**
 * Dog is a subclass of animal
 */
public class Dog extends Animal {

    private int mTail;

    /**
     * Creates a Dog using the Animal constructor with an additional parameter mTail
     * @param name
     * @param body
     * @param weight
     * @param brain
     * @param tail
     */
    public Dog(String name, int body, int weight, int brain, int tail) {
        super(name, body, weight, brain);
        mTail = tail;
    }


    public void bark(){
        System.out.println("Dog bark()");
    }

    /**
     * Sample of polymorphism by overriding the method move of the Animal superclass with its own implementation
     */
    @Override
    public void move() {
        System.out.println("run");
    }
}
