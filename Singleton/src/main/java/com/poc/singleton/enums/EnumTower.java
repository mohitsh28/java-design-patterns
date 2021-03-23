package com.poc.singleton.enums;

public enum EnumTower {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
