# AbstractCommandLineRunnerTest.java

หมายเหตุสำคัญก่อนดูโค้ด:
- `AbstractCommandLineRunner` เป็น `abstract class` แบบ package-private จึงต้องสร้าง concrete subclass ภายใน test (เท่านั้นที่ทำให้ instantiate ได้) และต้องอยู่ใน package เดียวกัน (`com.google.javascript.jscomp`)
- ไม่มี mocking framework ใน classpath ที่กำหนด ดังนั้นเมธอดที่พึ่งพา I/O จริง/การคอมไพล์จริงจำนวนมาก (เช่น `doRun()`, `processResults()`, `run()`) จะไม่ถูกทดสอบแบบเจาะลึก เพราะจะต้อง "เดา" behavior ของคลาสภายนอกที่ไม่มีซอร์สให้ (ฝ่าฝืนข้อกำหนด #4) — มีคอมเมนต์กำกับไว้ในโค้ด
- สมมติฐานที่ใช้ (มีคอมเมนต์กำกับในโค้ด): `Compiler` และ `CompilerOptions` มี public no-arg constructor, `JSModule` มี constructor `JSModule(String name)` (อ้างอิงจากการเรียกใช้ในซอร์สเป้าหมายเอง)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ package เดียวกัน)
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class AbstractCommandLineRunnerTest {

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  private ByteArrayOutputStream outBuf;
  private ByteArrayOutputStream errBuf;
  private TestRunner runner;

  /**
   * Concrete subclass ที่จำเป็นเพราะ AbstractCommandLineRunner เป็น abstract class
   * สมมติฐาน (ไม่ได้ระบุ signature ตรง ๆ ในซอร์สที่ให้): Compiler และ CompilerOptions
   * มี public no-arg constructor ตามรูปแบบทั่วไปที่ใช้ในโปรเจกต์นี้
   */
  private static class TestRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
    TestRunner(PrintStream out, PrintStream err) {
      super(out, err);
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler();
    }

    @Override
    protected CompilerOptions createOptions() {
      return new CompilerOptions();
    }
  }

  @Before
  public void setUp() {
    outBuf = new ByteArrayOutputStream();
    errBuf = new ByteArrayOutputStream();
    runner = new TestRunner(new PrintStream(outBuf), new PrintStream(errBuf));
  }

  // =====================================================================
  // createDefineReplacements(List<String>, CompilerOptions)
  // =====================================================================

  @Test
  public void testCreateDefineReplacements_emptyList_noException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(
        new ArrayList<String>(), options);
    // loop ไม่ทำงาน -> ไม่ throw = ผ่าน
  }

  @Test
  public void testCreateDefineReplacements_nameOnly_setsBooleanTrue() {
    CompilerOptions options = new CompilerOptions();
    // assignment.length == 1 branch
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO"), options);
  }

  @Test
  public void testCreateDefineReplacements_valueTrue() {
    CompilerOptions options = new CompilerOptions();
    // defValue.equals("true") branch
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=true"), options);
  }

  @Test
  public void testCreateDefineReplacements_valueFalse() {
    CompilerOptions options = new CompilerOptions();
    // defValue.equals("false") branch
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=false"), options);
  }

  @Test
  public void testCreateDefineReplacements_valueQuotedString() {
    CompilerOptions options = new CompilerOptions();
    // defValue quoted string branch (ไม่มี quote ซ้อนใน string)
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO='bar'"), options);
  }

  @Test
  public void testCreateDefineReplacements_valueNumber() {
    CompilerOptions options = new CompilerOptions();
    // Double.parseDouble success branch
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=123.45"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_emptyName_throws() {
    CompilerOptions options = new CompilerOptions();
    // defName.length()==0 -> ตกไปที่ throw RuntimeException ท้ายเมธอด
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("=true"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_invalidValue_throws() {
    CompilerOptions options = new CompilerOptions();
    // ไม่ตรง true/false/quoted-string/number -> NumberFormatException ถูกจับ
    // แล้วตกไปที่ throw ท้ายเมธอด
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=notanumber"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_quotedStringWithInnerQuote_throws() {
    CompilerOptions options = new CompilerOptions();
    // maybeStringVal.indexOf(quoteChar) != -1 -> ไม่ continue -> throw ท้ายเมธอด
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO='ba'r'"), options);
  }

  // =====================================================================
  // createJsModules(List<String>, List<String>)
  // =====================================================================

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_nullSpecs_throws() throws Exception {
    AbstractCommandLineRunner.createJsModules(null, new ArrayList<String>());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_emptySpecs_throws() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        new ArrayList<String>(), new ArrayList<String>());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_nullJsFiles_throws() throws Exception {
    AbstractCommandLineRunner.createJsModules(Arrays.asList("m1:0"), null);
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_badPartsCountTooFew_throws() throws Exception {
    // parts.length < 2
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_badPartsCountTooMany_throws() throws Exception {
    // parts.length > 4
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0:d:x:extra"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_invalidModuleName_throws() throws Exception {
    // !TokenStream.isJSIdentifier(name)
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("1bad:0"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_duplicateModuleName_throws() throws Exception {
    // modulesByName.containsKey(name)
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0", "m1:0"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_nonNumericFileCount_throws() throws Exception {
    // NumberFormatException -> numJsFiles = -1 -> numJsFiles < 0
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:abc"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_notEnoughJsFiles_throws() throws Exception {
    // nextJsFileIndex + numJsFiles > totalNumJsFiles
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:5"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_tooManyJsFiles_throws() throws Exception {
    // nextJsFileIndex < totalNumJsFiles หลัง loop จบ
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0"), Arrays.asList("a.js"));
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_unknownDependency_throws() throws Exception {
    // other == null ใน dependency loop
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0:unknown"), new ArrayList<String>());
  }

  @Test
  public void testCreateJsModules_validSingleModule_zeroFiles() throws Exception {
    // success path, numJsFiles == 0 เพื่อเลี่ยงการอ่านไฟล์จริง
    JSModule[] modules = AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0"), new ArrayList<String>());
    assertEquals(1, modules.length);
    assertEquals("m1", modules[0].getName());
  }

  @Test
  public void testCreateJsModules_validWithDependency() throws Exception {
    // parts.length > 2 กับ depList ที่มีค่า และ dependency ถูกต้อง
    JSModule[] modules = AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0", "m2:0:m1"), new ArrayList<String>());
    assertEquals(2, modules.length);
  }

  // =====================================================================
  // parseModuleWrappers(List<String>, JSModule[])
  // =====================================================================

  @Test(expected = IllegalStateException.class)
  public void testParseModuleWrappers_nullSpecs_throws() throws Exception {
    AbstractCommandLineRunner.parseModuleWrappers(null, new JSModule[0]);
  }

  @Test
  public void testParseModuleWrappers_emptySpecs_defaultsEmptyString() throws Exception {
    JSModule m = new JSModule("m1");
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(
        new ArrayList<String>(), new JSModule[] {m});
    assertEquals("", wrappers.get("m1"));
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_missingColon_throws() throws Exception {
    // pos == -1
    JSModule m = new JSModule("m1");
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1nowrapper"), new JSModule[] {m});
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_unknownModule_throws() throws Exception {
    // !wrappers.containsKey(name)
    JSModule m = new JSModule("m1");
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("unknown:%s"), new JSModule[] {m});
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_noPlaceholder_throws() throws Exception {
    // !wrapper.contains("%s")
    JSModule m = new JSModule("m1");
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1:nowrapperhere"), new JSModule[] {m});
  }

  @Test
  public void testParseModuleWrappers_validWrapper() throws Exception {
    JSModule m = new JSModule("m1");
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1:(function(){%s})()"), new JSModule[] {m});
    assertEquals("(function(){%s})()", wrappers.get("m1"));
  }

  // =====================================================================
  // writeOutput(PrintStream, Compiler, String, String, String)
  // =====================================================================

  @Test
  public void testWriteOutput_noPlaceholderFound_printsCodeWithNewline() {
    // pos == -1 -> else branch: out.println(code)
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(buf);
    AbstractCommandLineRunner.writeOutput(
        ps, null, "var x=1;", "wrapper-no-marker", "%output%");
    String result = buf.toString();
    assertEquals("var x=1;" + System.getProperty("line.separator"), result);
  }

  @Test
  public void testWriteOutput_placeholderAtStart_prefixEmpty() {
    // pos == 0 -> prefix ไม่ถูกพิมพ์ (pos > 0 == false)
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(buf);
    AbstractCommandLineRunner.writeOutput(ps, null, "CODE", "%s;suffix", "%s");
    String result = buf.toString();
    assertTrue(result.startsWith("CODE"));
    assertTrue(result.contains("suffix"));
  }

  @Test
  public void testWriteOutput_placeholderWithPrefixAndSuffix() {
    // pos > 0 -> พิมพ์ prefix, suffixStart != wrapper.length()
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(buf);
    AbstractCommandLineRunner.writeOutput(ps, null, "CODE", "pre-%s-post", "%s");
    String result = buf.toString();
    assertTrue(result.startsWith("pre-"));
    assertTrue(result.contains("CODE"));
    assertTrue(result.contains("-post"));
  }

  @Test
  public void testWriteOutput_placeholderAtEnd_noSuffix() {
    // suffixStart == wrapper.length() -> out.println() (ไม่มี suffix เพิ่ม)
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(buf);
    AbstractCommandLineRunner.writeOutput(ps, null, "CODE", "pre-%s", "%s");
    String result = buf.toString();
    assertTrue(result.startsWith("pre-CODE"));
  }

  // =====================================================================
  // maybeCreateDirsForPath (private static) - เข้าถึงผ่าน reflection
  // =====================================================================

  @Test
  public void testMaybeCreateDirsForPath_emptyPrefix_noOp() throws Exception {
    // pathPrefix.length() == 0 -> ไม่ทำอะไร
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "maybeCreateDirsForPath", String.class);
    m.setAccessible(true);
    m.invoke(null, "");
  }

  @Test
  public void testMaybeCreateDirsForPath_pathWithFileSeparatorSuffix() throws Exception {
    // pathPrefix ลงท้ายด้วย File.separatorChar
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "maybeCreateDirsForPath", String.class);
    m.setAccessible(true);
    String pathPrefix = tempFolder.getRoot().getAbsolutePath()
        + File.separatorChar + "subdir" + File.separatorChar;
    m.invoke(null, pathPrefix);
    File expectedDir = new File(tempFolder.getRoot(), "subdir");
    assertTrue(expectedDir.exists());
  }

  @Test
  public void testMaybeCreateDirsForPath_normalFilePrefix() throws Exception {
    // pathPrefix ไม่ลงท้ายด้วย separator -> ใช้ new File(pathPrefix).getParent()
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "maybeCreateDirsForPath", String.class);
    m.setAccessible(true);
    String pathPrefix = tempFolder.getRoot().getAbsolutePath()
        + File.separatorChar + "another" + File.separatorChar + "out";
    m.invoke(null, pathPrefix);
    File expectedDir = new File(tempFolder.getRoot(), "another");
    assertTrue(expectedDir.exists());
  }

  // =====================================================================
  // getMapPath (private instance method) - เข้าถึงผ่าน reflection
  // =====================================================================

  @Test
  public void testGetMapPath_emptyOutputFile_defaultPrefix() throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "getMapPath", String.class);
    m.setAccessible(true);
    String result = (String) m.invoke(runner, "");
    assertEquals("jscompiler", result);
  }

  @Test
  public void testGetMapPath_emptyOutputFile_withModulePrefix() throws Exception {
    runner.getCommandLineConfig().setModuleOutputPathPrefix("modprefix");
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "getMapPath", String.class);
    m.setAccessible(true);
    String result = (String) m.invoke(runner, "");
    assertEquals("modprefix", result);
  }

  @Test
  public void testGetMapPath_outputFileEndsWithJs_stripsExtension() throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "getMapPath", String.class);
    m.setAccessible(true);
    String outputFile = "dir" + File.separatorChar + "out.js";
    String result = (String) m.invoke(runner, outputFile);
    assertTrue(result.endsWith("out"));
    assertFalse(result.endsWith(".js"));
  }

  @Test
  public void testGetMapPath_outputFileNotJs_keepsAsIs() throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(
        "getMapPath", String.class);
    m.setAccessible(true);
    String outputFile = "dir" + File.separatorChar + "out.txt";
    String result = (String) m.invoke(runner, outputFile);
    assertTrue(result.endsWith("out.txt"));
  }

  // =====================================================================
  // getInputCharset (private instance method) - เข้าถึงผ่าน reflection
  // =====================================================================

  @Test
  public void testGetInputCharset_defaultEmptyCharset_returnsUtf8() throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod("getInputCharset");
    m.setAccessible(true);
    Charset result = (Charset) m.invoke(runner);
    assertEquals(Charset.forName("UTF-8"), result);
  }

  @Test
  public void testGetInputCharset_validCharsetName_returnsThatCharset() throws Exception {
    runner.getCommandLineConfig().setCharset("ISO-8859-1");
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod("getInputCharset");
    m.setAccessible(true);
    Charset result = (Charset) m.invoke(runner);
    assertEquals(Charset.forName("ISO-8859-1"), result);
  }

  @Test
  public void testGetInputCharset_invalidCharsetName_throwsFlagUsageException()
      throws Exception {
    runner.getCommandLineConfig().setCharset("NOT-A-REAL-CHARSET-NAME");
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod("getInputCharset");
    m.setAccessible(true);
    try {
      m.invoke(runner);
      fail("ควร throw FlagUsageException (wrap เป็น InvocationTargetException)");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof FlagUsageException);
    }
  }

  // =====================================================================
  // getCompiler() / getCommandLineConfig() / getDiagnosticGroups()
  // =====================================================================

  @Test
  public void testGetCompiler_initiallyNull() {
    assertNull(runner.getCompiler());
  }

  @Test
  public void testGetCommandLineConfig_notNull() {
    assertNotNull(runner.getCommandLineConfig());
  }

  @Test
  public void testGetDiagnosticGroups_defaultNotNull() {
    assertNotNull(runner.getDiagnosticGroups());
  }

  // =====================================================================
  // initOptionsFromFlags (protected)
  // =====================================================================

  @Test
  public void testInitOptionsFromFlags_defaultConfig_noException() {
    // config lists ว่างทั้งหมด (jscompError/Warning/Off/define)
    CompilerOptions options = new CompilerOptions();
    runner.initOptionsFromFlags(options);
  }

  @Test
  public void testInitOptionsFromFlags_withDefine_noException() {
    // ครอบคลุมการเรียก createDefineReplacements ผ่าน initOptionsFromFlags
    CompilerOptions options = new CompilerOptions();
    runner.getCommandLineConfig().setDefine(Arrays.asList("FOO=true"));
    runner.initOptionsFromFlags(options);
  }

  // =====================================================================
  // setRunOptions (protected final)
  // =====================================================================

  @Test
  public void testSetRunOptions_jsOutputFileSet() throws Exception {
    // config.jsOutputFile.length() > 0 branch
    CompilerOptions options = new CompilerOptions();
    runner.getCommandLineConfig().setJsOutputFile("out.js");
    runner.setRunOptions(options);
    assertEquals("out.js", options.jsOutputFile);
  }

  @Test
  public void testSetRunOptions_createSourceMapSet() throws Exception {
    // config.createSourceMap.length() > 0 branch
    CompilerOptions options = new CompilerOptions();
    runner.getCommandLineConfig().setCreateSourceMap("map.out");
    runner.setRunOptions(options);
    assertEquals("map.out", options.sourceMapOutputPath);
  }

  @Test
  public void testSetRunOptions_defaultConfig_noException() throws Exception {
    // variableMapInputFile/propertyMapInputFile เป็น "" (ค่า default) -> ข้าม VariableMap.load
    CompilerOptions options = new CompilerOptions();
    runner.setRunOptions(options);
  }

  // หมายเหตุ: variableMapInputFile / propertyMapInputFile ที่ไม่ใช่ค่าว่าง ("") จะเรียก
  // VariableMap.load(...) ซึ่งต้องมีไฟล์จริงในรูปแบบเฉพาะที่ไม่ได้ระบุไว้ในซอร์สที่ให้มา
  // จึงไม่ทดสอบ branch นี้เพื่อไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส (ข้อกำหนด #4)

  // หมายเหตุ: doRun(), processResults(), run() ไม่ได้ทดสอบโดยตรง เพราะต้องพึ่งพา
  // การคอมไพล์ JS จริง, การเขียนไฟล์จริงจำนวนมาก, และ System.exit() ซึ่งไม่มี
  // mocking framework ในรายการไลบรารีที่อนุญาต การเขียน test ที่ตรวจสอบ behavior
  // เหล่านี้จะต้องเดาพฤติกรรมของคลาสภายนอก (Compiler, Result เป็นต้น)
  // ซึ่งขัดกับข้อกำหนด #4
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testCreateDefineReplacements_emptyList_noException | loop ว่าง (0 iterations) |
| testCreateDefineReplacements_nameOnly_setsBooleanTrue | `assignment.length == 1` |
| testCreateDefineReplacements_valueTrue | `defValue.equals("true")` |
| testCreateDefineReplacements_valueFalse | `defValue.equals("false")` |
| testCreateDefineReplacements_valueQuotedString | quoted-string branch, indexOf==-1 |
| testCreateDefineReplacements_valueNumber | `Double.parseDouble` success |
| testCreateDefineReplacements_emptyName_throws | `defName.length()==0` -> throw |
| testCreateDefineReplacements_invalidValue_throws | NumberFormatException catch -> throw |
| testCreateDefineReplacements_quotedStringWithInnerQuote_throws | indexOf(quoteChar)!=-1 -> throw |
| testCreateJsModules_nullSpecs_throws | `Preconditions.checkState(specs != null)` |
| testCreateJsModules_emptySpecs_throws | `!specs.isEmpty()` |
| testCreateJsModules_nullJsFiles_throws | `jsFiles != null` |
| testCreateJsModules_badPartsCountTooFew_throws | `parts.length < 2` |
| testCreateJsModules_badPartsCountTooMany_throws | `parts.length > 4` |
| testCreateJsModules_invalidModuleName_throws | `!TokenStream.isJSIdentifier(name)` |
| testCreateJsModules_duplicateModuleName_throws | `modulesByName.containsKey(name)` |
| testCreateJsModules_nonNumericFileCount_throws | `NumberFormatException` -> `numJsFiles<0` |
| testCreateJsModules_notEnoughJsFiles_throws | `nextJsFileIndex+numJsFiles>totalNumJsFiles` |
| testCreateJsModules_tooManyJsFiles_throws | หลัง loop: `nextJsFileIndex<totalNumJsFiles` |
| testCreateJsModules_unknownDependency_throws | `other == null` ใน dep loop |
| testCreateJsModules_validSingleModule_zeroFiles | success path, `parts.length==2` (ไม่มี deps) |
| testCreateJsModules_validWithDependency | `parts.length>2`, depList ไม่ว่าง, dep พบ |
| testParseModuleWrappers_nullSpecs_throws | `Preconditions.checkState(specs != null)` |
| testParseModuleWrappers_emptySpecs_defaultsEmptyString | loop ว่าง, prepopulate map |
| testParseModuleWrappers_missingColon_throws | `pos == -1` |
| testParseModuleWrappers_unknownModule_throws | `!wrappers.containsKey(name)` |
| testParseModuleWrappers_noPlaceholder_throws | `!wrapper.contains("%s")` |
| testParseModuleWrappers_validWrapper | success path |
| testWriteOutput_noPlaceholderFound_printsCodeWithNewline | `pos == -1` else branch |
| testWriteOutput_placeholderAtStart_prefixEmpty | `pos > 0 == false` |
| testWriteOutput_placeholderWithPrefixAndSuffix | `pos > 0`, `suffixStart != wrapper.length()` |
| testWriteOutput_placeholderAtEnd_noSuffix | `suffixStart == wrapper.length()` |
| testMaybeCreateDirsForPath_emptyPrefix_noOp | `pathPrefix.length() > 0 == false` |
| testMaybeCreateDirsForPath_pathWithFileSeparatorSuffix | `charAt(len-1)==File.separatorChar == true` |
| testMaybeCreateDirsForPath_normalFilePrefix | `charAt(len-1)==File.separatorChar == false`, `dirName != null` |
| testGetMapPath_emptyOutputFile_defaultPrefix | `outputFile.equals("")`, `moduleOutputPathPrefix.equals("")==true` |
| testGetMapPath_emptyOutputFile_withModulePrefix | `moduleOutputPathPrefix.equals("")==false` |
| testGetMapPath_outputFileEndsWithJs_stripsExtension | `outputFileName.endsWith(".js")==true` |
| testGetMapPath_outputFileNotJs_keepsAsIs | `outputFileName.endsWith(".js")==false` |
| testGetInputCharset_defaultEmptyCharset_returnsUtf8 | `config.charset.isEmpty()==true` |
| testGetInputCharset_validCharsetName_returnsThatCharset | `Charset.isSupported==true` |
| testGetInputCharset_invalidCharsetName_throwsFlagUsageException | `Charset.isSupported==false` -> throw |
| testGetCompiler_initiallyNull / testGetCommandLineConfig_notNull / testGetDiagnosticGroups_defaultNotNull | ค่าเริ่มต้นของฟิลด์/เมธอด getter |
| testInitOptionsFromFlags_defaultConfig_noException / testInitOptionsFromFlags_withDefine_noException | เรียก setWarningLevels x3 + createDefineReplacements |
| testSetRunOptions_jsOutputFileSet | `config.jsOutputFile.length() > 0` |
| testSetRunOptions_createSourceMapSet | `config.createSourceMap.length() > 0` |
| testSetRunOptions_defaultConfig_noException | branch `variableMapInputFile/propertyMapInputFile` เป็นค่า default (equals "") |