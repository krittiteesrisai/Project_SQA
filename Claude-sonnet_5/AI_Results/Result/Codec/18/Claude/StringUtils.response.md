# StringUtilsTest.java

```java
package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.junit.Test;

/**
 * JUnit 4 tests for org.apache.commons.codec.binary.StringUtils (Codec-18b)
 *
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
public class StringUtilsTest {

    // ------------------------------------------------------------------
    // equals(CharSequence, CharSequence)
    // ------------------------------------------------------------------

    @Test
    public void testEquals_bothNull() {
        // cs1 == cs2 (ทั้งคู่เป็น null) -> true
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_sameReference() {
        String s = "abc";
        // cs1 == cs2 (reference เดียวกัน) -> true
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEquals_firstNullSecondNotNull() {
        // cs1 == null, cs2 != null -> false
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_firstNotNullSecondNull() {
        // cs1 != null, cs2 == null -> false
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_bothStringEqual() {
        // ทั้งคู่เป็น String instance และเท่ากัน
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_bothStringNotEqual() {
        // ทั้งคู่เป็น String instance แต่ไม่เท่ากัน (case-sensitive)
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEquals_nonStringCharSequenceEqual() {
        // ไม่ใช่ String ทั้งคู่ (StringBuilder) -> ใช้ CharSequenceUtils.regionMatches
        CharSequence cs1 = new StringBuilder("hello");
        CharSequence cs2 = new StringBuilder("hello");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_nonStringCharSequenceNotEqual() {
        CharSequence cs1 = new StringBuilder("hello");
        CharSequence cs2 = new StringBuilder("world");
        assertFalse(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_mixedTypeOneStringOneNot() {
        // cs1 เป็น String, cs2 เป็น StringBuilder -> ไม่ใช่ทั้งคู่เป็น String
        // จะตกไปที่ regionMatches branch
        CharSequence cs1 = "hello";
        CharSequence cs2 = new StringBuilder("hello");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_differentLengthNonString() {
        // ความยาวต่างกัน ผ่าน regionMatches path
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("abcdef");
        assertFalse(StringUtils.equals(cs1, cs2));
    }

    // ------------------------------------------------------------------
    // getBytesUnchecked(String, String) - private getBytes ผ่าน public wrapper
    // ------------------------------------------------------------------

    @Test
    public void testGetBytesUnchecked_nullString() {
        // string == null -> return null
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUnchecked_validCharset() {
        byte[] result = StringUtils.getBytesUnchecked("abc", "UTF-8");
        assertArrayEquals("abc".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        // UnsupportedEncodingException ถูก catch แล้ว rethrow เป็น IllegalStateException
        try {
            StringUtils.getBytesUnchecked("abc", "INVALID-CHARSET-NAME");
            fail("ควรเกิด IllegalStateException");
        } catch (IllegalStateException e) {
            // คาดหวังผ่าน
            assertTrue(e.getMessage().contains("INVALID-CHARSET-NAME"));
        }
    }

    // ------------------------------------------------------------------
    // newString(byte[], String) - public overload with charsetName
    // ------------------------------------------------------------------

    @Test
    public void testNewString_nullBytes() {
        // bytes == null -> return null
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewString_validCharset() {
        byte[] bytes = "hello".getBytes(Charset.forName("UTF-8"));
        String result = StringUtils.newString(bytes, "UTF-8");
        assertEquals("hello", result);
    }

    @Test
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        byte[] bytes = "hello".getBytes();
        try {
            StringUtils.newString(bytes, "INVALID-CHARSET-NAME");
            fail("ควรเกิด IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("INVALID-CHARSET-NAME"));
        }
    }

    // ------------------------------------------------------------------
    // getBytesXxx wrapper methods (private getBytes(string, Charset))
    // ------------------------------------------------------------------

    @Test
    public void testGetBytesIso8859_1_null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("ISO-8859-1"));
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1("test"));
    }

    @Test
    public void testGetBytesUsAscii_null() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("US-ASCII"));
        assertArrayEquals(expected, StringUtils.getBytesUsAscii("test"));
    }

    @Test
    public void testGetBytesUtf16_null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("UTF-16"));
        assertArrayEquals(expected, StringUtils.getBytesUtf16("test"));
    }

    @Test
    public void testGetBytesUtf16Be_null() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("UTF-16BE"));
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be("test"));
    }

    @Test
    public void testGetBytesUtf16Le_null() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("UTF-16LE"));
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le("test"));
    }

    @Test
    public void testGetBytesUtf8_null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_notNull() {
        byte[] expected = "test".getBytes(Charset.forName("UTF-8"));
        assertArrayEquals(expected, StringUtils.getBytesUtf8("test"));
    }

    // ------------------------------------------------------------------
    // getByteBufferUtf8 (private getByteBuffer(string, Charset))
    // ------------------------------------------------------------------

    @Test
    public void testGetByteBufferUtf8_null() {
        // string == null -> return null
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_notNull() {
        ByteBuffer bb = StringUtils.getByteBufferUtf8("test");
        assertArrayEquals("test".getBytes(Charset.forName("UTF-8")), bb.array());
    }

    // ------------------------------------------------------------------
    // newStringXxx wrapper methods (private newString(bytes, Charset))
    // ------------------------------------------------------------------

    @Test
    public void testNewStringIso8859_1_null() {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringIso8859_1_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("ISO-8859-1"));
        assertEquals("test", StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringUsAscii_null() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("US-ASCII"));
        assertEquals("test", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16_null() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16"));
        assertEquals("test", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16Be_null() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16BE"));
        assertEquals("test", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Le_null() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16LE"));
        assertEquals("test", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8_null() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_notNull() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-8"));
        assertEquals("test", StringUtils.newStringUtf8(bytes));
    }

    // ------------------------------------------------------------------
    // Boundary case: empty string / empty byte array
    // ------------------------------------------------------------------

    @Test
    public void testGetBytesUtf8_emptyString() {
        // boundary: empty string ไม่ใช่ null
        byte[] result = StringUtils.getBytesUtf8("");
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testNewStringUtf8_emptyByteArray() {
        // boundary: empty byte array ไม่ใช่ null
        String result = StringUtils.newStringUtf8(new byte[0]);
        assertEquals("", result);
    }

    @Test
    public void testEquals_emptyStrings() {
        // boundary: empty string ทั้งคู่ (เป็น String instance -> equals branch)
        assertTrue(StringUtils.equals("", ""));
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEquals_bothNull` | `equals`: `cs1 == cs2` เป็น true (ทั้งคู่ null) |
| `testEquals_sameReference` | `equals`: `cs1 == cs2` เป็น true (reference เดียวกัน, ไม่ null) |
| `testEquals_firstNullSecondNotNull` | `equals`: `cs1 == null` true, ผ่าน `cs1==cs2` false ก่อน |
| `testEquals_firstNotNullSecondNull` | `equals`: `cs2 == null` true |
| `testEquals_bothStringEqual` | `equals`: ทั้งคู่เป็น `instanceof String`, `.equals()` true |
| `testEquals_bothStringNotEqual` | `equals`: ทั้งคู่เป็น `instanceof String`, `.equals()` false |
| `testEquals_nonStringCharSequenceEqual` | `equals`: ไม่ใช่ String ทั้งคู่ → `regionMatches` true |
| `testEquals_nonStringCharSequenceNotEqual` | `equals`: ไม่ใช่ String ทั้งคู่ → `regionMatches` false |
| `testEquals_mixedTypeOneStringOneNot` | `equals`: เงื่อนไข `instanceof String && instanceof String` เป็น false (mixed type) → ตก regionMatches |
| `testEquals_differentLengthNonString` | `equals`: regionMatches กับความยาวต่างกัน (Math.max branch) |
| `testGetBytesUnchecked_nullString` | `getBytesUnchecked`: `string == null` true |
| `testGetBytesUnchecked_validCharset` | `getBytesUnchecked`: try block สำเร็จ (ไม่ throw) |
| `testGetBytesUnchecked_invalidCharset_throwsIllegalStateException` | `getBytesUnchecked`: catch `UnsupportedEncodingException` → `newIllegalStateException` |
| `testNewString_nullBytes` | `newString(byte[],String)`: `bytes == null` true |
| `testNewString_validCharset` | `newString(byte[],String)`: try สำเร็จ |
| `testNewString_invalidCharset_throwsIllegalStateException` | `newString(byte[],String)`: catch exception path |
| `testGetBytesIso8859_1_null/notNull` | private `getBytes`: `string==null` true/false (ผ่าน wrapper ISO-8859-1) |
| `testGetBytesUsAscii_null/notNull` | private `getBytes`: null/non-null (US-ASCII) |
| `testGetBytesUtf16_null/notNull` | private `getBytes`: null/non-null (UTF-16) |
| `testGetBytesUtf16Be_null/notNull` | private `getBytes`: null/non-null (UTF-16BE) |
| `testGetBytesUtf16Le_null/notNull` | private `getBytes`: null/non-null (UTF-16LE) |
| `testGetBytesUtf8_null/notNull` | private `getBytes`: null/non-null (UTF-8) |
| `testGetByteBufferUtf8_null/notNull` | private `getByteBuffer`: `string==null` true/false |
| `testNewStringIso8859_1_null/notNull` | private `newString(byte[],Charset)`: `bytes==null` true/false |
| `testNewStringUsAscii_null/notNull` | private `newString`: null/non-null (US-ASCII) |
| `testNewStringUtf16_null/notNull` | private `newString`: null/non-null (UTF-16) |
| `testNewStringUtf16Be_null/notNull` | private `newString`: null/non-null (UTF-16BE) |
| `testNewStringUtf16Le_null/notNull` | private `newString`: null/non-null (UTF-16LE) |
| `testNewStringUtf8_null/notNull` | private `newString`: null/non-null (UTF-8) |
| `testGetBytesUtf8_emptyString` | boundary: empty string (ไม่ null, length=0) |
| `testNewStringUtf8_emptyByteArray` | boundary: empty byte array (ไม่ null, length=0) |
| `testEquals_emptyStrings` | boundary: empty String equals empty String (via String.equals branch) |

**หมายเหตุ:**
- ทุก wrapper method (`getBytesIso8859_1`, `getBytesUsAscii`, ฯลฯ) เรียก private `getBytes`/`newString` ที่มี branch เดียว (`null` check) ซึ่งถูกทดสอบผ่านทุก public wrapper เพื่อยืนยันว่าแต่ละ wrapper ส่ง Charset ที่ถูกต้อง และครอบคลุม branch null-check ของ private method
- ไม่ได้เขียนเทสสำหรับ `newIllegalStateException` โดยตรงเนื่องจากเป็น private method — ทดสอบผ่าน public methods ที่เรียกใช้แทน (`getBytesUnchecked`, `newString(byte[],String)`)
- ไม่มีการเดา behavior เพิ่มเติมนอกจากที่ระบุใน source/javadoc