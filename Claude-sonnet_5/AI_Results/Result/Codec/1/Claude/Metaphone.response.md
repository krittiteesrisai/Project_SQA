# ชุดทดสอบ JUnit 4 สำหรับ `Metaphone` (Codec-1b)

หมายเหตุสำคัญ: ค่า expected ทั้งหมดได้จากการ **trace เดินตามซอร์สโค้ดที่ให้มาทีละสเตปด้วยมือ** (ไม่ได้เดาจาก behavior ของ metaphone มาตรฐานทั่วไป) เพื่อให้สอดคล้องกับข้อกำหนดที่ 4

```java
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
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNullInput | `txt == null` → true |
| testEmptyInput | `txt.length()==0` → true |
| testSingleCharUpper/Lower | `txt.length()==1` → true, toUpperCase |
| testInitialKN_true | case K: `inwd[1]=='N'` true |
| testInitialK_NotN_false | case K: false branch + K-case `n>0` false (initial K append) |
| testInitialGN_true | case G: `inwd[1]=='N'` true |
| testInitialPN_true | case P: `inwd[1]=='N'` true |
| testInitialAE_true | case A: `inwd[1]=='E'` true |
| testInitialA_NotE_false | case A: false branch, duplicate P skip |
| testInitialWR_true | case W: `inwd[1]=='R'` true (break early) |
| testInitialWH_true | case W: `inwd[1]=='H'` true (setCharAt) |
| testInitialW_default_false | case W: ทั้ง R,H false → else |
| testInitialX | case X: initial X→S |
| testInitialDefault | default case ของ switch แรก |
| testVowelsLeadingOnly | vowel-case: `n==0` true/false ของ A,E,I,O,U ; isPreviousChar false (index0) |
| testDuplicateNonCSkipped | `(symb!='C') && isPreviousChar` true |
| testDuplicateCNotSkipped | symb=='C' จึงข้าม dup-check, C-case ทุก sub-branch (S-prev false, CIA false, FRONTV true) |
| testBSilentAfterMAtEnd | B: isPreviousChar 'M' && isLastChar true |
| testBNormal | B: isPreviousChar 'M' false |
| testC_SCH_to_K | C: SCH→K true, VARSON silent H |
| testC_CH_initial_vowel_to_K | C: isNextChar H true, n==0 && wdsz>=3 && isVowel true |
| testC_CH_notInitial_to_X | C: isNextChar H true, n!=0 → X |
| testC_FRONTV_to_S_and_P_default | C: FRONTV true→S, P-case isNextChar H false |
| testD_DGE_to_J | D: DGE condition true, n+=2 |
| testD_default_to_T | D: DGE false → else T, isLastChar true edge |
| testG_GH_silentAtEnd | G: isLastChar(n+1)&&isNextChar H true |
| testG_GH_silentBeforeConsonant | G: !isLastChar && isNextChar H && !isVowel true |
| testG_GH_notSilent_beforeVowel | G: check2 false (vowel after H), GN regionMatch false, hard=false |
| testG_GN_silent | G: regionMatch "GN" true, n>0 true |
| testH_terminal_silent | H: isLastChar true |
| testH_afterVARSON_silent_and_PH_to_F | H: VARSON true (silent), P: isNextChar H true→F |
| testH_beforeVowel_notPrecededByVarson | H: VARSON false, isVowel(next) true→append |
| testH_initial_n_zero_branch | H: `n>0` false (skip VARSON check) |
| testDirectAppendLetters | case F,J (และ M,N,R ผ่านเทสอื่น) direct append |
| testK_afterC_silent | K: n>0 true, isPreviousChar 'C' true→silent |
| testK_notAfterC_append | K: n>0 true, isPreviousChar 'C' false→append |
| testK_initial_append | K: n>0 false→append (initial) |
| testP_PH_to_F | P: isNextChar H true |
| testQ_to_K | Q→K |
| testS_SH_to_X | S: regionMatch "SH" true |
| testS_SIO_to_X | S: regionMatch "SIO" true |
| testS_default | S: ทุก regionMatch false → else |
| testT_TIA_to_X | T: regionMatch "TIA" true |
| testT_TIO_to_X | T: regionMatch "TIO" true (หลัง TIA false) |
| testT_TCH_silent | T: regionMatch "TCH" true |
| testT_TH_to_zero | T: regionMatch "TH" true |
| testT_default | T: ทุก regionMatch false (out-of-range) → else |
| testV_to_F | V→F |
| testY_followedByVowel_append | W/Y: !isLastChar true && isVowel true→append |
| testY_atEnd_silent | W/Y: isLastChar true→silent |
| testW_notFollowedByVowel_silent | W/Y: isVowel(next) false→silent |
| testX_midWord_to_KS | X-case กลางคำ→append K,S |
| testX_initial_toS_thenProcessed | initial X→S แล้วประมวลผลต่อ, ทดสอบขอบพอดี code.length==maxCodeLen |
| testZ_to_S | Z→S, duplicate O ซ้ำถูก skip |
| testDefaultMaxCodeLen | getMaxCodeLen() default = 4 |
| testTruncationBranch_triggered | `code.length() > maxCodeLen` → true (truncate) |
| testTruncation_notTriggered_whenMaxCodeLenIncreased | truncate condition false เมื่อขยาย maxCodeLen |
| testMaxCodeLenBoundary_One | while-condition ขอบเขต length<1 |
| testMaxCodeLenBoundary_Zero | while-condition ไม่ execute เลย (0<0 false) |
| testLowerCaseInput / testMixedCaseInput | ตรวจ toUpperCase(Locale.ENGLISH) ทำงานถูกต้อง |
| testEncodeObject_withString | `encode(Object)`: instanceof true |
| testEncodeObject_withNonString_throws | `encode(Object)`: instanceof false → throw EncoderException |
| testEncodeString | `encode(String)` delegate ไป metaphone() |
| testIsMetaphoneEqual_true/false/bothNull | `isMetaphoneEqual` ทั้งกรณี equal/not-equal/null-safe |

**ข้อจำกัดที่พบ (ตามข้อกำหนด #4):** สาขา `hard = true` ใน case `'G'` (เกิดจาก `isPreviousChar(local, n, 'G')` เป็น true) ไม่สามารถเข้าถึงได้ผ่าน public API เนื่องจากตัวอักษร `G` ซ้ำสองตัวติดกันจะถูกดักโดย logic การข้ามตัวอักษรซ้ำ (`symb != 'C' && isPreviousChar(...)`) ก่อนที่จะเข้าสู่ switch-case เสมอ จึงไม่ได้เขียน assertion สำหรับ branch นี้เป็น true