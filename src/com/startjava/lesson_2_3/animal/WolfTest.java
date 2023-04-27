package com.startjava.lesson_2_3.animal;

import com.startjava.lesson_2_3.animal.Wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Male");
        wolf.setName("Shelton");
        wolf.setWeight(15);
        wolf.setAge(5);
        wolf.setColor("Grey");
        System.out.println("Имя волка: " + wolf.getName());
        System.out.println("Пол волка: " + wolf.getGender());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Цвет волка: " + wolf.getColor());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}