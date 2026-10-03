package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SetterlessPropertyTest {

    private SetterlessProperty property;
    private BeanPropertyDefinition propDef;
    private JavaType type;
    private TypeDeserializer typeDeser;
    private Annotations contextAnnotations;
    private AnnotatedMethod annotatedMethod;
    private Method getterMethod;
    private JsonDeserializer<Object> deserializer;

    static class SamplePojo {
        private final Collection<String> items = new ArrayList<>();
        public Collection<String> getItems() { return items; }
        public Collection<String> getNullItems() { return null; }
        public Collection<String> throwException() { throw new RuntimeException("Getter failure"); }
    }

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() throws Exception {
        propDef = mock(BeanPropertyDefinition.class);
        type = mock(JavaType.class);
        typeDeser = mock(TypeDeserializer.class);
        contextAnnotations = mock(Annotations.class);
        annotatedMethod = mock(AnnotatedMethod.class);
        deserializer = mock(JsonDeserializer.class);

        getterMethod = SamplePojo.class.getMethod("getItems");
        when(annotatedMethod.getAnnotated()).thenReturn(getterMethod);
        when(propDef.getFullName()).thenReturn(PropertyName.construct("items"));

        property = new SetterlessProperty(propDef, type, null, contextAnnotations, annotatedMethod);
    }

    @Test
    public void testWithName() {
        SetterlessProperty newProp = (SetterlessProperty) property.withName(PropertyName.construct("newItems"));
        assertNotNull(newProp);
        assertEquals("newItems", newProp.getName());
    }

    @Test
    public void testWithValueDeserializerSame() {
        SetterlessProperty withDeser = (SetterlessProperty) property.withValueDeserializer(deserializer);
        SetterlessProperty sameDeser = (SetterlessProperty) withDeser.withValueDeserializer(deserializer);
        assertSame(withDeser, sameDeser);
    }

    @Test
    public void testWithValueDeserializerDifferent() {
        SetterlessProperty withDeser = (SetterlessProperty) property.withValueDeserializer(deserializer);
        assertNotNull(withDeser);
    }

    @Test
    public void testWithNullProvider() {
        NullValueProvider nullProvider = mock(NullValueProvider.class);
        SetterlessProperty newProp = (SetterlessProperty) property.withNullProvider(nullProvider);
        assertNotNull(newProp);
    }

    @Test
    public void testFixAccess() {
        DeserializationConfig config = mock(DeserializationConfig.class);
        when(config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)).thenReturn(true);
        property.fixAccess(config);
        verify(annotatedMethod).fixAccess(true);
    }

    @Test
    public void testGetAnnotationAndMember() {
        assertNull(property.getAnnotation(null));
        assertEquals(annotatedMethod, property.getMember());
    }

    @Test
    public void testDeserializeAndSetNullToken() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);

        property.deserializeAndSet(p, ctxt, new SamplePojo());
        verify(p, never(), g -> g.getCodec());
    }

    @Test(expected = IOException.class)
    public void testDeserializeAndWithTypeDeserializer() throws IOException {
        Method m = SamplePojo.class.getMethod("getItems");
        when(annotatedMethod.getAnnotated()).thenReturn(m);
        SetterlessProperty typedProperty = new SetterlessProperty(propDef, type, typeDeser, contextAnnotations, annotatedMethod);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        when(ctxt.reportBadDefinition(any(), anyString())).thenThrow(new IOException("Bad definition"));

        typedProperty.deserializeAndSet(p, ctxt, new SamplePojo());
    }

    @Test(expected = IOException.class)
    public void testDeserializeAndSetGetterException() throws IOException {
        Method m = SamplePojo.class.getMethod("throwException");
        when(annotatedMethod.getAnnotated()).thenReturn(m);
        SetterlessProperty exProperty = new SetterlessProperty(propDef, type, null, contextAnnotations, annotatedMethod);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);

        exProperty.deserializeAndSet(p, ctxt, new SamplePojo());
    }

    @Test(expected = IOException.class)
    public void testDeserializeAndSetGetterNullReturn() throws IOException {
        Method m = SamplePojo.class.getMethod("getNullItems");
        when(annotatedMethod.getAnnotated()).thenReturn(m);
        SetterlessProperty nullProp = new SetterlessProperty(propDef, type, null, contextAnnotations, annotatedMethod);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        when(ctxt.reportBadDefinition(any(), anyString())).thenThrow(new IOException("Null getter"));

        nullProp.deserializeAndSet(p, ctxt, new SamplePojo());
    }

    @Test
    public void testDeserializeAndSetSuccess() throws IOException {
        SetterlessProperty propWithDeser = (SetterlessProperty) property.withValueDeserializer(deserializer);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        SamplePojo pojo = new SamplePojo();

        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);

        propWithDeser.deserializeAndSet(p, ctxt, pojo);
        verify(deserializer).deserialize(eq(p), eq(ctxt), eq(pojo.getItems()));
    }

    @Test
    public void testDeserializeSetAndReturn() throws IOException {
        SetterlessProperty propWithDeser = (SetterlessProperty) property.withValueDeserializer(deserializer);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        SamplePojo pojo = new SamplePojo();

        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);

        Object result = propWithDeser.deserializeSetAndReturn(p, ctxt, pojo);
        assertSame(pojo, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetUnsupported() throws IOException {
        property.set(new SamplePojo(), "value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnUnsupported() throws IOException {
        property.setAndReturn(new SamplePojo(), "value");
    }
}