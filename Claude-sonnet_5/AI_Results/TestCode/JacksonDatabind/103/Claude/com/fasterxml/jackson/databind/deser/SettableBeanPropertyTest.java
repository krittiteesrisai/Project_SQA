package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

/**
 * Unit tests for {@link SettableBeanProperty}.
 *
 * หมายเหตุ: SettableBeanProperty เป็น abstract class จึงสร้าง concrete subclass
 * (TestProperty) และ Delegating subclass (TestDelegating) ภายในไฟล์นี้เพื่อทดสอบ
 * คลาสถูกวางใน package เดียวกับ source (com.fasterxml.jackson.databind.deser)
 * เพื่อให้เข้าถึง protected constructor / protected static field ได้ตรง ๆ
 */
public class SettableBeanPropertyTest {

    // =====================================================================
    // Minimal concrete subclass เพื่อให้สามารถสร้างอินสแตนซ์ของ abstract class ได้
    // =====================================================================
    static class TestProperty extends SettableBeanProperty {

        Object lastSetValue;

        public TestProperty(BeanPropertyDefinition propDef, JavaType type,
                TypeDeserializer typeDeser, Annotations contextAnnotations) {
            super(propDef, type, typeDeser, contextAnnotations);
        }

        public TestProperty(PropertyName propName, JavaType type, PropertyName wrapper,
                TypeDeserializer typeDeser, Annotations contextAnnotations, PropertyMetadata metadata) {
            super(propName, type, wrapper, typeDeser, contextAnnotations, metadata);
        }

        public TestProperty(PropertyName propName, JavaType type, PropertyMetadata metadata,
                JsonDeserializer<Object> valueDeser) {
            super(propName, type, metadata, valueDeser);
        }

        public TestProperty(SettableBeanProperty src) {
            super(src);
        }

        public TestProperty(SettableBeanProperty src, JsonDeserializer<?> deser, NullValueProvider nuller) {
            super(src, deser, nuller);
        }

        public TestProperty(SettableBeanProperty src, PropertyName newName) {
            super(src, newName);
        }

        /** expose protected static field for tests in-package/subclass */
        static JsonDeserializer<Object> missingValueDeserializer() {
            return MISSING_VALUE_DESERIALIZER;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            if (deser == _valueDeserializer) {
                return this;
            }
            return new TestProperty(this, deser, this._nullProvider);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            if (newName == _propName) {
                return this;
            }
            return new TestProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            if (nva == _nullProvider) {
                return this;
            }
            return new TestProperty(this, this._valueDeserializer, nva);
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
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance)
                throws IOException {
            lastSetValue = deserialize(p, ctxt);
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance)
                throws IOException {
            lastSetValue = deserialize(p, ctxt);
            return lastSetValue;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            lastSetValue = value;
            return value;
        }

        // ---- wrappers to invoke protected helper methods ----
        public void callThrowAsIOE3(JsonParser p, Exception e, Object value) throws IOException {
            _throwAsIOE(p, e, value);
        }

        public IOException callThrowAsIOE2(JsonParser p, Exception e) throws IOException {
            return _throwAsIOE(p, e);
        }
    }

    static class TestDelegating extends SettableBeanProperty.Delegating {
        protected TestDelegating(SettableBeanProperty d) {
            super(d);
        }

        @Override
        protected SettableBeanProperty withDelegate(SettableBeanProperty d) {
            return new TestDelegating(d);
        }
    }

    interface ViewA {}
    interface ViewB {}

