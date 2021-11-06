package com.pb.sokolovae.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private final String nickname;
    private final String sound;

    public Cat(String food, String location, String nickname, String sound) {
        super(food, location);
        nameAnimal = "кошка";
        this.nickname = nickname;
        this.sound = sound;
    }
    @Override
    public void makeNoise() {
        System.out.println( nameAnimal + " издает звук " + sound);
    }
    @Override
    public void sleep() {
        System.out.println( nameAnimal + " "+ nickname +" спит ");
        System.out.println( nameAnimal + " спит" + location);
    }
    @Override
    public void eat() {
        System.out.println(nameAnimal + " по кличке " + nickname + " любит кушать " + food);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(nickname, cat.nickname) && Objects.equals(sound, cat.sound) &&
                Objects.equals(food, cat.food)
                && Objects.equals(location, cat.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nickname, sound, food, location);
    }
}
