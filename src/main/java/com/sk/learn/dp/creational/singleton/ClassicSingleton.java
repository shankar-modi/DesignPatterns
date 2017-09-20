package com.sk.learn.dp.creational.singleton;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class ClassicSingleton {

    private static ClassicSingleton singleton;

    private ClassicSingleton(){};

    public static ClassicSingleton getInstance(){

        if(singleton == null) {
            singleton = new ClassicSingleton();

        }
        return singleton;
    }

}
