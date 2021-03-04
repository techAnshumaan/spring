package com.sriman.spring.core.di.bean;


public class Robot {
    Motor motor;

    //const parameter -> ConstINJ
    public Robot(Motor motor) {
        this.motor = motor;
    }

    public void startUp(){
        motor.boot();
    }

}
