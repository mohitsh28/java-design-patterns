package com.poc.factory;

import com.poc.factory.type.Car;
import com.poc.factory.type.CarType;

/**
 * Factory method takes as parameter a car type and initiate the appropriate class.
 */
public class CarFactory {

    public static Car getCar(CarType carType) {
        return carType.getConstructor().get();
    }

}
