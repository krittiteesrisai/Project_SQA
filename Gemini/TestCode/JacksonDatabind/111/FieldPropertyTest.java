package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

public class FieldPropertyTest {

    public static class SampleBean {
        public String publicField;
        private String privateField;
        public final String finalField = "fixed";
    }

    private AnnotatedField getSampleAnnotatedField(String fieldName) throws Exception {
        Field f = SampleBean.class.getField(fieldName);
        return new AnnotatedField(null, f, null);
    }

    @Test
    public void testReadResolveWithValidField() throws Exception {
        AnnotatedField af = getSampleAnnotatedField("publicField");
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanPropertyDefinition propDef = BeanPropertyDefinition.construct(
                mapper.getDeserializationConfig(),
                AnnotatedField.construct(null, SampleBean.class.getField("publicField"), null),
                null);

        FieldProperty fp = new FieldProperty(propDef, type, null, null, af);
        Object resolved = fp.readResolve();
        assertNotNull(resolved);
        assertTrue(resolved instanceof FieldProperty);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolveWithNullFieldThrowsException() throws Exception {
        // สร้าง AnnotatedField ที่มี Field เป็น null เพื่อกระตุ้นเงื่อนไข if (f == null) ใน Constructor JDK Serialization
        AnnotatedField af = new AnnotatedField(null, null, null);
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanPropertyDefinition propDef = BeanPropertyDefinition.construct(
                mapper.getDeserializationConfig(),
                null,
                null);

        FieldProperty fp = new FieldProperty(propDef, type, null, null, af);
        // จำลองการเรียกใช้งาน readResolve ซึ่งจะเรียก constructor ป้องกัน JDK Deserialization ที่รับ FieldProperty ตัวเอง
        // โดย reflection หรือการเรียกตรงๆ หากเข้าถึงได้
        java.lang.reflect.Constructor<FieldProperty> ctor = FieldProperty.class.getDeclaredConstructor(FieldProperty.class);
        ctor.setAccessible(true);
        ctor.newInstance(fp);
    }

    @Test
    public void testGetAnnotationWithNullAnnotated() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        // เซ็ต _annotated เป็น null ผ่าน reflection เพื่อทดสอบเงื่อนไข getAnnotation
        Field annField = FieldProperty.class.getDeclaredField("_annotated");
        annField.setAccessible(true);
        annField.set(fp, null);

        assertNull(fp.getAnnotation(Deprecated.class));
    }

    @Test
    public void testWithValueDeserializerSameInstance() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        JsonDeserializer<?> dummyDeser = fp.getValueDeserializer();
        SettableBeanProperty result = fp.withValueDeserializer(dummyDeser);
        assertSame(fp, result);
    }

    @Test
    public void testWithValueDeserializerNewInstance() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        JsonDeserializer<Object> newDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "new";
            }
        };
        SettableBeanProperty result = fp.withValueDeserializer(newDeser);
        assertNotSame(fp, result);
    }

    @Test
    public void testWithNullProvider() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        NullValueProvider nvp = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return "default";
            }
        };
        SettableBeanProperty result = fp.withNullProvider(nvp);
        assertNotNull(result);
        assertNotSame(fp, result);
    }

    @Test
    public void testFixAccess() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        ObjectMapper mapper = new ObjectMapper();
        // ทดสอบ fixAccess ไม่ควรโยน Exception
        fp.fixAccess(mapper.getDeserializationConfig());
        assertNotNull(fp.getMember());
    }

    @Test
    public void testSetAndSetAndReturn() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        SampleBean bean = new SampleBean();
        fp.set(bean, "HelloTest");
        assertEquals("HelloTest", bean.publicField);

        SampleBean bean2 = new SampleBean();
        Object returned = fp.setAndReturn(bean2, "HelloReturn");
        assertSame(bean2, returned);
        assertEquals("HelloReturn", bean2.publicField);
    }

    @Test(expected = IOException.class)
    public void testSetThrowsIOExceptionOnFailure() throws Exception {
        FieldProperty fp = createDummyFieldProperty();
        SampleBean bean = new SampleBean();
        // พยายามเซ็ตค่าที่ไม่รองรับ หรือทำให้เกิด IllegalAccessException / IllegalArgumentException
        // ส่ง Type ผิดประเภท เช่น ส่ง Integer เข้าไปใน String field หรือใช้ final field
        Field f = SampleBean.class.getField("finalField");
        Field annField = FieldProperty.class.getDeclaredField("_field");
        annField.setAccessible(true);
        annField.set(fp, f);

        fp.set(bean, 12345);
    }

    private FieldProperty createDummyFieldProperty() throws Exception {
        AnnotatedField af = getSampleAnnotatedField("publicField");
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanPropertyDefinition propDef = BeanPropertyDefinition.construct(
                mapper.getDeserializationConfig(),
                af,
                null);
        return new FieldProperty(propDef, type, null, null, af);
    }
}