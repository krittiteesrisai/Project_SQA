# Unit Test: ScopeTest (JUnit 4) — Defects4J Closure-162b

## หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่จำเป็นเพื่อคอมไพล์และรันได้ — ไม่มี Mockito ใน classpath)

- ใช้ `com.google.javascript.jscomp.Compiler` (constructor แบบไม่มีพารามิเตอร์) เพื่อสร้าง `AbstractCompiler` จริง สำหรับสร้าง global `Scope` — เป็นคลาสจริงในโปรเจกต์เดียวกัน ไม่ใช่ mock
- ใช้ `com.google.javascript.rhino.Node` public constructor `Node(int type)` และเมธอด `addChildToBack(Node)` ตามที่ใช้ทั่วไปในซอร์สของ Closure Compiler ยุคนี้
- **ไม่เดา behavior ของ `NodeUtil`** (เช่น `isConstantName`, `isFunctionExpression`, `getInfoForNameNode` รายละเอียดภายใน) — จึงหลีกเลี่ยงการ assert ผลลัพธ์ที่พึ่งพา logic ภายในของ `NodeUtil` ที่ไม่มีซอร์สให้ (เช่น `isConst()`, `isBleedingFunction()`) ยกเว้นกรณีที่พฤติกรรมค่อนข้าง deterministic ตรงไปตรงมา (เช่น info เป็น null)
- ไม่สามารถสร้าง `CompilerInput` จริงที่ `isExtern() == false` ได้โดยไม่พึ่ง `SourceAst/JSSourceFile` ที่ซับซ้อน จึงทดสอบเฉพาะกรณี `input == null` (isExtern() == true) และคอมเมนต์กำกับ branch ที่ไม่ครอบคลุม
- ไม่ได้ทดสอบ branch ของ constructor `Scope(Scope,Node)` ที่ `nodeType.isFunctionType()==true` เพราะต้องสร้าง `FunctionType` จริงซึ่ง API ไม่ได้ให้มาในซอร์สที่แนบ (คอมเมนต์กำกับไว้)

