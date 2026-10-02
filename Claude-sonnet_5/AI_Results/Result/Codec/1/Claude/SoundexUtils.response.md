# วิเคราะห์ Branch/Condition ของ SoundexUtils

**Method `clean(String str)`**
- `str == null` → true/false
- `str.length() == 0` → true/false
- loop: `Character.isLetter(...)` → true/false (ต่ออักขระ)
- `count == len` → true/false (เลือก return path)

**Method `difference(StringEncoder, s1, s2)`**
- delegate ไปยัง `differenceEncoded` (ต้องทดสอบ encoder สำเร็จ, encoder คืน null, encoder throw EncoderException)

**Method `differenceEncoded(es1, es2)`**
- `es1 == null || es2 == null` → true (es1 null / es2 null / ทั้งคู่ null) / false
- loop: `lengthToMatch` = min length (es1 สั้นกว่า/es2 สั้นกว่า/เท่ากัน/เป็น 0)
- ภายใน loop: `es1.charAt(i) == es2.charAt(i)` → true/false

---

```java
package org.apache.commons.codec.language;

import static org.junit.Assert.*;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Test;

/**
 * Unit tests สำหรับ SoundexUtils (package-private class ใน commons-codec)
 * ทดสอบครอบคลุม branch/condition ที่วิเคราะห์ได้จากซอร์สโค้ดเท่านั้น
 */
public class SoundexUtilsTest {

    // ==================== clean(String) ====================

    @Test
    public void testCleanNull() {
        // branch: str == null -> true
        assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testCleanEmptyString() {
        // branch: str.length() == 0 -> true
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testCleanAllLetters_CountEqualsLen() {
        // loop: isLetter true ทุกตัว, branch: count == len -> true (return str.toUpperCase())
        assertEquals("ABCDEF", SoundexUtils.clean("abcdef"));
    }

    @Test
    public void testCleanAlreadyUpperCase() {
        // count == len เช่นกัน แต่ input เป็นตัวใหญ่อยู่แล้ว
        assertEquals("ABC", SoundexUtils.clean("ABC"));
    }

    @Test
    public void testCleanMixedLettersAndDigits_CountNotEqualsLen() {
        // loop: isLetter true/false ผสมกัน, branch: count == len -> false
        assertEquals("ABC", SoundexUtils.clean("a1b2c3"));
    }

    @Test
    public void testCleanNoLetters() {
        // loop: isLetter false ทุกตัว -> count = 0, branch count==len -> false
        assertEquals("", SoundexUtils.clean("12345"));
    }

    @Test
    public void testCleanSingleLetter() {
        // boundary: length = 1, isLetter true, count==len -> true
        assertEquals("A", SoundexUtils.clean("a"));
    }

    @Test
    public void testCleanWithSpacesAndPunctuation() {
        // loop ผสม isLetter true/false หลายจุด
        assertEquals("HELLOWORLD", SoundexUtils.clean("Hello, World!"));
    }

    // ==================== differenceEncoded(String,String) ====================

    @Test
    public void testDifferenceEncodedBothNull() {
        // branch: es1==null || es2==null -> true (ทั้งคู่ null)
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncodedFirstNull() {
        // branch: es1==null -> true
        assertEquals(0, SoundexUtils.differenceEncoded(null, "ABC"));
    }

    @Test
    public void testDifferenceEncodedSecondNull() {
        // branch: es2==null -> true
        assertEquals(0, SoundexUtils.differenceEncoded("ABC", null));
    }

    @Test
    public void testDifferenceEncodedBothEmpty() {
        // branch: es1==null||es2==null -> false, lengthToMatch=0 -> loop ไม่ทำงาน
        assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    @Test
    public void testDifferenceEncodedOneEmptyOneNonEmpty() {
        // boundary: lengthToMatch = min(0, 3) = 0 -> loop ไม่ทำงาน
        assertEquals(0, SoundexUtils.differenceEncoded("", "ABC"));
    }

    @Test
    public void testDifferenceEncodedIdenticalStrings() {
        // loop: charAt เท่ากันทุกตัว -> diff = length เต็ม
        assertEquals(4, SoundexUtils.differenceEncoded("W123", "W123"));
    }

    @Test
    public void testDifferenceEncodedNoMatch() {
        // loop: charAt ไม่เท่ากันทุกตัว -> diff = 0
        assertEquals(0, SoundexUtils.differenceEncoded("ABCD", "WXYZ"));
    }

    @Test
    public void testDifferenceEncodedPartialMatch() {
        // loop: บางตัวเท่ากันบางตัวไม่เท่ากัน
        // W123 vs W124 -> index0 W=W, index1 1=1, index2 2=2, index3 3!=4 => diff=3
        assertEquals(3, SoundexUtils.differenceEncoded("W123", "W124"));
    }

    @Test
    public void testDifferenceEncodedEs1Shorter() {
        // boundary: lengthToMatch = length(es1) เพราะ es1 สั้นกว่า
        // "W1" vs "W123" -> lengthToMatch=2, index0 W=W, index1 1=1 => diff=2
        assertEquals(2, SoundexUtils.differenceEncoded("W1", "W123"));
    }

    @Test
    public void testDifferenceEncodedEs2Shorter() {
        // boundary: lengthToMatch = length(es2) เพราะ es2 สั้นกว่า
        // "W123" vs "W" -> lengthToMatch=1, index0 W=W => diff=1
        assertEquals(1, SoundexUtils.differenceEncoded("W123", "W"));
    }

    // ==================== difference(StringEncoder, String, String) ====================

    @Test
    public void testDifferenceDelegatesToDifferenceEncoded() throws EncoderException {
        // ทดสอบว่า difference() เรียก encoder แล้วส่งผลลัพธ์ไปยัง differenceEncoded อย่างถูกต้อง
        StringEncoder fakeEncoder = new StringEncoder() {
            @Override
            public Object encode(Object obj) throws EncoderException {
                return encode((String) obj);
            }

            @Override
            public String encode(String str) throws EncoderException {
                if ("s1".equals(str)) {
                    return "W123";
                } else if ("s2".equals(str)) {
                    return "W124";
                }
                return str;
            }
        };
        // เหมือน test partial match ด้านบน -> diff=3
        assertEquals(3, SoundexUtils.difference(fakeEncoder, "s1", "s2"));
    }

    @Test
    public void testDifferenceWithIdenticalEncodedResults() throws EncoderException {
        StringEncoder fakeEncoder = new StringEncoder() {
            @Override
            public Object encode(Object obj) throws EncoderException {
                return encode((String) obj);
            }

            @Override
            public String encode(String str) throws EncoderException {
                return "SAME";
            }
        };
        assertEquals(4, SoundexUtils.difference(fakeEncoder, "anything1", "anything2"));
    }

    @Test
    public void testDifferenceWithNullEncodedResult() throws EncoderException {
        // encoder คืนค่า null -> differenceEncoded ต้อง return 0 จาก null-check branch
        StringEncoder nullEncoder = new StringEncoder() {
            @Override
            public Object encode(Object obj) throws EncoderException {
                return null;
            }

            @Override
            public String encode(String str) throws EncoderException {
                return null;
            }
        };
        assertEquals(0, SoundexUtils.difference(nullEncoder, "s1", "s2"));
    }

    @Test(expected = EncoderException.class)
    public void testDifferencePropagatesEncoderException() throws EncoderException {
        // ทดสอบว่า EncoderException จาก encoder ถูก propagate ออกมา
        StringEncoder throwingEncoder = new StringEncoder() {
            @Override
            public Object encode(Object obj) throws EncoderException {
                throw new EncoderException("forced failure");
            }

            @Override
            public String encode(String str) throws EncoderException {
                throw new EncoderException("forced failure");
            }
        };
        SoundexUtils.difference(throwingEncoder, "s1", "s2");
    }
}
```

