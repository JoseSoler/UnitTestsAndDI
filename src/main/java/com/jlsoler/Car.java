package com.jlsoler;

/**
 * Created by jlsoler on 14/02/16.
 */

public class Car {

    private Engine engine;

    public Car(){
        engine = new Engine();
    }

    public String startCar(){
        engine.startEngine();
        return "Car in mode: " + engine.getMode();
    }

    public String stopCar(){
        engine.stopEngine();
        return "Car in mode: " + engine.getMode();
    }

    public String accelerate(){
        engine.fullPerformance();
        return "Car operating in: " + engine.getMode();
    }

    public String deccelerate(){
        engine.saveFuel();
        return "Car operating in: " + engine.getMode();
    }


}
