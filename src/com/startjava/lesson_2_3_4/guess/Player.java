package com.startjava.lesson_2_3_4.guess;

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

    public int[] getAttempts() {
        int[] filledAttempts = new int[countAttempts];
        System.arraycopy(attempts, 0, filledAttempts, 0, countAttempts);
        return filledAttempts;
    }

    public void addAttempt(int number) {
        if (countAttempts < MAX_ATTEMPTS) {
            attempts[countAttempts] = number;
            countAttempts++;
        }
    }

    public void clearAttempts() {
        for (int i = 0; i < countAttempts; i++) {
            attempts[i] = 0;
        }
        countAttempts = 0;
    }
}