    private TestProperty newBasicProperty(String name) {
        return new TestProperty(new PropertyName(name), null, (PropertyName) null, null, null,
                PropertyMetadata.STD_REQUIRED);
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testConstructor_nullPropName_usesNoName() {
        TestProperty p = new TestProperty((PropertyName) null, null, (PropertyName) null, null, null,
                PropertyMetadata.STD_REQUIRED);
        assertEquals(PropertyName.NO_NAME, p.getFullName());
        assertEquals("", p.getName());
    }

    @Test
    public void testConstructor_withPropName_internsSimpleName() {
        TestProperty p = newBasicProperty("foo");
        assertEquals("foo", p.getName());
        assertEquals(new PropertyName("foo"), p.getFullName());
    }

    @Test
    public void testConstructor_withTypeDeserializer_contextualizes() {
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        TypeDeserializer contextualized = mock(TypeDeserializer.class);
        when(typeDeser.forProperty(any(BeanProperty.class))).thenReturn(contextualized);

        TestProperty p = new TestProperty(new PropertyName("foo"), null, null, typeDeser, null,
                PropertyMetadata.STD_REQUIRED);

        assertTrue(p.hasValueTypeDeserializer());
        assertSame(contextualized, p.getValueTypeDeserializer());
        verify(typeDeser).forProperty(p);
    }

    @Test
    public void testConstructor_withoutTypeDeserializer() {
        TestProperty p = newBasicProperty("foo");
        assertFalse(p.hasValueTypeDeserializer());
        assertNull(p.getValueTypeDeserializer());
    }

    @Test
    public void testConstructor_defaultValueDeserializer_isMissing() {
        TestProperty p = newBasicProperty("foo");
        assertFalse(p.hasValueDeserializer());
        assertNull(p.getValueDeserializer());
    }

    @Test
    public void testConstructor_withBeanPropertyDefinition() {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getFullName()).thenReturn(new PropertyName("bar"));
        when(propDef.getWrapperName()).thenReturn(null);
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_OPTIONAL);

