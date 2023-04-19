package com.github.juliahormuth.constructor;

enum Color {
    Write,
    Black,
    Red
}

public class Car {
    String brand;
    Integer year;
    Motor motor;
    Color color;

    Car() {
        System.out.println("calling contructor");
    }

    Car(String brand, Integer year, Color color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        System.out.println("calling contructor with parameters");
    }
}