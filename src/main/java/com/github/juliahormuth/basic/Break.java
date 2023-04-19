package com.github.juliahormuth.basic;

public class Break {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println(i);
                break;
                // with break, the program go out to the for
            }
        }

        System.out.println("DONE");
    }

}
