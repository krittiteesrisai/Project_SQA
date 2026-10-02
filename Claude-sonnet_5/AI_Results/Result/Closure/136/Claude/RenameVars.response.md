# วิเคราะห์และแนวทาง

`RenameVars` เป็นคลาส `package-private` ที่พึ่งพา infrastructure ภายในของ Closure Compiler เป็นอย่างมาก (`Compiler`, `Node`, `Scope`, `NodeTraversal`, `VariableMap`, `NameGenerator` ฯลฯ) ซึ่ง**ไม่ได้อยู่ในซอร์สที่ให้มา** ดังนั้นเพื่อไม่ "เดา behavior" ของ dependency เหล่านี้ (ตามข้อ 4) ผมจึงออกแบบเทสให้แบ่งเป็น 2 กลุ่ม:

1. **Unit test ระดับ constructor (ล้วนมาจากซอร์สที่ให้มาโดยตรง)** — ใช้ reflection ตรวจ field `prefix`, `reservedNames` ตาม ternary/if-else ในคอนสตรัคเตอร์ ไม่ต้องพึ่ง Compiler/Node เลย จึง **deterministic 100%**
2. **Integration test ผ่าน `CompilerTestCase`** (utility test-class มาตรฐานของโปรเจกต์ Closure Compiler เอง อยู่ใน package เดียวกัน — **สมมติฐาน**: คลาสนี้ถูกคอมไพล์อยู่ใน test-classpath ของโปรเจกต์อยู่แล้ว ไม่ใช่ jar ภายนอกตามที่ระบุ) เพื่อรัน `process()` จริงผ่าน AST ที่ parse มา

เพื่อเลี่ยงการเดาพฤติกรรมของ `NameGenerator` (ไม่มีซอร์สให้) ผมเลือก **ใช้ `generatePseudoNames = true` เป็นหลัก** เพราะสูตร pseudo name (`'$' + s + "$$"`) ถูกกำหนดตายตัวในซอร์สที่ให้มา ทำให้ output คาดเดาได้แน่นอนโดยไม่ต้องรู้ NameGenerator จริง ส่วนกรณีที่ทดสอบ `prevUsedRenameMap` แบบ exact-match ก็ deterministic เพราะ `finalizeNameAssignment` ใส่ค่า string ที่เรากำหนดเองตรง ๆ

จุดที่ไม่มีข้อมูลพอ (เช่น `NodeUtil.isAnonymousFunction`, `CodingConvention.isExported`, NameGenerator การเลือกอักขระจริง) จะ**คอมเมนต์กำกับ**ไว้ชัดเจนว่าไม่ยืนยัน behavior

