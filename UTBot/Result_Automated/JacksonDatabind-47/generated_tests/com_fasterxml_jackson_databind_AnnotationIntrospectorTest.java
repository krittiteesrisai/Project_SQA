package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.util.HashSet;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.annotation.RetentionPolicy;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_AnnotationIntrospectorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.pair
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pair(com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#pair(com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return new AnnotationIntrospectorPair(a1, a2);}
 *  */
    @Test
    public void testPair_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        AnnotationIntrospectorPair actual = ((AnnotationIntrospectorPair) AnnotationIntrospector.pair(null, null));
        
        AnnotationIntrospectorPair expected = new AnnotationIntrospectorPair(null, null);
        
        AnnotationIntrospector actual_primary = ((AnnotationIntrospector) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        assertNull(actual_primary);
        
        AnnotationIntrospector actual_secondary = ((AnnotationIntrospector) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        assertNull(actual_secondary);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method allIntrospectors(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#allIntrospectors(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testAllIntrospectors_CollectionAdd() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        HashSet hashSet = new HashSet();
        
        HashSet actual = ((HashSet) anonymousNopAnnotationIntrospector.allIntrospectors(hashSet));
        
        assertTrue(deepEquals(hashSet, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allIntrospectors(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#allIntrospectors(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.add(this);
 *  */
    @Test
    public void testAllIntrospectors_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors(AnnotationIntrospector.java:149) */
        jacksonAnnotationIntrospector.allIntrospectors(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method allIntrospectors(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#allIntrospectors(java.util.Collection)}
     */
    @Test
    public void testAllIntrospectorsThrowsUOE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        Collection collection = emptyList();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.AbstractList.add(AbstractList.java:153)
            java.base/java.util.AbstractList.add(AbstractList.java:111)
            com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors(AnnotationIntrospector.java:149) */
        jacksonAnnotationIntrospector.allIntrospectors(collection);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.allIntrospectors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method allIntrospectors()
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#allIntrospectors()}
 * @utbot.invokes {@link java.util.Collections#singletonList(java.lang.Object)}
 * @utbot.returnsFrom {@code return Collections.singletonList(this);}
 *  */
    @Test
    public void testAllIntrospectors_CollectionsSingletonList() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        List actual = ((List) jacksonAnnotationIntrospector.allIntrospectors());
        
        List expected = new ArrayList();
        expected.add(jacksonAnnotationIntrospector);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nopInstance()
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#nopInstance()}
 * @utbot.returnsFrom {@code return NopAnnotationIntrospector.instance;}
 *  */
    @Test
    public void testNopInstance_ReturnNopAnnotationIntrospectorInstance() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            
            NopAnnotationIntrospector actual = ((NopAnnotationIntrospector) AnnotationIntrospector.nopInstance());
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nopInstance()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#nopInstance()}
     */
    @Test
    public void testNopInstance() throws Exception  {
        NopAnnotationIntrospector actual = ((NopAnnotationIntrospector) AnnotationIntrospector.nopInstance());
        
        NopAnnotationIntrospector expected = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.isAnnotationBundle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAnnotationBundle(java.lang.annotation.Annotation)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isAnnotationBundle(java.lang.annotation.Annotation)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsAnnotationBundle_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.isAnnotationBundle(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isAnnotationBundle(java.lang.annotation.Annotation)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isAnnotationBundle(java.lang.annotation.Annotation)}
     */
    @Test
    public void testIsAnnotationBundleThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.isAnnotationBundle] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.isAnnotationBundle(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findRootName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindRootName_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        PropertyName actual = anonymousNopAnnotationIntrospector.findRootName(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindRootNameThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findRootName] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findRootName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findFilterId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindFilterId_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findFilterId(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindFilterIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findFilterId] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findFilterId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findObjectIdInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindObjectIdInfo_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        ObjectIdInfo actual = anonymousNopAnnotationIntrospector.findObjectIdInfo(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindObjectIdInfoThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findObjectIdInfo] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findObjectIdInfo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSubtypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSubtypes_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        List actual = anonymousNopAnnotationIntrospector.findSubtypes(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSubtypesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSubtypes] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSubtypes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findNamingStrategy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindNamingStrategy_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findNamingStrategy(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindNamingStrategyThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findNamingStrategy] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findNamingStrategy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindTypeName_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        String actual = anonymousNopAnnotationIntrospector.findTypeName(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindTypeNameThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findTypeName] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findTypeName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasIgnoreMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasIgnoreMarker_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.hasIgnoreMarker(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasIgnoreMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testHasIgnoreMarkerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasIgnoreMarker] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasIgnoreMarker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findTypeResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindTypeResolver_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        TypeResolverBuilder actual = anonymousNopAnnotationIntrospector.findTypeResolver(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindTypeResolverThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findTypeResolver] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.isTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIsTypeId_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Boolean actual = anonymousNopAnnotationIntrospector.isTypeId(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testIsTypeIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.isTypeId] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.isTypeId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findReferenceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindReferenceType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        AnnotationIntrospector.ReferenceProperty actual = anonymousNopAnnotationIntrospector.findReferenceType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findReferenceType(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindReferenceTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findReferenceType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findReferenceType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.isIgnorableType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIsIgnorableType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Boolean actual = anonymousNopAnnotationIntrospector.isIgnorableType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testIsIgnorableTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.isIgnorableType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.isIgnorableType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findWrapperName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findWrapperName(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findWrapperName(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindWrapperName_ReturnNull() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        PropertyName actual = jacksonAnnotationIntrospector.findWrapperName(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findNullSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindNullSerializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findNullSerializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNullSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNullSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findNullSerializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findNullSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasRequiredMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testHasRequiredMarker_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Boolean actual = anonymousNopAnnotationIntrospector.hasRequiredMarker(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasRequiredMarker(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testHasRequiredMarkerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasRequiredMarker] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasRequiredMarker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyIndex_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Integer actual = anonymousNopAnnotationIntrospector.findPropertyIndex(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyIndex(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyIndexThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyIndex] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findSerializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findViews(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findViews(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindViews_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        java.lang.Class[] actual = anonymousNopAnnotationIntrospector.findViews(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findViews(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findViews(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindViewsThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findViews] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findViews(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findFormat(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFormat(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindFormat_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonFormat.Value actual = anonymousNopAnnotationIntrospector.findFormat(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findFormat(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFormat(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindFormatThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findFormat] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyAccess_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonProperty.Access actual = anonymousNopAnnotationIntrospector.findPropertyAccess(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyAccess(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyAccessThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyAccess] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyAccess(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findKeySerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindKeySerializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findKeySerializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindKeySerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findKeySerializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findKeySerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnumValues(java.lang.Class, [Ljava.lang.Enum;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = enumValues.length; i < len; ++i)} once
 * @utbot.returnsFrom {@code return names;}
 *  */
    @Test
    public void testFindEnumValues_IOfNamesNotEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        java.lang.Enum[] enumArray = {null};
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findEnumValues(null, enumArray, stringArray);
        
        int stringArraySize = stringArray.length;
        assertEquals(stringArraySize, actual.length);
        assertTrue(deepEquals(stringArray, actual));
        
        Enum finalEnumArray0 = enumArray[0];
        
        assertNull(finalEnumArray0);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = enumValues.length; i < len; ++i)} once
 * @utbot.returnsFrom {@code return names;}
 *  */
    @Test
    public void testFindEnumValues_IOfNamesEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        java.lang.Enum[] enumArray = new java.lang.Enum[1];
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        enumArray[0] = ((Enum) retentionPolicy);
        java.lang.String[] stringArray = {null};
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findEnumValues(null, enumArray, stringArray);
        
        int stringArraySize = stringArray.length;
        assertEquals(stringArraySize, actual.length);
        assertTrue(deepEquals(stringArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.returnsFrom {@code return names;}
 *  */
    @Test
    public void testFindEnumValues_ReturnNames() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        java.lang.Enum[] enumArray = {};
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findEnumValues(null, enumArray, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumValues(java.lang.Class, [Ljava.lang.Enum;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = enumValues.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: names[i] == null
 *  */
    @Test
    public void testFindEnumValues_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        java.lang.Enum[] enumArray = {null};
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues(AnnotationIntrospector.java:1005) */
        anonymousNopAnnotationIntrospector.findEnumValues(null, enumArray, stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = enumValues.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: names[i] == null
 *  */
    @Test
    public void testFindEnumValues_ThrowNullPointerException_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        java.lang.Enum[] enumArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues(AnnotationIntrospector.java:1005) */
        anonymousNopAnnotationIntrospector.findEnumValues(null, enumArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValues(java.lang.Class,java.lang.Enum[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = enumValues.length; i < len; ++i)
 *  */
    @Test
    public void testFindEnumValues_ThrowNullPointerException() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValues(AnnotationIntrospector.java:999) */
        anonymousNopAnnotationIntrospector.findEnumValues(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnumValue(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValue(java.lang.Enum)}
 * @utbot.invokes {@link java.lang.Enum#name()}
 * @utbot.returnsFrom {@code return value.name();}
 *  */
    @Test
    public void testFindEnumValue_EnumName() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        
        String actual = anonymousNopAnnotationIntrospector.findEnumValue(retentionPolicy);
        
        String expected = "SOURCE";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumValue(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValue(java.lang.Enum)}
 * @utbot.invokes {@link java.lang.Enum#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return value.name();
 *  */
    @Test
    public void testFindEnumValue_ThrowNullPointerException() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValue(AnnotationIntrospector.java:984) */
        anonymousNopAnnotationIntrospector.findEnumValue(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findEnumValue(java.lang.Enum)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findEnumValue(java.lang.Enum)}
     */
    @Test
    public void testFindEnumValueThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findEnumValue] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findEnumValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPOJOBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPOJOBuilder_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findPOJOBuilder(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindPOJOBuilderThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPOJOBuilder] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPOJOBuilder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findCreatorBinding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindCreatorBinding_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonCreator.Mode actual = anonymousNopAnnotationIntrospector.findCreatorBinding(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findCreatorBinding(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindCreatorBindingThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findCreatorBinding] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findCreatorBinding(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.returnsFrom {@code return annotated.getAnnotation(annoClass);}
 *  */
    @Test
    public void test_findAnnotation_ReturnAnnotatedGetAnnotation() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        
        Annotation actual = jacksonAnnotationIntrospector._findAnnotation(annotatedClass, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.returnsFrom {@code return annotated.getAnnotation(annoClass);}
 *  */
    @Test
    public void test_findAnnotation_ReturnAnnotatedGetAnnotation_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        Annotation actual = jacksonAnnotationIntrospector._findAnnotation(annotatedClass, null);
        
        assertNull(actual);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.Annotated#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return annotated.getAnnotation(annoClass);
 *  */
    @Test
    public void test_findAnnotation_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1376) */
        jacksonAnnotationIntrospector._findAnnotation(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    @Test(expected = NullPointerException.class)
    public void test_findAnnotation1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        jacksonAnnotationIntrospector._findAnnotation(annotatedClass, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_findAnnotation2() throws Exception  {
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        
        annotationIntrospectorPair._findAnnotation(annotatedClass, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findDeserializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.returnsFrom {@code return annotated.hasAnnotation(annoClass);}
 *  */
    @Test
    public void test_hasAnnotation_ReturnAnnotatedHasAnnotation() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        
        boolean actual = jacksonAnnotationIntrospector._hasAnnotation(annotatedClass, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.returnsFrom {@code return annotated.hasAnnotation(annoClass);}
 *  */
    @Test
    public void test_hasAnnotation_ReturnAnnotatedHasAnnotation_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        boolean actual = jacksonAnnotationIntrospector._hasAnnotation(annotatedClass, null);
        
        assertFalse(actual);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.Annotated#hasAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return annotated.hasAnnotation(annoClass);
 *  */
    @Test
    public void test_hasAnnotation_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasAnnotation(AnnotationIntrospector.java:1393) */
        jacksonAnnotationIntrospector._hasAnnotation(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _hasAnnotation(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Class)
    
    @Test(expected = NullPointerException.class)
    public void test_hasAnnotation1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        jacksonAnnotationIntrospector._hasAnnotation(annotatedClass, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_hasAnnotation2() throws Exception  {
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        
        annotationIntrospectorPair._hasAnnotation(annotatedClass, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector._hasOneOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[])}
 * @utbot.returnsFrom {@code return annotated.hasOneOf(annoClasses);}
 *  */
    @Test
    public void test_hasOneOf_ReturnAnnotatedHasOneOf() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        
        boolean actual = jacksonAnnotationIntrospector._hasOneOf(annotatedClass, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[])}
 * @utbot.returnsFrom {@code return annotated.hasOneOf(annoClasses);}
 *  */
    @Test
    public void test_hasOneOf_ReturnAnnotatedHasOneOf_1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        AnnotationMap initialAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        boolean actual = jacksonAnnotationIntrospector._hasOneOf(annotatedClass, null);
        
        assertFalse(actual);
        
        AnnotationMap finalAnnotatedClass_classAnnotations = ((AnnotationMap) getFieldValue(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        assertFalse(initialAnnotatedClass_classAnnotations == finalAnnotatedClass_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#_hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.Annotated#hasOneOf(java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return annotated.hasOneOf(annoClasses);
 *  */
    @Test
    public void test_hasOneOf_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector._hasOneOf] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._hasOneOf(AnnotationIntrospector.java:1403) */
        jacksonAnnotationIntrospector._hasOneOf(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _hasOneOf(com.fasterxml.jackson.databind.introspect.Annotated, [Ljava.lang.Class;)
    
    @Test(expected = NullPointerException.class)
    public void test_hasOneOf1() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        jacksonAnnotationIntrospector._hasOneOf(annotatedClass, classArray);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_hasOneOf2() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        
        jacksonAnnotationIntrospector._hasOneOf(annotatedClass, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationContentConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationContentConverter_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findDeserializationContentConverter(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindDeserializationContentConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationContentConverter] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializationContentConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationInclusionForContent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
 * @utbot.returnsFrom {@code return defValue;}
 *  */
    @Test
    public void testFindSerializationInclusionForContent_ReturnDefValue() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonInclude.Include actual = anonymousNopAnnotationIntrospector.findSerializationInclusionForContent(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationInclusionForContent(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
     */
    @Test
    public void testFindSerializationInclusionForContentThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        JsonInclude.Include include = JsonInclude.Include.NON_ABSENT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationInclusionForContent] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationInclusionForContent(null, include);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationSortAlphabetically
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationSortAlphabetically_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Boolean actual = anonymousNopAnnotationIntrospector.findSerializationSortAlphabetically(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationSortAlphabeticallyThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationSortAlphabetically] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationSortAlphabetically(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findObjectReferenceInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.returnsFrom {@code return objectIdInfo;}
 *  */
    @Test
    public void testFindObjectReferenceInfo_ReturnObjectIdInfo() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        ObjectIdInfo actual = anonymousNopAnnotationIntrospector.findObjectReferenceInfo(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
     */
    @Test
    public void testFindObjectReferenceInfoThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findObjectReferenceInfo] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findObjectReferenceInfo(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findClassDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindClassDescription_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        String actual = anonymousNopAnnotationIntrospector.findClassDescription(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindClassDescriptionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findClassDescription] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findClassDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyDescription_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        String actual = anonymousNopAnnotationIntrospector.findPropertyDescription(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyDescription(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyDescriptionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyDescription] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findImplicitPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindImplicitPropertyName_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        String actual = anonymousNopAnnotationIntrospector.findImplicitPropertyName(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindImplicitPropertyName() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        String actual = jacksonAnnotationIntrospector.findImplicitPropertyName(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findAutoDetectVisibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.introspect.VisibilityChecker)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker)}
 * @utbot.returnsFrom {@code return checker;}
 *  */
    @Test
    public void testFindAutoDetectVisibility_ReturnChecker() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        VisibilityChecker actual = anonymousNopAnnotationIntrospector.findAutoDetectVisibility(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.introspect.VisibilityChecker)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker)}
     */
    @Test
    public void testFindAutoDetectVisibilityThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findAutoDetectVisibility] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findAutoDetectVisibility(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findIgnoreUnknownProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindIgnoreUnknownProperties_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Boolean actual = anonymousNopAnnotationIntrospector.findIgnoreUnknownProperties(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindIgnoreUnknownPropertiesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findIgnoreUnknownProperties] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findIgnoreUnknownProperties(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyContentTypeResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyContentTypeResolver_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        TypeResolverBuilder actual = anonymousNopAnnotationIntrospector.findPropertyContentTypeResolver(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindPropertyContentTypeResolverThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyContentTypeResolver] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyContentTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findInjectableValueId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindInjectableValueId_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findInjectableValueId(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findInjectableValueId(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindInjectableValueIdThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findInjectableValueId] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findInjectableValueId(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated,boolean)}
 * @utbot.returnsFrom {@code return findPropertiesToIgnore(ac, true);}
 *  */
    @Test
    public void testFindPropertiesToIgnore_AnnotationIntrospectorFindPropertiesToIgnore() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findPropertiesToIgnore(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertiesToIgnoreThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertiesToIgnore(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertiesToIgnore_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findPropertiesToIgnore(null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated,boolean)}
     */
    @Test
    public void testFindPropertiesToIgnoreThrowsNPE1() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertiesToIgnore(null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyTypeResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyTypeResolver_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        TypeResolverBuilder actual = anonymousNopAnnotationIntrospector.findPropertyTypeResolver(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindPropertyTypeResolverThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyTypeResolver] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyTypeResolver(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findUnwrappingNameTransformer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindUnwrappingNameTransformer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        NameTransformer actual = anonymousNopAnnotationIntrospector.findUnwrappingNameTransformer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findUnwrappingNameTransformer(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindUnwrappingNameTransformerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findUnwrappingNameTransformer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findUnwrappingNameTransformer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPropertyDefaultValue_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        String actual = anonymousNopAnnotationIntrospector.findPropertyDefaultValue(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyDefaultValue(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyDefaultValueThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyDefaultValue] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyDefaultValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationKeyType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findSerializationKeyType(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindSerializationKeyTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationKeyType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationKeyType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationKeyType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findDeserializationKeyType(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationKeyTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationKeyType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializationKeyType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationContentType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findDeserializationContentType(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationContentTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationContentType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializationContentType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findValueInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindValueInstantiator_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findValueInstantiator(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findValueInstantiator(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindValueInstantiatorThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findValueInstantiator] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findValueInstantiator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationPropertyOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationPropertyOrder_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        java.lang.String[] actual = anonymousNopAnnotationIntrospector.findSerializationPropertyOrder(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindSerializationPropertyOrderThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationPropertyOrder] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationPropertyOrder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindKeyDeserializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findKeyDeserializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeyDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindKeyDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findKeyDeserializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findKeyDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationConverter_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findDeserializationConverter(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindDeserializationConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationConverter] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializationConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasAsValueAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAsValueAnnotation_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.hasAsValueAnnotation(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAsValueAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAsValueAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasAsValueAnnotation] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasAsValueAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyInclusion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonInclude.Value#empty()}
 * @utbot.returnsFrom {@code return JsonInclude.Value.empty();}
 *  */
    @Test
    public void testFindPropertyInclusion_JsonIncludeEmpty() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            
            com.fasterxml.jackson.annotation.JsonInclude.Value actual = anonymousNopAnnotationIntrospector.findPropertyInclusion(null);
            
            // com.fasterxml.jackson.annotation.JsonInclude.Value has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindPropertyInclusionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertyInclusion] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPropertyInclusion(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.resolveSetterConflict
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveSetterConflict(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMethod, com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#resolveSetterConflict(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testResolveSetterConflict_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        AnnotatedMethod actual = anonymousNopAnnotationIntrospector.resolveSetterConflict(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method resolveSetterConflict(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMethod, com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#resolveSetterConflict(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testResolveSetterConflictThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.resolveSetterConflict] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.resolveSetterConflict(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findNameForSerialization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindNameForSerialization_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        PropertyName actual = anonymousNopAnnotationIntrospector.findNameForSerialization(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNameForSerialization(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNameForSerializationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findNameForSerialization] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findNameForSerialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_ContentTypeEqualsNull_3() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, resolvedRecursiveType));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_ContentTypeEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        CollectionType actual = ((CollectionType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, collectionType));
        
        JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        assertNull(actual_elementType);
        
        JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        assertNull(actual_bindings);
        
        String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
        assertNull(actual_canonicalName);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        int collectionType_hash = collectionType._hash;
        int actual_hash = actual._hash;
        assertEquals(collectionType_hash, actual_hash);
        
        Object actual_valueHandler = actual._valueHandler;
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = actual._typeHandler;
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = actual._asStatic;
        assertFalse(actual_asStatic);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_ContentTypeEqualsNull_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, referenceType));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_ContentTypeEqualsNull_2() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        ArrayType actual = ((ArrayType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, arrayType));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (keyClass != null): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_KeyClassEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        MapLikeType actual = ((MapLikeType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, mapLikeType));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): True}
 * @utbot.executesCondition {@code (contentClass != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineSerializationType_ContentClassEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        CollectionType actual = ((CollectionType) anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, collectionType));
        
        JavaType collectionType_elementType = ((JavaType) getFieldValue(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(collectionType_elementType, actual_elementType);
        
        JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        assertNull(actual_bindings);
        
        String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
        assertNull(actual_canonicalName);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        int collectionType_hash = collectionType._hash;
        int actual_hash = actual._hash;
        assertEquals(collectionType_hash, actual_hash);
        
        Object actual_valueHandler = actual._valueHandler;
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = actual._typeHandler;
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = actual._asStatic;
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final TypeFactory tf = config.getTypeFactory();
 *  */
    @Test
    public void testRefineSerializationType_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:799) */
        jacksonAnnotationIntrospector.refineSerializationType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (serClass != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isMapLikeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isMapLikeType()
 *  */
    @Test
    public void testRefineSerializationType_ThrowNullPointerException_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:831) */
        anonymousNopAnnotationIntrospector.refineSerializationType(serializationConfig, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findAndAddVirtualProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, java.util.List)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List)}
 * @utbot.returnsFrom {@code List<BeanPropertyWriter> properties}
 *  */
    @Test
    public void testFindAndAddVirtualProperties_Return() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        anonymousNopAnnotationIntrospector.findAndAddVirtualProperties(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List)}
     */
    @Test
    public void testFindAndAddVirtualPropertiesThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findAndAddVirtualProperties] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findAndAddVirtualProperties(null, null, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationContentType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findSerializationContentType(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindSerializationContentTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationContentType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationContentType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findSerializationType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasCreatorAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasCreatorAnnotation_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.hasCreatorAnnotation(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testHasCreatorAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasCreatorAnnotation] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasCreatorAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationType_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Class actual = anonymousNopAnnotationIntrospector.findDeserializationType(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindDeserializationTypeThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findDeserializationType] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findDeserializationType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationConverter_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findSerializationConverter(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationConverter] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findContentSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindContentSerializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findContentSerializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindContentSerializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findContentSerializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findContentSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationTyping_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonSerialize.Typing actual = anonymousNopAnnotationIntrospector.findSerializationTyping(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindSerializationTypingThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationTyping] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationTyping(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findPOJOBuilderConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindPOJOBuilderConfig_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value actual = anonymousNopAnnotationIntrospector.findPOJOBuilderConfig(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
     */
    @Test
    public void testFindPOJOBuilderConfigThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findPOJOBuilderConfig] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findPOJOBuilderConfig(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasAnySetterAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAnySetterAnnotation_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.hasAnySetterAnnotation(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAnySetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAnySetterAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasAnySetterAnnotation] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasAnySetterAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_ContentTypeEqualsNull_3() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, resolvedRecursiveType));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_ContentTypeEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        CollectionType actual = ((CollectionType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, collectionType));
        
        JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        assertNull(actual_elementType);
        
        JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        assertNull(actual_bindings);
        
        String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
        assertNull(actual_canonicalName);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        int collectionType_hash = collectionType._hash;
        int actual_hash = actual._hash;
        assertEquals(collectionType_hash, actual_hash);
        
        Object actual_valueHandler = actual._valueHandler;
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = actual._typeHandler;
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = actual._asStatic;
        assertFalse(actual_asStatic);
        
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_ContentTypeEqualsNull_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, referenceType));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_ContentTypeEqualsNull_2() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        ArrayType actual = ((ArrayType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, arrayType));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (keyClass != null): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_KeyClassEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        MapLikeType actual = ((MapLikeType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, mapLikeType));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (contentType != null): True}
 * @utbot.executesCondition {@code (contentClass != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testRefineDeserializationType_ContentClassEqualsNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        CollectionType actual = ((CollectionType) anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, collectionType));
        
        JavaType collectionType_elementType = ((JavaType) getFieldValue(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(collectionType_elementType, actual_elementType);
        
        JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        assertNull(actual_bindings);
        
        String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
        assertNull(actual_canonicalName);
        
        Class actual_class = actual._class;
        assertNull(actual_class);
        
        int collectionType_hash = collectionType._hash;
        int actual_hash = actual._hash;
        assertEquals(collectionType_hash, actual_hash);
        
        Object actual_valueHandler = actual._valueHandler;
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = actual._typeHandler;
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = actual._asStatic;
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final TypeFactory tf = config.getTypeFactory();
 *  */
    @Test
    public void testRefineDeserializationType_ThrowNullPointerException() throws Exception  {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType(AnnotationIntrospector.java:1119) */
        jacksonAnnotationIntrospector.refineDeserializationType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (valueClass != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isMapLikeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isMapLikeType()
 *  */
    @Test
    public void testRefineDeserializationType_ThrowNullPointerException_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType(AnnotationIntrospector.java:1143) */
        anonymousNopAnnotationIntrospector.refineDeserializationType(serializationConfig, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findContentDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindContentDeserializer_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findContentDeserializer(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindContentDeserializerThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findContentDeserializer] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findContentDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findNameForDeserialization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindNameForDeserialization_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        PropertyName actual = anonymousNopAnnotationIntrospector.findNameForDeserialization(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)}
     */
    @Test
    public void testFindNameForDeserializationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findNameForDeserialization] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findNameForDeserialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.hasAnyGetterAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAnyGetterAnnotation_ReturnFalse() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        boolean actual = anonymousNopAnnotationIntrospector.hasAnyGetterAnnotation(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#hasAnyGetterAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)}
     */
    @Test
    public void testHasAnyGetterAnnotationThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.hasAnyGetterAnnotation] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.hasAnyGetterAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationContentConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationContentConverter_ReturnNull() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        Object actual = anonymousNopAnnotationIntrospector.findSerializationContentConverter(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testFindSerializationContentConverterThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationContentConverter] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationContentConverter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationInclusion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
    @utbot.classUnderTest {@link AnnotationIntrospector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
 * @utbot.returnsFrom {@code return defValue;}
 *  */
    @Test
    public void testFindSerializationInclusion_ReturnDefValue() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        JsonInclude.Include actual = anonymousNopAnnotationIntrospector.findSerializationInclusion(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationInclusion(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude.Include)}
     */
    @Test
    public void testFindSerializationInclusionThrowsNPE() {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        JsonInclude.Include include = JsonInclude.Include.NON_ABSENT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.AnnotationIntrospector.findSerializationInclusion] produces [java.lang.NullPointerException] */
        jacksonAnnotationIntrospector.findSerializationInclusion(null, include);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1075172943784300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1075172943784300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1075172943791500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075172943784300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075172943791500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1075172953006099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1075172953006099.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1075172953008800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075172953006099.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075172953008800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1075172954086400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1075172954086400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1075172954088399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075172954086400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075172954088399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1075172954725200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1075172954725200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1075172954726900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075172954725200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075172954726900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

