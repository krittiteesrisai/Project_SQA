package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for BeanDeserializerBase focusing on edge cases,
 * branch/condition coverage, and fault detection.
 */
public class BeanDeserializerBaseTest {

    private ObjectMapper objectMapper;
    private DummyBeanDeserializerBase deserializer;
    private DeserializationContext defaultContext;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        JavaType beanType = TypeFactory.defaultInstance().constructType(DummyBean.class);
        deserializer = new DummyBeanDeserializerBase(beanType);
        defaultContext = objectMapper.getDeserializationContext();
    }

    @Test
    public void testDeserializeFromArray_WithArrayDelegateSuccess() throws Exception {
        JsonDeserializer<Object> mockDelegate = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return new DummyBean("delegated");
            }
        };
        deserializer._arrayDelegateDeserializer = mockDelegate;

        JsonParser p = objectMapper.getFactory().createParser("[]");
        p.nextToken();

        Object result = deserializer.deserializeFromArray(p, defaultContext);
        assertNotNull(result);
        assertTrue(result instanceof DummyBean);
        assertEquals("delegated", ((DummyBean) result).name);
    }

    @Test
    public void testDeserializeFromArray_WithArrayDelegateException() throws Exception {
        JsonDeserializer<Object> mockDelegate = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new RuntimeException("Delegate fail");
            }
        };
        deserializer._arrayDelegateDeserializer = mockDelegate;

        JsonParser p = objectMapper.getFactory().createParser("[]");
        p.nextToken();

        // Should be caught and handled via wrapInstantiationProblem
        try {
            deserializer.deserializeFromArray(p, defaultContext);
            fail("Expected exception");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testDeserializeFromArray_AcceptEmptyArrayAsNull() throws Exception {
        defaultContext.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);

        JsonParser p = objectMapper.getFactory().createParser("[]");
        p.nextToken(); // START_ARRAY

        Object result = deserializer.deserializeFromArray(p, defaultContext);
        assertNull(result);
    }

    @Test
    public void testWrapAndThrow_UnwindInvocationTargetException() {
        Throwable cause = new NullPointerException("Root cause");
        InvocationTargetException ex = new InvocationTargetException(cause, "Wrapper");

        try {
            deserializer.wrapAndThrow(ex, new DummyBean("test"), "name", defaultContext);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Root cause") || e.getPath().size() > 0);
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test(expected = OutOfMemoryError.class)
    public void testWrapAndThrow_PassesErrorDirectly() throws IOException {
        Error error = new OutOfMemoryError("OOM");
        deserializer.wrapAndThrow(error, null, "field", defaultContext);
    }

    @Test
    public void testWrapAndThrow_RuntimeWithoutWrapping() throws IOException {
        defaultContext.disable(DeserializationFeature.WRAP_EXCEPTIONS);
        IllegalArgumentException ex = new IllegalArgumentException("Invalid argument");

        try {
            deserializer.wrapAndThrow(ex, null, "field", defaultContext);
            fail("Expected RuntimeException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid argument", e.getMessage());
        }
    }

    @Test
    public void testGettersAndBasicAccessors() {
        assertTrue(deserializer.isCachable());
        assertEquals(DummyBean.class, deserializer.handledType());
        assertNull(deserializer.getObjectIdReader());
        assertFalse(deserializer.hasViews());
        assertEquals(0, deserializer.getPropertyCount());
        assertTrue(deserializer.getKnownPropertyNames().isEmpty());
    }

    // --- Helper Dummy Classes ---

    public static class DummyBean {
        public String name;
        public DummyBean() {}
        public DummyBean(String name) { this.name = name; }
    }

    public static class DummyBeanDeserializerBase extends BeanDeserializerBase {
        public DummyBeanDeserializerBase(JavaType type) {
            super(null, objectMapper.getDeserializationConfig().introspect(type),
                    null, null, null, false, false);
        }

        protected DummyBeanDeserializerBase(DummyBeanDeserializerBase src) {
            super(src);
        }

        @Override
        public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) {
            return this;
        }

        @Override
        public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) {
            return this;
        }

        @Override
        public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) {
            return this;
        }

        @Override
        protected BeanDeserializerBase asArrayDeserializer() {
            return this;
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new DummyBean();
        }

        @Override
        protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new DummyBean();
        }
    }
}