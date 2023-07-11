package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] attempts;
    private int attemptsCount;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[10];
        this.attemptsCount = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attemptsCount);
    }

    public void addAttempt(int number) {
        attempts[attemptsCount] = number;
        attemptsCount++;
    }
}