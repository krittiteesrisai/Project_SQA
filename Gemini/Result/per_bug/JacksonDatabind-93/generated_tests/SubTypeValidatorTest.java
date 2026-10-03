package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for SubTypeValidator (JacksonDatabind-93)
 */
public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext context; // ในบริบททดสอบยูนิตแบบ Pure อาจเป็น null หรือต้อง Mock แต่ตามที่กำหนดห้ามใช้ Mockito นอกเหนือจาก Classpath จึงใช้ null หรือ Context พื้นฐานถ้าทำได้

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        context = null; // SubTypeValidator.from() ใช้ ctxt เพียงเรียก JsonMappingException.from(ctxt, ...) ซึ่งรองรับ ctxt เป็น null ได้
    }

    @Test
    public void testSingletonInstance() {
        assertNotNull("Instance should not be null", SubTypeValidator.instance());
        assertSame("Should be singleton", SubTypeValidator.instance(), SubTypeValidator.instance());
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_BlacklistedClass_InvokerTransformer() throws Exception {
        // Trigger Branch 1.1: คลาสอยู่ใน DEFAULT_NO_DESER_CLASS_NAMES
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.apache.commons.collections.functors.InvokerTransformer.class
        );
        validator.validateSubType(context, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_BlacklistedClass_TemplatesImpl() throws Exception {
        // Trigger Branch 1.1: อีกหนึ่งคลาสอันตรายยอดฮิตจาก JDK/Xalan
        JavaType type = TypeFactory.defaultInstance().constructType(
                com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl.class
        );
        validator.validateSubType(context, type);
    }

    @Test
    public void testValidateSubType_SafeStandardClass() throws Exception {
        // Trigger Branch 1.2 & Branch 2.1: คลาสปกติทั่วไปที่ไม่ติดแบล็กลิสต์และไม่ใช่ Spring
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        try {
            validator.validateSubType(context, type);
        } catch (JsonMappingException e) {
            fail("Safe standard class should not throw exception: " + e.getMessage());
        }
    }

    @Test
    public void testValidateSubType_SpringClass_Safe() throws Exception {
        // Trigger Branch 2.2 (False): คลาสของ Spring แต่ไม่มี Superclass เป็น AbstractPointcutAdvisor หรือ AbstractApplicationContext
        JavaType type = TypeFactory.defaultInstance().constructType(org.springframework.core.io.ByteArrayResource.class);
        try {
            validator.validateSubType(context, type);
        } catch (JsonMappingException e) {
            fail("Safe Spring class should pass validation: " + e.getMessage());
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_SpringClass_AbstractApplicationContextHierarchy() throws Exception {
        // Trigger Branch 3.1 (True): คลาสของ Spring ที่สืบทอดมาจาก AbstractApplicationContext (เช่น GenericXmlApplicationContext)
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.springframework.context.support.GenericXmlApplicationContext.class
        );
        validator.validateSubType(context, type);
    }

    @Test
    public void testEdgeCase_ObjectRootClass() throws Exception {
        // Edge Case: ตรวจสอบคลาสรากสุด (Object.class) เพื่อดูการหยุดลูปของ Hierarchy
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        validator.validateSubType(context, type);
    }
}