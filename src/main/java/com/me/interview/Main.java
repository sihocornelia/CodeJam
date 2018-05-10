package com.me.interview;

import com.me.interview.immutable.Circle;
import com.me.interview.immutable.CircleBuilder;
import com.me.interview.polimorfism.Car;
import com.me.interview.polimorfism.FactoryCar;
import com.me.interview.immutable.Circle;
import com.me.interview.singleton.MyClass;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        //1
        String s = "A";
        s += "B";               //new String is created
        System.out.println(s);
        //2
        List<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        Circle c = new CircleBuilder().setRadius(1).setSurface(2).setData(new ArrayList<>()).build();
        System.out.println(c.toString());
        c.getData().add("x");
        System.out.println(c.toString());
        //3
        Rabbit r1 = new Rabbit("a");
        Rabbit r2 = new Rabbit("b");
        Rabbit r3 = new Rabbit("c");
        Map<Rabbit, Integer> map = new HashMap<Rabbit, Integer>();
        map.put(r1, 1);
        map.put(r2, 2);
        map.put(r3, 3);
        Rabbit r11 = new Rabbit("a");
        Rabbit r22 = new Rabbit("b");
        Rabbit r33 = new Rabbit("c");

        System.out.println("Map: " + map.get(r1));
        System.out.println("Map: " + map.get(r2));
        System.out.println("Map: " + map.get(r3));
        System.out.println("Map: " + map.get(r11));
        System.out.println("Map: " + map.get(r22));
        System.out.println("Map: " + map.get(r33));
        System.out.println("Map size: " + map.size());
        System.out.println("Map: " + map);
        //4
        final Car car = FactoryCar.getCar("1");
        //System.out.println(car.consume());

        //5
        Integer first = Integer.valueOf(10);
        change(first);
        System.out.println("1. " + first);//Immutable

        //6
        Rabbit rabit = new Rabbit("rabbit");
        System.out.println(rabit.getField());
        change(rabit);
        System.out.println(rabit.getField());
        change1(rabit);
        System.out.println(rabit.getField());
        change2(rabit);
        System.out.println(rabit.getField());

        //7
        int primitiva = 1;
        System.out.println("Primitiva: " + primitiva);
        changePrimitive(primitiva);
        System.out.println("Primitiva: " + primitiva);


    }

    private static void change(Integer first) {
        first = 20;
    }

    private static void change(Rabbit first) {
        first.setField("horse");
    }

    private static void change1(Rabbit first) {
        Rabbit r = first;
        r.setField("gorrila");
    }

    private static void change2(Rabbit first) {
        first = new Rabbit("of");
    }
    private static void changePrimitive(int val) {
        val = 7;
    }

}
