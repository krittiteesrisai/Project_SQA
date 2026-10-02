# JUnit 4 Test Suite: JSDocInfoBuilderTest

## หมายเหตุสำคัญก่อนเริ่ม (Assumptions)

เนื่องจากซอร์สโค้ดที่ให้มาไม่มี implementation ของ `JSDocInfo`, `JSTypeExpression`, และ `Node` (มีเฉพาะ `JSDocInfoBuilder`) การเรียกใช้เมธอดบางส่วน (เช่น `documentAuthor`, `documentParam`, `setSuppressions`, `addImplementedInterface`) ที่ delegate ไปยัง `JSDocInfo` จำเป็นต้องอาศัย **contract ที่ระบุไว้ใน Javadoc ของ `JSDocInfoBuilder` เท่านั้น** ส่วนกรณีที่ Javadoc ไม่ได้ระบุ return-contract ไว้ชัดเจน (เช่น `addAuthor`, `recordVersion`, `recordDeprecationReason`, `recordSuppressions`, `recordImplementedInterface`) จะทดสอบเฉพาะ "เส้นทางสำเร็จ" และ**คอมเมนต์กำกับ**ว่าไม่ยืนยัน behavior กรณีซ้ำ เพราะ logic จริงอยู่ใน `JSDocInfo` ซึ่งไม่ได้ให้มา

สำหรับการสร้าง `Node`/`JSTypeExpression` ใช้ `Node.newString(String)` และ `new JSTypeExpression(Node, String)` ตาม static factory / constructor ที่เป็นมาตรฐานของโปรเจกต์นี้ — **หากจริง ๆ แล้ว signature ต่างจากนี้ ต้องปรับโค้ด helper `createType()` เท่านั้น**

