package com.sk.learn.dp.creational.builder;

/**
 * @author shankarmodi
 * 30/09/17
 *
 * Using a builder design pattern to create Computer objcet step by step.
 */
public class Computer {

    private String hdd;
    private String ram;
    private String processor;
    private boolean isWiFiEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public boolean isWiFiEnabled() {
        return isWiFiEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){

        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.isWiFiEnabled = builder.isWiFiEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;

    }


    public static class ComputerBuilder {

        private String hdd;
        private String ram;
        private String processor;
        private boolean isWiFiEnabled;
        private boolean isBluetoothEnabled;


        public ComputerBuilder hdd(String hdd){
            this.hdd = hdd;
            return  this;
        }

        public ComputerBuilder ram(String ram){
            this.ram = ram;
            return  this;
        }

        public ComputerBuilder processor(String processor){
            this.processor = processor;
            return  this;
        }

        public ComputerBuilder wiFiEnabled(boolean wiFiEnabled){
            this.isWiFiEnabled = wiFiEnabled;
            return  this;
        }

        public ComputerBuilder bluetoothEnabled(boolean bluetoothEnabled){
            this.isBluetoothEnabled = bluetoothEnabled;
            return  this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }


    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", isWiFiEnabled=" + isWiFiEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
