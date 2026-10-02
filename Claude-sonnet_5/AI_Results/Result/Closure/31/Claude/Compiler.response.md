ต่อไปนี้คือชุดทดสอบ JUnit 4 สำหรับคลาส `Compiler` (Defects4J: Closure-31b)

**หมายเหตุสำคัญก่อนเริ่ม:**
- เนื่องจากหลาย method เป็น `private`/package-private/`protected` และมี field เช่น `options` เป็น package-private ผมจึงวาง `CompilerTest` ไว้ใน **package เดียวกัน** (`com.google.javascript.jscomp`) เพื่อให้เข้าถึงได้โดยไม่ต้องใช้ reflection (ซึ่งจะลด false-negative จาก mocking/guessing)
- จุดที่ไม่มั่นใจ 100% ใน behavior ของ dependency class อื่น (เช่น `CompilerOptions`, `SourceFile`, `JSModule`) จะมีคอมเมนต์กำกับไว้ว่าเป็น "assumption" โดยอ้างอิงจากการใช้งานจริงในซอร์สที่ให้มาเท่านั้น ไม่ได้เดาแบบไม่มีหลักฐาน

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.List;

// Import คลาสเป้าหมาย (redundant เพราะอยู่ package เดียวกัน แต่ระบุตามข้อกำหนด)
import com.google.javascript.jscomp.Compiler;

public class CompilerTest {

  // ---------------------------------------------------------------------
  // 1) CodeBuilder (inner static class) - ทดสอบแบบ isolate ไม่พึ่ง dependency อื่น
  // ---------------------------------------------------------------------

  @Test
  public void testCodeBuilder_appendNoNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertEquals("hello", cb.toString());
    assertEquals(5, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_appendWithNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc\ndef\ngh");
    assertEquals(2, cb.getLineIndex());
    assertEquals(2, cb.getColumnIndex()); // "gh" length after last '\n'
  }

