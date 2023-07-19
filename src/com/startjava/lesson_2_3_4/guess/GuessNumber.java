package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private static final int MAX_NUMBER = 100;
    private final Player player1;
    private final Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        generateSecretNumber();
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        while (true) {
            int guessNumber = readNumber(scanner, currentPlayer);
            currentPlayer.addAttempt(guessNumber);
            if (guessNumber == secretNumber) {
                System.out.println(currentPlayer.getName() + ", вы угадали число " + secretNumber + " с "
                        + currentPlayer.getAttempts().length + " попытки");
                break;
            }
            if (player1.getAttempts().length == Player.MAX_ATTEMPTS
                    && player2.getAttempts().length == Player.MAX_ATTEMPTS) {
                System.out.println("У обоих игроков закончились попытки.");
                break;
            }
            if (guessNumber < secretNumber) {
                System.out.println("Число " + guessNumber + " меньше загаданного");
            } else {
                System.out.println("Число " + guessNumber + " больше загаданного");
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println("Игра окончена.");
        System.out.println("Названные числа игроками:");
        displayAttempts(player1);
        displayAttempts(player2);
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * MAX_NUMBER) + 1;
    }

    private int readNumber(Scanner scanner, Player currentPlayer) {
        int number;
        do {
            System.out.print(currentPlayer.getName() + ", введите число от 1 до " + MAX_NUMBER + ": ");
            number = scanner.nextInt();
            scanner.nextLine();
            if (number <= 0 || number > MAX_NUMBER) {
                System.out.println("Число должно быть в интервале (0, " + MAX_NUMBER + "]. Попробуйте еще раз.");
            }
        } while (number <= 0 || number > MAX_NUMBER);
        return number;
    }



    private static void displayAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ": ");
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }

    public void restartGame() {
        player1.clearAttempts();
        player2.clearAttempts();
        generateSecretNumber();
    }
}