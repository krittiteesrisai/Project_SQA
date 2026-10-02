# JUnit 4 Test Suite: JsonMappingExceptionTest

```java
package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;

/**
 * Unit tests for {@link JsonMappingException} (Defects4J JacksonDatabind-63b).
 * Test class อยู่ใน package เดียวกับคลาสเป้าหมาย เพื่อให้สามารถเข้าถึง
 * package-private members ของ Reference (setters, default ctor, writeReplace)
 * และ static field MAX_REFS_TO_LIST ได้โดยตรง
 */
public class JsonMappingExceptionTest {

    // =========================================================
    // Reference inner class - constructors
    // =========================================================

    @Test
    public void testReferenceConstructor_fromOnly() {
        Object from = "someObject";
        Reference ref = new Reference(from);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceConstructor_fromAndFieldName() {
        Object from = "someObject";
        Reference ref = new Reference(from, "fieldA");
        assertSame(from, ref.getFrom());
        assertEquals("fieldA", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceConstructor_nullFieldNameThrows() {
        new Reference("x", (String) null);
    }

    @Test
    public void testReferenceConstructor_fromAndIndex() {
        Object from = "someObject";
        Reference ref = new Reference(from, 5);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(5, ref.getIndex());
    }

    @Test
    public void testReferenceDefaultConstructor() {
        Reference ref = new Reference();
        assertNull(ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceSetters() {
        Reference ref = new Reference();
        ref.setFieldName("f1");
        ref.setIndex(3);
        ref.setDescription("customDesc");
        assertEquals("f1", ref.getFieldName());
        assertEquals(3, ref.getIndex());
        assertEquals("customDesc", ref.getDescription());
    }

    // =========================================================
    // Reference.getDescription() branches
    // =========================================================

    @Test
    public void testGetDescription_fromNull() {
        Reference ref = new Reference(null, "field");
        String desc = ref.getDescription();
        assertTrue(desc.startsWith("UNKNOWN"));
        assertTrue(desc.contains("[\"field\"]"));
    }

    @Test
    public void testGetDescription_withFieldName() {
        Reference ref = new Reference("data", "myField");
        String desc = ref.getDescription();
        assertTrue(desc.contains("java.lang.String"));
        assertTrue(desc.contains("[\"myField\"]"));
    }

    @Test
    public void testGetDescription_withIndex() {
        Reference ref = new Reference("data", 2);
        String desc = ref.getDescription();
        assertTrue(desc.contains("[2]"));
    }

    @Test
    public void testGetDescription_noFieldNoIndex() {
        Reference ref = new Reference("data");
        String desc = ref.getDescription();
        assertTrue(desc.endsWith("[?]"));
    }

    @Test
    public void testGetDescription_classFrom() {
        // _from เป็น Class<?> เอง -> ต้อง cast แทนเรียก getClass()
        Reference ref = new Reference(String.class, "f");
        String desc = ref.getDescription();
        assertTrue(desc.contains("java.lang.String"));
    }

    @Test
    public void testGetDescription_cached() {
        Reference ref = new Reference("data", "f");
        String desc1 = ref.getDescription();
        String desc2 = ref.getDescription(); // ควร cache ผ่าน _desc field
        assertSame(desc1, desc2);
    }

    // ไม่แน่ใจ behavior ของ ClassUtil.getPackageName สำหรับ array type
    // ว่าจะ return null หรือ package name ปกติ -> ทดสอบเพียงว่าไม่ throw และผลไม่ null
    @Test
    public void testGetDescription_arrayClass() {
        int[] arr = new int[0];
        Reference ref = new Reference(arr, "field");
        String desc = ref.getDescription();
        assertNotNull(desc);
    }

    @Test
    public void testToString() {
        Reference ref = new Reference("data", "f");
        assertEquals(ref.getDescription(), ref.toString());
    }

    @Test
    public void testWriteReplace() throws Exception {
        Reference ref = new Reference("data", "f");
        Object result = ref.writeReplace();
        assertSame(ref, result);
        assertNotNull(ref.getDescription());
    }

    // =========================================================
    // JsonMappingException constructors (deprecated)
    // =========================================================

    @Test
    public void testDeprecatedConstructor_msg() {
        JsonMappingException ex = new JsonMappingException("msg1");
        assertEquals("msg1", ex.getOriginalMessage());
        assertNull(ex.getCause());
    }

    @Test
    public void testDeprecatedConstructor_msgAndCause() {
        Throwable cause = new RuntimeException("cause1");
        JsonMappingException ex = new JsonMappingException("msg2", cause);
        assertEquals("msg2", ex.getOriginalMessage());
        assertSame(cause, ex.getCause());
    }

    @Test
    public void testDeprecatedConstructor_msgAndLoc() {
        JsonLocation loc = new JsonLocation("src", 1, 1, 1);
        JsonMappingException ex = new JsonMappingException("msg3", loc);
        assertEquals("msg3", ex.getOriginalMessage());
        assertSame(loc, ex.getLocation());
    }

    @Test
    public void testDeprecatedConstructor_msgLocAndCause() {
        JsonLocation loc = new JsonLocation("src", 1, 1, 1);
        Throwable cause = new RuntimeException("cause2");
        JsonMappingException ex = new JsonMappingException("msg4", loc, cause);
        assertEquals("msg4", ex.getOriginalMessage());
        assertSame(loc, ex.getLocation());
        assertSame(cause, ex.getCause());
    }

    // =========================================================
    // Constructors ที่รับ Closeable processor (@since 2.7)
    // =========================================================

    @Test
    public void testConstructor_processorIsJsonParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = new JsonLocation("src", 1, 1, 1);
        when(parser.getTokenLocation()).thenReturn(loc);
        JsonMappingException ex = new JsonMappingException(parser, "msg5");
        assertEquals("msg5", ex.getOriginalMessage());
        assertSame(parser, ex.getProcessor());
        assertSame(loc, ex.getLocation());
    }

    @Test
    public void testConstructor_processorNotJsonParser() {
        Closeable proc = mock(Closeable.class);
        JsonMappingException ex = new JsonMappingException(proc, "msg6");
        assertEquals("msg6", ex.getOriginalMessage());
        assertSame(proc, ex.getProcessor());
        assertNull(ex.getLocation());
    }

    @Test
    public void testConstructor_processorProblem_isJsonParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = new JsonLocation("src", 2, 2, 2);
        when(parser.getTokenLocation()).thenReturn(loc);
        Throwable problem = new RuntimeException("problem1");
        JsonMappingException ex = new JsonMappingException(parser, "msg7", problem);
        assertEquals("msg7", ex.getOriginalMessage());
        assertSame(problem, ex.getCause());
        assertSame(loc, ex.getLocation());
    }

    @Test
    public void testConstructor_processorProblem_notJsonParser() {
        Closeable proc = mock(Closeable.class);
        Throwable problem = new RuntimeException("problem2");
        JsonMappingException ex = new JsonMappingException(proc, "msg8", problem);
        assertEquals("msg8", ex.getOriginalMessage());
        assertSame(problem, ex.getCause());
        assertNull(ex.getLocation());
    }

    @Test
    public void testConstructor_processorLoc() {
        Closeable proc = mock(Closeable.class);
        JsonLocation loc = new JsonLocation("src", 3, 3, 3);
        JsonMappingException ex = new JsonMappingException(proc, "msg9", loc);
        assertEquals("msg9", ex.getOriginalMessage());
        assertSame(proc, ex.getProcessor());
        assertSame(loc, ex.getLocation());
    }

    // =========================================================
    // Static factory: from(...)
    // =========================================================

    @Test
    public void testFrom_JsonParser_msg() {
        JsonParser parser = mock(JsonParser.class);
        JsonMappingException ex = JsonMappingException.from(parser, "m1");
        assertEquals("m1", ex.getOriginalMessage());
        assertSame(parser, ex.getProcessor());
    }

    @Test
    public void testFrom_JsonParser_msg_problem() {
        JsonParser parser = mock(JsonParser.class);
        Throwable problem = new RuntimeException("p");
        JsonMappingException ex = JsonMappingException.from(parser, "m2", problem);
        assertEquals("m2", ex.getOriginalMessage());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFrom_JsonGenerator_msg() {
        JsonGenerator gen = mock(JsonGenerator.class);
        JsonMappingException ex = JsonMappingException.from(gen, "m3");
        assertEquals("m3", ex.getOriginalMessage());
        assertSame(gen, ex.getProcessor());
        assertNull(ex.getCause()); // from(g,msg) ส่ง problem=null
    }

    @Test
    public void testFrom_JsonGenerator_msg_problem() {
        JsonGenerator gen = mock(JsonGenerator.class);
        Throwable problem = new RuntimeException("p2");
        JsonMappingException ex = JsonMappingException.from(gen, "m4", problem);
        assertEquals("m4", ex.getOriginalMessage());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFrom_DeserializationContext_msg() {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser parser = mock(JsonParser.class);
        when(ctxt.getParser()).thenReturn(parser);
        JsonMappingException ex = JsonMappingException.from(ctxt, "m5");
        assertEquals("m5", ex.getOriginalMessage());
        assertSame(parser, ex.getProcessor());
    }

    @Test
    public void testFrom_DeserializationContext_msg_throwable() {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser parser = mock(JsonParser.class);
        when(ctxt.getParser()).thenReturn(parser);
        Throwable t = new RuntimeException("p3");
        JsonMappingException ex = JsonMappingException.from(ctxt, "m6", t);
        assertEquals("m6", ex.getOriginalMessage());
        assertSame(t, ex.getCause());
    }

    @Test
    public void testFrom_SerializerProvider_msg() {
        SerializerProvider sp = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        when(sp.getGenerator()).thenReturn(gen);
        JsonMappingException ex = JsonMappingException.from(sp, "m7");
        assertEquals("m7", ex.getOriginalMessage());
        assertSame(gen, ex.getProcessor());
    }

    @Test
    public void testFrom_SerializerProvider_msg_problem() {
        SerializerProvider sp = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        when(sp.getGenerator()).thenReturn(gen);
        Throwable problem = new RuntimeException("p4");
        JsonMappingException ex = JsonMappingException.from(sp, "m8", problem);
        assertEquals("m8", ex.getOriginalMessage());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFromUnexpectedIOE() {
        IOException ioe = new IOException("boom");
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(ioe);
        assertTrue(ex.getOriginalMessage().contains("IOException"));
        assertTrue(ex.getOriginalMessage().contains("boom"));
        assertNull(ex.getProcessor());
    }

    // =========================================================
    // wrapWithPath(...) branches
    // =========================================================

    @Test
    public void testWrapWithPath_withFieldName_newException() {
        RuntimeException src = new RuntimeException("original");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, "fromObj", "field1");
        assertEquals(1, result.getPath().size());
        assertEquals("field1", result.getPath().get(0).getFieldName());
        assertSame(src, result.getCause());
    }

    @Test
    public void testWrapWithPath_withIndex_newException() {
        RuntimeException src = new RuntimeException("original2");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, "fromObj", 7);
        assertEquals(1, result.getPath().size());
        assertEquals(7, result.getPath().get(0).getIndex());
    }

    @Test
    public void testWrapWithPath_srcIsJsonMappingException() {
        JsonMappingException src = new JsonMappingException((Closeable) null, "origMsg");
        Reference ref = new Reference("f", "field2");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertSame(src, result); // instance เดิมถูก augment ไม่สร้างใหม่
        assertEquals(1, result.getPath().size());
    }

    @Test
    public void testWrapWithPath_srcMessageNull() {
        RuntimeException src = new RuntimeException((String) null);
        Reference ref = new Reference("f", "field3");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(result.getOriginalMessage().startsWith("(was "));
        assertTrue(result.getOriginalMessage().contains(RuntimeException.class.getName()));
    }

    @Test
    public void testWrapWithPath_srcMessageEmpty() {
        RuntimeException src = new RuntimeException("");
        Reference ref = new Reference("f", "field4");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(result.getOriginalMessage().startsWith("(was "));
    }

    @Test
    public void testWrapWithPath_srcIsJsonProcessingExceptionWithCloseableProcessor() {
        JsonParser parser = mock(JsonParser.class);
        JsonProcessingException src = new JsonParseException(parser, "parseErr");
        Reference ref = new Reference("f", "field5");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertSame(parser, result.getProcessor());
    }

    @Test
    public void testWrapWithPath_srcIsJsonProcessingExceptionWithNonCloseableProcessor() {
        JsonProcessingException src = mock(JsonProcessingException.class);
        when(src.getMessage()).thenReturn("errMsg");
        when(src.getProcessor()).thenReturn(null);
        Reference ref = new Reference("f", "field6");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertNull(result.getProcessor());
    }

    // =========================================================
    // getPath() / prependPath()
    // =========================================================

    @Test
    public void testGetPath_emptyWhenNull() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        List<Reference> path = ex.getPath();
        assertNotNull(path);
        assertTrue(path.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetPath_unmodifiable() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("o", "f");
        List<Reference> path = ex.getPath();
        path.add(new Reference("x", "y"));
    }

    @Test
    public void testPrependPath_objectFieldName() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("obj1", "fieldA");
        ex.prependPath("obj2", "fieldB");
        List<Reference> path = ex.getPath();
        assertEquals(2, path.size());
        assertEquals("fieldB", path.get(0).getFieldName());
        assertEquals("fieldA", path.get(1).getFieldName());
    }

    @Test
    public void testPrependPath_objectIndex() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("obj1", 1);
        ex.prependPath("obj2", 2);
        List<Reference> path = ex.getPath();
        assertEquals(2, path.size());
        assertEquals(2, path.get(0).getIndex());
        assertEquals(1, path.get(1).getIndex());
    }

    @Test
    public void testPrependPath_boundaryMaxRefs() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        for (int i = 0; i < JsonMappingException.MAX_REFS_TO_LIST; i++) {
            ex.prependPath("obj" + i, i);
        }
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, ex.getPath().size());
        // เกิน limit ต้องไม่ถูกเพิ่มเข้า path (boundary condition: size < MAX)
        ex.prependPath("extra", 9999);
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, ex.getPath().size());
    }

    // =========================================================
    // getPathReference() / _appendPathDesc()
    // =========================================================

    @Test
    public void testGetPathReference_noPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        assertEquals("", ex.getPathReference());
    }

    @Test
    public void testAppendPathDesc_singleElement() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "m");
        ex.prependPath("o", "field");
        String ref = ex.getPathReference();
        assertFalse(ref.contains("->"));
    }

    @Test
    public void testGetPathReference_withMultipleRefs() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("obj1", "f1");
        ex.prependPath("obj2", "f2");
        String ref = ex.getPathReference();
        assertTrue(ref.contains("->"));
    }

    @Test
    public void testGetPathReference_withStringBuilder() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("obj1", "f1");
        StringBuilder sb = new StringBuilder("prefix:");
        StringBuilder result = ex.getPathReference(sb);
        assertSame(sb, result);
        assertTrue(result.toString().startsWith("prefix:"));
    }

    // =========================================================
    // getProcessor()
    // =========================================================

    @Test
    public void testGetProcessor_null() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        assertNull(ex.getProcessor());
    }

    // =========================================================
    // getMessage() / getLocalizedMessage() / _buildMessage()
    // =========================================================

    @Test
    public void testGetMessage_noPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "plainMsg");
        assertEquals("plainMsg", ex.getMessage());
    }

    @Test
    public void testGetMessage_withPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "plainMsg2");
        ex.prependPath("obj", "f");
        String msg = ex.getMessage();
        assertTrue(msg.contains("plainMsg2"));
        assertTrue(msg.contains("(through reference chain:"));
        assertTrue(msg.endsWith(")"));
    }

    @Test
    public void testGetMessage_nullSuperMessage_withPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, null);
        ex.prependPath("obj", "f");
        String msg = ex.getMessage();
        assertTrue(msg.startsWith(" (through reference chain:"));
    }

    @Test
    public void testGetLocalizedMessage() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "locMsg");
        assertEquals(ex.getMessage(), ex.getLocalizedMessage());
    }

    // =========================================================
    // toString()
    // =========================================================

    @Test
    public void testToStringOverride() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "toStrMsg");
        String str = ex.toString();
        assertTrue(str.startsWith(JsonMappingException.class.getName() + ": toStrMsg"));
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testReferenceConstructor_*`, `testReferenceDefaultConstructor`, `testReferenceSetters` | ทุก constructor ของ `Reference`, NPE เมื่อ `fieldName==null`, default ctor + setter methods |
| `testGetDescription_fromNull` | branch `_from == null` → "UNKNOWN" + fieldName not-null |
| `testGetDescription_withFieldName` / `testGetDescription_classFrom` | branch `_from instanceof Class<?>` true/false, pkgName append |
| `testGetDescription_withIndex` | branch `_fieldName==null && _index>=0` |
| `testGetDescription_noFieldNoIndex` | branch else (`?`) เมื่อไม่มี field/index |
| `testGetDescription_cached` | branch `_desc==null` false (cache path) |
| `testGetDescription_arrayClass` | edge case pkgName อาจ null (ไม่ทราบ behavior แน่ชัด - กำกับคอมเมนต์) |
| `testToString`, `testWriteReplace` | `toString()` เรียก `getDescription()`, `writeReplace()` เรียก `getDescription()` ก่อน return this |
| `testDeprecatedConstructor_*` | constructor เดิม 4 แบบ (msg / msg+cause / msg+loc / msg+loc+cause) |
| `testConstructor_processorIsJsonParser` / `NotJsonParser` | branch `processor instanceof JsonParser` true/false ใน ctor (processor,msg) |
| `testConstructor_processorProblem_isJsonParser` / `notJsonParser` | branch เดียวกันใน ctor (processor,msg,problem) |
| `testConstructor_processorLoc` | ctor (processor,msg,loc) ไม่มีการเช็ค JsonParser |
| `testFrom_*` (8 เมธอด) | static factory `from(JsonParser|JsonGenerator|DeserializationContext|SerializerProvider, ...)` ทั้ง overload มี/ไม่มี problem |
| `testFromUnexpectedIOE` | `fromUnexpectedIOE` format message |
| `testWrapWithPath_withFieldName_newException` / `withIndex_newException` | overload `wrapWithPath(src, refFrom, fieldName/index)` |
| `testWrapWithPath_srcIsJsonMappingException` | branch `src instanceof JsonMappingException` = true |
| `testWrapWithPath_srcMessageNull` / `srcMessageEmpty` | branch `msg==null || msg.length()==0` true (ทั้งสองเงื่อนไข) |
| `testWrapWithPath_srcIsJsonProcessingExceptionWithCloseableProcessor` | branch `src instanceof JsonProcessingException` true, `proc0 instanceof Closeable` true |
| `testWrapWithPath_...NonCloseableProcessor` | branch เดียวกัน แต่ `proc0 instanceof Closeable` false (proc0=null) |
| `testGetPath_emptyWhenNull` / `testGetPath_unmodifiable` | branch `_path==null` true/false, immutability ของ list |
| `testPrependPath_objectFieldName` / `objectIndex` | overload `prependPath(referrer, fieldName)` / `(referrer, index)` |
| `testPrependPath_boundaryMaxRefs` | boundary condition `_path.size() < MAX_REFS_TO_LIST` (true จนถึง 1000, false ที่ 1001) |
| `testGetPathReference_noPath` / `withMultipleRefs` / `withStringBuilder` / `testAppendPathDesc_singleElement` | loop ใน `_appendPathDesc`: `_path==null`, 1 element (ไม่มี `->`), หลาย element (มี `->`) |
| `testGetProcessor_null` | `getProcessor()` คืนค่า null เมื่อไม่ได้ตั้ง processor |
| `testGetMessage_noPath` / `withPath` / `nullSuperMessage_withPath` | branch `_path==null` true/false ใน `_buildMessage()`, branch `msg==null` ภายใน |
| `testGetLocalizedMessage` | `getLocalizedMessage()` เรียก `_buildMessage()` เหมือน `getMessage()` |
| `testToStringOverride` | `toString()` override รูปแบบ `ClassName: message` |

**หมายเหตุ:** บางกรณี (เช่น `getDescription()` กับ array class) พฤติกรรมของ `ClassUtil.getPackageName` ไม่ได้ระบุในซอร์สที่ให้มา จึงเขียนเทสแบบ non-strict (ตรวจเพียงว่าไม่ throw และผลไม่ null) พร้อมคอมเมนต์กำกับตามข้อกำหนด