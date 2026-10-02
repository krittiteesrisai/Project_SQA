# วิเคราะห์โครงสร้างโค้ดและ Branch ที่ต้องทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `Soundex` พบ branch/condition หลักที่ต้อง cover:

1. **Constructors**: default, `char[]`, `String`
2. **`encode(Object)`**: `instanceof String` (true/false)
3. **`map()`**: `index < 0 || index >= mapping.length` (true → throw / false)
4. **`getMappingCode()`**: 
   - `index > 1 && mappedChar != '0'`
   - `'H' == hwChar || 'W' == hwChar`
   - `firstCode == mappedChar || 'H' == preHWChar || 'W' == preHWChar`
5. **`soundex()`**:
   - `str == null`
   - `str.length() == 0` (หลัง clean)
   - loop condition `incount < str.length() && count < out.length` (ทั้งสองกรณีที่ทำให้ loop จบ)
   - `mapped != 0`
   - `mapped != '0' && mapped != last`
6. **`getMaxLength`/`setMaxLength`** (deprecated field)
7. **`difference()`** — ใช้ตาม contract ที่ระบุใน Javadoc เท่านั้น (ค่าเท่ากันต้องได้ 4) เพราะ `SoundexUtils` ไม่มีซอร์สโค้ดให้ จึงไม่เดา behavior ส่วนอื่น

> **หมายเหตุสำคัญ:** `SoundexUtils.clean()` ไม่มีซอร์สโค้ดให้ในโจทย์ แต่ถูกเรียกใช้ภายใน `soundex()` ผลลัพธ์ของการ clean (เช่น การลบอักขระที่ไม่ใช่ตัวอักษร, การแปลงเป็นตัวใหญ่) เป็นพฤติกรรมที่ทราบจาก Apache Commons Codec เวอร์ชันจริง แต่**ไม่ได้แสดงในซอร์สที่ให้มา** — จึงกำกับด้วยคอมเมนต์ในโค้ดทดสอบ

