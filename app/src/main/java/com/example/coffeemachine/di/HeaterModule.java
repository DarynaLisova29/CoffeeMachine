package com.example.coffeemachine.di;

import com.example.coffeemachine.model.ElectricHeater;
import com.example.coffeemachine.model.Heater;

import dagger.Module;
import dagger.Provides;

@Module
public class HeaterModule {
    @Provides
    public Heater provideHeater(){
        return new ElectricHeater();
    }
}
