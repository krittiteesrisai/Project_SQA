package org.apache.commons.codec.language;

import org.apache.commons.codec.language.Caverphone;
import org.apache.commons.codec.EncoderException;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaverphoneTest {

    private final Caverphone caverphone = new Caverphone();

    // ---------------------------------------------------------------
    // 1. เงื่อนไข if: txt == null || txt.length() == 0
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_NullInput_ReturnsAllOnes() {
        // branch: txt == null -> true
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testCaverphone_EmptyString_ReturnsAllOnes() {
        // branch: txt == null -> false, txt.length() == 0 -> true
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphone_OnlyNonLetterCharacters_ReturnsAllOnes() {
        // branch: ผ่าน if แรกไปได้ (ไม่ null ไม่ empty) แต่หลัง strip [^a-z]
        // จะเหลือ "" แล้ววิ่งผ่านทุก replaceAll จนได้ผลลัพธ์เดียวกับ empty
        // -> ใช้ดักจับ fault กรณี logic พังกับ input ที่ไม่มีตัวอักษรเลย
        assertEquals("1111111111", caverphone.caverphone("12345!@#$%"));
    }

    @Test
    public void testCaverphone_CaseInsensitive_SameResult() {
        // ทดสอบ toLowerCase(): ตัวพิมพ์ใหญ่/เล็กต้องได้ผลเดียวกัน
        assertEquals(caverphone.caverphone("peter"), caverphone.caverphone("PETER"));
        assertEquals("PTA1111111", caverphone.caverphone("PETER"));
    }

    @Test
    public void testCaverphone_WhitespaceStripped() {
        // ทดสอบ replaceAll("[^a-z]","") ต้องตัดช่องว่าง/สัญลักษณ์ทิ้ง
        assertEquals("TMPSN11111", caverphone.caverphone(" Thompson "));
    }

    // ---------------------------------------------------------------
    // 2. Normal path (คำทั่วไป) - ค่าที่ trace จากซอร์สจริง
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_NormalWord_Thompson() {
        assertEquals("TMPSN11111", caverphone.caverphone("Thompson"));
    }

    @Test
    public void testCaverphone_NormalWord_Peter() {
        // ทดสอบ rule: r$ -> 3 และ 3$ -> A
        assertEquals("PTA1111111", caverphone.caverphone("Peter"));
    }

    // ---------------------------------------------------------------
    // 3. Start-of-word replacement rules (^cough, ^rough, ^tough, ...)
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_StartCough() {
        assertEquals("KF11111111", caverphone.caverphone("cough"));
    }

    @Test
    public void testCaverphone_StartRough() {
        // ครอบคลุม r3 -> R3 ด้วย
        assertEquals("RF11111111", caverphone.caverphone("rough"));
    }

    @Test
    public void testCaverphone_StartTough() {
        assertEquals("TF11111111", caverphone.caverphone("tough"));
    }

    @Test
    public void testCaverphone_StartEnough() {
        // ครอบคลุม ^[aeiou] -> A ด้วย
        assertEquals("ANF1111111", caverphone.caverphone("enough"));
    }

    @Test
    public void testCaverphone_StartTrough() {
        // ครอบคลุม r3 -> R3 ด้วย
        assertEquals("TRF1111111", caverphone.caverphone("trough"));
    }

    @Test
    public void testCaverphone_StartGn() {
        // ครอบคลุม ^gn -> 2n และ e$ (trailing e removal)
        assertEquals("NM11111111", caverphone.caverphone("gnome"));
    }

    @Test
    public void testCaverphone_StartMb() {
        // ครอบคลุม ^mb -> m2 และ 3$ -> A
        assertEquals("MKA1111111", caverphone.caverphone("mbeki"));
    }

    // ---------------------------------------------------------------
    // 4. Middle-of-word substitution rules
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_Rule_CQ() {
        assertEquals("AKA1111111", caverphone.caverphone("acquire"));
    }

    @Test
    public void testCaverphone_Rule_CI() {
        assertEquals("STA1111111", caverphone.caverphone("city"));
    }

    @Test
    public void testCaverphone_Rule_CE() {
        assertEquals("SNT1111111", caverphone.caverphone("cent"));
    }

    @Test
    public void testCaverphone_Rule_CY() {
        assertEquals("SST1111111", caverphone.caverphone("cyst"));
    }

    @Test
    public void testCaverphone_Rule_TCH() {
        // ครอบคลุม tch -> 2ch, w3 -> W3, h -> 2
        assertEquals("WK11111111", caverphone.caverphone("watch"));
    }

    @Test
    public void testCaverphone_Rule_DG() {
        // ครอบคลุม dg -> 2g และ e$ (trailing e)
        assertEquals("PK11111111", caverphone.caverphone("badge"));
    }

    @Test
    public void testCaverphone_Rule_TIO() {
        assertEquals("NSN1111111", caverphone.caverphone("nation"));
    }

    @Test
    public void testCaverphone_Rule_TIA() {
        assertEquals("SA11111111", caverphone.caverphone("tia"));
    }

    @Test
    public void testCaverphone_Rule_D() {
        assertEquals("ST11111111", caverphone.caverphone("sad"));
    }

    @Test
    public void testCaverphone_Rule_PH() {
        // ครอบคลุม ph -> fh, e$ trailing e, h -> 2
        assertEquals("FN11111111", caverphone.caverphone("phone"));
    }

    @Test
    public void testCaverphone_Rule_B() {
        assertEquals("P111111111", caverphone.caverphone("b"));
    }

    @Test
    public void testCaverphone_Rule_SH() {
        assertEquals("AS11111111", caverphone.caverphone("ash"));
    }

    @Test
    public void testCaverphone_Rule_Z() {
        assertEquals("SA11111111", caverphone.caverphone("zoo"));
    }

    @Test
    public void testCaverphone_Rule_X() {
        assertEquals("FK11111111", caverphone.caverphone("fox"));
    }

    @Test
    public void testCaverphone_Rule_V() {
        assertEquals("FN11111111", caverphone.caverphone("van"));
    }

    @Test
    public void testCaverphone_Rule_J_And_CaretY3() {
        // ครอบคลุม j -> y และ ^y3 -> Y3
        assertEquals("YM11111111", caverphone.caverphone("jam"));
    }

    @Test
    public void testCaverphone_Rule_CaretY() {
        // ครอบคลุม ^y -> A (กรณี y ไม่ตามด้วยสระ) และ r3 -> R3
        assertEquals("ATRM111111", caverphone.caverphone("yttrium"));
    }

    @Test
    public void testCaverphone_Rule_WH3() {
        // ครอบคลุม wh3 -> Wh3, l$ -> 3, e$ trailing e
        assertEquals("WA11111111", caverphone.caverphone("whale"));
    }

    @Test
    public void testCaverphone_Rule_L3() {
        // ครอบคลุม b -> p, l3 -> L3, e$ trailing e
        assertEquals("PLA1111111", caverphone.caverphone("blue"));
    }

    @Test
    public void testCaverphone_Rule_GH() {
        // ครอบคลุม gh -> 22 และ l3 -> L3
        assertEquals("LA11111111", caverphone.caverphone("laugh"));
    }

    @Test
    public void testCaverphone_Rule_3GH3() {
        // ครอบคลุม 3gh3 -> 3kh3 (edge-case pattern ที่หายากในคำทั่วไป)
        assertEquals("SPKTA11111", caverphone.caverphone("spaghetti"));
    }

    @Test
    public void testCaverphone_SingleVowel_A() {
        // boundary: input สั้นสุด (1 ตัวอักษร) ที่เป็นสระ
        assertEquals("A111111111", caverphone.caverphone("a"));
    }

    @Test
    public void testCaverphone_ResultLength_AlwaysTen() {
        // property check: substring(0,10) ต้องได้ผลลัพธ์ยาว 10 เสมอ
        String[] inputs = {null, "", "a", "Thompson", "spaghetti", "12345"};
        for (String s : inputs) {
            assertEquals(10, caverphone.caverphone(s).length());
        }
    }

    // ---------------------------------------------------------------
    // 5. encode(Object) - เงื่อนไข instanceof
    // ---------------------------------------------------------------

    @Test(expected = EncoderException.class)
    public void testEncodeObject_NonString_ThrowsEncoderException() throws EncoderException {
        // branch: !(pObject instanceof String) -> true
        caverphone.encode(Integer.valueOf(123));
    }

    @Test
    public void testEncodeObject_String_ReturnsCaverphoneValue() throws EncoderException {
        // branch: !(pObject instanceof String) -> false
        Object result = caverphone.encode((Object) "Thompson");
        assertEquals("TMPSN11111", result);
    }

    // ---------------------------------------------------------------
    // 6. encode(String) - delegate ไปยัง caverphone()
    // ---------------------------------------------------------------

    @Test
    public void testEncodeString_DelegatesToCaverphone() {
        assertEquals(caverphone.caverphone("Peter"), caverphone.encode("Peter"));
    }

    @Test
    public void testEncodeString_NullDelegatesToCaverphone() {
        assertEquals("1111111111", caverphone.encode((String) null));
    }

    // ---------------------------------------------------------------
    // 7. isCaverphoneEqual(String, String)
    // ---------------------------------------------------------------

    @Test
    public void testIsCaverphoneEqual_SameWordDifferentCase_True() {
        assertTrue(caverphone.isCaverphoneEqual("Peter", "PETER"));
    }

    @Test
    public void testIsCaverphoneEqual_DifferentWords_False() {
        assertFalse(caverphone.isCaverphoneEqual("Thompson", "Peter"));
    }

    @Test
    public void testIsCaverphoneEqual_BothNull_True() {
        // caverphone(null) ทั้งสองฝั่งได้ "1111111111" เท่ากัน -> true
        // (ไม่โยน NPE เพราะเช็ค null ภายใน caverphone() ก่อน .equals())
        assertTrue(caverphone.isCaverphoneEqual(null, null));
    }

    @Test
    public void testIsCaverphoneEqual_OneNull_False() {
        assertFalse(caverphone.isCaverphoneEqual(null, "Peter"));
    }
}
