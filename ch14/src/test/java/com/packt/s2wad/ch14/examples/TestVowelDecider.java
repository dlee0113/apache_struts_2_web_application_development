package com.packt.s2wad.ch14.examples;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestVowelDecider {

    @Test
    public void testVowelRecognition() throws Exception {
        VowelDecider vd = new VowelDecider();
        assertTrue("Has vowels", vd.decide("has vowels"));
        assertFalse("Has no vowels", vd.decide("hsnvwls"));
        assertFalse("Empty string has no vowels", vd.decide(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonStringArgument() throws Exception {
        VowelDecider vd = new VowelDecider();
        vd.decide(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArgument() throws Exception {
        VowelDecider vd = new VowelDecider();
        vd.decide(null);
    }

}
