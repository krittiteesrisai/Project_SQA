package org.apache.commons.codec.language;

import static org.junit.Assert.*;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class MetaphoneTest {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        metaphone = new Metaphone();
    }

    // ---------- Boundary: null / empty / single char ----------

    @Test
    public void testNullInput() {
        assertEquals("", metaphone.metaphone(null));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", metaphone.metaphone(""));
    }

    @Test
    public void testSingleCharUpper() {
        assertEquals("B", metaphone.metaphone("B"));
    }

    @Test
    public void testSingleCharLower() {
        assertEquals("B", metaphone.metaphone("b"));
    }

    // ---------- Initial two-char exceptions ----------

    @Test
    public void testInitialKN_true() {
        assertEquals("NT", metaphone.metaphone("KNOT"));
    }

    @Test
    public void testInitialK_NotN_false() {
        assertEquals("KL", metaphone.metaphone("KOALA"));
    }

    @Test
    public void testInitialGN_true() {
        assertEquals("N", metaphone.metaphone("GNAW"));
    }

    @Test
    public void testInitialPN_true() {
        assertEquals("NMN", metaphone.metaphone("PNEUMONIA"));
    }

    @Test
    public void testInitialAE_true() {
        assertEquals("EN", metaphone.metaphone("AEON"));
    }

    @Test
    public void testInitialA_NotE_false() {
        assertEquals("APL", metaphone.metaphone("APPLE"));
    }

    @Test
    public void testInitialWR_true() {
        assertEquals("RP", metaphone.metaphone("WRAP"));
    }

    @Test
    public void testInitialWH_true() {
        assertEquals("WT", metaphone.metaphone("WHAT"));
    }

    @Test
    public void testInitialW_default_false() {
        assertEquals("WL", metaphone.metaphone("WOOL"));
    }

    @Test
    public void testInitialX() {
        assertEquals("SMS", metaphone.metaphone("XMAS"));
    }

    @Test
    public void testInitialDefault() {
        assertEquals("BK", metaphone.metaphone("BACK"));
    }

    // ---------- Vowel handling & duplicate skip ----------

    @Test
    public void testVowelsLeadingOnly() {
        assertEquals("E", metaphone.metaphone("AEIOU"));
    }

    @Test
    public void testDuplicateNonCSkipped() {
        assertEquals("AT", metaphone.metaphone("ADD"));
    }

    @Test
    public void testDuplicateCNotSkipped() {
        assertEquals("AKSP", metaphone.metaphone("ACCEPT"));
    }

    // ---------- B handling ----------

    @Test
    public void testBSilentAfterMAtEnd() {
        assertEquals("LM", metaphone.metaphone("LAMB"));
    }

    @Test
    public void testBNormal() {
        assertEquals("KRB", metaphone.metaphone("GRAB"));
    }

    // ---------- C handling ----------

    @Test
    public void testC_SCH_to_K() {
        assertEquals("SKL", metaphone.metaphone("SCHOOL"));
    }

    @Test
    public void testC_CH_initial_vowel_to_K() {
        assertEquals("KRLS", metaphone.metaphone("CHARLES"));
    }

    @Test
    public void testC_CH_notInitial_to_X() {
        assertEquals("MXN", metaphone.metaphone("MACHINE"));
    }

    @Test
    public void testC_FRONTV_to_S_and_P_default() {
        // ACCEPT: C(1st)->K, C(2nd)+FRONTV->S, P default append
        assertEquals("AKSP", metaphone.metaphone("ACCEPT"));
    }

    // ---------- D handling ----------

    @Test
    public void testD_DGE_to_J() {
        assertEquals("EJ", metaphone.metaphone("EDGE"));
    }

    @Test
    public void testD_default_to_T() {
        assertEquals("ST", metaphone.metaphone("SAD"));
    }

    // ---------- G handling ----------

    @Test
    public void testG_GH_silentAtEnd() {
        assertEquals("S", metaphone.metaphone("SIGH"));
    }

    @Test
    public void testG_GH_silentBeforeConsonant() {
        assertEquals("TT", metaphone.metaphone("TIGHT"));
    }

    @Test
    public void testG_GH_notSilent_beforeVowel() {
        assertEquals("AKST", metaphone.metaphone("AGHAST"));
    }

    @Test
    public void testG_GN_silent() {
        assertEquals("SNL", metaphone.metaphone("SIGNAL"));
    }

    // NOTE (ข้อกำหนด #4): สาขา `hard = true` (isPreviousChar(local,n,'G') เป็น true ภายใน case 'G')
    // ดูเหมือน "ไม่สามารถเข้าถึงได้จริง" ผ่าน public API เพราะการเช็คตัวอักษรซ้ำทั่วไป
    // (symb != 'C' && isPreviousChar(...)) จะดัก 'G' ตัวที่สองที่ซ้ำกันไว้ก่อนถึง switch เสมอ
    // จึงไม่ได้เขียนเทสยืนยัน branch นี้เป็น true (ไม่กล้าเดา จึงกำกับไว้ตามที่กำหนด)

    // ---------- H handling ----------

    @Test
    public void testH_terminal_silent() {
        assertEquals("A", metaphone.metaphone("AH"));
    }

    @Test
    public void testH_afterVARSON_silent_and_PH_to_F() {
        assertEquals("FN", metaphone.metaphone("PHONE"));
    }

    @Test
    public void testH_beforeVowel_notPrecededByVarson() {
        assertEquals("OH", metaphone.metaphone("OHIO"));
    }

    @Test
    public void testH_initial_n_zero_branch() {
        assertEquals("HT", metaphone.metaphone("HAT"));
    }

    // ---------- F, J, L, M, N, R direct append ----------

    @Test
    public void testDirectAppendLetters() {
        assertEquals("FX", metaphone.metaphone("FISH"));
        assertEquals("JM", metaphone.metaphone("JAM"));
    }

    // ---------- K handling ----------

    @Test
    public void testK_afterC_silent() {
        assertEquals("BK", metaphone.metaphone("BACK"));
    }

    @Test
    public void testK_notAfterC_append() {
        assertEquals("MK", metaphone.metaphone("MAKE"));
    }

    @Test
    public void testK_initial_append() {
        assertEquals("KT", metaphone.metaphone("KITE"));
    }

    // ---------- P handling ----------

    @Test
    public void testP_PH_to_F() {
        assertEquals("FN", metaphone.metaphone("PHONE"));
    }

    // ---------- Q handling ----------

    @Test
    public void testQ_to_K() {
        assertEquals("KK", metaphone.metaphone("QUICK"));
    }

    // ---------- S handling ----------

    @Test
    public void testS_SH_to_X() {
        assertEquals("XP", metaphone.metaphone("SHIP"));
    }

    @Test
    public void testS_SIO_to_X() {
        assertEquals("FXN", metaphone.metaphone("VISION"));
    }

    @Test
    public void testS_default() {
        assertEquals("ST", metaphone.metaphone("SAD"));
    }

    // ---------- T handling ----------

    @Test
    public void testT_TIA_to_X() {
        assertEquals("AX", metaphone.metaphone("ATIA"));
    }

    @Test
    public void testT_TIO_to_X() {
        assertEquals("AX", metaphone.metaphone("ATIO"));
    }

    @Test
    public void testT_TCH_silent() {
        assertEquals("MX", metaphone.metaphone("MATCH"));
    }

    @Test
    public void testT_TH_to_zero() {
        assertEquals("0N", metaphone.metaphone("THIN"));
    }

    @Test
    public void testT_default() {
        assertEquals("HT", metaphone.metaphone("HAT"));
    }

    // ---------- V handling ----------

    @Test
    public void testV_to_F() {
        assertEquals("FXN", metaphone.metaphone("VISION"));
    }

    // ---------- W / Y handling ----------

    @Test
    public void testY_followedByVowel_append() {
        assertEquals("YRT", metaphone.metaphone("YARD"));
    }

    @Test
    public void testY_atEnd_silent() {
        assertEquals("T", metaphone.metaphone("TOY"));
    }

    @Test
    public void testW_notFollowedByVowel_silent() {
        assertEquals("S", metaphone.metaphone("SAW"));
    }

    // ---------- X handling (mid-word) ----------

    @Test
    public void testX_midWord_to_KS() {
        assertEquals("BKS", metaphone.metaphone("BOX"));
    }

    @Test
    public void testX_initial_toS_thenProcessed() {
        assertEquals("SRKS", metaphone.metaphone("XEROX"));
    }

    // ---------- Z handling ----------

    @Test
    public void testZ_to_S() {
        assertEquals("S", metaphone.metaphone("ZOO"));
    }

    // ---------- maxCodeLen / truncation ----------

    @Test
    public void testDefaultMaxCodeLen() {
        assertEquals(4, metaphone.getMaxCodeLen());
    }

    @Test
    public void testTruncationBranch_triggered() {
        // code เติบโตถึง length 5 ก่อนถูกตัดเหลือ 4
        assertEquals("TFJK", metaphone.metaphone("TAFJX"));
    }

    @Test
    public void testTruncation_notTriggered_whenMaxCodeLenIncreased() {
        metaphone.setMaxCodeLen(6);
        assertEquals("TFJKS", metaphone.metaphone("TAFJX"));
    }

    @Test
    public void testMaxCodeLenBoundary_One() {
        metaphone.setMaxCodeLen(1);
        assertEquals("A", metaphone.metaphone("APPLE"));
    }

    @Test
    public void testMaxCodeLenBoundary_Zero() {
        metaphone.setMaxCodeLen(0);
        assertEquals("", metaphone.metaphone("APPLE"));
    }

    // ---------- Case-insensitivity ----------

    @Test
    public void testLowerCaseInput() {
        assertEquals("AT", metaphone.metaphone("add"));
    }

    @Test
    public void testMixedCaseInput() {
        assertEquals("0N", metaphone.metaphone("ThIn"));
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_withString() throws EncoderException {
        assertEquals("AT", metaphone.encode((Object) "ADD"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_withNonString_throws() throws EncoderException {
        metaphone.encode((Object) Integer.valueOf(5));
    }

    // ---------- encode(String) ----------

    @Test
    public void testEncodeString() {
        assertEquals("AT", metaphone.encode("ADD"));
    }

    // ---------- isMetaphoneEqual ----------

    @Test
    public void testIsMetaphoneEqual_true() {
        assertTrue(metaphone.isMetaphoneEqual("Smith", "Smyth"));
    }

    @Test
    public void testIsMetaphoneEqual_false() {
        assertFalse(metaphone.isMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testIsMetaphoneEqual_bothNull() {
        // metaphone(null) == "" ทั้งสองด้าน -> equal เป็น true (พฤติกรรมตามซอร์สจริง ไม่มี NPE)
        assertTrue(metaphone.isMetaphoneEqual(null, null));
    }
}
