package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;

import static org.junit.Assert.*;

public class SettableBeanPropertyTest {

    private TestableBeanProperty property;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        PropertyName propName = new PropertyName("testProp");
        JavaType type = mapper.constructType(String.class);
        property = new TestableBeanProperty(propName, type, null, null, null, PropertyMetadata.STD_REQUIRED);
    }

    @Test
    public void testAssignIndex_SuccessAndDuplicate() {
        // ปกติกำหนดได้ครั้งแรก
        property.assignIndex(0);
        assertEquals(0, property.getPropertyIndex());

        // กำหนดซ้ำต้องพ่น IllegalStateException (Branch: _propertyIndex != -1)
        try {
            property.assignIndex(1);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("already had index"));
        }
    }

    @Test
    public void testSetViews() {
        // กรณี views เป็น null -> _viewMatcher เป็น null
        property.setViews(null);
        assertFalse(property.hasViews());

        // กรณี views ไม่เป็น null -> สร้าง ViewMatcher
        property.setViews(new Class<?>[] { String.class });
        assertTrue(property.hasViews());
        assertTrue(property.visibleInView(String.class));
        assertFalse(property.visibleInView(Integer.class));
    }

    @Test
    public void testWithSimpleName() {
        // ทดสอบกรณี _propName != null และเปลี่ยนชื่อ
        SettableBeanProperty modified = property.withSimpleName("newSimpleName");
        assertNotNull(modified);
        assertEquals("newSimpleName", modified.getName());

        // ทดสอบกรณี _propName เป็น null
        TestableBeanProperty nullNameProp = new TestableBeanProperty(null, property.getType(), null, null, null, PropertyMetadata.STD_OPTIONAL);
        SettableBeanProperty modifiedNull = nullNameProp.withSimpleName("derivedName");
        assertEquals("derivedName", modifiedNull.getName());
    }

    @Test
    public void testDepositSchemaProperty() throws Exception {
        JsonObjectFormatVisitor visitor = new JsonObjectFormatVisitor.Base();
        
        // กรณี isRequired() เป็น true (กำหนดใน setUp ด้วย PropertyMetadata.STD_REQUIRED)
        property.depositSchemaProperty(visitor, mapper.getSerializerProvider());

        // กรณี isRequired() เป็น false
        TestableBeanProperty optionalProp = new TestableBeanProperty(
                new PropertyName("optProp"), property.getType(), null, null, null, PropertyMetadata.STD_OPTIONAL);
        optionalProp.depositSchemaProperty(visitor, mapper.getSerializerProvider());
    }

    @Test
    public void testThrowAsIOE_IllegalArgumentException_WithMessage() {
        JsonParser p = null;
        IllegalArgumentException iae = new IllegalArgumentException("Invalid format");
        try {
            property._throwAsIOE(p, iae, 123);
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            assertTrue(e.getMessage().contains("Problem deserializing property 'testProp'"));
            assertTrue(e.getMessage().contains("problem: Invalid format"));
        }
    }

    @Test
    public void testThrowAsIOE_IllegalArgumentException_WithoutMessage() {
        JsonParser p = null;
        IllegalArgumentException iae = new IllegalArgumentException();
        try {
            property._throwAsIOE(p, iae, "someValue");
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            assertTrue(e.getMessage().contains("(no error message provided)"));
        }
    }

    @Test
    public void testDelegatingMethods() {
        TestableBeanProperty inner = new TestableBeanProperty(new PropertyName("inner"), property.getType(), null, null, null, PropertyMetadata.STD_OPTIONAL);
        TestDelegatingProperty delegating = new TestDelegatingProperty(inner);

        // ทดสอบ Delegating methods
        assertNotNull(delegating.getDelegate());
        assertEquals("inner", delegating.getName());
        assertNotNull(delegating.getType());
        assertNull(delegating.getWrapperName());
        assertNull(delegating.getAnnotation(Override.class));
        assertNull(delegating.getMember());
        assertEquals(-1, delegating.getPropertyIndex());
        
        try {
            delegating.getCreatorIndex();
            fail();
        } catch (IllegalStateException e) {
            // Expected
        }
        
        assertNull(delegating.getInjectableValueId());
        
        delegating.assignIndex(5);
        assertEquals(5, inner.getPropertyIndex());

        delegating.fixAccess(null);
        
        assertNotNull(delegating.withValueDeserializer(null));
        assertNotNull(delegating.withName(new PropertyName("newName")));
        assertNotNull(delegating.withNullProvider(null));
    }

    @Test
    public void testGettersAndSetters() {
        property.setManagedReferenceName("refName");
        assertEquals("refName", property.getManagedReferenceName());

        ObjectIdInfo objectIdInfo = new ObjectIdInfo(new PropertyName("id"), Object.class, null, null);
        property.setObjectIdInfo(objectIdInfo);
        assertEquals(objectIdInfo, property.getObjectIdInfo());

        assertNull(property.getInjectableValueId());
        assertFalse(property.hasValueDeserializer());
        assertFalse(property.hasValueTypeDeserializer());
        assertNull(property.getValueDeserializer());
        assertNull(property.getValueTypeDeserializer());
        assertNotNull(property.toString());
    }

    // --- Concrete Test Doubles for abstract class SettableBeanProperty ---

    private static class TestableBeanProperty extends SettableBeanProperty {
        public TestableBeanProperty(PropertyName propName, JavaType type, PropertyName wrapper,
                                    TypeDeserializer typeDeser, Annotations contextAnnotations,
                                    PropertyMetadata metadata) {
            super(propName, type, wrapper, typeDeser, contextAnnotations, metadata);
        }

        protected TestableBeanProperty(TestableBeanProperty src) {
            super(src);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new TestableBeanProperty(newName, _type, _wrapperName, _valueTypeDeserializer, _contextAnnotations, _metadata);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return this;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {}

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            return null;
        }
    }

    private static class TestDelegatingProperty extends SettableBeanProperty.Delegating {
        public TestDelegatingProperty(SettableBeanProperty d) {
            super(d);
        }

        @Override
        protected SettableBeanProperty withDelegate(SettableBeanProperty d) {
            return new TestDelegatingProperty(d);
        }
    }
}