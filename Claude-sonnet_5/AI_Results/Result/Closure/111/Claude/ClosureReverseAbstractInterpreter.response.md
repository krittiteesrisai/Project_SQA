# หมายเหตุสำคัญก่อนเริ่ม (โปรดอ่าน)

คลาสเป้าหมาย `ClosureReverseAbstractInterpreter` มี dependency ที่ "หนัก" มาก (JSTypeRegistry, FlowScope, Node/AST, CodingConvention) ซึ่งเป็นส่วนหนึ่งของ **source tree ของโปรเจกต์ Closure Compiler เอง** (ไม่ได้อยู่ใน jar ที่ระบุในข้อ 1 แต่ compile อยู่ในโมดูลเดียวกันกับคลาสเป้าหมาย — เหมือนกับที่ `import com.google.javascript.rhino.Node;` ในซอร์สเป้าหมายก็ไม่ได้มาจาก jar ในรายการเช่นกัน)

เนื่องจากไม่มี Mockito/EasyMock อยู่ใน classpath ที่กำหนด และ interface อย่าง `FlowScope`/`ChainableReverseAbstractInterpreter` ไม่ได้แสดงซอร์สมาให้ ผมจึงต้อง**สร้าง fixture จริง**โดยใช้คลาสจริงของ Closure Compiler (`Compiler`, `Scope`, `LinkedFlowScope`, `ClosureCodingConvention`) ซึ่งมีอยู่แน่นอนใน source tree ของ Defects4J Closure-111b — ผมได้ระบุ `// ASSUMPTION` ไว้ทุกจุดที่อ้างอิง API ที่ไม่ได้แสดงในซอร์สที่ให้มา ตามข้อกำหนดที่ 4

