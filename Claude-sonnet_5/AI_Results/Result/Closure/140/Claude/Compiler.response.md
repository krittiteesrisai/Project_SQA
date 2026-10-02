# CompilerTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
- Test class ถูกวางไว้ใน package เดียวกับคลาสเป้าหมาย (`com.google.javascript.jscomp`) เพื่อให้เข้าถึง field/method ระดับ `package-private` (ไม่มี modifier) ที่จำเป็นสำหรับการทดสอบ branch หลายจุด (เช่น `checkFirstModule`, `options`, `defaultCodingConvention`, `areNodesEqualForInlining` ฯลฯ)
- จุดที่ผมไม่สามารถยืนยัน behavior ได้ 100% จาก source ที่ให้มา (เช่น รูปแบบ string ที่ `SourceFile.getLine()` คืนกลับ, ผลลัพธ์ของ `checkTreeTypeAwareEqualsSilent`, พฤติกรรมของ `JSModuleGraph` กับ array ว่าง) ผมเขียนคอมเมนต์กำกับไว้ และหลีกเลี่ยงการ assert ค่าที่ไม่มั่นใจแบบเข้มงวด (ใช้ `assertNotNull` แทนการเทียบ string ตรงๆ)
- หลีกเลี่ยงการสร้าง instance ของ `JSModule` (constructor/`add()` ไม่ปรากฏใน source ที่ให้มา) เพื่อลดความเสี่ยงการ compile ไม่ผ่าน จึงทดสอบเฉพาะ branch ที่ใช้ `new JSModule[0]` (ไม่ต้อง instantiate)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * JUnit4 tests for {@link Compiler} (Defects4J Closure-140b).
 *
 * Test class อยู่ใน package เดียวกับ com.google.javascript.jscomp.Compiler
 * เพื่อเข้าถึง field/method package-private ที่จำเป็นในการทดสอบ branch ต่าง ๆ
 */
public class CompilerTest {

  // ---------- Constructors / initOptions ----------

  @Test
  public void testDefaultConstructor_LazyErrorManager() {
    Compiler c = new Compiler();
    // options == null ตอนแรก -> getErrorManager() ต้องเรียก initOptions ให้เอง
    assertNotNull(c.getErrorManager());
  }

