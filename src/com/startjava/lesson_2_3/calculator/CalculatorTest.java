package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();
            int result = Calculator.calculate(num1, num2, sign);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ответ. Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            }
        }
        System.out.println("Работа программы завершена");
    }
}
