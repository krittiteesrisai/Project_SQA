package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* ---------- Helper classes สำหรับทดสอบ $-inner-class branch ---------- */

// top-level class (ไม่มี outer)
class TopLevelBase {}

// non-static inner class -> ClassUtil.getOuterClass() ควร != null
class OuterHolder {
    class InnerMember {}
}

// ใช้เป็น baseType ที่ตัวมันเองก็เป็น inner class (outer != null) เพื่อทดสอบ "no reassign" branch
class OuterHolder2 {
    class InnerMember2 {}
}

public class ClassNameIdResolverTest {

    private final TypeFactory typeFactory = TypeFactory.defaultInstance();

    // enum ปรกติ (ไม่มี body) -> cls.isEnum() == true
    enum SimpleEnum { A, B }

    // enum ที่มี constant-specific body -> คลาสจริงของ constant เป็น anonymous subclass
    enum EnumWithBody {
        A { @Override public String toString() { return "A"; } },
        B { @Override public String toString() { return "B"; } }
    }

    private ClassNameIdResolver newResolver(Class<?> baseRaw) {
        JavaType baseType = typeFactory.constructType(baseRaw);
        return new ClassNameIdResolver(baseType, typeFactory);
    }

    // ================= getMechanism / registerSubtype / getDescForKnownTypeIds =================

    @Test
    public void testGetMechanism() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        assertEquals(JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testRegisterSubtype_noException() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        // เป็น no-op ตาม comment ในซอร์ส ต้องไม่ throw
        resolver.registerSubtype(String.class, "string");
    }

    @Test
    public void testGetDescForKnownTypeIds() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    // ================= idFromValue: null / boundary =================

