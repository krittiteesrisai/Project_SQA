package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

import java.lang.reflect.Member;
import java.util.*;

import static org.junit.Assert.*;

public class CreatorCollectorTest {

    private BeanDescription beanDescription;
    private MapperConfig<?> config;
    private CreatorCollector collector;

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        beanDescription = mapper.getSerializationConfig().introspectClassAnnotations(TestBean.class);
        config = mapper.getDeserializationConfig();
        collector = new CreatorCollector(beanDescription, config);
    }

    @Test
    public void testVanillaCollectionInstantiator() {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription listDesc = mapper.getSerializationConfig().introspectClassAnnotations(ArrayList.class);
        CreatorCollector listCollector = new CreatorCollector(listDesc, config);
        ValueInstantiator inst = listCollector.constructValueInstantiator(mapper.getDeserializationConfig());
        assertNotNull(inst);
        assertEquals(ArrayList.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaMapInstantiator() {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription mapDesc = mapper.getSerializationConfig().introspectClassAnnotations(LinkedHashMap.class);
        CreatorCollector mapCollector = new CreatorCollector(mapDesc, config);
        ValueInstantiator inst = mapCollector.constructValueInstantiator(mapper.getDeserializationConfig());
        assertNotNull(inst);
        assertEquals(LinkedHashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaHashMapInstantiator() {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription mapDesc = mapper.getSerializationConfig().introspectClassAnnotations(HashMap.class);
        CreatorCollector mapCollector = new CreatorCollector(mapDesc, config);
        ValueInstantiator inst = mapCollector.constructValueInstantiator(mapper.getDeserializationConfig());
        assertNotNull(inst);
        assertEquals(HashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testDefaultAndIncompleteParameter() {
        assertFalse(collector.hasDefaultCreator());
        collector.addIncompeteParameter(null);
        // Test duplicate incomplete parameter ignore branch
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, 0);
        collector.addIncompeteParameter(param);
        assertNotNull(collector._incompleteParameter);
    }

    @Test
    public void testStringAndBasicCreators() {
        DummyAnnotated creator = new DummyAnnotated(String.class);
        collector.addStringCreator(creator, true);
        collector.addIntCreator(creator, false);
        collector.addLongCreator(creator, false);
        collector.addDoubleCreator(creator, false);
        collector.addBooleanCreator(creator, false);
        
        // Deprecated methods
        collector.addStringCreator(creator);
        collector.addIntCreator(creator);
        collector.addLongCreator(creator);
        collector.addDoubleCreator(creator);
        collector.addBooleanCreator(creator);
        
        assertTrue(collector._hasNonDefaultCreator);
    }

    @Test
    public void testDelegatingCreators() {
        DummyAnnotated collectionCreator = new DummyAnnotated(List.class, true);
        collector.addDelegatingCreator(collectionCreator, true, new SettableBeanProperty[0]);
        assertTrue(collector.hasDelegatingCreator() == false); // C_ARRAY_DELEGATE is set instead

        DummyAnnotated standardCreator = new DummyAnnotated(String.class, false);
        collector.addDelegatingCreator(standardCreator, false, null);
        assertTrue(collector.hasDelegatingCreator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicatePropertyCreatorThrowsException() {
        DummyAnnotated creator = new DummyAnnotated(String.class);
        DummyProperty prop1 = new DummyProperty("propName");
        DummyProperty prop2 = new DummyProperty("propName");
        
        collector.addPropertyCreator(creator, true, new SettableBeanProperty[]{prop1, prop2});
    }

    @Test
    public void testPropertyCreatorWithInjectableSkip() {
        DummyAnnotated creator = new DummyAnnotated(String.class);
        DummyProperty prop1 = new DummyProperty("");
        prop1.injectableId = "injectId";
        DummyProperty prop2 = new DummyProperty("validName");
        
        collector.addPropertyCreator(creator, true, new SettableBeanProperty[]{prop1, prop2});
        assertTrue(collector.hasPropertyBasedCreator());
    }

    @Test
    public void testVerifyNonDupConflictAndAssignability() {
        DummyAnnotated creator1 = new DummyAnnotated(CharSequence.class);
        DummyAnnotated creator2 = new DummyAnnotated(String.class); // More specific than CharSequence

        collector.verifyNonDup(creator1, CreatorCollector.C_STRING, true);
        // Should replace with more specific newType (String)
        collector.verifyNonDup(creator2, CreatorCollector.C_STRING, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyNonDupExactSameTypeConflict() {
        DummyAnnotated creator1 = new DummyAnnotated(String.class);
        DummyAnnotated creator2 = new DummyAnnotated(String.class);

        collector.verifyNonDup(creator1, CreatorCollector.C_STRING, true);
        collector.verifyNonDup(creator2, CreatorCollector.C_STRING, true);
    }

    // Helper dummy classes to simulate Jackson introspection without full mocking frameworks
    private static class TestBean {}

    private static class DummyAnnotated extends AnnotatedWithParams {
        private final Class<?> parameterType;
        private final boolean isCollection;

        public DummyAnnotated(Class<?> parameterType) {
            this(parameterType, false);
        }

        public DummyAnnotated(Class<?> parameterType, boolean isCollection) {
            super(null, null);
            this.parameterType = parameterType;
            this.isCollection = isCollection;
        }

        @Override public AnnotatedWithParams withAnnotations(com.fasterxml.jackson.databind.util.Annotations annotations) { return this; }
        @Override public Annotated element(int index) { return null; }
        @Override public Class<?> getRawParameterType(int index) { return parameterType; }
        @Override public JavaType getParameterType(int index) {
            ObjectMapper om = new ObjectMapper();
            JavaType type = om.constructType(parameterType);
            if (isCollection) {
                return om.getTypeFactory().constructCollectionType(List.class, String.class);
            }
            return type;
        }
        @Override public int getParameterCount() { return 1; }
        @Override public Object call() throws Exception { return null; }
        @Override public Object call(Object[] args) throws Exception { return null; }
        @Override public Object call1(Object arg) throws Exception { return null; }
        @Override public Class<?> getDeclaringClass() { return TestBean.class; }
        @Override public Member getAnnotated() { return null; }
        @Override public String getName() { return "dummy"; }
        @Override public JavaType getType() { return null; }
        @Override public boolean equals(Object o) { return this == o; }
        @Override public int hashCode() { return 1; }
        @Override public String toString() { return "DummyAnnotated"; }
    }

    private static class DummyProperty extends SettableBeanProperty {
        private final String name;
        public Object injectableId;

        public DummyProperty(String name) {
            super(PropertyName.construct(name), null, null, null);
            this.name = name;
        }

        @Override public String getName() { return name; }
        @Override public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> des) { return this; }
        @Override public SettableBeanProperty withName(PropertyName newName) { return this; }
        @Override public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}
        @Override public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
        @Override public void set(Object instance, Object value) throws IOException {}
        @Override public Object setAndReturn(Object instance, Object value) throws IOException { return null; }
        @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public AnnotatedMember getMember() { return null; }
        @Override public Object getInjectableValueId() { return injectableId; }
    }
}