# วิเคราะห์และหมายเหตุสำคัญก่อนเขียนเทส

**ข้อสังเกตเรื่อง fault ที่ต้องดักจับ:** ใน `getMetadata()` มีโค้ด
```java
if (b == null && idx == null && def == null) { ... }
return PropertyMetadata.construct(b.booleanValue(), desc, idx, def);
```
ถ้า `b == null` แต่ `idx` หรือ `def` ไม่เป็น null จะเกิด **NullPointerException ที่ `b.booleanValue()`** — นี่คือ fault จริงของซอร์สที่ให้มา (Defects4J JacksonDatabind-73b) ผมเขียนเทสเพื่อ "จับ" พฤติกรรมนี้ไว้อย่างชัดเจน

**ข้อสมมติที่ต้องกำกับ (ตามข้อกำหนดที่ 4):**
- คลาส `AnnotatedField/AnnotatedMethod/AnnotatedParameter/AnnotatedConstructor/AnnotationMap/ObjectIdInfo` ในซอร์ส Jackson-databind มักเป็น `final class` จึงใช้ **PowerMockito** (ซึ่งอยู่ใน classpath ที่ให้มา) แทน Mockito ธรรมดา เพื่อ mock ได้แน่นอนไม่ว่าจะ final หรือไม่
- เมธอด `getOwner()` (บน `AnnotatedParameter`), `withAnnotations(...)` ไม่ทราบ return type ที่แน่ชัด จึงใช้ `doReturn(...).when(mock).method(...)` เพื่อหลีกเลี่ยงปัญหาชนิดข้อมูลตอน compile
- สมมติว่า `PropertyName`, `PropertyMetadata` (มี `getDescription()`, `isRequired()`), `JsonInclude.Value.construct(Include,Include)` มี API ตามที่ใช้ทั่วไปใน Jackson (คอมเมนต์กำกับไว้ในโค้ด)

