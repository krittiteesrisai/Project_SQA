package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        // สมมติฐาน: JsonMappingException.from(ctxt, msg) internally เรียก ctxt.getParser()
        // ซึ่ง mock จะ return null โดย default และ constructor ของ JsonMappingException
        // รองรับ parser = null ได้ (ไม่ได้ตรวจสอบจากซอร์สที่ให้มาโดยตรง)
        ctxt = mock(DeserializationContext.class);
    }

    // ---------- Singleton ----------

    @Test
    public void testInstanceReturnsSameSingleton() {
        SubTypeValidator v1 = SubTypeValidator.instance();
        SubTypeValidator v2 = SubTypeValidator.instance();
        assertSame("instance() ต้อง return singleton เดียวกันทุกครั้ง", v1, v2);
    }

    // ---------- Branch 1: อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassName_FileHandler_Throws() throws Exception {
        // java.util.logging.FileHandler อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES
        JavaType type = TypeFactory.defaultInstance()
                .constructType(java.util.logging.FileHandler.class);
        validator.validateSubType(ctxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassName_UnicastRemoteObject_Throws() throws Exception {
        // java.rmi.server.UnicastRemoteObject อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES เช่นกัน
        JavaType type = TypeFactory.defaultInstance()
                .constructType(java.rmi.server.UnicastRemoteObject.class);
        validator.validateSubType(ctxt, type);
    }

    @Test
    public void testIllegalClassName_MessageContainsClassName() {
        try {
            JavaType type = TypeFactory.defaultInstance()
                    .constructType(java.util.logging.FileHandler.class);
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue("message ควรมีชื่อคลาสที่ผิดกฎ",
                    e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    // ---------- Branch 2: raw.isInterface() == true -> ไม่ throw ----------

    @Test
    public void testInterfaceType_NotInIllegalSet_DoesNotThrow() throws Exception {
        // java.util.Map เป็น interface ธรรมดา ไม่อยู่ใน illegal set, ไม่ใช่ spring
        JavaType type = TypeFactory.defaultInstance().constructType(java.util.Map.class);
        validator.validateSubType(ctxt, type); // ไม่ควร throw
    }

    @Test
    public void testSpringInterfaceType_DoesNotThrow() throws Exception {
        // แม้ full จะขึ้นต้นด้วย "org.springframework." แต่เป็น interface
        // ตรวจ isInterface() ก่อน จึงไม่เข้า else-if ของ spring logic เลย -> ไม่ throw
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.util.SpringMarkerInterface.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 3: ไม่ interface, ไม่ขึ้นต้นด้วย spring prefix -> ไม่ throw ----------

    @Test
    public void testNonSpringClass_DoesNotThrow() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        validator.validateSubType(ctxt, type);
    }

    @Test
    public void testPrimitiveType_BoundaryCase_DoesNotThrow() throws Exception {
        // boundary: primitive type, full = "int", isInterface() = false, ไม่ตรง spring prefix
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 4: spring prefix, match "AbstractPointcutAdvisor" -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testSpringClass_MatchesAbstractPointcutAdvisor_Throws() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.beans.factory.config.AbstractPointcutAdvisor.class);
        validator.validateSubType(ctxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testSpringSubclass_MatchesAncestorAbstractPointcutAdvisor_Throws() throws Exception {
        // ทดสอบว่า for-loop เดินขึ้นไปหลาย superclass จนเจอ match (มากกว่า 1 iteration)
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.aop.support.ConcreteAdvisor.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 5: spring prefix, match "AbstractApplicationContext" -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testSpringClass_MatchesAbstractApplicationContext_Throws() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.context.support.AbstractApplicationContext.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 6: spring prefix, loop จบโดยไม่เจอ match -> ไม่ throw ----------

    @Test
    public void testSpringClass_NoMatch_DoesNotThrow() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.util.SimpleSpringBean.class);
        validator.validateSubType(ctxt, type); // ไม่ควร throw
    }

    // ---------- Null / boundary ----------

    @Test(expected = NullPointerException.class)
    public void testNullType_ThrowsNPE() throws Exception {
        // ซอร์สไม่ได้ null-check type ก่อนเรียก type.getRawClass()
        // จึงคาดว่าจะเกิด NullPointerException (ไม่ใช่ JsonMappingException)
        validator.validateSubType(ctxt, null);
    }
}
