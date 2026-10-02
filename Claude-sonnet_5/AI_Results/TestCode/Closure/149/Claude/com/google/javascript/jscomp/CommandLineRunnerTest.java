package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;

public class CommandLineRunnerTest {

  // ---------- Helper utilities ----------

  private CommandLineRunner newRunner(String[] args) {
    return new CommandLineRunner(args);
  }

  private CommandLineRunner newRunner(String[] args, ByteArrayOutputStream errCapture) {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream errStream = new PrintStream(errCapture);
    PrintStream outStream = new PrintStream(out);
    return new CommandLineRunner(args, outStream, errStream);
  }

  /** อ่านค่า private field จาก instance ของ Flags ผ่าน reflection */
  private Object getFlagField(CommandLineRunner runner, String fieldName) throws Exception {
    Field flagsField = CommandLineRunner.class.getDeclaredField("flags");
    flagsField.setAccessible(true);
    Object flagsObj = flagsField.get(runner);
    Field f = flagsObj.getClass().getDeclaredField(fieldName);
    f.setAccessible(true);
    return f.get(flagsObj);
  }

  // ---------- Basic valid/invalid configuration ----------

  @Test
  public void testNoArgs_ConfigValidAndDefaults() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.FALSE, getFlagField(runner, "display_help"));
    assertEquals("", getFlagField(runner, "js_output_file"));
    assertEquals(Arrays.asList(), getFlagField(runner, "js"));
    assertEquals(Integer.valueOf(1), getFlagField(runner, "summary_detail_level"));
    assertEquals("./", getFlagField(runner, "module_output_path_prefix"));
    assertEquals("%output%", getFlagField(runner, "output_wrapper_marker"));
  }

  @Test
  public void testHelpFlag_ConfigInvalid() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--help"});
    assertFalse(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "display_help"));
  }

  @Test
  public void testUnknownFlag_ConfigInvalid() {
    CommandLineRunner runner = newRunner(new String[] {"--this_flag_does_not_exist"});
    assertFalse(runner.shouldRunCompiler());
  }

  // Assumption: args4j จะ throw CmdLineException เมื่อพบ token ที่ไม่ตรงกับ
  // ตัวเลือกใด ๆ และไม่มี @Argument รองรับ positional argument ใน Flags
  @Test
  public void testUnrecognizedPositionalArgument_ConfigInvalid() {
    CommandLineRunner runner = newRunner(new String[] {"foo.js"});
    assertFalse(runner.shouldRunCompiler());
  }

  // ---------- "--flag=value" regex handling ----------

  @Test
  public void testEqualsSyntax_SimpleValue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file=out.js"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", getFlagField(runner, "js_output_file"));
  }

  @Test
  public void testEqualsSyntax_SingleQuotedValue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file='out.js'"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", getFlagField(runner, "js_output_file"));
  }

  @Test
  public void testEqualsSyntax_DoubleQuotedValue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file=\"out.js\""});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", getFlagField(runner, "js_output_file"));
  }

  // quotesPattern คือ ^['\"](.*)['\"]$ ซึ่งอนุญาตอักขระคนละชนิดที่หัว/ท้ายได้
  // (ไม่บังคับว่าต้องเป็นคู่เดียวกัน) — พฤติกรรมนี้อ่านได้ตรงจาก regex ในซอร์ส
  @Test
  public void testEqualsSyntax_MismatchedQuotesStillStripped() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file='out.js\""});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", getFlagField(runner, "js_output_file"));
  }

  @Test
  public void testEqualsSyntax_UnquotedApostropheNotStripped() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file=out'file.js"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out'file.js", getFlagField(runner, "js_output_file"));
  }

  @Test
  public void testEqualsSyntax_EmptyValue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js="});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList(""), getFlagField(runner, "js"));
  }

  @Test
  public void testSpaceSeparatedSyntax_NoRegexMatch() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--js_output_file", "out.js"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", getFlagField(runner, "js_output_file"));
  }

  // ---------- BooleanOptionHandler branches ----------

  @Test
  public void testBooleanOptionHandler_TrueValues() throws Exception {
    String[] trueTokens = {"true", "on", "yes", "1", "TRUE", "On"};
    for (String token : trueTokens) {
      CommandLineRunner runner = newRunner(new String[] {"--debug=" + token});
      assertTrue("token=" + token, runner.shouldRunCompiler());
      assertEquals(Boolean.TRUE, getFlagField(runner, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_FalseValues() throws Exception {
    String[] falseTokens = {"false", "off", "no", "0", "FALSE"};
    for (String token : falseTokens) {
      CommandLineRunner runner = newRunner(new String[] {"--debug=" + token});
      assertTrue("token=" + token, runner.shouldRunCompiler());
      assertEquals(Boolean.FALSE, getFlagField(runner, "debug"));
    }
  }

  @Test
  public void testBooleanOptionHandler_InvalidValue_ConfigInvalid() {
    CommandLineRunner runner = newRunner(new String[] {"--debug=maybe"});
    assertFalse(runner.shouldRunCompiler());
  }

  // Assumption: args4j Parameters#getParameter(0) จะ return null เมื่อไม่มี
  // token ตามมา ซึ่งเป็นสิ่งที่ทำให้ branch (param == null) ในซอร์สทำงาน
  @Test
  public void testBooleanOptionHandler_NoValueAtEnd_DefaultsTrue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--debug"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "debug"));
  }

  // Assumption เดียวกัน แต่ token ถัดไปมีลักษณะเป็น option อื่น
  @Test
  public void testBooleanOptionHandler_NoValueBeforeAnotherOption_DefaultsTrue()
      throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--debug", "--third_party"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "debug"));
  }

  // ---------- List flag accumulation ----------

  @Test
  public void testMultipleJsFlags_Accumulate() throws Exception {
    CommandLineRunner runner =
        newRunner(new String[] {"--js=a.js", "--js=b.js", "--js=c.js"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList("a.js", "b.js", "c.js"), getFlagField(runner, "js"));
  }

  @Test
  public void testMultipleExternsFlags_Accumulate() throws Exception {
    CommandLineRunner runner =
        newRunner(new String[] {"--externs=e1.js", "--externs=e2.js"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList("e1.js", "e2.js"), getFlagField(runner, "externs"));
  }

  @Test
  public void testModuleFlag_SingleValue() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--module=mod1:2:"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList("mod1:2:"), getFlagField(runner, "module"));
  }

  @Test
  public void testDefineFlag_MultipleValues() throws Exception {
    CommandLineRunner runner =
        newRunner(new String[] {"--define=FOO=true", "--define=BAR=false"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList("FOO=true", "BAR=false"), getFlagField(runner, "define"));
  }

  @Test
  public void testJscompErrorWarningOffLists_Accumulate() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {
        "--jscomp_error=accessControls",
        "--jscomp_warning=nonStandardJsDocs",
        "--jscomp_off=es5Strict"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Arrays.asList("accessControls"), getFlagField(runner, "jscomp_error"));
    assertEquals(Arrays.asList("nonStandardJsDocs"), getFlagField(runner, "jscomp_warning"));
    assertEquals(Arrays.asList("es5Strict"), getFlagField(runner, "jscomp_off"));
  }

  // ---------- Numeric / enum flags ----------

  @Test
  public void testSummaryDetailLevel_ValidInt() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--summary_detail_level=3"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Integer.valueOf(3), getFlagField(runner, "summary_detail_level"));
  }

  @Test
  public void testSummaryDetailLevel_InvalidInt_ConfigInvalid() {
    CommandLineRunner runner = newRunner(new String[] {"--summary_detail_level=notanumber"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testJscompDevModeAlias_BothNamesWork() throws Exception {
    CommandLineRunner runner1 = newRunner(new String[] {"--jscomp_dev_mode=OFF"});
    assertTrue(runner1.shouldRunCompiler());
    assertEquals(CompilerOptions.DevMode.OFF, getFlagField(runner1, "jscomp_dev_mode"));

    CommandLineRunner runner2 = newRunner(new String[] {"--dev_mode=OFF"});
    assertTrue(runner2.shouldRunCompiler());
    assertEquals(CompilerOptions.DevMode.OFF, getFlagField(runner2, "jscomp_dev_mode"));
  }

  @Test
  public void testCompilationLevelInvalidEnum_ConfigInvalid() {
    CommandLineRunner runner =
        newRunner(new String[] {"--compilation_level=NOT_A_REAL_LEVEL"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testWarningLevelInvalidEnum_ConfigInvalid() {
    CommandLineRunner runner = newRunner(new String[] {"--warning_level=NOT_A_LEVEL"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testCompilationLevelValidEnum_ConfigValid() throws Exception {
    CommandLineRunner runner =
        newRunner(new String[] {"--compilation_level=ADVANCED_OPTIMIZATIONS"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS,
        getFlagField(runner, "compilation_level"));
  }

  @Test
  public void testWarningLevelValidEnum_ConfigValid() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--warning_level=VERBOSE"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(WarningLevel.VERBOSE, getFlagField(runner, "warning_level"));
  }

  // ---------- err stream side-effects ----------

  @Test
  public void testErrPrintStream_ReceivesMessageOnInvalidFlag() {
    ByteArrayOutputStream errCapture = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[] {"--unknown_flag_zzz"}, errCapture);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errCapture.toString().length() > 0);
  }

  @Test
  public void testErrPrintStream_EmptyOnValidConfig() {
    ByteArrayOutputStream errCapture = new ByteArrayOutputStream();
    CommandLineRunner runner = newRunner(new String[] {"--js=a.js"}, errCapture);
    assertTrue(runner.shouldRunCompiler());
    assertEquals(0, errCapture.toByteArray().length);
  }

  // ---------- createOptions() ----------
  // Assumption: initOptionsFromFlags() (จาก superclass ที่ไม่มีซอร์สให้)
  // ไม่ throw exception เมื่อฟิลด์ path/list อื่น ๆ เป็นค่าว่าง/ค่า default

  @Test
  public void testCreateOptions_DefaultsClosurePassTrueAndFormattingFalse() {
    CommandLineRunner runner = newRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
    assertFalse(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingPrettyPrint() {
    CommandLineRunner runner = newRunner(new String[] {"--formatting=PRETTY_PRINT"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertFalse(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingPrintInputDelimiter() {
    CommandLineRunner runner =
        newRunner(new String[] {"--formatting=PRINT_INPUT_DELIMITER"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertFalse(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_FormattingBothMultipleFlags() {
    CommandLineRunner runner = newRunner(new String[] {
        "--formatting=PRETTY_PRINT", "--formatting=PRINT_INPUT_DELIMITER"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_ProcessClosurePrimitivesFalse() {
    CommandLineRunner runner =
        newRunner(new String[] {"--process_closure_primitives=false"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateOptions_ProcessClosurePrimitivesTrueExplicit() {
    CommandLineRunner runner =
        newRunner(new String[] {"--process_closure_primitives=true"});
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.closurePass);
  }

  // ---------- Miscellaneous simple flags ----------

  @Test
  public void testUseOnlyCustomExternsFlag_DefaultFalseAndExplicitTrue() throws Exception {
    CommandLineRunner defaultRunner = newRunner(new String[] {});
    assertEquals(Boolean.FALSE, getFlagField(defaultRunner, "use_only_custom_externs"));

    CommandLineRunner runner =
        newRunner(new String[] {"--use_only_custom_externs=true"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "use_only_custom_externs"));
  }

  @Test
  public void testThirdPartyFlagParsesSuccessfully() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--third_party=true"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "third_party"));
  }

  @Test
  public void testCreateNameMapFilesFlag_DefaultFalseAndExplicitTrue() throws Exception {
    CommandLineRunner defaultRunner = newRunner(new String[] {});
    assertEquals(Boolean.FALSE, getFlagField(defaultRunner, "create_name_map_files"));

    CommandLineRunner runner = newRunner(new String[] {"--create_name_map_files=true"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "create_name_map_files"));
  }

  @Test
  public void testCharsetFlag() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--charset=UTF-8"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("UTF-8", getFlagField(runner, "charset"));
  }

  @Test
  public void testOutputWrapperAndMarker() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {
        "--output_wrapper=(function(){%output%})();",
        "--output_wrapper_marker=%output%"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("(function(){%output%})();", getFlagField(runner, "output_wrapper"));
    assertEquals("%output%", getFlagField(runner, "output_wrapper_marker"));
  }

  @Test
  public void testManageClosureDependenciesFlag() throws Exception {
    CommandLineRunner runner =
        newRunner(new String[] {"--manage_closure_dependencies=true"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals(Boolean.TRUE, getFlagField(runner, "manage_closure_dependencies"));
  }

  @Test
  public void testOutputManifestFlag() throws Exception {
    CommandLineRunner runner = newRunner(new String[] {"--output_manifest=%outname%.MF"});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("%outname%.MF", getFlagField(runner, "output_manifest"));
  }
}
