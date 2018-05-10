package com.me.permutations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationsTest {

    Set<String> set;
    @Before
    public void inint() {
        set = new HashSet<>();
        set.add("");
    }

//    @Test
//    public void permutation_zero_length_string() {
//        String[] result = {""};
//        Assert.assertArrayEquals(result, permutations("", set));
//    }
//
//    @Test
//    public void permutation_null_string() {
//        String[] result = {""};
//        Assert.assertArrayEquals(result, permutations(null, set));
//    }
//
//    @Test
//    public void permutation_one_length_string() {
//        String[] result = {"s"};
//        Assert.assertArrayEquals(result, permutations("s", set));
//    }
//
//    @Test
//    public void permutation_two_character_length_string() {
//        String[] result = {"ab", "ba"};
//        Assert.assertArrayEquals(result, permutations("ab", set));
//    }
//
//    @Test
//    public void permutation_three_character_length_string() {
//        String[] array = {"abc",  "acb", "bac", "bca", "cab", "cba"} ;
//        Assert.assertArrayEquals(array, permutations("abc", set));
//    }
//
//    @Test
//    public void permutation_four_character_length_string() {
//        String[] array = {"abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac"
//                , "bdca", "cabd", "cadb", "cbad", "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba"} ;
//        Assert.assertArrayEquals(array, permutations("abcd", set));
//    }


}
