package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
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
        Assert.assertNull(encoder.doubleMetaphone(null));
        Assert.assertNull(encoder.doubleMetaphone(""));
        Assert.assertNull(encoder.doubleMetaphone("   "));
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        Object result = encoder.encode("Smith");
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof String);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        encoder.encode(new Integer(123));
    }

    @Test
    public void testEncodeStringShortcut() {
        Assert.assertEquals(encoder.doubleMetaphone("Test"), encoder.encode("Test"));
    }

    @Test
    public void testMaxCodeLenGetterSetter() {
        assertEquals(4, encoder.getMaxCodeLen());
        encoder.setMaxCodeLen(6);
        assertEquals(6, encoder.getMaxCodeLen());
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones"));
        
        // Test alternate flag version
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth", true));
    }

    @Test
    public void testSilentStarts() {
        // GN, KN, PN, WR, PS
        assertEquals("N", encoder.doubleMetaphone("Gnat"));
        assertEquals("N", encoder.doubleMetaphone("Knight"));
        assertEquals("N", encoder.doubleMetaphone("Pneumatic"));
        assertEquals("R", encoder.doubleMetaphone("Write"));
        assertEquals("S", encoder.doubleMetaphone("Psalm"));
    }

    @Test
    public void testVowelsAtStart() {
        assertEquals("A", encoder.doubleMetaphone("Apple"));
        assertEquals("E", encoder.doubleMetaphone("Elephant", true));
        // Non-zero index vowel
        assertEquals("K", encoder.doubleMetaphone("Cat"));
    }

    @Test
    public void testCedillaAndSpecialChars() {
        assertEquals("S", encoder.doubleMetaphone("Ç"));
        assertEquals("N", encoder.doubleMetaphone("Ñ"));
        assertEquals("", encoder.doubleMetaphone("12345!")); // Default case (non-alpha)
    }

    @Test
    public void testDoubleBFPVWDZKM() {
        assertEquals("P", encoder.doubleMetaphone("BB"));
        assertEquals("F", encoder.doubleMetaphone("FF"));
        assertEquals("K", encoder.doubleMetaphone("KK"));
        assertEquals("M", encoder.doubleMetaphone("MM"));
        assertEquals("N", encoder.doubleMetaphone("NN"));
        assertEquals("P", encoder.doubleMetaphone("PP"));
        assertEquals("K", encoder.doubleMetaphone("QQ"));
        assertEquals("R", encoder.doubleMetaphone("RR"));
        assertEquals("T", encoder.doubleMetaphone("TT"));
        assertEquals("F", encoder.doubleMetaphone("VV"));
    }

    @Test
    public void testHandleC() {
        // Caesar
        assertEquals("S", encoder.doubleMetaphone("Caesar"));
        // CH cases
        assertEquals("K", encoder.doubleMetaphone("Michael"));
        assertEquals("K", encoder.doubleMetaphone("Chemistry"));
        assertEquals("X", encoder.doubleMetaphone("Child"));
        assertEquals("K", encoder.doubleMetaphone("McHugh"));
        // CZ
        assertEquals("S", encoder.doubleMetaphone("Czerny"));
        assertEquals("X", encoder.doubleMetaphone("Wicz")); // wicz negation
        // CIA
        assertEquals("X", encoder.doubleMetaphone("Focaccia"));
        // CC
        assertEquals("KS", encoder.doubleMetaphone("Accident"));
        assertEquals("X", encoder.doubleMetaphone("Bacci"));
        assertEquals("K", encoder.doubleMetaphone("Bacchus"));
        // CK, CG, CQ
        assertEquals("K", encoder.doubleMetaphone("Ack"));
        // CI, CE, CY
        assertEquals("SX", encoder.doubleMetaphone("Cio"));
        assertEquals("S", encoder.doubleMetaphone("Ce"));
        // Default C branches
        assertEquals("K", encoder.doubleMetaphone("Mac Caffrey"));
        assertEquals("K", encoder.doubleMetaphone("Cack"));
    }

    @Test
    public void testHandleD() {
        assertEquals("J", encoder.doubleMetaphone("Edge"));
        assertEquals("TK", encoder.doubleMetaphone("Edgar"));
        assertEquals("T", encoder.doubleMetaphone("Dt"));
        assertEquals("T", encoder.doubleMetaphone("Dd"));
        assertEquals("T", encoder.doubleMetaphone("David"));
    }

    @Test
    public void testHandleG() {
        // GH variants
        assertEquals("K", encoder.doubleMetaphone("Ght"));
        assertEquals("J", encoder.doubleMetaphone("Ghi"));
        assertEquals("F", encoder.doubleMetaphone("Laugh"));
        assertEquals("K", encoder.doubleMetaphone("High"));
        // GN variants
        assertEquals("KN", encoder.doubleMetaphone("Sign"));
        assertEquals("N", encoder.doubleMetaphone("Slavogn"));
        // Other G rules
        assertEquals("KL", encoder.doubleMetaphone("Glia"));
        assertEquals("KJ", encoder.doubleMetaphone("Ger"));
        assertEquals("K", encoder.doubleMetaphone("Danger"));
        assertEquals("K", encoder.doubleMetaphone("Van Gestel"));
        assertEquals("J", encoder.doubleMetaphone("Gier"));
        assertEquals("KK", encoder.doubleMetaphone("Ggg"));
    }

    @Test
    public void testHandleH() {
        // Between vowels or start before vowel
        assertEquals("H", encoder.doubleMetaphone("Ahed"));
        assertEquals("", encoder.doubleMetaphone("H")); // Edge case
    }

    @Test
    public void testHandleJ() {
        assertEquals("H", encoder.doubleMetaphone("Jose"));
        assertEquals("H", encoder.doubleMetaphone("San Jacinto"));
        assertEquals("JA", encoder.doubleMetaphone("J"));
        assertEquals("JH", encoder.doubleMetaphone("Ajol"));
        assertEquals("J ", encoder.doubleMetaphone("Ej"));
        assertEquals("JJ", encoder.doubleMetaphone("Joj"));
    }

    @Test
    public void testHandleL() {
        assertEquals("L", encoder.doubleMetaphone("LL"));
        assertEquals("L", encoder.doubleMetaphone("Allo"));
        assertEquals("L", encoder.doubleMetaphone("Ball"));
    }

    @Test
    public void testHandleP() {
        assertEquals("F", encoder.doubleMetaphone("Phone"));
        assertEquals("P", encoder.doubleMetaphone("Pp"));
        assertEquals("P", encoder.doubleMetaphone("Pb"));
    }

    @Test
    public void testHandleR() {
        assertEquals("R", encoder.doubleMetaphone("Fier"));
        assertEquals("R", encoder.doubleMetaphone("Rr"));
    }

    @Test
    public void testHandleS() {
        assertEquals("S", encoder.doubleMetaphone("Island"));
        assertEquals("XS", encoder.doubleMetaphone("Sugar"));
        assertEquals("S", encoder.doubleMetaphone("Schoek"));
        assertEquals("X", encoder.doubleMetaphone("Ship"));
        assertEquals("SX", encoder.doubleMetaphone("Sio"));
        assertEquals("SX", encoder.doubleMetaphone("Smith"));
        assertEquals("SK", encoder.doubleMetaphone("School"));
        assertEquals("S", encoder.doubleMetaphone("Resnais"));
    }

    @Test
    public void testHandleT() {
        assertEquals("X", encoder.doubleMetaphone("Tion"));
        assertEquals("X", encoder.doubleMetaphone("Tia"));
        assertEquals("T", encoder.doubleMetaphone("Thomas"));
        assertEquals("0T", encoder.doubleMetaphone("Thing"));
        assertEquals("T", encoder.doubleMetaphone("Tt"));
    }

    @Test
    public void testHandleW() {
        assertEquals("R", encoder.doubleMetaphone("Wrate"));
        assertEquals("AF", encoder.doubleMetaphone("Wasserman"));
        assertEquals("A", encoder.doubleMetaphone("Who"));
        assertEquals("F", encoder.doubleMetaphone("Arnow"));
        assertEquals("TSFX", encoder.doubleMetaphone("Wicz"));
        assertEquals("W", encoder.doubleMetaphone("W"));
    }

    @Test
    public void testHandleX() {
        assertEquals("S", encoder.doubleMetaphone("Xray"));
        assertEquals("KS", encoder.doubleMetaphone("Box"));
        assertEquals("K", encoder.doubleMetaphone("Breaux"));
        assertEquals("KS", encoder.doubleMetaphone("Xcc"));
    }

    @Test
    public void testHandleZ() {
        assertEquals("J", encoder.doubleMetaphone("Zhao"));
        assertEquals("STS", encoder.doubleMetaphone("Zo"));
        assertEquals("S", encoder.doubleMetaphone("Z"));
        assertEquals("S", encoder.doubleMetaphone("Zz"));
    }

    @Test
    public void testConditionsAndComplexBranches() {
        // Condition C0
        assertEquals("K", encoder.doubleMetaphone("Chia"));
        assertEquals("K", encoder.doubleMetaphone("Bacher"));
        
        // Condition M0
        assertEquals("M", encoder.doubleMetaphone("Mm"));
        assertEquals("M", encoder.doubleMetaphone("Plumb"));
        assertEquals("M", encoder.doubleMetaphone("Plumber"));

        // Slavo-Germanic coverage via W, K, CZ, WITZ
        assertEquals("K", encoder.doubleMetaphone("Kwok"));
        assertEquals("S", encoder.doubleMetaphone("Witz"));
    }

    @Test
    public void testResultInnerClassDirectly() {
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(4);
        result.append('A');
        result.append('B', 'C');
        result.append("TEST");
        result.append("P", "A");
        Assert.assertEquals("ABTE", result.getPrimary());
        Assert.assertEquals("ACTA", result.getAlternate());
        Assert.assertTrue(result.isComplete());
    }

    private void assertEquals(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }

    private void assertTrue(boolean condition) {
        Assert.assertTrue(condition);
    }

    private void assertFalse(boolean condition) {
        Assert.assertFalse(condition);
    }
}