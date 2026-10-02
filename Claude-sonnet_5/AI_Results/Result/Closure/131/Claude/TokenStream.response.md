# วิเคราะห์และเขียน Unit Test สำหรับ `TokenStream`

จากการวิเคราะห์ซอร์สโค้ด `isKeyword` มีโครงสร้างเป็น `switch` ตาม `length()` ของสตริง และภายในมี nested `switch`/`if-else` หลายชั้น พร้อมกลไก `X != s` ที่ใช้ตรวจสอบว่าคำที่จับคู่แบบ "partial" ตรงกับสตริงจริงหรือไม่ ส่วน `isJSIdentifier` ตรวจอักขระตัวแรกและ loop ตรวจอักขระที่เหลือ

```java
package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Test;

public class TokenStreamTest {

    // ========================= isKeyword: Boundary / Default lengths =========================

    @Test
    public void testIsKeyword_EmptyString() {
        assertFalse(TokenStream.isKeyword(""));
    }

    @Test
    public void testIsKeyword_Length1_NotKeyword() {
        assertFalse(TokenStream.isKeyword("a"));
        assertFalse(TokenStream.isKeyword("i"));
    }

    @Test
    public void testIsKeyword_Length11_DefaultFallThrough() {
        // length 11 ไม่มี case ใน switch -> ตกไป default ทันที
        assertFalse(TokenStream.isKeyword("abcdefghijk"));
    }

    @Test
    public void testIsKeyword_Length13_DefaultFallThrough() {
        assertFalse(TokenStream.isKeyword("abcdefghijklm"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsKeyword_NullInput_ThrowsNPE() {
        // ไม่มีการเช็ค null ในซอร์ส -> คาดหวัง NPE จาก name.length()
        TokenStream.isKeyword(null);
    }

    // ========================= Length 2 =========================

    @Test
    public void testIsKeyword_Length2_True() {
        assertTrue(TokenStream.isKeyword("if"));
        assertTrue(TokenStream.isKeyword("in"));
        assertTrue(TokenStream.isKeyword("do"));
    }

    @Test
    public void testIsKeyword_Length2_False() {
        assertFalse(TokenStream.isKeyword("ab")); // default (c != f/n/o)
        assertFalse(TokenStream.isKeyword("af")); // c=='f' but charAt(0)!='i'
        assertFalse(TokenStream.isKeyword("an")); // c=='n' but charAt(0)!='i'
        assertFalse(TokenStream.isKeyword("ao")); // c=='o' but charAt(0)!='d'
    }

    // ========================= Length 3 =========================

    @Test
    public void testIsKeyword_Length3_True() {
        assertTrue(TokenStream.isKeyword("for"));
        assertTrue(TokenStream.isKeyword("int"));
        assertTrue(TokenStream.isKeyword("new"));
        assertTrue(TokenStream.isKeyword("try"));
        assertTrue(TokenStream.isKeyword("var"));
    }

    @Test
    public void testIsKeyword_Length3_False() {
        assertFalse(TokenStream.isKeyword("abc")); // default charAt(0)
        assertFalse(TokenStream.isKeyword("faz")); // 'f' but inner cond fail
        assertFalse(TokenStream.isKeyword("ins")); // 'i' but inner cond fail
        assertFalse(TokenStream.isKeyword("nzz")); // 'n' but inner cond fail
        assertFalse(TokenStream.isKeyword("tzz")); // 't' but inner cond fail
        assertFalse(TokenStream.isKeyword("vzz")); // 'v' but inner cond fail
    }

    // ========================= Length 4 =========================

    @Test
    public void testIsKeyword_Length4_True() {
        assertTrue(TokenStream.isKeyword("byte"));
        assertTrue(TokenStream.isKeyword("case"));
        assertTrue(TokenStream.isKeyword("char"));
        assertTrue(TokenStream.isKeyword("else"));
        assertTrue(TokenStream.isKeyword("enum"));
        assertTrue(TokenStream.isKeyword("goto"));
        assertTrue(TokenStream.isKeyword("long"));
        assertTrue(TokenStream.isKeyword("null"));
        assertTrue(TokenStream.isKeyword("true"));
        assertTrue(TokenStream.isKeyword("this"));
        assertTrue(TokenStream.isKeyword("void"));
        assertTrue(TokenStream.isKeyword("with"));
    }

    @Test
    public void testIsKeyword_Length4_False_XMismatch() {
        // ทดสอบเงื่อนไข X != s หลัง switch: X ถูกกำหนดแบบไม่มีเงื่อนไข แต่สตริงไม่ตรง
        assertFalse(TokenStream.isKeyword("byss")); // X="byte"
        assertFalse(TokenStream.isKeyword("goad")); // X="goto"
        assertFalse(TokenStream.isKeyword("lack")); // X="long"
        assertFalse(TokenStream.isKeyword("note")); // X="null"
        assertFalse(TokenStream.isKeyword("vase")); // X="void"
        assertFalse(TokenStream.isKeyword("wave")); // X="with"
    }

    @Test
    public void testIsKeyword_Length4_False_InnerConditionFail() {
        assertFalse(TokenStream.isKeyword("cove")); // 'c', c=='e' inner fail
        assertFalse(TokenStream.isKeyword("curr")); // 'c', c=='r' inner fail
        assertFalse(TokenStream.isKeyword("cool")); // 'c', c neither e/r
        assertFalse(TokenStream.isKeyword("eave")); // 'e', c=='e' inner fail
        assertFalse(TokenStream.isKeyword("exam")); // 'e', c=='m' inner fail
        assertFalse(TokenStream.isKeyword("edgy")); // 'e', c neither e/m
        assertFalse(TokenStream.isKeyword("tree")); // 't', c=='e' inner fail
        assertFalse(TokenStream.isKeyword("toss")); // 't', c=='s' inner fail
        assertFalse(TokenStream.isKeyword("tidy")); // 't', c neither e/s
    }

    @Test
    public void testIsKeyword_Length4_False_DefaultCharAt0() {
        assertFalse(TokenStream.isKeyword("abcd"));
        assertFalse(TokenStream.isKeyword("size"));
        assertFalse(TokenStream.isKeyword("1234"));
    }

    // ========================= Length 5 =========================

    @Test
    public void testIsKeyword_Length5_True() {
        assertTrue(TokenStream.isKeyword("class"));
        assertTrue(TokenStream.isKeyword("break"));
        assertTrue(TokenStream.isKeyword("while"));
        assertTrue(TokenStream.isKeyword("false"));
        assertTrue(TokenStream.isKeyword("const"));
        assertTrue(TokenStream.isKeyword("final"));
        assertTrue(TokenStream.isKeyword("float"));
        assertTrue(TokenStream.isKeyword("short"));
        assertTrue(TokenStream.isKeyword("super"));
        assertTrue(TokenStream.isKeyword("throw"));
        assertTrue(TokenStream.isKeyword("catch"));
    }

    @Test
    public void testIsKeyword_Length5_False_Default() {
        assertFalse(TokenStream.isKeyword("xxxxx")); // charAt(2) not matched
    }

    @Test
    public void testIsKeyword_Length5_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("aaaaa")); // charAt(2)='a' -> X="class"
    }

    @Test
    public void testIsKeyword_Length5_False_NestedIfElseFail() {
        assertFalse(TokenStream.isKeyword("aanaa")); // 'n' branch, charAt(0) not c/f
        assertFalse(TokenStream.isKeyword("aaoaa")); // 'o' branch, charAt(0) not f/s
    }

    // ========================= Length 6 =========================

    @Test
    public void testIsKeyword_Length6_True() {
        assertTrue(TokenStream.isKeyword("native"));
        assertTrue(TokenStream.isKeyword("delete"));
        assertTrue(TokenStream.isKeyword("return"));
        assertTrue(TokenStream.isKeyword("throws"));
        assertTrue(TokenStream.isKeyword("import"));
        assertTrue(TokenStream.isKeyword("double"));
        assertTrue(TokenStream.isKeyword("static"));
        assertTrue(TokenStream.isKeyword("public"));
        assertTrue(TokenStream.isKeyword("switch"));
        assertTrue(TokenStream.isKeyword("export"));
        assertTrue(TokenStream.isKeyword("typeof"));
    }

    @Test
    public void testIsKeyword_Length6_False_Default() {
        assertFalse(TokenStream.isKeyword("abcdef")); // charAt(1) not matched
    }

    @Test
    public void testIsKeyword_Length6_False_NestedIfElseFail() {
        assertFalse(TokenStream.isKeyword("xexxxx")); // 'e' branch, charAt(0) not d/r
    }

    @Test
    public void testIsKeyword_Length6_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("raaaaa")); // charAt(1)='a' -> X="native"
    }

    // ========================= Length 7 =========================

    @Test
    public void testIsKeyword_Length7_True() {
        assertTrue(TokenStream.isKeyword("package"));
        assertTrue(TokenStream.isKeyword("default"));
        assertTrue(TokenStream.isKeyword("finally"));
        assertTrue(TokenStream.isKeyword("boolean"));
        assertTrue(TokenStream.isKeyword("private"));
        assertTrue(TokenStream.isKeyword("extends"));
    }

    @Test
    public void testIsKeyword_Length7_False_Default() {
        assertFalse(TokenStream.isKeyword("abcdefg")); // charAt(1) not matched
    }

    @Test
    public void testIsKeyword_Length7_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("manager")); // charAt(1)='a' -> X="package"
    }

    // ========================= Length 8 =========================

    @Test
    public void testIsKeyword_Length8_True() {
        assertTrue(TokenStream.isKeyword("abstract"));
        assertTrue(TokenStream.isKeyword("continue"));
        assertTrue(TokenStream.isKeyword("debugger"));
        assertTrue(TokenStream.isKeyword("function"));
        assertTrue(TokenStream.isKeyword("volatile"));
    }

    @Test
    public void testIsKeyword_Length8_False_Default() {
        assertFalse(TokenStream.isKeyword("zzzzzzzz")); // charAt(0) not matched
    }

    @Test
    public void testIsKeyword_Length8_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("aardvark")); // charAt(0)='a' -> X="abstract"
    }

    // ========================= Length 9 =========================

    @Test
    public void testIsKeyword_Length9_True() {
        assertTrue(TokenStream.isKeyword("interface"));
        assertTrue(TokenStream.isKeyword("protected"));
        assertTrue(TokenStream.isKeyword("transient"));
    }

    @Test
    public void testIsKeyword_Length9_False_Default() {
        assertFalse(TokenStream.isKeyword("zzzzzzzzz")); // charAt(0) not i/p/t
    }

    @Test
    public void testIsKeyword_Length9_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("invisible")); // charAt(0)='i' -> X="interface"
    }

    // ========================= Length 10 =========================

    @Test
    public void testIsKeyword_Length10_True() {
        assertTrue(TokenStream.isKeyword("implements"));
        assertTrue(TokenStream.isKeyword("instanceof"));
    }

    @Test
    public void testIsKeyword_Length10_False_Default() {
        assertFalse(TokenStream.isKeyword("aaaaaaaaaa")); // charAt(1) not m/n
    }

    @Test
    public void testIsKeyword_Length10_False_XMismatch() {
        assertFalse(TokenStream.isKeyword("ambivalent")); // charAt(1)='m' -> X="implements"
    }

    // ========================= Length 12 =========================

    @Test
    public void testIsKeyword_Length12_True() {
        assertTrue(TokenStream.isKeyword("synchronized"));
    }

    @Test
    public void testIsKeyword_Length12_False_XMismatch() {
        // X ถูกกำหนดแบบไม่มีเงื่อนไขเสมอสำหรับ length12
        assertFalse(TokenStream.isKeyword("aaaaaaaaaaaa"));
    }

    // ========================= isJSIdentifier =========================

    @Test
    public void testIsJSIdentifier_EmptyString() {
        assertFalse(TokenStream.isJSIdentifier(""));
    }

    @Test
    public void testIsJSIdentifier_InvalidStartChar_Digit() {
        assertFalse(TokenStream.isJSIdentifier("1abc"));
    }

    @Test
    public void testIsJSIdentifier_SingleValidChar_LoopNotExecuted() {
        assertTrue(TokenStream.isJSIdentifier("a"));
    }

    @Test
    public void testIsJSIdentifier_ValidMultiChar() {
        assertTrue(TokenStream.isJSIdentifier("abc123"));
    }

    @Test
    public void testIsJSIdentifier_UnderscoreStart_Valid() {
        assertTrue(TokenStream.isJSIdentifier("_abc"));
    }

    @Test
    public void testIsJSIdentifier_DollarSign_ValidPart() {
        assertTrue(TokenStream.isJSIdentifier("ab$"));
    }

    @Test
    public void testIsJSIdentifier_InvalidPartChar_Space() {
        assertFalse(TokenStream.isJSIdentifier("a b"));
    }

    @Test
    public void testIsJSIdentifier_InvalidPartChar_Hyphen() {
        assertFalse(TokenStream.isJSIdentifier("a-b"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsJSIdentifier_NullInput_ThrowsNPE() {
        TokenStream.isJSIdentifier(null);
    }
}
```

