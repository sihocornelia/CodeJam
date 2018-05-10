package com.me.interview.singleton;

public class MyClassWrapper {

    private static final MyClass field = new MyClass();

    public MyClass getInstanceOfMyClass() {
        return field;
    }

}
