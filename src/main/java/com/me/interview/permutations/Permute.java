package com.me.interview.permutations;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permute {

    public static String[] getAllPermutations(String s) {
        Set<String> set = new HashSet<>();
        set.add("");
        return (String[])permutations(s, set);
    }

    private static Object[] permutations(String s, Set<String> set) {
        if (s != null && !s.equals("")) {
            Character chr =  s.toCharArray()[0];
            Set<String> newSet = new HashSet<>();
            for (String possiblePerm : set) {
                for(int j=0; j<=possiblePerm.length(); j++) {
                    newSet.add(possiblePerm.substring(0, j) + chr.toString() + possiblePerm.substring(j, possiblePerm.length()));
                }
            }
            return permutations(s.substring(1), newSet);
        }
        else {
            List<String> collect = set.stream().collect(Collectors.toList());
            Collections.sort(collect);
            System.out.println(collect);
            return collect.toArray();
        }
    }
}
