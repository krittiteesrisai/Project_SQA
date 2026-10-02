# CompilerTest.java

**หมายเหตุสำคัญก่อนโค้ด:**
- คลาส `Compiler` มีสมาชิกจำนวนมากเป็น `private`/`package-private` ผมจึงวาง test class ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) เพื่อให้เข้าถึง field/method เหล่านั้นได้จริง (ตรงกับแนวทางที่ Defects4J ใช้กับคลาสนี้) และยังคง `import` คลาสเป้าหมายไว้ตามข้อกำหนด (ถึงจะซ้ำซ้อนเพราะอยู่ package เดียวกัน แต่ compile ได้ไม่มี error)
- บาง API เช่น `CompilerOptions.setLanguageIn(...)`, `PropertyRenamingPolicy.{OFF,HEURISTIC,AGGRESSIVE_HEURISTIC}` ไม่ได้ปรากฏ signature ตรง ๆ ในซอร์สที่ให้มา (เห็นแค่การเรียกใช้แบบ getter/field) — ผมอนุมานจาก pattern การใช้งานในซอร์สโค้ดที่ให้มาเท่านั้น (เช่น `options.getLanguageIn()`, `options.propertyRenaming == PropertyRenamingPolicy.HEURISTIC`) และคอมเมนต์กำกับไว้ในโค้ดว่าเป็นข้อสันนิษฐานจาก pattern ที่เห็น ไม่ได้เดา behavior ใหม่ที่ไม่มีใน source

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
// import คลาสเป้าหมายตามข้อกำหนด (ซ้ำซ้อนเพราะอยู่ package เดียวกัน แต่ยังคง compile ได้)
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for {@link Compiler}.
 *
 * หมายเหตุ: บาง API ของ CompilerOptions / PropertyRenamingPolicy ไม่ได้แสดง signature
 * ตรง ๆ ในซอร์สโค้ดที่ให้มา (เห็นแต่การใช้งานผ่าน getter/field) ผมอนุมานชื่อ method/field
 * จาก pattern การเรียกใช้ในคลาส Compiler เอง เช่น options.getLanguageIn(),
 * options.propertyRenaming, options.ideMode ซึ่งใช้แบบ field ตรง ๆ ในซอร์สต้นฉบับ
 */
public class CompilerTest {

  // ---------------------------------------------------------------------
  // CodeBuilder (static nested class) - ทดสอบ pure logic แยกเดี่ยว
  // ---------------------------------------------------------------------

  @Test
  public void testCodeBuilderAppendAndToString() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertEquals("hello", cb.toString());
    assertEquals(5, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilderAppendWithSingleNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2");
    assertEquals(1, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex()); // "line2".length()
  }

