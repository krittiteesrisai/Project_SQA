package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_impl_CreatorCollectorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#_fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (member != null): False}
 * @utbot.returnsFrom {@code return member;}
 *  */
    @Test
    public void test_fixAccess_MemberEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
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
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class annotatedConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", annotatedConstructorType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = annotatedConstructor;
        AnnotatedConstructor actual = ((AnnotatedConstructor) _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments));
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedConstructor has overridden equals method
        assertEquals(annotatedConstructor, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _fixAccess(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test
    public void test_fixAccess1() throws Throwable  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291) */
        Class creatorCollectorClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class annotatedConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method _fixAccessMethod = creatorCollectorClazz.getDeclaredMethod("_fixAccess", annotatedConstructorType);
        _fixAccessMethod.setAccessible(true);
        java.lang.Object[] _fixAccessMethodArguments = new java.lang.Object[1];
        _fixAccessMethodArguments[0] = annotatedConstructor;
        try {
            _fixAccessMethod.invoke(creatorCollector, _fixAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_fixAccess2() throws Throwable  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Field.toString(Field.java:330)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
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
    public void testAddLongCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
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
        
        assertEquals(-247, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
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
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators3 = creatorCollector._creators[3];
        
        creatorCollector.addLongCreator(annotatedConstructor, true);
        
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
    public void testAddLongCreator_2() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddLongCreator_3() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_LONG, explicit);
 *  */
    @Test
    public void testAddLongCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddLongCreator1() throws Exception  {
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
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addLongCreator(annotatedConstructor, true);
        
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertEquals(8, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddLongCreator2() throws Exception  {
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
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 8;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addLongCreator(annotatedConstructor, true);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddLongCreator3() throws Exception  {
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
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addLongCreator(annotatedConstructor, false);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddLongCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators3 = creatorCollector._creators[3];
        
        creatorCollector.addLongCreator(annotatedMethod, false);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddLongCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(annotatedMethod, false);
    }
    
    @Test
    public void testAddLongCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddLongCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(annotatedConstructor1, false);
    }
    
    @Test
    public void testAddLongCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(annotatedConstructor1, true);
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
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator(CreatorCollector.java:152) */
        creatorCollector.addLongCreator(annotatedMethod1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addLongCreator
    
    ///region Errors report for addLongCreator
    
    public void testAddLongCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.executesCondition {@code (properties.length > 1): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 *  */
    @Test
    public void testAddPropertyCreator_PropertiesLengthLessOrEqual1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(null, false, settableBeanPropertyArray);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        SettableBeanProperty finalSettableBeanPropertyArray0 = settableBeanPropertyArray[0];
        
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
        
        assertNull(finalSettableBeanPropertyArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_PROPS, explicit);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.executesCondition {@code (properties.length > 1): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = properties[i].getName();
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181) */
        creatorCollector.addPropertyCreator(null, false, settableBeanPropertyArray);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.executesCondition {@code (properties.length > 1): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name.length() == 0 && properties[i].getInjectableValueId() != null
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185) */
        creatorCollector.addPropertyCreator(null, false, settableBeanPropertyArray);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178) */
        creatorCollector.addPropertyCreator(annotatedConstructor, true, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178) */
        creatorCollector.addPropertyCreator(null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178) */
        creatorCollector.addPropertyCreator(null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.length > 1
 *  */
    @Test
    public void testAddPropertyCreator_ThrowNullPointerException_5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178) */
        creatorCollector.addPropertyCreator(null, true, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
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
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator3() throws Exception  {
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
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181) */
        creatorCollector.addPropertyCreator(annotatedMethod1, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator4() throws Exception  {
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
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod1, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181) */
        creatorCollector.addPropertyCreator(annotatedMethod, false, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod, false, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {null, null, null, null, null, null, null, null, null};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178) */
        creatorCollector.addPropertyCreator(annotatedConstructor, false, null);
    }
    
    @Test
    public void testAddPropertyCreator10() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:210)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterType(AnnotatedMethod.java:139)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:323)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod1, false, null);
    }
    
    @Test
    public void testAddPropertyCreator11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {null, null, null, null, null, null, null, null, null};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:210)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterType(AnnotatedMethod.java:139)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:323)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod1, false, null);
    }
    
    @Test
    public void testAddPropertyCreator12() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, false, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator13() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181) */
        creatorCollector.addPropertyCreator(null, true, settableBeanPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator14() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {null, null, null, null, null, null, null, null, null};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:210)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterType(AnnotatedMethod.java:139)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:323)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod1, true, null);
    }
    
    @Test
    public void testAddPropertyCreator15() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        AnnotatedMethod annotatedMethod1 = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:210)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterType(AnnotatedMethod.java:139)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:323)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176) */
        creatorCollector.addPropertyCreator(annotatedMethod1, true, null);
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
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        AnnotatedWithParams initialCreatorCollector_creators7 = creatorCollector._creators[7];
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
        creatorCollector.addPropertyCreator(annotatedConstructor, creatorPropertyArray);
        
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
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
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
    public void testAddPropertyCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -127;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
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
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
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
    public void testAddPropertyCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null};
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] initialCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
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
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] finalCreatorCollector_propertyBasedArgs = creatorCollector._propertyBasedArgs;
        
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addPropertyCreator(creator, false, properties);
 *  */
    @Test
    public void testAddPropertyCreator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPropertyCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.CreatorProperty;)
    
    @Test
    public void testAddPropertyCreator16() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = new com.fasterxml.jackson.databind.deser.CreatorProperty[16];
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(annotatedConstructor, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator17() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(annotatedMethod, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator18() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = new com.fasterxml.jackson.databind.deser.CreatorProperty[10];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        creatorPropertyArray[0] = creatorProperty;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:185)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(null, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator19() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 128;
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = new com.fasterxml.jackson.databind.deser.CreatorProperty[12];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        creatorPropertyArray[0] = creatorProperty;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:181)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(null, creatorPropertyArray);
    }
    
    @Test
    public void testAddPropertyCreator20() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {null, null, null, null, null, null, null, null, null};
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:178)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(annotatedConstructor, null);
    }
    
    @Test
    public void testAddPropertyCreator21() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] creatorPropertyArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:176)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addPropertyCreator(CreatorCollector.java:233) */
        creatorCollector.addPropertyCreator(annotatedConstructor1, creatorPropertyArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator
    
    ///region Errors report for addIntCreator
    
    public void testAddIntCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
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
    public void testAddIntCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
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
        
        assertEquals(-251, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
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
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators2 = creatorCollector._creators[2];
        
        creatorCollector.addIntCreator(annotatedConstructor, true);
        
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
    public void testAddIntCreator_21() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddIntCreator_31() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_INT, explicit);
 *  */
    @Test
    public void testAddIntCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddIntCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addIntCreator(annotatedConstructor, true);
        
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertEquals(4, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddIntCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 4;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addIntCreator(annotatedConstructor, true);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddIntCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addIntCreator(annotatedConstructor, false);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddIntCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators2 = creatorCollector._creators[2];
        
        creatorCollector.addIntCreator(annotatedMethod, false);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddIntCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(annotatedMethod, false);
    }
    
    @Test
    public void testAddIntCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddIntCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(annotatedConstructor1, false);
    }
    
    @Test
    public void testAddIntCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddIntCreator10() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[11];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIntCreator(CreatorCollector.java:149) */
        creatorCollector.addIntCreator(annotatedMethod1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator
    
    ///region Errors report for addBooleanCreator
    
    public void testAddBooleanCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
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
    public void testAddBooleanCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
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
        
        assertEquals(-223, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
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
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addBooleanCreator(annotatedConstructor, true);
        
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
    public void testAddBooleanCreator_21() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddBooleanCreator_31() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_BOOLEAN, explicit);
 *  */
    @Test
    public void testAddBooleanCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddBooleanCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addBooleanCreator(annotatedConstructor, true);
        
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertEquals(32, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddBooleanCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 32;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addBooleanCreator(annotatedConstructor, true);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddBooleanCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        _creators[13] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addBooleanCreator(annotatedConstructor, false);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddBooleanCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators5 = creatorCollector._creators[5];
        
        creatorCollector.addBooleanCreator(annotatedMethod, false);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddBooleanCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(annotatedMethod, false);
    }
    
    @Test
    public void testAddBooleanCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[13] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddBooleanCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[13] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(annotatedConstructor1, false);
    }
    
    @Test
    public void testAddBooleanCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[13] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddBooleanCreator10() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[14];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addBooleanCreator(CreatorCollector.java:158) */
        creatorCollector.addBooleanCreator(annotatedMethod1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
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
    public void testAddStringCreator_1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[2];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
        creatorCollector.addStringCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertEquals(-253, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
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
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.addStringCreator(annotatedConstructor, true);
        
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
    public void testAddStringCreator_2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        creatorCollector.addStringCreator(null, true);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertEquals(2, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddStringCreator_3() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_STRING, explicit);
 *  */
    @Test
    public void testAddStringCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddStringCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addStringCreator(annotatedConstructor, true);
        
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertEquals(2, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddStringCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 2;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addStringCreator(annotatedConstructor, true);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddStringCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addStringCreator(annotatedConstructor, false);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddStringCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators1 = creatorCollector._creators[1];
        
        creatorCollector.addStringCreator(annotatedMethod, false);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddStringCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(annotatedMethod, false);
    }
    
    @Test
    public void testAddStringCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddStringCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(annotatedConstructor1, false);
    }
    
    @Test
    public void testAddStringCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[4] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddStringCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[10];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator(CreatorCollector.java:146) */
        creatorCollector.addStringCreator(annotatedMethod1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addStringCreator
    
    ///region Errors report for addStringCreator
    
    public void testAddStringCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
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
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators0 = creatorCollector._creators[0];
        
        creatorCollector.setDefaultCreator(annotatedConstructor);
        
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
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:142) */
        creatorCollector.setDefaultCreator(annotatedConstructor);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _creators[C_DEFAULT] = _fixAccess(creator);
 *  */
    @Test
    public void testSetDefaultCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:142) */
        creatorCollector.setDefaultCreator(annotatedConstructor);
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
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:142) */
        creatorCollector.setDefaultCreator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDefaultCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void testSetDefaultCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:142) */
        creatorCollector.setDefaultCreator(annotatedMethod);
    }
    
    @Test
    public void testSetDefaultCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.setDefaultCreator(CreatorCollector.java:142) */
        creatorCollector.setDefaultCreator(annotatedConstructor);
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
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
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
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator(CreatorCollector.java:246) */
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
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDefaultCreator(CreatorCollector.java:246) */
        creatorCollector.hasDefaultCreator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator
    
    ///region Errors report for addDoubleCreator
    
    public void testAddDoubleCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator1() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
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
    public void testAddDoubleCreator_11() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = -255;
        
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
        
        assertEquals(-239, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
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
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator_4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        AnnotatedWithParams initialCreatorCollector_creators4 = creatorCollector._creators[4];
        
        creatorCollector.addDoubleCreator(annotatedConstructor, true);
        
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
    public void testAddDoubleCreator_21() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean)}
 *  */
    @Test
    public void testAddDoubleCreator_31() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: verifyNonDup(creator, C_DOUBLE, explicit);
 *  */
    @Test
    public void testAddDoubleCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:303)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddDoubleCreator2() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addDoubleCreator(annotatedConstructor, true);
        
        int finalCreatorCollector_explicitCreators = creatorCollector._explicitCreators;
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertEquals(16, finalCreatorCollector_explicitCreators);
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddDoubleCreator3() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        creatorCollector._explicitCreators = 16;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addDoubleCreator(annotatedConstructor, true);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddDoubleCreator4() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedMethod);
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        _creators[8] = ((AnnotatedWithParams) annotatedMethod);
        _creators[9] = ((AnnotatedWithParams) annotatedMethod);
        _creators[10] = ((AnnotatedWithParams) annotatedMethod);
        _creators[11] = ((AnnotatedWithParams) annotatedMethod);
        _creators[12] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        creatorCollector.addDoubleCreator(annotatedConstructor, false);
        
        boolean finalCreatorCollector_hasNonDefaultCreator = creatorCollector._hasNonDefaultCreator;
        
        assertTrue(finalCreatorCollector_hasNonDefaultCreator);
    }
    
    @Test
    public void testAddDoubleCreator5() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        AnnotatedWithParams initialCreatorCollector_creators4 = creatorCollector._creators[4];
        
        creatorCollector.addDoubleCreator(annotatedMethod, false);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean)
    
    @Test
    public void testAddDoubleCreator6() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(annotatedMethod, false);
    }
    
    @Test
    public void testAddDoubleCreator7() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddDoubleCreator8() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(annotatedConstructor1, false);
    }
    
    @Test
    public void testAddDoubleCreator9() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_forceAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _creators[0] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[1] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[2] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[3] = ((AnnotatedWithParams) annotatedConstructor);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
        _creators[5] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[6] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[7] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[8] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[9] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[10] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[11] = ((AnnotatedWithParams) annotatedConstructor);
        _creators[12] = ((AnnotatedWithParams) annotatedConstructor);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        AnnotatedConstructor annotatedConstructor1 = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor1, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:681)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(annotatedConstructor1, true);
    }
    
    @Test
    public void testAddDoubleCreator10() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_canFixAccess", true);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[13];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[0] = ((AnnotatedWithParams) annotatedMethod);
        _creators[1] = ((AnnotatedWithParams) annotatedMethod);
        _creators[2] = ((AnnotatedWithParams) annotatedMethod);
        _creators[3] = ((AnnotatedWithParams) annotatedMethod);
        _creators[4] = ((AnnotatedWithParams) annotatedMethod);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:672)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector._fixAccess(CreatorCollector.java:291)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(CreatorCollector.java:340)
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDoubleCreator(CreatorCollector.java:155) */
        creatorCollector.addDoubleCreator(annotatedMethod1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup
    
    ///region Errors report for verifyNonDup
    
    public void testVerifyNonDup_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDelegatingCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasDelegatingCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDelegatingCreator()}
 * @utbot.returnsFrom {@code return _creators[C_DELEGATE] != null;}
 *  */
    @Test
    public void testHasDelegatingCreator_C_DELEGATEOf_creatorsEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasDelegatingCreator();
        
        assertFalse(actual);
        
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
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDelegatingCreator()}
 * @utbot.returnsFrom {@code return _creators[C_DELEGATE] != null;}
 *  */
    @Test
    public void testHasDelegatingCreator_C_DELEGATEOf_creatorsNotEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[15];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[6] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasDelegatingCreator();
        
        assertTrue(actual);
        
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
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasDelegatingCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDelegatingCreator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _creators[C_DELEGATE] != null;
 *  */
    @Test
    public void testHasDelegatingCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDelegatingCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDelegatingCreator(CreatorCollector.java:253) */
        creatorCollector.hasDelegatingCreator();
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasDelegatingCreator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _creators[C_DELEGATE] != null;
 *  */
    @Test
    public void testHasDelegatingCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasDelegatingCreator(CreatorCollector.java:253) */
        creatorCollector.hasDelegatingCreator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasPropertyBasedCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasPropertyBasedCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasPropertyBasedCreator()}
 * @utbot.returnsFrom {@code return _creators[C_PROPS] != null;}
 *  */
    @Test
    public void testHasPropertyBasedCreator_C_PROPSOf_creatorsEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {null, null, null, null, null, null, null, null, null};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasPropertyBasedCreator();
        
        assertFalse(actual);
        
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
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasPropertyBasedCreator()}
 * @utbot.returnsFrom {@code return _creators[C_PROPS] != null;}
 *  */
    @Test
    public void testHasPropertyBasedCreator_C_PROPSOf_creatorsNotEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = new com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[9];
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _creators[7] = ((AnnotatedWithParams) annotatedMethod);
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        boolean actual = creatorCollector.hasPropertyBasedCreator();
        
        assertTrue(actual);
        
        AnnotatedWithParams finalCreatorCollector_creators0 = creatorCollector._creators[0];
        AnnotatedWithParams finalCreatorCollector_creators1 = creatorCollector._creators[1];
        AnnotatedWithParams finalCreatorCollector_creators2 = creatorCollector._creators[2];
        AnnotatedWithParams finalCreatorCollector_creators3 = creatorCollector._creators[3];
        AnnotatedWithParams finalCreatorCollector_creators4 = creatorCollector._creators[4];
        AnnotatedWithParams finalCreatorCollector_creators5 = creatorCollector._creators[5];
        AnnotatedWithParams finalCreatorCollector_creators6 = creatorCollector._creators[6];
        AnnotatedWithParams finalCreatorCollector_creators8 = creatorCollector._creators[8];
        
        assertNull(finalCreatorCollector_creators0);
        
        assertNull(finalCreatorCollector_creators1);
        
        assertNull(finalCreatorCollector_creators2);
        
        assertNull(finalCreatorCollector_creators3);
        
        assertNull(finalCreatorCollector_creators4);
        
        assertNull(finalCreatorCollector_creators5);
        
        assertNull(finalCreatorCollector_creators6);
        
        assertNull(finalCreatorCollector_creators8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasPropertyBasedCreator()
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasPropertyBasedCreator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _creators[C_PROPS] != null;
 *  */
    @Test
    public void testHasPropertyBasedCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] _creators = {};
        setField(creatorCollector, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "_creators", _creators);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasPropertyBasedCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasPropertyBasedCreator(CreatorCollector.java:260) */
        creatorCollector.hasPropertyBasedCreator();
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#hasPropertyBasedCreator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _creators[C_PROPS] != null;
 *  */
    @Test
    public void testHasPropertyBasedCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasPropertyBasedCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.hasPropertyBasedCreator(CreatorCollector.java:260) */
        creatorCollector.hasPropertyBasedCreator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector._computeDelegateType
    
    ///region Errors report for _computeDelegateType
    
    public void test_computeDelegateType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, boolean, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addDelegatingCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedWithParams#getParameterType(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creator.getParameterType(0).isCollectionLikeType()
 *  */
    @Test
    public void testAddDelegatingCreator_ThrowNullPointerException() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator(CreatorCollector.java:164) */
        creatorCollector.addDelegatingCreator(null, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addDelegatingCreator
    
    ///region Errors report for addDelegatingCreator
    
    public void testAddDelegatingCreator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.addIncompeteParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.executesCondition {@code (_incompleteParameter == null): False}
 *  */
    @Test
    public void testAddIncompeteParameter__incompleteParameterNotEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        AnnotatedParameter _incompleteParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        creatorCollector._incompleteParameter = _incompleteParameter;
        
        creatorCollector.addIncompeteParameter(null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.CreatorCollector#addIncompeteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.executesCondition {@code (_incompleteParameter == null): True}
 *  */
    @Test
    public void testAddIncompeteParameter__incompleteParameterEqualsNull() throws Exception  {
        CreatorCollector creatorCollector = ((CreatorCollector) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        
        creatorCollector.addIncompeteParameter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.CreatorCollector.constructValueInstantiator
    
    ///region Errors report for constructValueInstantiator
    
    public void testConstructValueInstantiator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Constructor
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1081132646454700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1081132646454700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1081132646459600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1081132646454700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1081132646459600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

