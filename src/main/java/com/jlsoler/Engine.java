package com.jlsoler;

/**
 * Created by jlsoler on 14/02/16.
 */
public class Engine {

    private String mode = "OFF";

    public void startEngine() {
        this.mode = "STARTED";
    }

    public void stopEngine() {
        this.mode = "STOPPED";
    }

    public void saveFuel() {
        this.mode = "SAVING";
    }

    public String getMode() {
        return mode;
    }

}
