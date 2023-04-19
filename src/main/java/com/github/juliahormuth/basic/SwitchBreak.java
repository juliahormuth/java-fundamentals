package com.github.juliahormuth.basic;

public class SwitchBreak {
    public static void main(String[] args) {

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            // with the break, the program doesn't into the next case
            case 2:
                System.out.println("Sunday");
                break;
        }

        // go to here
        System.out.println("Program finished");

    }
}
