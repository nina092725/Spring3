package com.example.demo.domain;

public class Car {
    private int speed;
    private String name;
    private int gas;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGas() {
        return gas;
    }
    public void setGas(int gas) {
        this.gas = gas;
    }

    public Car(){}

    public Car(int speed, String name, int gas){
        this.speed=speed;
        this.name=name;
        this.gas=gas;

    }
    

}