        TestProperty p = new TestProperty(propDef, null, null, null);
        assertEquals("bar", p.getName());
        assertNull(p.getWrapperName());
    }

    @Test
    public void testConstructor_ctor3_nonNullDeser() {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        TestProperty p = new TestProperty(new PropertyName("baz"), null, PropertyMetadata.STD_REQUIRED, deser);

        assertTrue(p.hasValueDeserializer());
        assertSame(deser, p.getValueDeserializer());
        assertSame(deser, p.getNullValueProvider());
        assertNull(p.getWrapperName());
    }

    @Test
    public void testConstructor_ctor3_nullDeser() {
        TestProperty p = new TestProperty(new PropertyName("baz"), null, PropertyMetadata.STD_REQUIRED, null);
        assertFalse(p.hasValueDeserializer());
        assertNull(p.getValueDeserializer());
        assertNull(p.getNullValueProvider());
    }

    @Test
    public void testCopyConstructor_copiesState() {
        TestProperty src = newBasicProperty("foo");
        src.setManagedReferenceName("ref");
        src.assignIndex(3);
        src.setViews(new Class<?>[] { String.class });

        TestProperty copy = new TestProperty(src);
        assertEquals(src.getFullName(), copy.getFullName());
        assertEquals("ref", copy.getManagedReferenceName());
        assertEquals(3, copy.getPropertyIndex());
        assertTrue(copy.hasViews());
    }

    @Test
    public void testCopyWithDeserializerChange_nullDeser_usesMissing() {
        TestProperty src = newBasicProperty("foo");
        TestProperty copy = new TestProperty(src, null, mock(NullValueProvider.class));
        assertFalse(copy.hasValueDeserializer());
    }

    @Test
    public void testCopyWithDeserializerChange_nonNullDeser() {
        TestProperty src = newBasicProperty("foo");
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        TestProperty copy = new TestProperty(src, deser, mock(NullValueProvider.class));
        assertTrue(copy.hasValueDeserializer());
        assertSame(deser, copy.getValueDeserializer());
    }

    @Test
    public void testCopyWithDeserializerChange_nullerEqualsMissing_fallsBack() {
        TestProperty src = newBasicProperty("foo");
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        // nuller == MISSING_VALUE_DESERIALIZER -> ควร fallback เป็น _valueDeserializer
        TestProperty copy = new TestProperty(src, deser, TestProperty.missingValueDeserializer());
        assertSame(deser, copy.getNullValueProvider());
    }

    @Test
    public void testCopyWithNewName() {
        TestProperty src = newBasicProperty("foo");
        PropertyName newName = new PropertyName("renamed");
        TestProperty copy = new TestProperty(src, newName);
        assertEquals("renamed", copy.getName());
        assertEquals(src.getType(), copy.getType());
    }

    // =====================================================================
    // withSimpleName
    // =====================================================================

    @Test
    public void testWithSimpleName_sameName_returnsThis() {
        // NOTE (assumption): PropertyName.withSimpleName() คาดว่าจะคืน instance เดิม
        // เมื่อชื่อไม่เปลี่ยน (ไม่มี source ของ PropertyName ให้ยืนยัน)
        TestProperty p = newBasicProperty("foo");
        SettableBeanProperty result = p.withSimpleName("foo");
        assertSame(p, result);
    }

    @Test
    public void testWithSimpleName_differentName_returnsNewInstance() {
        TestProperty p = newBasicProperty("foo");
        SettableBeanProperty result = p.withSimpleName("bar");
        assertNotSame(p, result);
        assertEquals("bar", result.getName());
    }

    // =====================================================================
    // setViews / visibleInView / hasViews
    // =====================================================================

    @Test
    public void testSetViews_null_resetsMatcher() {
        TestProperty p = newBasicProperty("foo");
        p.setViews(new Class<?>[] { String.class });
        assertTrue(p.hasViews());
        p.setViews(null);
        assertFalse(p.hasViews());
        assertTrue(p.visibleInView(Object.class));
    }

    @Test
    public void testVisibleInView_noMatcher_alwaysTrue() {
        TestProperty p = newBasicProperty("foo");
        assertFalse(p.hasViews());
        assertTrue(p.visibleInView(Object.class));
    }

    @Test
    public void testVisibleInView_withMatcher() {
        // NOTE (assumption): ViewMatcher.construct/isVisibleForView ใช้ตาม contract javadoc
        TestProperty p = newBasicProperty("foo");
        p.setViews(new Class<?>[] { ViewA.class });
        assertTrue(p.hasViews());
        assertTrue(p.visibleInView(ViewA.class));
        assertFalse(p.visibleInView(ViewB.class));
    }

    // =====================================================================
    // assignIndex
    // =====================================================================

    @Test
    public void testAssignIndex_firstTime_ok() {
        TestProperty p = newBasicProperty("foo");
        assertEquals(-1, p.getPropertyIndex());
        p.assignIndex(5);
        assertEquals(5, p.getPropertyIndex());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignIndex_secondTime_throws() {
        TestProperty p = newBasicProperty("foo");
        p.assignIndex(1);
        p.assignIndex(2);
    }

    // =====================================================================
    // getCreatorIndex / getInjectableValueId
    // =====================================================================

    @Test(expected = IllegalStateException.class)
    public void testGetCreatorIndex_throws() {
        newBasicProperty("foo").getCreatorIndex();
    }

    @Test
    public void testGetInjectableValueId_returnsNull() {
        assertNull(newBasicProperty("foo").getInjectableValueId());
    }

    // =====================================================================
    // fixAccess / markAsIgnorable / isIgnorable
    // =====================================================================

    @Test
    public void testFixAccess_defaultNoOp() {
        newBasicProperty("foo").fixAccess(null); // ไม่ควร throw
    }

    @Test
    public void testMarkAsIgnorable_and_isIgnorable_defaults() {
        TestProperty p = newBasicProperty("foo");
        assertFalse(p.isIgnorable());
        p.markAsIgnorable();
        assertFalse(p.isIgnorable()); // markAsIgnorable() เป็น no-op ใน base class
    }

    // =====================================================================
    // getContextAnnotation
    // =====================================================================

    @Test
    public void testGetContextAnnotation_delegatesToAnnotations() {
        Annotations ann = mock(Annotations.class);
        Deprecated expected = mock(Deprecated.class);
        when(ann.get(Deprecated.class)).thenReturn(expected);

        TestProperty p = new TestProperty(new PropertyName("foo"), null, (PropertyName) null, null, ann,
                PropertyMetadata.STD_REQUIRED);
        assertSame(expected, p.getContextAnnotation(Deprecated.class));
    }

    // =====================================================================
    // depositSchemaProperty (if/else isRequired)
    // =====================================================================

    private TestProperty requiredPropertyWith(final boolean required) {
        return new TestProperty(new PropertyName("foo"), null, (PropertyName) null, null, null,
                PropertyMetadata.STD_REQUIRED) {
            @Override
            public boolean isRequired() {
                return required;
            }
        };
    }

    @Test
    public void testDepositSchemaProperty_required_callsProperty() throws Exception {
        TestProperty p = requiredPropertyWith(true);
        JsonObjectFormatVisitor visitor = mock(JsonObjectFormatVisitor.class);
        p.depositSchemaProperty(visitor, null);
        verify(visitor).property(p);
        verify(visitor, never()).optionalProperty(any(BeanProperty.class));
    }

    @Test
    public void testDepositSchemaProperty_optional_callsOptionalProperty() throws Exception {
        TestProperty p = requiredPropertyWith(false);
        JsonObjectFormatVisitor visitor = mock(JsonObjectFormatVisitor.class);
        p.depositSchemaProperty(visitor, null);
        verify(visitor).optionalProperty(p);
        verify(visitor, never()).property(any(BeanProperty.class));
    }

    // =====================================================================
    // toString
    // =====================================================================

    @Test
    public void testToString() {
        assertEquals("[property 'foo']", newBasicProperty("foo").toString());
    }

    // =====================================================================
    // deserialize()
    // =====================================================================

    @Test
    public void testDeserialize_nullToken_returnsNullProviderValue() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        NullValueProvider nuller = mock(NullValueProvider.class);
        Object sentinel = new Object();
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        when(nuller.getNullValue(ctxt)).thenReturn(sentinel);

        TestProperty base = newBasicProperty("foo");
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> anyDeser = mock(JsonDeserializer.class);
        TestProperty prop = new TestProperty(base, anyDeser, nuller);

        assertSame(sentinel, prop.deserialize(p, ctxt));
    }

    @Test
    public void testDeserialize_withTypeDeserializer_delegatesToDeserializeWithType() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        TypeDeserializer contextualized = mock(TypeDeserializer.class);
        when(typeDeser.forProperty(any(BeanProperty.class))).thenReturn(contextualized);

        TestProperty base = new TestProperty(new PropertyName("foo"), null, null, typeDeser, null,
                PropertyMetadata.STD_REQUIRED);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object expected = new Object();
        when(deser.deserializeWithType(p, ctxt, contextualized)).thenReturn(expected);

        TestProperty prop = new TestProperty(base, deser, mock(NullValueProvider.class));

        assertSame(expected, prop.deserialize(p, ctxt));
        verify(deser).deserializeWithType(p, ctxt, contextualized);
    }

    @Test
    public void testDeserialize_normalValue_returnsDeserialized() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object expected = "value";
        when(deser.deserialize(p, ctxt)).thenReturn(expected);

        TestProperty base = newBasicProperty("foo");
        TestProperty prop = new TestProperty(base, deser, mock(NullValueProvider.class));

        assertSame(expected, prop.deserialize(p, ctxt));
    }

    @Test
    public void testDeserialize_deserializedNull_fallsBackToNullProvider() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(p, ctxt)).thenReturn(null);

        NullValueProvider nuller = mock(NullValueProvider.class);
        Object sentinel = new Object();
        when(nuller.getNullValue(ctxt)).thenReturn(sentinel);

        TestProperty base = newBasicProperty("foo");
        TestProperty prop = new TestProperty(base, deser, nuller);

        assertSame(sentinel, prop.deserialize(p, ctxt));
    }

    // =====================================================================
    // deserializeWith()
    // =====================================================================

    @Test
    public void testDeserializeWith_nullToken_skipper_returnsToUpdate() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);

        NullValueProvider skipper = NullsConstantProvider.skipper();
        TestProperty base = newBasicProperty("foo");
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> anyDeser = mock(JsonDeserializer.class);
        TestProperty prop = new TestProperty(base, anyDeser, skipper);

        Object toUpdate = new Object();
        assertSame(toUpdate, prop.deserializeWith(p, ctxt, toUpdate));
    }

    @Test
    public void testDeserializeWith_nullToken_notSkipper_returnsNullProviderValue() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);

        NullValueProvider nuller = mock(NullValueProvider.class);
        Object sentinel = new Object();
        when(nuller.getNullValue(ctxt)).thenReturn(sentinel);

        TestProperty base = newBasicProperty("foo");
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> anyDeser = mock(JsonDeserializer.class);
        TestProperty prop = new TestProperty(base, anyDeser, nuller);

        assertSame(sentinel, prop.deserializeWith(p, ctxt, new Object()));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWith_hasTypeDeserializer_reportsBadDefinition() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        doThrow(JsonMappingException.from(p, "bad definition"))
                .when(ctxt).reportBadDefinition(any(JavaType.class), anyString());

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.forProperty(any(BeanProperty.class))).thenReturn(typeDeser);

        TestProperty base = new TestProperty(new PropertyName("foo"), null, null, typeDeser, null,
                PropertyMetadata.STD_REQUIRED);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> anyDeser = mock(JsonDeserializer.class);
        TestProperty prop = new TestProperty(base, anyDeser, mock(NullValueProvider.class));

        prop.deserializeWith(p, ctxt, new Object());
    }

    @Test
    public void testDeserializeWith_normalValue_returnsDeserialized() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        Object toUpdate = new Object();
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object expected = "merged";
        when(deser.deserialize(p, ctxt, toUpdate)).thenReturn(expected);

        TestProperty base = newBasicProperty("foo");
        TestProperty prop = new TestProperty(base, deser, mock(NullValueProvider.class));

        assertSame(expected, prop.deserializeWith(p, ctxt, toUpdate));
    }

    @Test
    public void testDeserializeWith_deserializedNull_skipper_returnsToUpdate() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        Object toUpdate = new Object();
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(p, ctxt, toUpdate)).thenReturn(null);

        NullValueProvider skipper = NullsConstantProvider.skipper();
        TestProperty base = newBasicProperty("foo");
        TestProperty prop = new TestProperty(base, deser, skipper);

        assertSame(toUpdate, prop.deserializeWith(p, ctxt, toUpdate));
    }

    @Test
    public void testDeserializeWith_deserializedNull_notSkipper_returnsNullProviderValue() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        Object toUpdate = new Object();
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(p, ctxt, toUpdate)).thenReturn(null);

        NullValueProvider nuller = mock(NullValueProvider.class);
        Object sentinel = new Object();
        when(nuller.getNullValue(ctxt)).thenReturn(sentinel);

        TestProperty base = newBasicProperty("foo");
        TestProperty prop = new TestProperty(base, deser, nuller);

        assertSame(sentinel, prop.deserializeWith(p, ctxt, toUpdate));
    }

    // =====================================================================
    // _throwAsIOE
    // =====================================================================

    @Test
    public void testThrowAsIOE3_illegalArgument_withMessage_wrapsInJsonMappingException() {
        TestProperty p = newBasicProperty("foo");
        IllegalArgumentException cause = new IllegalArgumentException("bad value");
        try {
            p.callThrowAsIOE3(null, cause, "someValue");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Problem deserializing property 'foo'"));
            assertTrue(e.getMessage().contains("problem: bad value"));
            assertSame(cause, e.getCause());
        } catch (IOException e) {
            fail("Unexpected exception type: " + e);
        }
    }

    @Test
    public void testThrowAsIOE3_illegalArgument_withoutMessage() {
        TestProperty p = newBasicProperty("foo");
        IllegalArgumentException cause = new IllegalArgumentException();
        try {
            p.callThrowAsIOE3(null, cause, null);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("(no error message provided)"));
        } catch (IOException e) {
            fail("Unexpected exception type: " + e);
        }
    }

    @Test
    public void testThrowAsIOE3_nonIllegalArgument_delegatesToTwoArgVersion() {
        TestProperty p = newBasicProperty("foo");
        RuntimeException cause = new RuntimeException("rte");
        try {
            p.callThrowAsIOE3(null, cause, "x");
            fail("Expected RuntimeException to be rethrown");
        } catch (RuntimeException e) {
            assertSame(cause, e);
        } catch (IOException e) {
            fail("Unexpected exception type: " + e);
        }
    }

    @Test
    public void testThrowAsIOE2_runtimeException_rethrown() {
        TestProperty p = newBasicProperty("foo");
        RuntimeException cause = new RuntimeException("rte");
        try {
            p.callThrowAsIOE2(null, cause);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertSame(cause, e);
        } catch (IOException e) {
            fail("Unexpected exception type: " + e);
        }
    }

    @Test
    public void testThrowAsIOE2_ioException_rethrown() {
        TestProperty p = newBasicProperty("foo");
        IOException cause = new IOException("io issue");
        try {
            p.callThrowAsIOE2(null, cause);
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(cause, e);
        }
    }

    @Test
    public void testThrowAsIOE2_checkedException_wrappedInJsonMappingException() {
        TestProperty p = newBasicProperty("foo");
        Exception cause = new Exception("checked problem");
        try {
            p.callThrowAsIOE2(null, cause);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("checked problem"));
        } catch (IOException e) {
            fail("Unexpected exception type: " + e);
        }
    }

    // =====================================================================
    // Delegating
    // =====================================================================

    @Test
    public void testDelegating_getDelegate() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        assertSame(delegate, wrapper.getDelegate());
    }

    @Test
    public void testDelegating_withValueDeserializer_sameDeser_returnsThis() {
        TestProperty delegate = newBasicProperty("foo"); // _valueDeserializer == MISSING
        TestDelegating wrapper = new TestDelegating(delegate);
        SettableBeanProperty result = wrapper.withValueDeserializer(TestProperty.missingValueDeserializer());
        assertSame(wrapper, result);
    }

    @Test
    public void testDelegating_withValueDeserializer_differentDeser_returnsNewWrapper() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> newDeser = mock(JsonDeserializer.class);

        SettableBeanProperty result = wrapper.withValueDeserializer(newDeser);
        assertNotSame(wrapper, result);
        assertTrue(result instanceof TestDelegating);
        assertSame(newDeser, ((TestDelegating) result).getDelegate().getValueDeserializer());
    }

    @Test
    public void testDelegating_withName_sameName_returnsThis() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        SettableBeanProperty result = wrapper.withName(delegate.getFullName());
        assertSame(wrapper, result);
    }

    @Test
    public void testDelegating_withName_differentName_returnsNewWrapper() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        SettableBeanProperty result = wrapper.withName(new PropertyName("changed"));
        assertNotSame(wrapper, result);
        assertEquals("changed", result.getName());
    }

    @Test
    public void testDelegating_withNullProvider_sameProvider_returnsThis() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        SettableBeanProperty result = wrapper.withNullProvider(delegate.getNullValueProvider());
        assertSame(wrapper, result);
    }

    @Test
    public void testDelegating_withNullProvider_differentProvider_returnsNewWrapper() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        SettableBeanProperty result = wrapper.withNullProvider(mock(NullValueProvider.class));
        assertNotSame(wrapper, result);
    }

    @Test
    public void testDelegating_assignIndex_delegates() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        wrapper.assignIndex(7);
        assertEquals(7, delegate.getPropertyIndex());
        assertEquals(7, wrapper.getPropertyIndex());
    }

    @Test
    public void testDelegating_hasValueDeserializer_true() {
        TestProperty base = newBasicProperty("foo");
        TestProperty delegate = new TestProperty(base, mock(JsonDeserializer.class), mock(NullValueProvider.class));
        TestDelegating wrapper = new TestDelegating(delegate);
        assertTrue(wrapper.hasValueDeserializer());
    }

    @Test
    public void testDelegating_hasValueDeserializer_false() {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        assertFalse(wrapper.hasValueDeserializer());
    }

    @Test
    public void testDelegating_hasValueTypeDeserializer_true() {
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.forProperty(any(BeanProperty.class))).thenReturn(typeDeser);
        TestProperty delegate = new TestProperty(new PropertyName("foo"), null, null, typeDeser, null,
                PropertyMetadata.STD_REQUIRED);
        TestDelegating wrapper = new TestDelegating(delegate);
        assertTrue(wrapper.hasValueTypeDeserializer());
    }

    @Test
    public void testDelegating_hasValueTypeDeserializer_false() {
        TestDelegating wrapper = new TestDelegating(newBasicProperty("foo"));
        assertFalse(wrapper.hasValueTypeDeserializer());
    }

    @Test
    public void testDelegating_visibleInView_and_hasViews_delegate() {
        TestProperty delegate = newBasicProperty("foo");
        delegate.setViews(new Class<?>[] { ViewA.class });
        TestDelegating wrapper = new TestDelegating(delegate);
        assertTrue(wrapper.hasViews());
        assertTrue(wrapper.visibleInView(ViewA.class));
        assertFalse(wrapper.visibleInView(ViewB.class));
    }

    @Test
    public void testDelegating_getPropertyIndex_and_getCreatorIndex_delegate() {
        TestProperty delegate = newBasicProperty("foo");
        delegate.assignIndex(9);
        TestDelegating wrapper = new TestDelegating(delegate);
        assertEquals(9, wrapper.getPropertyIndex());
        try {
            wrapper.getCreatorIndex();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected - delegated ไปยัง delegate.getCreatorIndex()
        }
    }

    @Test
    public void testDelegating_getInjectableValueId_delegates() {
        TestDelegating wrapper = new TestDelegating(newBasicProperty("foo"));
        assertNull(wrapper.getInjectableValueId());
    }

    @Test
    public void testDelegating_getMember_and_getAnnotation_delegate() {
        TestDelegating wrapper = new TestDelegating(newBasicProperty("foo"));
        assertNull(wrapper.getMember());
        assertNull(wrapper.getAnnotation(Deprecated.class));
    }

    @Test
    public void testDelegating_set_and_setAndReturn_delegate() throws IOException {
        TestProperty delegate = newBasicProperty("foo");
        TestDelegating wrapper = new TestDelegating(delegate);
        wrapper.set(null, "val1");
        assertEquals("val1", delegate.lastSetValue);

        Object result = wrapper.setAndReturn(null, "val2");
        assertEquals("val2", result);
        assertEquals("val2", delegate.lastSetValue);
    }

    @Test
    public void testDelegating_deserializeAndSet_and_deserializeSetAndReturn_delegate() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(jp.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(jp, ctxt)).thenReturn("deserializedVal");

        TestProperty base = newBasicProperty("foo");
        TestProperty delegate = new TestProperty(base, deser, mock(NullValueProvider.class));
        TestDelegating wrapper = new TestDelegating(delegate);

        wrapper.deserializeAndSet(jp, ctxt, null);
        assertEquals("deserializedVal", delegate.lastSetValue);

        Object result = wrapper.deserializeSetAndReturn(jp, ctxt, null);
        assertEquals("deserializedVal", result);
    }
}
