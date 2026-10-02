package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for {@link NamedType}.
 *
 * หมายเหตุสำคัญ:
 * 1) NamedType เป็นคลาส package-private จึงต้องวาง test ไว้ใน package เดียวกัน
 *    (com.google.javascript.rhino.jstype)
 * 2) บาง API ของ JSTypeRegistry / StaticScope (เช่น isLastGeneration() ค่า default,
 *    forwardDeclareType(String), isForwardDeclaredType(String), getSlot(String))
 *    ไม่ได้แสดงอยู่ใน source ของ NamedType ที่ให้มาโดยตรง แต่ถูกอ้างอิงถึงในซอร์สโค้ดเป้าหมาย
 *    จึงจำเป็นต้องมีอยู่จริงในโปรเจกต์เพื่อให้ NamedType.java compile ได้ ผู้เขียนอ้างอิงตาม
 *    พฤติกรรมที่คาดว่าเป็น default ของโปรเจกต์ (isLastGeneration() = true โดย default,
 *    isForwardDeclaredType() = false ถ้าไม่เคยเรียก forwardDeclareType() มาก่อน)
 *    หากพฤติกรรมจริงต่างไปจากนี้ ผลบาง assertion อาจต้องปรับปรุง
 */
public class NamedTypeTest {

  private JSTypeRegistry registry;
  private RecordingErrorReporter errorReporter;

  @Before
  public void setUp() {
    errorReporter = new RecordingErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullReference_throwsNPE() {
    // Preconditions.checkNotNull(reference) ต้องโยน NullPointerException
    new NamedType(registry, null, "source.js", 1, 1);
  }

  @Test
  public void testConstructor_setsFieldsAndDefaults() {
    NamedType type = new NamedType(registry, "Foo", "source.js", 10, 20);

    assertEquals("Foo", type.getReferenceName());
    assertTrue(type.hasReferenceName());
    assertTrue(type.isNamedType());
    assertTrue(type.isNominalType());
    // ก่อน resolve ตัว proxy ต้องอ้างถึง UNKNOWN_TYPE ตามที่ constructor ส่งให้ super
    assertTrue(type.getReferencedType().isUnknownType());
  }

  @Test
  public void testHashCode_equalsReferenceHashCode() {
    NamedType type = new NamedType(registry, "Bar", "source.js", 1, 1);
    assertEquals("Bar".hashCode(), type.hashCode());
  }

  @Test
  public void testToStringHelper_returnsReferenceForBothFlags() {
    NamedType type = new NamedType(registry, "my.Reference", "source.js", 1, 1);
    // ไม่ว่า forAnnotations เป็น true หรือ false ต้องคืนค่าเดิมคือ reference
    assertEquals("my.Reference", type.toStringHelper(true));
    assertEquals("my.Reference", type.toStringHelper(false));
  }

  // ---------------------------------------------------------------------
  // defineProperty()
  // ---------------------------------------------------------------------

  @Test
  public void testDefineProperty_beforeResolve_returnsTrueAndStoresContinuation() {
    NamedType type = new NamedType(registry, "Unresolved.Type", "source.js", 1, 1);
    boolean result = type.defineProperty("prop", null, true, null);
    // branch: !isResolved() -> true, สร้าง continuation แล้ว return true
    assertTrue(result);
  }

  @Test
  public void testDefineProperty_multipleCallsBeforeResolve_reusesContinuationList() {
    NamedType type = new NamedType(registry, "Unresolved.Type2", "source.js", 1, 1);
    // เรียกครั้งแรก -> propertyContinuations == null -> สร้าง list ใหม่ (branch A)
    assertTrue(type.defineProperty("prop1", null, true, null));
    // เรียกครั้งที่สอง -> propertyContinuations != null -> เพิ่มเข้า list เดิม (branch B, loop coverage)
    assertTrue(type.defineProperty("prop2", null, true, null));
  }

  @Test
  public void testDefineProperty_afterResolve_delegatesToSuper() {
    NamedType type = new NamedType(registry, "Object", "source.js", 1, 1);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();
    type.resolveInternal(errorReporter, emptyScope);
    assertTrue(type.isResolved());

    JSType propType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    // branch: isResolved() == true -> super.defineProperty(...)
    boolean result = type.defineProperty("newProp", propType, true, null);
    assertTrue(result);
  }

  // ---------------------------------------------------------------------
  // setValidator()
  // ---------------------------------------------------------------------

  @Test
  public void testSetValidator_beforeResolve_returnsTrueWithoutApplyingImmediately() {
    NamedType type = new NamedType(registry, "Unresolved.Type3", "source.js", 1, 1);
    final List<JSType> applied = new ArrayList<JSType>();

    boolean result = type.setValidator(new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        applied.add(input);
        return true;
      }
    });

