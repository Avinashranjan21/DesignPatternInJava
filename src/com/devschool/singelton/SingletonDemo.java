package com.devschool.singelton;

/**
 * Created by avinash.ranjan on 26/08/17.
 */
public class SingletonDemo {

    private static SingletonDemo instance = null;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }


}