```java
package org.apache.commons.codec.language;

import static org.junit.Assert.*;

import org.apache.commons.codec.EncoderException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SoundexTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructorUsesUsEnglishMapping() {
        Soundex s = new Soundex();
        assertEquals("R163", s.encode("Robert"));
    }

    @Test
    public void testCharArrayConstructor() {
        char[] mapping = Soundex.US_ENGLISH_MAPPING_STRING.toCharArray();
        Soundex s = new Soundex(mapping);
        assertEquals("R163", s.encode("Robert"));
    }

    @Test
    public void testStringConstructor() {
        Soundex s = new Soundex(Soundex.US_ENGLISH_MAPPING_STRING);
        assertEquals("R163", s.encode("Robert"));
    }

    @Test
    public void testStaticUsEnglishInstance() {
        assertEquals("R163", Soundex.US_ENGLISH.encode("Robert"));
    }

    // ---------- encode(Object) : instanceof branch ----------

    @Test
    public void testEncodeObjectWithString() throws EncoderException {
        Soundex s = new Soundex();
        Object result = s.encode((Object) "Testing");
        assertEquals("T235", result);
    }

    @Test
    public void testEncodeObjectWithNonStringThrows() {
        Soundex s = new Soundex();
        thrown.expect(EncoderException.class);
        s.encode((Object) Integer.valueOf(1));
    }

    @Test
    public void testEncodeObjectWithNullThrows() {
        // null is not instanceof String -> falls into throw-branch
        Soundex s = new Soundex();
        thrown.expect(EncoderException.class);
        s.encode(null);
    }

    // ---------- encode(String) delegate ----------

    @Test
    public void testEncodeStringDelegatesToSoundex() {
        Soundex s = new Soundex();
        assertEquals("T235", s.encode("Testing"));
    }

    // ---------- soundex(): null / empty ----------

    @Test
    public void testSoundexNullReturnsNull() {
        Soundex s = new Soundex();
        assertNull(s.soundex(null));
    }

    @Test
    public void testSoundexEmptyStringReturnsEmpty() {
        Soundex s = new Soundex();
        assertEquals("", s.soundex(""));
    }

    @Test
    public void testSoundexOnlyNonLetterCharsReturnsEmpty() {
        // อ้างอิง contract ของ SoundexUtils.clean() ตามพฤติกรรมจริงของ Apache Commons Codec
        // (ซอร์สโค้ด SoundexUtils ไม่ได้ให้มาในโจทย์นี้)
        Soundex s = new Soundex();
        assertEquals("", s.soundex("   123!!!"));
    }

    // ---------- soundex(): normal cases / loop boundary ----------

    @Test
    public void testSoundexRobert() {
        Soundex s = new Soundex();
        assertEquals("R163", s.soundex("Robert"));
    }

    @Test
    public void testSoundexRupert() {
        Soundex s = new Soundex();
        assertEquals("R163", s.soundex("Rupert"));
    }

    @Test
    public void testSoundexTesting() {
        Soundex s = new Soundex();
        assertEquals("T235", s.soundex("Testing"));
    }

    @Test
    public void testSoundexShortWord_LoopEndsByStringExhausted() {
        // "Lee": loop จบเพราะ incount == str.length() ก่อนที่ count จะครบ 4
        Soundex s = new Soundex();
        assertEquals("L000", s.soundex("Lee"));
    }

    @Test
    public void testSoundexLoopEndsByCountLimit() {
        // "BCDFG": ทุกตัวอักษรให้ code ต่างกันจนครบ 4 ตัวก่อนตัวอักษรสุดท้าย(G) จะถูกประมวลผล
        // -> ทดสอบ branch count < out.length เป็นตัวหยุด loop ขณะ incount ยังไม่หมด
        Soundex s = new Soundex();
        assertEquals("B231", s.soundex("BCDFG"));
    }

    @Test
    public void testSoundexRepeatedSameCodeIgnored() {
        // "Pfister": P และ F มี code เดียวกันติดกัน -> ทดสอบ mapped != last (false branch)
        Soundex s = new Soundex();
        assertEquals("P236", s.soundex("Pfister"));
    }

    @Test
    public void testSoundexTymczak() {
        // ทดสอบ mapped == last ทำให้ไม่ add ซ้ำ (Z ตามหลัง C ซึ่ง map เดียวกัน)
        Soundex s = new Soundex();
        assertEquals("T522", s.soundex("Tymczak"));
    }

    // ---------- getMappingCode() : HW rule branches ----------

    @Test
    public void testSoundexAshcraft_HWRule_FirstCodeEqualsMapped() {
        // ทดสอบ branch: index>1 && mappedChar!='0' && hwChar=='H'
        // และ firstCode == mappedChar -> return 0 (ตัดออกจาก encoding)
        Soundex s = new Soundex();
        assertEquals("A261", s.soundex("Ashcraft"));
    }

    @Test
    public void testSoundexHWRule_PreHWCharIsH() {
        // สร้างคำสังเคราะห์ "AHHS" เพื่อทดสอบ branch:
        // hwChar=='H' และ preHWChar=='H' (แม้ firstCode != mappedChar)
        // ไม่ใช่คำภาษาอังกฤษจริง แต่ใช้ตรวจ logic branch โดยเฉพาะ
        Soundex s = new Soundex();
        assertEquals("A000", s.soundex("AHHS"));
    }

    @Test
    public void testSoundexHWRule_PreHWCharIsW() {
        // เช่นเดียวกับข้างบนแต่ทดสอบ branch preHWChar=='W'
        Soundex s = new Soundex();
        assertEquals("A000", s.soundex("AWWS"));
    }

    @Test
    public void testSoundexHWRule_HwCharNotHOrW() {
        // ทดสอบ branch: mappedChar!='0' แต่ hwChar ไม่ใช่ H/W -> ข้าม HW check
        // "ABCD": B,C,D ไม่มี H/W คั่นกลาง
        Soundex s = new Soundex();
        assertEquals("A123", s.soundex("ABCD"));
    }

    @Test
    public void testSoundexIndexNotGreaterThanOne_NoHwCheck() {
        // index=0,1 -> เงื่อนไข index>1 เป็น false เสมอ, ทดสอบผ่าน "AB..."
        Soundex s = new Soundex();
        String result = s.soundex("AB");
        assertNotNull(result);
        assertEquals('A', result.charAt(0));
    }

    // ---------- map(): IllegalArgumentException branch ----------

    @Test
    public void testMapThrowsWhenIndexOutOfMappingBounds() {
        // ใช้ mapping สั้นกว่า 26 ตัวเพื่อให้ index >= mapping.length -> throw
        Soundex s = new Soundex(new char[] {'0', '1', '2'}); // เฉพาะ A,B,C ที่ map ได้
        thrown.expect(IllegalArgumentException.class);
        s.encode("Zebra"); // 'Z' -> index=25 >= mapping.length(3)
    }

    @Test
    public void testMapWorksWithinCustomMappingBounds() {
        Soundex s = new Soundex(new char[] {'0', '1', '2'});
        // A,B,C map ได้ปกติ ไม่ throw
        String result = s.encode("ABC");
        assertNotNull(result);
    }

    // ---------- getMaxLength / setMaxLength (deprecated, ไม่ถูกใช้ใน logic จริง) ----------

    @Test
    public void testDefaultMaxLengthIsFour() {
        Soundex s = new Soundex();
        assertEquals(4, s.getMaxLength());
    }

    @Test
    public void testSetAndGetMaxLength() {
        Soundex s = new Soundex();
        s.setMaxLength(10);
        assertEquals(10, s.getMaxLength());
        // หมายเหตุ: ตาม Javadoc ระบุว่า field นี้ไม่ได้ถูกใช้จริงใน soundex()
        // จึงไม่คาดหวังว่าผลลัพธ์ของ soundex() จะเปลี่ยนตาม maxLength
        assertEquals("R163", s.soundex("Robert"));
    }

    // ---------- difference() : เฉพาะ behavior ที่ระบุใน Javadoc เท่านั้น ----------

    @Test
    public void testDifferenceIdenticalWordsReturnsFour() throws EncoderException {
        // ตาม Javadoc: "4 indicates strong similarity or identical values"
        Soundex s = new Soundex();
        assertEquals(4, s.difference("Robert", "Robert"));
    }

    @Test
    public void testDifferenceDoesNotThrowForNormalStrings() throws EncoderException {
        // ทดสอบเพียงว่าเรียกใช้งานได้ตามปกติ ไม่ยืนยันค่าเจาะจง
        // เนื่องจากไม่มีซอร์สโค้ดของ SoundexUtils.difference ให้ตรวจสอบ logic ภายใน
        Soundex s = new Soundex();
        int diff = s.difference("Green", "Greene");
        assertTrue(diff >= 0 && diff <= 4);
    }
}
```

# สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ทดสอบ |
|---|---|
| `testDefaultConstructorUsesUsEnglishMapping` | Constructor `Soundex()` |
| `testCharArrayConstructor` | Constructor `Soundex(char[])` |
| `testStringConstructor` | Constructor `Soundex(String)` |
| `testStaticUsEnglishInstance` | static field `US_ENGLISH` |
| `testEncodeObjectWithString` | `encode(Object)`: `instanceof String` = true |
| `testEncodeObjectWithNonStringThrows` | `encode(Object)`: `instanceof String` = false → throw |
| `testEncodeObjectWithNullThrows` | `encode(Object)`: null → not instanceof → throw |
| `testEncodeStringDelegatesToSoundex` | `encode(String)` delegate |
| `testSoundexNullReturnsNull` | `soundex()`: `str == null` = true |
| `testSoundexEmptyStringReturnsEmpty` | `soundex()`: `str.length() == 0` = true (ก่อน clean) |
| `testSoundexOnlyNonLetterCharsReturnsEmpty` | `soundex()`: `str.length() == 0` = true (หลัง clean) |
| `testSoundexRobert` / `testSoundexRupert` | flow ปกติทั้ง loop, `getMappingCode` index 0/1 |
| `testSoundexTesting` | flow ปกติ |
| `testSoundexShortWord_LoopEndsByStringExhausted` | loop จบด้วย `incount < str.length()` = false |
| `testSoundexLoopEndsByCountLimit` | loop จบด้วย `count < out.length` = false |
| `testSoundexRepeatedSameCodeIgnored` | `mapped != '0' && mapped != last` = false (ค่าซ้ำ) |
| `testSoundexTymczak` | `mapped == last` ไม่ add ซ้ำ, ผลรวมหลาย branch |
| `testSoundexAshcraft_HWRule_FirstCodeEqualsMapped` | HW rule: `firstCode == mappedChar` = true → return 0 |
| `testSoundexHWRule_PreHWCharIsH` | HW rule: `'H' == preHWChar` = true |
| `testSoundexHWRule_PreHWCharIsW` | HW rule: `'W' == preHWChar` = true |
| `testSoundexHWRule_HwCharNotHOrW` | `'H'==hwChar \|\| 'W'==hwChar` = false |
| `testSoundexIndexNotGreaterThanOne_NoHwCheck` | `index > 1` = false |
| `testMapThrowsWhenIndexOutOfMappingBounds` | `map()`: `index >= mapping.length` = true → throw |
| `testMapWorksWithinCustomMappingBounds` | `map()`: index อยู่ในขอบเขต = false (ไม่ throw) |
| `testDefaultMaxLengthIsFour` | `getMaxLength()` default |
| `testSetAndGetMaxLength` | `setMaxLength()` / `getMaxLength()` |
| `testDifferenceIdenticalWordsReturnsFour` | `difference()` ตาม contract Javadoc |
| `testDifferenceDoesNotThrowForNormalStrings` | `difference()` เรียกใช้งานได้ปกติ (ไม่ยืนยัน internal logic ที่ไม่มีซอร์ส) |

**หมายเหตุ:** branch `index < 0` ใน `map()` ไม่สามารถทดสอบผ่าน public API ได้ เนื่องจาก `SoundexUtils.clean()` (ไม่มีซอร์สโค้ดให้) คาดว่าแปลงเป็นตัวอักษรใหญ่ A-Z เสมอก่อนเรียก `map()` จึงไม่ได้เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา behavior