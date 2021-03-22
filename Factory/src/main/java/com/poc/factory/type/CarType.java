package com.poc.factory.type;

import com.poc.factory.model.Ford;
import com.poc.factory.model.Hyundai;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CarType {

    HYUNDAI(Hyundai::new),
    FORD(Ford::new);

    private final Supplier<Car> constructor;
}