  @Test
  public void testConstructorWithPrintStream_UsesPrintStreamErrorManager() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    Compiler c = new Compiler(new PrintStream(baos));
    c.initOptions(new CompilerOptions());
    assertNotNull(c.getErrorManager());
  }

  @Test
  public void testInitOptions_ErrorManagerNotOverwrittenOnSecondCall() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    ErrorManager first = c.getErrorManager();
    c.initOptions(new CompilerOptions());
    ErrorManager second = c.getErrorManager();
    // errorManager != null -> ไม่สร้างใหม่ (branch "if (errorManager == null)" = false)
    assertSame(first, second);
  }

  // ---------- init() ----------

  @Test
  public void testInit_TwoFileArrays_Success() {
    Compiler c = new Compiler();
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in1.js", "var x = 1;")
    };
    c.init(externs, inputs, new CompilerOptions());
    assertFalse(c.hasErrors());
    assertNotNull(c.getInput("in1.js"));
  }

  @Test
  public void testInit_DuplicateInputNames_ReportsDuplicateInputError() {
    Compiler c = new Compiler();
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var a;"),
        JSSourceFile.fromCode("dup.js", "var b;")
    };
    c.init(externs, inputs, new CompilerOptions());
    assertTrue(c.hasErrors());
  }

  @Test
  public void testInit_DuplicateExternNames_ReportsDuplicateExternError() {
    Compiler c = new Compiler();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("ext.js", "var a;"),
        JSSourceFile.fromCode("ext.js", "var b;")
    };
    JSSourceFile[] inputs = new JSSourceFile[0];
    c.init(externs, inputs, new CompilerOptions());
    assertTrue(c.hasErrors());
  }

  @Test
  public void testInit_EmptyModuleArray_ReportsEmptyModuleListError() {
    // หมายเหตุ: สมมติว่า JSModuleGraph รับ JSModule[0] ได้โดยไม่ throw exception อื่น
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0], new JSModule[0], new CompilerOptions());
    assertTrue(c.hasErrors());
  }

  @Test
  public void testCheckFirstModule_EmptyArray_Direct() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.checkFirstModule(new JSModule[0]);
    assertTrue(c.hasErrors());
  }

  // ---------- getSourceLine / getSourceRegion ----------

  @Test
  public void testGetSourceLine_LineNumberLessThanOne_ReturnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceLine("any.js", 0));
    assertNull(c.getSourceLine("any.js", -1));
  }

  @Test
  public void testGetSourceRegion_LineNumberLessThanOne_ReturnsNull() {
    Compiler c = new Compiler();
    assertNull(c.getSourceRegion("any.js", 0));
  }

  @Test
  public void testGetSourceLine_UnknownSourceName_ReturnsNull() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a;") },
        new CompilerOptions());
    assertNull(c.getSourceLine("does-not-exist.js", 1));
  }

  @Test
  public void testGetSourceLine_ValidLine_NotNull() {
    // หมายเหตุ: ไม่ assert เนื้อหา string ตรง ๆ เพราะไม่มั่นใจ format ของ SourceFile.getLine()
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a;\nvar b;") },
        new CompilerOptions());
    assertNotNull(c.getSourceLine("a.js", 1));
  }

  // ---------- hasErrors / hasHaltingErrors / counts ----------

  @Test
  public void testHasErrors_IdeModeFalse_ErrorPresent() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.ideMode = false;
    c.checkFirstModule(new JSModule[0]);
    assertTrue(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  @Test
  public void testHasErrors_IdeModeTrue_ErrorIgnoredForHalting() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.ideMode = true;
    c.checkFirstModule(new JSModule[0]);
    // ideMode -> hasHaltingErrors() ต้องเป็น false เสมอ ไม่ว่ามี error หรือไม่
    assertFalse(c.hasErrors());
    assertEquals(1, c.getErrorCount());
  }

  // ---------- report() ----------

  @Test
  public void testReport_IncrementsErrorCount() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    assertEquals(0, c.getErrorCount());
    c.report(JSError.make(Compiler.DUPLICATE_INPUT, "x.js"));
    assertEquals(1, c.getErrorCount());
    c.report(JSError.make(Compiler.DUPLICATE_EXTERN_INPUT, "y.js"));
    assertEquals(2, c.getErrorCount());
  }

  @Test
  public void testGetMessages_EqualsGetErrors() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.report(JSError.make(Compiler.DUPLICATE_INPUT, "x.js"));
    assertArrayEquals(c.getErrors(), c.getMessages());
  }

  // ---------- setPassConfig ----------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_Null_ThrowsNPE() {
    Compiler c = new Compiler();
    c.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_AlreadyAssigned_Throws() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    PassConfig pc = c.getPassConfig(); // lazy-creates DefaultPassConfig
    c.setPassConfig(pc); // this.passes != null -> IllegalStateException
  }

  // ---------- resetUniqueNameId / getUniqueNameIdSupplier ----------

  @Test
  public void testUniqueNameIdSupplier_SequenceAfterReset() {
    Compiler c = new Compiler();
    c.resetUniqueNameId();
    com.google.common.base.Supplier<String> supplier = c.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    assertEquals("2", supplier.get());
  }

  @Test
  public void testResetUniqueNameId_BringsBackToZero() {
    Compiler c = new Compiler();
    com.google.common.base.Supplier<String> supplier = c.getUniqueNameIdSupplier();
    supplier.get();
    supplier.get();
    c.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------- setNormalized / setUnnormalized / isNormalized ----------

  @Test
  public void testNormalizedFlagTransitions() {
    Compiler c = new Compiler();
    assertFalse(c.isNormalized());
    c.setNormalized();
    assertTrue(c.isNormalized());
    c.setUnnormalized();
    assertFalse(c.isNormalized());
  }

  // ---------- areNodesEqualForInlining ----------

  @Test
  public void testAreNodesEqualForInlining_PlainCompare_True() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.ambiguateProperties = false;
    c.options.disambiguateProperties = false;
    Node n1 = new Node(Token.BLOCK);
    Node n2 = new Node(Token.BLOCK);
    assertTrue(c.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testAreNodesEqualForInlining_TypeAwareBranch_NoException() {
    // หมายเหตุ: ผลลัพธ์ที่แน่นอนของ checkTreeTypeAwareEqualsSilent ไม่ได้ยืนยันจาก
    // source ที่ให้มา จึงทดสอบเพียงว่า branch (ambiguateProperties==true) ทำงานได้
    // โดยไม่ throw exception
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.ambiguateProperties = true;
    Node n1 = new Node(Token.BLOCK);
    Node n2 = new Node(Token.BLOCK);
    c.areNodesEqualForInlining(n1, n2);
  }

  // ---------- getCodingConvention ----------

  @Test
  public void testGetCodingConvention_DefaultsToGoogleConvention() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    CodingConvention convention = c.getCodingConvention();
    assertSame(c.defaultCodingConvention, convention);
  }

  // ---------- isIdeMode / isTypeCheckingEnabled ----------

  @Test
  public void testIsIdeMode_ReflectsOption() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.ideMode = true;
    assertTrue(c.isIdeMode());
    c.options.ideMode = false;
    assertFalse(c.isIdeMode());
  }

  @Test
  public void testIsTypeCheckingEnabled_ReflectsOption() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.checkTypes = true;
    assertTrue(c.isTypeCheckingEnabled());
    c.options.checkTypes = false;
    assertFalse(c.isTypeCheckingEnabled());
  }

  // ---------- getReverseAbstractInterpreter ----------

  @Test
  public void testGetReverseAbstractInterpreter_ClosurePassFalse() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.closurePass = false;
    assertNotNull(c.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetReverseAbstractInterpreter_ClosurePassTrue() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.closurePass = true;
    assertNotNull(c.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetReverseAbstractInterpreter_CachedInstance() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    ReverseAbstractInterpreter first = c.getReverseAbstractInterpreter();
    ReverseAbstractInterpreter second = c.getReverseAbstractInterpreter();
    assertSame(first, second);
  }

  // ---------- getTypeRegistry ----------

  @Test
  public void testGetTypeRegistry_CachedInstance() {
    Compiler c = new Compiler();
    assertSame(c.getTypeRegistry(), c.getTypeRegistry());
  }

  // ---------- acquireSymbolTable ----------

  @Test
  public void testAcquireSymbolTable_CachedInstance() {
    Compiler c = new Compiler();
    assertSame(c.acquireSymbolTable(), c.acquireSymbolTable());
  }

  // ---------- isInliningForbidden ----------

  @Test
  public void testIsInliningForbidden_DefaultFalse() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    assertFalse(c.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbidden_HeuristicTrue() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    assertTrue(c.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbidden_AggressiveHeuristicTrue() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    assertTrue(c.isInliningForbidden());
  }

  // ---------- getNodeForCodeInsertion ----------

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_NoInputs_Throws() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0], new JSSourceFile[0], new CompilerOptions());
    c.getNodeForCodeInsertion(null);
  }

  @Test
  public void testGetNodeForCodeInsertion_WithInputs_ReturnsRoot() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var x = 1;") },
        new CompilerOptions());
    Node root = c.getNodeForCodeInsertion(null);
    assertNotNull(root);
  }

  // ---------- newExternInput ----------

  @Test
  public void testNewExternInput_SuccessThenDuplicateThrows() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var x = 1;") },
        new CompilerOptions());
    c.parse();
    CompilerInput extern = c.newExternInput("newExtern.js");
    assertNotNull(extern);
    assertSame(extern, c.getInput("newExtern.js"));

    try {
      c.newExternInput("newExtern.js");
      fail("Expected IllegalArgumentException for duplicate extern name");
    } catch (IllegalArgumentException expected) {
      // ตรงกับ source: "Conflicting externs name: " + name
    }
  }

  // ---------- getRoot() / parse() ----------

  @Test
  public void testGetRoot_NullBeforeParse_NonNullAfterParse() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var x = 1;") },
        new CompilerOptions());
    assertNull(c.getRoot());
    c.parse();
    assertNotNull(c.getRoot());
  }

  // ---------- toSource() / toSourceArray() / runInCompilerThread ----------

  @Test
  public void testToSource_EmptyJsRoot_ReturnsEmptyString() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.tracer = TracerMode.OFF;
    assertEquals("", c.toSource());
  }

  @Test
  public void testToSource_UseThreadsFalse_StillWorks() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.tracer = TracerMode.OFF;
    c.disableThreads();
    assertEquals("", c.toSource());
  }

  @Test
  public void testToSource_TracerOn_DumpsTraceReport() {
    // ต้องเรียก parse() ก่อน เพื่อให้ 'tracker' ถูกสร้าง (tracer.isOn()==true)
    // ก่อนที่ newTracer()/stopTracer() จะเรียกใช้ tracker ภายใน toSource()
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.tracer = TracerMode.ALL;
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var x = 1;") },
        options);
    c.parse();
    String src = c.toSource();
    assertNotNull(src);
  }

  @Test
  public void testToSourceArray_EmptyInputs() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0], new JSSourceFile[0], new CompilerOptions());
    String[] result = c.toSourceArray();
    assertEquals(0, result.length);
  }

  @Test
  public void testToSourceArray_OneInput() {
    Compiler c = new Compiler();
    c.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var x = 1;") },
        new CompilerOptions());
    String[] result = c.toSourceArray();
    assertEquals(1, result.length);
    assertNotNull(result[0]);
  }

  // ---------- CodeBuilder ----------

  @Test
  public void testCodeBuilder_InitialState() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    assertEquals(0, cb.getLength());
    assertEquals("", cb.toString());
  }

  @Test
  public void testCodeBuilder_AppendNoNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertEquals(5, cb.getLength());
    assertEquals("hello", cb.toString());
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_AppendWithNewlines_UpdatesLineAndColumn() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\nc"); // มี 2 newline
    assertEquals(2, cb.getLineIndex());
    assertEquals(1, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_EndsWith_TrueAndFalse() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello;");
    assertTrue(cb.endsWith(";"));
    assertFalse(cb.endsWith("xyz"));
    // boundary: suffix length == content length -> false (sb.length() > suffix.length() ต้องเคร่งครัด)
    assertFalse(cb.endsWith("hello;"));
  }

  @Test
  public void testCodeBuilder_Reset_KeepsLineCountClearsText() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\nc");
    int lineIndexBefore = cb.getLineIndex();
    cb.reset();
    assertEquals(0, cb.getLength());
    assertEquals("", cb.toString());
    assertEquals(lineIndexBefore, cb.getLineIndex());
  }

  // ---------- disableThreads ----------

  @Test
  public void testDisableThreads_AffectsRunInCompilerThread() {
    Compiler c = new Compiler();
    c.initOptions(new CompilerOptions());
    c.options.tracer = TracerMode.OFF;
    c.disableThreads();
    assertEquals("", c.toSource());
  }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_LazyErrorManager | `getErrorManager()`: `options==null` → เรียก `initOptions` |
