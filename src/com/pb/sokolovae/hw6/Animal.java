package com.pb.sokolovae.hw6;

public class Animal {
    protected String nameAnimal;
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println();
    }

    public void eat() {
        System.out.println();
    }

    public void sleep() {
        System.out.println();
    }
}
