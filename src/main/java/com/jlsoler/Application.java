package com.jlsoler;

/**
 * Created by jlsoler on 14/02/16.
 */
public class Application {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.startCar());
        System.out.println(myCar.accelerate());
        System.out.println(myCar.deccelerate());
        System.out.println(myCar.stopCar());

    }
}
