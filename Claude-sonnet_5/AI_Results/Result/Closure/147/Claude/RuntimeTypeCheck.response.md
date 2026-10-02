# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญ (ต้องอ่านก่อน):**

`RuntimeTypeCheck` เป็นคลาส **package-private** และเรียกใช้ `NodeUtil`, `AbstractCompiler`, `FunctionType`, `JSType`, `Normalize` ฯลฯ ซึ่งเป็นคลาสภายในของ Closure Compiler เอง (ไม่ใช่คลาสจาก jar ที่กำหนด) — คลาสเหล่านี้ต้องมีอยู่แล้วใน classpath ของโปรเจกต์ (main sources ของ Closure Compiler) เพราะเป็น dependency ของคลาสเป้าหมายอยู่แล้ว ผมจึงเขียนเทสให้อยู่ใน **package เดียวกัน** (`com.google.javascript.jscomp`) เพื่อเข้าถึง constructor ของ `RuntimeTypeCheck` และ `RuntimeTypeCheck.getBoilerplateCode(...)` ได้ (ทั้งสองเป็น package-private)

จุดที่ **ไม่สามารถยืนยัน behavior ได้ 100% จากซอร์สที่ให้มา** (เช่น method signature ที่แน่นอนของ `Compiler`/`CompilerOptions`/`SourceFile`, โครงสร้างที่แน่นอนของ `compiler.getRoot()`, เนื้อหาไฟล์ resource `js/runtime_type_check.js`) ผมได้ **คอมเมนต์กำกับไว้ในโค้ดทุกจุด** ตามข้อกำหนด และเลือกใช้การตรวจสอบโครงสร้าง AST แบบ pattern-matching (ผ่าน `Token`/`Node`) แทนการเทียบ string/exact-source ทั้งไฟล์ เพื่อไม่ให้ผลลัพธ์ผิดเพี้ยนจาก boilerplate ที่ `addBoilerplateCode()` แทรกเข้ามา (เนื้อหาของ boilerplate ไม่ปรากฏในซอร์สที่ให้มา จึงไม่เดาเนื้อหา)

