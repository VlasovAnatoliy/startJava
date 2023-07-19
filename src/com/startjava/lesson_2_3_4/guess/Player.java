package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] attempts;
    private int countAttempts;
    public static final int MAX_ATTEMPTS = 10;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, countAttempts);
    }

    public void addAttempt(int number) {
        if (countAttempts < MAX_ATTEMPTS) {
            attempts[countAttempts] = number;
            countAttempts++;
            if (countAttempts == MAX_ATTEMPTS) {
                System.out.println("У " + name + " закончились попытки");
            }
        }
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0);
        countAttempts = 0;
    }
}