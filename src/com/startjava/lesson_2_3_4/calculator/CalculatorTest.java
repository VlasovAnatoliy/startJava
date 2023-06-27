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
            if (result == (int) result) {
                System.out.printf("Результат: %.0f\n", result);
            } else {
                System.out.printf("Результат: %.3f\n", result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ответ. Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            }
        }
        System.out.println("Работа программы завершена");
    }
}
