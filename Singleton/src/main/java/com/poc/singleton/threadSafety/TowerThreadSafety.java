package com.poc.singleton.threadSafety;

/**
 * Thread-safe Singleton class. The instance is lazily initialized and thus needs synchronization mechanism.
 */
public class TowerThreadSafety {

    private static volatile TowerThreadSafety instance;

    private TowerThreadSafety() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already Initialized.");
        }
    }

    public static synchronized TowerThreadSafety getInstance() {
        if (instance == null) {
            synchronized (TowerThreadSafety.class) {
                if (instance == null) {
                    instance = new TowerThreadSafety();
                }
            }
        }
        return instance;
    }
}
