package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
    public void testWithConfigSameInstance() {
        DeserializerFactoryConfig config = factory.getClass(); // ใช้ config เดิมทางอ้อมหรือสร้างใหม่
        // ทดสอบกรณี config ตัวเดียวกันเป๊ะ คืนค่าเดิม
        DeserializerFactory result = factory.withConfig(factory.getFactoryConfig());
        assertSame(factory, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithConfigDifferentInstanceShouldVerifyOverride() {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        // คลาสลูกไม่ได้ override withConfig ในตัวอย่างนี้ จึงควรโยน Exception ตาม ClassUtil.verifyMustOverride
        factory.withConfig(newConfig);
    }

    @Test
    public void testIsPotentialBeanTypePrimitiveThrowsException() {
        // ทดสอบ Edge Case: Primitive ไม่สามารถเป็น Bean ได้
        try {
            factory.createBeanDeserializer(context, TypeFactory.defaultInstance().constructType(int.class), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot deserialize Class int"));
        }
    }

    @Test
    public void testIsPotentialBeanTypeLocalClassThrowsException() {
        // ทดสอบ Local class ภายในเมธอด
        class LocalBean {}
        try {
            factory.createBeanDeserializer(context, TypeFactory.defaultInstance().constructType(LocalBean.class), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot deserialize Class"));
        }
    }

    @Test
    public void testMaterializeAbstractTypeReturnsNullWhenNoResolvers() {
        JavaType absType = TypeFactory.defaultInstance().constructType(Runnable.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(absType);
        
        // ไม่มี AbstractTypeResolver ลงทะเบียนไว้ ควรคืนค่า null
        assertNull(factory.createBeanDeserializer(context, absType, beanDesc));
    }

    @Test
    public void testThrowableTypeRouting() throws Exception {
        JavaType throwableType = TypeFactory.defaultInstance().constructType(Exception.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(throwableType);
        
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(context, throwableType, beanDesc);
        assertNotNull(deserializer);
    }

    @Test
    public void testIsIgnorableTypeCachingAndPrimitives() throws Exception {
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();
        DeserializationConfig config = objectMapper.getDeserializationConfig();

        // 1. ทดสอบ Primitive และ String จะถูกกำหนดเป็น FALSE ทันที
        assertFalse(factory.isIgnorableType(config, null, int.class, ignoredTypes));
        assertFalse(factory.isIgnorableType(config, null, String.class, ignoredTypes));

        // 2. ทดสอบการดึงค่าจาก Cache ที่เคยใส่ไว้แล้ว
        ignoredTypes.put(Double.class, Boolean.TRUE);
        assertTrue(factory.isIgnorableType(config, null, Double.class, ignoredTypes));
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructAnySetterWithInvalidMutator() throws Exception {
        JavaType beanType = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(beanType);
        
        // ส่ง String.class เข้าไปแทน AnnotatedMethod หรือ AnnotatedField เพื่อบังคับให้เข้าเงื่อนไข Else และโยน Exception
        factory.constructAnySetter(context, beanDesc, null);
    }
}