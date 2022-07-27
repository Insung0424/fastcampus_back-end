package com.company.design.strategy;

public class NormalStrategy implements Encodingstrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
