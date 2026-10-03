package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MetaphoneTest {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        metaphone = new Metaphone();
    }

    @Test
    public void testNullAndEmptyInput() {
        assertEquals("", metaphone.metaphone(null));
        assertEquals("", metaphone.metaphone(""));
    }

    @Test
    public void testSingleCharacterInput() {
        assertEquals("A", metaphone.metaphone("a"));
        assertEquals("Z", metaphone.metaphone("Z"));
    }

    @Test
    public void testInitialExceptionsKN_GN_PN() {
        assertEquals("NT", metaphone.metaphone("KNIT"));
        assertEquals("N", metaphone.metaphone("GNAT"));
        assertEquals("PR", metaphone.metaphone("PNM")); // P not followed by N
    }

    @Test
    public void testInitialExceptionAE() {
        assertEquals("N", metaphone.metaphone("AEN"));
        assertEquals("PL", metaphone.metaphone("APPLE"));
    }

    @Test
    public void testInitialExceptionW() {
        assertEquals("R", metaphone.metaphone("WRONG"));
        assertEquals("WL", metaphone.metaphone("WHILE"));
        assertEquals("WTR", metaphone.metaphone("WATER"));
    }

    @Test
    public void testInitialExceptionX() {
        assertEquals("SN", metaphone.metaphone("XENON"));
    }

    @Test
    public void testVowelsHandling() {
        // Vowels are only kept at the beginning
        assertEquals("AN", metaphone.metaphone("AON"));
    }

    @Test
    public void testLetterB() {
        // Silent B at the end of MB
        assertEquals("UM", metaphone.metaphone("UMB"));
        assertEquals("MBR", metaphone.metaphone("MBR")); // Not silent if not end
    }

    @Test
    public void testLetterCAndCombinations() {
        // SCI, SCE, SCY discard C
        assertEquals("S", metaphone.metaphone("SCENE"));
        // CIA -> X
        assertEquals("XN", metaphone.metaphone("CIAN"));
        // CI, CE, CY -> S
        assertEquals("S", metaphone.metaphone("CITY"));
        // SCH -> K
        assertEquals("K", metaphone.metaphone("SCHOOL"));
        // CH -> K (at start with vowel after 2 chars? Wait, CH consonant -> K, CH vowel -> X)
        assertEquals("K", metaphone.metaphone("CHR")); 
        assertEquals("X", metaphone.metaphone("CHAT"));
        assertEquals("K", metaphone.metaphone("CAT"));
    }

    @Test
    public void testLetterD() {
        // DGE, DGI, DGY -> J
        assertEquals("J", metaphone.metaphone("DGE"));
        assertEquals("T", metaphone.metaphone("DAT"));
    }

    @Test
    public void testLetterG() {
        // GH silent at end or before consonant
        assertEquals("T", metaphone.metaphone("TOUGH"));
        assertEquals("T", metaphone.metaphone("THT")); // GH before consonant
        // GN / GNED silent
        assertEquals("N", metaphone.metaphone("GNST"));
        // G + FRONTV -> J (unless hard G)
        assertEquals("J", metaphone.metaphone("GEL"));
        assertEquals("KK", metaphone.metaphone("GG")); // Hard G
    }

    @Test
    public void testLetterH() {
        // Terminal H or H after variable consonants (CSPTG)
        assertEquals("PH", metaphone.metaphone("PH")); // Terminal H
        assertEquals("S", metaphone.metaphone("SH"));  // H after S
        assertEquals("H", metaphone.metaphone("HAT")); // Hvowel
    }

    @Test
    public void testOtherConsonantsAndEdges() {
        assertEquals("F", metaphone.metaphone("PHON"));
        assertEquals("K", metaphone.metaphone("QUEEN"));
        assertEquals("X", metaphone.metaphone("SH"));
        assertEquals("X", metaphone.metaphone("SIO"));
        assertEquals("X", metaphone.metaphone("SIA"));
        assertEquals("X", metaphone.metaphone("TIA"));
        assertEquals("X", metaphone.metaphone("TIO"));
        assertEquals("", metaphone.metaphone("TCH")); // TCH silent
        assertEquals("0", metaphone.metaphone("TH"));  // TH -> 0
        assertEquals("F", metaphone.metaphone("VOT"));
        assertEquals("W", metaphone.metaphone("WET"));  // W followed by vowel
        assertEquals("KS", metaphone.metaphone("BOX")); // X -> KS
        assertEquals("S", metaphone.metaphone("ZOO"));
        assertEquals("K", metaphone.metaphone("KICK"));
        assertEquals("K", metaphone.metaphone("CK")); // Duplicate C check exception
    }

    @Test
    public void testMaxCodeLength() {
        metaphone.setMaxCodeLen(2);
        assertEquals(2, metaphone.getMaxCodeLen());
        assertEquals("AL", metaphone.metaphone("ALPHABET"));
    }

    @Test
    public void testEncodeMethods() throws EncoderException {
        assertEquals("TST", metaphone.encode("test"));
        assertEquals("TST", metaphone.encode((Object) "test"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectType() throws EncoderException {
        metaphone.encode(12345);
    }

    @Test
    public void testIsMetaphoneEqual() {
        assertTrue(metaphone.isMetaphoneEqual("test", "tst"));
        assertFalse(metaphone.isMetaphoneEqual("test", "apple"));
    }
}