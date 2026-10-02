# CodeConsumerTest.java

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 tests for {@link CodeConsumer}.
 * เนื่องจาก CodeConsumer เป็น abstract class จึงต้องสร้าง concrete subclass
 * เพื่อทดสอบ (implement getLastChar() และ append(String)).
 *
 * หมายเหตุ: ฟิลด์ statementNeedsEnded, statementStarted, sawFunction เป็น
 * package-private จึงสามารถเข้าถึงตรงได้เพราะ test class อยู่ package เดียวกัน.
 */
public class CodeConsumerTest {

  /** Concrete implementation ที่บันทึกผลลัพธ์และควบคุม lastChar ได้ */
  static class TestableCodeConsumer extends CodeConsumer {
    StringBuilder out = new StringBuilder();
    char lastChar = '\0';

    @Override
    char getLastChar() {
      return lastChar;
    }

    @Override
    void append(String str) {
      out.append(str);
      if (str.length() > 0) {
        lastChar = str.charAt(str.length() - 1);
      }
    }
  }

  private TestableCodeConsumer c;

  @Before
  public void setUp() {
    c = new TestableCodeConsumer();
  }

  // ---------------------------------------------------------------
  // add(String)
  // ---------------------------------------------------------------

  @Test
  public void testAdd_EmptyString_ReturnsEarly() {
    c.lastChar = 'a';
    c.add("");
    assertEquals("", c.out.toString());
    // maybeEndStatement() still runs -> statementStarted becomes true
    assertTrue(c.statementStarted);
  }

  @Test
  public void testAdd_WordCharAfterWordChar_InsertsSpace() {
    c.lastChar = 'a'; // prev is word char
    c.add("bc");      // first char 'b' is word char
    assertEquals(" bc", c.out.toString());
  }

  @Test
  public void testAdd_BackslashAfterWordChar_InsertsSpace() {
    c.lastChar = 'a';
    c.add("\\x");
    assertEquals(" \\x", c.out.toString());
  }

  @Test
  public void testAdd_SlashAfterSlash_InsertsSpace() {
    c.lastChar = '/';
    c.add("/regex/");
    assertEquals(" /regex/", c.out.toString());
  }

  @Test
  public void testAdd_NoSpaceNeeded() {
    c.lastChar = ';'; // not word char
    c.add("abc");     // first char is word char but prev isn't
    assertEquals("abc", c.out.toString());
  }

