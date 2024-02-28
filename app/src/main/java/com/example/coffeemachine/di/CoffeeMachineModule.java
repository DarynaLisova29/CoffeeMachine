package com.example.coffeemachine.di;

import com.example.coffeemachine.model.CoffeeMachine;
import com.example.coffeemachine.model.Heater;
import com.example.coffeemachine.model.Pump;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMachineModule {
    @Provides
    public CoffeeMachine provideCoffeeMachine(Heater heater, Pump pump){
        return new CoffeeMachine(heater, pump);
    }
}
