package com.poc.builder.model.attributes;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum HairType {

    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly");

    private final String title;
}
