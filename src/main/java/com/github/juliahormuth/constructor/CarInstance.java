package com.github.juliahormuth.constructor;

public class CarInstance {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Ford";
        car.color = Color.Write;
        car.year = 1989;
        car.motor = new Motor();
        car.motor.brand = "Brand Example";
        car.motor.serial = 39284934;

        System.out.println(car.brand);

        Car car2 = new Car("Volkswagen", 2000, Color.Red);

        System.out.println(car2.brand);

    }
}
