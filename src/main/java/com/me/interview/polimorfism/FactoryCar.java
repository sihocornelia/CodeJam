package com.me.interview.polimorfism;

public class FactoryCar {

    public static Car getCar(String code) {
        switch (code) {
            case "1": return new AudiAFour(1);
            case "2": return new Ford();
        }
        throw new UnsupportedOperationException("no such code");
    }
}
