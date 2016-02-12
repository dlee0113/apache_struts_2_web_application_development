package com.packt.s2wad.utils;

public class UtilClass {

    public static String repeat(int n, String s) {
        String r = s;
        for (int i = 0; i < n-1; i++) r += s;
        return r;
    }

}
