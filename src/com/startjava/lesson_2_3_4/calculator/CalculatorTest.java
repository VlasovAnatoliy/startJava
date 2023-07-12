package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите математическое выражение:");
            String expression = scanner.nextLine();
            double result = Calculator.calculate(expression);
            printResult(expression, result);
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ответ.");
            }
        }
        System.out.println("Работа программы завершена");
    }

    public static void printResult(String expression, double result) {
        if (result == (int) result) {
            System.out.printf("%s = %.0f\n", expression, result);
        } else {
            System.out.printf("%s = %.3f\n", expression, result);
        }
    }
}