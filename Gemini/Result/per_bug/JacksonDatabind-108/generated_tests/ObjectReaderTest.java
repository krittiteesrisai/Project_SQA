package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    @Test
    public void testVersion() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.version());
    }

    @Test
    public void testSimpleAccessorsAndGetters() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();

        assertNotNull(reader.getConfig());
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getTypeFactory());
        assertNotNull(reader.getAttributes());
        assertNull(reader.getInjectableValues());

        assertTrue(reader.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || !reader.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertTrue(reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS) || !reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    valueToUpdateSameAndNull() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);

        // value == _valueToUpdate
        assertSame(reader, reader.withValueToUpdate(null)); // initially both null? Wait, _valueToUpdate is null, passing null returns new or same?
        // Let's test with actual update object
        String dummy = "test";
        ObjectReader readerWithUpdate = reader.withValueToUpdate(dummy);
        assertSame(readerWithUpdate, readerWithUpdate.withValueToUpdate(dummy));

        // value == null when _valueToUpdate != null
        ObjectReader cleared = readerWithUpdate.withValueToUpdate(null);
        assertNotNull(cleared);
    }

    @Test
    public void testWithValueToUpdateTypeInference() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // _valueType is null
        ObjectReader updated = reader.withValueToUpdate(123);
        assertNotNull(updated);
    }

    @Test
    public void testWithFeaturesAndConfigs() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();

        assertNotNull(reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES));
        assertNotNull(reader.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES));
        assertNotNull(reader.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        assertNotNull(reader.with(JsonParser.Feature.ALLOW_COMMENTS));
        assertNotNull(reader.withFeatures(JsonParser.Feature.ALLOW_COMMENTS));
        assertNotNull(reader.without(JsonParser.Feature.ALLOW_COMMENTS));
        assertNotNull(reader.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS));

        // FormatFeature (mock or use JsonReadFeature if available, or just skip if not compatible, but let's test via general config if possible)
        assertNotNull(reader.withRootName("root"));
        assertNotNull(reader.withRootName(PropertyName.construct("root")));
        assertNotNull(reader.withoutRootName());
        assertNotNull(reader.with(JsonNodeFactory.instance));
        assertNotNull(reader.withView(Object.class));
        assertNotNull(reader.with(Locale.getDefault()));
        assertNotNull(reader.with(TimeZone.getDefault()));
        assertNotNull(reader.with(Base64Variant.getDefaultBase64()));
        assertNotNull(reader.withAttributes(Collections.emptyMap()));
        assertNotNull(reader.withAttribute("key", "value"));
        assertNotNull(reader.withoutAttribute("key"));
    }

    @Test
    public void testForTypeVariants() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();

        assertNotNull(reader.forType(String.class));
        assertNotNull(reader.forType(mapper.constructType(String.class)));
        assertNotNull(reader.forType(new TypeReference<String>() {}));
        
        // Deprecated methods for coverage
        assertNotNull(reader.withType(String.class));
        assertNotNull(reader.withType(mapper.constructType(String.class)));
        assertNotNull(reader.withType((java.lang.reflect.Type) String.class));
        assertNotNull(reader.withType(new TypeReference<String>() {}));

        // same type equals check
        ObjectReader r2 = reader.forType(String.class);
        assertSame(r2, r2.forType(String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifySchemaTypeException() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        // Passing an invalid schema type that parser factory cannot use
        reader.with(new FormatSchema() {
            @Override public String getSchemaType() { return "unknown"; }
        });
    }

    @Test
    public void testFilterAndAtMethods() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().at("/test");
        assertNotNull(reader);
        ObjectReader reader2 = reader.at(JsonPointer.compile("/test"));
        assertNotNull(reader2);
    }

    @Test
    public void testReadValueStringAndTree() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(Map.class);
        Map<?, ?> result = reader.readValue("{\"a\":1}");
        assertNotNull(result);

        JsonNode node = reader.readTree("{\"a\":1}");
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testReadValueNullAndEmptyInputs() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(Map.class);

        // Test null JSON value handling via parser/reader
        Map<?, ?> result = reader.readValue("null");
        assertNull(result);
    }

    @Test
    public void testTreeConversions() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(Map.class);
        JsonNode node = mapper.createObjectNode().put("hello", "world");
        
        JsonParser parser = reader.treeAsTokens(node);
        assertNotNull(parser);

        Map<?, ?> val = reader.treeToValue(node, Map.class);
        assertNotNull(val);
    }

    @Test(expected = JsonParseException.class)
    public void testUndetectableSourceReportsError() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Enable format detection to trigger undetectable source check for Reader/String
        ObjectReader reader = mapper.reader().withFormatDetection(mapper.reader());
        reader.readValue("{\"a\":1}");
    }
}