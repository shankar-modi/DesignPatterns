package com.sk.learn.dp.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shankarmodi
 * 20/09/17
 */
public class ClassicSingleTonMultiThreadedMain {

    public static void main(String[] args) throws InterruptedException {
        //new ClassicSingleton()();  We can not create ClasssicSingleton
        // class object , coz constructor have private access.

        List<ClassicSingleton> list = new ArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            service.submit(new Task(list));
        }

        service.shutdown();

        Thread.sleep(1000);
        for (ClassicSingleton s : list) {

            System.out.println(s);

        }
        System.out.println(list.size());

        /**
         * com.sk.learn.dp.creational.singleton.ClassicSingleton@2b193f2d ---- Object 1
         com.sk.learn.dp.creational.singleton.ClassicSingleton@355da254  ------ Object 2
         com.sk.learn.dp.creational.singleton.ClassicSingleton@355da254
         com.sk.learn.dp.creational.singleton.ClassicSingleton@355da254

         In Multi threading environment classic singleton class may end up wtih creating more than one object.
         */

    }


    static class Task implements Runnable {

        List<ClassicSingleton> list;

        public Task(List<ClassicSingleton> list) {
            this.list = list;

        }

        @Override
        public void run() {
            System.out.println("Callling thread");
            list.add(ClassicSingleton.getInstance());
        }
    }
}



