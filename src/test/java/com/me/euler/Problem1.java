package com.me.euler;

import org.junit.Assert;
import org.junit.Test;

public class Problem1 {

    @Test
    public void testing() {
        Assert.assertEquals(0, sumOfMultipliesOfThreeAndFive(1));
        Assert.assertEquals(0, sumOfMultipliesOfThreeAndFive(3));
        Assert.assertEquals(3, sumOfMultipliesOfThreeAndFive(4));
        Assert.assertEquals(3, sumOfMultipliesOfThreeAndFive(5));
        Assert.assertEquals(8, sumOfMultipliesOfThreeAndFive(6));
        Assert.assertEquals(23, sumOfMultipliesOfThreeAndFive(10));
        Assert.assertEquals(23, sumOfMultipliesOfThreeAndFive(1000));
    }

    private int sumOfMultipliesOfThreeAndFive(int number) {
        int sum = 0;
        for(int index=1; index < number; index++) {
            if ((index % 3 == 0) || (index % 5 == 0))
                sum += index;
        }
        return sum;
    }
}