  @Test
  public void testCodeBuilder_resetKeepsLineCount() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2\n");
    int lineIndexBefore = cb.getLineIndex();
    cb.reset();
    assertEquals("", cb.toString());
    // ตาม javadoc: reset() "leaves the line count unchanged"
    assertEquals(lineIndexBefore, cb.getLineIndex());
  }

  @Test
  public void testCodeBuilder_endsWith_trueCase() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello world");
    assertTrue(cb.endsWith("world"));
  }

  @Test
  public void testCodeBuilder_endsWith_falseCase_shorterBuffer() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("ab");
    assertFalse(cb.endsWith("abcdef"));
  }

  // Boundary/fault-detecting case: เงื่อนไขในซอร์สใช้ sb.length() > suffix.length()
  // (strict greater-than) ดังนั้นถ้า buffer เท่ากับ suffix พอดี จะคืน false แม้เนื้อหาตรงกัน
  @Test
  public void testCodeBuilder_endsWith_falseCase_equalLength() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("exact");
    assertFalse(cb.endsWith("exact")); // เพราะ length เท่ากันพอดี ไม่ใช่ ">"
  }

  // ---------------------------------------------------------------------
  // 2) Constructors / ErrorManager
  // ---------------------------------------------------------------------

  @Test
  public void testConstructors_defaultAndWithErrorManager() {
    Compiler c1 = new Compiler();
    assertNotNull(c1);

    Compiler c2 = new Compiler((java.io.PrintStream) null);
    assertNotNull(c2);
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_nullThrowsNPE() {
    Compiler c = new Compiler();
    c.setErrorManager(null);
  }

  @Test
  public void testGetErrorManager_lazyInit_noStream() {
    Compiler c = new Compiler();
    ErrorManager em = c.getErrorManager();
    assertNotNull(em);
  }

  @Test
  public void testGetErrorManager_lazyInit_withStream() {
    Compiler c = new Compiler(System.out);
    ErrorManager em = c.getErrorManager();
    assertNotNull(em);
  }

  // ---------------------------------------------------------------------
  // 3) setProgress / getProgress (boundary clamping)
  // ---------------------------------------------------------------------

  @Test
  public void testSetProgress_boundaries() {
    Compiler c = new Compiler();
    assertEquals(0.0, c.getProgress(), 0.0001); // initial value

    c.setProgress(0.5);
    assertEquals(0.5, c.getProgress(), 0.0001);

    c.setProgress(1.5); // > 1.0 -> clamp to 1.0
    assertEquals(1.0, c.getProgress(), 0.0001);

    c.setProgress(-0.5); // < 0.0 -> clamp to 0.0
    assertEquals(0.0, c.getProgress(), 0.0001);

    c.setProgress(1.0); // exact boundary, ไม่ถูก clamp
    assertEquals(1.0, c.getProgress(), 0.0001);

    c.setProgress(0.0); // exact boundary
    assertEquals(0.0, c.getProgress(), 0.0001);
  }

  // ---------------------------------------------------------------------
  // 4) resetUniqueNameId + getUniqueNameIdSupplier
  // ---------------------------------------------------------------------

  @Test
  public void testResetUniqueNameId_andSupplier() {
    Compiler c = new Compiler();
    Supplier<String> supplier = c.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());

    c.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------------------------------------------------------------------
  // 5) setPassConfig
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_nullThrowsNPE() {
    Compiler c = new Compiler();
    c.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_alreadyAssignedThrowsISE() {
    Compiler c = new Compiler();
    c.options = new CompilerOptions(); // ตั้งค่าตรง field (package-private) เพื่อให้ getPassConfig ทำงานได้
    PassConfig pc = c.getPassConfig(); // สร้าง default pass config ครั้งแรก -> this.passes != null
    c.setPassConfig(pc); // ควร throw เพราะถูก assign ไปแล้ว
  }

  @Test
  public void testSetPassConfig_successAssignsAndReturnsSame() {
    Compiler temp = new Compiler();
    temp.options = new CompilerOptions();
    PassConfig pcFromOther = temp.getPassConfig();

    Compiler c = new Compiler();
    c.setPassConfig(pcFromOther); // this.passes ยังเป็น null ก่อนหน้านี้ -> ไม่ throw
    assertSame(pcFromOther, c.getPassConfig());
  }

  // ---------------------------------------------------------------------
  // 6) createFillFileName (static)
  // ---------------------------------------------------------------------

  @Test
  public void testCreateFillFileName() {
    assertEquals("[myModule]", Compiler.createFillFileName("myModule"));
  }

  // ---------------------------------------------------------------------
  // 7) initModules -> checkFirstModule branches (ผ่าน public API)
  // ---------------------------------------------------------------------

  @Test
  public void testInitModules_emptyModuleList_reportsError() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    c.initModules(
        Lists.<SourceFile>newArrayList(),
        Lists.<JSModule>newArrayList(),
        options);
    assertTrue(c.getErrorCount() > 0); // EMPTY_MODULE_LIST_ERROR
  }

  @Test
  public void testInitModules_singleEmptyModule_noErrorAndFilled() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule m = new JSModule("m1"); // ไม่มี input
    List<JSModule> modules = Lists.newArrayList(m);

    c.initModules(Lists.<SourceFile>newArrayList(), modules, options);

    assertEquals(0, c.getErrorCount()); // size==1 จึงไม่ error ตาม checkFirstModule
    assertFalse(m.getInputs().isEmpty()); // fillEmptyModules เติมไฟล์ placeholder ให้
  }

  @Test
  public void testInitModules_twoModulesFirstEmpty_reportsError() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1"); // module แรกไม่มี input
    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("in2.js", "var a = 1;"));

    List<JSModule> modules = Lists.newArrayList(m1, m2);
    c.initModules(Lists.<SourceFile>newArrayList(), modules, options);

    assertTrue(c.getErrorCount() > 0); // EMPTY_ROOT_MODULE_ERROR เพราะ size > 1
  }

  // ---------------------------------------------------------------------
  // 8) initInputsByIdMap -> duplicate extern/input branches
  // ---------------------------------------------------------------------

  @Test
  public void testInit_duplicateExternInput_reportsError() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();

    SourceFile e1 = SourceFile.fromCode("dup.js", "");
    SourceFile e2 = SourceFile.fromCode("dup.js", "");
    SourceFile input = SourceFile.fromCode("in.js", "var x = 1;");

    c.init(Lists.newArrayList(e1, e2), Lists.newArrayList(input), options);

    assertTrue(c.getErrorCount() > 0); // DUPLICATE_EXTERN_INPUT
  }

  @Test
  public void testInit_duplicateSourceInput_reportsError() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();

    SourceFile i1 = SourceFile.fromCode("dup2.js", "var a = 1;");
    SourceFile i2 = SourceFile.fromCode("dup2.js", "var b = 2;");

    c.init(Lists.<SourceFile>newArrayList(), Lists.newArrayList(i1, i2), options);

    assertTrue(c.getErrorCount() > 0); // DUPLICATE_INPUT
  }

  // ---------------------------------------------------------------------
  // 9) getSourceLine / getSourceRegion
  // ---------------------------------------------------------------------

  @Test
  public void testGetSourceLine_lineNumberLessThanOne_returnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceLine("anything.js", 0));
    assertNull(c.getSourceLine("anything.js", -1));
  }

  @Test
  public void testGetSourceRegion_lineNumberLessThanOne_returnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceRegion("anything.js", 0));
    assertNull(c.getSourceRegion("anything.js", -1));
  }

  @Test
  public void testGetSourceLine_afterInit_validAndInvalidSourceName() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    SourceFile extern = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;\nvar y = 2;\n");

    c.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    assertEquals(0, c.getErrorCount());

    // Assumption: SourceFile.getLine(1) คืนเนื้อหาบรรทัดแรกโดยไม่มี newline (ตามการใช้งานทั่วไป)
    String line = c.getSourceLine("input.js", 1);
    assertNotNull(line);
    assertTrue(line.contains("var x = 1;"));

    // source name ที่ไม่มีจริง -> ต้อง return null (ไม่ throw)
    assertNull(c.getSourceLine("does-not-exist.js", 1));
    assertNull(c.getSourceRegion("does-not-exist.js", 1));

    Region region = c.getSourceRegion("input.js", 1);
    assertNotNull(region);
  }

  // ---------------------------------------------------------------------
  // 10) getModuleGraph / getDegenerateModuleGraph
  // ---------------------------------------------------------------------

  @Test
  public void testGetModuleGraph_singleModule_isNull() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    SourceFile input = SourceFile.fromCode("a.js", "var a=1;");

    c.init(Lists.<SourceFile>newArrayList(), Lists.newArrayList(input), options);
    assertNull(c.getModuleGraph()); // เพราะ init(List,List,...) ใช้ single module เสมอ
  }

  @Test
  public void testGetModuleGraph_twoModules_isNotNull() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("a.js", "var a=1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("b.js", "var b=1;"));

    c.initModules(Lists.<SourceFile>newArrayList(), Lists.newArrayList(m1, m2), options);
    assertNotNull(c.getModuleGraph());
  }

  @Test
  public void testGetDegenerateModuleGraph_whenGraphNull_buildsNew() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    SourceFile input = SourceFile.fromCode("a.js", "var a=1;");

    c.init(Lists.<SourceFile>newArrayList(), Lists.newArrayList(input), options);
    assertNull(c.getModuleGraph());
    assertNotNull(c.getDegenerateModuleGraph());
  }

  // ---------------------------------------------------------------------
  // 11) compile() - valid / invalid syntax, thread on/off
  // ---------------------------------------------------------------------

  @Test
  public void testCompile_validCode_noThreads_noErrors() {
    Compiler c = new Compiler();
    c.disableThreads();
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true; // ข้าม check()/optimize() ที่ต้องพึ่ง pass เยอะ

    SourceFile extern = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");

    Result result = c.compile(extern, input, options);
    assertNotNull(result);
    assertFalse(c.hasErrors());
  }

  @Test
  public void testCompile_validCode_withThreads_noErrors() {
    Compiler c = new Compiler(); // ไม่เรียก disableThreads -> ใช้ thread จริง
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;

    SourceFile extern = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var y = 2;");

    Result result = c.compile(extern, input, options);
    assertNotNull(result);
    assertFalse(c.hasErrors());
  }

  @Test
  public void testCompile_invalidSyntax_hasErrors() {
    Compiler c = new Compiler();
    c.disableThreads();
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;

    SourceFile extern = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = ;"); // syntax error

    Result result = c.compile(extern, input, options);
    assertNotNull(result);
    assertTrue(c.hasErrors());
    assertTrue(c.getErrorCount() > 0);
  }

  // ---------------------------------------------------------------------
  // 12) parse() / getRoot() / toSource() smoke test
  // ---------------------------------------------------------------------

  @Test
  public void testParseAndGetRootAndToSource_smoke() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;

    SourceFile extern = SourceFile.fromCode("e.js", "");
    SourceFile input = SourceFile.fromCode("i.js", "var a=1;");

    c.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    assertNull(c.getRoot()); // ยังไม่ parse

    c.parse();
    Node root = c.getRoot();
    assertNotNull(root);

    String src = c.toSource();
    assertNotNull(src);
    assertTrue(src.length() > 0);
  }

  // ---------------------------------------------------------------------
  // 13) newExternInput / removeExternInput
  // ---------------------------------------------------------------------

  @Test
  public void testNewExternInput_successAndDuplicateThrows() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    SourceFile extern = SourceFile.fromCode("e.js", "");
    SourceFile input = SourceFile.fromCode("i.js", "var a=1;");
    c.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    c.parse(); // ต้อง parse ก่อน เพื่อให้ externsRoot ถูกสร้าง

    int before = c.getExternsForTesting().size();
    CompilerInput newExtern = c.newExternInput("newExtern.js");
    assertNotNull(newExtern);
    assertTrue(newExtern.isExtern());
    assertEquals(before + 1, c.getExternsForTesting().size());

    try {
      c.newExternInput("newExtern.js"); // ชื่อซ้ำ
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // ok
    }
  }

  @Test
  public void testRemoveExternInput_nonexistentIsNoop() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    SourceFile extern = SourceFile.fromCode("e.js", "");
    SourceFile input = SourceFile.fromCode("i.js", "var a=1;");
    c.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    c.parse();

    // ไม่มี input นี้จริง -> ต้อง return แบบเงียบ ๆ ไม่ throw
    c.removeExternInput(new InputId("no-such-extern.js"));
    // ผ่านมาถึงบรรทัดนี้ได้แสดงว่าไม่ throw
    assertTrue(true);
  }

  // ---------------------------------------------------------------------
  // 14) getErrorLevel
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testGetErrorLevel_nullOptionsThrowsNPE() {
    Compiler c = new Compiler(); // options field ยังเป็น null
    c.getErrorLevel(null);
  }

  @Test
  public void testGetErrorLevel_afterInitOptions_returnsLevel() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    c.initOptions(options);

    JSError err = JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b");
    CheckLevel level = c.getErrorLevel(err);
    assertNotNull(level);
  }

  // ---------------------------------------------------------------------
  // 15) isInliningForbidden (เฉพาะ branch ที่มั่นใจ - true cases)
  // ---------------------------------------------------------------------

  @Test
  public void testIsInliningForbidden_heuristicPolicies() {
    Compiler c = new Compiler();
    c.options = new CompilerOptions();

    c.options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    assertTrue(c.isInliningForbidden());

    c.options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    assertTrue(c.isInliningForbidden());
    // หมายเหตุ: ไม่ทดสอบ false-case เพราะไม่แน่ใจชื่อ enum constant อื่น ๆ ที่ไม่มีในซอร์สที่ให้มา
  }

  // ---------------------------------------------------------------------
  // 16) isIdeMode / isTypeCheckingEnabled / acceptConstKeyword (direct field flags)
  // ---------------------------------------------------------------------

  @Test
  public void testIsIdeMode_and_isTypeCheckingEnabled_and_acceptConstKeyword() {
    Compiler c = new Compiler();
    c.options = new CompilerOptions();

    c.options.ideMode = true;
    assertTrue(c.isIdeMode());
    c.options.ideMode = false;
    assertFalse(c.isIdeMode());

    c.options.checkTypes = true;
    assertTrue(c.isTypeCheckingEnabled());
    c.options.checkTypes = false;
    assertFalse(c.isTypeCheckingEnabled());

    c.options.acceptConstKeyword = true;
    assertTrue(c.acceptConstKeyword());
    c.options.acceptConstKeyword = false;
    assertFalse(c.acceptConstKeyword());
  }

  // ---------------------------------------------------------------------
  // 17) disableThreads - smoke (ไม่มี exception)
  // ---------------------------------------------------------------------

  @Test
  public void testDisableThreads_noException() {
    Compiler c = new Compiler();
    c.disableThreads();
    // ไม่มี getter ให้ตรวจ useThreads โดยตรงจากซอร์ส จึงตรวจผลทางอ้อมผ่าน compile()
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;
    SourceFile extern = SourceFile.fromCode("e.js", "");
    SourceFile input = SourceFile.fromCode("i.js", "var z=1;");
    Result result = c.compile(extern, input, options);
    assertNotNull(result);
    assertFalse(c.hasErrors());
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testCodeBuilder_appendNoNewline | `CodeBuilder.append` กรณีไม่มี `\n` (lastIndex == -1) |
| testCodeBuilder_appendWithNewline | `CodeBuilder.append` กรณีมี `\n` หลายครั้ง (loop while indexOf) |
| testCodeBuilder_resetKeepsLineCount | `reset()` ไม่กระทบ lineCount |
| testCodeBuilder_endsWith_trueCase | `endsWith` เงื่อนไข true |
| testCodeBuilder_endsWith_falseCase_shorterBuffer | `endsWith` เงื่อนไข `sb.length() > suffix.length()` เป็น false |
| testCodeBuilder_endsWith_falseCase_equalLength | Boundary/fault: length เท่ากันพอดี → false (strict `>`) |
| testConstructors_defaultAndWithErrorManager | Constructor `Compiler()`, `Compiler(PrintStream)` |
| testSetErrorManager_nullThrowsNPE | `Preconditions.checkNotNull` ใน `setErrorManager` |
| testGetErrorManager_lazyInit_noStream | `initOptions`: outStream==null → LoggerErrorManager branch |
| testGetErrorManager_lazyInit_withStream | `initOptions`: outStream!=null → PrintStreamErrorManager branch |
| testSetProgress_boundaries | `setProgress`: >1.0, <0.0, ==1.0, ==0.0 (3 branch ของ if/else if/else) |
| testResetUniqueNameId_andSupplier | `nextUniqueNameId`, `resetUniqueNameId`, `getUniqueNameIdSupplier` |
| testSetPassConfig_nullThrowsNPE | `Preconditions.checkNotNull(passes)` |
| testSetPassConfig_alreadyAssignedThrowsISE | `if (this.passes != null) throw ISE` (true) |
| testSetPassConfig_successAssignsAndReturnsSame | `if (this.passes != null)` (false) + `getPassConfig()` cache branch |
| testCreateFillFileName | static method string formatting |
| testInitModules_emptyModuleList_reportsError | `checkFirstModule`: `modules.isEmpty()` true |
| testInitModules_singleEmptyModule_noErrorAndFilled | `checkFirstModule` else-if false (size==1) + `fillEmptyModules` true branch |
| testInitModules_twoModulesFirstEmpty_reportsError | `checkFirstModule` else-if true (empty && size>1) |
| testInit_duplicateExternInput_reportsError | `initInputsByIdMap`: duplicate extern branch |
| testInit_duplicateSourceInput_reportsError | `initInputsByIdMap`: duplicate input branch |
| testGetSourceLine_lineNumberLessThanOne_returnsNull | `if (lineNumber < 1) return null` |
| testGetSourceRegion_lineNumberLessThanOne_returnsNull | เดียวกันสำหรับ `getSourceRegion` |
| testGetSourceLine_afterInit_validAndInvalidSourceName | `getSourceFileByName`: input!=null / input==null |
| testGetModuleGraph_singleModule_isNull | `if (modules.size() > 1)` false |
| testGetModuleGraph_twoModules_isNotNull | `if (modules.size() > 1)` true (no exception path) |
| testGetDegenerateModuleGraph_whenGraphNull_buildsNew | `moduleGraph == null ? new... : moduleGraph` true branch |
| testCompile_validCode_noThreads_noErrors | `runCallable`: `useLargeStackThread=false` else branch |
| testCompile_validCode_withThreads_noErrors | `runCallable`: `useLargeStackThread=true` if branch |
| testCompile_invalidSyntax_hasErrors | `compileInternal`: parse error → early return, `hasErrors()` true |
| testParseAndGetRootAndToSource_smoke | `getRoot()` null→non-null, `toSource()` basic path |
| testNewExternInput_successAndDuplicateThrows | `newExternInput`: success + `IllegalArgumentException` duplicate branch |
| testRemoveExternInput_nonexistentIsNoop | `removeExternInput`: `if (input == null) return;` |
| testGetErrorLevel_nullOptionsThrowsNPE | `Preconditions.checkNotNull(options)` ใน `getErrorLevel` |
| testGetErrorLevel_afterInitOptions_returnsLevel | success path ของ `getErrorLevel` |
| testIsInliningForbidden_heuristicPolicies | OR condition สองด้าน (`HEURISTIC` / `AGGRESSIVE_HEURISTIC`) |
| testIsIdeMode_and_isTypeCheckingEnabled_and_acceptConstKeyword | true/false ของ field-based getter สามตัว |
| testDisableThreads_noException | `disableThreads()` ผลทางอ้อมผ่าน compile |

**ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- ไม่ทดสอบ `acceptEcmaScript5()` เพราะไม่พบ setter ของ `languageIn` ในซอร์สที่ให้มา
- ไม่ทดสอบ false-case ของ `isInliningForbidden()` เพราะไม่แน่ใจชื่อ enum constant อื่นที่ไม่ปรากฏในซอร์ส
- Assumption เรื่อง `SourceFile.getLine()` คืนค่าบรรทัดโดยไม่มี `\n` ถูกกำกับด้วยคอมเมนต์ในโค้ด