```java
package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Unit test สำหรับ com.google.javascript.jscomp.Scope (Defects4J Closure-162b)
 *
 * ข้อสมมติ: ใช้ com.google.javascript.jscomp.Compiler (constructor เปล่า) และ
 * com.google.javascript.rhino.Node (constructor Node(int type), addChildToBack)
 * ซึ่งเป็นคลาสจริงในโปรเจกต์เดียวกัน ไม่มีการ mock ใด ๆ
 */
public class ScopeTest {

  private Compiler compiler;
  private Node globalRoot;
  private Scope globalScope;

  @Before
  public void setUp() {
    compiler = new Compiler();
    globalRoot = new Node(Token.BLOCK);
    globalScope = new Scope(globalRoot, compiler);
  }

  /**
   * สร้าง NAME node เปล่า ๆ สำหรับใช้เป็น nameNode ของ Var
   * (ไม่ตั้งค่า string property เพราะ Var.getName() ใช้ field แยก ไม่พึ่ง node.getString())
   */
  private Node nameNode(String ignoredName) {
    return new Node(Token.NAME);
  }

  private boolean containsName(Iterator<Var> it, String name) {
    while (it.hasNext()) {
      if (it.next().getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  // ==================== Constructors ====================

  @Test
  public void testGlobalScopeConstructor() {
    assertTrue(globalScope.isGlobal());
    assertFalse(globalScope.isLocal());
    assertEquals(0, globalScope.getDepth());
    assertFalse(globalScope.isBottom());
    assertNull(globalScope.getParent());
    assertNull(globalScope.getParentScope());
    assertSame(globalRoot, globalScope.getRootNode());
    assertNotNull(globalScope.getTypeOfThis());
  }

  @Test
  public void testChildScopeConstructor_inheritsThisTypeFromParent() {
    // funcNode ไม่มี JSType กำหนดไว้ -> ตกไป else branch: thisType = parent.thisType
    Node funcNode = new Node(Token.FUNCTION);
    Scope child = new Scope(globalScope, funcNode);

    assertFalse(child.isGlobal());
    assertTrue(child.isLocal());
    assertEquals(1, child.getDepth());
    assertFalse(child.isBottom());
    assertSame(globalScope, child.getParent());
    assertSame(globalScope, child.getParentScope());
    assertSame(globalScope, child.getGlobalScope());
    assertSame(globalScope.getTypeOfThis(), child.getTypeOfThis());
  }

  @Test
  public void testNestedScopeDepthAndGlobalScope() {
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    Scope grandchild = new Scope(child, new Node(Token.FUNCTION));

    assertEquals(2, grandchild.getDepth());
    assertSame(globalScope, grandchild.getGlobalScope());
  }

  @Test(expected = NullPointerException.class)
  public void testChildScopeConstructor_nullParentThrows() {
    new Scope(null, new Node(Token.FUNCTION));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testChildScopeConstructor_sameRootNodeAsParentThrows() {
    new Scope(globalScope, globalRoot); // rootNode == parent.rootNode
  }

  @Test
  public void testBottomScopeConstructor() {
    ObjectType thisType = compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
    Node rootNode2 = new Node(Token.BLOCK);
    Scope bottom = new Scope(rootNode2, thisType);

    assertTrue(bottom.isBottom());
    assertEquals(0, bottom.getDepth());
    assertNull(bottom.getParent());
    assertSame(thisType, bottom.getTypeOfThis());
    assertSame(rootNode2, bottom.getRootNode());
  }

  // ==================== declare / undeclare / getVar ====================

  @Test
  public void testDeclareDefaultInferredTrue() {
    Node n = nameNode("x");
    Var v = globalScope.declare("x", n, null, null);
    assertEquals("x", v.getName());
    assertSame(n, v.getNode());
    assertTrue(v.isTypeInferred());
    assertSame(v, globalScope.getVar("x"));
    assertEquals(1, globalScope.getVarCount());
  }

  @Test
  public void testDeclareExplicitInferredFalse() {
    Var v = globalScope.declare("y", nameNode("y"), null, null, false);
    assertFalse(v.isTypeInferred());
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareEmptyNameThrows() {
    globalScope.declare("", nameNode(""), null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareNullNameThrows() {
    // Preconditions.checkState(name != null && name.length() > 0) -> short-circuit -> IllegalStateException (ไม่ใช่ NPE)
    globalScope.declare(null, nameNode("z"), null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareDuplicateThrows() {
    globalScope.declare("dup", nameNode("dup"), null, null);
    globalScope.declare("dup", nameNode("dup"), null, null);
  }

  @Test
  public void testGetVar_foundInOwnScope() {
    Var v = globalScope.declare("s1", nameNode("s1"), null, null);
    assertSame(v, globalScope.getVar("s1"));
  }

  @Test
  public void testGetVar_recursesToParentWhenFound() {
    globalScope.declare("g1", nameNode("g1"), null, null);
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    assertNotNull(child.getVar("g1"));
  }

  @Test
  public void testGetVar_recursesToParentAndReturnsNullWhenNotFound() {
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    assertNull(child.getVar("doesNotExist"));
  }

  @Test
  public void testGetVar_returnsNullWhenNotFoundAndNoParent() {
    assertNull(globalScope.getVar("doesNotExist"));
  }

  @Test
  public void testGetSlotAndGetOwnSlot() {
    Node n = nameNode("s1");
    Var v = globalScope.declare("s1", n, null, null);
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));

    assertSame(v, globalScope.getSlot("s1"));
    assertSame(v, globalScope.getOwnSlot("s1"));
    assertNull(child.getOwnSlot("s1"));
    assertSame(v, child.getSlot("s1"));
  }

  @Test
  public void testUndeclareRemovesVar() {
    Var v = globalScope.declare("temp", nameNode("temp"), null, null);
    assertNotNull(globalScope.getVar("temp"));
    globalScope.undeclare(v);
    assertNull(globalScope.getVar("temp"));
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclare_wrongScopeThrows() {
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    Var v = child.declare("cv", nameNode("cv"), null, null);
    globalScope.undeclare(v); // v.scope == child, ไม่ใช่ globalScope
  }

  // ==================== getArgumentsVar ====================

  @Test
  public void testGetArgumentsVar_singletonAndProperties() {
    Var args1 = globalScope.getArgumentsVar();
    Var args2 = globalScope.getArgumentsVar();
    assertSame(args1, args2);
    assertEquals("arguments", args1.getName());
    assertNull(args1.getNode());
    assertNull(args1.getDeclaration());
    assertFalse(args1.isTypeInferred());
  }

  // ==================== isDeclared ====================

  @Test
  public void testIsDeclared_allBranches() {
    globalScope.declare("g2", nameNode("g2"), null, null);
    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    child.declare("c2", nameNode("c2"), null, null);

    assertTrue(child.isDeclared("g2", true));      // containsKey false -> recurse -> true
    assertFalse(child.isDeclared("g2", false));     // containsKey false, recurse=false -> false
    assertTrue(child.isDeclared("c2", false));      // containsKey true -> true
    assertFalse(child.isDeclared("nope", true));    // recurse ไปจนสุด parent==null -> false
    assertFalse(globalScope.isDeclared("nope2", true)); // parent==null ตั้งแต่แรก -> false
  }

  // ==================== iteration / symbol table ====================

  @Test
  public void testGetVarsAndAllSymbolsAndVarCount() {
    assertEquals(0, globalScope.getVarCount());
    globalScope.declare("a", nameNode("a"), null, null);
    globalScope.declare("b", nameNode("b"), null, null);
    assertEquals(2, globalScope.getVarCount());

    Iterator<Var> it = globalScope.getVars();
    int count = 0;
    while (it.hasNext()) {
      it.next();
      count++;
    }
    assertEquals(2, count);
    assertTrue(globalScope.getAllSymbols().iterator().hasNext());
  }

  @Test
  public void testGetReferencesAndGetScope() {
    Var v = globalScope.declare("ref1", nameNode("ref1"), null, null);
    Iterator<Var> it = globalScope.getReferences(v).iterator();
    assertTrue(it.hasNext());
    assertSame(v, it.next());
    assertFalse(it.hasNext());
    assertSame(globalScope, globalScope.getScope(v));
  }

  // ==================== getDeclarativelyUnboundVarsWithoutTypes ====================
  // Predicate: parentNode!=null && type==null && parentNode.getType()==VAR && !isExtern()

  @Test
  public void testUnboundVars_excludedWhenNoParent() {
    globalScope.declare("noParent", nameNode("noParent"), null, null);
    assertFalse(containsName(globalScope.getDeclarativelyUnboundVarsWithoutTypes(), "noParent"));
  }

  @Test
  public void testUnboundVars_excludedWhenTypeNotNull() {
    Node n = nameNode("hasType");
    Node varParent = new Node(Token.VAR);
    varParent.addChildToBack(n);
    ObjectType someType = compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
    globalScope.declare("hasType", n, someType, null);
    assertFalse(containsName(globalScope.getDeclarativelyUnboundVarsWithoutTypes(), "hasType"));
  }

  @Test
  public void testUnboundVars_excludedWhenParentIsNotVar() {
    Node n = nameNode("assignChild");
    Node assignParent = new Node(Token.ASSIGN);
    assignParent.addChildToBack(n);
    globalScope.declare("assignChild", n, null, null);
    assertFalse(containsName(globalScope.getDeclarativelyUnboundVarsWithoutTypes(), "assignChild"));
  }

  @Test
  public void testUnboundVars_excludedWhenExtern() {
    // input == null -> isExtern() == true -> !isExtern() == false -> ถูกกรองออก
    Node n = nameNode("externVar");
    Node varParent = new Node(Token.VAR);
    varParent.addChildToBack(n);
    globalScope.declare("externVar", n, null, null);
    assertFalse(containsName(globalScope.getDeclarativelyUnboundVarsWithoutTypes(), "externVar"));
    // หมายเหตุ: กรณี predicate เป็น true ทั้งหมด (isExtern()==false) ต้องพึ่งพา CompilerInput จริง
    // ที่สร้างจาก SourceAst/JSSourceFile ซึ่งซับซ้อนเกินขอบเขตของชุดทดสอบนี้ จึงไม่ครอบคลุม
  }

  // ==================== Var class ====================

  @Test
  public void testVarGetInitialValue_functionParent() {
    Node n = nameNode("f");
    Node funcParent = new Node(Token.FUNCTION);
    funcParent.addChildToBack(n);
    Var v = globalScope.declare("f", n, null, null);
    assertSame(funcParent, v.getInitialValue());
  }

  @Test
  public void testVarGetInitialValue_assignParent() {
    Node n = nameNode("a1");
    Node valueNode = new Node(Token.TRUE);
    Node assignParent = new Node(Token.ASSIGN);
    assignParent.addChildToBack(n);
    assignParent.addChildToBack(valueNode);
    Var v = globalScope.declare("a1", n, null, null);
    assertSame(valueNode, v.getInitialValue());
  }

  @Test
  public void testVarGetInitialValue_varParent() {
    Node n = nameNode("v1");
    Node valueNode = new Node(Token.TRUE);
    n.addChildToBack(valueNode);
    Node varParent = new Node(Token.VAR);
    varParent.addChildToBack(n);
    Var v = globalScope.declare("v1", n, null, null);
    assertSame(valueNode, v.getInitialValue());
  }

  @Test
  public void testVarGetInitialValue_otherParentReturnsNull() {
    Node n = nameNode("blk");
    Node blockParent = new Node(Token.BLOCK);
    blockParent.addChildToBack(n);
    Var v = globalScope.declare("blk", n, null, null);
    assertNull(v.getInitialValue());
  }

  @Test(expected = NullPointerException.class)
  public void testVarGetInitialValue_noParentThrowsNPE() {
    // getParentNode() คืน null เพราะ nameNode ไม่มี parent -> parent.getType() ทำให้เกิด NPE
    // (บันทึกพฤติกรรมปัจจุบันของโค้ด อาจถือเป็นข้อบกพร่องแฝงเมื่อใช้กับ node ที่ยังไม่ attach)
    Var v = globalScope.declare("noParentInit", nameNode("noParentInit"), null, null);
    v.getInitialValue();
  }

  @Test
  public void testVarSetType_whenInferredTrue() {
    Var v = globalScope.declare("inf", nameNode("inf"), null, null); // inferred==true (default)
    ObjectType type = compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
    v.setType(type);
    assertSame(type, v.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarSetType_whenInferredFalseThrows() {
    Var v = globalScope.declare("decl", nameNode("decl"), null, null, false);
    v.setType(compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS));
  }

  @Test
  public void testVarResolveType_nullTypeNoOp() {
    Var v = globalScope.declare("noType", nameNode("noType"), null, null);
    // type == null -> if(type!=null) เป็น false -> ไม่มีการเรียก errorReporter เลย (ปลอดภัยแม้ผ่าน null)
    v.resolveType(null);
    assertNull(v.getType());
  }

  @Test
  public void testVarIsGlobalIsLocal() {
    Var v = globalScope.declare("gv", nameNode("gv"), null, null);
    assertTrue(v.isGlobal());
    assertFalse(v.isLocal());

    Scope child = new Scope(globalScope, new Node(Token.FUNCTION));
    Var v2 = child.declare("cv2", nameNode("cv2"), null, null);
    assertFalse(v2.isGlobal());
    assertTrue(v2.isLocal());
  }

  @Test
  public void testVarIsExtern_trueWhenInputNull() {
    Var v = globalScope.declare("ext1", nameNode("ext1"), null, null);
    assertTrue(v.isExtern());
  }

  @Test
  public void testVarIsDefine_falseByDefault() {
    Var v = globalScope.declare("def1", nameNode("def1"), null, null); // ไม่มี JSDocInfo
    assertFalse(v.isDefine());
  }

  @Test
  public void testVarIsNoShadow_falseWhenNoInfo() {
    Var v = globalScope.declare("ns1", nameNode("ns1"), null, null);
    assertFalse(v.isNoShadow());
    // หมายเหตุ: กรณี info!=null && info.isNoShadow()==true ต้องสร้าง JSDocInfo จริง
    // ซึ่งรายละเอียดการสร้างไม่มีอยู่ในซอร์สที่ให้มา จึงไม่ครอบคลุม branch นี้
  }

  @Test
  public void testVarGetInputName_nullInput() {
    Var v = globalScope.declare("in1", nameNode("in1"), null, null);
    assertEquals("<non-file>", v.getInputName());
  }

  @Test
  public void testVarGetDeclarationAndGetSymbol() {
    Var v = globalScope.declare("dec1", nameNode("dec1"), null, null);
    assertSame(v, v.getDeclaration());
    assertSame(v, v.getSymbol());
  }

  @Test
  public void testVarEqualsAndHashCode() {
    Node n1 = nameNode("eq1");
    Var v1 = globalScope.declare("eq1", n1, null, null);
    Node n2 = nameNode("eq2");
    Var v2 = globalScope.declare("eq2", n2, null, null);

    assertFalse(v1.equals(v2));
    assertFalse(v1.equals("not a var"));
    assertEquals(n1.hashCode(), v1.hashCode());
  }

  @Test
  public void testVarToString_containsName() {
    Var v = globalScope.declare("ts1", nameNode("ts1"), null, null);
    assertTrue(v.toString().contains("ts1"));
  }

  @Test
  public void testVarGetNameNodeAndJSDocInfoNull() {
    Node n = nameNode("nn1");
    Var v = globalScope.declare("nn1", n, null, null);
    assertSame(n, v.getNameNode());
    assertNull(v.getJSDocInfo());
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGlobalScopeConstructor | constructor `Scope(Node, AbstractCompiler)`, `isGlobal/isLocal/isBottom` = false path |
| testChildScopeConstructor_inheritsThisTypeFromParent | constructor `Scope(Scope,Node)` — else branch (`nodeType==null` → thisType จาก parent) |
| testNestedScopeDepthAndGlobalScope | `getGlobalScope()` loop วน 2 ชั้น |
| testChildScopeConstructor_nullParentThrows | `Preconditions.checkNotNull(parent)` → NPE |
| testChildScopeConstructor_sameRootNodeAsParentThrows | `Preconditions.checkArgument(rootNode != parent.rootNode)` → IllegalArgumentException |
| testBottomScopeConstructor | constructor `Scope(Node, ObjectType)`, `isBottom()`=true |
| testDeclareDefaultInferredTrue | `declare(4-args)` เรียก `declare(5-args, true)` |
| testDeclareExplicitInferredFalse | `declare(5-args, false)` |
| testDeclareEmptyNameThrows | `checkState(name.length()>0)` false branch |
| testDeclareNullNameThrows | `checkState(name!=null && ...)` short-circuit |
| testDeclareDuplicateThrows | `checkState(vars.get(name)==null)` false branch |
| testGetVar_foundInOwnScope | `getVar` branch: found ใน own scope |
| testGetVar_recursesToParentWhenFound | `getVar` branch: parent!=null recurse |
| testGetVar_recursesToParentAndReturnsNullWhenNotFound | recurse แล้วไม่พบ (branch2→branch3) |
| testGetVar_returnsNullWhenNotFoundAndNoParent | `getVar` branch: parent==null คืน null ตรง ๆ |
| testGetSlotAndGetOwnSlot | `getSlot`, `getOwnSlot` ทั้งพบ/ไม่พบ |
| testUndeclareRemovesVar | `undeclare` ปกติ |
| testUndeclare_wrongScopeThrows | `checkState(var.scope==this)` false → IllegalStateException |
| testGetArgumentsVar_singletonAndProperties | `getArgumentsVar` lazy-init if branch + singleton |
| testIsDeclared_allBranches | `isDeclared` ทั้ง 4 combination (containsKey/parent/recurse) |
| testGetVarsAndAllSymbolsAndVarCount | `getVars`, `getAllSymbols`, `getVarCount` |
| testGetReferencesAndGetScope | `getReferences`, `getScope` |
| testUnboundVars_excludedWhenNoParent | predicate branch1 false (`parentNode==null`) |
| testUnboundVars_excludedWhenTypeNotNull | predicate branch2 false (`type!=null`) |
| testUnboundVars_excludedWhenParentIsNotVar | predicate branch3 false (`parent.getType()!=VAR`) |
| testUnboundVars_excludedWhenExtern | predicate branch4 false (`isExtern()==true`) |
| testVarGetInitialValue_functionParent | `getInitialValue` if pType==FUNCTION |
| testVarGetInitialValue_assignParent | `getInitialValue` else-if pType==ASSIGN |
| testVarGetInitialValue_varParent | `getInitialValue` else-if pType==VAR |
| testVarGetInitialValue_otherParentReturnsNull | `getInitialValue` else branch → null |
| testVarGetInitialValue_noParentThrowsNPE | edge case: parent==null → NPE (fault-detection) |
| testVarSetType_whenInferredTrue | `setType` เมื่อ `isTypeInferred()==true` |
| testVarSetType_whenInferredFalseThrows | `checkState(isTypeInferred())` false → exception |
| testVarResolveType_nullTypeNoOp | `resolveType` if(type!=null) false branch |
| testVarIsGlobalIsLocal | `Var.isGlobal/isLocal` ผ่าน scope.isGlobal/isLocal |
| testVarIsExtern_trueWhenInputNull | `isExtern()` input==null branch |
| testVarIsDefine_falseByDefault | `isDefine()` false case |
| testVarIsNoShadow_falseWhenNoInfo | `isNoShadow()` else branch (info==null) |
| testVarGetInputName_nullInput | `getInputName()` if(input==null) branch |
| testVarGetDeclarationAndGetSymbol | `getDeclaration()` nameNode!=null branch, `getSymbol()` |
| testVarEqualsAndHashCode | `equals` false cases (ต่าง var / ไม่ใช่ Var), `hashCode` |
| testVarToString_containsName | `toString()` |
| testVarGetNameNodeAndJSDocInfoNull | `getNameNode()`, `getJSDocInfo()` เมื่อไม่มี jsdoc |

**Branch ที่ไม่ครอบคลุม (ตามที่คอมเมนต์ไว้ในโค้ด):** เงื่อนไข `nodeType.isFunctionType()==true` ใน constructor `Scope(Scope,Node)`, กรณี `isExtern()==false` ของ `CompilerInput` จริง, และกรณี `JSDocInfo.isNoShadow()==true` — เนื่องจากต้องพึ่งพา API ภายในที่ไม่ปรากฏในซอร์สที่ให้มา จึงไม่ทำการเดา behavior ตามข้อกำหนด