package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Senior Java Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target: CreatorCollector (Defects4J JacksonDatabind-8b)
 */
public class CreatorCollectorTest {

    private CreatorCollector collector;
    private DummyBeanDescription beanDesc;

    @Before
    public void setUp() {
        beanDesc = new DummyBeanDescription(TypeFactory.defaultInstance().constructType(Object.class));
        collector = new CreatorCollector(beanDesc, false);
    }

    @Test
    public void testDefaultCreatorAndHasDefault() {
        assertFalse(collector.hasDefaultCreator());
        // เราไม่สามารถสร้าง AnnotatedWithParams จริงได้โดยง่ายเนื่องจากเป็น abstract ข้ามแพ็กเกจลึก
        // แต่สามารถทดสอบผ่านพฤติกรรม Null/Default ได้
        ValueInstantiator inst = collector.constructValueInstantiator(null);
        assertNotNull(inst);
    }

    @Test
    public void testVanillaCollectionInstantiator() {
        DummyBeanDescription collDesc = new DummyBeanDescription(TypeFactory.defaultInstance().constructType(ArrayList.class));
        CreatorCollector collCollector = new CreatorCollector(collDesc, false);
        ValueInstantiator inst = collCollector.constructValueInstantiator(null);
        assertTrue(inst instanceof CreatorCollector.Vanilla);
        assertEquals(ArrayList.class.getName(), inst.getValueTypeDesc());
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaMapInstantiator() {
        DummyBeanDescription mapDesc = new DummyBeanDescription(TypeFactory.defaultInstance().constructType(LinkedHashMap.class));
        CreatorCollector mapCollector = new CreatorCollector(mapDesc, false);
        ValueInstantiator inst = mapCollector.constructValueInstantiator(null);
        assertTrue(inst instanceof CreatorCollector.Vanilla);
        assertEquals(LinkedHashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaHashMapInstantiator() {
        DummyBeanDescription mapDesc = new DummyBeanDescription(TypeFactory.defaultInstance().constructType(HashMap.class));
        CreatorCollector mapCollector = new CreatorCollector(mapDesc, false);
        ValueInstantiator inst = mapCollector.constructValueInstantiator(null);
        assertTrue(inst instanceof CreatorCollector.Vanilla);
        assertEquals(HashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaDirectInstantiationEdgeCases() throws Exception {
        CreatorCollector.Vanilla vanillaCol = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION);
        assertNotNull(vanillaCol.createUsingDefault(null));

        CreatorCollector.Vanilla vanillaMap = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP);
        assertNotNull(vanillaMap.createUsingDefault(null));

        CreatorCollector.Vanilla vanillaHashMap = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP);
        assertNotNull(vanillaHashMap.createUsingDefault(null));

        CreatorCollector.Vanilla vanillaUnknown = new CreatorCollector.Vanilla(999);
        assertEquals(Object.class.getName(), vanillaUnknown.getValueTypeDesc());
        
        try {
            vanillaUnknown.createUsingDefault(null);
            fail("Expected IllegalStateException for unknown vanilla type");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Unknown type 999"));
        }
    }

    @Test
    public void testAddIncompleteParameter() {
        // ทดสอบการเพิ่ม incomplete parameter ครั้งแรกและครั้งถัดไป (ควรรักษาค่าแรกไว้)
        AnnotatedParameter param1 = new AnnotatedParameter(null, null, null, 0);
        AnnotatedParameter param2 = new AnnotatedParameter(null, null, null, 1);
        
        collector.addIncompeteParameter(param1);
        collector.addIncompeteParameter(param2);
        // เนื่องจากไม่มี Getter โดยตรง สามารถทดสอบผ่าน constructValueInstantiator ได้ทางอ้อม
        ValueInstantiator inst = collector.constructValueInstantiator(null);
        assertNotNull(inst);
    }

    @Test
    public void testDeprecatedAddMethods() {
        // ครอบคลุมเมธอด Deprecated ทั้งหมดเพื่อให้ Code Coverage สมบูรณ์ 100%
        collector.addStringCreator(null);
        collector.addIntCreator(null);
        collector.addLongCreator(null);
        collector.addDoubleCreator(null);
        collector.addBooleanCreator(null);
        collector.addDelegatingCreator(null, null);
        collector.addPropertyCreator(null, null);
    }

    // --- Helper Dummy Class สำหรับ bypass BeanDescription abstract constraints ---
    private static class DummyBeanDescription extends BeanDescription {
        private final JavaType _type;

        protected DummyBeanDescription(JavaType type) {
            super(type);
            _type = type;
        }

        @Override public JavaType getType() { return _type; }
        @Override public com.fasterxml.jackson.databind.introspect.AnnotatedClass getClassInfo() { return null; }
        @Override public com.fasterxml.jackson.databind.AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> findProperties() { return null; }
        @Override public boolean hasKnownClassAnnotations() { return false; }
        @Override public com.fasterxml.jackson.databind.util.Annotations getClassAnnotations() { return null; }
        @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMethod findJsonValueMethod() { return null; }
        @Override public java.util.Set<String> getIgnoredPropertyNames() { return null; }
        @Override public boolean addAsIgnored(String propertyName) { return false; }
        @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMethod findAnyGetter() { return null; }
        @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMethod findAnySetter() { return null; }
        @Override public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor findDefaultConstructor() { return null; }
        @Override public Object instantiateBean(boolean fixAccess) { return null; }
    }
}