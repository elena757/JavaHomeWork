package com.pb.sokolovae.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите 10 любых целых чисел");
        for(int i =0; i< array.length;i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Вы ввели такие числа:"+ Arrays.toString(array));

        int summ =0;
        for (int i = 0; i < array.length; i++) {
            summ+=array[i];
        }
        System.out.println();
        System.out.println("Сумма всех введенных чисел = " + summ);

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count += 1;
        }
        System.out.println("Количество положительных чисел: " + count);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Ваши числа отсортированные от меньшего к большему:" +  Arrays.toString(array));
    }
}
