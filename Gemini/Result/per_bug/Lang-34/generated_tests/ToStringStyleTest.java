package org.apache.commons.lang3.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ToStringStyleTest {

    private static class SubToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1L;

        // เปิด public เพื่อเข้าถึงตัวแปรและเมธอด protected ได้โดยตรงใน test
        @Override
        public void setUseClassName(boolean useClassName) { super.setUseClassName(useClassName); }
        @Override
        public void setUseShortClassName(boolean useShortClassName) { super.setUseShortClassName(useShortClassName); }
        @Override
        public void setUseIdentityHashCode(boolean useIdentityHashCode) { super.setUseIdentityHashCode(useIdentityHashCode); }
        @Override
        public void setUseFieldNames(boolean useFieldNames) { super.setUseFieldNames(useFieldNames); }
        @Override
        public void setDefaultFullDetail(boolean defaultFullDetail) { super.setDefaultFullDetail(defaultFullDetail); }
        @Override
        public void setArrayContentDetail(boolean arrayContentDetail) { super.setArrayContentDetail(arrayContentDetail); }
        @Override
        public void setArrayStart(String arrayStart) { super.setArrayStart(arrayStart); }
        @Override
        public void setArrayEnd(String arrayEnd) { super.setArrayEnd(arrayEnd); }
        @Override
        public void setArraySeparator(String arraySeparator) { super.setArraySeparator(arraySeparator); }
        @Override
        public void setContentStart(String contentStart) { super.setContentStart(contentStart); }
        @Override
        public void setContentEnd(String contentEnd) { super.setContentEnd(contentEnd); }
        @Override
        public void setFieldNameValueSeparator(String fieldNameValueSeparator) { super.setFieldNameValueSeparator(fieldNameValueSeparator); }
        @Override
        public void setFieldSeparator(String fieldSeparator) { super.setFieldSeparator(fieldSeparator); }
        @Override
        public void setFieldSeparatorAtStart(boolean fieldSeparatorAtStart) { super.setFieldSeparatorAtStart(fieldSeparatorAtStart); }
        @Override
        public void setFieldSeparatorAtEnd(boolean fieldSeparatorAtEnd) { super.setFieldSeparatorAtEnd(fieldSeparatorAtEnd); }
        @Override
        public void setNullText(String nullText) { super.setNullText(nullText); }
        @Override
        public void setSizeStartText(String sizeStartText) { super.setSizeStartText(sizeStartText); }
        @Override
        public void setSizeEndText(String sizeEndText) { super.setSizeEndText(sizeEndText); }
        @Override
        public void setSummaryObjectStartText(String summaryObjectStartText) { super.setSummaryObjectStartText(summaryObjectStartText); }
        @Override
        public void setSummaryObjectEndText(String summaryObjectEndText) { super.setSummaryObjectEndText(summaryObjectEndText); }

        @Override
        public boolean isUseClassName() { return super.isUseClassName(); }
        @Override
        public boolean isUseShortClassName() { return super.isUseShortClassName(); }
        @Override
        public boolean isUseIdentityHashCode() { return super.isUseIdentityHashCode(); }
        @Override
        public boolean isUseFieldNames() { return super.isUseFieldNames(); }
        @Override
        public boolean isDefaultFullDetail() { return super.isDefaultFullDetail(); }
        @Override
        public boolean isArrayContentDetail() { return super.isArrayContentDetail(); }
        @Override
        public String getArrayStart() { return super.getArrayStart(); }
        @Override
        public String getArrayEnd() { return super.getArrayEnd(); }
        @Override
        public String getArraySeparator() { return super.getArraySeparator(); }
        @Override
        public String getContentStart() { return super.getContentStart(); }
        @Override
        public String getContentEnd() { return super.getContentEnd(); }
        @Override
        public String getFieldNameValueSeparator() { return super.getFieldNameValueSeparator(); }
        @Override
        public String getFieldSeparator() { return super.getFieldSeparator(); }
        @Override
        public boolean isFieldSeparatorAtStart() { return super.isFieldSeparatorAtStart(); }
        @Override
        public boolean isFieldSeparatorAtEnd() { return super.isFieldSeparatorAtEnd(); }
        @Override
        public String getNullText() { return super.getNullText(); }
        @Override
        public String getSizeStartText() { return super.getSizeStartText(); }
        @Override
        public String getSizeEndText() { return super.getSizeEndText(); }
        @Override
        public String getSummaryObjectStartText() { return super.getSummaryObjectStartText(); }
        @Override
        public String getSummaryObjectEndText() { return super.getSummaryObjectEndText(); }

        @Override
        public void removeLastFieldSeparator(StringBuffer buffer) { super.removeLastFieldSeparator(buffer); }
        @Override
        public void reflectionAppendArrayDetail(StringBuffer buffer, String fieldName, Object array) {
            super.reflectionAppendArrayDetail(buffer, fieldName, array);
        }
    }

    private SubToStringStyle style;
    private StringBuffer buffer;

    @Before
    public void setUp() {
        style = new SubToStringStyle();
        buffer = new StringBuffer();
    }

    @After
    public void tearDown() {
        ToStringStyle.unregister(this);
    }

    // ------------------- Registry & Cyclical Object Tests -------------------

    @Test
    public void testRegistryOperations() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertTrue(ToStringStyle.getRegistry().isEmpty());
        assertFalse(ToStringStyle.isRegistered(obj1));

        // null register/unregister ควรไม่มีผล
        ToStringStyle.register(null);
        ToStringStyle.unregister(null);
        assertFalse(ToStringStyle.isRegistered(null));

        ToStringStyle.register(obj1);
        assertTrue(ToStringStyle.isRegistered(obj1));
        assertFalse(ToStringStyle.isRegistered(obj2));

        ToStringStyle.register(obj2);
        assertTrue(ToStringStyle.isRegistered(obj1));
        assertTrue(ToStringStyle.isRegistered(obj2));

        ToStringStyle.unregister(obj1);
        assertFalse(ToStringStyle.isRegistered(obj1));
        assertTrue(ToStringStyle.isRegistered(obj2));

        ToStringStyle.unregister(obj2);
        assertFalse(ToStringStyle.isRegistered(obj2));
        assertTrue(ToStringStyle.getRegistry().isEmpty());
    }

    @Test
    public void testAppendInternalCyclicHandling() {
        Object cyclicObject = new ArrayList<Object>();
        ToStringStyle.register(cyclicObject);

        // Cyclic Non-primitive/Number/Character/Boolean object
        style.append(buffer, "field", cyclicObject, Boolean.TRUE);
        assertTrue(buffer.toString().contains("ArrayList@"));

        // Primitives wrapper should bypass cyclic append
        ToStringStyle.register(Integer.valueOf(100));
        buffer.setLength(0);
        style.append(buffer, "num", Integer.valueOf(100), Boolean.TRUE);
        assertEquals("num=100,", buffer.toString());

        ToStringStyle.register(Boolean.TRUE);
        buffer.setLength(0);
        style.append(buffer, "bool", Boolean.TRUE, Boolean.TRUE);
        assertEquals("bool=true,", buffer.toString());

        ToStringStyle.register(Character.valueOf('A'));
        buffer.setLength(0);
        style.append(buffer, "char", Character.valueOf('A'), Boolean.TRUE);
        assertEquals("char=A,", buffer.toString());

        ToStringStyle.unregister(cyclicObject);
        ToStringStyle.unregister(Integer.valueOf(100));
        ToStringStyle.unregister(Boolean.TRUE);
        ToStringStyle.unregister(Character.valueOf('A'));
    }

    // ------------------- Append Start, End, and Super/ToString Tests -------------------

    @Test
    public void testAppendStartAndEnd() {
        String testObj = "Hello";
        style.appendStart(buffer, testObj);
        style.appendEnd(buffer, testObj);

        String hexId = Integer.toHexString(System.identityHashCode(testObj));
        assertEquals("java.lang.String@" + hexId + "[]", buffer.toString());

        // Test with object == null
        buffer.setLength(0);
        style.appendStart(buffer, null);
        assertEquals("", buffer.toString());

        // Field separator at start
        style.setFieldSeparatorAtStart(true);
        buffer.setLength(0);
        style.appendStart(buffer, testObj);
        assertEquals("java.lang.String@" + hexId + "[,", buffer.toString());

        // Field separator at end
        style.setFieldSeparatorAtEnd(true);
        style.appendEnd(buffer, testObj);
        assertEquals("java.lang.String@" + hexId + "[,]", buffer.toString());
    }

    @Test
    public void testAppendSuperAndToString() {
        style.appendSuper(buffer, null);
        assertEquals("", buffer.toString());

        style.appendToString(buffer, null);
        assertEquals("", buffer.toString());

        // String without content delimiters
        style.appendToString(buffer, "InvalidFormat");
        assertEquals("", buffer.toString());

        // Valid pattern
        style.appendToString(buffer, "Prefix[a=1,b=2]Suffix");
        assertEquals("a=1,b=2,", buffer.toString());

        // Field separator at start enabled
        style.setFieldSeparatorAtStart(true);
        style.appendToString(buffer, "Prefix[c=3]Suffix");
        assertEquals("a=1,b=2,c=3,", buffer.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator() {
        // Buffer ว่าง
        style.removeLastFieldSeparator(buffer);
        assertEquals(0, buffer.length());

        // Buffer สั้นกว่า fieldSeparator
        style.setFieldSeparator("---");
        buffer.append("--");
        style.removeLastFieldSeparator(buffer);
        assertEquals("--", buffer.toString());

        // Buffer ไม่ตรงกับ separator
        buffer.setLength(0);
        buffer.append("abcxyz");
        style.removeLastFieldSeparator(buffer);
        assertEquals("abcxyz", buffer.toString());

        // Buffer ตรงกับ separator
        buffer.setLength(0);
        buffer.append("abc---");
        style.removeLastFieldSeparator(buffer);
        assertEquals("abc", buffer.toString());
    }

    // ------------------- ClassName and IdentityHashCode Config Tests -------------------

    @Test
    public void testClassNameAndIdentityHashCodeVariants() {
        Object testObj = new Object();
        String hexId = Integer.toHexString(System.identityHashCode(testObj));

        // Short Class Name
        style.setUseShortClassName(true);
        style.setUseIdentityHashCode(true);
        style.appendStart(buffer, testObj);
        assertEquals("Object@" + hexId + "[", buffer.toString());

        // Disable Class Name
        buffer.setLength(0);
        style.setUseClassName(false);
        style.appendStart(buffer, testObj);
        assertEquals("@" + hexId + "[", buffer.toString());

        // Disable Identity Hash Code
        buffer.setLength(0);
        style.setUseIdentityHashCode(false);
        style.appendStart(buffer, testObj);
        assertEquals("[", buffer.toString());

        // Disable Field Names
        buffer.setLength(0);
        style.setUseFieldNames(false);
        style.append(buffer, "fieldName", "value", Boolean.TRUE);
        assertEquals("value,", buffer.toString());
    }

    // ------------------- Primitive Types & Overloads Tests -------------------

    @Test
    public void testPrimitiveTypes() {
        style.append(buffer, "long", 1234567890123L);
        assertEquals("long=1234567890123,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "int", 42);
        assertEquals("int=42,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "short", (short) 7);
        assertEquals("short=7,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "byte", (byte) 1);
        assertEquals("byte=1,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "char", 'Z');
        assertEquals("char=Z,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "double", 3.14159);
        assertEquals("double=3.14159,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "float", 2.718f);
        assertEquals("float=2.718,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "boolean", true);
        assertEquals("boolean=true,", buffer.toString());
    }

    // ------------------- Primitive Arrays Tests (Detail & Summary & Null) -------------------

    @Test
    public void testPrimitiveArrays() {
        // long[]
        style.append(buffer, "longNull", (long[]) null, Boolean.TRUE);
        assertEquals("longNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "longArr", new long[]{1L, 2L}, Boolean.TRUE);
        assertEquals("longArr={1,2},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "longArrSummary", new long[]{1L, 2L}, Boolean.FALSE);
        assertEquals("longArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // int[]
        style.append(buffer, "intNull", (int[]) null, Boolean.TRUE);
        assertEquals("intNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "intArr", new int[]{10, 20}, Boolean.TRUE);
        assertEquals("intArr={10,20},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "intArrSummary", new int[]{10, 20}, Boolean.FALSE);
        assertEquals("intArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // short[]
        style.append(buffer, "shortNull", (short[]) null, Boolean.TRUE);
        assertEquals("shortNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "shortArr", new short[]{3, 4}, Boolean.TRUE);
        assertEquals("shortArr={3,4},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "shortArrSummary", new short[]{3, 4}, Boolean.FALSE);
        assertEquals("shortArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // byte[]
        style.append(buffer, "byteNull", (byte[]) null, Boolean.TRUE);
        assertEquals("byteNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "byteArr", new byte[]{5, 6}, Boolean.TRUE);
        assertEquals("byteArr={5,6},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "byteArrSummary", new byte[]{5, 6}, Boolean.FALSE);
        assertEquals("byteArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // char[]
        style.append(buffer, "charNull", (char[]) null, Boolean.TRUE);
        assertEquals("charNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "charArr", new char[]{'a', 'b'}, Boolean.TRUE);
        assertEquals("charArr={a,b},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "charArrSummary", new char[]{'a', 'b'}, Boolean.FALSE);
        assertEquals("charArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // double[]
        style.append(buffer, "doubleNull", (double[]) null, Boolean.TRUE);
        assertEquals("doubleNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "doubleArr", new double[]{1.1, 2.2}, Boolean.TRUE);
        assertEquals("doubleArr={1.1,2.2},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "doubleArrSummary", new double[]{1.1, 2.2}, Boolean.FALSE);
        assertEquals("doubleArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // float[]
        style.append(buffer, "floatNull", (float[]) null, Boolean.TRUE);
        assertEquals("floatNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "floatArr", new float[]{3.3f, 4.4f}, Boolean.TRUE);
        assertEquals("floatArr={3.3,4.4},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "floatArrSummary", new float[]{3.3f, 4.4f}, Boolean.FALSE);
        assertEquals("floatArrSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        // boolean[]
        style.append(buffer, "boolNull", (boolean[]) null, Boolean.TRUE);
        assertEquals("boolNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "boolArr", new boolean[]{true, false}, Boolean.TRUE);
        assertEquals("boolArr={true,false},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "boolArrSummary", new boolean[]{true, false}, Boolean.FALSE);
        assertEquals("boolArrSummary=<size=2>,", buffer.toString());
    }

    // ------------------- Collections, Maps, and Object Arrays -------------------

    @Test
    public void testCollectionsAndMaps() {
        List<String> list = Arrays.asList("one", "two");
        style.append(buffer, "list", list, Boolean.TRUE);
        assertEquals("list=[one, two],", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "listSummary", list, Boolean.FALSE);
        assertEquals("listSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        style.append(buffer, "map", map, Boolean.TRUE);
        assertEquals("map={k=v},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "mapSummary", map, Boolean.FALSE);
        assertEquals("mapSummary=<size=1>,", buffer.toString());
    }

    @Test
    public void testObjectArraysAndReflectionArrayDetail() {
        // Object[] with null element
        Object[] array = new Object[]{"test", null, Integer.valueOf(99)};
        style.append(buffer, "objArr", array, Boolean.TRUE);
        assertEquals("objArr={test,<null>,99},", buffer.toString());
        buffer.setLength(0);

        // Object[] summary
        style.append(buffer, "objArrSummary", array, Boolean.FALSE);
        assertEquals("objArrSummary=<size=3>,", buffer.toString());
        buffer.setLength(0);

        // Array passed as general Object (Trigger value.getClass().isArray())
        style.append(buffer, "rawArray", (Object) new int[]{7, 8, 9}, Boolean.TRUE);
        assertEquals("rawArray={7,8,9},", buffer.toString());
        buffer.setLength(0);

        // Multidimensional array via reflectionAppendArrayDetail
        Object[] multiDim = new Object[]{new String[]{"a"}, null};
        style.reflectionAppendArrayDetail(buffer, "multi", multiDim);
        assertEquals("{{a},<null>}", buffer.toString());
    }

    @Test
    public void testObjectSummaryAndFullDetailFallbacks() {
        // General Object with summary mode
        style.append(buffer, "objSummary", new ArrayList<String>(), Boolean.FALSE);
        assertEquals("objSummary=<ArrayList>,", buffer.toString());
        buffer.setLength(0);

        // Default Full Detail (null fullDetail parameter)
        style.setDefaultFullDetail(true);
        style.append(buffer, "defaultDetail", "text", null);
        assertEquals("defaultDetail=text,", buffer.toString());

        buffer.setLength(0);
        style.setDefaultFullDetail(false);
        style.append(buffer, "defaultSummary", "text", null);
        assertEquals("defaultSummary=<String>,", buffer.toString());
    }

    // ------------------- Null Property Setters Handling -------------------

    @Test
    public void testSettersWithNullValues() {
        style.setArrayStart(null);
        assertEquals("", style.getArrayStart());

        style.setArrayEnd(null);
        assertEquals("", style.getArrayEnd());

        style.setArraySeparator(null);
        assertEquals("", style.getArraySeparator());

        style.setContentStart(null);
        assertEquals("", style.getContentStart());

        style.setContentEnd(null);
        assertEquals("", style.getContentEnd());

        style.setFieldNameValueSeparator(null);
        assertEquals("", style.getFieldNameValueSeparator());

        style.setFieldSeparator(null);
        assertEquals("", style.getFieldSeparator());

        style.setNullText(null);
        assertEquals("", style.getNullText());

        style.setSizeStartText(null);
        assertEquals("", style.getSizeStartText());

        style.setSizeEndText(null);
        assertEquals("", style.getSizeEndText());

        style.setSummaryObjectStartText(null);
        assertEquals("", style.getSummaryObjectStartText());

        style.setSummaryObjectEndText(null);
        assertEquals("", style.getSummaryObjectEndText());
    }

    @Test
    public void testGettersAndSettersFlags() {
        style.setUseClassName(true);
        assertTrue(style.isUseClassName());

        style.setUseShortClassName(true);
        assertTrue(style.isUseShortClassName());

        style.setUseIdentityHashCode(true);
        assertTrue(style.isUseIdentityHashCode());

        style.setUseFieldNames(true);
        assertTrue(style.isUseFieldNames());

        style.setDefaultFullDetail(true);
        assertTrue(style.isDefaultFullDetail());

        style.setArrayContentDetail(true);
        assertTrue(style.isArrayContentDetail());

        style.setFieldSeparatorAtStart(true);
        assertTrue(style.isFieldSeparatorAtStart());

        style.setFieldSeparatorAtEnd(true);
        assertTrue(style.isFieldSeparatorAtEnd());
    }

    // ------------------- Predefined Singletons & Serialization Tests -------------------

    @Test
    public void testPredefinedStylesAndSerialization() throws Exception {
        assertSame(ToStringStyle.DEFAULT_STYLE, serializeAndDeserialize(ToStringStyle.DEFAULT_STYLE));
        assertSame(ToStringStyle.MULTI_LINE_STYLE, serializeAndDeserialize(ToStringStyle.MULTI_LINE_STYLE));
        assertSame(ToStringStyle.NO_FIELD_NAMES_STYLE, serializeAndDeserialize(ToStringStyle.NO_FIELD_NAMES_STYLE));
        assertSame(ToStringStyle.SHORT_PREFIX_STYLE, serializeAndDeserialize(ToStringStyle.SHORT_PREFIX_STYLE));
        assertSame(ToStringStyle.SIMPLE_STYLE, serializeAndDeserialize(ToStringStyle.SIMPLE_STYLE));

        // Test MultiLine formatting
        StringBuffer sb = new StringBuffer();
        ToStringStyle.MULTI_LINE_STYLE.appendStart(sb, new Integer(10));
        ToStringStyle.MULTI_LINE_STYLE.append(sb, "f", 10, Boolean.TRUE);
        ToStringStyle.MULTI_LINE_STYLE.appendEnd(sb, new Integer(10));
        assertTrue(sb.toString().contains("\n  f=10"));

        // Test SimpleStyle formatting
        sb.setLength(0);
        ToStringStyle.SIMPLE_STYLE.appendStart(sb, new Integer(10));
        ToStringStyle.SIMPLE_STYLE.append(sb, "f", 10, Boolean.TRUE);
        ToStringStyle.SIMPLE_STYLE.appendEnd(sb, new Integer(10));
        assertEquals("10", sb.toString());
    }

    private Object serializeAndDeserialize(Object obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object result = ois.readObject();
        ois.close();
        return result;
    }
}