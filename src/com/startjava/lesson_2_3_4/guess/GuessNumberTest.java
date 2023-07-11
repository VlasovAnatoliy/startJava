package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.play();
        System.out.println("Названные числа игроками:");
        displayAttempts(player1);
        displayAttempts(player2);
        System.out.print("Хотите продолжить игру? [yes/no]: ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            guessNumber.play();
            System.out.println("Названные числа игроками:");
            displayAttempts(player1);
            displayAttempts(player2);
        }
    }
    private static void displayAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.println(player.getName() + ": " + Arrays.toString(attempts));
    }
}