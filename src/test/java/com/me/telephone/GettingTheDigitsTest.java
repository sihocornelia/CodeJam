package com.me.telephone;

import com.me.telephone.GettingTheDigits;
import com.me.telephone.SlippedNote;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class GettingTheDigitsTest {

    GettingTheDigits gettingTheDigits;

    @Before
    public void init() {
        gettingTheDigits = new GettingTheDigits();
    }

    @Ignore
    @Test
    @FileParameters("src/test/resources/A-small-practice.csv")
    public void testFromFile(String slippedNote) {
        Assert.assertEquals("0", gettingTheDigits.findOutTelephone(slippedNote));
    }


    @Test
    public void correctOrderOneDigit() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 0", gettingTheDigits.findOutTelephone("ZERO"));
    }


    @Test
    public void correctOrderTwoDigit() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 01", gettingTheDigits.findOutTelephone("ZEROONE"));
    }


    @Test
    public void findOutTelephone_1() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 012", gettingTheDigits.findOutTelephone("OZONETOWER"));
    }


    @Test
    public void findOutTelephone_2() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 2468", gettingTheDigits.findOutTelephone("WEIGHFOXTOURIST"));
    }


    @Test
    public void findOutTelephone_3() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 114", gettingTheDigits.findOutTelephone("OURNEONFOE"));
    }


    @Test
    public void findOutTelephone_4() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 3", gettingTheDigits.findOutTelephone("ETHER"));
    }


    @Test
    public void findOutTelephone_5() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 08", gettingTheDigits.findOutTelephone("OEIHGERTZ"));
    }


    @Test
    public void findOutTelephone_6() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 4567", gettingTheDigits.findOutTelephone("EIVEOUXISEFNRFSV"));
    }


    @Test
    public void findOutTelephone_7() {
        GettingTheDigits gettingTheDigits = new GettingTheDigits();
        Assert.assertEquals("Case #" + gettingTheDigits.CASE_NO + ": 29", gettingTheDigits.findOutTelephone("NWETNOI"));
    }


    @Test
    public void test_patterns() {
        Assert.assertEquals("(.*)(E{1})(.*)(N{1})(.*)(O{1})(.*)", SlippedNote.getPatternFromString("ONE"));
    }


    @Test
    public void sort_letters_within_word() {
        Assert.assertEquals("EEEFFIINORSSUVVX", SlippedNote.sortLettersWithinWord("EIVEOUXISEFNRFSV"));
    }

    @Ignore
    @Test
    public void pattern_from_word() {
        String efiv = SlippedNote.getPatternFromString("EFIV");
        System.out.println(efiv);
        String efiv1 = SlippedNote.getReplacePatternFromString("EFIV");
        System.out.println(efiv1);
        Assert.assertEquals("", "EEFFIIRSSUVVX".replaceAll(efiv, efiv1));
    }

    @Ignore
    @Test
    public void test_match() {
        //Assert.assertTrue(SlippedNote.sortLettersWithinWord("ONE").matches(SlippedNote.getPatternFromString("ONE")));
    }


}


//    Input
//
//            Output
//
//4
//        OZONETOWER
//        WEIGHFOXTOURIST
//        OURNEONFOE
//        ETHER
//
//        Case #1: 012
//        Case #2: 2468
//        Case #3: 114
//        Case #4: 3

