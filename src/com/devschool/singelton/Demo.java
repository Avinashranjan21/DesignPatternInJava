package com.devschool.singelton;

/**
 * Created by avinash.ranjan on 26/08/17.
 */
public class Demo {
    public static void main(String[] args) {

        SingletonDemo mSingletonDemo = SingletonDemo.getInstance();
        SingletonDemo mSingletonDemo2 = SingletonDemo.getInstance();

        System.out.println("object 1 : "+mSingletonDemo);
        System.out.println("object 2 : "+mSingletonDemo2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo mSingletonDemo3 = SingletonDemo.getInstance();
                System.out.println("object 3 : "+mSingletonDemo3);
            }
        }).run();

    }
}

/* Sample output:
    object 1 : com.devschool.singelton.SingletonDemo@511d50c0
    object 2 : com.devschool.singelton.SingletonDemo@511d50c0
    object 3 : com.devschool.singelton.SingletonDemo@511d50c0
 */
