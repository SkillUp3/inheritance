package com.company;

/**
 * Created by ian on 08/03/2017.
 */

/**
 * Animal is the Super class
 */
public class Animal {

    /**
     * Encapsulate the instance variables by making them private
     */
    private String mName;
    private int mBody;
    private int mWeight;
    private int mBrain;

    public Animal(String name, int body, int weight, int brain) {
        mName = name;
        mBody = body;
        mWeight = weight;
        mBrain = brain;
    }

    public void eat(){
        System.out.println("Animal eat()");
    }
    public void move(){
        System.out.println("Animal move()");
    }
}
