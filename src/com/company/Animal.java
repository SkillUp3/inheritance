package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class Animal {


    private String mName;
    private int mBody;
    private int mWeight;

    public Animal(String name, int body, int weight) {
        mName = name;
        mBody = body;
        mWeight = weight;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getBody() {
        return mBody;
    }

    public void setBody(int body) {
        mBody = body;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight(int weight) {
        mWeight = weight;
    }

    public  void move(int speed){
        System.out.println("animal has moved at speed" + speed);
    }

    public void eat(){
        System.out.println("animal has eaten");
    }

}
