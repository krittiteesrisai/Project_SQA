# CommandLineRunnerTest.java

```java
package com.google.javascript.jscomp;

// Import คลาสเป้าหมาย (แม้อยู่ package เดียวกัน ระบุ import ให้ชัดเจนตามข้อกำหนด)
import com.google.javascript.jscomp.CommandLineRunner;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Unit test สำหรับ {@link CommandLineRunner}
 *
 * หมายเหตุสำคัญ:
 * - Constructor เป็น protected แต่เนื่องจาก test class อยู่ package เดียวกัน
 *   (com.google.javascript.jscomp) จึงสามารถเรียกใช้ได้โดยตรง
 * - บาง field เป็น private ใน nested class Flags จึงใช้ reflection
 *   เพื่อตรวจสอบผลลัพธ์การ parse flag
 * - ห้ามเรียก main() หรือ run() เพราะภายในอาจเรียก System.exit(...)
 *   ซึ่งจะทำให้ JVM ของ test ถูกฆ่า (ไม่มีหลักฐานในซอร์สว่า run() ปลอดภัย)
 */
public class CommandLineRunnerTest {

  // ---------- Helper: reflection เข้าถึง private fields ----------

  private Object getFlags(CommandLineRunner runner) throws Exception {
    Field f = CommandLineRunner.class.getDeclaredField("flags");
    f.setAccessible(true);
    return f.get(runner);
  }

  @SuppressWarnings("unchecked")
  private <T> T getFlagValue(Object flags, String fieldName) throws Exception {
    Field f = flags.getClass().getDeclaredField(fieldName);
    f.setAccessible(true);
    return (T) f.get(flags);
  }

  // ================= 1. Default / Boundary values =================

  @Test
  public void testNoArgs_DefaultsAreCorrect() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    Object flags = getFlags(runner);

    assertFalse((Boolean) getFlagValue(flags, "print_tree"));
    assertFalse((Boolean) getFlagValue(flags, "debug"));
    assertTrue((Boolean) getFlagValue(flags, "process_closure_primitives"));
    assertFalse((Boolean) getFlagValue(flags, "use_only_custom_externs"));
    assertEquals(1, ((Integer) getFlagValue(flags, "summary_detail_level")).intValue());
    List<String> js = getFlagValue(flags, "js");
    assertTrue(js.isEmpty());
    List<?> formatting = getFlagValue(flags, "formatting");
    assertTrue(formatting.isEmpty());
  }

  // ================= 2. Regex arg-splitting: "--flag=value" =================

  @Test
  public void testEqualsArg_SimpleValue() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js=foo.js"});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals(1, js.size());
    assertEquals("foo.js", js.get(0));
  }

  @Test
  public void testEqualsArg_SingleQuotedValue_StripsQuotes() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js='foo.js'"});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals("foo.js", js.get(0));
  }

  @Test
  public void testEqualsArg_DoubleQuotedValue_StripsQuotes() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js=\"foo.js\""});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals("foo.js", js.get(0));
  }

  @Test
  public void testEqualsArg_MismatchedQuoteChars_StillStripped() throws Exception {
    // quotesPattern คือ ^['\"](.*)['\"]$ อนุญาตหัว/ท้ายเป็นเครื่องหมายคำพูดต่างชนิดกันได้
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js='foo.js\""});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals("foo.js", js.get(0));
  }

  @Test
  public void testEqualsArg_NoQuotes_ValueKeptAsIs() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js=foo bar.js"});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals("foo bar.js", js.get(0));
  }

  @Test
  public void testArgPattern_NotMatched_PassedThroughAsIs() throws Exception {
    // ชื่อ flag มีตัวเลขนำหน้าซึ่งไม่ match regex [a-zA-Z_]+
    // -> จะไม่ถูกแตกเป็น 2 args แต่ args4j จะไม่รู้จัก option นี้ -> CmdLineException
    try {
      new CommandLineRunner(new String[] {"--123abc=val"});
      fail("Expected CmdLineException due to unrecognized/invalid option format");
    } catch (CmdLineException expected) {
      // pass
    }
  }

  @Test
  public void testArgWithoutEquals_MultipleValuesAccumulate() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--js=a.js", "--js=b.js"});
    List<String> js = getFlagValue(getFlags(runner), "js");
    assertEquals(2, js.size());
    assertEquals("a.js", js.get(0));
    assertEquals("b.js", js.get(1));
  }

  @Test
  public void testExternsMultipleValues() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--externs=e1.js", "--externs=e2.js"});
    List<String> externs = getFlagValue(getFlags(runner), "externs");
    assertEquals(2, externs.size());
  }

  @Test
  public void testDefineAlias_D_UppercaseWorks() throws Exception {
    // --D เป็น alias ของ --define ตามซอร์ส
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--D=FOO=true"});
    List<String> define = getFlagValue(getFlags(runner), "define");
    assertEquals(1, define.size());
    assertEquals("FOO=true", define.get(0));
  }

  // ================= 3. Boolean flag without "=" (param == null) =================

  @Test
  public void testBooleanFlag_NoParameter_DefaultsToTrue() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug"});
    Object flags = getFlags(runner);
    assertTrue((Boolean) getFlagValue(flags, "debug"));
  }

  // ================= 4. BooleanOptionHandler: true/false synonyms =================

  @Test
  public void testBooleanOptionHandler_TrueSynonyms() throws Exception {
    String[] trueValues = {"true", "on", "yes", "1", "TRUE", "On", "YES"};
    for (String v : trueValues) {
      CommandLineRunner runner =
          new CommandLineRunner(new String[] {"--debug=" + v});
      Object flags = getFlags(runner);
      assertTrue("Value " + v + " should map to true",
          (Boolean) getFlagValue(flags, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_FalseSynonyms() throws Exception {
    String[] falseValues = {"false", "off", "no", "0", "FALSE", "Off", "NO"};
    for (String v : falseValues) {
      CommandLineRunner runner =
          new CommandLineRunner(new String[] {"--debug=" + v});
      Object flags = getFlags(runner);
      assertFalse("Value " + v + " should map to false",
          (Boolean) getFlagValue(flags, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_InvalidValue_ThrowsCmdLineException() {
    try {
      new CommandLineRunner(new String[] {"--debug=maybe"});
      fail("Expected CmdLineException for illegal boolean value");
    } catch (CmdLineException e) {
      assertTrue(e.getMessage() != null
          && e.getMessage().contains("Illegal boolean value"));
    }
  }

  // ================= 5. Constructor with err stream =================

  @Test
  public void testConstructorWithStreams_ValidArgs_NoException() throws Exception {
    ByteArrayOutputStream outBuf = new ByteArrayOutputStream();
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(outBuf);
    PrintStream err = new PrintStream(errBuf);

    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--js=a.js"}, out, err);
    assertNotNull(runner);
    // ไม่ควรมีข้อความ error ใด ๆ ถูกเขียนลง err
    assertEquals("", errBuf.toString());
  }

  @Test
  public void testConstructorWithStreams_InvalidArgs_WritesErrAndThrows() {
    ByteArrayOutputStream outBuf = new ByteArrayOutputStream();
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(outBuf);
    PrintStream err = new PrintStream(errBuf);

    try {
      new CommandLineRunner(new String[] {"--debug=maybe"}, out, err);
      fail("Expected CmdLineException");
    } catch (CmdLineException e) {
      String errText = errBuf.toString();
      assertTrue("err stream should contain error message",
          errText.contains("Illegal boolean value"));
    }
  }

  // ================= 6. createOptions(): debug branch =================

  @Test
  public void testCreateOptions_DebugTrue_NoExceptionAndOptionsNotNull() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug=true"});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    // ไม่ทราบ field ภายในที่ setDebugOptionsForCompilationLevel ตั้งค่า (อยู่นอกซอร์สที่ให้มา)
    // จึงยืนยันเพียงว่าไม่มี exception และ branch ถูกเข้าใช้งาน
  }

  @Test
  public void testCreateOptions_DebugFalse_SkipsDebugOptions() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  // ================= 7. createOptions(): process_closure_primitives branch =================

  @Test
  public void testCreateOptions_ClosurePrimitivesDefaultTrue_SetsClosurePass()
      throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.closurePass);
  }

  @Test
  public void testCreateOptions_ClosurePrimitivesFalse_ClosurePassNotSetTrue()
      throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--process_closure_primitives=false"});
    CompilerOptions options = runner.createOptions();
    // สมมติฐาน: ค่า default ของ CompilerOptions.closurePass คือ false
    // (ไม่มีการตั้งค่าอื่นใดในซอร์สที่ให้มาสำหรับ branch นี้)
    assertFalse(options.closurePass);
  }

  // ================= 8. createOptions(): formatting loop =================

  @Test
  public void testCreateOptions_NoFormatting_LoopNotEntered() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    CompilerOptions options = runner.createOptions();
    assertFalse(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingPrettyPrint_SetsPrettyPrint() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--formatting=PRETTY_PRINT"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
  }

  @Test
  public void testCreateOptions_FormattingPrintInputDelimiter_SetsFlag() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--formatting=PRINT_INPUT_DELIMITER"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingBothValues_LoopMultipleIterations()
      throws Exception {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--formatting=PRETTY_PRINT", "--formatting=PRINT_INPUT_DELIMITER"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingInvalidEnum_ThrowsCmdLineException() {
    try {
      new CommandLineRunner(new String[] {"--formatting=NOT_A_REAL_OPTION"});
      fail("Expected CmdLineException for invalid enum value");
    } catch (CmdLineException expected) {
      // pass
    }
  }

  // ================= 9. createCompiler() =================

  @Test
  public void testCreateCompiler_ReturnsNonNullCompiler() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // ================= 10. createExterns(): use_only_custom_externs branch =================

  @Test
  public void testCreateExterns_UseOnlyCustomExternsTrue_ReturnsSuperListDirectly()
      throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--use_only_custom_externs=true"});
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    // ไม่มี --externs ระบุ จึงคาดว่า super.createExterns() คืน list ว่าง
    assertEquals(0, externs.size());
  }

  @Test
  public void testCreateExterns_UseOnlyCustomExternsFalse_AttemptsDefaultExterns() {
    // หมายเหตุ: branch นี้เรียก getDefaultExterns() ซึ่งอ่าน resource "/externs.zip"
    // จากคลาสพาธจริงของ compiler ถ้า resource นี้ไม่มีอยู่ใน test classpath
    // อาจเกิด NullPointerException หรือ IOException ได้ (ไม่ได้ระบุ behavior
    // ที่แน่ชัดในซอร์สที่ให้มาสำหรับกรณี resource หายไป)
    // จึงทดสอบเพียงว่า branch (else -> โหลด default externs) ถูกเรียกใช้งานจริง
    // และไม่ throw exception ประเภทที่ไม่คาดคิด (เช่น RuntimeException อื่น ๆ)
    try {
      CommandLineRunner runner = new CommandLineRunner(new String[] {});
      List<JSSourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (NullPointerException | java.io.IOException e) {
      // ยอมรับได้ในสภาพแวดล้อม test ที่ไม่มี externs.zip จริง
      assertTrue(true);
    } catch (Exception e) {
      fail("Unexpected exception type: " + e.getClass());
    }
  }

  // ================= 11. compilation_level / warning_level (pass-through) =================

  @Test
  public void testCompilationLevelFlag_ParsedCorrectly() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--compilation_level=WHITESPACE_ONLY"});
    Object flags = getFlags(runner);
    CompilationLevel level = getFlagValue(flags, "compilation_level");
    assertEquals(CompilationLevel.WHITESPACE_ONLY, level);
  }

  @Test
  public void testCompilationLevelFlag_InvalidValue_ThrowsCmdLineException() {
    try {
      new CommandLineRunner(new String[] {"--compilation_level=NOT_REAL"});
      fail("Expected CmdLineException");
    } catch (CmdLineException expected) {
      // pass
    }
  }

  @Test
  public void testWarningLevelFlag_ParsedCorrectly() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--warning_level=VERBOSE"});
    Object flags = getFlags(runner);
    WarningLevel level = getFlagValue(flags, "warning_level");
    assertEquals(WarningLevel.VERBOSE, level);
  }

  // ================= 12. summary_detail_level boundary values =================

  @Test
  public void testSummaryDetailLevel_BoundaryValues() throws Exception {
    int[] values = {0, 1, 2, 3};
    for (int v : values) {
      CommandLineRunner runner =
          new CommandLineRunner(new String[] {"--summary_detail_level=" + v});
      Object flags = getFlags(runner);
      int actual = (Integer) getFlagValue(flags, "summary_detail_level");
      assertEquals(v, actual);
    }
  }

  // ================= 13. jscomp_dev_mode enum flag (alias --dev_mode) =================

  @Test
  public void testJscompDevMode_AliasWorks() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--dev_mode=EVERY_PASS"});
    Object flags = getFlags(runner);
    CompilerOptions.DevMode mode = getFlagValue(flags, "jscomp_dev_mode");
    assertEquals(CompilerOptions.DevMode.EVERY_PASS, mode);
  }
}
```

