package com.example.coffeemachine.model;
//нагрівач
public interface Heater {
    void on();
    void off();
    boolean isHot();
}
