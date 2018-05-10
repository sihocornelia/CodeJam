package com.me.interview.singleton;

public class MyClass {

    private static final MyClass myobj = new MyClass();

    private MyClass() {
    }

    public static MyClass getInstance() {
        return myobj;
    }
}
