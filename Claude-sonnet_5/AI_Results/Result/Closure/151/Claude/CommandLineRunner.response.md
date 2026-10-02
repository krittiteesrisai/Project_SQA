# วิเคราะห์และออกแบบ Test

จากซอร์สของ `CommandLineRunner` (Closure-151b) มีจุดที่ทดสอบได้โดยตรง (ผ่าน constructor ที่เป็น `protected` ซึ่งเข้าถึงได้เพราะ test class อยู่ package เดียวกัน) คือ:

- `initConfigFromFlags()` (เรียกผ่าน constructor) — regex แปลง `--flag=value`, quotes matching, CmdLineException handling, `display_help`/`third_party` branch
- `Flags.BooleanOptionHandler.parseArguments()` — ทดสอบผ่านค่า boolean flag เช่น `--print_tree`
- `createOptions()` — debug flag, formatting loop/switch, closurePass
- `createExterns()` — branch `use_only_custom_externs || isInTestMode()`
- `createCompiler()`, `shouldRunCompiler()`

**หมายเหตุสำคัญ (ตามข้อ 4):** พฤติกรรมภายในของ `AbstractCommandLineRunner.createExterns()`, `isInTestMode()`, `CompilationLevel.setOptionsForCompilationLevel()` และค่า default ของ field ใน `CompilerOptions` ไม่ปรากฏในซอร์สที่ให้มา จึงใส่คอมเมนต์กำกับ assumption ไว้ในทุกจุดที่เกี่ยวข้อง และหลีกเลี่ยงการยืนยันผลลัพธ์ที่ไม่สามารถพิสูจน์ได้จากซอร์สที่ให้มาเท่านั้น

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Unit tests for {@link CommandLineRunner} (Defects4J Closure-151b).
 *
 * Test class ถูกวางไว้ package เดียวกับ target class (com.google.javascript.jscomp)
 * เพื่อให้เข้าถึง constructor / method ระดับ protected ได้โดยตรง โดยไม่ต้อง mock
 * ส่วนที่ไม่มีในซอร์สที่ให้มา (เช่น internal ของ AbstractCommandLineRunner)
 * จะถูกทดสอบ "ตามพฤติกรรมที่ระบุไว้ตรงๆ ในซอร์ส" เท่านั้น จุดที่ไม่แน่ใจจะมีคอมเมนต์กำกับ
 */
public class CommandLineRunnerTest {

  private CommandLineRunner newRunner(String[] args, ByteArrayOutputStream errBuf) {
    ByteArrayOutputStream outBuf = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(outBuf);
    PrintStream err = new PrintStream(errBuf);
    return new CommandLineRunner(args, out, err);
  }

  // ---------------------------------------------------------------------
  // initConfigFromFlags(): regex / quotes / CmdLineException / help branch
  // ---------------------------------------------------------------------

