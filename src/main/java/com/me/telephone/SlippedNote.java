package com.me.telephone;

import java.util.Arrays;

class SlippedNote {

    private final String note;
    private String workOnNote;
    private StringBuffer decodedTelephone;

    public SlippedNote(String note) {
        this.note = note;
        this.workOnNote = note;
        decodedTelephone = new StringBuffer();
    }

    public boolean matchesWithDigit(GettingTheDigits.DigitsAsString digitAsString) {
        String pattern = getPatternFromString(digitAsString.getDigitAsString());
        String replacePattern = getReplacePatternFromString(digitAsString.getDigitAsString());

        workOnNote = sortLettersWithinWord(workOnNote);
        return workOnNote.matches(pattern);

    }

    public void addDigitToPhone(GettingTheDigits.DigitsAsString digitAsString) {
        String pattern = getPatternFromString(digitAsString.getDigitAsString());
        String replacePattern = getReplacePatternFromString(digitAsString.getDigitAsString());

        if(workOnNote.matches(pattern)) {
            workOnNote = workOnNote.replaceFirst(pattern, replacePattern);
            decodedTelephone.append(digitAsString.getDigit());
        }
    }

    public void revertDigit(GettingTheDigits.DigitsAsString digit) {
        workOnNote = (new StringBuffer(workOnNote)).append(digit.getDigitAsString()).toString();
        int startIndex = decodedTelephone.indexOf(digit.getDigit());
        int endIndex = startIndex + digit.getDigit().length();
        decodedTelephone.replace(startIndex, endIndex, "" );
    }

    public static String sortLettersWithinWord(String workOnNote) {
        char[] chars = workOnNote.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static String getPatternFromString(String digitAsString) {
        char[] chars = digitAsString.toCharArray();
        Arrays.sort(chars);

        StringBuffer pattern = new StringBuffer();
        pattern.append("(.*)");
        for(int i=0; i<chars.length; i++)
            pattern.append("(" + chars[i] + "{1})(.*)");
        pattern.append("");

        return pattern.toString();
    }

    public static String getReplacePatternFromString(String digitAsString) {
        char[] chars = digitAsString.toCharArray();
        StringBuffer pattern = new StringBuffer();
        int odd=1;
        for(int i=0; i<chars.length; i++) {
            pattern.append("$" + odd);
            odd=odd+2;
        }
        pattern.append("$" + odd);
        return pattern.toString();
    }

    public String getDecodedTelephone() {
        return decodedTelephone.toString();
    }

    public boolean finishDecoding() {
        return workOnNote.length() == 0;
    }


}
