package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        generateSecretNumber();
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;

        while (true) {
            System.out.print(currentPlayer.getName() + ", введите число от 1 до 100: ");
            int guessNumber = scanner.nextInt();
            if (guessNumber <= 0 || guessNumber > 100) {
                System.out.println("Число должно быть в интервале (0, 100]. Попробуйте еще раз.");
                continue;
            }
            currentPlayer.addAttempt(guessNumber);
            if (guessNumber == secretNumber) {
                System.out.println(currentPlayer.getName() + ", вы угадали число " + secretNumber + " с " + currentPlayer.getAttempts().length + " попытки");
                break;
            }
            if (guessNumber < secretNumber) {
                System.out.println("Число " + guessNumber + " меньше загаданного");
            } else {
                System.out.println("Число " + guessNumber + " больше загаданного");
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }
}