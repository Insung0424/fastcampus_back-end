package com.company.design.strategy;

public class AppendStrategy implements Encodingstrategy{
    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}
