package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] attempts;
    private int countAttempts;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public void addAttempt(int number) {
        if (countAttempts < MAX_ATTEMPTS) {
            attempts[countAttempts] = number;
            countAttempts++;
        }
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, countAttempts, 0);
        countAttempts = 0;
    }
}