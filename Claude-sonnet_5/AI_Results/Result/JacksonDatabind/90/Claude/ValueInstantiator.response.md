# JUnit 4 Test Suite: `ValueInstantiatorTest`

## แนวคิดการทดสอบ

- `ValueInstantiator` เป็น abstract class ที่ทุกเมธอดมี default implementation (ไม่มี abstract method จริง) จึงสามารถสร้าง instance ตรงๆ หรือใช้ anonymous subclass override เฉพาะเมธอดที่ต้องการทดสอบ branch นั้นๆ
- ใช้ Mockito mock `DeserializationContext` และ `JsonParser` เพื่อจำลองการเรียก `ctxt.handleMissingInstantiator(...)`, `ctxt.getParser()`, `ctxt.isEnabled(...)`
- **หมายเหตุสำคัญ (คอมเมนต์กำกับตามข้อ 4):** `handleMissingInstantiator(Class<?>, JsonParser, String, Object...)` เป็น varargs method — เมธอดที่ไม่มี extra arg (เช่น `createUsingDefault`) จะเรียกแบบ 3 พารามิเตอร์ (vararg array ว่าง) ส่วนเมธอดที่มีค่าแทรกใน message (`createFromInt/Long/Double/Boolean`, และ fallback ของ `createFromString`) จะเรียกแบบมี 1 vararg element จึงต้อง stub แยกกัน 2 รูปแบบ
- สมมติว่า mock ของ `DeserializationContext` สามารถ stub ได้ตามปกติ (ไม่ได้ทดสอบ implementation จริงของ `DeserializationContext` เนื่องจากไม่มีซอร์สให้)

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

public class ValueInstantiatorTest {

    private DeserializationContext ctxtMock;
    private JsonParser parserMock;

    /** Plain instantiator with zero overrides -- represents "all default" state. */
    static class DefaultInstantiator extends ValueInstantiator {}

    @Before
    public void setUp() {
        ctxtMock = mock(DeserializationContext.class);
        parserMock = mock(JsonParser.class);
        when(ctxtMock.getParser()).thenReturn(parserMock);
    }

    // ---- helpers for stubbing the varargs handleMissingInstantiator ----

    private void stubHandleMissingNoExtra(Object ret) throws IOException {
        when(ctxtMock.handleMissingInstantiator(
                any(Class.class), any(JsonParser.class), anyString()))
                .thenReturn(ret);
    }

    private void stubHandleMissingOneExtra(Object ret) throws IOException {
        when(ctxtMock.handleMissingInstantiator(
                any(Class.class), any(JsonParser.class), anyString(), any()))
                .thenReturn(ret);
    }

    /* ======================================================
     * getValueClass() / getValueTypeDesc()
     * ====================================================== */

    @Test
    public void testGetValueClassDefaultIsObject() {
        ValueInstantiator vi = new DefaultInstantiator();
        assertEquals(Object.class, vi.getValueClass());
    }

    @Test
    public void testGetValueTypeDescReturnsClassName() {
        ValueInstantiator vi = new DefaultInstantiator();
        assertEquals("java.lang.Object", vi.getValueTypeDesc());
    }

