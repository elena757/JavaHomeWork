package com.pb.sokolovae.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private final String sound;
    private final String color;

    public Horse(String food, String location, String sound, String color) {
        super(food, location);
        nameAnimal = "лошадь";
        this.sound = sound;
        this.color = color;
    }
    @Override
    public void makeNoise() {
        System.out.println(color + " " + nameAnimal + " кричит" + sound);
    }
    @Override
    public void sleep() {
        System.out.println(nameAnimal + " спит" + location );
    }
    @Override
    public void eat() {
        System.out.println(nameAnimal + " любит кушать " + food);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(sound, horse.sound) && Objects.equals(color, horse.color)
                && Objects.equals(food, horse.food) && Objects.equals(location, horse.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(food, location, sound, color);
    }
}
