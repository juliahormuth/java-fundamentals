package com.github.juliahormuth.basic;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
                // just interrupts the specific interaction
            }
            System.out.println("Dentro do programa pela" + i + "vez");
        }
        System.out.println("Sai do programa");
    }
}
