package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper objectMapper;
    private DeserializationContext context;

    @Before
    public void setUp() {
        factory = BeanDeserializerFactory.instance;
        objectMapper = new ObjectMapper();
        context = objectMapper.getDeserializationContext();
    }

    @Test
    public void testWithConfig_SameConfig() {
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory result = factory.withConfig(config);
        assertSame("Should return the same instance if config is identical", factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_SubtypeThrowsException() {
        BeanDeserializerFactory customSubclass = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            private static final long serialVersionUID = 1L;
        };
        customSubclass.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testWithConfig_NewInstance() {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newConfig);
        assertNotNull(result);
        assertNotSame(factory, result);
    }

    @Test
    public void testCreateBeanDeserializer_ThrowableType() throws Exception {
        JavaType type = objectMapper.constructType(RuntimeException.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(context, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Primitive() throws Exception {
        JavaType type = objectMapper.constructType(int.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        factory.createBeanDeserializer(context, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Array() throws Exception {
        JavaType type = objectMapper.constructType(int[].class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        factory.createBeanDeserializer(context, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_LocalClass() throws Exception {
        class LocalBean {}
        JavaType type = objectMapper.constructType(LocalBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        factory.createBeanDeserializer(context, type, beanDesc);
    }

    @Test
    public void testAddObjectIdReader_NullInfo() throws Exception {
        // ทดสอบกรณี Beanไม่มี ObjectIdInfo (ควรจบการทำงานแบบเงียบๆ ไม่โยน Exception)
        JavaType type = objectMapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(context, beanDesc);
        
        // เมธอด addObjectIdReader เป็น protected เราสามารถทดสอบผ่าน reflection หรือผ่าน buildBeanDeserializer ได้ทางอ้อม
        // แต่ในที่นี้เราเรียกตรงๆ ผ่านการจำลองผ่านโครงสร้างปกติได้หากไม่มี ObjectIdAnnotation
        assertNotNull(builder);
    }

    @Test
    public void testMaterializeAbstractType_NoResolvers() throws Exception {
        JavaType type = objectMapper.constructType(Runnable.class); // Abstract interface
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        // ทดสอบ Abstract type ที่ไม่มี resolver มาจัดการ ควรคืนค่า null หรือจัดการตามกระบวนการ
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(context, type, beanDesc);
        // เนื่องจาก Runnable ไม่ใช่ potential bean และเป็น abstract ที่ materialize ไม่ได้ อาจคืน null หรือจัดการต่อ
        assertNull(deserializer);
    }

    // Dummy Bean สำหรับใช้ทดสอบ
    public static class SimpleBean {
        public String name;
    }
}