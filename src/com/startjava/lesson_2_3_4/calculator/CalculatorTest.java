package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                double result = calculateExpression(expression);
                printResult(result);
            } else {
                System.out.println("Некорректный ответ. Хотите продолжить вычисления? [yes/no]:");
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
        }
        System.out.println("Работа программы завершена");
    }

    public static double calculateExpression(String expression) {
        return Calculator.calculate(expression);
    }

    public static void printResult(double result) {
        if (result == (int) result) {
            System.out.printf("Результат: %.0f\n", result);
        } else {
            System.out.printf("Результат: %.3f\n", result);
        }
    }
}