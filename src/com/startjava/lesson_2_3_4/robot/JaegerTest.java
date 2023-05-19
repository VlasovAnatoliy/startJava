package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.25f);
        jaeger1.setWeight(1980f);
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        System.out.println("Gipsy Avenger: \nМодель: " + jaeger1.getModelName() 
                + "\nМарка: " + jaeger1.getMark() 
                + "\nСтрана производитель: " + jaeger1.getOrigin() 
                + "\nВысота: " + jaeger1.getHeight() + " m" 
                + "\nВес: " + jaeger1.getWeight() + " t" 
                + "\nСкорость: " + jaeger1.getSpeed() + " km/h" 
                + "\nСила: " + jaeger1.getStrength() + " tons" 
                + "\nБроня: " + jaeger1.getArmor());

        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1850f, 10, 10, 9);

        System.out.println("\nJaeger 2:" 
                + "\nМодель: " + jaeger2.getModelName() 
                + "\nМарка: " + jaeger2.getMark() + ","
                + "\nСтрана производитель: " + jaeger2.getOrigin()
                + "\nВысота: " + jaeger2.getHeight() + " meters"
                + "\nВес: " + jaeger2.getWeight() + " tons"
                + "\nСкорость: " + jaeger2.getSpeed() + " km/h"
                + "\nСила: " + jaeger2.getStrength() + " tons"
                + "\nБроня: " + jaeger2.getArmor());
    }
}