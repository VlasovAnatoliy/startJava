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
        restartGame();
        generateSecretNumber();
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        while (true) {
            int guessNumber = inputNumber(scanner, currentPlayer);
            currentPlayer.addAttempt(guessNumber);
            if (isGuessCorrect(guessNumber)) {
                displayWinMessage(currentPlayer);
                break;
            }
            if (isAttemptsOver(player1) && isAttemptsOver(player2)) {
                System.out.println("У обоих игроков закончились попытки.");
                break;
            }
            compareNumber(guessNumber, currentPlayer);
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        displayGameResults();
    }

    private void displayWinMessage(Player player) {
        System.out.println(player.getName() + ", вы угадали число " + secretNumber + " с "
                + player.getAttempts().length + " попытки");
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * MAX_NUMBER) + 1;
    }

    private int inputNumber(Scanner scanner, Player currentPlayer) {
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

    private boolean isGuessCorrect(int guessNumber) {
        return guessNumber == secretNumber;
    }

    private boolean isAttemptsOver(Player player) {
        return player.getAttempts().length == Player.MAX_ATTEMPTS;
    }

    private void compareNumber(int guessNumber, Player currentPlayer) {
        if (guessNumber == secretNumber) {
            System.out.println("Вы угадали число " + secretNumber + " с " +
                    currentPlayer.getCountAttempts() + " попытки");
        } else if (guessNumber < secretNumber) {
            System.out.println("Число " + guessNumber + " меньше загаданного");
        } else {
            System.out.println("Число " + guessNumber + " больше загаданного");
        }
    }

    private static void displayAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ": ");
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }

    private void displayGameResults() {
        System.out.println("Игра окончена.");
        System.out.println("Названные числа игроками:");
        displayAttempts(player1);
        displayAttempts(player2);
    }

    public void restartGame() {
        player1.clearAttempts();
        player2.clearAttempts();
        generateSecretNumber();
    }
}