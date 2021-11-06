package com.pb.sokolovae.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private final String breed;
    private final String makeSound;
    private final String sound;
    private final String nickname;



    public Dog(String food, String location, String breed, String makeSound, String sound, String nickname) {
        super(food, location);
        nameAnimal = "собака";
        this.breed = breed;
        this.makeSound = makeSound;
        this.nickname = nickname;
        this.sound = sound;
    }
    @Override
    public void makeNoise() {
        System.out.println(nameAnimal + " " + makeSound );
        System.out.println(nameAnimal + " породы " + breed + " утром издает звук " + sound);
    }
    @Override
    public void sleep() {
        System.out.println(nameAnimal + " по кличке " + nickname + " спит" + location );
    }
    @Override
    public void eat() {
        System.out.println(nickname + " любит кушать " + food);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return  Objects.equals(food, dog.food)
                && Objects.equals(location, dog.location) && Objects.equals(makeSound, dog.makeSound)
                && Objects.equals(sound, dog.sound)
                && Objects.equals(breed, dog.breed) && Objects.equals(nickname, dog.nickname);

    }
    @Override
    public int hashCode() {
        return Objects.hash(breed, food, location, makeSound, sound,  nickname);
    }
}