    // branch: !isResolved() -> เก็บ validator ไว้ก่อน ไม่เรียก apply ทันที
    assertTrue(result);
    assertTrue(applied.isEmpty());
  }

  @Test
  public void testSetValidator_afterResolve_delegatesToSuper() {
    NamedType type = new NamedType(registry, "Object", "source.js", 1, 1);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();
    type.resolveInternal(errorReporter, emptyScope);
    assertTrue(type.isResolved());

    // branch: isResolved() == true -> super.setValidator(validator)
    boolean result = type.setValidator(new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    });
    assertTrue(result);
  }

  // ---------------------------------------------------------------------
  // resolveInternal(): resolve สำเร็จผ่าน registry (resolveViaRegistry)
  // ---------------------------------------------------------------------

  @Test
  public void testResolveInternal_resolvesViaRegistry_whenTypeExistsInRegistry() {
    // "Object" เป็นชื่อ native type ที่ลงทะเบียนไว้ใน JSTypeRegistry อยู่แล้ว
    NamedType type = new NamedType(registry, "Object", "source.js", 1, 1);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();

    JSType result = type.resolveInternal(errorReporter, emptyScope);

    // branch: resolved == true -> ไม่เข้า resolveViaProperties
    assertTrue(type.isResolved());
    assertNotNull(result);
    assertTrue(errorReporter.warnings.isEmpty());
  }

  // ---------------------------------------------------------------------
  // resolveInternal(): resolve ไม่สำเร็จ, ไม่ forward-declare -> ต้องมี warning
  // ---------------------------------------------------------------------

  @Test
  public void testResolveInternal_unresolvedType_notForwardDeclared_producesWarning() {
    NamedType type = new NamedType(registry, "Totally.Unknown.Type", "source.js", 5, 7);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();

    type.resolveInternal(errorReporter, emptyScope);

    // branch: resolveViaRegistry คืน false -> ไปที่ resolveViaProperties
    // -> lookupViaProperties คืน null (getSlot คืน null) -> handleUnresolvedType
    // -> isForwardDeclared == false -> warning "Bad type annotation..."
    assertTrue(type.isResolved());
    assertFalse(errorReporter.warnings.isEmpty());
    assertTrue(errorReporter.warnings.get(0).contains("Bad type annotation"));
  }

  // ---------------------------------------------------------------------
  // resolveInternal(): resolve ไม่สำเร็จ แต่ forward-declare ไว้แล้ว -> ไม่ warning
  // ---------------------------------------------------------------------

  @Test
  public void testResolveInternal_unresolvedType_forwardDeclared_noWarning() {
    String reference = "Forward.Declared.Type";
    // สมมติฐาน: JSTypeRegistry มี forwardDeclareType(String) ที่ทำให้
    // isForwardDeclaredType(reference) คืน true ในภายหลัง (ดูคอมเมนต์บนสุดของไฟล์)
    registry.forwardDeclareType(reference);

    NamedType type = new NamedType(registry, reference, "source.js", 1, 1);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();

    type.resolveInternal(errorReporter, emptyScope);

    // branch: isForwardDeclared == true -> ไม่มี warning, set NO_RESOLVED_TYPE แทน
    assertTrue(type.isResolved());
    assertTrue(errorReporter.warnings.isEmpty());
  }

  // ---------------------------------------------------------------------
  // lookupViaProperties: reference component แรกว่าง (".Foo")
  // ---------------------------------------------------------------------

  @Test
  public void testResolveInternal_referenceStartsWithDot_lookupReturnsNull_producesWarning() {
    // reference ".Foo" -> componentNames[0].length() == 0 -> lookupViaProperties คืน null ทันที
    NamedType type = new NamedType(registry, ".Foo", "source.js", 1, 1);
    StaticScope<JSType> emptyScope = new EmptyStaticScope();

    type.resolveInternal(errorReporter, emptyScope);

    assertTrue(type.isResolved());
    assertFalse(errorReporter.warnings.isEmpty());
  }

  // ---------------------------------------------------------------------
  // Helper doubles
  // ---------------------------------------------------------------------

  private static class RecordingErrorReporter implements ErrorReporter {
    final List<String> warnings = new ArrayList<String>();
    final List<String> errors = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
      errors.add(message);
    }
  }

  /**
   * StaticScope ที่ไม่มี slot ใด ๆ อยู่เลย ใช้สำหรับกรณีที่ resolveViaProperties
   * ควร fail (getSlot() คืน null เสมอ)
   *
   * หมายเหตุ: signature ของ interface StaticScope<T> อ้างอิงจากการใช้งานจริงใน
   * NamedType.resolveInternal / lookupViaProperties เท่านั้น
   */
  private static class EmptyStaticScope implements StaticScope<JSType> {
    @Override
    public StaticScope<JSType> getParentScope() {
      return null;
    }

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      return null;
    }
  }
}
