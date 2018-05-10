package com.me.euler;

import org.junit.Assert;
import org.junit.Test;

public class Problem2 {

    @Test
    public void testing() {
//        Assert.assertEquals(2, sum_of_odd_from_fibonnaci( 3));
//        Assert.assertEquals(2, sum_of_odd_from_fibonnaci( 7));
//        Assert.assertEquals(10, sum_of_odd_from_fibonnaci( 8));
//        Assert.assertEquals(44, sum_of_odd_from_fibonnaci( 50));
//        Assert.assertEquals(188, sum_of_odd_from_fibonnaci( 150));
//        Assert.assertEquals(188, sum_of_odd_from_fibonnaci( 600));
//        Assert.assertEquals(798, sum_of_odd_from_fibonnaci( 610));
        Assert.assertEquals(44, sum_of_odd_from_fibonnaci( 4000000L));
    }

    private long sum_of_odd_from_fibonnaci(long limit) {
        long sum = 0;
        long start = 1;
        long end = 2;
        while(end <= limit) {
            if (end % 2 == 0) {
                sum += end;
                System.out.println(" " + end);
            }
            long start_val = start;
            start = end;
            end += start_val;

        }
        return sum;
    }
}
