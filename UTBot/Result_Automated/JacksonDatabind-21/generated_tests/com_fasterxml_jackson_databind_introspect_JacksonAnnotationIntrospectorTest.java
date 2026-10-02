package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import com.fasterxml.jackson.core.Version;
import java.util.List;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

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
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 6);
        String _groupId = "com.fasterxml.jackson.core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_groupId", _groupId);
        String _artifactId = "jackson-databind";
        setField(expected, "com.fasterxml.jackson.core.Version", "_artifactId", _artifactId);
        String _snapshotInfo = "rc2";
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1123)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnySetterAnnotation(JacksonAnnotationIntrospector.java:850) */
        jacksonAnnotationIntrospector.hasAnySetterAnnotation(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilderConfig(JacksonAnnotationIntrospector.java:802) */
        jacksonAnnotationIntrospector.findPOJOBuilderConfig(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1123)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAnyGetterAnnotation(JacksonAnnotationIntrospector.java:859) */
        jacksonAnnotationIntrospector.hasAnyGetterAnnotation(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasCreatorAnnotation(JacksonAnnotationIntrospector.java:869) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter(JacksonAnnotationIntrospector.java:767) */
        jacksonAnnotationIntrospector.findDeserializationConverter(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAndAddVirtualProperties(JacksonAnnotationIntrospector.java:575) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationType(JacksonAnnotationIntrospector.java:747) */
        jacksonAnnotationIntrospector.findDeserializationType(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationTyping(JacksonAnnotationIntrospector.java:528) */
        jacksonAnnotationIntrospector.findSerializationTyping(null);
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
    public void test_constructVirtualProperty_ThrowNullPointerException() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty(JacksonAnnotationIntrospector.java:613) */
        jacksonAnnotationIntrospector._constructVirtualProperty(null, null, null, null);
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
    public void test_constructVirtualProperty_ThrowNullPointerException1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._constructVirtualProperty(JacksonAnnotationIntrospector.java:637) */
        jacksonAnnotationIntrospector._constructVirtualProperty(null, null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:507) */
        jacksonAnnotationIntrospector.findSerializationType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_ReturnNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
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
    public void testFindPropertyTypeResolver_ReturnNull_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
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
    public void testFindPropertyTypeResolver_ReturnNull_2() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        TypeResolverBuilder actual = jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, arrayType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: baseType.isContainerType()
 *  */
    @Test
    public void testFindPropertyTypeResolver_ThrowNullPointerException() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyTypeResolver(JacksonAnnotationIntrospector.java:328) */
        jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (!containerType.isContainerType()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !containerType.isContainerType()
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:341) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !containerType.isContainerType()
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ThrowNullPointerException() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyContentTypeResolver(JacksonAnnotationIntrospector.java:340) */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationConverter(JacksonAnnotationIntrospector.java:534) */
        jacksonAnnotationIntrospector.findSerializationConverter(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findIgnoreUnknownProperties(JacksonAnnotationIntrospector.java:118) */
        jacksonAnnotationIntrospector.findIgnoreUnknownProperties(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findUnwrappingNameTransformer(JacksonAnnotationIntrospector.java:265) */
        jacksonAnnotationIntrospector.findUnwrappingNameTransformer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore(JacksonAnnotationIntrospector.java:99) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertiesToIgnore(JacksonAnnotationIntrospector.java:93) */
        jacksonAnnotationIntrospector.findPropertiesToIgnore(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentType(JacksonAnnotationIntrospector.java:521) */
        jacksonAnnotationIntrospector.findSerializationContentType(null, null);
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
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentDeserializer(JacksonAnnotationIntrospector.java:734) */
        jacksonAnnotationIntrospector.findContentDeserializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationContentConverter(JacksonAnnotationIntrospector.java:540) */
        jacksonAnnotationIntrospector.findSerializationContentConverter(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForDeserialization(JacksonAnnotationIntrospector.java:819) */
        jacksonAnnotationIntrospector.findNameForDeserialization(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAutoDetectVisibility(JacksonAnnotationIntrospector.java:172) */
        jacksonAnnotationIntrospector.findAutoDetectVisibility(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationPropertyOrder(JacksonAnnotationIntrospector.java:552) */
        jacksonAnnotationIntrospector.findSerializationPropertyOrder(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeyDeserializer(JacksonAnnotationIntrospector.java:721) */
        jacksonAnnotationIntrospector.findKeyDeserializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationKeyType(JacksonAnnotationIntrospector.java:514) */
        jacksonAnnotationIntrospector.findSerializationKeyType(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findValueInstantiator(JacksonAnnotationIntrospector.java:787) */
        jacksonAnnotationIntrospector.findValueInstantiator(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectReferenceInfo(JacksonAnnotationIntrospector.java:390) */
        jacksonAnnotationIntrospector.findObjectReferenceInfo(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDescription(JacksonAnnotationIntrospector.java:215) */
        jacksonAnnotationIntrospector.findPropertyDescription(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findContentSerializer(JacksonAnnotationIntrospector.java:445) */
        jacksonAnnotationIntrospector.findContentSerializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForSerialization(JacksonAnnotationIntrospector.java:673) */
        jacksonAnnotationIntrospector.findNameForSerialization(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentType(JacksonAnnotationIntrospector.java:760) */
        jacksonAnnotationIntrospector.findDeserializationContentType(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyDefaultValue(JacksonAnnotationIntrospector.java:233) */
        jacksonAnnotationIntrospector.findPropertyDefaultValue(null);
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
        JsonInclude.Include include = JsonInclude.Include.NON_EMPTY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion(JacksonAnnotationIntrospector.java:474) */
        jacksonAnnotationIntrospector.findSerializationInclusion(null, include);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasAsValueAnnotation(JacksonAnnotationIntrospector.java:693) */
        jacksonAnnotationIntrospector.hasAsValueAnnotation(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findInjectableValueId(JacksonAnnotationIntrospector.java:279) */
        jacksonAnnotationIntrospector.findInjectableValueId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findImplicitPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindImplicitPropertyName_ReturnNull() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        String actual = jacksonAnnotationIntrospector.findImplicitPropertyName(null);
        
        assertNull(actual);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationKeyType(JacksonAnnotationIntrospector.java:753) */
        jacksonAnnotationIntrospector.findDeserializationKeyType(null, null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha(JacksonAnnotationIntrospector.java:568)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically(JacksonAnnotationIntrospector.java:558) */
        jacksonAnnotationIntrospector.findSerializationSortAlphabetically(((Annotated) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically
    
    ///region FUZZER: ERROR SUITE for method findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindSerializationSortAlphabeticallyThrowsNPE1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha(JacksonAnnotationIntrospector.java:568)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationSortAlphabetically(JacksonAnnotationIntrospector.java:564) */
        jacksonAnnotationIntrospector.findSerializationSortAlphabetically(((AnnotatedClass) null));
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter(JacksonAnnotationIntrospector.java:774) */
        jacksonAnnotationIntrospector.findDeserializationContentConverter(null);
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
        JsonInclude.Include include = JsonInclude.Include.NON_EMPTY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusionForContent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusionForContent(JacksonAnnotationIntrospector.java:500) */
        jacksonAnnotationIntrospector.findSerializationInclusionForContent(null, include);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findSortAlpha(JacksonAnnotationIntrospector.java:568) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializer(JacksonAnnotationIntrospector.java:707) */
        jacksonAnnotationIntrospector.findDeserializer(null);
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
    public void test_classIfExplicit_ClassUtilIsBogusClass() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
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
    public void test_classIfExplicit_ClsEqualsNull() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._classIfExplicit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _classIfExplicit(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ReturnClsNotEqualsNullOrClsNotEqualsImplicit_1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1, null);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null || cls == implicit)): True}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ClsEqualsNullOrClsEqualsImplicit() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        Class class1 = Object.class;
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(class1, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_classIfExplicit(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return (cls == null || cls == implicit) ? null : cls;}
 *  */
    @Test
    public void test_classIfExplicit_ReturnClsNotEqualsNullOrClsNotEqualsImplicit() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        Class actual = jacksonAnnotationIntrospector._classIfExplicit(null, null);
        
        assertNull(actual);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver(JacksonAnnotationIntrospector.java:923) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable(JacksonAnnotationIntrospector.java:887) */
        jacksonAnnotationIntrospector._isIgnorable(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder(JacksonAnnotationIntrospector.java:795) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findCreatorBinding(JacksonAnnotationIntrospector.java:875) */
        jacksonAnnotationIntrospector.findCreatorBinding(null);
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
            JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
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
    public void test_propertyName_ThrowNullPointerException() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._propertyName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._propertyName(JacksonAnnotationIntrospector.java:904) */
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAnnotationBundle(java.lang.annotation.Annotation)
    
    /**
    @utbot.classUnderTest {@link JacksonAnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#isAnnotationBundle(java.lang.annotation.Annotation)}
 * @utbot.invokes {@link java.lang.annotation.Annotation#annotationType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ann.annotationType().getAnnotation(JacksonAnnotationsInside.class) != null;
 *  */
    @Test
    public void testIsAnnotationBundle_ThrowNullPointerException() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:51) */
        jacksonAnnotationIntrospector.isAnnotationBundle(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findRootName(JacksonAnnotationIntrospector.java:79) */
        jacksonAnnotationIntrospector.findRootName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId
    
    ///region FUZZER: ERROR SUITE for method _findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#_findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void test_findFilterIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId(JacksonAnnotationIntrospector.java:144) */
        jacksonAnnotationIntrospector._findFilterId(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._isIgnorable(JacksonAnnotationIntrospector.java:887)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasIgnoreMarker(JacksonAnnotationIntrospector.java:191) */
        jacksonAnnotationIntrospector.hasIgnoreMarker(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId(JacksonAnnotationIntrospector.java:144)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId(JacksonAnnotationIntrospector.java:139) */
        jacksonAnnotationIntrospector.findFilterId(((Annotated) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId
    
    ///region FUZZER: ERROR SUITE for method findFilterId(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findFilterId(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindFilterIdThrowsNPE1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId(JacksonAnnotationIntrospector.java:144)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId(JacksonAnnotationIntrospector.java:134) */
        jacksonAnnotationIntrospector.findFilterId(((AnnotatedClass) null));
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findViews(JacksonAnnotationIntrospector.java:304) */
        jacksonAnnotationIntrospector.findViews(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFormat(JacksonAnnotationIntrospector.java:244) */
        jacksonAnnotationIntrospector.findFormat(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.hasRequiredMarker(JacksonAnnotationIntrospector.java:197) */
        jacksonAnnotationIntrospector.hasRequiredMarker(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyAccess(JacksonAnnotationIntrospector.java:206) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPropertyIndex(JacksonAnnotationIntrospector.java:221) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNamingStrategy(JacksonAnnotationIntrospector.java:158) */
        jacksonAnnotationIntrospector.findNamingStrategy(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findReferenceType(JacksonAnnotationIntrospector.java:251) */
        jacksonAnnotationIntrospector.findReferenceType(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isIgnorableType(JacksonAnnotationIntrospector.java:124) */
        jacksonAnnotationIntrospector.isIgnorableType(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes(JacksonAnnotationIntrospector.java:349) */
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1123)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isTypeId(JacksonAnnotationIntrospector.java:368) */
        jacksonAnnotationIntrospector.isTypeId(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNullSerializer(JacksonAnnotationIntrospector.java:459) */
        jacksonAnnotationIntrospector.findNullSerializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeySerializer(JacksonAnnotationIntrospector.java:431) */
        jacksonAnnotationIntrospector.findKeySerializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeName(JacksonAnnotationIntrospector.java:362) */
        jacksonAnnotationIntrospector.findTypeName(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializer(JacksonAnnotationIntrospector.java:406) */
        jacksonAnnotationIntrospector.findSerializer(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findObjectIdInfo(JacksonAnnotationIntrospector.java:379) */
        jacksonAnnotationIntrospector.findObjectIdInfo(null);
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
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1106)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver(JacksonAnnotationIntrospector.java:923)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findTypeResolver(JacksonAnnotationIntrospector.java:318) */
        jacksonAnnotationIntrospector.findTypeResolver(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1067919373884599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1067919373884599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1067919373892900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067919373884599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067919373892900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1067919374381100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1067919374381100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1067919374384500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067919374381100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067919374384500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1067919374788899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1067919374788899.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1067919374792200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067919374788899.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067919374792200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

