package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
            scanner.nextLine(); // Очистка входного буфера
            if (guessNumber <= 0 || guessNumber > 100) {
                System.out.println("Число должно быть в интервале (0, 100]. Попробуйте еще раз.");
                continue;
            }
            currentPlayer.addAttempt(guessNumber);
            if (guessNumber == secretNumber) {
                System.out.println(currentPlayer.getName() + ", вы угадали число " + secretNumber + " с "
                        + currentPlayer.getAttempts().length + " попытки");
                break;
            }
            if (player1.getAttempts().length == Player.MAX_ATTEMPTS
                    && player2.getAttempts().length == Player.MAX_ATTEMPTS) {
                System.out.println("У обоих игроков закончились попытки.");
                String answer;
                do {
                    System.out.print("Хотите начать новую игру? [yes/no]: ");
                    answer = scanner.nextLine();
                } while (!answer.equals("yes") && !answer.equals("no"));

                if (answer.equals("yes")) {
                    restartGame();
                    currentPlayer = player1;
                    continue;
                } else {
                    break;
                }
            }
            if (guessNumber < secretNumber) {
                System.out.println("Число " + guessNumber + " меньше загаданного");
            } else {
                System.out.println("Число " + guessNumber + " больше загаданного");
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println("Названные числа игроками:");
        displayAttempts(player1);
        displayAttempts(player2);
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }

    private static void displayAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.println(player.getName() + ": " + Arrays.toString(attempts));
    }

    public void restartGame() {
        player1.clearAttempts();
        player2.clearAttempts();
        generateSecretNumber();
    }
}