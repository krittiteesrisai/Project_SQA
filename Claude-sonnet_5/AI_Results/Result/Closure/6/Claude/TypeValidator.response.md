# หมายเหตุสำคัญก่อนเริ่ม (สมมติฐาน/ข้อจำกัดที่ต้องเปิดเผยตามข้อกำหนดที่ 4)

เนื่องจาก `TypeValidator` พึ่งพา infrastructure ของ Closure Compiler อย่างมาก (`Compiler`, `NodeTraversal`, `Node`, `JSTypeRegistry`, `JSType`) ซึ่ง **ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง** ผมจำเป็นต้องตั้งสมมติฐานบางอย่างที่มาจากความรู้ทั่วไปของ Closure Compiler API (ไม่ใช่จากซอร์สที่ให้มา) ขอระบุไว้ตรงนี้อย่างชัดเจน:

1. `new Compiler()` และ `compiler.getTypeRegistry()` สามารถเรียกได้โดยไม่ต้อง `init()` เต็มรูปแบบ (lazy-init) — ถ้าไม่จริง ทุก test จะ fail ตั้งแต่ `setUp()`
2. `NodeTraversal` มี constructor `NodeTraversal(AbstractCompiler, Callback)` และมี nested class `NodeTraversal.AbstractPostOrderCallback`
3. `Node.newString(int type, String str)` และ constructor `Node(int type, Node child...)` มีอยู่จริง (มาตรฐานของ Rhino/Closure `Node`)
4. ความหมายของ `matchesNumberContext()/matchesObjectContext()/matchesStringContext()` สำหรับ native type บางตัว (เช่น `OBJECT_TYPE` ไม่ผ่าน number-context, `STRING_TYPE` ผ่าน object-context) อ้างอิงจาก ECMA-262 coercion ที่ javadoc ของแต่ละเมธอดอธิบายไว้ ไม่ได้เดาแบบไม่มีที่มา แต่ก็ **ไม่ยืนยัน 100%**
5. เมธอดที่ต้องพึ่ง `Scope`, `Var`, `FunctionType` constructor/interface, `CompilerInput` แบบลึก (`expectSuperType`, `expectCanOverride`, `expectUndeclaredVariable`, `expectAllInterfaceProperties`/`expectInterfaceProperty`) **ไม่ได้เขียนเทส** เพราะไม่มีทางสร้าง object เหล่านี้ได้อย่างปลอดภัยจากซอร์สที่ให้มาเพียงอย่างเดียว (จะเป็นการเดา behavior)
6. branch เรื่อง `isStruct()` ใน `expectIndexMatch` และ `containsForwardDeclaredUnresolvedName` (NoResolvedType) ใน `expectNotNullOrUndefined` **ข้าม** เพราะต้องพึ่ง annotation `@struct` / forward-declared type ที่สร้างยากโดยไม่ parse ซอร์ส JS จริง

---

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Iterables;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link TypeValidator}
 *
 * หมายเหตุ: ดูคอมเมนต์สมมติฐานด้านบนของไฟล์คำตอบ (นอกซอร์สนี้) เกี่ยวกับ API
 * ของ Compiler/NodeTraversal/Node ที่ไม่ได้อยู่ใน source ของ TypeValidator เอง
 */
