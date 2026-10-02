package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest
{
    // ---------------------------------------------------------------
    // Fixtures
    // ---------------------------------------------------------------

    public static class SampleBean {
        public String value = "hello";
        public String getValue() { return value; }
    }

    public static class SelfRefBean {
        public Object self;
    }

    @SuppressWarnings("unchecked")
    private JsonSerializer<Object> anySer() {
        return mock(JsonSerializer.class);
    }

    /** field-based writer, cfgSerializationType always null (covers getRawSerializationType()==null branch) */
    private BeanPropertyWriter buildFieldWriter(JsonSerializer<Object> ser, TypeSerializer typeSer,
            boolean suppressNulls, Object suppressableValue, boolean required) throws Exception {
        Field f = SampleBean.class.getField("value");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);

        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("value");
        when(propDef.isRequired()).thenReturn(required);

        Annotations ctxAnn = mock(Annotations.class);
        JavaType declaredType = mock(JavaType.class);

        return new BeanPropertyWriter(propDef, af, ctxAnn, declaredType,
                ser, typeSer, null /* serType */, suppressNulls, suppressableValue);
    }

    /** method-based writer */
    private BeanPropertyWriter buildMethodWriter(JsonSerializer<Object> ser, TypeSerializer typeSer,
            boolean suppressNulls, Object suppressableValue, boolean required) throws Exception {
        Method m = SampleBean.class.getMethod("getValue");
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getMember()).thenReturn(m);

        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("value");
        when(propDef.isRequired()).thenReturn(required);

        Annotations ctxAnn = mock(Annotations.class);
        JavaType declaredType = mock(JavaType.class);

        return new BeanPropertyWriter(propDef, am, ctxAnn, declaredType,
                ser, typeSer, null, suppressNulls, suppressableValue);
    }

    private BeanPropertyWriter buildSelfRefWriter(JsonSerializer<Object> ser) throws Exception {
        Field f = SelfRefBean.class.getField("self");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("self");
        Annotations ctxAnn = mock(Annotations.class);
        JavaType type = mock(JavaType.class);
        return new BeanPropertyWriter(propDef, af, ctxAnn, type, ser, null, null, false, null);
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_fieldMember_setsFieldPath() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(null, null, false, null, false);
        assertEquals(String.class, w.getPropertyType());
        assertFalse(w.hasSerializer());
    }

    @Test
    public void testConstructor_methodMember_setsMethodPath() throws Exception {
        BeanPropertyWriter w = buildMethodWriter(anySer(), null, false, null, true);
        assertEquals(String.class, w.getPropertyType());
        assertTrue(w.hasSerializer());
        assertTrue(w.isRequired());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidMemberType_throws() throws Exception {
        AnnotatedMember badMember = mock(AnnotatedMember.class); // NOT AnnotatedField nor AnnotatedMethod
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("x");
        Annotations ctxAnn = mock(Annotations.class);
        JavaType type = mock(JavaType.class);
        new BeanPropertyWriter(propDef, badMember, ctxAnn, type, null, null, type, false, null);
    }

    @Test
    public void testConstructor_emptyPropertyName_isAllowed() throws Exception {
        Field f = SampleBean.class.getField("value");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn(""); // empty/boundary name
        Annotations ctxAnn = mock(Annotations.class);
        JavaType type = mock(JavaType.class);
        BeanPropertyWriter w = new BeanPropertyWriter(propDef, af, ctxAnn, type, null, null, null, false, null);
        assertEquals("", w.getName());
    }

    // ---------------------------------------------------------------
    // rename()
    // ---------------------------------------------------------------

    @Test
    public void testRename_sameName_returnsSameInstance() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        NameTransformer transformer = mock(NameTransformer.class);
        when(transformer.transform("value")).thenReturn("value");
        BeanPropertyWriter w2 = w.rename(transformer);
        assertSame(w, w2);
    }

    @Test
    public void testRename_differentName_returnsNewInstance() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        NameTransformer transformer = mock(NameTransformer.class);
        when(transformer.transform("value")).thenReturn("renamed");
        BeanPropertyWriter w2 = w.rename(transformer);
        assertNotSame(w, w2);
        assertEquals("renamed", w2.getName());
        assertEquals("value", w.getName());
    }

    @Test
    public void testRename_copiesInternalSettings_deepCopy() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.setInternalSetting("k", "v");
        NameTransformer transformer = mock(NameTransformer.class);
        when(transformer.transform("value")).thenReturn("renamed");
        BeanPropertyWriter w2 = w.rename(transformer);
        assertEquals("v", w2.getInternalSetting("k"));
        w2.setInternalSetting("k", "v2");
        assertEquals("v", w.getInternalSetting("k")); // original untouched -> deep copy verified
    }

    // ---------------------------------------------------------------
    // assignSerializer()
    // ---------------------------------------------------------------

    @Test
    public void testAssignSerializer_whenNull_setsSuccessfully() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(null, null, false, null, false);
        JsonSerializer<Object> ser = anySer();
        w.assignSerializer(ser);
        assertTrue(w.hasSerializer());
        assertSame(ser, w.getSerializer());
    }

    @Test
    public void testAssignSerializer_sameInstanceAgain_noThrow() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, null, false);
        w.assignSerializer(ser); // same reference -> allowed
        assertSame(ser, w.getSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignSerializer_differentInstance_throws() throws Exception {
        JsonSerializer<Object> ser1 = anySer();
        JsonSerializer<Object> ser2 = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser1, null, false, null, false);
        w.assignSerializer(ser2);
    }

    // ---------------------------------------------------------------
    // assignNullSerializer()
    // ---------------------------------------------------------------

    @Test
    public void testAssignNullSerializer_whenNull_setsSuccessfully() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        JsonSerializer<Object> nullSer = anySer();
        w.assignNullSerializer(nullSer);
        assertTrue(w.hasNullSerializer());
    }

    @Test
    public void testAssignNullSerializer_sameInstanceAgain_noThrow() throws Exception {
        JsonSerializer<Object> nullSer = anySer();
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.assignNullSerializer(nullSer);
        w.assignNullSerializer(nullSer);
        assertTrue(w.hasNullSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignNullSerializer_differentInstance_throws() throws Exception {
        JsonSerializer<Object> nullSer1 = anySer();
        JsonSerializer<Object> nullSer2 = anySer();
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.assignNullSerializer(nullSer1);
        w.assignNullSerializer(nullSer2);
    }

    // ---------------------------------------------------------------
    // depositSchemaProperty(JsonObjectFormatVisitor)
    // ---------------------------------------------------------------

    @Test
    public void testDepositSchemaProperty_nullVisitor_doesNothing() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, true);
        w.depositSchemaProperty((JsonObjectFormatVisitor) null); // must not throw
    }

    @Test
    public void testDepositSchemaProperty_required_callsProperty() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, true);
        JsonObjectFormatVisitor visitor = mock(JsonObjectFormatVisitor.class);
        w.depositSchemaProperty(visitor);
        verify(visitor).property(w);
        verify(visitor, never()).optionalProperty(any(BeanProperty.class));
    }

    @Test
    public void testDepositSchemaProperty_notRequired_callsOptionalProperty() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        JsonObjectFormatVisitor visitor = mock(JsonObjectFormatVisitor.class);
        w.depositSchemaProperty(visitor);
        verify(visitor).optionalProperty(w);
        verify(visitor, never()).property(any(BeanProperty.class));
    }

    // ---------------------------------------------------------------
    // Internal settings
    // ---------------------------------------------------------------

    @Test
    public void testInternalSetting_getWhenEmpty_returnsNull() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertNull(w.getInternalSetting("key"));
    }

    @Test
    public void testInternalSetting_setAndOverwrite() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertNull(w.setInternalSetting("k1", "v1"));
        assertEquals("v1", w.getInternalSetting("k1"));
        assertEquals("v1", w.setInternalSetting("k1", "v2"));
        assertEquals("v2", w.getInternalSetting("k1"));
    }

    @Test
    public void testInternalSetting_removeWhenEmpty_returnsNull() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertNull(w.removeInternalSetting("nope"));
    }

    @Test
    public void testInternalSetting_removeLastEntry_mapDroppedThenRecreated() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.setInternalSetting("k1", "v1");
        assertEquals("v1", w.removeInternalSetting("k1"));
        assertNull(w.getInternalSetting("k1"));
        w.setInternalSetting("k2", "v2"); // must still work after map dropped
        assertEquals("v2", w.getInternalSetting("k2"));
    }

    @Test
    public void testInternalSetting_removeOneOfMultiple_keepsOthers() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.setInternalSetting("k1", "v1");
        w.setInternalSetting("k2", "v2");
        assertEquals("v1", w.removeInternalSetting("k1"));
        assertEquals("v2", w.getInternalSetting("k2"));
    }

    @Test
    public void testInternalSetting_nullKeyAndValue_edgeCase() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.setInternalSetting(null, null);
        assertNull(w.getInternalSetting(null));
        assertNull(w.removeInternalSetting(null));
    }

    // ---------------------------------------------------------------
    // Accessors
    // ---------------------------------------------------------------

    @Test
    public void testAccessors_withNonNullCfgSerializationType() throws Exception {
        JsonSerializer<Object> ser = anySer();
        JavaType cfgType = mock(JavaType.class);
        doReturn(String.class).when(cfgType).getRawClass();

        Field f = SampleBean.class.getField("value");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);

        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("value");
        when(propDef.isRequired()).thenReturn(true);
        Class<?>[] views = new Class<?>[] { Object.class };
        when(propDef.findViews()).thenReturn(views);
        PropertyName wrapperName = mock(PropertyName.class);
        when(propDef.getWrapperName()).thenReturn(wrapperName);

        Annotations ctxAnn = mock(Annotations.class);
        JavaType declaredType = mock(JavaType.class);

        BeanPropertyWriter w = new BeanPropertyWriter(propDef, af, ctxAnn, declaredType,
                ser, null, cfgType, true, null);

        assertEquals("value", w.getName());
        assertSame(declaredType, w.getType());
        assertSame(wrapperName, w.getWrapperName());
        assertTrue(w.isRequired());
        assertTrue(w.hasSerializer());
        assertFalse(w.hasNullSerializer());
        assertTrue(w.willSuppressNulls());
        assertSame(ser, w.getSerializer());
        assertSame(cfgType, w.getSerializationType());
        assertEquals(String.class, w.getRawSerializationType());
        assertArrayEquals(views, w.getViews());
        assertEquals("value", w.getSerializedName().getValue());
    }

    @Test
    public void testGetRawSerializationType_nullCfgType_returnsNull() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertNull(w.getRawSerializationType());
    }

    @Test
    public void testGetViews_nullByDefault() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertNull(w.getViews());
    }

    @Test
    public void testGetPropertyType_and_GenericType_fieldPath() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        assertEquals(String.class, w.getPropertyType());
        assertEquals(String.class, w.getGenericPropertyType());
    }

    @Test
    public void testGetPropertyType_and_GenericType_methodPath() throws Exception {
        BeanPropertyWriter w = buildMethodWriter(anySer(), null, false, null, false);
        assertEquals(String.class, w.getPropertyType());
        assertEquals(String.class, w.getGenericPropertyType());
    }

    @Test
    public void testGetAnnotation_delegatesToMember() throws Exception {
        Deprecated ann = mock(Deprecated.class);
        Field f = SampleBean.class.getField("value");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);
        when(af.getAnnotation(Deprecated.class)).thenReturn(ann);
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("value");
        Annotations ctxAnn = mock(Annotations.class);
        JavaType type = mock(JavaType.class);
        BeanPropertyWriter w = new BeanPropertyWriter(propDef, af, ctxAnn, type, null, null, null, false, null);
        assertSame(ann, w.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetContextAnnotation_delegatesToContextAnnotations() throws Exception {
        Deprecated ann = mock(Deprecated.class);
        Annotations ctxAnn = mock(Annotations.class);
        when(ctxAnn.get(Deprecated.class)).thenReturn(ann);
        Field f = SampleBean.class.getField("value");
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(f);
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("value");
        JavaType type = mock(JavaType.class);
        BeanPropertyWriter w = new BeanPropertyWriter(propDef, af, ctxAnn, type, null, null, null, false, null);
        assertSame(ann, w.getContextAnnotation(Deprecated.class));
    }

    // ---------------------------------------------------------------
    // get(bean)
    // ---------------------------------------------------------------

    @Test
    public void testGet_fieldAccess() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "abc";
        assertEquals("abc", w.get(bean));
    }

    @Test
    public void testGet_methodAccess() throws Exception {
        BeanPropertyWriter w = buildMethodWriter(anySer(), null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "xyz";
        assertEquals("xyz", w.get(bean));
    }

    // ---------------------------------------------------------------
    // serializeAsField
    // ---------------------------------------------------------------

    @Test
    public void testSerializeAsField_nullValue_withNullSerializer() throws Exception {
        JsonSerializer<Object> nullSer = anySer();
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.assignNullSerializer(nullSer);
        SampleBean bean = new SampleBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen).writeFieldName(any(SerializedString.class));
        verify(nullSer).serialize(null, gen, prov);
    }

    @Test
    public void testSerializeAsField_nullValue_noNullSerializer_writesNothing() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen, never()).writeFieldName(any(SerializedString.class));
    }

    @Test
    public void testSerializeAsField_suppressMarkerEmpty_true_skips() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.isEmpty("val")).thenReturn(true);
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, BeanPropertyWriter.MARKER_FOR_EMPTY, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen, never()).writeFieldName(any(SerializedString.class));
    }

    @Test
    public void testSerializeAsField_suppressMarkerEmpty_false_writes() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.isEmpty("val")).thenReturn(false);
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, BeanPropertyWriter.MARKER_FOR_EMPTY, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen).writeFieldName(any(SerializedString.class));
        verify(ser).serialize("val", gen, prov);
    }

    @Test
    public void testSerializeAsField_suppressablePlain_equals_skips() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, "val", false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen, never()).writeFieldName(any(SerializedString.class));
    }

    @Test
    public void testSerializeAsField_suppressablePlain_notEquals_writes() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, "other", false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(gen).writeFieldName(any(SerializedString.class));
        verify(ser).serialize("val", gen, prov);
    }

    @Test
    public void testSerializeAsField_noSuppressableValue_writesDirectly() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize("val", gen, prov);
    }

    @Test
    public void testSerializeAsField_selfReference_usesObjectId_true_noThrow() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.usesObjectId()).thenReturn(true);
        BeanPropertyWriter w = buildSelfRefWriter(ser);
        SelfRefBean bean = new SelfRefBean();
        bean.self = bean;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize(bean, gen, prov);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeAsField_selfReference_usesObjectId_false_throws() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.usesObjectId()).thenReturn(false);
        BeanPropertyWriter w = buildSelfRefWriter(ser);
        SelfRefBean bean = new SelfRefBean();
        bean.self = bean;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
    }

    @Test
    public void testSerializeAsField_withTypeSerializer_callsSerializeWithType() throws Exception {
        JsonSerializer<Object> ser = anySer();
        TypeSerializer typeSer = mock(TypeSerializer.class);
        BeanPropertyWriter w = buildFieldWriter(ser, typeSer, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsField(bean, gen, prov);
        verify(ser).serializeWithType("val", gen, prov, typeSer);
        verify(ser, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    // ---------------------------------------------------------------
    // serializeAsColumn
    // ---------------------------------------------------------------

    @Test
    public void testSerializeAsColumn_nullValue_noNullSerializer_writesNullOnly() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(gen).writeNull();
        // Targets known defect: missing 'return' after null-handling in serializeAsColumn
        // (unlike serializeAsField). Correct behavior expects NO further serialize() call.
        verify(ser, never()).serialize(any(), eq(gen), eq(prov));
    }

    @Test
    public void testSerializeAsColumn_nullValue_withNullSerializer_usesNullSerializerOnly() throws Exception {
        JsonSerializer<Object> ser = anySer();
        JsonSerializer<Object> nullSer = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, null, false);
        w.assignNullSerializer(nullSer);
        SampleBean bean = new SampleBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(nullSer).serialize(null, gen, prov);
        verify(gen, never()).writeNull();
        // Same missing-return concern as above.
        verify(ser, never()).serialize(any(), eq(gen), eq(prov));
    }

    @Test
    public void testSerializeAsColumn_nonNullValue_writesDirectly() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(ser).serialize("val", gen, prov);
    }

    @Test
    public void testSerializeAsColumn_suppressMarkerEmpty_true_writesPlaceholder() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.isEmpty("val")).thenReturn(true);
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, BeanPropertyWriter.MARKER_FOR_EMPTY, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(gen).writeNull();
        verify(ser, never()).serialize(eq("val"), eq(gen), eq(prov));
    }

    @Test
    public void testSerializeAsColumn_suppressMarkerEmpty_false_writesValue() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.isEmpty("val")).thenReturn(false);
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, BeanPropertyWriter.MARKER_FOR_EMPTY, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(ser).serialize("val", gen, prov);
    }

    @Test
    public void testSerializeAsColumn_suppressablePlain_equals_writesPlaceholder() throws Exception {
        JsonSerializer<Object> ser = anySer();
        BeanPropertyWriter w = buildFieldWriter(ser, null, false, "val", false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(gen).writeNull();
        verify(ser, never()).serialize(eq("val"), eq(gen), eq(prov));
    }

    @Test
    public void testSerializeAsColumn_withTypeSerializer_callsSerializeWithType() throws Exception {
        JsonSerializer<Object> ser = anySer();
        TypeSerializer typeSer = mock(TypeSerializer.class);
        BeanPropertyWriter w = buildFieldWriter(ser, typeSer, false, null, false);
        SampleBean bean = new SampleBean();
        bean.value = "val";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
        verify(ser).serializeWithType("val", gen, prov, typeSer);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeAsColumn_selfReference_usesObjectId_false_throws() throws Exception {
        JsonSerializer<Object> ser = anySer();
        when(ser.usesObjectId()).thenReturn(false);
        BeanPropertyWriter w = buildSelfRefWriter(ser);
        SelfRefBean bean = new SelfRefBean();
        bean.self = bean;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsColumn(bean, gen, prov);
    }

    // ---------------------------------------------------------------
    // serializeAsPlaceholder
    // ---------------------------------------------------------------

    @Test
    public void testSerializeAsPlaceholder_withNullSerializer() throws Exception {
        JsonSerializer<Object> nullSer = anySer();
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        w.assignNullSerializer(nullSer);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsPlaceholder(new SampleBean(), gen, prov);
        verify(nullSer).serialize(null, gen, prov);
        verify(gen, never()).writeNull();
    }

    @Test
    public void testSerializeAsPlaceholder_withoutNullSerializer() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        w.serializeAsPlaceholder(new SampleBean(), gen, prov);
        verify(gen).writeNull();
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_fieldPath_noSerializer() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(null, null, false, null, false);
        String s = w.toString();
        assertTrue(s.contains("field"));
        assertTrue(s.contains("no static serializer"));
    }

    @Test
    public void testToString_methodPath_withSerializer() throws Exception {
        BeanPropertyWriter w = buildMethodWriter(anySer(), null, false, null, false);
        String s = w.toString();
        assertTrue(s.contains("via method"));
        assertTrue(s.contains("static serializer of type"));
    }

    // ---------------------------------------------------------------
    // Other public API (smoke tests)
    // ---------------------------------------------------------------

    @Test
    public void testSetNonTrivialBaseType_doesNotThrow() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        JavaType t = mock(JavaType.class);
        w.setNonTrivialBaseType(t); // no public getter to assert internal state directly
    }

    @Test
    public void testUnwrappingWriter_returnsNonNullWithSameName() throws Exception {
        BeanPropertyWriter w = buildFieldWriter(anySer(), null, false, null, false);
        NameTransformer nt = mock(NameTransformer.class);
        BeanPropertyWriter unwrapped = w.unwrappingWriter(nt);
        assertNotNull(unwrapped);
        assertEquals(w.getName(), unwrapped.getName());
    }
}
