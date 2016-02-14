package com.jlsoler;

/**
 * Created by jlsoler on 14/02/16.
 */

public class Car {

    private Engine engine = new Engine();

    public String startCar(){

        engine.startEngine();
        return "Car started in mode " + engine.getMode();
    }



}
