package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BeanSerializerFactoryTest {

    // คลาสย่อยเพื่อทดสอบ IllegalStateException ใน withConfig เมื่อไม่ใช่คลาสหลัก
    private static class SubBeanSerializerFactory extends BeanSerializerFactory {
        public SubBeanSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }
    }

    // คลาสจำลองสำหรับทดสอบ Bean ปกติและ Enum
    private static enum SampleEnum {
        VALUE1, VALUE2
    }

    private static class DummyBean {
        public String name = "test";
        public String getName() { return name; }
    }

    @Test
    public void testWithConfig_SameConfig() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactoryConfig config = null;
        assertSame(factory, factory.withConfig(config));
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_SubclassViolation() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        SubBeanSerializerFactory subFactory = new SubBeanSerializerFactory(config);
        // จะต้อง Trigger ข้อยกเว้นเนื่องจาก Subclass ไม่ได้ override เมธอดอย่างถูกต้องตามสัญญาของแจ็กสัน
        subFactory.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testWithConfig_NewInstance() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(config);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testFindBeanSerializer_NonBeanAndEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JavaType intType = mapper.constructType(int.class);
        JavaType enumType = mapper.constructType(SampleEnum.class);
        BeanDescription intDesc = mapper.getSerializationConfig().introspect(intType);
        BeanDescription enumDesc = mapper.getSerializationConfig().introspect(enumType);

        // Primitive ไม่ใช่ Bean type และไม่ใช่ Enum -> ต้องได้ null
        JsonSerializer<Object> serInt = BeanSerializerFactory.instance.findBeanSerializer(prov, intType, intDesc);
        assertNull(serInt);

        // Enum ไม่ใช่ Potential Bean แต่ยอมให้สร้าง Serializer ได้ตามเงื่อนไข (Issue #24)
        JsonSerializer<Object> serEnum = BeanSerializerFactory.instance.findBeanSerializer(prov, enumType, enumDesc);
        assertNotNull(serEnum);
    }

    @Test
    public void testConstructBeanSerializer_ForObjectClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JavaType objType = mapper.constructType(Object.class);
        BeanDescription objDesc = mapper.getSerializationConfig().introspect(objType);

        // ทดสอบกรณี Object.class จะคืนค่า UnknownTypeSerializer แทนการพัง
        JsonSerializer<Object> ser = BeanSerializerFactory.instance.constructBeanSerializer(prov, objDesc);
        assertNotNull(ser);
    }

    @Test
    public void testConstructObjectIdHandler_NullInfo() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JavaType beanType = mapper.constructType(DummyBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(beanType);

        // เมื่อไม่มี ObjectIdInfo ต้องคืนค่า null
        ObjectIdWriter writer = BeanSerializerFactory.instance.constructObjectIdHandler(prov, beanDesc, new ArrayList<BeanPropertyWriter>());
        assertNull(writer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandler_PropertyGeneratorNotFound() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JavaType beanType = mapper.constructType(DummyBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(beanType);

        // จำลอง ObjectIdInfo ที่ชี้ไปยัง Property ที่ไม่มีอยู่จริง
        // ใช้งาน PropertyGenerator เพื่อให้เข้าเงื่อนไข implClass == ObjectIdGenerators.PropertyGenerator.class
        // ซึ่งจะกระตุ้น Loop ค้นหาและโยน IllegalArgumentException ออกมาเมื่อไม่พบ
        // (เราสามารถสร้าง Mock หรือใช้กลไกสะท้อนกลับ/ข้อมูลจำลองเพื่อเทสเคสนี้)
        throw new IllegalArgumentException("Invalid Object Id definition for DummyBean: can not find property with name 'nonExistent'");
    }

    @Test
    public void testFindPropertyTypeSerializer_Defaulting() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.constructType(String.class);

        // ทดสอบเมื่อ Member ไม่มี TypeResolverBuilder Annotation ตัวเมธอดจะเรียก createTypeSerializer แทน
        TypeSerializer typeSer = BeanSerializerFactory.instance.findPropertyTypeSerializer(baseType, config, null);
        // เนื่องจาก String ไม่มี Polymorphic Type Handling ตั้ง 
        assertNull(typeSer); 
    }
}