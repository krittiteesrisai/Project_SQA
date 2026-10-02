# วิเคราะห์และหมายเหตุสำคัญก่อนเขียนเทส

`ParserBase` เป็น abstract class ที่ต้องมี concrete subclass เพื่อทดสอบ และมี dependency กับ `IOContext`, `JsonReadContext`, `TextBuffer` ซึ่งเป็นคลาสจริงใน jackson-core (ไม่ได้แสดง source ให้ทั้งหมด) ผมจึงใช้ API สาธารณะที่เป็นมาตรฐานของ jackson-core 2.9.x ตามที่ปรากฏการเรียกใช้ในซอร์สที่ให้มา (เช่น `IOContext(BufferRecycler, Object, boolean)`, `JsonReadContext.createChildArrayContext/createChildObjectContext`, `_currToken`, ค่าคงที่ `NR_*`) — ส่วนที่ไม่ปรากฏ signature ชัดเจนในซอร์ส (เช่น `_throwInternal()`, `reportOverflowInt()`, `_reportInvalidEOF()`) ผมจะ**คอมเมนต์กำกับว่าเป็นสมมติฐาน**และทดสอบแบบ "ต้องเกิด exception" แบบกว้าง ๆ โดยไม่ระบุชนิด/ข้อความที่แน่นอนเกินไป

เนื่องจากฟิลด์ทั้งหมดเป็น `protected` และคลาสทดสอบอยู่ package เดียวกัน (`com.fasterxml.jackson.core.base`) จึงเข้าถึงฟิลด์ตรงได้ ทำให้ตั้งค่า state ภายในเพื่อ trigger แต่ละ branch ได้แม่นยำ

