# QuotedPrintableCodecTest.java

```java
package org.apache.commons.codec.net;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

/**
 * JUnit4 tests for {@link QuotedPrintableCodec} (Defects4J: Codec-11b)
 *
 * หมายเหตุ:
 * - ทดสอบเฉพาะ behavior ที่ปรากฏจริงในซอร์สโค้ดที่ให้มา
 * - โค้ดต้นฉบับมี comment กล่าวถึง rule #3 (trailing whitespace must be encoded)
 *   และการข้าม CR/LF ตอน decode แต่ "ไม่มีการ implement จริง" ในซอร์ส
 *   จึงทดสอบ behavior จริง (ไม่ตาม comment) เพื่อดักจับ fault ที่อาจเกิดจาก
 *   ความไม่สอดคล้องระหว่าง comment และ implementation
 */
public class QuotedPrintableCodecTest {

    // ---------- Static encodeQuotedPrintable(BitSet, byte[]) ----------

    @Test
    public void testStaticEncode_NullBytes_ReturnsNull() {
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, null);
        assertNull(result);
    }

    @Test
    public void testStaticEncode_NullPrintable_UsesDefaultPrintableChars() throws Exception {
        // printable == null -> ใช้ PRINTABLE_CHARS ภายใน
        byte[] input = "A=B".getBytes("US-ASCII"); // '=' ต้องถูก encode
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        assertEquals("A=3DB", new String(result, "US-ASCII"));
    }

    @Test
    public void testStaticEncode_CustomBitSet() throws Exception {
        // เฉพาะ 'A' (65) ที่ถือว่า printable, 'B' (66) ต้องถูก encode
        BitSet custom = new BitSet(256);
        custom.set(65);
        byte[] input = { 65, 66 }; // 'A', 'B'
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(custom, input);
        assertEquals("A=42", new String(result, "US-ASCII"));
    }

    @Test
    public void testStaticEncode_BoundaryPrintableChars() throws Exception {
        // ขอบเขตของช่วง 33-60 และ 62-126 รวมถึง TAB(9), SPACE(32)
        byte[] input = { 33, 60, 62, 126, 9, 32 };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        // ทุกไบต์อยู่ใน printable set -> ไม่ถูก encode
        byte[] expected = { 33, 60, 62, 126, 9, 32 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testStaticEncode_NonPrintableBoundaryChars() throws Exception {
        // 61 ('='), 127 (DEL), 8 (BS), 0 (NUL) ไม่อยู่ใน printable set -> ต้องถูก encode
        byte[] input = { 61, 127, 8, 0 };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        assertEquals("=3D=7F=08=00", new String(result, "US-ASCII"));
    }

    @Test
    public void testStaticEncode_NegativeByteValue() throws Exception {
        // byte 0xFF ตีความเป็น -1 ใน Java -> ต้อง convert เป็น 255 (branch b < 0)
        byte[] input = { (byte) 0xFF };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        assertEquals("=FF", new String(result, "US-ASCII"));
    }

    @Test
    public void testStaticEncode_EmptyArray() {
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, new byte[0]);
        assertArrayEquals(new byte[0], result);
    }

    // ---------- Static decodeQuotedPrintable(byte[]) ----------

    @Test
    public void testStaticDecode_NullBytes_ReturnsNull() throws DecoderException {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(null);
        assertNull(result);
    }

    @Test
    public void testStaticDecode_EmptyArray() throws DecoderException {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(new byte[0]);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testStaticDecode_NormalEscape() throws Exception {
        byte[] input = "A=3DB".getBytes("US-ASCII");
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        assertEquals("A=B", new String(result, "US-ASCII"));
    }

    @Test
    public void testStaticDecode_EscapeZero() throws Exception {
        byte[] input = "=00".getBytes("US-ASCII");
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        assertArrayEquals(new byte[] { 0 }, result);
    }

    @Test
    public void testStaticDecode_EscapeFF() throws Exception {
        byte[] input = "=FF".getBytes("US-ASCII");
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        assertArrayEquals(new byte[] { (byte) 0xFF }, result);
    }

    @Test
    public void testStaticDecode_NonEscapeCharsAppendedAsIs_IncludingCRLF() throws Exception {
        // ตรวจสอบ branch "else" -> ทุก byte ที่ไม่ใช่ ESCAPE_CHAR จะถูก append ตรง ๆ
        // (ตาม source จริง ไม่มีการข้าม CR/LF แม้ comment จะบอกว่ามี)
        byte[] input = "A\r\nB".getBytes("US-ASCII");
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        assertArrayEquals(input, result);
    }

    @Test(expected = DecoderException.class)
    public void testStaticDecode_MalformedTrailingEscape_SingleChar() throws Exception {
        // "=" เพียงตัวเดียว -> ArrayIndexOutOfBoundsException ภายใน -> ต้องถูกจับและแปลงเป็น DecoderException
        byte[] input = "=".getBytes("US-ASCII");
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test(expected = DecoderException.class)
    public void testStaticDecode_MalformedTrailingEscape_OnlyOneHexDigit() throws Exception {
        // "=A" มี hex digit เดียว -> ขาด digit ที่สอง -> AIOOBE -> DecoderException
        byte[] input = "=A".getBytes("US-ASCII");
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    // ---------- Instance encode(byte[]) / decode(byte[]) ----------

    @Test
    public void testInstanceEncodeBytes_DelegatesToStatic() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=".getBytes("US-ASCII");
        byte[] result = codec.encode(input);
        assertEquals("=3D", new String(result, "US-ASCII"));
    }

    @Test
    public void testInstanceEncodeBytes_NullReturnsNull() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testInstanceDecodeBytes_DelegatesToStatic() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=3D".getBytes("US-ASCII");
        byte[] result = codec.decode(input);
        assertArrayEquals(new byte[] { '=' }, result);
    }

    @Test
    public void testInstanceDecodeBytes_NullReturnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((byte[]) null));
    }

    // ---------- encode(String) ----------

    @Test
    public void testEncodeString_Null_ReturnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((String) null));
    }

    @Test
    public void testEncodeString_Normal() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("a=b");
        assertEquals("a=3Db", result);
    }

    // ---------- decode(String, String charset) ----------

    @Test
    public void testDecodeStringWithCharset_Null_ReturnsNull() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((String) null, "UTF-8"));
    }

    @Test
    public void testDecodeStringWithCharset_Normal() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("a=3Db", "UTF-8");
        assertEquals("a=b", result);
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testDecodeStringWithCharset_UnsupportedCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode("abc", "UNSUPPORTED-CHARSET-XYZ");
    }

    // ---------- decode(String) default charset ----------

    @Test
    public void testDecodeString_Null_ReturnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testDecodeString_Normal_DefaultCharset() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("a=3Db");
        assertEquals("a=b", result);
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_Null_ReturnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((Object) null));
    }

    @Test
    public void testEncodeObject_ByteArray() throws EncoderException, Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=".getBytes("US-ASCII");
        Object result = codec.encode((Object) input);
        assertArrayEquals("=3D".getBytes("US-ASCII"), (byte[]) result);
    }

    @Test
    public void testEncodeObject_String() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.encode((Object) "a=b");
        assertEquals("a=3Db", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_UnsupportedType_ThrowsEncoderException() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode((Object) Integer.valueOf(1));
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_Null_ReturnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((Object) null));
    }

    @Test
    public void testDecodeObject_ByteArray() throws DecoderException, Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=3D".getBytes("US-ASCII");
        Object result = codec.decode((Object) input);
        assertArrayEquals(new byte[] { '=' }, (byte[]) result);
    }

    @Test
    public void testDecodeObject_String() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.decode((Object) "a=3Db");
        assertEquals("a=b", result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_UnsupportedType_ThrowsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode((Object) Integer.valueOf(1));
    }

    // ---------- getDefaultCharset() / constructors ----------

    @Test
    public void testDefaultConstructor_DefaultCharsetIsUTF8() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    public void testCustomCharsetConstructor() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-16");
        assertEquals("UTF-16", codec.getDefaultCharset());
    }

    // ---------- encode(String, String charset) ----------

    @Test
    public void testEncodeStringWithCharset_Null_ReturnsNull() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((String) null, "UTF-8"));
    }

    @Test
    public void testEncodeStringWithCharset_Normal() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("a=b", "UTF-8");
        assertEquals("a=3Db", result);
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testEncodeStringWithCharset_UnsupportedCharset() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode("abc", "UNSUPPORTED-CHARSET-XYZ");
    }

    // ---------- Round trip test ----------

    @Test
    public void testRoundTrip_EncodeThenDecode() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Hello=World\tTest ";
        String encoded = codec.encode(original);
        String decoded = codec.decode(encoded);
        assertEquals(original, decoded);
    }
}
```

