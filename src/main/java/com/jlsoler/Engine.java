package com.jlsoler;

/**
 * Created by jlsoler on 14/02/16.
 */
public class Engine {

    public enum STATES {OFF, ON, SAVING, FULL}

    private STATES engine_state = STATES.OFF;

    public void startEngine() {
        if (engine_state == STATES.OFF) {
            this.engine_state = STATES.ON;
        } else {
            throw new RuntimeException("Unexpected engine state.");
        }
    }

    public void stopEngine() {
        if (engine_state != STATES.FULL) {
            this.engine_state = STATES.OFF;
        } else {
            throw new RuntimeException("Unexpected engine state.");
        }
    }

    public void saveFuel() {
        if (engine_state != STATES.OFF) {
            this.engine_state = STATES.SAVING;
        } else {
            throw new RuntimeException("Unexpected engine state.");
        }

    }

    public void fullPerformance() {
        if (engine_state != STATES.OFF) {
            this.engine_state = STATES.FULL;
        } else {
            throw new RuntimeException("Unexpected engine state.");
        }
    }

    public STATES getMode() {
        return engine_state;
    }

}
