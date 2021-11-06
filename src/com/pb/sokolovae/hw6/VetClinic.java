package com.pb.sokolovae.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[]{
                new Cat("колбаску", " в доме", "Жужа", "мяу"),
                new Dog("мясо", " в будке ", "лабрадор", "лает","гав-гав" , "Сеня"),
                new Horse("овес", " на конюшне", " иго-го-го","белая"),
        };
        for (Animal el : animals) {
            el.makeNoise();
            el.sleep();
            el.eat();
            System.out.println("---------");
        }

        Class<?> clazz = Class.forName("com.pb.sokolovae.hw6.Veterinarian");
        Constructor<?> Constr;
        Constr = clazz.getConstructor();
        Object obj = Constr.newInstance();

        System.out.println("На прием к ветеринару приходили:");

        for (Animal el : animals) {
            ((Veterinarian) obj).treatAnimal(el);
        }
    }
}