## สรุปตาราง Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testIsKeyword_EmptyString`, `Length1`, `Length11`, `Length13` | boundary length ที่ไม่มี `case` ตรง -> ตก default ของ switch หลัก |
| `testIsKeyword_NullInput_ThrowsNPE` | เส้นทาง null -> NPE จาก `s.length()` (ไม่มีการเช็ค null ในซอร์ส) |
| `Length2_True` / `Length2_False` | if/else `c=='f'/'n'/'o'` และเงื่อนไข `charAt(0)` ภายใน + default `break partial` |
| `Length3_True` / `Length3_False` | switch(charAt0) ทุก case 'f','i','n','t','v' และ default, เงื่อนไข `&&` ภายในแต่ละ case |
| `Length4_True`, `False_XMismatch`, `False_InnerConditionFail`, `False_DefaultCharAt0` | switch(charAt0) ทุก case, if/else ซ้อนใน 'c','e','t', และ mechanism `X!=s` check ท้ายเมธอด |
| `Length5_True/False_*` | switch(charAt2) ทุก case, nested if/else ใน 'n','o', default case |
| `Length6_True/False_*` | switch(charAt1) ทุก case, nested if/else ใน 'e', default, X mismatch |
| `Length7_True/False_*` | switch(charAt1) ทุก case, default, X mismatch |
| `Length8_True/False_*` | switch(charAt0) ทุก case, default, X mismatch |
| `Length9_True/False_*` | if/else if (`c=='i'/'p'/'t'`), default (ไม่มี branch match) |
| `Length10_True/False_*` | if/else if (`c=='m'/'n'`), default, X mismatch |
| `Length12_True/False_XMismatch` | case เดียวที่ set X แบบไม่มีเงื่อนไข + final `X!=s` check |
| `isJSIdentifier_EmptyString` | `length==0` -> return false |
| `isJSIdentifier_InvalidStartChar_Digit` | `!isJavaIdentifierStart` -> false |
| `isJSIdentifier_SingleValidChar_LoopNotExecuted` | loop `for(i=1;i<length;...)` ไม่ execute (length=1) |
| `isJSIdentifier_ValidMultiChar`, `Underscore`, `DollarSign` | loop วิ่งครบ, ทุกตัวอักษร valid -> return true |
| `isJSIdentifier_InvalidPartChar_Space/Hyphen` | loop เจอ `!isJavaIdentifierPart` -> return false กลางลูป |
| `isJSIdentifier_NullInput_ThrowsNPE` | เส้นทาง null -> NPE จาก `s.length()` |

**หมายเหตุ:** ทุกกรณีทดสอบอิงจาก logic ที่ปรากฏจริงในซอร์สโค้ดที่ให้มา ไม่มีการสมมติ behavior เพิ่มเติมนอกเหนือจากที่ trace ได้จาก if/else/switch ที่ระบุไว้