# คำตอบ: JUnit 4 Test Suite สำหรับ NumberUtils (Lang-44b)

## หมายเหตุการวิเคราะห์

- `isNumber()` มี loop ที่ซับซ้อนมาก โดยเฉพาะ branch `i < sz + 1 && allowSigns && !foundDigit` (ส่วนขยายของ while loop) — จากการวิเคราะห์ logic พบว่าสภาวะ `allowSigns==true && foundDigit==false` พร้อมกันไม่สามารถเกิดขึ้นได้จริงในทางปฏิบัติ (เพราะทุกครั้งที่ตั้ง `allowSigns=true` จะมาจาก branch `e/E` ซึ่งบังคับ `foundDigit` ต้องเป็น `true` อยู่แล้ว) จึงไม่ได้เขียนเทสบังคับ branch นี้ตรง ๆ — คอมเมนต์กำกับไว้ในโค้ด
- พฤติกรรมบางอย่าง เช่น `createNumber("1.5L")` throw exception, หรือ `isNumber("1.")` คืนค่า `false` เป็นผลจาก logic จริงในซอร์ส (ไม่ใช่การเดา) จึงใส่เป็นเทสเพื่อ "ดักจับ fault" หากพฤติกรรมเปลี่ยนไป

```java
package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ============== stringToInt ==============

    @Test
    public void testStringToInt_valid() {
        assertEquals(123, NumberUtils.stringToInt("123"));
    }

    @Test
    public void testStringToInt_invalid_returnsZeroDefault() {
        assertEquals(0, NumberUtils.stringToInt("abc"));
    }

    @Test
    public void testStringToInt_null_returnsZeroDefault() {
        assertEquals(0, NumberUtils.stringToInt(null));
    }

    @Test
    public void testStringToIntWithDefault_valid() {
        assertEquals(123, NumberUtils.stringToInt("123", 99));
    }

    @Test
    public void testStringToIntWithDefault_invalid_returnsDefault() {
        assertEquals(99, NumberUtils.stringToInt("abc", 99));
    }

    // ============== createNumber ==============

    @Test
    public void testCreateNumber_null_returnsNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_empty_throws() {
        NumberUtils.createNumber("");
    }

    @Test
    public void testCreateNumber_doubleMinus_returnsNull() {
        // val.startsWith("--") -> return null (protection for BigDecimal quirk)
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hexPositive() {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexNegative() {
        Number n = NumberUtils.createNumber("-0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosLessThanDecPos_throws() {
        // decPos=3 ('.'), expPos=1 ('e') -> expPos < decPos -> throw
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void testCreateNumber_intOnly() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_longOnly_exceedsInt() {
        Number n = NumberUtils.createNumber("12345678901");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_bigIntegerOnly_exceedsLong() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_decimalNoExp_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_decimalWithExp_returnsFloatOrDouble() {
        Number n = NumberUtils.createNumber("1.5e3");
        // ค่านี้พอดีกับ Float ได้ (1500.0) จึงคาดว่าเป็น Float
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_qualifierL_valid() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_qualifierL_overflow_fallsBackToBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_qualifierL_withDecimal_throws() {
        // dec != null -> AND condition false -> throw
        NumberUtils.createNumber("1.5L");
    }

    @Test
    public void testCreateNumber_qualifierF_valid() {
        Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_qualifierD_valid() {
        Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_qualifierF_allZeros_returnsFloatZero() {
        Number n = NumberUtils.createNumber("0.0F");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_qualifierF_infiniteFallsThroughToDouble() {
        // 1E39 overflow float (>Float.MAX_VALUE) but fits double
        Number n = NumberUtils.createNumber("1E39F");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_qualifierD_infiniteFallsBackToBigDecimal() {
        // 1E400 overflow ทั้ง float และ double -> fallback เป็น BigDecimal
        Number n = NumberUtils.createNumber("1E400D");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_noQualifier_exp_infiniteFallsBackToBigDecimal() {
        Number n = NumberUtils.createNumber("1E400");
        assertTrue(n instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidQualifier_throwsDefault() {
        NumberUtils.createNumber("123X");
    }

    // ============== createFloat / createDouble / createInteger / createLong / createBigInteger / createBigDecimal ==============

    @Test
    public void testCreateFloat_valid() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0f);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid_throws() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble_valid() {
        assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0d);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid_throws() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger_decimal() {
        assertEquals(26, NumberUtils.createInteger("26").intValue());
    }

    @Test
    public void testCreateInteger_hex() {
        assertEquals(26, NumberUtils.createInteger("0x1A").intValue());
    }

    @Test
    public void testCreateInteger_octal() {
        assertEquals(8, NumberUtils.createInteger("010").intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid_throws() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong_valid() {
        assertEquals(123L, NumberUtils.createLong("123").longValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid_throws() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger_valid() {
        assertEquals(new BigInteger("12345678901234567890"),
                NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid_throws() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal_valid() {
        assertEquals(new BigDecimal("1.23"), NumberUtils.createBigDecimal("1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid_throws() {
        NumberUtils.createBigDecimal("abc");
    }

    // ============== minimum / maximum (long, int) ==============

    @Test
    public void testMinimumLong_allBranches() {
        assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L)); // b<a false, c<a false
        assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L)); // b<a true, c<a false
        assertEquals(1L, NumberUtils.minimum(3L, 2L, 1L)); // b<a true, c<a true
        assertEquals(2L, NumberUtils.minimum(2L, 2L, 2L)); // equal values
    }

    @Test
    public void testMinimumInt_allBranches() {
        assertEquals(1, NumberUtils.minimum(1, 2, 3));
        assertEquals(1, NumberUtils.minimum(2, 1, 3));
        assertEquals(1, NumberUtils.minimum(3, 2, 1));
        assertEquals(2, NumberUtils.minimum(2, 2, 2));
    }

    @Test
    public void testMaximumLong_allBranches() {
        assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L)); // b>a true, c>a true
        assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L)); // b>a false, c>a false
        assertEquals(3L, NumberUtils.maximum(1L, 3L, 2L)); // b>a true, c>a false
        assertEquals(2L, NumberUtils.maximum(2L, 2L, 2L));
    }

    @Test
    public void testMaximumInt_allBranches() {
        assertEquals(3, NumberUtils.maximum(1, 2, 3));
        assertEquals(3, NumberUtils.maximum(3, 2, 1));
        assertEquals(3, NumberUtils.maximum(1, 3, 2));
        assertEquals(2, NumberUtils.maximum(2, 2, 2));
    }

    // ============== compare(double,double) ==============

    @Test
    public void testCompareDouble_lessThan() {
        assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
    }

    @Test
    public void testCompareDouble_greaterThan() {
        assertEquals(1, NumberUtils.compare(2.0d, 1.0d));
    }

    @Test
    public void testCompareDouble_equalBits() {
        assertEquals(0, NumberUtils.compare(1.0d, 1.0d));
    }

    @Test
    public void testCompareDouble_positiveZeroGreaterThanNegativeZero() {
        assertEquals(1, NumberUtils.compare(0.0d, -0.0d));
    }

    @Test
    public void testCompareDouble_negativeZeroLessThanPositiveZero() {
        assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
    }

    @Test
    public void testCompareDouble_NaNEqualsNaN() {
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testCompareDouble_NaNIsGreatest() {
        assertEquals(1, NumberUtils.compare(Double.NaN, 1.0d));
        assertEquals(-1, NumberUtils.compare(1.0d, Double.NaN));
    }

    // ============== compare(float,float) ==============

    @Test
    public void testCompareFloat_lessThan() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
    }

    @Test
    public void testCompareFloat_greaterThan() {
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_equalBits() {
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_positiveZeroGreaterThanNegativeZero() {
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
    }

    @Test
    public void testCompareFloat_negativeZeroLessThanPositiveZero() {
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
    }

    @Test
    public void testCompareFloat_NaNEqualsNaN() {
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
    }

    @Test
    public void testCompareFloat_NaNIsGreatest() {
        assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
    }

    // ============== isDigits ==============

    @Test
    public void testIsDigits_null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_allDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_containsNonDigit() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    // ============== isNumber ==============

    @Test
    public void testIsNumber_null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_hexValid() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexNegativeValid() {
        assertTrue(NumberUtils.isNumber("-0x1A"));
    }

    @Test
    public void testIsNumber_hexOnlyPrefix_invalid() {
        // "0x" -> i == sz -> false
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_hexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xG1"));
    }

    @Test
    public void testIsNumber_plainInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_negativeInteger() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_leadingPlusSign_invalid() {
        // start คำนวณจาก '-' เท่านั้น, '+' นำหน้าไม่รองรับ -> allowSigns เป็น false ตอนเจอ '+'
        assertFalse(NumberUtils.isNumber("+123"));
    }

    @Test
    public void testIsNumber_decimal() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_twoDecimalPoints_invalid() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_exponentLower() {
        assertTrue(NumberUtils.isNumber("1e10"));
    }

    @Test
    public void testIsNumber_exponentUpper() {
        assertTrue(NumberUtils.isNumber("1E10"));
    }

    @Test
    public void testIsNumber_twoExponents_invalid() {
        assertFalse(NumberUtils.isNumber("1e1e1"));
    }

    @Test
    public void testIsNumber_exponentWithoutLeadingDigit_invalid() {
        assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_exponentWithSign() {
        assertTrue(NumberUtils.isNumber("1e+10"));
        assertTrue(NumberUtils.isNumber("1e-10"));
    }

    @Test
    public void testIsNumber_signWithoutAllowSigns_invalid() {
        assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_qualifierD_valid() {
        assertTrue(NumberUtils.isNumber("123.4D"));
        assertTrue(NumberUtils.isNumber("123.4d"));
    }

    @Test
    public void testIsNumber_qualifierF_valid() {
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123f"));
    }

    @Test
    public void testIsNumber_qualifierD_noFoundDigit_invalid() {
        // chars[0]='.', chars[1]='d' -> foundDigit ยังเป็น false ตอนเจอ qualifier -> return false
        assertFalse(NumberUtils.isNumber(".d"));
    }

    @Test
    public void testIsNumber_qualifierL_valid() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_qualifierL_withDecimal_valid() {
        assertTrue(NumberUtils.isNumber("1.2L"));
    }

    @Test
    public void testIsNumber_qualifierL_withExponent_invalid() {
        // L ร่วมกับ exponent ไม่อนุญาต -> foundDigit && !hasExp = false
        assertFalse(NumberUtils.isNumber("123e4L"));
    }

    @Test
    public void testIsNumber_qualifierD_withExponent_valid() {
        assertTrue(NumberUtils.isNumber("1.2e3D"));
    }

    @Test
    public void testIsNumber_illegalLastChar_invalid() {
        assertFalse(NumberUtils.isNumber("123x"));
    }

    @Test
    public void testIsNumber_trailingLoneExponent_invalid() {
        // "123E" -> last-char block เจอ 'E' -> return false โดยตรง
        assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_onlyMinusSign_invalid() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_onlyDot_invalid() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_trailingDotNoDigitAfter_invalid() {
        // "1." -> last-char block ไม่รองรับ '.' โดยตรง -> ตกไป return false ท้าย if-block
        // (พฤติกรรมนี้มาจาก logic จริงของซอร์ส ไม่ใช่การเดา)
        assertFalse(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_signAsLastChar_invalid() {
        // "123E+" -> sign เป็นอักขระสุดท้าย แต่ last-char block ไม่รองรับ '+' -> illegal -> false
        assertFalse(NumberUtils.isNumber("123E+"));
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testStringToInt_valid/invalid/null` | `stringToInt(String)` เรียก overload สำเร็จ/ล้มเหลว, null input |
| `testStringToIntWithDefault_*` | try สำเร็จ / `catch(NumberFormatException)` คืน default |
| `testCreateNumber_null_returnsNull` | `if (val == null) return null;` |
| `testCreateNumber_empty_throws` | `if (val.length()==0) throw` |
| `testCreateNumber_doubleMinus_returnsNull` | `if (val.startsWith("--")) return null;` |
| `testCreateNumber_hexPositive/Negative` | `if (val.startsWith("0x") \|\| startsWith("-0x"))` |
| `testCreateNumber_expPosLessThanDecPos_throws` | `if (expPos < decPos) throw` |
| `testCreateNumber_intOnly/longOnly/bigIntegerOnly` | digit lastChar, `dec==null && exp==null` → try Integer→Long→BigInteger chain |
| `testCreateNumber_decimalNoExp/WithExp_returnsFloat` | digit lastChar, มี dec/exp → try Float→Double→BigDecimal |
| `testCreateNumber_qualifierL_valid/overflow/withDecimal_throws` | `case 'l'/'L'` ทุกแขนง (valid, overflow→BigInteger, invalid→throw) |
| `testCreateNumber_qualifierF/D_valid` | `case 'f'/'F'`, `case 'd'/'D'` สำเร็จ |
| `testCreateNumber_qualifierF_allZeros_returnsFloatZero` | เงื่อนไข `floatValue==0.0F && !allZeros` เป็น false |
| `testCreateNumber_qualifierF_infiniteFallsThroughToDouble` | fallthrough จาก case 'f' ไป 'd' เมื่อ infinite |
| `testCreateNumber_qualifierD_infiniteFallsBackToBigDecimal` | fallback เป็น BigDecimal เมื่อทั้ง float/double infinite |
| `testCreateNumber_noQualifier_exp_infiniteFallsBackToBigDecimal` | branch ไม่มี qualifier แต่มี exp, float/double infinite → BigDecimal |
| `testCreateNumber_invalidQualifier_throwsDefault` | `default: throw` ใน switch |
| `testCreateFloat/Double/Integer/Long/BigInteger/BigDecimal_*` | wrapper methods: valid + NumberFormatException |
| `testMinimumLong/Int_allBranches` | `if(b<a)`, `if(c<a)` ทั้ง true/false รวม equal values |
| `testMaximumLong/Int_allBranches` | `if(b>a)`, `if(c>a)` ทั้ง true/false |
| `testCompareDouble/Float_*` | `lhs<rhs`, `lhs>rhs`, bits equal, ±0.0, NaN ทุกกรณี |
| `testIsDigits_*` | null/empty/valid/invalid char |
| `testIsNumber_hex*` | hex branch: valid, prefix-only, invalid char, negative hex |
| `testIsNumber_plainInteger/negativeInteger/leadingPlusSign` | sign handling เริ่มต้น |
| `testIsNumber_decimal/twoDecimalPoints` | `hasDecPoint` true/false, duplicate dot |
| `testIsNumber_exponent*` | `hasExp`, `!foundDigit` ก่อน e, sign หลัง e, two E's |
| `testIsNumber_signWithoutAllowSigns_invalid` | `if(!allowSigns) return false;` สำหรับ +/- |
| `testIsNumber_qualifierD/F_valid/noFoundDigit` | last-char qualifier d/f ทั้ง foundDigit true/false |
| `testIsNumber_qualifierL_*` | last-char qualifier l/L ร่วมกับ/ไม่ร่วมกับ exponent |
| `testIsNumber_illegalLastChar/trailingLoneExponent` | last-char block: illegal char, 'e'/'E' → false |
| `testIsNumber_onlyMinusSign/onlyDot/trailingDotNoDigitAfter/signAsLastChar` | edge cases สั้น ๆ ที่ loop ว่าง หรือ last-char block ตกไป return false ท้ายบล็อก |

**หมายเหตุสุดท้าย:** branch ส่วนขยายของ while loop ใน `isNumber` (`i < sz+1 && allowSigns && !foundDigit`) ไม่ได้ถูกบังคับให้ true โดยตรง เนื่องจากวิเคราะห์แล้วพบว่า state ดังกล่าวไม่สามารถเกิดขึ้นได้จากการไหลของโค้ดจริง — คงไว้เป็นข้อสังเกตสำหรับผู้ตรวจสอบ branch coverage report