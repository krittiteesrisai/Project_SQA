# หมายเหตุสำคัญก่อนเริ่ม (ต้องอ่านก่อนใช้งาน)

- คลาสเป้าหมาย `PeepholeReplaceKnownMethods` เป็น **package-private** และ dependency หลักของมัน (`AbstractPeepholeOptimization`, `NodeUtil`, `Node`, `Token`, `InlineCostEstimator`, `CompilerTestCase`, `Compiler`, `PeepholeOptimizationsPass`) **ไม่ได้อยู่ใน jar ที่ระบุในโจทย์** (ant/args4j/caja/guava/jarjar/json/jsr305/junit/protobuf/rhino) แต่เป็นคลาสภายในโปรเจกต์ Closure Compiler เอง (Defects4J compile ซอร์ส+เทสของโปรเจกต์ไว้ล่วงหน้าอยู่แล้ว) — jar ที่ระบุคือ dependency รันไทม์ของโปรเจกต์ ไม่ใช่ตัวคลาสเป้าหมาย ดังนั้นการ `import`/ใช้งาน `CompilerTestCase`, `Compiler`, `PeepholeOptimizationsPass` จึงเป็นแนวทางมาตรฐานเดียวที่ทดสอบพฤติกรรม end-to-end ของ pass นี้ได้จริง (ตรงกับวิธีที่โปรเจกต์จริงทดสอบคลาสนี้)
- `CompilerTestCase` สืบทอดจาก `junit.framework.TestCase` (JUnit3-style) แต่รันได้ภายใต้ JUnit4 runner แบบ backward-compatible (`JUnit38ClassRunner` ถูกเลือกอัตโนมัติเมื่อคลาสเป็น `junit.framework.Test`) — เมธอดต้องใช้ prefix `testXxx()` (ไม่ใช้ `@Test` เพราะ runner แบบนี้จะมองไม่เห็น annotation)
- เมธอด/สัญญาณของ `CompilerTestCase` เช่น `getProcessor(Compiler)`, `enableNormalize()`, `getNumRepetitions()`, `test(js, expected)`, `testSame(js)` **ไม่มีซอร์สให้ตรวจสอบ** จึงอ้างอิงจาก pattern มาตรฐานที่ใช้ทั่วทั้งชุดทดสอบของ Closure Compiler (มีคอมเมนต์ `// ASSUMPTION` กำกับไว้ทุกจุดที่ไม่แน่ใจ 100%)
- บาง branch เป็น defensive code ที่ **ไม่สามารถเข้าถึงได้จริงจาก entry point ปัจจุบัน** (เช่น `callTarget == null` ใน `tryFoldKnownStringMethods` ที่ private และถูกเรียกหลังเช็คแล้วว่า `isGet(callTarget)==true` เสมอ) จะระบุไว้ในตารางสรุปว่า "ไม่สามารถทดสอบได้" พร้อมเหตุผล ไม่มีการเดา behavior เพิ่ม

