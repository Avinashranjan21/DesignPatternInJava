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


    }
}