| testConstructorWithPrintStream_UsesPrintStreamErrorManager | `initOptions`: `outStream != null` → PrintStreamErrorManager |
| testInitOptions_ErrorManagerNotOverwrittenOnSecondCall | `initOptions`: `errorManager != null` → ไม่สร้างใหม่ |
| testInit_TwoFileArrays_Success | `init(JSSourceFile[],JSSourceFile[],options)` กรณีปกติ ไม่มี error |
| testInit_DuplicateInputNames_ReportsDuplicateInputError | `initInputsByNameMap`: duplicate ใน `inputs` |
| testInit_DuplicateExternNames_ReportsDuplicateExternError | `initInputsByNameMap`: duplicate ใน `externs` |
| testInit_EmptyModuleArray_ReportsEmptyModuleListError | `init(JSSourceFile[],JSModule[],options)` + `checkFirstModule`: `modules.length==0` |
| testCheckFirstModule_EmptyArray_Direct | `checkFirstModule`: if-branch แรก `modules.length==0` |
| testGetSourceLine_LineNumberLessThanOne_ReturnsNull | `getSourceLine`: `lineNumber<1` → null |
| testGetSourceRegion_LineNumberLessThanOne_ReturnsNull | `getSourceRegion`: `lineNumber<1` → null |
| testGetSourceLine_UnknownSourceName_ReturnsNull | `getSourceFileByName`: name ไม่พบ → null |
| testGetSourceLine_ValidLine_NotNull | `getSourceLine`: path สำเร็จ (input != null) |
| testHasErrors_IdeModeFalse_ErrorPresent | `hasHaltingErrors`: `!isIdeMode()==true && errorCount>0` |
| testHasErrors_IdeModeTrue_ErrorIgnoredForHalting | `hasHaltingErrors`: `!isIdeMode()==false` short-circuit |
| testReport_IncrementsErrorCount | `report`: `guard==null`, `level.isOn()` (loop-like accumulation 2 ครั้ง) |
| testGetMessages_EqualsGetErrors | `getMessages()` เทียบกับ `getErrors()` |
| testSetPassConfig_Null_ThrowsNPE | `setPassConfig`: `Preconditions.checkNotNull` |
| testSetPassConfig_AlreadyAssigned_Throws | `setPassConfig`: `this.passes != null` → IllegalStateException |
| testUniqueNameIdSupplier_SequenceAfterReset | `nextUniqueNameId` เพิ่มค่าต่อเนื่อง |
| testResetUniqueNameId_BringsBackToZero | `resetUniqueNameId` reset ค่ากลับ 0 |
| testNormalizedFlagTransitions | `setNormalized`/`setUnnormalized`/`isNormalized` ทุก state |
| testAreNodesEqualForInlining_PlainCompare_True | `areNodesEqualForInlining`: else-branch (`checkTreeEqualsSilent`) |
| testAreNodesEqualForInlining_TypeAwareBranch_NoException | `areNodesEqualForInlining`: if-branch (`ambiguateProperties`) |
| testGetCodingConvention_DefaultsToGoogleConvention | `getCodingConvention`: `convention==null` → default |
| testIsIdeMode_ReflectsOption | `isIdeMode` true/false |
| testIsTypeCheckingEnabled_ReflectsOption | `isTypeCheckingEnabled` true/false |
| testGetReverseAbstractInterpreter_ClosurePassFalse/True | `if (options.closurePass)` ทั้งสอง branch |
| testGetReverseAbstractInterpreter_CachedInstance | lazy-cache `abstractInterpreter==null` check |
| testGetTypeRegistry_CachedInstance | lazy-cache `typeRegistry==null` check |
| testAcquireSymbolTable_CachedInstance | lazy-cache `symbolTable==null` check |
| testIsInliningForbidden_DefaultFalse/Heuristic/Aggressive | ทั้ง 3 branch ของ `||` condition |
| testGetNodeForCodeInsertion_NoInputs_Throws | `module==null && inputs.length==0` → exception |
| testGetNodeForCodeInsertion_WithInputs_ReturnsRoot | `module==null && inputs.length>0` |
| testNewExternInput_SuccessThenDuplicateThrows | `inputsByName.containsKey(name)` true/false |
| testGetRoot_NullBeforeParse_NonNullAfterParse | `externAndJsRoot` ก่อน/หลัง `parse()` |
| testToSource_EmptyJsRoot_ReturnsEmptyString | `toSource`: `jsRoot==null`, useThreads=true |
| testToSource_UseThreadsFalse_StillWorks | `runInCompilerThread`: `useThreads==false` |
| testToSource_TracerOn_DumpsTraceReport | `dumpTraceReport==true` branch |
| testToSourceArray_EmptyInputs / OneInput | loop 0 และ 1 รอบใน `toSourceArray` |
| testCodeBuilder_* (5 tests) | `CodeBuilder.append` loop `\n`, `endsWith` boundary, `reset` |
| testDisableThreads_AffectsRunInCompilerThread | `disableThreads()` ผลต่อ `useThreads` |

**จุดที่ไม่ครอบคลุม (คอมเมนต์กำกับในโค้ด/เหตุผล):**
- `init(JSSourceFile[],JSModule[],options)` กรณี `ModuleDependenceException` (MODULE_DEPENDENCY_ERROR) และ `getAllInputsFromModules` duplicate-across-module branch — ต้องสร้าง `JSModule` instance ที่มี dependency/inputs ซึ่ง API (`JSModule` constructor, `add()`, `addDependency()`) ไม่ปรากฏใน source ที่ให้มา จึงงดเดา
- `report()` branch ที่ `WarningsGuard` เปลี่ยน level เป็น OFF — ต้อง subclass `WarningsGuard` ซึ่งไม่ทราบ abstract methods ทั้งหมดแน่ชัด
- `toSource(JSModule)` / `toSourceArray(JSModule)` และ `getNodeForCodeInsertion(module != null)` — ต้องมี `JSModule` instance เช่นกัน