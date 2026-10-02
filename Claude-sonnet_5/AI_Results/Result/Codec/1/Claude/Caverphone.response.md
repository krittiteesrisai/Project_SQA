# JUnit 4 Test Suite สำหรับ `Caverphone` (Codec-1b)

## หมายเหตุการวิเคราะห์

จากซอร์สโค้ด branch จริงที่มีอยู่ในคลาสนี้มีเพียง:
1. `if (txt == null || txt.length() == 0)` ใน `caverphone(String)` — มี 2 เงื่อนไขย่อย (short-circuit OR)
2. `if (!(pObject instanceof java.lang.String))` ใน `encode(Object)`

ส่วน `replaceAll(...)` ทั้งหมดเป็นการเรียกเมธอดแบบเรียงลำดับ (ไม่มี if/else/loop ในซอร์สที่ให้มา) จึงไม่ใช่ "branch" ในความหมาย JaCoCo/bytecode ของคลาสนี้ แต่เพื่อเพิ่มโอกาสดักจับ fault (เช่น ลำดับ regex ผิด, เงื่อนไข anchor ผิด) จึงเพิ่ม test case ที่คำนวณผลลัพธ์จริงด้วยมือ (trace ทีละ step ตามลำดับ regex ในซอร์ส) ครอบคลุมกฎพิเศษ เช่น `^cough/^rough/^tough/^enough/^trough`, `^gn`, `^mb`, `e$`, `w$`, `l3/l$`, `wh3`, `r3` เป็นต้น — ค่าคาดหวังทุกค่าผม trace ทีละ replaceAll ตามโค้ดจริง ไม่ได้เดาจากที่อื่น หากมีจุดใดไม่แน่ใจจะคอมเมนต์กำกับไว้

