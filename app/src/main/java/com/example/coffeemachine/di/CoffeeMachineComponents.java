package com.example.coffeemachine.di;

import com.example.coffeemachine.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
@Component(modules = {CoffeeMachineModule.class,
        HeaterModule.class,
        PumpModule.class})
public interface CoffeeMachineComponents {
    void inject(MainActivity mainActivity);

}
