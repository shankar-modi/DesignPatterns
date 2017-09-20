package com.sk.learn.dp.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class SingleTonMultiThreadedMainDoubleCheck {

    public static void main(String[] args) throws InterruptedException {
        //new ClassicSingleton()();  We can not create ClasssicSingleton
        // class object , coz constructor have private access.

        List<SingletonMuiltiThreadDoubleCheck> list = new ArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            service.submit(new Task(list));
        }

        service.shutdown();

        Thread.sleep(1000);
        for (SingletonMuiltiThreadDoubleCheck s : list) {

            System.out.println(s);

        }
        System.out.println(list.size());


    }


    static class Task implements Runnable {

        List<SingletonMuiltiThreadDoubleCheck> list;

        public Task(List<SingletonMuiltiThreadDoubleCheck> list) {
            this.list = list;

        }

        @Override
        public void run() {
            System.out.println("Callling thread");
            list.add(SingletonMuiltiThreadDoubleCheck.getInstance());
        }
    }
}