  @Test
  public void testCodeBuilderAppendWithMultipleNewlines() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\nc");
    assertEquals(2, cb.getLineIndex());
    assertEquals(1, cb.getColumnIndex()); // "c".length()
  }

  @Test
  public void testCodeBuilderResetKeepsLineCount() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2");
    cb.reset();
    assertEquals("", cb.toString());
    assertEquals(0, cb.getLength());
    // ตาม javadoc: reset() ล้างข้อความ แต่ lineCount ไม่เปลี่ยน
    assertEquals(1, cb.getLineIndex());
  }

  @Test
  public void testCodeBuilderEndsWithTrueAndFalseCase() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello world");
    assertTrue(cb.endsWith("world"));
    assertFalse(cb.endsWith("xyz"));
  }

  @Test
  public void testCodeBuilderEndsWithExactLengthReturnsFalse() {
    // Boundary: เงื่อนไขใช้ sb.length() > suffix.length() (strict '>')
    // ดังนั้นถ้า suffix ยาวเท่ากับ buffer ทั้งหมด จะได้ false เสมอ
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("ab");
    assertFalse(cb.endsWith("ab"));
  }

  // ---------------------------------------------------------------------
  // setErrorManager - null check
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetErrorManagerNullThrowsNPE() {
    Compiler compiler = new Compiler();
    compiler.setErrorManager(null);
  }

  @Test
  public void testGetErrorManagerAutoInitializesWhenOptionsNull() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler.getErrorManager());
  }

  // ---------------------------------------------------------------------
  // getErrorLevel - Preconditions.checkNotNull(options)
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testGetErrorLevelWithoutInitOptionsThrowsNPE() {
    Compiler compiler = new Compiler();
    JSError error = JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b");
    compiler.getErrorLevel(error);
  }

  // ---------------------------------------------------------------------
  // resetUniqueNameId / getUniqueNameIdSupplier
  // ---------------------------------------------------------------------

  @Test
  public void testResetUniqueNameIdAndSupplierSequence() {
    Compiler compiler = new Compiler();
    compiler.resetUniqueNameId();
    Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------------------------------------------------------------------
  // acceptEcmaScript5 - switch on languageIn
  // ---------------------------------------------------------------------

  @Test
  public void testAcceptEcmaScript5TrueForEs5() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptEcmaScript5TrueForEs5Strict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
    compiler.initOptions(options);
    assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptEcmaScript5FalseForEs3() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    assertFalse(compiler.acceptEcmaScript5());
  }

  // ---------------------------------------------------------------------
  // isInliningForbidden - HEURISTIC / AGGRESSIVE_HEURISTIC / else
  // ---------------------------------------------------------------------

  @Test
  public void testIsInliningForbiddenTrueForHeuristic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    compiler.initOptions(options);
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbiddenTrueForAggressiveHeuristic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    compiler.initOptions(options);
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbiddenFalseForOff() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.OFF;
    compiler.initOptions(options);
    assertFalse(compiler.isInliningForbidden());
  }

  // ---------------------------------------------------------------------
  // getSourceLine / getSourceRegion - boundary lineNumber < 1, unknown name
  // ---------------------------------------------------------------------

  @Test
  public void testGetSourceLineBoundaryAndLookup() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile input = JSSourceFile.fromCode("foo.js", "var x = 1;\nvar y = 2;\n");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { input }, options);

    // boundary: lineNumber < 1 -> null
    assertNull(compiler.getSourceLine("foo.js", 0));
    assertNull(compiler.getSourceLine("foo.js", -1));

    // unknown source name -> null
    assertNull(compiler.getSourceLine("unknown.js", 1));

    // valid lookup
    assertEquals("var x = 1;", compiler.getSourceLine("foo.js", 1));
    assertEquals("var y = 2;", compiler.getSourceLine("foo.js", 2));
  }

  @Test
  public void testGetSourceRegionBoundaryAndLookup() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile input = JSSourceFile.fromCode("foo.js", "var x = 1;\nvar y = 2;\n");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { input }, options);

    assertNull(compiler.getSourceRegion("foo.js", 0));
    assertNull(compiler.getSourceRegion("unknown.js", 1));
    assertNotNull(compiler.getSourceRegion("foo.js", 1));
  }

  // ---------------------------------------------------------------------
  // hasErrors() / hasHaltingErrors() - ideMode branch
  // ---------------------------------------------------------------------

  @Test
  public void testHasErrorsFalseWhenIdeModeTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertTrue(compiler.getErrorCount() > 0);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testHasErrorsTrueWhenIdeModeFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = false;
    compiler.initOptions(options);
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertTrue(compiler.getErrorCount() > 0);
    assertTrue(compiler.hasErrors());
  }

  // ---------------------------------------------------------------------
  // setPassConfig - null check / double-assign check
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfigNullThrowsNPE() {
    Compiler compiler = new Compiler();
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfigTwiceThrowsIllegalState() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.getPassConfig(); // ทำให้ this.passes ถูก assign ไปแล้วรอบแรก
    compiler.setPassConfig(new DefaultPassConfig(compiler.getOptions()));
  }

  // ---------------------------------------------------------------------
  // checkFirstModule / fillEmptyModules (ผ่าน initModules)
  // ---------------------------------------------------------------------

  @Test
  public void testInitModulesEmptyModuleListReportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(); // empty
    compiler.initModules(externs, modules, options);
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testInitModulesEmptyRootModuleWithMultipleModulesReportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();
    JSModule m1 = new JSModule("m1"); // empty root module
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("b.js", "var b=1;"));
    List<JSModule> modules = Lists.newArrayList(m1, m2);
    compiler.initModules(externs, modules, options);
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testInitModulesSingleEmptyModuleAllowedAndFilled() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();
    JSModule m1 = new JSModule("onlyModule"); // empty แต่มีโมดูลเดียว
    List<JSModule> modules = Lists.newArrayList(m1);
    compiler.initModules(externs, modules, options);
    assertEquals(0, compiler.getErrorCount());
    // fillEmptyModules เติม placeholder ให้ 1 input
    assertEquals(1, compiler.getInputsForTesting().size());
  }

  @Test
  public void testInitModulesNoErrorWhenFirstModuleNonEmpty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("b.js", "var b=1;"));
    List<JSModule> modules = Lists.newArrayList(m1, m2);
    compiler.initModules(externs, modules, options);
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // initInputsByNameMap - duplicate detection (loop + if/else)
  // ---------------------------------------------------------------------

  @Test
  public void testDuplicateInputNamesReportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m");
    module.add(JSSourceFile.fromCode("dup.js", "var a=1;"));
    module.add(JSSourceFile.fromCode("dup.js", "var b=2;")); // same name -> duplicate
    compiler.init(new JSSourceFile[0], new JSModule[] { module }, options);
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testDuplicateExternNamesReportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("dupExtern.js", ""),
        JSSourceFile.fromCode("dupExtern.js", "")
    };
    compiler.init(externs,
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a=1;") }, options);
    assertTrue(compiler.getErrorCount() > 0);
  }

  // ---------------------------------------------------------------------
  // rebuildInputsFromModules
  // ---------------------------------------------------------------------

  @Test
  public void testRebuildInputsFromModulesReflectsNewInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m");
    module.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    compiler.init(new JSSourceFile[0], new JSModule[] { module }, options);
    assertEquals(1, compiler.getInputsForTesting().size());

    module.add(JSSourceFile.fromCode("b.js", "var b=1;"));
    compiler.rebuildInputsFromModules();
    assertEquals(2, compiler.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------------
  // newExternInput - duplicate name -> IllegalArgumentException
  // ---------------------------------------------------------------------

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInputDuplicateThrowsIllegalArgument() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a=1;") }, options);
    // ต้องเรียก parse() ก่อน เพื่อให้ externsRoot ถูกสร้าง (newExternInput ใช้ externsRoot)
    compiler.parse();
    compiler.newExternInput("myExtern");
    compiler.newExternInput("myExtern"); // duplicate -> throw
  }

  // ---------------------------------------------------------------------
  // removeInput - unknown name -> no-op (input == null branch)
  // ---------------------------------------------------------------------

  @Test
  public void testRemoveInputUnknownNameIsNoOp() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a=1;") }, options);
    compiler.removeInput("doesNotExist.js"); // ไม่ควร throw
  }

  // ---------------------------------------------------------------------
  // getNodeForCodeInsertion - module null / empty module / non-empty module
  // ---------------------------------------------------------------------

  @Test
  public void testGetNodeForCodeInsertionNullModuleReturnsFirstInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("a.js", "var a=1;") }, options);
    Node node = compiler.getNodeForCodeInsertion(null);
    assertNotNull(node);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertionNoInputsThrows() throws Exception {
    Compiler compiler = new Compiler();
    // ใช้ reflection เซ็ต private field "inputs" ให้เป็น empty list
    // เพื่อจำลองสถานะ "ไม่มี input" โดยไม่ผ่าน fillEmptyModules
    Field f = Compiler.class.getDeclaredField("inputs");
    f.setAccessible(true);
    f.set(compiler, new ArrayList<CompilerInput>());
    compiler.getNodeForCodeInsertion(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertionEmptyModuleThrows() {
    Compiler compiler = new Compiler();
    JSModule emptyModule = new JSModule("empty");
    compiler.getNodeForCodeInsertion(emptyModule);
  }

  @Test
  public void testGetNodeForCodeInsertionWithNonEmptyModuleReturnsInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSModule module = new JSModule("m1");
    module.add(JSSourceFile.fromCode("x.js", "var x=1;"));
    Node node = compiler.getNodeForCodeInsertion(module);
    assertNotNull(node);
  }

  // ---------------------------------------------------------------------
  // disableThreads
  // ---------------------------------------------------------------------

  @Test
  public void testDisableThreadsSetsFieldToFalse() throws Exception {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    Field f = Compiler.class.getDeclaredField("useThreads");
    f.setAccessible(true);
    assertFalse((Boolean) f.get(compiler));
  }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCodeBuilderAppendAndToString` | `CodeBuilder.append` กรณีไม่มี `\n` (else branch: `lastIndex == -1`) |
| `testCodeBuilderAppendWithSingleNewline` | `CodeBuilder.append` กรณีมี `\n` 1 ครั้ง (if branch loop เข้า 1 รอบ) |
| `testCodeBuilderAppendWithMultipleNewlines` | loop `while` เข้าหลายรอบ (นับ `lineCount` สะสม) |
| `testCodeBuilderResetKeepsLineCount` | `reset()` ล้าง `sb` แต่ `lineCount` คงเดิม |
| `testCodeBuilderEndsWithTrueAndFalseCase` | `endsWith` true/false ปกติ |
| `testCodeBuilderEndsWithExactLengthReturnsFalse` | boundary: `sb.length() > suffix.length()` เป็น false เมื่อยาวเท่ากัน |
| `testSetErrorManagerNullThrowsNPE` | null check ใน `setErrorManager` |
| `testGetErrorManagerAutoInitializesWhenOptionsNull` | `getErrorManager()` เมื่อ `options == null` (if branch) |
| `testGetErrorLevelWithoutInitOptionsThrowsNPE` | `Preconditions.checkNotNull(options)` ใน `getErrorLevel` |
| `testResetUniqueNameIdAndSupplierSequence` | `resetUniqueNameId()` + `nextUniqueNameId()` เพิ่มค่าต่อเนื่อง |
| `testAcceptEcmaScript5TrueForEs5` | `switch` case `ECMASCRIPT5` → true |
| `testAcceptEcmaScript5TrueForEs5Strict` | `switch` case `ECMASCRIPT5_STRICT` → true |
| `testAcceptEcmaScript5FalseForEs3` | `switch` default → false |
| `testIsInliningForbiddenTrueForHeuristic` | `propertyRenaming == HEURISTIC` → true |
| `testIsInliningForbiddenTrueForAggressiveHeuristic` | `propertyRenaming == AGGRESSIVE_HEURISTIC` → true |
| `testIsInliningForbiddenFalseForOff` | else branch → false |
| `testGetSourceLineBoundaryAndLookup` | `lineNumber < 1` (boundary), `input == null` (unknown name), lookup ปกติ |
| `testGetSourceRegionBoundaryAndLookup` | เช่นเดียวกันกับ `getSourceLine` แต่สำหรับ `getSourceRegion` |
| `testHasErrorsFalseWhenIdeModeTrue` | `hasHaltingErrors()`: `!isIdeMode()` เป็น false |
| `testHasErrorsTrueWhenIdeModeFalse` | `hasHaltingErrors()`: `!isIdeMode() && errorCount>0` เป็น true |
| `testSetPassConfigNullThrowsNPE` | null check ใน `setPassConfig` |
| `testSetPassConfigTwiceThrowsIllegalState` | `this.passes != null` → throw `IllegalStateException` |
| `testInitModulesEmptyModuleListReportsError` | `checkFirstModule`: `modules.isEmpty()` true |
| `testInitModulesEmptyRootModuleWithMultipleModulesReportsError` | `checkFirstModule`: else-if (`module0 empty && size>1`) true |
| `testInitModulesSingleEmptyModuleAllowedAndFilled` | else-if false (size==1) + `fillEmptyModules` if-branch |
| `testInitModulesNoErrorWhenFirstModuleNonEmpty` | else-if false (module0 ไม่ empty) |
| `testDuplicateInputNamesReportsError` | `initInputsByNameMap` loop inputs: `containsKey` true → report duplicate |
| `testDuplicateExternNamesReportsError` | `initInputsByNameMap` loop externs: `containsKey` true → report duplicate |
| `testRebuildInputsFromModulesReflectsNewInput` | `rebuildInputsFromModules()` อัปเดต inputs ใหม่ |
| `testNewExternInputDuplicateThrowsIllegalArgument` | `newExternInput`: `inputsByName.containsKey(name)` true → throw |
| `testRemoveInputUnknownNameIsNoOp` | `removeInput`: `input == null` → return ทันที |
| `testGetNodeForCodeInsertionNullModuleReturnsFirstInput` | `module == null`, `inputs` ไม่ empty |
| `testGetNodeForCodeInsertionNoInputsThrows` | `module == null`, `inputs.isEmpty()` true → throw |
| `testGetNodeForCodeInsertionEmptyModuleThrows` | `module != null`, `moduleInputs.size() == 0` → throw |
| `testGetNodeForCodeInsertionWithNonEmptyModuleReturnsInput` | `module != null`, `moduleInputs.size() > 0` |
| `testDisableThreadsSetsFieldToFalse` | `disableThreads()` ตั้งค่า `useThreads=false` |

**ข้อจำกัดที่ยอมรับ:** บาง path ที่ลึกมาก (เช่น `parseInputs()` ทั้งหมด, `compile()`/`compileInternal()` แบบ end-to-end, `areNodesEqualForInlining` กับ typed node, multi-thread path ของ `runCallable`) ไม่ได้ทดสอบละเอียดเพราะต้องพึ่งพา infrastructure ภายนอกจำนวนมาก (parser, type system) ที่ไม่มีอยู่ในซอร์สที่ให้มาให้ยืนยัน behavior ได้ชัดเจน จึงเลือกไม่เขียนเทสที่ต้อง “เดา” ผลลัพธ์ตามข้อกำหนดที่ 4