```java
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit tests for {@link PeepholeReplaceKnownMethods}.
 *
 * หมายเหตุ: ใช้ {@link CompilerTestCase} (utility ภายในโปรเจกต์ Closure Compiler)
 * เพื่อทดสอบผ่าน public entry point จริงของ pass (parse -> run pass -> compare AST)
 * เนื่องจาก AbstractPeepholeOptimization ต้องการ Compiler ที่ initialize แล้ว
 * (สำหรับ reportCodeChange()/isASTNormalized()/isEcmaScript5OrGreater())
 * ซึ่งไม่สามารถ mock ได้ตรง ๆ โดยไม่มีซอร์สของ AbstractPeepholeOptimization/Compiler
 */
public class PeepholeReplaceKnownMethodsTest extends CompilerTestCase {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // ASSUMPTION: enableNormalize() เปิด normalize pass ก่อนรัน pass ที่ทดสอบ
    // จำเป็นสำหรับ tryFoldKnownNumericMethods ซึ่งเช็ค isASTNormalized()
    enableNormalize();
  }

  @Override
  protected int getNumRepetitions() {
    // ASSUMPTION: ป้องกันการรัน pass ซ้ำ (idempotency check) ที่ค่า default อาจเป็น 2
    return 1;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler,
        new PeepholeReplaceKnownMethods());
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void foldSame(String js) {
    testSame(js);
  }

  // ---------------------------------------------------------------------
  // tryFoldArrayJoin
  // ---------------------------------------------------------------------

  public void testArrayJoin_Fold() {
    // 0 elements -> ""
    fold("x = [].join(',')", "x = \"\"");
    // 1 immutable element (merged into 1 string) -> fold ทั้งหมด
    fold("x = ['a'].join(',')", "x = \"a\"");
    fold("x = ['a', 'b', 'c'].join(',')", "x = \"a,b,c\"");
    fold("x = ['a', 'b', 'c'].join('')", "x = \"abc\"");
    fold("x = [0, 1, 2].join(',')", "x = \"0,1,2\"");
    // right == null -> ใช้ default separator ","
    fold("x = ['a','b'].join()", "x = \"a,b\"");
  }

  public void testArrayJoin_SingleNonImmutableElement_WrapsWithStringCoercion() {
    // arrayFoldedChildren.size() == 1 แต่ elem ไม่ใช่ STRING -> ต้องครอบด้วย "" + elem
    fold("x = [foo()].join(',')", "x = \"\" + foo()");
  }

  public void testArrayJoin_MixedElements_PartialFold() {
    // มี elem ที่ merge กันได้ (a,b) และ (c,d) แต่ foo() แยกไว้
    // -> arrayFoldedChildren.size() < originalCount -> เข้า default case และ fold บางส่วน
    fold("x = ['a', 'b', foo(), 'c', 'd'].join(',')",
         "x = ['a,b', foo(), 'c,d'].join(',')");
  }

  public void testArrayJoin_NoFold() {
    // right (separator) ไม่ใช่ immutable value
    foldSame("x = [1,2,3].join(x)");
    // arrayNode.getType() != ARRAYLIT
    foldSame("x = str.join(',')");
    // functionName != "join"
    foldSame("x = [1,2,3].foo()");
    // callTarget ไม่ใช่ GETPROP (เป็น NAME call) -> ข้าม tryFoldArrayJoin ทั้งหมด
    foldSame("x = foo()");
    // ไม่มี adjacent element ให้ merge เลย (size เท่าเดิม) -> ไม่ fold (default case, no benefit)
    foldSame("x = [a, foo(), b].join(',')");
  }

  // ---------------------------------------------------------------------
  // tryFoldKnownMethods / tryFoldKnownStringMethods : dispatch guards
  // ---------------------------------------------------------------------

  public void testStringMethodDispatchGuards_NoFold() {
    // stringNode.getType() != STRING (base ไม่ใช่ string literal)
    foldSame("x = [1,2,3].foo()");
    // functionName.getType() != STRING (GETELEM ด้วย index เป็นตัวเลข)
    foldSame("x = 'abc'[0]()");
    // firstArg == null และ functionName ไม่ตรงกับ toLowerCase/toUpperCase
    foldSame("x = 'abc'.trim()");
    // firstArg ไม่ใช่ immutable value (เป็นตัวแปร)
    foldSame("x = 'abc'.indexOf(x)");
    // firstArg เป็น immutable value แต่ functionName ไม่ตรงกับเมธอดที่รู้จัก
    foldSame("x = 'abc'.trim(1)");
  }

  public void testStringCaseConversion() {
    fold("x = 'ABCDEF'.toLowerCase()", "x = \"abcdef\"");
    fold("x = 'abcdef'.toUpperCase()", "x = \"ABCDEF\"");
  }

  // ---------------------------------------------------------------------
  // tryFoldStringIndexOf
  // ---------------------------------------------------------------------

  public void testStringIndexOf() {
    fold("x = 'abcdef'.indexOf('g')", "x = -1");
    fold("x = 'abcdef'.indexOf('b')", "x = 1");
    fold("x = 'abcdefbc'.indexOf('bc', 3)", "x = 6");
    fold("x = 'abcdef'.lastIndexOf('b')", "x = 1");
    fold("x = 'abcdefbc'.lastIndexOf('bc')", "x = 6");
  }

  public void testStringIndexOf_NoFold() {
    // secondArg มี argument ที่สาม -> discard
    foldSame("x = 'abcdef'.indexOf('b', 0, 1)");
    // secondArg ไม่ใช่ NUMBER
    foldSame("x = 'abcdef'.indexOf('b', 'x')");
  }

  // ---------------------------------------------------------------------
  // tryFoldStringSubstr
  // ---------------------------------------------------------------------

  public void testStringSubstr() {
    fold("x = 'abcde'.substr(1,2)", "x = \"bc\"");
    fold("x = 'abcde'.substr(2)", "x = \"cde\"");
  }

  public void testStringSubstr_NoFold() {
    // arg1 ไม่ใช่ NUMBER
    foldSame("x = 'abcde'.substr('1')");
    // arg2 ไม่ใช่ NUMBER
    foldSame("x = 'abcde'.substr(1,'a')");
    // มี argument ที่สาม
    foldSame("x = 'abcde'.substr(1,2,3)");
    // start+length > length ของ string
    foldSame("x = 'abcde'.substr(0,6)");
    // length < 0
    foldSame("x = 'abcde'.substr(2,-1)");
    // start < 0
    foldSame("x = 'abcde'.substr(-2,2)");
  }

  // ---------------------------------------------------------------------
  // tryFoldStringSubstring
  // ---------------------------------------------------------------------

  public void testStringSubstring() {
    fold("x = 'abcde'.substring(1,2)", "x = \"b\"");
    fold("x = 'abcde'.substring(2)", "x = \"cde\"");
  }

  public void testStringSubstring_NoFold() {
    foldSame("x = 'abcde'.substring('a')");        // arg1 ไม่ใช่ NUMBER
    foldSame("x = 'abcde'.substring(1,'a')");      // arg2 ไม่ใช่ NUMBER
    foldSame("x = 'abcde'.substring(1,2,3)");      // argument ที่สาม
    foldSame("x = 'abcde'.substring(1,10)");       // end > length
    foldSame("x = 'abcde'.substring(10,2)");       // start > length
    foldSame("x = 'abcde'.substring(1,-1)");       // end < 0
    foldSame("x = 'abcde'.substring(-1,2)");       // start < 0
  }

  // ---------------------------------------------------------------------
  // tryFoldStringCharAt
  // ---------------------------------------------------------------------

  public void testStringCharAt() {
    fold("x = 'abcde'.charAt(0)", "x = \"a\"");
    fold("x = 'abcde'.charAt(3)", "x = \"d\"");
  }

  public void testStringCharAt_NoFold() {
    foldSame("x = 'abcde'.charAt('a')");  // arg1 ไม่ใช่ NUMBER
    foldSame("x = 'abcde'.charAt(0,1)");  // มี argument เกิน
    foldSame("x = 'abcde'.charAt(-1)");   // index < 0
    foldSame("x = 'abcde'.charAt(5)");    // index >= length
  }

  // ---------------------------------------------------------------------
  // tryFoldStringCharCodeAt
  // ---------------------------------------------------------------------

  public void testStringCharCodeAt() {
    fold("x = 'abcde'.charCodeAt(0)", "x = 97");
    fold("x = 'abcde'.charCodeAt(3)", "x = 100");
  }

  public void testStringCharCodeAt_NoFold() {
    foldSame("x = 'abcde'.charCodeAt('a')");
    foldSame("x = 'abcde'.charCodeAt(0,1)");
    foldSame("x = 'abcde'.charCodeAt(-1)");
    foldSame("x = 'abcde'.charCodeAt(5)");
  }

  // ---------------------------------------------------------------------
  // tryFoldKnownNumericMethods : dispatch guards
  // ---------------------------------------------------------------------

  public void testNumericDispatchGuards_NoFold() {
    // callTarget ไม่ใช่ NAME (เป็น function expression call)
    foldSame("(function() { return 1; })();");
    // firstArgument == null
    foldSame("x = parseInt()");
    // firstArgument ไม่ใช่ STRING/NUMBER (boolean literal)
    foldSame("x = parseInt(true)");
    // functionNameString ไม่ตรงกับ parseInt/parseFloat
    foldSame("x = parseXYZ('123')");
  }

  // ---------------------------------------------------------------------
  // tryFoldParseNumber : parseInt
  // ---------------------------------------------------------------------

  public void testParseInt() {
    fold("x = parseInt('123')", "x = 123");
    fold("x = parseInt('123', 10)", "x = 123");
    fold("x = parseInt('0x1A')", "x = 26");     // hex prefix, radix == 0
    fold("x = parseInt(123)", "x = 123");        // firstArg NUMBER, radix 0/10
    fold("x = parseInt(30, 16)", "x = 48");      // firstArg NUMBER, radix != 0/10
  }

  public void testParseInt_NoFold() {
    foldSame("x = parseInt('10', 10, 1)");   // third argument present
    foldSame("x = parseInt('10', '10')");    // secondArg ไม่ใช่ NUMBER
    foldSame("x = parseInt('10', 10.5)");    // radix ไม่ใช่ integer
    foldSame("x = parseInt('10', 1)");       // radix == 1
    foldSame("x = parseInt('10', 37)");      // radix > 36
    foldSame("x = parseInt('10', -1)");      // radix < 0
    foldSame("x = parseInt('abc')");         // string ไม่ใช่ตัวเลขที่ valid
    // ASSUMPTION: default LanguageMode ของ CompilerTestCase คือ ECMASCRIPT3 (ไม่ใช่ ES5+)
    // จึงเข้า branch !isEcmaScript5OrGreater() และเลขนำหน้าด้วย 0 -> bail
    foldSame("x = parseInt('010')");
  }

  // ---------------------------------------------------------------------
  // tryFoldParseNumber : parseFloat
  // ---------------------------------------------------------------------

  public void testParseFloat() {
    fold("x = parseFloat('1.23')", "x = 1.23");
    fold("x = parseFloat(1.5)", "x = 1.5");        // firstArg NUMBER
    fold("x = parseFloat(' 3.14 ')", "x = 3.14");  // ทดสอบ trimJsWhiteSpace
  }

  public void testParseFloat_NoFold() {
    // secondArg present แต่ isParseInt == false -> bail
    foldSame("x = parseFloat('1.5', 10)");
    foldSame("x = parseFloat('xyz')"); // ไม่ใช่ตัวเลข valid (checkVal == null)
  }

  // ---------------------------------------------------------------------
  // White-box tests: เรียก optimizeSubtree ตรง ๆ (defensive/boundary branches
  // ที่ไม่ต้องพึ่ง Compiler เพราะไม่มีการ modify tree ในเส้นทางนี้)
  // ---------------------------------------------------------------------

  public void testOptimizeSubtree_NonCallNode_ReturnsUnchanged() {
    // optimizeSubtree: if (NodeUtil.isCall(subtree)) เป็น false -> return subtree เดิม
    Node nameNode = Node.newString(Token.NAME, "x");
    PeepholeReplaceKnownMethods pass = new PeepholeReplaceKnownMethods();
    Node result = pass.optimizeSubtree(nameNode);
    assertSame(nameNode, result);
  }

  public void testOptimizeSubtree_CallWithoutCallTarget_ReturnsUnchanged() {
    // CALL ที่ไม่มี child เลย -> tryFoldArrayJoin: callTarget == null -> return n
    // จากนั้น tryFoldKnownMethods: callTarget == null -> return subtree
    Node callNode = new Node(Token.CALL);
    PeepholeReplaceKnownMethods pass = new PeepholeReplaceKnownMethods();
    Node result = pass.optimizeSubtree(callNode);
    assertSame(callNode, result);
    assertEquals(Token.CALL, result.getType());
  }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testArrayJoin_Fold` | `tryFoldArrayJoin`: 0 elements, 1 merged element, right==null (default separator) |
