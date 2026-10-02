# CreatorCollectorTest.java

หมายเหตุสำคัญก่อนโค้ด:
- วางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.deser.impl`) เพื่อให้เข้าถึง protected fields/nested class `Vanilla` ได้ตรง ๆ สำหรับตรวจสอบ state ภายใน (white-box testing) และลดจำนวน mock ที่ต้องเดา API
- สำหรับ `getGenericParameterType(int)` และ `TypeBindings.resolveType(...)` ซึ่งไม่ปรากฏ signature เต็มในซอร์สที่ให้มา จะใช้วิธี **ตรวจสอบการเรียก (interaction verification)** เท่านั้น ไม่ stub ค่า return ที่แน่นอน เพื่อไม่ "เดา" behavior ที่ไม่ได้ระบุไว้
- ใช้ `_canFixAccess = false` ในกรณีส่วนใหญ่เพื่อเลี่ยงการพึ่งพา `ClassUtil.checkAndFixAccess` ภายใน ยกเว้นเทสที่ตั้งใจตรวจ path นี้โดยเฉพาะ (ใช้ public constructor จริงเพื่อไม่ให้ throw)

```java
package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeBindings;

public class CreatorCollectorTest {

    // dummy class used only to obtain a real public no-arg constructor (java.lang.reflect.Member)
    public static class PublicSample {
        public PublicSample() {}
    }

    // dummy class used as a "non-vanilla" raw type for fallback tests
    private static class Foo {}

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private BeanDescription mockBeanDesc(Class<?> rawType) {
        BeanDescription beanDesc = mock(BeanDescription.class);
        JavaType type = mock(JavaType.class);
        when(type.getRawClass()).thenReturn(rawType);
        when(beanDesc.getType()).thenReturn(type);
        TypeBindings bindings = mock(TypeBindings.class);
        when(beanDesc.bindingsForBeanType()).thenReturn(bindings);
        return beanDesc;
    }

    private CreatorCollector newCollector(Class<?> rawType, boolean canFixAccess) {
        return new CreatorCollector(mockBeanDesc(rawType), canFixAccess);
    }

    // ==================================================================
    // hasDefaultCreator / setDefaultCreator / _fixAccess
    // ==================================================================

    @Test
    public void testHasDefaultCreator_InitiallyFalse() {
        CreatorCollector cc = newCollector(Foo.class, false);
        assertFalse(cc.hasDefaultCreator());
    }

    @Test
    public void testSetDefaultCreator_Null_NoFixAccessCalled() {
        CreatorCollector cc = newCollector(Foo.class, true);
        cc.setDefaultCreator(null); // member==null -> _fixAccess short circuits
        assertFalse(cc.hasDefaultCreator());
        assertNull(cc._creators[CreatorCollector.C_DEFAULT]);
    }

