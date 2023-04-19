package com.github.juliahormuth.basic;

public class Foreach {

    public static void main(String[] args) {
        double[] notes = { 9.9, 8.7, 7.2, 9.4 };

        for (double note : notes) {
            if (note != 9.9) {
                System.out.println(note);
            }
        }
    }

}