```java
package com.google.javascript.rhino;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo.Visibility;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for {@link JSDocInfoBuilder}.
 *
 * หมายเหตุ: เมธอดบางส่วนของ JSDocInfoBuilder delegate ไปยัง JSDocInfo
 * ซึ่ง source ไม่ได้ให้มาในโจทย์นี้ ดังนั้นกรณีที่ Javadoc ของ Builder
 * ไม่ได้ระบุ return-contract ชัดเจน จะทดสอบเฉพาะเส้นทางสำเร็จ (success path)
 * และ comment กำกับไว้ว่าไม่ยืนยัน behavior ของกรณีอื่น
 */
public class JSDocInfoBuilderTest {

  private JSDocInfoBuilder builder;

  @Before
  public void setUp() {
    builder = new JSDocInfoBuilder(true);
  }

  /**
   * Helper สำหรับสร้าง JSTypeExpression
   * สมมติ constructor: JSTypeExpression(Node root, String sourceName)
   * และ Node.newString(String) สร้าง Node แบบ STRING token
   * (ไม่มี source ของ Node/JSTypeExpression ให้ในโจทย์ จึงอ้างอิงจาก
   * รูปแบบมาตรฐานที่ใช้ในโปรเจกต์นี้)
   */
  private static JSTypeExpression createType(String typeName) {
    return new JSTypeExpression(Node.newString(typeName), "test.js");
  }

  // ============================================================
  // Group A: Basic state / build()
  // ============================================================

  @Test
  public void testInitialState() {
    assertFalse(builder.isPopulated());
    assertFalse(builder.isDescriptionRecorded());
    assertFalse(builder.isConstructorRecorded());
    assertFalse(builder.isInterfaceRecorded());
  }

  @Test
  public void testIsPopulatedWithFileOverview_notPopulated() {
    assertFalse(builder.isPopulatedWithFileOverview());
  }

  @Test
  public void testIsPopulatedWithFileOverview_populatedNoOverview() {
    builder.recordDescription("d"); // populated = true, but no file overview
    assertTrue(builder.isPopulated());
    assertFalse(builder.isPopulatedWithFileOverview());
  }

  @Test
  public void testIsPopulatedWithFileOverview_populatedWithOverview() {
    boolean recorded = builder.recordFileOverview("overview text");
    assertTrue(recorded);
    assertTrue(builder.isPopulated());
    assertTrue(builder.isPopulatedWithFileOverview());
  }

  @Test
  public void testIsDescriptionRecorded() {
    assertFalse(builder.isDescriptionRecorded());
    builder.recordDescription("hello");
    assertTrue(builder.isDescriptionRecorded());
  }

  @Test
  public void testBuild_notPopulatedReturnsNull() {
    assertNull(builder.build("source.js"));
  }

  @Test
  public void testBuild_populatedReturnsInfoAndResets() {
    builder.recordDescription("desc");
    JSDocInfo info = builder.build("source.js");
    assertNotNull(info);
    // builder ต้อง reset ตัวเองหลัง build สำเร็จ
    assertFalse(builder.isPopulated());
    assertFalse(builder.isDescriptionRecorded());
    // build ครั้งที่สองทันทีต้องได้ null เพราะยังไม่ populated ใหม่
    assertNull(builder.build("source2.js"));
  }

  @Test
  public void testBuild_defaultVisibilityWhenNotSet() {
    builder.recordDescription("desc"); // populated=true, visibility ยังไม่ถูกตั้ง
    JSDocInfo info = builder.build("source.js");
    assertEquals(Visibility.INHERITED, info.getVisibility());
  }

  @Test
  public void testBuild_keepsExistingVisibility() {
    builder.recordVisibility(Visibility.PRIVATE);
    JSDocInfo info = builder.build("source.js");
    assertEquals(Visibility.PRIVATE, info.getVisibility());
  }

  // ============================================================
  // Group B: markAnnotation / markText / markTypeNode / markName
  // ============================================================

  @Test
  public void testMarkAnnotation_noException() {
    // ไม่มี public getter สำหรับตรวจสอบ Marker ภายใน (ไม่มีใน source ที่ให้มา)
    // จึงทดสอบเพียงว่าเรียกได้โดยไม่มี exception
    builder.markAnnotation("param", 1, 2);
  }

  @Test
  public void testMarkText_withoutCurrentMarker() {
    // currentMarker == null -> เข้า else (ไม่ทำอะไร), ต้องไม่ throw
    builder.markText("some text", 1, 1, 1, 5);
  }

  @Test
  public void testMarkText_withCurrentMarker() {
    builder.markAnnotation("param", 1, 1); // ทำให้ currentMarker != null
    builder.markText("some text", 1, 1, 1, 5);
  }

  @Test
  public void testMarkTypeNode_withoutCurrentMarker() {
    builder.markTypeNode(Node.newString("string"), 1, 1, 5, true);
  }

  @Test
  public void testMarkTypeNode_withCurrentMarker() {
    builder.markAnnotation("type", 1, 1);
    builder.markTypeNode(Node.newString("string"), 1, 1, 5, true);
  }

  @Test
  public void testMarkName_withoutCurrentMarker() {
    builder.markName("paramName", 1, 1);
  }

  @Test
  public void testMarkName_withCurrentMarker() {
    builder.markAnnotation("param", 1, 1);
    builder.markName("paramName", 1, 1);
  }

  // ============================================================
  // Group C: recordBlockDescription
  // ============================================================

  @Test
  public void testRecordBlockDescription_parseDocumentationTrue_setsPopulated() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(true);
    b.recordBlockDescription("block description");
    // ตาม logic ตรงใน Builder: if(parseDocumentation) populated = true;
    assertTrue(b.isPopulated());
  }

  @Test
  public void testRecordBlockDescription_parseDocumentationFalse_doesNotSetPopulated() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordBlockDescription("block description");
    // parseDocumentation == false -> ไม่เข้า if -> populated ต้องยังเป็น false
    assertFalse(b.isPopulated());
  }

  // ============================================================
  // Group D: recordVisibility
  // ============================================================

  @Test
  public void testRecordVisibility_firstCallTrue() {
    assertTrue(builder.recordVisibility(Visibility.PUBLIC));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordVisibility_secondCallFalse() {
    builder.recordVisibility(Visibility.PUBLIC);
    assertFalse(builder.recordVisibility(Visibility.PRIVATE));
  }

  // ============================================================
  // Group E: recordParameter
  // ============================================================

  @Test
  public void testRecordParameter_success() {
    assertTrue(builder.recordParameter("x", createType("number")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordParameter_duplicateNameFails() {
    builder.recordParameter("x", createType("number"));
    assertFalse(builder.recordParameter("x", createType("string")));
  }

  @Test
  public void testRecordParameter_failsWhenSingletonTypeTagPresent() {
    builder.recordType(createType("number")); // ทำให้ hasAnySingletonTypeTags() = true
    assertFalse(builder.recordParameter("x", createType("number")));
  }

  // ============================================================
  // Group F: recordParameterDescription
  // ============================================================

  @Test
  public void testRecordParameterDescription_success() {
    assertTrue(builder.recordParameterDescription("x", "desc"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordParameterDescription_duplicateFails() {
    builder.recordParameterDescription("x", "desc1");
    // ตาม Javadoc: false ถ้า parameter ชื่อเดียวกันถูก define ไปแล้ว
    assertFalse(builder.recordParameterDescription("x", "desc2"));
  }

  // ============================================================
  // Group G: recordTemplateTypeName
  // ============================================================

  @Test
  public void testRecordTemplateTypeName_successAndDuplicate() {
    assertTrue(builder.recordTemplateTypeName("T"));
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordTemplateTypeName("T"));
  }

  // ============================================================
  // Group H: recordThrowType / recordThrowDescription
  // ============================================================

  @Test
  public void testRecordThrowType_success() {
    assertTrue(builder.recordThrowType(createType("Error")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordThrowType_failsWhenHasTypePresent() {
    builder.recordType(createType("number"));
    assertFalse(builder.recordThrowType(createType("Error")));
  }

  @Test
  public void testRecordThrowType_failsWhenHasTypedefPresent() {
    builder.recordTypedef(createType("Object"));
    assertFalse(builder.recordThrowType(createType("Error")));
  }

  @Test
  public void testRecordThrowType_failsWhenHasEnumParamTypePresent() {
    builder.recordEnumParameterType(createType("number"));
    assertFalse(builder.recordThrowType(createType("Error")));
  }

  @Test
  public void testRecordThrowDescription_successAndDuplicate() {
    JSTypeExpression type = createType("Error");
    assertTrue(builder.recordThrowDescription(type, "desc1"));
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordThrowDescription(type, "desc2"));
  }

  // ============================================================
  // Group I: methods without explicit return-contract in Javadoc
  // (ทดสอบเฉพาะ success path — ไม่ยืนยัน behavior กรณีซ้ำ)
  // ============================================================

  @Test
  public void testAddAuthor_success() {
    assertTrue(builder.addAuthor("john@example.com"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testAddReference_success() {
    assertTrue(builder.addReference("http://example.com"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordVersion_success() {
    assertTrue(builder.recordVersion("1.0.0"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordDeprecationReason_success() {
    assertTrue(builder.recordDeprecationReason("use foo instead"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordSuppressions_success() {
    Set<String> suppressions = new HashSet<String>();
    suppressions.add("deprecated");
    assertTrue(builder.recordSuppressions(suppressions));
    assertTrue(builder.isPopulated());
  }

  // ============================================================
  // Group J: recordType / recordTypedef
  // ============================================================

  @Test
  public void testRecordType_success() {
    assertTrue(builder.recordType(createType("number")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordType_nullFails() {
    assertFalse(builder.recordType(null));
  }

  @Test
  public void testRecordType_failsWhenAlreadyHasType() {
    builder.recordType(createType("number"));
    assertFalse(builder.recordType(createType("string")));
  }

  @Test
  public void testRecordType_failsWhenConstructor() {
    builder.recordConstructor();
    assertFalse(builder.recordType(createType("number")));
  }

  @Test
  public void testRecordType_failsWhenInterface() {
    builder.recordInterface();
    assertFalse(builder.recordType(createType("number")));
  }

  @Test
  public void testRecordType_failsWhenParameterPresent() {
    builder.recordParameter("x", createType("number"));
    assertFalse(builder.recordType(createType("string")));
  }

  @Test
  public void testRecordType_failsWhenReturnTypePresent() {
    builder.recordReturnType(createType("number"));
    assertFalse(builder.recordType(createType("string")));
  }

  @Test
  public void testRecordType_failsWhenBaseTypePresent() {
    builder.recordBaseType(createType("Object"));
    assertFalse(builder.recordType(createType("string")));
  }

  @Test
  public void testRecordType_failsWhenThisTypePresent() {
    builder.recordThisType(createType("Object"));
    assertFalse(builder.recordType(createType("string")));
  }

  @Test
  public void testRecordTypedef_success() {
    assertTrue(builder.recordTypedef(createType("Object")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordTypedef_nullFails() {
    assertFalse(builder.recordTypedef(null));
  }

  @Test
  public void testRecordTypedef_failsWhenTypeRelatedTagPresent() {
    builder.recordConstructor();
    assertFalse(builder.recordTypedef(createType("Object")));
  }

  // ============================================================
  // Group K: recordReturnType / recordReturnDescription
  // ============================================================

  @Test
  public void testRecordReturnType_success() {
    assertTrue(builder.recordReturnType(createType("number")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordReturnType_nullFails() {
    assertFalse(builder.recordReturnType(null));
  }

  @Test
  public void testRecordReturnType_duplicateFails() {
    builder.recordReturnType(createType("number"));
    assertFalse(builder.recordReturnType(createType("string")));
  }

  @Test
  public void testRecordReturnType_failsWhenSingletonTagPresent() {
    builder.recordType(createType("number"));
    assertFalse(builder.recordReturnType(createType("string")));
  }

  @Test
  public void testRecordReturnDescription_successAndDuplicate() {
    assertTrue(builder.recordReturnDescription("returns number"));
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordReturnDescription("returns something else"));
  }

  // ============================================================
  // Group L: recordDefineType
  // ============================================================

  @Test
  public void testRecordDefineType_success() {
    assertTrue(builder.recordDefineType(createType("number")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordDefineType_nullFails() {
    assertFalse(builder.recordDefineType(null));
  }

  @Test
  public void testRecordDefineType_failsWhenConstant() {
    builder.recordConstancy();
    assertFalse(builder.recordDefineType(createType("number")));
  }

  @Test
  public void testRecordDefineType_failsWhenAlreadyDefine() {
    builder.recordDefineType(createType("number"));
    assertFalse(builder.recordDefineType(createType("string")));
  }

  @Test
  public void testRecordDefineType_failsWhenInnerRecordTypeFails() {
    // ไม่ constant, ไม่ define, แต่ recordType() ภายในจะ fail
    // เพราะ hasAnyTypeRelatedTags() == true (isConstructor)
    builder.recordConstructor();
    assertFalse(builder.recordDefineType(createType("number")));
  }

  // ============================================================
  // Group M: recordEnumParameterType
  // ============================================================

  @Test
  public void testRecordEnumParameterType_success() {
    assertTrue(builder.recordEnumParameterType(createType("number")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordEnumParameterType_nullFails() {
    assertFalse(builder.recordEnumParameterType(null));
  }

  @Test
  public void testRecordEnumParameterType_failsWhenTypeRelatedTagPresent() {
    builder.recordParameter("x", createType("number"));
    assertFalse(builder.recordEnumParameterType(createType("string")));
  }

  // ============================================================
  // Group N: recordThisType
  // ============================================================

  @Test
  public void testRecordThisType_success() {
    assertTrue(builder.recordThisType(createType("Object")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordThisType_nullFails() {
    assertFalse(builder.recordThisType(null));
  }

  @Test
  public void testRecordThisType_failsWhenSingletonTagPresent() {
    builder.recordType(createType("Object"));
    assertFalse(builder.recordThisType(createType("Object")));
  }

  @Test
  public void testRecordThisType_failsWhenAlreadyHasThisType() {
    builder.recordThisType(createType("Object"));
    assertFalse(builder.recordThisType(createType("Object")));
  }

  // ============================================================
  // Group O: recordBaseType
  // ============================================================

  @Test
  public void testRecordBaseType_success() {
    assertTrue(builder.recordBaseType(createType("Object")));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordBaseType_nullFails() {
    assertFalse(builder.recordBaseType(null));
  }

  @Test
  public void testRecordBaseType_failsWhenSingletonTagPresent() {
    builder.recordType(createType("Object"));
    assertFalse(builder.recordBaseType(createType("Object")));
  }

  @Test
  public void testRecordBaseType_failsWhenAlreadyHasBaseType() {
    builder.recordBaseType(createType("Object"));
    assertFalse(builder.recordBaseType(createType("Object")));
  }

  // ============================================================
  // Group P: recordConstancy
  // ============================================================

  @Test
  public void testRecordConstancy_successAndDuplicate() {
    assertTrue(builder.recordConstancy());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordConstancy());
  }

  // ============================================================
  // Group Q: recordDescription
  // ============================================================

  @Test
  public void testRecordDescription_success() {
    assertTrue(builder.recordDescription("desc"));
    assertTrue(builder.isPopulated());
  }

  @Test
  public void testRecordDescription_nullFails() {
    assertFalse(builder.recordDescription(null));
  }

  @Test
  public void testRecordDescription_duplicateFails() {
    builder.recordDescription("desc1");
    assertFalse(builder.recordDescription("desc2"));
  }

  // ============================================================
  // Group R: recordFileOverview
  // ============================================================

  @Test
  public void testRecordFileOverview_successAndDuplicate() {
    assertTrue(builder.recordFileOverview("overview1"));
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordFileOverview("overview2"));
  }

  // ============================================================
  // Group S: recordHiddenness / recordNoTypeCheck
  // ============================================================

  @Test
  public void testRecordHiddenness_successAndDuplicate() {
    assertTrue(builder.recordHiddenness());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordHiddenness());
  }

  @Test
  public void testRecordNoTypeCheck_successAndDuplicate() {
    assertTrue(builder.recordNoTypeCheck());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordNoTypeCheck());
  }

  // ============================================================
  // Group T: recordConstructor / recordInterface
  // ============================================================

  @Test
  public void testRecordConstructor_success() {
    assertTrue(builder.recordConstructor());
    assertTrue(builder.isPopulated());
    assertTrue(builder.isConstructorRecorded());
  }

  @Test
  public void testRecordConstructor_failsWhenSingletonTagPresent() {
    builder.recordType(createType("number"));
    assertFalse(builder.recordConstructor());
  }

  @Test
  public void testRecordConstructor_failsWhenAlreadyConstructor() {
    builder.recordConstructor();
    assertFalse(builder.recordConstructor());
  }

  @Test
  public void testRecordConstructor_failsWhenAlreadyInterface() {
    builder.recordInterface();
    assertFalse(builder.recordConstructor());
  }

  @Test
  public void testIsConstructorRecorded() {
    assertFalse(builder.isConstructorRecorded());
    builder.recordConstructor();
    assertTrue(builder.isConstructorRecorded());
  }

  @Test
  public void testRecordInterface_success() {
    assertTrue(builder.recordInterface());
    assertTrue(builder.isPopulated());
    assertTrue(builder.isInterfaceRecorded());
  }

  @Test
  public void testRecordInterface_failsWhenSingletonTagPresent() {
    builder.recordType(createType("number"));
    assertFalse(builder.recordInterface());
  }

  @Test
  public void testRecordInterface_failsWhenAlreadyConstructor() {
    builder.recordConstructor();
    assertFalse(builder.recordInterface());
  }

  @Test
  public void testRecordInterface_failsWhenAlreadyInterface() {
    builder.recordInterface();
    assertFalse(builder.recordInterface());
  }

  @Test
  public void testIsInterfaceRecorded() {
    assertFalse(builder.isInterfaceRecorded());
    builder.recordInterface();
    assertTrue(builder.isInterfaceRecorded());
  }

  // ============================================================
  // Group U: simple boolean-flag recorders
  // ============================================================

  @Test
  public void testRecordPreserveTry_successAndDuplicate() {
    assertTrue(builder.recordPreserveTry());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordPreserveTry());
  }

  @Test
  public void testRecordOverride_successAndDuplicate() {
    assertTrue(builder.recordOverride());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordOverride());
  }

  @Test
  public void testRecordNoAlias_successAndDuplicate() {
    assertTrue(builder.recordNoAlias());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordNoAlias());
  }

  @Test
  public void testRecordDeprecated_successAndDuplicate() {
    assertTrue(builder.recordDeprecated());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordDeprecated());
  }

  @Test
  public void testRecordExport_successAndDuplicate() {
    assertTrue(builder.recordExport());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordExport());
  }

  @Test
  public void testRecordNoShadow_successAndDuplicate() {
    assertTrue(builder.recordNoShadow());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordNoShadow());
  }

  @Test
  public void testRecordImplicitCast_successAndDuplicate() {
    assertTrue(builder.recordImplicitCast());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordImplicitCast());
  }

  @Test
  public void testRecordNoSideEffects_successAndDuplicate() {
    assertTrue(builder.recordNoSideEffects());
    assertTrue(builder.isPopulated());
    assertFalse(builder.recordNoSideEffects());
  }

  // ============================================================
  // Group V: hasParameter / recordImplementedInterface
  // ============================================================

  @Test
  public void testHasParameter() {
    assertFalse(builder.hasParameter("x"));
    builder.recordParameter("x", createType("number"));
    assertTrue(builder.hasParameter("x"));
  }

  @Test
  public void testRecordImplementedInterface_success() {
    // ไม่มี Javadoc contract ระบุกรณีซ้ำ จึงทดสอบเฉพาะ success path
    assertTrue(builder.recordImplementedInterface(createType("Iface")));
    assertTrue(builder.isPopulated());
  }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInitialState`, `testIsDescriptionRecorded` | สถานะเริ่มต้นของ `populated`, `getDescription()==null` |