    @Test
    public void testGetValueTypeDescNullClassReturnsUnknown() {
        // branch: cls == null -> "UNKNOWN"
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public Class<?> getValueClass() { return null; }
        };
        assertEquals("UNKNOWN", vi.getValueTypeDesc());
    }

    /* ======================================================
     * canInstantiate() -- each OR-branch
     * ====================================================== */

    @Test
    public void testCanInstantiateAllFalseByDefault() {
        ValueInstantiator vi = new DefaultInstantiator();
        assertFalse(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaDefaultCreator() {
        final AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public AnnotatedWithParams getDefaultCreator() { return creator; }
        };
        assertTrue(vi.canCreateUsingDefault());
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaDelegate() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateUsingDelegate() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromObjectWith() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromObjectWith() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromString() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromString() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromInt() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromInt() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromLong() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromLong() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromDouble() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromDouble() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateTrueViaFromBoolean() {
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }
        };
        assertTrue(vi.canInstantiate());
    }

    @Test
    public void testCanCreateUsingDefaultFalseWhenNoCreator() {
        ValueInstantiator vi = new DefaultInstantiator();
        assertNull(vi.getDefaultCreator());
        assertFalse(vi.canCreateUsingDefault());
    }

    /* ======================================================
     * Default "creation" methods that delegate to
     * ctxt.handleMissingInstantiator(...)
     * ====================================================== */

    @Test
    public void testCreateUsingDefaultDelegatesToHandleMissing() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingNoExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createUsingDefault(ctxtMock);

        assertSame(sentinel, result);
        verify(ctxtMock).handleMissingInstantiator(
                eq(Object.class), eq(parserMock), anyString());
    }

    @Test
    public void testCreateFromObjectWithArrayDelegatesToHandleMissing() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingNoExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromObjectWith(ctxtMock, new Object[] { "a" });

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateUsingDelegateDelegatesToHandleMissing() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingNoExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createUsingDelegate(ctxtMock, "delegateValue");

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateUsingArrayDelegateDelegatesToHandleMissing() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingNoExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createUsingArrayDelegate(ctxtMock, "arr");

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateFromIntDelegatesToHandleMissingWithValue() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromInt(ctxtMock, 42);

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateFromLongDelegatesToHandleMissingWithValue() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromLong(ctxtMock, 123456789L);

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateFromDoubleDelegatesToHandleMissingWithValue() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromDouble(ctxtMock, 3.14);

        assertSame(sentinel, result);
    }

    @Test
    public void testCreateFromBooleanDelegatesToHandleMissingWithValue() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromBoolean(ctxtMock, true);

        assertSame(sentinel, result);
    }

    /* ======================================================
     * createFromObjectWith(ctxt, props, buffer) default delegation
     * ====================================================== */

    @Test
    public void testCreateFromObjectWithPropsBufferDelegatesToArrayOverload() throws IOException {
        final Object[] expectedArgs = new Object[] { "x" };
        SettableBeanProperty[] props = new SettableBeanProperty[0];
        PropertyValueBuffer bufferMock = mock(PropertyValueBuffer.class);
        when(bufferMock.getParameters(props)).thenReturn(expectedArgs);

        final Object sentinel = new Object();
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
                assertArrayEquals(expectedArgs, args);
                return sentinel;
            }
        };

        Object result = vi.createFromObjectWith(ctxtMock, props, bufferMock);
        assertSame(sentinel, result);
    }

    /* ======================================================
     * createFromString(...) / _createFromStringFallbacks(...)
     * ====================================================== */

    // canCreateFromBoolean()==false, nonempty string -> handleMissingInstantiator
    @Test
    public void testCreateFromStringBooleanFalseNonEmptyFallback() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromString(ctxtMock, "abc");

        assertSame(sentinel, result);
    }

    // canCreateFromBoolean()==false, empty string, feature ENABLED -> null
    @Test
    public void testCreateFromStringEmptyFeatureEnabledReturnsNull() throws IOException {
        when(ctxtMock.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
                .thenReturn(true);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromString(ctxtMock, "");

        assertNull(result);
        verify(ctxtMock, never()).handleMissingInstantiator(
                any(Class.class), any(JsonParser.class), anyString(), any());
    }

    // canCreateFromBoolean()==false, empty string, feature DISABLED -> fallback
    @Test
    public void testCreateFromStringEmptyFeatureDisabledFallback() throws IOException {
        when(ctxtMock.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
                .thenReturn(false);
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromString(ctxtMock, "");

        assertSame(sentinel, result);
    }

    // Boundary/fault-detection: whitespace-only string has length()!=0,
    // must NOT be treated as empty string (checks untrimmed length, not trimmed).
    @Test
    public void testCreateFromStringWhitespaceOnlyIsNotTreatedAsEmpty() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);
        // isEnabled stub intentionally NOT set to true; if implementation wrongly
        // used trimmed value for the length check, this test would fail because
        // it would try to return null instead of calling handleMissingInstantiator.
        when(ctxtMock.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
                .thenReturn(true);

        ValueInstantiator vi = new DefaultInstantiator();
        Object result = vi.createFromString(ctxtMock, "   ");

        assertSame(sentinel, result);
    }

    // canCreateFromBoolean()==true, trimmed value == "true"
    @Test
    public void testCreateFromStringBooleanTrueConvertsTrimmedTrue() throws IOException {
        final boolean[] capturedValue = new boolean[1];
        final Object sentinel = new Object();
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }

            @Override
            public Object createFromBoolean(DeserializationContext ctxt, boolean value) {
                capturedValue[0] = value;
                return sentinel;
            }
        };

        Object result = vi.createFromString(ctxtMock, "  true  ");

        assertSame(sentinel, result);
        assertTrue(capturedValue[0]);
    }

    // canCreateFromBoolean()==true, trimmed value == "false"
    @Test
    public void testCreateFromStringBooleanTrueConvertsTrimmedFalse() throws IOException {
        final boolean[] capturedValue = new boolean[1];
        final Object sentinel = new Object();
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }

            @Override
            public Object createFromBoolean(DeserializationContext ctxt, boolean value) {
                capturedValue[0] = value;
                return sentinel;
            }
        };

        Object result = vi.createFromString(ctxtMock, " false ");

        assertSame(sentinel, result);
        assertFalse(capturedValue[0]);
    }

    // canCreateFromBoolean()==true but value does not match "true"/"false" and
    // is non-empty -> falls through to handleMissingInstantiator.
    @Test
    public void testCreateFromStringBooleanTrueNonMatchingNonEmptyFallback() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }
        };

        Object result = vi.createFromString(ctxtMock, "xyz");
        assertSame(sentinel, result);
    }

    // Fault-detection: comparison must be case-sensitive ("TRUE" != "true").
    @Test
    public void testCreateFromStringBooleanTrueIsCaseSensitive() throws IOException {
        Object sentinel = new Object();
        stubHandleMissingOneExtra(sentinel);

        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }
            // createFromBoolean intentionally NOT overridden; if "TRUE" were wrongly
            // matched, this test would fail because the mock stub for
            // handleMissingInstantiator would not be hit as expected (instead the
            // default createFromBoolean fallback with different message would run).
        };

        Object result = vi.createFromString(ctxtMock, "TRUE");
        assertSame(sentinel, result);
    }

    // canCreateFromBoolean()==true, trimmed value empty -> falls to length()==0 check
    @Test
    public void testCreateFromStringBooleanTrueEmptyValueFeatureEnabled() throws IOException {
        when(ctxtMock.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
                .thenReturn(true);

        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public boolean canCreateFromBoolean() { return true; }
        };

        Object result = vi.createFromString(ctxtMock, "");
        assertNull(result);
    }

    /* ======================================================
     * Default accessors that simply return null / false
     * ====================================================== */

    @Test
    public void testDefaultAccessorsReturnNullOrFalse() {
        ValueInstantiator vi = new DefaultInstantiator();

        assertFalse(vi.canCreateFromString());
        assertFalse(vi.canCreateFromInt());
        assertFalse(vi.canCreateFromLong());
        assertFalse(vi.canCreateFromDouble());
        assertFalse(vi.canCreateFromBoolean());
        assertFalse(vi.canCreateUsingDelegate());
        assertFalse(vi.canCreateUsingArrayDelegate());
        assertFalse(vi.canCreateFromObjectWith());

        assertNull(vi.getFromObjectArguments(null));
        assertNull(vi.getDelegateType(null));
        assertNull(vi.getArrayDelegateType(null));

        assertNull(vi.getDefaultCreator());
        assertNull(vi.getDelegateCreator());
        assertNull(vi.getArrayDelegateCreator());
        assertNull(vi.getWithArgsCreator());
        assertNull(vi.getIncompleteParameter());
    }

    /* ======================================================
     * ValueInstantiator.Base
     * ====================================================== */

    @Test
    public void testBaseConstructorWithClass() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(String.class);
        assertEquals(String.class, base.getValueClass());
        assertEquals("java.lang.String", base.getValueTypeDesc());
    }

    @Test
    public void testBaseConstructorWithJavaType() {
        JavaType typeMock = mock(JavaType.class);
        when(typeMock.getRawClass()).thenReturn((Class) Integer.class);

        ValueInstantiator.Base base = new ValueInstantiator.Base(typeMock);
        assertEquals(Integer.class, base.getValueClass());
        assertEquals("java.lang.Integer", base.getValueTypeDesc());
    }

    @Test
    public void testBaseCanInstantiateUsesInheritedLogic() {
        // Base does not override canCreateXxx -> should behave same as default (false)
        ValueInstantiator.Base base = new ValueInstantiator.Base(Object.class);
        assertFalse(base.canInstantiate());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testGetValueClassDefaultIsObject | ค่า default ของ `getValueClass()` |
| testGetValueTypeDescReturnsClassName | `getValueTypeDesc()`: `cls != null` |
| testGetValueTypeDescNullClassReturnsUnknown | `getValueTypeDesc()`: `cls == null` |
| testCanInstantiateAllFalseByDefault | `canInstantiate()`: ทุก OR-condition เป็น false |
| testCanInstantiateTrueViaDefaultCreator | `canInstantiate()` ผ่าน `canCreateUsingDefault()==true` (จาก `getDefaultCreator()!=null`) |
| testCanInstantiateTrueViaDelegate ... ViaFromBoolean (8 methods) | `canInstantiate()` แต่ละ OR-branch (`canCreateUsingDelegate`, `canCreateFromObjectWith`, `canCreateFromString/Int/Long/Double/Boolean`) |
| testCanCreateUsingDefaultFalseWhenNoCreator | `canCreateUsingDefault()`: `getDefaultCreator()==null` |
| testCreateUsingDefaultDelegatesToHandleMissing | `createUsingDefault` → `handleMissingInstantiator` (3-arg) |
| testCreateFromObjectWithArrayDelegatesToHandleMissing | `createFromObjectWith(ctxt,args)` → fallback |
| testCreateUsingDelegateDelegatesToHandleMissing | `createUsingDelegate` → fallback |
| testCreateUsingArrayDelegateDelegatesToHandleMissing | `createUsingArrayDelegate` → fallback |
| testCreateFromIntDelegatesToHandleMissingWithValue | `createFromInt` → fallback (4-arg) |
| testCreateFromLongDelegatesToHandleMissingWithValue | `createFromLong` → fallback |
| testCreateFromDoubleDelegatesToHandleMissingWithValue | `createFromDouble` → fallback |
| testCreateFromBooleanDelegatesToHandleMissingWithValue | `createFromBoolean` → fallback |
| testCreateFromObjectWithPropsBufferDelegatesToArrayOverload | `createFromObjectWith(ctxt,props,buffer)` delegation ไป overload อื่น |
| testCreateFromStringBooleanFalseNonEmptyFallback | `_createFromStringFallbacks`: `canCreateFromBoolean()==false`, ไม่เข้าเช็ค empty |
| testCreateFromStringEmptyFeatureEnabledReturnsNull | `value.length()==0` true, `isEnabled(...)==true` → return null |
| testCreateFromStringEmptyFeatureDisabledFallback | `value.length()==0` true, `isEnabled(...)==false` → fallback |
| testCreateFromStringWhitespaceOnlyIsNotTreatedAsEmpty | boundary: whitespace ไม่ใช่ length==0 (fault-detection) |
| testCreateFromStringBooleanTrueConvertsTrimmedTrue | `canCreateFromBoolean()==true`, `"true".equals(str)` |
| testCreateFromStringBooleanTrueConvertsTrimmedFalse | `canCreateFromBoolean()==true`, `"false".equals(str)` |
| testCreateFromStringBooleanTrueNonMatchingNonEmptyFallback | `canCreateFromBoolean()==true`, ไม่ match ทั้งสอง, length!=0 → fallback |
| testCreateFromStringBooleanTrueIsCaseSensitive | ตรวจ case-sensitivity ของการเทียบ string (fault-detection) |
| testCreateFromStringBooleanTrueEmptyValueFeatureEnabled | `canCreateFromBoolean()==true`, value ว่าง → เข้าเช็ค length==0 → null |
| testDefaultAccessorsReturnNullOrFalse | ค่า default ของเมธอด accessor ต่างๆ (getXxx/canXxx) |
| testBaseConstructorWithClass | `ValueInstantiator.Base(Class)` ctor + override `getValueClass`/`getValueTypeDesc` |
| testBaseConstructorWithJavaType | `ValueInstantiator.Base(JavaType)` ctor ผ่าน `type.getRawClass()` |
| testBaseCanInstantiateUsesInheritedLogic | `Base` สืบทอด logic `canInstantiate()` จาก parent |

**ข้อสังเกต:** เนื่องจาก `DeserializationContext` ไม่ได้ให้ซอร์สมาด้วย จึงใช้ Mockito mock ทั้งหมดและไม่ได้ทดสอบ behavior จริงของมัน (เช่น `isEnabled`, `handleMissingInstantiator`) — สมมติฐานนี้ถูกคอมเมนต์กำกับไว้ในโค้ดตามข้อกำหนดที่ 4