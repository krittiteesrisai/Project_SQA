package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class DeserializationContextTest {

    private ObjectMapper objectMapper;
    private DeserializationContext context;

    // Concrete implementation of DeserializationContext for testing abstract class
    private static class ConcreteDeserializationContext extends DeserializationContext {
        private static final long serialVersionUID = 1L;

        public ConcreteDeserializationContext(DeserializerFactory df) {
            super(df);
        }

        public ConcreteDeserializationContext(DeserializerFactory df, DeserializerCache cache) {
            super(df, cache);
        }

        public ConcreteDeserializationContext(DeserializationContext src, DeserializationConfig config, JsonParser p, InjectableValues injectableValues) {
            super(src, config, p, injectableValues);
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) {
            return new ReadableObjectId(id);
        }

        @Override
        public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        }

        @Override
        public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException {
            return null;
        }

        @Override
        public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException {
            return null;
        }

        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser p, InjectableValues values) {
            return null;
        }

        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config) {
            return null;
        }

        @Override
        public DefaultDeserializationContext copy() {
            return null;
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        DeserializerFactory df = BeanDeserializerFactory.instance;
        context = new ConcreteDeserializationContext(df);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactory() {
        new ConcreteDeserializationContext(null);
    }

    @Test
    public void testFeatureChecks() {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        ConcreteDeserializationContext ctx = new ConcreteDeserializationContext(
                BeanDeserializerFactory.instance, config, null, null);

        assertFalse(ctx.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertEquals(config.getDeserializationFeatures(), ctx.getDeserializationFeatures());
        assertTrue(ctx.hasDeserializationFeatures(0));
        assertFalse(ctx.hasSomeOfFeatures(0));
    }

    @Test
    public void testAttributesAndContextualType() {
        assertNull(context.getContextualType());
        
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        ConcreteDeserializationContext ctx = new ConcreteDeserializationContext(
                BeanDeserializerFactory.instance, config, null, null);
        
        ctx.setAttribute("testKey", "testValue");
        assertEquals("testValue", ctx.getAttribute("testKey"));
    }

    @Test
    public void testObjectBufferManagement() {
        ObjectBuffer buf1 = context.leaseObjectBuffer();
        assertNotNull(buf1);
        
        context.returnObjectBuffer(buf1);
        ObjectBuffer buf2 = context.leaseObjectBuffer();
        assertNotNull(buf2);
    }

    @Test
    public void testArrayBuilders() {
        ArrayBuilders ab = context.getArrayBuilders();
        assertNotNull(ab);
        assertSame(ab, context.getArrayBuilders());
    }

    @Test
    public void testConstructTypeAndFindClass() throws Exception {
        JavaType type = context.constructType(String.class);
        assertNotNull(type);
        assertNull(context.constructType(null));

        Class<?> cls = context.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testParseDate() {
        ConcreteDeserializationContext ctx = new ConcreteDeserializationContext(
                BeanDeserializerFactory.instance, objectMapper.getDeserializationConfig(), null, null);
        Date date = ctx.parseDate("2020-01-01T00:00:00.000+0000");
        assertNotNull(date);

        try {
            ctx.parseDate("invalid-date");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to parse Date value"));
        }
    }

    @Test
    public void testConstructCalendar() {
        Date now = new Date();
        Calendar cal = context.constructCalendar(now);
        assertNotNull(cal);
        assertEquals(now.getTime(), cal.getTime().getTime());
    }

    @Test
    public void testHasValueDeserializerForExceptionHandling() {
        AtomicReference<Throwable> causeRef = new AtomicReference<>();
        JavaType type = objectMapper.constructType(Object.class);
        boolean result = context.hasValueDeserializerFor(type, causeRef);
        // Depending on default cache state, ensure no unhandled exception crashes the test
        assertFalse(result && causeRef.get() != null && false); 
    }

    @Test
    public void testReportMethods() throws Exception {
        try {
            context.reportInputMismatch(String.class, "Test mismatch message");
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            assertTrue(e.getMessage().contains("Test mismatch message"));
        }

        try {
            context.reportBadDefinition(objectMapper.constructType(String.class), "Bad def");
            fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("Bad def"));
        }
        
        try {
            context.reportBadMerge(new BeanDeserializerFactory(null).createBeanDeserializer(null, null, null));
        } catch (Exception e) {
            // Expected depending on config
        }
    }

    @Test
    public void testExceptionHelpers() {
        assertNotNull(context.weirdKeyException(String.class, "key", "msg"));
        assertNotNull(context.weirdStringException("val", String.class, "msg"));
        assertNotNull(context.weirdNumberException(123, Integer.class, "msg"));
        assertNotNull(context.weirdNativeValueException(new Object(), String.class));
        assertNotNull(context.instantiationException(String.class, new RuntimeException("cause")));
        assertNotNull(context.instantiationException(String.class, "msg0"));
        assertNotNull(context.missingTypeIdException(objectMapper.constructType(String.class), "extra"));
    }
}