| `testArrayJoin_SingleNonImmutableElement_WrapsWithStringCoercion` | case 1: `foldedStringNode.getType() != STRING` → wrap ด้วย ADD/coercion |
| `testArrayJoin_MixedElements_PartialFold` | default case: merge บางส่วน, `arrayFoldedChildren.size() != arrayNode.getChildCount()` |
| `testArrayJoin_NoFold` | right ไม่ immutable, arrayNode ไม่ใช่ ARRAYLIT, functionName != "join", callTarget ไม่ใช่ GETPROP, default case ไม่มี benefit (`size == childCount`) |
| `testStringMethodDispatchGuards_NoFold` | `tryFoldKnownStringMethods`: stringNode ไม่ใช่ STRING, functionName ไม่ใช่ STRING, firstArg==null+unknown method, firstArg ไม่ immutable, immutable+unknown method |
| `testStringCaseConversion` | `tryFoldStringToLowerCase`, `tryFoldStringToUpperCase` |
| `testStringIndexOf` / `testStringIndexOf_NoFold` | `tryFoldStringIndexOf`: indexOf/lastIndexOf success, fromIndex, third-arg discard, secondArg ไม่ใช่ NUMBER |
| `testStringSubstr` / `testStringSubstr_NoFold` | `tryFoldStringSubstr`: มี/ไม่มี arg2, arg ผิดชนิด, third-arg, length<0, start<0, out-of-range |
| `testStringSubstring` / `testStringSubstring_NoFold` | `tryFoldStringSubstring`: เช่นเดียวกันแต่เป็น end/start boundary |
| `testStringCharAt` / `testStringCharAt_NoFold` | `tryFoldStringCharAt`: valid, arg ผิดชนิด/เกิน, index<0, index>=length |
| `testStringCharCodeAt` / `testStringCharCodeAt_NoFold` | `tryFoldStringCharCodeAt`: เหมือน charAt |
| `testNumericDispatchGuards_NoFold` | `tryFoldKnownNumericMethods`: callTarget ไม่ใช่ NAME, firstArgument==null, ชนิดผิด, functionName ไม่รู้จัก |
| `testParseInt` / `testParseInt_NoFold` | `tryFoldParseNumber` (parseInt): success (string/number/hex/radix), third-arg, radix ผิดชนิด/ไม่ใช่ int/out-of-range, non-numeric string, leading-zero+ES3 |
| `testParseFloat` / `testParseFloat_NoFold` | `tryFoldParseNumber` (parseFloat): success (string/number/whitespace trim), secondArg+isParseInt==false, non-numeric string |
| `testOptimizeSubtree_NonCallNode_ReturnsUnchanged` | `optimizeSubtree`: `NodeUtil.isCall(subtree)==false` |
| `testOptimizeSubtree_CallWithoutCallTarget_ReturnsUnchanged` | `tryFoldKnownMethods`/`tryFoldArrayJoin`: `callTarget == null` |