public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;
  private NodeTraversal t;

  @Before
  public void setUp() {
    compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    // ปิดการรายงานจริงไปยัง compiler เพื่อตัดการพึ่งพา ErrorManager ที่ยังไม่ได้ init()
    // (การเรียก setShouldReport(false) เป็น public API ที่มีอยู่ในซอร์สจริง)
    validator.setShouldReport(false);

    t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override public void visit(NodeTraversal nt, Node n, Node parent) {}
    });
  }

  // ---------- helpers ----------

  private JSType type(JSTypeNative nativeType) {
    return registry.getNativeType(nativeType);
  }

  private JSType union(JSTypeNative a, JSTypeNative b) {
    return registry.createUnionType(a, b);
  }

  private Node nameNode(String name) {
    return Node.newString(Token.NAME, name);
  }

  private int mismatchCount() {
    return Iterables.size(validator.getMismatches());
  }

  // ============================================================
  // getMismatches / setShouldReport
  // ============================================================

  @Test
  public void testGetMismatches_initiallyEmpty() {
    assertFalse(validator.getMismatches().iterator().hasNext());
  }

  @Test
  public void testSetShouldReport_toggleDoesNotThrow() {
    validator.setShouldReport(true);
    validator.setShouldReport(false);
    // ไม่มี getter ให้ตรวจสอบ state ตรง ๆ จึงตรวจแค่ว่าไม่ throw
  }

  // ============================================================
  // expectObject
  // ============================================================

  @Test
  public void testExpectObject_stringMatchesObjectContext_returnsTrue() {
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    boolean result = validator.expectObject(t, nameNode("x"), stringType, "msg");
    assertTrue(result);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectObject_nullType_returnsFalse_mismatchFilteredByNullRestriction() {
    // สมมติฐาน: null/void ไม่ผ่าน matchesObjectContext() -> เข้า branch mismatch()
    // แต่ registerMismatch() จะ restrictByNotNullOrUndefined() ก่อนเช็ค canAssignTo
    // ทำให้ found กลายเป็น bottom type ซึ่ง assignable กับทุก type -> ไม่ถูกเพิ่มลง mismatches
    JSType nullType = type(JSTypeNative.NULL_TYPE);
    boolean result = validator.expectObject(t, nameNode("x"), nullType, "msg");
    assertFalse(result);
    assertEquals(0, mismatchCount());
  }

  // ============================================================
  // expectActualObject
  // ============================================================

  @Test
  public void testExpectActualObject_objectType_noMismatch() {
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    validator.expectActualObject(t, nameNode("x"), objectType, "msg");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectActualObject_numberType_mismatchRegistered() {
    // number ไม่ isObject() -> mismatch() ถูกเรียก และไม่มี null component จึงไม่ถูก filter
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectActualObject(t, nameNode("x"), numberType, "msg");
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectAnyObject
  // ============================================================

  @Test
  public void testExpectAnyObject_objectType_noMismatch() {
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    validator.expectAnyObject(t, nameNode("x"), objectType, "msg");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectAnyObject_numberType_noExceptionOutcomeUncertain() {
    // หมายเหตุ: ไม่แน่ใจว่า NO_OBJECT_TYPE.isSubtype(NUMBER_TYPE) จะเป็น true/false
    // (bottom-type ของ object อาจถูกนับเป็น universal subtype หรือไม่ก็ได้)
    // จึงตรวจสอบเพียงว่าไม่มี exception เกิดขึ้น ไม่ assert ผลลัพธ์ที่แน่ชัด
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectAnyObject(t, nameNode("x"), numberType, "msg");
  }

  // ============================================================
  // expectString / expectNumber
  // ============================================================

  @Test
  public void testExpectString_number_matchesStringContext_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectString(t, nameNode("x"), numberType, "msg");
    assertEquals(0, mismatchCount());
    // หมายเหตุ: ไม่ได้เทส branch mismatch เพราะหาชนิดที่ matchesStringContext()==false
    // อย่างมั่นใจไม่ได้จากซอร์สที่ให้มา (แทบทุกชนิดแปลงเป็น string ได้ตาม ECMA-262)
  }

  @Test
  public void testExpectNumber_number_matchesNumberContext_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectNumber(t, nameNode("x"), numberType, "msg");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectNumber_object_mismatchRegistered() {
    // สมมติฐาน: OBJECT_TYPE ไม่ผ่าน matchesNumberContext()
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    validator.expectNumber(t, nameNode("x"), objectType, "msg");
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectBitwiseable
  // ============================================================

  @Test
  public void testExpectBitwiseable_number_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectBitwiseable(t, nameNode("x"), numberType, "msg");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectBitwiseable_object_mismatchRegistered() {
    // OBJECT_TYPE ไม่ผ่าน matchesNumberContext() และไม่ isSubtype(allValueTypes)
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    validator.expectBitwiseable(t, nameNode("x"), objectType, "msg");
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectStringOrNumber
  // ============================================================

  @Test
  public void testExpectStringOrNumber_number_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectStringOrNumber(t, nameNode("x"), numberType, "msg");
    assertEquals(0, mismatchCount());
    // หมายเหตุ: ไม่ได้เทส branch mismatch เพราะต้องหาชนิดที่ fail ทั้ง number-context
    // และ string-context พร้อมกัน ซึ่งไม่มั่นใจว่ามี native type ใดที่ fail ทั้งคู่
  }

  // ============================================================
  // expectNotNullOrUndefined
  // ============================================================

  @Test
  public void testExpectNotNullOrUndefined_numberType_returnsTrue() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    boolean result = validator.expectNotNullOrUndefined(
        t, nameNode("x"), numberType, "msg", numberType);
    assertTrue(result);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectNotNullOrUndefined_unknownType_returnsTrue() {
    // isUnknownType() -> skip เงื่อนไขทั้งหมด
    JSType unknownType = type(JSTypeNative.UNKNOWN_TYPE);
    boolean result = validator.expectNotNullOrUndefined(
        t, nameNode("x"), unknownType, "msg", type(JSTypeNative.NUMBER_TYPE));
    assertTrue(result);
  }

  @Test
  public void testExpectNotNullOrUndefined_noType_returnsTrue() {
    // isNoType() -> skip เงื่อนไขทั้งหมด
    JSType noType = type(JSTypeNative.NO_TYPE);
    boolean result = validator.expectNotNullOrUndefined(
        t, nameNode("x"), noType, "msg", type(JSTypeNative.NUMBER_TYPE));
    assertTrue(result);
  }

  @Test
  public void testExpectNotNullOrUndefined_nullType_returnsFalse_mismatchAlwaysFiltered() {
    // n เป็น NAME (ไม่ใช่ GETPROP) จึงไม่เข้า branch พิเศษของ getProp/inGlobalScope
    // เนื่องจาก found (subtype ของ null|undefined) หลัง restrictByNotNullOrUndefined()
    // จะกลายเป็น bottom type เสมอ -> ไม่ถูกเพิ่มลง mismatches (ตามโครงสร้างของ registerMismatch)
    JSType nullType = type(JSTypeNative.NULL_TYPE);
    boolean result = validator.expectNotNullOrUndefined(
        t, nameNode("x"), nullType, "msg", type(JSTypeNative.NUMBER_TYPE));
    assertFalse(result);
    assertEquals(0, mismatchCount());
  }

  // ============================================================
  // expectSwitchMatchesCase
  // ============================================================

  @Test
  public void testExpectSwitchMatchesCase_sameType_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    Node caseNode = new Node(Token.CASE, Node.newNumber(1));
    validator.expectSwitchMatchesCase(t, caseNode, numberType, numberType);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectSwitchMatchesCase_differentType_mismatchRegistered() {
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    Node caseNode = new Node(Token.CASE, Node.newNumber(1));
    validator.expectSwitchMatchesCase(t, caseNode, stringType, numberType);
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectCanAssignTo
  // ============================================================

  @Test
  public void testExpectCanAssignTo_assignable_returnsTrue() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    JSType numOrStr = union(JSTypeNative.NUMBER_TYPE, JSTypeNative.STRING_TYPE);
    boolean result = validator.expectCanAssignTo(t, nameNode("x"), numberType, numOrStr, "msg");
    assertTrue(result);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectCanAssignTo_notAssignable_mismatchRegistered() {
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    boolean result = validator.expectCanAssignTo(t, nameNode("x"), stringType, numberType, "msg");
    assertFalse(result);
    assertEquals(1, mismatchCount());
  }

  // หมายเหตุ: ไม่ได้เทส branch ที่ leftType/rightType เป็น constructor หรือ enum type
  // เพราะการสร้าง FunctionType แบบ constructor/enum ที่ถูกต้องต้องใช้ API ที่ไม่ปรากฏในซอร์สนี้

  // ============================================================
  // expectCanAssignToPropertyOf
  // ============================================================

  @Test
  public void testExpectCanAssignToPropertyOf_assignable_returnsTrue() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    boolean result = validator.expectCanAssignToPropertyOf(
        t, nameNode("n"), numberType, numberType, nameNode("owner"), "prop");
    assertTrue(result);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_notAssignable_mismatchRegistered() {
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    boolean result = validator.expectCanAssignToPropertyOf(
        t, nameNode("n"), stringType, numberType, nameNode("owner"), "prop");
    assertFalse(result);
    assertEquals(1, mismatchCount());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_leftIsNoType_skipsCheck() {
    JSType noType = type(JSTypeNative.NO_TYPE);
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    boolean result = validator.expectCanAssignToPropertyOf(
        t, nameNode("n"), stringType, noType, nameNode("owner"), "prop");
    assertTrue(result);
    assertEquals(0, mismatchCount());
  }

  // ============================================================
  // expectArgumentMatchesParameter
  // ============================================================

  @Test
  public void testExpectArgumentMatchesParameter_assignable_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    Node callee = nameNode("foo");
    Node callNode = new Node(Token.CALL, callee);
    validator.expectArgumentMatchesParameter(
        t, nameNode("arg"), numberType, numberType, callNode, 1);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectArgumentMatchesParameter_notAssignable_mismatchRegistered() {
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    Node callee = nameNode("foo");
    Node callNode = new Node(Token.CALL, callee);
    validator.expectArgumentMatchesParameter(
        t, nameNode("arg"), stringType, numberType, callNode, 1);
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectCanCast
  // ============================================================

  @Test
  public void testExpectCanCast_assignableEitherDirection_noMismatch() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    JSType numOrStr = union(JSTypeNative.NUMBER_TYPE, JSTypeNative.STRING_TYPE);
    validator.expectCanCast(t, nameNode("x"), numberType, numOrStr);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectCanCast_notAssignableEitherDirection_mismatchRegistered() {
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    validator.expectCanCast(t, nameNode("x"), numberType, stringType);
    assertEquals(1, mismatchCount());
  }

  // ============================================================
  // expectValidTypeofName
  // ============================================================

  @Test
  public void testExpectValidTypeofName_noException() {
    validator.expectValidTypeofName(t, nameNode("x"), "foo");
    // ไม่กระทบ mismatches list
    assertEquals(0, mismatchCount());
  }

  // ============================================================
  // getReadableJSTypeName
  // ============================================================

  @Test
  public void testGetReadableJSTypeName_nameNode_returnsQualifiedName() {
    Node n = nameNode("myVar"); // ไม่ set JSType -> default UNKNOWN_TYPE
    String result = validator.getReadableJSTypeName(n, false);
    assertEquals("myVar", result);
  }

  @Test
  public void testGetReadableJSTypeName_nonNameNode_returnsTypeToString() {
    // Token.TRUE ไม่มี qualifiedName และไม่ใช่ function type -> fallback ไป type.toString()
    Node n = new Node(Token.TRUE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    n.setJSType(numberType);
    String result = validator.getReadableJSTypeName(n, false);
    assertEquals(numberType.toString(), result);
  }

  // หมายเหตุ: ไม่ได้เทส branch GETPROP (prototype-chain walk) และ branch "function"
  // fallback เพราะต้องสร้าง ObjectType ที่มี constructor/prototype chain ที่ถูกต้อง
  // ซึ่งไม่มั่นใจว่าจะสร้างถูกต้องโดยไม่พึ่ง API ที่ไม่ปรากฏในซอร์สนี้

  // ============================================================
  // expectIndexMatch
  // ============================================================

  private Node getElemNode() {
    Node objNode = nameNode("obj");
    Node idxNode = nameNode("idx");
    return new Node(Token.GETELEM, objNode, idxNode);
  }

  @Test
  public void testExpectIndexMatch_unknownObjectType_routesToStringOrNumber_noException() {
    JSType unknownType = type(JSTypeNative.UNKNOWN_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectIndexMatch(t, getElemNode(), unknownType, numberType);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectIndexMatch_arrayType_routesToExpectNumber_noMismatch() {
    JSType arrayType = type(JSTypeNative.ARRAY_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectIndexMatch(t, getElemNode(), arrayType, numberType);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectIndexMatch_arrayType_routesToExpectNumber_mismatchRegistered() {
    // ใช้สมมติฐานเดียวกับ testExpectNumber_object_mismatchRegistered
    JSType arrayType = type(JSTypeNative.ARRAY_TYPE);
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    validator.expectIndexMatch(t, getElemNode(), arrayType, objectType);
    assertEquals(1, mismatchCount());
  }

  @Test
  public void testExpectIndexMatch_objectType_routesToExpectString_noMismatch() {
    JSType objectType = type(JSTypeNative.OBJECT_TYPE);
    JSType stringType = type(JSTypeNative.STRING_TYPE);
    validator.expectIndexMatch(t, getElemNode(), objectType, stringType);
    assertEquals(0, mismatchCount());
  }

  @Test
  public void testExpectIndexMatch_nullType_finalElseBranch_mismatchAlwaysFiltered() {
    // objType = NULL_TYPE -> dereference() คาดว่าเป็น null, matchesObjectContext() = false
    // -> ตก final else "only arrays or objects can be accessed"
    // แต่เนื่องจาก found มี null component เสมอ -> ถูก filter ออกจาก mismatches list
    JSType nullType = type(JSTypeNative.NULL_TYPE);
    JSType numberType = type(JSTypeNative.NUMBER_TYPE);
    validator.expectIndexMatch(t, getElemNode(), nullType, numberType);
    assertEquals(0, mismatchCount());
  }
}
```

---

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGetMismatches_initiallyEmpty | mismatches list เริ่มต้นว่าง |
| testSetShouldReport_toggleDoesNotThrow | setter `setShouldReport` |
| testExpectObject_stringMatchesObjectContext_returnsTrue | `expectObject` true branch |
| testExpectObject_nullType_returnsFalse_... | `expectObject` mismatch branch + registerMismatch null-filter |
| testExpectActualObject_objectType_noMismatch | `expectActualObject` true branch (`isObject()==true`) |
| testExpectActualObject_numberType_mismatchRegistered | `expectActualObject` mismatch branch |
| testExpectAnyObject_objectType_noMismatch | `expectAnyObject` no-mismatch branch |
| testExpectAnyObject_numberType_noExceptionOutcomeUncertain | `expectAnyObject` (สมมติฐานไม่ชัด — สมอกาสัง) |
| testExpectString_number_matchesStringContext_noMismatch | `expectString` true branch |
| testExpectNumber_number_matchesNumberContext_noMismatch | `expectNumber` true branch |
| testExpectNumber_object_mismatchRegistered | `expectNumber` mismatch branch |
| testExpectBitwiseable_number_noMismatch | `expectBitwiseable` true branch |
| testExpectBitwiseable_object_mismatchRegistered | `expectBitwiseable` mismatch branch |
| testExpectStringOrNumber_number_noMismatch | `expectStringOrNumber` true branch |
| testExpectNotNullOrUndefined_numberType_returnsTrue | `!isSubtype(nullOrUndefined)` true branch |
| testExpectNotNullOrUndefined_unknownType_returnsTrue | `isUnknownType()` short-circuit |
| testExpectNotNullOrUndefined_noType_returnsTrue | `isNoType()` short-circuit |
| testExpectNotNullOrUndefined_nullType_returnsFalse_... | mismatch branch (non-GetProp) + null-filter ใน registerMismatch |
| testExpectSwitchMatchesCase_sameType_noMismatch | `canTestForShallowEqualityWith` true branch |
| testExpectSwitchMatchesCase_differentType_mismatchRegistered | mismatch branch |
| testExpectCanAssignTo_assignable_returnsTrue | assignable true branch |
| testExpectCanAssignTo_notAssignable_mismatchRegistered | not-assignable, non constructor/enum branch |
| testExpectCanAssignToPropertyOf_assignable_returnsTrue | assignable true branch |
| testExpectCanAssignToPropertyOf_notAssignable_mismatchRegistered | mismatch + ownerType non-function-prototype branch |
| testExpectCanAssignToPropertyOf_leftIsNoType_skipsCheck | `leftType.isNoType()` skip branch |
| testExpectArgumentMatchesParameter_assignable_noMismatch | assignable branch |
| testExpectArgumentMatchesParameter_notAssignable_mismatchRegistered | mismatch branch + `getReadableJSTypeName` call path |
| testExpectCanCast_assignableEitherDirection_noMismatch | assignable-either-direction branch |
| testExpectCanCast_notAssignableEitherDirection_mismatchRegistered | mismatch branch via `t.makeError` |
| testExpectValidTypeofName_noException | เรียก `report()` โดยตรง (shouldReport=false) |
| testGetReadableJSTypeName_nameNode_returnsQualifiedName | `qualifiedName != null` branch |
| testGetReadableJSTypeName_nonNameNode_returnsTypeToString | fallback `return type.toString()` branch |
| testExpectIndexMatch_unknownObjectType_... | `objType.isUnknownType()` branch |
| testExpectIndexMatch_arrayType_..._noMismatch | `dereferenced.isArrayType()` branch (no mismatch) |
| testExpectIndexMatch_arrayType_..._mismatchRegistered | `dereferenced.isArrayType()` branch (mismatch) |
| testExpectIndexMatch_objectType_...noMismatch | `objType.matchesObjectContext()` branch |
| testExpectIndexMatch_nullType_finalElseBranch_... | final `else` mismatch branch + null-filter |

**Branch ที่ตั้งใจไม่ครอบคลุม (พร้อมเหตุผลในคอมเมนต์โค้ด):** `isStruct()` ใน `expectIndexMatch`, custom index-type (`getIndexType()!=null`) branch, constructor/enum branch ใน `expectCanAssignTo(PropertyOf)`, GETPROP-based branch ใน `expectNotNullOrUndefined` และ `getReadableJSTypeName`, `containsForwardDeclaredUnresolvedName`, และเมธอด `expectSuperType`/`expectCanOverride`/`expectUndeclaredVariable`/`expectAllInterfaceProperties`/`expectInterfaceProperty` ทั้งหมด เนื่องจากต้องพึ่ง `Scope`, `Var`, `FunctionType` constructor/interface หรือ struct/forward-declared type ที่ไม่สามารถสร้างได้อย่างปลอดภัยจากซอร์สที่ให้มาเพียงอย่างเดียว