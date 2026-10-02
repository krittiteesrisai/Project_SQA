package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Unit tests for {@link ObjectType}.
 *
 * หมายเหตุ (Assumptions) เกี่ยวกับ API ที่ไม่ได้แสดงในซอร์สโค้ดของ ObjectType
 * โดยตรง แต่จำเป็นต้องใช้เพื่อสร้าง environment สำหรับทดสอบ:
 * - JSTypeRegistry มี constructor รับ ErrorReporter ตัวเดียว
 * - ErrorReporter มี method warning/error สี่พารามิเตอร์ (message, sourceName, line, lineOffset)
 * - JSDocInfoBuilder(boolean).build() ใช้สร้าง JSDocInfo instance ได้
 * - Node มี constructor รับค่า Token คงที่ (เช่น Token.STRING) และมี isFromExterns()/getStaticSourceFile()
 * - JSType#toObjectType() คืนค่า "this" เมื่อ instance เป็น ObjectType (พฤติกรรมทั่วไปที่รู้จักของ Closure Compiler)
 * - JSType#isEquivalentTo() ใช้ reference identity เป็น fallback เมื่อไม่ได้ override
 * - JSType#getJSDocInfo() (ค่า default ของ super) คืน null
 * ถ้า assumption ใดผิดจากพฤติกรรมจริง อาจต้องปรับปรุง test ที่เกี่ยวข้อง
 */