**Branch ที่ไม่สามารถทดสอบได้ (ระบุไว้ตามข้อกำหนดห้ามเดา):**
- `tryFoldKnownStringMethods` ภายใน: `if (callTarget == null) return subtree;` และ `if (!NodeUtil.isGet(callTarget)) return subtree;` — เป็น private method ที่ถูกเรียกจาก `tryFoldKnownMethods` เฉพาะกรณีที่ `NodeUtil.isGet(callTarget)==true` และ `callTarget!=null` แล้วเท่านั้น จึง unreachable จาก entry point ปัจจุบัน
- `tryFoldStringIndexOf`: กรณี `searchValue == null` และ `normalizeNumericString`'s `input==null||input.length()==0` — ไม่มีซอร์ส `NodeUtil.getStringValue`/สถานการณ์ input ที่ชัดเจนพอจะสร้างได้โดยไม่เดา behavior จึงงดทดสอบ (คอมเมนต์กำกับในโค้ดจริงหากต้องเพิ่มเติม)
- `tryFoldParseNumber`: branch `NumberFormatException` จาก `Integer.parseInt`/`Double.parseDouble` และ normalized-value mismatch ของ parseFloat — ยากต่อการสร้าง input ที่ผ่าน `getStringNumberValue` แต่ทำให้ parse ล้มเหลว โดยไม่มีซอร์สของ `NodeUtil` จึงงดเดา