  @Test
  public void testAdd_MaybeEndStatementTriggered() {
    c.statementNeedsEnded = true;
    c.lastChar = 'x';
    c.add("y");
    // ';' inserted first (no space rule applies to ';' itself),
    // then 'y' after ';' -> ';' not word char so no extra space.
    assertEquals(";y", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  // ---------------------------------------------------------------
  // addOp(String, boolean)
  // ---------------------------------------------------------------

  @Test
  public void testAddOp_PlusAfterPlus_InsertsSpace() {
    c.lastChar = '+';
    c.addOp("+", false);
    assertEquals(" +", c.out.toString());
  }

  @Test
  public void testAddOp_MinusAfterMinus_InsertsSpace() {
    c.lastChar = '-';
    c.addOp("-", false);
    assertEquals(" -", c.out.toString());
  }

  @Test
  public void testAddOp_LetterOperatorAfterWordChar_InsertsSpace() {
    c.lastChar = 'a';
    c.addOp("instanceof", true);
    assertEquals(" instanceof", c.out.toString());
  }

  @Test
  public void testAddOp_ArrowAfterMinus_InsertsSpace() {
    c.lastChar = '-';
    c.addOp("->", false);
    assertEquals(" ->", c.out.toString());
  }

  @Test
  public void testAddOp_NoSpaceNeeded_BinOpTrue() {
    c.lastChar = ';';
    c.addOp("=", true);
    assertEquals("=", c.out.toString());
  }

  // ---------------------------------------------------------------
  // addNumber(double)
  // ---------------------------------------------------------------

  @Test
  public void testAddNumber_SmallPositiveInteger() {
    c.lastChar = ' '; // avoid extra spacing from add()
    c.addNumber(5.0);
    assertEquals("5", c.out.toString());
  }

  @Test
  public void testAddNumber_NegativeAfterMinus_InsertsSpace() {
    c.lastChar = '-';
    c.addNumber(-5.0);
    assertEquals(" -5", c.out.toString());
  }

  @Test
  public void testAddNumber_LargeValue_ExponentGreaterThanTwo() {
    c.lastChar = ' ';
    c.addNumber(100000.0);
    // mantissa=1, exp=5 -> "1E5"
    assertEquals("1E5", c.out.toString());
  }

  @Test
  public void testAddNumber_ExponentEqualsTwo_NoScientific() {
    c.lastChar = ' ';
    c.addNumber(100.0);
    assertEquals("100", c.out.toString());
  }

  @Test
  public void testAddNumber_NonIntegerValue() {
    c.lastChar = ' ';
    c.addNumber(3.14);
    assertEquals(String.valueOf(3.14), c.out.toString());
  }

  @Test
  public void testAddNumber_NegativeZero() {
    c.lastChar = '-';
    c.addNumber(-0.0);
    // x < 0 is false for -0.0, so no leading space inserted,
    // negativeZero true -> goes to else branch: String.valueOf(-0.0)
    assertEquals(String.valueOf(-0.0), c.out.toString());
  }

  // ---------------------------------------------------------------
  // static helpers
  // ---------------------------------------------------------------

  @Test
  public void testIsNegativeZero() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
    assertFalse(CodeConsumer.isNegativeZero(0.0));
    assertFalse(CodeConsumer.isNegativeZero(-5.0));
  }

  @Test
  public void testIsWordChar() {
    assertTrue(CodeConsumer.isWordChar('_'));
    assertTrue(CodeConsumer.isWordChar('$'));
    assertTrue(CodeConsumer.isWordChar('a'));
    assertTrue(CodeConsumer.isWordChar('9'));
    assertFalse(CodeConsumer.isWordChar(' '));
    assertFalse(CodeConsumer.isWordChar('.'));
  }

  // ---------------------------------------------------------------
  // beginBlock / endBlock
  // ---------------------------------------------------------------

  @Test
  public void testBeginBlock_WithoutPendingStatement() {
    c.statementNeedsEnded = false;
    c.beginBlock();
    assertEquals("{", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testBeginBlock_WithPendingStatement() {
    c.statementNeedsEnded = true;
    c.beginBlock();
    assertEquals(";{", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_DefaultNoEndLine() {
    c.statementNeedsEnded = true;
    c.endBlock();
    assertEquals("}", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_WithShouldEndLineTrue() {
    c.statementNeedsEnded = true;
    c.endBlock(true);
    // endLine() is no-op, cannot observe extra output but must not throw
    assertEquals("}", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  // ---------------------------------------------------------------
  // endStatement / maybeEndStatement
  // ---------------------------------------------------------------

  @Test
  public void testEndStatement_NeedSemiColonTrue() {
    c.endStatement(true);
    assertEquals(";", c.out.toString());
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_NoSemiColon_StatementNotStarted() {
    c.statementStarted = false;
    c.statementNeedsEnded = false;
    c.endStatement(false);
    assertFalse(c.statementNeedsEnded); // else-if branch skipped
  }

  @Test
  public void testEndStatement_NoSemiColon_StatementStarted() {
    c.statementStarted = true;
    c.statementNeedsEnded = false;
    c.endStatement(false);
    assertTrue(c.statementNeedsEnded); // else-if branch executed
  }

  @Test
  public void testMaybeEndStatement_PendingTrue() {
    c.statementNeedsEnded = true;
    c.maybeEndStatement();
    assertEquals(";", c.out.toString());
    assertFalse(c.statementNeedsEnded);
    assertTrue(c.statementStarted);
  }

  @Test
  public void testMaybeEndStatement_PendingFalse() {
    c.statementNeedsEnded = false;
    c.maybeEndStatement();
    assertEquals("", c.out.toString());
    assertTrue(c.statementStarted);
  }

  // ---------------------------------------------------------------
  // endFunction
  // ---------------------------------------------------------------

  @Test
  public void testEndFunction_Default() {
    c.endFunction();
    assertTrue(c.sawFunction);
  }

  @Test
  public void testEndFunction_StatementContextTrue() {
    c.endFunction(true);
    assertTrue(c.sawFunction);
    // endLine() no-op, just ensure no exception thrown
  }

  @Test
  public void testEndFunction_StatementContextFalse() {
    c.endFunction(false);
    assertTrue(c.sawFunction);
  }

  // ---------------------------------------------------------------
  // Default overridable methods
  // ---------------------------------------------------------------

  @Test
  public void testContinueProcessing_DefaultTrue() {
    assertTrue(c.continueProcessing());
  }

  @Test
  public void testShouldPreserveExtraBlocks_DefaultFalse() {
    assertFalse(c.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockFor_StatementContextTrue() {
    assertTrue(c.breakAfterBlockFor(null, true));
  }

  @Test
  public void testBreakAfterBlockFor_StatementContextFalse() {
    assertFalse(c.breakAfterBlockFor(null, false));
  }

  // ---------------------------------------------------------------
  // Other simple delegating / no-op methods
  // ---------------------------------------------------------------

  @Test
  public void testListSeparator() {
    c.lastChar = ' '; // avoid unrelated spacing
    c.listSeparator();
    assertEquals(",", c.out.toString());
  }

  @Test
  public void testBeginCaseBody() {
    c.beginCaseBody();
    assertEquals(":", c.out.toString());
  }

  @Test
  public void testEndCaseBody_NoException() {
    c.endCaseBody(); // no-op, just ensure no exception
  }

  @Test
  public void testAddIdentifier_DelegatesToAdd() {
    c.lastChar = ' ';
    c.addIdentifier("foo");
    assertEquals("foo", c.out.toString());
  }

  @Test
  public void testAppendBlockStart() {
    c.appendBlockStart();
    assertEquals("{", c.out.toString());
  }

  @Test
  public void testAppendBlockEnd() {
    c.appendBlockEnd();
    assertEquals("}", c.out.toString());
  }

  @Test
  public void testAppendOp_IgnoresBinOpFlag() {
    c.appendOp("+", true);
    assertEquals("+", c.out.toString());
    c.out.setLength(0);
    c.appendOp("+", false);
    assertEquals("+", c.out.toString());
  }

  @Test
  public void testNoOpMethods_DoNotThrow() {
    // เมธอดเหล่านี้เป็น no-op ใน base class, เรียกเพื่อความครอบคลุมและ
    // ป้องกัน regression หากมีการเพิ่ม logic ในอนาคต
    c.startNewLine();
    c.maybeLineBreak();
    c.maybeCutLine();
    c.endLine();
    c.notePreferredLineBreak();
    c.endFile();
    c.startSourceMapping(null);
    c.endSourceMapping(null);
  }
}
```

## สรุปการครอบคลุม (Branch/Condition Coverage)

| # | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| 1 | testAdd_EmptyString_ReturnsEarly | `add()`: newcode.length()==0 → return |
| 2 | testAdd_WordCharAfterWordChar_InsertsSpace | `add()`: isWordChar(c) && isWordChar(lastChar) == true |
| 3 | testAdd_BackslashAfterWordChar_InsertsSpace | `add()`: c=='\\' branch ของเงื่อนไขแรก |
| 4 | testAdd_SlashAfterSlash_InsertsSpace | `add()`: c=='/' && lastChar=='/' == true |
| 5 | testAdd_NoSpaceNeeded | `add()`: ทั้งสองเงื่อนไข false (else path) |
| 6 | testAdd_MaybeEndStatementTriggered | `add()` เรียก `maybeEndStatement()` เมื่อ statementNeedsEnded=true |
| 7 | testAddOp_PlusAfterPlus_InsertsSpace | `addOp()`: (first=='+') && prev==first |
| 8 | testAddOp_MinusAfterMinus_InsertsSpace | `addOp()`: (first=='-') && prev==first |
| 9 | testAddOp_LetterOperatorAfterWordChar_InsertsSpace | `addOp()`: isLetter(first) && isWordChar(prev) |
| 10 | testAddOp_ArrowAfterMinus_InsertsSpace | `addOp()`: prev=='-' && first=='>' |
| 11 | testAddOp_NoSpaceNeeded_BinOpTrue | `addOp()`: else path + binOp=true → maybeCutLine() |
| 12 | testAddNumber_SmallPositiveInteger | `addNumber()`: (long)x==x, abs(x)<100, exp<=2 |
| 13 | testAddNumber_NegativeAfterMinus_InsertsSpace | `addNumber()`: x<0 && prev=='-' == true |
| 14 | testAddNumber_LargeValue_ExponentGreaterThanTwo | `addNumber()`: while-loop หลายรอบ, exp>2 |
| 15 | testAddNumber_ExponentEqualsTwo_NoScientific | `addNumber()`: while-loop, exp==2 (ไม่ >2) |
| 16 | testAddNumber_NonIntegerValue | `addNumber()`: (long)x!=x → else branch |
| 17 | testAddNumber_NegativeZero | `addNumber()`: negativeZero=true, x<0 เป็น false สำหรับ -0.0 |
| 18 | testIsNegativeZero | `isNegativeZero()` ทุกกรณี true/false |
| 19 | testIsWordChar | `isWordChar()` ทุกเงื่อนไข (_, $, letter/digit, false) |
| 20 | testBeginBlock_WithoutPendingStatement | `beginBlock()`: statementNeedsEnded=false |
| 21 | testBeginBlock_WithPendingStatement | `beginBlock()`: statementNeedsEnded=true |
| 22 | testEndBlock_DefaultNoEndLine | `endBlock(boolean)`: shouldEndLine=false |
| 23 | testEndBlock_WithShouldEndLineTrue | `endBlock(boolean)`: shouldEndLine=true |
| 24 | testEndStatement_NeedSemiColonTrue | `endStatement()`: needSemiColon=true |
| 25 | testEndStatement_NoSemiColon_StatementNotStarted | `endStatement()`: else-if false (statementStarted=false) |
| 26 | testEndStatement_NoSemiColon_StatementStarted | `endStatement()`: else-if true (statementStarted=true) |
| 27 | testMaybeEndStatement_PendingTrue | `maybeEndStatement()`: statementNeedsEnded=true |
| 28 | testMaybeEndStatement_PendingFalse | `maybeEndStatement()`: statementNeedsEnded=false |
| 29 | testEndFunction_Default / StatementContextTrue/False | `endFunction(boolean)`: statementContext true/false |
| 30 | testContinueProcessing_DefaultTrue | default return true |
| 31 | testShouldPreserveExtraBlocks_DefaultFalse | default return false |
| 32 | testBreakAfterBlockFor_* | return statementContext (true/false) |
| 33 | testListSeparator / testBeginCaseBody / testEndCaseBody_NoException / testAddIdentifier_DelegatesToAdd / testAppendBlockStart / testAppendBlockEnd / testAppendOp_IgnoresBinOpFlag | delegation methods (ไม่มี branch แต่ครอบคลุม call path) |
| 34 | testNoOpMethods_DoNotThrow | เมธอด no-op (startNewLine, maybeLineBreak, maybeCutLine, endLine, notePreferredLineBreak, endFile, startSourceMapping, endSourceMapping) — ไม่มี branch แต่ป้องกัน regression |

**หมายเหตุ:** เมธอด `startSourceMapping`, `endSourceMapping`, `startNewLine`, `maybeCutLine`, `endLine`, `notePreferredLineBreak`, `endFile`, `endCaseBody` เป็น empty method (no-op) ในซอร์สที่ให้มา จึงไม่มี branch ให้ทดสอบจริง แต่ยังคงเรียกเพื่อยืนยันว่าไม่มี exception เกิดขึ้นและเผื่อ regression ในอนาคต