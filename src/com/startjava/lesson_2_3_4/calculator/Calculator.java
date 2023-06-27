package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double num1 = Double.parseDouble(elements[0]);
        double num2 = Double.parseDouble(elements[2]);
        char sign = elements[1].charAt(0);
        double result;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Введенный знак операции не поддерживается");
                return 0;
        }
        return result;
    }
}