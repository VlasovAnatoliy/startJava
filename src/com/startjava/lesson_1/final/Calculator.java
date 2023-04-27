package com.startjava.lesson_1.final_folder;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int num1 = 10;
        int num2 = 3;
        char sign = '+';
        int result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Неверный знак операции");
            return;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}