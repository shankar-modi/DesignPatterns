package com.sk.learn.dp.creational.singleton;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class SingletonMuiltiThread {

    private static SingletonMuiltiThread singleton;

    private SingletonMuiltiThread(){};

    public static synchronized  SingletonMuiltiThread getInstance(){

        /**
         * Here this object creation code is critical but all the thread has to wait to call this method bcoz it is synchronized.
         * So there will be a performance issue.
         */
        if(singleton == null) {
            singleton = new SingletonMuiltiThread();

        }
        return singleton;
    }

}
