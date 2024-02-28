package com.example.coffeemachine.model;

import android.util.Log;

public class ElectricHeater implements Heater {
    private boolean isHeating;

    @Override
    public void on() {
        isHeating=true;
        Log.d("Coffee Machine 12","HEATING");
    }

    @Override
    public void off() {
        isHeating=false;
    }

    @Override
    public boolean isHot() {
        return isHeating;
    }
}
