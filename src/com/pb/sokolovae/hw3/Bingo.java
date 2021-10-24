package com.pb.sokolovae.hw3;

import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(101);
        //System.out.println(n);
        System.out.println("Я загадала число от 0 до 100, отгадай его!");
        System.out.println("Если устанешь играть просто введи 101");
        int count = 1;
        while (true){
            int x = scanner.nextInt();
            if (x == 101){
                System.out.println("Я завершила игру, жду тебя еще");
                break;
            }
            if (x >= 0 && x < 102) {
                if (n > x) {
                    System.out.println("Это " + count +" попытка. Мое число больше, чем " + x + ". Попробуй еще раз");
                    count++;
                } else if (n < x) {
                    System.out.println("Это " + count +" попытка. Мое число меньше, чем " + x + ". Попробуй еще раз");
                    count++;
                } else if (n == x){
                    System.out.println("Ура ты угадал, это действительно число " + n + ". Отличный результат угадать с " + count +" попытки");
                    break;
                }
            }else {
                System.out.println("Я не загадывала такое число. Нужно ввести от 0 до 100 целое число. Попытка не засчитана, давай еще раз попробуем.");
            }

        }
    }
}
