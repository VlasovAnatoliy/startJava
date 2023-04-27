package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;

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

            if (guessNumber == secretNumber) {
                System.out.println(currentPlayer.getName() + ", вы угадали!");
                currentPlayer.setGuess(secretNumber);
                break;
            }

            if (guessNumber < secretNumber) {
                System.out.println("Число " + guessNumber + " меньше загаданного");
            } else {
                System.out.println("Число " + guessNumber + " больше загаданного");
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }
}