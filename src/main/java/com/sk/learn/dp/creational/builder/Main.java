package com.sk.learn.dp.creational.builder;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class Main {

    public static void main(String[] args) {

        //using builder pattern to create Computer Object step by step

        Computer computer = new Computer.ComputerBuilder().hdd("500 GB")
                                        .ram("4 GB")
                                        .processor("Intel")
                                        .wiFiEnabled(false)
                                        .bluetoothEnabled(true)
                                        .build();

        System.out.println(computer);
    }
}
