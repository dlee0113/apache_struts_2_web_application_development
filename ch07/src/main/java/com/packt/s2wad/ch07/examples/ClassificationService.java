package com.packt.s2wad.ch07.examples;

public class ClassificationService {

    public static boolean isValidClassification(String s) {
        if (s.length() != 3 && s.length() != 4) {
            return false;
        }

        if ((s.length() == 4)
                && (!s.startsWith("0") && !s.startsWith("1"))) {
            return false;
        }

        return true;
    }

}
