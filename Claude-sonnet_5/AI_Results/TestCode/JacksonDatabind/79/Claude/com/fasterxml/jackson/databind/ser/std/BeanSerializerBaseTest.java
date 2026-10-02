package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializerBaseTest {

    // ===================================================================
    // Concrete test double: BeanSerializerBase is abstract
    // ===================================================================
    static class TestBeanSerializer extends BeanSerializerBase {
        boolean arraySerializerCalled = false;

        TestBeanSerializer(JavaType type, BeanSerializerBuilder builder,
                BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(type, builder, properties, filteredProperties);
        }
        TestBeanSerializer(BeanSerializerBase src, BeanPropertyWriter[] properties,
                BeanPropertyWriter[] filteredProperties) {
            super(src, properties, filteredProperties);
        }
        TestBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter) {
            super(src, objectIdWriter);
        }
        TestBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter, Object filterId) {
            super(src, objectIdWriter, filterId);
        }
        TestBeanSerializer(BeanSerializerBase src, String[] toIgnore) {
            super(src, toIgnore);
        }
        TestBeanSerializer(BeanSerializerBase src) {
            super(src);
        }
        TestBeanSerializer(BeanSerializerBase src, NameTransformer transformer) {
            super(src, transformer);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new TestBeanSerializer(this, objectIdWriter);
        }
        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new TestBeanSerializer(this, toIgnore);
        }
        @Override
        protected BeanSerializerBase asArraySerializer() {
            TestBeanSerializer t = new TestBeanSerializer(this);
            t.arraySerializerCalled = true;
            return t;
        }
        @Override
        public BeanSerializerBase withFilterId(Object filterId) {
            return new TestBeanSerializer(this, this._objectIdWriter, filterId);
        }
        @Override
        public void serialize(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            if (_propertyFilterId != null) {
                serializeFieldsFiltered(bean, gen, provider);
            } else {
                serializeFields(bean, gen, provider);
            }
        }
    }

    enum SampleEnum { A, B }

    // ===================================================================
    // Helpers
    // ===================================================================
    private JavaType mockJavaType(Class<?> raw) {
        JavaType t = mock(JavaType.class);
        when(t.getRawClass()).thenReturn(raw);
        return t;
    }

    private BeanPropertyWriter mockProp(String name) {
        BeanPropertyWriter p = mock(BeanPropertyWriter.class);
        when(p.getName()).thenReturn(name);
        return p;
    }

    private TestBeanSerializer plainSerializer(BeanPropertyWriter[] props, BeanPropertyWriter[] fprops) {
        return new TestBeanSerializer(mockJavaType(Object.class), null, props, fprops);
    }

    // ===================================================================
    // 1. Constructors
    // ===================================================================

    @Test
    public void testConstructor_BuilderNull_FieldsAreNull() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), null, props, null);
        assertNull(ser._typeId);
        assertNull(ser._anyGetterWriter);
        assertNull(ser._propertyFilterId);
        assertNull(ser._objectIdWriter);
        assertNull(ser._serializationShape);
        assertSame(props, ser._props);
        assertNull(ser._filteredProps);
        assertFalse(ser.usesObjectId());
    }

    @Test
    public void testConstructor_WithBuilder_FieldsPopulatedFromBuilder() {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        AnyGetterWriter anyGetter = mock(AnyGetterWriter.class);
        ObjectIdWriter oiw = mock(ObjectIdWriter.class);
        JsonFormat.Value fmt = mock(JsonFormat.Value.class);
        when(fmt.getShape()).thenReturn(JsonFormat.Shape.ARRAY);

        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getTypeId()).thenReturn(typeId);
        when(builder.getAnyGetter()).thenReturn(anyGetter);
        when(builder.getFilterId()).thenReturn("filterX");
        when(builder.getObjectIdWriter()).thenReturn(oiw);
        BeanDescription desc = mock(BeanDescription.class);
        when(desc.findExpectedFormat(null)).thenReturn(fmt);
        when(builder.getBeanDescription()).thenReturn(desc);

        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, props, null);

        assertSame(typeId, ser._typeId);
        assertSame(anyGetter, ser._anyGetterWriter);
        assertEquals("filterX", ser._propertyFilterId);
        assertSame(oiw, ser._objectIdWriter);
        assertEquals(JsonFormat.Shape.ARRAY, ser._serializationShape);
        assertTrue(ser.usesObjectId());
    }

    @Test
    public void testConstructor_WithBuilder_NullFormat_SerializationShapeNull() {
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        BeanDescription desc = mock(BeanDescription.class);
        when(desc.findExpectedFormat(null)).thenReturn(null);
        when(builder.getBeanDescription()).thenReturn(desc);

        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder,
                new BeanPropertyWriter[0], null);
        assertNull(ser._serializationShape);
    }

    @Test
    public void testCopyConstructor_PropertiesOnly() {
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{mockProp("a")}, null);
        BeanPropertyWriter[] newProps = { mockProp("b") };
        TestBeanSerializer copy = new TestBeanSerializer(src, newProps, null);
        assertSame(newProps, copy._props);
        assertSame(src._typeId, copy._typeId);
        assertSame(src._objectIdWriter, copy._objectIdWriter);
        assertSame(src._propertyFilterId, copy._propertyFilterId);
    }

    @Test
    public void testCopyConstructor_ObjectIdWriterOnly_DelegatesFilterId() {
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdWriter oiw = mock(ObjectIdWriter.class);
        TestBeanSerializer copy = new TestBeanSerializer(src, oiw);
        assertSame(oiw, copy._objectIdWriter);
        assertEquals(src._propertyFilterId, copy._propertyFilterId); // delegated ctor uses src._propertyFilterId
    }

    @Test
    public void testCopyConstructor_ObjectIdWriterAndFilterId() {
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdWriter oiw = mock(ObjectIdWriter.class);
        TestBeanSerializer copy = new TestBeanSerializer(src, oiw, "myFilter");
        assertSame(oiw, copy._objectIdWriter);
        assertEquals("myFilter", copy._propertyFilterId);
        assertSame(src._props, copy._props);
    }

    @Test
    public void testCopyConstructor_Ignorals_RemovesMatchingProps_NoFilteredProps() {
        BeanPropertyWriter a = mockProp("a");
        BeanPropertyWriter b = mockProp("b");
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{a, b}, null);
        TestBeanSerializer result = new TestBeanSerializer(src, new String[]{"a"});
        assertEquals(1, result._props.length);
        assertSame(b, result._props[0]);
        assertNull(result._filteredProps);
    }

    @Test
    public void testCopyConstructor_Ignorals_RemovesMatchingProps_WithFilteredProps() {
        BeanPropertyWriter a = mockProp("a");
        BeanPropertyWriter b = mockProp("b");
        BeanPropertyWriter fa = mockProp("fa");
        BeanPropertyWriter fb = mockProp("fb");
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{a, b}, new BeanPropertyWriter[]{fa, fb});
        TestBeanSerializer result = new TestBeanSerializer(src, new String[]{"b"});
        assertEquals(1, result._props.length);
        assertSame(a, result._props[0]);
        assertEquals(1, result._filteredProps.length);
        assertSame(fa, result._filteredProps[0]);
    }

    @Test
    public void testCopyConstructor_Ignorals_NoMatch_KeepsAll() {
        BeanPropertyWriter a = mockProp("a");
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{a}, null);
        TestBeanSerializer result = new TestBeanSerializer(src, new String[]{"zzz"});
        assertEquals(1, result._props.length);
    }

    @Test
    public void testCopyConstructor_Plain() {
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{mockProp("a")}, null);
        TestBeanSerializer copy = new TestBeanSerializer(src);
        assertSame(src._props, copy._props);
        assertSame(src._filteredProps, copy._filteredProps);
    }

    @Test
    public void testCopyConstructor_NameTransformer_NullTransformer_KeepsSameArray() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer src = plainSerializer(props, null);
        TestBeanSerializer copy = new TestBeanSerializer(src, (NameTransformer) null);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_NOPTransformer_KeepsSameArray() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer src = plainSerializer(props, null);
        TestBeanSerializer copy = new TestBeanSerializer(src, NameTransformer.NOP);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_EmptyProps_KeepsSameArray() {
        BeanPropertyWriter[] props = new BeanPropertyWriter[0];
        TestBeanSerializer src = plainSerializer(props, null);
        NameTransformer nt = NameTransformer.simpleTransformer("pre", "post");
        TestBeanSerializer copy = new TestBeanSerializer(src, nt);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_RenamesProps() {
        BeanPropertyWriter a = mockProp("a");
        BeanPropertyWriter renamed = mockProp("renamed_a");
        NameTransformer nt = NameTransformer.simpleTransformer("pre_", "");
        when(a.rename(nt)).thenReturn(renamed);
        TestBeanSerializer src = plainSerializer(new BeanPropertyWriter[]{a}, null);
        TestBeanSerializer copy = new TestBeanSerializer(src, nt);
        assertNotSame(src._props, copy._props);
        assertSame(renamed, copy._props[0]);
        verify(a).rename(nt);
    }

    // ===================================================================
    // 2. Simple accessors
    // ===================================================================

    @Test
    public void testUsesObjectId_TrueFalse() {
        TestBeanSerializer noOid = plainSerializer(new BeanPropertyWriter[0], null);
        assertFalse(noOid.usesObjectId());
        ObjectIdWriter oiw = mock(ObjectIdWriter.class);
        TestBeanSerializer withOid = new TestBeanSerializer(noOid, oiw);
        assertTrue(withOid.usesObjectId());
    }

    @Test
    public void testProperties_ReturnsIteratorOverProps() {
        BeanPropertyWriter a = mockProp("a");
        BeanPropertyWriter b = mockProp("b");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a, b}, null);
        Iterator<PropertyWriter> it = ser.properties();
        assertTrue(it.hasNext());
        assertSame(a, it.next());
        assertSame(b, it.next());
        assertFalse(it.hasNext());
    }

    // ===================================================================
    // 3. _customTypeId
    // ===================================================================

    @Test
    public void testCustomTypeId_NullTypeIdValue_ReturnsEmptyString() {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        Object bean = new Object();
        when(typeId.getValue(bean)).thenReturn(null);
        BeanSerializerBuilder builder = builderWithTypeId(typeId);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);
        assertEquals("", ser._customTypeId(bean));
    }

    @Test
    public void testCustomTypeId_StringTypeIdValue_ReturnsAsIs() {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        Object bean = new Object();
        when(typeId.getValue(bean)).thenReturn("abc");
        BeanSerializerBuilder builder = builderWithTypeId(typeId);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);
        assertEquals("abc", ser._customTypeId(bean));
    }

    @Test
    public void testCustomTypeId_NonStringTypeIdValue_ReturnsToString() {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        Object bean = new Object();
        when(typeId.getValue(bean)).thenReturn(Integer.valueOf(42));
        BeanSerializerBuilder builder = builderWithTypeId(typeId);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);
        assertEquals("42", ser._customTypeId(bean));
    }

    private BeanSerializerBuilder builderWithTypeId(AnnotatedMember typeId) {
        BeanSerializerBuilder b = mock(BeanSerializerBuilder.class);
        when(b.getTypeId()).thenReturn(typeId);
        BeanDescription desc = mock(BeanDescription.class);
        when(b.getBeanDescription()).thenReturn(desc);
        return b;
    }

    // ===================================================================
    // 4. serializeWithType
    // ===================================================================

    @Test
    public void testSerializeWithType_NoObjectIdWriter_NoTypeId_NoFilter() throws IOException {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        Object bean = new Object();

        ser.serializeWithType(bean, gen, provider, typeSer);

        verify(typeSer).writeTypePrefixForObject(bean, gen);
        verify(typeSer).writeTypeSuffixForObject(bean, gen);
        verify(typeSer, never()).writeCustomTypePrefixForObject(any(), any(), any());
        verify(gen).setCurrentValue(bean);
    }

    @Test
    public void testSerializeWithType_NoObjectIdWriter_WithTypeId_WithFilter() throws IOException {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        Object bean = new Object();
        when(typeId.getValue(bean)).thenReturn("typeVal");
        BeanSerializerBuilder builder = builderWithTypeId(typeId);
        when(builder.getFilterId()).thenReturn("fid");

        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);

        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        when(filters.findPropertyFilter(eq("fid"), eq(bean))).thenReturn(filter);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(bean, gen, provider, typeSer);

        verify(typeSer).writeCustomTypePrefixForObject(bean, gen, "typeVal");
        verify(typeSer).writeCustomTypeSuffixForObject(bean, gen, "typeVal");
    }

    @Test
    public void testSerializeWithType_WithObjectIdWriter_DelegatesToSerializeWithObjectId() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, true);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(true);

        ser.serializeWithType(bean, gen, provider, typeSer);

        verify(gen).setCurrentValue(bean);
        verify(wid).writeAsId(gen, provider, oiw);
        // should return early, no type prefix/suffix written
        verify(typeSer, never()).writeTypePrefixForObject(any(), any());
    }

    // ===================================================================
    // 5. _serializeWithObjectId (boolean startEndObject variant)
    // ===================================================================

    @Test
    public void testSerializeWithObjectIdBoolean_WriteAsIdTrue_ReturnsEarly() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(true);

        ser._serializeWithObjectId(bean, gen, provider, true);
        verify(gen, never()).writeStartObject();
        verify(wid, never()).generateId(any());
    }

    @Test
    public void testSerializeWithObjectIdBoolean_AlwaysAsId_WritesIdOnly() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        JsonSerializer<Object> idSer = mock(JsonSerializer.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, true)
                .withSerializer(idSer);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(false);
        when(wid.generateId(bean)).thenReturn("gen-id");

        ser._serializeWithObjectId(bean, gen, provider, true);
        verify(idSer).serialize("gen-id", gen, provider);
        verify(gen, never()).writeStartObject();
    }

    @Test
    public void testSerializeWithObjectIdBoolean_StartEndObjectTrue_WritesFields() throws IOException {
        BeanPropertyWriter p = mockProp("a");
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[]{p}, null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(false);
        when(wid.generateId(bean)).thenReturn("id1");

        ser._serializeWithObjectId(bean, gen, provider, true);

        verify(gen).writeStartObject();
        verify(gen).writeEndObject();
        verify(wid).writeAsField(gen, provider, oiw);
        verify(p).serializeAsField(bean, gen, provider);
    }

    @Test
    public void testSerializeWithObjectIdBoolean_StartEndObjectFalse_NoStartEnd() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(false);
        when(wid.generateId(bean)).thenReturn("id1");

        ser._serializeWithObjectId(bean, gen, provider, false);
        verify(gen, never()).writeStartObject();
        verify(gen, never()).writeEndObject();
    }

    // ===================================================================
    // 6. _serializeWithObjectId (TypeSerializer variant) + _serializeObjectId
    // ===================================================================

    @Test
    public void testSerializeWithObjectIdTypeSer_WriteAsIdTrue_ReturnsEarly() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(true);

        ser._serializeWithObjectId(bean, gen, provider, typeSer);
        verify(typeSer, never()).writeTypePrefixForObject(any(), any());
    }

    @Test
    public void testSerializeWithObjectIdTypeSer_AlwaysAsId_WritesIdOnly() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        JsonSerializer<Object> idSer = mock(JsonSerializer.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, true)
                .withSerializer(idSer);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);
        when(provider.findObjectId(eq(bean), any())).thenReturn(wid);
        when(wid.writeAsId(gen, provider, oiw)).thenReturn(false);
        when(wid.generateId(bean)).thenReturn("gid");

        ser._serializeWithObjectId(bean, gen, provider, typeSer);
        verify(idSer).serialize("gid", gen, provider);
        verify(typeSer, never()).writeTypePrefixForObject(any(), any());
    }

    @Test
    public void testSerializeObjectId_TypeStrNull_NoFilter() throws IOException {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        Object bean = new Object();
        WritableObjectId wid = mock(WritableObjectId.class);

        ser._serializeObjectId(bean, gen, provider, typeSer, wid);

        verify(typeSer).writeTypePrefixForObject(bean, gen);
        verify(typeSer).writeTypeSuffixForObject(bean, gen);
        verify(wid).writeAsField(gen, provider, oiw);
    }

    @Test
    public void testSerializeObjectId_TypeStrNonNull_WithFilter() throws IOException {
        AnnotatedMember typeId = mock(AnnotatedMember.class);
        Object bean = new Object();
        when(typeId.getValue(bean)).thenReturn("TID");
        BeanSerializerBuilder builder = builderWithTypeId(typeId);
        when(builder.getFilterId()).thenReturn("fid");
        TestBeanSerializer base = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw, "fid");

        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        when(filters.findPropertyFilter(eq("fid"), eq(bean))).thenReturn(filter);
        JsonGenerator gen = mock(JsonGenerator.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        WritableObjectId wid = mock(WritableObjectId.class);

        ser._serializeObjectId(bean, gen, provider, typeSer, wid);

        verify(typeSer).writeCustomTypePrefixForObject(bean, gen, "TID");
        verify(typeSer).writeCustomTypeSuffixForObject(bean, gen, "TID");
    }

    // ===================================================================
    // 7. serializeFields
    // ===================================================================

    @Test
    public void testSerializeFields_UsesPropsWhenNoActiveView() throws IOException {
        BeanPropertyWriter a = mockProp("a");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a}, new BeanPropertyWriter[]{mockProp("fa")});
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getActiveView()).thenReturn(null);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();

        ser.serializeFields(bean, gen, provider);
        verify(a).serializeAsField(bean, gen, provider);
    }

    @Test
    public void testSerializeFields_UsesFilteredPropsWhenActiveViewPresent() throws IOException {
        BeanPropertyWriter a = mockProp("a");
        BeanPropertyWriter fa = mockProp("fa");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a}, new BeanPropertyWriter[]{fa});
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getActiveView()).thenReturn((Class) String.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();

        ser.serializeFields(bean, gen, provider);
        verify(fa).serializeAsField(bean, gen, provider);
        verify(a, never()).serializeAsField(any(), any(), any());
    }

    @Test
    public void testSerializeFields_SkipsNullProps() throws IOException {
        BeanPropertyWriter fa = mockProp("fa");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{mockProp("a")}, new BeanPropertyWriter[]{null});
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getActiveView()).thenReturn((Class) String.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        // should not NPE when filtered prop entry is null
        ser.serializeFields(new Object(), gen, provider);
    }

    @Test
    public void testSerializeFields_CallsAnyGetterWriterWhenPresent() throws IOException {
        AnyGetterWriter anyGetter = mock(AnyGetterWriter.class);
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getAnyGetter()).thenReturn(anyGetter);
        BeanDescription desc = mock(BeanDescription.class);
        when(builder.getBeanDescription()).thenReturn(desc);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        ser.serializeFields(bean, gen, provider);
        verify(anyGetter).getAndSerialize(bean, gen, provider);
    }

    @Test
    public void testSerializeFields_StackOverflow_WrapsIntoJsonMappingException() throws IOException {
        BeanPropertyWriter a = mockProp("a");
        doThrow(new StackOverflowError()).when(a).serializeAsField(any(), any(), any());
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a}, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        try {
            ser.serializeFields(bean, gen, provider);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof StackOverflowError);
            assertTrue(e.getMessage().contains("Infinite recursion"));
        }
    }

    @Test
    public void testSerializeFields_ExceptionPropagates_WhenPropThrows() throws IOException {
        // NOTE: exact wrapping done by wrapAndThrow() is NOT part of the given
        // source (inherited method), so we only assert that *some* exception
        // propagates, per rule #4 (ไม่เดา behavior ที่ไม่มีในซอร์ส)
        BeanPropertyWriter a = mockProp("a");
        RuntimeException cause = new RuntimeException("boom");
        doThrow(cause).when(a).serializeAsField(any(), any(), any());
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a}, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        Object bean = new Object();
        try {
            ser.serializeFields(bean, gen, provider);
            fail("expected an exception to propagate");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ===================================================================
    // 8. serializeFieldsFiltered
    // ===================================================================

    @Test
    public void testSerializeFieldsFiltered_FilterNonNull_CallsFilterSerializeAsField() throws IOException {
        BeanPropertyWriter a = mockProp("a");
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[]{a}, null);
        TestBeanSerializer ser = new TestBeanSerializer(base, base._objectIdWriter, "fid");

        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getActiveView()).thenReturn(null);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        Object bean = new Object();
        when(filters.findPropertyFilter(eq("fid"), eq(bean))).thenReturn(filter);
        JsonGenerator gen = mock(JsonGenerator.class);

        ser.serializeFieldsFiltered(bean, gen, provider);
        verify(filter).serializeAsField(bean, gen, provider, a);
    }

    @Test
    public void testSerializeFieldsFiltered_CallsAnyGetterGetAndFilter() throws IOException {
        AnyGetterWriter anyGetter = mock(AnyGetterWriter.class);
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getAnyGetter()).thenReturn(anyGetter);
        when(builder.getFilterId()).thenReturn("fid");
        BeanDescription desc = mock(BeanDescription.class);
        when(builder.getBeanDescription()).thenReturn(desc);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);

        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        Object bean = new Object();
        when(filters.findPropertyFilter(eq("fid"), eq(bean))).thenReturn(filter);
        JsonGenerator gen = mock(JsonGenerator.class);

        ser.serializeFieldsFiltered(bean, gen, provider);
        verify(anyGetter).getAndFilter(bean, gen, provider, filter);
    }

    // ===================================================================
    // 9. resolve()
    // ===================================================================

    @Test
    public void testResolve_AssignsNullSerializer_WhenApplicable() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.willSuppressNulls()).thenReturn(false);
        when(p.hasNullSerializer()).thenReturn(false);
        when(p.hasSerializer()).thenReturn(true); // continue afterwards
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonSerializer<Object> nullSer = mock(JsonSerializer.class);
        when(provider.findNullValueSerializer(p)).thenReturn(nullSer);

        ser.resolve(provider);
        verify(p).assignNullSerializer(nullSer);
        verify(p, never()).setNonTrivialBaseType(any());
    }

    @Test
    public void testResolve_SkipsNullSerializer_WhenWillSuppressNulls() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.willSuppressNulls()).thenReturn(true);
        when(p.hasSerializer()).thenReturn(true);
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.resolve(provider);
        verify(provider, never()).findNullValueSerializer(any());
    }

    @Test
    public void testResolve_SkipsNullSerializer_WhenHasNullSerializerAlready() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.willSuppressNulls()).thenReturn(false);
        when(p.hasNullSerializer()).thenReturn(true);
        when(p.hasSerializer()).thenReturn(true);
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.resolve(provider);
        verify(provider, never()).findNullValueSerializer(any());
    }

    @Test
    public void testResolve_ContinuesWhenHasSerializer() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(true);
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.resolve(provider);
        verify(p, never()).assignSerializer(any());
        verify(p, never()).getSerializationType();
    }

    @Test
    public void testResolve_TypeNull_NotFinal_ContainerType_SetsNonTrivialBaseType() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(false);
        when(p.getSerializationType()).thenReturn(null);
        JavaType pType = mock(JavaType.class);
        when(pType.isFinal()).thenReturn(false);
        when(pType.isContainerType()).thenReturn(true);
        when(p.getType()).thenReturn(pType);

        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.resolve(provider);
        verify(p).setNonTrivialBaseType(pType);
        verify(p, never()).assignSerializer(any());
    }

    @Test
    public void testResolve_TypeNull_NotFinal_ContainedTypeCountPositive_SetsNonTrivialBaseType() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(false);
        when(p.getSerializationType()).thenReturn(null);
        JavaType pType = mock(JavaType.class);
        when(pType.isFinal()).thenReturn(false);
        when(pType.isContainerType()).thenReturn(false);
        when(pType.containedTypeCount()).thenReturn(1);
        when(p.getType()).thenReturn(pType);

        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.resolve(provider);
        verify(p).setNonTrivialBaseType(pType);
    }

    @Test
    public void testResolve_TypeNull_Final_AssignsSerializer() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(false);
        when(p.getSerializationType()).thenReturn(null);
        JavaType pType = mock(JavaType.class);
        when(pType.isFinal()).thenReturn(true);
        when(pType.isContainerType()).thenReturn(false);
        when(p.getType()).thenReturn(pType);

        JsonSerializer<Object> valSer = mock(JsonSerializer.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.findValueSerializer(pType, p)).thenReturn(valSer);

        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        ser.resolve(provider);
        verify(p).assignSerializer(valSer);
    }

    @Test
    public void testResolve_HardCodedType_ContainerWithTypeHandler_WrapsContainerSerializer() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(false);
        JavaType hardType = mock(JavaType.class);
        when(hardType.isContainerType()).thenReturn(true);
        JavaType contentType = mock(JavaType.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        when(contentType.getTypeHandler()).thenReturn(typeSer);
        when(hardType.getContentType()).thenReturn(contentType);
        when(p.getSerializationType()).thenReturn(hardType);

        ContainerSerializer<?> containerSer = mock(ContainerSerializer.class);
        ContainerSerializer<?> wrapped = mock(ContainerSerializer.class);
        when(containerSer.withValueTypeSerializer(typeSer)).thenReturn((ContainerSerializer) wrapped);

        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.findValueSerializer(hardType, p)).thenReturn((JsonSerializer) containerSer);

        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, null);
        ser.resolve(provider);
        verify(p).assignSerializer(wrapped);
    }

    @Test
    public void testResolve_UpdatesFilteredPropWhenPresent() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        when(p.hasSerializer()).thenReturn(false);
        JavaType pType = mock(JavaType.class);
        when(pType.isFinal()).thenReturn(true);
        when(p.getSerializationType()).thenReturn(null);
        when(p.getType()).thenReturn(pType);
        BeanPropertyWriter fp = mockProp("fa");

        JsonSerializer<Object> valSer = mock(JsonSerializer.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.findValueSerializer(pType, p)).thenReturn(valSer);

        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, new BeanPropertyWriter[]{fp});
        ser.resolve(provider);
        verify(fp).assignSerializer(valSer);
    }

    @Test
    public void testResolve_AnyGetterResolved_WhenPresent() throws Exception {
        AnyGetterWriter anyGetter = mock(AnyGetterWriter.class);
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getAnyGetter()).thenReturn(anyGetter);
        BeanDescription desc = mock(BeanDescription.class);
        when(builder.getBeanDescription()).thenReturn(desc);
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(Object.class), builder, new BeanPropertyWriter[0], null);

        SerializerProvider provider = mock(SerializerProvider.class);
        ser.resolve(provider);
        verify(anyGetter).resolve(provider);
    }

    // ===================================================================
    // 10. findConvertingSerializer
    // ===================================================================

    @Test
    public void testFindConvertingSerializer_IntrNull_ReturnsNull() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getAnnotationIntrospector()).thenReturn(null);
        BeanPropertyWriter p = mockProp("a");
        assertNull(ser.findConvertingSerializer(provider, p));
    }

    @Test
    public void testFindConvertingSerializer_MemberNull_ReturnsNull() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanPropertyWriter p = mockProp("a");
        when(p.getMember()).thenReturn(null);
        assertNull(ser.findConvertingSerializer(provider, p));
    }

    @Test
    public void testFindConvertingSerializer_ConvDefNull_ReturnsNull() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanPropertyWriter p = mockProp("a");
        AnnotatedMember m = mock(AnnotatedMember.class);
        when(p.getMember()).thenReturn(m);
        when(intr.findSerializationConverter(m)).thenReturn(null);
        assertNull(ser.findConvertingSerializer(provider, p));
    }

    @Test
    public void testFindConvertingSerializer_DelegateIsJavaLangObject_SerNullButWrapperReturned() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanPropertyWriter p = mockProp("a");
        AnnotatedMember m = mock(AnnotatedMember.class);
        when(p.getMember()).thenReturn(m);
        Object convDef = new Object();
        when(intr.findSerializationConverter(m)).thenReturn(convDef);
        Converter<Object, Object> conv = mock(Converter.class);
        when(provider.converterInstance(m, convDef)).thenReturn(conv);
        JavaType delegateType = mock(JavaType.class);
        when(delegateType.isJavaLangObject()).thenReturn(true);
        when(conv.getOutputType(any())).thenReturn(delegateType);

        JsonSerializer<Object> result = ser.findConvertingSerializer(provider, p);
        assertNotNull(result); // StdDelegatingSerializer wrapper is always returned (non-null) per given source
        verify(provider, never()).findValueSerializer(eq(delegateType), eq((BeanProperty) p));
    }

    @Test
    public void testFindConvertingSerializer_DelegateNotJavaLangObject_LooksUpValueSerializer() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanPropertyWriter p = mockProp("a");
        AnnotatedMember m = mock(AnnotatedMember.class);
        when(p.getMember()).thenReturn(m);
        Object convDef = new Object();
        when(intr.findSerializationConverter(m)).thenReturn(convDef);
        Converter<Object, Object> conv = mock(Converter.class);
        when(provider.converterInstance(m, convDef)).thenReturn(conv);
        JavaType delegateType = mock(JavaType.class);
        when(delegateType.isJavaLangObject()).thenReturn(false);
        when(conv.getOutputType(any())).thenReturn(delegateType);

        JsonSerializer<Object> result = ser.findConvertingSerializer(provider, p);
        assertNotNull(result);
        verify(provider).findValueSerializer(delegateType, p);
    }

    // ===================================================================
    // 11. createContextual
    // ===================================================================

    @Test
    public void testCreateContextual_PropertyNull_ReturnsSameInstance() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonSerializer<?> result = ser.createContextual(provider, null);
        assertSame(ser, result);
    }

    @Test
    public void testCreateContextual_WithObjectIdWriter_UpdatesWriterInstanceWhenChanged() throws Exception {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonSerializer<Object> idSer = mock(JsonSerializer.class);
        when(provider.findValueSerializer(eq(oiw.idType), (BeanProperty) isNull())).thenReturn(idSer);

        JsonSerializer<?> result = ser.createContextual(provider, null);
        assertNotSame(ser, result); // withObjectIdWriter must have produced a new instance
        assertTrue(result instanceof TestBeanSerializer);
    }

    @Test
    public void testCreateContextual_FormatNull_WithIgnorals_CreatesNewInstance() throws Exception {
        BeanPropertyWriter a = mockProp("ignoreMe");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{a}, null);

        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember accessor = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(accessor);

        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        when(intr.findFormat(accessor)).thenReturn(null); // covers format == null branch
        when(intr.findPropertiesToIgnore(accessor, true)).thenReturn(new String[]{"ignoreMe"});
        when(intr.findObjectIdInfo(accessor)).thenReturn(null);
        when(intr.findFilterId(accessor)).thenReturn(null);

        JsonSerializer<?> result = ser.createContextual(provider, property);
        assertTrue(result instanceof TestBeanSerializer);
        assertEquals(0, ((TestBeanSerializer) result)._props.length);
    }

    @Test
    public void testCreateContextual_NewFilterId_CreatesNewInstance() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember accessor = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(accessor);

        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        when(intr.findFormat(accessor)).thenReturn(null);
        when(intr.findObjectIdInfo(accessor)).thenReturn(null);
        when(intr.findFilterId(accessor)).thenReturn("newFilter");

        JsonSerializer<?> result = ser.createContextual(provider, property);
        assertTrue(result instanceof TestBeanSerializer);
        assertEquals("newFilter", ((TestBeanSerializer) result)._propertyFilterId);
    }

    @Test
    public void testCreateContextual_SameFilterId_NoChange() throws Exception {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        TestBeanSerializer ser = new TestBeanSerializer(base, base._objectIdWriter, "sameFilter");

        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember accessor = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(accessor);

        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        when(intr.findFormat(accessor)).thenReturn(null);
        when(intr.findObjectIdInfo(accessor)).thenReturn(null);
        when(intr.findFilterId(accessor)).thenReturn("sameFilter"); // equals current -> no new filter id

        JsonSerializer<?> result = ser.createContextual(provider, property);
        assertSame(ser, result);
    }

    @Test
    public void testCreateContextual_ShapeArray_ReturnsArraySerializer() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null); // _handledType = Object.class (not enum)
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember accessor = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(accessor);

        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        JsonFormat.Value fmt = mock(JsonFormat.Value.class);
        when(fmt.getShape()).thenReturn(JsonFormat.Shape.ARRAY);
        when(intr.findFormat(accessor)).thenReturn(fmt);
        when(intr.findObjectIdInfo(accessor)).thenReturn(null);
        when(intr.findFilterId(accessor)).thenReturn(null);

        JsonSerializer<?> result = ser.createContextual(provider, property);
        assertTrue(result instanceof TestBeanSerializer);
        assertTrue(((TestBeanSerializer) result).arraySerializerCalled);
    }

    @Test
    public void testCreateContextual_ObjectIdRefOverride_UpdatesAlwaysAsId() throws Exception {
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[0], null);
        ObjectIdGenerator<?> genType = mock(ObjectIdGenerator.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(mockJavaType(Long.class), null, genType, false);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);

        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember accessor = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(accessor);

        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        when(intr.findFormat(accessor)).thenReturn(null);
        when(intr.findObjectIdInfo(accessor)).thenReturn(null); // objectIdInfo == null, oiw != null -> enter branch
        ObjectIdInfo refInfo = mock(ObjectIdInfo.class);
        when(refInfo.getAlwaysAsId()).thenReturn(true);
        when(intr.findObjectReferenceInfo(eq(accessor), any(ObjectIdInfo.class))).thenReturn(refInfo);
        when(intr.findFilterId(accessor)).thenReturn(null);
        JsonSerializer<Object> idSer = mock(JsonSerializer.class);
        when(provider.findValueSerializer(any(JavaType.class), (BeanProperty) eq(property))).thenReturn(idSer);

        JsonSerializer<?> result = ser.createContextual(provider, property);
        assertTrue(result instanceof TestBeanSerializer);
        assertTrue(((TestBeanSerializer) result)._objectIdWriter.alwaysAsId);
    }

    // ===================================================================
    // 12. getSchema (deprecated)
    // ===================================================================

    @JsonSerializableSchema(id = "myId")
    static class AnnotatedBean {}

    static class PlainBean {}

    @Test
    public void testGetSchema_NoAnnotation_NoFilter() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(PlainBean.class), null, new BeanPropertyWriter[]{p}, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        JsonNode node = ser.getSchema(provider, null);
        assertTrue(node instanceof ObjectNode);
        verify(p).depositSchemaProperty(any(ObjectNode.class), eq(provider));
        assertFalse(((ObjectNode) node).has("id"));
    }

    @Test
    public void testGetSchema_WithAnnotationIdPresent() throws Exception {
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(AnnotatedBean.class), null, new BeanPropertyWriter[0], null);
        SerializerProvider provider = mock(SerializerProvider.class);
        ObjectNode node = (ObjectNode) ser.getSchema(provider, null);
        assertEquals("myId", node.get("id").asText());
    }

    @Test
    public void testGetSchema_WithFilter() throws Exception {
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getFilterId()).thenReturn("fid");
        BeanDescription desc = mock(BeanDescription.class);
        when(builder.getBeanDescription()).thenReturn(desc);
        BeanPropertyWriter p = mockProp("a");
        TestBeanSerializer ser = new TestBeanSerializer(mockJavaType(PlainBean.class), builder, new BeanPropertyWriter[]{p}, null);

        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        when(filters.findPropertyFilter(eq("fid"), isNull())).thenReturn(filter);

        ser.getSchema(provider, null);
        verify(filter).depositSchemaProperty(eq(p), any(ObjectNode.class), eq(provider));
        verify(p, never()).depositSchemaProperty(any(ObjectNode.class), any());
    }

    // ===================================================================
    // 13. acceptJsonFormatVisitor
    // ===================================================================

    @Test
    public void testAcceptJsonFormatVisitor_VisitorNull_NoOp() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        ser.acceptJsonFormatVisitor(null, mockJavaType(Object.class)); // must not throw
    }

    @Test
    public void testAcceptJsonFormatVisitor_ObjectVisitorNull_NoOp() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[0], null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mockJavaType(Object.class);
        when(visitor.expectObjectFormat(typeHint)).thenReturn(null);
        ser.acceptJsonFormatVisitor(visitor, typeHint); // must not throw / no further interaction needed
        verify(visitor, never()).getProvider();
    }

    @Test
    public void testAcceptJsonFormatVisitor_WithPropertyFilter() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        TestBeanSerializer base = plainSerializer(new BeanPropertyWriter[]{p}, null);
        TestBeanSerializer ser = new TestBeanSerializer(base, base._objectIdWriter, "fid");

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mockJavaType(Object.class);
        JsonObjectFormatVisitor objVisitor = mock(JsonObjectFormatVisitor.class);
        when(visitor.expectObjectFormat(typeHint)).thenReturn(objVisitor);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(provider);
        FilterProvider filters = mock(FilterProvider.class);
        when(provider.getFilterProvider()).thenReturn(filters);
        PropertyFilter filter = mock(PropertyFilter.class);
        when(filters.findPropertyFilter(eq("fid"), isNull())).thenReturn(filter);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        verify(filter).depositSchemaProperty(p, objVisitor, provider);
    }

    @Test
    public void testAcceptJsonFormatVisitor_NoFilter_NoActiveView_UsesProps() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, new BeanPropertyWriter[]{mockProp("fa")});

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mockJavaType(Object.class);
        JsonObjectFormatVisitor objVisitor = mock(JsonObjectFormatVisitor.class);
        when(visitor.expectObjectFormat(typeHint)).thenReturn(objVisitor);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(provider);
        when(provider.getActiveView()).thenReturn(null);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        verify(p).depositSchemaProperty(objVisitor, provider);
    }

    @Test
    public void testAcceptJsonFormatVisitor_NoFilter_ActiveView_UsesFilteredProps() throws Exception {
        BeanPropertyWriter p = mockProp("a");
        BeanPropertyWriter fp = mockProp("fa");
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{p}, new BeanPropertyWriter[]{fp});

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mockJavaType(Object.class);
        JsonObjectFormatVisitor objVisitor = mock(JsonObjectFormatVisitor.class);
        when(visitor.expectObjectFormat(typeHint)).thenReturn(objVisitor);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(provider);
        when(provider.getActiveView()).thenReturn((Class) String.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        verify(fp).depositSchemaProperty(objVisitor, provider);
        verify(p, never()).depositSchemaProperty(any(), any());
    }

    @Test
    public void testAcceptJsonFormatVisitor_SkipsNullPropsInArray() throws Exception {
        TestBeanSerializer ser = plainSerializer(new BeanPropertyWriter[]{null}, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mockJavaType(Object.class);
        JsonObjectFormatVisitor objVisitor = mock(JsonObjectFormatVisitor.class);
        when(visitor.expectObjectFormat(typeHint)).thenReturn(objVisitor);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(provider);
        when(provider.getActiveView()).thenReturn(null);

        // must not throw NPE when prop == null
        ser.acceptJsonFormatVisitor(visitor, typeHint);
    }
}
