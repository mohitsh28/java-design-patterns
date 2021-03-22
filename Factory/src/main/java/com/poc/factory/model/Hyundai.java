package com.poc.factory.model;

import com.poc.factory.type.Car;

public class Hyundai implements Car {
    @Override
    public String getSpecs() {
        return "We have a Hyundai here.";
    }
}
