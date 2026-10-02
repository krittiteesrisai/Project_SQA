package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/**
 * Unit tests for {@link CreatorCollector} (Defects4J JacksonDatabind-69b).
 *
 * กลยุทธ์: ทดสอบผ่าน public API เป็นหลัก และใช้ reflection อ่านฟิลด์ภายใน
 * (_creators, _explicitCreators, _hasNonDefaultCreator, _delegateArgs,
 * _arrayDelegateArgs, _propertyBasedArgs, _incompleteParameter) เพื่อยืนยัน
 * branch ต่าง ๆ ของ verifyNonDup() ตามที่ปรากฎตรง ๆ ใน source ที่ให้มา
 * (ไม่ได้เดา behavior ของ dependency classes อื่น ๆ)
 */
public class CreatorCollectorTest {

    // ดัชนี array _creators ตามที่ประกาศในซอร์สต้นฉบับ (protected static final int)
    private static final int C_DEFAULT = 0;
    private static final int C_STRING = 1;
    private static final int C_INT = 2;
    private static final int C_LONG = 3;
    private static final int C_DOUBLE = 4;
    private static final int C_BOOLEAN = 5;
    private static final int C_DELEGATE = 6;
    private static final int C_PROPS = 7;
    private static final int C_ARRAY_DELEGATE = 8;

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private CreatorCollector newCollector(boolean canFixAccess, boolean forceAccess, JavaType beanType) {
        BeanDescription bd = mock(BeanDescription.class);
        if (beanType != null) {
            when(bd.getType()).thenReturn(beanType);
        }
        @SuppressWarnings("unchecked")
        MapperConfig<?> cfg = mock(MapperConfig.class);
        when(cfg.canOverrideAccessModifiers()).thenReturn(canFixAccess);
        when(cfg.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)).thenReturn(forceAccess);
        return new CreatorCollector(bd, cfg);
    }

    private CreatorCollector newCollector() {
        return newCollector(false, false, null);
    }

    private JavaType mockType(Class<?> raw) {
        JavaType t = mock(JavaType.class);
        when(t.getRawClass()).thenReturn(raw);
        return t;
    }

    private AnnotatedWithParams mockCreator(Class<? extends AnnotatedWithParams> impl,
            boolean collectionLike, Class<?> rawParamType) {
        AnnotatedWithParams creator = mock(impl);
        JavaType pType = mock(JavaType.class);
        when(pType.isCollectionLikeType()).thenReturn(collectionLike);
        when(creator.getParameterType(anyInt())).thenReturn(pType);
        when(creator.getRawParameterType(0)).thenReturn(rawParamType);
        return creator;
    }

    private SettableBeanProperty mockProperty(String name, Object injectableId) {
        SettableBeanProperty p = mock(SettableBeanProperty.class);
        when(p.getName()).thenReturn(name);
        when(p.getInjectableValueId()).thenReturn(injectableId);
        return p;
    }

    private Object getField(CreatorCollector cc, String name) throws Exception {
        Field f = CreatorCollector.class.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(cc);
    }

    private Object creatorAt(CreatorCollector cc, int idx) throws Exception {
        Object[] arr = (Object[]) getField(cc, "_creators");
        return arr[idx];
    }

    private boolean hasNonDefault(CreatorCollector cc) throws Exception {
        return (Boolean) getField(cc, "_hasNonDefaultCreator");
    }

    private int explicitMask(CreatorCollector cc) throws Exception {
        return (Integer) getField(cc, "_explicitCreators");
    }

    // ---------------------------------------------------------------
    // 1. Initial state
    // ---------------------------------------------------------------

    @Test
    public void testInitialState_NoCreatorsSet() throws Exception {
        CreatorCollector cc = newCollector();
        assertFalse(cc.hasDefaultCreator());
        assertFalse(cc.hasDelegatingCreator());
        assertFalse(cc.hasPropertyBasedCreator());
        assertFalse(hasNonDefault(cc));
        assertEquals(0, explicitMask(cc));
    }

    // ---------------------------------------------------------------
    // 2. setDefaultCreator / _fixAccess
    // ---------------------------------------------------------------

    @Test
    public void testSetDefaultCreator_NullCreator_HasDefaultCreatorFalse() {
        CreatorCollector cc = newCollector();
        cc.setDefaultCreator(null);
        assertFalse(cc.hasDefaultCreator());
    }

    @Test
    public void testSetDefaultCreator_NonNull_CanFixAccessFalse() {
        CreatorCollector cc = newCollector(false, false, null);
        AnnotatedWithParams creator = mock(AnnotatedConstructor.class);
        cc.setDefaultCreator(creator);
        assertTrue(cc.hasDefaultCreator());
    }

    // ตัวส่วนตัว (private constructor) ใช้เป็น Member จริง เพื่อให้ ClassUtil.checkAndFixAccess ทำงานได้
    private static class Dummy {
        private Dummy() {}
    }

    @Test
    public void testSetDefaultCreator_NonNull_CanFixAccessTrue_NoException() throws Exception {
        CreatorCollector cc = newCollector(true, true, null);
        Constructor<?> ctor = Dummy.class.getDeclaredConstructor();
        AnnotatedWithParams creator = mock(AnnotatedConstructor.class);
        when(creator.getAnnotated()).thenReturn(ctor);
        cc.setDefaultCreator(creator);
        assertTrue(cc.hasDefaultCreator());
    }

    // ---------------------------------------------------------------
    // 3. add*Creator (explicit-flag variants) - basic pass-through
    // ---------------------------------------------------------------

    @Test
    public void testAddStringCreator_FirstAdd_NoException() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addStringCreator(c, true);
        assertSame(c, creatorAt(cc, C_STRING));
        assertTrue(hasNonDefault(cc));
    }

    @Test
    public void testAddStringCreator_DuplicateSameTypeBothExplicit_Throws() {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addStringCreator(a, true);
        try {
            cc.addStringCreator(b, true);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok - ตรง branch oldType==newType ใน verifyNonDup
        }
    }

    @Test
    public void testAddIntCreator_ExplicitVariant_FirstAdd_NoException() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addIntCreator(c, true);
        assertSame(c, creatorAt(cc, C_INT));
    }

    @Test
    public void testAddLongCreator_ExplicitVariant_FirstAdd_NoException() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Long.class);
        cc.addLongCreator(c, true);
        assertSame(c, creatorAt(cc, C_LONG));
    }

    @Test
    public void testAddDoubleCreator_ExplicitVariant_FirstAdd_NoException() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Double.class);
        cc.addDoubleCreator(c, true);
        assertSame(c, creatorAt(cc, C_DOUBLE));
    }

    @Test
    public void testAddBooleanCreator_ExplicitVariant_FirstAdd_NoException() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Boolean.class);
        cc.addBooleanCreator(c, true);
        assertSame(c, creatorAt(cc, C_BOOLEAN));
    }

    // ---------------------------------------------------------------
    // 4. addDelegatingCreator - dispatch + verifyNonDup branches
    // ---------------------------------------------------------------

    @Test
    public void testAddDelegatingCreator_NonCollectionLike_SetsDelegateSlot() throws Exception {
        CreatorCollector cc = newCollector();
        SettableBeanProperty[] injectables = new SettableBeanProperty[] { mockProperty("x", null) };
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addDelegatingCreator(c, true, injectables);
        assertSame(c, creatorAt(cc, C_DELEGATE));
        assertNull(creatorAt(cc, C_ARRAY_DELEGATE));
        assertSame(injectables, getField(cc, "_delegateArgs"));
        assertTrue(cc.hasDelegatingCreator());
    }

    @Test
    public void testAddDelegatingCreator_CollectionLike_SetsArrayDelegateSlot() throws Exception {
        CreatorCollector cc = newCollector();
        SettableBeanProperty[] injectables = new SettableBeanProperty[] { mockProperty("x", null) };
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, true, List.class);
        cc.addDelegatingCreator(c, true, injectables);
        assertSame(c, creatorAt(cc, C_ARRAY_DELEGATE));
        assertNull(creatorAt(cc, C_DELEGATE));
        assertSame(injectables, getField(cc, "_arrayDelegateArgs"));
        // hasDelegatingCreator() ดู C_DELEGATE เท่านั้น -> ต้องยังเป็น false
        assertFalse(cc.hasDelegatingCreator());
    }

    @Test
    public void testAddDelegatingCreator_OldExplicit_NewNotExplicit_KeepsOld() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addDelegatingCreator(a, true, null);   // explicit
        cc.addDelegatingCreator(b, false, null);  // not explicit -> early return, keep old
        assertSame(a, creatorAt(cc, C_DELEGATE));
    }

    @Test
    public void testAddDelegatingCreator_BothExplicit_SameClassSameType_Throws() {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addDelegatingCreator(a, true, null);
        try {
            cc.addDelegatingCreator(b, true, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { /* ok */ }
    }

    @Test
    public void testAddDelegatingCreator_BothExplicit_SameClass_NewMoreGeneric_KeepsOld() throws Exception {
        CreatorCollector cc = newCollector();
        // oldType=Integer (subtype), newType=Number (supertype) -> Number.isAssignableFrom(Integer)=true -> keep old
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Number.class);
        cc.addDelegatingCreator(a, true, null);
        cc.addDelegatingCreator(b, true, null);
        assertSame(a, creatorAt(cc, C_DELEGATE));
    }

    @Test
    public void testAddDelegatingCreator_BothExplicit_SameClass_NewMoreSpecific_UsesNew() throws Exception {
        CreatorCollector cc = newCollector();
        // oldType=Number (supertype), newType=Integer (subtype) -> Integer.isAssignableFrom(Number)=false -> use new
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Number.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addDelegatingCreator(a, true, null);
        cc.addDelegatingCreator(b, true, null);
        assertSame(b, creatorAt(cc, C_DELEGATE));
    }

    @Test
    public void testAddDelegatingCreator_BothExplicit_DifferentClass_UsesNewWithoutThrow() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedMethod.class, false, Integer.class); // คนละ class
        cc.addDelegatingCreator(a, true, null);
        cc.addDelegatingCreator(b, true, null); // sameClass=false -> ข้าม throw-block -> replace
        assertSame(b, creatorAt(cc, C_DELEGATE));
    }

    @Test
    public void testAddDelegatingCreator_NeitherExplicit_SameClassSameType_Throws() {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addDelegatingCreator(a, false, null);
        try {
            cc.addDelegatingCreator(b, false, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { /* ok */ }
    }

    @Test
    public void testAddDelegatingCreator_NeitherExplicit_DifferentClass_UsesNew() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams a = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        AnnotatedWithParams b = mockCreator(AnnotatedMethod.class, false, Integer.class);
        cc.addDelegatingCreator(a, false, null);
        cc.addDelegatingCreator(b, false, null);
        assertSame(b, creatorAt(cc, C_DELEGATE));
    }

    // ---------------------------------------------------------------
    // 5. addPropertyCreator - duplicate-name inner loop
    // ---------------------------------------------------------------

    @Test
    public void testAddPropertyCreator_SingleProperty_NoDuplicateCheck() {
        CreatorCollector cc = newCollector();
        SettableBeanProperty[] props = new SettableBeanProperty[] { mockProperty("a", null) };
        cc.addPropertyCreator(mockCreator(AnnotatedConstructor.class, false, Integer.class), true, props);
        assertTrue(cc.hasPropertyBasedCreator());
    }

    @Test
    public void testAddPropertyCreator_MultiplePropertiesUniqueNames_NoException() {
        CreatorCollector cc = newCollector();
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                mockProperty("a", null), mockProperty("b", null) };
        cc.addPropertyCreator(mockCreator(AnnotatedConstructor.class, false, Integer.class), true, props);
        assertTrue(cc.hasPropertyBasedCreator());
    }

    @Test
    public void testAddPropertyCreator_DuplicateNonEmptyNames_Throws() {
        CreatorCollector cc = newCollector();
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                mockProperty("dup", null), mockProperty("dup", null) };
        try {
            cc.addPropertyCreator(mockCreator(AnnotatedConstructor.class, false, Integer.class), true, props);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { /* ok */ }
    }

    @Test
    public void testAddPropertyCreator_EmptyNameWithInjectableId_SkippedNoThrow() {
        CreatorCollector cc = newCollector();
        // ทั้งสองมีชื่อว่าง แต่มี injectable id -> ถูก continue ข้ามไปไม่เข้า map -> ไม่ throw
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                mockProperty("", "inj1"), mockProperty("", "inj2") };
        cc.addPropertyCreator(mockCreator(AnnotatedConstructor.class, false, Integer.class), true, props);
        assertTrue(cc.hasPropertyBasedCreator());
    }

    @Test
    public void testAddPropertyCreator_EmptyNameWithoutInjectableId_DuplicateThrows() {
        CreatorCollector cc = newCollector();
        // ชื่อว่าง และ injectableValueId == null -> ไม่ถูก skip -> ชนกันใน map -> throw
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                mockProperty("", null), mockProperty("", null) };
        try {
            cc.addPropertyCreator(mockCreator(AnnotatedConstructor.class, false, Integer.class), true, props);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { /* ok */ }
    }

    // ---------------------------------------------------------------
    // 6. addIncompeteParameter
    // ---------------------------------------------------------------

    @Test
    public void testAddIncompleteParameter_SetsFirstTime() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedParameter p = mock(AnnotatedParameter.class);
        cc.addIncompeteParameter(p);
        assertSame(p, getField(cc, "_incompleteParameter"));
    }

    @Test
    public void testAddIncompleteParameter_DoesNotOverwriteSecondTime() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedParameter p1 = mock(AnnotatedParameter.class);
        AnnotatedParameter p2 = mock(AnnotatedParameter.class);
        cc.addIncompeteParameter(p1);
        cc.addIncompeteParameter(p2);
        assertSame(p1, getField(cc, "_incompleteParameter"));
    }

    // ---------------------------------------------------------------
    // 7. Deprecated methods
    // ---------------------------------------------------------------

    @Test
    public void testDeprecatedAddStringCreator_DelegatesCorrectly() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, String.class);
        cc.addStringCreator(c);
        assertSame(c, creatorAt(cc, C_STRING));
    }

    @Test
    public void testDeprecatedAddBooleanCreator_DelegatesCorrectly() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Boolean.class);
        cc.addBooleanCreator(c);
        assertSame(c, creatorAt(cc, C_BOOLEAN));
    }

    /**
     * รู้จัก defect: deprecated addIntCreator(creator) เรียก addBooleanCreator(creator,false)
     * แทนที่จะเรียก addIntCreator(creator,false) ตามชื่อเมธอด -> ผลคือ creator ไปอยู่สล็อต
     * C_BOOLEAN แทน C_INT ทดสอบนี้ "บันทึก" พฤติกรรมจริงตาม source ที่ให้มา (trace ได้ตรง ๆ)
     */
    @Test
    public void testDeprecatedAddIntCreator_KnownDefect_StoresUnderBooleanSlot() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addIntCreator(c);
        assertNull(creatorAt(cc, C_INT));       // ไม่ได้ถูกเก็บตามที่ชื่อเมธอดบอก
        assertSame(c, creatorAt(cc, C_BOOLEAN)); // แต่ไปอยู่ C_BOOLEAN จริง (ตาม source ที่ให้)
    }

    @Test
    public void testDeprecatedAddLongCreator_KnownDefect_StoresUnderBooleanSlot() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Long.class);
        cc.addLongCreator(c);
        assertNull(creatorAt(cc, C_LONG));
        assertSame(c, creatorAt(cc, C_BOOLEAN));
    }

    @Test
    public void testDeprecatedAddDoubleCreator_KnownDefect_StoresUnderBooleanSlot() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Double.class);
        cc.addDoubleCreator(c);
        assertNull(creatorAt(cc, C_DOUBLE));
        assertSame(c, creatorAt(cc, C_BOOLEAN));
    }

    @Test
    public void testDeprecatedAddDelegatingCreator_CreatorPropertyArray_NonExplicit() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        CreatorProperty[] injectables = new CreatorProperty[] { mock(CreatorProperty.class) };
        cc.addDelegatingCreator(c, injectables);
        assertSame(c, creatorAt(cc, C_DELEGATE));
        assertSame(injectables, getField(cc, "_delegateArgs"));
        assertEquals(0, explicitMask(cc)); // explicit=false ตามที่ deprecated method ส่งต่อ
    }

    @Test
    public void testDeprecatedAddPropertyCreator_CreatorPropertyArray_NonExplicit() throws Exception {
        CreatorCollector cc = newCollector();
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        CreatorProperty p = mock(CreatorProperty.class);
        when(p.getName()).thenReturn("x");
        CreatorProperty[] props = new CreatorProperty[] { p };
        cc.addPropertyCreator(c, props);
        assertTrue(cc.hasPropertyBasedCreator());
        assertEquals(0, explicitMask(cc));
    }

    // ---------------------------------------------------------------
    // 8. constructValueInstantiator - Vanilla vs Std branches
    // ---------------------------------------------------------------

    private DeserializationConfig mockDsConfig() {
        return mock(DeserializationConfig.class);
    }

    @Test
    public void testConstructValueInstantiator_List_ReturnsVanillaCollectionBehavior() throws Exception {
        CreatorCollector cc = newCollector(false, false, mockType(List.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertTrue(vi.canInstantiate());
        assertTrue(vi.canCreateUsingDefault());
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
        assertTrue(vi.createUsingDefault(null) instanceof ArrayList);
    }

    @Test
    public void testConstructValueInstantiator_Collection_ReturnsVanillaCollectionBehavior() throws IOException {
        CreatorCollector cc = newCollector(false, false, mockType(Collection.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertTrue(vi.createUsingDefault(null) instanceof ArrayList);
    }

    @Test
    public void testConstructValueInstantiator_ArrayList_ReturnsVanillaCollectionBehavior() throws IOException {
        CreatorCollector cc = newCollector(false, false, mockType(ArrayList.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertTrue(vi.createUsingDefault(null) instanceof ArrayList);
    }

    @Test
    public void testConstructValueInstantiator_Map_ReturnsVanillaMapBehavior() throws IOException {
        CreatorCollector cc = newCollector(false, false, mockType(Map.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertEquals(LinkedHashMap.class.getName(), vi.getValueTypeDesc());
        assertTrue(vi.createUsingDefault(null) instanceof LinkedHashMap);
    }

    @Test
    public void testConstructValueInstantiator_LinkedHashMap_ReturnsVanillaMapBehavior() throws IOException {
        CreatorCollector cc = newCollector(false, false, mockType(LinkedHashMap.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertTrue(vi.createUsingDefault(null) instanceof LinkedHashMap);
    }

    @Test
    public void testConstructValueInstantiator_HashMap_ReturnsVanillaHashMapBehavior() throws IOException {
        CreatorCollector cc = newCollector(false, false, mockType(HashMap.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertEquals(HashMap.class.getName(), vi.getValueTypeDesc());
        assertTrue(vi.createUsingDefault(null) instanceof HashMap);
    }

    @Test
    public void testConstructValueInstantiator_OtherRawType_ReturnsNonVanilla() {
        // rawType ไม่ตรงกับ Collection/List/ArrayList/Map/LinkedHashMap/HashMap -> ไป StdValueInstantiator
        CreatorCollector cc = newCollector(false, false, mockType(String.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertNotNull(vi);
        // ตรวจโดยไม่อ้างชนิด Vanilla ตรง ๆ (protected class) เพื่อเลี่ยงปัญหา access
        assertNotEquals("Vanilla", vi.getClass().getSimpleName());
    }

    @Test
    public void testConstructValueInstantiator_HasNonDefaultCreator_ListRawType_DoesNotReturnVanilla() {
        CreatorCollector cc = newCollector(false, false, mockType(List.class));
        // เพิ่ม creator ใด ๆ ทำให้ _hasNonDefaultCreator = true -> แม้ rawType เป็น List ก็ไม่ใช้ Vanilla
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addIntCreator(c, true);
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertNotEquals("Vanilla", vi.getClass().getSimpleName());
    }

    // ---------------------------------------------------------------
    // 9. _computeDelegateType (private) ผ่าน constructValueInstantiator
    // ---------------------------------------------------------------

    @Test
    public void testComputeDelegateType_NoDelegateCreator_NoException() {
        // _hasNonDefaultCreator=true (ผ่าน int creator) แต่ไม่มี C_DELEGATE -> creator==null -> return null ทันที
        CreatorCollector cc = newCollector(false, false, mockType(String.class));
        AnnotatedWithParams c = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        cc.addIntCreator(c, true);
        ValueInstantiator vi = cc.constructValueInstantiator(mockDsConfig());
        assertNotNull(vi);
    }

    @Test
    public void testComputeDelegateType_WithDelegateCreator_FindsNullMarkerIndex() {
        CreatorCollector cc = newCollector(false, false, mockType(String.class));
        AnnotatedWithParams delegate = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[] {
                mockProperty("a", null), null, mockProperty("b", null) }; // null-marker ที่ index 1
        cc.addDelegatingCreator(delegate, true, delegateArgs);

        cc.constructValueInstantiator(mockDsConfig());

        // dispatch call (getParameterType(0)) เกิดครั้งเดียวใน addDelegatingCreator,
        // และ _computeDelegateType ต้องเรียก getParameterType(1) เพราะพบ null-marker ที่ index 1
        verify(delegate, times(1)).getParameterType(0);
        verify(delegate, times(1)).getParameterType(1);
    }

    @Test
    public void testComputeDelegateType_NoNullMarker_DefaultsToIndexZero() {
        CreatorCollector cc = newCollector(false, false, mockType(String.class));
        AnnotatedWithParams delegate = mockCreator(AnnotatedConstructor.class, false, Integer.class);
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[] {
                mockProperty("a", null), mockProperty("b", null) }; // ไม่มี null-marker
        cc.addDelegatingCreator(delegate, true, delegateArgs);

        cc.constructValueInstantiator(mockDsConfig());

        // getParameterType(0) ถูกเรียก 2 ครั้ง: dispatch ครั้งแรก + _computeDelegateType (ix ค่า default = 0)
        verify(delegate, times(2)).getParameterType(0);
    }
}
