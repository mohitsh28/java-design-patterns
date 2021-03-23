package com.poc.singleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread safety.
 */
public final class Tower {

    /**
     * Static to class instance of the class.
     */
    private static final Tower INSTANCE = new Tower();

    /**
     * Private constructor so nobody can instantiate the class.
     */
    private Tower() {
    }

    /**
     * To be called by user to obtain instance of the class.
     */
    public static Tower getInstance() {
        return INSTANCE;
    }
}
