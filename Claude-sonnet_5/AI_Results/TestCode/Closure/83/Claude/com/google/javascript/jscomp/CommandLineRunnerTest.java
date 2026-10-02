package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.MissingResourceException;

// import แบบ explicit ตามข้อกำหนด (แม้อยู่ package เดียวกันจึงไม่บังคับ แต่ระบุไว้เพื่อความชัดเจน)
import com.google.javascript.jscomp.CommandLineRunner;

public class CommandLineRunnerTest {

  // ---------------------------------------------------------------------
  // Helper methods
  // ---------------------------------------------------------------------

  private CommandLineRunner createRunner(String[] args, ByteArrayOutputStream errCapture) {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream outPs = new PrintStream(out);
    PrintStream errPs = new PrintStream(errCapture);
    return new CommandLineRunner(args, outPs, errPs);
  }

  private Object getFlags(CommandLineRunner runner) throws Exception {
    Field f = CommandLineRunner.class.getDeclaredField("flags");
    f.setAccessible(true);
    return f.get(runner);
  }

  private Object getFlagField(CommandLineRunner runner, String fieldName) throws Exception {
    Object flags = getFlags(runner);
    Field f = flags.getClass().getDeclaredField(fieldName);
    f.setAccessible(true);
    return f.get(flags);
  }

