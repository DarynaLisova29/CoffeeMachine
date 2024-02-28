package com.example.coffeemachine.model;

import android.util.Log;

public class CoffeeMachine {
    private Heater heater;
    private Pump pump;

    public CoffeeMachine(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public Heater getHeater() {
        return heater;
    }

    public void setHeater(Heater heater) {
        this.heater = heater;
    }

    public Pump getPump() {
        return pump;
    }

    public void setPump(Pump pump) {
        this.pump = pump;
    }
    public void start(){
        getHeater().on();
    }
    public void finish(){
        Log.d("Coffee Machine 12","Finish");
        getHeater().off();
    }
    public void cookedCoffee(){
        if (getHeater().isHot()) {
            getPump().pump();
            Log.d("Coffee Machine 12", "--______COOFFE______--");
        }
    }
}
