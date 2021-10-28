package com.pb.sokolovae.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите предложение: ");
        String line = in.nextLine();
        String bigStr = "";
        Scanner lineScan = new Scanner(line);
        StringBuilder bigStrBuilder = new StringBuilder(bigStr);
        while(lineScan.hasNext()) {
            String word;
            word = lineScan.next();
            bigStrBuilder.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        bigStr = bigStrBuilder.toString();
        System.out.println(bigStr.trim());
    }
}
//StringBuilder  — класс, представляющий последовательность символов
//Метод append () класса Java StringBuilder используется для добавления строкового значения к текущей последовательности
//Метод Character.toUpperCase() — в Java возвращает указанное значение типа char в верхнем регистре (заглавной буквой).
//Метод charAt() — возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
//Метод substring() -  возвращает часть строки.