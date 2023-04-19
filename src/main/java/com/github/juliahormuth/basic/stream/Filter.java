package com.github.juliahormuth.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);

        Stream<Integer> stream = numbers.stream().filter(c -> c == 2);

    }
}
