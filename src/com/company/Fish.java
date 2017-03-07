package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class Fish extends Animal {

    private int mGills;
    private int mDins;


    public Fish(String name, int body, int weight, int gills, int dins) {
        super(name, body, weight);
        mGills = gills;
        mDins = dins;
    }

    private void swim(int speed){
        System.out.println("fish is swimming");
        super.move(speed);
    }
}
