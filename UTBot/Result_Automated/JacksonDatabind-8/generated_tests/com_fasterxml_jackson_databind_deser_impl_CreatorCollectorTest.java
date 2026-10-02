package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_impl_CreatorCollectorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): False}
 * @utbot.executesCondition {@code (maybeVanilla &= !_hasNonDefaultCreator;): True}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return new Vanilla(Vanilla.TYPE_COLLECTION);}
 *  */
    @Test
    public void testConstructValueInstantiator_MaybeVanilla() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        CreatorCollector creatorCollector = new CreatorCollector(basicBeanDescription, false);
        creatorCollector._hasNonDefaultCreator = false;
        
        BeanDescription beanDescription = creatorCollector._beanDesc;
        JavaType beanDescription_beanDesc_type = ((JavaType) getFieldValue(beanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class initialCreatorCollector_beanDesc_type_class = ((Class) getFieldValue(beanDescription_beanDesc_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StdValueInstantiator actual = ((StdValueInstantiator) creatorCollector.constructValueInstantiator(null));
        
        StdValueInstantiator expected = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        String _valueTypeDesc = "[collection type; class java.lang.Object, contains null]";
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc", _valueTypeDesc);
        
        String expected_valueTypeDesc = ((String) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
        String actual_valueTypeDesc = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
        assertEquals(expected_valueTypeDesc, actual_valueTypeDesc);
        
        AnnotatedWithParams actual_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
        assertNull(actual_defaultCreator);
        
        AnnotatedWithParams actual_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
        assertNull(actual_withArgsCreator);
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] actual_constructorArguments = ((com.fasterxml.jackson.databind.deser.CreatorProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
        assertNull(actual_constructorArguments);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
        assertNull(actual_delegateType);
        
        AnnotatedWithParams actual_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
        assertNull(actual_delegateCreator);
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] actual_delegateArguments = ((com.fasterxml.jackson.databind.deser.CreatorProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
        assertNull(actual_delegateArguments);
        
        AnnotatedWithParams actual_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
        assertNull(actual_fromStringCreator);
        
        AnnotatedWithParams actual_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
        assertNull(actual_fromIntCreator);
        
        AnnotatedWithParams actual_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
        assertNull(actual_fromLongCreator);
        
        AnnotatedWithParams actual_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
        assertNull(actual_fromDoubleCreator);
        
        AnnotatedWithParams actual_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
        assertNull(actual_fromBooleanCreator);
        
        AnnotatedParameter actual_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
        assertNull(actual_incompleteParameter);
        
        BeanDescription beanDescription1 = creatorCollector._beanDesc;
        JavaType beanDescription1_beanDesc_type = ((JavaType) getFieldValue(beanDescription1, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class finalCreatorCollector_beanDesc_type_class = ((Class) getFieldValue(beanDescription1_beanDesc_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCreatorCollector_beanDesc_type_class == finalCreatorCollector_beanDesc_type_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: maybeVanilla || (_creators[C_DELEGATE] == null)
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._hasNonDefaultCreator = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:86) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.executesCondition {@code (_creators[C_DELEGATE] == null): True}
 * @utbot.executesCondition {@code (maybeVanilla &= !_hasNonDefaultCreator;): False}
 * @utbot.executesCondition {@code (maybeVanilla): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inst.configureFromObjectSettings(_creators[C_DEFAULT], _creators[C_DELEGATE], delegateType, _delegateArgs, _creators[C_PROPS], _propertyBasedArgs);
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_beanDesc", _beanDesc);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._hasNonDefaultCreator = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:126) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: maybeVanilla || (_creators[C_DELEGATE] == null)
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        creatorCollector._hasNonDefaultCreator = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:86) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.executesCondition {@code (_creators[C_DELEGATE] == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType type = _beanDesc.getType();
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._hasNonDefaultCreator = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:103) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType type = _beanDesc.getType();
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowNullPointerException_2() {
        CreatorCollector creatorCollector = new CreatorCollector(null, false);
        creatorCollector._hasNonDefaultCreator = false;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:103) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.executesCondition {@code (_creators[C_DELEGATE] == null): False}
 * @utbot.executesCondition {@code (_delegateArgs != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#bindingsForBeanType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeBindings bindings = _beanDesc.bindingsForBeanType();
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowNullPointerException_3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._hasNonDefaultCreator = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:99) */
        creatorCollector.constructValueInstantiator(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#constructValueInstantiator(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (maybeVanilla): False}
 * @utbot.executesCondition {@code (maybeVanilla &= !_hasNonDefaultCreator;): True}
 * @utbot.executesCondition {@code (maybeVanilla): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> rawType = type.getRawClass();
 *  */
    @Test
    public void testConstructValueInstantiator_ThrowNullPointerException_4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CreatorCollector creatorCollector = new CreatorCollector(basicBeanDescription, false);
        creatorCollector._hasNonDefaultCreator = false;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator(CreatorCollector.java:113) */
        creatorCollector.constructValueInstantiator(null);
    }
    ///endregion
    
    ///region Errors report for constructValueInstantiator
    
    public void testConstructValueInstantiator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIncompeteParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.executesCondition {@code (_incompleteParameter == null): True}
 *  */
    @Test
    public void testAddIncompeteParameter__incompleteParameterEqualsNull() {
        CreatorCollector creatorCollector = new CreatorCollector(null, false);
        
        creatorCollector.addIncompeteParameter(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.executesCondition {@code (_incompleteParameter == null): False}
 *  */
    @Test
    public void testAddIncompeteParameter__incompleteParameterNotEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = new CreatorCollector(null, false);
        AnnotatedParameter _incompleteParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        creatorCollector._incompleteParameter = _incompleteParameter;
        
        creatorCollector.addIncompeteParameter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDelegatingCreator(null, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -191;
        
        creatorCollector.addDelegatingCreator(null, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addDelegatingCreator(creator, false, injectables);
 *  */
    @Test
    public void testAddDelegatingCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:235) */
        creatorCollector.addDelegatingCreator(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddDelegatingCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:235) */
        creatorCollector.addDelegatingCreator(annotatedConstructor, creatorPropertyArray);
    }
    
    @Test
    public void testAddDelegatingCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        _creators[14] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:235) */
        creatorCollector.addDelegatingCreator(annotatedMethod1, creatorPropertyArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, false, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -191;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, true, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -191;
        
        creatorCollector.addDelegatingCreator(null, false, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember) twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, true, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertEquals(64, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_31() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDelegatingCreator(null, false, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddDelegatingCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDelegatingCreator(null, true, null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertEquals(64, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_DELEGATE, explicit);
 *  */
    @Test
    public void testAddDelegatingCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176) */
        creatorCollector.addDelegatingCreator(null, false, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddDelegatingCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        AnnotatedWithParams initialCreatorCollector_creators6 = creatorCollector._creators[6];
        
        creatorCollector.addDelegatingCreator(annotatedMethod, false, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        AnnotatedWithParams finalCreatorCollector_creators14 = creatorCollector._creators[14];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        CreatorProperty finalCreatorPropertyArray1 = creatorPropertyArray[1];
        CreatorProperty finalCreatorPropertyArray2 = creatorPropertyArray[2];
        CreatorProperty finalCreatorPropertyArray3 = creatorPropertyArray[3];
        CreatorProperty finalCreatorPropertyArray4 = creatorPropertyArray[4];
        CreatorProperty finalCreatorPropertyArray5 = creatorPropertyArray[5];
        CreatorProperty finalCreatorPropertyArray6 = creatorPropertyArray[6];
        CreatorProperty finalCreatorPropertyArray7 = creatorPropertyArray[7];
        CreatorProperty finalCreatorPropertyArray8 = creatorPropertyArray[8];
        
        assertFalse(initialCreatorCollector_creators6 == finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertNull(finalCreatorCollector_creators14);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
        
        assertNull(finalCreatorPropertyArray1);
        
        assertNull(finalCreatorPropertyArray2);
        
        assertNull(finalCreatorPropertyArray3);
        
        assertNull(finalCreatorPropertyArray4);
        
        assertNull(finalCreatorPropertyArray5);
        
        assertNull(finalCreatorPropertyArray6);
        
        assertNull(finalCreatorPropertyArray7);
        
        assertNull(finalCreatorPropertyArray8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddDelegatingCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176) */
        creatorCollector.addDelegatingCreator(annotatedConstructor, true, creatorPropertyArray);
    }
    
    @Test
    public void testAddDelegatingCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        _creators[14] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176) */
        creatorCollector.addDelegatingCreator(annotatedMethod1, false, creatorPropertyArray);
    }
    
    @Test
    public void testAddDelegatingCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:176) */
        creatorCollector.addDelegatingCreator(annotatedMethod, true, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddDoubleCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addDoubleCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddDoubleCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        
        creatorCollector.addDoubleCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddDoubleCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDoubleCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addBooleanCreator(creator, false);
 *  */
    @Test
    public void testAddDoubleCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:226) */
        creatorCollector.addDoubleCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testAddDoubleCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:226) */
        creatorCollector.addDoubleCreator(annotatedConstructor1);
    }
    
    @Test
    public void testAddDoubleCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:226) */
        creatorCollector.addDoubleCreator(annotatedConstructor);
    }
    
    @Test
    public void testAddDoubleCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:226) */
        creatorCollector.addDoubleCreator(annotatedMethod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators4 = creatorCollector._creators[4];
        
        creatorCollector.addDoubleCreator(annotatedMethod, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators4 == finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertEquals(16, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -239;
        
        creatorCollector.addDoubleCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDoubleCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_DOUBLE, explicit);
 *  */
    @Test
    public void testAddDoubleCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_DOUBLE, explicit);
 *  */
    @Test
    public void testAddDoubleCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(annotatedConstructor1, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_DOUBLE, explicit);
 *  */
    @Test
    public void testAddDoubleCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -239;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(annotatedConstructor1, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddDoubleCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators4 = creatorCollector._creators[4];
        
        creatorCollector.addDoubleCreator(annotatedConstructor, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators4 == finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddDoubleCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addDoubleCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertEquals(16, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddDoubleCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(annotatedConstructor, true);
    }
    
    @Test
    public void testAddDoubleCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(annotatedMethod1, true);
    }
    
    @Test
    public void testAddDoubleCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:167) */
        creatorCollector.addDoubleCreator(annotatedMethod1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddIntCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addIntCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddIntCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        
        creatorCollector.addIntCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddIntCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addIntCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addBooleanCreator(creator, false);
 *  */
    @Test
    public void testAddIntCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:218) */
        creatorCollector.addIntCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testAddIntCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:218) */
        creatorCollector.addIntCreator(annotatedConstructor1);
    }
    
    @Test
    public void testAddIntCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:218) */
        creatorCollector.addIntCreator(annotatedConstructor);
    }
    
    @Test
    public void testAddIntCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:218) */
        creatorCollector.addIntCreator(annotatedMethod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators2 = creatorCollector._creators[2];
        
        creatorCollector.addIntCreator(annotatedMethod, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators2 == finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertEquals(4, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -251;
        
        creatorCollector.addIntCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addIntCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_INT, explicit);
 *  */
    @Test
    public void testAddIntCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_INT, explicit);
 *  */
    @Test
    public void testAddIntCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(annotatedConstructor1, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_INT, explicit);
 *  */
    @Test
    public void testAddIntCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -251;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(annotatedConstructor1, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddIntCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators2 = creatorCollector._creators[2];
        
        creatorCollector.addIntCreator(annotatedConstructor, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators2 == finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddIntCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addIntCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertEquals(4, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddIntCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(annotatedConstructor, true);
    }
    
    @Test
    public void testAddIntCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(annotatedMethod1, true);
    }
    
    @Test
    public void testAddIntCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:161) */
        creatorCollector.addIntCreator(annotatedMethod1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddBooleanCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addBooleanCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddBooleanCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        
        creatorCollector.addBooleanCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddBooleanCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addBooleanCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addBooleanCreator(creator, false);
 *  */
    @Test
    public void testAddBooleanCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:230) */
        creatorCollector.addBooleanCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testAddBooleanCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:230) */
        creatorCollector.addBooleanCreator(annotatedConstructor1);
    }
    
    @Test
    public void testAddBooleanCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:230) */
        creatorCollector.addBooleanCreator(annotatedConstructor);
    }
    
    @Test
    public void testAddBooleanCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:230) */
        creatorCollector.addBooleanCreator(annotatedMethod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addBooleanCreator(annotatedMethod, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertEquals(32, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        
        creatorCollector.addBooleanCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addBooleanCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_BOOLEAN, explicit);
 *  */
    @Test
    public void testAddBooleanCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_BOOLEAN, explicit);
 *  */
    @Test
    public void testAddBooleanCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(annotatedConstructor1, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_BOOLEAN, explicit);
 *  */
    @Test
    public void testAddBooleanCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(annotatedConstructor1, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddBooleanCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addBooleanCreator(annotatedConstructor, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddBooleanCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addBooleanCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertEquals(32, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddBooleanCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(annotatedConstructor, true);
    }
    
    @Test
    public void testAddBooleanCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(annotatedMethod1, true);
    }
    
    @Test
    public void testAddBooleanCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170) */
        creatorCollector.addBooleanCreator(annotatedMethod1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddPropertyCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(null, false, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        
        assertFalse(initialCreatorCollector_propertyBasedArgs == finalCreatorCollector_propertyBasedArgs);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddPropertyCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(null, false, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        
        assertFalse(initialCreatorCollector_propertyBasedArgs == finalCreatorCollector_propertyBasedArgs);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_PROPS, explicit);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183) */
        creatorCollector.addPropertyCreator(null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_PROPS, explicit);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(annotatedMethod, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_PROPS, explicit);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(annotatedMethod, true, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(annotatedMethod, true, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[17];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(null, true, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddPropertyCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor1);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:188) */
        creatorCollector.addPropertyCreator(annotatedConstructor, false, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183) */
        creatorCollector.addPropertyCreator(annotatedConstructor, true, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183) */
        creatorCollector.addPropertyCreator(annotatedConstructor, false, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:188) */
        creatorCollector.addPropertyCreator(annotatedMethod1, false, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183) */
        creatorCollector.addPropertyCreator(annotatedMethod1, true, creatorPropertyArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddPropertyCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        AnnotatedWithParams initialCreatorCollector_creators7 = creatorCollector._creators[7];
        com.fasterxml.jackson.databind.deser.CreatorProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(annotatedMethod, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        
        assertFalse(initialCreatorCollector_creators7 == finalCreatorCollector_creators7);
        
        assertFalse(initialCreatorCollector_propertyBasedArgs == finalCreatorCollector_propertyBasedArgs);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddPropertyCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(null, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        
        assertFalse(initialCreatorCollector_propertyBasedArgs == finalCreatorCollector_propertyBasedArgs);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 *  */
    @Test
    public void testAddPropertyCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.CreatorProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(null, creatorPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        CreatorProperty finalCreatorPropertyArray0 = creatorPropertyArray[0];
        
        assertFalse(initialCreatorCollector_propertyBasedArgs == finalCreatorCollector_propertyBasedArgs);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
        
        assertNull(finalCreatorPropertyArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addPropertyCreator(creator, false, properties);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addPropertyCreator(creator, false, properties);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(annotatedMethod, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddPropertyCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:188)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = new com.fasterxml.jackson.databind.deser.CreatorProperty[10];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        creatorPropertyArray[0] = creatorProperty;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:192)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(annotatedMethod, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(annotatedConstructor, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator10() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:183)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:240) */
        creatorCollector.addPropertyCreator(annotatedMethod1, creatorPropertyArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.addStringCreator(annotatedMethod, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators1 == finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertEquals(2, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -254;
        
        creatorCollector.addStringCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addStringCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_STRING, explicit);
 *  */
    @Test
    public void testAddStringCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_STRING, explicit);
 *  */
    @Test
    public void testAddStringCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(annotatedConstructor1, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_STRING, explicit);
 *  */
    @Test
    public void testAddStringCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -254;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(annotatedConstructor1, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddStringCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.addStringCreator(annotatedConstructor, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators1 == finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddStringCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addStringCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertEquals(2, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddStringCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(annotatedConstructor, true);
    }
    
    @Test
    public void testAddStringCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(annotatedMethod1, true);
    }
    
    @Test
    public void testAddStringCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158) */
        creatorCollector.addStringCreator(annotatedMethod1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddStringCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.addStringCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators1 == finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddStringCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -254;
        
        creatorCollector.addStringCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddStringCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addStringCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addStringCreator(creator, false);
 *  */
    @Test
    public void testAddStringCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:214) */
        creatorCollector.addStringCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testAddStringCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:214) */
        creatorCollector.addStringCreator(annotatedConstructor1);
    }
    
    @Test
    public void testAddStringCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:214) */
        creatorCollector.addStringCreator(annotatedConstructor);
    }
    
    @Test
    public void testAddStringCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:158)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:214) */
        creatorCollector.addStringCreator(annotatedMethod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
 *  */
    @Test
    public void testSetDefaultCreator_CreatorCollector_fixAccess() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators0 = creatorCollector._creators[0];
        
        creatorCollector.setDefaultCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        
        assertFalse(initialCreatorCollector_creators0 == finalCreatorCollector_creators0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _creators[C_DEFAULT] = _fixAccess(creator);
 *  */
    @Test
    public void testSetDefaultCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:154) */
        creatorCollector.setDefaultCreator(annotatedMethod);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _creators[C_DEFAULT] = _fixAccess(creator);
 *  */
    @Test
    public void testSetDefaultCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:154) */
        creatorCollector.setDefaultCreator(annotatedMethod);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _creators[C_DEFAULT] = _fixAccess(creator);
 *  */
    @Test
    public void testSetDefaultCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:154) */
        creatorCollector.setDefaultCreator(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testSetDefaultCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.setDefaultCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testSetDefaultCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:154) */
        creatorCollector.setDefaultCreator(annotatedMethod);
    }
    
    @Test
    public void testSetDefaultCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:154) */
        creatorCollector.setDefaultCreator(annotatedConstructor);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddLongCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addLongCreator(annotatedMethod);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators5 == finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddLongCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -223;
        
        creatorCollector.addLongCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testAddLongCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addLongCreator(null);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        AnnotatedWithParams finalCreatorCollector_creators9 = creatorCollector._creators[9];
        AnnotatedWithParams finalCreatorCollector_creators10 = creatorCollector._creators[10];
        AnnotatedWithParams finalCreatorCollector_creators11 = creatorCollector._creators[11];
        AnnotatedWithParams finalCreatorCollector_creators12 = creatorCollector._creators[12];
        AnnotatedWithParams finalCreatorCollector_creators13 = creatorCollector._creators[13];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertNull(finalCreatorCollector_creators9);
        
        assertNull(finalCreatorCollector_creators10);
        
        assertNull(finalCreatorCollector_creators11);
        
        assertNull(finalCreatorCollector_creators12);
        
        assertNull(finalCreatorCollector_creators13);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addBooleanCreator(creator, false);
 *  */
    @Test
    public void testAddLongCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:222) */
        creatorCollector.addLongCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testAddLongCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:222) */
        creatorCollector.addLongCreator(annotatedConstructor1);
    }
    
    @Test
    public void testAddLongCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:222) */
        creatorCollector.addLongCreator(annotatedConstructor);
    }
    
    @Test
    public void testAddLongCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:170)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:222) */
        creatorCollector.addLongCreator(annotatedMethod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators3 = creatorCollector._creators[3];
        
        creatorCollector.addLongCreator(annotatedMethod, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators3 == finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertEquals(8, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -247;
        
        creatorCollector.addLongCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator_21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addLongCreator(null, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_LONG, explicit);
 *  */
    @Test
    public void testAddLongCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_LONG, explicit);
 *  */
    @Test
    public void testAddLongCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(annotatedConstructor1, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(creator, C_LONG, explicit);
 *  */
    @Test
    public void testAddLongCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -247;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(annotatedConstructor1, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddLongCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators3 = creatorCollector._creators[3];
        
        creatorCollector.addLongCreator(annotatedConstructor, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators3 == finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddLongCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addLongCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertEquals(8, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddLongCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(annotatedConstructor, true);
    }
    
    @Test
    public void testAddLongCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(annotatedMethod1, true);
    }
    
    @Test
    public void testAddLongCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:164) */
        creatorCollector.addLongCreator(annotatedMethod1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (oldOne != null): True}
 * @utbot.executesCondition {@code ((_explicitCreators & mask) != 0): True}
 * @utbot.executesCondition {@code (!explicit): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVerifyNonDup_NotExplicit() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
        creatorCollector.verifyNonDup(null, 0, false);
        
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (oldOne != null): False}
    /// invoke:
    ///     com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember) twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (explicit): False}
 *  */
    @Test
    public void testVerifyNonDup_NotExplicit_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.verifyNonDup(annotatedMethod, 1, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators1 == finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (explicit): True}
 *  */
    @Test
    public void testVerifyNonDup_Explicit() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.verifyNonDup(annotatedMethod, 1, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators1 == finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators0);
        
        assertEquals(2, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (explicit): False}
 *  */
    @Test
    public void testVerifyNonDup_NotExplicit_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.verifyNonDup(null, 1, false);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: AnnotatedWithParams oldOne = _creators[typeIndex];
 *  */
    @Test
    public void testVerifyNonDup_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280) */
        creatorCollector.verifyNonDup(null, -256, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (oldOne != null): True}
 * @utbot.executesCondition {@code ((_explicitCreators & mask) != 0): False}
 * @utbot.executesCondition {@code (oldOne.getClass() == newOne.getClass()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: oldOne.getClass() == newOne.getClass()
 *  */
    @Test
    public void testVerifyNonDup_ThrowNullPointerException_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297) */
        creatorCollector.verifyNonDup(annotatedConstructor1, 0, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (oldOne != null): True}
 * @utbot.executesCondition {@code ((_explicitCreators & mask) != 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: oldOne.getClass() == newOne.getClass()
 *  */
    @Test
    public void testVerifyNonDup_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:294) */
        creatorCollector.verifyNonDup(null, 0, false);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.executesCondition {@code (oldOne != null): True}
 * @utbot.executesCondition {@code ((_explicitCreators & mask) != 0): True}
 * @utbot.executesCondition {@code (!explicit): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: oldOne.getClass() == newOne.getClass()
 *  */
    @Test
    public void testVerifyNonDup_ThrowNullPointerException_3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:294) */
        creatorCollector.verifyNonDup(null, 0, true);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedWithParams oldOne = _creators[typeIndex];
 *  */
    @Test
    public void testVerifyNonDup_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280) */
        creatorCollector.verifyNonDup(null, -255, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean)
    
    @Test
    public void testVerifyNonDup1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.verifyNonDup(null, 0, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertEquals(1, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean)
    
    @Test
    public void testVerifyNonDup2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307) */
        creatorCollector.verifyNonDup(annotatedConstructor, 0, true);
    }
    
    @Test
    public void testVerifyNonDup3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307) */
        creatorCollector.verifyNonDup(annotatedMethod1, 0, true);
    }
    
    @Test
    public void testVerifyNonDup4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307) */
        creatorCollector.verifyNonDup(annotatedMethod1, 0, false);
    }
    
    @Test
    public void testVerifyNonDup5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307) */
        creatorCollector.verifyNonDup(annotatedConstructor, 0, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int)}
 * @utbot.returnsFrom {@code return _creators[typeIndex];}
 *  */
    @Test
    public void testVerifyNonDup_ReturnTypeIndexOf_creators_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        AnnotatedWithParams actual = creatorCollector.verifyNonDup(null, 1);
        
        assertNull(actual);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int)}
 * @utbot.returnsFrom {@code return _creators[typeIndex];}
 *  */
    @Test
    public void testVerifyNonDup_ReturnTypeIndexOf_creators() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
        AnnotatedConstructor actual = ((AnnotatedConstructor) creatorCollector.verifyNonDup(null, 0));
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedConstructor has overridden equals method
        assertEquals(annotatedConstructor, actual);
        
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int)}
 * @utbot.returnsFrom {@code return _creators[typeIndex];}
 *  */
    @Test
    public void testVerifyNonDup_ReturnTypeIndexOf_creators_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators0 = creatorCollector._creators[0];
        
        AnnotatedMethod actual = ((AnnotatedMethod) creatorCollector.verifyNonDup(annotatedMethod, 0));
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(annotatedMethod, actual);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators7 = creatorCollector._creators[7];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertFalse(initialCreatorCollector_creators0 == finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators7);
        
        assertNull(finalCreatorCollector_creators8);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(newOne, typeIndex, false);
 *  */
    @Test
    public void testVerifyNonDup_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:280)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:245) */
        creatorCollector.verifyNonDup(null, 129);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: verifyNonDup(newOne, typeIndex, false);
 *  */
    @Test
    public void testVerifyNonDup_ThrowNullPointerException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -254;
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:70)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.toString(AnnotatedConstructor.java:169)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:297)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:245) */
        creatorCollector.verifyNonDup(annotatedConstructor1, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int)
    
    @Test
    public void testVerifyNonDup6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod1, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:307)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:245) */
        creatorCollector.verifyNonDup(annotatedMethod1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasDefaultCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDefaultCreator()}
 * @utbot.returnsFrom {@code return _creators[C_DEFAULT] != null;}
 *  */
    @Test
    public void testHasDefaultCreator_C_DEFAULTOf_creatorsEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasDefaultCreator();
        
        assertFalse(actual);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        
        assertNull(finalCreatorCollector_creators0);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDefaultCreator()}
 * @utbot.returnsFrom {@code return _creators[C_DEFAULT] != null;}
 *  */
    @Test
    public void testHasDefaultCreator_C_DEFAULTOf_creatorsNotEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[1];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasDefaultCreator();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasDefaultCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDefaultCreator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _creators[C_DEFAULT] != null;
 *  */
    @Test
    public void testHasDefaultCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator(CreatorCollector.java:259) */
        creatorCollector.hasDefaultCreator();
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDefaultCreator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _creators[C_DEFAULT] != null;
 *  */
    @Test
    public void testHasDefaultCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator(CreatorCollector.java:259) */
        creatorCollector.hasDefaultCreator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (member != null): False}
 * @utbot.returnsFrom {@code return member;}
 *  */
    @Test
    public void test_fixAccess_MemberEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CreatorCollector creatorCollector = new CreatorCollector(null, false);
        
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", annotatedMemberType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = ((Object) null);
        AnnotatedMember actual = ((AnnotatedMember) _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (member != null): True}
 * @utbot.executesCondition {@code (_canFixAccess): False}
 * @utbot.returnsFrom {@code return member;}
 *  */
    @Test
    public void test_fixAccess_Not_canFixAccess() throws Exception  {
        CreatorCollector creatorCollector = new CreatorCollector(null, false);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class annotatedMethodType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", annotatedMethodType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = annotatedMethod;
        AnnotatedMethod actual = ((AnnotatedMethod) _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments));
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(annotatedMethod, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test
    public void test_fixAccess1() throws Throwable  {
        CreatorCollector creatorCollector = new CreatorCollector(null, true);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Field.toString(Field.java:330)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271) */
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class annotatedFieldType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", annotatedFieldType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = annotatedField;
        try {
            _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_fixAccess2() throws Throwable  {
        CreatorCollector creatorCollector = new CreatorCollector(null, true);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:271) */
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class virtualAnnotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", virtualAnnotatedMemberType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = virtualAnnotatedMember;
        try {
            _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1064032496049000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1064032496049000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1064032496053100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064032496049000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064032496053100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1064032496346300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064032496346300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064032496348900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064032496346300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064032496348900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

