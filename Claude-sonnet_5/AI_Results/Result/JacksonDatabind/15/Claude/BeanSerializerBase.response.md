# BeanSerializerBaseTest.java

หมายเหตุสำคัญก่อนโค้ด:
- `BeanSerializerBase` เป็น abstract class จึงต้องสร้าง subclass ทดสอบ (`TestBeanSerializer`) เพื่อ implement abstract method ทั้ง 5 ตัว โดยพยายามให้ implementation ตรงกับ pattern ที่เห็นใน constructor ของซอร์สเดิม
- เมธอด `findPropertyFilter(SerializerProvider, Object, Object)` และ `wrapAndThrow(...)` เป็น method ที่ถูกเรียกใช้ใน `BeanSerializerBase` แต่ **ไม่ได้ประกาศอยู่ในซอร์สที่ให้มา** (สืบทอดมาจาก `StdSerializer` ที่ไม่ได้แสดง) — สำหรับ `findPropertyFilter` จำเป็นต้อง override เพื่อควบคุมพฤติกรรมการทดสอบ โดยอ้างอิง signature ตามรูปแบบการเรียกใช้จริงในซอร์ส (คอมเมนต์กำกับไว้ว่าเป็นสมมติฐาน) ส่วน `wrapAndThrow` **ไม่ override** และทดสอบแบบกว้าง ๆ ว่ามี exception ใด ๆ ถูก throw ออกมาเท่านั้น เพื่อไม่เดา behavior ที่ไม่มีในซอร์ส
- ฟิลด์ `protected` เช่น `_props`, `_filteredProps`, `_objectIdWriter`, `_typeId`, `_propertyFilterId`, `_serializationShape` ถูกอ่านตรง ๆ เนื่องจาก test class อยู่ package เดียวกัน (`com.fasterxml.jackson.databind.ser.std`)
- บาง branch ที่ลึกมาก (เช่น enum re-serialization ผ่าน `EnumSerializer.construct`, และ `ObjectIdGenerators.PropertyGenerator` branch ใน `createContextual`) **ไม่ได้ทดสอบ** เนื่องจากต้องพึ่งพา internal behavior ของคลาสอื่นที่ไม่ได้อยู่ในซอร์สที่ให้มา การจำลองจะเป็นการเดา behavior ซึ่งขัดกับข้อกำหนด #4 — มีคอมเมนต์กำกับไว้ในโค้ด

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializerBaseTest {

    /* ================================================================
     * Concrete subclass used purely for testing the abstract base class
     * ================================================================ */
    static class TestBeanSerializer extends BeanSerializerBase {

        boolean isArray = false;
        // ASSUMPTION: findPropertyFilter is a protected method inherited from
        // StdSerializer with this exact signature (used verbatim in the given
        // source as `findPropertyFilter(provider, _propertyFilterId, bean)`).
        PropertyFilter filterToReturn = null;

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
        public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            // not exercised directly - abstract main serialize() left unimplemented in source
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
            TestBeanSerializer copy = new TestBeanSerializer(this);
            copy.isArray = true;
            return copy;
        }

        @Override
        protected BeanSerializerBase withFilterId(Object filterId) {
            return new TestBeanSerializer(this, this._objectIdWriter, filterId);
        }

        // Overridden purely so tests can control the filter without needing a
        // real FilterProvider setup (its real implementation is not part of
        // the given source).
        @Override
        protected PropertyFilter findPropertyFilter(SerializerProvider provider, Object filterId, Object valueToFilter) {
            return filterToReturn;
        }
    }

    private JavaType type;

    @Before
    public void setUp() {
        type = TypeFactory.defaultInstance().constructType(Object.class);
    }

    private TestBeanSerializer newSer(BeanPropertyWriter[] props, BeanPropertyWriter[] filtered) {
        return new TestBeanSerializer(type, null, props, filtered);
    }

    private BeanPropertyWriter mockProp(String name) {
        BeanPropertyWriter p = mock(BeanPropertyWriter.class);
        when(p.getName()).thenReturn(name);
        return p;
    }

    /* ================================================================
     * 1. Constructors
     * ================================================================ */

    @Test
    public void testConstructor_NullBuilder_AllOptionalFieldsNull() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer ser = new TestBeanSerializer(type, null, props, null);
        assertFalse(ser.usesObjectId());
        assertNull(ser._objectIdWriter);
        assertNull(ser._propertyFilterId);
        assertNull(ser._typeId);
        assertNull(ser._anyGetterWriter);
        assertNull(ser._serializationShape);
        assertSame(props, ser._props);
    }

    @Test
    public void testConstructor_WithBuilder_CopiesAllFields() {
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        BeanDescription desc = mock(BeanDescription.class);
        AnnotatedMember typeIdMember = mock(AnnotatedMember.class);
        AnyGetterWriter anyGetter = mock(AnyGetterWriter.class);
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                TypeFactory.defaultInstance().constructType(String.class),
                new PropertyName("id"), mock(ObjectIdGenerator.class), false);

        when(builder.getTypeId()).thenReturn(typeIdMember);
        when(builder.getAnyGetter()).thenReturn(anyGetter);
        when(builder.getFilterId()).thenReturn("myFilter");
        when(builder.getObjectIdWriter()).thenReturn(oiw);
        when(builder.getBeanDescription()).thenReturn(desc);
        when(desc.findExpectedFormat(null)).thenReturn(null);

        TestBeanSerializer ser = new TestBeanSerializer(type, builder, new BeanPropertyWriter[0], null);

        assertTrue(ser.usesObjectId());
        assertSame(typeIdMember, ser._typeId);
        assertSame(anyGetter, ser._anyGetterWriter);
        assertEquals("myFilter", ser._propertyFilterId);
        assertNull(ser._serializationShape); // format == null -> shape null
    }

    @Test
    public void testConstructor_WithBuilder_FormatNonNull_SetsShape() {
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        BeanDescription desc = mock(BeanDescription.class);
        when(builder.getBeanDescription()).thenReturn(desc);
        JsonFormat.Value fmt = mock(JsonFormat.Value.class);
        when(fmt.getShape()).thenReturn(JsonFormat.Shape.OBJECT);
        when(desc.findExpectedFormat(null)).thenReturn(fmt);

        TestBeanSerializer ser = new TestBeanSerializer(type, builder, new BeanPropertyWriter[0], null);
        assertEquals(JsonFormat.Shape.OBJECT, ser._serializationShape);
    }

    @Test
    public void testCopyConstructor_PropertiesFilteredProperties() {
        TestBeanSerializer base = newSer(new BeanPropertyWriter[0], null);
        BeanPropertyWriter[] newProps = { mockProp("x") };
        TestBeanSerializer copy = new TestBeanSerializer(base, newProps, null);
        assertSame(newProps, copy._props);
    }

    @Test
    public void testCopyConstructor_ObjectIdWriter_KeepsSrcFilterId() {
        TestBeanSerializer base = newSer(new BeanPropertyWriter[0], null); // filterId null
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                TypeFactory.defaultInstance().constructType(String.class),
                new PropertyName("id"), mock(ObjectIdGenerator.class), true);
        TestBeanSerializer copy = new TestBeanSerializer(base, oiw);
        assertSame(oiw, copy._objectIdWriter);
        assertNull(copy._propertyFilterId);
    }

    @Test
    public void testCopyConstructor_ObjectIdWriterAndFilterId() {
        TestBeanSerializer base = newSer(new BeanPropertyWriter[0], null);
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                TypeFactory.defaultInstance().constructType(String.class),
                new PropertyName("id"), mock(ObjectIdGenerator.class), false);
        TestBeanSerializer copy = new TestBeanSerializer(base, oiw, "filterY");
        assertEquals("filterY", copy._propertyFilterId);
        assertSame(oiw, copy._objectIdWriter);
    }

    @Test
    public void testCopyConstructor_ToIgnore_RemovesMatchingPropsAndFiltered() {
        BeanPropertyWriter pa = mockProp("a");
        BeanPropertyWriter pb = mockProp("b");
        BeanPropertyWriter pc = mockProp("c");
        BeanPropertyWriter fa = mockProp("fa");
        BeanPropertyWriter fb = mockProp("fb");
        BeanPropertyWriter fc = mockProp("fc");
        TestBeanSerializer base = newSer(new BeanPropertyWriter[] { pa, pb, pc },
                new BeanPropertyWriter[] { fa, fb, fc });

        TestBeanSerializer copy = new TestBeanSerializer(base, new String[] { "b" });

        assertEquals(2, copy._props.length);
        assertEquals("a", copy._props[0].getName());
        assertEquals("c", copy._props[1].getName());
        assertEquals(2, copy._filteredProps.length);
        assertSame(fa, copy._filteredProps[0]);
        assertSame(fc, copy._filteredProps[1]);
    }

    @Test
    public void testCopyConstructor_ToIgnore_NullFilteredPropsStaysNull() {
        BeanPropertyWriter pa = mockProp("a");
        BeanPropertyWriter pb = mockProp("b");
        TestBeanSerializer base = newSer(new BeanPropertyWriter[] { pa, pb }, null);
        TestBeanSerializer copy = new TestBeanSerializer(base, new String[] { "a" });
        assertNull(copy._filteredProps);
        assertEquals(1, copy._props.length);
    }

    @Test
    public void testCopyConstructor_ToIgnore_EmptyArray_NoRemoval() {
        BeanPropertyWriter pa = mockProp("a");
        BeanPropertyWriter pb = mockProp("b");
        TestBeanSerializer base = newSer(new BeanPropertyWriter[] { pa, pb }, null);
        TestBeanSerializer copy = new TestBeanSerializer(base, new String[0]);
        assertEquals(2, copy._props.length);
    }

    @Test
    public void testCopyConstructor_SimpleCopy_SameArrays() {
        TestBeanSerializer base = newSer(new BeanPropertyWriter[] { mockProp("a") }, null);
        TestBeanSerializer copy = new TestBeanSerializer(base);
        assertSame(base._props, copy._props);
        assertSame(base._filteredProps, copy._filteredProps);
    }

    @Test
    public void testCopyConstructor_NameTransformer_NOP_ReturnsSameArrayReference() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer base = newSer(props, null);
        TestBeanSerializer copy = new TestBeanSerializer(base, NameTransformer.NOP);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_NullTransformer_ReturnsSameArrayReference() {
        BeanPropertyWriter[] props = { mockProp("a") };
        TestBeanSerializer base = newSer(props, null);
        TestBeanSerializer copy = new TestBeanSerializer(base, (NameTransformer) null);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_EmptyArray_ReturnsSameArrayReference() {
        BeanPropertyWriter[] props = new BeanPropertyWriter[0];
        TestBeanSerializer base = newSer(props, null);
        NameTransformer transformer = mock(NameTransformer.class);
        TestBeanSerializer copy = new TestBeanSerializer(base, transformer);
        assertSame(props, copy._props);
    }

    @Test
    public void testCopyConstructor_NameTransformer_RenamesEachNonNullElement() {
        BeanPropertyWriter pa = mock(BeanPropertyWriter.class);
        BeanPropertyWriter renamedA = mock(BeanPropertyWriter.class);
        NameTransformer transformer = mock(NameTransformer.class);
        when(pa.rename(transformer)).thenReturn(renamedA);

        BeanPropertyWriter[] props = { null, pa };
        TestBeanSerializer base = newSer(props, null);
        TestBeanSerializer copy = new TestBeanSerializer(base, transformer);

        assertNull(copy._props[0]);
        assertSame(renamedA, copy._props[1]);
    }

    /* ================================================================
     * 2. usesObjectId()
     * ================================================================ */

    @Test
    public void testUsesObjectId_TrueWhenObjectIdWriterSet() {
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                TypeFactory.defaultInstance().constructType(String.class),
                new PropertyName("id"), mock(ObjectIdGenerator.class), false);
        TestBeanSerializer base = newSer(new BeanPropertyWriter[0], null);
        TestBeanSerializer ser = new TestBeanSerializer(base, oiw);
        assertTrue(ser.usesObjectId());
    }

    @Test
    public void testUsesObjectId_FalseWhenNoObjectIdWriter() {
        TestBeanSerializer ser = newSer(new BeanPropertyWriter[0], null);
        assertFalse(ser.usesObjectId());
    }

    /* ================================================================
     * 3. _customTypeId()
     * ================================================================ */

    private TestBeanSerializer serWithTypeId(AnnotatedMember typeIdMember) {
        BeanSerializerBuilder builder = mock(BeanSerializerBuilder.class);
        when(builder.getTypeId()).thenReturn(typeIdMember);
        when(builder.getBeanDescription()).thenReturn(mock(BeanDescription.class));
        return new TestBeanSerializer(type, builder, new BeanPropertyWriter[0], null);
    }

    @Test
    public void testCustomTypeId_NullValue_ReturnsEmptyString() {
        AnnotatedMember member = mock(AnnotatedMember.class);
        TestBeanSerializer ser = serWithTypeId(member);
        Object bean = new Object();
        when(member.getValue(bean)).thenReturn(null);
        assertEquals("", ser._customTypeId(bean));
    }

    @Test
    public void testCustomTypeId_StringValue_ReturnsSameString() {
        AnnotatedMember member = mock(AnnotatedMember.class);
        TestBeanSerializer ser = serWithTypeId(member);
        Object bean = new Object();
        when(member.getValue(bean)).thenReturn("abc");
        assertEquals("abc", ser._customTypeId(bean));
    }

    @Test
    public void testCustomTypeId_NonStringValue_ReturnsToString() {
        AnnotatedMember member = mock(AnnotatedMember.class);
        TestBeanSerializer ser = serWithTypeId(member);
        Object bean = new Object();
        when(member.getValue(bean)).thenReturn(Integer.valueOf(123));
        assertEquals("123", ser._customTypeId(bean));
    }

    /* ================================================================
     * 4. serializeFields()
     * ================================================================ */

    @Test
    public void testSerializeFields_NoFilteredProps_CallsEachProp()