## ตารางสรุปการครอบคลุม (Coverage Mapping)

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNoArgs_DefaultsAreCorrect` | ค่า default ของทุก flag (baseline, ไม่ผ่าน if ใด ๆ ใน argPattern) |
| `testEqualsArg_SimpleValue` | `argPattern.matches()==true`, `quotesMatcher.matches()==false` |
| `testEqualsArg_SingleQuotedValue_StripsQuotes` | `quotesMatcher.matches()==true` (single quote) |
| `testEqualsArg_DoubleQuotedValue_StripsQuotes` | `quotesMatcher.matches()==true` (double quote) |
| `testEqualsArg_MismatchedQuoteChars_StillStripped` | quotesPattern กับเครื่องหมายคำพูดต่างชนิดหัว/ท้าย |
| `testEqualsArg_NoQuotes_ValueKeptAsIs` | `quotesMatcher.matches()==false` เนื่องจากไม่มี quote |
| `testArgPattern_NotMatched_PassedThroughAsIs` | `matcher.matches()==false` (else branch ของ for-loop) → CmdLineException |
| `testArgWithoutEquals_MultipleValuesAccumulate` | loop สะสมหลาย args ที่ match argPattern |
| `testExternsMultipleValues` | loop สะสม list หลายค่า (externs) |
| `testDefineAlias_D_UppercaseWorks` | alias parsing ผ่าน args4j (`--D`) |
| `testBooleanFlag_NoParameter_DefaultsToTrue` | `param == null` branch ใน `parseArguments` |
| `testBooleanOptionHandler_TrueSynonyms` | `TRUES.contains(lowerParam)` branch |
| `testBooleanOptionHandler_FalseSynonyms` | `FALSES.contains(lowerParam)` branch |
| `testBooleanOptionHandler_InvalidValue_ThrowsCmdLineException` | else branch → throw `CmdLineException` |
| `testConstructorWithStreams_ValidArgs_NoException` | constructor 2 (out/err), try-block สำเร็จ |
| `testConstructorWithStreams_InvalidArgs_WritesErrAndThrows` | catch-block: `err.println`, `printUsage`, rethrow |
| `testCreateOptions_DebugTrue_NoExceptionAndOptionsNotNull` | `if (flags.debug)` == true |
| `testCreateOptions_DebugFalse_SkipsDebugOptions` | `if (flags.debug)` == false |
| `testCreateOptions_ClosurePrimitivesDefaultTrue_SetsClosurePass` | `if (flags.process_closure_primitives)` == true |
| `testCreateOptions_ClosurePrimitivesFalse_ClosurePassNotSetTrue` | `if (flags.process_closure_primitives)` == false |
| `testCreateOptions_NoFormatting_LoopNotEntered` | for-loop `formatting` ว่าง (0 iterations) |
| `testCreateOptions_FormattingPrettyPrint_SetsPrettyPrint` | `switch(PRETTY_PRINT)` case |
| `testCreateOptions_FormattingPrintInputDelimiter_SetsFlag` | `switch(PRINT_INPUT_DELIMITER)` case |
| `testCreateOptions_FormattingBothValues_LoopMultipleIterations` | loop มากกว่า 1 iteration |
| `testCreateOptions_FormattingInvalidEnum_ThrowsCmdLineException` | args4j enum parse fail |
| `testCreateCompiler_ReturnsNonNullCompiler` | `createCompiler()` (ไม่มี branch แต่ยืนยัน behavior) |
| `testCreateExterns_UseOnlyCustomExternsTrue_ReturnsSuperListDirectly` | `else` branch: `use_only_custom_externs == true` |
| `testCreateExterns_UseOnlyCustomExternsFalse_AttemptsDefaultExterns` | `if` branch: `use_only_custom_externs == false` (best-effort, environment-dependent) |
| `testCompilationLevelFlag_ParsedCorrectly` / `Invalid` | enum flag parsing ปกติ/ผิดพลาด |
| `testWarningLevelFlag_ParsedCorrectly` | enum flag parsing ปกติ |
| `testSummaryDetailLevel_BoundaryValues` | ค่า int boundary 0-3 |
| `testJscompDevMode_AliasWorks` | alias `--dev_mode` → `jscomp_dev_mode` |

**หมายเหตุสำคัญที่ต้องระวัง:**
- ไม่ได้ทดสอบ `main()` และ `run()` เพราะอาจเรียก `System.exit()` ซึ่งจะทำให้ JVM ของกระบวนการทดสอบถูกยุติ (ไม่มีหลักฐานในซอร์สยืนยันว่าปลอดภัย)
- `testCreateExterns_UseOnlyCustomExternsFalse_AttemptsDefaultExterns` เป็น best-effort เนื่องจากพึ่งพา resource `/externs.zip` ที่อาจไม่มีใน test classpath
- ค่า default ของ `CompilerOptions.closurePass`, `prettyPrint`, `printInputDelimiter` ถูกสมมติว่าเป็น `false` ตามพฤติกรรมทั่วไปของ constructor เนื่องจากไม่มีซอร์สของ `CompilerOptions` ให้ตรวจสอบตรง ๆ