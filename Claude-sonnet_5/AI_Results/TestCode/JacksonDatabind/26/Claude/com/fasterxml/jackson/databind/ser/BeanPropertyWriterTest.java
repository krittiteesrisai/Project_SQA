package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {

    // ---- ทดสอบ helper bean ----
    static class SelfRefBean {
        public Object value;
        public Object getValue() { return value; }
    }

    private static Field VALUE_FIELD;
    private static Method VALUE_METHOD;

    @Before
    public void setUp() throws Exception {
        VALUE_FIELD = SelfRefBean.class.getField("value");
        VALUE_METHOD = SelfRefBean.class.getMethod("getValue");
    }

    // ---------------- reflection helpers ----------------

    private static void setField(BeanPropertyWriter w, String name, Object value) throws Exception {
        Field f = BeanPropertyWriter.class.getDeclaredField(name);
        f.setAccessible(true);
        f.set(w, value);
    }

    @SuppressWarnings("unchecked")
    private static <T> T getField(BeanPropertyWriter w, String name) throws Exception {
        Field f = BeanPropertyWriter.class.getDeclaredField(name);
        f.setAccessible(true);
        return (T) f.get(w);
    }

    /** สร้าง bare writer (fields ทั้งหมด null/false) แล้วตั้ง _name ให้พร้อมใช้งาน */
    private BeanPropertyWriter bareWriter() throws Exception {
        BeanPropertyWriter w = new BeanPropertyWriter(); // protected ctor, accessible: same package
        setField(w, "_name", new SerializedString("prop"));
        return w;
    }

    private BeanPropertyWriter buildViaPrimaryCtor(AnnotatedMember member, JsonSerializer<?> ser,
            PropertyName wrapperName, PropertyMetadata metadata, Class<?>[] views,
            boolean suppressNulls, Object suppressableValue) {
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("prop");
        when(propDef.getWrapperName()).thenReturn(wrapperName);
        when(propDef.getMetadata()).thenReturn(metadata);
        when(propDef.findViews()).thenReturn(views);
        Annotations ctxAnn = mock(Annotations.class);
        JavaType declaredType = mock(JavaType.class);
        JavaType serType = mock(JavaType.class);
        return new BeanPropertyWriter(propDef, member, ctxAnn, declaredType,
                ser, null, serType, suppressNulls, suppressableValue);
    }

    // ==================================================================
    // Constructor: primary constructor branches (instanceof member type)
    // ==================================================================

    @Test
    public void testPrimaryCtor_AnnotatedField_setsFieldNotAccessor() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter w = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        assertEquals(VALUE_FIELD, getField(w, "_field"));
        assertNull(getField(w, "_accessorMethod"));
        assertFalse(w.hasSerializer());
    }

    @Test
    public void testPrimaryCtor_AnnotatedMethod_setsAccessorNotField() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getMember()).thenReturn(VALUE_METHOD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        BeanPropertyWriter w = buildViaPrimaryCtor(am, ser, null,
                PropertyMetadata.STD_REQUIRED, null, false, null);
        assertEquals(VALUE_METHOD, getField(w, "_accessorMethod"));
        assertNull(getField(w, "_field"));
        assertTrue(w.hasSerializer());
    }

    @Test
    public void testPrimaryCtor_VirtualMember_bothNull() throws Exception {
        AnnotatedMember plain = mock(AnnotatedMember.class); // ไม่ใช่ AnnotatedField/Method
        BeanPropertyWriter w = buildViaPrimaryCtor(plain, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        assertNull(getField(w, "_accessorMethod"));
        assertNull(getField(w, "_field"));
    }

    @Test
    public void testPrimaryCtor_serializerNull_dynamicMapNotNull() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter w = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        assertNotNull(getField(w, "_dynamicSerializers"));
        assertFalse(w.hasSerializer());
    }

    @Test
    public void testPrimaryCtor_serializerNonNull_dynamicMapNull() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        BeanPropertyWriter w = buildViaPrimaryCtor(af, ser, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        assertNull(getField(w, "_dynamicSerializers"));
        assertTrue(w.hasSerializer());
    }

    // ==================================================================
    // No-arg (protected) constructor
    // ==================================================================

    @Test
    public void testNoArgConstructor_defaults() throws Exception {
        BeanPropertyWriter w = new BeanPropertyWriter();
        assertFalse(w.hasSerializer());
        assertFalse(w.hasNullSerializer());
        assertFalse(w.willSuppressNulls());
        assertNull(w.getMember());
        assertNull(w.getViews());
        assertNull(w.getInternalSetting("x"));
    }

    // ==================================================================
    // Copy constructors
    // ==================================================================

    @Test
    public void testCopyConstructor_copiesFieldsAndIndependentInternalSettings() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        BeanPropertyWriter base = buildViaPrimaryCtor(af, ser, null,
                PropertyMetadata.STD_REQUIRED, null, true, "def");
        base.setInternalSetting("k", "v1");

        BeanPropertyWriter copy = new BeanPropertyWriter(base);
        assertEquals(base.getName(), copy.getName());
        assertTrue(copy.hasSerializer());
        assertTrue(copy.willSuppressNulls());
        assertEquals("v1", copy.getInternalSetting("k"));

        // independence of internal settings map
        base.setInternalSetting("k", "v2");
        assertEquals("v1", copy.getInternalSetting("k"));
    }

    @Test
    public void testCopyConstructorWithPropertyName_changesName() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter base = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        BeanPropertyWriter renamed = new BeanPropertyWriter(base, new PropertyName("newName"));
        assertEquals("newName", renamed.getName());
        assertEquals(base.willSuppressNulls(), renamed.willSuppressNulls());
    }

    @Test
    public void testCopyConstructorWithSerializedString_directName() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter base = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        BeanPropertyWriter renamed = new BeanPropertyWriter(base, new SerializedString("zzz"));
        assertEquals("zzz", renamed.getName());
    }

    // ==================================================================
    // rename()
    // ==================================================================

    @Test
    public void testRename_sameName_returnsSameInstance() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter base = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null); // name = "prop"
        NameTransformer identity = mock(NameTransformer.class);
        when(identity.transform("prop")).thenReturn("prop");
        BeanPropertyWriter result = base.rename(identity);
        assertSame(base, result);
    }

    @Test
    public void testRename_differentName_returnsNewInstance() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter base = buildViaPrimaryCtor(af, null, null,
                PropertyMetadata.STD_OPTIONAL, null, false, null);
        NameTransformer transformer = mock(NameTransformer.class);
        when(transformer.transform("prop")).thenReturn("renamed");
        BeanPropertyWriter result = base.rename(transformer);
        assertNotSame(base, result);
        assertEquals("renamed", result.getName());
    }

    // ==================================================================
    // assignTypeSerializer / assignSerializer / assignNullSerializer
    // ==================================================================

    @Test
    public void testAssignTypeSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        TypeSerializer ts = mock(TypeSerializer.class);
        w.assignTypeSerializer(ts);
        assertSame(ts, w.getTypeSerializer());
    }

    @Test
    public void testAssignSerializer_firstTime_ok() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        w.assignSerializer(ser);
        assertTrue(w.hasSerializer());
    }

    @Test
    public void testAssignSerializer_sameReferenceAgain_ok() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        w.assignSerializer(ser);
        w.assignSerializer(ser); // same ref -> no exception
        assertTrue(w.hasSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignSerializer_differentReference_throws() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> serA = mock(JsonSerializer.class);
        JsonSerializer<Object> serB = mock(JsonSerializer.class);
        w.assignSerializer(serA);
        w.assignSerializer(serB);
    }

    @Test
    public void testAssignNullSerializer_firstTime_ok() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> ns = mock(JsonSerializer.class);
        w.assignNullSerializer(ns);
        assertTrue(w.hasNullSerializer());
    }

    @Test
    public void testAssignNullSerializer_sameReferenceAgain_ok() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> ns = mock(JsonSerializer.class);
        w.assignNullSerializer(ns);
        w.assignNullSerializer(ns);
        assertTrue(w.hasNullSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignNullSerializer_differentReference_throws() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> a = mock(JsonSerializer.class);
        JsonSerializer<Object> b = mock(JsonSerializer.class);
        w.assignNullSerializer(a);
        w.assignNullSerializer(b);
    }

    // ==================================================================
    // unwrappingWriter / setNonTrivialBaseType
    // ==================================================================

    @Test
    public void testUnwrappingWriter_returnsUnwrappingType() throws Exception {
        BeanPropertyWriter w = bareWriter();
        NameTransformer nt = mock(NameTransformer.class);
        BeanPropertyWriter result = w.unwrappingWriter(nt);
        assertTrue(result instanceof UnwrappingBeanPropertyWriter);
    }

    @Test
    public void testSetNonTrivialBaseType() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JavaType t = mock(JavaType.class);
        w.setNonTrivialBaseType(t);
        assertSame(t, getField(w, "_nonTrivialBaseType"));
    }

    // ==================================================================
    // readResolve()
    // ==================================================================

    @Test
    public void testReadResolve_fieldMember() throws Exception {
        AnnotatedField af = mock(AnnotatedField.class);
        when(af.getMember()).thenReturn(VALUE_FIELD);
        BeanPropertyWriter w = bareWriter();
        setField(w, "_member", af);
        w.readResolve();
        assertEquals(VALUE_FIELD, getField(w, "_field"));
        assertNull(getField(w, "_accessorMethod"));
        assertNotNull(getField(w, "_dynamicSerializers")); // _serializer null -> reset map
    }

    @Test
    public void testReadResolve_methodMember() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getMember()).thenReturn(VALUE_METHOD);
        BeanPropertyWriter w = bareWriter();
        setField(w, "_member", am);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        w.readResolve();
        assertEquals(VALUE_METHOD, getField(w, "_accessorMethod"));
        assertNull(getField(w, "_field"));
        assertNull(getField(w, "_dynamicSerializers")); // _serializer non-null -> not reset
    }

    // ==================================================================
    // getName/getFullName/getType/getWrapperName/isRequired/getMetadata
    // ==================================================================

    @Test
    public void testGetName_getFullName() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertEquals("prop", w.getName());
        assertEquals(new PropertyName("prop"), w.getFullName());
    }

    @Test
    public void testGetType_getWrapperName() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JavaType type = mock(JavaType.class);
        PropertyName wn = new PropertyName("wrap");
        setField(w, "_declaredType", type);
        setField(w, "_wrapperName", wn);
        assertSame(type, w.getType());
        assertEquals(wn, w.getWrapperName());
    }

    @Test
    public void testIsRequired_true() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_REQUIRED);
        assertTrue(w.isRequired());
    }

    @Test
    public void testIsRequired_false() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_OPTIONAL);
        assertFalse(w.isRequired());
    }

    @Test
    public void testGetMetadata() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_REQUIRED);
        assertSame(PropertyMetadata.STD_REQUIRED, w.getMetadata());
    }

    // ==================================================================
    // getAnnotation / getContextAnnotation
    // ==================================================================

    @Test
    public void testGetAnnotation_memberNull_returnsNull() throws Exception {
        BeanPropertyWriter w = bareWriter(); // _member null
        assertNull(w.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_memberPresent_delegates() throws Exception {
        BeanPropertyWriter w = bareWriter();
        AnnotatedMember member = mock(AnnotatedMember.class);
        Deprecated dep = mock(Deprecated.class);
        when(member.getAnnotation(Deprecated.class)).thenReturn(dep);
        setField(w, "_member", member);
        assertSame(dep, w.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetContextAnnotation_null() throws Exception {
        BeanPropertyWriter w = bareWriter(); // _contextAnnotations null
        assertNull(w.getContextAnnotation(Deprecated.class));
    }

    @Test
    public void testGetContextAnnotation_present_delegates() throws Exception {
        BeanPropertyWriter w = bareWriter();
        Annotations ann = mock(Annotations.class);
        Deprecated dep = mock(Deprecated.class);
        when(ann.get(Deprecated.class)).thenReturn(dep);
        setField(w, "_contextAnnotations", ann);
        assertSame(dep, w.getContextAnnotation(Deprecated.class));
    }

    // ==================================================================
    // findFormatOverrides (caching logic)
    // ==================================================================

    @Test
    public void testFindFormatOverrides_memberNull_returnsNull_neverCallsIntrospector() throws Exception {
        BeanPropertyWriter w = bareWriter(); // _member null
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        assertNull(w.findFormatOverrides(intr));
        verify(intr, never()).findFormat(any(AnnotatedMember.class));
    }

    @Test
    public void testFindFormatOverrides_introspectorNull_returnsNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_member", mock(AnnotatedMember.class));
        assertNull(w.findFormatOverrides(null));
    }

    @Test
    public void testFindFormatOverrides_noFormatFound_cachedAsNoFormat() throws Exception {
        BeanPropertyWriter w = bareWriter();
        AnnotatedMember member = mock(AnnotatedMember.class);
        setField(w, "_member", member);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(intr.findFormat(member)).thenReturn(null);

        assertNull(w.findFormatOverrides(intr));
        assertNull(w.findFormatOverrides(intr)); // second call should hit cache
        verify(intr, times(1)).findFormat(member); // called only once due to caching
    }

    @Test
    public void testFindFormatOverrides_formatFound_returnedAndCached() throws Exception {
        BeanPropertyWriter w = bareWriter();
        AnnotatedMember member = mock(AnnotatedMember.class);
        setField(w, "_member", member);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        JsonFormat.Value value = new JsonFormat.Value(); // distinct instance from NO_FORMAT
        when(intr.findFormat(member)).thenReturn(value);

        assertSame(value, w.findFormatOverrides(intr));
        assertSame(value, w.findFormatOverrides(intr));
        verify(intr, times(1)).findFormat(member);
    }

    // ==================================================================
    // getMember / isVirtual
    // ==================================================================

    @Test
    public void testGetMember() throws Exception {
        BeanPropertyWriter w = bareWriter();
        AnnotatedMember member = mock(AnnotatedMember.class);
        setField(w, "_member", member);
        assertSame(member, w.getMember());
    }

    @Test
    public void testIsVirtual_alwaysFalse() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertFalse(w.isVirtual());
    }

    // ==================================================================
    // internal settings get/set/remove
    // ==================================================================

    @Test
    public void testInternalSettings_getWhenMapNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertNull(w.getInternalSetting("k"));
    }

    @Test
    public void testInternalSettings_setFirstTime_returnsNullOldValue() throws Exception {
        BeanPropertyWriter w = bareWriter();
        Object old = w.setInternalSetting("k", "v1");
        assertNull(old);
        assertEquals("v1", w.getInternalSetting("k"));
    }

    @Test
    public void testInternalSettings_overwrite_returnsOldValue() throws Exception {
        BeanPropertyWriter w = bareWriter();
        w.setInternalSetting("k", "v1");
        Object old = w.setInternalSetting("k", "v2");
        assertEquals("v1", old);
        assertEquals("v2", w.getInternalSetting("k"));
    }

    @Test
    public void testInternalSettings_removeWhenMapNull_returnsNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertNull(w.removeInternalSetting("nope"));
    }

    @Test
    public void testInternalSettings_removeLastEntry_mapBecomesNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        w.setInternalSetting("k", "v1");
        Object removed = w.removeInternalSetting("k");
        assertEquals("v1", removed);
        assertNull(getField(w, "_internalSettings")); // map dropped when empty
        assertNull(w.getInternalSetting("k"));
    }

    @Test
    public void testInternalSettings_removeWithRemainingEntries_mapStays() throws Exception {
        BeanPropertyWriter w = bareWriter();
        w.setInternalSetting("k1", "v1");
        w.setInternalSetting("k2", "v2");
        w.removeInternalSetting("k1");
        assertNotNull(getField(w, "_internalSettings"));
        assertEquals("v2", w.getInternalSetting("k2"));
    }

    // ==================================================================
    // simple accessors
    // ==================================================================

    @Test
    public void testGetSerializedName() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertEquals("prop", w.getSerializedName().getValue());
    }

    @Test
    public void testHasSerializer_hasNullSerializer_falseByDefault() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertFalse(w.hasSerializer());
        assertFalse(w.hasNullSerializer());
    }

    @Test
    public void testGetTypeSerializer_defaultNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertNull(w.getTypeSerializer());
    }

    @Test
    public void testIsUnwrapping_alwaysFalse() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertFalse(w.isUnwrapping());
    }

    @Test
    public void testWillSuppressNulls() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_suppressNulls", true);
        assertTrue(w.willSuppressNulls());
    }

    // ==================================================================
    // wouldConflictWithName
    // ==================================================================

    @Test
    public void testWouldConflictWithName_wrapperNameSet_equal() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_wrapperName", new PropertyName("wrap"));
        assertTrue(w.wouldConflictWithName(new PropertyName("wrap")));
    }

    @Test
    public void testWouldConflictWithName_wrapperNameSet_notEqual() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_wrapperName", new PropertyName("wrap"));
        assertFalse(w.wouldConflictWithName(new PropertyName("other")));
    }

    @Test
    public void testWouldConflictWithName_noWrapperName_sameSimpleName_noNamespace() throws Exception {
        BeanPropertyWriter w = bareWriter(); // name = "prop", _wrapperName null
        assertTrue(w.wouldConflictWithName(new PropertyName("prop")));
    }

    @Test
    public void testWouldConflictWithName_noWrapperName_differentSimpleName() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertFalse(w.wouldConflictWithName(new PropertyName("other")));
    }

    // ==================================================================
    // getSerializer / getSerializationType / getRawSerializationType
    // ==================================================================

    @Test
    public void testGetSerializer_getSerializationType_null() throws Exception {
        BeanPropertyWriter w = bareWriter();
        assertNull(w.getSerializer());
        assertNull(w.getSerializationType());
        assertNull(w.getRawSerializationType());
    }

    @Test
    public void testGetRawSerializationType_nonNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JavaType cfgType = mock(JavaType.class);
        when(cfgType.getRawClass()).thenReturn((Class) String.class);
        setField(w, "_cfgSerializationType", cfgType);
        assertEquals(String.class, w.getRawSerializationType());
    }

    // ==================================================================
    // getPropertyType / getGenericPropertyType
    // ==================================================================

    @Test
    public void testGetPropertyType_viaAccessorMethod() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_accessorMethod", VALUE_METHOD);
        assertEquals(VALUE_METHOD.getReturnType(), w.getPropertyType());
    }

    @Test
    public void testGetPropertyType_viaField() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        assertEquals(VALUE_FIELD.getType(), w.getPropertyType());
    }

    @Test
    public void testGetGenericPropertyType_viaAccessorMethod() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_accessorMethod", VALUE_METHOD);
        assertEquals(VALUE_METHOD.getGenericReturnType(), w.getGenericPropertyType());
    }

    @Test
    public void testGetGenericPropertyType_viaField() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        assertEquals(VALUE_FIELD.getGenericType(), w.getGenericPropertyType());
    }

    @Test
    public void testGetGenericPropertyType_virtual_returnsNull() throws Exception {
        BeanPropertyWriter w = bareWriter(); // both null
        assertNull(w.getGenericPropertyType());
    }

    @Test
    public void testGetViews() throws Exception {
        BeanPropertyWriter w = bareWriter();
        Class<?>[] views = new Class<?>[] { String.class };
        setField(w, "_includeInViews", views);
        assertArrayEquals(views, w.getViews());
    }

    // ==================================================================
    // serializeAsField
    // ==================================================================

    @Test
    public void testSerializeAsField_nullValue_noNullSerializer_writesNothing() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        SelfRefBean bean = new SelfRefBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        verify(gen, never()).writeFieldName(any(SerializedString.class));
    }

    @Test
    public void testSerializeAsField_nullValue_withNullSerializer_writesFieldNameAndNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> nullSer = mock(JsonSerializer.class);
        setField(w, "_nullSerializer", nullSer);
        SelfRefBean bean = new SelfRefBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        SerializedString name = getField(w, "_name");
        verify(gen).writeFieldName(name);
        verify(nullSer).serialize(isNull(), eq(gen), eq(prov));
    }

    @Test
    public void testSerializeAsField_nonNullValue_noTypeSerializer_writesSerialize() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize("hello", gen, prov);
        verify(ser, never()).serializeWithType(any(), any(JsonGenerator.class), any(SerializerProvider.class), any(TypeSerializer.class));
    }

    @Test
    public void testSerializeAsField_nonNullValue_withTypeSerializer_writesSerializeWithType() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        TypeSerializer ts = mock(TypeSerializer.class);
        setField(w, "_typeSerializer", ts);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        verify(ser).serializeWithType("hello", gen, prov, ts);
        verify(ser, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testSerializeAsField_suppressEmpty_isEmptyTrue_skips() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", BeanPropertyWriter.MARKER_FOR_EMPTY);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "x";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(ser.isEmpty(prov, "x")).thenReturn(true);

        w.serializeAsField(bean, gen, prov);
        verify(gen, never()).writeFieldName(any(SerializedString.class));
        verify(ser, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testSerializeAsField_suppressEmpty_isEmptyFalse_writes() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", BeanPropertyWriter.MARKER_FOR_EMPTY);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "x";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(ser.isEmpty(prov, "x")).thenReturn(false);

        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize("x", gen, prov);
    }

    @Test
    public void testSerializeAsField_suppressValue_equal_skips() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", "hello");
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        verify(ser, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testSerializeAsField_suppressValue_notEqual_writes() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", "world");
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize("hello", gen, prov);
    }

    @Test
    public void testSerializeAsField_selfReference_notFailing_continuesToWrite() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        SelfRefBean bean = new SelfRefBean();
        bean.value = bean; // self reference
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)).thenReturn(false);

        w.serializeAsField(bean, gen, prov);
        verify(ser).serialize(bean, gen, prov); // _handleSelfReference returns false -> proceeds
    }

    // ==================================================================
    // serializeAsOmittedField
    // ==================================================================

    @Test
    public void testSerializeAsOmittedField_canOmitTrue_noWrite() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(gen.canOmitFields()).thenReturn(true);

        w.serializeAsOmittedField(new SelfRefBean(), gen, prov);
        verify(gen, never()).writeOmittedField(anyString());
    }

    @Test
    public void testSerializeAsOmittedField_canOmitFalse_writesOmitted() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(gen.canOmitFields()).thenReturn(false);

        w.serializeAsOmittedField(new SelfRefBean(), gen, prov);
        verify(gen).writeOmittedField("prop");
    }

    // ==================================================================
    // serializeAsElement
    // ==================================================================

    @Test
    public void testSerializeAsElement_nullValue_noNullSerializer_writesNull() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        SelfRefBean bean = new SelfRefBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsElement(bean, gen, prov);
        verify(gen).writeNull();
    }

    @Test
    public void testSerializeAsElement_nullValue_withNullSerializer_usesNullSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> nullSer = mock(JsonSerializer.class);
        setField(w, "_nullSerializer", nullSer);
        SelfRefBean bean = new SelfRefBean();
        bean.value = null;
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsElement(bean, gen, prov);
        verify(nullSer).serialize(isNull(), eq(gen), eq(prov));
        verify(gen, never()).writeNull();
    }

    @Test
    public void testSerializeAsElement_suppressEmpty_true_writesPlaceholder() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", BeanPropertyWriter.MARKER_FOR_EMPTY);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "x";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(ser.isEmpty(prov, "x")).thenReturn(true);

        w.serializeAsElement(bean, gen, prov);
        verify(gen).writeNull(); // serializeAsPlaceholder -> no _nullSerializer -> writeNull
        verify(ser, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testSerializeAsElement_suppressValue_equal_writesPlaceholder() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        setField(w, "_suppressableValue", "hello");
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsElement(bean, gen, prov);
        verify(gen).writeNull();
    }

    @Test
    public void testSerializeAsElement_nonNullValue_withTypeSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        TypeSerializer ts = mock(TypeSerializer.class);
        setField(w, "_typeSerializer", ts);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsElement(bean, gen, prov);
        verify(ser).serializeWithType("hello", gen, prov, ts);
    }

    @Test
    public void testSerializeAsElement_nonNullValue_noTypeSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "hello";
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsElement(bean, gen, prov);
        verify(ser).serialize("hello", gen, prov);
    }

    // ==================================================================
    // serializeAsPlaceholder
    // ==================================================================

    @Test
    public void testSerializeAsPlaceholder_withNullSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonSerializer<Object> nullSer = mock(JsonSerializer.class);
        setField(w, "_nullSerializer", nullSer);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsPlaceholder(new SelfRefBean(), gen, prov);
        verify(nullSer).serialize(isNull(), eq(gen), eq(prov));
        verify(gen, never()).writeNull();
    }

    @Test
    public void testSerializeAsPlaceholder_withoutNullSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        w.serializeAsPlaceholder(new SelfRefBean(), gen, prov);
        verify(gen).writeNull();
    }

    // ==================================================================
    // depositSchemaProperty(JsonObjectFormatVisitor)
    // ==================================================================

    @Test
    public void testDepositSchemaPropertyVisitor_nullVisitor_noOp() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_REQUIRED);
        w.depositSchemaProperty((JsonObjectFormatVisitor) null); // should not throw
    }

    @Test
    public void testDepositSchemaPropertyVisitor_required_callsProperty() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_REQUIRED);
        JsonObjectFormatVisitor v = mock(JsonObjectFormatVisitor.class);
        w.depositSchemaProperty(v);
        verify(v).property(w);
        verify(v, never()).optionalProperty(any(BeanProperty.class));
    }

    @Test
    public void testDepositSchemaPropertyVisitor_optional_callsOptionalProperty() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_OPTIONAL);
        JsonObjectFormatVisitor v = mock(JsonObjectFormatVisitor.class);
        w.depositSchemaProperty(v);
        verify(v).optionalProperty(w);
        verify(v, never()).property(any(BeanProperty.class));
    }

    // ==================================================================
    // depositSchemaProperty(ObjectNode, SerializerProvider) - deprecated
    // ==================================================================

    @Test
    public void testDepositSchemaPropertyDeprecated_serializerSet_isSchemaAware() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_OPTIONAL);
        setField(w, "_declaredType", mock(JavaType.class));

        JsonSerializer<Object> schemaAwareSer =
                (JsonSerializer<Object>) mock(JsonSerializer.class, withSettings().extraInterfaces(SchemaAware.class));
        setField(w, "_serializer", schemaAwareSer);
        TextNode schemaValue = TextNode.valueOf("schemaX");
        when(((SchemaAware) schemaAwareSer).getSchema(any(SerializerProvider.class), any(Type.class), anyBoolean()))
                .thenReturn(schemaValue);

        SerializerProvider prov = mock(SerializerProvider.class);
        ObjectNode propertiesNode = new ObjectNode(JsonNodeFactory.instance);

        w.depositSchemaProperty(propertiesNode, prov);
        assertEquals(schemaValue, propertiesNode.get("prop"));
    }

    @Test
    public void testDepositSchemaPropertyDeprecated_serializerSet_notSchemaAware_usesDefaultNode() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_OPTIONAL);
        setField(w, "_declaredType", mock(JavaType.class));
        JsonSerializer<Object> ser = mock(JsonSerializer.class); // not SchemaAware
        setField(w, "_serializer", ser);

        SerializerProvider prov = mock(SerializerProvider.class);
        ObjectNode propertiesNode = new ObjectNode(JsonNodeFactory.instance);

        w.depositSchemaProperty(propertiesNode, prov);
        assertNotNull(propertiesNode.get("prop"));
    }

    @Test
    public void testDepositSchemaPropertyDeprecated_serializerNull_lookedUpFromProvider() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_metadata", PropertyMetadata.STD_REQUIRED);
        JavaType declaredType = mock(JavaType.class);
        setField(w, "_declaredType", declaredType); // _serializer stays null

        JsonSerializer<Object> foundSer = mock(JsonSerializer.class); // not SchemaAware
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.findValueSerializer(eq(declaredType), eq((BeanProperty) w))).thenReturn(foundSer);

        ObjectNode propertiesNode = new ObjectNode(JsonNodeFactory.instance);
        w.depositSchemaProperty(propertiesNode, prov);

        verify(prov).findValueSerializer(declaredType, w);
        assertNotNull(propertiesNode.get("prop"));
    }

    // ==================================================================
    // _depositSchemaProperty (protected helper) - direct call
    // ==================================================================

    @Test
    public void testDepositSchemaProperty_direct() throws Exception {
        BeanPropertyWriter w = bareWriter();
        ObjectNode propertiesNode = new ObjectNode(JsonNodeFactory.instance);
        TextNode schemaNode = TextNode.valueOf("abc");
        w._depositSchemaProperty(propertiesNode, schemaNode);
        assertEquals(schemaNode, propertiesNode.get("prop"));
    }

    // ==================================================================
    // get(Object bean)
    // ==================================================================

    @Test
    public void testGet_viaField() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "abc";
        assertEquals("abc", w.get(bean));
    }

    @Test
    public void testGet_viaAccessorMethod() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_accessorMethod", VALUE_METHOD);
        SelfRefBean bean = new SelfRefBean();
        bean.value = "def";
        assertEquals("def", w.get(bean));
    }

    // ==================================================================
    // _handleSelfReference (direct tests of all 4 branch combos)
    // ==================================================================

    @Test
    public void testHandleSelfReference_notEnabled_returnsFalse() throws Exception {
        BeanPropertyWriter w = bareWriter();
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)).thenReturn(false);
        JsonSerializer<?> ser = mock(BeanSerializerBase.class);
        boolean result = w._handleSelfReference(new Object(), mock(JsonGenerator.class), prov, ser);
        assertFalse(result);
    }

    @Test
    public void testHandleSelfReference_enabled_usesObjectId_returnsFalse() throws Exception {
        BeanPropertyWriter w = bareWriter();
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)).thenReturn(true);
        JsonSerializer<?> ser = mock(BeanSerializerBase.class);
        when(ser.usesObjectId()).thenReturn(true);
        boolean result = w._handleSelfReference(new Object(), mock(JsonGenerator.class), prov, ser);
        assertFalse(result);
    }

    @Test
    public void testHandleSelfReference_enabled_notObjectId_notBeanSerializerBase_returnsFalse() throws Exception {
        BeanPropertyWriter w = bareWriter();
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)).thenReturn(true);
        JsonSerializer<?> ser = mock(JsonSerializer.class); // NOT BeanSerializerBase
        when(ser.usesObjectId()).thenReturn(false);
        boolean result = w._handleSelfReference(new Object(), mock(JsonGenerator.class), prov, ser);
        assertFalse(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleSelfReference_enabled_notObjectId_isBeanSerializerBase_throws() throws Exception {
        BeanPropertyWriter w = bareWriter();
        SerializerProvider prov = mock(SerializerProvider.class);
        when(prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)).thenReturn(true);
        JsonSerializer<?> ser = mock(BeanSerializerBase.class);
        when(ser.usesObjectId()).thenReturn(false);
        w._handleSelfReference(new Object(), mock(JsonGenerator.class), prov, ser);
    }

    // ==================================================================
    // toString()
    // ==================================================================

    @Test
    public void testToString_viaField_noSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_field", VALUE_FIELD);
        String s = w.toString();
        assertTrue(s.contains("property 'prop'"));
        assertTrue(s.contains("field \""));
        assertTrue(s.contains("no static serializer"));
    }

    @Test
    public void testToString_viaMethod_withSerializer() throws Exception {
        BeanPropertyWriter w = bareWriter();
        setField(w, "_accessorMethod", VALUE_METHOD);
        JsonSerializer<Object> ser = mock(JsonSerializer.class);
        setField(w, "_serializer", ser);
        String s = w.toString();
        assertTrue(s.contains("via method"));
        assertTrue(s.contains("static serializer of type"));
    }

    @Test
    public void testToString_virtual() throws Exception {
        BeanPropertyWriter w = bareWriter(); // both _field, _accessorMethod null
        String s = w.toString();
        assertTrue(s.contains("virtual"));
    }
}
