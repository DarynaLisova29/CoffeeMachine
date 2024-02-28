package com.example.coffeemachine.model;

import android.util.Log;

import javax.inject.Inject;

public class Thermosiphone implements Pump{
    @Override
    public void pump() {

        Log.d("Coffee Machine 12","PUMPING");

    }
}
