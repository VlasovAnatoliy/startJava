package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static int calculate(int num1, int num2, char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Введенный знак операции не поддерживается");
                return 0;
        }
    }
}