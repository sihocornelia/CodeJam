package com.me.euler;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Problem4 {

    @Test
    public void testing() {
        List<Long> expected = new ArrayList<Long>();
        expected.add(91L);
        expected.add(99L);
        Assert.assertEquals(expected, largestpalindromemadefromtwodisgitsnumbers());
    }

    @Test
    public void testingPalindrome() {
        Assert.assertEquals(true, isPalindrom(123321));
        Assert.assertEquals(false, isPalindrom(123320));
        Assert.assertEquals(true, isPalindrom(1));
    }

    private List<Long> largestpalindromemadefromtwodisgitsnumbers() {
        TreeMap<Long, List<Long>> palindroms = new TreeMap<>();
        for(long i=999; i > 99; i--)
            for(long j=i; j > 99; j--)
                if (isPalindrom(i*j)) {
                    List<Long> expected = new ArrayList<Long>();
                    expected.add(Long.valueOf(i));
                    expected.add(Long.valueOf(j));
                    palindroms.put(Long.valueOf(i * j), expected);
                }
        System.out.println(palindroms);
        return palindroms.lastEntry().getValue();

    }

    private boolean isPalindrom(long number) {
        StringBuilder reverseNumber = new StringBuilder(Long.valueOf(number).toString()).reverse();
        return Long.valueOf(number).equals(Long.valueOf(reverseNumber.toString()));
    }

}