```java
package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
// ASSUMPTION: LinkedFlowScope และ Scope เป็นคลาส public ใน com.google.javascript.jscomp
// (ใช้กันแพร่หลายในชุดทดสอบของ Closure Compiler ยุคเดียวกับ Closure-111b)
import com.google.javascript.jscomp.LinkedFlowScope;
import com.google.javascript.jscomp.Scope;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * JUnit4 tests สำหรับ {@link ClosureReverseAbstractInterpreter}
 *
 * หมายเหตุด้าน infrastructure (ASSUMPTION):
 * - {@link Scope} มี constructor (Node root, Compiler compiler) และมี
 *   method declare(String name, Node nameNode, JSType type, CompilerInput input)
 *   สำหรับประกาศตัวแปรพร้อม type อย่างง่ายในบริบททดสอบ
 * - {@link LinkedFlowScope#createEntryLattice(Scope)} ใช้สร้าง FlowScope
 *   เริ่มต้นจาก Scope ปกติ — เป็น pattern มาตรฐานที่ใช้ในชุดทดสอบ
 *   type-inference ของ Closure Compiler รุ่นนี้
 * - หากซอร์สจริงของโปรเจกต์มี signature ต่างจากนี้ ให้ปรับ helper method
 *   ด้านล่าง (createGoogCall / scopeWithX / emptyBlindScope) ตาม API จริง
 */
public class ClosureReverseAbstractInterpreterTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ClosureReverseAbstractInterpreter rai;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    rai = new ClosureReverseAbstractInterpreter(
        new ClosureCodingConvention(), registry);
  }

  // ---------- Helpers: JSType ----------

  private JSType nativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  private JSType unionType(JSTypeNative... ts) {
    JSType[] types = new JSType[ts.length];
    for (int i = 0; i < ts.length; i++) {
      types[i] = nativeType(ts[i]);
    }
    return registry.createUnionType(types);
  }

  // ---------- Helpers: AST Node สำหรับ "goog.<fn>(param)" ----------

  private Node googCall(String fn, Node param) {
    Node googName = Node.newString(Token.NAME, "goog");
    Node prop = Node.newString(fn); // STRING node -> right.isString() == true
    Node getProp = new Node(Token.GETPROP, googName, prop);
    return new Node(Token.CALL, getProp, param);
  }

  private Node xNode() {
    return Node.newString(Token.NAME, "x"); // qualified name
  }

  // ---------- Helpers: FlowScope fixtures ----------

  private Scope newGlobalScope() {
    return new Scope(new Node(Token.BLOCK), compiler); // ASSUMPTION
  }

  private FlowScope emptyBlindScope() {
    return LinkedFlowScope.createEntryLattice(newGlobalScope()); // ASSUMPTION
  }

  private FlowScope scopeWithX(JSType type) {
    Scope s = newGlobalScope();
    s.declare("x", null, type, null); // ASSUMPTION
    return LinkedFlowScope.createEntryLattice(s);
  }

  private JSType xTypeIn(FlowScope scope) {
    if (scope == null || scope.getSlot("x") == null) {
      return null;
    }
    return scope.getSlot("x").getType();
  }

  // =====================================================================
  // 1) Guard: condition.isCall() == false -> ไม่ผ่านเข้าเงื่อนไขใด ๆ เลย
  // =====================================================================

  @Test
  public void testCondition_notCall_fallsThroughUnchanged() {
    Node condition = Node.newString(Token.NAME, "x"); // ไม่ใช่ CALL
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(condition, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 2) Guard: isCall()==true แต่ childCount != 2 (เช่น goog.isArray() ไม่มี arg)
  // =====================================================================

  @Test
  public void testCondition_callWrongChildCount_fallsThroughUnchanged() {
    Node googName = Node.newString(Token.NAME, "goog");
    Node prop = Node.newString("isArray");
    Node getProp = new Node(Token.GETPROP, googName, prop);
    Node call = new Node(Token.CALL, getProp); // childCount == 1

    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 3) Guard: callee ไม่ใช่ GETPROP เช่น foo(x)
  // =====================================================================

  @Test
  public void testCallee_notGetProp_fallsThroughUnchanged() {
    Node callee = Node.newString(Token.NAME, "foo");
    Node call = new Node(Token.CALL, callee, xNode());

    FlowScope blind = scopeWithX(nativeType(STRING_TYPE));
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 4) Guard: param ไม่ใช่ qualified name เช่น goog.isArray(1)
  // =====================================================================

  @Test
  public void testParam_notQualifiedName_fallsThroughUnchanged() {
    Node call = googCall("isArray", Node.newNumber(1));
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 5) Guard: callee.getFirstChild() ไม่ใช่ "goog" เช่น foo.isArray(x)
  // =====================================================================

  @Test
  public void testCalleeLeft_notGoog_fallsThroughUnchanged() {
    Node fooName = Node.newString(Token.NAME, "foo");
    Node prop = Node.newString("isArray");
    Node getProp = new Node(Token.GETPROP, fooName, prop);
    Node call = new Node(Token.CALL, getProp, xNode());

    FlowScope blind = scopeWithX(nativeType(STRING_TYPE));
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 6) Guard: restricters.get(name) == null -> ฟังก์ชันไม่รู้จัก (goog.unknownFunc)
  // =====================================================================

  @Test
  public void testUnknownGoogFunction_fallsThroughUnchanged() {
    Node call = googCall("unknownFunc", xNode());
    FlowScope blind = scopeWithX(nativeType(STRING_TYPE));
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 7) restrictParameter: restriction คืน null -> คืน blindScope เดิม (else branch)
  //    ใช้ isDef กับ outcome=false และ type==null (x ไม่ถูก declare -> paramType null)
  // =====================================================================

  @Test
  public void testRestrictParameter_nullRestriction_returnsBlindScope() {
    Node call = googCall("isDef", xNode());
    FlowScope blind = emptyBlindScope(); // x ไม่มีใน scope -> paramType คาดว่าเป็น null
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    // p.type == null -> restricter คืน null -> restrictParameter คืน blindScope เดิม (else branch)
    assertSame(blind, result);
  }

  // =====================================================================
  // 8) isDef: outcome=true -> ตัด undefined ออก (if branch)
  // =====================================================================

  @Test
  public void testIsDef_outcomeTrue_removesUndefined() {
    JSType type = unionType(STRING_TYPE, VOID_TYPE);
    Node call = googCall("isDef", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope trueScope =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);

    assertNotSame(blind, trueScope); // ควรได้ scope ใหม่ (restriction != null)
    JSType resultType = xTypeIn(trueScope);
    assertNotNull(resultType);
  }

  // =====================================================================
  // 9) isDef: outcome=false, type != null -> greatestSubtype กับ VOID_TYPE (else branch)
  // =====================================================================

  @Test
  public void testIsDef_outcomeFalse_withType() {
    JSType type = unionType(STRING_TYPE, VOID_TYPE);
    Node call = googCall("isDef", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope falseScope =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertNotNull(falseScope);
  }

  // =====================================================================
  // 10) isNull: outcome=true, type != null (if branch มีเงื่อนไขซ้อน p.type != null)
  // =====================================================================

  @Test
  public void testIsNull_outcomeTrue_withType() {
    JSType type = unionType(NULL_TYPE, OBJECT_TYPE);
    Node call = googCall("isNull", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope trueScope =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(trueScope);
  }

  // =====================================================================
  // 11) isNull: outcome=false -> getRestrictedWithoutNull (else branch)
  // =====================================================================

  @Test
  public void testIsNull_outcomeFalse_removesNull() {
    JSType type = unionType(NULL_TYPE, OBJECT_TYPE);
    Node call = googCall("isNull", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope falseScope =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertNotNull(falseScope);
  }

  // =====================================================================
  // 12) isDefAndNotNull: outcome=true (if branch, ตัดทั้ง null และ undefined)
  // =====================================================================

  @Test
  public void testIsDefAndNotNull_outcomeTrue() {
    JSType type = unionType(NULL_VOID, OBJECT_TYPE);
    Node call = googCall("isDefAndNotNull", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope trueScope =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(trueScope);
  }

  // =====================================================================
  // 13) isDefAndNotNull: outcome=false, type==null -> คืน null (else branch, p.type==null)
  // =====================================================================

  @Test
  public void testIsDefAndNotNull_outcomeFalse_typeNull() {
    Node call = googCall("isDefAndNotNull", xNode());
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertSame(blind, result);
  }

  // =====================================================================
  // 14) isString / isBoolean / isNumber / isFunction -> getRestrictedByTypeOfResult
  //     ทดสอบทั้ง outcome=true/false เพื่อคุม branch ภายในของแต่ละ restricter
  // =====================================================================

  @Test
  public void testIsString_outcomeTrueAndFalse() {
    JSType type = unionType(STRING_TYPE, NUMBER_TYPE);
    Node call = googCall("isString", xNode());
    FlowScope blind = scopeWithX(type);

    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, true));
    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, false));
  }

  @Test
  public void testIsBoolean_outcomeTrueAndFalse() {
    JSType type = nativeType(ALL_TYPE);
    Node call = googCall("isBoolean", xNode());
    FlowScope blind = scopeWithX(type);

    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, true));
    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, false));
  }

  @Test
  public void testIsNumber_outcomeTrueAndFalse() {
    JSType type = nativeType(ALL_TYPE);
    Node call = googCall("isNumber", xNode());
    FlowScope blind = scopeWithX(type);

    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, true));
    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, false));
  }

  @Test
  public void testIsFunction_outcomeTrueAndFalse() {
    JSType type = nativeType(ALL_TYPE);
    Node call = googCall("isFunction", xNode());
    FlowScope blind = scopeWithX(type);

    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, true));
    assertNotNull(rai.getPreciserScopeKnowingConditionOutcome(call, blind, false));
  }

  // =====================================================================
  // 15) isArray: p.type == null -> outcome ? ARRAY_TYPE : null
  // =====================================================================

  @Test
  public void testIsArray_typeNull_outcomeTrue_returnsArrayType() {
    Node call = googCall("isArray", xNode());
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    // restriction != null -> ต้องได้ scope ใหม่ (createChildFlowScope)
    assertNotSame(blind, result);
  }

  @Test
  public void testIsArray_typeNull_outcomeFalse_returnsBlindScope() {
    Node call = googCall("isArray", xNode());
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    // restriction == null -> restrictParameter คืน blindScope เดิม
    assertSame(blind, result);
  }

  // =====================================================================
  // 16) isArray: p.type != null -> ใช้ visitor (restrictToArrayVisitor / NotArray)
  // =====================================================================

  @Test
  public void testIsArray_withType_outcomeTrue() {
    JSType type = unionType(ARRAY_TYPE, NULL_TYPE);
    Node call = googCall("isArray", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  @Test
  public void testIsArray_withType_outcomeFalse() {
    JSType type = unionType(ARRAY_TYPE, NULL_TYPE);
    Node call = googCall("isArray", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertNotNull(result);
  }

  // =====================================================================
  // 17) isObject: p.type == null -> outcome ? OBJECT_TYPE : null
  // =====================================================================

  @Test
  public void testIsObject_typeNull_outcomeTrue_returnsObjectType() {
    Node call = googCall("isObject", xNode());
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotSame(blind, result);
  }

  @Test
  public void testIsObject_typeNull_outcomeFalse_returnsBlindScope() {
    Node call = googCall("isObject", xNode());
    FlowScope blind = emptyBlindScope();
    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertSame(blind, result);
  }

  // =====================================================================
  // 18) isObject: p.type != null -> ใช้ visitor (restrictToObjectVisitor / NotObject)
  // =====================================================================

  @Test
  public void testIsObject_withType_outcomeTrue() {
    JSType type = nativeType(ALL_TYPE);
    Node call = googCall("isObject", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, true);
    assertNotNull(result);
  }

  @Test
  public void testIsObject_withType_outcomeFalse() {
    JSType type = nativeType(ALL_TYPE);
    Node call = googCall("isObject", xNode());
    FlowScope blind = scopeWithX(type);

    FlowScope result =
        rai.getPreciserScopeKnowingConditionOutcome(call, blind, false);
    assertNotNull(result);
  }

  // =====================================================================
  // 19) Boundary: constructor ไม่ throw เมื่อ CodingConvention ปกติ + registry จริง
  // =====================================================================

  @Test
  public void testConstructor_doesNotThrow() {
    ClosureReverseAbstractInterpreter localRai =
        new ClosureReverseAbstractInterpreter(new ClosureCodingConvention(), registry);
    assertNotNull(localRai);
  }
}
```

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testCondition_notCall_fallsThroughUnchanged` | `condition.isCall()` == false |
| `testCondition_callWrongChildCount_fallsThroughUnchanged` | `isCall()`==true, `getChildCount()==2` == false |
| `testCallee_notGetProp_fallsThroughUnchanged` | `callee.isGetProp()` == false |
| `testParam_notQualifiedName_fallsThroughUnchanged` | `param.isQualifiedName()` == false |
| `testCalleeLeft_notGoog_fallsThroughUnchanged` | `left.isName() && "goog".equals(...)` == false |
| `testUnknownGoogFunction_fallsThroughUnchanged` | `restricter != null` == false |
| `testRestrictParameter_nullRestriction_returnsBlindScope` | `restrictParameter`: `type != null` == false (else) |
| `testIsDef_outcomeTrue_removesUndefined` | isDef, `p.outcome==true` (if) |
| `testIsDef_outcomeFalse_withType` | isDef, `p.outcome==false`, `p.type!=null` |
| `testIsNull_outcomeTrue_withType` | isNull, `p.outcome==true`, `p.type!=null` |
| `testIsNull_outcomeFalse_removesNull` | isNull, `p.outcome==false` (else) |
| `testIsDefAndNotNull_outcomeTrue` | isDefAndNotNull, outcome==true |
| `testIsDefAndNotNull_outcomeFalse_typeNull` | isDefAndNotNull, outcome==false, `p.type==null` |
| `testIsString_outcomeTrueAndFalse` | isString: outcome true/false |
| `testIsBoolean_outcomeTrueAndFalse` | isBoolean: outcome true/false |
| `testIsNumber_outcomeTrueAndFalse` | isNumber: outcome true/false |
| `testIsFunction_outcomeTrueAndFalse` | isFunction: outcome true/false |
| `testIsArray_typeNull_outcomeTrue_returnsArrayType` | isArray, `p.type==null`, outcome==true |
| `testIsArray_typeNull_outcomeFalse_returnsBlindScope` | isArray, `p.type==null`, outcome==false |
| `testIsArray_withType_outcomeTrue` | isArray, `p.type!=null`, visitor=restrictToArrayVisitor |
| `testIsArray_withType_outcomeFalse` | isArray, `p.type!=null`, visitor=restrictToNotArrayVisitor |
| `testIsObject_typeNull_outcomeTrue_returnsObjectType` | isObject, `p.type==null`, outcome==true |
| `testIsObject_typeNull_outcomeFalse_returnsBlindScope` | isObject, `p.type==null`, outcome==false |
| `testIsObject_withType_outcomeTrue` | isObject, `p.type!=null`, visitor=restrictToObjectVisitor |
| `testIsObject_withType_outcomeFalse` | isObject, `p.type!=null`, visitor=restrictToNotObjectVisitor |
| `testConstructor_doesNotThrow` | Boundary: constructor + `ImmutableMap.Builder` build สำเร็จ |

**ข้อจำกัดที่ต้องเปิดเผยตรงไปตรงมา:** โค้ดข้างต้นพึ่งพา API ของ `Scope`, `LinkedFlowScope`, `ClosureCodingConvention` ที่**ไม่ได้ปรากฏในซอร์สที่ให้มา** — ผมได้ระบุ `// ASSUMPTION` ไว้ทุกจุด หากในซอร์สจริงของโปรเจกต์ constructor/method signature เหล่านี้ต่างออกไป (เช่น `Scope` อาจต้องสร้างผ่าน `SyntacticScopeCreator` หรือ `declare()` มี parameter ต่างกัน) จำเป็นต้องปรับ helper methods (`newGlobalScope`, `scopeWithX`, `emptyBlindScope`) ให้ตรงกับ API จริงในซอร์สทรีของ Closure-111b โดยไม่ต้องแก้ไข test-case logic ส่วนอื่น