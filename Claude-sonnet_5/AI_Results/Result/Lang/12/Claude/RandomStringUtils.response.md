# วิเคราะห์ Branch/Condition ของ RandomStringUtils

จากการวิเคราะห์เมธอดหลัก `random(int, int, int, boolean, boolean, char[], Random)` พบ branch สำคัญดังนี้:
1. `count == 0` → return `""`
2. `count < 0` → throw `IllegalArgumentException`
3. `start==0 && end==0` → แยกเป็น `(!letters && !numbers)` (ใช้ MAX_VALUE) กับ else (ใช้ ASCII printable range)
4. `chars == null` vs `chars != null` (ภายใน loop)
5. เงื่อนไขหลักในการรับ/ปฏิเสธอักขระ: `letters&&isLetter || numbers&&isDigit || !letters&&!numbers`
6. ภายในกรณีที่ยอมรับ: ตรวจ surrogate ranges 3 ช่วง (low/high/private) แต่ละช่วงมี sub-branch `count==0` vs `count!=0`
7. กรณี else ปกติ (ไม่ surrogate)

เนื่องจาก default `Random` ควบคุมค่าไม่ได้ จึงใช้ **EasyMock** สร้าง mock ของ `java.util.Random` (ผ่าน cglib) เพื่อบังคับค่า `nextInt(...)` ให้ครอบคลุมทุก branch ของ surrogate handling อย่างแม่นยำ และยืนยัน behavior ด้วยการ trace โค้ดด้วยมือ (ไม่ใช่การเดา)

