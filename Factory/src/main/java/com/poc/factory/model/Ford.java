package com.poc.factory.model;

import com.poc.factory.type.Car;

public class Ford implements Car {
    @Override
    public String getSpecs() {
        return "This is a Ford.";
    }
}
