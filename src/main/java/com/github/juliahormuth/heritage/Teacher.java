package com.github.juliahormuth.heritage;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateLiquidSalary() {
        return 0;
    }
}