  // ---------------------------------------------------------------------
  // Boundary / null / empty
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyArgs_ConfigValidByDefault() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {}, err);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testNullArgsArray_ThrowsNPE() {
    // ตามซอร์ส: for (String arg : args) จะ throw NullPointerException ถ้า args เป็น null
    // (ไม่มี null-check ในซอร์ส) เป็น boundary case ที่ยังไม่มีการป้องกัน
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    try {
      createRunner(null, err);
      fail("Expected NullPointerException when args array is null");
    } catch (NullPointerException expected) {
      // คาดหวังตามพฤติกรรม for-each บน null array
    }
  }

  // ---------------------------------------------------------------------
  // Valid simple args / isConfigValid = true path
  // ---------------------------------------------------------------------

  @Test
  public void testSimpleJsFlag_ConfigValid() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--js", "test.js"}, err);
    assertTrue(runner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // --help => display_help=true => isConfigValid=false, printUsage เรียก
  // ---------------------------------------------------------------------

  @Test
  public void testHelpFlag_ConfigInvalid() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--help"}, err);
    assertFalse(runner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // Unknown option => CmdLineException => isConfigValid=false
  // ---------------------------------------------------------------------

  @Test
  public void testUnknownOption_ConfigInvalid() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--totally_unknown_flag_xyz"}, err);
    assertFalse(runner.shouldRunCompiler());
    assertTrue("Expected error message printed to err stream",
        err.toString().length() > 0);
  }

  // ---------------------------------------------------------------------
  // --flag=value regex parsing (argPattern.matches() == true branch)
  // ---------------------------------------------------------------------

  @Test
  public void testEqualsSyntax_NoQuotes_ParsesRawValue() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--js_output_file=out.js"}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "js_output_file");
    assertEquals("out.js", value);
  }

  @Test
  public void testEqualsSyntax_SingleQuotes_StripsQuotes() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--js_output_file='quoted.js'"}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "js_output_file");
    assertEquals("quoted.js", value);
  }

  @Test
  public void testEqualsSyntax_DoubleQuotes_StripsQuotes() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--js_output_file=\"double.js\""}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "js_output_file");
    assertEquals("double.js", value);
  }

  @Test
  public void testEqualsSyntax_MismatchedQuotes_StillStripped() throws Exception {
    // quotesPattern = ^['"](.*)['"]$ ตรวจสอบแค่ "เป็น quote ตัวใดตัวหนึ่ง"
    // ที่หัวและหางแยกกัน ไม่ได้บังคับว่าต้องเป็น quote ชนิดเดียวกัน (ไม่ใช้ backreference)
    // จึงคาดว่าแม้ quote ต่างชนิด (เปิดด้วย ' ปิดด้วย ") ก็จะถูกตัดออกทั้งคู่
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--js_output_file='mixed.js\""}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "js_output_file");
    assertEquals("mixed.js", value);
  }

  @Test
  public void testEqualsSyntax_EmptyValue_OverridesDefault() throws Exception {
    // ใช้ field ที่ default ไม่ใช่ค่าว่าง (output_wrapper_marker default = "%output%")
    // เพื่อพิสูจน์ว่า parsing เกิดขึ้นจริง ไม่ใช่ค่า default เดิม
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--output_wrapper_marker="}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "output_wrapper_marker");
    assertEquals("", value);
  }

  @Test
  public void testEqualsSyntax_ValueContainsEqualsSign() throws Exception {
    // ".*" เป็น greedy match จึงควรจับค่าที่มี "=" อยู่ภายในได้ทั้งหมด
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--charset=UTF-8=custom"}, err);
    assertTrue(runner.shouldRunCompiler());
    String value = (String) getFlagField(runner, "charset");
    assertEquals("UTF-8=custom", value);
  }

  @Test
  public void testNonEqualsArg_PassedThroughUnchanged() {
    // args ที่ไม่ match รูปแบบ --flag=value (ไม่มี "=") จะเข้า else-branch
    // ของ argPattern.matcher(arg).matches() แล้วถูกเติมตรง ๆ
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--third_party"}, err);
    assertTrue(runner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // List-type flags: หลาย occurrence -> loop สะสมค่า
  // ---------------------------------------------------------------------

  @Test
  public void testMultipleExternsFlag_AccumulatesList() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--externs", "a.js", "--externs", "b.js"}, err);
    assertTrue(runner.shouldRunCompiler());
    @SuppressWarnings("unchecked")
    List<String> externs = (List<String>) getFlagField(runner, "externs");
    assertEquals(2, externs.size());
    assertEquals("a.js", externs.get(0));
    assertEquals("b.js", externs.get(1));
  }

  // ---------------------------------------------------------------------
  // Flags.BooleanOptionHandler branch coverage
  // ---------------------------------------------------------------------

  @Test
  public void testBooleanFlag_EqualsTrue_ParsesTrue() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--debug=true"}, err);
    assertTrue(runner.shouldRunCompiler());
    boolean debug = (Boolean) getFlagField(runner, "debug");
    assertTrue(debug);
  }

  @Test
  public void testBooleanFlag_EqualsFalse_ParsesFalse() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--debug=false"}, err);
    assertTrue(runner.shouldRunCompiler());
    boolean debug = (Boolean) getFlagField(runner, "debug");
    assertFalse(debug);
  }

  @Test
  public void testBooleanFlag_EqualsOnOff_ParsesCorrectly() throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--debug=on"}, err);
    assertTrue(runner.shouldRunCompiler());
    boolean debug = (Boolean) getFlagField(runner, "debug");
    assertTrue(debug);
  }

  @Test
  public void testBooleanFlag_FollowedByNonBooleanToken_DefaultsTrueAndDoesNotConsumeToken()
      throws Exception {
    // หมายเหตุ: อาศัยสมมติฐานว่า Parameters.getParameter(0) ของ args4j จะคืน token ถัดไป
    // ตามลำดับดิบ (ไม่ตรวจสอบว่าเป็น flag อื่นหรือไม่) ซึ่งไม่ได้แสดงในซอร์สที่ให้มา
    // แต่สอดคล้องกับ design ของ null-check ในซอร์ส (BooleanOptionHandler.parseArguments)
    // กรณี param ไม่ตรงกับ TRUES/FALSES -> setter.addValue(true); return 0 (ไม่ consume token)
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--debug", "--js", "a.js"}, err);
    assertTrue(runner.shouldRunCompiler());
    boolean debug = (Boolean) getFlagField(runner, "debug");
    assertTrue(debug);
    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagField(runner, "js");
    assertEquals(1, js.size());
    assertEquals("a.js", js.get(0));
  }

  // ---------------------------------------------------------------------
  // --version flag branch
  // ---------------------------------------------------------------------

  @Test
  public void testVersionFlag_PrintsVersionInfo() {
    // หมายเหตุ: พึ่งพา ResourceBundle "com.google.javascript.jscomp.parsing.ParserConfig"
    // ที่ต้องมีอยู่บน classpath จริง หากไม่มีจะ throw MissingResourceException
    // ซึ่งไม่ถือเป็นข้อบกพร่องของคลาสเป้าหมาย แต่เป็นข้อจำกัดของ environment ทดสอบ
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    try {
      CommandLineRunner runner = createRunner(new String[] {"--version"}, err);
      String errOutput = err.toString();
      assertTrue(errOutput.contains("Closure Compiler"));
    } catch (MissingResourceException e) {
      Assume.assumeNoException(
          "ParserConfig ResourceBundle ไม่พร้อมใช้งานใน environment นี้ - ข้ามการทดสอบ", e);
    }
  }

  // ---------------------------------------------------------------------
  // createOptions() branch coverage
  // ---------------------------------------------------------------------

  @Test
  public void testCreateOptions_DefaultClosurePassTrue() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {}, err);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.closurePass);
  }

  @Test
  public void testCreateOptions_ProcessClosurePrimitivesFalse() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--process_closure_primitives=false"}, err);
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateOptions_FormattingPrettyPrint() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--formatting", "PRETTY_PRINT"}, err);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingPrintInputDelimiter() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--formatting", "PRINT_INPUT_DELIMITER"}, err);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingBothOptions_LoopMultipleIterations() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--formatting", "PRETTY_PRINT",
                       "--formatting", "PRINT_INPUT_DELIMITER"}, err);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_NoFormatting_LoopZeroIterations() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {}, err);
    CompilerOptions options = runner.createOptions();
    assertFalse(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_DebugFlagTrue_DoesNotThrow() {
    // ตามซอร์ส: if (flags.debug) { level.setDebugOptionsForCompilationLevel(options); }
    // พฤติกรรมภายในของ setDebugOptionsForCompilationLevel ไม่ได้แสดงในซอร์สที่ให้มา
    // จึงทดสอบเพียงว่าเรียกได้โดยไม่มี exception (ครอบคลุม branch flags.debug == true)
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {"--debug"}, err);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  // ---------------------------------------------------------------------
  // createExterns() branch coverage
  // ---------------------------------------------------------------------

  @Test
  public void testCreateExterns_UseOnlyCustomExternsTrue_NoDefaultExterns()
      throws Exception {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(
        new String[] {"--use_only_custom_externs"}, err);
    List<JSSourceFile> externs = runner.createExterns();
    // ไม่มี --externs ระบุ และ use_only_custom_externs=true
    // -> ควร return externs ว่าง โดยไม่พยายามโหลด default externs (externs.zip)
    assertNotNull(externs);
    assertTrue(externs.isEmpty());
  }

  @Test
  public void testCreateExterns_DefaultBehavior_AttemptsLoadDefaultExterns() {
    // หมายเหตุ: กรณี use_only_custom_externs=false และไม่ได้อยู่ใน test mode
    // จะเรียก getDefaultExterns() ซึ่งต้องมี resource "/externs.zip" บน classpath
    // ถ้า environment ทดสอบไม่มี externs.zip จะได้ Exception ซึ่งไม่ถือเป็นข้อบกพร่อง
    // ของคลาสเป้าหมาย แต่เป็นข้อจำกัดของ classpath ทดสอบ
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {}, err);
    try {
      List<JSSourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (Exception e) {
      Assume.assumeNoException(
          "externs.zip ไม่พร้อมใช้งานใน classpath สำหรับ environment นี้ - ข้ามการทดสอบ", e);
    }
  }

  // ---------------------------------------------------------------------
  // createCompiler()
  // ---------------------------------------------------------------------

  @Test
  public void testCreateCompiler_ReturnsNonNullCompilerInstance() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    CommandLineRunner runner = createRunner(new String[] {}, err);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // ---------------------------------------------------------------------
  // shouldRunCompiler()
  // ---------------------------------------------------------------------

  @Test
  public void testShouldRunCompiler_ReflectsConfigValidState() {
    ByteArrayOutputStream err1 = new ByteArrayOutputStream();
    CommandLineRunner validRunner = createRunner(new String[] {"--js", "a.js"}, err1);
    assertTrue(validRunner.shouldRunCompiler());

    ByteArrayOutputStream err2 = new ByteArrayOutputStream();
    CommandLineRunner invalidRunner = createRunner(new String[] {"--help"}, err2);
    assertFalse(invalidRunner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // Constructor overload: CommandLineRunner(String[] args)
  // ---------------------------------------------------------------------

  @Test
  public void testSingleArgConstructor_UsesSystemErr_DoesNotThrow() {
    PrintStream originalErr = System.err;
    ByteArrayOutputStream capturedErr = new ByteArrayOutputStream();
    System.setErr(new PrintStream(capturedErr));
    try {
      CommandLineRunner runner = new CommandLineRunner(new String[] {"--js", "a.js"});
      assertTrue(runner.shouldRunCompiler());
    } finally {
      System.setErr(originalErr);
    }
  }
}