```java
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * หมายเหตุ/สมมติฐานสำคัญ (ตามข้อกำหนดที่ 4 ห้ามเดา behavior ที่ไม่มีในซอร์ส):
 *
 * 1) RenameVars เป็น package-private และพึ่งพา Compiler, Node, Scope,
 *    NodeTraversal, VariableMap ซึ่งเป็นส่วนหนึ่งของโปรเจกต์ Closure Compiler เอง
 *    (ไม่ใช่ jar ภายนอกตามรายการที่กำหนด) จึงถือว่าคลาสเหล่านี้ถูกคอมไพล์รวมอยู่แล้ว
 *    ในซอร์ส/เทสของโปรเจกต์ (ตรงกับ Defects4J Closure-136b)
 * 2) ใช้ CompilerTestCase (test-utility มาตรฐานของโปรเจกต์นี้เอง มี constructor
 *    รับ externs string, มี method test(String,String)/testSame(String) และ
 *    getProcessor(Compiler) แบบ JUnit3-style TestCase) เพื่อ parse+รัน process()
 *    จริง — ถ้าสิ่งแวดล้อมจริงไม่มีคลาสนี้ ต้องปรับให้ parse ด้วยกลไกอื่นของ Compiler
 * 3) เพื่อไม่เดาพฤติกรรมของ NameGenerator (ไม่มีซอร์สให้) ใช้ generatePseudoNames=true
 *    เป็นหลัก เพราะสูตร '$' + s + "$$" ถูกกำหนดตายตัวในซอร์สของ RenameVars เอง
 * 4) NodeUtil.isAnonymousFunction และ CodingConvention.isExported ไม่มีซอร์สให้
 *    จึงไม่ยืนยัน branch ที่เป็น true ของเงื่อนไขเหล่านี้ (คอมเมนต์กำกับไว้ในแต่ละเทส)
 */
public final class RenameVarsTest extends CompilerTestCase {

  private boolean localRenamingOnly;
  private boolean preserveAnonymousFunctionNames;
  private boolean generatePseudoNames;
  private VariableMap prevUsedRenameMap;
  private char[] reservedCharacters;
  private Set<String> reservedNamesSet;
  private String prefix;

  public RenameVarsTest() {
    // externs สำหรับทดสอบ branch isExternsPass_ / externNames
    super("var ExternalName;");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    localRenamingOnly = false;
    preserveAnonymousFunctionNames = false;
    generatePseudoNames = false;
    prevUsedRenameMap = null;
    reservedCharacters = null;
    reservedNamesSet = null;
    prefix = "";
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        RenameVars renameVars = new RenameVars(
            compiler,
            prefix,
            localRenamingOnly,
            preserveAnonymousFunctionNames,
            generatePseudoNames,
            prevUsedRenameMap,
            reservedCharacters,
            reservedNamesSet);
        renameVars.process(externs, root);
      }
    };
  }

  // ======================================================================
  // กลุ่ม 1: ทดสอบคอนสตรัคเตอร์แบบ pure unit (ไม่ต้องพึ่ง Compiler/Node เลย)
  // อ้างอิงจากซอร์สโค้ดที่ให้มาโดยตรง 100%
  // ======================================================================

  @Test
  public void testConstructor_NullPrefixDefaultsToEmptyString() throws Exception {
    RenameVars rv = new RenameVars(
        null, null, false, false, false, null, null, null);
    Field prefixField = RenameVars.class.getDeclaredField("prefix");
    prefixField.setAccessible(true);
    assertEquals("", prefixField.get(rv));
  }

  @Test
  public void testConstructor_NonNullPrefixIsKeptAsIs() throws Exception {
    RenameVars rv = new RenameVars(
        null, "pre_", false, false, false, null, null, null);
    Field prefixField = RenameVars.class.getDeclaredField("prefix");
    prefixField.setAccessible(true);
    assertEquals("pre_", prefixField.get(rv));
  }

  @Test
  public void testConstructor_NullReservedNamesDefaultsToEmptySet() throws Exception {
    RenameVars rv = new RenameVars(
        null, "", false, false, false, null, null, null);
    Field f = RenameVars.class.getDeclaredField("reservedNames");
    f.setAccessible(true);
    Set<?> reserved = (Set<?>) f.get(rv);
    assertNotNull(reserved);
    assertTrue(reserved.isEmpty());
  }

  @Test
  public void testConstructor_NonNullReservedNamesIsCopiedNotAliased() throws Exception {
    Set<String> input = new HashSet<String>();
    input.add("foo");
    input.add("bar");
    RenameVars rv = new RenameVars(
        null, "", false, false, false, null, null, input);
    Field f = RenameVars.class.getDeclaredField("reservedNames");
    f.setAccessible(true);
    Set<?> reserved = (Set<?>) f.get(rv);
    assertEquals(2, reserved.size());
    assertTrue(reserved.contains("foo"));
    assertTrue(reserved.contains("bar"));

    // ตรวจว่าเป็น copy (Sets.newHashSet(reservedNames)) ไม่ใช่การอ้างอิง set เดิม
    input.add("baz");
    assertFalse("reservedNames ควรเป็นสำเนา ไม่ควรถูกกระทบจากการแก้ input เดิม",
        reserved.contains("baz"));
  }

  // ======================================================================
  // กลุ่ม 2: ทดสอบ process()/visit() ผ่าน CompilerTestCase
  // ======================================================================

  /** boundary: ไม่มีตัวแปรเลย -> globalNameNodes/localNameNodes ว่าง, changed=false */
  public void testEmptyProgram_NoOp() {
    testSame("");
  }

  /**
   * name.length()==0 branch: anonymous function expression ที่ไม่มีชื่อใด ๆ
   * เกี่ยวข้อง และไม่มีตัวแปรอื่นในโปรแกรม -> ไม่ควรมีการเปลี่ยนแปลงใด ๆ
   */
  public void testAnonymousFunctionExpressionName_Skipped() {
    testSame("(function(){return 1;})();");
  }

  /** global rename พื้นฐาน: branch (local==false && var!=null) -> incCount+globalNameNodes */
  public void testRenameGlobalVariables_WithPseudoNames() {
    generatePseudoNames = true;
    test("var xxx = 1; var yyy = 2; xxx = xxx + yyy;",
         "var $xxx$$ = 1; var $yyy$$ = 2; $xxx$$ = $xxx$$ + $yyy$$;");
  }

  /** local rename พื้นฐาน: branch (local==true) -> incCount(tempName) + localNameNodes */
  public void testRenameLocalVariables_WithPseudoNames() {
    generatePseudoNames = true;
    test("function foo(bar) { return bar; }",
         "function $foo$$($bar$$) { return $bar$$; }");
  }

  /** localRenamingOnly=true, global var: branch (!local && localRenamingOnly) -> reserve+return */
  public void testLocalRenamingOnly_GlobalVarNotRenamed() {
    localRenamingOnly = true;
    testSame("var globalVar = 1;");
  }

  /** localRenamingOnly=true, local var ยังถูก rename ตามปกติ */
  public void testLocalRenamingOnly_LocalVarStillRenamed() {
    localRenamingOnly = true;
    generatePseudoNames = true;
    test("function foo(bar) { return bar; }",
         "function foo($bar$$) { return $bar$$; }");
  }

  /**
   * preserveAnonymousFunctionNames=true แต่ฟังก์ชันมีชื่อปกติ (ไม่ anonymous)
   * เงื่อนไข (preserve && var!=null && NodeUtil.isAnonymousFunction(...)) ควรเป็น false
   * เพราะฟังก์ชันนี้ถูกประกาศแบบมีชื่อ -> ยัง rename ได้ตามปกติ
   * *หมายเหตุ*: ไม่มีซอร์สของ NodeUtil.isAnonymousFunction จึงไม่ยืนยัน branch
   * ที่เงื่อนไขทั้งหมดเป็น true (ต้องพึ่ง pass NameAnonymousFunctions ที่ไม่ได้ให้มา)
   */
  public void testPreserveAnonymousFunctionNames_NamedFunctionStillRenamed() {
    preserveAnonymousFunctionNames = true;
    generatePseudoNames = true;
    test("function foo() { return 1; }",
         "function $foo$$() { return 1; }");
  }

  /**
   * ตัวแปรที่ประกาศเป็น extern เท่านั้น (ไม่ได้ถูก declare ในไฟล์หลัก) เมื่อถูกใช้ใน
   * source: t.getScope().getVar(name) ในรอบ traverse ของ root (ไม่รวม externs)
   * ควรได้ var==null -> ไม่เข้า branch local หรือ (var!=null) -> ไม่ถูกเก็บเข้า
   * globalNameNodes -> ไม่ถูก rename
   * *หมายเหตุ*: อิงสมมติฐานเรื่อง scope chain ระหว่าง externs/root ตามรูปแบบ
   * 2-pass (isExternsPass_) ที่ปรากฏในซอร์สที่ให้มา
   */
  public void testExternOnlyReference_NotRenamed() {
    testSame("ExternalName = 1;");
  }

  /**
   * FREQUENCY_COMPARATOR: ครอบคลุมทั้งกรณี count ต่างกัน (a1.count != a2.count)
   * และกรณี count เท่ากัน (tie-break ด้วย ORDER_OF_OCCURRENCE_COMPARATOR)
   * ใช้ pseudo names เพื่อไม่ต้องเดาการจัดสรรชื่อจริงจาก NameGenerator
   */
  public void testFrequencyComparator_TieAndDifferentCounts() {
    generatePseudoNames = true;
    test("var a1 = 1; var b1 = 2; var c1 = 3; b1 = b1 + b1;",
         "var $a1$$ = 1; var $b1$$ = 2; var $c1$$ = 3; $b1$$ = $b1$$ + $b1$$;");
  }

  /**
   * prevUsedRenameMap != null -> reusePreviouslyUsedVariableMap():
   * branch reuse สำเร็จสำหรับ global var (ไม่ extern, prevNewName.startsWith(prefix)==true
   * เมื่อ prefix="") -> finalizeNameAssignment ใช้ prevNewName ตรง ๆ (deterministic)
   */
  public void testPrevUsedRenameMap_ExactReuseForGlobalVar() {
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("xxx", "customName");
    prevUsedRenameMap = new VariableMap(map);
    test("var xxx = 1;", "var customName = 1;");
  }

  /**
   * getNewGlobalName(): branch false ของ (a.newName != null && !a.newName.equals(oldName))
   * เมื่อ newName ที่ reuse มาเท่ากับ oldName เดิม -> ไม่มีการแก้ไข Node เลย (deterministic,
   * ไม่ต้องพึ่ง NameGenerator เพราะเรากำหนด mapping เอง)
   */
  public void testGetNewGlobalName_NoOpWhenReusedNameEqualsOldName() {
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("xxx", "xxx");
    prevUsedRenameMap = new VariableMap(map);
    testSame("var xxx = 1;");
  }

  /**
   * getNewLocalName(): branch false ของ (!a.newName.equals(oldTempName))
   * เมื่อ local temp name "L 0" ถูก reuse ด้วยชื่อเดิม "L 0" เอง (ผ่าน prevUsedRenameMap)
   * -> local node ไม่ถูกเปลี่ยนชื่อ ในขณะที่ global "foo" ยังถูก rename ตามปกติ (pseudo)
   * อิงจากค่าคงที่ LOCAL_VAR_PREFIX = "L " และการกำหนด index เริ่มที่ 0 ตามคอมเมนต์
   * ในซอร์สโค้ดต้นฉบับ
   */
  public void testGetNewLocalName_NoOpWhenReusedTempNameEqualsItself() {
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("L 0", "L 0");
    prevUsedRenameMap = new VariableMap(map);
    generatePseudoNames = true;
    test("function foo(bar) { return bar; }",
         "function $foo$$(bar) { return bar; }");
  }

  /**
   * reusePreviouslyUsedVariableMap(): branch (prevNewName == null) -> continue
   * (ตัวแปรไม่มีอยู่ใน prevUsedRenameMap เดิม) ตกไปสู่การ generate ชื่อใหม่ตามปกติ
   * ใช้ pseudo เพื่อยืนยันแค่ว่า flow ผ่าน branch นี้ได้โดยไม่ผัง ไม่ได้พิสูจน์ค่าที่แท้จริง
   * ที่ NameGenerator เลือก (เพราะ pseudo แสดงผลจาก oldName เสมอไม่ขึ้นกับ newName จริง)
   */
  public void testPrevUsedRenameMap_SkippedWhenNameNotInMap() {
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("someOtherName", "z");
    prevUsedRenameMap = new VariableMap(map);
    generatePseudoNames = true;
    test("var yyy = 1;", "var $yyy$$ = 1;");
  }

  /**
   * reusePreviouslyUsedVariableMap(): branch (reservedNames.contains(prevNewName)) -> continue
   * *หมายเหตุ*: เทสนี้พิสูจน์เพียงว่า branch ถูก exercise และไม่ throw exception
   * (branch coverage) แต่ไม่สามารถพิสูจน์ผลลัพธ์จริงว่า "customName" ไม่ถูกใช้
   * เพราะ pseudo-name display ไม่ขึ้นกับค่า newName จริงที่ generator เลือก
   */
  public void testPrevUsedRenameMap_SkippedWhenPrevNameIsReserved() {
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("xxx", "customName");
    prevUsedRenameMap = new VariableMap(map);
    reservedNamesSet = new HashSet<String>();
    reservedNamesSet.add("customName");
    generatePseudoNames = true;
    test("var xxx = 1;", "var $xxx$$ = 1;");
  }

  /**
   * constructor branch: reservedCharacters != null ถูกส่งต่อไปยัง NameGenerator
   * *หมายเหตุ*: ไม่ยืนยันพฤติกรรมจริงของการหลีกเลี่ยงอักขระ (ไม่มีซอร์ส NameGenerator)
   * ทดสอบเพียงว่า pass ยังทำงานได้ตามปกติเมื่อ parameter นี้ไม่เป็น null
   */
  public void testReservedCharacters_ConstructorPassThroughDoesNotBreak() {
    reservedCharacters = new char[] {'a'};
    generatePseudoNames = true;
    test("var xxx = 1;", "var $xxx$$ = 1;");
  }

  /**
   * local var index reuse ข้าม function (ตามคอมเมนต์ต้นฉบับ) — เทสนี้เป็น sanity/coverage
   * เท่านั้น (ยืนยันว่าไม่ throw และ flow เดินผ่านหลาย scope ได้ถูกต้อง) ไม่ได้พิสูจน์ว่า
   * ชื่อจริงถูก reuse กันจริงเพราะ pseudo-name ไม่สะท้อนชื่อจริงที่ generator เลือก
   */
  public void testMultipleFunctions_LocalIndexingAcrossScopes() {
    generatePseudoNames = true;
    test("function f1(a1) { return a1; } function f2(b1, c1) { return b1 + c1; }",
         "function $f1$$($a1$$) { return $a1$$; } "
         + "function $f2$$($b1$$, $c1$$) { return $b1$$ + $c1$$; }");
  }
}
```

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullPrefixDefaultsToEmptyString` | `prefix == null ? "" : prefix` (true branch) |
| `testConstructor_NonNullPrefixIsKeptAsIs` | เงื่อนไขเดียวกัน (false branch) |
| `testConstructor_NullReservedNamesDefaultsToEmptySet` | `if (reservedNames == null)` (true branch) |
| `testConstructor_NonNullReservedNamesIsCopiedNotAliased` | `else` ของเงื่อนไขข้างต้น (false branch) + ตรวจการ copy |
| `testEmptyProgram_NoOp` | boundary: ไม่มี NAME node เลย, loops ว่าง, `changed=false` |
| `testAnonymousFunctionExpressionName_Skipped` | `if (name.length() == 0) return;` (true branch) |
| `testRenameGlobalVariables_WithPseudoNames` | `else if (var != null)` (global path), `getNewGlobalName` pseudo branch |
| `testRenameLocalVariables_WithPseudoNames` | `if (local)` (local path), `getNewLocalName` pseudo branch |
| `testLocalRenamingOnly_GlobalVarNotRenamed` | `if (!local && localRenamingOnly)` (true branch) |
| `testLocalRenamingOnly_LocalVarStillRenamed` | เงื่อนไขเดียวกัน (false branch, local=true ไม่โดน skip) |
| `testPreserveAnonymousFunctionNames_NamedFunctionStillRenamed` | `preserveAnonymousFunctionNames && var!=null && isAnonymousFunction(...)` (false branch จาก component สุดท้าย) |
| `testExternOnlyReference_NotRenamed` | `var == null` path ใน source-pass (ไม่เข้า local/global branch เลย), `isExternsPass_` true branch (สำหรับ extern decl) |
| `testFrequencyComparator_TieAndDifferentCounts` | `FREQUENCY_COMPARATOR`: `a1.count != a2.count` true/false + `ORDER_OF_OCCURRENCE_COMPARATOR` |
| `testPrevUsedRenameMap_ExactReuseForGlobalVar` | `prevUsedRenameMap != null`, reuse condition ทั้งสองฝั่ง true |
| `testGetNewGlobalName_NoOpWhenReusedNameEqualsOldName` | `getNewGlobalName`: `!a.newName.equals(oldName)` false branch |
| `testGetNewLocalName_NoOpWhenReusedTempNameEqualsItself` | `a.oldName.startsWith(LOCAL_VAR_PREFIX)` true branch (reuse), `getNewLocalName` false branch |
| `testPrevUsedRenameMap_SkippedWhenNameNotInMap` | `prevNewName == null` → `continue` |
| `testPrevUsedRenameMap_SkippedWhenPrevNameIsReserved` | `reservedNames.contains(prevNewName)` → `continue` |
| `testReservedCharacters_ConstructorPassThroughDoesNotBreak` | constructor branch: `reservedCharacters != null` ถูกส่งผ่านโดยไม่ crash |
| `testMultipleFunctions_LocalIndexingAcrossScopes` | loop หลาย scope ใน `ProcessVars.visit`, `assignNames` loop ตาม length ของชื่อที่ generate |

**ข้อจำกัดที่ต้องเปิดเผย**: branch ของ `okToRenameVar()` (ผ่าน `CodingConvention.isExported`) กรณี `true`, และ `NodeUtil.isAnonymousFunction` กรณี `true` **ไม่ได้ถูกทดสอบ** เนื่องจากไม่มีซอร์สโค้ดของ dependency เหล่านี้ให้มา จึงไม่สามารถสร้างอินพุตที่ยืนยันได้ว่าจะ trigger branch เหล่านี้จริงโดยไม่เดา behavior ตามข้อกำหนดที่ 4