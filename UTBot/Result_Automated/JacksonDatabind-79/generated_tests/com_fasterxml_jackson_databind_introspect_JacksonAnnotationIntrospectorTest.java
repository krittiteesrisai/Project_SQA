package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.RetentionPolicy;
import sun.net.www.protocol.http.AuthScheme;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;

public final class com_fasterxml_jackson_databind_introspect_JacksonAnnotationIntrospectorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.version
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method version()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#version()}
     */
    @Test
    public void testVersion() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        Version actual = jacksonAnnotationIntrospector.version();
        
        Version expected = ((Version) createInstance("com.fasterxml.jackson.core.Version"));
        setField(expected, "com.fasterxml.jackson.core.Version", "_majorVersion", 2);
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 7);
        setField(expected, "com.fasterxml.jackson.core.Version", "_patchLevel", 9);
        String _groupId = "com.fasterxml.jackson.core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_groupId", _groupId);
        String _artifactId = "jackson-databind";
        setField(expected, "com.fasterxml.jackson.core.Version", "_artifactId", _artifactId);
        String _snapshotInfo = "2";
        setField(expected, "com.fasterxml.jackson.core.Version", "_snapshotInfo", _snapshotInfo);
        
        // com.fasterxml.jackson.core.Version has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for version
    
    public void testVersion_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#readResolve()}
 * @utbot.executesCondition {@code (_annotationsInside == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve__annotationsInsideNotEqualsNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        LRUMap _annotationsInside = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        jacksonAnnotationIntrospector._annotationsInside = _annotationsInside;
        
        JacksonAnnotationIntrospector actual = ((JacksonAnnotationIntrospector) jacksonAnnotationIntrospector.readResolve());
        
        LRUMap jacksonAnnotationIntrospector_annotationsInside = jacksonAnnotationIntrospector._annotationsInside;
        LRUMap actual_annotationsInside = actual._annotationsInside;
        int jacksonAnnotationIntrospector_annotationsInside_maxEntries = ((Integer) getFieldValue(jacksonAnnotationIntrospector_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_annotationsInside_maxEntries = ((Integer) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(jacksonAnnotationIntrospector_annotationsInside_maxEntries, actual_annotationsInside_maxEntries);
        
        ConcurrentHashMap actual_annotationsInside_map = ((ConcurrentHashMap) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertNull(actual_annotationsInside_map);
        
        int jacksonAnnotationIntrospector_annotationsInside_jdkSerializeMaxEntries = ((Integer) getFieldValue(jacksonAnnotationIntrospector_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_annotationsInside_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(jacksonAnnotationIntrospector_annotationsInside_jdkSerializeMaxEntries, actual_annotationsInside_jdkSerializeMaxEntries);
        
        boolean actual_cfgConstructorPropertiesImpliesCreator = actual._cfgConstructorPropertiesImpliesCreator;
        assertFalse(actual_cfgConstructorPropertiesImpliesCreator);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readResolve()
    
    @Test
    public void testReadResolve1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        LRUMap initialJacksonAnnotationIntrospector_annotationsInside = jacksonAnnotationIntrospector._annotationsInside;
        
        JacksonAnnotationIntrospector actual = ((JacksonAnnotationIntrospector) jacksonAnnotationIntrospector.readResolve());
        
        LRUMap jacksonAnnotationIntrospector_annotationsInside = jacksonAnnotationIntrospector._annotationsInside;
        LRUMap actual_annotationsInside = actual._annotationsInside;
        int jacksonAnnotationIntrospector_annotationsInside_maxEntries = ((Integer) getFieldValue(jacksonAnnotationIntrospector_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_annotationsInside_maxEntries = ((Integer) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(jacksonAnnotationIntrospector_annotationsInside_maxEntries, actual_annotationsInside_maxEntries);
        
        ConcurrentHashMap jacksonAnnotationIntrospector_annotationsInside_map = ((ConcurrentHashMap) getFieldValue(jacksonAnnotationIntrospector_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        ConcurrentHashMap actual_annotationsInside_map = ((ConcurrentHashMap) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertTrue(deepEquals(jacksonAnnotationIntrospector_annotationsInside_map, actual_annotationsInside_map));
        
        int jacksonAnnotationIntrospector_annotationsInside_jdkSerializeMaxEntries = ((Integer) getFieldValue(jacksonAnnotationIntrospector_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_annotationsInside_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_annotationsInside, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(jacksonAnnotationIntrospector_annotationsInside_jdkSerializeMaxEntries, actual_annotationsInside_jdkSerializeMaxEntries);
        
        boolean actual_cfgConstructorPropertiesImpliesCreator = actual._cfgConstructorPropertiesImpliesCreator;
        assertFalse(actual_cfgConstructorPropertiesImpliesCreator);
        
        LRUMap finalJacksonAnnotationIntrospector_annotationsInside = jacksonAnnotationIntrospector._annotationsInside;
        
        assertFalse(initialJacksonAnnotationIntrospector_annotationsInside == finalJacksonAnnotationIntrospector_annotationsInside);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findEnumValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnumValue(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findEnumValue(java.lang.Enum)}
 * @utbot.invokes {@link java.lang.Enum#name()}
 * @utbot.invokes {@link java.lang.Class#getField(java.lang.String)}
 *  */
    @Test
    public void testFindEnumValue_ClassGetField() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        
        String actual = jacksonAnnotationIntrospector.findEnumValue(retentionPolicy);
        
        String expected = "SOURCE";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumValue(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findEnumValue(java.lang.Enum)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Field f = value.getClass().getField(value.name());
 *  */
    @Test
    public void testFindEnumValue_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findEnumValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findEnumValue(JacksonAnnotationIntrospector.java:185) */
        jacksonAnnotationIntrospector.findEnumValue(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findEnumValue(java.lang.Enum)
    
    @Test
    public void testFindEnumValue1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AuthScheme authScheme = AuthScheme.BASIC;
        
        String actual = jacksonAnnotationIntrospector.findEnumValue(authScheme);
        
        String expected = "BASIC";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findRootName
    
    ///region FUZZER: ERROR SUITE for method findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindRootNameThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findRootName(JacksonAnnotationIntrospector.java:245) */
        jacksonAnnotationIntrospector.findRootName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isIgnorableType
    
    ///region FUZZER: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testIsIgnorableTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isIgnorableType(JacksonAnnotationIntrospector.java:290) */
        jacksonAnnotationIntrospector.isIgnorableType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAnnotationBundle(java.lang.annotation.Annotation)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#isAnnotationBundle(java.lang.annotation.Annotation)}
 * @utbot.invokes {@link java.lang.annotation.Annotation#annotationType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> type = ann.annotationType();
 *  */
    @Test
    public void testIsAnnotationBundle_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:158) */
        jacksonAnnotationIntrospector.isAnnotationBundle(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findEnumValues
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findEnumValues(java.lang.Class, [Ljava.lang.Enum;, [Ljava.lang.String;)
    
    @Test
    public void testFindEnumValues1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Class class1 = Object.class;
        java.lang.Enum[] enumArray = {null, null, null, null, null, null, null, null, null};
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.String[] actual = jacksonAnnotationIntrospector.findEnumValues(class1, enumArray, stringArray);
        
        int stringArraySize = stringArray.length;
        assertEquals(stringArraySize, actual.length);
        assertTrue(deepEquals(stringArray, actual));
        
        Class finalClass1 = class1;
        
        Enum finalEnumArray0 = enumArray[0];
        Enum finalEnumArray1 = enumArray[1];
        Enum finalEnumArray2 = enumArray[2];
        Enum finalEnumArray3 = enumArray[3];
        Enum finalEnumArray4 = enumArray[4];
        Enum finalEnumArray5 = enumArray[5];
        Enum finalEnumArray6 = enumArray[6];
        Enum finalEnumArray7 = enumArray[7];
        Enum finalEnumArray8 = enumArray[8];
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalEnumArray0);
        
        assertNull(finalEnumArray1);
        
        assertNull(finalEnumArray2);
        
        assertNull(finalEnumArray3);
        
        assertNull(finalEnumArray4);
        
        assertNull(finalEnumArray5);
        
        assertNull(finalEnumArray6);
        
        assertNull(finalEnumArray7);
        
        assertNull(finalEnumArray8);
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasIgnoreMarker
    
    ///region FUZZER: ERROR SUITE for method hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testHasIgnoreMarkerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasIgnoreMarker] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable(JacksonAnnotationIntrospector.java:1126)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasIgnoreMarker(JacksonAnnotationIntrospector.java:348) */
        jacksonAnnotationIntrospector.hasIgnoreMarker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasRequiredMarker
    
    ///region FUZZER: ERROR SUITE for method hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testHasRequiredMarkerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasRequiredMarker] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasRequiredMarker(JacksonAnnotationIntrospector.java:354) */
        jacksonAnnotationIntrospector.hasRequiredMarker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFormat
    
    ///region FUZZER: ERROR SUITE for method findFormat(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findFormat(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindFormatThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFormat(JacksonAnnotationIntrospector.java:401) */
        jacksonAnnotationIntrospector.findFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findViews
    
    ///region FUZZER: ERROR SUITE for method findViews(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findViews(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindViewsThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findViews(JacksonAnnotationIntrospector.java:461) */
        jacksonAnnotationIntrospector.findViews(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyAccess
    
    ///region FUZZER: ERROR SUITE for method findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyAccessThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyAccess(JacksonAnnotationIntrospector.java:363) */
        jacksonAnnotationIntrospector.findPropertyAccess(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyIndex
    
    ///region FUZZER: ERROR SUITE for method findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyIndexThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyIndex(JacksonAnnotationIntrospector.java:378) */
        jacksonAnnotationIntrospector.findPropertyIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNamingStrategy
    
    ///region FUZZER: ERROR SUITE for method findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindNamingStrategyThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNamingStrategy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNamingStrategy(JacksonAnnotationIntrospector.java:310) */
        jacksonAnnotationIntrospector.findNamingStrategy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId
    
    ///region FUZZER: ERROR SUITE for method findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindFilterIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId(JacksonAnnotationIntrospector.java:296) */
        jacksonAnnotationIntrospector.findFilterId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findReferenceType
    
    ///region FUZZER: ERROR SUITE for method findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindReferenceTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findReferenceType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findReferenceType(JacksonAnnotationIntrospector.java:408) */
        jacksonAnnotationIntrospector.findReferenceType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeResolver
    
    ///region FUZZER: ERROR SUITE for method findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindTypeResolverThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver(JacksonAnnotationIntrospector.java:1189)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeResolver(JacksonAnnotationIntrospector.java:503) */
        jacksonAnnotationIntrospector.findTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectIdInfo
    
    ///region FUZZER: ERROR SUITE for method findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindObjectIdInfoThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectIdInfo] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectIdInfo(JacksonAnnotationIntrospector.java:567) */
        jacksonAnnotationIntrospector.findObjectIdInfo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializer
    
    ///region FUZZER: ERROR SUITE for method findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializer(JacksonAnnotationIntrospector.java:594) */
        jacksonAnnotationIntrospector.findSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes
    
    ///region FUZZER: ERROR SUITE for method findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSubtypesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes(JacksonAnnotationIntrospector.java:537) */
        jacksonAnnotationIntrospector.findSubtypes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isTypeId
    
    ///region FUZZER: ERROR SUITE for method isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testIsTypeIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1402)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isTypeId(JacksonAnnotationIntrospector.java:556) */
        jacksonAnnotationIntrospector.isTypeId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeName
    
    ///region FUZZER: ERROR SUITE for method findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindTypeNameThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeName(JacksonAnnotationIntrospector.java:550) */
        jacksonAnnotationIntrospector.findTypeName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeySerializer
    
    ///region FUZZER: ERROR SUITE for method findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindKeySerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeySerializer(JacksonAnnotationIntrospector.java:619) */
        jacksonAnnotationIntrospector.findKeySerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNullSerializer
    
    ///region FUZZER: ERROR SUITE for method findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNullSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNullSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNullSerializer(JacksonAnnotationIntrospector.java:647) */
        jacksonAnnotationIntrospector.findNullSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha
    
    ///region FUZZER: ERROR SUITE for method _findSortAlpha(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_findSortAlpha(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void test_findSortAlphaThrowsNPE() throws Throwable  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha(JacksonAnnotationIntrospector.java:795) */
        Class jacksonAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Method _findSortAlphaMethod = jacksonAnnotationIntrospectorClazz.getDeclaredMethod("_findSortAlpha", annotatedType);
        _findSortAlphaMethod.setAccessible(true);
        java.lang.Object[] _findSortAlphaMethodArguments = new java.lang.Object[1];
        _findSortAlphaMethodArguments[0] = ((Object) null);
        try {
            _findSortAlphaMethod.invoke(jacksonAnnotationIntrospector, _findSortAlphaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._classIfExplicit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _classIfExplicit(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): False}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ClsEqualsNullOrClsEqualsImplicit_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1, null);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): True}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): False}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ClsNotEqualsNullOrClsNotEqualsImplicit() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1, null);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): True}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): True}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ClsEqualsNullOrClsEqualsImplicit_2() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): False}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ClsEqualsNullOrClsEqualsImplicit() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._classIfExplicit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _classIfExplicit(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isBogusClass(java.lang.Class)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_classIfExplicit_ClassUtilIsBogusClass() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_classIfExplicit_ClsEqualsNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._propertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _propertyName(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_propertyName(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (localName.isEmpty()): True}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.returnsFrom {@code return PropertyName.USE_DEFAULT;}
 *  */
    @Test
    public void test_propertyName_LocalNameIsEmpty() throws Exception  {
        PropertyName prevUSE_DEFAULT = PropertyName.USE_DEFAULT;
        try {
            PropertyName useDefault = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(useDefault, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class propertyNameClazz = Class.forName("com.fasterxml.jackson.databind.PropertyName");
            setStaticField(propertyNameClazz, "USE_DEFAULT", useDefault);
            JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            String string = "";
            
            PropertyName actual = jacksonAnnotationIntrospector._propertyName(string, null);
            
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(useDefault, actual);
        } finally {
            setStaticField(PropertyName.class, "USE_DEFAULT", prevUSE_DEFAULT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _propertyName(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_propertyName(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: localName.isEmpty()
 *  */
    @Test
    public void test_propertyName_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._propertyName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._propertyName(JacksonAnnotationIntrospector.java:1152) */
        jacksonAnnotationIntrospector._propertyName(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _propertyName(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_propertyName(java.lang.String,java.lang.String)}
     */
    @Test
    public void test_propertyNameWithNonEmptyStrings() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        PropertyName actual = jacksonAnnotationIntrospector._propertyName("X", "10");
        
        PropertyName expected = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "X";
        setField(expected, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        String _namespace = "10";
        setField(expected, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver
    
    ///region FUZZER: ERROR SUITE for method _findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void test_findTypeResolverThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver(JacksonAnnotationIntrospector.java:1189) */
        jacksonAnnotationIntrospector._findTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable
    
    ///region FUZZER: ERROR SUITE for method _isIgnorable(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_isIgnorable(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void test_isIgnorableThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable(JacksonAnnotationIntrospector.java:1126) */
        jacksonAnnotationIntrospector._isIgnorable(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializer
    
    ///region FUZZER: ERROR SUITE for method findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializer(JacksonAnnotationIntrospector.java:934) */
        jacksonAnnotationIntrospector.findDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder
    
    ///region FUZZER: ERROR SUITE for method findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindPOJOBuilderThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder(JacksonAnnotationIntrospector.java:1031) */
        jacksonAnnotationIntrospector.findPOJOBuilder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findCreatorBinding
    
    ///region FUZZER: ERROR SUITE for method findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindCreatorBindingThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findCreatorBinding] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findCreatorBinding(JacksonAnnotationIntrospector.java:1114) */
        jacksonAnnotationIntrospector.findCreatorBinding(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.setConstructorPropertiesImpliesCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setConstructorPropertiesImpliesCreator(boolean)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#setConstructorPropertiesImpliesCreator(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetConstructorPropertiesImpliesCreator_Return() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        JacksonAnnotationIntrospector actual = jacksonAnnotationIntrospector.setConstructorPropertiesImpliesCreator(false);
        
        LRUMap actual_annotationsInside = actual._annotationsInside;
        assertNull(actual_annotationsInside);
        
        boolean actual_cfgConstructorPropertiesImpliesCreator = actual._cfgConstructorPropertiesImpliesCreator;
        assertFalse(actual_cfgConstructorPropertiesImpliesCreator);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusionForContent
    
    ///region FUZZER: ERROR SUITE for method findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
     */
    @Test
    public void testFindSerializationInclusionForContentThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        JsonInclude.Include include = JsonInclude.Include.ALWAYS;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusionForContent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusionForContent(JacksonAnnotationIntrospector.java:692) */
        jacksonAnnotationIntrospector.findSerializationInclusionForContent(null, include);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically
    
    ///region FUZZER: ERROR SUITE for method findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationSortAlphabeticallyThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha(JacksonAnnotationIntrospector.java:795)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically(JacksonAnnotationIntrospector.java:791) */
        jacksonAnnotationIntrospector.findSerializationSortAlphabetically(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter
    
    ///region FUZZER: ERROR SUITE for method findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindDeserializationContentConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter(JacksonAnnotationIntrospector.java:982) */
        jacksonAnnotationIntrospector.findDeserializationContentConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentSerializer
    
    ///region FUZZER: ERROR SUITE for method findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindContentSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentSerializer(JacksonAnnotationIntrospector.java:633) */
        jacksonAnnotationIntrospector.findContentSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForDeserialization
    
    ///region FUZZER: ERROR SUITE for method findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNameForDeserializationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForDeserialization] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForDeserialization(JacksonAnnotationIntrospector.java:1053) */
        jacksonAnnotationIntrospector.findNameForDeserialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDescription
    
    ///region FUZZER: ERROR SUITE for method findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyDescriptionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDescription] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDescription(JacksonAnnotationIntrospector.java:372) */
        jacksonAnnotationIntrospector.findPropertyDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationConverter
    
    ///region FUZZER: ERROR SUITE for method findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationConverter(JacksonAnnotationIntrospector.java:767) */
        jacksonAnnotationIntrospector.findSerializationConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAndAddVirtualProperties
    
    ///region FUZZER: ERROR SUITE for method findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List)}
     */
    @Test
    public void testFindAndAddVirtualPropertiesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        List list = emptyList();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAndAddVirtualProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAndAddVirtualProperties(JacksonAnnotationIntrospector.java:808) */
        jacksonAnnotationIntrospector.findAndAddVirtualProperties(null, null, list);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationType
    
    ///region FUZZER: ERROR SUITE for method findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationType(JacksonAnnotationIntrospector.java:1003) */
        jacksonAnnotationIntrospector.findDeserializationType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForSerialization
    
    ///region FUZZER: ERROR SUITE for method findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNameForSerializationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForSerialization] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForSerialization(JacksonAnnotationIntrospector.java:904) */
        jacksonAnnotationIntrospector.findNameForSerialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructNoTypeResolverBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructNoTypeResolverBuilder()
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_constructNoTypeResolverBuilder()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#noTypeInfoBuilder()}
 * @utbot.returnsFrom {@code return StdTypeResolverBuilder.noTypeInfoBuilder();}
 *  */
    @Test
    public void test_constructNoTypeResolverBuilder_StdTypeResolverBuilderNoTypeInfoBuilder() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        StdTypeResolverBuilder actual = jacksonAnnotationIntrospector._constructNoTypeResolverBuilder();
        
        StdTypeResolverBuilder expected = ((StdTypeResolverBuilder) createInstance("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType", _idType);
        
        JsonTypeInfo.Id expected_idType = ((JsonTypeInfo.Id) getFieldValue(expected, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType"));
        JsonTypeInfo.Id actual_idType = ((JsonTypeInfo.Id) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType"));
        assertEquals(expected_idType, actual_idType);
        
        JsonTypeInfo.As actual_includeAs = ((JsonTypeInfo.As) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_includeAs"));
        assertNull(actual_includeAs);
        
        String actual_typeProperty = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeProperty"));
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeIdVisible"));
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_defaultImpl"));
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = ((TypeIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_customIdResolver"));
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _constructNoTypeResolverBuilder()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_constructNoTypeResolverBuilder()}
     */
    @Test
    public void test_constructNoTypeResolverBuilder() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        StdTypeResolverBuilder actual = jacksonAnnotationIntrospector._constructNoTypeResolverBuilder();
        
        StdTypeResolverBuilder expected = ((StdTypeResolverBuilder) createInstance("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType", _idType);
        
        JsonTypeInfo.Id expected_idType = ((JsonTypeInfo.Id) getFieldValue(expected, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType"));
        JsonTypeInfo.Id actual_idType = ((JsonTypeInfo.Id) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType"));
        assertEquals(expected_idType, actual_idType);
        
        JsonTypeInfo.As actual_includeAs = ((JsonTypeInfo.As) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_includeAs"));
        assertNull(actual_includeAs);
        
        String actual_typeProperty = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeProperty"));
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeIdVisible"));
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_defaultImpl"));
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = ((TypeIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_customIdResolver"));
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion
    
    ///region FUZZER: ERROR SUITE for method findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
     */
    @Test
    public void testFindSerializationInclusionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        JsonInclude.Include include = JsonInclude.Include.ALWAYS;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion(JacksonAnnotationIntrospector.java:662) */
        jacksonAnnotationIntrospector.findSerializationInclusion(null, include);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findConstructorName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findConstructorName(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_findConstructorName(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.executesCondition {@code (a instanceof AnnotatedParameter): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findConstructorName_NotANotInstanceOfAnnotatedParameter() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        PropertyName actual = jacksonAnnotationIntrospector._findConstructorName(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_findConstructorName(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.executesCondition {@code (a instanceof AnnotatedParameter): True}
 * @utbot.executesCondition {@code (ctor != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedParameter#getOwner()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findConstructorName_CtorEqualsNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        PropertyName actual = jacksonAnnotationIntrospector._findConstructorName(annotatedParameter);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for _findConstructorName
    
    public void test_findConstructorName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType
    
    ///region FUZZER: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:738) */
        jacksonAnnotationIntrospector.findSerializationType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Prop, com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Prop,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.annotation.JsonAppend.Prop#required()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.required()
 *  */
    @Test
    public void test_constructVirtualProperty_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty(JacksonAnnotationIntrospector.java:870) */
        jacksonAnnotationIntrospector._constructVirtualProperty(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Attr, com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Attr,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.annotation.JsonAppend.Attr#required()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attr.required()
 *  */
    @Test
    public void test_constructVirtualProperty_ThrowNullPointerException1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty(JacksonAnnotationIntrospector.java:846) */
        jacksonAnnotationIntrospector._constructVirtualProperty(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#isContainerType()} twice
    /// execute conditions:
    ///     {@code (baseType.isContainerType() || baseType.isReferenceType()): False}
    /// return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_ReturnNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        TypeResolverBuilder actual = jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, mapLikeType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_ReturnNull_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        TypeResolverBuilder actual = jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, collectionLikeType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_ReturnNull_2() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        TypeResolverBuilder actual = jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, arrayType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isReferenceType()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_JavaTypeIsReferenceType() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        TypeResolverBuilder actual = jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, referenceType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: baseType.isContainerType() || baseType.isReferenceType()
 *  */
    @Test
    public void testFindPropertyTypeResolver_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver(JacksonAnnotationIntrospector.java:514) */
        jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: containerType.getContentType() == null
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:528) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: containerType.getContentType() == null
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:241)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:529) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: containerType.getContentType() == null
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException_2() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:529) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: containerType.getContentType() == null
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException_3() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:144)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:213)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:529) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, referenceType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: containerType.getContentType() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolver_ThrowIllegalArgumentException_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, resolvedRecursiveType);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: containerType.getContentType() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolver_ThrowIllegalArgumentException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, arrayType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeyDeserializer
    
    ///region FUZZER: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindKeyDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeyDeserializer(JacksonAnnotationIntrospector.java:948) */
        jacksonAnnotationIntrospector.findKeyDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationKeyType
    
    ///region FUZZER: ERROR SUITE for method findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationKeyTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationKeyType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationKeyType(JacksonAnnotationIntrospector.java:1010) */
        jacksonAnnotationIntrospector.findDeserializationKeyType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnySetterAnnotation
    
    ///region FUZZER: ERROR SUITE for method hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAnySetterAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnySetterAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1402)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnySetterAnnotation(JacksonAnnotationIntrospector.java:1074) */
        jacksonAnnotationIntrospector.hasAnySetterAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasCreatorAnnotation
    
    ///region FUZZER: ERROR SUITE for method hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testHasCreatorAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasCreatorAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasCreatorAnnotation(JacksonAnnotationIntrospector.java:1093) */
        jacksonAnnotationIntrospector.hasCreatorAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter
    
    ///region FUZZER: ERROR SUITE for method findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindDeserializationConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter(JacksonAnnotationIntrospector.java:975) */
        jacksonAnnotationIntrospector.findDeserializationConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectReferenceInfo
    
    ///region FUZZER: ERROR SUITE for method findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
     */
    @Test
    public void testFindObjectReferenceInfoThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectReferenceInfo] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectReferenceInfo(JacksonAnnotationIntrospector.java:578) */
        jacksonAnnotationIntrospector.findObjectReferenceInfo(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationKeyType
    
    ///region FUZZER: ERROR SUITE for method findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindSerializationKeyTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationKeyType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationKeyType(JacksonAnnotationIntrospector.java:746) */
        jacksonAnnotationIntrospector.findSerializationKeyType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentType
    
    ///region FUZZER: ERROR SUITE for method findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindSerializationContentTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentType(JacksonAnnotationIntrospector.java:754) */
        jacksonAnnotationIntrospector.findSerializationContentType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentDeserializer
    
    ///region FUZZER: ERROR SUITE for method findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindContentDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentDeserializer(JacksonAnnotationIntrospector.java:961) */
        jacksonAnnotationIntrospector.findContentDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilderConfig
    
    ///region FUZZER: ERROR SUITE for method findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindPOJOBuilderConfigThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilderConfig] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilderConfig(JacksonAnnotationIntrospector.java:1038) */
        jacksonAnnotationIntrospector.findPOJOBuilderConfig(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationPropertyOrder
    
    ///region FUZZER: ERROR SUITE for method findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindSerializationPropertyOrderThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationPropertyOrder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationPropertyOrder(JacksonAnnotationIntrospector.java:785) */
        jacksonAnnotationIntrospector.findSerializationPropertyOrder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentType
    
    ///region FUZZER: ERROR SUITE for method findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationContentTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentType(JacksonAnnotationIntrospector.java:996) */
        jacksonAnnotationIntrospector.findDeserializationContentType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructStdTypeResolverBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructStdTypeResolverBuilder()
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_constructStdTypeResolverBuilder()}
 * @utbot.returnsFrom {@code return new StdTypeResolverBuilder();}
 *  */
    @Test
    public void test_constructStdTypeResolverBuilder_Return() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        StdTypeResolverBuilder actual = jacksonAnnotationIntrospector._constructStdTypeResolverBuilder();
        
        StdTypeResolverBuilder expected = ((StdTypeResolverBuilder) createInstance("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        
        JsonTypeInfo.Id actual_idType = ((JsonTypeInfo.Id) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_idType"));
        assertNull(actual_idType);
        
        JsonTypeInfo.As actual_includeAs = ((JsonTypeInfo.As) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_includeAs"));
        assertNull(actual_includeAs);
        
        String actual_typeProperty = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeProperty"));
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_typeIdVisible"));
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_defaultImpl"));
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = ((TypeIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "_customIdResolver"));
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationTyping
    
    ///region FUZZER: ERROR SUITE for method findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationTypingThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationTyping(JacksonAnnotationIntrospector.java:761) */
        jacksonAnnotationIntrospector.findSerializationTyping(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAutoDetectVisibility
    
    ///region FUZZER: ERROR SUITE for method findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.introspect.VisibilityChecker)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker)}
     */
    @Test
    public void testFindAutoDetectVisibilityThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAutoDetectVisibility] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAutoDetectVisibility(JacksonAnnotationIntrospector.java:330) */
        jacksonAnnotationIntrospector.findAutoDetectVisibility(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDefaultValue
    
    ///region FUZZER: ERROR SUITE for method findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyDefaultValueThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDefaultValue(JacksonAnnotationIntrospector.java:390) */
        jacksonAnnotationIntrospector.findPropertyDefaultValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAsValueAnnotation
    
    ///region FUZZER: ERROR SUITE for method hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAsValueAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAsValueAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAsValueAnnotation(JacksonAnnotationIntrospector.java:920) */
        jacksonAnnotationIntrospector.hasAsValueAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnyGetterAnnotation
    
    ///region FUZZER: ERROR SUITE for method hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAnyGetterAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnyGetterAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1402)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnyGetterAnnotation(JacksonAnnotationIntrospector.java:1083) */
        jacksonAnnotationIntrospector.hasAnyGetterAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findImplicitPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return (n == null) ? null : n.getSimpleName();}
 *  */
    @Test
    public void testFindImplicitPropertyName_ReturnNNotEqualsNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        String actual = jacksonAnnotationIntrospector.findImplicitPropertyName(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return (n == null) ? null : n.getSimpleName();}
 *  */
    @Test
    public void testFindImplicitPropertyName_ReturnNNotEqualsNull_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        String actual = jacksonAnnotationIntrospector.findImplicitPropertyName(annotatedParameter);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for findImplicitPropertyName
    
    public void testFindImplicitPropertyName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.resolveSetterConflict
    
    ///region Errors report for resolveSetterConflict
    
    public void testResolveSetterConflict_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentConverter
    
    ///region FUZZER: ERROR SUITE for method findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindSerializationContentConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentConverter(JacksonAnnotationIntrospector.java:773) */
        jacksonAnnotationIntrospector.findSerializationContentConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findUnwrappingNameTransformer
    
    ///region FUZZER: ERROR SUITE for method findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindUnwrappingNameTransformerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findUnwrappingNameTransformer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findUnwrappingNameTransformer(JacksonAnnotationIntrospector.java:422) */
        jacksonAnnotationIntrospector.findUnwrappingNameTransformer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findValueInstantiator
    
    ///region FUZZER: ERROR SUITE for method findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindValueInstantiatorThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findValueInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findValueInstantiator(JacksonAnnotationIntrospector.java:1023) */
        jacksonAnnotationIntrospector.findValueInstantiator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findClassDescription
    
    ///region FUZZER: ERROR SUITE for method findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindClassDescriptionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findClassDescription] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findClassDescription(JacksonAnnotationIntrospector.java:316) */
        jacksonAnnotationIntrospector.findClassDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findIgnoreUnknownProperties
    
    ///region FUZZER: ERROR SUITE for method findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindIgnoreUnknownPropertiesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findIgnoreUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findIgnoreUnknownProperties(JacksonAnnotationIntrospector.java:284) */
        jacksonAnnotationIntrospector.findIgnoreUnknownProperties(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findInjectableValueId
    
    ///region FUZZER: ERROR SUITE for method findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindInjectableValueIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findInjectableValueId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findInjectableValueId(JacksonAnnotationIntrospector.java:436) */
        jacksonAnnotationIntrospector.findInjectableValueId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyInclusion
    
    ///region FUZZER: ERROR SUITE for method findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyInclusionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyInclusion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyInclusion(JacksonAnnotationIntrospector.java:706) */
        jacksonAnnotationIntrospector.findPropertyInclusion(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore
    
    ///region FUZZER: ERROR SUITE for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated,boolean)}
     */
    @Test
    public void testFindPropertiesToIgnoreThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore(JacksonAnnotationIntrospector.java:265) */
        jacksonAnnotationIntrospector.findPropertiesToIgnore(null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore
    
    ///region FUZZER: ERROR SUITE for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertiesToIgnoreThrowsNPE1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1385)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore(JacksonAnnotationIntrospector.java:259) */
        jacksonAnnotationIntrospector.findPropertiesToIgnore(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1083728836602200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1083728836602200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1083728836606600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083728836602200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083728836606600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083728836946400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083728836946400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083728836948300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083728836946400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083728836948300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083728840419499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083728840419499.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083728840421200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083728840419499.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083728840421200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