```java
package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import org.easymock.EasyMock;
import java.util.Random;

public class RandomStringUtilsTest {

    // ---------- Boundary tests: count == 0 / count < 0 ----------

    @Test
    public void testRandom_CountZero_ReturnsEmptyString() {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_CountNegative_ThrowsException() {
        RandomStringUtils.random(-1);
    }

    @Test
    public void testRandom_CountZero_FullSignature() {
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, null, new Random()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_CountNegative_FullSignature() {
        RandomStringUtils.random(-5, 0, 0, false, false, null, new Random());
    }

    // ---------- start==0 && end==0 branch split ----------

    @Test
    public void testRandom_StartEndZero_LettersNumbersFalse_UsesFullUnicodeRange() {
        // covers: start==0 && end==0 && !letters && !numbers -> end = Integer.MAX_VALUE
        String result = RandomStringUtils.random(10, false, false);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_StartEndZero_LettersTrue_UsesAsciiPrintableRange() {
        // covers: start==0 && end==0 && (letters||numbers) -> start=' ', end='z'+1
        String result = RandomStringUtils.randomAlphabetic(20);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void testRandomNumeric_AllDigits() {
        String result = RandomStringUtils.randomNumeric(15);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomAlphanumeric_AllLettersOrDigits() {
        String result = RandomStringUtils.randomAlphanumeric(15);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomAscii_RangeCheck() {
        String result = RandomStringUtils.randomAscii(15);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 32 && c < 127);
        }
    }

    @Test
    public void testConstructor_IsPublic() {
        RandomStringUtils rsu = new RandomStringUtils();
        assertNotNull(rsu);
    }

    // ---------- chars==null vs chars!=null (public overloads) ----------

    @Test
    public void testRandom_CharsNullString_UsesDefaultRange() {
        String result = RandomStringUtils.random(5, (String) null);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_CharsProvidedAsString() {
        String result = RandomStringUtils.random(5, "abc");
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test
    public void testRandom_CharArrayNull() {
        String result = RandomStringUtils.random(5, (char[]) null);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_CharArrayProvided() {
        char[] chars = {'x', 'y', 'z'};
        String result = RandomStringUtils.random(5, chars);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandomConvenienceOverload_StartEndCharsLettersNumbers() {
        // covers the 6-arg varargs convenience overload
        char[] chars = {'A', 'B', 'C'};
        String result = RandomStringUtils.random(5, 0, chars.length, true, false, chars);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'A' || c == 'B' || c == 'C');
        }
    }

    @Test
    public void testRandomConvenienceOverload_StartEndLettersNumbersOnly() {
        // covers the 5-arg overload random(count,start,end,letters,numbers) -> chars=null
        String result = RandomStringUtils.random(5, 'a', 'z' + 1, true, false);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    // ---------- Edge-case: empty chars array/string -> ArrayIndexOutOfBoundsException ----------
    // หมายเหตุ: เมื่อ chars เป็น array ที่ว่าง (length 0) start/end จะกลายเป็น 0/0 แล้วเข้าสู่สาขา
    // "!letters && !numbers" -> end = Integer.MAX_VALUE แต่ chars array ยังว่างอยู่
    // ทำให้ chars[idx] ต้อง throw AIOOBE เสมอ ไม่ว่า random จะสุ่มค่าอะไร (deterministic)

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRandom_EmptyCharsString_ThrowsAIOOBE() {
        RandomStringUtils.random(5, "");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRandom_EmptyCharArray_ThrowsAIOOBE() {
        RandomStringUtils.random(5, new char[0]);
    }

    // ---------- Mocked-Random: deep branch coverage (surrogate handling) ----------

    @Test
    public void testRandom_LowSurrogate_CountZeroBranch() {
        // chars[0]=low surrogate(DC00), chars[1]='A'
        // ครั้งที่ 1: count==0 ภายใน body -> พบ low surrogate -> count++ (retry)
        // ครั้งที่ 2: เลือกตัวอักษรปกติเพื่อจบ loop
        char[] chars = { '\uDC00', 'A' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(0);
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(1);
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, mockRandom);

        assertEquals(1, result.length());
        assertEquals('A', result.charAt(0));
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_LowSurrogate_CountNotZeroBranch() {
        // chars[0]=low surrogate เท่านั้น, count เริ่มที่ 2 เพื่อให้ count!=0 ตอนพบ surrogate
        char[] chars = { '\uDC00' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(1)).andReturn(0);   // เลือก low surrogate
        EasyMock.expect(mockRandom.nextInt(128)).andReturn(0); // สร้าง high surrogate คู่กัน
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(2, 0, 1, false, false, chars, mockRandom);

        assertEquals(2, result.length());
        assertEquals('\uDC00', result.charAt(1)); // low surrogate เดิมอยู่ตำแหน่งหลัง
        char high = result.charAt(0);
        assertTrue(high >= 0xD800 && high <= 0xD800 + 127); // high surrogate ที่สร้างขึ้น
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_HighSurrogate_CountZeroBranch() {
        char[] chars = { '\uD800', 'A' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(0); // high surrogate, count==0 -> retry
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(1); // ตัวอักษรปกติเพื่อจบ loop
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, mockRandom);

        assertEquals(1, result.length());
        assertEquals('A', result.charAt(0));
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_HighSurrogate_CountNotZeroBranch() {
        char[] chars = { '\uD800' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(1)).andReturn(0);
        EasyMock.expect(mockRandom.nextInt(128)).andReturn(0);
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(2, 0, 1, false, false, chars, mockRandom);

        assertEquals(2, result.length());
        assertEquals('\uD800', result.charAt(0)); // high surrogate เดิมอยู่ตำแหน่งแรก
        char low = result.charAt(1);
        assertTrue(low >= 0xDC00 && low <= 0xDC00 + 127);
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_PrivateHighSurrogate_Skipped() {
        // ช่วง 56192..56319 (DB80..DBFF) ถูก skip เสมอ ไม่ว่า count จะเป็นอะไร
        char[] chars = { '\uDB80', 'A' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(0); // private high surrogate -> skip
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(1); // ตัวอักษรปกติเพื่อจบ loop
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, mockRandom);

        assertEquals(1, result.length());
        assertEquals('A', result.charAt(0));
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_ConditionFalse_RetryUntilLetterFound() {
        // letters=true,numbers=false: '1' ไม่ผ่านเงื่อนไข -> count++ retry, 'A' ผ่าน -> accepted
        char[] chars = { '1', 'A' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(0); // '1' ถูกปฏิเสธ
        EasyMock.expect(mockRandom.nextInt(2)).andReturn(1); // 'A' ถูกยอมรับ
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 0, 2, true, false, chars, mockRandom);

        assertEquals(1, result.length());
        assertEquals('A', result.charAt(0));
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_NormalCharacter_NoSurrogateHandling() {
        // กรณี else ปกติ: ch ไม่ตกใน surrogate range ใดๆ
        char[] chars = { 'Z' };
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(1)).andReturn(0);
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 0, 1, false, false, chars, mockRandom);
        assertEquals("Z", result);
        EasyMock.verify(mockRandom);
    }

    @Test
    public void testRandom_NullCharsArray_UsesCharCastDirectly() {
        // covers: chars==null -> ch = (char)(random.nextInt(gap)+start)
        Random mockRandom = EasyMock.createMock(Random.class);
        EasyMock.expect(mockRandom.nextInt(1)).andReturn(0);
        EasyMock.replay(mockRandom);

        String result = RandomStringUtils.random(1, 65, 66, false, false, null, mockRandom);
        assertEquals("A", result);
        EasyMock.verify(mockRandom);
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเมธอดทดสอบครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testRandom_CountZero_ReturnsEmptyString` / `_FullSignature` | `count == 0` → return `""` |
| `testRandom_CountNegative_ThrowsException` / `_FullSignature` | `count < 0` → throw `IllegalArgumentException` |
| `testRandom_StartEndZero_LettersNumbersFalse_UsesFullUnicodeRange` | `start==0&&end==0 && !letters&&!numbers` → `end=MAX_VALUE` |
| `testRandom_StartEndZero_LettersTrue_UsesAsciiPrintableRange` | `start==0&&end==0` (else) → `start=' ', end='z'+1` |
| `testRandomNumeric_AllDigits` | loop condition `numbers&&isDigit(ch)` true path |
| `testRandomAlphanumeric_AllLettersOrDigits` | loop condition `letters||numbers` combined true path |
| `testRandomAscii_RangeCheck` | ตรวจช่วงอักขระ ASCII ตาม spec |
| `testConstructor_IsPublic` | public constructor coverage |
| `testRandom_CharsNullString_UsesDefaultRange` | `random(count,String)` → `chars==null` branch |
| `testRandom_CharsProvidedAsString` | `random(count,String)` → `chars!=null` branch |
| `testRandom_CharArrayNull` | `random(count,char...)` → `chars==null` branch |
| `testRandom_CharArrayProvided` | `random(count,char...)` → `chars!=null` branch |
| `testRandomConvenienceOverload_StartEndCharsLettersNumbers` | overload 6-arg (`random(count,start,end,letters,numbers,chars)`) |
| `testRandomConvenienceOverload_StartEndLettersNumbersOnly` | overload 5-arg (`random(count,start,end,letters,numbers)`) |
| `testRandom_EmptyCharsString_ThrowsAIOOBE` / `_EmptyCharArray_ThrowsAIOOBE` | edge-case: array ว่าง → `ArrayIndexOutOfBoundsException` |
| `testRandom_LowSurrogate_CountZeroBranch` | ch∈[56320,57343] และ `count==0` → `count++` |
| `testRandom_LowSurrogate_CountNotZeroBranch` | ch∈[56320,57343] และ `count!=0` → สร้าง high surrogate คู่ |
| `testRandom_HighSurrogate_CountZeroBranch` | ch∈[55296,56191] และ `count==0` → `count++` |
| `testRandom_HighSurrogate_CountNotZeroBranch` | ch∈[55296,56191] และ `count!=0` → สร้าง low surrogate คู่ |
| `testRandom_PrivateHighSurrogate_Skipped` | ch∈[56192,56319] → skip เสมอ (`count++`) |
| `testRandom_ConditionFalse_RetryUntilLetterFound` | เงื่อนไขหลัก false → `else { count++ }` |
| `testRandom_NormalCharacter_NoSurrogateHandling` | ch ไม่ตก surrogate range ใด ๆ → `else { buffer[count]=ch }` |
| `testRandom_NullCharsArray_UsesCharCastDirectly` | loop: `chars==null` → คำนวณ ch จาก cast โดยตรง |

**หมายเหตุสำคัญ:** ทุก test ที่ใช้ mock `Random` ได้ trace ลำดับการทำงานของ loop ด้วยมือตามซอร์สโค้ดจริง ไม่มีการสมมติ behavior ที่ไม่ปรากฏในโค้ด ส่วน test ที่ใช้ `RANDOM` จริง (ไม่ mock) ได้เลือก assertion ที่เป็น **invariant** ที่ถูกต้องเสมอไม่ว่าค่าสุ่มจะเป็นเท่าใด (เช่น ความยาวผลลัพธ์ และสมาชิกต้องอยู่ในเซ็ตที่กำหนด)