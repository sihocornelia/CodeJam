package com.me;

import com.me.telephone.GettingTheDigits;

import java.io.*;
import java.util.stream.Stream;


class Main {

    public static void main(String[] args) {

        try {
            File fromFile = new File("src/main/resources/A-small-practice.csv");
            File toFile = new File("src/main/resources/A-small-practice.out");
            if (!toFile.exists()) {
                toFile.createNewFile();
            }
            GettingTheDigits gettingTheDigits = new GettingTheDigits();
            if (fromFile.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(fromFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(toFile));
                Stream<String> lines = br.lines();
                int outputCase = 1;
                lines.forEach(line -> {
                    try {
                        bw.append(gettingTheDigits.findOutTelephone(line));
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                bw.close();
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