```java
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectIdInfo;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;

/**
 * Unit tests for {@link POJOPropertyBuilder} (Defects4J JacksonDatabind-73b).
 *
 * หมายเหตุ: ใช้ PowerMockito ในการ mock คลาส Annotated* / AnnotationMap / ObjectIdInfo
 * เพราะสันนิษฐานว่าเป็น final class ตาม convention ของ jackson-databind internal classes
 * (ดูคอมเมนต์ในแต่ละ helper method)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        AnnotatedField.class, AnnotatedMethod.class, AnnotatedParameter.class,
        AnnotatedConstructor.class, AnnotationMap.class, ObjectIdInfo.class
})
public class POJOPropertyBuilderTest {

    // ---- fixtures -------------------------------------------------------

    @SuppressWarnings("unchecked")
    private MapperConfig<?> config = mock(MapperConfig.class);
    private AnnotationIntrospector ai = mock(AnnotationIntrospector.class);

    private static class Base {}
    private static class Sub extends Base {}
    private static class Other {}

    private final PropertyName NAME_A = new PropertyName("aProp");
    private final PropertyName NAME_B = new PropertyName("bProp");

    @Before
    public void setUp() {
        ai = mock(AnnotationIntrospector.class);
    }

    private POJOPropertyBuilder newBuilder(boolean forSer, PropertyName name) {
        return new POJOPropertyBuilder(config, ai, forSer, name);
    }

    private POJOPropertyBuilder newBuilderNoAI(boolean forSer, PropertyName name) {
        return new POJOPropertyBuilder(config, null, forSer, name);
    }

    // ---- mock helpers (PowerMock, final-class safe) ----------------------

    private AnnotatedMethod mockMethod(Class<?> declClass, String name) {
        AnnotatedMethod m = PowerMockito.mock(AnnotatedMethod.class);
        PowerMockito.doReturn(declClass).when(m).getDeclaringClass();
        PowerMockito.doReturn(name).when(m).getName();
        PowerMockito.doReturn(declClass.getSimpleName() + "#" + name).when(m).getFullName();
        AnnotationMap am = PowerMockito.mock(AnnotationMap.class);
        PowerMockito.doReturn(am).when(m).getAllAnnotations();
        PowerMockito.doReturn(m).when(m).withAnnotations(any(AnnotationMap.class));
        return m;
    }

    private AnnotatedField mockField(Class<?> declClass, String fullName) {
        AnnotatedField f = PowerMockito.mock(AnnotatedField.class);
        PowerMockito.doReturn(declClass).when(f).getDeclaringClass();
        PowerMockito.doReturn(fullName).when(f).getFullName();
        AnnotationMap am = PowerMockito.mock(AnnotationMap.class);
        PowerMockito.doReturn(am).when(f).getAllAnnotations();
        PowerMockito.doReturn(f).when(f).withAnnotations(any(AnnotationMap.class));
        return f;
    }

    private AnnotatedParameter mockParam(Object owner) {
        AnnotatedParameter p = PowerMockito.mock(AnnotatedParameter.class);
        PowerMockito.doReturn(owner).when(p).getOwner();
        AnnotationMap am = PowerMockito.mock(AnnotationMap.class);
        PowerMockito.doReturn(am).when(p).getAllAnnotations();
        PowerMockito.doReturn(p).when(p).withAnnotations(any(AnnotationMap.class));
        return p;
    }

    private AnnotatedConstructor mockCtor() {
        return PowerMockito.mock(AnnotatedConstructor.class);
    }

    // =======================================================================
    // Group A: naming / withName / withSimpleName / compareTo
    // =======================================================================

    @Test
    public void testNameAccessors_Basic() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertEquals("aProp", b.getName());
        assertEquals(NAME_A, b.getFullName());
        assertEquals("aProp", b.getInternalName());
    }

    @Test
    public void testHasName_MatchAndNonMatch() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertTrue(b.hasName(NAME_A));
        assertFalse(b.hasName(NAME_B));
    }

    @Test
    public void testWithName_KeepsInternalName_ChangesExternalName() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        POJOPropertyBuilder renamed = b.withName(NAME_B);
        assertEquals("bProp", renamed.getName());
        assertEquals("aProp", renamed.getInternalName()); // internal name unchanged
    }

    @Test
    public void testWithName_Null_MakesNameNull() {
        // exercises: getName() -> (_name==null) ? null : ...
        POJOPropertyBuilder b = newBuilder(true, NAME_A).withName(null);
        assertNull(b.getName());
        assertNull(b.getFullName());
    }

    @Test
    public void testWithSimpleName_ChangesSimpleName() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        POJOPropertyBuilder renamed = b.withSimpleName("changed");
        assertEquals("changed", renamed.getName());
    }

    @Test
    public void testCompareTo_NeitherHasCtorParams_SortsByName() {
        POJOPropertyBuilder b1 = newBuilder(true, NAME_A);
        POJOPropertyBuilder b2 = newBuilder(true, NAME_B);
        assertTrue(b1.compareTo(b2) < 0);
        assertTrue(b2.compareTo(b1) > 0);
    }

    @Test
    public void testCompareTo_ThisHasCtorParams_OtherDoesNot() {
        POJOPropertyBuilder b1 = newBuilder(true, NAME_B); // name sorts after b2 normally
        b1.addCtor(mockParam(mockCtor()), NAME_B, true, true, false);
        POJOPropertyBuilder b2 = newBuilder(true, NAME_A);
        assertEquals(-1, b1.compareTo(b2));
    }

    @Test
    public void testCompareTo_OtherHasCtorParams_ThisDoesNot() {
        POJOPropertyBuilder b1 = newBuilder(true, NAME_A);
        POJOPropertyBuilder b2 = newBuilder(true, NAME_B);
        b2.addCtor(mockParam(mockCtor()), NAME_B, true, true, false);
        assertEquals(1, b1.compareTo(b2));
    }

    @Test
    public void testCompareTo_BothHaveCtorParams_SortsByName() {
        POJOPropertyBuilder b1 = newBuilder(true, NAME_A);
        b1.addCtor(mockParam(mockCtor()), NAME_A, true, true, false);
        POJOPropertyBuilder b2 = newBuilder(true, NAME_B);
        b2.addCtor(mockParam(mockCtor()), NAME_B, true, true, false);
        assertTrue(b1.compareTo(b2) < 0);
    }

    // =======================================================================
    // Group B: hasX / couldX flags
    // =======================================================================

    @Test
    public void testHasFlags_And_CouldFlags() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertFalse(b.hasGetter());
        assertFalse(b.hasSetter());
        assertFalse(b.hasField());
        assertFalse(b.hasConstructorParameter());
        assertFalse(b.couldSerialize());
        assertFalse(b.couldDeserialize());

        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertTrue(b.hasGetter());
        assertTrue(b.couldSerialize());
        assertFalse(b.couldDeserialize());

        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        assertTrue(b.hasField());
        assertTrue(b.couldDeserialize());

        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, true, false);
        assertTrue(b.hasSetter());

        b.addCtor(mockParam(mockCtor()), NAME_A, false, true, false);
        assertTrue(b.hasConstructorParameter());
    }

    // =======================================================================
    // Group C: getGetter()
    // =======================================================================

    @Test
    public void testGetGetter_None_ReturnsNull() {
        assertNull(newBuilder(true, NAME_A).getGetter());
    }

    @Test
    public void testGetGetter_Single_ReturnsIt() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        assertSame(g, b.getGetter());
    }

    @Test
    public void testGetGetter_MoreSpecificSubclassWins() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod inBase = mockMethod(Base.class, "getX");
        AnnotatedMethod inSub = mockMethod(Sub.class, "getX");
        b.addGetter(inBase, NAME_A, false, true, false);
        b.addGetter(inSub, NAME_A, false, true, false); // head = inSub
        assertSame(inSub, b.getGetter());
    }

    @Test
    public void testGetGetter_DifferentPriority_RegularGetterWinsOverIsGetter() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod isGetter = mockMethod(Base.class, "isX"); // pri 2
        AnnotatedMethod getGetter = mockMethod(Base.class, "getX"); // pri 1
        b.addGetter(isGetter, NAME_A, false, true, false);
        b.addGetter(getGetter, NAME_A, false, true, false); // head=getGetter
        assertSame(getGetter, b.getGetter());
    }

    @Test
    public void testGetGetter_ThreeNodes_MultiIteration_NoException() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "x"), NAME_A, false, true, false);   // pri3, added first
        b.addGetter(mockMethod(Base.class, "isX"), NAME_A, false, true, false); // pri2
        AnnotatedMethod winner = mockMethod(Base.class, "getX");                // pri1, head
        b.addGetter(winner, NAME_A, false, true, false);
        assertSame(winner, b.getGetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetGetter_SamePrioritySameClass_Throws() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        b.addGetter(mockMethod(Base.class, "getY"), NAME_A, false, true, false);
        b.getGetter();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetGetter_UnrelatedClassesSamePriority_Throws() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        b.addGetter(mockMethod(Other.class, "getY"), NAME_A, false, true, false);
        b.getGetter();
    }

    // =======================================================================
    // Group D: getSetter()
    // =======================================================================

    @Test
    public void testGetSetter_None_ReturnsNull() {
        assertNull(newBuilder(false, NAME_A).getSetter());
    }

    @Test
    public void testGetSetter_Single_ReturnsIt() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedMethod s = mockMethod(Base.class, "setX");
        b.addSetter(s, NAME_A, false, true, false);
        assertSame(s, b.getSetter());
    }

    @Test
    public void testGetSetter_DifferentPriority_RegularSetterWins() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        b.addSetter(mockMethod(Base.class, "x"), NAME_A, false, true, false); // pri2
        AnnotatedMethod winner = mockMethod(Base.class, "setX"); // pri1, head
        b.addSetter(winner, NAME_A, false, true, false);
        assertSame(winner, b.getSetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSetter_SamePriority_NoIntrospector_Throws() {
        POJOPropertyBuilder b = newBuilderNoAI(false, NAME_A);
        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, true, false);
        b.addSetter(mockMethod(Base.class, "setY"), NAME_A, false, true, false);
        b.getSetter();
    }

    @Test
    public void testGetSetter_SamePriority_IntrospectorResolvesToCurrent() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedMethod s1 = mockMethod(Base.class, "setX");
        AnnotatedMethod s2 = mockMethod(Base.class, "setY");
        b.addSetter(s1, NAME_A, false, true, false);
        b.addSetter(s2, NAME_A, false, true, false); // head = s2 (curr), next = s1
        when(ai.resolveSetterConflict(eq(config), any(AnnotatedMethod.class), any(AnnotatedMethod.class)))
                .thenReturn(s2);
        assertSame(s2, b.getSetter());
    }

    @Test
    public void testGetSetter_SamePriority_IntrospectorResolvesToNext() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedMethod s1 = mockMethod(Base.class, "setX");
        AnnotatedMethod s2 = mockMethod(Base.class, "setY");
        b.addSetter(s1, NAME_A, false, true, false);
        b.addSetter(s2, NAME_A, false, true, false); // head=s2(curr), next=s1
        when(ai.resolveSetterConflict(eq(config), any(AnnotatedMethod.class), any(AnnotatedMethod.class)))
                .thenReturn(s1);
        assertSame(s1, b.getSetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSetter_SamePriority_IntrospectorResolvesToNeither_Throws() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, true, false);
        b.addSetter(mockMethod(Base.class, "setY"), NAME_A, false, true, false);
        AnnotatedMethod unrelated = mockMethod(Base.class, "setZ");
        when(ai.resolveSetterConflict(eq(config), any(AnnotatedMethod.class), any(AnnotatedMethod.class)))
                .thenReturn(unrelated);
        b.getSetter();
    }

    // =======================================================================
    // Group E: getField()
    // =======================================================================

    @Test
    public void testGetField_None_ReturnsNull() {
        assertNull(newBuilder(true, NAME_A).getField());
    }

    @Test
    public void testGetField_MoreSpecificSubclassWins() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedField f1 = mockField(Base.class, "f1");
        AnnotatedField f2 = mockField(Sub.class, "f2");
        b.addField(f1, NAME_A, false, true, false);
        b.addField(f2, NAME_A, false, true, false); // head=f2(Sub)
        assertSame(f2, b.getField());
    }

    @Test
    public void testGetField_CurrentMoreSpecificKept() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedField f1 = mockField(Sub.class, "f1"); // head, more specific
        AnnotatedField f2 = mockField(Base.class, "f2");
        b.addField(f2, NAME_A, false, true, false);
        b.addField(f1, NAME_A, false, true, false); // head=f1(Sub)
        assertSame(f1, b.getField());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetField_SameClass_Throws() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f1"), NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f2"), NAME_A, false, true, false);
        b.getField();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetField_UnrelatedClasses_Throws() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f1"), NAME_A, false, true, false);
        b.addField(mockField(Other.class, "f2"), NAME_A, false, true, false);
        b.getField();
    }

    // =======================================================================
    // Group F: constructor parameters
    // =======================================================================

    @Test
    public void testGetConstructorParameter_None_ReturnsNull() {
        assertNull(newBuilder(false, NAME_A).getConstructorParameter());
    }

    @Test
    public void testGetConstructorParameter_PrefersConstructorOwner() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedParameter fromCtor = mockParam(mockCtor());
        AnnotatedMethod factoryMethod = mockMethod(Base.class, "create");
        AnnotatedParameter fromFactory = mockParam(factoryMethod); // owner NOT AnnotatedConstructor
        b.addCtor(fromCtor, NAME_A, false, true, false); // added first (tail)
        b.addCtor(fromFactory, NAME_A, false, true, false); // added second (head)
        assertSame(fromCtor, b.getConstructorParameter());
    }

    @Test
    public void testGetConstructorParameter_FallsBackToHead_WhenNoneFromConstructor() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedParameter p1 = mockParam(mockMethod(Base.class, "create1"));
        AnnotatedParameter p2 = mockParam(mockMethod(Base.class, "create2"));
        b.addCtor(p1, NAME_A, false, true, false);
        b.addCtor(p2, NAME_A, false, true, false); // head
        assertSame(p2, b.getConstructorParameter());
    }

    @Test
    public void testGetConstructorParameters_EmptyWhenNone() {
        Iterator<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> it =
                newBuilder(false, NAME_A).getConstructorParameters();
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetConstructorParameters_IteratesInOrder_AndRemoveUnsupported() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedParameter p1 = mockParam(mockCtor());
        AnnotatedParameter p2 = mockParam(mockCtor());
        b.addCtor(p1, NAME_A, false, true, false);
        b.addCtor(p2, NAME_A, false, true, false); // head
        Iterator<AnnotatedParameter> it = b.getConstructorParameters();
        assertTrue(it.hasNext());
        assertSame(p2, it.next());
        assertTrue(it.hasNext());
        assertSame(p1, it.next());
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { /* ok */ }
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { /* ok */ }
    }

    // =======================================================================
    // Group G: getAccessor / getMutator / getNonConstructorMutator / getPrimaryMember
    // =======================================================================

    @Test
    public void testGetAccessor_FieldFallback_WhenNoGetter() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedField f = mockField(Base.class, "f");
        b.addField(f, NAME_A, false, true, false);
        assertSame(f, b.getAccessor());
    }

    @Test
    public void testGetAccessor_PrefersGetterOverField() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        assertSame(g, b.getAccessor());
    }

    @Test
    public void testGetMutator_PriorityOrder_CtorThenSetterThenField() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedField f = mockField(Base.class, "f");
        b.addField(f, NAME_A, false, true, false);
        assertSame(f, b.getMutator());

        AnnotatedMethod s = mockMethod(Base.class, "setX");
        b.addSetter(s, NAME_A, false, true, false);
        assertSame(s, b.getMutator());

        AnnotatedParameter p = mockParam(mockCtor());
        b.addCtor(p, NAME_A, false, true, false);
        assertSame(p, b.getMutator());
    }

    @Test
    public void testGetNonConstructorMutator_SetterThenField() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedField f = mockField(Base.class, "f");
        b.addField(f, NAME_A, false, true, false);
        assertSame(f, b.getNonConstructorMutator());

        AnnotatedMethod s = mockMethod(Base.class, "setX");
        b.addSetter(s, NAME_A, false, true, false);
        assertSame(s, b.getNonConstructorMutator());
    }

    @Test
    public void testGetPrimaryMember_SerializationUsesAccessor_DeserializationUsesMutator() {
        AnnotatedMethod getter = mockMethod(Base.class, "getX");
        AnnotatedMethod setter = mockMethod(Base.class, "setX");

        POJOPropertyBuilder bSer = newBuilder(true, NAME_A);
        bSer.addGetter(getter, NAME_A, false, true, false);
        bSer.addSetter(setter, NAME_A, false, true, false);
        assertSame(getter, bSer.getPrimaryMember());

        POJOPropertyBuilder bDeser = newBuilder(false, NAME_A);
        bDeser.addGetter(getter, NAME_A, false, true, false);
        bDeser.addSetter(setter, NAME_A, false, true, false);
        assertSame(setter, bDeser.getPrimaryMember());
    }

    // =======================================================================
    // Group H: annotation-introspector driven accessors
    // =======================================================================

    @Test
    public void testFindViews_NullIntrospector_ReturnsNull() {
        POJOPropertyBuilder b = newBuilderNoAI(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertNull(b.findViews());
    }

    @Test
    public void testFindViews_UsesGetter_ForSerialization() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        Class<?>[] arr = new Class<?>[] { String.class };
        when(ai.findViews(g)).thenReturn(arr);
        assertSame(arr, b.findViews());
    }

    @Test
    public void testFindViews_FallsBackToField_WhenNoGetterResult() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedField f = mockField(Base.class, "f");
        b.addField(f, NAME_A, false, true, false); // no getter present at all
        Class<?>[] arr = new Class<?>[] { Integer.class };
        when(ai.findViews(f)).thenReturn(arr);
        assertSame(arr, b.findViews());
    }

    @Test
    public void testIsTypeId_TrueFalseNull() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);

        when(ai.isTypeId(g)).thenReturn(Boolean.TRUE);
        assertTrue(b.isTypeId());

        when(ai.isTypeId(g)).thenReturn(Boolean.FALSE);
        assertFalse(b.isTypeId());

        when(ai.isTypeId(g)).thenReturn(null);
        assertFalse(b.isTypeId()); // (b != null) && ... -> false when null
    }

    @Test
    public void testGetMetadata_AllNull_NoDescription_ReturnsStdConstant() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertSame(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL, b.getMetadata());
    }

    @Test
    public void testGetMetadata_AllNull_WithDescription() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        when(ai.findPropertyDescription(g)).thenReturn("desc!");
        PropertyMetadata md = b.getMetadata();
        assertNotSame(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL, md);
        // สมมติว่า PropertyMetadata มี getDescription() ตาม API มาตรฐานของ jackson-databind
        assertEquals("desc!", md.getDescription());
    }

    @Test
    public void testGetMetadata_RequiredNotNull_NoException() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        when(ai.hasRequiredMarker(g)).thenReturn(Boolean.TRUE);
        PropertyMetadata md = b.getMetadata();
        assertTrue(md.isRequired());
    }

    /**
     * FAULT-CATCHING TEST:
     * เมื่อ _findRequired() คืน null แต่ _findIndex() ไม่ null เงื่อนไข
     * (b==null && idx==null && def==null) จะเป็น false ทำให้โค้ดไปเรียก
     * b.booleanValue() ที่ b เป็น null -> NullPointerException
     * นี่คือพฤติกรรม "บั๊กจริง" ของซอร์สโค้ดที่ให้มา (Defects4J JacksonDatabind-73b)
     */
    @Test(expected = NullPointerException.class)
    public void testGetMetadata_RequiredNull_IndexNotNull_KnownDefect_ThrowsNPE() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        when(ai.hasRequiredMarker(g)).thenReturn(null);
        when(ai.findPropertyIndex(g)).thenReturn(5);
        b.getMetadata(); // expected to throw NPE due to defect
    }

    @Test
    public void testFindInclusion_NullIntrospector_ReturnsEmptyValue() {
        POJOPropertyBuilder b = newBuilderNoAI(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertEquals(JsonInclude.Value.empty(), b.findInclusion());
    }

    @Test
    public void testFindInclusion_ReturnsIntrospectorValue() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        JsonInclude.Value v = JsonInclude.Value.construct(JsonInclude.Include.NON_NULL, null);
        when(ai.findPropertyInclusion(g)).thenReturn(v);
        assertSame(v, b.findInclusion());
    }

    @Test
    public void testFindAccess_NullIntrospector_ReturnsNull() {
        POJOPropertyBuilder b = newBuilderNoAI(true, NAME_A);
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertNull(b.findAccess());
    }

    @Test
    public void testFindAccess_Serialization_SkipsDefault_UsesField() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        AnnotatedField f = mockField(Base.class, "f");
        b.addGetter(g, NAME_A, false, true, false);
        b.addField(f, NAME_A, false, true, false);
        when(ai.findPropertyAccess(g)).thenReturn(JsonProperty.Access.AUTO); // default -> skipped
        when(ai.findPropertyAccess(f)).thenReturn(JsonProperty.Access.WRITE_ONLY);
        assertEquals(JsonProperty.Access.WRITE_ONLY, b.findAccess());
    }

    @Test
    public void testFindAccess_Deserialization_SkipsDefault_UsesSetter() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedParameter ctor = mockParam(mockCtor());
        AnnotatedMethod s = mockMethod(Base.class, "setX");
        b.addCtor(ctor, NAME_A, false, true, false);
        b.addSetter(s, NAME_A, false, true, false);
        when(ai.findPropertyAccess(ctor)).thenReturn(JsonProperty.Access.AUTO);
        when(ai.findPropertyAccess(s)).thenReturn(JsonProperty.Access.READ_ONLY);
        assertEquals(JsonProperty.Access.READ_ONLY, b.findAccess());
    }

    @Test
    public void testFindObjectIdInfo_NullThenNonNull() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);

        when(ai.findObjectIdInfo(g)).thenReturn(null);
        assertNull(b.findObjectIdInfo());

        ObjectIdInfo info = PowerMockito.mock(ObjectIdInfo.class);
        ObjectIdInfo refined = PowerMockito.mock(ObjectIdInfo.class);
        when(ai.findObjectIdInfo(g)).thenReturn(info);
        when(ai.findObjectReferenceInfo(g, info)).thenReturn(refined);
        assertSame(refined, b.findObjectIdInfo());
    }

    // =======================================================================
    // Group I: explicit / visible / ignore aggregation
    // =======================================================================

    @Test
    public void testIsExplicitlyIncluded_TrueWhenAnyNodeHasSimpleName_RegardlessOfExplicitFlag() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertFalse(b.isExplicitlyIncluded());
        // explName=false but a real (non-empty) name is still counted by _anyExplicits
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        assertTrue(b.isExplicitlyIncluded());
    }

    @Test
    public void testIsExplicitlyNamed_RequiresExplicitFlag() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false); // explName=false
        assertFalse(b.isExplicitlyNamed());
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, true, true, false); // explName=true
        assertTrue(b.isExplicitlyNamed());
    }

    @Test
    public void testAnyVisible() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertFalse(b.anyVisible());
        b.addField(mockField(Base.class, "f"), NAME_A, false, false, false);
        assertFalse(b.anyVisible());
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        assertTrue(b.anyVisible());
    }

    @Test
    public void testAnyIgnorals() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        assertFalse(b.anyIgnorals());
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, true);
        assertTrue(b.anyIgnorals());
    }

    @Test
    public void testFindExplicitNames_CollectsNames() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false); // not explicit
        b.addGetter(mockMethod(Base.class, "getX"), NAME_B, true, true, false); // explicit
        Set<PropertyName> names = b.findExplicitNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(NAME_B));
    }

    @Test
    public void testFindExplicitNames_EmptyWhenNoneExplicit() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        assertTrue(b.findExplicitNames().isEmpty());
    }

    // =======================================================================
    // Group J: mutation operations
    // =======================================================================

    @Test
    public void testAddAll_MergesChains() {
        POJOPropertyBuilder b1 = newBuilder(true, NAME_A);
        POJOPropertyBuilder b2 = newBuilder(true, NAME_A);
        b2.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        b1.addAll(b2);
        assertTrue(b1.hasField());
    }

    @Test
    public void testRemoveIgnored() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedField kept = mockField(Base.class, "kept");
        b.addField(mockField(Sub.class, "ignored"), NAME_A, false, true, true);
        b.addField(kept, NAME_A, false, true, false);
        b.removeIgnored();
        assertTrue(b.hasField());
        assertSame(kept, b.getField());
    }

    @Test
    public void testRemoveIgnored_AllIgnored_RemovesAll() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, true);
        b.removeIgnored();
        assertFalse(b.hasField());
    }

    @Test
    public void testRemoveConstructors() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        b.addCtor(mockParam(mockCtor()), NAME_A, false, true, false);
        b.removeConstructors();
        assertFalse(b.hasConstructorParameter());
    }

    @Test
    public void testRemoveNonVisible_ReadOnly_Deserialization_RemovesFieldsToo() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedParameter ctor = mockParam(mockCtor());
        b.addCtor(ctor, NAME_A, false, true, false);
        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        when(ai.findPropertyAccess(ctor)).thenReturn(JsonProperty.Access.READ_ONLY);

        b.removeNonVisible(true);
        assertFalse(b.hasSetter());
        assertFalse(b.hasConstructorParameter());
        assertFalse(b.hasField()); // removed because !_forSerialization
    }

    @Test
    public void testRemoveNonVisible_ReadOnly_Serialization_KeepsFields() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedParameter ctor = mockParam(mockCtor());
        b.addCtor(ctor, NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        when(ai.findPropertyAccess(ctor)).thenReturn(JsonProperty.Access.READ_ONLY);

        b.removeNonVisible(true);
        assertFalse(b.hasConstructorParameter());
        assertTrue(b.hasField()); // kept because _forSerialization == true
    }

    @Test
    public void testRemoveNonVisible_WriteOnly_Serialization_RemovesFields() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        when(ai.findPropertyAccess(g)).thenReturn(JsonProperty.Access.WRITE_ONLY);

        b.removeNonVisible(true);
        assertFalse(b.hasGetter());
        assertFalse(b.hasField());
    }

    @Test
    public void testRemoveNonVisible_WriteOnly_Deserialization_KeepsFields() {
        POJOPropertyBuilder b = newBuilder(false, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, true, false);
        when(ai.findPropertyAccess(g)).thenReturn(JsonProperty.Access.WRITE_ONLY);

        b.removeNonVisible(false);
        assertFalse(b.hasGetter());
        assertTrue(b.hasField());
    }

    @Test
    public void testRemoveNonVisible_ReadWrite_NoTrimming() {
        POJOPropertyBuilder b = newBuilder(true, NAME_A);
        AnnotatedMethod g = mockMethod(Base.class, "getX");
        b.addGetter(g, NAME_A, false, false, false); // not visible
        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, false, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, false, false);
        when(ai.findPropertyAccess(g)).thenReturn(JsonProperty.Access.READ_WRITE);

        b.removeNonVisible(true);
        assertTrue(b.hasGetter());
        assertTrue(b.hasSetter());
        assertTrue(b.hasField());
    }

    @Test
    public void testRemoveNonVisible_Auto_InferMutatorsTrue_GettersPresent_KeepsInvisibleFieldSetter() {
        POJOPropertyBuilder b = newBuilderNoAI(true, NAME_A); // ai null -> acc defaults to AUTO
        b.addGetter(mockMethod(Base.class, "getX"), NAME_A, false, true, false);
        b.addField(mockField(Base.class, "f"), NAME_A, false, false, false); // invisible
        b.addSetter(mockMethod(Base.class, "setX"), NAME_A, false, false, false); // invisible

        b.removeNonVisible(true);
        assertTrue(b.hasGetter());
        assertTrue(b