package com.me.telephone;

public class GettingTheDigits {
    enum DigitsAsString {
        ZERO("ZERO",  "0"),
        ONE("ONE", "1"),
        TWO("TWO", "2"),
        THREE("THREE", "3"),
        FOUR("FOUR", "4"),
        FIVE("FIVE", "5"),
        SIX("SIX", "6"),
        SEVEN("SEVEN", "7"),
        EIGHT("EIGHT", "8"),
        NINE("NINE", "9");

        private String digitAsString;
        private String digit;
        DigitsAsString(String digitAsArrayOfChars, String digit) {
            this.digitAsString = digitAsArrayOfChars;
            this.digit = digit;
        }

        public String getDigitAsString() {
            return digitAsString;
        }

        public String getDigit() {
            return digit;
        }

        public DigitsAsString getNext() {
            return this.ordinal() < DigitsAsString.values().length - 1
                    ? DigitsAsString.values()[this.ordinal() + 1]
                    : null;
        }

    }


    public static int CASE_NO = 1;


    public String findOutTelephone(String note) {
        SlippedNote slippedNote = new SlippedNote(note);
        getTelephone(slippedNote);
//        for(DigitsAsString digit : DigitsAsString.values()) {
//            slippedNote.matchWithDigit(digit);
//        }
        String decodedTelephone = "Case #" + GettingTheDigits.CASE_NO++ + ": " + slippedNote.getDecodedTelephone();
        System.out.println(decodedTelephone);
        return decodedTelephone;
    }

    private boolean  getTelephone(SlippedNote slippedNote) {
        if (slippedNote.finishDecoding())
            return true;

        for(DigitsAsString digit : DigitsAsString.values()) {
            if (slippedNote.matchesWithDigit(digit)) {
                slippedNote.addDigitToPhone(digit);
                if (getTelephone(slippedNote))
                    return true;
                else
                    slippedNote.revertDigit(digit);
            }
        }

        return false;
    }

}