    @Test
    public void testSetDefaultCreator_NonNull_CanFixAccessFalse() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        cc.setDefaultCreator(creator);
        assertTrue(cc.hasDefaultCreator());
        verify(creator, never()).getAnnotated(); // _canFixAccess false -> short circuit
    }

    @Test
    public void testSetDefaultCreator_NonNull_CanFixAccessTrue_PublicConstructor() throws Exception {
        CreatorCollector cc = newCollector(Foo.class, true);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.getAnnotated()).thenReturn(PublicSample.class.getDeclaredConstructor());
        // must not throw for a public constructor
        cc.setDefaultCreator(creator);
        assertTrue(cc.hasDefaultCreator());
        verify(creator, times(1)).getAnnotated();
    }

    // ==================================================================
    // addStringCreator / addIntCreator / addLongCreator / addDoubleCreator / addBooleanCreator
    // (2-arg, non-deprecated) -> correct slot mapping
    // ==================================================================

    @Test
    public void testAddStringCreator_SetsCorrectSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addStringCreator(c, true);
        assertSame(c, cc._creators[CreatorCollector.C_STRING]);
        assertTrue(cc._hasNonDefaultCreator);
    }

    @Test
    public void testAddIntCreator_SetsCorrectSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addIntCreator(c, true);
        assertSame(c, cc._creators[CreatorCollector.C_INT]);
    }

    @Test
    public void testAddLongCreator_SetsCorrectSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addLongCreator(c, true);
        assertSame(c, cc._creators[CreatorCollector.C_LONG]);
    }

    @Test
    public void testAddDoubleCreator_SetsCorrectSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addDoubleCreator(c, true);
        assertSame(c, cc._creators[CreatorCollector.C_DOUBLE]);
    }

    @Test
    public void testAddBooleanCreator_SetsCorrectSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addBooleanCreator(c, true);
        assertSame(c, cc._creators[CreatorCollector.C_BOOLEAN]);
    }

    // ==================================================================
    // verifyNonDup branch coverage (via addStringCreator as representative slot)
    // ==================================================================

    @Test
    public void testVerifyNonDup_FirstAdd_NoExplicit() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addStringCreator(c, false); // oldOne == null branch
        assertSame(c, cc._creators[CreatorCollector.C_STRING]);
        assertEquals(0, cc._explicitCreators & (1 << CreatorCollector.C_STRING));
    }

    @Test
    public void testVerifyNonDup_DuplicateSameClass_NotPreviouslyExplicit_Throws() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c1 = mock(AnnotatedConstructor.class);
        AnnotatedWithParams c2 = mock(AnnotatedConstructor.class); // same runtime (mock) class
        cc.addStringCreator(c1, false);
        try {
            cc.addStringCreator(c2, false);
            fail("Expected IllegalArgumentException for duplicate same-class creator");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testVerifyNonDup_DuplicateDifferentClass_NotPreviouslyExplicit_Overwrites() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c1 = mock(AnnotatedConstructor.class);
        AnnotatedWithParams c2 = mock(AnnotatedMethod.class); // different runtime class
        cc.addStringCreator(c1, false);
        cc.addStringCreator(c2, false); // classes differ -> no throw, overwrite silently
        assertSame(c2, cc._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testVerifyNonDup_AlreadyExplicit_NewNotExplicit_SkipsOverwrite() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c1 = mock(AnnotatedConstructor.class);
        AnnotatedWithParams c2 = mock(AnnotatedMethod.class);
        cc.addStringCreator(c1, true);  // mark explicit
        cc.addStringCreator(c2, false); // new not explicit -> return early, keep old
        assertSame(c1, cc._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testVerifyNonDup_AlreadyExplicit_NewExplicitSameClass_Throws() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c1 = mock(AnnotatedConstructor.class);
        AnnotatedWithParams c2 = mock(AnnotatedConstructor.class); // same class
        cc.addStringCreator(c1, true);
        try {
            cc.addStringCreator(c2, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testVerifyNonDup_AlreadyExplicit_NewExplicitDifferentClass_Overwrites() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c1 = mock(AnnotatedConstructor.class);
        AnnotatedWithParams c2 = mock(AnnotatedMethod.class); // different class
        cc.addStringCreator(c1, true);
        cc.addStringCreator(c2, true); // classes differ -> no throw, overwrite
        assertSame(c2, cc._creators[CreatorCollector.C_STRING]);
        assertNotEquals(0, cc._explicitCreators & (1 << CreatorCollector.C_STRING));
    }

    @Test
    public void testDeprecatedVerifyNonDup_TwoArg_ReturnsStoredCreator() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        AnnotatedWithParams result = cc.verifyNonDup(c, CreatorCollector.C_LONG);
        assertSame(c, result);
        assertSame(c, cc._creators[CreatorCollector.C_LONG]);
    }

    // ==================================================================
    // Deprecated 1-arg add*Creator methods (document actual, possibly quirky, delegation)
    // ==================================================================

    @Test
    public void testDeprecatedAddStringCreator_OneArg_DelegatesNonExplicit() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addStringCreator(c);
        assertSame(c, cc._creators[CreatorCollector.C_STRING]);
        assertEquals(0, cc._explicitCreators & (1 << CreatorCollector.C_STRING));
    }

    @Test
    public void testDeprecatedAddIntCreator_OneArg_ActuallySetsBooleanSlot() {
        // NOTE: source code's deprecated addIntCreator(creator) calls addBooleanCreator(creator,false)
        // -- this is the real behavior in the given source, not an assumption.
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addIntCreator(c);
        assertNull(cc._creators[CreatorCollector.C_INT]);
        assertSame(c, cc._creators[CreatorCollector.C_BOOLEAN]);
    }

    @Test
    public void testDeprecatedAddLongCreator_OneArg_ActuallySetsBooleanSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addLongCreator(c);
        assertNull(cc._creators[CreatorCollector.C_LONG]);
        assertSame(c, cc._creators[CreatorCollector.C_BOOLEAN]);
    }

    @Test
    public void testDeprecatedAddDoubleCreator_OneArg_ActuallySetsBooleanSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addDoubleCreator(c);
        assertNull(cc._creators[CreatorCollector.C_DOUBLE]);
        assertSame(c, cc._creators[CreatorCollector.C_BOOLEAN]);
    }

    @Test
    public void testDeprecatedAddBooleanCreator_OneArg() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addBooleanCreator(c);
        assertSame(c, cc._creators[CreatorCollector.C_BOOLEAN]);
    }

    // ==================================================================
    // addDelegatingCreator
    // ==================================================================

    @Test
    public void testAddDelegatingCreator_SetsDelegateArgsAndSlot() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty[] injectables = new CreatorProperty[] { mock(CreatorProperty.class) };
        cc.addDelegatingCreator(c, true, injectables);
        assertSame(c, cc._creators[CreatorCollector.C_DELEGATE]);
        assertSame(injectables, cc._delegateArgs);
    }

    @Test
    public void testDeprecatedAddDelegatingCreator_TwoArg() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        cc.addDelegatingCreator(c, (CreatorProperty[]) null);
        assertSame(c, cc._creators[CreatorCollector.C_DELEGATE]);
        assertNull(cc._delegateArgs);
        assertEquals(0, cc._explicitCreators & (1 << CreatorCollector.C_DELEGATE));
    }

    // ==================================================================
    // addPropertyCreator - duplicate name detection branches
    // ==================================================================

    @Test
    public void testAddPropertyCreator_SinglePropertyLength1_NoDupCheckLoop() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty p = mock(CreatorProperty.class);
        CreatorProperty[] props = new CreatorProperty[] { p };
        cc.addPropertyCreator(c, true, props);
        assertSame(props, cc._propertyBasedArgs);
        // getName should never be invoked because length <= 1 skips duplicate-check loop
        verify(p, never()).getName();
    }

    @Test
    public void testAddPropertyCreator_MultipleProperties_NoDuplicates() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty p1 = mock(CreatorProperty.class);
        CreatorProperty p2 = mock(CreatorProperty.class);
        when(p1.getName()).thenReturn("a");
        when(p2.getName()).thenReturn("b");
        CreatorProperty[] props = new CreatorProperty[] { p1, p2 };
        cc.addPropertyCreator(c, false, props);
        assertSame(props, cc._propertyBasedArgs);
    }

    @Test
    public void testAddPropertyCreator_MultipleProperties_DuplicateNonEmptyNames_Throws() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty p1 = mock(CreatorProperty.class);
        CreatorProperty p2 = mock(CreatorProperty.class);
        when(p1.getName()).thenReturn("dup");
        when(p2.getName()).thenReturn("dup");
        CreatorProperty[] props = new CreatorProperty[] { p1, p2 };
        try {
            cc.addPropertyCreator(c, false, props);
            fail("Expected IllegalArgumentException for duplicate property name");
        } catch (IllegalArgumentException expected) {
            // ok
        }
        // verifyNonDup already executed before the loop -> creator slot is set
        assertSame(c, cc._creators[CreatorCollector.C_PROPS]);
        // but _propertyBasedArgs is NOT updated because exception thrown before assignment
        assertNull(cc._propertyBasedArgs);
    }

    @Test
    public void testAddPropertyCreator_EmptyNameWithInjectable_SkippedNoDuplicateThrown() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty p1 = mock(CreatorProperty.class);
        CreatorProperty p2 = mock(CreatorProperty.class);
        when(p1.getName()).thenReturn("");
        when(p1.getInjectableValueId()).thenReturn("someId");
        when(p2.getName()).thenReturn("");
        when(p2.getInjectableValueId()).thenReturn("someOtherId");
        CreatorProperty[] props = new CreatorProperty[] { p1, p2 };
        // both have empty name but non-null injectable id -> both should be "continue"-d, no exception
        cc.addPropertyCreator(c, false, props);
        assertSame(props, cc._propertyBasedArgs);
    }

    @Test
    public void testAddPropertyCreator_EmptyNameWithoutInjectable_DuplicateThrows() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty p1 = mock(CreatorProperty.class);
        CreatorProperty p2 = mock(CreatorProperty.class);
        when(p1.getName()).thenReturn("");
        when(p1.getInjectableValueId()).thenReturn(null);
        when(p2.getName()).thenReturn("");
        when(p2.getInjectableValueId()).thenReturn(null);
        CreatorProperty[] props = new CreatorProperty[] { p1, p2 };
        try {
            cc.addPropertyCreator(c, false, props);
            fail("Expected IllegalArgumentException for duplicate empty name without injectable id");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testDeprecatedAddPropertyCreator_TwoArg() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        CreatorProperty[] props = new CreatorProperty[] { mock(CreatorProperty.class) };
        cc.addPropertyCreator(c, props);
        assertSame(props, cc._propertyBasedArgs);
        assertEquals(0, cc._explicitCreators & (1 << CreatorCollector.C_PROPS));
    }

    // ==================================================================
    // addIncompeteParameter
    // ==================================================================

    @Test
    public void testAddIncompeteParameter_FirstSetsField() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedParameter p1 = mock(AnnotatedParameter.class);
        cc.addIncompeteParameter(p1);
        assertSame(p1, cc._incompleteParameter);
    }

    @Test
    public void testAddIncompeteParameter_SecondDoesNotOverwrite() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedParameter p1 = mock(AnnotatedParameter.class);
        AnnotatedParameter p2 = mock(AnnotatedParameter.class);
        cc.addIncompeteParameter(p1);
        cc.addIncompeteParameter(p2); // should be ignored, _incompleteParameter != null
        assertSame(p1, cc._incompleteParameter);
    }

    // ==================================================================
    // constructValueInstantiator - vanilla branches
    // ==================================================================

    @Test
    public void testConstructValueInstantiator_Vanilla_Collection() {
        CreatorCollector cc = newCollector(Collection.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
    }

    @Test
    public void testConstructValueInstantiator_Vanilla_List() {
        CreatorCollector cc = newCollector(List.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
    }

    @Test
    public void testConstructValueInstantiator_Vanilla_ArrayList() {
        CreatorCollector cc = newCollector(ArrayList.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
    }

    @Test
    public void testConstructValueInstantiator_Vanilla_Map() {
        CreatorCollector cc = newCollector(Map.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(LinkedHashMap.class.getName(), vi.getValueTypeDesc());
    }

    @Test
    public void testConstructValueInstantiator_Vanilla_LinkedHashMap() {
        CreatorCollector cc = newCollector(LinkedHashMap.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(LinkedHashMap.class.getName(), vi.getValueTypeDesc());
    }

    @Test
    public void testConstructValueInstantiator_Vanilla_HashMap() {
        CreatorCollector cc = newCollector(HashMap.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
        assertEquals(HashMap.class.getName(), vi.getValueTypeDesc());
        // ensure HashMap does not get mistakenly classified as LinkedHashMap (fault-detection)
        Object created = null;
        try {
            created = vi.createUsingDefault(null);
        } catch (Exception e) {
            fail("createUsingDefault should not throw for HashMap vanilla type");
        }
        assertTrue(created instanceof HashMap);
        assertFalse(created instanceof LinkedHashMap);
    }

    @Test
    public void testConstructValueInstantiator_NonVanillaRawType_ReturnsStdValueInstantiator() {
        CreatorCollector cc = newCollector(Foo.class, false);
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof StdValueInstantiator);
    }

    @Test
    public void testConstructValueInstantiator_DefaultCreatorSet_StillVanilla() {
        // setDefaultCreator does NOT set _hasNonDefaultCreator -> maybeVanilla stays true
        CreatorCollector cc = newCollector(ArrayList.class, false);
        cc.setDefaultCreator(mock(AnnotatedWithParams.class));
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof CreatorCollector.Vanilla);
    }

    // ==================================================================
    // constructValueInstantiator - delegate-type resolution branches
    // ==================================================================

    @Test
    public void testConstructValueInstantiator_HasNonDefaultCreator_DelegateNull_ReturnsStd() {
        CreatorCollector cc = newCollector(Foo.class, false);
        cc.addStringCreator(mock(AnnotatedWithParams.class), false); // hasNonDefaultCreator=true
        // _creators[C_DELEGATE] stays null -> OR condition true via 2nd operand
        BeanDescription bd = cc._beanDesc; // package-private access
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof StdValueInstantiator);
        verify(bd, never()).bindingsForBeanType(); // else-branch not entered
    }

    @Test
    public void testConstructValueInstantiator_DelegateNotNull_DelegateArgsNull_UsesIndexZero() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        cc.addDelegatingCreator(delegateCreator, false, null); // _delegateArgs == null
        ValueInstantiator vi = cc.constructValueInstantiator(mock(DeserializationConfig.class));
        assertTrue(vi instanceof StdValueInstantiator);
        verify(delegateCreator, times(1)).getGenericParameterType(0);
        verify(cc._beanDesc, times(1)).bindingsForBeanType();
    }

    @Test
    public void testConstructValueInstantiator_DelegateArgsWithNullMarker_FindsIndex() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        CreatorProperty[] delegateArgs = new CreatorProperty[] {
                mock(CreatorProperty.class), null, mock(CreatorProperty.class)
        };
        cc.addDelegatingCreator(delegateCreator, false, delegateArgs);
        cc.constructValueInstantiator(mock(DeserializationConfig.class));
        verify(delegateCreator, times(1)).getGenericParameterType(1); // found null marker at index 1
        verify(delegateCreator, never()).getGenericParameterType(0);
        verify(delegateCreator, never()).getGenericParameterType(2);
    }

    @Test
    public void testConstructValueInstantiator_DelegateArgsNoNullMarker_LoopCompletesWithoutBreak() {
        CreatorCollector cc = newCollector(Foo.class, false);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        CreatorProperty[] delegateArgs = new CreatorProperty[] {
                mock(CreatorProperty.class), mock(CreatorProperty.class)
        };
        cc.addDelegatingCreator(delegateCreator, false, delegateArgs);
        cc.constructValueInstantiator(mock(DeserializationConfig.class));
        // no null entry found -> ix remains 0 (loop iterates fully without break)
        verify(delegateCreator, times(1)).getGenericParameterType(0);
    }

    // ==================================================================
    // Vanilla nested class - direct tests
    // ==================================================================

    @Test
    public void testVanilla_Collection_TypeDescAndCreate() throws Exception {
        CreatorCollector.Vanilla v = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION);
        assertEquals(ArrayList.class.getName(), v.getValueTypeDesc());
        assertTrue(v.canInstantiate());
        assertTrue(v.canCreateUsingDefault());
        Object created = v.createUsingDefault(null);
        assertTrue(created instanceof ArrayList);
    }

    @Test
    public void testVanilla_Map_TypeDescAndCreate() throws Exception {
        CreatorCollector.Vanilla v = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP);
        assertEquals(LinkedHashMap.class.getName(), v.getValueTypeDesc());
        Object created = v.createUsingDefault(null);
        assertTrue(created instanceof LinkedHashMap);
    }

    @Test
    public void testVanilla_HashMap_TypeDescAndCreate() throws Exception {
        CreatorCollector.Vanilla v = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP);
        assertEquals(HashMap.class.getName(), v.getValueTypeDesc());
        Object created = v.createUsingDefault(null);
        assertTrue(created instanceof HashMap);
        assertFalse(created instanceof LinkedHashMap);
    }

    @Test
    public void testVanilla_UnknownType_TypeDescFallsBackToObject() {
        // type code not matching any case -> default branch of switch in getValueTypeDesc()
        CreatorCollector.Vanilla v = new CreatorCollector.Vanilla(999);
        assertEquals(Object.class.getName(), v.getValueTypeDesc());
    }

    @Test
    public void testVanilla_UnknownType_CreateUsingDefaultThrows() {
        CreatorCollector.Vanilla v = new CreatorCollector.Vanilla(999);
        try {
            v.createUsingDefault(null);
            fail("Expected IllegalStateException for unknown vanilla type");
        } catch (IllegalStateException expected) {
            // ok
        } catch (Exception e) {
            fail("Expected IllegalStateException but got " + e);
        }
    }
}
```

# สรุปตาราง Test Coverage

| กลุ่ม Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testHasDefaultCreator_InitiallyFalse` | `hasDefaultCreator()` เมื่อยังไม่ตั้งค่า |
| `testSetDefaultCreator_Null_*` | `_fixAccess`: member==null → skip |
| `testSetDefaultCreator_NonNull_CanFixAccessFalse` | `_fixAccess`: `_canFixAccess=false` → short-circuit |
| `testSetDefaultCreator_NonNull_CanFixAccessTrue_*` | `_fixAccess`: `_canFixAccess=true` เรียก `getAnnotated()`/`ClassUtil` |
| `testAdd*Creator_SetsCorrectSlot` (String/Int/Long/Double/Boolean) | Mapping slot ที่ถูกต้องของแต่ละ add-method |
| `testVerifyNonDup_FirstAdd_NoExplicit` | `oldOne == null` |
| `testVerifyNonDup_DuplicateSameClass_NotPreviouslyExplicit_Throws` | `oldOne!=null`, mask==0, class เท่ากัน → throw |
| `testVerifyNonDup_DuplicateDifferentClass_NotPreviouslyExplicit_Overwrites` | class ไม่เท่ากัน → overwrite เงียบ ๆ |
| `testVerifyNonDup_AlreadyExplicit_NewNotExplicit_SkipsOverwrite` | mask!=0 & `!explicit` → return early |
| `testVerifyNonDup_AlreadyExplicit_NewExplicitSameClass_Throws` | mask!=0 & explicit & class เท่ากัน → throw |
| `testVerifyNonDup_AlreadyExplicit_NewExplicitDifferentClass_Overwrites` | mask!=0 & explicit & class ต่างกัน → overwrite + set mask |
| `testDeprecatedVerifyNonDup_TwoArg_*` | Deprecated overload คืนค่า `_creators[typeIndex]` |
| `testDeprecatedAdd*Creator_OneArg_*` | Deprecated 1-arg methods (รวมพฤติกรรม "bug" ที่ Int/Long/Double ไปตั้งค่า Boolean slot จริงตามซอร์ส) |
| `testAddDelegatingCreator_*`, `testDeprecatedAddDelegatingCreator_TwoArg` | ตั้งค่า `_delegateArgs`+slot / deprecated delegate |
| `testAddPropertyCreator_SinglePropertyLength1_*` | `properties.length>1` เป็น false → ข้าม loop |
| `testAddPropertyCreator_MultipleProperties_NoDuplicates` | loop ผ่านโดยไม่ throw |
| `testAddPropertyCreator_MultipleProperties_DuplicateNonEmptyNames_Throws` | duplicate name → throw, ตรวจ side-effect ของ `verifyNonDup` ก่อน exception |
| `testAddPropertyCreator_EmptyNameWithInjectable_SkippedNoDuplicateThrown` | `name.length()==0 && injectableId!=null` → `continue` |
| `testAddPropertyCreator_EmptyNameWithoutInjectable_DuplicateThrows` | empty name แต่ไม่มี injectable → ตรวจซ้ำ → throw |
| `testDeprecatedAddPropertyCreator_TwoArg` | Deprecated overload delegate ถูก |
| `testAddIncompeteParameter_FirstSetsField` / `_SecondDoesNotOverwrite` | if `_incompleteParameter==null` set / ไม่ set ซ้ำ |
| `testConstructValueInstantiator_Vanilla_*` (Collection/List/ArrayList/Map/LinkedHashMap/HashMap) | ทุก branch ของ `rawType ==` ใน vanilla check |
| `testConstructValueInstantiator_NonVanillaRawType_ReturnsStdValueInstantiator` | fallback ไม่เข้า vanilla ใด ๆ |
| `testConstructValueInstantiator_DefaultCreatorSet_StillVanilla` | ยืนยันว่า `setDefaultCreator` ไม่กระทบ `_hasNonDefaultCreator` |
| `testConstructValueInstantiator_HasNonDefaultCreator_DelegateNull_ReturnsStd` | OR condition true (operand 2: delegate==null) |
| `testConstructValueInstantiator_DelegateNotNull_DelegateArgsNull_UsesIndexZero` | OR condition false → else branch, `_delegateArgs==null` → ix=0 |
| `testConstructValueInstantiator_DelegateArgsWithNullMarker_FindsIndex` | loop พบ null marker → break, ix=1 |
| `testConstructValueInstantiator_DelegateArgsNoNullMarker_LoopCompletesWithoutBreak` | loop จบโดยไม่ break, ix ยังเป็น 0 |
| `testVanilla_Collection/Map/HashMap_TypeDescAndCreate` | switch-case ทั้งหมดใน `getValueTypeDesc()`/`createUsingDefault()` |
| `testVanilla_UnknownType_TypeDescFallsBackToObject` | switch default branch ของ `getValueTypeDesc()` |
| `testVanilla_UnknownType_CreateUsingDefaultThrows` | switch default → throw `IllegalStateException` |

**ข้อจำกัด/สมมติฐานที่ระบุไว้ในคอมเมนต์โค้ด:** ไม่ได้ stub ค่า return ของ `AnnotatedWithParams.getGenericParameterType(int)` และ `TypeBindings.resolveType(...)` เนื่องจาก signature เต็มไม่ปรากฏในซอร์สที่ให้มา จึงตรวจสอบผ่านการ verify การเรียกเมธอด (interaction) เท่านั้น เพื่อไม่เดา behavior ที่ไม่มีหลักฐานในซอร์ส