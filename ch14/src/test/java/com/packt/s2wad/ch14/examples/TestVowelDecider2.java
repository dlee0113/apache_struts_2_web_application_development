package com.packt.s2wad.ch14.examples;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestVowelDecider2 {

    private static VowelDecider vd;

    @BeforeClass public static void setup() {
        vd = new VowelDecider();
    }

    @Test public void testSingleVowel() throws Exception {
        assertTrue("Single vowel", vd.decide("a"));
    }

    @Test public void testWordsWithVowels() throws Exception {
        assertTrue("Words with vowels", vd.decide("Words with vowels"));
    }

    @Test public void testAllCaps() throws Exception {
        assertTrue("CAPITALS WITH VOWELS", vd.decide("CAPITALS WITH VOWELS"));
    }

    @Test public void testSingleConsonant() throws Exception {
        assertFalse("Single consonant", vd.decide("k"));
    }

    @Test public void testNoVowels() throws Exception {
        assertFalse("No vowels", vd.decide("nvwls"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonStringArgument() throws Exception {
        vd.decide(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArgument() throws Exception {
        vd.decide(null);
    }

    @Test public void testEmptyString() throws Exception {
        assertFalse("Empty string", vd.decide(""));
    }

}
