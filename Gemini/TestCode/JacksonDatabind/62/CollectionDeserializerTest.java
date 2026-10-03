package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CollectionDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;
    private JavaType collectionType;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
        collectionType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
    }

    @Test
    public void testIsCachable() {
        // กรณีไม่มี Deserializer ใดๆ คืนค่า true
        CollectionDeserializer deser1 = new CollectionDeserializer(collectionType, null, null, null);
        assertTrue(deser1.isCachable());

        // กรณีมี valueDeserializer คืนค่า false
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> dummyDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        CollectionDeserializer deser2 = new CollectionDeserializer(collectionType, dummyDeser, null, null);
        assertFalse(deser2.isCachable());
    }

    @Test
    public void testWithResolvedNoChange() {
        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, null);
        CollectionDeserializer resolved = deser.withResolved(null, null, null, null);
        assertSame(deser, resolved);
    }

    @Test
    public void testWithResolvedChanged() {
        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, null);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> dummyDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        CollectionDeserializer resolved = deser.withResolved(null, dummyDeser, null, Boolean.TRUE);
        assertNotSame(deser, resolved);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextualDelegateTypeNull() throws Exception {
        ValueInstantiator instantiator = mock(ValueInstantiator.class);
        when(instantiator.canCreateUsingDelegate()).thenReturn(true);
        when(instantiator.getDelegateType(any())).thenReturn(null);

        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, instantiator);
        deser.createContextual(deserializationContext, null);
    }

    @Test
    public void testGettersAndGetContentType() {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> dummyDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        CollectionDeserializer deser = new CollectionDeserializer(collectionType, dummyDeser, null, null);
        
        assertEquals(String.class, deser.getContentType().getRawClass());
        assertEquals(dummyDeser, deser.getContentDeserializer());
    }

    @Test
    public void testDeserializeEmptyStringAsCollection() throws Exception {
        ValueInstantiator instantiator = mock(ValueInstantiator.class);
        ArrayList<Object> emptyList = new ArrayList<>();
        when(instantiator.createFromString(any(), eq(""))).thenReturn(emptyList);

        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, instantiator);

        JsonParser parser = objectMapper.getFactory().createParser("\"\"");
        parser.nextToken(); // เลื่อนไปที่ VALUE_STRING

        Collection<Object> result = deser.deserialize(parser, deserializationContext);
        assertSame(emptyList, result);
    }

    @Test
    public void testDeserializeWithDelegate() throws Exception {
        ValueInstantiator instantiator = mock(ValueInstantiator.class);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> delegateDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        
        ArrayList<Object> delegateResult = new ArrayList<>();
        ArrayList<Object> finalCollection = new ArrayList<>();

        when(delegateDeser.deserialize(any(), any())).thenReturn(delegateResult);
        when(instantiator.createUsingDelegate(any(), eq(delegateResult))).thenReturn(finalCollection);

        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, instantiator, delegateDeser, null);

        JsonParser parser = objectMapper.getFactory().createParser("[]");
        parser.nextToken();

        Collection<Object> result = deser.deserialize(parser, deserializationContext);
        assertSame(finalCollection, result);
    }

    @Test
    public void testHandleNonArrayWithUnwrapSingleTrue() throws Exception {
        ValueInstantiator instantiator = mock(ValueInstantiator.class);
        ArrayList<Object> list = new ArrayList<>();
        when(instantiator.createUsingDefault(any())).thenReturn(list);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> valueDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        when(valueDeser.deserialize(any(), any())).thenReturn("singleItem");

        CollectionDeserializer deser = new CollectionDeserializer(collectionType, valueDeser, null, instantiator, null, Boolean.TRUE);

        JsonParser parser = objectMapper.getFactory().createParser("\"singleItem\"");
        parser.nextToken(); // VALUE_STRING

        Collection<Object> result = deser.deserialize(parser, deserializationContext);
        assertTrue(result.contains("singleItem"));
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleNonArrayThrowsExceptionWhenCanWrapFalse() throws Exception {
        ValueInstantiator instantiator = mock(ValueInstantiator.class);
        ArrayList<Object> list = new ArrayList<>();
        when(instantiator.createUsingDefault(any())).thenReturn(list);

        CollectionDeserializer deser = new CollectionDeserializer(collectionType, null, null, instantiator, null, Boolean.FALSE);

        JsonParser parser = objectMapper.getFactory().createParser("\"singleItem\"");
        parser.nextToken();

        deser.deserialize(parser, deserializationContext);
    }

    @Test
    public void testCollectionReferringAccumulatorAddAndResolve() throws Exception {
        ArrayList<Object> result = new ArrayList<>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);

        // ทดสอบเมื่อ accumulator ว่าง
        accumulator.add("item1");
        assertEquals(1, result.size());
        assertEquals("item1", result.get(0));

        // จำลอง UnresolvedForwardReference เพื่อเพิ่มเข้า accumulator
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        var referring = accumulator.handleUnresolvedReference(ref);
        assertNotNull(referring);

        // ทดสอบเพิ่ม item ตอนที่มี accumulator ค้างอยู่
        accumulator.add("item2");

        // ทดสอบ Resolve Forward Reference สำเร็จ
        accumulator.resolveForwardReference(null, "resolvedItem");
        assertTrue(result.contains("resolvedItem"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResolveForwardReferenceNotFoundThrowsException() throws Exception {
        ArrayList<Object> result = new ArrayList<>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);

        accumulator.resolveForwardReference("unknownId", "value");
    }
}