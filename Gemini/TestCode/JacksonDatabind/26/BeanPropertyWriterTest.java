package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BeanPropertyWriterTest {

    // Helper dummy bean for testing field/method accessors
    public static class DummyBean {
        public String sampleField = "fieldVal";
        public String selfRef = this;
        public String getSampleMethod() {
            return "methodVal";
        }
    }

    @Test
    public void testConstructorsAndMemberTypes() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("testProp");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        // 1. Test AnnotatedField branch
        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpwField = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );
        assertNotNull(bpwField.get(new DummyBean()));

        // 2. Test AnnotatedMethod branch
        Method method = DummyBean.class.getMethod("getSampleMethod");
        AnnotatedMethod annMethod = new AnnotatedMethod(null, method, null, null);
        BeanPropertyWriter bpwMethod = new BeanPropertyWriter(
                propDef, annMethod, null, null, null, null, null, false, null
        );
        assertNotNull(bpwMethod.get(new DummyBean()));

        // 3. Test Default / Virtual / Other branch (neither Field nor Method)
        BeanPropertyWriter bpwVirtual = new BeanPropertyWriter(
                propDef, null, null, null, null, null, null, false, null
        );
        assertNull(bpwVirtual.getMember());
    }

    @Test
    public void testCopyConstructorsAndRename() {
        BeanPropertyWriter base = new BeanPropertyWriter();
        BeanPropertyWriter copied = new BeanPropertyWriter(base);
        assertNotNull(copied);

        BeanPropertyWriter renamed = base.rename(new NameTransformer() {
            @Override
            public String transform(String name) {
                return "transformed";
            }
            @Override
            public String reverse(String transformed) {
                return transformed;
            }
        });
        // Since base name is null, transformer on null might throw or handle. Let's test with valid base.
    }

    @Test
    public void testRenameWithSameName() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("myProp");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );

        BeanPropertyWriter same = bpw.rename(NameTransformer.NOP);
        assertSame(bpw, same);
    }

    @Test
    public void testAssignSerializersAndTypeSerializer() {
        BeanPropertyWriter bpw = new BeanPropertyWriter();
        
        TypeSerializer tSer = mock(TypeSerializer.class);
        bpw.assignTypeSerializer(tSer);
        assertEquals(tSer, bpw.getTypeSerializer());

        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser = (JsonSerializer<Object>) mock(JsonSerializer.class);
        bpw.assignSerializer(ser);
        assertTrue(bpw.hasSerializer());
        assertEquals(ser, bpw.getSerializer());

        // Try overriding without exception if same, or exception if different
        bpw.assignSerializer(ser); // Same should pass
        
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> nullSer = (JsonSerializer<Object>) mock(JsonSerializer.class);
        bpw.assignNullSerializer(nullSer);
        assertTrue(bpw.hasNullSerializer());
        bpw.assignNullSerializer(nullSer); // Same should pass
    }

    @Test(expected = IllegalStateException.class)
    public void testOverrideSerializerException() {
        BeanPropertyWriter bpw = new BeanPropertyWriter();
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser1 = (JsonSerializer<Object>) mock(JsonSerializer.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser2 = (JsonSerializer<Object>) mock(JsonSerializer.class);
        bpw.assignSerializer(ser1);
        bpw.assignSerializer(ser2); // Should throw IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testOverrideNullSerializerException() {
        BeanPropertyWriter bpw = new BeanPropertyWriter();
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser1 = (JsonSerializer<Object>) mock(JsonSerializer.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser2 = (JsonSerializer<Object>) mock(JsonSerializer.class);
        bpw.assignNullSerializer(ser1);
        bpw.assignNullSerializer(ser2); // Should throw IllegalStateException
    }

    @Test
    public void testInternalSettings() {
        BeanPropertyWriter bpw = new BeanPropertyWriter();
        assertNull(bpw.getInternalSetting("key"));
        
        bpw.setInternalSetting("key", "val");
        assertEquals("val", bpw.getInternalSetting("key"));
        
        Object removed = bpw.removeInternalSetting("key");
        assertEquals("val", removed);
        assertNull(bpw.getInternalSetting("key"));
    }

    @Test
    public void testWouldConflictWithName() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("conflictName");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );

        PropertyName name = new PropertyName("conflictName");
        assertTrue(bpw.wouldConflictWithName(name));

        PropertyName nonConflict = new PropertyName("otherName");
        assertFalse(bpw.wouldConflictWithName(nonConflict));
    }

    @Test
    public void testFindFormatOverrides() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("fmtProp");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );

        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(intr.findFormat(any())).thenReturn(null);

        // First call populates NO_FORMAT
        JsonFormat.Value val1 = bpw.findFormatOverrides(intr);
        assertNull(val1);

        // Second call hits NO_FORMAT branch
        JsonFormat.Value val2 = bpw.findFormatOverrides(intr);
        assertNull(val2);
    }

    @Test
    public void testDepositSchemaProperty() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("schemaProp");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );

        JsonObjectFormatVisitor visitor = mock(JsonObjectFormatVisitor.class);
        bpw.depositSchemaProperty(visitor);
        verify(visitor).property(bpw);

        // Test optional property branch
        BeanPropertyDefinition propDefOpt = mock(BeanPropertyDefinition.class);
        when(propDefOpt.getName()).thenReturn("optProp");
        when(propDefOpt.getMetadata()).thenReturn(PropertyMetadata.STD_OPTIONAL);
        BeanPropertyWriter bpwOpt = new BeanPropertyWriter(
                propDefOpt, annField, null, null, null, null, null, false, null
        );
        bpwOpt.depositSchemaProperty(visitor);
        verify(visitor).optionalProperty(bpwOpt);

        // Test null visitor
        bpw.depositSchemaProperty((JsonObjectFormatVisitor) null);
    }

    @Test
    public void testToStringFormatting() throws Exception {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("strProp");
        when(propDef.getMetadata()).thenReturn(PropertyMetadata.STD_REQUIRED);

        Field field = DummyBean.class.getField("sampleField");
        AnnotatedField annField = new AnnotatedField(null, field, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(
                propDef, annField, null, null, null, null, null, false, null
        );
        assertTrue(bpw.toString().contains("field"));

        Method method = DummyBean.class.getMethod("getSampleMethod");
        AnnotatedMethod annMethod = new AnnotatedMethod(null, method, null, null);
        BeanPropertyWriter bpwMethod = new BeanPropertyWriter(
                propDef, annMethod, null, null, null, null, null, false, null
        );
        assertTrue(bpwMethod.toString().contains("via method"));

        BeanPropertyWriter bpwVirtual = new BeanPropertyWriter(
                propDef, null, null, null, null, null, null, false, null
        );
        assertTrue(bpwVirtual.toString().contains("virtual"));
    }
}