```java
package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    // ---------------------------------------------------------------
    // 1) Branch: txt == null  (short-circuit true, ไม่ประเมิน length())
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneNullInput() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    // ---------------------------------------------------------------
    // 2) Branch: txt == null เป็น false, txt.length() == 0 เป็น true
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneEmptyInput() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    // ---------------------------------------------------------------
    // 3) Branch: ทั้ง null และ length()==0 เป็น false (เข้า main logic)
    //    edge case: อินพุตผิดรูปแบบ (ไม่มีตัวอักษร a-z เลย)
    //    หลัง strip [^a-z] จะกลายเป็นสตริงว่าง -> ผลลัพธ์เหมือนอินพุตว่าง
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneOnlyNonLetterCharacters() {
        assertEquals("1111111111", caverphone.caverphone("12345"));
    }

    // ---------------------------------------------------------------
    // 4) กฎ ^[aeiou] -> A และยืนยันว่า [aeiou]->3 เป็น case-sensitive
    //    (A ตัวใหญ่จะไม่ถูกจับด้วย [aeiou] อีกครั้ง)
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneSingleVowel() {
        assertEquals("A111111111", caverphone.caverphone("a"));
    }

    // ---------------------------------------------------------------
    // 5-6) ค่าที่เป็นที่รู้จักของอัลกอริทึม Caverphone 2.0 (คำนวณตาม trace โค้ด)
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneThompson() {
        assertEquals("TMPSN11111", caverphone.caverphone("Thompson"));
    }

    @Test
    public void testCaverphonePeter() {
        assertEquals("PTA1111111", caverphone.caverphone("Peter"));
    }

    // ---------------------------------------------------------------
    // 7) ยืนยัน step "1. Convert to lowercase" ทำงาน (case-insensitive)
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneCaseInsensitive() {
        assertEquals(caverphone.caverphone("Peter"), caverphone.caverphone("PETER"));
        assertEquals("PTA1111111", caverphone.caverphone("PETER"));
    }

    // ---------------------------------------------------------------
    // 8-12) กฎพิเศษ start-of-string: ^cough/^rough/^tough/^enough/^trough
    //       ครอบคลุมทุกบรรทัด replaceAll สำหรับ "Handle various start options"
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneCoughRule() {
        assertEquals("KF11111111", caverphone.caverphone("cough"));
    }

    @Test
    public void testCaverphoneRoughRule() {
        assertEquals("RF11111111", caverphone.caverphone("rough"));
    }

    @Test
    public void testCaverphoneToughRule() {
        assertEquals("TF11111111", caverphone.caverphone("tough"));
    }

    @Test
    public void testCaverphoneEnoughRule() {
        assertEquals("ANF1111111", caverphone.caverphone("enough"));
    }

    @Test
    public void testCaverphoneTroughRule() {
        // ยืนยันว่า ^tough จะไม่ไป match "trough" โดยไม่ตั้งใจ (c+p error ที่ comment พูดถึง)
        assertEquals("TRF1111111", caverphone.caverphone("trough"));
    }

    // ---------------------------------------------------------------
    // 13) กฎ ^gn -> 2n
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneGnStartRule() {
        assertEquals("NT11111111", caverphone.caverphone("gnat"));
    }

    // ---------------------------------------------------------------
    // 14) กฎ ^mb -> m2
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneMbStartRule() {
        assertEquals("MP11111111", caverphone.caverphone("mbob"));
    }

    // ---------------------------------------------------------------
    // 15) กฎ w$ -> 3 และ l3 -> L3 (2.0 only)
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneWEndAndL3Rule() {
        assertEquals("LA11111111", caverphone.caverphone("low"));
    }

    // ---------------------------------------------------------------
    // 16) กฎ e$ (remove final e), wh3 -> Wh3, l$ -> 3
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneWh3Rule() {
        assertEquals("WA11111111", caverphone.caverphone("whale"));
    }

    // ---------------------------------------------------------------
    // 17) encode(Object) เมื่อรับ String ที่ถูกต้อง
    // ---------------------------------------------------------------
    @Test
    public void testEncodeObjectWithValidString() throws EncoderException {
        Object result = caverphone.encode((Object) "Thompson");
        assertEquals("TMPSN11111", result);
    }

    // ---------------------------------------------------------------
    // 18) Branch: instanceof เป็น false -> throw EncoderException
    // ---------------------------------------------------------------
    @Test(expected = EncoderException.class)
    public void testEncodeObjectWithNonStringThrowsException() throws EncoderException {
        caverphone.encode(Integer.valueOf(1));
    }

    @Test
    public void testEncodeObjectExceptionMessage() {
        try {
            caverphone.encode(Integer.valueOf(1));
            fail("ควร throw EncoderException");
        } catch (EncoderException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("java.lang.String"));
        }
    }

    // ---------------------------------------------------------------
    // 19) Edge case: encode(Object) รับ null
    //     null instanceof String == false -> !(false) == true -> throw EncoderException
    //     (ไม่ได้ไปเรียก caverphone(null) ซึ่งอาจเป็นพฤติกรรมที่ผู้ใช้ไม่คาดคิด)
    // ---------------------------------------------------------------
    @Test(expected = EncoderException.class)
    public void testEncodeObjectWithNullThrowsException() throws EncoderException {
        caverphone.encode((Object) null);
    }

    // ---------------------------------------------------------------
    // 20) encode(String) ต้อง delegate ไปที่ caverphone(String) ตรง ๆ
    // ---------------------------------------------------------------
    @Test
    public void testEncodeStringDelegatesToCaverphone() {
        assertEquals(caverphone.caverphone("Peter"), caverphone.encode("Peter"));
    }

    @Test
    public void testEncodeStringNull() {
        assertEquals("1111111111", caverphone.encode((String) null));
    }

    // ---------------------------------------------------------------
    // 21) isCaverphoneEqual: กรณี true (คนละ case แต่รหัสเดียวกัน)
    // ---------------------------------------------------------------
    @Test
    public void testIsCaverphoneEqualTrue() {
        assertTrue(caverphone.isCaverphoneEqual("Peter", "PETER"));
    }

    // ---------------------------------------------------------------
    // 22) isCaverphoneEqual: กรณี false (คนละรหัส)
    // ---------------------------------------------------------------
    @Test
    public void testIsCaverphoneEqualFalse() {
        assertTrue(!caverphone.isCaverphoneEqual("Thompson", "Peter"));
    }

    // ---------------------------------------------------------------
    // 23) Property check: ผลลัพธ์ต้องมีความยาว 10 ตัวอักษรเสมอ (ตาม substring(0,10))
    // ---------------------------------------------------------------
    @Test
    public void testCaverphoneResultAlwaysLengthTen() {
        String[] inputs = {null, "", "a", "Thompson", "Peter", "cough",
                "trough", "gnat", "mbob", "low", "whale", "12345"};
        for (String input : inputs) {
            String result = caverphone.caverphone(input);
            assertEquals("length mismatch for input: " + input, 10, result.length());
        }
    }
}
```

