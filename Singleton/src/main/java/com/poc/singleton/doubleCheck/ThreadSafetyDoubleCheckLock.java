package com.poc.singleton.doubleCheck;

public class ThreadSafetyDoubleCheckLock {

    private static volatile ThreadSafetyDoubleCheckLock instance;

    private static boolean flag = true;

    private ThreadSafetyDoubleCheckLock() {
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static ThreadSafetyDoubleCheckLock getInstance() {

        var result = instance;

        if (result == null) {
            synchronized (ThreadSafetyDoubleCheckLock.class) {
                result = instance;

                if (result == null) {
                    instance = result = new ThreadSafetyDoubleCheckLock();
                }

            }
        }
        return result;
    }


}
