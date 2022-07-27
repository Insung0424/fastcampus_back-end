package com.company.design.strategy;

public class Encoder {
    private Encodingstrategy encodingstrategy;

    public void setEncodingstrategy(Encodingstrategy encodingstrategy){
        this.encodingstrategy = encodingstrategy;
    }

    public String getMessage(String message){
        return this.encodingstrategy.encode(message);
    }
}
