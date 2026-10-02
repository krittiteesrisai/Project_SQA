package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.graph.UnionFind;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import java.util.ArrayList;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplatizedType;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.StaticScope;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyMap;

public final class com_google_javascript_jscomp_DisambiguatePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.getProperty
    
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
            com.google.javascript.jscomp.DisambiguateProperties.getProperty(DisambiguateProperties.java:363) */
        disambiguateProperties.getProperty(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String)
    
    @Test
    public void testGetProperty1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        Object property = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        properties.put(string, property);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        Object actual = disambiguateProperties.getProperty(string);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "name"));
        assertNull(actualName);
        
        UnionFind actualTypes = ((UnionFind) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "types"));
        assertNull(actualTypes);
        
        Set actualTypesToSkip = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "typesToSkip"));
        assertNull(actualTypesToSkip);
        
        boolean actualSkipRenaming = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "skipRenaming"));
        assertFalse(actualSkipRenaming);
        
        Set actualRenameNodes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "renameNodes"));
        assertNull(actualRenameNodes);
        
        Map actualRootTypes = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "rootTypes"));
        assertNull(actualRootTypes);
        
    }
    
    @Test
    public void testGetProperty2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        String string = "";
        
        Object actual = disambiguateProperties.getProperty(string);
        
        Object expected = createInstance("com.google.javascript.jscomp.DisambiguateProperties$Property");
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "name", string);
        HashSet typesToSkip = new HashSet();
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "typesToSkip", typesToSkip);
        HashSet renameNodes = new HashSet();
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "renameNodes", renameNodes);
        HashMap rootTypes = new HashMap();
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "rootTypes", rootTypes);
        setField(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "this$0", disambiguateProperties);
        
        String expectedName = ((String) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "name"));
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "name"));
        assertEquals(expectedName, actualName);
        
        UnionFind actualTypes = ((UnionFind) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "types"));
        assertNull(actualTypes);
        
        Set expectedTypesToSkip = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "typesToSkip"));
        Set actualTypesToSkip = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "typesToSkip"));
        assertTrue(deepEquals(expectedTypesToSkip, actualTypesToSkip));
        
        boolean actualSkipRenaming = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "skipRenaming"));
        assertFalse(actualSkipRenaming);
        
        Set expectedRenameNodes = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "renameNodes"));
        Set actualRenameNodes = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "renameNodes"));
        assertTrue(deepEquals(expectedRenameNodes, actualRenameNodes));
        
        Map expectedRootTypes = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.DisambiguateProperties$Property", "rootTypes"));
        Map actualRootTypes = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DisambiguateProperties$Property", "rootTypes"));
        assertTrue(deepEquals(expectedRootTypes, actualRootTypes));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1056)
            com.google.javascript.jscomp.TypeValidator.<init>(TypeValidator.java:141)
            com.google.javascript.jscomp.Compiler.getTypeValidator(Compiler.java:1280)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:318) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:317) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:318) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED): True}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addInvalidatingType(mis.typeA, mis.src);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
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
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:319) */
        disambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED): True}
 * @utbot.iterates iterate the loop {@code for(TypeMismatch mis: compiler.getTypeValidator().getMismatches())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addInvalidatingType(mis.typeA, mis.src);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        JSError src = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(typeMismatch, "com.google.javascript.jscomp.TypeValidator$TypeMismatch", "src", src);
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
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:341)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:319) */
        disambiguateProperties.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        disambiguateProperties.process(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType1 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[30] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:129)
            com.google.javascript.rhino.jstype.TemplatizedType.isNoType(TemplatizedType.java:51)
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:129)
            com.google.javascript.rhino.jstype.TemplatizedType.isNoType(TemplatizedType.java:51)
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:129)
            com.google.javascript.rhino.jstype.TemplateType.isNoType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:123)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1056)
            com.google.javascript.jscomp.TypeValidator.<init>(TypeValidator.java:141)
            com.google.javascript.jscomp.Compiler.getTypeValidator(Compiler.java:1280)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:318) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = disambiguatePropertiesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(disambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[30] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:129)
            com.google.javascript.rhino.jstype.TemplateType.isNoType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:129)
            com.google.javascript.rhino.jstype.TemplateType.isNoType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:123)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1056)
            com.google.javascript.jscomp.TypeValidator.<init>(TypeValidator.java:141)
            com.google.javascript.jscomp.Compiler.getTypeValidator(Compiler.java:1280)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:318) */
        disambiguateProperties.process(null, null);
    }
    
    @Test
    public void testProcess3() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        UnionType typeA = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(typeA, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(typeMismatch, "com.google.javascript.jscomp.TypeValidator$TypeMismatch", "typeA", typeA);
        mismatches.add(typeMismatch);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:306)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:318)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:229)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:341)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:319) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = disambiguatePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(disambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess4() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        TypeValidator.TypeMismatch typeMismatch = ((TypeValidator.TypeMismatch) createInstance("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        VoidType typeA = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typeA, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeMismatch, "com.google.javascript.jscomp.TypeValidator$TypeMismatch", "typeA", typeA);
        mismatches.add(typeMismatch);
        mismatches.add(null);
        mismatches.add(null);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:341)
            com.google.javascript.jscomp.DisambiguateProperties.process(DisambiguateProperties.java:319) */
        disambiguateProperties.process(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess5() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ArrayList mismatches = new ArrayList();
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = disambiguatePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(disambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.recordInvalidationError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method recordInvalidationError(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#recordInvalidationError(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (!t.isObject()): False}
 * @utbot.executesCondition {@code (invalidationMap != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isObject()}
 *  */
    @Test
    public void testRecordInvalidationError_InvalidationMapEqualsNull() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnionType primitiveType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(primitiveType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method recordInvalidationErrorMethod = disambiguatePropertiesClazz.getDeclaredMethod("recordInvalidationError", enumElementTypeType, jSErrorType);
        recordInvalidationErrorMethod.setAccessible(true);
        java.lang.Object[] recordInvalidationErrorMethodArguments = new java.lang.Object[2];
        recordInvalidationErrorMethodArguments[0] = enumElementType;
        recordInvalidationErrorMethodArguments[1] = ((Object) null);
        recordInvalidationErrorMethod.invoke(disambiguateProperties, recordInvalidationErrorMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordInvalidationError(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#recordInvalidationError(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.isObject()
 *  */
    @Test
    public void testRecordInvalidationError_ThrowNullPointerException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.recordInvalidationError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.recordInvalidationError(DisambiguateProperties.java:329) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method recordInvalidationErrorMethod = disambiguatePropertiesClazz.getDeclaredMethod("recordInvalidationError", jSTypeType, jSErrorType);
        recordInvalidationErrorMethod.setAccessible(true);
        java.lang.Object[] recordInvalidationErrorMethodArguments = new java.lang.Object[2];
        recordInvalidationErrorMethodArguments[0] = ((Object) null);
        recordInvalidationErrorMethodArguments[1] = ((Object) null);
        try {
            recordInvalidationErrorMethod.invoke(disambiguateProperties, recordInvalidationErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testForConcreteTypeSystem_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:294) */
        DisambiguateProperties.forConcreteTypeSystem(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testForConcreteTypeSystem_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.<init>(DisambiguateProperties.java:307)
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:294) */
        DisambiguateProperties.forConcreteTypeSystem(compiler, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testForConcreteTypeSystem_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.<init>(DisambiguateProperties.java:307)
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:294) */
        DisambiguateProperties.forConcreteTypeSystem(compiler, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes, java.util.Map)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.TightenTypes,java.util.Map)}
     */
    @Test
    public void testForConcreteTypeSystemThrowsNPE() {
        TightenTypes tightenTypes = new TightenTypes(null);
        Map map = emptyMap();
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(DisambiguateProperties.java:294) */
        DisambiguateProperties.forConcreteTypeSystem(null, tightenTypes, map);
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
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_1() throws Exception  {
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
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return typeSystem.getTypeWithProperty(field, type);}
 *  */
    @Test
    public void testGetTypeWithProperty_ReturnTypeSystemGetTypeWithProperty_2() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        String string = "";
        ConcreteType.ConcreteInstanceType concreteInstanceType = ((ConcreteType.ConcreteInstanceType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType"));
        FunctionType instanceType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "instanceType", instanceType);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "scope", scope);
        
        Object actual = disambiguateProperties.getTypeWithProperty(string, concreteInstanceType);
        
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
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        byte[] byteArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.ConcreteType ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.ConcreteType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem.getTypeWithProperty(DisambiguateProperties.java:962)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:371) */
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
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        byte[] byteArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.JSType ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.JSType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.getTypeWithProperty(DisambiguateProperties.java:748)
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:371) */
        disambiguateProperties.getTypeWithProperty(null, byteArray);
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
            com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(DisambiguateProperties.java:371) */
        disambiguateProperties.getTypeWithProperty(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTypeWithProperty(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.DisambiguateProperties.TypeSystem#getTypeWithProperty(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetTypeWithProperty_ThrowUnsupportedOperationException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        ConcreteType.ConcreteInstanceType concreteInstanceType = ((ConcreteType.ConcreteInstanceType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType"));
        LinkedFlowScope scope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "scope", scope);
        
        disambiguateProperties.getTypeWithProperty(null, concreteInstanceType);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTypeWithProperty(java.lang.String, java.lang.Object)
    
    @Test
    public void testGetTypeWithProperty1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        Object typeSystem = createInstance("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem");
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "typeSystem", typeSystem);
        ConcreteType.ConcreteInstanceType concreteInstanceType = ((ConcreteType.ConcreteInstanceType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType"));
        TightenTypes factory = ((TightenTypes) createInstance("com.google.javascript.jscomp.TightenTypes"));
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "factory", factory);
        FunctionType instanceType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(instanceType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "instanceType", instanceType);
        
        StaticScope initialConcreteInstanceTypeScope = ((StaticScope) getFieldValue(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "scope"));
        
        Object actual = disambiguateProperties.getTypeWithProperty(null, concreteInstanceType);
        
        assertNull(actual);
        
        StaticScope finalConcreteInstanceTypeScope = ((StaticScope) getFieldValue(concreteInstanceType, "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType", "scope"));
        
        assertFalse(initialConcreteInstanceTypeScope == finalConcreteInstanceTypeScope);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting
    
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
            com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting(DisambiguateProperties.java:656) */
        disambiguateProperties.getRenamedTypesForTesting();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addInvalidatingType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:341) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class voidTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method addInvalidatingTypeMethod = disambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", voidTypeType, jSErrorType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[2];
        addInvalidatingTypeMethodArguments[0] = voidType;
        addInvalidatingTypeMethodArguments[1] = ((Object) null);
        try {
            addInvalidatingTypeMethod.invoke(disambiguateProperties, addInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testAddInvalidatingType_ThrowNullPointerException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(DisambiguateProperties.java:341) */
        Class disambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method addInvalidatingTypeMethod = disambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", jSTypeType, jSErrorType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[2];
        addInvalidatingTypeMethodArguments[0] = ((Object) null);
        addInvalidatingTypeMethodArguments[1] = ((Object) null);
        try {
            addInvalidatingTypeMethod.invoke(disambiguateProperties, addInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new DisambiguateProperties<JSType>(compiler, new JSTypeSystem(compiler), propertiesToErrorFor);
 *  */
    @Test
    public void testForJSTypeSystem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.<init>(DisambiguateProperties.java:755)
            com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(DisambiguateProperties.java:286) */
        DisambiguateProperties.forJSTypeSystem(compiler, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler, java.util.Map)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler,java.util.Map)}
     */
    @Test
    public void testForJSTypeSystemThrowsNPE() {
        HashMap hashMap = new HashMap();
        CheckLevel checkLevel = CheckLevel.ERROR;
        hashMap.put("\n\t\r", checkLevel);
        CheckLevel checkLevel1 = CheckLevel.OFF;
        hashMap.put("10", checkLevel1);
        hashMap.put("#$\\\"'", checkLevel);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem.<init>(DisambiguateProperties.java:753)
            com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(DisambiguateProperties.java:286) */
        DisambiguateProperties.forJSTypeSystem(null, hashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.DisambiguateProperties.renameProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method renameProperties()
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#renameProperties()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testRenameProperties_ThrowNullPointerException() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:578) */
        disambiguateProperties.renameProperties();
    }
    
    /**
    @utbot.classUnderTest {@link DisambiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.DisambiguateProperties#renameProperties()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(Property prop: properties.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.shouldRename()
 *  */
    @Test
    public void testRenameProperties_ThrowNullPointerException_1() throws Exception  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        properties.put(string, null);
        setField(disambiguateProperties, "com.google.javascript.jscomp.DisambiguateProperties", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.renameProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.renameProperties(DisambiguateProperties.java:579) */
        disambiguateProperties.renameProperties();
    }
    ///endregion
    
    ///region Errors report for renameProperties
    
    public void testRenameProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Set<T> set: types.allEquivalenceClasses())
 *  */
    @Test
    public void testBuildPropNames_ThrowNullPointerException() throws Throwable  {
        DisambiguateProperties disambiguateProperties = ((DisambiguateProperties) createInstance("com.google.javascript.jscomp.DisambiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.DisambiguateProperties.buildPropNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(DisambiguateProperties.java:629) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields905293048262500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields905293048262500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass905293048272400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905293048262500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905293048272400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields905293048848300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905293048848300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905293048855000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905293048848300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905293048855000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

