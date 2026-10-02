package org.apache.commons.lang3.builder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.lang3.builder.ToStringStyle; // redundant แต่ใส่ตามข้อกำหนด

public class ToStringStyleTest {

    /**
     * Subclass เปล่า ใช้เพื่อ instantiate abstract class เท่านั้น
     * ไม่ override อะไรเพิ่ม เพื่อทดสอบ logic ของ base class ตรง ๆ
     */
    static class ToStringStyleImpl extends ToStringStyle {
        private static final long serialVersionUID = 1L;
        ToStringStyleImpl() {
            super();
        }
    }

    private ToStringStyleImpl style;
    private StringBuffer buf;

    @Before
    public void setUp() {
        style = new ToStringStyleImpl();
        buf = new StringBuffer();
    }

    // ------------------------------------------------------------------
    // appendSuper / appendToString
    // ------------------------------------------------------------------

    @Test
    public void testAppendSuper_NullIsIgnored() {
        style.appendSuper(buf, null);
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendToString_Null() {
        style.appendToString(buf, null);
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendToString_NoBrackets() {
        // ไม่มี contentStart -> pos2 < 0 -> condition รวมเป็น false
        style.appendToString(buf, "NoBracketsHere");
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendToString_EmptyContent() {
        // "[]" -> pos1 == pos2 -> condition false
        style.appendToString(buf, "[]");
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendToString_WithContent() {
        style.appendToString(buf, "Foo[bar=1]");
        assertEquals("bar=1,", buf.toString());
    }

    @Test
    public void testAppendToString_FieldSeparatorAtStart() {
        style.setFieldSeparatorAtStart(true);
        buf.append("existing,");
        style.appendToString(buf, "Foo[bar=1]");
        assertEquals("existingbar=1,", buf.toString());
    }

    // ------------------------------------------------------------------
    // appendStart / appendEnd
    // ------------------------------------------------------------------

    @Test
    public void testAppendStart_NullObject() {
        style.appendStart(buf, null);
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendStart_ValidObject() {
        Object obj = new Object();
        style.appendStart(buf, obj);
        String result = buf.toString();
        assertTrue(result.contains(obj.getClass().getName()));
        assertTrue(result.endsWith("["));
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testAppendStart_FieldSeparatorAtStartTrue() {
        style.setFieldSeparatorAtStart(true);
        Object obj = new Object();
        style.appendStart(buf, obj);
        assertTrue(buf.toString().endsWith("[,"));
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testAppendEnd_FieldSeparatorAtEndFalse_RemovesTrailingSeparator() {
        buf.append("field=1,");
        style.appendEnd(buf, new Object());
        assertEquals("field=1]", buf.toString());
    }

    @Test
    public void testAppendEnd_FieldSeparatorAtEndTrue_KeepsTrailingSeparator() {
        style.setFieldSeparatorAtEnd(true);
        buf.append("field=1,");
        style.appendEnd(buf, new Object());
        assertEquals("field=1,]", buf.toString());
    }

    // ------------------------------------------------------------------
    // removeLastFieldSeparator
    // ------------------------------------------------------------------

    @Test
    public void testRemoveLastFieldSeparator_Match() {
        buf.append("abc,");
        style.removeLastFieldSeparator(buf);
        assertEquals("abc", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator_NoMatch() {
        buf.append("abcX");
        style.removeLastFieldSeparator(buf);
        assertEquals("abcX", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator_BufferShorterThanSeparator() {
        style.setFieldSeparator("XYZ");
        buf.append("ab");
        style.removeLastFieldSeparator(buf);
        assertEquals("ab", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator_ZeroLengthSeparator() {
        style.setFieldSeparator(null); // แปลงเป็น ""
        buf.append("abc");
        style.removeLastFieldSeparator(buf);
        assertEquals("abc", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator_EmptyBuffer() {
        style.removeLastFieldSeparator(buf);
        assertEquals("", buf.toString());
    }

    // ------------------------------------------------------------------
    // append(Object, fullDetail)
    // ------------------------------------------------------------------

    @Test
    public void testAppendObject_NullValue() {
        style.append(buf, "field", (Object) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendObject_FullDetailTrue() {
        style.append(buf, "field", "value", Boolean.TRUE);
        assertEquals("field=value,", buf.toString());
    }

    @Test
    public void testAppendObject_FullDetailFalse() {
        style.append(buf, "field", "value", Boolean.FALSE);
        assertEquals("field=<String>,", buf.toString());
    }

    @Test
    public void testAppendObject_FullDetailNullUsesDefaultTrue() {
        style.append(buf, "field", "value", null);
        assertEquals("field=value,", buf.toString());
    }

    @Test
    public void testAppendObject_FullDetailNullUsesDefaultFalse() {
        style.setDefaultFullDetail(false);
        style.append(buf, "field", "value", null);
        assertEquals("field=<String>,", buf.toString());
    }

    // ------------------------------------------------------------------
    // Collection / Map
    // ------------------------------------------------------------------

    @Test
    public void testAppendCollection_Detail() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        style.append(buf, "field", (Object) list, Boolean.TRUE);
        assertEquals("field=" + list.toString() + ",", buf.toString());
    }

    @Test
    public void testAppendCollection_Summary() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        style.append(buf, "field", (Object) list, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendMap_Detail() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        style.append(buf, "field", (Object) map, Boolean.TRUE);
        assertEquals("field=" + map.toString() + ",", buf.toString());
    }

    @Test
    public void testAppendMap_Summary() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        style.append(buf, "field", (Object) map, Boolean.FALSE);
        assertEquals("field=<size=1>,", buf.toString());
    }

    // ------------------------------------------------------------------
    // Primitive arrays: null / detail / summary (ทุกชนิด)
    // ------------------------------------------------------------------

    @Test
    public void testAppendLongArray_Null() {
        style.append(buf, "field", (long[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendLongArray_Detail() {
        style.append(buf, "field", new long[]{1L, 2L}, Boolean.TRUE);
        assertEquals("field={1,2},", buf.toString());
    }

    @Test
    public void testAppendLongArray_Summary() {
        style.append(buf, "field", new long[]{1L, 2L}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendIntArray_Null() {
        style.append(buf, "field", (int[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendIntArray_Detail() {
        style.append(buf, "field", new int[]{1, 2}, Boolean.TRUE);
        assertEquals("field={1,2},", buf.toString());
    }

    @Test
    public void testAppendIntArray_Summary() {
        style.append(buf, "field", new int[]{1, 2}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendShortArray_Null() {
        style.append(buf, "field", (short[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendShortArray_Detail() {
        style.append(buf, "field", new short[]{(short) 1, (short) 2}, Boolean.TRUE);
        assertEquals("field={1,2},", buf.toString());
    }

    @Test
    public void testAppendShortArray_Summary() {
        style.append(buf, "field", new short[]{(short) 1, (short) 2}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendByteArray_Null() {
        style.append(buf, "field", (byte[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendByteArray_Detail() {
        style.append(buf, "field", new byte[]{(byte) 1, (byte) 2}, Boolean.TRUE);
        assertEquals("field={1,2},", buf.toString());
    }

    @Test
    public void testAppendByteArray_Summary() {
        style.append(buf, "field", new byte[]{(byte) 1, (byte) 2}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendCharArray_Null() {
        style.append(buf, "field", (char[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendCharArray_Detail() {
        style.append(buf, "field", new char[]{'a', 'b'}, Boolean.TRUE);
        assertEquals("field={a,b},", buf.toString());
    }

    @Test
    public void testAppendCharArray_Summary() {
        style.append(buf, "field", new char[]{'a', 'b'}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendDoubleArray_Null() {
        style.append(buf, "field", (double[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendDoubleArray_Detail() {
        style.append(buf, "field", new double[]{1.0, 2.0}, Boolean.TRUE);
        assertEquals("field={1.0,2.0},", buf.toString());
    }

    @Test
    public void testAppendDoubleArray_Summary() {
        style.append(buf, "field", new double[]{1.0, 2.0}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendFloatArray_Null() {
        style.append(buf, "field", (float[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendFloatArray_Detail() {
        style.append(buf, "field", new float[]{1.0f, 2.0f}, Boolean.TRUE);
        assertEquals("field={1.0,2.0},", buf.toString());
    }

    @Test
    public void testAppendFloatArray_Summary() {
        style.append(buf, "field", new float[]{1.0f, 2.0f}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendBooleanArray_Null() {
        style.append(buf, "field", (boolean[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendBooleanArray_Detail() {
        style.append(buf, "field", new boolean[]{true, false}, Boolean.TRUE);
        assertEquals("field={true,false},", buf.toString());
    }

    @Test
    public void testAppendBooleanArray_Summary() {
        style.append(buf, "field", new boolean[]{true, false}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    // ------------------------------------------------------------------
    // Object[] arrays
    // ------------------------------------------------------------------

    @Test
    public void testAppendObjectArray_Null() {
        style.append(buf, "field", (Object[]) null, Boolean.TRUE);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendObjectArray_Detail() {
        style.append(buf, "field", new Object[]{"a", "b"}, Boolean.TRUE);
        assertEquals("field={a,b},", buf.toString());
    }

    @Test
    public void testAppendObjectArray_Summary() {
        style.append(buf, "field", new Object[]{"a", "b"}, Boolean.FALSE);
        assertEquals("field=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendObjectArray_WithNullElement() {
        style.append(buf, "field", new Object[]{null, "b"}, Boolean.TRUE);
        assertEquals("field={<null>,b},", buf.toString());
    }

    @Test
    public void testAppendArrayViaGenericArrayBranch() {
        // ครอบคลุม branch value.getClass().isArray() ภายใน appendInternal
        String[] arr = new String[]{"x", "y"};
        style.append(buf, "field", (Object) arr, Boolean.TRUE);
        assertEquals("field={x,y},", buf.toString());
    }

    // ------------------------------------------------------------------
    // Primitive scalar append
    // ------------------------------------------------------------------

    @Test
    public void testAppendLong() {
        style.append(buf, "field", 5L);
        assertEquals("field=5,", buf.toString());
    }

    @Test
    public void testAppendInt() {
        style.append(buf, "field", 5);
        assertEquals("field=5,", buf.toString());
    }

    @Test
    public void testAppendShort() {
        style.append(buf, "field", (short) 5);
        assertEquals("field=5,", buf.toString());
    }

    @Test
    public void testAppendByte() {
        style.append(buf, "field", (byte) 5);
        assertEquals("field=5,", buf.toString());
    }

    @Test
    public void testAppendChar() {
        style.append(buf, "field", 'c');
        assertEquals("field=c,", buf.toString());
    }

    @Test
    public void testAppendDouble() {
        style.append(buf, "field", 5.5d);
        assertEquals("field=5.5,", buf.toString());
    }

    @Test
    public void testAppendFloat() {
        style.append(buf, "field", 5.5f);
        assertEquals("field=5.5,", buf.toString());
    }

    @Test
    public void testAppendBoolean() {
        style.append(buf, "field", true);
        assertEquals("field=true,", buf.toString());
    }

    // ------------------------------------------------------------------
    // appendFieldStart branches
    // ------------------------------------------------------------------

    @Test
    public void testAppendFieldStart_UseFieldNamesFalse() {
        style.setUseFieldNames(false);
        style.append(buf, "field", 5);
        assertEquals("5,", buf.toString());
    }

    @Test
    public void testAppendFieldStart_NullFieldName() {
        style.append(buf, null, 5);
        assertEquals("5,", buf.toString());
    }

    // ------------------------------------------------------------------
    // appendClassName
    // ------------------------------------------------------------------

    @Test
    public void testAppendClassName_Default_LongName() {
        Object obj = new Object();
        style.appendClassName(buf, obj);
        assertEquals(Object.class.getName(), buf.toString());
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testAppendClassName_ShortName() {
        style.setUseShortClassName(true);
        Object obj = new Object();
        style.appendClassName(buf, obj);
        assertEquals("Object", buf.toString());
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testAppendClassName_UseClassNameFalse() {
        style.setUseClassName(false);
        style.appendClassName(buf, new Object());
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendClassName_NullObject() {
        style.appendClassName(buf, null);
        assertEquals("", buf.toString());
    }

    // ------------------------------------------------------------------
    // appendIdentityHashCode
    // ------------------------------------------------------------------

    @Test
    public void testAppendIdentityHashCode_Default() {
        Object obj = new Object();
        style.appendIdentityHashCode(buf, obj);
        String expected = "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, buf.toString());
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testAppendIdentityHashCode_Disabled() {
        style.setUseIdentityHashCode(false);
        style.appendIdentityHashCode(buf, new Object());
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendIdentityHashCode_NullObject() {
        style.appendIdentityHashCode(buf, null);
        assertEquals("", buf.toString());
    }

    // ------------------------------------------------------------------
    // isFullDetail
    // ------------------------------------------------------------------

    @Test
    public void testIsFullDetail_NullUsesDefaultTrue() {
        assertTrue(style.isFullDetail(null));
    }

    @Test
    public void testIsFullDetail_NullUsesDefaultFalse() {
        style.setDefaultFullDetail(false);
        assertFalse(style.isFullDetail(null));
    }

    @Test
    public void testIsFullDetail_True() {
        assertTrue(style.isFullDetail(Boolean.TRUE));
    }

    @Test
    public void testIsFullDetail_False() {
        assertFalse(style.isFullDetail(Boolean.FALSE));
    }

    // ------------------------------------------------------------------
    // getShortClassName
    // ------------------------------------------------------------------

    @Test
    public void testGetShortClassName() {
        assertEquals("Object", style.getShortClassName(Object.class));
    }

    // ------------------------------------------------------------------
    // Setter: null -> "" (boundary)
    // ------------------------------------------------------------------

    @Test
    public void testSetArrayStart_NullConvertedToEmpty() {
        style.setArrayStart(null);
        assertEquals("", style.getArrayStart());
    }

    @Test
    public void testSetArrayEnd_NullConvertedToEmpty() {
        style.setArrayEnd(null);
        assertEquals("", style.getArrayEnd());
    }

    @Test
    public void testSetArraySeparator_NullConvertedToEmpty() {
        style.setArraySeparator(null);
        assertEquals("", style.getArraySeparator());
    }

    @Test
    public void testSetContentStart_NullConvertedToEmpty() {
        style.setContentStart(null);
        assertEquals("", style.getContentStart());
    }

    @Test
    public void testSetContentEnd_NullConvertedToEmpty() {
        style.setContentEnd(null);
        assertEquals("", style.getContentEnd());
    }

    @Test
    public void testSetFieldNameValueSeparator_NullConvertedToEmpty() {
        style.setFieldNameValueSeparator(null);
        assertEquals("", style.getFieldNameValueSeparator());
    }

    @Test
    public void testSetFieldSeparator_NullConvertedToEmpty() {
        style.setFieldSeparator(null);
        assertEquals("", style.getFieldSeparator());
    }

    @Test
    public void testSetNullText_NullConvertedToEmpty() {
        style.setNullText(null);
        assertEquals("", style.getNullText());
    }

    @Test
    public void testSetSizeStartText_NullConvertedToEmpty() {
        style.setSizeStartText(null);
        assertEquals("", style.getSizeStartText());
    }

    @Test
    public void testSetSizeEndText_NullConvertedToEmpty() {
        style.setSizeEndText(null);
        assertEquals("", style.getSizeEndText());
    }

    @Test
    public void testSetSummaryObjectStartText_NullConvertedToEmpty() {
        style.setSummaryObjectStartText(null);
        assertEquals("", style.getSummaryObjectStartText());
    }

    @Test
    public void testSetSummaryObjectEndText_NullConvertedToEmpty() {
        style.setSummaryObjectEndText(null);
        assertEquals("", style.getSummaryObjectEndText());
    }

    // ------------------------------------------------------------------
    // Getter/Setter round-trip flags
    // ------------------------------------------------------------------

    @Test
    public void testUseFieldNamesGetterSetter() {
        assertTrue(style.isUseFieldNames());
        style.setUseFieldNames(false);
        assertFalse(style.isUseFieldNames());
    }

    @Test
    public void testUseClassNameGetterSetter() {
        assertTrue(style.isUseClassName());
        style.setUseClassName(false);
        assertFalse(style.isUseClassName());
    }

    @Test
    public void testUseShortClassNameGetterSetter() {
        assertFalse(style.isUseShortClassName());
        style.setUseShortClassName(true);
        assertTrue(style.isUseShortClassName());
    }

    @Test
    public void testUseIdentityHashCodeGetterSetter() {
        assertTrue(style.isUseIdentityHashCode());
        style.setUseIdentityHashCode(false);
        assertFalse(style.isUseIdentityHashCode());
    }

    @Test
    public void testDefaultFullDetailGetterSetter() {
        assertTrue(style.isDefaultFullDetail());
        style.setDefaultFullDetail(false);
        assertFalse(style.isDefaultFullDetail());
    }

    @Test
    public void testArrayContentDetailGetterSetter() {
        assertTrue(style.isArrayContentDetail());
        style.setArrayContentDetail(false);
        assertFalse(style.isArrayContentDetail());
    }

    @Test
    public void testFieldSeparatorAtStartGetterSetter() {
        assertFalse(style.isFieldSeparatorAtStart());
        style.setFieldSeparatorAtStart(true);
        assertTrue(style.isFieldSeparatorAtStart());
    }

    @Test
    public void testFieldSeparatorAtEndGetterSetter() {
        assertFalse(style.isFieldSeparatorAtEnd());
        style.setFieldSeparatorAtEnd(true);
        assertTrue(style.isFieldSeparatorAtEnd());
    }

    // ------------------------------------------------------------------
    // Registry: isRegistered / register / unregister
    // ------------------------------------------------------------------

    @Test
    public void testRegister_NullValue_NoOp() {
        ToStringStyle.register(null);
        assertFalse(ToStringStyle.isRegistered(null));
    }

    @Test
    public void testUnregister_NullValue_NoOp() {
        ToStringStyle.unregister(null); // ต้องไม่ throw
    }

    @Test
    public void testRegisterAndIsRegistered() {
        Object obj = new Object();
        assertFalse(ToStringStyle.isRegistered(obj));
        ToStringStyle.register(obj);
        assertTrue(ToStringStyle.isRegistered(obj));
        ToStringStyle.unregister(obj);
        assertFalse(ToStringStyle.isRegistered(obj));
    }

    @Test
    public void testUnregister_NotRegisteredValue_NoOp() {
        Object obj = new Object();
        ToStringStyle.unregister(obj); // ไม่เคย register มาก่อน
        assertFalse(ToStringStyle.isRegistered(obj));
    }

    // ------------------------------------------------------------------
    // appendInternal: cyclic detection
    // ------------------------------------------------------------------

    @Test
    public void testAppendInternal_CyclicObjectDetected() {
        Object obj = new Object();
        ToStringStyle.register(obj);
        try {
            style.appendInternal(buf, "field", obj, true);
            // NOTE: assumption - ObjectUtils.identityToString ควรมี class name อยู่ใน output
            assertTrue(buf.toString().contains(obj.getClass().getName()));
        } finally {
            ToStringStyle.unregister(obj);
        }
    }

    @Test
    public void testAppendInternal_NumberExcludedFromCyclicCheck() {
        Integer num = Integer.valueOf(42);
        ToStringStyle.register(num);
        try {
            style.appendInternal(buf, "field", num, true);
            assertEquals("42", buf.toString());
        } finally {
            ToStringStyle.unregister(num);
        }
    }

    @Test
    public void testAppendInternal_BooleanExcludedFromCyclicCheck() {
        Boolean b = Boolean.TRUE;
        ToStringStyle.register(b);
        try {
            style.appendInternal(buf, "field", b, true);
            assertEquals("true", buf.toString());
        } finally {
            ToStringStyle.unregister(b);
        }
    }

    @Test
    public void testAppendInternal_CharacterExcludedFromCyclicCheck() {
        Character c = Character.valueOf('x');
        ToStringStyle.register(c);
        try {
            style.appendInternal(buf, "field", c, true);
            assertEquals("x", buf.toString());
        } finally {
            ToStringStyle.unregister(c);
        }
    }

    // ------------------------------------------------------------------
    // appendSummary(Object)
    // ------------------------------------------------------------------

    @Test
    public void testAppendSummary_ObjectUsesShortClassName() {
        style.appendSummary(buf, "field", "value");
        assertEquals("<String>", buf.toString());
    }

    // ------------------------------------------------------------------
    // reflectionAppendArrayDetail
    // ------------------------------------------------------------------

    @Test
    public void testReflectionAppendArrayDetail_WithNullElement() {
        Object[] arr = new Object[]{null, "b"};
        style.reflectionAppendArrayDetail(buf, "field", arr);
        assertEquals("{<null>,b}", buf.toString());
    }

    @Test
    public void testReflectionAppendArrayDetail_PrimitiveIntArray() {
        int[] arr = new int[]{1, 2, 3};
        style.reflectionAppendArrayDetail(buf, "field", arr);
        assertEquals("{1,2,3}", buf.toString());
    }

    // ------------------------------------------------------------------
    // Singleton styles (DEFAULT / MULTI_LINE / NO_FIELD_NAMES / SHORT_PREFIX / SIMPLE)
    // ------------------------------------------------------------------

    @Test
    public void testDefaultStyleSingletonNotNull() {
        assertNotNull(ToStringStyle.DEFAULT_STYLE);
    }

    @Test
    public void testMultiLineStyleSingletonNotNull() {
        assertNotNull(ToStringStyle.MULTI_LINE_STYLE);
    }

    @Test
    public void testNoFieldNamesStyleSingletonNotNull() {
        assertNotNull(ToStringStyle.NO_FIELD_NAMES_STYLE);
    }

    @Test
    public void testShortPrefixStyleSingletonNotNull() {
        assertNotNull(ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Test
    public void testSimpleStyleSingletonNotNull() {
        assertNotNull(ToStringStyle.SIMPLE_STYLE);
    }

    @Test
    public void testNoFieldNamesStyleDoesNotUseFieldNames() {
        assertFalse(ToStringStyle.NO_FIELD_NAMES_STYLE.isUseFieldNames());
    }

    @Test
    public void testShortPrefixStyleConfiguration() {
        assertTrue(ToStringStyle.SHORT_PREFIX_STYLE.isUseShortClassName());
        assertFalse(ToStringStyle.SHORT_PREFIX_STYLE.isUseIdentityHashCode());
    }

    @Test
    public void testSimpleStyleConfiguration() {
        assertFalse(ToStringStyle.SIMPLE_STYLE.isUseClassName());
        assertFalse(ToStringStyle.SIMPLE_STYLE.isUseIdentityHashCode());
        assertFalse(ToStringStyle.SIMPLE_STYLE.isUseFieldNames());
        assertEquals("", ToStringStyle.SIMPLE_STYLE.getContentStart());
        assertEquals("", ToStringStyle.SIMPLE_STYLE.getContentEnd());
    }

    @Test
    public void testMultiLineStyleConfiguration() {
        assertTrue(ToStringStyle.MULTI_LINE_STYLE.isFieldSeparatorAtStart());
    }
}
