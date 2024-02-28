package com.example.coffeemachine.model;

import static com.example.coffeemachine.di.DaggerCoffeeMachineComponents.builder;

import android.app.Application;

import com.example.coffeemachine.di.CoffeeMachineComponents;
import com.example.coffeemachine.di.CoffeeMachineModule;
import com.example.coffeemachine.di.DaggerCoffeeMachineComponents;


public class App extends Application {
    public static CoffeeMachineComponents coffeeMachineComponents;


    @Override
    public void onCreate() {
        super.onCreate();
        coffeeMachineComponents= DaggerCoffeeMachineComponents.builder()
                .coffeeMachineModule(new CoffeeMachineModule()).build();
    }
}
