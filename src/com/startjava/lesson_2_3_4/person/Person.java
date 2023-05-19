package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "Male";
    String name = "Anatoliy";
    int height = 178;
    int weight = 95;
    int age = 30;

    void move() {
        System.out.println("ходьба");
    }

    void sit() {
        System.out.println("сидеть");
    }

    void run() {
        System.out.println("бежать");
    }

    void speak() {
        System.out.println("говорить");
    }
    
    String learnJava() {
        return "учить java";
    }
}