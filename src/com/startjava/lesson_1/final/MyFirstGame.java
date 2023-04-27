package com.startjava.lesson_1.final_folder;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра 'Угадай число'");
        int secretNumber = 46;
        for (int guessNumber = 1; guessNumber <= 100; guessNumber++) {
            if (guessNumber == secretNumber) {
                System.out.println("Вы победили!");
                break;
            } else if (guessNumber < secretNumber) {
                System.out.println("Число " + guessNumber + " меньше загаданного");
            } else {
                System.out.println("Число " + guessNumber + " больше загаданного");
            }
        }
    }
}