package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class CodeConsumerTest {

  /**
   * Testable double: เก็บ buffer เพื่อตรวจ append(), นับจำนวนครั้งที่ maybeCutLine/endLine/appendOp
   * ถูกเรียกเพื่อตรวจ branch ภายในเมธอดต่าง ๆ ของ CodeConsumer
   */
  static class TestableCodeConsumer extends CodeConsumer {
    StringBuilder buffer = new StringBuilder();
    int maybeCutLineCalls = 0;
    int endLineCalls = 0;
    int appendOpCalls = 0;
    String lastAppendOpArg = null;
    boolean lastAppendOpBinOp;

    @Override
    char getLastChar() {
      return buffer.length() == 0 ? '\0' : buffer.charAt(buffer.length() - 1);
    }

    @Override
    void append(String str) {
      buffer.append(str);
    }

    @Override
    void maybeCutLine() {
      maybeCutLineCalls++;
    }

    @Override
    void endLine() {
      endLineCalls++;
    }

    @Override
    void appendOp(String op, boolean binOp) {
      appendOpCalls++;
      lastAppendOpArg = op;
      lastAppendOpBinOp = binOp;
      append(op);
    }
  }

  // ---------- Simple no-op / return-value methods ----------

  @Test
  public void testStartSourceMapping_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.startSourceMapping(null); // ไม่มี logic, ตรวจว่าไม่ throw
  }

  @Test
  public void testEndSourceMapping_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endSourceMapping(null);
  }

  @Test
  public void testContinueProcessing_returnsTrue() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    assertTrue(c.continueProcessing());
  }

  @Test
  public void testStartNewLine_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.startNewLine();
  }

  @Test
  public void testNotePreferredLineBreak_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.notePreferredLineBreak();
  }

  @Test
  public void testEndCaseBody_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endCaseBody();
  }

  @Test
  public void testEndFile_noException() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endFile();
  }

  @Test
  public void testShouldPreserveExtraBlocks_returnsFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    assertFalse(c.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockFor_true() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    assertTrue(c.breakAfterBlockFor(null, true));
  }

  @Test
  public void testBreakAfterBlockFor_false() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    assertFalse(c.breakAfterBlockFor(null, false));
  }

  @Test
  public void testAppendBlockStart() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.appendBlockStart();
    assertEquals("{", c.buffer.toString());
  }

  @Test
  public void testAppendBlockEnd() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.appendBlockEnd();
    assertEquals("}", c.buffer.toString());
  }

  @Test
  public void testBeginCaseBody() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.beginCaseBody();
    assertEquals(":", c.buffer.toString());
  }

  @Test
  public void testMaybeLineBreak_callsMaybeCutLine() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.maybeLineBreak();
    assertEquals(1, c.maybeCutLineCalls);
  }

  // ---------- beginBlock() ----------

  @Test
  public void testBeginBlock_statementNeedsEnded_true() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementNeedsEnded = true;
    c.beginBlock();
    // append(";") -> maybeLineBreak() -> appendBlockStart() -> endLine()
    assertEquals(";{", c.buffer.toString());
    assertEquals(1, c.maybeCutLineCalls);
    assertEquals(1, c.endLineCalls);
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testBeginBlock_statementNeedsEnded_false() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementNeedsEnded = false;
    c.beginBlock();
    assertEquals("{", c.buffer.toString());
    assertEquals(0, c.maybeCutLineCalls);
    assertEquals(1, c.endLineCalls);
    assertFalse(c.statementNeedsEnded);
  }

  // ---------- endBlock() / endBlock(boolean) ----------

  @Test
  public void testEndBlock_noArg_defaultsToFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementNeedsEnded = true;
    c.endBlock();
    assertEquals("}", c.buffer.toString());
    assertEquals(0, c.endLineCalls);
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_shouldEndLine_true() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endBlock(true);
    assertEquals("}", c.buffer.toString());
    assertEquals(1, c.endLineCalls);
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_shouldEndLine_false() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endBlock(false);
    assertEquals("}", c.buffer.toString());
    assertEquals(0, c.endLineCalls);
  }

  // ---------- listSeparator ----------

  @Test
  public void testListSeparator() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.listSeparator();
    assertEquals(",", c.buffer.toString());
    assertEquals(1, c.maybeCutLineCalls);
  }

  // ---------- endStatement() / endStatement(boolean) ----------

  @Test
  public void testEndStatement_needSemiColonTrue() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endStatement(true);
    assertEquals(";", c.buffer.toString());
    assertEquals(1, c.maybeCutLineCalls);
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_needSemiColonFalse_statementStartedTrue() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementStarted = true;
    c.endStatement(false);
    assertEquals("", c.buffer.toString());
    assertTrue(c.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_needSemiColonFalse_statementStartedFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementStarted = false;
    c.endStatement(false);
    assertEquals("", c.buffer.toString());
    assertFalse(c.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_noArg_delegatesToFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementStarted = true;
    c.endStatement();
    assertTrue(c.statementNeedsEnded);
  }

  // ---------- maybeEndStatement ----------

  @Test
  public void testMaybeEndStatement_whenNeeded() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementNeedsEnded = true;
    c.maybeEndStatement();
    assertEquals(";", c.buffer.toString());
    assertEquals(1, c.maybeCutLineCalls);
    assertEquals(1, c.endLineCalls);
    assertFalse(c.statementNeedsEnded);
    assertTrue(c.statementStarted);
  }

  @Test
  public void testMaybeEndStatement_whenNotNeeded() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.statementNeedsEnded = false;
    c.maybeEndStatement();
    assertEquals("", c.buffer.toString());
    assertEquals(0, c.maybeCutLineCalls);
    assertEquals(0, c.endLineCalls);
    assertTrue(c.statementStarted);
  }

  // ---------- endFunction() / endFunction(boolean) ----------

  @Test
  public void testEndFunction_noArg_defaultsToFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endFunction();
    assertTrue(c.sawFunction);
    assertEquals(0, c.endLineCalls);
  }

  @Test
  public void testEndFunction_statementContextTrue() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endFunction(true);
    assertTrue(c.sawFunction);
    assertEquals(1, c.endLineCalls);
  }

  @Test
  public void testEndFunction_statementContextFalse() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.endFunction(false);
    assertTrue(c.sawFunction);
    assertEquals(0, c.endLineCalls);
  }

  // ---------- addIdentifier ----------

  @Test
  public void testAddIdentifier_delegatesToAdd() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addIdentifier("foo");
    assertEquals("foo", c.buffer.toString());
  }

  // ---------- add(String) ----------

  @Test
  public void testAdd_emptyString_returnsEarly() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.add("");
    assertEquals("", c.buffer.toString());
    assertTrue(c.statementStarted); // maybeEndStatement() ยังถูกเรียกก่อน
  }

  @Test
  public void testAdd_needsSpace_wordCharBoth() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("abc"); // ทำให้ lastChar = 'c'
    c.add("def");
    assertEquals("abc def", c.buffer.toString());
  }

  @Test
  public void testAdd_noSpace_nonWordChar() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("abc");
    c.add(";");
    assertEquals("abc;", c.buffer.toString());
  }

  @Test
  public void testAdd_backslashFirstChar_needsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("abc"); // lastChar 'c' เป็น wordChar
    c.add("\\d");
    assertEquals("abc \\d", c.buffer.toString());
  }

  // ---------- addOp ----------

  @Test
  public void testAddOp_plusPlus_needsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("+"); // lastChar = '+'
    c.addOp("+", false);
    assertEquals("+ +", c.buffer.toString());
    assertEquals(1, c.appendOpCalls);
    assertEquals(0, c.maybeCutLineCalls);
  }

  @Test
  public void testAddOp_minusMinus_needsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("-");
    c.addOp("-", false);
    assertEquals("- -", c.buffer.toString());
  }

  @Test
  public void testAddOp_letterOpAfterWordChar_needsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("x"); // lastChar = 'x' (wordChar)
    c.addOp("instanceof", false);
    assertEquals("x instanceof", c.buffer.toString());
  }

  @Test
  public void testAddOp_arrowAfterMinus_needsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("-"); // lastChar = '-'
    c.addOp(">", false); // first == '>' , prev == '-'
    assertEquals("- >", c.buffer.toString());
  }

  @Test
  public void testAddOp_elseBranch_noSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("a"); // lastChar = 'a', ไม่เข้าเงื่อนไขใดๆ
    c.addOp("=", false);
    assertEquals("a=", c.buffer.toString());
  }

  @Test
  public void testAddOp_binOpTrue_callsMaybeCutLine() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("a");
    c.addOp("+", true); // ไม่ตรง any if-branch (prev='a' first='+')
    assertEquals(1, c.maybeCutLineCalls);
  }

  @Test
  public void testAddOp_binOpFalse_doesNotCallMaybeCutLine() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("a");
    c.addOp("+", false);
    assertEquals(0, c.maybeCutLineCalls);
  }

  // ---------- addNumber ----------

  @Test
  public void testAddNumber_smallPositiveInteger() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(5.0);
    assertEquals("5", c.buffer.toString());
  }

  @Test
  public void testAddNumber_negativeAfterMinus_addsSpace() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.append("-"); // lastChar '-'
    c.addNumber(-5.0);
    // add(" ") ตามด้วย add("-5")
    assertEquals("- -5", c.buffer.toString());
  }

  @Test
  public void testAddNumber_nonIntegerValue() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(0.5);
    assertEquals("0.5", c.buffer.toString());
  }

  @Test
  public void testAddNumber_negativeZero_usesElseBranch() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(-0.0);
    assertEquals("-0.0", c.buffer.toString());
  }

  @Test
  public void testAddNumber_absLessThan100_skipsWhileLoop() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(50.0); // abs<100 -> ไม่เข้า while loop, exp=0
    assertEquals("50", c.buffer.toString());
  }

  @Test
  public void testAddNumber_expEqualsTwo_notGreaterThanTwo() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(100.0); // exp คำนวณได้ = 2, ไม่ > 2 -> ใช้ value เดิม
    assertEquals("100", c.buffer.toString());
  }

  @Test
  public void testAddNumber_expGreaterThanTwo_usesMantissaNotation() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(1000.0); // exp คำนวณได้ = 3 (> 2) -> "1E3"
    assertEquals("1E3", c.buffer.toString());
  }

  @Test
  public void testAddNumber_negativeExpGreaterThanTwo() {
    TestableCodeConsumer c = new TestableCodeConsumer();
    c.addNumber(-1000.0); // value ติดลบ, exp = 3 -> "-1E3"
    assertEquals("-1E3", c.buffer.toString());
  }

  // ---------- static: isNegativeZero ----------

  @Test
  public void testIsNegativeZero_true() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
  }

  @Test
  public void testIsNegativeZero_falseForPositiveZero() {
    assertFalse(CodeConsumer.isNegativeZero(0.0));
  }

  @Test
  public void testIsNegativeZero_falseForNonZero() {
    assertFalse(CodeConsumer.isNegativeZero(1.0));
  }

  // ---------- static: isWordChar ----------

  @Test
  public void testIsWordChar_underscore() {
    assertTrue(CodeConsumer.isWordChar('_'));
  }

  @Test
  public void testIsWordChar_dollarSign() {
    assertTrue(CodeConsumer.isWordChar('$'));
  }

  @Test
  public void testIsWordChar_letter() {
    assertTrue(CodeConsumer.isWordChar('a'));
  }

  @Test
  public void testIsWordChar_digit() {
    assertTrue(CodeConsumer.isWordChar('9'));
  }

  @Test
  public void testIsWordChar_falseForSymbol() {
    assertFalse(CodeConsumer.isWordChar('!'));
  }

  @Test
  public void testIsWordChar_falseForNullChar() {
    assertFalse(CodeConsumer.isWordChar('\0'));
  }
}
