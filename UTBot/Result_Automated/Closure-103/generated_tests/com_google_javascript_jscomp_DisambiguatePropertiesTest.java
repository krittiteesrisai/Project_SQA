package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.graph.StandardUnionFind;
import java.lang.reflect.Method;
import java.util.HashMap;
import com.google.common.collect.HashMultimap;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.Multiset;
import java.util.Collection;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.rhino.testing.EmptyScope;
import java.util.HashSet;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import java.nio.charset.Charset;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.util.List;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.ArrayList;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.LinkedHashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_DisambiguatePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new DisambiguateProperties<JSType>(compiler, new JSTypeSystem(compiler));
 *  */
    @Test
    public void testForJSTypeSystem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.<init>(DisambiguateProperties.java:641)
            com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(DisambiguateProperties.java:258) */
        DisambiguateProperties.forJSTypeSystem(compiler);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)}
     */
    @Test
    public void testForJSTypeSystemThrowsNPE() {
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.<init>(DisambiguateProperties.java:639)
            com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(DisambiguateProperties.java:258) */
        DisambiguateProperties.forJSTypeSystem(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.renameProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method renameProperties()
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#renameProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testRenameProperties_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:475) */
        disambiguateProperties.renameProperties();
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#renameProperties()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.shouldRename()
 *  */
    @Test
    public void testRenameProperties_ThrowNullPointerException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:476) */
        disambiguateProperties.renameProperties();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method renameProperties()
    
    @Test
    public void testRenameProperties1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "\u0000";
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        properties.put(string, property);
        String string1 = "";
        properties.put(string1, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        disambiguateProperties.renameProperties();
    }
    
    @Test
    public void testRenameProperties2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        StandardUnionFind types = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        setField(types, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        setField(property, "com.google.javascript.jscomp.DisambiguateProperties$Property", "types", types);
        properties.put(string, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        disambiguateProperties.renameProperties();
    }
    
    @Test
    public void testRenameProperties3() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        StandardUnionFind types = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        setField(types, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        setField(property, "com.google.javascript.jscomp.DisambiguateProperties$Property", "types", types);
        properties.put(null, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        disambiguateProperties.renameProperties();
    }
    
    @Test
    public void testRenameProperties4() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        setField(property, "com.google.javascript.jscomp.DisambiguateProperties$Property", "skipRenaming", true);
        properties.put(null, property);
        String string = "";
        properties.put(string, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        disambiguateProperties.renameProperties();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method renameProperties()
    
    @Test
    public void testRenameProperties5() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        StandardUnionFind types = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(property, "com.google.javascript.jscomp.DisambiguateProperties$Property", "types", types);
        properties.put(null, property);
        String string = "";
        properties.put(string, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.graph.StandardUnionFind.allEquivalenceClasses(StandardUnionFind.java:118)
            com.google.javascript.jscomp.DisambiguateProperties$Property.shouldRename(DisambiguateProperties.java:209)
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:476) */
        disambiguateProperties.renameProperties();
    }
    
    @Test
    public void testRenameProperties6() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000";
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        properties.put(string, property);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        properties.put(string1, null);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:476) */
        disambiguateProperties.renameProperties();
    }
    ///endregion
    
    ///region Errors report for renameProperties
    
    public void testRenameProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.buildPropNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildPropNames(com.google.javascript.jscomp.graph.UnionFind, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#buildPropNames(com.google.javascript.jscomp.graph.UnionFind,java.lang.String)}
 * @utbot.invokes {@link com.google.common.collect.Maps#newHashMap()}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.UnionFind#allEquivalenceClasses()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Set<T> set: types.allEquivalenceClasses())
 *  */
    @Test
    public void testBuildPropNames_ThrowNullPointerException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.buildPropNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(DisambiguateProperties.java:515) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class unionFindType = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        Class stringType = Class.forName("java.lang.String");
        Method buildPropNamesMethod = disambiguatePropertiesClazz.getDeclaredMethod("buildPropNames", unionFindType, stringType);
        buildPropNamesMethod.setAccessible(true);
        java.lang.Object[] buildPropNamesMethodArguments = new java.lang.Object[2];
        buildPropNamesMethodArguments[0] = ((Object) null);
        buildPropNamesMethodArguments[1] = ((Object) null);
        try {
            buildPropNamesMethod.invoke(disambiguateProperties, buildPropNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildPropNames(com.google.javascript.jscomp.graph.UnionFind, java.lang.String)
    
    @Test
    public void testBuildPropNames1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        StandardUnionFind standardUnionFind = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        setField(standardUnionFind, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class standardUnionFindType = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        Class stringType = Class.forName("java.lang.String");
        Method buildPropNamesMethod = disambiguatePropertiesClazz.getDeclaredMethod("buildPropNames", standardUnionFindType, stringType);
        buildPropNamesMethod.setAccessible(true);
        java.lang.Object[] buildPropNamesMethodArguments = new java.lang.Object[2];
        buildPropNamesMethodArguments[0] = standardUnionFind;
        buildPropNamesMethodArguments[1] = ((Object) null);
        HashMap actual = ((HashMap) buildPropNamesMethod.invoke(disambiguateProperties, buildPropNamesMethodArguments));
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testBuildPropNames2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        StandardUnionFind standardUnionFind = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        setField(standardUnionFind, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class standardUnionFindType = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        Class stringType = Class.forName("java.lang.String");
        Method buildPropNamesMethod = disambiguatePropertiesClazz.getDeclaredMethod("buildPropNames", standardUnionFindType, stringType);
        buildPropNamesMethod.setAccessible(true);
        java.lang.Object[] buildPropNamesMethodArguments = new java.lang.Object[2];
        buildPropNamesMethodArguments[0] = standardUnionFind;
        buildPropNamesMethodArguments[1] = ((Object) null);
        HashMap actual = ((HashMap) buildPropNamesMethod.invoke(disambiguateProperties, buildPropNamesMethodArguments));
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildPropNames(com.google.javascript.jscomp.graph.UnionFind, java.lang.String)
    
    @Test
    public void testBuildPropNames3() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        StandardUnionFind standardUnionFind = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        Character character = '\u0000';
        Object node = createInstance("com.google.javascript.jscomp.graph.StandardUnionFind$Node");
        elmap.put(character, node);
        setField(standardUnionFind, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.buildPropNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.graph.StandardUnionFind.findRoot(StandardUnionFind.java:158)
            com.google.javascript.jscomp.graph.StandardUnionFind.findRoot(StandardUnionFind.java:159)
            com.google.javascript.jscomp.graph.StandardUnionFind.allEquivalenceClasses(StandardUnionFind.java:119)
            com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(DisambiguateProperties.java:515) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class standardUnionFindType = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        Class stringType = Class.forName("java.lang.String");
        Method buildPropNamesMethod = disambiguatePropertiesClazz.getDeclaredMethod("buildPropNames", standardUnionFindType, stringType);
        buildPropNamesMethod.setAccessible(true);
        java.lang.Object[] buildPropNamesMethodArguments = new java.lang.Object[2];
        buildPropNamesMethodArguments[0] = standardUnionFind;
        buildPropNamesMethodArguments[1] = ((Object) null);
        try {
            buildPropNamesMethod.invoke(disambiguateProperties, buildPropNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBuildPropNames4() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        StandardUnionFind standardUnionFind = ((StandardUnionFind) createInstance("com.google.javascript.jscomp.graph.StandardUnionFind"));
        LinkedHashMap elmap = new LinkedHashMap();
        elmap.put(null, null);
        setField(standardUnionFind, "com.google.javascript.jscomp.graph.StandardUnionFind", "elmap", elmap);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.buildPropNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.graph.StandardUnionFind.findRoot(StandardUnionFind.java:158)
            com.google.javascript.jscomp.graph.StandardUnionFind.allEquivalenceClasses(StandardUnionFind.java:119)
            com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(DisambiguateProperties.java:515) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class standardUnionFindType = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        Class stringType = Class.forName("java.lang.String");
        Method buildPropNamesMethod = disambiguatePropertiesClazz.getDeclaredMethod("buildPropNames", standardUnionFindType, stringType);
        buildPropNamesMethod.setAccessible(true);
        java.lang.Object[] buildPropNamesMethodArguments = new java.lang.Object[2];
        buildPropNamesMethodArguments[0] = standardUnionFind;
        buildPropNamesMethodArguments[1] = ((Object) null);
        try {
            buildPropNamesMethod.invoke(disambiguateProperties, buildPropNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenamedTypesForTesting()
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getRenamedTypesForTesting()}
 * @utbot.invokes {@link com.google.common.collect.HashMultimap#create()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetRenamedTypesForTesting_SetIterator() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        HashMultimap actual = ((HashMultimap) disambiguateProperties.getRenamedTypesForTesting());
        
        HashMultimap expected = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(expected, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(expected, "com.google.common.collect.AbstractMultimap", "map", map);
        
        int expectedExpectedValuesPerKey = ((Integer) getFieldValue(expected, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        int actualExpectedValuesPerKey = ((Integer) getFieldValue(actual, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        assertEquals(expectedExpectedValuesPerKey, actualExpectedValuesPerKey);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        int expectedTotalSize = ((Integer) getFieldValue(expected, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualTotalSize = ((Integer) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedTotalSize, actualTotalSize);
        
        Set actualKeySet = ((Set) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualKeySet);
        
        Multiset actualMultiset = ((Multiset) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualMultiset);
        
        Collection actualValuesCollection = ((Collection) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualValuesCollection);
        
        Collection actualEntries = ((Collection) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualEntries);
        
        Map actualAsMap = ((Map) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualAsMap);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenamedTypesForTesting()
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getRenamedTypesForTesting()}
 * @utbot.invokes {@link com.google.common.collect.HashMultimap#create()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Map.Entry<String, Property> entry: properties.entrySet())
 *  */
    @Test
    public void testGetRenamedTypesForTesting_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting(DisambiguateProperties.java:542) */
        disambiguateProperties.getRenamedTypesForTesting();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRenamedTypesForTesting()
    
    @Test
    public void testGetRenamedTypesForTesting1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        properties.put(null, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        HashMultimap actual = ((HashMultimap) disambiguateProperties.getRenamedTypesForTesting());
        
        HashMultimap expected = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(expected, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(expected, "com.google.common.collect.AbstractMultimap", "map", map);
        
        int expectedExpectedValuesPerKey = ((Integer) getFieldValue(expected, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        int actualExpectedValuesPerKey = ((Integer) getFieldValue(actual, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        assertEquals(expectedExpectedValuesPerKey, actualExpectedValuesPerKey);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        int expectedTotalSize = ((Integer) getFieldValue(expected, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualTotalSize = ((Integer) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedTotalSize, actualTotalSize);
        
        Set actualKeySet = ((Set) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualKeySet);
        
        Multiset actualMultiset = ((Multiset) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualMultiset);
        
        Collection actualValuesCollection = ((Collection) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualValuesCollection);
        
        Collection actualEntries = ((Collection) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualEntries);
        
        Map actualAsMap = ((Map) getFieldValue(actual, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualAsMap);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRenamedTypesForTesting()
    
    @Test
    public void testGetRenamedTypesForTesting2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        properties.put(string, property);
        String string1 = "";
        properties.put(string1, null);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting(DisambiguateProperties.java:544) */
        disambiguateProperties.getRenamedTypesForTesting();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeWithProperty(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_5() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(typeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId", -1);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        Object concreteNoneType = createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteNoneType");
        
        ConcreteType.ConcreteUniqueType actual = ((ConcreteType.ConcreteUniqueType) disambiguateProperties.getTypeWithProperty(null, concreteNoneType));
        
        ConcreteType.ConcreteUniqueType expected = ((ConcreteType.ConcreteUniqueType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteUniqueType"));
        
        // com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType has overridden equals method
        assertEquals(expected, actual);
        
        Object disambiguatePropertiesTypeSystem = getFieldValue(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem");
        int finalDisambiguatePropertiesTypeSystemNextUniqueId = ((Integer) getFieldValue(disambiguatePropertiesTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId"));
        
        assertEquals(0, finalDisambiguatePropertiesTypeSystemNextUniqueId);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", functionType);
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, functionType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_3() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(typeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "codingConvention", codingConvention);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        ConcreteType.ConcreteFunctionType concreteFunctionType = ((ConcreteType.ConcreteFunctionType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteFunctionType"));
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, concreteFunctionType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, numberType);
        
        assertNull(actual);
        
        JSTypeRegistry numberTypeRegistry = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes0 = ((JSType) get(numberTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry numberTypeRegistry1 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes1 = ((JSType) get(numberTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry numberTypeRegistry2 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes2 = ((JSType) get(numberTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry numberTypeRegistry3 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes3 = ((JSType) get(numberTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry numberTypeRegistry4 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes4 = ((JSType) get(numberTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry numberTypeRegistry5 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes5 = ((JSType) get(numberTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry numberTypeRegistry6 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes6 = ((JSType) get(numberTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry numberTypeRegistry7 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes7 = ((JSType) get(numberTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry numberTypeRegistry8 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes8 = ((JSType) get(numberTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry numberTypeRegistry9 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes9 = ((JSType) get(numberTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry numberTypeRegistry10 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes10 = ((JSType) get(numberTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry numberTypeRegistry11 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes11 = ((JSType) get(numberTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry numberTypeRegistry12 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes12 = ((JSType) get(numberTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry numberTypeRegistry13 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes13 = ((JSType) get(numberTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry numberTypeRegistry14 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes14 = ((JSType) get(numberTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry numberTypeRegistry15 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes15 = ((JSType) get(numberTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry numberTypeRegistry16 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes16 = ((JSType) get(numberTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry numberTypeRegistry17 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes17 = ((JSType) get(numberTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry numberTypeRegistry18 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes18 = ((JSType) get(numberTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry numberTypeRegistry19 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes19 = ((JSType) get(numberTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry numberTypeRegistry20 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes20 = ((JSType) get(numberTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry numberTypeRegistry21 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes21 = ((JSType) get(numberTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry numberTypeRegistry22 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes22 = ((JSType) get(numberTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry numberTypeRegistry23 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes23 = ((JSType) get(numberTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry numberTypeRegistry24 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes24 = ((JSType) get(numberTypeRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry numberTypeRegistry25 = ((JSTypeRegistry) getFieldValue(numberType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] numberTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(numberTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNumberTypeRegistryNativeTypes25 = ((JSType) get(numberTypeRegistry25RegistryNativeTypes, 25));
        
        assertNull(finalNumberTypeRegistryNativeTypes0);
        
        assertNull(finalNumberTypeRegistryNativeTypes1);
        
        assertNull(finalNumberTypeRegistryNativeTypes2);
        
        assertNull(finalNumberTypeRegistryNativeTypes3);
        
        assertNull(finalNumberTypeRegistryNativeTypes4);
        
        assertNull(finalNumberTypeRegistryNativeTypes5);
        
        assertNull(finalNumberTypeRegistryNativeTypes6);
        
        assertNull(finalNumberTypeRegistryNativeTypes7);
        
        assertNull(finalNumberTypeRegistryNativeTypes8);
        
        assertNull(finalNumberTypeRegistryNativeTypes9);
        
        assertNull(finalNumberTypeRegistryNativeTypes10);
        
        assertNull(finalNumberTypeRegistryNativeTypes11);
        
        assertNull(finalNumberTypeRegistryNativeTypes12);
        
        assertNull(finalNumberTypeRegistryNativeTypes13);
        
        assertNull(finalNumberTypeRegistryNativeTypes14);
        
        assertNull(finalNumberTypeRegistryNativeTypes15);
        
        assertNull(finalNumberTypeRegistryNativeTypes16);
        
        assertNull(finalNumberTypeRegistryNativeTypes17);
        
        assertNull(finalNumberTypeRegistryNativeTypes18);
        
        assertNull(finalNumberTypeRegistryNativeTypes19);
        
        assertNull(finalNumberTypeRegistryNativeTypes20);
        
        assertNull(finalNumberTypeRegistryNativeTypes21);
        
        assertNull(finalNumberTypeRegistryNativeTypes22);
        
        assertNull(finalNumberTypeRegistryNativeTypes23);
        
        assertNull(finalNumberTypeRegistryNativeTypes24);
        
        assertNull(finalNumberTypeRegistryNativeTypes25);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[29];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(stringType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, stringType);
        
        assertNull(actual);
        
        JSTypeRegistry stringTypeRegistry = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes0 = ((JSType) get(stringTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry stringTypeRegistry1 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes1 = ((JSType) get(stringTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry stringTypeRegistry2 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes2 = ((JSType) get(stringTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry stringTypeRegistry3 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes3 = ((JSType) get(stringTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry stringTypeRegistry4 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes4 = ((JSType) get(stringTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry stringTypeRegistry5 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes5 = ((JSType) get(stringTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry stringTypeRegistry6 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes6 = ((JSType) get(stringTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry stringTypeRegistry7 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes7 = ((JSType) get(stringTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry stringTypeRegistry8 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes8 = ((JSType) get(stringTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry stringTypeRegistry9 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes9 = ((JSType) get(stringTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry stringTypeRegistry10 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes10 = ((JSType) get(stringTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry stringTypeRegistry11 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes11 = ((JSType) get(stringTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry stringTypeRegistry12 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes12 = ((JSType) get(stringTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry stringTypeRegistry13 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes13 = ((JSType) get(stringTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry stringTypeRegistry14 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes14 = ((JSType) get(stringTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry stringTypeRegistry15 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes15 = ((JSType) get(stringTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry stringTypeRegistry16 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes16 = ((JSType) get(stringTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry stringTypeRegistry17 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes17 = ((JSType) get(stringTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry stringTypeRegistry18 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes18 = ((JSType) get(stringTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry stringTypeRegistry19 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes19 = ((JSType) get(stringTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry stringTypeRegistry20 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes20 = ((JSType) get(stringTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry stringTypeRegistry21 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes21 = ((JSType) get(stringTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry stringTypeRegistry22 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes22 = ((JSType) get(stringTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry stringTypeRegistry23 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes23 = ((JSType) get(stringTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry stringTypeRegistry24 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes24 = ((JSType) get(stringTypeRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry stringTypeRegistry25 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes25 = ((JSType) get(stringTypeRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry stringTypeRegistry26 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes26 = ((JSType) get(stringTypeRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry stringTypeRegistry27 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes27 = ((JSType) get(stringTypeRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry stringTypeRegistry28 = ((JSTypeRegistry) getFieldValue(stringType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        com.google.javascript.rhino.jstype.JSType[] stringTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(stringTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalStringTypeRegistryNativeTypes28 = ((JSType) get(stringTypeRegistry28RegistryNativeTypes, 28));
        
        assertNull(finalStringTypeRegistryNativeTypes0);
        
        assertNull(finalStringTypeRegistryNativeTypes1);
        
        assertNull(finalStringTypeRegistryNativeTypes2);
        
        assertNull(finalStringTypeRegistryNativeTypes3);
        
        assertNull(finalStringTypeRegistryNativeTypes4);
        
        assertNull(finalStringTypeRegistryNativeTypes5);
        
        assertNull(finalStringTypeRegistryNativeTypes6);
        
        assertNull(finalStringTypeRegistryNativeTypes7);
        
        assertNull(finalStringTypeRegistryNativeTypes8);
        
        assertNull(finalStringTypeRegistryNativeTypes9);
        
        assertNull(finalStringTypeRegistryNativeTypes10);
        
        assertNull(finalStringTypeRegistryNativeTypes11);
        
        assertNull(finalStringTypeRegistryNativeTypes12);
        
        assertNull(finalStringTypeRegistryNativeTypes13);
        
        assertNull(finalStringTypeRegistryNativeTypes14);
        
        assertNull(finalStringTypeRegistryNativeTypes15);
        
        assertNull(finalStringTypeRegistryNativeTypes16);
        
        assertNull(finalStringTypeRegistryNativeTypes17);
        
        assertNull(finalStringTypeRegistryNativeTypes18);
        
        assertNull(finalStringTypeRegistryNativeTypes19);
        
        assertNull(finalStringTypeRegistryNativeTypes20);
        
        assertNull(finalStringTypeRegistryNativeTypes21);
        
        assertNull(finalStringTypeRegistryNativeTypes22);
        
        assertNull(finalStringTypeRegistryNativeTypes23);
        
        assertNull(finalStringTypeRegistryNativeTypes24);
        
        assertNull(finalStringTypeRegistryNativeTypes25);
        
        assertNull(finalStringTypeRegistryNativeTypes26);
        
        assertNull(finalStringTypeRegistryNativeTypes27);
        
        assertNull(finalStringTypeRegistryNativeTypes28);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_4() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        ConcreteType.ConcreteInstanceType concreteInstanceType = ((ConcreteType.ConcreteInstanceType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType"));
        FunctionType instanceType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "instanceType", instanceType);
        EmptyScope scope = ((EmptyScope) createInstance("com.google.javascript.rhino.testing.EmptyScope"));
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "scope", scope);
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, concreteInstanceType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeWithProperty(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return typeSystem.getTypeWithProperty(field, type);
 *  */
    @Test
    public void testGetTypeWithProperty_ThrowClassCastException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        byte[] byteArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.JSType ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.JSType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:634)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:320) */
        disambiguateProperties.getTypeWithProperty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return typeSystem.getTypeWithProperty(field, type);
 *  */
    @Test
    public void testGetTypeWithProperty_ThrowClassCastException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        byte[] byteArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.ConcreteType ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.ConcreteType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem.getTypeWithProperty(DisambiguateProperties.java:817)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:320) */
        disambiguateProperties.getTypeWithProperty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetTypeWithProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.NumberType.autoboxesTo(NumberType.java:112)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:738)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:634)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:320) */
        disambiguateProperties.getTypeWithProperty(null, numberType);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetTypeWithProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(stringType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.StringType.autoboxesTo(StringType.java:97)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:738)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:634)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:320) */
        disambiguateProperties.getTypeWithProperty(null, stringType);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeSystem.getTypeWithProperty(field, type);
 *  */
    @Test
    public void testGetTypeWithProperty_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:320) */
        disambiguateProperties.getTypeWithProperty(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes)}
 * @utbot.returnsFrom {@code return new DisambiguateProperties<ConcreteType>(compiler, new ConcreteTypeSystem(tt, compiler.getCodingConvention()));}
 *  */
    @Test
    public void testForConcreteTypeSystem_Return_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options_.setCodingConvention(codingConvention);
        compiler.options_ = options_;
        
        DisambiguateProperties actual = DisambiguateProperties.forConcreteTypeSystem(compiler, null);
        
        DisambiguateProperties expected = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(typeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "codingConvention", codingConvention);
        HashSet invalidatingTypes = new HashSet();
        setField(typeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes", invalidatingTypes);
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        boolean actualShowInvalidationWarnings = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "showInvalidationWarnings"));
        assertFalse(actualShowInvalidationWarnings);
        
        AbstractCompiler expectedCompiler = ((AbstractCompiler) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "compiler"));
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "compiler"));
        CompilerOptions expectedCompilerOptions_ = ((CompilerOptions) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "options_"));
        CompilerOptions actualCompilerOptions_ = ((CompilerOptions) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "options_"));
        boolean actualCompilerOptions_IdeMode = actualCompilerOptions_.ideMode;
        assertFalse(actualCompilerOptions_IdeMode);
        
        boolean actualCompilerOptions_SkipAllPasses = actualCompilerOptions_.skipAllPasses;
        assertFalse(actualCompilerOptions_SkipAllPasses);
        
        boolean actualCompilerOptions_NameAnonymousFunctionsOnly = actualCompilerOptions_.nameAnonymousFunctionsOnly;
        assertFalse(actualCompilerOptions_NameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualCompilerOptions_DevMode = actualCompilerOptions_.devMode;
        assertNull(actualCompilerOptions_DevMode);
        
        boolean actualCompilerOptions_CheckSymbols = actualCompilerOptions_.checkSymbols;
        assertFalse(actualCompilerOptions_CheckSymbols);
        
        CheckLevel actualCompilerOptions_CheckShadowVars = actualCompilerOptions_.checkShadowVars;
        assertNull(actualCompilerOptions_CheckShadowVars);
        
        CheckLevel actualCompilerOptions_AggressiveVarCheck = actualCompilerOptions_.aggressiveVarCheck;
        assertNull(actualCompilerOptions_AggressiveVarCheck);
        
        CheckLevel actualCompilerOptions_CheckFunctions = actualCompilerOptions_.checkFunctions;
        assertNull(actualCompilerOptions_CheckFunctions);
        
        CheckLevel actualCompilerOptions_CheckMethods = actualCompilerOptions_.checkMethods;
        assertNull(actualCompilerOptions_CheckMethods);
        
        boolean actualCompilerOptions_CheckDuplicateMessages = actualCompilerOptions_.checkDuplicateMessages;
        assertFalse(actualCompilerOptions_CheckDuplicateMessages);
        
        boolean actualCompilerOptions_AllowLegacyJsMessages = actualCompilerOptions_.allowLegacyJsMessages;
        assertFalse(actualCompilerOptions_AllowLegacyJsMessages);
        
        boolean actualCompilerOptions_StrictMessageReplacement = actualCompilerOptions_.strictMessageReplacement;
        assertFalse(actualCompilerOptions_StrictMessageReplacement);
        
        boolean actualCompilerOptions_CheckSuspiciousCode = actualCompilerOptions_.checkSuspiciousCode;
        assertFalse(actualCompilerOptions_CheckSuspiciousCode);
        
        boolean actualCompilerOptions_CheckControlStructures = actualCompilerOptions_.checkControlStructures;
        assertFalse(actualCompilerOptions_CheckControlStructures);
        
        CheckLevel actualCompilerOptions_CheckUndefinedProperties = actualCompilerOptions_.checkUndefinedProperties;
        assertNull(actualCompilerOptions_CheckUndefinedProperties);
        
        boolean actualCompilerOptions_CheckUnusedPropertiesEarly = actualCompilerOptions_.checkUnusedPropertiesEarly;
        assertFalse(actualCompilerOptions_CheckUnusedPropertiesEarly);
        
        boolean actualCompilerOptions_CheckTypes = actualCompilerOptions_.checkTypes;
        assertFalse(actualCompilerOptions_CheckTypes);
        
        boolean actualCompilerOptions_TightenTypes = actualCompilerOptions_.tightenTypes;
        assertFalse(actualCompilerOptions_TightenTypes);
        
        boolean actualCompilerOptions_InferTypesInGlobalScope = actualCompilerOptions_.inferTypesInGlobalScope;
        assertFalse(actualCompilerOptions_InferTypesInGlobalScope);
        
        boolean actualCompilerOptions_CheckTypedPropertyCalls = actualCompilerOptions_.checkTypedPropertyCalls;
        assertFalse(actualCompilerOptions_CheckTypedPropertyCalls);
        
        CheckLevel actualCompilerOptions_ReportMissingOverride = actualCompilerOptions_.reportMissingOverride;
        assertNull(actualCompilerOptions_ReportMissingOverride);
        
        CheckLevel actualCompilerOptions_ReportUnknownTypes = actualCompilerOptions_.reportUnknownTypes;
        assertNull(actualCompilerOptions_ReportUnknownTypes);
        
        CheckLevel actualCompilerOptions_CheckRequires = actualCompilerOptions_.checkRequires;
        assertNull(actualCompilerOptions_CheckRequires);
        
        CheckLevel actualCompilerOptions_CheckProvides = actualCompilerOptions_.checkProvides;
        assertNull(actualCompilerOptions_CheckProvides);
        
        CheckLevel actualCompilerOptions_CheckGlobalNamesLevel = actualCompilerOptions_.checkGlobalNamesLevel;
        assertNull(actualCompilerOptions_CheckGlobalNamesLevel);
        
        CheckLevel actualCompilerOptions_BrokenClosureRequiresLevel = actualCompilerOptions_.brokenClosureRequiresLevel;
        assertNull(actualCompilerOptions_BrokenClosureRequiresLevel);
        
        CheckLevel actualCompilerOptions_CheckGlobalThisLevel = actualCompilerOptions_.checkGlobalThisLevel;
        assertNull(actualCompilerOptions_CheckGlobalThisLevel);
        
        CheckLevel actualCompilerOptions_CheckMissingGetCssNameLevel = actualCompilerOptions_.checkMissingGetCssNameLevel;
        assertNull(actualCompilerOptions_CheckMissingGetCssNameLevel);
        
        String actualCompilerOptions_CheckMissingGetCssNameBlacklist = actualCompilerOptions_.checkMissingGetCssNameBlacklist;
        assertNull(actualCompilerOptions_CheckMissingGetCssNameBlacklist);
        
        boolean actualCompilerOptions_CheckEs5Strict = actualCompilerOptions_.checkEs5Strict;
        assertFalse(actualCompilerOptions_CheckEs5Strict);
        
        boolean actualCompilerOptions_CheckCaja = actualCompilerOptions_.checkCaja;
        assertFalse(actualCompilerOptions_CheckCaja);
        
        boolean actualCompilerOptions_FoldConstants = actualCompilerOptions_.foldConstants;
        assertFalse(actualCompilerOptions_FoldConstants);
        
        boolean actualCompilerOptions_RemoveConstantExpressions = actualCompilerOptions_.removeConstantExpressions;
        assertFalse(actualCompilerOptions_RemoveConstantExpressions);
        
        boolean actualCompilerOptions_DeadAssignmentElimination = actualCompilerOptions_.deadAssignmentElimination;
        assertFalse(actualCompilerOptions_DeadAssignmentElimination);
        
        boolean actualCompilerOptions_InlineConstantVars = actualCompilerOptions_.inlineConstantVars;
        assertFalse(actualCompilerOptions_InlineConstantVars);
        
        boolean actualCompilerOptions_InlineFunctions = actualCompilerOptions_.inlineFunctions;
        assertFalse(actualCompilerOptions_InlineFunctions);
        
        boolean actualCompilerOptions_DecomposeExpressions = actualCompilerOptions_.decomposeExpressions;
        assertFalse(actualCompilerOptions_DecomposeExpressions);
        
        boolean actualCompilerOptions_InlineAnonymousFunctionExpressions = actualCompilerOptions_.inlineAnonymousFunctionExpressions;
        assertFalse(actualCompilerOptions_InlineAnonymousFunctionExpressions);
        
        boolean actualCompilerOptions_InlineLocalFunctions = actualCompilerOptions_.inlineLocalFunctions;
        assertFalse(actualCompilerOptions_InlineLocalFunctions);
        
        boolean actualCompilerOptions_CrossModuleCodeMotion = actualCompilerOptions_.crossModuleCodeMotion;
        assertFalse(actualCompilerOptions_CrossModuleCodeMotion);
        
        boolean actualCompilerOptions_CoalesceVariableNames = actualCompilerOptions_.coalesceVariableNames;
        assertFalse(actualCompilerOptions_CoalesceVariableNames);
        
        boolean actualCompilerOptions_CrossModuleMethodMotion = actualCompilerOptions_.crossModuleMethodMotion;
        assertFalse(actualCompilerOptions_CrossModuleMethodMotion);
        
        boolean actualCompilerOptions_InlineGetters = actualCompilerOptions_.inlineGetters;
        assertFalse(actualCompilerOptions_InlineGetters);
        
        boolean actualCompilerOptions_InlineVariables = actualCompilerOptions_.inlineVariables;
        assertFalse(actualCompilerOptions_InlineVariables);
        
        boolean actualCompilerOptions_InlineLocalVariables = actualCompilerOptions_.inlineLocalVariables;
        assertFalse(actualCompilerOptions_InlineLocalVariables);
        
        boolean actualCompilerOptions_FlowSensitiveInlineVariables = actualCompilerOptions_.flowSensitiveInlineVariables;
        assertFalse(actualCompilerOptions_FlowSensitiveInlineVariables);
        
        boolean actualCompilerOptions_SmartNameRemoval = actualCompilerOptions_.smartNameRemoval;
        assertFalse(actualCompilerOptions_SmartNameRemoval);
        
        boolean actualCompilerOptions_RemoveDeadCode = actualCompilerOptions_.removeDeadCode;
        assertFalse(actualCompilerOptions_RemoveDeadCode);
        
        CheckLevel actualCompilerOptions_CheckUnreachableCode = actualCompilerOptions_.checkUnreachableCode;
        assertNull(actualCompilerOptions_CheckUnreachableCode);
        
        CheckLevel actualCompilerOptions_CheckMissingReturn = actualCompilerOptions_.checkMissingReturn;
        assertNull(actualCompilerOptions_CheckMissingReturn);
        
        boolean actualCompilerOptions_ExtractPrototypeMemberDeclarations = actualCompilerOptions_.extractPrototypeMemberDeclarations;
        assertFalse(actualCompilerOptions_ExtractPrototypeMemberDeclarations);
        
        boolean actualCompilerOptions_RemoveEmptyFunctions = actualCompilerOptions_.removeEmptyFunctions;
        assertFalse(actualCompilerOptions_RemoveEmptyFunctions);
        
        boolean actualCompilerOptions_RemoveUnusedPrototypeProperties = actualCompilerOptions_.removeUnusedPrototypeProperties;
        assertFalse(actualCompilerOptions_RemoveUnusedPrototypeProperties);
        
        boolean actualCompilerOptions_RemoveUnusedPrototypePropertiesInExterns = actualCompilerOptions_.removeUnusedPrototypePropertiesInExterns;
        assertFalse(actualCompilerOptions_RemoveUnusedPrototypePropertiesInExterns);
        
        boolean actualCompilerOptions_RemoveUnusedVars = actualCompilerOptions_.removeUnusedVars;
        assertFalse(actualCompilerOptions_RemoveUnusedVars);
        
        boolean actualCompilerOptions_RemoveUnusedVarsInGlobalScope = actualCompilerOptions_.removeUnusedVarsInGlobalScope;
        assertFalse(actualCompilerOptions_RemoveUnusedVarsInGlobalScope);
        
        boolean actualCompilerOptions_AliasExternals = actualCompilerOptions_.aliasExternals;
        assertFalse(actualCompilerOptions_AliasExternals);
        
        String actualCompilerOptions_AliasableGlobals = actualCompilerOptions_.aliasableGlobals;
        assertNull(actualCompilerOptions_AliasableGlobals);
        
        String actualCompilerOptions_UnaliasableGlobals = actualCompilerOptions_.unaliasableGlobals;
        assertNull(actualCompilerOptions_UnaliasableGlobals);
        
        boolean actualCompilerOptions_CollapseVariableDeclarations = actualCompilerOptions_.collapseVariableDeclarations;
        assertFalse(actualCompilerOptions_CollapseVariableDeclarations);
        
        boolean actualCompilerOptions_CollapseAnonymousFunctions = actualCompilerOptions_.collapseAnonymousFunctions;
        assertFalse(actualCompilerOptions_CollapseAnonymousFunctions);
        
        Set actualCompilerOptions_AliasableStrings = actualCompilerOptions_.aliasableStrings;
        assertNull(actualCompilerOptions_AliasableStrings);
        
        String actualCompilerOptions_AliasStringsBlacklist = actualCompilerOptions_.aliasStringsBlacklist;
        assertNull(actualCompilerOptions_AliasStringsBlacklist);
        
        boolean actualCompilerOptions_AliasAllStrings = actualCompilerOptions_.aliasAllStrings;
        assertFalse(actualCompilerOptions_AliasAllStrings);
        
        boolean actualCompilerOptions_OutputJsStringUsage = actualCompilerOptions_.outputJsStringUsage;
        assertFalse(actualCompilerOptions_OutputJsStringUsage);
        
        boolean actualCompilerOptions_ConvertToDottedProperties = actualCompilerOptions_.convertToDottedProperties;
        assertFalse(actualCompilerOptions_ConvertToDottedProperties);
        
        boolean actualCompilerOptions_RewriteFunctionExpressions = actualCompilerOptions_.rewriteFunctionExpressions;
        assertFalse(actualCompilerOptions_RewriteFunctionExpressions);
        
        boolean actualCompilerOptions_OptimizeParameters = actualCompilerOptions_.optimizeParameters;
        assertFalse(actualCompilerOptions_OptimizeParameters);
        
        boolean actualCompilerOptions_OptimizeArgumentsArray = actualCompilerOptions_.optimizeArgumentsArray;
        assertFalse(actualCompilerOptions_OptimizeArgumentsArray);
        
        boolean actualCompilerOptions_ChainCalls = actualCompilerOptions_.chainCalls;
        assertFalse(actualCompilerOptions_ChainCalls);
        
        VariableRenamingPolicy actualCompilerOptions_VariableRenaming = actualCompilerOptions_.variableRenaming;
        assertNull(actualCompilerOptions_VariableRenaming);
        
        PropertyRenamingPolicy actualCompilerOptions_PropertyRenaming = actualCompilerOptions_.propertyRenaming;
        assertNull(actualCompilerOptions_PropertyRenaming);
        
        boolean actualCompilerOptions_LabelRenaming = actualCompilerOptions_.labelRenaming;
        assertFalse(actualCompilerOptions_LabelRenaming);
        
        boolean actualCompilerOptions_ReserveRawExports = actualCompilerOptions_.reserveRawExports;
        assertFalse(actualCompilerOptions_ReserveRawExports);
        
        boolean actualCompilerOptions_GeneratePseudoNames = actualCompilerOptions_.generatePseudoNames;
        assertFalse(actualCompilerOptions_GeneratePseudoNames);
        
        String actualCompilerOptions_RenamePrefix = actualCompilerOptions_.renamePrefix;
        assertNull(actualCompilerOptions_RenamePrefix);
        
        boolean actualCompilerOptions_AliasKeywords = actualCompilerOptions_.aliasKeywords;
        assertFalse(actualCompilerOptions_AliasKeywords);
        
        boolean actualCompilerOptions_CollapseProperties = actualCompilerOptions_.collapseProperties;
        assertFalse(actualCompilerOptions_CollapseProperties);
        
        boolean actualCompilerOptions_CollapsePropertiesOnExternTypes = actualCompilerOptions_.collapsePropertiesOnExternTypes;
        assertFalse(actualCompilerOptions_CollapsePropertiesOnExternTypes);
        
        boolean actualCompilerOptions_DevirtualizePrototypeMethods = actualCompilerOptions_.devirtualizePrototypeMethods;
        assertFalse(actualCompilerOptions_DevirtualizePrototypeMethods);
        
        boolean actualCompilerOptions_ComputeFunctionSideEffects = actualCompilerOptions_.computeFunctionSideEffects;
        assertFalse(actualCompilerOptions_ComputeFunctionSideEffects);
        
        String actualCompilerOptions_DebugFunctionSideEffectsPath = actualCompilerOptions_.debugFunctionSideEffectsPath;
        assertNull(actualCompilerOptions_DebugFunctionSideEffectsPath);
        
        boolean actualCompilerOptions_DisambiguateProperties = actualCompilerOptions_.disambiguateProperties;
        assertFalse(actualCompilerOptions_DisambiguateProperties);
        
        boolean actualCompilerOptions_AmbiguateProperties = actualCompilerOptions_.ambiguateProperties;
        assertFalse(actualCompilerOptions_AmbiguateProperties);
        
        AnonymousFunctionNamingPolicy actualCompilerOptions_AnonymousFunctionNaming = actualCompilerOptions_.anonymousFunctionNaming;
        assertNull(actualCompilerOptions_AnonymousFunctionNaming);
        
        byte[] actualCompilerOptions_InputVariableMapSerialized = actualCompilerOptions_.inputVariableMapSerialized;
        assertNull(actualCompilerOptions_InputVariableMapSerialized);
        
        byte[] actualCompilerOptions_InputPropertyMapSerialized = actualCompilerOptions_.inputPropertyMapSerialized;
        assertNull(actualCompilerOptions_InputPropertyMapSerialized);
        
        boolean actualCompilerOptions_ExportTestFunctions = actualCompilerOptions_.exportTestFunctions;
        assertFalse(actualCompilerOptions_ExportTestFunctions);
        
        boolean actualCompilerOptions_RuntimeTypeCheck = actualCompilerOptions_.runtimeTypeCheck;
        assertFalse(actualCompilerOptions_RuntimeTypeCheck);
        
        String actualCompilerOptions_RuntimeTypeCheckLogFunction = actualCompilerOptions_.runtimeTypeCheckLogFunction;
        assertNull(actualCompilerOptions_RuntimeTypeCheckLogFunction);
        
        CodingConvention expectedCompilerOptions_CodingConvention = expectedCompilerOptions_.getCodingConvention();
        CodingConvention actualCompilerOptions_CodingConvention = actualCompilerOptions_.getCodingConvention();
        
        boolean actualCompilerOptions_InstrumentForCoverage = actualCompilerOptions_.instrumentForCoverage;
        assertFalse(actualCompilerOptions_InstrumentForCoverage);
        
        boolean actualCompilerOptions_InstrumentForCoverageOnly = actualCompilerOptions_.instrumentForCoverageOnly;
        assertFalse(actualCompilerOptions_InstrumentForCoverageOnly);
        
        boolean actualCompilerOptions_IgnoreCajaProperties = actualCompilerOptions_.ignoreCajaProperties;
        assertFalse(actualCompilerOptions_IgnoreCajaProperties);
        
        String actualCompilerOptions_SyntheticBlockStartMarker = actualCompilerOptions_.syntheticBlockStartMarker;
        assertNull(actualCompilerOptions_SyntheticBlockStartMarker);
        
        String actualCompilerOptions_SyntheticBlockEndMarker = actualCompilerOptions_.syntheticBlockEndMarker;
        assertNull(actualCompilerOptions_SyntheticBlockEndMarker);
        
        String actualCompilerOptions_Locale = actualCompilerOptions_.locale;
        assertNull(actualCompilerOptions_Locale);
        
        boolean actualCompilerOptions_MarkAsCompiled = actualCompilerOptions_.markAsCompiled;
        assertFalse(actualCompilerOptions_MarkAsCompiled);
        
        boolean actualCompilerOptions_RemoveTryCatchFinally = actualCompilerOptions_.removeTryCatchFinally;
        assertFalse(actualCompilerOptions_RemoveTryCatchFinally);
        
        boolean actualCompilerOptions_ClosurePass = actualCompilerOptions_.closurePass;
        assertFalse(actualCompilerOptions_ClosurePass);
        
        boolean actualCompilerOptions_RewriteNewDateGoogNow = actualCompilerOptions_.rewriteNewDateGoogNow;
        assertFalse(actualCompilerOptions_RewriteNewDateGoogNow);
        
        boolean actualCompilerOptions_RemoveAbstractMethods = actualCompilerOptions_.removeAbstractMethods;
        assertFalse(actualCompilerOptions_RemoveAbstractMethods);
        
        boolean actualCompilerOptions_GatherCssNames = actualCompilerOptions_.gatherCssNames;
        assertFalse(actualCompilerOptions_GatherCssNames);
        
        Set actualCompilerOptions_StripTypes = actualCompilerOptions_.stripTypes;
        assertNull(actualCompilerOptions_StripTypes);
        
        Set actualCompilerOptions_StripNameSuffixes = actualCompilerOptions_.stripNameSuffixes;
        assertNull(actualCompilerOptions_StripNameSuffixes);
        
        Set actualCompilerOptions_StripNamePrefixes = actualCompilerOptions_.stripNamePrefixes;
        assertNull(actualCompilerOptions_StripNamePrefixes);
        
        Set actualCompilerOptions_StripTypePrefixes = actualCompilerOptions_.stripTypePrefixes;
        assertNull(actualCompilerOptions_StripTypePrefixes);
        
        Multimap actualCompilerOptions_CustomPasses = actualCompilerOptions_.customPasses;
        assertNull(actualCompilerOptions_CustomPasses);
        
        boolean actualCompilerOptions_MarkNoSideEffectCalls = actualCompilerOptions_.markNoSideEffectCalls;
        assertFalse(actualCompilerOptions_MarkNoSideEffectCalls);
        
        Map actualCompilerOptions_DefineReplacements = actualCompilerOptions_.getDefineReplacements();
        assertNull(actualCompilerOptions_DefineReplacements);
        
        boolean actualCompilerOptions_MoveFunctionDeclarations = actualCompilerOptions_.moveFunctionDeclarations;
        assertFalse(actualCompilerOptions_MoveFunctionDeclarations);
        
        String actualCompilerOptions_InstrumentationTemplate = actualCompilerOptions_.instrumentationTemplate;
        assertNull(actualCompilerOptions_InstrumentationTemplate);
        
        String actualCompilerOptions_AppNameStr = actualCompilerOptions_.appNameStr;
        assertNull(actualCompilerOptions_AppNameStr);
        
        boolean actualCompilerOptions_RecordFunctionInformation = actualCompilerOptions_.recordFunctionInformation;
        assertFalse(actualCompilerOptions_RecordFunctionInformation);
        
        boolean actualCompilerOptions_GenerateExports = actualCompilerOptions_.generateExports;
        assertFalse(actualCompilerOptions_GenerateExports);
        
        CssRenamingMap actualCompilerOptions_CssRenamingMap = actualCompilerOptions_.cssRenamingMap;
        assertNull(actualCompilerOptions_CssRenamingMap);
        
        boolean actualCompilerOptions_ProcessObjectPropertyString = actualCompilerOptions_.processObjectPropertyString;
        assertFalse(actualCompilerOptions_ProcessObjectPropertyString);
        
        Set actualCompilerOptions_IdGenerators = actualCompilerOptions_.idGenerators;
        assertNull(actualCompilerOptions_IdGenerators);
        
        boolean actualCompilerOptions_PrettyPrint = actualCompilerOptions_.prettyPrint;
        assertFalse(actualCompilerOptions_PrettyPrint);
        
        boolean actualCompilerOptions_LineBreak = actualCompilerOptions_.lineBreak;
        assertFalse(actualCompilerOptions_LineBreak);
        
        boolean actualCompilerOptions_PrintInputDelimiter = actualCompilerOptions_.printInputDelimiter;
        assertFalse(actualCompilerOptions_PrintInputDelimiter);
        
        String actualCompilerOptions_InputDelimiter = actualCompilerOptions_.inputDelimiter;
        assertNull(actualCompilerOptions_InputDelimiter);
        
        String actualCompilerOptions_ReportPath = actualCompilerOptions_.reportPath;
        assertNull(actualCompilerOptions_ReportPath);
        
        CompilerOptions.TracerMode actualCompilerOptions_Tracer = actualCompilerOptions_.tracer;
        assertNull(actualCompilerOptions_Tracer);
        
        boolean actualCompilerOptions_ColorizeErrorOutput = ((Boolean) getFieldValue(actualCompilerOptions_, "com.google.javascript.jscomp.CompilerOptions", "colorizeErrorOutput"));
        assertFalse(actualCompilerOptions_ColorizeErrorOutput);
        
        ErrorFormat actualCompilerOptions_ErrorFormat = actualCompilerOptions_.errorFormat;
        assertNull(actualCompilerOptions_ErrorFormat);
        
        String actualCompilerOptions_JsOutputFile = actualCompilerOptions_.jsOutputFile;
        assertNull(actualCompilerOptions_JsOutputFile);
        
        ComposeWarningsGuard actualCompilerOptions_WarningsGuard = ((ComposeWarningsGuard) getFieldValue(actualCompilerOptions_, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard"));
        assertNull(actualCompilerOptions_WarningsGuard);
        
        String actualCompilerOptions_ExternExportsPath = actualCompilerOptions_.externExportsPath;
        assertNull(actualCompilerOptions_ExternExportsPath);
        
        String actualCompilerOptions_NameReferenceReportPath = actualCompilerOptions_.nameReferenceReportPath;
        assertNull(actualCompilerOptions_NameReferenceReportPath);
        
        String actualCompilerOptions_NameReferenceGraphPath = actualCompilerOptions_.nameReferenceGraphPath;
        assertNull(actualCompilerOptions_NameReferenceGraphPath);
        
        String actualCompilerOptions_SourceMapOutputPath = actualCompilerOptions_.sourceMapOutputPath;
        assertNull(actualCompilerOptions_SourceMapOutputPath);
        
        Charset actualCompilerOptions_OutputCharset = actualCompilerOptions_.outputCharset;
        assertNull(actualCompilerOptions_OutputCharset);
        
        PassConfig actualCompilerPasses = ((PassConfig) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualCompilerPasses);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerExterns_ = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externs_"));
        assertNull(actualCompilerExterns_);
        
        com.google.javascript.jscomp.JSModule[] actualCompilerModules_ = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "modules_"));
        assertNull(actualCompilerModules_);
        
        JSModuleGraph actualCompilerModuleGraph_ = ((JSModuleGraph) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "moduleGraph_"));
        assertNull(actualCompilerModuleGraph_);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerInputs_ = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputs_"));
        assertNull(actualCompilerInputs_);
        
        ErrorManager actualCompilerErrorManager = (((Compiler) actualCompiler)).getErrorManager();
        assertNull(actualCompilerErrorManager);
        
        SymbolTable actualCompilerSymbolTable = ((SymbolTable) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertNull(actualCompilerSymbolTable);
        
        Node actualCompilerExternsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        assertNull(actualCompilerExternsRoot);
        
        Node actualCompilerJsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "jsRoot"));
        assertNull(actualCompilerJsRoot);
        
        Node actualCompilerExternAndJsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        assertNull(actualCompilerExternAndJsRoot);
        
        Map actualCompilerInputsByName_ = ((Map) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputsByName_"));
        assertNull(actualCompilerInputsByName_);
        
        SourceMap actualCompilerSourceMap_ = ((SourceMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "sourceMap_"));
        assertNull(actualCompilerSourceMap_);
        
        String actualCompilerExternExports_ = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externExports_"));
        assertNull(actualCompilerExternExports_);
        
        int expectedCompilerUniqueNameId = ((Integer) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualCompilerUniqueNameId = ((Integer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedCompilerUniqueNameId, actualCompilerUniqueNameId);
        
        boolean actualCompilerNormalized = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "normalized"));
        assertFalse(actualCompilerNormalized);
        
        boolean actualCompilerUseThreads = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualCompilerUseThreads);
        
        FunctionInformationMap actualCompilerFunctionInformationMap_ = ((FunctionInformationMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "functionInformationMap_"));
        assertNull(actualCompilerFunctionInformationMap_);
        
        StringBuilder actualCompilerDebugLog_ = ((StringBuilder) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "debugLog_"));
        assertNull(actualCompilerDebugLog_);
        
        CodingConvention actualCompilerDefaultCodingConvention = ((CodingConvention) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        assertNull(actualCompilerDefaultCodingConvention);
        
        JSTypeRegistry actualCompilerTypeRegistry = (((Compiler) actualCompiler)).getTypeRegistry();
        assertNull(actualCompilerTypeRegistry);
        
        Config actualCompilerParserConfig = (((Compiler) actualCompiler)).getParserConfig();
        assertNull(actualCompilerParserConfig);
        
        ReverseAbstractInterpreter actualCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualCompilerAbstractInterpreter);
        
        TypeValidator actualCompilerTypeValidator = (((Compiler) actualCompiler)).getTypeValidator();
        assertNull(actualCompilerTypeValidator);
        
        PerformanceTracker actualCompilerTracker = ((PerformanceTracker) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
        assertNull(actualCompilerTracker);
        
        ErrorReporter actualCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualCompilerOldErrorReporter);
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualCompilerDefaultErrorReporter = (((Compiler) actualCompiler)).getDefaultErrorReporter();
        assertNull(actualCompilerDefaultErrorReporter);
        
        PassFactory actualCompilerSanityCheck = ((PassFactory) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualCompilerSanityCheck);
        
        Tracer actualCompilerCurrentTracer = ((Tracer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualCompilerCurrentTracer);
        
        String actualCompilerCurrentPassName = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualCompilerCurrentPassName);
        
        CodeChangeHandler.RecentChange actualCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
        assertNull(actualCompilerRecentChange);
        
        List actualCompilerCodeChangeHandlers = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualCompilerCodeChangeHandlers);
        
        Object expectedTypeSystem = getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem");
        Object actualTypeSystem = getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem");
        TightenTypes actualTypeSystemTt = ((TightenTypes) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "tt"));
        assertNull(actualTypeSystemTt);
        
        int expectedTypeSystemNextUniqueId = ((Integer) getFieldValue(expectedTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId"));
        int actualTypeSystemNextUniqueId = ((Integer) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId"));
        assertEquals(expectedTypeSystemNextUniqueId, actualTypeSystemNextUniqueId);
        
        CodingConvention expectedTypeSystemCodingConvention = ((CodingConvention) getFieldValue(expectedTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "codingConvention"));
        CodingConvention actualTypeSystemCodingConvention = ((CodingConvention) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "codingConvention"));
        
        Set expectedTypeSystemInvalidatingTypes = ((Set) getFieldValue(expectedTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes"));
        Set actualTypeSystemInvalidatingTypes = ((Set) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes"));
        assertTrue(deepEquals(expectedTypeSystemInvalidatingTypes, actualTypeSystemInvalidatingTypes));
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes)}
 * @utbot.returnsFrom {@code return new DisambiguateProperties<ConcreteType>(compiler, new ConcreteTypeSystem(tt, compiler.getCodingConvention()));}
 *  */
    @Test
    public void testForConcreteTypeSystem_Return() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        
        DisambiguateProperties actual = DisambiguateProperties.forConcreteTypeSystem(compiler, null);
        
        DisambiguateProperties expected = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        HashSet invalidatingTypes = new HashSet();
        setField(typeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes", invalidatingTypes);
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        boolean actualShowInvalidationWarnings = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "showInvalidationWarnings"));
        assertFalse(actualShowInvalidationWarnings);
        
        AbstractCompiler expectedCompiler = ((AbstractCompiler) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "compiler"));
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "compiler"));
        CompilerOptions expectedCompilerOptions_ = ((CompilerOptions) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "options_"));
        CompilerOptions actualCompilerOptions_ = ((CompilerOptions) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "options_"));
        boolean actualCompilerOptions_IdeMode = actualCompilerOptions_.ideMode;
        assertFalse(actualCompilerOptions_IdeMode);
        
        boolean actualCompilerOptions_SkipAllPasses = actualCompilerOptions_.skipAllPasses;
        assertFalse(actualCompilerOptions_SkipAllPasses);
        
        boolean actualCompilerOptions_NameAnonymousFunctionsOnly = actualCompilerOptions_.nameAnonymousFunctionsOnly;
        assertFalse(actualCompilerOptions_NameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualCompilerOptions_DevMode = actualCompilerOptions_.devMode;
        assertNull(actualCompilerOptions_DevMode);
        
        boolean actualCompilerOptions_CheckSymbols = actualCompilerOptions_.checkSymbols;
        assertFalse(actualCompilerOptions_CheckSymbols);
        
        CheckLevel actualCompilerOptions_CheckShadowVars = actualCompilerOptions_.checkShadowVars;
        assertNull(actualCompilerOptions_CheckShadowVars);
        
        CheckLevel actualCompilerOptions_AggressiveVarCheck = actualCompilerOptions_.aggressiveVarCheck;
        assertNull(actualCompilerOptions_AggressiveVarCheck);
        
        CheckLevel actualCompilerOptions_CheckFunctions = actualCompilerOptions_.checkFunctions;
        assertNull(actualCompilerOptions_CheckFunctions);
        
        CheckLevel actualCompilerOptions_CheckMethods = actualCompilerOptions_.checkMethods;
        assertNull(actualCompilerOptions_CheckMethods);
        
        boolean actualCompilerOptions_CheckDuplicateMessages = actualCompilerOptions_.checkDuplicateMessages;
        assertFalse(actualCompilerOptions_CheckDuplicateMessages);
        
        boolean actualCompilerOptions_AllowLegacyJsMessages = actualCompilerOptions_.allowLegacyJsMessages;
        assertFalse(actualCompilerOptions_AllowLegacyJsMessages);
        
        boolean actualCompilerOptions_StrictMessageReplacement = actualCompilerOptions_.strictMessageReplacement;
        assertFalse(actualCompilerOptions_StrictMessageReplacement);
        
        boolean actualCompilerOptions_CheckSuspiciousCode = actualCompilerOptions_.checkSuspiciousCode;
        assertFalse(actualCompilerOptions_CheckSuspiciousCode);
        
        boolean actualCompilerOptions_CheckControlStructures = actualCompilerOptions_.checkControlStructures;
        assertFalse(actualCompilerOptions_CheckControlStructures);
        
        CheckLevel actualCompilerOptions_CheckUndefinedProperties = actualCompilerOptions_.checkUndefinedProperties;
        assertNull(actualCompilerOptions_CheckUndefinedProperties);
        
        boolean actualCompilerOptions_CheckUnusedPropertiesEarly = actualCompilerOptions_.checkUnusedPropertiesEarly;
        assertFalse(actualCompilerOptions_CheckUnusedPropertiesEarly);
        
        boolean actualCompilerOptions_CheckTypes = actualCompilerOptions_.checkTypes;
        assertFalse(actualCompilerOptions_CheckTypes);
        
        boolean actualCompilerOptions_TightenTypes = actualCompilerOptions_.tightenTypes;
        assertFalse(actualCompilerOptions_TightenTypes);
        
        boolean actualCompilerOptions_InferTypesInGlobalScope = actualCompilerOptions_.inferTypesInGlobalScope;
        assertFalse(actualCompilerOptions_InferTypesInGlobalScope);
        
        boolean actualCompilerOptions_CheckTypedPropertyCalls = actualCompilerOptions_.checkTypedPropertyCalls;
        assertFalse(actualCompilerOptions_CheckTypedPropertyCalls);
        
        CheckLevel actualCompilerOptions_ReportMissingOverride = actualCompilerOptions_.reportMissingOverride;
        assertNull(actualCompilerOptions_ReportMissingOverride);
        
        CheckLevel actualCompilerOptions_ReportUnknownTypes = actualCompilerOptions_.reportUnknownTypes;
        assertNull(actualCompilerOptions_ReportUnknownTypes);
        
        CheckLevel actualCompilerOptions_CheckRequires = actualCompilerOptions_.checkRequires;
        assertNull(actualCompilerOptions_CheckRequires);
        
        CheckLevel actualCompilerOptions_CheckProvides = actualCompilerOptions_.checkProvides;
        assertNull(actualCompilerOptions_CheckProvides);
        
        CheckLevel actualCompilerOptions_CheckGlobalNamesLevel = actualCompilerOptions_.checkGlobalNamesLevel;
        assertNull(actualCompilerOptions_CheckGlobalNamesLevel);
        
        CheckLevel actualCompilerOptions_BrokenClosureRequiresLevel = actualCompilerOptions_.brokenClosureRequiresLevel;
        assertNull(actualCompilerOptions_BrokenClosureRequiresLevel);
        
        CheckLevel actualCompilerOptions_CheckGlobalThisLevel = actualCompilerOptions_.checkGlobalThisLevel;
        assertNull(actualCompilerOptions_CheckGlobalThisLevel);
        
        CheckLevel actualCompilerOptions_CheckMissingGetCssNameLevel = actualCompilerOptions_.checkMissingGetCssNameLevel;
        assertNull(actualCompilerOptions_CheckMissingGetCssNameLevel);
        
        String actualCompilerOptions_CheckMissingGetCssNameBlacklist = actualCompilerOptions_.checkMissingGetCssNameBlacklist;
        assertNull(actualCompilerOptions_CheckMissingGetCssNameBlacklist);
        
        boolean actualCompilerOptions_CheckEs5Strict = actualCompilerOptions_.checkEs5Strict;
        assertFalse(actualCompilerOptions_CheckEs5Strict);
        
        boolean actualCompilerOptions_CheckCaja = actualCompilerOptions_.checkCaja;
        assertFalse(actualCompilerOptions_CheckCaja);
        
        boolean actualCompilerOptions_FoldConstants = actualCompilerOptions_.foldConstants;
        assertFalse(actualCompilerOptions_FoldConstants);
        
        boolean actualCompilerOptions_RemoveConstantExpressions = actualCompilerOptions_.removeConstantExpressions;
        assertFalse(actualCompilerOptions_RemoveConstantExpressions);
        
        boolean actualCompilerOptions_DeadAssignmentElimination = actualCompilerOptions_.deadAssignmentElimination;
        assertFalse(actualCompilerOptions_DeadAssignmentElimination);
        
        boolean actualCompilerOptions_InlineConstantVars = actualCompilerOptions_.inlineConstantVars;
        assertFalse(actualCompilerOptions_InlineConstantVars);
        
        boolean actualCompilerOptions_InlineFunctions = actualCompilerOptions_.inlineFunctions;
        assertFalse(actualCompilerOptions_InlineFunctions);
        
        boolean actualCompilerOptions_DecomposeExpressions = actualCompilerOptions_.decomposeExpressions;
        assertFalse(actualCompilerOptions_DecomposeExpressions);
        
        boolean actualCompilerOptions_InlineAnonymousFunctionExpressions = actualCompilerOptions_.inlineAnonymousFunctionExpressions;
        assertFalse(actualCompilerOptions_InlineAnonymousFunctionExpressions);
        
        boolean actualCompilerOptions_InlineLocalFunctions = actualCompilerOptions_.inlineLocalFunctions;
        assertFalse(actualCompilerOptions_InlineLocalFunctions);
        
        boolean actualCompilerOptions_CrossModuleCodeMotion = actualCompilerOptions_.crossModuleCodeMotion;
        assertFalse(actualCompilerOptions_CrossModuleCodeMotion);
        
        boolean actualCompilerOptions_CoalesceVariableNames = actualCompilerOptions_.coalesceVariableNames;
        assertFalse(actualCompilerOptions_CoalesceVariableNames);
        
        boolean actualCompilerOptions_CrossModuleMethodMotion = actualCompilerOptions_.crossModuleMethodMotion;
        assertFalse(actualCompilerOptions_CrossModuleMethodMotion);
        
        boolean actualCompilerOptions_InlineGetters = actualCompilerOptions_.inlineGetters;
        assertFalse(actualCompilerOptions_InlineGetters);
        
        boolean actualCompilerOptions_InlineVariables = actualCompilerOptions_.inlineVariables;
        assertFalse(actualCompilerOptions_InlineVariables);
        
        boolean actualCompilerOptions_InlineLocalVariables = actualCompilerOptions_.inlineLocalVariables;
        assertFalse(actualCompilerOptions_InlineLocalVariables);
        
        boolean actualCompilerOptions_FlowSensitiveInlineVariables = actualCompilerOptions_.flowSensitiveInlineVariables;
        assertFalse(actualCompilerOptions_FlowSensitiveInlineVariables);
        
        boolean actualCompilerOptions_SmartNameRemoval = actualCompilerOptions_.smartNameRemoval;
        assertFalse(actualCompilerOptions_SmartNameRemoval);
        
        boolean actualCompilerOptions_RemoveDeadCode = actualCompilerOptions_.removeDeadCode;
        assertFalse(actualCompilerOptions_RemoveDeadCode);
        
        CheckLevel actualCompilerOptions_CheckUnreachableCode = actualCompilerOptions_.checkUnreachableCode;
        assertNull(actualCompilerOptions_CheckUnreachableCode);
        
        CheckLevel actualCompilerOptions_CheckMissingReturn = actualCompilerOptions_.checkMissingReturn;
        assertNull(actualCompilerOptions_CheckMissingReturn);
        
        boolean actualCompilerOptions_ExtractPrototypeMemberDeclarations = actualCompilerOptions_.extractPrototypeMemberDeclarations;
        assertFalse(actualCompilerOptions_ExtractPrototypeMemberDeclarations);
        
        boolean actualCompilerOptions_RemoveEmptyFunctions = actualCompilerOptions_.removeEmptyFunctions;
        assertFalse(actualCompilerOptions_RemoveEmptyFunctions);
        
        boolean actualCompilerOptions_RemoveUnusedPrototypeProperties = actualCompilerOptions_.removeUnusedPrototypeProperties;
        assertFalse(actualCompilerOptions_RemoveUnusedPrototypeProperties);
        
        boolean actualCompilerOptions_RemoveUnusedPrototypePropertiesInExterns = actualCompilerOptions_.removeUnusedPrototypePropertiesInExterns;
        assertFalse(actualCompilerOptions_RemoveUnusedPrototypePropertiesInExterns);
        
        boolean actualCompilerOptions_RemoveUnusedVars = actualCompilerOptions_.removeUnusedVars;
        assertFalse(actualCompilerOptions_RemoveUnusedVars);
        
        boolean actualCompilerOptions_RemoveUnusedVarsInGlobalScope = actualCompilerOptions_.removeUnusedVarsInGlobalScope;
        assertFalse(actualCompilerOptions_RemoveUnusedVarsInGlobalScope);
        
        boolean actualCompilerOptions_AliasExternals = actualCompilerOptions_.aliasExternals;
        assertFalse(actualCompilerOptions_AliasExternals);
        
        String actualCompilerOptions_AliasableGlobals = actualCompilerOptions_.aliasableGlobals;
        assertNull(actualCompilerOptions_AliasableGlobals);
        
        String actualCompilerOptions_UnaliasableGlobals = actualCompilerOptions_.unaliasableGlobals;
        assertNull(actualCompilerOptions_UnaliasableGlobals);
        
        boolean actualCompilerOptions_CollapseVariableDeclarations = actualCompilerOptions_.collapseVariableDeclarations;
        assertFalse(actualCompilerOptions_CollapseVariableDeclarations);
        
        boolean actualCompilerOptions_CollapseAnonymousFunctions = actualCompilerOptions_.collapseAnonymousFunctions;
        assertFalse(actualCompilerOptions_CollapseAnonymousFunctions);
        
        Set actualCompilerOptions_AliasableStrings = actualCompilerOptions_.aliasableStrings;
        assertNull(actualCompilerOptions_AliasableStrings);
        
        String actualCompilerOptions_AliasStringsBlacklist = actualCompilerOptions_.aliasStringsBlacklist;
        assertNull(actualCompilerOptions_AliasStringsBlacklist);
        
        boolean actualCompilerOptions_AliasAllStrings = actualCompilerOptions_.aliasAllStrings;
        assertFalse(actualCompilerOptions_AliasAllStrings);
        
        boolean actualCompilerOptions_OutputJsStringUsage = actualCompilerOptions_.outputJsStringUsage;
        assertFalse(actualCompilerOptions_OutputJsStringUsage);
        
        boolean actualCompilerOptions_ConvertToDottedProperties = actualCompilerOptions_.convertToDottedProperties;
        assertFalse(actualCompilerOptions_ConvertToDottedProperties);
        
        boolean actualCompilerOptions_RewriteFunctionExpressions = actualCompilerOptions_.rewriteFunctionExpressions;
        assertFalse(actualCompilerOptions_RewriteFunctionExpressions);
        
        boolean actualCompilerOptions_OptimizeParameters = actualCompilerOptions_.optimizeParameters;
        assertFalse(actualCompilerOptions_OptimizeParameters);
        
        boolean actualCompilerOptions_OptimizeArgumentsArray = actualCompilerOptions_.optimizeArgumentsArray;
        assertFalse(actualCompilerOptions_OptimizeArgumentsArray);
        
        boolean actualCompilerOptions_ChainCalls = actualCompilerOptions_.chainCalls;
        assertFalse(actualCompilerOptions_ChainCalls);
        
        VariableRenamingPolicy actualCompilerOptions_VariableRenaming = actualCompilerOptions_.variableRenaming;
        assertNull(actualCompilerOptions_VariableRenaming);
        
        PropertyRenamingPolicy actualCompilerOptions_PropertyRenaming = actualCompilerOptions_.propertyRenaming;
        assertNull(actualCompilerOptions_PropertyRenaming);
        
        boolean actualCompilerOptions_LabelRenaming = actualCompilerOptions_.labelRenaming;
        assertFalse(actualCompilerOptions_LabelRenaming);
        
        boolean actualCompilerOptions_ReserveRawExports = actualCompilerOptions_.reserveRawExports;
        assertFalse(actualCompilerOptions_ReserveRawExports);
        
        boolean actualCompilerOptions_GeneratePseudoNames = actualCompilerOptions_.generatePseudoNames;
        assertFalse(actualCompilerOptions_GeneratePseudoNames);
        
        String actualCompilerOptions_RenamePrefix = actualCompilerOptions_.renamePrefix;
        assertNull(actualCompilerOptions_RenamePrefix);
        
        boolean actualCompilerOptions_AliasKeywords = actualCompilerOptions_.aliasKeywords;
        assertFalse(actualCompilerOptions_AliasKeywords);
        
        boolean actualCompilerOptions_CollapseProperties = actualCompilerOptions_.collapseProperties;
        assertFalse(actualCompilerOptions_CollapseProperties);
        
        boolean actualCompilerOptions_CollapsePropertiesOnExternTypes = actualCompilerOptions_.collapsePropertiesOnExternTypes;
        assertFalse(actualCompilerOptions_CollapsePropertiesOnExternTypes);
        
        boolean actualCompilerOptions_DevirtualizePrototypeMethods = actualCompilerOptions_.devirtualizePrototypeMethods;
        assertFalse(actualCompilerOptions_DevirtualizePrototypeMethods);
        
        boolean actualCompilerOptions_ComputeFunctionSideEffects = actualCompilerOptions_.computeFunctionSideEffects;
        assertFalse(actualCompilerOptions_ComputeFunctionSideEffects);
        
        String actualCompilerOptions_DebugFunctionSideEffectsPath = actualCompilerOptions_.debugFunctionSideEffectsPath;
        assertNull(actualCompilerOptions_DebugFunctionSideEffectsPath);
        
        boolean actualCompilerOptions_DisambiguateProperties = actualCompilerOptions_.disambiguateProperties;
        assertFalse(actualCompilerOptions_DisambiguateProperties);
        
        boolean actualCompilerOptions_AmbiguateProperties = actualCompilerOptions_.ambiguateProperties;
        assertFalse(actualCompilerOptions_AmbiguateProperties);
        
        AnonymousFunctionNamingPolicy actualCompilerOptions_AnonymousFunctionNaming = actualCompilerOptions_.anonymousFunctionNaming;
        assertNull(actualCompilerOptions_AnonymousFunctionNaming);
        
        byte[] actualCompilerOptions_InputVariableMapSerialized = actualCompilerOptions_.inputVariableMapSerialized;
        assertNull(actualCompilerOptions_InputVariableMapSerialized);
        
        byte[] actualCompilerOptions_InputPropertyMapSerialized = actualCompilerOptions_.inputPropertyMapSerialized;
        assertNull(actualCompilerOptions_InputPropertyMapSerialized);
        
        boolean actualCompilerOptions_ExportTestFunctions = actualCompilerOptions_.exportTestFunctions;
        assertFalse(actualCompilerOptions_ExportTestFunctions);
        
        boolean actualCompilerOptions_RuntimeTypeCheck = actualCompilerOptions_.runtimeTypeCheck;
        assertFalse(actualCompilerOptions_RuntimeTypeCheck);
        
        String actualCompilerOptions_RuntimeTypeCheckLogFunction = actualCompilerOptions_.runtimeTypeCheckLogFunction;
        assertNull(actualCompilerOptions_RuntimeTypeCheckLogFunction);
        
        CodingConvention actualCompilerOptions_CodingConvention = actualCompilerOptions_.getCodingConvention();
        assertNull(actualCompilerOptions_CodingConvention);
        
        boolean actualCompilerOptions_InstrumentForCoverage = actualCompilerOptions_.instrumentForCoverage;
        assertFalse(actualCompilerOptions_InstrumentForCoverage);
        
        boolean actualCompilerOptions_InstrumentForCoverageOnly = actualCompilerOptions_.instrumentForCoverageOnly;
        assertFalse(actualCompilerOptions_InstrumentForCoverageOnly);
        
        boolean actualCompilerOptions_IgnoreCajaProperties = actualCompilerOptions_.ignoreCajaProperties;
        assertFalse(actualCompilerOptions_IgnoreCajaProperties);
        
        String actualCompilerOptions_SyntheticBlockStartMarker = actualCompilerOptions_.syntheticBlockStartMarker;
        assertNull(actualCompilerOptions_SyntheticBlockStartMarker);
        
        String actualCompilerOptions_SyntheticBlockEndMarker = actualCompilerOptions_.syntheticBlockEndMarker;
        assertNull(actualCompilerOptions_SyntheticBlockEndMarker);
        
        String actualCompilerOptions_Locale = actualCompilerOptions_.locale;
        assertNull(actualCompilerOptions_Locale);
        
        boolean actualCompilerOptions_MarkAsCompiled = actualCompilerOptions_.markAsCompiled;
        assertFalse(actualCompilerOptions_MarkAsCompiled);
        
        boolean actualCompilerOptions_RemoveTryCatchFinally = actualCompilerOptions_.removeTryCatchFinally;
        assertFalse(actualCompilerOptions_RemoveTryCatchFinally);
        
        boolean actualCompilerOptions_ClosurePass = actualCompilerOptions_.closurePass;
        assertFalse(actualCompilerOptions_ClosurePass);
        
        boolean actualCompilerOptions_RewriteNewDateGoogNow = actualCompilerOptions_.rewriteNewDateGoogNow;
        assertFalse(actualCompilerOptions_RewriteNewDateGoogNow);
        
        boolean actualCompilerOptions_RemoveAbstractMethods = actualCompilerOptions_.removeAbstractMethods;
        assertFalse(actualCompilerOptions_RemoveAbstractMethods);
        
        boolean actualCompilerOptions_GatherCssNames = actualCompilerOptions_.gatherCssNames;
        assertFalse(actualCompilerOptions_GatherCssNames);
        
        Set actualCompilerOptions_StripTypes = actualCompilerOptions_.stripTypes;
        assertNull(actualCompilerOptions_StripTypes);
        
        Set actualCompilerOptions_StripNameSuffixes = actualCompilerOptions_.stripNameSuffixes;
        assertNull(actualCompilerOptions_StripNameSuffixes);
        
        Set actualCompilerOptions_StripNamePrefixes = actualCompilerOptions_.stripNamePrefixes;
        assertNull(actualCompilerOptions_StripNamePrefixes);
        
        Set actualCompilerOptions_StripTypePrefixes = actualCompilerOptions_.stripTypePrefixes;
        assertNull(actualCompilerOptions_StripTypePrefixes);
        
        Multimap actualCompilerOptions_CustomPasses = actualCompilerOptions_.customPasses;
        assertNull(actualCompilerOptions_CustomPasses);
        
        boolean actualCompilerOptions_MarkNoSideEffectCalls = actualCompilerOptions_.markNoSideEffectCalls;
        assertFalse(actualCompilerOptions_MarkNoSideEffectCalls);
        
        Map actualCompilerOptions_DefineReplacements = actualCompilerOptions_.getDefineReplacements();
        assertNull(actualCompilerOptions_DefineReplacements);
        
        boolean actualCompilerOptions_MoveFunctionDeclarations = actualCompilerOptions_.moveFunctionDeclarations;
        assertFalse(actualCompilerOptions_MoveFunctionDeclarations);
        
        String actualCompilerOptions_InstrumentationTemplate = actualCompilerOptions_.instrumentationTemplate;
        assertNull(actualCompilerOptions_InstrumentationTemplate);
        
        String actualCompilerOptions_AppNameStr = actualCompilerOptions_.appNameStr;
        assertNull(actualCompilerOptions_AppNameStr);
        
        boolean actualCompilerOptions_RecordFunctionInformation = actualCompilerOptions_.recordFunctionInformation;
        assertFalse(actualCompilerOptions_RecordFunctionInformation);
        
        boolean actualCompilerOptions_GenerateExports = actualCompilerOptions_.generateExports;
        assertFalse(actualCompilerOptions_GenerateExports);
        
        CssRenamingMap actualCompilerOptions_CssRenamingMap = actualCompilerOptions_.cssRenamingMap;
        assertNull(actualCompilerOptions_CssRenamingMap);
        
        boolean actualCompilerOptions_ProcessObjectPropertyString = actualCompilerOptions_.processObjectPropertyString;
        assertFalse(actualCompilerOptions_ProcessObjectPropertyString);
        
        Set actualCompilerOptions_IdGenerators = actualCompilerOptions_.idGenerators;
        assertNull(actualCompilerOptions_IdGenerators);
        
        boolean actualCompilerOptions_PrettyPrint = actualCompilerOptions_.prettyPrint;
        assertFalse(actualCompilerOptions_PrettyPrint);
        
        boolean actualCompilerOptions_LineBreak = actualCompilerOptions_.lineBreak;
        assertFalse(actualCompilerOptions_LineBreak);
        
        boolean actualCompilerOptions_PrintInputDelimiter = actualCompilerOptions_.printInputDelimiter;
        assertFalse(actualCompilerOptions_PrintInputDelimiter);
        
        String actualCompilerOptions_InputDelimiter = actualCompilerOptions_.inputDelimiter;
        assertNull(actualCompilerOptions_InputDelimiter);
        
        String actualCompilerOptions_ReportPath = actualCompilerOptions_.reportPath;
        assertNull(actualCompilerOptions_ReportPath);
        
        CompilerOptions.TracerMode actualCompilerOptions_Tracer = actualCompilerOptions_.tracer;
        assertNull(actualCompilerOptions_Tracer);
        
        boolean actualCompilerOptions_ColorizeErrorOutput = ((Boolean) getFieldValue(actualCompilerOptions_, "com.google.javascript.jscomp.CompilerOptions", "colorizeErrorOutput"));
        assertFalse(actualCompilerOptions_ColorizeErrorOutput);
        
        ErrorFormat actualCompilerOptions_ErrorFormat = actualCompilerOptions_.errorFormat;
        assertNull(actualCompilerOptions_ErrorFormat);
        
        String actualCompilerOptions_JsOutputFile = actualCompilerOptions_.jsOutputFile;
        assertNull(actualCompilerOptions_JsOutputFile);
        
        ComposeWarningsGuard actualCompilerOptions_WarningsGuard = ((ComposeWarningsGuard) getFieldValue(actualCompilerOptions_, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard"));
        assertNull(actualCompilerOptions_WarningsGuard);
        
        String actualCompilerOptions_ExternExportsPath = actualCompilerOptions_.externExportsPath;
        assertNull(actualCompilerOptions_ExternExportsPath);
        
        String actualCompilerOptions_NameReferenceReportPath = actualCompilerOptions_.nameReferenceReportPath;
        assertNull(actualCompilerOptions_NameReferenceReportPath);
        
        String actualCompilerOptions_NameReferenceGraphPath = actualCompilerOptions_.nameReferenceGraphPath;
        assertNull(actualCompilerOptions_NameReferenceGraphPath);
        
        String actualCompilerOptions_SourceMapOutputPath = actualCompilerOptions_.sourceMapOutputPath;
        assertNull(actualCompilerOptions_SourceMapOutputPath);
        
        Charset actualCompilerOptions_OutputCharset = actualCompilerOptions_.outputCharset;
        assertNull(actualCompilerOptions_OutputCharset);
        
        PassConfig actualCompilerPasses = ((PassConfig) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualCompilerPasses);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerExterns_ = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externs_"));
        assertNull(actualCompilerExterns_);
        
        com.google.javascript.jscomp.JSModule[] actualCompilerModules_ = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "modules_"));
        assertNull(actualCompilerModules_);
        
        JSModuleGraph actualCompilerModuleGraph_ = ((JSModuleGraph) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "moduleGraph_"));
        assertNull(actualCompilerModuleGraph_);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerInputs_ = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputs_"));
        assertNull(actualCompilerInputs_);
        
        ErrorManager actualCompilerErrorManager = (((Compiler) actualCompiler)).getErrorManager();
        assertNull(actualCompilerErrorManager);
        
        SymbolTable actualCompilerSymbolTable = ((SymbolTable) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertNull(actualCompilerSymbolTable);
        
        Node actualCompilerExternsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        assertNull(actualCompilerExternsRoot);
        
        Node actualCompilerJsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "jsRoot"));
        assertNull(actualCompilerJsRoot);
        
        Node actualCompilerExternAndJsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        assertNull(actualCompilerExternAndJsRoot);
        
        Map actualCompilerInputsByName_ = ((Map) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputsByName_"));
        assertNull(actualCompilerInputsByName_);
        
        SourceMap actualCompilerSourceMap_ = ((SourceMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "sourceMap_"));
        assertNull(actualCompilerSourceMap_);
        
        String actualCompilerExternExports_ = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externExports_"));
        assertNull(actualCompilerExternExports_);
        
        int expectedCompilerUniqueNameId = ((Integer) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualCompilerUniqueNameId = ((Integer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedCompilerUniqueNameId, actualCompilerUniqueNameId);
        
        boolean actualCompilerNormalized = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "normalized"));
        assertFalse(actualCompilerNormalized);
        
        boolean actualCompilerUseThreads = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualCompilerUseThreads);
        
        FunctionInformationMap actualCompilerFunctionInformationMap_ = ((FunctionInformationMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "functionInformationMap_"));
        assertNull(actualCompilerFunctionInformationMap_);
        
        StringBuilder actualCompilerDebugLog_ = ((StringBuilder) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "debugLog_"));
        assertNull(actualCompilerDebugLog_);
        
        CodingConvention actualCompilerDefaultCodingConvention = ((CodingConvention) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        assertNull(actualCompilerDefaultCodingConvention);
        
        JSTypeRegistry actualCompilerTypeRegistry = (((Compiler) actualCompiler)).getTypeRegistry();
        assertNull(actualCompilerTypeRegistry);
        
        Config actualCompilerParserConfig = (((Compiler) actualCompiler)).getParserConfig();
        assertNull(actualCompilerParserConfig);
        
        ReverseAbstractInterpreter actualCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualCompilerAbstractInterpreter);
        
        TypeValidator actualCompilerTypeValidator = (((Compiler) actualCompiler)).getTypeValidator();
        assertNull(actualCompilerTypeValidator);
        
        PerformanceTracker actualCompilerTracker = ((PerformanceTracker) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
        assertNull(actualCompilerTracker);
        
        ErrorReporter actualCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualCompilerOldErrorReporter);
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualCompilerDefaultErrorReporter = (((Compiler) actualCompiler)).getDefaultErrorReporter();
        assertNull(actualCompilerDefaultErrorReporter);
        
        PassFactory actualCompilerSanityCheck = ((PassFactory) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualCompilerSanityCheck);
        
        Tracer actualCompilerCurrentTracer = ((Tracer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualCompilerCurrentTracer);
        
        String actualCompilerCurrentPassName = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualCompilerCurrentPassName);
        
        CodeChangeHandler.RecentChange actualCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
        assertNull(actualCompilerRecentChange);
        
        List actualCompilerCodeChangeHandlers = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualCompilerCodeChangeHandlers);
        
        Object expectedTypeSystem = getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem");
        Object actualTypeSystem = getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem");
        TightenTypes actualTypeSystemTt = ((TightenTypes) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "tt"));
        assertNull(actualTypeSystemTt);
        
        int expectedTypeSystemNextUniqueId = ((Integer) getFieldValue(expectedTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId"));
        int actualTypeSystemNextUniqueId = ((Integer) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "nextUniqueId"));
        assertEquals(expectedTypeSystemNextUniqueId, actualTypeSystemNextUniqueId);
        
        CodingConvention actualTypeSystemCodingConvention = ((CodingConvention) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "codingConvention"));
        assertNull(actualTypeSystemCodingConvention);
        
        Set expectedTypeSystemInvalidatingTypes = ((Set) getFieldValue(expectedTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes"));
        Set actualTypeSystemInvalidatingTypes = ((Set) getFieldValue(actualTypeSystem, "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem", "invalidatingTypes"));
        assertTrue(deepEquals(expectedTypeSystemInvalidatingTypes, actualTypeSystemInvalidatingTypes));
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testForConcreteTypeSystem_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:265) */
        DisambiguateProperties.forConcreteTypeSystem(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes)}
     */
    @Test
    public void testForConcreteTypeSystemThrowsNPE() {
        TightenTypes tightenTypes = new TightenTypes(null);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:265) */
        DisambiguateProperties.forConcreteTypeSystem(null, tightenTypes);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addInvalidatingType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: type = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testAddInvalidatingType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:294) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class voidTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method addInvalidatingTypeMethod = disambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", voidTypeType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[1];
        addInvalidatingTypeMethodArguments[0] = voidType;
        try {
            addInvalidatingTypeMethod.invoke(disambiguateProperties, addInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testAddInvalidatingType_ThrowNullPointerException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:294) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method addInvalidatingTypeMethod = disambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", jSTypeType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[1];
        addInvalidatingTypeMethodArguments[0] = ((Object) null);
        try {
            addInvalidatingTypeMethod.invoke(disambiguateProperties, addInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getProperty(java.lang.String)}
 * @utbot.executesCondition {@code (!properties.containsKey(name)): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return properties.get(name);}
 *  */
    @Test
    public void testGetProperty_PropertiesContainsKey() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        Object actual = disambiguateProperties.getProperty(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !properties.containsKey(name)
 *  */
    @Test
    public void testGetProperty_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.getProperty(DisambiguateProperties.java:312) */
        disambiguateProperties.getProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addInvalidatingType(mis.typeA);
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        VoidType typeA = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeA, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeMismatch, "com.google.javascript.jscomp.TypeValidator$TypeMismatch", "typeA", typeA);
        mismatches.add(typeMismatch);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:294)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:280) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addInvalidatingType(mis.typeA);
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        UnionType typeA = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        LinkedHashSet alternates = new LinkedHashSet();
        setField(typeA, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeA, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeMismatch, "com.google.javascript.jscomp.TypeValidator$TypeMismatch", "typeA", typeA);
        mismatches.add(typeMismatch);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:215)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:294)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:280) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeValidator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:279) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:279) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:279) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.DisambiguateProperties.TypeSystem#getRootScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticScope<T> scope = typeSystem.getRootScope();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:284) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addInvalidatingType(mis.typeA);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:280) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addInvalidatingType(mis.typeA);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_5() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        mismatches.add(typeMismatch);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:294)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:280) */
        disambiguateProperties.process(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields902319671481800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields902319671481800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass902319671488600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields902319671481800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass902319671488600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields902319675696000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields902319675696000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass902319675700100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields902319675696000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass902319675700100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

