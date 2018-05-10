package com.me.pancake.flipper;

import com.me.interview.permutations.Permute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PancakeFlipper {
    public boolean startFlipping(String pancakes, int pancakeFlipperSize) {

//          if (areAllPancakesHappySide(pancakes))
//              return true;
//          else {
//              Permute.getAllPermutations();
//          }
          return false;
//        int noOfFlips = 0;
//
//        String pancakeFlipper = getPancakeFlipper(pancakeFlipperSize);
//        while (pancakes.contains(pancakeFlipper)) {
//            pancakes = pancakes.substring(0, pancakes.indexOf(pancakeFlipper)) + flip(pancakeFlipper) +
//                    pancakes.substring(pancakes.indexOf(pancakeFlipper) + pancakeFlipper.length());
//            noOfFlips++;
//
//        }
//        if (!areAllPancakesHappySide(pancakes))
//            noOfFlips = -1;
//        return noOfFlips;
    }

    private String getPancakeFlipper(int pancakeFlipperSize) {
        String pattern = "";
        for (int i = 0; i < pancakeFlipperSize; i++)
            pattern += "-";
        return pattern;
    }


    private boolean areAllPancakesBackSide(String pancakes) {
        String allBackSidePattern = "\\-+";
        if (pancakes.matches(allBackSidePattern))
            return true;
        return false;
    }

    private String flip(String pancakesToFlip) {
        List<Character> characterList = pancakesToFlip.chars().mapToObj(letter -> ((char) letter)).collect(Collectors.toList());
        for (Character c : characterList) {
            if (c.equals('-'))
                characterList.set(characterList.indexOf(c), Character.valueOf((char) '+'));
            else if (c.equals('+'))
                characterList.set(characterList.indexOf(c), Character.valueOf((char) '-'));
        }
        return characterList.stream().map(Object::toString)
                .collect(Collectors.joining(""));
    }

    private boolean areAllPancakesHappySide(String pancakes) {
        String allHappySidePattern = "\\++";
        if (pancakes.matches(allHappySidePattern))
            return true;
        return false;
    }
}