| `testIsPopulatedWithFileOverview_*` (3 tests) | `isPopulated() && hasFileOverview()` ทั้ง 2 เงื่อนไข (false/false, true/false, true/true) |
| `testBuild_*` (4 tests) | `if(populated)` true/false, `populateDefaults`: `getVisibility()==null` true/false, reset state |
| `testMark*_with/withoutCurrentMarker` (7 tests) | `if(currentMarker != null)` ทุกจุดเรียกใน `markText/markTypeNode/markName` และ `markAnnotation` |
| `testRecordBlockDescription_*` (2 tests) | `if(parseDocumentation)` true/false |
| `testRecordVisibility_*` (2 tests) | `getVisibility()==null` true/false |
| `testRecordParameter_*` (3 tests) | `!hasAnySingletonTypeTags() && declareParam(...)` ทุกสาขา |
| `testRecordParameterDescription_*` (2 tests) | `documentParam(...)` true/false (ตาม Javadoc) |
| `testRecordTemplateTypeName_*` | `declareTemplateTypeName(...)` true/false |
| `testRecordThrowType_*` (4 tests) | `!hasAnySingletonTypeTags()` ครอบคลุมทั้ง `hasType`, `hasTypedefType`, `hasEnumParameterType` |
| `testRecordThrowDescription_*` | `documentThrows(...)` true/false |
| `testAddAuthor/addReference/recordVersion/recordDeprecationReason/recordSuppressions_success` | success path เท่านั้น (ไม่ยืนยัน duplicate เพราะไม่มี source) |
| `testRecordType_*` (9 tests) | `type!=null`, และทุก disjunct ของ `hasAnyTypeRelatedTags()` (constructor, interface, param, returnType, baseType, thisType, singleton) |
| `testRecordTypedef_*` (3 tests) | `type!=null`, `hasAnyTypeRelatedTags()` true/false |
| `testRecordReturnType_*` (4 tests) | `jsType!=null`, `getReturnType()==null`, `!hasAnySingletonTypeTags()` |
| `testRecordReturnDescription_*` | `documentReturn(...)` true/false |
| `testRecordDefineType_*` (5 tests) | `type!=null`, `!isConstant()`, `!isDefine()`, inner `recordType()` fail case |
| `testRecordEnumParameterType_*` (3 tests) | `type!=null`, `hasAnyTypeRelatedTags()` true/false |
| `testRecordThisType_*` (4 tests) | `type!=null`, `!hasAnySingletonTypeTags()`, `!hasThisType()` |
| `testRecordBaseType_*` (4 tests) | `jsType!=null`, `!hasAnySingletonTypeTags()`, `!hasBaseType()` |
| `testRecordConstancy_*` | `!isConstant()` true/false |
| `testRecordDescription_*` (3 tests) | `description!=null`, `getDescription()==null` |
| `testRecordFileOverview_*` | `documentFileOverview(...)` true/false |
| `testRecordHiddenness_*`, `testRecordNoTypeCheck_*` | flag true/false |
| `testRecordConstructor_*` (4 tests), `testIsConstructorRecorded` | `!hasAnySingletonTypeTags()`, `!isConstructor()`, `!isInterface()` |
| `testRecordInterface_*` (4 tests), `testIsInterfaceRecorded` | เช่นเดียวกันแบบสมมาตรกับ constructor |
| `testRecordPreserveTry/Override/NoAlias/Deprecated/Export/NoShadow/ImplicitCast/NoSideEffects_*` (8 tests) | รูปแบบ flag `!isXxx()` true/false ของแต่ละเมธอด |
| `testHasParameter` | pass-through getter หลังบันทึก/ก่อนบันทึก parameter |
| `testRecordImplementedInterface_success` | success path เท่านั้น (ไม่มี contract ของ duplicate ใน source) |

**หมายเหตุปิดท้าย:** private methods `hasAnyTypeRelatedTags()` และ `hasAnySingletonTypeTags()` ถูกครอบคลุมทางอ้อมผ่านชุดทดสอบ `testRecordType_*` และ `testRecordThrowType_*` ซึ่งกระตุ้นทุก disjunct ของทั้งสองเมธอดอย่างน้อยหนึ่งครั้ง (true/false)