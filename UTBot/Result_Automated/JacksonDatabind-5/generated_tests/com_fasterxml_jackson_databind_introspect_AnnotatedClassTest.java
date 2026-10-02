package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.lang.reflect.Type;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import java.util.Map;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import jdk.internal.vm.annotation.IntrinsicCandidate;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_introspect_AnnotatedClassTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.annotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method annotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#annotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): False}
 * @utbot.returnsFrom {@code return _classAnnotations.annotations();}
 *  */
    @Test
    public void testAnnotations__classAnnotationsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        annotatedClass._classAnnotations = _classAnnotations;
        
        List actual = ((List) annotatedClass.annotations());
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#annotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.returnsFrom {@code return _classAnnotations.annotations();}
 *  */
    @Test
    public void testAnnotations__classAnnotationsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        List actual = ((List) annotatedClass.annotations());
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method annotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#annotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveClassAnnotations();
 *  */
    @Test
    public void testAnnotations_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.annotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.annotations(AnnotatedClass.java:191) */
        annotatedClass.annotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetName_ClassGetName() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        String actual = annotatedClass.getName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getName(AnnotatedClass.java:167) */
        annotatedClass.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "[AnnotedClass " + _class.getName() + "]";}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        String actual = annotatedClass.toString();
        
        String expected = "[AnnotedClass java.lang.Object]";
        
        assertEquals(expected, actual);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return "[AnnotedClass " + _class.getName() + "]";
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.toString(AnnotatedClass.java:1025) */
        annotatedClass.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getModifiers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModifiers()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getModifiers()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetModifiers_ClassGetModifiers() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        int actual = annotatedClass.getModifiers();
        
        assertEquals(1, actual);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getModifiers()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getModifiers()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetModifiers_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getModifiers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getModifiers(AnnotatedClass.java:164) */
        annotatedClass.getModifiers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getConstructors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstructors()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getConstructors()}
 * @utbot.executesCondition {@code (!_creatorsResolved): False}
 * @utbot.returnsFrom {@code return _constructors;}
 *  */
    @Test
    public void testGetConstructors__creatorsResolved() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        annotatedClass._creatorsResolved = true;
        
        List actual = annotatedClass.getConstructors();
        
        assertNull(actual);
        
        List finalAnnotatedClass_constructors = annotatedClass._constructors;
        
        assertNull(finalAnnotatedClass_constructors);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConstructors()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getConstructors()}
 * @utbot.executesCondition {@code (!_creatorsResolved): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveCreators()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveCreators();
 *  */
    @Test
    public void testGetConstructors_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getConstructors] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:335)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getConstructors(AnnotatedClass.java:235) */
        annotatedClass.getConstructors();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fields()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#fields()}
 * @utbot.executesCondition {@code (_fields == null): False}
 * @utbot.returnsFrom {@code return _fields;}
 *  */
    @Test
    public void testFields__fieldsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        
        ArrayList actual = ((ArrayList) annotatedClass.fields());
        
        assertTrue(deepEquals(_fields, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_classAnnotations == null): False}
 * @utbot.returnsFrom {@code return _classAnnotations.get(acls);}
 *  */
    @Test
    public void testGetAnnotation__classAnnotationsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        annotatedClass._classAnnotations = _classAnnotations;
        
        Annotation actual = annotatedClass.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.returnsFrom {@code return _classAnnotations.get(acls);}
 *  */
    @Test
    public void testGetAnnotation__classAnnotationsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        Annotation actual = annotatedClass.getAnnotation(null);
        
        assertNull(actual);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveClassAnnotations();
 *  */
    @Test
    public void testGetAnnotation_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotation(AnnotatedClass.java:173) */
        annotatedClass.getAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): False}
 * @utbot.returnsFrom {@code return _classAnnotations;}
 *  */
    @Test
    public void testGetAnnotations__classAnnotationsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        annotatedClass._classAnnotations = _classAnnotations;
        
        AnnotationMap actual = ((AnnotationMap) annotatedClass.getAnnotations());
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.returnsFrom {@code return _classAnnotations;}
 *  */
    @Test
    public void testGetAnnotations__classAnnotationsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        AnnotationMap actual = ((AnnotationMap) annotatedClass.getAnnotations());
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveClassAnnotations();
 *  */
    @Test
    public void testGetAnnotations_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotations(AnnotatedClass.java:212) */
        annotatedClass.getAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getGenericType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenericType()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getGenericType()}
 * @utbot.returnsFrom {@code return _class;}
 *  */
    @Test
    public void testGetGenericType_Return_class() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Type actual = annotatedClass.getGenericType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getRawType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRawType()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getRawType()}
 * @utbot.returnsFrom {@code return _class;}
 *  */
    @Test
    public void testGetRawType_Return_class() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class actual = annotatedClass.getRawType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#construct(java.lang.Class,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)}
 * @utbot.returnsFrom {@code return new AnnotatedClass(cls, ClassUtil.findSuperTypes(cls, null), aintr, mir, null);}
 *  */
    @Test
    public void testConstruct_Return() throws Exception  {
        Class class1 = Object.class;
        
        AnnotatedClass actual = AnnotatedClass.construct(class1, null, null);
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", class1);
        ArrayList _superTypes = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        Class expected_class = expected._class;
        Class actual_class = actual._class;
        assertEquals(Class.class, actual_class.getClass());
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        assertNull(actual_mixInResolver);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#construct(java.lang.Class,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)}
 * @utbot.returnsFrom {@code return new AnnotatedClass(cls, ClassUtil.findSuperTypes(cls, null), aintr, mir, null);}
 *  */
    @Test
    public void testConstruct_Return_1() throws Exception  {
        AnnotatedClass actual = AnnotatedClass.construct(null, null, null);
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        assertNull(actual_mixInResolver);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultConstructor()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.executesCondition {@code (!_creatorsResolved): False}
 * @utbot.returnsFrom {@code return _defaultConstructor;}
 *  */
    @Test
    public void testGetDefaultConstructor__creatorsResolved() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        annotatedClass._creatorsResolved = true;
        
        AnnotatedConstructor actual = annotatedClass.getDefaultConstructor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultConstructor()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.executesCondition {@code (!_creatorsResolved): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveCreators()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveCreators();
 *  */
    @Test
    public void testGetDefaultConstructor_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:335)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:227) */
        annotatedClass.getDefaultConstructor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.withAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withAnnotations(com.fasterxml.jackson.databind.introspect.AnnotationMap)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#withAnnotations(com.fasterxml.jackson.databind.introspect.AnnotationMap)}
 * @utbot.returnsFrom {@code return new AnnotatedClass(_class, _superTypes, _annotationIntrospector, _mixInResolver, ann);}
 *  */
    @Test
    public void testWithAnnotations_Return() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        AnnotatedClass actual = annotatedClass.withAnnotations(((AnnotationMap) null));
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        assertNull(actual_mixInResolver);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#withAnnotations(com.fasterxml.jackson.databind.introspect.AnnotationMap)}
 * @utbot.returnsFrom {@code return new AnnotatedClass(_class, _superTypes, _annotationIntrospector, _mixInResolver, ann);}
 *  */
    @Test
    public void testWithAnnotations_Return_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        SerializationConfig _mixInResolver = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_mixInResolver", _mixInResolver);
        
        AnnotatedClass actual = annotatedClass.withAnnotations(((AnnotationMap) null));
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_mixInResolver", _mixInResolver);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver expected_mixInResolver = expected._mixInResolver;
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        int expected_mixInResolver_serFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_mixInResolver_serFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_mixInResolver_serFeatures, actual_mixInResolver_serFeatures);
        
        JsonInclude.Include actual_mixInResolver_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_mixInResolver_serializationInclusion);
        
        FilterProvider actual_mixInResolver_filterProvider = ((FilterProvider) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_mixInResolver_filterProvider);
        
        Map actual_mixInResolver_mixInAnnotations = ((Map) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertNull(actual_mixInResolver_mixInAnnotations);
        
        SubtypeResolver actual_mixInResolver_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_mixInResolver_subtypeResolver);
        
        String actual_mixInResolver_rootName = ((String) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_mixInResolver_rootName);
        
        Class actual_mixInResolver_view = ((Class) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_mixInResolver_view);
        
        ContextAttributes actual_mixInResolver_attributes = ((ContextAttributes) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_mixInResolver_attributes);
        
        int expected_mixInResolver_mapperFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_mixInResolver_mapperFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_mixInResolver_mapperFeatures, actual_mixInResolver_mapperFeatures);
        
        BaseSettings actual_mixInResolver_base = ((BaseSettings) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        assertNull(actual_mixInResolver_base);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
        ClassIntrospector.MixInResolver mixInResolver = annotatedClass._mixInResolver;
        Map finalAnnotatedClass_mixInResolver_mixInAnnotations = ((Map) getFieldValue(mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        
        assertNull(finalAnnotatedClass_mixInResolver_mixInAnnotations);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAnnotated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotated()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotated()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetAnnotated_Return() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class actual = annotatedClass.getAnnotated();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAllAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAllAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): False}
 * @utbot.returnsFrom {@code return _classAnnotations;}
 *  */
    @Test
    public void testGetAllAnnotations__classAnnotationsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        annotatedClass._classAnnotations = _classAnnotations;
        
        AnnotationMap actual = annotatedClass.getAllAnnotations();
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAllAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.returnsFrom {@code return _classAnnotations;}
 *  */
    @Test
    public void testGetAllAnnotations__classAnnotationsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        AnnotationMap actual = annotatedClass.getAllAnnotations();
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAllAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveClassAnnotations();
 *  */
    @Test
    public void testGetAllAnnotations_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAllAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getAllAnnotations(AnnotatedClass.java:199) */
        annotatedClass.getAllAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addClassMixIns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap, java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (mixin == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_addClassMixIns_MixinEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        annotatedClass._addClassMixIns(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addClassMixIns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class)}
 * @utbot.executesCondition {@code (_mixInResolver != null): False}
 *  */
    @Test
    public void test_addClassMixIns__mixInResolverEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        annotatedClass._addClassMixIns(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class)}
 * @utbot.executesCondition {@code (_mixInResolver != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver#findMixInClassFor(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addClassMixIns(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class)}
 *  */
    @Test
    public void test_addClassMixIns__mixInResolverNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SerializationConfig _mixInResolver = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_mixInResolver", _mixInResolver);
        
        annotatedClass._addClassMixIns(null, null);
        
        ClassIntrospector.MixInResolver mixInResolver = annotatedClass._mixInResolver;
        Map finalAnnotatedClass_mixInResolver_mixInAnnotations = ((Map) getFieldValue(mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        
        assertNull(finalAnnotatedClass_mixInResolver_mixInAnnotations);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMethod(java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#findMethod(java.lang.String,java.lang.Class[])}
 * @utbot.executesCondition {@code (_memberMethods == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap#find(java.lang.String,java.lang.Class[])}
 * @utbot.returnsFrom {@code return _memberMethods.find(name, paramTypes);}
 *  */
    @Test
    public void testFindMethod__memberMethodsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        annotatedClass._memberMethods = _memberMethods;
        
        AnnotatedMethod actual = annotatedClass.findMethod(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFactoryMixIns
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addFactoryMixIns(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addFactoryMixIns(java.lang.Class)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int methodCount = _creatorMethods.size();
 *  */
    @Test
    public void test_addFactoryMixIns_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFactoryMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFactoryMixIns(AnnotatedClass.java:557) */
        annotatedClass._addFactoryMixIns(null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addFactoryMixIns(java.lang.Class)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Method m: mixin.getDeclaredMethods())
 *  */
    @Test
    public void test_addFactoryMixIns_ThrowNullPointerException_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _creatorMethods = new ArrayList();
        _creatorMethods.add(null);
        _creatorMethods.add(null);
        _creatorMethods.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorMethods", _creatorMethods);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFactoryMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFactoryMixIns(AnnotatedClass.java:559) */
        annotatedClass._addFactoryMixIns(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addFactoryMixIns(java.lang.Class)
    
    @Test
    public void test_addFactoryMixIns1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _creatorMethods = new ArrayList();
        _creatorMethods.add(null);
        _creatorMethods.add(null);
        _creatorMethods.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorMethods", _creatorMethods);
        Class class1 = Object.class;
        
        annotatedClass._addFactoryMixIns(class1);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getStaticMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStaticMethods()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getStaticMethods()}
 * @utbot.executesCondition {@code (!_creatorsResolved): False}
 * @utbot.returnsFrom {@code return _creatorMethods;}
 *  */
    @Test
    public void testGetStaticMethods__creatorsResolved() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        annotatedClass._creatorsResolved = true;
        
        List actual = annotatedClass.getStaticMethods();
        
        assertNull(actual);
        
        List finalAnnotatedClass_creatorMethods = annotatedClass._creatorMethods;
        
        assertNull(finalAnnotatedClass_creatorMethods);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getStaticMethods()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getStaticMethods()}
 * @utbot.executesCondition {@code (!_creatorsResolved): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveCreators()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveCreators();
 *  */
    @Test
    public void testGetStaticMethods_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getStaticMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:335)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getStaticMethods(AnnotatedClass.java:243) */
        annotatedClass.getStaticMethods();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getStaticMethods()
    
    @Test
    public void testGetStaticMethods1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        List actual = annotatedClass.getStaticMethods();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        boolean finalAnnotatedClass_creatorsResolved = annotatedClass._creatorsResolved;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
        
        assertTrue(finalAnnotatedClass_creatorsResolved);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#hasAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): False}
 * @utbot.returnsFrom {@code return _classAnnotations.size() > 0;}
 *  */
    @Test
    public void testHasAnnotations__classAnnotationsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        annotatedClass._classAnnotations = _classAnnotations;
        
        boolean actual = annotatedClass.hasAnnotations();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#hasAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.returnsFrom {@code return _classAnnotations.size() > 0;}
 *  */
    @Test
    public void testHasAnnotations__classAnnotationsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        boolean actual = annotatedClass.hasAnnotations();
        
        assertFalse(actual);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#hasAnnotations()}
 * @utbot.executesCondition {@code (_classAnnotations == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveClassAnnotations();
 *  */
    @Test
    public void testHasAnnotations_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations(AnnotatedClass.java:219) */
        annotatedClass.hasAnnotations();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasAnnotations()
    
    @Test
    public void testHasAnnotations1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations(AnnotatedClass.java:219) */
        annotatedClass.hasAnnotations();
    }
    
    @Test
    public void testHasAnnotations2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:311)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.hasAnnotations(AnnotatedClass.java:219) */
        annotatedClass.hasAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveFields()
    
    @Test
    public void testResolveFields1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveFieldsMethod = annotatedClassClazz.getDeclaredMethod("resolveFields");
        resolveFieldsMethod.setAccessible(true);
        java.lang.Object[] resolveFieldsMethodArguments = new java.lang.Object[0];
        resolveFieldsMethod.invoke(annotatedClass, resolveFieldsMethodArguments);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getFieldCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldCount()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFieldCount()}
 * @utbot.executesCondition {@code (_fields == null): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return _fields.size();}
 *  */
    @Test
    public void testGetFieldCount__fieldsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        
        int actual = annotatedClass.getFieldCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFieldCount()
    
    @Test
    public void testGetFieldCount1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        int actual = annotatedClass.getFieldCount();
        
        assertEquals(0, actual);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveCreators()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveCreators()}
 * @utbot.invokes {@link java.lang.Class#getDeclaredConstructors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Constructor<?>[] declaredCtors = _class.getDeclaredConstructors();
 *  */
    @Test
    public void testResolveCreators_ThrowNullPointerException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:335) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveCreatorsMethod = annotatedClassClazz.getDeclaredMethod("resolveCreators");
        resolveCreatorsMethod.setAccessible(true);
        java.lang.Object[] resolveCreatorsMethodArguments = new java.lang.Object[0];
        try {
            resolveCreatorsMethod.invoke(annotatedClass, resolveCreatorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveCreators()
    
    @Test
    public void testResolveCreators1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        Class initialAnnotatedClass_class = annotatedClass._class;
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveCreatorsMethod = annotatedClassClazz.getDeclaredMethod("resolveCreators");
        resolveCreatorsMethod.setAccessible(true);
        java.lang.Object[] resolveCreatorsMethodArguments = new java.lang.Object[0];
        resolveCreatorsMethod.invoke(annotatedClass, resolveCreatorsMethodArguments);
        
        Class finalAnnotatedClass_class = annotatedClass._class;
        
        assertFalse(initialAnnotatedClass_class == finalAnnotatedClass_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addMethodMixIns(java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap, java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)
    
    @Test
    public void test_addMethodMixIns1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        annotatedClass._addMethodMixIns(class1, annotatedMethodMap, class1, annotatedMethodMap);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addMethodMixIns(java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap, java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)
    
    @Test
    public void test_addMethodMixIns2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:645) */
        annotatedClass._addMethodMixIns(class1, null, class1, null);
    }
    
    @Test
    public void test_addMethodMixIns3() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:658) */
        annotatedClass._addMethodMixIns(class1, annotatedMethodMap, class1, null);
    }
    
    @Test
    public void test_addMethodMixIns4() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:645) */
        annotatedClass._addMethodMixIns(null, null, class1, null);
    }
    
    @Test
    public void test_addMethodMixIns5() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:641) */
        annotatedClass._addMethodMixIns(class1, null, null, null);
    }
    
    @Test
    public void test_addMethodMixIns6() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:641) */
        annotatedClass._addMethodMixIns(null, annotatedMethodMap, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addMemberMethods(java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap, java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addMemberMethods(java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)}
 * @utbot.executesCondition {@code (mixInCls != null): False}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_addMemberMethods_ClsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        annotatedClass._addMemberMethods(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addMemberMethods(java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap, java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)
    
    @Test
    public void test_addMemberMethods1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        annotatedClass._addMemberMethods(class1, annotatedMethodMap, null, annotatedMethodMap);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addMemberMethods(java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap, java.lang.Class, com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)
    
    @Test
    public void test_addMemberMethods2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:645)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods(AnnotatedClass.java:594) */
        annotatedClass._addMemberMethods(class1, null, class1, null);
    }
    
    @Test
    public void test_addMemberMethods3() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods(AnnotatedClass.java:605) */
        annotatedClass._addMemberMethods(class1, null, null, annotatedMethodMap);
    }
    
    @Test
    public void test_addMemberMethods4() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods(AnnotatedClass.java:610) */
        annotatedClass._addMemberMethods(class1, annotatedMethodMap, null, null);
    }
    
    @Test
    public void test_addMemberMethods5() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMethodMixIns(AnnotatedClass.java:645)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMemberMethods(AnnotatedClass.java:594) */
        annotatedClass._addMemberMethods(null, null, class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._isIncludableField
    
    ///region Errors report for _isIncludableField
    
    public void test_isIncludableField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFieldMixIns
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addFieldMixIns(java.lang.Class, java.lang.Class, java.util.Map)
    
    @Test
    public void test_addFieldMixIns1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        annotatedClass._addFieldMixIns(class1, class1, linkedHashMap);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    @Test
    public void test_addFieldMixIns2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        annotatedClass._addFieldMixIns(null, class1, linkedHashMap);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addFieldMixIns(java.lang.Class, java.lang.Class, java.util.Map)
    
    @Test
    public void test_addFieldMixIns3() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFieldMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFieldMixIns(AnnotatedClass.java:722) */
        annotatedClass._addFieldMixIns(class1, null, null);
    }
    
    @Test
    public void test_addFieldMixIns4() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFieldMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addFieldMixIns(AnnotatedClass.java:722) */
        annotatedClass._addFieldMixIns(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findFields(java.lang.Class, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_findFields(java.lang.Class,java.util.Map)}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> parent = c.getSuperclass();
 *  */
    @Test
    public void test_findFields_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:677) */
        annotatedClass._findFields(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _findFields(java.lang.Class, java.util.Map)
    
    @Test
    public void test_findFields1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        Map actual = annotatedClass._findFields(class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructMethod(java.lang.reflect.Method)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructMethod(java.lang.reflect.Method)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMap()
 * @utbot.returnsFrom {@code return new AnnotatedMethod(m, _emptyAnnotationMap(), null);}
 *  */
    @Test
    public void test_constructMethod__annotationIntrospectorEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        
        AnnotatedMethod actual = annotatedClass._constructMethod(method);
        
        AnnotatedMethod expected = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", method);
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        
        Method expected_method = expected._method;
        Method actual_method = actual._method;
        // java.lang.reflect.Method has overridden equals method
        assertEquals(expected_method, actual_method);
        
        java.lang.Class[] actual_paramClasses = actual._paramClasses;
        assertNull(actual_paramClasses);
        
        Object actual_serialization = actual._serialization;
        assertNull(actual_serialization);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_paramAnnotations = actual._paramAnnotations;
        assertNull(actual_paramAnnotations);
        
        AnnotationMap expected_annotations = expected._annotations;
        AnnotationMap actual_annotations = actual._annotations;
        HashMap actual_annotations_annotations = actual_annotations._annotations;
        assertNull(actual_annotations_annotations);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructMethod(java.lang.reflect.Method)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructMethod(java.lang.reflect.Method)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): False}
 * @utbot.invokes {@link java.lang.reflect.Method#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new AnnotatedMethod(m, _collectRelevantAnnotations(m.getDeclaredAnnotations()), null);
 *  */
    @Test
    public void test_constructMethod_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructMethod(AnnotatedClass.java:752) */
        annotatedClass._constructMethod(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _constructMethod(java.lang.reflect.Method)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructMethod(java.lang.reflect.Method)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMap()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new AnnotatedMethod(m, _emptyAnnotationMap(), null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_constructMethod_ThrowIllegalArgumentException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        annotatedClass._constructMethod(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructField(java.lang.reflect.Field)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructField(java.lang.reflect.Field)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMap()
 * @utbot.returnsFrom {@code return new AnnotatedField(f, _emptyAnnotationMap());}
 *  */
    @Test
    public void test_constructField__annotationIntrospectorEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotatedField actual = annotatedClass._constructField(null);
        
        AnnotationMap annotationMap = new AnnotationMap();
        AnnotatedField expected = new AnnotatedField(null, annotationMap);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        Object actual_serialization = actual._serialization;
        assertNull(actual_serialization);
        
        AnnotationMap expected_annotations = expected._annotations;
        AnnotationMap actual_annotations = actual._annotations;
        HashMap actual_annotations_annotations = actual_annotations._annotations;
        assertNull(actual_annotations_annotations);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructField(java.lang.reflect.Field)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructField(java.lang.reflect.Field)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): False}
 * @utbot.invokes {@link java.lang.reflect.Field#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new AnnotatedField(f, _collectRelevantAnnotations(f.getDeclaredAnnotations()));
 *  */
    @Test
    public void test_constructField_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructField(AnnotatedClass.java:817) */
        annotatedClass._constructField(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addMixOvers(java.lang.reflect.Constructor, com.fasterxml.jackson.databind.introspect.AnnotatedConstructor, boolean)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addMixOvers(java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean)}
 * @utbot.invokes {@link java.lang.reflect.Constructor#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _addOrOverrideAnnotations(target, mixin.getDeclaredAnnotations());
 *  */
    @Test
    public void test_addMixOvers_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers(AnnotatedClass.java:974) */
        annotatedClass._addMixOvers(((Constructor) null), ((AnnotatedConstructor) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addMixOvers(java.lang.reflect.Method, com.fasterxml.jackson.databind.introspect.AnnotatedMethod, boolean)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addMixOvers(java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean)}
 * @utbot.invokes {@link java.lang.reflect.Method#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _addOrOverrideAnnotations(target, mixin.getDeclaredAnnotations());
 *  */
    @Test
    public void test_addMixOvers_ThrowNullPointerException1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixOvers(AnnotatedClass.java:992) */
        annotatedClass._addMixOvers(((Method) null), ((AnnotatedMethod) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixUnders
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addMixUnders(java.lang.reflect.Method, com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addMixUnders(java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
 * @utbot.invokes {@link java.lang.reflect.Method#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _addAnnotationsIfNotPresent(target, src.getDeclaredAnnotations());
 *  */
    @Test
    public void test_addMixUnders_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixUnders] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addMixUnders(AnnotatedClass.java:1008) */
        annotatedClass._addMixUnders(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addConstructorMixIns
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addConstructorMixIns(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addConstructorMixIns(java.lang.Class)}
 * @utbot.executesCondition {@code ((_constructors == null)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Constructor<?> ctor: mixin.getDeclaredConstructors())
 *  */
    @Test
    public void test_addConstructorMixIns_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addConstructorMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addConstructorMixIns(AnnotatedClass.java:529) */
        annotatedClass._addConstructorMixIns(null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addConstructorMixIns(java.lang.Class)}
 * @utbot.executesCondition {@code ((_constructors == null)): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Constructor<?> ctor: mixin.getDeclaredConstructors())
 *  */
    @Test
    public void test_addConstructorMixIns_ThrowNullPointerException_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _constructors = new ArrayList();
        _constructors.add(null);
        _constructors.add(null);
        _constructors.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructors", _constructors);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addConstructorMixIns] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addConstructorMixIns(AnnotatedClass.java:529) */
        annotatedClass._addConstructorMixIns(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addConstructorMixIns(java.lang.Class)
    
    @Test
    public void test_addConstructorMixIns1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class class1 = Object.class;
        
        annotatedClass._addConstructorMixIns(class1);
        
        List finalAnnotatedClass_constructors = annotatedClass._constructors;
        
        Class finalClass1 = class1;
        
        assertNull(finalAnnotatedClass_constructors);
        
    }
    
    @Test
    public void test_addConstructorMixIns2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _constructors = new ArrayList();
        _constructors.add(null);
        _constructors.add(null);
        _constructors.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructors", _constructors);
        Class class1 = Object.class;
        
        annotatedClass._addConstructorMixIns(class1);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructCreatorMethod
    
    ///region Errors report for _constructCreatorMethod
    
    public void test_constructCreatorMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._emptyAnnotationMaps
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _emptyAnnotationMaps(int)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMaps(int)}
 * @utbot.executesCondition {@code (count == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.returnsFrom {@code return maps;}
 *  */
    @Test
    public void test_emptyAnnotationMaps_CountNotEqualsZero() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class intType = int.class;
        Method _emptyAnnotationMapsMethod = annotatedClassClazz.getDeclaredMethod("_emptyAnnotationMaps", intType);
        _emptyAnnotationMapsMethod.setAccessible(true);
        java.lang.Object[] _emptyAnnotationMapsMethodArguments = new java.lang.Object[1];
        _emptyAnnotationMapsMethodArguments[0] = 1;
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) _emptyAnnotationMapsMethod.invoke(annotatedClass, _emptyAnnotationMapsMethodArguments));
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] expected = new com.fasterxml.jackson.databind.introspect.AnnotationMap[1];
        AnnotationMap annotationMap = new AnnotationMap();
        expected[0] = annotationMap;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMaps(int)}
 * @utbot.executesCondition {@code (count == 0): True}
 * @utbot.returnsFrom {@code return NO_ANNOTATION_MAPS;}
 *  */
    @Test
    public void test_emptyAnnotationMaps_CountEqualsZero() throws Exception  {
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] prevNO_ANNOTATION_MAPS = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getStaticFieldValue(annotatedClassClazz, "NO_ANNOTATION_MAPS"));
        try {
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] noAnnotationMaps = {};
            setStaticField(annotatedClassClazz, "NO_ANNOTATION_MAPS", noAnnotationMaps);
            AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            
            Class intType = int.class;
            Method _emptyAnnotationMapsMethod = annotatedClassClazz.getDeclaredMethod("_emptyAnnotationMaps", intType);
            _emptyAnnotationMapsMethod.setAccessible(true);
            java.lang.Object[] _emptyAnnotationMapsMethodArguments = new java.lang.Object[1];
            _emptyAnnotationMapsMethodArguments[0] = 0;
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) _emptyAnnotationMapsMethod.invoke(annotatedClass, _emptyAnnotationMapsMethodArguments));
            
            int noAnnotationMapsSize = noAnnotationMaps.length;
            assertEquals(noAnnotationMapsSize, actual.length);
            assertTrue(deepEquals(noAnnotationMaps, actual));
        } finally {
            setStaticField(AnnotatedClass.class, "NO_ANNOTATION_MAPS", prevNO_ANNOTATION_MAPS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _emptyAnnotationMaps(int)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMaps(int)}
 * @utbot.executesCondition {@code (count == 0): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: AnnotationMap[] maps = new AnnotationMap[count];
 *  */
    @Test
    public void test_emptyAnnotationMaps_ThrowNegativeArraySizeException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._emptyAnnotationMaps] produces [java.lang.NegativeArraySizeException: -255]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._emptyAnnotationMaps(AnnotatedClass.java:828) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class intType = int.class;
        Method _emptyAnnotationMapsMethod = annotatedClassClazz.getDeclaredMethod("_emptyAnnotationMaps", intType);
        _emptyAnnotationMapsMethod.setAccessible(true);
        java.lang.Object[] _emptyAnnotationMapsMethodArguments = new java.lang.Object[1];
        _emptyAnnotationMapsMethodArguments[0] = -255;
        try {
            _emptyAnnotationMapsMethod.invoke(annotatedClass, _emptyAnnotationMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._isIncludableMemberMethod
    
    ///region Errors report for _isIncludableMemberMethod
    
    public void test_isIncludableMemberMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectRelevantAnnotations([Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[])}
 * @utbot.returnsFrom {@code return annMap;}
 *  */
    @Test
    public void test_collectRelevantAnnotations_ReturnAnnMap() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {};
        
        AnnotationMap actual = annotatedClass._collectRelevantAnnotations(annotationArray);
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[])}
 * @utbot.returnsFrom {@code return annMap;}
 *  */
    @Test
    public void test_collectRelevantAnnotations_ReturnAnnMap_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap actual = annotatedClass._collectRelevantAnnotations(((java.lang.annotation.Annotation[]) null));
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _collectRelevantAnnotations([Ljava.lang.annotation.Annotation;)
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null, null};
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary7 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test
    public void test_collectRelevantAnnotations3() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary14 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:51)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:906)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:893) */
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectRelevantAnnotations([[Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[][])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void test_collectRelevantAnnotations_ReturnResult() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[][] annotationArray = {};
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual = annotatedClass._collectRelevantAnnotations(annotationArray);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void test_collectRelevantAnnotations_IterateForLoop() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[][] annotationArray = {null};
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual = annotatedClass._collectRelevantAnnotations(annotationArray);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] expected = new com.fasterxml.jackson.databind.introspect.AnnotationMap[1];
        AnnotationMap annotationMap = new AnnotationMap();
        expected[0] = annotationMap;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        java.lang.annotation.Annotation[] finalAnnotationArray0 = annotationArray[0];
        
        assertNull(finalAnnotationArray0);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void test_collectRelevantAnnotations_IterateForLoop_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[1][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual = annotatedClass._collectRelevantAnnotations(annotationArray);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] expected = new com.fasterxml.jackson.databind.introspect.AnnotationMap[1];
        AnnotationMap annotationMap = new AnnotationMap();
        expected[0] = annotationMap;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectRelevantAnnotations([[Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_collectRelevantAnnotations(java.lang.annotation.Annotation[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = anns.length;
 *  */
    @Test
    public void test_collectRelevantAnnotations_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:882) */
        annotatedClass._collectRelevantAnnotations(((java.lang.annotation.Annotation[][]) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _collectRelevantAnnotations([[Ljava.lang.annotation.Annotation;)
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations4() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[1][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations5() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[8][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        annotationArray[1] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[2] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[3] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[4] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[5] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[6] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[7] = ((java.lang.annotation.Annotation[]) null);
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations6() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[20][];
        com.fasterxml.jackson.annotation.JsonCreator[] jsonCreatorArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) jsonCreatorArray);
        annotationArray[1] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[2] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[3] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[4] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[5] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[6] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[7] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[8] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[9] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[10] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[11] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[12] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[13] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[14] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[15] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[16] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[17] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[18] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[19] = ((java.lang.annotation.Annotation[]) null);
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectRelevantAnnotations7() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[1][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test
    public void test_collectRelevantAnnotations8() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary5 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[16][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        annotationArray[1] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[2] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[3] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[4] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[5] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[6] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[7] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[8] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[9] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[10] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[11] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[12] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[13] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[14] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[15] = ((java.lang.annotation.Annotation[]) null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:51)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:906)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:893)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:885) */
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    
    @Test
    public void test_collectRelevantAnnotations9() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[][] annotationArray = new java.lang.annotation.Annotation[8][];
        jdk.internal.vm.annotation.IntrinsicCandidate[] intrinsicCandidateArray = {null, null, null, null, null, null, null, null, null};
        annotationArray[0] = ((java.lang.annotation.Annotation[]) intrinsicCandidateArray);
        annotationArray[1] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[2] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[3] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[4] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[5] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[6] = ((java.lang.annotation.Annotation[]) null);
        annotationArray[7] = ((java.lang.annotation.Annotation[]) null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:906)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:893)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._collectRelevantAnnotations(AnnotatedClass.java:885) */
        annotatedClass._collectRelevantAnnotations(annotationArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isAnnotationBundle(java.lang.annotation.Annotation)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_isAnnotationBundle(java.lang.annotation.Annotation)}
 * @utbot.returnsFrom {@code return (_annotationIntrospector != null) && _annotationIntrospector.isAnnotationBundle(ann);}
 *  */
    @Test
    public void test_isAnnotationBundle__annotationIntrospectorEqualsNullAnd_annotationIntrospectorIsAnnotationBundle() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _isAnnotationBundle(java.lang.annotation.Annotation)
    
    @Test(expected = StackOverflowError.class)
    public void test_isAnnotationBundle1() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        try {
            _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_isAnnotationBundle2() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        try {
            _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_isAnnotationBundle3() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        try {
            _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_isAnnotationBundle4() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary10 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary9);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        try {
            _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_isAnnotationBundle5() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary10 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationType = Class.forName("java.lang.annotation.Annotation");
        Method _isAnnotationBundleMethod = annotatedClassClazz.getDeclaredMethod("_isAnnotationBundle", annotationType);
        _isAnnotationBundleMethod.setAccessible(true);
        java.lang.Object[] _isAnnotationBundleMethodArguments = new java.lang.Object[1];
        _isAnnotationBundleMethodArguments[0] = ((Object) null);
        try {
            _isAnnotationBundleMethod.invoke(annotatedClass, _isAnnotationBundleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructWithoutSuperTypes(java.lang.Class, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#constructWithoutSuperTypes(java.lang.Class,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)}
 *  */
    @Test
    public void testConstructWithoutSuperTypes_1() throws Exception  {
        AnnotatedClass actual = AnnotatedClass.constructWithoutSuperTypes(null, null, null);
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        List _superTypes = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        assertNull(actual_mixInResolver);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#constructWithoutSuperTypes(java.lang.Class,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)}
 *  */
    @Test
    public void testConstructWithoutSuperTypes() throws Exception  {
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class classType = Class.forName("java.lang.Class");
        Class annotationIntrospectorType = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Class serializationConfigType = Class.forName("com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        Method constructWithoutSuperTypesMethod = annotatedClassClazz.getDeclaredMethod("constructWithoutSuperTypes", classType, annotationIntrospectorType, serializationConfigType);
        constructWithoutSuperTypesMethod.setAccessible(true);
        java.lang.Object[] constructWithoutSuperTypesMethodArguments = new java.lang.Object[3];
        constructWithoutSuperTypesMethodArguments[0] = ((Object) null);
        constructWithoutSuperTypesMethodArguments[1] = ((Object) null);
        constructWithoutSuperTypesMethodArguments[2] = serializationConfig;
        AnnotatedClass actual = ((AnnotatedClass) constructWithoutSuperTypesMethod.invoke(null, constructWithoutSuperTypesMethodArguments));
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        List _superTypes = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_mixInResolver", serializationConfig);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        ClassIntrospector.MixInResolver expected_mixInResolver = expected._mixInResolver;
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        int expected_mixInResolver_serFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_mixInResolver_serFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_mixInResolver_serFeatures, actual_mixInResolver_serFeatures);
        
        JsonInclude.Include actual_mixInResolver_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_mixInResolver_serializationInclusion);
        
        FilterProvider actual_mixInResolver_filterProvider = ((FilterProvider) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_mixInResolver_filterProvider);
        
        Map actual_mixInResolver_mixInAnnotations = ((Map) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertNull(actual_mixInResolver_mixInAnnotations);
        
        SubtypeResolver actual_mixInResolver_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_mixInResolver_subtypeResolver);
        
        String actual_mixInResolver_rootName = ((String) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_mixInResolver_rootName);
        
        Class actual_mixInResolver_view = ((Class) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_mixInResolver_view);
        
        ContextAttributes actual_mixInResolver_attributes = ((ContextAttributes) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_mixInResolver_attributes);
        
        int expected_mixInResolver_mapperFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_mixInResolver_mapperFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_mixInResolver_mapperFeatures, actual_mixInResolver_mapperFeatures);
        
        BaseSettings actual_mixInResolver_base = ((BaseSettings) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        assertNull(actual_mixInResolver_base);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
        Map finalSerializationConfig_mixInAnnotations = ((Map) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        
        assertNull(finalSerializationConfig_mixInAnnotations);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructWithoutSuperTypes(java.lang.Class, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)
    
    @Test
    public void testConstructWithoutSuperTypes1() throws Exception  {
        Class class1 = Object.class;
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        LinkedHashMap _mixInAnnotations = new LinkedHashMap();
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations", _mixInAnnotations);
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class class1Type = Class.forName("java.lang.Class");
        Class annotationIntrospectorPairType = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Class serializationConfigType = Class.forName("com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        Method constructWithoutSuperTypesMethod = annotatedClassClazz.getDeclaredMethod("constructWithoutSuperTypes", class1Type, annotationIntrospectorPairType, serializationConfigType);
        constructWithoutSuperTypesMethod.setAccessible(true);
        java.lang.Object[] constructWithoutSuperTypesMethodArguments = new java.lang.Object[3];
        constructWithoutSuperTypesMethodArguments[0] = class1;
        constructWithoutSuperTypesMethodArguments[1] = annotationIntrospectorPair;
        constructWithoutSuperTypesMethodArguments[2] = serializationConfig;
        AnnotatedClass actual = ((AnnotatedClass) constructWithoutSuperTypesMethod.invoke(null, constructWithoutSuperTypesMethodArguments));
        
        AnnotatedClass expected = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", class1);
        List _superTypes = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(expected, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_mixInResolver", serializationConfig);
        
        Class expected_class = expected._class;
        Class actual_class = actual._class;
        assertEquals(Class.class, actual_class.getClass());
        
        List expected_superTypes = expected._superTypes;
        List actual_superTypes = actual._superTypes;
        assertTrue(deepEquals(expected_superTypes, actual_superTypes));
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        assertNull(actual_annotationIntrospector_primary);
        
        AnnotationIntrospector actual_annotationIntrospector_secondary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        assertNull(actual_annotationIntrospector_secondary);
        
        ClassIntrospector.MixInResolver expected_mixInResolver = expected._mixInResolver;
        ClassIntrospector.MixInResolver actual_mixInResolver = actual._mixInResolver;
        int expected_mixInResolver_serFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_mixInResolver_serFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_mixInResolver_serFeatures, actual_mixInResolver_serFeatures);
        
        JsonInclude.Include actual_mixInResolver_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_mixInResolver_serializationInclusion);
        
        FilterProvider actual_mixInResolver_filterProvider = ((FilterProvider) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_mixInResolver_filterProvider);
        
        Map expected_mixInResolver_mixInAnnotations = ((Map) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        Map actual_mixInResolver_mixInAnnotations = ((Map) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertTrue(deepEquals(expected_mixInResolver_mixInAnnotations, actual_mixInResolver_mixInAnnotations));
        
        SubtypeResolver actual_mixInResolver_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_mixInResolver_subtypeResolver);
        
        String actual_mixInResolver_rootName = ((String) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_mixInResolver_rootName);
        
        Class actual_mixInResolver_view = ((Class) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_mixInResolver_view);
        
        ContextAttributes actual_mixInResolver_attributes = ((ContextAttributes) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_mixInResolver_attributes);
        
        int expected_mixInResolver_mapperFeatures = ((Integer) getFieldValue(expected_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_mixInResolver_mapperFeatures = ((Integer) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_mixInResolver_mapperFeatures, actual_mixInResolver_mapperFeatures);
        
        BaseSettings actual_mixInResolver_base = ((BaseSettings) getFieldValue(actual_mixInResolver, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        assertNull(actual_mixInResolver_base);
        
        Class actual_primaryMixIn = actual._primaryMixIn;
        assertNull(actual_primaryMixIn);
        
        AnnotationMap actual_classAnnotations = actual._classAnnotations;
        assertNull(actual_classAnnotations);
        
        boolean actual_creatorsResolved = actual._creatorsResolved;
        assertFalse(actual_creatorsResolved);
        
        AnnotatedConstructor actual_defaultConstructor = actual._defaultConstructor;
        assertNull(actual_defaultConstructor);
        
        List actual_constructors = actual._constructors;
        assertNull(actual_constructors);
        
        List actual_creatorMethods = actual._creatorMethods;
        assertNull(actual_creatorMethods);
        
        AnnotatedMethodMap actual_memberMethods = actual._memberMethods;
        assertNull(actual_memberMethods);
        
        List actual_fields = actual._fields;
        assertNull(actual_fields);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()}
 * @utbot.executesCondition {@code (_annotationIntrospector != null): False}
 *  */
    @Test
    public void testResolveClassAnnotations__annotationIntrospectorEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveClassAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("resolveClassAnnotations");
        resolveClassAnnotationsMethod.setAccessible(true);
        java.lang.Object[] resolveClassAnnotationsMethodArguments = new java.lang.Object[0];
        resolveClassAnnotationsMethod.invoke(annotatedClass, resolveClassAnnotationsMethodArguments);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = annotatedClass._classAnnotations;
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveClassAnnotations()}
 * @utbot.executesCondition {@code (_annotationIntrospector != null): True}
 * @utbot.executesCondition {@code (_primaryMixIn != null): False}
 * @utbot.invokes {@link java.lang.Class#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _addAnnotationsIfNotPresent(_classAnnotations, _class.getDeclaredAnnotations());
 *  */
    @Test
    public void testResolveClassAnnotations_ThrowNullPointerException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveClassAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("resolveClassAnnotations");
        resolveClassAnnotationsMethod.setAccessible(true);
        java.lang.Object[] resolveClassAnnotationsMethodArguments = new java.lang.Object[0];
        try {
            resolveClassAnnotationsMethod.invoke(annotatedClass, resolveClassAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveClassAnnotations()
    
    @Test
    public void testResolveClassAnnotations1() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:308) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveClassAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("resolveClassAnnotations");
        resolveClassAnnotationsMethod.setAccessible(true);
        java.lang.Object[] resolveClassAnnotationsMethodArguments = new java.lang.Object[0];
        try {
            resolveClassAnnotationsMethod.invoke(annotatedClass, resolveClassAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveClassAnnotations2() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveClassAnnotations(AnnotatedClass.java:311) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveClassAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("resolveClassAnnotations");
        resolveClassAnnotationsMethod.setAccessible(true);
        java.lang.Object[] resolveClassAnnotationsMethodArguments = new java.lang.Object[0];
        try {
            resolveClassAnnotationsMethod.invoke(annotatedClass, resolveClassAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveMemberMethods()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveMemberMethods()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addMemberMethods(java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Class<?> cls: _superTypes)
 *  */
    @Test
    public void testResolveMemberMethods_ThrowNullPointerException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:427) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveMemberMethodsMethod = annotatedClassClazz.getDeclaredMethod("resolveMemberMethods");
        resolveMemberMethodsMethod.setAccessible(true);
        java.lang.Object[] resolveMemberMethodsMethodArguments = new java.lang.Object[0];
        try {
            resolveMemberMethodsMethod.invoke(annotatedClass, resolveMemberMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveMemberMethods()
    
    @Test
    public void testResolveMemberMethods1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        _superTypes.add(null);
        _superTypes.add(null);
        _superTypes.add(null);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        AnnotatedMethodMap initialAnnotatedClass_memberMethods = annotatedClass._memberMethods;
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveMemberMethodsMethod = annotatedClassClazz.getDeclaredMethod("resolveMemberMethods");
        resolveMemberMethodsMethod.setAccessible(true);
        java.lang.Object[] resolveMemberMethodsMethodArguments = new java.lang.Object[0];
        resolveMemberMethodsMethod.invoke(annotatedClass, resolveMemberMethodsMethodArguments);
        
        AnnotatedMethodMap finalAnnotatedClass_memberMethods = annotatedClass._memberMethods;
        
        assertFalse(initialAnnotatedClass_memberMethods == finalAnnotatedClass_memberMethods);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveMemberMethods()
    
    @Test
    public void testResolveMemberMethods2() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        annotatedClass._memberMethods = _memberMethods;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:427) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveMemberMethodsMethod = annotatedClassClazz.getDeclaredMethod("resolveMemberMethods");
        resolveMemberMethodsMethod.setAccessible(true);
        java.lang.Object[] resolveMemberMethodsMethodArguments = new java.lang.Object[0];
        try {
            resolveMemberMethodsMethod.invoke(annotatedClass, resolveMemberMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveMemberMethods3() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:427) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method resolveMemberMethodsMethod = annotatedClassClazz.getDeclaredMethod("resolveMemberMethods");
        resolveMemberMethodsMethod.setAccessible(true);
        java.lang.Object[] resolveMemberMethodsMethodArguments = new java.lang.Object[0];
        try {
            resolveMemberMethodsMethod.invoke(annotatedClass, resolveMemberMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructConstructor(java.lang.reflect.Constructor, boolean)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructConstructor(java.lang.reflect.Constructor,boolean)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): False}
 * @utbot.executesCondition {@code (defaultCtor): False}
 * @utbot.invokes {@link java.lang.reflect.Constructor#getParameterAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Annotation[][] paramAnns = ctor.getParameterAnnotations();
 *  */
    @Test
    public void test_constructConstructor_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor(AnnotatedClass.java:763) */
        annotatedClass._constructConstructor(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructConstructor(java.lang.reflect.Constructor,boolean)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): False}
 * @utbot.executesCondition {@code (defaultCtor): True}
 * @utbot.invokes {@link java.lang.reflect.Constructor#getDeclaredAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new AnnotatedConstructor(ctor, _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), null);
 *  */
    @Test
    public void test_constructConstructor_ThrowNullPointerException_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor(AnnotatedClass.java:761) */
        annotatedClass._constructConstructor(null, true);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_constructConstructor(java.lang.reflect.Constructor,boolean)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMap()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new AnnotatedConstructor(ctor, _emptyAnnotationMap(), _emptyAnnotationMaps(ctor.getParameterTypes().length));
 *  */
    @Test
    public void test_constructConstructor_ThrowNullPointerException_2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor(AnnotatedClass.java:758) */
        annotatedClass._constructConstructor(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._emptyAnnotationMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _emptyAnnotationMap()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_emptyAnnotationMap()}
 * @utbot.returnsFrom {@code return new AnnotationMap();}
 *  */
    @Test
    public void test_emptyAnnotationMap_Return() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method _emptyAnnotationMapMethod = annotatedClassClazz.getDeclaredMethod("_emptyAnnotationMap");
        _emptyAnnotationMapMethod.setAccessible(true);
        java.lang.Object[] _emptyAnnotationMapMethodArguments = new java.lang.Object[0];
        AnnotationMap actual = ((AnnotationMap) _emptyAnnotationMapMethod.invoke(annotatedClass, _emptyAnnotationMapMethodArguments));
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = actual._annotations;
        assertNull(actual_annotations);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.executesCondition {@code (bundles != null): False}
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_BundlesEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): False}
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_AnnsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) null);
        _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.iterates iterate the loop {@code for(Annotation ann: anns)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.addIfNotPresent(ann);
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_ThrowNullPointerException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:912) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotationMap, [Ljava.lang.annotation.Annotation;)
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent1() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent2() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent3() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent4() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_addAnnotationsIfNotPresent5() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary12 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        AnnotationMap annotationMap = new AnnotationMap();
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:906) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotationMapType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotationMapType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = annotationMap;
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.executesCondition {@code (bundles != null): False}
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_BundlesEqualsNull1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedMemberType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): False}
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_AnnsEqualsNull1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedMemberType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) null);
        _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.iterates iterate the loop {@code for(Annotation ann: anns)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: target.addIfNotPresent(ann);
 *  */
    @Test
    public void test_addAnnotationsIfNotPresent_ThrowNullPointerException1() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:934) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedMemberType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addAnnotationsIfNotPresent(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent6() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class annotatedFieldClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Class serializationType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField$Serialization");
        Constructor annotatedFieldConstructor = annotatedFieldClazz.getDeclaredConstructor(serializationType);
        annotatedFieldConstructor.setAccessible(true);
        java.lang.Object[] annotatedFieldConstructorArguments = new java.lang.Object[1];
        annotatedFieldConstructorArguments[0] = ((Object) null);
        AnnotatedField annotatedField = ((AnnotatedField) annotatedFieldConstructor.newInstance(annotatedFieldConstructorArguments));
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedFieldType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedFieldType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = annotatedField;
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addAnnotationsIfNotPresent7() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary11 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary10);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedMemberType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_addAnnotationsIfNotPresent8() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class annotatedFieldClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Class serializationType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField$Serialization");
        Constructor annotatedFieldConstructor = annotatedFieldClazz.getDeclaredConstructor(serializationType);
        annotatedFieldConstructor.setAccessible(true);
        java.lang.Object[] annotatedFieldConstructorArguments = new java.lang.Object[1];
        annotatedFieldConstructorArguments[0] = ((Object) null);
        AnnotatedField annotatedField = ((AnnotatedField) annotatedFieldConstructor.newInstance(annotatedFieldConstructorArguments));
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.addIfNotPresent(AnnotatedMember.java:64)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:934) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedFieldType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedFieldType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = annotatedField;
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_addAnnotationsIfNotPresent9() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary10 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = new java.lang.annotation.Annotation[20];
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addAnnotationsIfNotPresent(AnnotatedClass.java:928) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addAnnotationsIfNotPresentMethod = annotatedClassClazz.getDeclaredMethod("_addAnnotationsIfNotPresent", annotatedMemberType, annotationArrayType);
        _addAnnotationsIfNotPresentMethod.setAccessible(true);
        java.lang.Object[] _addAnnotationsIfNotPresentMethodArguments = new java.lang.Object[2];
        _addAnnotationsIfNotPresentMethodArguments[0] = ((Object) null);
        _addAnnotationsIfNotPresentMethodArguments[1] = ((Object) annotationArray);
        try {
            _addAnnotationsIfNotPresentMethod.invoke(annotatedClass, _addAnnotationsIfNotPresentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass._addOrOverrideAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.executesCondition {@code (bundles != null): False}
 *  */
    @Test
    public void test_addOrOverrideAnnotations_BundlesEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): False}
 *  */
    @Test
    public void test_addOrOverrideAnnotations_AnnsEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) null);
        _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#_addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember,java.lang.annotation.Annotation[])}
 * @utbot.executesCondition {@code (anns != null): True}
 * @utbot.iterates iterate the loop {@code for(Annotation ann: anns)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: target.addOrOverride(ann);
 *  */
    @Test
    public void test_addOrOverrideAnnotations_ThrowNullPointerException() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        java.lang.annotation.Annotation[] annotationArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addOrOverrideAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addOrOverrideAnnotations(AnnotatedClass.java:956) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addOrOverrideAnnotations(com.fasterxml.jackson.databind.introspect.AnnotatedMember, [Ljava.lang.annotation.Annotation;)
    
    @Test(expected = StackOverflowError.class)
    public void test_addOrOverrideAnnotations1() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addOrOverrideAnnotations2() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addOrOverrideAnnotations3() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addOrOverrideAnnotations4() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = new java.lang.annotation.Annotation[17];
        
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_addOrOverrideAnnotations5() throws Throwable  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        java.lang.annotation.Annotation[] annotationArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass._addOrOverrideAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:51)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:89)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._isAnnotationBundle(AnnotatedClass.java:1013)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._addOrOverrideAnnotations(AnnotatedClass.java:950) */
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class annotationArrayType = Class.forName("[Ljava.lang.annotation.Annotation;");
        Method _addOrOverrideAnnotationsMethod = annotatedClassClazz.getDeclaredMethod("_addOrOverrideAnnotations", annotatedMemberType, annotationArrayType);
        _addOrOverrideAnnotationsMethod.setAccessible(true);
        java.lang.Object[] _addOrOverrideAnnotationsMethodArguments = new java.lang.Object[2];
        _addOrOverrideAnnotationsMethodArguments[0] = ((Object) null);
        _addOrOverrideAnnotationsMethodArguments[1] = ((Object) annotationArray);
        try {
            _addOrOverrideAnnotationsMethod.invoke(annotatedClass, _addOrOverrideAnnotationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.getMemberMethodCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMemberMethodCount()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getMemberMethodCount()}
 * @utbot.returnsFrom {@code return _memberMethods.size();}
 *  */
    @Test
    public void testGetMemberMethodCount_Return_memberMethodsSize() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        annotatedClass._memberMethods = _memberMethods;
        
        int actual = annotatedClass.getMemberMethodCount();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getMemberMethodCount()}
 * @utbot.returnsFrom {@code return _memberMethods.size();}
 *  */
    @Test
    public void testGetMemberMethodCount_Return_memberMethodsSize_1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        _memberMethods._methods = _methods;
        annotatedClass._memberMethods = _memberMethods;
        
        int actual = annotatedClass.getMemberMethodCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMemberMethodCount()
    
    @Test
    public void testGetMemberMethodCount1() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        
        AnnotatedMethodMap initialAnnotatedClass_memberMethods = annotatedClass._memberMethods;
        
        int actual = annotatedClass.getMemberMethodCount();
        
        assertEquals(0, actual);
        
        AnnotatedMethodMap finalAnnotatedClass_memberMethods = annotatedClass._memberMethods;
        
        assertFalse(initialAnnotatedClass_memberMethods == finalAnnotatedClass_memberMethods);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMemberMethodCount()
    
    @Test
    public void testGetMemberMethodCount2() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.getMemberMethodCount] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getMemberMethodCount(AnnotatedClass.java:259) */
        annotatedClass.getMemberMethodCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method memberMethods()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#memberMethods()}
 * @utbot.executesCondition {@code (_memberMethods == null): False}
 * @utbot.returnsFrom {@code return _memberMethods;}
 *  */
    @Test
    public void testMemberMethods__memberMethodsNotEqualsNull() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        annotatedClass._memberMethods = _memberMethods;
        
        AnnotatedMethodMap actual = ((AnnotatedMethodMap) annotatedClass.memberMethods());
        
        AnnotatedMethodMap expected = new AnnotatedMethodMap();
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method memberMethods()
    
    /**
    @utbot.classUnderTest {@link AnnotatedClass}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#memberMethods()}
 * @utbot.executesCondition {@code (_memberMethods == null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.introspect.AnnotatedClass#resolveMemberMethods()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolveMemberMethods();
 *  */
    @Test
    public void testMemberMethods_ThrowNullPointerException() throws Exception  {
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:251) */
        annotatedClass.memberMethods();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1063268457925200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1063268457925200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1063268457937600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063268457925200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063268457937600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1063268458494599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063268458494599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063268458497900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063268458494599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063268458497900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1063268465241200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063268465241200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063268465244300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063268465241200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063268465244300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1063268466257000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063268466257000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063268466258999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063268466257000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063268466258999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

