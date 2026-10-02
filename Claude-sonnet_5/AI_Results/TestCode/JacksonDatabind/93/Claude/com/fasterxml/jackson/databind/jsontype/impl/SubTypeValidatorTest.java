// FILE: src/test/java/com/fasterxml/jackson/databind/jsontype/impl/SubTypeValidatorTest.java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.SamplePointcutAdvisorSub;
import org.springframework.aop.support.GrandChildPointcutAdvisor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.SampleApplicationContextSub;
import org.springframework.util.SafeSpringClass;
import org.springframework.util.SpringInterfaceMarker;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        ctxt = mock(DeserializationContext.class);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private JavaType mockJavaTypeFor(Class<?> cls) {
        JavaType type = mock(JavaType.class);
        when(type.getRawClass()).thenReturn((Class) cls);
        return type;
    }

    // ---------- Singleton ----------

    @Test
    public void testInstanceIsSingleton() {
        SubTypeValidator i1 = SubTypeValidator.instance();
        SubTypeValidator i2 = SubTypeValidator.instance();
        assertSame("instance() ต้อง return singleton เดียวกันเสมอ", i1, i2);
    }

    // ---------- Branch A: contains(full) == true -> throw ----------

    @Test
    public void testIllegalClassName_UnicastRemoteObject_throws() throws Exception {
        JavaType type = mockJavaTypeFor(java.rmi.server.UnicastRemoteObject.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException เนื่องจากอยู่ใน DEFAULT_NO_DESER_CLASS_NAMES");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.rmi.server.UnicastRemoteObject"));
        }
    }

    @Test
    public void testIllegalClassName_FileHandler_throws() throws Exception {
        JavaType type = mockJavaTypeFor(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException เนื่องจากอยู่ใน DEFAULT_NO_DESER_CLASS_NAMES");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    // ---------- Branch B: not illegal, not startsWith prefix -> return (no throw) ----------

    @Test
    public void testLegalNonSpringClass_noException() throws Exception {
        JavaType type = mockJavaTypeFor(String.class);
        // ไม่ควร throw อะไรเลย
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch C: startsWith(prefix) true, loop ไม่เจอ match -> return (no throw) ----------

    @Test
    public void testSpringPrefix_NoMatchingSuperclass_noException() throws Exception {
        JavaType type = mockJavaTypeFor(SafeSpringClass.class);
        // full ขึ้นต้นด้วย org.springframework. แต่ superclass chain ไม่มีชื่อต้องห้าม
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch D: startsWith(prefix) true, raw ตรง "AbstractPointcutAdvisor" ทันที -> throw ----------

    @Test
    public void testSpringPrefix_DirectAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(AbstractPointcutAdvisor.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ simpleName ตรงกับ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("AbstractPointcutAdvisor"));
        }
    }

    // ---------- Branch D2: loop ไล่ superclass 1 ชั้นก่อนเจอ match -> throw ----------

    @Test
    public void testSpringPrefix_OneLevelUp_MatchAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(SamplePointcutAdvisorSub.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ชื่อ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("SamplePointcutAdvisorSub"));
        }
    }

    // ---------- Branch D3: loop ไล่ superclass 2 ชั้นก่อนเจอ match -> throw ----------

    @Test
    public void testSpringPrefix_TwoLevelsUp_MatchAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(GrandChildPointcutAdvisor.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ระดับปู่ชื่อ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("GrandChildPointcutAdvisor"));
        }
    }

    // ---------- Branch E: OR เงื่อนไขที่สอง "AbstractApplicationContext" ตรงโดยตรง -> throw ----------

    @Test
    public void testSpringPrefix_DirectAbstractApplicationContext_throws() throws Exception {
        JavaType type = mockJavaTypeFor(AbstractApplicationContext.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ simpleName ตรงกับ AbstractApplicationContext");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("AbstractApplicationContext"));
        }
    }

    // ---------- Branch E2: OR เงื่อนไขที่สอง ผ่าน superclass 1 ชั้น -> throw ----------

    @Test
    public void testSpringPrefix_OneLevelUp_MatchAbstractApplicationContext_throws() throws Exception {
        JavaType type = mockJavaTypeFor(SampleApplicationContextSub.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ชื่อ AbstractApplicationContext");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("SampleApplicationContextSub"));
        }
    }

    // ---------- Edge case: interface ภายใต้ prefix -> NPE (fault-detecting, derived directly from source logic) ----------

    @Test(expected = NullPointerException.class)
    public void testSpringPrefix_InterfaceCausesNPE_dueToGetSuperclassNull() throws Exception {
        // หมายเหตุ: source ไม่มีการตรวจ isInterface() ก่อนเข้า for-loop
        // ดังนั้นเมื่อ raw เป็น interface, getSuperclass() จะ return null
        // ทำให้เกิด NullPointerException ที่ cls.getSimpleName() ในรอบถัดไป
        // พฤติกรรมนี้อนุมานได้ตรงจาก source code จริง ไม่ใช่การเดา
        JavaType type = mockJavaTypeFor(SpringInterfaceMarker.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Boundary: raw class == Object.class (ไม่ illegal, ไม่ spring prefix) ----------

    @Test
    public void testRawClassIsObject_noException() throws Exception {
        JavaType type = mockJavaTypeFor(Object.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Null getRawClass(): ผิดรูปแบบ/ไม่คาดคิด -> NullPointerException จาก raw.getName() ----------

    @Test(expected = NullPointerException.class)
    public void testNullRawClass_throwsNPE() throws Exception {
        JavaType type = mock(JavaType.class);
        when(type.getRawClass()).thenReturn(null);
        validator.validateSubType(ctxt, type);
    }
}
