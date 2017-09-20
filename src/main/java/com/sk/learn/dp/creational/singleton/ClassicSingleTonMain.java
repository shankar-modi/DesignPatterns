package com.sk.learn.dp.creational.singleton;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class ClassicSingleTonMain {

    public static void main(String[] args) {
        //new ClassicSingleton()();  We can not create ClasssicSingleton
        // class object , coz constructor have private access.

        ClassicSingleton s1 = ClassicSingleton.getInstance();
        ClassicSingleton s2 = ClassicSingleton.getInstance();

        System.out.println("Is it singleton object ? : " + (s1 == s2));
    }
}
