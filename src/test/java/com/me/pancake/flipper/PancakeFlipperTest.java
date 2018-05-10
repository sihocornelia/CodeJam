package com.me.pancake.flipper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PancakeFlipperTest {

    PancakeFlipper pancakeFlipper;

    @Before
    public void init() {
        pancakeFlipper = new PancakeFlipper();
    }

    @Test
    public void all_pancake_happy_side_pancake_flipper_size_does_not_count() {
        assertEquals(0, pancakeFlipper.startFlipping("+", 1));
        assertEquals(0, pancakeFlipper.startFlipping("++", 1));
        assertEquals(0, pancakeFlipper.startFlipping("++", 2));
        assertEquals(0, pancakeFlipper.startFlipping("+", 2));
    }

    @Test
    public void all_pancakes_back_side() {
        assertEquals(1, pancakeFlipper.startFlipping("-", 1));
        assertEquals(2, pancakeFlipper.startFlipping("--", 1));
        assertEquals(-1, pancakeFlipper.startFlipping("-", 2));
        assertEquals(1, pancakeFlipper.startFlipping("--", 2));
        assertEquals(-1, pancakeFlipper.startFlipping("---", 2));
        assertEquals(2, pancakeFlipper.startFlipping("----", 2));
    }

    @Test
    public void pancake_flipper_size_is_one() {
        assertEquals(1, pancakeFlipper.startFlipping("-+", 1));
        assertEquals(1, pancakeFlipper.startFlipping("+-", 1));
        assertEquals(2, pancakeFlipper.startFlipping("+-+-", 1));
        assertEquals(2, pancakeFlipper.startFlipping("+--+", 1));
        assertEquals(7, pancakeFlipper.startFlipping("+--+++---+-+-", 1));
    }

    @Test
    public void pancake_grouped_sides_pancake_flipper_size_higher_than_one() {
        assertEquals(1, pancakeFlipper.startFlipping("--++", 2));
        assertEquals(3, pancakeFlipper.startFlipping("--++----", 2));

    }

    @Test
    public void pancake_ungrouped_sides_pancake_flipper_size_higher_than_one() {
        assertEquals(2, pancakeFlipper.startFlipping("-+-", 2));
        assertEquals(-1, pancakeFlipper.startFlipping("-++----", 2));
    }

    @Ignore
    @Test
    public void pancakes_grouped_sides_test_should_flip_only_back_side() {
        assertEquals(1, pancakeFlipper.startFlipping("----++++", 4));
        assertEquals(1, pancakeFlipper.startFlipping("++++----", 4));
        assertEquals(1, pancakeFlipper.startFlipping("++----++", 4));
        assertEquals(2, pancakeFlipper.startFlipping("----++++----", 4));
        assertEquals(2, pancakeFlipper.startFlipping("++++--------", 4));
        assertEquals(2, pancakeFlipper.startFlipping("--------++++", 4));
    }

    @Ignore
    @Test
    public void pancakes_grouped_sides_lower_than_size_impossible_job() {
        assertEquals(-1, pancakeFlipper.startFlipping("--++++", 4));
    }

    @Ignore
    @Test
    public void testing() {
        assertEquals(2, pancakeFlipper.startFlipping("--++--", 4));
    }


}