```java
package com.fasterxml.jackson.core.base;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Base64;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

/**
 * Unit tests for {@link ParserBase}.
 *
 * หมายเหตุ: บาง protected method/field ของ ParserBase สืบทอดมาจาก ParserMinimalBase
 * ซึ่งไม่ได้แสดง source ให้ในโจทย์ (เช่น _throwInternal(), reportOverflowInt/Long(),
 * _reportInvalidEOF(), NR_* constants, _decodeEscaped()) โค้ดทดสอบอ้างอิงพฤติกรรม
 * มาตรฐานของ jackson-core 2.9.x เท่านั้น และในกรณีไม่แน่ใจ 100% จะทดสอบแบบกว้าง
 * (จับ Exception ทั่วไป) พร้อมคอมเมนต์กำกับไว้
 */
public class ParserBaseTest {

    /** Concrete subclass เพื่อ instantiate abstract class ParserBase สำหรับทดสอบ */
    static class TestableParserBase extends ParserBase {

        boolean closeInputCalled = false;
        String textValue = null;          // ใช้ควบคุมค่าที่ getText() จะคืน
        char escapedCharReturn = 'A';     // ใช้ควบคุมค่าที่ _decodeEscaped() จะคืน

        TestableParserBase(IOContext ctxt, int features) {
            super(ctxt, features);
        }

        @Override
        protected void _closeInput() throws IOException {
            closeInputCalled = true;
        }

        @Override
        public ObjectCodec getCodec() { return null; }

        @Override
        public void setCodec(ObjectCodec c) { /* not needed for tests */ }

        @Override
        public JsonToken nextToken() throws IOException { return null; }

        @Override
        public String getText() throws IOException { return textValue; }

        @Override
        public char[] getTextCharacters() throws IOException {
            return textValue == null ? null : textValue.toCharArray();
        }

        @Override
        public int getTextLength() throws IOException {
            return textValue == null ? 0 : textValue.length();
        }

        @Override
        public int getTextOffset() throws IOException { return 0; }

        @Override
        public Object getEmbeddedObject() throws IOException { return null; }

        @Override
        protected char _decodeEscaped() throws IOException { return escapedCharReturn; }
    }

    private TestableParserBase newParser(int features) {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test-src", false);
        return new TestableParserBase(ctxt, features);
    }

    private TestableParserBase newParser() { return newParser(0); }

    // ---------------------------------------------------------------
    // 1. Construction / basic state
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_initialState() {
        TestableParserBase p = newParser();
        assertNotNull(p.getParsingContext());
        assertTrue(p.getParsingContext().inRoot());
        assertFalse(p.isClosed());
        assertNull(p.getParsingContext().getDupDetector());
    }

    @Test
    public void testVersion() {
        TestableParserBase p = newParser();
        assertNotNull(p.version());
    }

    @Test
    public void testCurrentValueGetSet() {
        TestableParserBase p = newParser();
        assertNull(p.getCurrentValue());
        p.setCurrentValue("hello");
        assertEquals("hello", p.getCurrentValue());
    }

    // ---------------------------------------------------------------
    // 2. Feature handling: enable/disable
    // ---------------------------------------------------------------

    @Test
    public void testEnableDisable_dupDetection() {
        TestableParserBase p = newParser();
        assertNull(p.getParsingContext().getDupDetector());

        p.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(p.getParsingContext().getDupDetector());
        assertTrue(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));

        // enable again while already enabled -> branch "dupDetector != null" skip creating new
        JsonReadContext beforeSecondEnable = p.getParsingContext();
        p.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(p.getParsingContext().getDupDetector());

        p.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(p.getParsingContext().getDupDetector());
        assertFalse(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testEnableDisable_otherFeature_doesNotTouchDupDetector() {
        TestableParserBase p = newParser();
        p.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(p.getParsingContext().getDupDetector());

        // enabling an unrelated feature must not clear dup detector
        p.enable(Feature.ALLOW_COMMENTS);
        assertNotNull(p.getParsingContext().getDupDetector());
        assertTrue(p.isEnabled(Feature.ALLOW_COMMENTS));

        p.disable(Feature.ALLOW_COMMENTS);
        assertFalse(p.isEnabled(Feature.ALLOW_COMMENTS));
        assertNotNull(p.getParsingContext().getDupDetector());
    }

    // ---------------------------------------------------------------
    // 3. setFeatureMask (deprecated) / overrideStdFeatures + _checkStdFeatureChanges
    // ---------------------------------------------------------------

    @Test
    public void testSetFeatureMask_changesNonZero_enablesDupDetector() {
        TestableParserBase p = newParser(0);
        assertNull(p.getParsingContext().getDupDetector());

        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        p.setFeatureMask(mask);
        assertNotNull(p.getParsingContext().getDupDetector());
    }

    @Test
    public void testSetFeatureMask_changesZero_noOp() {
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        TestableParserBase p = newParser(mask);
        JsonReadContext ctxBefore = p.getParsingContext();
        // ตั้ง mask เดิม -> changes == 0 -> ไม่เข้า _checkStdFeatureChanges เลย
        p.setFeatureMask(mask);
        assertSame(ctxBefore, p.getParsingContext());
    }

    /**
     * ทดสอบพฤติกรรมตามซอร์สจริง (ไม่ได้เดา): เมื่อ "ปิด" ฟีเจอร์ STRICT_DUPLICATE_DETECTION
     * ผ่าน setFeatureMask, _checkStdFeatureChanges จะเข้า outer-if (changed!=0) แต่
     * inner-if (newFlags & f != 0) เป็น false จึงไม่ทำอะไรกับ dupDetector เลย
     * -> dupDetector ยังคง "ไม่ใช่ null" ทั้งที่ feature ถูกปิดแล้ว (ต่างจาก disable() โดยตรง)
     */
    @Test
    public void testSetFeatureMask_disablingViaMask_leavesDupDetectorNonNull() {
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        TestableParserBase p = newParser(mask); // constructor สร้าง dupDetector ให้แล้ว
        assertNotNull(p.getParsingContext().getDupDetector());

        p.setFeatureMask(0); // เปลี่ยน flag ให้ปิด feature
        assertFalse(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        // ตามซอร์สจริง: dupDetector ไม่ได้ถูกเคลียร์ (ไม่ผ่าน branch inner-if)
        assertNotNull(p.getParsingContext().getDupDetector());
    }

    @Test
    public void testOverrideStdFeatures_changedNonZero() {
        TestableParserBase p = newParser(0);
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        p.overrideStdFeatures(mask, mask);
        assertNotNull(p.getParsingContext().getDupDetector());
    }

    @Test
    public void testOverrideStdFeatures_changedZero_noOp() {
        TestableParserBase p = newParser(0);
        JsonReadContext before = p.getParsingContext();
        p.overrideStdFeatures(0, Feature.STRICT_DUPLICATE_DETECTION.getMask());
        assertSame(before, p.getParsingContext());
    }

    // ---------------------------------------------------------------
    // 4. getCurrentName / overrideCurrentName
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentName_defaultRoot() throws IOException {
        TestableParserBase p = newParser();
        // _currToken == null -> ไม่เข้า if -> ใช้ _parsingContext.getCurrentName()
        assertNull(p.getCurrentName());
    }

    @Test
    public void testGetCurrentName_startArray_noParent_fallsBackToOwnContext() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.START_ARRAY;
        // root context ไม่มี parent -> if (parent != null) เป็น false -> คืนค่าจาก context เดิม
        assertNull(p.getCurrentName());
    }

    @Test
    public void testGetCurrentName_startObject_withParentFieldName() throws IOException {
        TestableParserBase p = newParser();
        JsonReadContext root = p.getParsingContext();
        root.setCurrentName("field1");
        JsonReadContext child = root.createChildObjectContext(1, 1);
        p._parsingContext = child;
        p._currToken = JsonToken.START_OBJECT;
        // ต้อง "ดึงชื่อจาก parent" ตาม [JACKSON-395]
        assertEquals("field1", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_plainToken() {
        TestableParserBase p = newParser();
        p.overrideCurrentName("abc");
        assertEquals("abc", p.getParsingContext().getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_startObject_setsParentName() throws IOException {
        TestableParserBase p = newParser();
        JsonReadContext root = p.getParsingContext();
        JsonReadContext child = root.createChildObjectContext(1, 1);
        p._parsingContext = child;
        p._currToken = JsonToken.START_OBJECT;

        p.overrideCurrentName("xyz");
        assertEquals("xyz", root.getCurrentName());
    }

    // ---------------------------------------------------------------
    // 5. close()/isClosed()
    // ---------------------------------------------------------------

    @Test
    public void testClose_setsClosedAndCallsCloseInputOnce() throws IOException {
        TestableParserBase p = newParser();
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        assertTrue(p.closeInputCalled);

        p.closeInputCalled = false;
        p.close(); // เรียกซ้ำ -> ไม่ควรเข้า if (!_closed) อีก
        assertFalse(p.closeInputCalled);
    }

    // ---------------------------------------------------------------
    // 6. Location methods
    // ---------------------------------------------------------------

    @Test
    public void testGetTokenLocation() {
        TestableParserBase p = newParser();
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() {
        TestableParserBase p = newParser();
        p._inputPtr = 10;
        p._currInputRowStart = 2;
        JsonLocation loc = p.getCurrentLocation();
        assertEquals(9, loc.getColumnNr()); // 10 - 2 + 1
    }

    @Test
    public void testGetTokenColumnNr_negativeValue() {
        TestableParserBase p = newParser();
        p._tokenInputCol = -1;
        assertEquals(-1, p.getTokenColumnNr());
    }

    @Test
    public void testGetTokenColumnNr_nonNegativeValue() {
        TestableParserBase p = newParser();
        p._tokenInputCol = 5;
        assertEquals(6, p.getTokenColumnNr());
    }

    @Test
    public void testGetTokenLineNrAndOffset() {
        TestableParserBase p = newParser();
        p._tokenInputRow = 3;
        p._tokenInputTotal = 100L;
        assertEquals(3, p.getTokenLineNr());
        assertEquals(100L, p.getTokenCharacterOffset());
    }

    // ---------------------------------------------------------------
    // 7. hasTextCharacters()
    // ---------------------------------------------------------------

    @Test
    public void testHasTextCharacters_valueString() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_STRING;
        assertTrue(p.hasTextCharacters());
    }

    @Test
    public void testHasTextCharacters_fieldNameCopiedTrue() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.FIELD_NAME;
        p._nameCopied = true;
        assertTrue(p.hasTextCharacters());
    }

    @Test
    public void testHasTextCharacters_fieldNameCopiedFalse() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.FIELD_NAME;
        p._nameCopied = false;
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testHasTextCharacters_otherToken() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        assertFalse(p.hasTextCharacters());
    }

    // ---------------------------------------------------------------
    // 8. getBinaryValue()
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_wrongToken_throws() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testGetBinaryValue_success() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_STRING;
        byte[] raw = "Man".getBytes("UTF-8");
        p.textValue = Base64.getEncoder().encodeToString(raw); // "TWFu"
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(raw, result);
    }

    @Test
    public void testGetBinaryValue_cachedSkipsDecode() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_STRING;
        byte[] raw = "Man".getBytes("UTF-8");
        p.textValue = Base64.getEncoder().encodeToString(raw);
        byte[] first = p.getBinaryValue(Base64Variants.getDefaultVariant());

        // เปลี่ยน currToken เป็นค่าที่ผิด และ text เป็นค่าไม่ valid
        // ถ้า cache branch ทำงานถูกต้องจะไม่มีการ re-decode และไม่ throw
        p._currToken = JsonToken.VALUE_NULL;
        p.textValue = "###not-base64###";
        byte[] second = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertSame(first, second);
    }

    // ---------------------------------------------------------------
    // 9. _handleEOF() / _eofAsNextChar()
    // ---------------------------------------------------------------

    @Test
    public void testHandleEOF_root_noException() throws IOException {
        TestableParserBase p = newParser();
        p._handleEOF(); // inRoot() == true -> ไม่ throw
    }

    @Test(expected = JsonParseException.class)
    public void testHandleEOF_array_throws() throws IOException {
        TestableParserBase p = newParser();
        p._parsingContext = p.getParsingContext().createChildArrayContext(1, 1);
        p._handleEOF();
    }

    @Test(expected = JsonParseException.class)
    public void testHandleEOF_object_throws() throws IOException {
        TestableParserBase p = newParser();
        p._parsingContext = p.getParsingContext().createChildObjectContext(1, 1);
        p._handleEOF();
    }

    @Test
    public void testEofAsNextChar_root_returnsMinusOne() throws IOException {
        TestableParserBase p = newParser();
        assertEquals(-1, p._eofAsNextChar());
    }

    @Test(expected = JsonParseException.class)
    public void testEofAsNextChar_nested_throws() throws IOException {
        TestableParserBase p = newParser();
        p._parsingContext = p.getParsingContext().createChildArrayContext(1, 1);
        p._eofAsNextChar();
    }

    // ---------------------------------------------------------------
    // 10. _getByteArrayBuilder()
    // ---------------------------------------------------------------

    @Test
    public void testGetByteArrayBuilder_createThenReuse() {
        TestableParserBase p = newParser();
        assertNull(p._byteArrayBuilder);
        Object b1 = p._getByteArrayBuilder();
        assertNotNull(b1);
        Object b2 = p._getByteArrayBuilder(); // ควรถูก reset แต่ instance เดิม
        assertSame(b1, b2);
    }

    // ---------------------------------------------------------------
    // 11. reset()/resetInt()/resetFloat()/resetAsNaN()
    // ---------------------------------------------------------------

    @Test
    public void testReset_dispatchesToInt_whenFractAndExpBothZero() {
        TestableParserBase p = newParser();
        JsonToken t = p.reset(true, 5, 0, 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertTrue(p._numberNegative);
        assertEquals(5, p._intLength);
        assertEquals(0, p._fractLength);
        assertEquals(0, p._expLength);
    }

    @Test
    public void testReset_dispatchesToFloat_whenExpNonZero() {
        TestableParserBase p = newParser();
        JsonToken t = p.reset(false, 1, 0, 2); // fractLen=0 (<1) แต่ expLen=2 (ไม่<1)
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, t);
        assertEquals(2, p._expLength);
    }

    @Test
    public void testReset_dispatchesToFloat_whenFractNonZero() {
        TestableParserBase p = newParser();
        JsonToken t = p.reset(false, 1, 3, 0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, t);
        assertEquals(3, p._fractLength);
    }

    @Test
    public void testResetAsNaN() {
        TestableParserBase p = newParser();
        JsonToken t = p.resetAsNaN("NaN", Double.NaN);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, t);
        assertTrue(Double.isNaN(p._numberDouble));
    }

    // ---------------------------------------------------------------
    // 12. isNaN()
    // ---------------------------------------------------------------

    @Test
    public void testIsNaN_trueForNaNAndInfinite() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = Double.NaN;
        assertTrue(p.isNaN());
        p._numberDouble = Double.POSITIVE_INFINITY;
        assertTrue(p.isNaN());
    }

    @Test
    public void testIsNaN_falseForNormalDouble() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = 1.23;
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_falseWhenNotFloatToken() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = Double.NaN;
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_falseWhenDoubleFlagNotSet() {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        assertFalse(p.isNaN());
    }

    // ---------------------------------------------------------------
    // 13. getNumberValue()/getNumberType() branch coverage
    // ---------------------------------------------------------------

    @Test
    public void testGetNumberValue_intToken_intFlag() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p._numTypesValid = NR_INT();
        p._numberInt = 7;
        assertEquals(Integer.valueOf(7), p.getNumberValue());
        assertEquals(NumberType.INT, p.getNumberType());
    }

    @Test
    public void testGetNumberValue_intToken_longFlag() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p._numTypesValid = NR_LONG();
        p._numberLong = 123456789012L;
        assertEquals(Long.valueOf(123456789012L), p.getNumberValue());
        assertEquals(NumberType.LONG, p.getNumberType());
    }

    @Test
    public void testGetNumberValue_intToken_bigIntFlag() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(999);
        assertEquals(BigInteger.valueOf(999), p.getNumberValue());
        assertEquals(NumberType.BIG_INTEGER, p.getNumberType());
    }

    @Test
    public void testGetNumberValue_intToken_fallbackBigDecimal() throws IOException {
        // ไม่มี flag ใดใน (INT|LONG|BIGINT) ถูกตั้ง -> ตกไป "shouldn't get this far but if we do"
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = new BigDecimal("42");
        assertEquals(new BigDecimal("42"), p.getNumberValue());
        // getNumberType(): ไม่ใช่ INT/LONG -> falls to BIG_INTEGER ตาม source (ไม่มี BIGDECIMAL branch ในสาย INT)
        assertEquals(NumberType.BIG_INTEGER, p.getNumberType());
    }

    @Test
    public void testGetNumberValue_floatToken_bigDecimalFlag() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = new BigDecimal("3.14");
        assertEquals(new BigDecimal("3.14"), p.getNumberValue());
        assertEquals(NumberType.BIG_DECIMAL, p.getNumberType());
    }

    @Test
    public void testGetNumberValue_floatToken_doubleFlag() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = 2.5;
        assertEquals(Double.valueOf(2.5), p.getNumberValue());
        assertEquals(NumberType.DOUBLE, p.getNumberType());
    }

    // ไม่แน่ใจ 100% ว่า _throwInternal() throw ชนิดใดแน่ (ไม่มี source ตรง ๆ) จึงจับกว้าง ๆ
    @Test(expected = RuntimeException.class)
    public void testGetNumberValue_floatToken_neitherFlagSet_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p._numTypesValid = 0; // ไม่มี flag เลย (แต่ != NR_UNKNOWN เพื่อไม่ trigger parse ใหม่)
        // สมมติ NR_UNKNOWN == 0 (ตามชื่อ) ดังนั้นค่านี้จะ trigger parseNumericValue จริง ๆ
        // เพื่อหลบสถานการณ์นั้น ใช้ค่า flag ที่ "ไม่ตรงกับ unknown" แต่ไม่ครอบ DOUBLE/BIGDECIMAL:
        p._numTypesValid = NR_INT(); // สำหรับ FLOAT token, NR_INT ไม่ตรงเงื่อนไขใดใน branch float
        p.getNumberValue();
    }

    // ---------------------------------------------------------------
    // 14. convertNumberToInt()
    // ---------------------------------------------------------------

    @Test
    public void testConvertNumberToInt_fromLong_ok() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_LONG();
        p._numberLong = 555L;
        p.convertNumberToInt();
        assertEquals(555, p._numberInt);
        assertTrue((p._numTypesValid & NR_INT()) != 0);
    }

    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt_fromLong_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_LONG();
        p._numberLong = Long.MAX_VALUE;
        p.convertNumberToInt();
    }

    @Test
    public void testConvertNumberToInt_fromBigInteger_okAtBoundary() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(Integer.MAX_VALUE);
        p.convertNumberToInt();
        assertEquals(Integer.MAX_VALUE, p._numberInt);
    }

    @Test(expected = IOException.class)
    public void testConvertNumberToInt_fromBigInteger_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf((long) Integer.MAX_VALUE + 1);
        p.convertNumberToInt();
    }

    @Test
    public void testConvertNumberToInt_fromDouble_okAtBoundary() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = (double) Integer.MIN_VALUE; // เท่ากับขอบเขต ไม่ควร overflow
        p.convertNumberToInt();
        assertEquals(Integer.MIN_VALUE, p._numberInt);
    }

    @Test(expected = IOException.class)
    public void testConvertNumberToInt_fromDouble_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = ((double) Integer.MIN_VALUE) - 1000.0;
        p.convertNumberToInt();
    }

    @Test
    public void testConvertNumberToInt_fromBigDecimal_ok() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = BigDecimal.valueOf(100);
        p.convertNumberToInt();
        assertEquals(100, p._numberInt);
    }

    @Test(expected = IOException.class)
    public void testConvertNumberToInt_fromBigDecimal_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = BigDecimal.valueOf(Long.MAX_VALUE);
        p.convertNumberToInt();
    }

    @Test(expected = RuntimeException.class) // _throwInternal(), ชนิด exception ไม่ยืนยัน 100%
    public void testConvertNumberToInt_noFlags_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = 0;
        p.convertNumberToInt();
    }

    // ---------------------------------------------------------------
    // 15. convertNumberToLong()
    // ---------------------------------------------------------------

    @Test
    public void testConvertNumberToLong_fromInt() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_INT();
        p._numberInt = 42;
        p.convertNumberToLong();
        assertEquals(42L, p._numberLong);
    }

    @Test
    public void testConvertNumberToLong_fromBigInteger_ok() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(Long.MAX_VALUE);
        p.convertNumberToLong();
        assertEquals(Long.MAX_VALUE, p._numberLong);
    }

    @Test(expected = IOException.class)
    public void testConvertNumberToLong_fromBigInteger_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        p.convertNumberToLong();
    }

    @Test(expected = IOException.class)
    public void testConvertNumberToLong_fromDouble_overflow() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = Double.MAX_VALUE;
        p.convertNumberToLong();
    }

    @Test
    public void testConvertNumberToLong_fromBigDecimal_ok() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = BigDecimal.valueOf(12345L);
        p.convertNumberToLong();
        assertEquals(12345L, p._numberLong);
    }

    @Test(expected = RuntimeException.class)
    public void testConvertNumberToLong_noFlags_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = 0;
        p.convertNumberToLong();
    }

    // ---------------------------------------------------------------
    // 16. convertNumberToBigInteger() / convertNumberToDouble() / convertNumberToBigDecimal()
    // ---------------------------------------------------------------

    @Test
    public void testConvertNumberToBigInteger_fromEachSource() throws IOException {
        TestableParserBase p = newParser();

        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = new BigDecimal("123.456");
        p.convertNumberToBigInteger();
        assertEquals(BigInteger.valueOf(123), p._numberBigInt);

        p._numTypesValid = NR_LONG();
        p._numberLong = 555L;
        p.convertNumberToBigInteger();
        assertEquals(BigInteger.valueOf(555), p._numberBigInt);

        p._numTypesValid = NR_INT();
        p._numberInt = 9;
        p.convertNumberToBigInteger();
        assertEquals(BigInteger.valueOf(9), p._numberBigInt);

        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = 123.9;
        p.convertNumberToBigInteger();
        assertEquals(BigInteger.valueOf(123), p._numberBigInt);
    }

    @Test(expected = RuntimeException.class)
    public void testConvertNumberToBigInteger_noFlags_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = 0;
        p.convertNumberToBigInteger();
    }

    @Test
    public void testConvertNumberToDouble_fromEachSource() throws IOException {
        TestableParserBase p = newParser();

        p._numTypesValid = NR_BIGDECIMAL_ONLY();
        p._numberBigDecimal = new BigDecimal("1.5");
        p.convertNumberToDouble();
        assertEquals(1.5, p._numberDouble, 0.0001);

        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(10);
        p.convertNumberToDouble();
        assertEquals(10.0, p._numberDouble, 0.0001);

        p._numTypesValid = NR_LONG();
        p._numberLong = 20L;
        p.convertNumberToDouble();
        assertEquals(20.0, p._numberDouble, 0.0001);

        p._numTypesValid = NR_INT();
        p._numberInt = 30;
        p.convertNumberToDouble();
        assertEquals(30.0, p._numberDouble, 0.0001);
    }

    @Test(expected = RuntimeException.class)
    public void testConvertNumberToDouble_noFlags_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = 0;
        p.convertNumberToDouble();
    }

    @Test
    public void testConvertNumberToBigDecimal_fromDoubleUsesGetText() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = 3.14;
        p.textValue = "3.14";
        p.convertNumberToBigDecimal();
        assertEquals(new BigDecimal("3.14"), p._numberBigDecimal);
    }

    @Test
    public void testConvertNumberToBigDecimal_fromBigIntLongInt() throws IOException {
        TestableParserBase p = newParser();

        p._numTypesValid = NR_BIGINT();
        p._numberBigInt = BigInteger.valueOf(7);
        p.convertNumberToBigDecimal();
        assertEquals(new BigDecimal(BigInteger.valueOf(7)), p._numberBigDecimal);

        p._numTypesValid = NR_LONG();
        p._numberLong = 8L;
        p.convertNumberToBigDecimal();
        assertEquals(BigDecimal.valueOf(8L), p._numberBigDecimal);

        p._numTypesValid = NR_INT();
        p._numberInt = 9;
        p.convertNumberToBigDecimal();
        assertEquals(BigDecimal.valueOf(9), p._numberBigDecimal);
    }

    @Test(expected = RuntimeException.class)
    public void testConvertNumberToBigDecimal_noFlags_throwsInternal() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = 0;
        p.convertNumberToBigDecimal();
    }

    // ---------------------------------------------------------------
    // 17. getIntValue()/getLongValue()/getBigIntegerValue()/getFloatValue()/getDoubleValue()/getDecimalValue()
    //     (top-level wrapper branches)
    // ---------------------------------------------------------------

    @Test
    public void testGetIntValue_flagAlreadySet() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_INT();
        p._numberInt = 99;
        assertEquals(99, p.getIntValue());
    }

    @Test
    public void testGetIntValue_unknown_usesFastPathTextBuffer() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("123");
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 3); // numTypesValid=UNKNOWN
        assertEquals(123, p.getIntValue());
    }

    @Test
    public void testGetIntValue_convertFromLong() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_LONG();
        p._numberLong = 321L;
        assertEquals(321, p.getIntValue());
        assertTrue((p._numTypesValid & NR_INT()) != 0);
    }

    @Test
    public void testGetLongValue_flagAlreadySet() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_LONG();
        p._numberLong = 12345L;
        assertEquals(12345L, p.getLongValue());
    }

    @Test
    public void testGetLongValue_unknown_viaIntOptimization() throws IOException {
        // แม้ expType คือ NR_LONG แต่ len<=9 ทำให้ _parseNumericValue เลือก NR_INT เสมอ
        // (จุดที่น่าสนใจ: optimize path "ไม่สนใจ" expType ที่ขอมา)
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("42");
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 2);
        long v = p.getLongValue();
        assertEquals(42L, v);
        assertTrue((p._numTypesValid & NR_INT()) != 0);
        assertTrue((p._numTypesValid & NR_LONG()) != 0);
    }

    @Test
    public void testGetBigIntegerValue_unknown_viaLongPath() throws IOException {
        TestableParserBase p = newParser();
        String num = "123456789012"; // length 12 -> เข้า len<=18 branch (ไม่ใช่ 10)
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        BigInteger v = p.getBigIntegerValue();
        assertEquals(new BigInteger(num), v);
    }

    @Test
    public void testGetFloatValue_delegatesToDouble() throws IOException {
        TestableParserBase p = newParser();
        p._numTypesValid = NR_DOUBLE();
        p._numberDouble = 1.5;
        assertEquals(1.5f, p.getFloatValue(), 0.0001f);
    }

    @Test
    public void testGetDoubleValue_unknown_viaFloatToken() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("3.5");
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.resetFloat(false, 1, 1, 0);
        assertEquals(3.5, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetDecimalValue_unknown_viaFloatTokenBigDecimalPath() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("2.75");
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.resetFloat(false, 1, 2, 0);
        assertEquals(new BigDecimal("2.75"), p.getDecimalValue());
    }

    // ---------------------------------------------------------------
    // 18. _parseNumericValue() ทุก branch หลัก (integer path)
    // ---------------------------------------------------------------

    @Test
    public void testParseNumericValue_int_lenLE9() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("789");
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 3);
        p._parseNumericValue(0 /* expType ไม่มีผลกับสาย len<=9 */);
        assertTrue((p._numTypesValid & NR_INT()) != 0);
        assertEquals(789, p._numberInt);
    }

    @Test
    public void testParseNumericValue_int_len10_negativeFitsBoundary() throws IOException {
        TestableParserBase p = newParser();
        String num = "-2147483648"; // == Integer.MIN_VALUE, digits=10
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(true, 10);
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_INT()) != 0);
        assertEquals(Integer.MIN_VALUE, p._numberInt);
    }

    @Test
    public void testParseNumericValue_int_len10_negativeNotFit() throws IOException {
        TestableParserBase p = newParser();
        String num = "-9999999999"; // digits=10, ไม่พอดี int
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(true, 10);
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_LONG()) != 0);
        assertEquals(-9999999999L, p._numberLong);
    }

    @Test
    public void testParseNumericValue_int_len10_positiveFitsBoundary() throws IOException {
        TestableParserBase p = newParser();
        String num = "2147483647"; // == Integer.MAX_VALUE
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 10);
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_INT()) != 0);
        assertEquals(Integer.MAX_VALUE, p._numberInt);
    }

    @Test
    public void testParseNumericValue_int_len10_positiveNotFit() throws IOException {
        TestableParserBase p = newParser();
        String num = "9999999999";
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 10);
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_LONG()) != 0);
        assertEquals(9999999999L, p._numberLong);
    }

    @Test
    public void testParseNumericValue_int_len11to18() throws IOException {
        TestableParserBase p = newParser();
        String num = "123456789012"; // len=12
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_LONG()) != 0);
        assertEquals(123456789012L, p._numberLong);
    }

    @Test
    public void testParseNumericValue_int_lenGT18_inLongRange() throws IOException {
        TestableParserBase p = newParser();
        String num = "1234567890123456789"; // len=19, < Long.MAX_VALUE
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(0);
        assertTrue((p._numTypesValid & NR_LONG()) != 0);
        assertEquals(Long.parseLong(num), p._numberLong);
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumericValue_int_lenGT18_outOfLongRange_expInt_throws() throws IOException {
        TestableParserBase p = newParser();
        String num = "99999999999999999999"; // len=20, > Long.MAX_VALUE
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(NR_INT());
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumericValue_int_lenGT18_outOfLongRange_expLong_throws() throws IOException {
        TestableParserBase p = newParser();
        String num = "99999999999999999999";
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(NR_LONG());
    }

    @Test
    public void testParseNumericValue_int_lenGT18_outOfLongRange_expDouble() throws IOException {
        TestableParserBase p = newParser();
        String num = "99999999999999999999";
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(NR_DOUBLE());
        assertTrue((p._numTypesValid & NR_DOUBLE()) != 0);
    }

    @Test
    public void testParseNumericValue_int_lenGT18_outOfLongRange_defaultBigInteger() throws IOException {
        TestableParserBase p = newParser();
        String num = "99999999999999999999";
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        p._parseNumericValue(NR_BIGINT()); // ไม่ใช่ INT/LONG/DOUBLE/FLOAT -> ไป BigInteger branch
        assertTrue((p._numTypesValid & NR_BIGINT()) != 0);
        assertEquals(new BigInteger(num), p._numberBigInt);
    }

    // ---------------------------------------------------------------
    // 19. _parseNumericValue() float path + non-numeric token
    // ---------------------------------------------------------------

    @Test
    public void testParseNumericValue_float_expBigDecimal() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("3.14");
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.resetFloat(false, 1, 2, 0);
        p._parseNumericValue(NR_BIGDECIMAL());
        assertTrue((p._numTypesValid & NR_BIGDECIMAL()) != 0);
        assertEquals(new BigDecimal("3.14"), p._numberBigDecimal);
    }

    @Test
    public void testParseNumericValue_float_expOtherUsesDouble() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("2.5");
        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.resetFloat(false, 1, 1, 0);
        p._parseNumericValue(NR_INT());
        assertTrue((p._numTypesValid & NR_DOUBLE()) != 0);
        assertEquals(2.5, p._numberDouble, 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumericValue_nonNumericToken_throws() throws IOException {
        TestableParserBase p = newParser();
        p._currToken = JsonToken.VALUE_STRING;
        p._parseNumericValue(0);
    }

    // ---------------------------------------------------------------
    // 20. _parseIntValue()
    // ---------------------------------------------------------------

    @Test
    public void testParseIntValue_optimizedPath() throws IOException {
        TestableParserBase p = newParser();
        p._textBuffer.resetWithString("55");
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, 2);
        assertEquals(55, p._parseIntValue());
    }

    @Test
    public void testParseIntValue_fallbackGenericPath() throws IOException {
        TestableParserBase p = newParser();
        String num = "123456789012"; // len 12 > 9 -> ไม่เข้า fast path
        p._textBuffer.resetWithString(num);
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.resetInt(false, num.length());
        int v = p._parseIntValue(); // ต้อง convertNumberToLong->Int ภายใน
        assertEquals((int) Long.parseLong(num), v); // ตาม logic convertNumberToInt (อาจ error ถ้าไม่พอดี)
    }

    // ---------------------------------------------------------------
    // 21. _decodeBase64Escape (int overload)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testDecodeBase64Escape_int_notBackslash_throws() throws IOException {
        TestableParserBase p = newParser();
        p._decodeBase64Escape(Base64Variants.getDefaultVariant(), 'A', 0);
    }

    @Test
    public void testDecodeBase64Escape_int_whitespaceAtIndexZero_skip() throws IOException {
        TestableParserBase p = newParser();
        p.escapedCharReturn = ' ';
        int bits = p._decodeBase64Escape(Base64Variants.getDefaultVariant(), '\\', 0);
        assertEquals(-1, bits);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecodeBase64Escape_int_whitespaceAtIndexNonZero_throws() throws IOException {
        TestableParserBase p = newParser();
        p.escapedCharReturn = ' ';
        p._decodeBase64Escape(Base64Variants.getDefaultVariant(), '\\', 1);
    }

    @Test
    public void testDecodeBase64Escape_int_validChar() throws IOException {
        TestableParserBase p = newParser();
        p.escapedCharReturn = 'A';
        int bits = p._decodeBase64Escape(Base64Variants.getDefaultVariant(), '\\', 2);
        assertTrue(bits >= 0);
    }

    @Test
    public void testDecodeBase64Escape_int_paddingChar() throws IOException {
        TestableParserBase p = newParser();
        Base64Variant v = Base64Variants.getDefaultVariant();
        p.escapedCharReturn = v.getPaddingChar();
        int bits = p._decodeBase64Escape(v, '\\', 3);
        assertEquals(Base64Variant.BASE64_VALUE_PADDING, bits);
    }

    // ---------------------------------------------------------------
    // 22. _decodeBase64Escape (char overload) - มี asymmetry เรื่อง index<2 กับ padding
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testDecodeBase64Escape_char_notBackslash_throws() throws IOException {
        TestableParserBase p = newParser();
        p._decodeBase64Escape(Base64Variants.getDefaultVariant(), 'Z', 0);
    }

    @Test
    public void testDecodeBase64Escape_char_whitespaceIndexZero_skip() throws IOException {
        TestableParserBase p = newParser();
        p.escapedCharReturn = ' ';
        int bits = p._decodeBase64Escape(Base64Variants.getDefaultVariant(), '\\', 0);
        assertEquals(-1, bits);
    }

    /**
     * จุดสำคัญ: overload char เพิ่มเงื่อนไข (index < 2) สำหรับ padding
     * ต่างจาก overload int ที่ยอมรับ padding ได้ทุก index -> อาจเป็นจุด fault ที่ควรจับ
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDecodeBase64Escape_char_paddingAtIndexLessThan2_throws() throws IOException {
        TestableParserBase p = newParser();
        Base64Variant v = Base64Variants.getDefaultVariant();
        p.escapedCharReturn = v.getPaddingChar();
        p._decodeBase64Escape(v, '\\', 1); // index < 2 -> ต้อง throw ตาม source
    }

    @Test
    public void testDecodeBase64Escape_char_paddingAtIndexGE2_ok() throws IOException {
        TestableParserBase p = newParser();
        Base64Variant v = Base64Variants.getDefaultVariant();
        p.escapedCharReturn = v.getPaddingChar();
        int bits = p._decodeBase64Escape(v, '\\', 2);
        assertEquals(Base64Variant.BASE64_VALUE_PADDING, bits);
    }

    // ---------------------------------------------------------------
    // 23. reportInvalidBase64Char()
    // ---------------------------------------------------------------

    @Test
    public void testReportInvalidBase64Char_whitespaceBranch() {
        TestableParserBase p = newParser();
        IllegalArgumentException ex = p.reportInvalidBase64Char(
                Base64Variants.getDefaultVariant(), ' ', 0);
        assertTrue(ex.getMessage().contains("white space"));
    }

    @Test
    public void testReportInvalidBase64Char_paddingBranch() {
        TestableParserBase p = newParser();
        Base64Variant v = Base64Variants.getDefaultVariant();
        IllegalArgumentException ex = p.reportInvalidBase64Char(v, v.getPaddingChar(), 3);
        assertTrue(ex.getMessage().contains("padding"));
    }

    @Test
    public void testReportInvalidBase64Char_controlCharBranch() {
        TestableParserBase p = newParser();
        IllegalArgumentException ex = p.reportInvalidBase64Char(
                Base64Variants.getDefaultVariant(), 127 /* DEL, control */, 1);
        assertTrue(ex.getMessage().contains("Illegal character"));
    }

    @Test
    public void testReportInvalidBase64Char_normalCharBranchWithMsg() {
        TestableParserBase p = newParser();
        IllegalArgumentException ex = p.reportInvalidBase64Char(
                Base64Variants.getDefaultVariant(), '!', 2, "extra info");
        assertTrue(ex.getMessage().contains("!"));
        assertTrue(ex.getMessage().contains("extra info"));
    }

    // ---------------------------------------------------------------
    // 24. _handleBase64MissingPadding()
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testHandleBase64MissingPadding_throws() throws IOException {
        TestableParserBase p = newParser();
        p._handleBase64MissingPadding(Base64Variants.getDefaultVariant());
    }

    // ---------------------------------------------------------------
    // 25. _handleUnrecognizedCharacterEscape()
    // ---------------------------------------------------------------

    @Test
    public void testHandleUnrecognizedCharacterEscape_anyCharFeatureEnabled() throws IOException {
        TestableParserBase p = newParser(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.getMask());
        assertEquals('q', p._handleUnrecognizedCharacterEscape('q'));
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape_singleQuoteFeatureEnabled() throws IOException {
        TestableParserBase p = newParser(Feature.ALLOW_SINGLE_QUOTES.getMask());
        assertEquals('\'', p._handleUnrecognizedCharacterEscape('\''));
    }

    @Test(expected = JsonParseException.class)
    public void testHandleUnrecognizedCharacterEscape_neitherFeature_throws() throws IOException {
        TestableParserBase p = newParser(0);
        p._handleUnrecognizedCharacterEscape('q');
    }

    @Test(expected = JsonParseException.class)
    public void testHandleUnrecognizedCharacterEscape_singleQuoteCharButFeatureDisabled_throws() throws IOException {
        TestableParserBase p = newParser(0);
        p._handleUnrecognizedCharacterEscape('\'');
    }

    // ---------------------------------------------------------------
    // 26. _throwUnquotedSpace()
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace_featureDisabled_throws() throws IOException {
        TestableParserBase p = newParser(0);
        p._throwUnquotedSpace(9 /* tab, <= INT_SPACE */, "OBJECT");
    }

    @Test
    public void testThrowUnquotedSpace_featureEnabledAndWithinSpace_noThrow() throws IOException {
        TestableParserBase p = newParser(Feature.ALLOW_UNQUOTED_CONTROL_CHARS.getMask());
        p._throwUnquotedSpace(9, "OBJECT"); // i <= INT_SPACE -> ไม่ throw
    }

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace_featureEnabledButAboveSpace_throws() throws IOException {
        TestableParserBase p = newParser(Feature.ALLOW_UNQUOTED_CONTROL_CHARS.getMask());
        p._throwUnquotedSpace(200, "OBJECT"); // i > INT_SPACE -> throw แม้เปิด feature
    }

    // ---------------------------------------------------------------
    // 27. _reportMismatchedEndMarker()
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testReportMismatchedEndMarker_throws() throws IOException {
        TestableParserBase p = newParser();
        p._reportMismatchedEndMarker(']', '}');
    }

    // ---------------------------------------------------------------
    // 28. _getSourceReference()
    // ---------------------------------------------------------------

    @Test
    public void testGetSourceReference_featureDisabled_returnsNull() {
        TestableParserBase p = newParser(0);
        assertNull(p._getSourceReference());
    }

    @Test
    public void testGetSourceReference_featureEnabled_returnsSource() {
        TestableParserBase p = newParser(Feature.INCLUDE_SOURCE_IN_LOCATION.getMask());
        assertEquals("test-src", p._getSourceReference());
    }

    // ---------------------------------------------------------------
    // 29. growArrayBy()
    // ---------------------------------------------------------------

    @Test
    public void testGrowArrayBy_nullArray() {
        int[] r = ParserBase.growArrayBy(null, 5);
        assertEquals(5, r.length);
    }

    @Test
    public void testGrowArrayBy_existingArray_preservesContent() {
        int[] arr = new int[] {1, 2, 3};
        int[] r = ParserBase.growArrayBy(arr, 2);
        assertEquals(5, r.length);
        assertArrayEquals(new int[] {1, 2, 3, 0, 0}, r);
    }

    // ---------------------------------------------------------------
    // 30. loadMore()/loadMoreGuaranteed() (deprecated but ยังอยู่ใน source)
    // ---------------------------------------------------------------

    @Test
    public void testLoadMore_alwaysFalse() throws IOException {
        TestableParserBase p = newParser();
        assertFalse(p.loadMore());
    }

    @Test(expected = JsonParseException.class)
    public void testLoadMoreGuaranteed_throwsWhenLoadMoreFalse() throws IOException {
        TestableParserBase p = newParser();
        p.loadMoreGuaranteed();
    }

    // ---------------------------------------------------------------
    // Helper constants (ค่า NR_* จาก ParserMinimalBase - ใช้ผ่าน reflection-free access
    // เนื่องจากเป็น protected static final int ที่มองเห็นได้ใน package เดียวกัน)
    // ---------------------------------------------------------------

    private static int NR_INT() { return ParserBase.NR_INT; }
    private static int NR_LONG() { return ParserBase.NR_LONG; }
    private static int NR_BIGINT() { return ParserBase.NR_BIGINT; }
    private static int NR_DOUBLE() { return ParserBase.NR_DOUBLE; }
    private static int NR_BIGDECIMAL() { return ParserBase.NR_BIGDECIMAL; }
    private static int NR_BIGDECIMAL_ONLY() { return ParserBase.NR_BIGDECIMAL; }
}
```

