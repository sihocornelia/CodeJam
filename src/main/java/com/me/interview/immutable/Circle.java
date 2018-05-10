package com.me.interview.immutable;

import java.util.ArrayList;
import java.util.List;

//5. prevents methods from being overriden, but restricts usability
//we can remove final and make it package protected and accessible through Builder class
public class Circle {
    //2. make fields private final
    private final double radius;
    private final double surface;
    private final List<String> data;

    //1.use constructor to set properties
    Circle(double r, double s, List<String> d) {
        this.radius = r;
        this.surface = s;
        data = new ArrayList<>(d);  //4. assign a new object to the mutable fields
    }

    //3. do not provide setters
    public double getRadius() {
        return radius;
    }

    public double getSurface() {
        return surface;
    }

    //4. prevents referenced mutable objects to be changed
    public List<String> getData() {
        //return data;
        return new ArrayList<>(data);   //to prevent making the class mutable
    }

    @Override
    public String toString() {
        return "Circle{" +
                "data=" + data +
                '}';
    }
}
