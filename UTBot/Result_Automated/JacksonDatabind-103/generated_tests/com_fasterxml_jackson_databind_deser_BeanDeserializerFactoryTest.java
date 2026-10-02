package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.List;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.BeanDescription;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.withConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#verifyMustOverride(java.lang.Class,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return new BeanDeserializerFactory(config);}
 *  */
    @Test
    public void testWithConfig__factoryConfigNotEqualsConfig() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        BeanDeserializerFactory actual = ((BeanDeserializerFactory) beanDeserializerFactory.withConfig(null));
        
        BeanDeserializerFactory expected = new BeanDeserializerFactory(null);
        
        DeserializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        assertNull(actual_factoryConfig);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithConfig__factoryConfigEqualsConfig() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        BeanDeserializerFactory actual = ((BeanDeserializerFactory) beanDeserializerFactory.withConfig(null));
        
        DeserializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        assertNull(actual_factoryConfig);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.reportBadDefinition(beanDesc.getType(), String.format("Unrecognized mutator type for any setter: %s", mutator.getClass()));
 *  */
    @Test
    public void testConstructAnySetter_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:743) */
        beanDeserializerFactory.constructAnySetter(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: "Unrecognized mutator type for any setter: %s"
 *  */
    @Test
    public void testConstructAnySetter_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:744) */
        beanDeserializerFactory.constructAnySetter(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (mutator instanceof AnnotatedMethod): False}
 * @utbot.executesCondition {@code (mutator instanceof AnnotatedField): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedField#getType()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType mapType = af.getType();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructAnySetter_ThrowIllegalArgumentException() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_bindings", _bindings);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_typeFactory", _typeFactory);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(annotatedClass, field, null);
        
        beanDeserializerFactory.constructAnySetter(null, null, annotatedField);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test
    public void testConstructAnySetter1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:743) */
        beanDeserializerFactory.constructAnySetter(null, basicBeanDescription, virtualAnnotatedMember);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._isSetterlessType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _isSetterlessType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#_isSetterlessType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType);
 *  */
    @Test
    public void test_isSetterlessType_ThrowNullPointerException() throws Throwable  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._isSetterlessType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._isSetterlessType(BeanDeserializerFactory.java:601) */
        Class beanDeserializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Method _isSetterlessTypeMethod = beanDeserializerFactoryClazz.getDeclaredMethod("_isSetterlessType", classType);
        _isSetterlessTypeMethod.setAccessible(true);
        java.lang.Object[] _isSetterlessTypeMethodArguments = new java.lang.Object[1];
        _isSetterlessTypeMethodArguments[0] = ((Object) null);
        try {
            _isSetterlessTypeMethod.invoke(beanDeserializerFactory, _isSetterlessTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder, java.util.List, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.lang.Math#max(int,int)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFilterBeanProps_ListIterator() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder, java.util.List, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_forSerialization", true);
        Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        short[] value = {};
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", _getters);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter(POJOPropertyBuilder.java:406)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getPrimaryType(POJOPropertyBuilder.java:325)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getRawPrimaryType(POJOPropertyBuilder.java:358)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:627) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_forSerialization", true);
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        short[] value = {};
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter(POJOPropertyBuilder.java:399)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getPrimaryType(POJOPropertyBuilder.java:325)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getRawPrimaryType(POJOPropertyBuilder.java:358)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:627) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException_2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_forSerialization", true);
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_name, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedField ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedField is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField(POJOPropertyBuilder.java:513)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getPrimaryType(POJOPropertyBuilder.java:327)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getRawPrimaryType(POJOPropertyBuilder.java:358)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:627) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Math.max(4, propDefsIn.size())
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_1() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:618) */
        beanDeserializerFactory.filterBeanProps(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = property.getName();
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:622) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ignored.contains(name)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_2() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, null);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:623) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ignored.contains(name)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:623) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean isConcrete = !beanDesc.getType().isAbstract();
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:451) */
        beanDeserializerFactory.addBeanProps(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder#getValueInstantiator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:453) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean isConcrete = !beanDesc.getType().isAbstract();
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:451) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:453) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, beanDeserializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonIgnoreProperties.Value ignorals = ctxt.getConfig().getDefaultPropertyIgnorals(beanDesc.getBeanClass(), beanDesc.getClassInfo());
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:453) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:453) */
        beanDeserializerFactory.addBeanProps(impl, basicBeanDescription, beanDeserializerBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddBeanProps1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanDeserializerBuilder, "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyIgnorals(MapperConfigBase.java:652)
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyIgnorals(MapperConfigBase.java:671)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:462) */
        beanDeserializerFactory.addBeanProps(impl, basicBeanDescription, beanDeserializerBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (objectIdInfo == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddObjectIdReader_ObjectIdInfoEqualsNull() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.addObjectIdReader(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdInfo objectIdInfo = beanDesc.getObjectIdInfo();
 *  */
    @Test
    public void testAddObjectIdReader_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:329) */
        beanDeserializerFactory.addObjectIdReader(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (objectIdInfo == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getGeneratorType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdResolver resolver = ctxt.objectIdResolverInstance(beanDesc.getClassInfo(), objectIdInfo);
 *  */
    @Test
    public void testAddObjectIdReader_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:338) */
        beanDeserializerFactory.addObjectIdReader(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 *  */
    @Test
    public void testAddInjectables() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 *  */
    @Test
    public void testAddInjectables_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findInjectables()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<Object, AnnotatedMember> raw = beanDesc.findInjectables();
 *  */
    @Test
    public void testAddInjectables_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:694) */
        beanDeserializerFactory.addInjectables(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddInjectables1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedHashMap _injectables = new LinkedHashMap();
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_injectables", _injectables);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddInjectables2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedHashMap _injectables = new LinkedHashMap();
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _injectables.put(null, annotatedMethod);
        Object object = createInstance("java.lang.Object");
        _injectables.put(object, null);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_injectables", _injectables);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getName(AnnotatedMethod.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:698) */
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddInjectables3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapType _type = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getInjectables(POJOPropertiesCollector.java:176)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findInjectables(BasicBeanDescription.java:334)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:694) */
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddInjectables4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getInjectables(POJOPropertiesCollector.java:176)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findInjectables(BasicBeanDescription.java:334)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:694) */
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, beanDeserializerBuilder);
    }
    
    @Test
    public void testAddInjectables5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getInjectables(POJOPropertiesCollector.java:176)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findInjectables(BasicBeanDescription.java:334)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:694) */
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, beanDeserializerBuilder);
    }
    
    @Test
    public void testAddInjectables6() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getInjectables(POJOPropertiesCollector.java:176)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findInjectables(BasicBeanDescription.java:334)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:694) */
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._validateSubType
    
    ///region FUZZER: ERROR SUITE for method _validateSubType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#_validateSubType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void test_validateSubTypeThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._validateSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType(SubTypeValidator.java:96)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory._validateSubType(BeanDeserializerFactory.java:919) */
        beanDeserializerFactory._validateSubType(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map)}
 * @utbot.executesCondition {@code (status != null): False}
 * @utbot.executesCondition {@code (type): True}
 * @utbot.executesCondition {@code (type.isPrimitive()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getConfigOverride(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: status = config.getConfigOverride(type).getIsIgnoredType();
 *  */
    @Test
    public void testIsIgnorableType_ThrowNullPointerException_2() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:898) */
        beanDeserializerFactory.isIgnorableType(null, null, class1, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean status = ignoredTypes.get(type);
 *  */
    @Test
    public void testIsIgnorableType_ThrowNullPointerException() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:889) */
        beanDeserializerFactory.isIgnorableType(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map)}
 * @utbot.executesCondition {@code (status != null): False}
 * @utbot.executesCondition {@code (type): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (type == String.class) || type.isPrimitive()
 *  */
    @Test
    public void testIsIgnorableType_ThrowNullPointerException_1() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:894) */
        beanDeserializerFactory.isIgnorableType(null, null, null, linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class, java.util.Map)
    
    @Test
    public void testIsIgnorableType1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean boolean1 = false;
        linkedHashMap.put(class1, boolean1);
        
        boolean actual = beanDeserializerFactory.isIgnorableType(null, simpleBeanPropertyDefinition, class1, linkedHashMap);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class, java.util.Map)
    
    @Test
    public void testIsIgnorableType2() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty");
        Object prevINSTANCE = getStaticFieldValue(emptyClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty");
            setStaticField(emptyClazz, "INSTANCE", instance);
            BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
            DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
            Class class1 = Object.class;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:269)
                com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:281)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:311)
                com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:900) */
            beanDeserializerFactory.isIgnorableType(deserializationConfig, simpleBeanPropertyDefinition, class1, linkedHashMap);
        } finally {
            setStaticField(emptyClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testIsIgnorableType3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:269)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:281)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:311)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:900) */
        beanDeserializerFactory.isIgnorableType(deserializationConfig, null, class1, linkedHashMap);
    }
    
    @Test
    public void testIsIgnorableType4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(class1, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getConfigOverride(MapperConfigBase.java:603)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:898) */
        beanDeserializerFactory.isIgnorableType(deserializationConfig, null, class1, linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer
    
    ///region FUZZER: ERROR SUITE for method findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testFindStdDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1773)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:161) */
        beanDeserializerFactory.findStdDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void testFindStdDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1812)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:161) */
        beanDeserializerFactory.findStdDeserializer(null, referenceType, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new BeanDeserializerBuilder(beanDesc, ctxt);}
 *  */
    @Test
    public void testConstructBeanDeserializerBuilder_Return() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        BeanDeserializerBuilder actual = beanDeserializerFactory.constructBeanDeserializerBuilder(impl, null);
        
        BeanDeserializerBuilder expected = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "_context", impl);
        LinkedHashMap _properties = new LinkedHashMap();
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "_properties", _properties);
        
        DeserializationConfig actual_config = actual._config;
        assertNull(actual_config);
        
        DeserializationContext expected_context = expected._context;
        DeserializationContext actual_context = actual._context;
        LinkedHashMap actual_context_objectIds = ((LinkedHashMap) getFieldValue(actual_context, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIds"));
        assertNull(actual_context_objectIds);
        
        List actual_context_objectIdResolvers = ((List) getFieldValue(actual_context, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers"));
        assertNull(actual_context_objectIdResolvers);
        
        DeserializerCache actual_context_cache = ((DeserializerCache) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_cache"));
        assertNull(actual_context_cache);
        
        DeserializerFactory actual_context_factory = ((DeserializerFactory) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_factory"));
        assertNull(actual_context_factory);
        
        DeserializationConfig actual_context_config = ((DeserializationConfig) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
        assertNull(actual_context_config);
        
        int expected_context_featureFlags = ((Integer) getFieldValue(expected_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags"));
        int actual_context_featureFlags = ((Integer) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags"));
        assertEquals(expected_context_featureFlags, actual_context_featureFlags);
        
        Class actual_context_view = ((Class) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        assertNull(actual_context_view);
        
        JsonParser actual_context_parser = ((JsonParser) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_parser"));
        assertNull(actual_context_parser);
        
        InjectableValues actual_context_injectableValues = ((InjectableValues) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues"));
        assertNull(actual_context_injectableValues);
        
        ArrayBuilders actual_context_arrayBuilders = ((ArrayBuilders) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_arrayBuilders"));
        assertNull(actual_context_arrayBuilders);
        
        ObjectBuffer actual_context_objectBuffer = ((ObjectBuffer) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer"));
        assertNull(actual_context_objectBuffer);
        
        DateFormat actual_context_dateFormat = ((DateFormat) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat"));
        assertNull(actual_context_dateFormat);
        
        ContextAttributes actual_context_attributes = ((ContextAttributes) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_attributes"));
        assertNull(actual_context_attributes);
        
        LinkedNode actual_context_currentType = ((LinkedNode) getFieldValue(actual_context, "com.fasterxml.jackson.databind.DeserializationContext", "_currentType"));
        assertNull(actual_context_currentType);
        
        BeanDescription actual_beanDesc = actual._beanDesc;
        assertNull(actual_beanDesc);
        
        Map expected_properties = expected._properties;
        Map actual_properties = actual._properties;
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        List actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        HashMap actual_backRefProperties = actual._backRefProperties;
        assertNull(actual_backRefProperties);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        JsonPOJOBuilder.Value actual_builderConfig = actual._builderConfig;
        assertNull(actual_builderConfig);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testConstructBeanDeserializerBuilderThrowsNPE() {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder.<init>(BeanDeserializerBuilder.java:119)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder(BeanDeserializerFactory.java:437) */
        beanDeserializerFactory.constructBeanDeserializerBuilder(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findBackReferences()}
 *  */
    @Test
    public void testAddBackReferenceProperties_BeanDescriptionFindBackReferences() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findBackReferences()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<BeanPropertyDefinition> refProps = beanDesc.findBackReferences();
 *  */
    @Test
    public void testAddBackReferenceProperties_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddBackReferenceProperties1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedHashMap _properties = new LinkedHashMap();
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_properties", _properties);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddBackReferenceProperties2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        PlaceholderForType _type = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties6() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties7() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_type, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, beanDeserializerBuilder);
    }
    
    @Test
    public void testAddBackReferenceProperties8() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_type, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_typeFactory", _typeFactory);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:159)
            com.fasterxml.jackson.databind.introspect.CollectorBase.collectAnnotations(CollectorBase.java:29)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector._addMemberMethods(AnnotatedMethodCollector.java:118)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:42)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, null);
    }
    
    @Test
    public void testAddBackReferenceProperties9() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionType _referencedType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        PlaceholderForType _superClass = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType1);
        setField(_type, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        BeanDeserializerBuilder beanDeserializerBuilder = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:1071)
            com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector._findFields(AnnotatedFieldCollector.java:66)
            com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector.collect(AnnotatedFieldCollector.java:41)
            com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector.collectFields(AnnotatedFieldCollector.java:36)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._fields(AnnotatedClass.java:349)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:321)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652) */
        beanDeserializerFactory.addBackReferenceProperties(null, basicBeanDescription, beanDeserializerBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBackReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 *  */
    @Test
    public void testAddReferenceProperties_BeanDeserializerFactoryAddBackReferenceProperties() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        beanDeserializerFactory.addReferenceProperties(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
     */
    @Test
    public void testAddReferencePropertiesThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBackReferenceProperties(BeanDeserializerFactory.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties(BeanDeserializerFactory.java:683) */
        beanDeserializerFactory.addReferenceProperties(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSettableProperty
    
    ///region Errors report for constructSettableProperty
    
    public void testConstructSettableProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSetterlessProperty
    
    ///region Errors report for constructSetterlessProperty
    
    public void testConstructSetterlessProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isPotentialBeanType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPotentialBeanType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isPotentialBeanType(java.lang.Class)}
 * @utbot.executesCondition {@code (typeStr != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#canBeABeanType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testIsPotentialBeanType_TypeStrNotEqualsNull() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        Class class1 = Object.class;
        
        boolean actual = beanDeserializerFactory.isPotentialBeanType(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMaterializeAbstractType_ReturnNull() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        JavaType actual = beanDeserializerFactory.materializeAbstractType(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMaterializeAbstractType_ConcreteEqualsNull() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = new com.fasterxml.jackson.databind.AbstractTypeResolver[1];
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        _abstractTypeResolvers[0] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType actual = beanDeserializerFactory.materializeAbstractType(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig#abstractTypeResolvers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:178) */
        beanDeserializerFactory.materializeAbstractType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType concrete = r.resolveAbstractType(ctxt.getConfig(), beanDesc);
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException_1() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:179) */
        beanDeserializerFactory.materializeAbstractType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType concrete = r.resolveAbstractType(ctxt.getConfig(), beanDesc);
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException_2() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:179) */
        beanDeserializerFactory.materializeAbstractType(impl, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildThrowableDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildThrowableDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void testBuildThrowableDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:367) */
        beanDeserializerFactory.buildThrowableDeserializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:94) */
        beanDeserializerFactory.createBeanDeserializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isThrowable()
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:104) */
        beanDeserializerFactory.createBeanDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return custom;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return custom;
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        CoreXMLDeserializers coreXMLDeserializers = ((CoreXMLDeserializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) coreXMLDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig.hasAbstractTypeResolvers(DeserializerFactoryConfig.java:184)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1780)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:161)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:125) */
        beanDeserializerFactory.createBeanDeserializer(impl, referenceType, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_3() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        HashMap _classMappings = new HashMap();
        setField(simpleDeserializers, "com.fasterxml.jackson.databind.module.SimpleDeserializers", "_classMappings", _classMappings);
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.module.SimpleDeserializers._find(SimpleDeserializers.java:183)
            com.fasterxml.jackson.databind.module.SimpleDeserializers.findBeanDeserializer(SimpleDeserializers.java:96)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findCustomBeanDeserializer(BasicDeserializerFactory.java:1879)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:96) */
        beanDeserializerFactory.createBeanDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isThrowable()
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:104) */
        beanDeserializerFactory.createBeanDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return custom;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return custom;
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_5() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        HashMap _classMappings = new HashMap();
        ClassKey classKey = ((ClassKey) createInstance("com.fasterxml.jackson.databind.type.ClassKey"));
        Class _class = Object.class;
        setField(classKey, "com.fasterxml.jackson.databind.type.ClassKey", "_class", _class);
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        _classMappings.put(classKey, beanAsArrayDeserializer);
        setField(simpleDeserializers, "com.fasterxml.jackson.databind.module.SimpleDeserializers", "_classMappings", _classMappings);
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig.hasAbstractTypeResolvers(DeserializerFactoryConfig.java:184)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1780)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:161)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:125) */
        beanDeserializerFactory.createBeanDeserializer(impl, simpleType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType builderType = ctxt.constructType(builderClass);
 *  */
    @Test
    public void testCreateBuilderBasedDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer(BeanDeserializerFactory.java:146) */
        beanDeserializerFactory.createBuilderBasedDeserializer(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription builderDesc = ctxt.getConfig().introspectForBuilder(builderType);
 *  */
    @Test
    public void testCreateBuilderBasedDeserializer_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer(BeanDeserializerFactory.java:147) */
        beanDeserializerFactory.createBuilderBasedDeserializer(impl, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class)
    
    @Test
    public void testCreateBuilderBasedDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationConfig.introspectForBuilder(DeserializationConfig.java:748)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer(BeanDeserializerFactory.java:147) */
        beanDeserializerFactory.createBuilderBasedDeserializer(impl, null, null, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer
    
    ///region FUZZER: ERROR SUITE for method buildBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testBuildBeanDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:243)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer(BeanDeserializerFactory.java:214) */
        beanDeserializerFactory.buildBeanDeserializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer
    
    ///region FUZZER: ERROR SUITE for method buildBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testBuildBuilderBasedDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:243)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer(BeanDeserializerFactory.java:273) */
        beanDeserializerFactory.buildBuilderBasedDeserializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1090916320105800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1090916320105800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1090916320110700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090916320105800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090916320110700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1090916323436700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090916323436700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090916323439400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090916323436700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090916323439400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1090916324032699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090916324032699.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090916324034299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090916324032699.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090916324034299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1090916324599999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090916324599999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090916324602700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090916324599999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090916324602700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

