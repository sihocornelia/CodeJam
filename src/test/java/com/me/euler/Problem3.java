package com.me.euler;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    @Test
    public void testing() {
        List<Long> expected = new ArrayList<Long>();
        expected.add(2L);
        expected.add(3L);
        Assert.assertEquals(expected, primeFactors(6));
        expected.clear();
        expected.add(3L);
        expected.add(7L);
        expected.add(7L);
        Assert.assertEquals(expected, primeFactors(147));
        expected.clear();
        expected.add(17L);
        Assert.assertEquals(expected, primeFactors(17));
        expected.clear();
        expected.add(2L);
        expected.add(3L);
        expected.add(3L);
        expected.add(5L);
        Assert.assertEquals(expected, primeFactors(90));
        expected.clear();
        Assert.assertEquals(expected, primeFactors(600851475143L));
    }

    private List<Long> primeFactors(long value) {
        List<Long> results = new ArrayList<Long>();
        long index = 2;
        while(index < value) {
            if (prime(index) && (value % index == 0)) {
                results.add(Long.valueOf(index));
                value = value /index;
                index = 2;
                continue;
            }
            index++;
        }
        if (value != 1)
            results.add(value);
        return results;
    }

    private boolean prime(long number) {
        for(int i=2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
