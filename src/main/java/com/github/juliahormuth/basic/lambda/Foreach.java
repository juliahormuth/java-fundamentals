package com.github.juliahormuth.basic.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Foreach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);

        ArrayList<Integer> doubleNumbers = new ArrayList<Integer>();

        numbers.forEach((n) -> {
            n = n * 2;
            doubleNumbers.add(n);
        });

        System.out.println(numbers);
        System.out.println(doubleNumbers);
    }
}
