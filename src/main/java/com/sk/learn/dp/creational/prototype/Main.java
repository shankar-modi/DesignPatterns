package com.sk.learn.dp.creational.prototype;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        Shop a = new Shop();
        a.setShopName("Shop A");
        a.loadData();;

        Shop b = (Shop)a.clone();
        b.setShopName("Shop B");

        a.getBooks().remove(1);

        System.out.println(a);
        System.out.println(b);
    }
}