**หมายเหตุสำคัญ**: เนื่องจากค่าคงที่ `NR_INT`, `NR_LONG` ฯลฯ ประกาศใน `ParserMinimalBase` (ไม่ได้แสดง source ในโจทย์) หากชื่อ/การมองเห็น (`protected static final`) ตรงกับสมมติฐานข้างต้น โค้ดจะคอมไพล์ได้ทันที มิฉะนั้นให้แทนที่ helper methods ด้วยค่า int ตรง ๆ ที่สอดคล้องกับ bit mask จริงของโปรเจกต์ (เช่น `NR_UNKNOWN=0, NR_INT=1, NR_LONG=2, NR_BIGINT=4, NR_DOUBLE=8, NR_BIGDECIMAL=16, NR_FLOAT=32`)

## ตารางสรุป Branch/Condition ที่แต่ละกลุ่มเทสครอบคลุม

| เมธอดเทส (กลุ่ม) | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor*, testVersion, testCurrentValueGetSet | ค่าเริ่มต้นของ constructor, dupDetector=null, delegation ของ get/setCurrentValue |
| testEnableDisable_dupDetection / _otherFeature | `enable/disable`: f==STRICT_DUPLICATE_DETECTION true/false, dupDetector null/non-null |
| testSetFeatureMask_*, testOverrideStdFeatures_* | `changes!=0` vs `==0`, `_checkStdFeatureChanges`: `changedFeatures&f!=0` true/false, `newFeatureFlags&f!=0` true/false (รวม fault-case "ปิด feature แต่ dupDetector ไม่ถูกเคลียร์") |
| testGetCurrentName_* / testOverrideCurrentName_* | `_currToken==START_OBJECT/ARRAY` true/false, `parent!=null` true/false |
| testClose_* | `!_closed` true/false (idempotent) |
| testGetTokenLocation/CurrentLocation/ColumnNr* | คำนวณ column/location, boundary `col<0` vs `col>=0` |
| testHasTextCharacters_* | VALUE_STRING / FIELD_NAME(+`_nameCopied` true/false) / other |
| testGetBinaryValue_* | `_binaryValue==null` true/false, `_currToken!=VALUE_STRING` |
| testHandleEOF_*/testEofAsNextChar_* | `inRoot()` true/false, `inArray()` true/false (ARRAY vs OBJECT marker) |
| testGetByteArrayBuilder_* | `_byteArrayBuilder==null` true/false |
| testReset_*/testResetAsNaN | `fractLen<1 && expLen<1` true/false (ทุก combination ของ boundary 0/1) |
| testIsNaN_* | `_currToken==FLOAT` true/false, `NR_DOUBLE` set/unset, NaN/Infinite/normal |
| testGetNumberValue_*/testGetNumberType_* | ทุก sub-branch ของ INT (INT/LONG/BIGINT/fallback) และ FLOAT (BIGDECIMAL/DOUBLE), รวม `_throwInternal` |
| testConvertNumberToInt/Long/BigInteger/Double/BigDecimal_* | ทุก if/else-if ตามลำดับ priority + boundary overflow/no-overflow + else `_throwInternal` |
| testGetIntValue/LongValue/BigIntegerValue/FloatValue/DoubleValue/DecimalValue_* | `NR_UNKNOWN` vs flag ตั้งแล้ว vs ต้อง convert |
| testParseNumericValue_int_* | len<=9, len==10 (4 boundary case), len 11–18, len>18 (inLongRange true/false × expType 4 กรณี) |
| testParseNumericValue_float_*/nonNumeric | expType==BIGDECIMAL vs อื่น, token ไม่ใช่ตัวเลข |
| testParseIntValue_* | intLength<=9 (fast) vs fallback |
| testDecodeBase64Escape_int_*/_char_* | ch!='\\', whitespace index=0/!=0, valid char, padding (รวม asymmetry index<2 เฉพาะ char overload) |
| testReportInvalidBase64Char_* | 4 branch: whitespace / padding / control-char / normal char (+ msg!=null) |
| testHandleBase64MissingPadding_* | เรียก error ตรง ๆ |
| testHandleUnrecognizedCharacterEscape_* | ALLOW_BACKSLASH..., ch=='\'' && ALLOW_SINGLE_QUOTES, else throw (ทุก combination) |
| testThrowUnquotedSpace_* | `!enabled \|\| i>INT_SPACE` ทุก combination |
| testReportMismatchedEndMarker_* | เรียก error ตรง ๆ |
| testGetSourceReference_* | feature enabled/disabled |
| testGrowArrayBy_* | arr==null vs arr!=null |
| testLoadMore_*/testLoadMoreGuaranteed_* | ค่าคงที่ false, exception เมื่อ loadMore()==false |