    @Test(expected = NullPointerException.class)
    public void testIdFromValue_null_throwsNPE() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        resolver.idFromValue(null); // value.getClass() -> NPE
    }

    // ================= idFromValue: basic class (ไม่เข้าเงื่อนไขพิเศษใดๆ) =================

    @Test
    public void testIdFromValue_simpleClass() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        String id = resolver.idFromValue("hello");
        assertEquals(String.class.getName(), id);
    }

    // ================= Enum branch: isEnum()==true -> ไม่ reassign =================

    @Test
    public void testIdFromValue_simpleEnum() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        String id = resolver.idFromValue(SimpleEnum.A);
        // SimpleEnum เป็น nested enum (static โดย implicit) -> outer()==null -> ไม่ reassign
        assertEquals(SimpleEnum.class.getName(), id);
    }

    // ================= Enum branch: isEnum()==false (anonymous subclass) -> ใช้ superclass =================

    @Test
    public void testIdFromValue_enumWithBody() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        String id = resolver.idFromValue(EnumWithBody.A);
        assertEquals(EnumWithBody.class.getName(), id);
    }

    // ================= java.util prefix + EnumSet instanceof =================

    @Test
    public void testIdFromValue_enumSet() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        EnumSet<SimpleEnum> set = EnumSet.of(SimpleEnum.A);
        String id = resolver.idFromValue(set);
        assertTrue(id.startsWith("java.util.EnumSet"));
        assertTrue(id.contains("SimpleEnum"));
    }

    // ================= java.util prefix + EnumMap instanceof =================

    @Test
    public void testIdFromValue_enumMap() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        EnumMap<SimpleEnum, String> map = new EnumMap<SimpleEnum, String>(SimpleEnum.class);
        map.put(SimpleEnum.A, "x");
        String id = resolver.idFromValue(map);
        assertTrue(id.startsWith("java.util.EnumMap"));
        assertTrue(id.contains("SimpleEnum"));
    }

    // ================= java.util prefix, ไม่ match Arrays$/Collections$ -> ไม่เปลี่ยน =================

    @Test
    public void testIdFromValue_javaUtilPlainClass_noMatch() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        String id = resolver.idFromValue(new HashMap<String, String>());
        assertEquals("java.util.HashMap", id);
    }

    // ================= Arrays$ + "List" -> เปลี่ยนเป็น java.util.ArrayList =================

    @Test
    public void testIdFromValue_arraysAsList() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        List<Integer> list = Arrays.asList(1, 2, 3);
        String id = resolver.idFromValue(list);
        assertEquals("java.util.ArrayList", id);
    }

    // ================= Collections$ + "List" in name -> เปลี่ยนเป็น java.util.ArrayList =================

    @Test
    public void testIdFromValue_collectionsUnmodifiableList_withListInName() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        List<Integer> list = Collections.unmodifiableList(new ArrayList<Integer>(Arrays.asList(1, 2)));
        String id = resolver.idFromValue(list);
        // class name เช่น java.util.Collections$UnmodifiableRandomAccessList มี "List"
        assertEquals("java.util.ArrayList", id);
    }

    // ================= Collections$ แต่ไม่มี "List" ใน class name -> ไม่เปลี่ยน =================

    @Test
    public void testIdFromValue_collectionsUnmodifiableSet_noListInName() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        Set<Integer> set = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(1, 2)));
        String id = resolver.idFromValue(set);
        // ไม่มี "List" ใน className ดังนั้น str ไม่ถูกเปลี่ยนเป็น ArrayList
        assertTrue(id.startsWith("java.util.Collections$"));
        assertFalse(id.equals("java.util.ArrayList"));
    }

    // ================= idFromValueAndType: ใช้ type param แทน value.getClass() =================

    @Test
    public void testIdFromValueAndType_usesGivenType_independentOfValue() {
        ClassNameIdResolver resolver = newResolver(Object.class);
        String id = resolver.idFromValueAndType("hello", List.class);
        assertEquals("java.util.List", id);
    }

    // ================= $-inner class: outer!=null และ staticType outer==null -> reassign เป็น baseType =================

    @Test
    public void testIdFromValueAndType_innerClass_baseTypeTopLevel_reassigns() throws Exception {
        ClassNameIdResolver resolver = newResolver(TopLevelBase.class);
        OuterHolder holder = new OuterHolder();
        Object innerInstance = holder.new InnerMember();
        String id = resolver.idFromValueAndType(innerInstance, innerInstance.getClass());
        // TopLevelBase ไม่มี outer -> cls ถูกเปลี่ยนเป็น baseType raw class
        assertEquals(TopLevelBase.class.getName(), id);
    }

    // ================= $-inner class: outer!=null และ staticType outer!=null -> ไม่ reassign =================

    @Test
    public void testIdFromValueAndType_innerClass_baseTypeAlsoInner_noReassign() throws Exception {
        ClassNameIdResolver resolver = newResolver(OuterHolder2.InnerMember2.class);
        OuterHolder holder = new OuterHolder();
        Object innerInstance = holder.new InnerMember();
        String id = resolver.idFromValueAndType(innerInstance, innerInstance.getClass());
        // baseType (InnerMember2) ก็เป็น inner class ที่มี outer -> ไม่ reassign, คงชื่อเดิม
        assertEquals(innerInstance.getClass().getName(), id);
    }

    // ================= typeFromId: มี '<' (generics) index > 0 =================

    @Test
    public void testTypeFromId_withGenerics() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        JavaType result = resolver.typeFromId(ctxt, "java.util.List<java.lang.String>");
        assertNotNull(result);
        assertEquals(List.class, result.getRawClass());
        assertEquals(String.class, result.containedType(0).getRawClass());
    }

    // ================= typeFromId: generics รูปแบบผิด -> คาดว่า throw (assumption: IllegalArgumentException) =================

    // หมายเหตุ: exception type ที่แน่นอนมาจาก TypeFactory#constructFromCanonical ซึ่งไม่ได้แสดงใน source
    // นี้; สมมติฐานอ้างอิงพฤติกรรมทั่วไปของ TypeFactory
    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId_withGenerics_malformed_throws() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        resolver.typeFromId(ctxt, "java.util.List<java.lang.String"); // unbalanced '<'
    }

    // ================= typeFromId: id ปรกติ, findClass สำเร็จ =================

    @Test
    public void testTypeFromId_simpleClass_success() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        JavaType result = resolver.typeFromId(ctxt, "java.lang.String");
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    // ================= typeFromId: findClass ล้มเหลว + context ไม่ใช่ DeserializationContext -> null =================

    @Test
    public void testTypeFromId_unknownClass_nonDeserializationContext_returnsNull() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class); // ไม่ใช่ DeserializationContext
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        JavaType result = resolver.typeFromId(ctxt, "no.such.Class.Really");
        assertNull(result);
    }

    // ================= typeFromId: findClass ล้มเหลว + context เป็น DeserializationContext -> delegate =================

    @Test
    public void testTypeFromId_unknownClass_deserializationContext_delegatesHandleUnknownTypeId() throws IOException {
        JavaType baseType = typeFactory.constructType(Object.class);
        ClassNameIdResolver resolver = new ClassNameIdResolver(baseType, typeFactory);

        DeserializationContext dctxt = mock(DeserializationContext.class);
        when(dctxt.getTypeFactory()).thenReturn(typeFactory);
        JavaType expected = typeFactory.constructType(String.class);
        when(dctxt.handleUnknownTypeId(eq(baseType), eq("no.such.Class.Really"), eq(resolver), eq("no such class found")))
                .thenReturn(expected);

        JavaType result = resolver.typeFromId(dctxt, "no.such.Class.Really");
        assertSame(expected, result);
    }

    // ================= typeFromId: id เป็น empty string -> findClass ล้มเหลวเช่นกัน =================

    @Test
    public void testTypeFromId_emptyId_treatedAsUnknownClass() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        JavaType result = resolver.typeFromId(ctxt, "");
        assertNull(result);
    }

    // ================= typeFromId: id == null -> NPE จาก id.indexOf =================

    @Test(expected = NullPointerException.class)
    public void testTypeFromId_nullId_throwsNPE() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        resolver.typeFromId(ctxt, null);
    }

    // ================= typeFromId: boundary indexOf('<') == 0 (ไม่ > 0) -> ไม่เข้า generics branch =================

    @Test
    public void testTypeFromId_lessThanAtIndexZero_boundary() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);
        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(typeFactory);

        // '<' อยู่ที่ index 0 -> เงื่อนไข > 0 เป็น false -> ไปเส้นทาง findClass ตามปรกติ (ซึ่งจะ fail)
        JavaType result = resolver.typeFromId(ctxt, "<foo>");
        assertNull(result);
    }

    // ================= typeFromId: catch (Exception e) ทั่วไป -> wrap เป็น IllegalArgumentException =================

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId_generalException_wrappedAsIllegalArgumentException() throws IOException {
        ClassNameIdResolver resolver = newResolver(Object.class);

        TypeFactory tfMock = mock(TypeFactory.class);
        try {
            when(tfMock.findClass("bad.Class.Name")).thenThrow(new RuntimeException("boom"));
        } catch (ClassNotFoundException e) {
            fail("setup should not throw checked exception here");
        }

        DatabindContext ctxt = mock(DatabindContext.class);
        when(ctxt.getTypeFactory()).thenReturn(tfMock);

        resolver.typeFromId(ctxt, "bad.Class.Name");
    }
}
