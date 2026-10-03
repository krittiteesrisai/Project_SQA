package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class DoubleMetaphoneTest {

    private DoubleMetaphone encoder;

    @Before
    public void setUp() {
        encoder = new DoubleMetaphone();
    }

    @Test
    public void testCleanInputNullAndEmpty() {
        assertNull(encoder.doubleMetaphone(null));
        assertNull(encoder.doubleMetaphone(""));
        assertNull(encoder.doubleMetaphone("   "));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectType() throws EncoderException {
        encoder.encode(12345);
    }

    @Test
    public void testEncodeValidObject() throws EncoderException {
        Object result = encoder.encode("Smith");
        assertEquals("SM0", result);
    }

    @Test
    public void testEncodeStringDirect() {
        assertEquals("SM0", encoder.encode("Smith"));
    }

    @Test
    public void testSilentStart() {
        // SILENT_START = { "GN", "KN", "PN", "WR", "PS" }
        assertEquals("NT", encoder.doubleMetaphone("Gnat"));
        assertEquals("N", encoder.doubleMetaphone("Knight"));
        assertEquals("N", encoder.doubleMetaphone("Pneumatic"));
        assertEquals("R", encoder.doubleMetaphone("Write"));
        assertEquals("S", encoder.doubleMetaphone("Psalm"));
    }

    @Test
    public void testVowelsAndAEIOUYHandler() {
        // index == 0 case for vowels
        assertEquals("A", encoder.doubleMetaphone("Apple"));
        assertEquals("E", encoder.doubleMetaphone("Elephant"));
        assertEquals("I", encoder.doubleMetaphone("Igloo"));
        assertEquals("O", encoder.doubleMetaphone("Octopus"));
        assertEquals("U", encoder.doubleMetaphone("Umbrella"));
        assertEquals("Y", encoder.doubleMetaphone("Yoyo"));
    }

    @Test
    public void testDoubleB() {
        assertEquals("P", encoder.doubleMetaphone("Bubble"));
        assertEquals("P", encoder.doubleMetaphone("Bubb"));
    }

    @Test
    public void testCedillaAndNtilde() {
        assertEquals("S", encoder.doubleMetaphone("\u00C7ade")); // Çade -> S
        assertEquals("N", encoder.doubleMetaphone("\u00D1ino"));  // Ñino -> N
    }

    @Test
    public void testHandleCBranches() {
        // conditionC0 / Caesar / CH / CZ / CIA / CC / CK / CI / CE / CY
        assertEquals("SSR", encoder.doubleMetaphone("Caesar"));
        assertEquals("X", encoder.doubleMetaphone("Focaccia"));
        assertEquals("SZ", encoder.doubleMetaphone("Czerny"));
        assertEquals("X", encoder.doubleMetaphone("Architecture"));
        assertEquals("K", encoder.doubleMetaphone("Bacher"));
        assertEquals("X", encoder.doubleMetaphone("Bellocchio"));
        assertEquals("KS", encoder.doubleMetaphone("Accident"));
        assertEquals("X", encoder.doubleMetaphone("Bacci"));
        assertEquals("K", encoder.doubleMetaphone("Bacchus"));
        assertEquals("K", encoder.doubleMetaphone("Check"));
        assertEquals("K", encoder.doubleMetaphone("Mac Caffrey"));
        assertEquals("S", encoder.doubleMetaphone("City"));
        assertEquals("SX", encoder.doubleMetaphone("Cio"));
    }

    @Test
    public void testHandleDBranches() {
        assertEquals("J", encoder.doubleMetaphone("Edge"));
        assertEquals("TK", encoder.doubleMetaphone("Edgar"));
        assertEquals("T", encoder.doubleMetaphone("Add"));
        assertEquals("T", encoder.doubleMetaphone("Dt"));
        assertEquals("T", encoder.doubleMetaphone("David"));
    }

    @Test
    public void testHandleFBranches() {
        assertEquals("F", encoder.doubleMetaphone("Office"));
        assertEquals("F", encoder.doubleMetaphone("F"));
    }

    @Test
    public void testHandleGBranches() {
        // Slavo-Germanic vs Non-Slavo-Germanic, GH, GN, etc.
        assertEquals("K", encoder.doubleMetaphone("Wagner")); // SlavoGermanic due to W
        assertEquals("KN", encoder.doubleMetaphone("Sign"));
        assertEquals("N", encoder.doubleMetaphone("Signet"));
        assertEquals("KL", encoder.doubleMetaphone("Glio"));
        assertEquals("KJ", encoder.doubleMetaphone("Gel"));
        assertEquals("KJ", encoder.doubleMetaphone("Ger"));
        assertEquals("J", encoder.doubleMetaphone("Giacomo"));
        assertEquals("K", encoder.doubleMetaphone("Van Gilder"));
        assertEquals("K", encoder.doubleMetaphone("GG"));
        assertEquals("K", encoder.doubleMetaphone("G"));
    }

    @Test
    public void testHandleGHBranches() {
        assertEquals("K", encoder.doubleMetaphone("Ghetto"));
        assertEquals("J", encoder.doubleMetaphone("Ghoul") == null ? "" : encoder.doubleMetaphone("Ghicol")); 
        assertEquals("F", encoder.doubleMetaphone("Laugh"));
        assertEquals("K", encoder.doubleMetaphone("Height"));
    }

    @Test
    public void testHandleHBranches() {
        assertEquals("H", encoder.doubleMetaphone("Ahead"));
        assertEquals("", encoder.doubleMetaphone("Ah"));
    }

    @Test
    public void testHandleJBranches() {
        assertEquals("H", encoder.doubleMetaphone("Jose"));
        assertEquals("H", encoder.doubleMetaphone("San Jacinto"));
        assertEquals("J", encoder.doubleMetaphone("Jumping"));
        assertEquals("J", encoder.doubleMetaphone("Ajou"));
        assertEquals("J", encoder.doubleMetaphone("JJ"));
    }

    @Test
    public void testHandleLBranches() {
        assertEquals("L", encoder.doubleMetaphone("Ball"));
        assertEquals("L", encoder.doubleMetaphone("Ballo"));
        assertEquals("LL", encoder.doubleMetaphone("Illora"));
    }

    @Test
    public void testHandleMBranches() {
        assertEquals("M", encoder.doubleMetaphone("Emma"));
        assertEquals("M", encoder.doubleMetaphone("Thumb"));
        assertEquals("M", encoder.doubleMetaphone("Plumber"));
    }

    @Test
    public void testHandleNBranches() {
        assertEquals("N", encoder.doubleMetaphone("Ann"));
        assertEquals("N", encoder.doubleMetaphone("Name"));
    }

    @Test
    public void testHandlePBranches() {
        assertEquals("F", encoder.doubleMetaphone("Phone"));
        assertEquals("P", encoder.doubleMetaphone("App"));
    }

    @Test
    public void testHandleQBranches() {
        assertEquals("K", encoder.doubleMetaphone("Queen"));
        assertEquals("K", encoder.doubleMetaphone("Qqu"));
    }

    @Test
    public void testHandleRBranches() {
        assertEquals("R", encoder.doubleMetaphone("Carriers"));
        assertEquals("R", encoder.doubleMetaphone("Carrier"));
        assertEquals("R", encoder.doubleMetaphone("Error"));
    }

    @Test
    public void testHandleSBranches() {
        // ISL, YSL, SUGAR, SH, SIO, SIA, SC, etc.
        assertEquals("SL", encoder.doubleMetaphone("Island"));
        assertEquals("X", encoder.doubleMetaphone("Sugar"));
        assertEquals("S", encoder.doubleMetaphone("enheim"));
        assertEquals("X", encoder.doubleMetaphone("Ship"));
        assertEquals("SX", encoder.doubleMetaphone("Sion"));
        assertEquals("S", encoder.doubleMetaphone("Wiegand")); 
        assertEquals("SK", encoder.doubleMetaphone("School"));
        assertEquals("XSK", encoder.doubleMetaphone("Schermerhorn"));
        assertEquals("S", encoder.doubleMetaphone("Science"));
        assertEquals("S", encoder.doubleMetaphone("Artois"));
    }

    @Test
    public void testHandleTBranches() {
        assertEquals("X", encoder.doubleMetaphone("Motion"));
        assertEquals("X", encoder.doubleMetaphone("Partial"));
        assertEquals("0T", encoder.doubleMetaphone("Path"));
        assertEquals("T", encoder.doubleMetaphone("Thomas"));
        assertEquals("T", encoder.doubleMetaphone("Attic"));
    }

    @Test
    public void testHandleVBranches() {
        assertEquals("F", encoder.doubleMetaphone("Vine"));
        assertEquals("F", encoder.doubleMetaphone("Avv"));
    }

    @Test
    public void testHandleWBranches() {
        assertEquals("R", encoder.doubleMetaphone("Wring"));
        assertEquals("AF", encoder.doubleMetaphone("Water"));
        assertEquals("A", encoder.doubleMetaphone("Who"));
        assertEquals("F", encoder.doubleMetaphone("Arnow"));
        assertEquals("TSFX", encoder.doubleMetaphone("Filipowicz"));
        assertEquals("W", encoder.doubleMetaphone("W"));
    }

    @Test
    public void testHandleXBranches() {
        assertEquals("S", encoder.doubleMetaphone("Xylophone"));
        assertEquals("KS", encoder.doubleMetaphone("Box"));
        assertEquals("K", encoder.doubleMetaphone("Bordeaux"));
    }

    @Test
    public void testHandleZBranches() {
        assertEquals("J", encoder.doubleMetaphone("Zhao"));
        assertEquals("STS", encoder.doubleMetaphone("Zoom"));
        assertEquals("S", encoder.doubleMetaphone("Buzz"));
    }

    @Test
    public void testMaxCodeLengthAndResultInnerClass() {
        encoder.setMaxCodeLen(2);
        assertEquals(2, encoder.getMaxCodeLen());
        assertEquals("SM", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth", true));
        assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Johnson"));
    }
}