package com.example.coffeemachine.di;

import com.example.coffeemachine.model.ElectricHeater;
import com.example.coffeemachine.model.Heater;
import com.example.coffeemachine.model.Pump;
import com.example.coffeemachine.model.Thermosiphone;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PumpModule {
    @Provides
    public Pump providePump(){
        return new Thermosiphone();
    }
}
