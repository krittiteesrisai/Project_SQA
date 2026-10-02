# CompilerTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาส `Compiler` มีการเรียกใช้ pipeline การ parse/compile จริงซึ่งพึ่งพาคลาสจำนวนมาก (Rhino parser, PassConfig ฯลฯ) ผมจึงเลือกเขียนเทสให้ครอบคลุมทั้ง (1) เมธอด/branch ที่ทำงานแบบ isolated ได้ชัดเจนจากซอร์สที่ให้มา และ (2) เทส smoke-level สำหรับ pipeline การ compile จริงด้วยโค้ด JS ง่าย ๆ
- ฟิลด์/เมธอดที่เป็น package-private (เช่น `options`, `getInputsForTesting()`, `getUniqueNameIdSupplier()`) เข้าถึงได้เพราะไฟล์เทสอยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) ตามลักษณะการเทสจริงของโปรเจกต์นี้
- บางจุดที่ไม่มีรายละเอียดพอในซอร์ส (เช่น รูปแบบข้อความ error ที่แน่นอน, `JSModule.addDependency`, `checkTreeTypeAwareEqualsSilent`) ผม**ไม่เดา**และใส่คอมเมนต์กำกับไว้ หรือข้ามการทดสอบ branch นั้น

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler; // import ตามข้อกำหนด (แม้อยู่ package เดียวกัน)
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CompilerTest {

  // ---------------------------------------------------------------
  // Constructors / ErrorManager
  // ---------------------------------------------------------------

  @Test
  public void testDefaultConstructor() {
    Compiler c = new Compiler();
    assertNotNull(c);
  }

  @Test
  public void testConstructorWithPrintStream_createsPrintStreamErrorManager() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    Compiler c = new Compiler(new PrintStream(baos));
    c.initOptions(new CompilerOptions());
    assertTrue(c.getErrorManager() instanceof PrintStreamErrorManager);
  }

  @Test
  public void testInitOptions_noStream_createsLoggerErrorManager() {
    Compiler c = new Compiler(); // outStream == null
    c.initOptions(new CompilerOptions());
    assertTrue(c.getErrorManager() instanceof LoggerErrorManager);
  }

  @Test
  public void testInitOptions_existingErrorManager_isKept() {
    Compiler c1 = new Compiler();
    ErrorManager em = c1.getErrorManager(); // auto init ด้วย default options
    Compiler c2 = new Compiler();
    c2.setErrorManager(em);
    c2.initOptions(new CompilerOptions()); // errorManager != null -> ไม่สร้างใหม่
    assertSame(em, c2.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManagerNullThrowsNPE() {
    new Compiler().setErrorManager(null);
  }

  @Test
  public void testSetErrorManagerAcceptsNonNull() {
    Compiler c1 = new Compiler();
    ErrorManager em = c1.getErrorManager();
    Compiler c2 = new Compiler();
    c2.setErrorManager(em);
    assertSame(em, c2.getErrorManager());
  }

  @Test
  public void testConstructorWithErrorManager() {
    Compiler c1 = new Compiler();
    ErrorManager em = c1.getErrorManager();
    Compiler c2 = new Compiler(em);
    assertSame(em, c2.getErrorManager());
  }

  @Test
  public void testGetErrorManagerAutoInitializesOptions() {
    Compiler c = new Compiler();
    assertNotNull(c.getErrorManager());
  }

  // ---------------------------------------------------------------
  // checkFirstModule() / fillEmptyModules() ผ่าน initModules()
  // ---------------------------------------------------------------

  @Test
  public void testInitModules_emptyModuleList_reportsError() {
    Compiler c = new Compiler();
    List<JSModule> modules = new ArrayList<JSModule>();
    c.initModules(new ArrayList<JSSourceFile>(), modules, new CompilerOptions());
    assertTrue(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  @Test
  public void testInitModules_singleEmptyModule_noError() {
    // modules.size() == 1 -> เงื่อนไข "&& modules.size() > 1" เป็น false เสมอ
    Compiler c = new Compiler();
    JSModule m = new JSModule("m1");
    List<JSModule> modules = new ArrayList<JSModule>();
    modules.add(m);
    c.initModules(new ArrayList<JSSourceFile>(), modules, new CompilerOptions());
    assertFalse(c.hasErrors());
  }

  @Test
  public void testInitModules_multiModule_emptyRootModule_reportsError() {
    Compiler c = new Compiler();
    JSModule m1 = new JSModule("m1"); // ว่าง
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("b.js", "var b = 1;"));
    List<JSModule> modules = new ArrayList<JSModule>();
    modules.add(m1);
    modules.add(m2);
    c.initModules(new ArrayList<JSSourceFile>(), modules, new CompilerOptions());
    assertTrue(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  // ---------------------------------------------------------------
  // initInputsByNameMap() - duplicate input / extern
  // ---------------------------------------------------------------

  @Test
  public void testInit_duplicateInput_reportsError() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("dup.js", "var a = 1;"));
    inputs.add(JSSourceFile.fromCode("dup.js", "var b = 2;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertTrue(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  @Test
  public void testInit_duplicateExtern_reportsError() {
    Compiler c = new Compiler();
    List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
    externs.add(JSSourceFile.fromCode("ext.js", ""));
    externs.add(JSSourceFile.fromCode("ext.js", ""));
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    c.init(externs, inputs, new CompilerOptions());
    assertTrue(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  @Test
  public void testInit_noDuplicate_noError() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertFalse(c.hasErrors());
  }

  // ---------------------------------------------------------------
  // newExternInput()
  // ---------------------------------------------------------------

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateName_throws() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    c.newExternInput("a.js"); // ชื่อซ้ำกับ input ที่มีอยู่แล้ว
  }

  // ---------------------------------------------------------------
  // rebuildInputsFromModules()
  // ---------------------------------------------------------------

  @Test
  public void testRebuildInputsFromModules() {
    Compiler c = new Compiler();
    JSModule m = new JSModule("m1");
    m.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    List<JSModule> modules = new ArrayList<JSModule>();
    modules.add(m);
    c.initModules(new ArrayList<JSSourceFile>(), modules, new CompilerOptions());
    assertEquals(1, c.getInputsForTesting().size());

    m.add(JSSourceFile.fromCode("b.js", "var b=2;"));
    c.rebuildInputsFromModules();
    assertEquals(2, c.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------
  // setPassConfig() / getPassConfig()
  // ---------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfigNull_throwsNPE() {
    new Compiler().setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfigTwice_throwsISE() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    PassConfig pc1 = new DefaultPassConfig(c.getOptions());
    PassConfig pc2 = new DefaultPassConfig(c.getOptions());
    c.setPassConfig(pc1);
    c.setPassConfig(pc2); // this.passes != null -> throw
  }

  @Test
  public void testGetPassConfig_lazyInitAndCache() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    PassConfig pc = c.getPassConfig();
    assertNotNull(pc);
    assertSame(pc, c.getPassConfig());
  }

  // ---------------------------------------------------------------
  // uniqueNameId / resetUniqueNameId
  // ---------------------------------------------------------------

  @Test
  public void testUniqueNameIdSequenceAndReset() {
    Compiler c = new Compiler();
    Supplier<String> supplier = c.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    c.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------------------------------------------------------------
  // getSourceLine() / getSourceRegion()
  // ---------------------------------------------------------------

  @Test
  public void testGetSourceLine_lineLessThanOne_returnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceLine("any.js", 0));
    assertNull(c.getSourceLine("any.js", -5));
  }

  @Test
  public void testGetSourceRegion_lineLessThanOne_returnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceRegion("any.js", 0));
  }

  @Test
  public void testGetSourceLine_unknownSourceName_returnsNull() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertNull(c.getSourceLine("unknown.js", 1));
  }

  @Test
  public void testGetSourceLine_knownSourceName_returnsNonNull() {
    // เนื้อหาที่ SourceFile.getLine คืนค่าจริง ๆ ไม่ได้แสดงในซอร์สที่ให้มา
    // จึงตรวจสอบแบบกว้าง ๆ ว่าไม่ null (แสดงว่า branch input != null ถูกเรียก)
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a=1;\nvar b=2;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertNotNull(c.getSourceLine("a.js", 1));
  }

  // ---------------------------------------------------------------
  // hasErrors() / hasHaltingErrors() (ideMode branch)
  // ---------------------------------------------------------------

  @Test
  public void testHasErrors_ideModeSuppressesHaltingErrors() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.ideMode = true;
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("dup.js", "var a=1;"));
    inputs.add(JSSourceFile.fromCode("dup.js", "var b=2;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, opts);
    assertTrue(c.getErrorCount() > 0);
    assertFalse(c.hasErrors()); // ideMode == true -> hasHaltingErrors() == false
  }

  @Test
  public void testHasErrors_normalMode_returnsTrueWhenErrors() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.ideMode = false;
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("dup.js", "var a=1;"));
    inputs.add(JSSourceFile.fromCode("dup.js", "var b=2;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, opts);
    assertTrue(c.hasErrors());
  }

  // ---------------------------------------------------------------
  // report() / getErrorLevel()
  // ---------------------------------------------------------------

  @Test
  public void testReport_addsErrorWhenLevelOn() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    int before = c.getErrorCount();
    c.report(JSError.make(Compiler.DUPLICATE_INPUT, "x"));
    assertEquals(before + 1, c.getErrorCount());
  }

  @Test
  public void testGetErrorLevel_noGuard_returnsOriginalLevel() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    JSError err = JSError.make(Compiler.DUPLICATE_INPUT, "x");
    assertEquals(err.level, c.getErrorLevel(err));
  }

  @Test(expected = NullPointerException.class)
  public void testGetErrorLevel_nullOptions_throwsNPE() {
    Compiler c = new Compiler(); // ไม่เรียก initOptions -> options == null
    JSError err = JSError.make(Compiler.DUPLICATE_INPUT, "x");
    c.getErrorLevel(err);
  }

  @Test
  public void testGetMessagesEqualsGetErrors() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("dup.js", "var a=1;"));
    inputs.add(JSSourceFile.fromCode("dup.js", "var b=2;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertArrayEquals(c.getErrors(), c.getMessages());
  }

  // ---------------------------------------------------------------
  // getCodingConvention / isIdeMode / isTypeCheckingEnabled
  // ---------------------------------------------------------------

  @Test
  public void testIsIdeModeReflectsOptions() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.ideMode = true;
    c.initOptions(opts);
    assertTrue(c.isIdeMode());
  }

  @Test
  public void testIsTypeCheckingEnabledReflectsOptions() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.checkTypes = true;
    c.initOptions(opts);
    assertTrue(c.isTypeCheckingEnabled());
  }

  @Test
  public void testGetCodingConvention_neverNull() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    assertNotNull(c.getCodingConvention());
  }

  // ---------------------------------------------------------------
  // getTypeRegistry / getTypeValidator / getReverseAbstractInterpreter (lazy + caching)
  // ---------------------------------------------------------------

  @Test
  public void testGetTypeRegistry_cachesInstance() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    JSTypeRegistry r1 = c.getTypeRegistry();
    JSTypeRegistry r2 = c.getTypeRegistry();
    assertSame(r1, r2);
  }

  @Test
  public void testGetTypeValidator_cachesInstance() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    TypeValidator v1 = c.getTypeValidator();
    TypeValidator v2 = c.getTypeValidator();
    assertSame(v1, v2);
  }

  @Test
  public void testGetReverseAbstractInterpreter_closurePassFalse_caches() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.closurePass = false;
    c.initOptions(opts);
    ReverseAbstractInterpreter i1 = c.getReverseAbstractInterpreter();
    ReverseAbstractInterpreter i2 = c.getReverseAbstractInterpreter();
    assertNotNull(i1);
    assertSame(i1, i2);
  }

  @Test
  public void testGetReverseAbstractInterpreter_closurePassTrue() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    opts.closurePass = true;
    c.initOptions(opts);
    ReverseAbstractInterpreter i = c.getReverseAbstractInterpreter();
    assertNotNull(i);
  }

  // ---------------------------------------------------------------
  // areNodesEqualForInlining (เฉพาะ branch ที่ไม่ต้องพึ่ง type info)
  // ---------------------------------------------------------------

  @Test
  public void testAreNodesEqualForInlining_withoutTypeAwareness() {
    Compiler c = new Compiler();
    // เข้าถึง field package-private โดยตรง (อยู่ package เดียวกัน)
    c.options = new CompilerOptions();
    c.options.ambiguateProperties = false;
    c.options.disambiguateProperties = false;
    Node n1 = new Node(Token.BLOCK);
    Node n2 = new Node(Token.BLOCK);
    assertTrue(c.areNodesEqualForInlining(n1, n2));
  }
  // หมายเหตุ: ไม่ทดสอบ branch ambiguateProperties/disambiguateProperties == true
  // เนื่องจาก checkTreeTypeAwareEqualsSilent ต้องพึ่งพา type information ที่ไม่ได้ระบุไว้ในซอร์ส

  // ---------------------------------------------------------------
  // addChangeHandler / removeChangeHandler / reportCodeChange
  // ---------------------------------------------------------------

  @Test
  public void testAddRemoveChangeHandler_reportCodeChange() {
    Compiler c = new Compiler();
    final boolean[] changed = {false};
    CodeChangeHandler handler = new CodeChangeHandler() {
      public void reportChange() {
        changed[0] = true;
      }
    };
    c.addChangeHandler(handler);
    c.reportCodeChange();
    assertTrue(changed[0]);

    changed[0] = false;
    c.removeChangeHandler(handler);
    c.reportCodeChange();
    assertFalse(changed[0]);
  }

  @Test
  public void testRecentChangeTracksCodeChange() {
    Compiler c = new Compiler();
    assertFalse(c.recentChange.hasCodeChanged());
    c.reportCodeChange();
    assertTrue(c.recentChange.hasCodeChanged());
  }

  // ---------------------------------------------------------------
  // getInput / getExternsForTesting / getInputsForTesting
  // ---------------------------------------------------------------

  @Test
  public void testGetInput_knownAndUnknownName() {
    Compiler c = new Compiler();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    c.init(new ArrayList<JSSourceFile>(), inputs, new CompilerOptions());
    assertNull(c.getInput("nonexistent.js"));
    assertNotNull(c.getInput("a.js"));
  }

  @Test
  public void testGetExternsForTesting_and_getInputsForTesting() {
    Compiler c = new Compiler();
    List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
    externs.add(JSSourceFile.fromCode("e.js", ""));
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    c.init(externs, inputs, new CompilerOptions());
    assertEquals(1, c.getExternsForTesting().size());
    assertEquals(1, c.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------
  // compile() - precondition & smoke tests
  // ---------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testCompileCalledTwice_throwsISE() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    c.compile(externs, inputs, opts);
    c.compile(externs, inputs, opts); // jsRoot != null -> throw
  }

  @Test
  public void testCompile_simpleValidCode_noErrors() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    Result result = c.compile(externs, inputs, opts);
    assertNotNull(result);
    assertEquals(0, c.getErrorCount());
  }

  @Test
  public void testCompile_threadsDisabled_stillSucceeds() {
    Compiler c = new Compiler();
    c.disableThreads(); // useThreads = false -> runnable.run() branch
    CompilerOptions opts = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
    List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
    inputs.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    Result result = c.compile(externs, inputs, opts);
    assertNotNull(result);
    assertEquals(0, c.getErrorCount());
  }

  @Test
  public void testCompile_convenienceOverload_singleExternSingleInput() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("a.js", "var a = 1;");
    Result result = c.compile(extern, input, opts);
    assertNotNull(result);
    assertEquals(0, c.getErrorCount());
  }

  @Test
  public void testCompileModules_singleModule() {
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    JSModule m = new JSModule("m1");
    m.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    JSModule[] modules = new JSModule[] {m};
    JSSourceFile[] externs = new JSSourceFile[] {};
    Result result = c.compile(externs, modules, opts);
    assertNotNull(result);
    assertEquals(0, c.getErrorCount());
  }

  @Test
  public void testCompileModules_multipleModules_graphCreated() {
    // ครอบคลุม branch modules.size() > 1 -> สร้าง JSModuleGraph สำเร็จ (ไม่มี exception)
    Compiler c = new Compiler();
    CompilerOptions opts = new CompilerOptions();
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("b.js", "var b = 2;"));
    JSModule[] modules = new JSModule[] {m1, m2};
    JSSourceFile[] externs = new JSSourceFile[] {};
    Result result = c.compile(externs, modules, opts);
    assertNotNull(result);
    assertEquals(0, c.getErrorCount());
  }
  // หมายเหตุ: ไม่ได้ทดสอบ branch ModuleDependenceException (dependency ผิดลำดับ)
  // เนื่องจากซอร์สที่ให้มาไม่ได้แสดง API ของ JSModule สำหรับกำหนด dependency (เช่น addDependency)

  // ---------------------------------------------------------------
  // CodeBuilder (static nested class)
  // ---------------------------------------------------------------

  @Test
  public void testCodeBuilder_appendAndLength() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc");
    assertEquals(3, cb.getLength());
    assertEquals("abc", cb.toString());
  }

  @Test
  public void testCodeBuilder_endsWith_trueAndFalseCase() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello world");
    assertTrue(cb.endsWith("world"));
    assertFalse(cb.endsWith("xyz"));
  }

  @Test
  public void testCodeBuilder_endsWith_boundaryEqualLength() {
    // เงื่อนไขใน source คือ sb.length() > suffix.length() (ใช้ ">" ไม่ใช่ ">=")
    // ดังนั้นเมื่อ suffix ยาวเท่ากับเนื้อหาทั้งหมด ผลลัพธ์คือ false ตามพฤติกรรมจริงของ source (ไม่ใช่ intuition ทั่วไป)
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc");
    assertFalse(cb.endsWith("abc"));
  }

  @Test
  public void testCodeBuilder_reset_keepsLineCountButClearsLength() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2\n");
    int lineIndexBefore = cb.getLineIndex();
    assertEquals(2, lineIndexBefore);
    cb.reset();
    assertEquals(0, cb.getLength());
    assertEquals(lineIndexBefore, cb.getLineIndex());
  }

  @Test
  public void testCodeBuilder_columnTracking_afterNewlines() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2\n");
    assertEquals(0, cb.getColumnIndex());
    cb.append("abc");
    assertEquals(3, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_columnTracking_noNewlineAccumulates() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("ab");
    cb.append("cd");
    assertEquals(4, cb.getColumnIndex());
    assertEquals(0, cb.getLineIndex());
  }
}
```

## สรุปตาราง Test → Branch/Condition ที่ครอบคลุม

| กลุ่ม | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor/ErrorManager | testDefaultConstructor, testConstructorWithErrorManager | constructor delegation |
| | testConstructorWithPrintStream_createsPrintStreamErrorManager | `initOptions`: outStream != null |
| | testInitOptions_noStream_createsLoggerErrorManager | `initOptions`: outStream == null |
| | testInitOptions_existingErrorManager_isKept | `initOptions`: errorManager != null (skip create) |
| | testSetErrorManagerNullThrowsNPE | `setErrorManager`: null check throw |
| checkFirstModule/fillEmptyModules | testInitModules_emptyModuleList_reportsError | `modules.isEmpty()` == true |
| | testInitModules_singleEmptyModule_noError | `isEmpty() && size>1` == false (size==1) |
| | testInitModules_multiModule_emptyRootModule_reportsError | `isEmpty() && size>1` == true |
| initInputsByNameMap | testInit_duplicateInput_reportsError | duplicate input → true branch |
| | testInit_duplicateExtern_reportsError | duplicate extern → true branch |
| | testInit_noDuplicate_noError | containsKey == false branch |
| newExternInput | testNewExternInput_duplicateName_throws | `inputsByName.containsKey` true → throw |
| rebuildInputsFromModules | testRebuildInputsFromModules | rebuild logic |
| setPassConfig/getPassConfig | testSetPassConfigNull_throwsNPE | null check |
| | testSetPassConfigTwice_throwsISE | `this.passes != null` throw |
| | testGetPassConfig_lazyInitAndCache | passes==null create vs cache |
| uniqueNameId | testUniqueNameIdSequenceAndReset | increment + reset |
| getSourceLine/Region | testGetSourceLine_lineLessThanOne_returnsNull, testGetSourceRegion_lineLessThanOne_returnsNull | `lineNumber < 1` true |
| | testGetSourceLine_unknownSourceName_returnsNull | `containsKey` false |
| | testGetSourceLine_knownSourceName_returnsNonNull | `containsKey` true / input != null |
| hasErrors/hasHaltingErrors | testHasErrors_ideModeSuppressesHaltingErrors | `!isIdeMode()` false → short circuit |
| | testHasErrors_normalMode_returnsTrueWhenErrors | `!isIdeMode() && count>0` true |
| report/getErrorLevel | testReport_addsErrorWhenLevelOn | guard==null, level.isOn() true |
| | testGetErrorLevel_noGuard_returnsOriginalLevel | guards==null branch |
| | testGetErrorLevel_nullOptions_throwsNPE | Preconditions.checkNotNull(options) |
| | testGetMessagesEqualsGetErrors | getMessages delegation |
| options accessors | testIsIdeModeReflectsOptions, testIsTypeCheckingEnabledReflectsOptions, testGetCodingConvention_neverNull | direct field passthrough |
| lazy caches | testGetTypeRegistry_cachesInstance, testGetTypeValidator_cachesInstance | null-check-then-create vs cached |
| | testGetReverseAbstractInterpreter_closurePassFalse_caches | `options.closurePass` false branch + cache |
| | testGetReverseAbstractInterpreter_closurePassTrue | `options.closurePass` true branch |
| areNodesEqualForInlining | testAreNodesEqualForInlining_withoutTypeAwareness | `ambiguateProperties||disambiguateProperties` == false |
| change handlers | testAddRemoveChangeHandler_reportCodeChange | add/remove + iterate handlers |
| | testRecentChangeTracksCodeChange | default handler registered in ctor |
| input lookup | testGetInput_knownAndUnknownName, testGetExternsForTesting_and_getInputsForTesting | map lookup found/not found |
| compile() | testCompileCalledTwice_throwsISE | `Preconditions.checkState(jsRoot==null)` false→throw |
| | testCompile_simpleValidCode_noErrors | happy path full pipeline |
| | testCompile_threadsDisabled_stillSucceeds | `useThreads==false` else branch |
| | testCompile_convenienceOverload_singleExternSingleInput | overload delegation |
| | testCompileModules_singleModule | `modules.size()>1` false (moduleGraph=null) |
| | testCompileModules_multipleModules_graphCreated | `modules.size()>1` true, try-success path |
| CodeBuilder | testCodeBuilder_appendAndLength | append/getLength/toString |
| | testCodeBuilder_endsWith_trueAndFalseCase | endsWith true/false |
| | testCodeBuilder_endsWith_boundaryEqualLength | boundary `>` vs `>=` (fault-detection) |
| | testCodeBuilder_reset_keepsLineCountButClearsLength | reset behavior |
| | testCodeBuilder_columnTracking_afterNewlines | `lastIndex==-1` false branch |
| | testCodeBuilder_columnTracking_noNewlineAccumulates | `lastIndex==-1` true branch |

**จุดที่ไม่ได้ทดสอบ (ระบุเหตุผลชัดเจน):**
- `JSModuleGraph.ModuleDependenceException` path — ต้องใช้ API กำหนด dependency ของ `JSModule` ที่ไม่ปรากฏในซอร์สที่ให้มา
- branch `ambiguateProperties/disambiguateProperties == true` ใน `areNodesEqualForInlining` — ต้องพึ่งพา type information ที่ไม่มีรายละเอียดในซอร์ส
- ข้อความ error/รูปแบบ `JSError` โดยละเอียด — ตรวจสอบผ่านจำนวน error/`hasErrors()` แทน เพื่อไม่เดา field/method ที่ไม่ปรากฏในซอร์ส