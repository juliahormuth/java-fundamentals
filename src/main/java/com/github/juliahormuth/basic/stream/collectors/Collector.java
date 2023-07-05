package com.github.juliahormuth.basic.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);

        List<Integer> numbers2 = numbers.stream().filter(c -> c == 2).collect(Collectors.toList());

        System.out.println(numbers2);
    }
}