กิ่ง (branch) ที่ **ไม่ได้ทดสอบ** เพราะต้องพึ่งพา setup ที่ไม่มีหลักฐานยืนยันจากซอร์ส (เช่น `CodingConvention` แบบ Closure สำหรับ `isClassDefiningCall`, `funType.getSource() == null`, `className == null`, `paramName == null`) ผมคอมเมนต์กำกับไว้ชัดเจนว่า "ไม่ครอบคลุม เพราะไม่มีข้อมูลยืนยันจากซอร์ส"

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JUnit4 tests for {@link RuntimeTypeCheck} (Closure-147b).
 *
 * หมายเหตุ: คลาสนี้ต้องอยู่ใน package เดียวกับ RuntimeTypeCheck
 * (com.google.javascript.jscomp) เนื่องจากทั้งตัวคลาส RuntimeTypeCheck เอง
 * และ static method getBoilerplateCode(...) เป็น package-private.
 *
 * สมมติฐาน (ASSUMPTION) เกี่ยวกับ API ของ com.google.javascript.jscomp.Compiler /
 * CompilerOptions / SourceFile ที่ใช้ในเทสนี้ (ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง
 * แต่เป็น public API มาตรฐานของ Closure Compiler ที่ RuntimeTypeCheck ต้องพึ่งพา
 * อยู่แล้วผ่าน AbstractCompiler):
 *  - new Compiler()  : constructor เปล่า
 *  - CompilerOptions#setCheckTypes(boolean)
 *  - SourceFile.fromCode(String fileName, String code)
 *  - Compiler#compile(SourceFile externs, SourceFile input, CompilerOptions options)
 *  - Compiler#getRoot() คืน Node ที่มี child แรก = externs root, child สุดท้าย = js root
 *    (สอดคล้องกับพารามิเตอร์ (Node externs, Node root) ของ CompilerPass#process)
 * หากสมมติฐานเหล่านี้ผิดในเวอร์ชันจริงของโปรเจกต์ อาจต้องปรับ helper compile()/getJsRoot().
 */
public class RuntimeTypeCheckTest {

  // ---------------------------------------------------------------------
  // Helpers: compile + navigate AST
  // ---------------------------------------------------------------------

  private Compiler compile(String externsCode, String jsCode) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true); // ASSUMPTION: เปิด type checking เพื่อให้ n.getJSType() ไม่ null
    SourceFile externs =
        SourceFile.fromCode("externs.js", externsCode == null ? "" : externsCode);
    SourceFile input = SourceFile.fromCode("input.js", jsCode);
    compiler.compile(externs, input, options);
    return compiler;
  }

  private Node getJsRoot(Compiler compiler) {
    // ASSUMPTION: ดูหมายเหตุด้านบน
    return compiler.getRoot().getLastChild();
  }

  private Node getExternsRoot(Compiler compiler) {
    return compiler.getRoot().getFirstChild();
  }

  private void runProcess(Compiler compiler, String logFunction) {
    new RuntimeTypeCheck(compiler, logFunction)
        .process(getExternsRoot(compiler), getJsRoot(compiler));
  }

  /** ค้นหา FUNCTION node ตามชื่อ (ใช้ NodeUtil เดียวกับที่ production code ใช้จริง) */
  private static Node findFunctionNode(Node n, String name) {
    if (NodeUtil.isFunction(n) && name.equals(NodeUtil.getFunctionName(n))) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFunctionNode(c, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private static Node findNodeByType(Node n, int type) {
    if (n.getType() == type) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findNodeByType(c, type);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private static Node getFunctionBody(Node functionNode) {
    // ตรงกับ "Node block = n.getLastChild();" ใน AddChecks.visitFunction
    return functionNode.getLastChild();
  }

  private static int countStatements(Node block) {
    int count = 0;
    for (Node c = block.getFirstChild(); c != null; c = c.getNext()) {
      count++;
    }
    return count;
  }

  private static String getQualifiedName(Node n) {
    if (n.getType() == Token.NAME) {
      return n.getString();
    } else if (n.getType() == Token.GETPROP) {
      return getQualifiedName(n.getFirstChild()) + "." + n.getLastChild().getString();
    }
    return null;
  }

  /** เก็บ marker assignment (Foo.prototype['xxx']=true;) ตามลำดับที่พบ (preorder) */
  private static List<String> collectMarkersInOrder(Node root, String className) {
    List<String> markers = new ArrayList<String>();
    collectMarkersHelper(root, className, markers);
    return markers;
  }

  private static void collectMarkersHelper(Node n, String className, List<String> out) {
    if (n.getType() == Token.EXPR_RESULT) {
      Node assign = n.getFirstChild();
      if (assign != null && assign.getType() == Token.ASSIGN) {
        Node getelem = assign.getFirstChild();
        if (getelem != null && getelem.getType() == Token.GETELEM) {
          Node getprop = getelem.getFirstChild();
          Node markerStrNode = getelem.getLastChild();
          if (getprop != null && getprop.getType() == Token.GETPROP
              && markerStrNode.getType() == Token.STRING) {
            Node classNode = getprop.getFirstChild();
            Node protoNode = getprop.getLastChild();
            if (classNode.getType() == Token.NAME
                && className.equals(classNode.getString())
                && protoNode.getType() == Token.STRING
                && "prototype".equals(protoNode.getString())) {
              out.add(markerStrNode.getString());
            }
          }
        }
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      collectMarkersHelper(c, className, out);
    }
  }

  /** โครงสร้างผลลัพธ์ของ checkType(...) call หนึ่งครั้ง */
  private static class CheckTypeCallInfo {
    Node exprNode;
    List<String> checkerDescriptions = new ArrayList<String>();
  }

  private static CheckTypeCallInfo parseCheckTypeCall(Node exprResultOrCall) {
    Node call = exprResultOrCall.getType() == Token.EXPR_RESULT
        ? exprResultOrCall.getFirstChild()
        : exprResultOrCall;
    assertEquals(Token.CALL, call.getType());
    Node callee = call.getFirstChild();
    assertEquals("jscomp.typecheck.checkType", getQualifiedName(callee));
    Node exprArg = callee.getNext();
    Node arrayArg = exprArg.getNext();
    assertEquals(Token.ARRAYLIT, arrayArg.getType());

    CheckTypeCallInfo info = new CheckTypeCallInfo();
    info.exprNode = exprArg;
    for (Node checker = arrayArg.getFirstChild(); checker != null; checker = checker.getNext()) {
      info.checkerDescriptions.add(describeChecker(checker));
    }
    return info;
  }

  private static String describeChecker(Node checker) {
    if (checker.getType() == Token.CALL) {
      String fn = getQualifiedName(checker.getFirstChild());
      Node arg = checker.getFirstChild().getNext();
      String argStr =
          (arg != null && arg.getType() == Token.STRING) ? arg.getString() : null;
      return fn + ":" + argStr;
    } else {
      // nullChecker: อ้างอิงตรง ไม่ใช่ call (ดู createCheckerNode: type.isNullType())
      return getQualifiedName(checker);
    }
  }

  // ---------------------------------------------------------------------
  // AddMarkers: constructor / interface markers
  // ---------------------------------------------------------------------

  @Test
  public void testNonConstructorFunctionGetsNoMarker() {
    // ครอบคลุม branch: !funType.isConstructor() -> return (ไม่เพิ่ม marker)
    Compiler compiler = compile(null, "function foo() {}");
    runProcess(compiler, null);
    List<String> markers = collectMarkersInOrder(getJsRoot(compiler), "foo");
    assertTrue(markers.isEmpty());
  }

  @Test
  public void testConstructorAddsInstanceOfMarker() {
    // ครอบคลุม branch: funType.isConstructor() == true, ไม่มี interface
    Compiler compiler = compile(null, "/** @constructor */ function Foo() {}");
    runProcess(compiler, null);
    List<String> markers = collectMarkersInOrder(getJsRoot(compiler), "Foo");
    assertEquals(Arrays.asList("instance_of__Foo"), markers);
  }

  @Test
  public void testInterfaceDeclarationItselfGetsNoMarker() {
    // interface ไม่ใช่ constructor -> isConstructor() false -> ไม่ใส่ marker ให้ตัวมันเอง
    Compiler compiler = compile(null, "/** @interface */ function Foo() {}");
    runProcess(compiler, null);
    assertTrue(collectMarkersInOrder(getJsRoot(compiler), "Foo").isEmpty());
  }

  @Test
  public void testConstructorImplementingInterfacesMarkersSortedAlphabetically() {
    // ครอบคลุม loop "for (ObjectType interfaceType : stuff)" และ ALPHA comparator
    String js =
        "/** @interface */ function Zoo() {}\n"
            + "/** @interface */ function Bar() {}\n"
            + "/** @constructor\n"
            + " * @implements {Zoo}\n"
            + " * @implements {Bar}\n"
            + " */\n"
            + "function Foo() {}";
    Compiler compiler = compile(null, js);
    runProcess(compiler, null);
    List<String> markers = collectMarkersInOrder(getJsRoot(compiler), "Foo");
    // instance marker ต้องมาก่อน แล้วตามด้วย interface เรียงตามตัวอักษร (Bar ก่อน Zoo)
    assertEquals(Arrays.asList("instance_of__Foo", "implements__Bar", "implements__Zoo"), markers);
  }

  // ---------------------------------------------------------------------
  // AddChecks: parameter checks
  // ---------------------------------------------------------------------

  @Test
  public void testSingleStringParamGetsValueChecker() {
    Compiler compiler = compile(null, "/** @param {string} a */ function f(a) {}");
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    assertEquals(1, countStatements(body));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals(Token.NAME, info.exprNode.getType());
    assertEquals("a", info.exprNode.getString());
    assertEquals(Arrays.asList("jscomp.typecheck.valueChecker:string"), info.checkerDescriptions);
  }

  @Test
  public void testMultipleParamsInsertedInDeclarationOrder() {
    // ครอบคลุม branch insertionPoint == null (addChildToFront) และ != null (addChildAfter)
    Compiler compiler =
        compile(null, "/** @param {string} a\n@param {number} b */ function f(a, b) {}");
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    assertEquals(2, countStatements(body));

    CheckTypeCallInfo first = parseCheckTypeCall(body.getFirstChild());
    assertEquals("a", first.exprNode.getString());
    assertEquals(Arrays.asList("jscomp.typecheck.valueChecker:string"), first.checkerDescriptions);

    CheckTypeCallInfo second = parseCheckTypeCall(body.getLastChild());
    assertEquals("b", second.exprNode.getString());
    assertEquals(Arrays.asList("jscomp.typecheck.valueChecker:number"), second.checkerDescriptions);
  }

  @Test
  public void testUncheckedTypeParamIsSkippedButNextParamStillChecked() {
    // ครอบคลุม branch: createCheckTypeCallNode == null -> continue (ไม่ insert ให้ตัวแรก)
    Compiler compiler =
        compile(null, "/** @param {*} a\n@param {number} b */ function f(a, b) {}");
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    assertEquals(1, countStatements(body));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals("b", info.exprNode.getString());
    assertEquals(Arrays.asList("jscomp.typecheck.valueChecker:number"), info.checkerDescriptions);
  }

  @Test
  public void testUnionTypeParamProducesSortedCheckerList() {
    // ครอบคลุม branch: type.isUnionType() == true, และการเรียง alternates ด้วย ALPHA
    Compiler compiler =
        compile(null, "/** @param {(string|number)} a */ function f(a) {}");
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    assertEquals(1, countStatements(body));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    // "number" < "string" ตามลำดับตัวอักษร
    assertEquals(
        Arrays.asList(
            "jscomp.typecheck.valueChecker:number", "jscomp.typecheck.valueChecker:string"),
        info.checkerDescriptions);
  }

  @Test
  public void testNullTypeParamUsesBareNullCheckerReference() {
    // ครอบคลุม branch: type.isNullType() -> return jsCode("nullChecker") แบบไม่ wrap ด้วย CALL
    Compiler compiler = compile(null, "/** @param {null} a */ function f(a) {}");
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals(Arrays.asList("jscomp.typecheck.nullChecker"), info.checkerDescriptions);
  }

  @Test
  public void testInstanceTypeOfUserClassUsesClassChecker() {
    // ครอบคลุม branch: isInstanceType() true, sourceInput ไม่ใช่ extern, ไม่ใช่ interface
    String js =
        "/** @constructor */ function Foo() {}\n" + "/** @param {Foo} a */ function f(a) {}";
    Compiler compiler = compile(null, js);
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals(Arrays.asList("jscomp.typecheck.classChecker:Foo"), info.checkerDescriptions);
  }

  @Test
  public void testInstanceTypeOfInterfaceUsesInterfaceChecker() {
    // ครอบคลุม branch: objType.getConstructor().isInterface() == true
    String js = "/** @interface */ function Foo() {}\n" + "/** @param {Foo} a */ function f(a) {}";
    Compiler compiler = compile(null, js);
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals(Arrays.asList("jscomp.typecheck.interfaceChecker:Foo"), info.checkerDescriptions);
  }

  @Test
  public void testExternInstanceTypeUsesExternClassChecker() {
    // ครอบคลุม branch: sourceInput == null || sourceInput.isExtern()
    String externs = "/** @constructor */ function Ext() {}";
    String js = "/** @param {Ext} a */ function f(a) {}";
    Compiler compiler = compile(externs, js);
    runProcess(compiler, null);
    Node body = getFunctionBody(findFunctionNode(getJsRoot(compiler), "f"));
    CheckTypeCallInfo info = parseCheckTypeCall(body.getFirstChild());
    assertEquals(
        Arrays.asList("jscomp.typecheck.externClassChecker:Ext"), info.checkerDescriptions);
  }

  // ---------------------------------------------------------------------
  // AddChecks: return value checks
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyReturnStatementIsNotModified() {
    // ครอบคลุม branch: retValue == null -> return (ไม่แก้ AST)
    Compiler compiler = compile(null, "function f() { return; }");
    runProcess(compiler, null);
    Node returnNode = findNodeByType(getFunctionBody(findFunctionNode(getJsRoot(compiler), "f")),
        Token.RETURN);
    assertNotNull(returnNode);
    assertNull(returnNode.getFirstChild());
  }

  @Test
  public void testReturnWithCheckedTypeWrapsValueInCheckTypeCall() {
    // ครอบคลุม branch: checkNode != null -> n.replaceChild(retValue, checkNode)
    Compiler compiler = compile(null, "/** @return {string} */ function f() { return 'a'; }");
    runProcess(compiler, null);
    Node returnNode = findNodeByType(getFunctionBody(findFunctionNode(getJsRoot(compiler), "f")),
        Token.RETURN);
    assertNotNull(returnNode);
    CheckTypeCallInfo info = parseCheckTypeCall(returnNode.getFirstChild());
    assertEquals(Token.STRING, info.exprNode.getType());
    assertEquals("a", info.exprNode.getString());
    assertEquals(Arrays.asList("jscomp.typecheck.valueChecker:string"), info.checkerDescriptions);
  }

  @Test
  public void testReturnWithUncheckedTypeIsNotModified() {
    // ครอบคลุม branch: checkNode == null (return type ไม่ถูกตรวจสอบ เช่น {*}) -> ไม่แก้ AST
    Compiler compiler = compile(null, "/** @return {*} */ function f() { return {}; }");
    runProcess(compiler, null);
    Node returnNode = findNodeByType(getFunctionBody(findFunctionNode(getJsRoot(compiler), "f")),
        Token.RETURN);
    assertNotNull(returnNode);
    assertEquals(Token.OBJECTLIT, returnNode.getFirstChild().getType());
  }

  // ---------------------------------------------------------------------
  // getBoilerplateCode: %%LOG%% substitution branches
  // ---------------------------------------------------------------------

  @Test
  public void testGetBoilerplateCodeWithNullLogFunctionDoesNotThrow() {
    // ครอบคลุม branch: logFunction == null -> ใช้ "function(warning, expr) {}"
    // NOTE: ไม่สามารถตรวจเนื้อหาที่แน่นอนของไฟล์ resource js/runtime_type_check.js ได้
    // จากซอร์สที่ให้มา จึงตรวจสอบเพียงว่าไม่มี exception และได้ Node กลับมา
    Compiler compiler = new Compiler();
    Node script = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
    assertNotNull(script);
    // ASSUMPTION: Normalize.parseAndNormalizeSyntheticCode คืน SCRIPT node
    assertEquals(Token.SCRIPT, script.getType());
  }

  @Test
  public void testGetBoilerplateCodeWithCustomLogFunctionDoesNotThrow() {
    // ครอบคลุม branch: logFunction != null -> ใช้ logFunction ที่กำหนด
    Compiler compiler = new Compiler();
    Node script = RuntimeTypeCheck.getBoilerplateCode(compiler, "function(w,e){myLog(w,e);}");
    assertNotNull(script);
    assertEquals(Token.SCRIPT, script.getType());
  }

  @Test
  public void testProcessWithCustomLogFunctionDoesNotThrow() {
    // สโมคเทส end-to-end: process() เรียก addBoilerplateCode() ครบทั้ง 3 ขั้นตอน
    // (AddMarkers, AddChecks, addBoilerplateCode) โดยไม่ throw exception
    Compiler compiler = compile(null, "/** @constructor */ function Foo() {}");
    runProcess(compiler, "function(w,e){}");
    // ยืนยันว่า marker ยังถูกเพิ่มตามปกติแม้เปิดใช้ logFunction ที่ไม่ null
    assertEquals(
        Arrays.asList("instance_of__Foo"),
        collectMarkersInOrder(getJsRoot(compiler), "Foo"));
  }

  // ---------------------------------------------------------------------
  // Branches ที่ไม่ได้ครอบคลุม (คอมเมนต์ตามข้อกำหนด #4)
  // ---------------------------------------------------------------------
  //
  // 1) AddMarkers.addMarker: funType.getSource() == null
  //    -> ไม่มีวิธียืนยันจากซอร์สว่าจะสร้าง AST แบบไหนให้เกิดกรณีนี้ได้แน่นอน
  //       (อาจเกิดกับ constructor ที่ประกาศใน externs เท่านั้น) จึงไม่เขียนเทสเดา
  //
  // 2) AddMarkers.addMarker: className == null (unnamed Function-typed var)
  //    -> ไม่มีตัวอย่างที่ยืนยันได้แน่ชัดจากซอร์ส/คอมเมนต์ ("can happen with
  //       anonymous classes declared with the type Function") จึงไม่เดารูปแบบ input
  //
  // 3) AddMarkers.findNodeToInsertAfter / isClassDefiningCall == true
  //    -> ต้องพึ่ง CodingConvention ที่รู้จัก "classesDefinedByCall" (เช่น
  //       goog.inherits) ซึ่งไม่ได้ระบุการตั้งค่าที่แน่นอนไว้ในซอร์สที่ให้มา
  //
  // 4) AddChecks.visitFunction: paramName == null ("Can this ever happen?")
  //    -> คอมเมนต์ในซอร์สเองก็ไม่มั่นใจว่าเกิดขึ้นได้หรือไม่ จึงไม่เขียนเทสเดา
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testNonConstructorFunctionGetsNoMarker` | `AddMarkers.visitFunction`: `!funType.isConstructor()` → return |
| `testConstructorAddsInstanceOfMarker` | `funType.isConstructor()==true`, `addMarker` กรณี `interfaceType==null` |
| `testInterfaceDeclarationItselfGetsNoMarker` | interface ไม่ผ่าน `isConstructor()` |
| `testConstructorImplementingInterfacesMarkersSortedAlphabetically` | loop implemented interfaces + `TreeSet(ALPHA)` sort order |
| `testSingleStringParamGetsValueChecker` | `createCheckerNode`: value type branch, insertion `insertionPoint==null` |
| `testMultipleParamsInsertedInDeclarationOrder` | `insertionPoint==null` และ `!=null` (front/after) |
| `testUncheckedTypeParamIsSkippedButNextParamStillChecked` | `checkNode==null` → `continue` |
| `testUnionTypeParamProducesSortedCheckerList` | `type.isUnionType()==true` + sort alternates |
| `testNullTypeParamUsesBareNullCheckerReference` | `type.isNullType()` (bare reference ไม่ wrap CALL) |
| `testInstanceTypeOfUserClassUsesClassChecker` | `isInstanceType()`, ไม่ extern, ไม่ interface → `classChecker` |
| `testInstanceTypeOfInterfaceUsesInterfaceChecker` | `objType.getConstructor().isInterface()==true` → `interfaceChecker` |
| `testExternInstanceTypeUsesExternClassChecker` | `sourceInput==null \|\| sourceInput.isExtern()` → `externClassChecker` |
| `testEmptyReturnStatementIsNotModified` | `visitReturn`: `retValue==null` → return |
| `testReturnWithCheckedTypeWrapsValueInCheckTypeCall` | `visitReturn`: `checkNode!=null` → `replaceChild` |
| `testReturnWithUncheckedTypeIsNotModified` | `visitReturn`: `checkNode==null` → ไม่แก้ AST |
| `testGetBoilerplateCodeWithNullLogFunctionDoesNotThrow` | ternary `logFunction==null` |
| `testGetBoilerplateCodeWithCustomLogFunctionDoesNotThrow` | ternary `logFunction!=null` |
| `testProcessWithCustomLogFunctionDoesNotThrow` | สโมคเทส `process()` ครบ 3 ขั้นตอนพร้อม logFunction |

**Branch ที่ไม่ครอบคลุม** (ระบุเหตุผลไว้ในคอมเมนต์ท้ายไฟล์): `funType.getSource()==null`, `className==null`, `isClassDefiningCall==true`, `paramName==null` — เนื่องจากไม่มีข้อมูลยืนยันวิธีสร้าง input ที่แน่นอนจากซอร์สโค้ดที่ให้มา จึงไม่เขียนเทสเดา behavior ตามข้อกำหนด