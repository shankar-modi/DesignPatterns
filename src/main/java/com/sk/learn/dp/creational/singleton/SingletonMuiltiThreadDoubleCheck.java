package com.sk.learn.dp.creational.singleton;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class SingletonMuiltiThreadDoubleCheck {

    private static SingletonMuiltiThreadDoubleCheck singleton;

    private SingletonMuiltiThreadDoubleCheck() {
    }

    ;

    public static SingletonMuiltiThreadDoubleCheck getInstance() {

        if (singleton == null) {

            synchronized (SingletonMuiltiThreadDoubleCheck.class) {

                if (singleton == null) {
                    singleton = new SingletonMuiltiThreadDoubleCheck();

                }
            }
        }

        return singleton;
    }

}
