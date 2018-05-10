package com.me.interview.immutable;

import java.util.List;

public class CircleBuilder {

    private double radius;
    private double surface;
    private List<String> data;

    public CircleBuilder setData(List<String> data) {
        this.data = data;
        return this;
    }

    public CircleBuilder setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public CircleBuilder setSurface(double surface) {
        this.surface = surface;
        return this;
    }

    public Circle build() {
        return new Circle(radius, surface, data);
    }
}
