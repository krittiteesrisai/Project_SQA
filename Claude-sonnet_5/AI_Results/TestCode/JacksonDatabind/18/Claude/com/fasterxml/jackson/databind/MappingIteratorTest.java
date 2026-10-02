package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
// import ชั้นเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้จะอยู่ package เดียวกันก็ compile ได้)
import com.fasterxml.jackson.databind.MappingIterator;

/**
 * Unit test สำหรับ MappingIterator (Defects4J: JacksonDatabind-18b)
 * วางไว้ใน package เดียวกับ target class เพราะ constructor เป็น protected
 */
@SuppressWarnings("unchecked")
public class MappingIteratorTest {

    // ---------- Helper ----------
    private MappingIterator<Object> createIterator(JsonParser p, JsonDeserializer<?> deser,
            boolean managedParser, Object updatedValue) {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        return new MappingIterator<Object>(null, p, ctxt, deser, managedParser, updatedValue);
    }

    // ===================================================================
    // Constructor branch: managedParser && (p!=null) && isExpectedStartArrayToken()
    // ===================================================================

    @Test
    public void testConstructor_managedParser_startArray_clearsToken() {
        JsonParser parser = mock(JsonParser.class);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);

        createIterator(parser, deser, true, null);

        verify(parser, times(1)).isExpectedStartArrayToken();
        verify(parser, times(1)).clearCurrentToken();
    }

    @Test
    public void testConstructor_managedParser_notStartArray_noClear() {
        JsonParser parser = mock(JsonParser.class);
        when(parser.isExpectedStartArrayToken()).thenReturn(false);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);

        createIterator(parser, deser, true, null);

        verify(parser, times(1)).isExpectedStartArrayToken();
        verify(parser, never()).clearCurrentToken();
    }

    @Test
    public void testConstructor_notManagedParser_startArrayFlagIgnored() {
        JsonParser parser = mock(JsonParser.class);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);

        // managedParser=false -> short-circuit ก่อนเรียก isExpectedStartArrayToken()
        createIterator(parser, deser, false, null);

        verify(parser, never()).isExpectedStartArrayToken();
        verify(parser, never()).clearCurrentToken();
    }

    @Test
    public void testConstructor_managedParser_nullParser_noException() {
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        // p == null -> short-circuit, ไม่เกิด NPE
        MappingIterator<Object> it = createIterator(null, deser, true, null);
        assertNull(it.getParser());
    }

    // ===================================================================
    // hasNext() / hasNextValue()
    // ===================================================================

    @Test
    public void testHasNext_nullParser_returnsFalse() throws IOException {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        assertFalse(it.hasNext());
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testHasNextValue_currentTokenNotNull_shortCircuitsNextToken() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        assertTrue(it.hasNextValue());
        verify(parser, never()).nextToken();

        // เรียกซ้ำ - ต้องไม่เรียก getCurrentToken() ซ้ำ เพราะ _hasNextChecked=true แล้ว
        assertTrue(it.hasNextValue());
        verify(parser, times(1)).getCurrentToken();
    }

    @Test
    public void testHasNextValue_eofClosesManagedParser() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(null);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), true, null);

        assertFalse(it.hasNextValue());
        verify(parser, times(1)).close();
        assertNull(it.getParser());
    }

    @Test
    public void testHasNextValue_eofDoesNotCloseUnmanagedParser() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(null);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        assertFalse(it.hasNextValue());
        verify(parser, never()).close();
        assertNull(it.getParser());
    }

    @Test
    public void testHasNextValue_endArrayStopsIteration() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.END_ARRAY);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        assertFalse(it.hasNextValue());
        assertNull(it.getParser());
    }

    @Test
    public void testHasNextValue_nextTokenAvailable_returnsTrue() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        assertTrue(it.hasNextValue());
    }

    @Test
    public void testHasNext_wrapsJsonMappingException() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenThrow(JsonMappingException.from(parser, "boom"));
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        try {
            it.hasNext();
            fail("expected RuntimeJsonMappingException");
        } catch (RuntimeJsonMappingException expected) {
            // ok
        }
    }

    @Test
    public void testHasNext_wrapsPlainIOException() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenThrow(new IOException("io fail"));
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);

        try {
            it.hasNext();
            fail("expected RuntimeException");
        } catch (RuntimeJsonMappingException notExpected) {
            fail("should not be RuntimeJsonMappingException branch");
        } catch (RuntimeException expected) {
            // ok - ตรง catch(IOException) branch
        }
    }

    // ===================================================================
    // next() / nextValue()
    // ===================================================================

    @Test(expected = NoSuchElementException.class)
    public void testNextValue_throwsWhenParserNull() throws IOException {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        it.nextValue();
    }

    @Test(expected = NoSuchElementException.class)
    public void testNext_throwsNoSuchElement_whenParserNull() {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        it.next();
    }

    @Test
    public void testNextValue_deserializeWithoutUpdatedValue() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object expected = "hello";
        when(deser.deserialize(eq(parser), any(DeserializationContext.class))).thenReturn(expected);

        MappingIterator<Object> it = createIterator(parser, deser, false, null);
        Object val = it.nextValue();

        assertEquals(expected, val);
        verify(parser, times(1)).clearCurrentToken();
        verify(deser, times(1)).deserialize(eq(parser), any(DeserializationContext.class));
    }

    @Test
    public void testNextValue_deserializeWithUpdatedValue() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object updated = new Object();

        MappingIterator<Object> it = createIterator(parser, deser, false, updated);
        Object val = it.nextValue();

        assertSame(updated, val);
        verify(deser, times(1)).deserialize(eq(parser), any(DeserializationContext.class), eq(updated));
        verify(parser, times(1)).clearCurrentToken();
    }

    @Test
    public void testNext_wrapsJsonMappingException() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(eq(parser), any(DeserializationContext.class)))
                .thenThrow(JsonMappingException.from(parser, "fail"));

        MappingIterator<Object> it = createIterator(parser, deser, false, null);
        try {
            it.next();
            fail("expected RuntimeJsonMappingException");
        } catch (RuntimeJsonMappingException expected) {
            // ok
        }
    }

    @Test
    public void testNext_wrapsPlainIOException() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(eq(parser), any(DeserializationContext.class)))
                .thenThrow(new IOException("io fail"));

        MappingIterator<Object> it = createIterator(parser, deser, false, null);
        try {
            it.next();
            fail("expected RuntimeException");
        } catch (RuntimeJsonMappingException notExpected) {
            fail("should not be RuntimeJsonMappingException branch");
        } catch (RuntimeException expected) {
            // ok
        }
    }

    /**
     * หมายเหตุ: state นี้ (_hasNextChecked=true แต่ _parser=null) ไม่สามารถเกิดขึ้นได้
     * จาก public API flow ปกติ (เพราะ hasNextValue() จะ set _hasNextChecked=true
     * เฉพาะเมื่อ parser ยัง != null) แต่ใช้ reflection เพื่อบังคับ branch
     * "_parser == null" ใน nextValue() ให้ครอบคลุมเพื่อ branch coverage
     */
    @Test(expected = NoSuchElementException.class)
    public void testNextValue_artificialState_parserNullAfterChecked() throws Exception {
        MappingIterator<Object> it = createIterator(mock(JsonParser.class),
                mock(JsonDeserializer.class), false, null);

        Field checked = MappingIterator.class.getDeclaredField("_hasNextChecked");
        checked.setAccessible(true);
        checked.setBoolean(it, true);

        Field parserField = MappingIterator.class.getDeclaredField("_parser");
        parserField.setAccessible(true);
        parserField.set(it, null);

        it.nextValue();
    }

    // ===================================================================
    // remove()
    // ===================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_alwaysThrows() {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        it.remove();
    }

    // ===================================================================
    // close()
    // ===================================================================

    @Test
    public void testClose_closesParserWhenNotNull() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);
        it.close();
        verify(parser, times(1)).close();
    }

    @Test
    public void testClose_noExceptionWhenParserNull() throws IOException {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        it.close(); // ไม่ควร throw
    }

    // ===================================================================
    // readAll() overloads
    // ===================================================================

    @Test
    public void testReadAllNoArg_emptyResult() throws IOException {
        MappingIterator<Object> it = createIterator(null, mock(JsonDeserializer.class), false, null);
        List<Object> result = it.readAll();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testReadAllNoArg_delegatesToReadAllList() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING).thenReturn(null);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(eq(parser), any(DeserializationContext.class))).thenReturn("x");

        MappingIterator<Object> it = createIterator(parser, deser, false, null);
        List<Object> result = it.readAll();

        assertEquals(Collections.singletonList("x"), result);
    }

    @Test
    public void testReadAllList_multipleElements_loopsCorrectly() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken())
                .thenReturn(JsonToken.VALUE_STRING)
                .thenReturn(JsonToken.VALUE_STRING)
                .thenReturn(null);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(eq(parser), any(DeserializationContext.class)))
                .thenReturn("a")
                .thenReturn("b");

        MappingIterator<Object> it = createIterator(parser, deser, true, null);
        List<Object> result = it.readAll(new ArrayList<Object>());

        assertEquals(Arrays.asList("a", "b"), result);
        verify(parser, times(1)).close(); // managed parser -> ปิดตอน EOF
    }

    @Test
    public void testReadAllCollection_singleElement() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT).thenReturn(null);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(eq(parser), any(DeserializationContext.class))).thenReturn(42);

        MappingIterator<Object> it = createIterator(parser, deser, false, null);
        Set<Object> result = it.readAll(new HashSet<Object>());

        assertEquals(1, result.size());
        assertTrue(result.contains(42));
    }

    // ===================================================================
    // Accessors
    // ===================================================================

    @Test
    public void testGetParser_returnsUnderlyingParser() {
        JsonParser parser = mock(JsonParser.class);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);
        assertSame(parser, it.getParser());
    }

    @Test
    public void testGetParserSchema_delegatesToParser() {
        JsonParser parser = mock(JsonParser.class);
        FormatSchema schema = mock(FormatSchema.class);
        when(parser.getSchema()).thenReturn(schema);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);
        assertSame(schema, it.getParserSchema());
    }

    @Test
    public void testGetCurrentLocation_delegatesToParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = mock(JsonLocation.class);
        when(parser.getCurrentLocation()).thenReturn(loc);
        MappingIterator<Object> it = createIterator(parser, mock(JsonDeserializer.class), false, null);
        assertSame(loc, it.getCurrentLocation());
    }

    // ===================================================================
    // emptyIterator() factory (protected static)
    // ===================================================================

    @Test
    public void testEmptyIteratorFactory_returnsUsableEmptyInstance() throws IOException {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertFalse(it.hasNext());
        assertNull(it.getParser());
    }
}
