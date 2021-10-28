package com.pb.sokolovae.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

// Получение строки от пользователя
        System.out.println("Введите 1 строку : ");
        String s1 = scanner.nextLine();

        System.out.println("Введите 2 строку : ");
        String s2 = scanner.nextLine();

        if(checkAnagram(s1, s2))
            System.out.println("Это анаграмма");
        else
            System.out.println("Это не анаграмма");

        scanner.close();
    }

    public static boolean checkAnagram(String s1, String s2)
    {
// Удаляем все знаки препинания и пробелі
        s1 = s1.replaceAll("\\p{Punct}|\\s+","");
        s2 = s2.replaceAll("\\p{Punct}|\\s+","");



        // Проверяем, совпадают ли обе длины
        if(s1.length() != s2.length())
            return false;
        else
        {
            // Преобразование обеих строк в нижний регистр и в массив символов
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            // Проверяем, равны ли оба массива
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Проверка равні ли оба массива
            return (Arrays.equals(arr1, arr2));
        }
    }
}