# สรุปตาราง Test Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testStaticEncode_NullBytes_ReturnsNull | `encodeQuotedPrintable`: `bytes == null` → return null |
| testStaticEncode_NullPrintable_UsesDefaultPrintableChars | `printable == null` → ใช้ `PRINTABLE_CHARS`, else-branch encode '=' |
| testStaticEncode_CustomBitSet | ใช้ custom `BitSet` ที่ไม่ใช่ null, if-branch (printable.get) และ else-branch |
| testStaticEncode_BoundaryPrintableChars | ขอบเขต 33,60,62,126,9,32 → if-branch (printable) |
| testStaticEncode_NonPrintableBoundaryChars | ขอบเขต 61,127,8,0 → else-branch (encode) |
| testStaticEncode_NegativeByteValue | branch `b < 0` → `b = 256 + b` |
| testStaticEncode_EmptyArray | loop ไม่ทำงาน (0 iteration) |
| testStaticDecode_NullBytes_ReturnsNull | `decodeQuotedPrintable`: `bytes == null` → return null |
| testStaticDecode_EmptyArray | loop ไม่ทำงาน |
| testStaticDecode_NormalEscape | if-branch `b == ESCAPE_CHAR` สำเร็จ |
| testStaticDecode_EscapeZero / EscapeFF | ทดสอบค่า hex ต่ำสุด/สูงสุด (`0x00`, `0xFF`) |
| testStaticDecode_NonEscapeCharsAppendedAsIs_IncludingCRLF | else-branch (append ตรง ๆ, รวม CR/LF) — ตรวจ fault ที่ comment ไม่ตรงกับ implementation |
| testStaticDecode_MalformedTrailingEscape_SingleChar | try/catch: `ArrayIndexOutOfBoundsException` จาก `++i` ตัวแรก |
| testStaticDecode_MalformedTrailingEscape_OnlyOneHexDigit | try/catch: AIOOBE จาก `++i` ตัวที่สอง |
| testInstanceEncodeBytes_DelegatesToStatic / NullReturnsNull | ทดสอบ `encode(byte[])` เรียก static method ถูกต้อง รวม null |
| testInstanceDecodeBytes_DelegatesToStatic / NullReturnsNull | ทดสอบ `decode(byte[])` เรียก static method ถูกต้อง รวม null |
| testEncodeString_Null_ReturnsNull | `encode(String)`: `pString == null` |
| testEncodeString_Normal | `encode(String)`: try-branch สำเร็จ |
| testDecodeStringWithCharset_Null_ReturnsNull | `decode(String,charset)`: `pString == null` |
| testDecodeStringWithCharset_Normal | `decode(String,charset)`: branch ปกติ |
| testDecodeStringWithCharset_UnsupportedCharset | `UnsupportedEncodingException` ถูก throw ตรง (ไม่ถูกจับใน method นี้) |
| testDecodeString_Null_ReturnsNull | `decode(String)`: `pString == null` |
| testDecodeString_Normal_DefaultCharset | `decode(String)`: try-branch สำเร็จ |
| testEncodeObject_Null_ReturnsNull | `encode(Object)`: `pObject == null` |
| testEncodeObject_ByteArray | `encode(Object)`: `instanceof byte[]` |
| testEncodeObject_String | `encode(Object)`: `instanceof String` |
| testEncodeObject_UnsupportedType_ThrowsEncoderException | `encode(Object)`: else-branch throw `EncoderException` |
| testDecodeObject_Null_ReturnsNull | `decode(Object)`: `pObject == null` |
| testDecodeObject_ByteArray | `decode(Object)`: `instanceof byte[]` |
| testDecodeObject_String | `decode(Object)`: `instanceof String` |
| testDecodeObject_UnsupportedType_ThrowsDecoderException | `decode(Object)`: else-branch throw `DecoderException` |
| testDefaultConstructor_DefaultCharsetIsUTF8 | Default constructor → `CharEncoding.UTF_8` |
| testCustomCharsetConstructor | Constructor พร้อม charset param |
| testEncodeStringWithCharset_Null_ReturnsNull | `encode(String,charset)`: `pString == null` |
| testEncodeStringWithCharset_Normal | `encode(String,charset)`: branch ปกติ |
| testEncodeStringWithCharset_UnsupportedCharset | `UnsupportedEncodingException` ถูก throw ตรง |
| testRoundTrip_EncodeThenDecode | Integration test เพื่อยืนยันความถูกต้องของ encode/decode ร่วมกัน |

**หมายเหตุสำคัญ**: การทดสอบ `testStaticDecode_NonEscapeCharsAppendedAsIs_IncludingCRLF` เป็นการทดสอบ behavior จริงที่อาจขัดแย้งกับ comment ในซอร์ส (comment กล่าวว่า CR/LF ควรถูกข้าม แต่โค้ดจริงไม่มี logic นั้น) — ทดสอบนี้ยึดตาม **implementation จริง** ไม่ใช่ comment เพื่อไม่ให้เดา behavior ที่ไม่มีอยู่จริง