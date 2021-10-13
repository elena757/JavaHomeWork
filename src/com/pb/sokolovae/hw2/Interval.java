package com.pb.sokolovae.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int Numeric;
        Numeric = scanner.nextInt();
        if (Numeric >= 0 && Numeric <= 14) {
            System.out.println("Супер! Вы попали в интервал [0 -14]");
        } else if (Numeric >= 15 && Numeric <= 35) {
            System.out.println("Вау! Вы попали в интервал [15 - 35]");
        } else if (Numeric >= 36 && Numeric <= 50) {
            System.out.println("Огонь! Вы попали в интервал [36 - 50]");
        } else if (Numeric >= 51 && Numeric <= 100) {
            System.out.println("Превосходно! Вы попали в интервал [51 - 100]");
        } else
            System.out.println("Эх нет такого интервала в нашей програмке");
    }
}