  @Test
  public void testNoArgs_DefaultValidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    // isConfigValid = true, display_help = false -> else branch (setters chain)
    assertTrue(runner.shouldRunCompiler());
    assertEquals(0, errBuf.size());
  }

  @Test
  public void testHelpFlag_InvalidatesConfigAndPrintsUsage() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--help"}, errBuf);
    // isConfigValid=true (parse สำเร็จ) แต่ display_help=true -> if branch, isConfigValid ถูกตั้งเป็น false
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.size() > 0); // parser.printUsage(err)
  }

  @Test
  public void testUnknownFlag_CausesCmdLineException_InvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--not_a_real_flag"}, errBuf);
    // parser.parseArgument throws CmdLineException -> catch -> isConfigValid=false
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.size() > 0); // err.println(e.getMessage())
  }

  @Test
  public void testMalformedIntegerOption_InvalidConfig() {
    // summary_detail_level เป็น int, ค่า "abc" ผิดรูปแบบ -> CmdLineException
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--summary_detail_level=abc"}, errBuf);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testEqualsSyntax_NoQuotes_ValidConfig() {
    // matcher.matches()=true, quotesMatcher.matches()=false -> processedArgs.add(value)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--js_output_file=out.js"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testEqualsSyntax_EmptyValue_ValidConfig() {
    // boundary: ค่าหลัง '=' เป็นสตริงว่าง -> quotesMatcher ไม่ match (ไม่มี quote คู่)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--js_output_file="}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testEqualsSyntax_DoubleQuotedValue_ValidConfig() {
    // quotesMatcher.matches()=true -> ใช้ group(1) (ค่าไม่มี quote)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--output_wrapper=\"abc\""}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testEqualsSyntax_SingleQuotedValue_ValidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--output_wrapper='abc'"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testPlainFlag_NoEqualsSign_NotMatchedByArgPattern() {
    // matcher.matches()=false -> processedArgs.add(arg) (else branch)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--third_party"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testThirdPartyTrue_UsesDefaultCodingConventionBranch() {
    // flags.third_party ? new DefaultCodingConvention() : ... (true branch)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--third_party", "true"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testThirdPartyFalse_UsesClosureCodingConventionBranch() {
    // flags.third_party ? ... : new ClosureCodingConvention() (false branch, default)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--third_party", "false"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // Flags.BooleanOptionHandler.parseArguments() branch (ผ่าน --print_tree)
  // ---------------------------------------------------------------------

  @Test
  public void testBooleanFlag_NoTrailingValue_ParamNullSetsTrue_ValidConfig() {
    // param == null -> setter.addValue(true); return 0;
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--print_tree"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlag_ExplicitTrueValue_ValidConfig() {
    // TRUES.contains("true")
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--print_tree", "true"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlag_ExplicitFalseValue_ValidConfig() {
    // FALSES.contains("false")
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--print_tree", "false"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlag_CaseInsensitiveTrueValue_ValidConfig() {
    // lowerParam = param.toLowerCase()
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--print_tree", "YES"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlag_IllegalValue_InvalidConfig() {
    // ไม่อยู่ใน TRUES หรือ FALSES -> throw CmdLineException -> isConfigValid=false
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--print_tree", "not_a_boolean"}, errBuf);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.size() > 0);
  }

  // ---------------------------------------------------------------------
  // createOptions(): debug flag / formatting loop-switch / closurePass
  // ---------------------------------------------------------------------

  @Test
  public void testCreateOptions_DebugFalse_NoException() {
    // if (flags.debug) ... ไม่ถูกเข้า (default false)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_DebugTrue_NoException() {
    // if (flags.debug) ... ถูกเข้า -> level.setDebugOptionsForCompilationLevel(options)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--debug", "true"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    // ไม่ assert ค่า field ภายในเพิ่มเติมเพราะ setDebugOptionsForCompilationLevel()
    // ไม่ได้แสดง implementation ในซอร์สที่ให้มา
  }

  @Test
  public void testCreateOptions_FormattingEmptyList_NoException() {
    // for (FormattingOption formattingOption : flags.formatting) : loop 0 รอบ
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    // หมายเหตุ: ไม่ assert ค่า prettyPrint/printInputDelimiter เพราะค่าเหล่านี้อาจถูกกำหนด
    // ล่วงหน้าโดย CompilationLevel/WarningLevel ซึ่งไม่มี implementation ในซอร์สที่ให้มา
  }

  @Test
  public void testCreateOptions_FormattingPrettyPrint_SetsPrettyPrintTrue() {
    // switch(this) case PRETTY_PRINT: options.prettyPrint = true; (loop 1 รอบ)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--formatting", "PRETTY_PRINT"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
  }

  @Test
  public void testCreateOptions_FormattingPrintInputDelimiter_SetsFlagTrue() {
    // switch(this) case PRINT_INPUT_DELIMITER: options.printInputDelimiter = true;
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--formatting", "PRINT_INPUT_DELIMITER"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_ClosurePassDefaultTrue() {
    // options.closurePass = flags.process_closure_primitives; (default true)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.closurePass);
  }

  @Test
  public void testCreateOptions_ClosurePassFalseWhenDisabled() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--process_closure_primitives", "false"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  // ---------------------------------------------------------------------
  // createExterns(): if (flags.use_only_custom_externs || isInTestMode())
  // ---------------------------------------------------------------------

  @Test
  public void testCreateExterns_UseOnlyCustomExterns_TrueBranch_NoException()
      throws Exception {
    // flags.use_only_custom_externs = true -> เข้า if branch, return externs (จาก super)
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(
        new String[]{"--use_only_custom_externs", "true"}, errBuf);
    assertTrue(runner.shouldRunCompiler());
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    // หมายเหตุ: เนื้อหาจริงของลิสต์ขึ้นกับ AbstractCommandLineRunner#createExterns()
    // ซึ่งไม่มีอยู่ในซอร์สที่ให้มา จึงไม่ assert ขนาด/เนื้อหาที่เจาะจง
  }

  @Test
  public void testCreateExterns_DefaultFlags_ElseBranch_ReturnsNonEmptyList()
      throws Exception {
    // flags.use_only_custom_externs = false และสมมติ isInTestMode() = false (ค่า default)
    // -> เข้า else branch -> getDefaultExterns() + addAll(externs)
    // หมายเหตุ: การทดสอบนี้ตั้งอยู่บนสมมติฐานว่า resource "/externs.zip" มีอยู่จริงบน
    // classpath ขณะรันเทส (เป็นส่วนหนึ่งของโปรเจกต์ Closure Compiler ต้นทาง) และว่า
    // isInTestMode() คืนค่า false ตามปริยาย ซึ่งไม่มีการยืนยันจากซอร์สที่ให้มา
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    assertTrue(runner.shouldRunCompiler());
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertTrue(externs.size() > 0);
  }

  // ---------------------------------------------------------------------
  // createCompiler()
  // ---------------------------------------------------------------------

  @Test
  public void testCreateCompiler_ReturnsNonNullCompiler() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // ---------------------------------------------------------------------
  // shouldRunCompiler()
  // ---------------------------------------------------------------------

  @Test
  public void testShouldRunCompiler_TrueWhenValid() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[0], errBuf);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testShouldRunCompiler_FalseWhenInvalid() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[]{"--help"}, errBuf);
    assertFalse(runner.shouldRunCompiler());
  }
}
```

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNoArgs_DefaultValidConfig | `initConfigFromFlags`: parse สำเร็จ, `!isConfigValid \|\| display_help` = false → else (setters chain) |
| testHelpFlag_InvalidatesConfigAndPrintsUsage | `display_help = true` → if branch, `printUsage` |
| testUnknownFlag_CausesCmdLineException_InvalidConfig | `parser.parseArgument` throw `CmdLineException` → catch → isConfigValid=false |
| testMalformedIntegerOption_InvalidConfig | ค่า int ผิดรูปแบบ → CmdLineException branch |
| testEqualsSyntax_NoQuotes_ValidConfig | `argPattern.matches()=true`, `quotesPattern.matches()=false` |
| testEqualsSyntax_EmptyValue_ValidConfig | boundary: value="" หลัง `=` |
| testEqualsSyntax_DoubleQuotedValue_ValidConfig | `quotesPattern.matches()=true` (double quote) |
| testEqualsSyntax_SingleQuotedValue_ValidConfig | `quotesPattern.matches()=true` (single quote) |
| testPlainFlag_NoEqualsSign_NotMatchedByArgPattern | `argPattern.matches()=false` → else branch |
| testThirdPartyTrue_UsesDefaultCodingConventionBranch | `flags.third_party ? ... :` true branch |
| testThirdPartyFalse_UsesClosureCodingConventionBranch | ternary false branch (default) |
| testBooleanFlag_NoTrailingValue_ParamNullSetsTrue_ValidConfig | `BooleanOptionHandler`: `param == null` branch |
| testBooleanFlag_ExplicitTrueValue_ValidConfig | `TRUES.contains(...)` branch |
| testBooleanFlag_ExplicitFalseValue_ValidConfig | `FALSES.contains(...)` branch |
| testBooleanFlag_CaseInsensitiveTrueValue_ValidConfig | `toLowerCase()` normalization |
| testBooleanFlag_IllegalValue_InvalidConfig | else → throw `CmdLineException` branch |
| testCreateOptions_DebugFalse_NoException | `if (flags.debug)` false branch |
| testCreateOptions_DebugTrue_NoException | `if (flags.debug)` true branch |
| testCreateOptions_FormattingEmptyList_NoException | for-loop 0 รอบ |
| testCreateOptions_FormattingPrettyPrint_SetsPrettyPrintTrue | loop 1 รอบ, `switch case PRETTY_PRINT` |
| testCreateOptions_FormattingPrintInputDelimiter_SetsFlagTrue | `switch case PRINT_INPUT_DELIMITER` |
| testCreateOptions_ClosurePassDefaultTrue | `closurePass` default true |
| testCreateOptions_ClosurePassFalseWhenDisabled | `closurePass` false via boolean flag |
| testCreateExterns_UseOnlyCustomExterns_TrueBranch_NoException | `if (use_only_custom_externs \|\| isInTestMode())` true branch |
| testCreateExterns_DefaultFlags_ElseBranch_ReturnsNonEmptyList | else branch → `getDefaultExterns()` |
| testCreateCompiler_ReturnsNonNullCompiler | `createCompiler()` |
| testShouldRunCompiler_TrueWhenValid / FalseWhenInvalid | `shouldRunCompiler()` ทั้งสองสถานะ |

**ข้อจำกัดที่ควรทราบ:** `Flags` เป็น `private static class` จึงไม่สามารถตรวจสอบค่า field ภายในได้ตรง ๆ ต้องตรวจผลทางอ้อมผ่าน `shouldRunCompiler()` และ `createOptions()`/`createExterns()` เท่านั้น และ test ที่พึ่งพา resource `/externs.zip` หรือ `isInTestMode()` มีคอมเมนต์กำกับความไม่แน่นอนตามข้อกำหนดที่ 4