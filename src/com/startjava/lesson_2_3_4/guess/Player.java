package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
}
