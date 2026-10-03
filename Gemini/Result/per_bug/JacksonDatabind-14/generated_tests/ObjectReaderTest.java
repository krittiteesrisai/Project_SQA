package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    // Helper class for testing data binding
    public static class SampleBean {
        public String name;
        public int age;
    }

    @Test
    public void testVersion() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.version());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateArrayValueThrowsException() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType arrayType = TypeFactory.defaultInstance().constructArrayType(String.class);
        // This should trigger: if (valueToUpdate != null && valueType.isArrayType()) throw new IllegalArgumentException
        mapper.reader().forType(arrayType).withValueToUpdate(new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullValueToUpdateThrowsException() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.reader().withValueToUpdate(null);
    }

    @Test
    public void testWithSameValueToUpdateReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        Object bean = new SampleBean();
        ObjectReader readerWithUpdate = reader.withValueToUpdate(bean);
        ObjectReader readerWithSameUpdate = readerWithUpdate.withValueToUpdate(bean);
        assertSame(readerWithUpdate, readerWithSameUpdate);
    }

    @Test
    public void testWithSameTypeReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        ObjectReader reader = mapper.reader().forType(type);
        assertSame(reader, reader.forType(type));
    }

    @Test
    public void testReadValueNullTokenWithoutUpdate() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(SampleBean.class);
        // JSON containing just 'null'
        SampleBean result = reader.readValue("null");
        assertNull(result);
    }

    @Test
    public void testReadValueNullTokenWithUpdate() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SampleBean existing = new SampleBean();
        existing.name = "KeepMe";
        ObjectReader reader = mapper.reader().forType(SampleBean.class).withValueToUpdate(existing);
        
        SampleBean result = reader.readValue("null");
        assertSame(existing, result);
        assertEquals("KeepMe", result.name);
    }

    @Test
    public void testReadValueEndObjectOrArrayToken() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SampleBean existing = new SampleBean();
        existing.name = "Initial";
        ObjectReader reader = mapper.reader().forType(SampleBean.class).withValueToUpdate(existing);

        // {} results in END_OBJECT without fields populated if not handled, or just returns valueToUpdate
        SampleBean result = reader.readValue("{}");
        assertSame(existing, result);
    }

    @Test
    public void testReadValueWithRootUnwrappingSuccess() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader()
                .forType(SampleBean.class)
                .withRootName("RootNode")
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        SampleBean result = reader.readValue("{\"RootNode\":{\"name\":\"TestName\",\"age\":20}}");
        assertNotNull(result);
        assertEquals("TestName", result.name);
        assertEquals(20, result.age);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootFailureNotStartObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader()
                .forType(SampleBean.class)
                .withRootName("RootNode")
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        // Pass array instead of object for root unwrap
        reader.readValue("[{\"name\":\"TestName\"}]");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootFailureNotFieldName() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader()
                .forType(SampleBean.class)
                .withRootName("RootNode")
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        // Pass empty object or invalid structure
        reader.readValue("{ \"wrongField\": {} }");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootFailureNameMismatch() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader()
                .forType(SampleBean.class)
                .withRootName("ExpectedRoot")
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        reader.readValue("{\"ActualRoot\":{\"name\":\"TestName\"}}");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootFailureNotEndObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader()
                .forType(SampleBean.class)
                .withRootName("RootNode")
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        // Extra trailing fields causing missing END_OBJECT check
        reader.readValue("{\"RootNode\":{\"name\":\"TestName\"}, \"extra\": 1}");
    }

    @Test(expected = JsonMappingException.class)
    public void testFindRootDeserializerNoValueType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // no type configured
        reader.readValue("{\"name\":\"test\"}");
    }

    @Test
    public void testTreeToValueAndOtherAccessors() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(SampleBean.class);
        JsonNode node = mapper.createObjectNode().put("name", "NodeName").put("age", 25);
        
        SampleBean bean = reader.treeToValue(node, SampleBean.class);
        assertNotNull(bean);
        assertEquals("NodeName", bean.name);
        assertEquals(25, bean.age);
        
        assertNotNull(reader.getConfig());
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getJsonFactory());
        assertNotNull(reader.getTypeFactory());
        assertNotNull(reader.getAttributes());
        assertTrue(reader.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH));
        assertTrue(reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testFactoryCachingAndCustomizations() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        
        JsonFactory f = reader.getFactory();
        assertSame(reader, reader.with(f));
        assertSame(reader, reader.with(reader.getConfig()));
        
        assertNotNull(reader.with(java.util.Locale.ENGLISH));
        assertNotNull(reader.with(java.util.TimeZone.getDefault()));
        assertNotNull(reader.with(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant()));
        assertNotNull(reader.with(ContextAttributes.getEmpty()));
        assertNotNull(reader.withAttribute("key", "val"));
        assertNotNull(reader.withAttributes(new java.util.HashMap<Object, Object>()));
        assertNotNull(reader.withoutAttribute("key"));
    }
}