public class ObjectTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {}

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {}
    });
  }

  private TestObjectType newObj() {
    return new TestObjectType(registry);
  }

  // ---------------------------------------------------------------------
  // Stub implementations
  // ---------------------------------------------------------------------

  /** Minimal concrete subclass used to exercise ObjectType's own logic. */
  private static class TestObjectType extends ObjectType {
    private final Map<String, Property> props = new HashMap<>();
    private ObjectType implicitPrototype;
    private String referenceName;
    private boolean nativeObjectType;
    private Iterable<ObjectType> extendedInterfaces; // null => use super default
    private FunctionType ownerFunction;
    boolean definePropertyResult = true;

    String lastDefinedPropName;
    JSType lastDefinedType;
    boolean lastDefinedInferred;
    Node lastDefinedNode;

    TestObjectType(JSTypeRegistry registry) {
      super(registry);
    }

    void setImplicitPrototypeForTest(ObjectType p) { this.implicitPrototype = p; }
    void setReferenceNameForTest(String n) { this.referenceName = n; }
    void setNativeObjectTypeForTest(boolean b) { this.nativeObjectType = b; }
    void setExtendedInterfacesForTest(Iterable<ObjectType> it) { this.extendedInterfaces = it; }
    void setDefinePropertyResult(boolean b) { this.definePropertyResult = b; }

    void putProperty(String name, JSType type, boolean inferred) {
      props.put(name, new Property(name, type, inferred, null));
    }

    @Override public Property getSlot(String name) { return props.get(name); }
    @Override public String getReferenceName() { return referenceName; }
    @Override public FunctionType getConstructor() { return null; }
    @Override public ObjectType getImplicitPrototype() { return implicitPrototype; }

    @Override
    boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
      lastDefinedPropName = propertyName;
      lastDefinedType = type;
      lastDefinedInferred = inferred;
      lastDefinedNode = propertyNode;
      props.put(propertyName, new Property(propertyName, type, inferred, propertyNode));
      return definePropertyResult;
    }

    @Override
    public JSType getPropertyType(String propertyName) {
      Property p = props.get(propertyName);
      return p == null ? null : p.getType();
    }

    @Override public boolean hasProperty(String propertyName) { return props.containsKey(propertyName); }

    @Override
    public boolean isPropertyTypeInferred(String propertyName) {
      Property p = props.get(propertyName);
      return p != null && p.isTypeInferred();
    }

    @Override
    public boolean isPropertyTypeDeclared(String propertyName) {
      Property p = props.get(propertyName);
      return p != null && !p.isTypeInferred();
    }

    @Override public int getPropertiesCount() { return props.size(); }

    @Override
    void collectPropertyNames(Set<String> set) {
      set.addAll(props.keySet());
    }

    @Override public boolean isNativeObjectType() { return nativeObjectType; }

    @Override
    public Iterable<ObjectType> getCtorExtendedInterfaces() {
      return extendedInterfaces == null ? super.getCtorExtendedInterfaces() : extendedInterfaces;
    }

    @Override public FunctionType getOwnerFunction() { return ownerFunction; }
  }

  /** Subclass forcing a fixed isUnknownType() result, for branch simulation. */
  private static class FixedUnknownType extends TestObjectType {
    private final boolean fixedUnknown;

    FixedUnknownType(JSTypeRegistry registry, boolean fixedUnknown) {
      super(registry);
      this.fixedUnknown = fixedUnknown;
    }

    @Override public boolean isUnknownType() { return fixedUnknown; }
  }

  // ---------------------------------------------------------------------
  // Trivial getters
  // ---------------------------------------------------------------------

  @Test
  public void testTrivialGetters() {
    TestObjectType obj = newObj();
    assertNull(obj.getRootNode());
    assertNull(obj.getTypeOfThis());
    assertNull(obj.getParameterType());
    assertNull(obj.getIndexType());
  }

  @Test
  public void testGetParentScope() {
    TestObjectType obj = newObj();
    TestObjectType proto = newObj();
    obj.setImplicitPrototypeForTest(proto);
    assertSame(proto, obj.getParentScope());
  }

  @Test
  public void testGetParentScope_null() {
    TestObjectType obj = newObj();
    assertNull(obj.getParentScope());
  }

  // ---------------------------------------------------------------------
  // getJSDocInfo / setJSDocInfo
  // ---------------------------------------------------------------------

  @Test
  public void testGetJSDocInfo_ownDocInfo() {
    TestObjectType obj = newObj();
    JSDocInfo info = new JSDocInfoBuilder(false).build();
    obj.setJSDocInfo(info);
    assertSame(info, obj.getJSDocInfo());
  }

  @Test
  public void testGetJSDocInfo_delegatesToPrototype() {
    TestObjectType proto = newObj();
    JSDocInfo protoInfo = new JSDocInfoBuilder(false).build();
    proto.setJSDocInfo(protoInfo);

    TestObjectType obj = newObj();
    obj.setImplicitPrototypeForTest(proto);

    assertSame(protoInfo, obj.getJSDocInfo());
  }

  @Test
  public void testGetJSDocInfo_noneAvailable() {
    TestObjectType obj = newObj();
    // ไม่มี docInfo ของตัวเอง และไม่มี implicit prototype -> fallback ไป super.getJSDocInfo()
    assertNull(obj.getJSDocInfo());
  }

  // ---------------------------------------------------------------------
  // detectImplicitPrototypeCycle
  // ---------------------------------------------------------------------

  @Test
  public void testDetectImplicitPrototypeCycle_noCycle() {
    TestObjectType a = newObj();
    TestObjectType b = newObj();
    a.setImplicitPrototypeForTest(b);
    b.setImplicitPrototypeForTest(null);
    assertFalse(a.detectImplicitPrototypeCycle());
  }

  @Test
  public void testDetectImplicitPrototypeCycle_withCycle() {
    TestObjectType a = newObj();
    TestObjectType b = newObj();
    a.setImplicitPrototypeForTest(b);
    b.setImplicitPrototypeForTest(a);
    assertTrue(a.detectImplicitPrototypeCycle());
  }

  // ---------------------------------------------------------------------
  // getNormalizedReferenceName / getDisplayName / createDelegateSuffix / hasReferenceName
  // ---------------------------------------------------------------------

  @Test
  public void testGetNormalizedReferenceName_null() {
    TestObjectType obj = newObj();
    obj.setReferenceNameForTest(null);
    assertNull(obj.getNormalizedReferenceName());
  }

  @Test
  public void testGetNormalizedReferenceName_noParen() {
    TestObjectType obj = newObj();
    obj.setReferenceNameForTest("Foo");
    assertEquals("Foo", obj.getNormalizedReferenceName());
  }

  @Test
  public void testGetNormalizedReferenceName_withParen() {
    TestObjectType obj = newObj();
    obj.setReferenceNameForTest("Foo(delegate)");
    assertEquals("Foo", obj.getNormalizedReferenceName());
  }

  @Test
  public void testGetDisplayName() {
    TestObjectType obj = newObj();
    obj.setReferenceNameForTest("Bar(x)");
    assertEquals("Bar", obj.getDisplayName());
  }

  @Test
  public void testCreateDelegateSuffix() {
    assertEquals("(x)", ObjectType.createDelegateSuffix("x"));
  }

  @Test
  public void testHasReferenceName_defaultFalse() {
    TestObjectType obj = newObj();
    assertFalse(obj.hasReferenceName());
  }

  // ---------------------------------------------------------------------
  // testForEquality (การันตีเฉพาะว่าไม่ throw / มีผลลัพธ์ที่ชัดเจน
  // เนื่องจากผลลัพธ์จริงขึ้นกับ super.testForEquality ที่ไม่มีในซอร์สนี้)
  // ---------------------------------------------------------------------

  @Test
  public void testTestForEquality_withNumberType() {
    TestObjectType obj = newObj();
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    TernaryValue result = obj.testForEquality(numberType);
    assertNotNull(result);
  }

  @Test
  public void testTestForEquality_withNullType() {
    TestObjectType obj = newObj();
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    TernaryValue result = obj.testForEquality(nullType);
    assertNotNull(result);
  }

  // ---------------------------------------------------------------------
  // getOwnSlot
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnSlot_present() {
    TestObjectType obj = newObj();
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    obj.putProperty("x", numberType, false);
    Property slot = obj.getOwnSlot("x");
    assertNotNull(slot);
    assertEquals("x", slot.getName());
  }

  @Test
  public void testGetOwnSlot_absent() {
    TestObjectType obj = newObj();
    assertNull(obj.getOwnSlot("missing"));
  }

  // ---------------------------------------------------------------------
  // defineDeclaredProperty / defineInferredProperty
  // ---------------------------------------------------------------------

  @Test
  public void testDefineDeclaredProperty() {
    TestObjectType obj = newObj();
    JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
    obj.setDefinePropertyResult(true);
    boolean result = obj.defineDeclaredProperty("x", type, null);
    assertTrue(result);
    assertEquals("x", obj.lastDefinedPropName);
    assertSame(type, obj.lastDefinedType);
    assertFalse(obj.lastDefinedInferred);
  }

  @Test
  public void testDefineDeclaredProperty_falseResult() {
    TestObjectType obj = newObj();
    obj.setDefinePropertyResult(false);
    JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
    boolean result = obj.defineDeclaredProperty("x", type, null);
    assertFalse(result);
  }

  @Test
  public void testDefineInferredProperty_newProperty() {
    TestObjectType obj = newObj();
    JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
    boolean result = obj.defineInferredProperty("y", type, null);
    assertTrue(result);
    assertSame(type, obj.lastDefinedType);
    assertTrue(obj.lastDefinedInferred);
  }

  @Test
  public void testDefineInferredProperty_existingPropertyWithNullType() {
    TestObjectType obj = newObj();
    obj.putProperty("z", null, true); // hasProperty()==true แต่ getPropertyType()==null
    JSType newType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    obj.defineInferredProperty("z", newType, null);
    assertSame(newType, obj.lastDefinedType); // originalType==null -> ใช้ type เดิมที่ส่งมา
  }

  @Test
  public void testDefineInferredProperty_existingPropertyMerged() {
    TestObjectType obj = newObj();
    JSType originalType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    obj.putProperty("w", originalType, true);
    JSType newType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    obj.defineInferredProperty("w", newType, null);
    JSType expectedMerged = originalType.getLeastSupertype(newType);
    assertEquals(expectedMerged, obj.lastDefinedType);
  }

  // ---------------------------------------------------------------------
  // hasOwnProperty / hasOwnDeclaredProperty / isPropertyInExterns / removeProperty / etc.
  // ---------------------------------------------------------------------

  @Test
  public void testHasOwnProperty() {
    TestObjectType obj = newObj();
    obj.putProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
    assertTrue(obj.hasOwnProperty("a"));
    assertFalse(obj.hasOwnProperty("b"));
  }

  @Test
  public void testHasOwnDeclaredProperty_declared() {
    TestObjectType obj = newObj();
    obj.putProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
    assertTrue(obj.hasOwnDeclaredProperty("a"));
  }

  @Test
  public void testHasOwnDeclaredProperty_inferredOnly() {
    TestObjectType obj = newObj();
    obj.putProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true);
    assertFalse(obj.hasOwnDeclaredProperty("a"));
  }

  @Test
  public void testHasOwnDeclaredProperty_notPresent() {
    TestObjectType obj = newObj();
    assertFalse(obj.hasOwnDeclaredProperty("missing"));
  }

  @Test
  public void testDefaultsNotOverridden() {
    TestObjectType obj = newObj();
    assertFalse(obj.removeProperty("x"));
    assertNull(obj.getPropertyNode("x"));
    assertNull(obj.getOwnPropertyJSDocInfo("x"));
    obj.setPropertyJSDocInfo("x", null); // no-op ตาม default, ต้องไม่ throw
    assertFalse(obj.isPropertyInExterns("x"));
  }

  // ---------------------------------------------------------------------
  // findPropertyType
  // ---------------------------------------------------------------------

  @Test
  public void testFindPropertyType_present() {
    TestObjectType obj = newObj();
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    obj.putProperty("a", type, false);
    assertSame(type, obj.findPropertyType("a"));
  }

  @Test
  public void testFindPropertyType_absent() {
    TestObjectType obj = newObj();
    assertNull(obj.findPropertyType("missing"));
  }

  // ---------------------------------------------------------------------
  // getOwnPropertyNames / getPropertyNames
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnPropertyNames_defaultEmpty() {
    TestObjectType obj = newObj();
    assertTrue(obj.getOwnPropertyNames().isEmpty());
  }

  @Test
  public void testGetPropertyNames_sorted() {
    TestObjectType obj = newObj();
    obj.putProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
    obj.putProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), false);
    Set<String> names = obj.getPropertyNames();
    assertEquals(Arrays.asList("a", "b"), new ArrayList<>(names));
  }

  // ---------------------------------------------------------------------
  // isImplicitPrototype
  // ---------------------------------------------------------------------

  @Test
  public void testIsImplicitPrototype_self() {
    TestObjectType a = newObj();
    assertTrue(a.isImplicitPrototype(a));
  }

  @Test
  public void testIsImplicitPrototype_inChain() {
    TestObjectType a = newObj();
    TestObjectType b = newObj();
    a.setImplicitPrototypeForTest(b);
    b.setImplicitPrototypeForTest(null);
    assertTrue(a.isImplicitPrototype(b));
  }

  @Test
  public void testIsImplicitPrototype_notInChain() {
    TestObjectType a = newObj();
    TestObjectType b = newObj();
    TestObjectType c = newObj();
    a.setImplicitPrototypeForTest(b);
    b.setImplicitPrototypeForTest(null);
    assertFalse(a.isImplicitPrototype(c));
  }

  // ---------------------------------------------------------------------
  // getPossibleToBooleanOutcomes / isObject
  // ---------------------------------------------------------------------

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    TestObjectType obj = newObj();
    assertEquals(BooleanLiteralSet.TRUE, obj.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testIsObject() {
    TestObjectType obj = newObj();
    assertTrue(obj.isObject());
  }

  // ---------------------------------------------------------------------
  // isUnknownType (ครบทุกสาขา)
  // ---------------------------------------------------------------------

  @Test
  public void testIsUnknownType_nullPrototypeNoInterfaces() {
    TestObjectType obj = newObj();
    assertFalse(obj.isUnknownType());
  }

  @Test
  public void testIsUnknownType_nullPrototypeWithUnknownInterface() {
    TestObjectType obj = newObj();
    obj.setExtendedInterfacesForTest(
        ImmutableSet.<ObjectType>of(new FixedUnknownType(registry, true)));
    assertTrue(obj.isUnknownType());
  }

  @Test
  public void testIsUnknownType_nativePrototype() {
    TestObjectType proto = newObj();
    proto.setNativeObjectTypeForTest(true);
    TestObjectType obj = newObj();
    obj.setImplicitPrototypeForTest(proto);
    assertFalse(obj.isUnknownType());
  }

  @Test
  public void testIsUnknownType_delegatesToNonNativePrototype_false() {
    TestObjectType proto = newObj();
    TestObjectType obj = newObj();
    obj.setImplicitPrototypeForTest(proto);
    assertFalse(obj.isUnknownType());
  }

  @Test
  public void testIsUnknownType_delegatesToNonNativePrototype_true() {
    FixedUnknownType proto = new FixedUnknownType(registry, true);
    TestObjectType obj = newObj();
    obj.setImplicitPrototypeForTest(proto);
    assertTrue(obj.isUnknownType());
  }

  // ---------------------------------------------------------------------
  // hasCachedValues / clearCachedValues
  // ---------------------------------------------------------------------

  @Test
  public void testHasCachedValues_defaultFalse() {
    TestObjectType obj = newObj();
    assertFalse(obj.hasCachedValues());
  }

  @Test
  public void testHasCachedValues_afterIsUnknownTypeCall() {
    TestObjectType obj = newObj();
    obj.isUnknownType();
    assertTrue(obj.hasCachedValues());
  }

  @Test
  public void testClearCachedValues() {
    TestObjectType obj = newObj();
    obj.isUnknownType();
    assertTrue(obj.hasCachedValues());
    obj.clearCachedValues();
    assertFalse(obj.hasCachedValues());
  }

  // ---------------------------------------------------------------------
  // isNativeObjectType / cast
  // ---------------------------------------------------------------------

  @Test
  public void testIsNativeObjectType_defaultFalse() {
    TestObjectType obj = newObj();
    assertFalse(obj.isNativeObjectType());
  }

  @Test
  public void testCast_null() {
    assertNull(ObjectType.cast(null));
  }

  @Test
  public void testCast_nonNullObjectType() {
    TestObjectType obj = newObj();
    assertSame(obj, ObjectType.cast(obj));
  }

  // ---------------------------------------------------------------------
  // isFunctionPrototypeType / getOwnerFunction / setOwnerFunction
  // ---------------------------------------------------------------------

  @Test
  public void testIsFunctionPrototypeType_defaultFalse() {
    TestObjectType obj = newObj();
    assertNull(obj.getOwnerFunction());
    assertFalse(obj.isFunctionPrototypeType());
    // หมายเหตุ: สาขา true (owner function != null) ต้องใช้ FunctionType instance
    // จริงซึ่งเป็น abstract class ที่ไม่มีรายละเอียดในซอร์สนี้ จึงข้ามการทดสอบ
  }

  @Test
  public void testSetOwnerFunction_defaultNoOp() {
    TestObjectType obj = newObj();
    obj.setOwnerFunction(null); // ใช้ implementation เดิม (no-op) ของ ObjectType
    assertNull(obj.getOwnerFunction());
  }

  // ---------------------------------------------------------------------
  // getCtorImplementedInterfaces / getCtorExtendedInterfaces (default)
  // ---------------------------------------------------------------------

  @Test
  public void testGetCtorImplementedInterfaces_defaultEmpty() {
    TestObjectType obj = newObj();
    assertTrue(Iterables.isEmpty(obj.getCtorImplementedInterfaces()));
  }

  @Test
  public void testGetCtorExtendedInterfaces_defaultEmpty() {
    TestObjectType obj = newObj();
    assertTrue(Iterables.isEmpty(obj.getCtorExtendedInterfaces()));
  }

  // ---------------------------------------------------------------------
  // ObjectType.Property (nested class)
  // ---------------------------------------------------------------------

  @Test
  public void testProperty_withNullNode() {
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ObjectType.Property prop = new ObjectType.Property("foo", type, true, null);
    assertEquals("foo", prop.getName());
    assertSame(type, prop.getType());
    assertTrue(prop.isTypeInferred());
    assertNull(prop.getNode());
    assertNull(prop.getSourceFile());     // propertyNode == null -> null
    assertSame(prop, prop.getSymbol());
    assertNull(prop.getDeclaration());    // propertyNode == null -> null
    assertFalse(prop.isFromExterns());    // propertyNode == null -> false
    assertNull(prop.getJSDocInfo());
  }

  @Test
  public void testProperty_setType() {
    JSType type1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType type2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ObjectType.Property prop = new ObjectType.Property("foo", type1, false, null);
    prop.setType(type2);
    assertSame(type2, prop.getType());
    assertFalse(prop.isTypeInferred());
  }

  @Test
  public void testProperty_setNodeAndDeclaration() {
    ObjectType.Property prop = new ObjectType.Property(
        "foo", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertNull(prop.getDeclaration()); // ยังไม่มี node -> null

    // Assumption: Node มี constructor รับค่า Token คงที่ (เช่น Token.STRING)
    Node node = new Node(Token.STRING);
    prop.setNode(node);
    assertSame(node, prop.getNode());
    assertSame(prop, prop.getDeclaration()); // node != null -> คืน this
    assertFalse(prop.isFromExterns());       // มี node แต่ไม่ได้ตั้ง externs flag
  }

  @Test
  public void testProperty_setJSDocInfo() {
    ObjectType.Property prop = new ObjectType.Property(
        "foo", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    JSDocInfo info = new JSDocInfoBuilder(false).build();
    prop.setJSDocInfo(info);
    assertSame(info, prop.getJSDocInfo());
  }
}
