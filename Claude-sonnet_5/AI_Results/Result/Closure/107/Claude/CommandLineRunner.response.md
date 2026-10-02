# CommandLineRunnerTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- Constructor ของ `CommandLineRunner` เป็น `protected` จึงต้องสร้าง subclass ภายใน test เพื่อเรียกใช้ และ override `createOptions()` / `createCompiler()` เป็น `public` เพื่อเปิดให้ทดสอบโดยตรง (ไม่เรียก `run()`/`main()` เพราะมี side-effect `System.exit()` และต้องพึ่งพา external resource เช่น externs.zip ซึ่งควบคุมไม่ได้ในสภาพแวดล้อมทดสอบ)
- สมมติฐานบางจุดที่ไม่สามารถยืนยันจาก source ที่ให้มาได้ 100% ได้ระบุเป็นคอมเมนต์ในโค้ด (เช่น `ProcessCommonJSModules.toModuleName`, ค่า default ของ `CompilerOptions.messageBundle`)

```java
package com.google.javascript.jscomp;

// Import แบบชัดเจนตามที่กำหนด (แม้จะอยู่ package เดียวกัน ก็ยัง import ได้ ไม่ error)
import com.google.javascript.jscomp.CommandLineRunner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

public class CommandLineRunnerTest {

  /**
   * Subclass เพื่อเปิดใช้งาน protected constructor / protected method
   * สำหรับการทดสอบเท่านั้น
   */
  private static class TestCommandLineRunner extends CommandLineRunner {
    TestCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
      super(args, out, err);
    }

    @Override
    public CompilerOptions createOptions() {
      return super.createOptions();
    }

    @Override
    public Compiler createCompiler() {
      return super.createCompiler();
    }
  }

  private ByteArrayOutputStream errContent;
  private PrintStream errStream;
  private ByteArrayOutputStream outContent;
  private PrintStream outStream;

  @Before
  public void setUp() {
    errContent = new ByteArrayOutputStream();
    errStream = new PrintStream(errContent);
    outContent = new ByteArrayOutputStream();
    outStream = new PrintStream(outContent);
  }

  private TestCommandLineRunner createRunner(String[] args) {
    return new TestCommandLineRunner(args, outStream, errStream);
  }

  private String errText() {
    errStream.flush();
    return errContent.toString();
  }

  private static void writeToFile(File file, String content) throws IOException {
    Writer writer = new FileWriter(file);
    try {
      writer.write(content);
    } finally {
      writer.close();
    }
  }

  // ==================================================================
  // initConfigFromFlags() : boundary / null / malformed input / branch
  // ==================================================================

  @Test
  public void testValidJsFlag_ConfigIsValid() {
    TestCommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testEmptyArgs_ConfigIsValid() {
    // ค่าว่าง (empty array) : ไม่มี argument เลย ควร valid เพราะไม่มี required arg
    TestCommandLineRunner runner = createRunner(new String[]{});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test(expected = NullPointerException.class)
  public void testNullArgs_ThrowsNPE() {
    // processArgs(String[] args) ไม่มีการเช็ค null -> "for (String arg : args)"
    // จะโยน NullPointerException เมื่อ args เป็น null (ค่าขอบเขต/null ตามข้อกำหนด)
    createRunner(null);
  }

  @Test
  public void testHelpFlag_ConfigInvalid() {
    // flags.displayHelp == true -> isConfigValid ถูกบังคับเป็น false เสมอ
    TestCommandLineRunner runner = createRunner(new String[]{"--help"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testUnknownFlag_ConfigInvalid() {
    // flag ที่ไม่รู้จัก -> CmdLineException ถูก catch -> isConfigValid = false
    TestCommandLineRunner runner = createRunner(
        new String[]{"--this_flag_does_not_exist"});
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errText().length() > 0);
  }

  @Test
  public void testMissingRequiredValue_ConfigInvalid() {
    // อินพุตผิดรูปแบบ: --js ต้องการค่าตามมาแต่ไม่มี -> CmdLineException
    TestCommandLineRunner runner = createRunner(new String[]{"--js"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testVersionFlag_PrintsVersionInfo() {
    // flags.version == true -> พิมพ์ข้อความ version ไปยัง err
    TestCommandLineRunner runner = createRunner(new String[]{"--version"});
    assertTrue(errText().contains("Version:"));
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testProcessCommonJsModulesWithoutEntryModule_ConfigInvalid() {
    // flags.processCommonJsModules == true, commonJsEntryModule == null
    // -> err message + isConfigValid = false
    TestCommandLineRunner runner = createRunner(
        new String[]{"--process_common_js_modules"});
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errText().contains("Please specify --common_js_entry_module."));
  }

  @Test
  public void testProcessCommonJsModulesWithEntryModule_ConfigValid() {
    // สมมติ (assumption): ProcessCommonJSModules.toModuleName() ทำงานได้ปกติ
    // กับสตริงทั่วไปโดยไม่โยน exception
    TestCommandLineRunner runner = createRunner(new String[]{
        "--process_common_js_modules",
        "--common_js_entry_module", "myentry"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testEqualsSyntax_ConfigValid() {
    // ทดสอบ processArgs(): รูปแบบ --flag=value
    TestCommandLineRunner runner = createRunner(new String[]{"--js=test.js"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testQuotedEqualsSyntax_ConfigValid() {
    // ทดสอบ processArgs(): รูปแบบ --flag='value' (ต้องตัด quote ออก)
    TestCommandLineRunner runner = createRunner(new String[]{"--js='test.js'"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testFlagFileNotFound_ConfigInvalid() {
    // processFlagFile() -> Files.readLines() โยน IOException -> catch(IOException)
    File nonExisting = new File("this_file_should_not_exist_12345.flags");
    if (nonExisting.exists()) {
      nonExisting.delete();
    }
    TestCommandLineRunner runner = createRunner(
        new String[]{"--flagfile", nonExisting.getPath()});
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errText().contains("read error."));
  }

  @Test
  public void testFlagFileWithNestedFlagFile_ConfigInvalid() throws IOException {
    // flagfile ที่มี --flagfile ซ้อนอยู่ข้างใน -> isConfigValid = false
    File tempFile = File.createTempFile("nested_flagfile", ".txt");
    tempFile.deleteOnExit();
    writeToFile(tempFile, "--flagfile something.txt");

    TestCommandLineRunner runner = createRunner(
        new String[]{"--flagfile", tempFile.getPath()});
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errText().contains(
        "Arguments in the file cannot contain --flagfile option."));
  }

  @Test
  public void testFlagFileValid_ConfigValid() throws IOException {
    File tempFile = File.createTempFile("valid_flagfile", ".txt");
    tempFile.deleteOnExit();
    writeToFile(tempFile, "--js foo.js");

    TestCommandLineRunner runner = createRunner(
        new String[]{"--flagfile", tempFile.getPath()});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlagExplicitTrue_ConfigValid() {
    // BooleanOptionHandler: param != null และอยู่ใน TRUES set
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--debug=true"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlagExplicitFalse_ConfigValid() {
    // BooleanOptionHandler: param != null และอยู่ใน FALSES set
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--debug=false"});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testBooleanFlagInvalidValueFallback_ConfigValid() {
    // BooleanOptionHandler: param != null แต่ไม่อยู่ใน TRUES/FALSES -> fallback true, return 0
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--debug=maybe"});
    assertTrue(runner.shouldRunCompiler());
  }

  // ==================================================================
  // createOptions() : branch coverage
  // ==================================================================

  @Test
  public void testCreateOptions_DefaultFlags_DoesNotThrow() {
    TestCommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    // สมมติ (assumption): ค่า default ของ CompilerOptions.messageBundle คือ null
    // เมื่อไม่ระบุ translations_file และ compilationLevel ไม่ใช่ ADVANCED_OPTIMIZATIONS
    assertNull(options.messageBundle);
  }

  @Test
  public void testCreateOptions_AdvancedOptimizationsNoTranslations_SetsEmptyMessageBundle() {
    // branch: translationsFile empty && compilationLevel == ADVANCED_OPTIMIZATIONS
    TestCommandLineRunner runner = createRunner(new String[]{
        "--js", "test.js",
        "--compilation_level", "ADVANCED_OPTIMIZATIONS"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.messageBundle instanceof EmptyMessageBundle);
  }

  @Test
  public void testCreateOptions_InvalidTranslationsFile_ThrowsRuntimeException() {
    // branch: translationsFile ไม่ empty -> FileInputStream โยน IOException
    // -> ถูก wrap เป็น RuntimeException("Reading XTB file", e)
    TestCommandLineRunner runner = createRunner(new String[]{
        "--js", "test.js",
        "--translations_file", "this_file_should_not_exist_67890.xtb"});
    try {
      runner.createOptions();
      fail("Expect RuntimeException because translations file does not exist");
    } catch (RuntimeException e) {
      assertTrue(e.getMessage().contains("Reading XTB file"));
    }
  }

  @Test
  public void testCreateOptions_DebugFlag_DoesNotThrow() {
    // branch: flags.debug == true
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--debug"});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_UseTypesForOptimization_DoesNotThrow() {
    // branch: flags.useTypesForOptimization == true
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--use_types_for_optimization"});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_GenerateExportsTrue_DoesNotThrow() {
    // branch: flags.generateExports == true
    TestCommandLineRunner runner = createRunner(
        new String[]{"--js", "test.js", "--generate_exports"});
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_AllFormattingOptions_DoesNotThrow() {
    // loop: for (FormattingOption formattingOption : flags.formatting)
    // ครอบคลุมทั้ง 3 case ของ switch ภายใน applyToOptions()
    TestCommandLineRunner runner = createRunner(new String[]{
        "--js", "test.js",
        "--formatting", "PRETTY_PRINT",
        "--formatting", "PRINT_INPUT_DELIMITER",
        "--formatting", "SINGLE_QUOTES"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_JqueryPrimitivesWithAdvancedOptimizations_SetsJqueryPass() {
    // branch: ADVANCED_OPTIMIZATIONS == level && processJqueryPrimitives == true
    TestCommandLineRunner runner = createRunner(new String[]{
        "--js", "test.js",
        "--compilation_level", "ADVANCED_OPTIMIZATIONS",
        "--process_jquery_primitives"});
    CompilerOptions options = runner.createOptions();
    assertTrue(options.jqueryPass);
  }

  @Test
  public void testCreateOptions_JqueryPrimitivesWithoutAdvancedOptimizations_JqueryPassFalse() {
    // branch: level != ADVANCED_OPTIMIZATIONS (แม้ processJqueryPrimitives == true)
    TestCommandLineRunner runner = createRunner(new String[]{
        "--js", "test.js",
        "--process_jquery_primitives"});
    CompilerOptions options = runner.createOptions();
    assertFalse(options.jqueryPass);
  }

  @Test
  public void testCreateCompiler_ReturnsNonNullCompiler() {
    TestCommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testValidJsFlag_ConfigIsValid | initConfigFromFlags: parse สำเร็จ, isConfigValid=true, else-branch ของ `if(!isConfigValid \|\| displayHelp)` |
| testEmptyArgs_ConfigIsValid | boundary: args ว่าง, ไม่มี exception |
| testNullArgs_ThrowsNPE | null input, processArgs ไม่มี null-check |
| testHelpFlag_ConfigInvalid | `flags.displayHelp==true` -> true-branch |
| testUnknownFlag_ConfigInvalid | catch(CmdLineException) จาก flag ไม่รู้จัก |
| testMissingRequiredValue_ConfigInvalid | catch(CmdLineException) จากค่าที่ขาดหาย (malformed) |
| testVersionFlag_PrintsVersionInfo | `if(flags.version)` true-branch |
| testProcessCommonJsModulesWithoutEntryModule_ConfigInvalid | `commonJsEntryModule==null` true-branch |
| testProcessCommonJsModulesWithEntryModule_ConfigValid | `commonJsEntryModule==null` false-branch |
| testEqualsSyntax_ConfigValid | processArgs: `argPattern.matches()` true, quotesMatcher false |
| testQuotedEqualsSyntax_ConfigValid | processArgs: argPattern true + quotesMatcher true |
| testFlagFileNotFound_ConfigInvalid | catch(IOException) ใน initConfigFromFlags |
| testFlagFileWithNestedFlagFile_ConfigInvalid | processFlagFile: `!flags.flagFile.equals("")` true-branch |
| testFlagFileValid_ConfigValid | processFlagFile: สำเร็จ, false-branch ของเงื่อนไข nested flagfile |
| testBooleanFlagExplicitTrue_ConfigValid | BooleanOptionHandler: param!=null, TRUES branch |
| testBooleanFlagExplicitFalse_ConfigValid | BooleanOptionHandler: param!=null, FALSES branch |
| testBooleanFlagInvalidValueFallback_ConfigValid | BooleanOptionHandler: param!=null, else-fallback branch |
| testCreateOptions_DefaultFlags_DoesNotThrow | createOptions: translationsFile empty & level!=ADVANCED (ทั้งสอง false) |
| testCreateOptions_AdvancedOptimizationsNoTranslations_SetsEmptyMessageBundle | else-if `ADVANCED_OPTIMIZATIONS==level` true-branch |
| testCreateOptions_InvalidTranslationsFile_ThrowsRuntimeException | `if(!translationsFile.isEmpty())` true + catch(IOException) |
| testCreateOptions_DebugFlag_DoesNotThrow | `if(flags.debug)` true-branch |
| testCreateOptions_UseTypesForOptimization_DoesNotThrow | `if(flags.useTypesForOptimization)` true-branch |
| testCreateOptions_GenerateExportsTrue_DoesNotThrow | `if(flags.generateExports)` true-branch |
| testCreateOptions_AllFormattingOptions_DoesNotThrow | loop 3 รอบ + switch-case ทั้ง 3 case ใน FormattingOption |
| testCreateOptions_JqueryPrimitivesWithAdvancedOptimizations_SetsJqueryPass | `jqueryPass = ADVANCED==level && jquery` true&&true |
| testCreateOptions_JqueryPrimitivesWithoutAdvancedOptimizations_JqueryPassFalse | `jqueryPass` false&&true = false |
| testCreateCompiler_ReturnsNonNullCompiler | createCompiler() พื้นฐาน (ไม่มี branch แต่ตรวจ non-null) |