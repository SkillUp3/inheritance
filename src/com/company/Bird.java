package com.company;

/**
 * Created by ian on 08/03/2017.
 */
public class Bird extends Animal{
    private int mWings;

    /**
     * Creates a Dog using the Animal constructor with an additional parameter mWing
     * @param name
     * @param body
     * @param weight
     * @param brain
     * @param wings
     */
    public Bird(String name, int body, int weight, int brain, int wings) {
        super(name, body, weight, brain);
        mWings = wings;
    }

    @Override
    public void move() {
        System.out.println("Bird fly()");
    }



    public int getWings() {
        return mWings;
    }

    /**
     * Example of the advantage of encapsulating variables. Variable validation can be done
     * @param wings
     */
    public void setWings(int wings) {
        if(wings <=2){
            mWings = wings;
        }else{
            System.out.println("invalid wing number");
        }

    }
}
