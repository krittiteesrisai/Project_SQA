package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * JUnit4 tests for {@link CommandLineRunner} (Defects4J Closure-158b).
 * ต้องอยู่ package เดียวกับ target class เพื่อเข้าถึง protected constructor/method
 */
public class CommandLineRunnerTest {

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  // ---------- Reflection helpers ----------

  private Object getFlagsObject(CommandLineRunner runner) throws Exception {
    Field flagsField = CommandLineRunner.class.getDeclaredField("flags");
    flagsField.setAccessible(true);
    return flagsField.get(runner);
  }

  private Object getFlagValue(CommandLineRunner runner, String fieldName) throws Exception {
    Object flags = getFlagsObject(runner);
    Field f = flags.getClass().getDeclaredField(fieldName);
    f.setAccessible(true);
    return f.get(flags);
  }

  private PrintStream newCapturingStream(ByteArrayOutputStream buffer) {
    return new PrintStream(buffer);
  }

  // ---------- Basic valid / invalid config ----------

  @Test
  public void testEmptyArgs_ValidConfig() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testNullArgs_ThrowsNPE() {
    // processArgs() ทำ for-each บน args โดยตรง โดยไม่ตรวจ null -> คาดหวัง NPE
    try {
      new CommandLineRunner((String[]) null);
      fail("Expected NullPointerException when args is null");
    } catch (NullPointerException expected) {
      // pass
    }
  }