## ตารางสรุป Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testCaverphoneNullInput` | `txt == null` → true (short-circuit OR, ไม่ประเมิน `length()`) |
| `testCaverphoneEmptyInput` | `txt == null` → false, `txt.length()==0` → true |
| `testCaverphoneOnlyNonLetterCharacters` | ทั้งสองเงื่อนไข false (เข้า main path) + edge case regex strip เหลือ "" |
| `testCaverphoneSingleVowel` | กฎ `^[aeiou]->A` + ยืนยัน case-sensitivity ของ `[aeiou]->3` |
| `testCaverphoneThompson` | ลำดับ replaceAll ปกติ (s+,t+,p+,m+,n+ เป็นต้น) |
| `testCaverphonePeter` | กฎ `r$->3` และ `3$->A` |
| `testCaverphoneCaseInsensitive` | Step 1 "Convert to lowercase" |
| `testCaverphoneCoughRule` | กฎ `^cough->cou2f` + `c->k` |
| `testCaverphoneRoughRule` | กฎ `^rough->rou2f` + `r3->R3` |
| `testCaverphoneToughRule` | กฎ `^tough->tou2f` + `t+->T` |
| `testCaverphoneEnoughRule` | กฎ `^enough->enou2f` (2.0 only) |
| `testCaverphoneTroughRule` | กฎ `^trough->trou2f`, ยืนยันไม่ชนกับ `^tough` |
| `testCaverphoneGnStartRule` | กฎ `^gn->2n` |
| `testCaverphoneMbStartRule` | กฎ `^mb->m2` |
| `testCaverphoneWEndAndL3Rule` | กฎ `w$->3` (2.0 only), `l3->L3` |
| `testCaverphoneWh3Rule` | กฎ `e$` remove final e, `wh3->Wh3`, `l$->3` |
| `testEncodeObjectWithValidString` | `encode(Object)`: `instanceof String` → true |
| `testEncodeObjectWithNonStringThrowsException` | `encode(Object)`: `!(instanceof String)` → true → throw |
| `testEncodeObjectExceptionMessage` | ตรวจ message ของ `EncoderException` |
| `testEncodeObjectWithNullThrowsException` | Edge case: `pObject == null` → instanceof false → throw |
| `testEncodeStringDelegatesToCaverphone` | `encode(String)` delegate ไปยัง `caverphone(String)` |
| `testEncodeStringNull` | `encode(String)` กับ null |
| `testIsCaverphoneEqualTrue` | `isCaverphoneEqual` กรณี true |
| `testIsCaverphoneEqualFalse` | `isCaverphoneEqual` กรณี false |
| `testCaverphoneResultAlwaysLengthTen` | ตรวจ invariant `substring(0,10)` ในทุก path หลัก |

**หมายเหตุ:** ค่าคาดหวัง (expected string) ทุกค่าได้จากการ trace โค้ดต้นฉบับทีละ `replaceAll` ตามลำดับจริงในซอร์ส ไม่ได้อ้างอิงจากแหล่งอื่น หากมีความคลาดเคลื่อนของค่าใดจากการ trace ด้วยมือ ควร run จริงเพื่อยืนยันก่อนใช้งานจริง