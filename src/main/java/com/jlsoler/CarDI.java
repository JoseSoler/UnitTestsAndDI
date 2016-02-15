package com.jlsoler;

/**
 * Created by jlsoler on 2/15/2016.
 */
public class CarDI {

    private Engine engine;

    public CarDI(Engine engine){
        this.engine = engine;
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
