# TypeParserTest — JUnit 4 Test Suite

**หมายเหตุสำคัญก่อนดูโค้ด:**

- เนื่องจาก `TypeParser` ต้องพึ่งพา `TypeFactory` จริงในการ resolve class (`_factory.findClass(...)`, `_factory._fromClass(...)`) และเมธอดหลัก (`parseType`, `parseTypes`, `findClass`, `_problem`) รวมถึง nested class `MyTokenizer` เป็น `protected`/package-private ผมจึงวางคลาสทดสอบไว้ใน **package เดียวกัน** (`com.fasterxml.jackson.databind.type`) เพื่อทำ white-box testing และเข้าถึง field/method เหล่านี้ได้ตรง ๆ ซึ่งช่วยให้ยิง branch ได้แม่นยำขึ้นมากโดยไม่ต้องเดาพฤติกรรมภายในของ `TypeFactory` เกินจำเป็น
- ใช้ `TypeFactory.defaultInstance()` (public static factory มาตรฐานของ jackson-databind) — เป็น dependency ที่จำเป็นต่อการทำงานของ `TypeParser` จริง ไม่ใช่ behavior ที่ถูกเดาขึ้นมาเอง
- จุดที่**ไม่สามารถทดสอบได้อย่างปลอดภัย**โดยไม่เดา behavior (เช่น branch `if (e instanceof RuntimeException) throw (RuntimeException) e;` ใน `findClass`) จะมีคอมเมนต์กำกับไว้ชัดเจนและไม่เขียนเทสสำหรับมัน

