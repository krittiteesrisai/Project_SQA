package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BuilderBasedDeserializerTest {

    // --- Mock Helper Classes ---
    static class DummyBuilder {
        public Object build() { return new Object(); }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithObjectIdReaderThrowsException() {
        BeanDeserializerBuilder mockBuilder = mock(BeanDeserializerBuilder.class);
        BeanDescription mockBeanDesc = mock(BeanDescription.class);
        JavaType mockType = mock(JavaType.class);
        when(mockBeanDesc.getType()).thenReturn(mockType);

        ObjectIdReader mockOir = mock(ObjectIdReader.class);

        // This should trigger the IllegalArgumentException branch
        new BuilderBasedDeserializer(mockBuilder, mockBeanDesc, null, null, null, false, false) {
            {
                _objectIdReader = mockOir;
            }
        };
    }

    @Test
    public void testFinishBuildWhenBuildMethodIsNull() throws Exception {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        DeserializationContext mockContext = mock(DeserializationContext.class);
        Object dummyBuilder = new Object();

        // Access protected method finishBuild via subclass or reflection/direct if accessible in package
        Object result = deserializer.finishBuild(mockContext, dummyBuilder);
        assertEquals(dummyBuilder, result);
    }

    @Test
    public void testUnwrappingDeserializerReturnsNewInstance() {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        JsonDeserializer<Object> unwrapped = deserializer.unwrappingDeserializer(NameTransformer.NOP);
        assertNotNull(unwrapped);
        assertTrue(unwrapped instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithObjectIdReaderReturnsNewInstance() {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        ObjectIdReader oir = mock(ObjectIdReader.class);
        BeanDeserializerBase result = deserializer.withObjectIdReader(oir);
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithIgnorablePropertiesReturnsNewInstance() {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        Set<String> props = new HashSet<>();
        BeanDeserializerBase result = deserializer.withIgnorableProperties(props);
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithBeanPropertiesReturnsNewInstance() {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        BeanPropertyMap props = mock(BeanPropertyMap.class);
        BeanDeserializerBase result = deserializer.withBeanProperties(props);
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testDeserializeUnexpectedToken() throws IOException {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        JsonParser mockParser = mock(JsonParser.class);
        DeserializationContext mockContext = mock(DeserializationContext.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(mockParser.getEmbeddedObject()).thenReturn("Embedded");

        Object result = deserializer.deserialize(mockParser, mockContext);
        assertEquals("Embedded", result);
    }

    @Test
    public void testDeserializeNullTokenHandlesUnexpected() throws IOException {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        JsonParser mockParser = mock(JsonParser.class);
        DeserializationContext mockContext = mock(DeserializationContext.class);

        when(mockParser.getCurrentToken()).thenReturn(null);
        when(mockContext.handleUnexpectedToken(any(), eq(mockParser))).thenReturn("Handled");

        Object result = deserializer.deserialize(mockParser, mockContext);
        assertEquals("Handled", result);
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeIdThrowsException() {
        BuilderBasedDeserializer deserializer = createTestDeserializer(null);
        JsonParser mockParser = mock(JsonParser.class);
        DeserializationContext mockContext = mock(DeserializationContext.class);

        try {
            // Invoke protected method via sub-class exposure or direct call if package-private/accessible
            deserializer.deserializeUsingPropertyBasedWithExternalTypeId(mockParser, mockContext);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("not yet implemented"));
        } catch (Exception e) {
            fail("Unexpected exception type: " + e.getClass());
        }
    }

    // Utility method to construct minimal valid BuilderBasedDeserializer for testing
    private BuilderBasedDeserializer createTestDeserializer(AnnotatedMethod buildMethod) {
        BeanDeserializerBuilder mockBuilder = mock(BeanDeserializerBuilder.class);
        BeanDescription mockBeanDesc = mock(BeanDescription.class);
        when(mockBuilder.getBuildMethod()).thenReturn(buildMethod);

        return new BuilderBasedDeserializer(mockBuilder, mockBeanDesc, null, null, null, false, false) {
            // Expose protected method for testing convenience if needed
            @Override
            public Object finishBuild(DeserializationContext ctxt, Object builder) throws IOException {
                return super.finishBuild(ctxt, builder);
            }

            @Override
            public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser p, DeserializationContext ctxt) throws IOException {
                return super.deserializeUsingPropertyBasedWithExternalTypeId(p, ctxt);
            }
        };
    }
}