---

## สรุปตาราง Test Case กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCleanNull` | `clean`: `str == null` → true |
| `testCleanEmptyString` | `clean`: `str.length()==0` → true |
| `testCleanAllLetters_CountEqualsLen` | `clean`: loop `isLetter` true ทุกตัว, `count==len` → true |
| `testCleanAlreadyUpperCase` | `clean`: `count==len` → true (input ตัวใหญ่อยู่แล้ว) |
| `testCleanMixedLettersAndDigits_CountNotEqualsLen` | `clean`: loop `isLetter` true/false ผสม, `count==len` → false |
| `testCleanNoLetters` | `clean`: loop `isLetter` false ทุกตัว, `count==len` → false (count=0) |
| `testCleanSingleLetter` | `clean`: boundary length=1, `count==len` → true |
| `testCleanWithSpacesAndPunctuation` | `clean`: loop ผสม isLetter true/false หลายรอบ |
| `testDifferenceEncodedBothNull` | `differenceEncoded`: `es1==null\|\|es2==null` → true (ทั้งคู่) |
| `testDifferenceEncodedFirstNull` | `differenceEncoded`: `es1==null` → true |
| `testDifferenceEncodedSecondNull` | `differenceEncoded`: `es2==null` → true |
| `testDifferenceEncodedBothEmpty` | `differenceEncoded`: null-check false, `lengthToMatch=0` loop ไม่ทำงาน |
| `testDifferenceEncodedOneEmptyOneNonEmpty` | `differenceEncoded`: boundary lengthToMatch=0 |
| `testDifferenceEncodedIdenticalStrings` | `differenceEncoded`: loop charAt equal ทุกตัว |
| `testDifferenceEncodedNoMatch` | `differenceEncoded`: loop charAt not-equal ทุกตัว |
| `testDifferenceEncodedPartialMatch` | `differenceEncoded`: loop ผสม equal/not-equal |
| `testDifferenceEncodedEs1Shorter` | `differenceEncoded`: boundary es1 สั้นกว่า es2 |
| `testDifferenceEncodedEs2Shorter` | `differenceEncoded`: boundary es2 สั้นกว่า es1 |
| `testDifferenceDelegatesToDifferenceEncoded` | `difference`: เรียก encoder สำเร็จ + delegate ไป differenceEncoded (partial match) |
| `testDifferenceWithIdenticalEncodedResults` | `difference`: encoder คืนค่าเดียวกัน → diff เต็ม |
| `testDifferenceWithNullEncodedResult` | `difference`: encoder คืน null → เข้า null-check branch ใน differenceEncoded |
| `testDifferencePropagatesEncoderException` | `difference`: encoder throw `EncoderException` ถูก propagate |

**หมายเหตุ:** ใช้ anonymous `StringEncoder` แทนการพึ่งพา `Soundex`/`RefinedSoundex` จริง เพื่อให้ทดสอบ `difference()` แบบ isolate จาก encoder implementation อื่น และควบคุมผลลัพธ์ encode ได้ตรงกับที่ต้องการทดสอบแต่ละ branch อย่างชัดเจน ไม่มีการเดา behavior ที่ไม่ปรากฏในซอร์สโค้ดที่ให้มา