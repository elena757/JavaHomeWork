package com.pb.sokolovae.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int operand1 = in.nextInt();
        System.out.println("Введите знак плюс, минус , умножить, разделить");
        String sign = in.next();
        System.out.println("Введите второе число");
        int operand2 = in.nextInt();
        System.out.println("Получите результат");
        int result;
        switch (sign) {

            case "+":
                result = operand1+operand2;
                System.out.println(result);
                break;
            case "-":
                result = operand1-operand2;
                System.out.println(result);
                break;
            case "*":
                result = operand1*operand2;
                System.out.println(result);
                break;


            case "/":
                if (operand2 == 0) {
                    System.out.println ("На ноль делить нельзя!");
                }
                else {
                    result = operand1 / operand2;
                    System.out.println(result);
                }
        }
    }
}
