# JUnit 4 Test Suite สำหรับ CodeConsumer (Closure-51b)

## แนวคิดการทดสอบ

`CodeConsumer` เป็น abstract class ที่มี abstract method `append(String)` และ `getLastChar()`
จึงต้องสร้าง **test double (concrete subclass)** ที่ implement สอง abstract methods นี้จริง
โดยเก็บข้อมูลลง `StringBuilder` เพื่อให้ตรวจสอบผลลัพธ์ที่ถูก append ได้จริง และคำนวณ `getLastChar()` จาก buffer จริง
เพื่อให้ทดสอบ branch ต่าง ๆ ที่พึ่งพา `getLastChar()` ได้อย่างถูกต้อง (ไม่ mock ค่าเอง)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

public class CodeConsumerTest {

    /**
     * Test double ที่ implement abstract methods จริง โดยเก็บผลลัพธ์ลง StringBuilder
     * เพื่อให้ getLastChar() คำนวณจากสถานะจริงของ buffer
     */
    static class TestConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();

        @Override
        char getLastChar() {
            return sb.length() == 0 ? '\0' : sb.charAt(sb.length() - 1);
        }

        @Override
        void append(String str) {
            sb.append(str);
        }
    }

    private TestConsumer c;

    @Before
    public void setUp() {
        c = new TestConsumer();
    }

    // ---------------------------------------------------------
    // continueProcessing() / shouldPreserveExtraBlocks() / endFile()
    // ---------------------------------------------------------

    @Test
    public void testContinueProcessingDefaultTrue() {
        assertTrue(c.continueProcessing());
    }

    @Test
    public void testShouldPreserveExtraBlocksDefaultFalse() {
        assertFalse(c.shouldPreserveExtraBlocks());
    }

    @Test
    public void testEndFileNoException() {
        // ไม่ throw exception, ไม่มี state เปลี่ยน
        c.endFile();
    }

    // ---------------------------------------------------------
    // startSourceMapping / endSourceMapping (no-op, coverage only)
    // ---------------------------------------------------------

    @Test
    public void testSourceMappingNoOp() {
        // Node ไม่ได้ถูกใช้ในเมธอด จึงส่ง null ได้อย่างปลอดภัย
        c.startSourceMapping(null);
        c.endSourceMapping(null);
        // ไม่มี exception และ state ไม่เปลี่ยน
        assertEquals("", c.sb.toString());
    }

    // ---------------------------------------------------------
    // breakAfterBlockFor(Node, boolean)
    // ---------------------------------------------------------

    @Test
    public void testBreakAfterBlockForTrue() {
        assertTrue(c.breakAfterBlockFor(null, true));
    }

    @Test
    public void testBreakAfterBlockForFalse() {
        assertFalse(c.breakAfterBlockFor(null, false));
    }

    // ---------------------------------------------------------
    // isWordChar(char) static method - ทุกสาขา
    // ---------------------------------------------------------

    @Test
    public void testIsWordChar_underscore() {
        assertTrue(CodeConsumer.isWordChar('_'));
    }

    @Test
    public void testIsWordChar_dollar() {
        assertTrue(CodeConsumer.isWordChar('$'));
    }

    @Test
    public void testIsWordChar_letter() {
        assertTrue(CodeConsumer.isWordChar('a'));
    }

    @Test
    public void testIsWordChar_digit() {
        assertTrue(CodeConsumer.isWordChar('5'));
    }

    @Test
    public void testIsWordChar_symbolFalse() {
        assertFalse(CodeConsumer.isWordChar('-'));
    }

    @Test
    public void testIsWordChar_nullCharFalse() {
        assertFalse(CodeConsumer.isWordChar('\0'));
    }

    // ---------------------------------------------------------
    // add(String) - boundary + if branches
    // ---------------------------------------------------------

    @Test
    public void testAdd_emptyString_returnsEarly() {
        c.add("foo"); // สร้าง state ก่อน
        int lenBefore = c.sb.length();
        c.add(""); // length()==0 -> return ทันที ไม่ต่อ string
        assertEquals(lenBefore, c.sb.length());
    }

    @Test
    public void testAdd_wordCharNeedsSpace() {
        c.add("foo"); // last char = 'o' (word char)
        c.add("bar"); // first char 'b' word char -> ต้องมี space คั่น
        assertEquals("foo bar", c.sb.toString());
    }

    @Test
    public void testAdd_wordCharWithBackslashNeedsSpace() {
        c.add("foo");         // last char = 'o'
        c.add("\\bar");       // first char '\\' -> isWordChar(c)||c=='\\' true, prev word -> space
        assertEquals("foo \\bar", c.sb.toString());
    }

    @Test
    public void testAdd_nonWordCharNoSpace() {
        c.add("foo");
        c.add("+"); // first char '+' ไม่ใช่ word char -> ไม่มี space
        assertEquals("foo+", c.sb.toString());
    }

    @Test
    public void testAdd_prevNotWordCharNoSpace() {
        c.add("+"); // last char '+' ไม่ใช่ word char
        c.add("bar"); // first char 'b' เป็น word char แต่ prev ไม่ใช่ -> ไม่มี space
        assertEquals("+bar", c.sb.toString());
    }

    // ---------------------------------------------------------
    // addIdentifier - เรียก add() ภายใน
    // ---------------------------------------------------------

    @Test
    public void testAddIdentifierDelegatesToAdd() {
        c.addIdentifier("myVar");
        assertEquals("myVar", c.sb.toString());
    }

    // ---------------------------------------------------------
    // beginBlock() - if(statementNeedsEnded) branch true/false
    // ---------------------------------------------------------

    @Test
    public void testBeginBlock_whenStatementNeedsEnded_addsSemicolon() {
        c.statementNeedsEnded = true;
        c.beginBlock();
        // append(";") ตามด้วย appendBlockStart -> "{"
        assertEquals(";{", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
    }

    @Test
    public void testBeginBlock_whenStatementNotNeeded_noSemicolon() {
        c.statementNeedsEnded = false;
        c.beginBlock();
        assertEquals("{", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
    }

    // ---------------------------------------------------------
    // endBlock() / endBlock(boolean) - if(shouldEndLine)
    // ---------------------------------------------------------

    @Test
    public void testEndBlockDefault_noShouldEndLine() {
        c.statementNeedsEnded = true;
        c.endBlock(); // เรียก endBlock(false)
        assertEquals("}", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
    }

    @Test
    public void testEndBlockTrue_shouldEndLine() {
        c.endBlock(true);
        // endLine() เป็น no-op แต่ branch ถูก execute
        assertEquals("}", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
    }

    @Test
    public void testEndBlockFalse_explicit() {
        c.endBlock(false);
        assertEquals("}", c.sb.toString());
    }

    // ---------------------------------------------------------
    // listSeparator()
    // ---------------------------------------------------------

    @Test
    public void testListSeparator() {
        c.listSeparator();
        assertEquals(",", c.sb.toString());
    }

    // ---------------------------------------------------------
    // endStatement() / endStatement(boolean) - if/else if branches
    // ---------------------------------------------------------

    @Test
    public void testEndStatement_needSemiColonTrue() {
        c.endStatement(true);
        assertEquals(";", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColonFalse_statementStartedTrue() {
        c.statementStarted = true;
        c.endStatement(false);
        assertTrue(c.statementNeedsEnded);
        assertEquals("", c.sb.toString()); // ไม่มีการ append
    }

    @Test
    public void testEndStatement_needSemiColonFalse_statementStartedFalse() {
        c.statementStarted = false;
        c.endStatement(false);
        // ไม่เข้า branch ใดเลย
        assertFalse(c.statementNeedsEnded);
        assertEquals("", c.sb.toString());
    }

    @Test
    public void testEndStatementNoArgDelegates() {
        c.endStatement(); // เรียก endStatement(false)
        assertFalse(c.statementNeedsEnded);
    }

    // ---------------------------------------------------------
    // maybeEndStatement() - if(statementNeedsEnded) branch
    // ---------------------------------------------------------

    @Test
    public void testMaybeEndStatement_whenNeeded() {
        c.statementNeedsEnded = true;
        c.maybeEndStatement();
        assertEquals(";", c.sb.toString());
        assertFalse(c.statementNeedsEnded);
        assertTrue(c.statementStarted);
    }

    @Test
    public void testMaybeEndStatement_whenNotNeeded() {
        c.statementNeedsEnded = false;
        c.maybeEndStatement();
        assertEquals("", c.sb.toString());
        assertTrue(c.statementStarted); // statementStarted ยังถูก set เสมอ
    }

    // ---------------------------------------------------------
    // endFunction() / endFunction(boolean) - if(statementContext)
    // ---------------------------------------------------------

    @Test
    public void testEndFunction_statementContextTrue() {
        c.endFunction(true);
        assertTrue(c.sawFunction);
        // endLine() เป็น no-op, ไม่มีการ append
    }

    @Test
    public void testEndFunction_statementContextFalse() {
        c.endFunction(false);
        assertTrue(c.sawFunction);
    }

    @Test
    public void testEndFunctionNoArgDelegates() {
        c.endFunction(); // -> endFunction(false)
        assertTrue(c.sawFunction);
    }

    // ---------------------------------------------------------
    // beginCaseBody() / endCaseBody()
    // ---------------------------------------------------------

    @Test
    public void testBeginCaseBody() {
        c.beginCaseBody();
        assertEquals(":", c.sb.toString());
    }

    @Test
    public void testEndCaseBodyNoOp() {
        c.endCaseBody(); // ไม่มี behavior, เพียงเรียกเพื่อ coverage
        assertEquals("", c.sb.toString());
    }

    // ---------------------------------------------------------
    // appendBlockStart / appendBlockEnd
    // ---------------------------------------------------------

    @Test
    public void testAppendBlockStart() {
        c.appendBlockStart();
        assertEquals("{", c.sb.toString());
    }

    @Test
    public void testAppendBlockEnd() {
        c.appendBlockEnd();
        assertEquals("}", c.sb.toString());
    }

    // ---------------------------------------------------------
    // startNewLine / maybeLineBreak / maybeCutLine / endLine / notePreferredLineBreak
    // (no-op methods, เรียกเพื่อ coverage)
    // ---------------------------------------------------------

    @Test
    public void testNoOpLineMethods() {
        c.startNewLine();
        c.maybeLineBreak();
        c.maybeCutLine();
        c.endLine();
        c.notePreferredLineBreak();
        assertEquals("", c.sb.toString());
    }

    // ---------------------------------------------------------
    // appendOp(String, boolean)
    // ---------------------------------------------------------

    @Test
    public void testAppendOp() {
        c.appendOp("+", true);
        assertEquals("+", c.sb.toString());
    }

    // ---------------------------------------------------------
    // addOp(String, boolean) - ทุก if/else if branch
    // ---------------------------------------------------------

    @Test
    public void testAddOp_plusPlus_needsSpace() {
        c.append("+"); // ตั้ง prev char = '+'
        c.addOp("+", true); // first=='+' && prev=='+' -> ต้องเว้นวรรค
        assertEquals("+ +", c.sb.toString());
    }

    @Test
    public void testAddOp_minusMinus_needsSpace() {
        c.append("-");
        c.addOp("-", false); // first=='-' && prev=='-' -> เว้นวรรค, binOp=false ไม่เรียก maybeCutLine (no-op อยู่แล้ว)
        assertEquals("- -", c.sb.toString());
    }

    @Test
    public void testAddOp_letterOperator_afterWordChar_needsSpace() {
        c.append("x"); // prev = 'x' (word char)
        c.addOp("instanceof", false); // first='i' isLetter && isWordChar(prev) -> space
        assertEquals("x instanceof", c.sb.toString());
    }

    @Test
    public void testAddOp_minusThenGreater_needsSpace() {
        c.append("-"); // prev='-'
        c.addOp(">", false); // first='>' && prev=='-' -> ป้องกัน "-->"
        assertEquals("- >", c.sb.toString());
    }

    @Test
    public void testAddOp_noSpaceCase_elseBranch() {
        c.append("x"); // prev='x'
        c.addOp("=", false); // ไม่ตรงเงื่อนไขใดเลย -> ไม่มี space
        assertEquals("x=", c.sb.toString());
    }

    @Test
    public void testAddOp_binOpTrue_callsMaybeCutLine() {
        // binOp=true -> เข้า if(binOp) เรียก maybeCutLine() (no-op) แต่ต้อง coverage
        c.addOp("*", true);
        assertEquals("*", c.sb.toString());
    }

    @Test
    public void testAddOp_binOpFalse_skipsMaybeCutLine() {
        c.addOp("*", false);
        assertEquals("*", c.sb.toString());
    }

    // ---------------------------------------------------------
    // addNumber(double) - ทุก branch: negative-prev, integer with/without
    // exponent compression, non-integer
    // ---------------------------------------------------------

    @Test
    public void testAddNumber_negativeAfterMinus_addsSpace() {
        c.append("-"); // prev='-'
        c.addNumber(-5); // x<0 && prev=='-' -> add(" ") ก่อน แล้วค่อย add ตัวเลข
        // -5 เป็น integer, abs=5<100 -> exp<=2 -> add(Long.toString(-5))
        assertEquals("- -5", c.sb.toString());
    }

    @Test
    public void testAddNumber_smallInteger_noExponent() {
        c.addNumber(5); // abs<100 -> ข้าม while loop, exp=0<=2 -> "5"
        assertEquals("5", c.sb.toString());
    }

    @Test
    public void testAddNumber_zero() {
        c.addNumber(0); // (long)0==0, abs=0<100 -> "0"
        assertEquals("0", c.sb.toString());
    }

    @Test
    public void testAddNumber_hundredButLoopFalseImmediately() {
        // x=123: abs>=100 เข้า while แต่ condition แรกเป็น false -> loop ไม่ execute
        c.addNumber(123);
        assertEquals("123", c.sb.toString());
    }

    @Test
    public void testAddNumber_loopRunsOnce_expLessOrEqual2() {
        // x=250: while loop วนหนึ่งรอบ (exp=1) แล้วหยุด, exp<=2 -> ใช้ value เดิม
        c.addNumber(250);
        assertEquals("250", c.sb.toString());
    }

    @Test
    public void testAddNumber_largeInteger_expGreaterThan2_usesScientificForm() {
        // x=1000000: loop วนจน exp=6 (>2) -> ใช้รูป mantissa E exp = "1E6"
        c.addNumber(1000000);
        assertEquals("1E6", c.sb.toString());
    }

    @Test
    public void testAddNumber_negativeLargeInteger() {
        // x=-150: loop วนหนึ่งรอบแล้วหยุด (exp=1<=2) -> ใช้ value ปกติ
        c.addNumber(-150);
        assertEquals("-150", c.sb.toString());
    }

    @Test
    public void testAddNumber_nonIntegerDouble() {
        // (long)3.5 != 3.5 -> else branch -> add(String.valueOf(x))
        c.addNumber(3.5);
        assertEquals("3.5", c.sb.toString());
    }

    @Test
    public void testAddNumber_negativeNonIntegerDouble() {
        // ตรวจ else branch กับค่าติดลบ (ไม่ทำ integer compression)
        c.addNumber(-3.5);
        assertEquals("-3.5", c.sb.toString());
    }
}
```

## สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testContinueProcessingDefaultTrue | `continueProcessing()` คืน true (default) |
| testShouldPreserveExtraBlocksDefaultFalse | `shouldPreserveExtraBlocks()` คืน false |
| testEndFileNoException | `endFile()` no-op |
| testSourceMappingNoOp | `startSourceMapping`, `endSourceMapping` no-op |
| testBreakAfterBlockForTrue/False | `breakAfterBlockFor` คืนค่าตาม `statementContext` (true/false) |
| testIsWordChar_* (6 tests) | `isWordChar()` ทุก branch: `_`, `$`, letter, digit, symbol(false), null char(false) |
| testAdd_emptyString_returnsEarly | `add()` branch `newcode.length()==0` → return |
| testAdd_wordCharNeedsSpace | `add()` branch `isWordChar(c) && isWordChar(prev)` → เว้นวรรค |
| testAdd_wordCharWithBackslashNeedsSpace | `add()` branch `c=='\\'` ร่วมกับ prev word char |
| testAdd_nonWordCharNoSpace / testAdd_prevNotWordCharNoSpace | `add()` false-branch (ไม่เว้นวรรค) 2 กรณี |
| testAddIdentifierDelegatesToAdd | `addIdentifier()` เรียก `add()` |
| testBeginBlock_* (2 tests) | `beginBlock()` if(`statementNeedsEnded`) true/false |
| testEndBlock* (3 tests) | `endBlock(boolean)` if(`shouldEndLine`) true/false + default overload |
| testListSeparator | `listSeparator()` |
| testEndStatement_* (4 tests) | `endStatement(boolean)` if/else if ทุก branch + default overload |
| testMaybeEndStatement_* (2 tests) | `maybeEndStatement()` if(`statementNeedsEnded`) true/false |
| testEndFunction_* (3 tests) | `endFunction(boolean)` if(`statementContext`) true/false + default overload |
| testBeginCaseBody / testEndCaseBodyNoOp | `beginCaseBody()`, `endCaseBody()` |
| testAppendBlockStart/End | `appendBlockStart()`, `appendBlockEnd()` |
| testNoOpLineMethods | `startNewLine`, `maybeLineBreak`, `maybeCutLine`, `endLine`, `notePreferredLineBreak` |
| testAppendOp | `appendOp()` |
| testAddOp_* (7 tests) | `addOp()` ทุก if/else if branch: `+/+`, `-/-`, letter+wordChar, `-` then `>`, else(no-space), binOp true/false |
| testAddNumber_* (10 tests) | `addNumber()` ทุก branch: negative-after-minus, small int (skip while), zero, while-loop-false-first-iter, while-loop-once exp≤2, exp>2 (scientific), negative integer, non-integer double (+/-) |

**หมายเหตุ:** เมธอดที่เป็น no-op (`startNewLine`, `maybeCutLine`, `endLine` ฯลฯ) ไม่มี logic ให้ assert ผลลัพธ์ตรง ๆ จึงเพียงเรียกเพื่อให้ coverage ครอบคลุม call site ไม่ได้เดา behavior เพิ่มเติมนอกจากที่ระบุในซอร์ส