package com.example.coffeemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coffeemachine.di.CoffeeMachineComponents;
import com.example.coffeemachine.model.App;
import com.example.coffeemachine.model.CoffeeMachine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    CoffeeMachine coffeeMachine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.coffeeMachineComponents.inject(this);
        setContentView(R.layout.activity_main);
        coffeeMachine.start();
        coffeeMachine.cookedCoffee();
        coffeeMachine.finish();


    }
}