```java
package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit tests for {@link TypeParser}.
 *
 * ทดสอบนี้อยู่ใน package เดียวกับคลาสเป้าหมาย (com.fasterxml.jackson.databind.type)
 * เพื่อให้สามารถเข้าถึง protected method/field (_factory, parseType, parseTypes,
 * findClass, _problem) และ package-private nested class MyTokenizer ได้โดยตรง
 * (white-box testing) เพื่อเพิ่ม branch coverage ให้มากที่สุด
 *
 * สมมติฐาน (assumption) ที่จำเป็นต้องใช้แต่ไม่ได้อยู่ในซอร์สของ TypeParser เอง:
 *  - TypeFactory.defaultInstance() เป็น public static factory method มาตรฐานของ jackson-databind
 *  - TypeBindings.create(base, params) จะสำเร็จเมื่อจำนวน type parameter ตรงกับ arity
 *    ของ base class (เช่น List มี 1 type parameter) ซึ่งเป็น usage ปกติที่ TypeParser
 *    ถูกออกแบบมาให้รองรับ (ยืนยันได้จาก testParseGenericSingleParam ที่ผ่าน)
 */
public class TypeParserTest {

    private TypeFactory factory;
    private TypeParser parser;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
        parser = new TypeParser(factory);
    }

    // ---------------------------------------------------------------
    // parse(): non-generic types, whitespace handling
    // ---------------------------------------------------------------

    @Test
    public void testParseSimpleNonGenericType() {
        JavaType type = parser.parse("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testParseTrimsWhitespace() {
        JavaType type = parser.parse("   java.lang.String   ");
        assertEquals(String.class, type.getRawClass());
    }

    // ---------------------------------------------------------------
    // parse(): generic types (1 param, 2 params, nested)
    // ---------------------------------------------------------------

    @Test
    public void testParseGenericSingleParam() {
        JavaType type = parser.parse("java.util.List<java.lang.String>");
        assertEquals(java.util.List.class, type.getRawClass());
        JavaType param = type.containedType(0);
        assertNotNull(param);
        assertEquals(String.class, param.getRawClass());
    }

    @Test
    public void testParseGenericTwoParams() {
        JavaType type = parser.parse("java.util.Map<java.lang.String,java.lang.Integer>");
        assertEquals(java.util.Map.class, type.getRawClass());
        assertEquals(String.class, type.containedType(0).getRawClass());
        assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test
    public void testParseNestedGeneric() {
        JavaType type = parser.parse("java.util.List<java.util.List<java.lang.String>>");
        assertEquals(java.util.List.class, type.getRawClass());
        JavaType inner = type.containedType(0);
        assertEquals(java.util.List.class, inner.getRawClass());
        JavaType innerInner = inner.containedType(0);
        assertEquals(String.class, innerInner.getRawClass());
    }

    // ---------------------------------------------------------------
    // parse(): error cases - malformed input
    // ---------------------------------------------------------------

    @Test
    public void testParseEmptyStringThrows() {
        try {
            parser.parse("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test
    public void testParseWhitespaceOnlyThrows() {
        try {
            parser.parse("    ");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test
    public void testParseUnexpectedTokensAfterCompleteTypeThrows() {
        try {
            // "java.lang.String" เป็น type ที่สมบูรณ์แล้ว (non-generic)
            // การมี ',' ต่อท้ายที่ top-level คือ token เกินที่ parse() ไม่ยอมรับ
            parser.parse("java.lang.String,java.lang.Integer");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected tokens after complete type"));
        }
    }

    @Test
    public void testParseMissingClosingBracketThrows() {
        try {
            // เปิด '<' ของ List แล้วไม่มี '>' ปิด -> parseTypes() หมด token ก่อนเจอ '>'
            parser.parse("java.util.List<java.lang.String");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test
    public void testParseUnknownClassThrows() {
        try {
            parser.parse("com.example.ThisClassDoesNotExist12345");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not locate class"));
        }
    }

    @Test
    public void testParseUnexpectedTokenInGenericsListThrows() {
        try {
            // "java.util.List<java.lang.String>" ถูก parse จนสมบูรณ์เป็น type-argument
            // ตัวแรกของ Map แล้ว '<' ที่ตามมาทันที (ไม่มี ',' คั่น) คือ unexpected token
            // ใน parseTypes()
            parser.parse("java.util.Map<java.util.List<java.lang.String><java.lang.Integer>>");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected token"));
        }
    }

    // ---------------------------------------------------------------
    // withFactory()
    // ---------------------------------------------------------------

    @Test
    public void testWithFactorySameInstanceReturnsThis() {
        TypeParser result = parser.withFactory(factory);
        assertSame(parser, result);
    }

    @Test
    public void testWithFactoryDifferentInstanceReturnsNewParser() {
        TypeFactory other = mock(TypeFactory.class);
        TypeParser result = parser.withFactory(other);
        assertNotSame(parser, result);
        assertSame(other, result._factory);
    }

    // ---------------------------------------------------------------
    // findClass() protected helper - direct white-box test
    // ---------------------------------------------------------------

    @Test
    public void testFindClassValidClass() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("java.lang.String");
        Class<?> cls = parser.findClass("java.lang.String", tok);
        assertEquals(String.class, cls);
    }

    @Test
    public void testFindClassInvalidClassWrapsAsIllegalArgumentException() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("no.such.Class");
        try {
            parser.findClass("no.such.Class", tok);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not locate class"));
        }
        // หมายเหตุ: ไม่สามารถทดสอบ branch
        // "if (e instanceof RuntimeException) throw (RuntimeException) e;"
        // ได้อย่างปลอดภัย เพราะต้องรู้ว่า TypeFactory.findClass() จริง ๆ จะ throw
        // RuntimeException ชนิดใดในกรณีใด ซึ่งไม่มีอยู่ในซอร์สที่ให้มา
        // (ไม่ต้องการเดา behavior ตามข้อกำหนดที่ 4)
    }

    // ---------------------------------------------------------------
    // _problem() message format
    // ---------------------------------------------------------------

    @Test
    public void testProblemMessageFormat() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("abc<def");
        tok.nextToken(); // consume "abc"
        IllegalArgumentException ex = parser._problem(tok, "custom message");
        String expected = String.format(
                "Failed to parse type '%s' (remaining: '%s'): %s",
                tok.getAllInput(), tok.getRemainingInput(), "custom message");
        assertEquals(expected, ex.getMessage());
    }

    // ---------------------------------------------------------------
    // MyTokenizer - white-box tests
    // ---------------------------------------------------------------

    @Test
    public void testTokenizerBasicSequenceAndTrim() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("Foo < Bar , Baz >");
        assertTrue(tok.hasMoreTokens());
        assertEquals("Foo", tok.nextToken());
        assertEquals("<", tok.nextToken());
        assertEquals("Bar", tok.nextToken());
        assertEquals(",", tok.nextToken());
        assertEquals("Baz", tok.nextToken());
        assertEquals(">", tok.nextToken());
        assertFalse(tok.hasMoreTokens());
    }

    @Test
    public void testTokenizerPushBack() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("AB<CD");
        String first = tok.nextToken();
        assertEquals("AB", first);
        tok.pushBack(first);
        assertTrue(tok.hasMoreTokens());
        assertEquals("AB", tok.nextToken());
        assertEquals("<", tok.nextToken());
        assertEquals("CD", tok.nextToken());
        assertFalse(tok.hasMoreTokens());
    }

    @Test
    public void testTokenizerGetAllAndRemainingInput() {
        TypeParser.MyTokenizer tok = new TypeParser.MyTokenizer("AB<CD");
        assertEquals("AB<CD", tok.getAllInput());
        tok.nextToken(); // "AB"
        assertEquals("<CD", tok.getRemainingInput());
        tok.nextToken(); // "<"
        assertEquals("CD", tok.getRemainingInput());
        tok.nextToken(); // "CD"
        assertEquals("", tok.getRemainingInput());
        assertFalse(tok.hasMoreTokens());
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testParseSimpleNonGenericType` | `parseType`: `hasMoreTokens()` false หลัง base class → return `_fromClass(base,null)` (non-generic path) |
| `testParseTrimsWhitespace` | `parse()`: `canonical.trim()` ตัดขอบว่างก่อนสร้าง tokenizer |
| `testParseGenericSingleParam` | `parseType`: token `"<"` เข้า branch generics; `parseTypes`: loop 1 รอบจบด้วย `">"` |
| `testParseGenericTwoParams` | `parseTypes`: token `","` → `continue` loop, แล้วจบด้วย `">"` |
| `testParseNestedGeneric` | recursive call `parseType`→`parseTypes`→`parseType` (nested generics) |
| `testParseEmptyStringThrows` | `parseType`: `if (!tokens.hasMoreTokens())` → throw "Unexpected end-of-string" |
| `testParseWhitespaceOnlyThrows` | เหมือนด้านบน ผ่านทาง `trim()` ให้เหลือ string ว่าง |
| `testParseUnexpectedTokensAfterCompleteTypeThrows` | `parseType` else-branch `pushBack(token)`; `parse()`: `tokens.hasMoreTokens()` true → throw "Unexpected tokens..." |
| `testParseMissingClosingBracketThrows` | `parseTypes`: `if (!tokens.hasMoreTokens()) break;` แล้วตกไปที่ throw ท้ายเมธอด |
| `testParseUnknownClassThrows` | `findClass`: catch non-`RuntimeException` → wrap เป็น `_problem` |
| `testParseUnexpectedTokenInGenericsListThrows` | `parseTypes`: `if (!",".equals(token)) throw ...` (token = `"<"`) |
| `testWithFactorySameInstanceReturnsThis` | `withFactory`: เงื่อนไข `f == _factory` เป็น true → return `this` |
| `testWithFactoryDifferentInstanceReturnsNewParser` | `withFactory`: เงื่อนไข `f == _factory` เป็น false → return `new TypeParser(f)` |
| `testFindClassValidClass` | `findClass`: try-block สำเร็จ ไม่เข้า catch |
| `testFindClassInvalidClassWrapsAsIllegalArgumentException` | `findClass`: catch Exception, `!(e instanceof RuntimeException)` → wrap ด้วย `_problem` |
| `testProblemMessageFormat` | `_problem`: ตรวจ format ข้อความที่สร้างขึ้นตรงกับ spec |
| `testTokenizerBasicSequenceAndTrim` | `MyTokenizer.nextToken()`: trim ทุก token, delimiter `<,>` ถูก tokenize แยก |
| `testTokenizerPushBack` | `MyTokenizer.hasMoreTokens()`/`nextToken()`: branch `_pushbackToken != null` |
| `testTokenizerGetAllAndRemainingInput` | `MyTokenizer._index` tracking, `getAllInput()`, `getRemainingInput()` |