  @Test
  public void testHelpFlag_SetsInvalidConfigAndPrintsUsage() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--help"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.size() > 0);
  }

  @Test
  public void testUnknownFlag_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--not_a_real_flag"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.size() > 0);
  }

  @Test
  public void testVersionFlag_PrintsVersionInfo() {
    // สมมติฐาน: ต้องมี ResourceBundle com.google.javascript.jscomp.parsing.ParserConfig
    // อยู่ใน classpath จริงของโครงการ Closure Compiler; ถ้าไม่มีให้ skip
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner;
    try {
      runner = new CommandLineRunner(new String[] {"--version"}, System.out, err);
    } catch (java.util.MissingResourceException e) {
      Assume.assumeNoException(e);
      return;
    }
    assertTrue(runner.shouldRunCompiler());
    assertTrue(errBuf.toString().contains("Closure Compiler"));
  }

  // ---------- --flagfile handling ----------

  @Test
  public void testFlagFileNotFound_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--flagfile", "/no/such/file/exists.txt"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.toString().contains("read error"));
  }

  @Test
  public void testFlagFileValid_ParsesArgsFromFile() throws Exception {
    File flagFile = tempFolder.newFile("flags.txt");
    com.google.common.io.Files.write(
        "--js foo.js --js bar.js".getBytes(), flagFile);

    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--flagfile", flagFile.getAbsolutePath()});
    assertTrue(runner.shouldRunCompiler());

    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagValue(runner, "js");
    assertEquals(Arrays.asList("foo.js", "bar.js"), js);
  }

  @Test
  public void testFlagFileWithNestedFlagFile_SetsInvalidConfig() throws Exception {
    File flagFile = tempFolder.newFile("nested_flags.txt");
    com.google.common.io.Files.write(
        "--flagfile another.txt".getBytes(), flagFile);

    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--flagfile", flagFile.getAbsolutePath()}, System.out, err);

    assertFalse(runner.shouldRunCompiler());
    assertTrue(errBuf.toString().contains("cannot contain"));
  }

  // ---------- processArgs(): "--flag=value" และ quoted value ----------

  @Test
  public void testProcessArgs_EqualsSyntax() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js=foo.js"});
    assertTrue(runner.shouldRunCompiler());
    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagValue(runner, "js");
    assertEquals(Arrays.asList("foo.js"), js);
  }

  @Test
  public void testProcessArgs_SingleQuotedValueStripped() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js='foo.js'"});
    assertTrue(runner.shouldRunCompiler());
    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagValue(runner, "js");
    assertEquals(Arrays.asList("foo.js"), js);
  }

  @Test
  public void testProcessArgs_DoubleQuotedValueStripped() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js=\"foo.js\""});
    assertTrue(runner.shouldRunCompiler());
    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagValue(runner, "js");
    assertEquals(Arrays.asList("foo.js"), js);
  }

  @Test
  public void testProcessArgs_PlainArgUnaffected() throws Exception {
    // ไม่ match pattern "--xxx=yyy" -> ผ่านตรงไปยัง processedArgs
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js", "plain.js"});
    assertTrue(runner.shouldRunCompiler());
    @SuppressWarnings("unchecked")
    List<String> js = (List<String>) getFlagValue(runner, "js");
    assertEquals(Arrays.asList("plain.js"), js);
  }

  // ---------- BooleanOptionHandler branches ----------

  @Test
  public void testBooleanOptionHandler_NoValue_SetsTrue() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagValue(runner, "debug"));
  }

  @Test
  public void testBooleanOptionHandler_VariousTrueTokens() throws Exception {
    String[] trueTokens = {"true", "on", "yes", "1", "TRUE", "On"};
    for (String token : trueTokens) {
      CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug", token});
      assertTrue("token=" + token, runner.shouldRunCompiler());
      assertEquals("token=" + token, Boolean.TRUE, getFlagValue(runner, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_VariousFalseTokens() throws Exception {
    String[] falseTokens = {"false", "off", "no", "0", "FALSE", "Off"};
    for (String token : falseTokens) {
      CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug", token});
      assertTrue("token=" + token, runner.shouldRunCompiler());
      assertEquals("token=" + token, Boolean.FALSE, getFlagValue(runner, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_InvalidToken_ElseBranchSetsTrueAndCausesExtraArgError()
      throws Exception {
    // สมมติฐาน (พฤติกรรม args4j): เมื่อ token ไม่ตรง TRUES/FALSES จะ setValue(true)
    // และไม่ consume token นั้น (return 0) ทำให้ args4j เจอ "extra argument" ที่ไม่ถูกรองรับ
    // (ไม่มี @Argument ใน Flags) จึงกลายเป็น CmdLineException -> isConfigValid=false
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--debug", "notabool"}, System.out, err);
    assertEquals(Boolean.TRUE, getFlagValue(runner, "debug"));
    assertFalse(runner.shouldRunCompiler());
  }

  // ---------- Default values (boundary) ----------

  @Test
  public void testDefaultFlagValues() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("", getFlagValue(runner, "js_output_file"));
    assertEquals(1, getFlagValue(runner, "summary_detail_level"));
    assertEquals("./", getFlagValue(runner, "module_output_path_prefix"));
    assertEquals("ECMASCRIPT3", getFlagValue(runner, "language_in"));
    assertEquals(Boolean.TRUE, getFlagValue(runner, "process_closure_primitives"));
    assertEquals(Boolean.FALSE, getFlagValue(runner, "manage_closure_dependencies"));
    assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS,
        getFlagValue(runner, "compilation_level"));
  }

  // ---------- Numeric / enum parse errors ----------

  @Test
  public void testSummaryDetailLevel_InvalidNumber_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--summary_detail_level", "abc"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testCompilationLevel_InvalidEnum_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--compilation_level", "NOT_A_LEVEL"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testWarningLevel_InvalidEnum_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--warning_level", "NOT_A_LEVEL"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testFormattingOption_InvalidEnum_SetsInvalidConfig() {
    ByteArrayOutputStream errBuf = new ByteArrayOutputStream();
    PrintStream err = newCapturingStream(errBuf);
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--formatting", "NOT_A_FORMAT"}, System.out, err);
    assertFalse(runner.shouldRunCompiler());
  }

  // ---------- List-type options ----------

  @Test
  public void testMultipleListOptions_ParsedCorrectly() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {
        "--js", "a.js", "--js", "b.js",
        "--externs", "e1.js",
        "--module", "m1:1:",
        "--jscomp_error", "checkTypes",
        "--jscomp_warning", "globalThis",
        "--jscomp_off", "es5Strict",
        "--define", "A=1",
        "--closure_entry_point", "goog.foo"
    });
    assertTrue(runner.shouldRunCompiler());

    assertEquals(Arrays.asList("a.js", "b.js"), getFlagValue(runner, "js"));
    assertEquals(Arrays.asList("e1.js"), getFlagValue(runner, "externs"));
    assertEquals(Arrays.asList("m1:1:"), getFlagValue(runner, "module"));
    assertEquals(Arrays.asList("checkTypes"), getFlagValue(runner, "jscomp_error"));
    assertEquals(Arrays.asList("globalThis"), getFlagValue(runner, "jscomp_warning"));
    assertEquals(Arrays.asList("es5Strict"), getFlagValue(runner, "jscomp_off"));
    assertEquals(Arrays.asList("A=1"), getFlagValue(runner, "define"));
    assertEquals(Arrays.asList("goog.foo"), getFlagValue(runner, "closure_entry_point"));
  }

  @Test
  public void testEmptyStringValue_AllowedInListOption() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--js", ""});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList(""), getFlagValue(runner, "js"));
  }

  // ---------- createOptions() branch coverage ----------

  @Test
  public void testCreateOptions_DefaultClosurePassTrueAndPrettyPrintFalse() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
    assertFalse(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_ProcessClosurePrimitivesFalse() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--process_closure_primitives", "false"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateOptions_FormattingPrettyPrint() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--formatting", "PRETTY_PRINT"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingPrintInputDelimiter() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--formatting", "PRINT_INPUT_DELIMITER"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.printInputDelimiter);
    assertFalse(options.prettyPrint);
  }

  @Test
  public void testCreateOptions_MultipleFormattingOptions() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {
        "--formatting", "PRETTY_PRINT", "--formatting", "PRINT_INPUT_DELIMITER"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_DebugFlagDoesNotCrash() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--debug"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_GenerateExportsFlagDoesNotCrash() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--generate_exports"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  // ---------- createCompiler() ----------

  @Test
  public void testCreateCompiler_ReturnsNonNull() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // ---------- createExterns() / getDefaultExterns() ----------
  // ขึ้นกับ resource "/externs.zip" ที่ไม่มีอยู่ในซอร์สที่ให้มา -> ครอบด้วย Assume

  @Test
  public void testGetDefaultExterns_GracefulHandling() {
    try {
      List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
      assertNotNull(externs);
      assertFalse(externs.isEmpty());
    } catch (Exception e) {
      Assume.assumeNoException(e);
    }
  }

  @Test
  public void testCreateExterns_UseOnlyCustomExterns_SkipsDefaultMerge() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--use_only_custom_externs"});
    assertTrue(runner.shouldRunCompiler());
    try {
      List<JSSourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (Exception e) {
      Assume.assumeNoException(e);
    }
  }
}
