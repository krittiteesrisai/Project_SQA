package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.SimpleErrorReporter;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.util.HashSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.TreeMap;
import java.util.List;
import java.util.HashMap;
import com.google.common.collect.LinkedHashMultimap;
import java.util.LinkedHashMap;
import com.google.common.collect.ArrayListMultimap;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_rhino_jstype_UnionTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hashCode()}
 * @utbot.returnsFrom {@code return this.hashcode;}
 *  */
    @Test
    public void testHashCode_ReturnThisHashcode() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -255);
        
        int actual = unionType.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.contains
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#contains(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alt: alternates)
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.contains] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.contains(UnionType.java:395) */
        unionType.contains(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method contains(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#contains(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testContainsThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.contains] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:492)
            com.google.javascript.rhino.jstype.UnionType.contains(UnionType.java:396) */
        unionType.contains(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.testForEquality
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTestForEquality_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        TernaryValue actual = unionType.testForEquality(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testTestForEquality_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.testForEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.testForEquality(UnionType.java:230) */
        unionType.testForEquality(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testTestForEquality() throws ClassNotFoundException, IllegalAccessException  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        TernaryValue actual = unionType.testForEquality(null);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        Collection actualAlternates = actual.alternates;
        assertNull(actualAlternates);
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        ParameterizedType target = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        Collection actualAlternates = actual.alternates;
        assertNull(actualAlternates);
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        ModificationVisitor modificationVisitor = new ModificationVisitor(null);
        
        UnionType actual = ((UnionType) unionType.visit(modificationVisitor));
        
        Collection unionTypeAlternates = unionType.alternates;
        Collection actualAlternates = actual.alternates;
        assertTrue(deepEquals(unionTypeAlternates, actualAlternates));
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.Visitor#caseUnionType(com.google.javascript.rhino.jstype.UnionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseUnionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:542) */
        unionType.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.Visitor#caseUnionType(com.google.javascript.rhino.jstype.UnionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:541)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseUnionType(SemanticReverseAbstractInterpreter.java:532)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseUnionType(SemanticReverseAbstractInterpreter.java:503)
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:542) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(unionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.hasProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testHasProperty_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasProperty(UnionType.java:358) */
        unionType.hasProperty(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasProperty(java.lang.String)}
     */
    @Test
    public void testHasPropertyReturnsFalseWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        boolean actual = unionType.hasProperty("#$\\\"'\t");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isObject()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isObject()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsObject_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isObject();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isObject()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isObject()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testIsObject_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:378) */
        unionType.isObject();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isObject()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType alternate: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !alternate.isObject()
 *  */
    @Test
    public void testIsObject_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:379) */
        unionType.isObject();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isObject()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isObject()}
     */
    @Test
    public void testIsObjectReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.isObject();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isDict
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDict()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isDict()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDict_IterableIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isDict();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDict()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isDict()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType typ: getAlternates())
 *  */
    @Test
    public void testIsDict_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isDict] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isDict(UnionType.java:281) */
        unionType.isDict();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDict()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isDict()}
     */
    @Test
    public void testIsDictReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.isDict();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.findPropertyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#findPropertyType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return propertyType;}
 *  */
    @Test
    public void testFindPropertyType_IterableIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        JSType actual = unionType.findPropertyType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#findPropertyType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: getAlternates())
 *  */
    @Test
    public void testFindPropertyType_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:166) */
        unionType.findPropertyType(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findPropertyType(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#findPropertyType(java.lang.String)}
     */
    @Test
    public void testFindPropertyTypeWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        JSType actual = unionType.findPropertyType("#$\\\"'\t");
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findPropertyType(java.lang.String)
    
    @Test
    public void testFindPropertyType1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:168) */
        unionType.findPropertyType(null);
    }
    
    @Test
    public void testFindPropertyType2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(functionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:347)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:169)
            com.google.javascript.rhino.jstype.FunctionType.hasProperty(FunctionType.java:66)
            com.google.javascript.rhino.jstype.ObjectType.findPropertyType(ObjectType.java:394)
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:172) */
        unionType.findPropertyType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.toMaybeUnionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toMaybeUnionType()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#toMaybeUnionType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testToMaybeUnionType_Return() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        UnionType actual = unionType.toMaybeUnionType();
        
        Collection actualAlternates = actual.alternates;
        assertNull(actualAlternates);
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isUnknownType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnknownType()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsUnknownType_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isUnknownType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isUnknownType()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnknownType()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:261) */
        unionType.isUnknownType();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnknownType()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType t: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isUnknownType()
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:262) */
        unionType.isUnknownType();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnknownType()}
     */
    @Test
    public void testIsUnknownTypeReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.isUnknownType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    @Test
    public void testIsUnknownType1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        alternates.add(unresolvedTypeExpression);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isUnknownType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.canAssignTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return canAssign;}
 *  */
    @Test
    public void testCanAssignTo_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.canAssignTo(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testCanAssignTo_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:190) */
        unionType.canAssignTo(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testCanAssignToThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1202)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1193)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:712)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:194) */
        unionType.canAssignTo(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testCanAssignTo1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:191) */
        unionType.canAssignTo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getAlternates
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAlternates()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.returnsFrom {@code return alternates;}
 *  */
    @Test
    public void testGetAlternates_ReturnAlternates() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        Iterable actual = unionType.getAlternates();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canBeCalled()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCanBeCalled_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.canBeCalled();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canBeCalled()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testCanBeCalled_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canBeCalled] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canBeCalled(UnionType.java:201) */
        unionType.canBeCalled();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canBeCalled()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType t: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.canBeCalled()
 *  */
    @Test
    public void testCanBeCalled_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canBeCalled] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canBeCalled(UnionType.java:202) */
        unionType.canBeCalled();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canBeCalled()}
     */
    @Test
    public void testCanBeCalledReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.canBeCalled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canBeCalled()
    
    @Test(expected = StackOverflowError.class)
    public void testCanBeCalled1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        alternates.add(anonymousFunctionType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        unionType.canBeCalled();
    }
    
    @Test
    public void testCanBeCalled2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        alternates.add(indexedType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canBeCalled] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.canBeCalled(ProxyObjectType.java:122)
            com.google.javascript.rhino.jstype.UnionType.canBeCalled(UnionType.java:202) */
        unionType.canBeCalled();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.autobox
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method autobox()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#autobox()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testAutobox_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.autobox] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.autobox(UnionType.java:212) */
        unionType.autobox();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method autobox()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#autobox()}
     */
    @Test
    public void testAutobox() throws Exception  {
    /* This block of code is 1380 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        AllType actual = ((AllType) unionType.autobox());
        
        AllType expected = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNamesType = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNamesType);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor1, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNamesType);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor1, setExtendedInterfacesMethodArguments);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor2, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor2, setExtendedInterfacesMethodArguments1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(last3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType, setExtendedInterfacesMethodArguments2);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType1, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType1, setExtendedInterfacesMethodArguments3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType2, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType2, setExtendedInterfacesMethodArguments4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType3, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType3, setExtendedInterfacesMethodArguments5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType4, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType4, setExtendedInterfacesMethodArguments6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments7 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments7[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType5, setImplementedInterfacesMethodArguments7);
        java.lang.Object[] setExtendedInterfacesMethodArguments7 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments7[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType5, setExtendedInterfacesMethodArguments7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments8 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments8[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType6, setImplementedInterfacesMethodArguments8);
        java.lang.Object[] setExtendedInterfacesMethodArguments8 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments8[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType6, setExtendedInterfacesMethodArguments8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first4, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments9 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments9[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis7, setImplementedInterfacesMethodArguments9);
        java.lang.Object[] setExtendedInterfacesMethodArguments9 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments9[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis7, setExtendedInterfacesMethodArguments9);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments10 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments10[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis6, setImplementedInterfacesMethodArguments10);
        java.lang.Object[] setExtendedInterfacesMethodArguments10 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments10[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis6, setExtendedInterfacesMethodArguments10);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        java.lang.Object[] setImplementedInterfacesMethodArguments11 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments11[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments11);
        java.lang.Object[] setExtendedInterfacesMethodArguments11 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments11[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments11);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        java.lang.Object[] setImplementedInterfacesMethodArguments12 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments12[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor4, setImplementedInterfacesMethodArguments12);
        java.lang.Object[] setExtendedInterfacesMethodArguments12 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments12[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor4, setExtendedInterfacesMethodArguments12);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first7, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType1);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        java.lang.Object[] setImplementedInterfacesMethodArguments13 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments13[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments13);
        java.lang.Object[] setExtendedInterfacesMethodArguments13 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments13[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments13);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        java.lang.Object[] setImplementedInterfacesMethodArguments14 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments14[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments14);
        java.lang.Object[] setExtendedInterfacesMethodArguments14 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments14[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments14);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className17 = "RegExp";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        java.lang.Object[] setImplementedInterfacesMethodArguments15 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments15[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments15);
        java.lang.Object[] setExtendedInterfacesMethodArguments15 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments15[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments15);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className18 = "String";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType3);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className19 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType2);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType3);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) returnType8);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(typeOfThis9);
        alternates1.add(returnType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 198082348);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(instanceObjectType3);
        alternates2.add(numberType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1240910634);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType2);
        nativeTypes[42] = ((JSType) expected);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        java.lang.Object[] setImplementedInterfacesMethodArguments16 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments16[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noType, setImplementedInterfacesMethodArguments16);
        java.lang.Object[] setExtendedInterfacesMethodArguments16 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments16[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noType, setExtendedInterfacesMethodArguments16);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        java.lang.Object[] setImplementedInterfacesMethodArguments17 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments17[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noResolvedType, setImplementedInterfacesMethodArguments17);
        java.lang.Object[] setExtendedInterfacesMethodArguments17 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments17[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noResolvedType, setExtendedInterfacesMethodArguments17);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        java.lang.Object[] setImplementedInterfacesMethodArguments18 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments18[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor5, setImplementedInterfacesMethodArguments18);
        java.lang.Object[] setExtendedInterfacesMethodArguments18 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments18[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor5, setExtendedInterfacesMethodArguments18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments19 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments19[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments19);
        java.lang.Object[] setExtendedInterfacesMethodArguments19 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments19[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties41 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments20 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments20[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments20);
        java.lang.Object[] setExtendedInterfacesMethodArguments20 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments20[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties42 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments21 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments21[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments21);
        java.lang.Object[] setExtendedInterfacesMethodArguments21 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments21[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments21);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties43 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType6);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(nullType);
        alternates3.add(voidType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 97753836);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(implicitPrototypeFallback3);
        alternates4.add(numberType);
        alternates4.add(returnType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -2089320952);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(implicitPrototypeFallback3);
        alternates5.add(numberType);
        alternates5.add(returnType);
        alternates5.add(booleanType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -173871764);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates6 = new ArrayList();
        alternates6.add(numberType);
        alternates6.add(returnType);
        alternates6.add(booleanType);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -689042935);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates7 = new ArrayList();
        alternates7.add(numberType);
        alternates7.add(returnType);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates7);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 2050480587);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[55] = ((JSType) unionType7);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates8 = new ArrayList();
        alternates8.add(functionType1);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates8);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType1);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap", multimapHeaderEntry);
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap", multimapHeaderEntry);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedRegistryInterfaceToImplementorsValueSetCapacity, actualRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "key");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "value");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue);
        
        int expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        int actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        assertEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash, actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "nextInValueSetHashRow");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap));
        
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, actualRegistryInterfaceToImplementorsMultimapHeaderEntry));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        Map expectedRegistryTemplateTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualRegistryTemplateTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedRegistryTemplateTypes, actualRegistryTemplateTypes));
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method autobox()
    
    @Test
    public void testAutobox1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.autobox] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.autobox(UnionType.java:215) */
        unionType.autobox();
    }
    
    @Test
    public void testAutobox2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.autobox] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.autobox(UnionType.java:213) */
        unionType.autobox();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !that.isUnknownType() && !that.isUnionType()
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:291) */
        unionType.getLeastSupertype(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetLeastSupertype1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        UnknownType unknownType = new UnknownType(null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:898)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:299) */
        unionType.getLeastSupertype(unknownType);
    }
    
    @Test
    public void testGetLeastSupertype2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        UnknownType unknownType = new UnknownType(null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:262)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:525)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:492)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:895)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:299) */
        unionType.getLeastSupertype(unknownType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.meet
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method meet(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#meet(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testMeet_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.meet] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.meet(UnionType.java:304) */
        unionType.meet(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method meet(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#meet(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testMeetThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.meet] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1202)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1193)
            com.google.javascript.rhino.jstype.UnionType.meet(UnionType.java:305) */
        unionType.meet(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method meet(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMeet1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.meet] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.meet(UnionType.java:310) */
        unionType.meet(null);
    }
    
    @Test
    public void testMeet2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.meet] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.meet(UnionType.java:305) */
        unionType.meet(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.hasAlternate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAlternate(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAlternate(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAlternate_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method hasAlternateMethod = unionTypeClazz.getDeclaredMethod("hasAlternate", jSTypeType, booleanType);
        hasAlternateMethod.setAccessible(true);
        java.lang.Object[] hasAlternateMethodArguments = new java.lang.Object[2];
        hasAlternateMethodArguments[0] = ((Object) null);
        hasAlternateMethodArguments[1] = false;
        boolean actual = ((Boolean) hasAlternateMethod.invoke(unionType, hasAlternateMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAlternate(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAlternate(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testHasAlternate_ThrowNullPointerException() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasAlternate] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasAlternate(UnionType.java:348) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method hasAlternateMethod = unionTypeClazz.getDeclaredMethod("hasAlternate", jSTypeType, booleanType);
        hasAlternateMethod.setAccessible(true);
        java.lang.Object[] hasAlternateMethodArguments = new java.lang.Object[2];
        hasAlternateMethodArguments[0] = ((Object) null);
        hasAlternateMethodArguments[1] = false;
        try {
            hasAlternateMethod.invoke(unionType, hasAlternateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasAlternate(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAlternate(com.google.javascript.rhino.jstype.JSType,boolean)}
     */
    @Test
    public void testHasAlternateThrowsNPE() throws Throwable  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasAlternate] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.UnionType.hasAlternate(UnionType.java:349) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method hasAlternateMethod = unionTypeClazz.getDeclaredMethod("hasAlternate", jSTypeType, booleanType);
        hasAlternateMethod.setAccessible(true);
        java.lang.Object[] hasAlternateMethodArguments = new java.lang.Object[2];
        hasAlternateMethodArguments[0] = ((Object) null);
        hasAlternateMethodArguments[1] = false;
        try {
            hasAlternateMethod.invoke(unionType, hasAlternateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasAlternate(com.google.javascript.rhino.jstype.JSType, boolean)
    
    @Test
    public void testHasAlternate1() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasAlternate] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasAlternate(UnionType.java:349) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class proxyObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method hasAlternateMethod = unionTypeClazz.getDeclaredMethod("hasAlternate", proxyObjectTypeType, booleanType);
        hasAlternateMethod.setAccessible(true);
        java.lang.Object[] hasAlternateMethodArguments = new java.lang.Object[2];
        hasAlternateMethodArguments[0] = proxyObjectType;
        hasAlternateMethodArguments[1] = false;
        try {
            hasAlternateMethod.invoke(unionType, hasAlternateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isStruct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isStruct()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isStruct()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsStruct_IterableIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isStruct();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isStruct()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isStruct()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType typ: getAlternates())
 *  */
    @Test
    public void testIsStruct_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isStruct] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isStruct(UnionType.java:271) */
        unionType.isStruct();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isStruct()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isStruct()}
     */
    @Test
    public void testIsStructReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.isStruct();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isStruct()
    
    @Test
    public void testIsStruct1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isStruct] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isStruct(UnionType.java:272) */
        unionType.isStruct();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.collapseUnion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collapseUnion()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#collapseUnion()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return currentCommonSuper;}
 *  */
    @Test
    public void testCollapseUnion_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        JSType actual = unionType.collapseUnion();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collapseUnion()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#collapseUnion()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType a: alternates)
 *  */
    @Test
    public void testCollapseUnion_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.collapseUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.collapseUnion(UnionType.java:586) */
        unionType.collapseUnion();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collapseUnion()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#collapseUnion()}
     */
    @Test
    public void testCollapseUnion() throws Exception  {
    /* This block of code is 1380 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        AllType actual = ((AllType) unionType.collapseUnion());
        
        AllType expected = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNamesType = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNamesType);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor1, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNamesType);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor1, setExtendedInterfacesMethodArguments);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor2, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor2, setExtendedInterfacesMethodArguments1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(last3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType, setExtendedInterfacesMethodArguments2);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType1, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType1, setExtendedInterfacesMethodArguments3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType2, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType2, setExtendedInterfacesMethodArguments4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType3, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType3, setExtendedInterfacesMethodArguments5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType4, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType4, setExtendedInterfacesMethodArguments6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments7 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments7[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType5, setImplementedInterfacesMethodArguments7);
        java.lang.Object[] setExtendedInterfacesMethodArguments7 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments7[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType5, setExtendedInterfacesMethodArguments7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments8 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments8[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType6, setImplementedInterfacesMethodArguments8);
        java.lang.Object[] setExtendedInterfacesMethodArguments8 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments8[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType6, setExtendedInterfacesMethodArguments8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first4, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments9 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments9[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis7, setImplementedInterfacesMethodArguments9);
        java.lang.Object[] setExtendedInterfacesMethodArguments9 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments9[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis7, setExtendedInterfacesMethodArguments9);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments10 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments10[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis6, setImplementedInterfacesMethodArguments10);
        java.lang.Object[] setExtendedInterfacesMethodArguments10 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments10[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis6, setExtendedInterfacesMethodArguments10);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        java.lang.Object[] setImplementedInterfacesMethodArguments11 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments11[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments11);
        java.lang.Object[] setExtendedInterfacesMethodArguments11 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments11[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments11);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        java.lang.Object[] setImplementedInterfacesMethodArguments12 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments12[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor4, setImplementedInterfacesMethodArguments12);
        java.lang.Object[] setExtendedInterfacesMethodArguments12 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments12[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor4, setExtendedInterfacesMethodArguments12);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first7, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType1);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        java.lang.Object[] setImplementedInterfacesMethodArguments13 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments13[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments13);
        java.lang.Object[] setExtendedInterfacesMethodArguments13 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments13[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments13);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        java.lang.Object[] setImplementedInterfacesMethodArguments14 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments14[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments14);
        java.lang.Object[] setExtendedInterfacesMethodArguments14 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments14[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments14);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className17 = "RegExp";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        java.lang.Object[] setImplementedInterfacesMethodArguments15 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments15[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments15);
        java.lang.Object[] setExtendedInterfacesMethodArguments15 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments15[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments15);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className18 = "String";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType3);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className19 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType2);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType3);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) returnType8);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(typeOfThis9);
        alternates1.add(returnType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1537435423);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(instanceObjectType3);
        alternates2.add(numberType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 61912948);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType2);
        nativeTypes[42] = ((JSType) expected);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        java.lang.Object[] setImplementedInterfacesMethodArguments16 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments16[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noType, setImplementedInterfacesMethodArguments16);
        java.lang.Object[] setExtendedInterfacesMethodArguments16 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments16[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noType, setExtendedInterfacesMethodArguments16);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        java.lang.Object[] setImplementedInterfacesMethodArguments17 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments17[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noResolvedType, setImplementedInterfacesMethodArguments17);
        java.lang.Object[] setExtendedInterfacesMethodArguments17 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments17[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noResolvedType, setExtendedInterfacesMethodArguments17);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        java.lang.Object[] setImplementedInterfacesMethodArguments18 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments18[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor5, setImplementedInterfacesMethodArguments18);
        java.lang.Object[] setExtendedInterfacesMethodArguments18 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments18[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor5, setExtendedInterfacesMethodArguments18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments19 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments19[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments19);
        java.lang.Object[] setExtendedInterfacesMethodArguments19 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments19[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties41 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments20 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments20[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments20);
        java.lang.Object[] setExtendedInterfacesMethodArguments20 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments20[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties42 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments21 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments21[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments21);
        java.lang.Object[] setExtendedInterfacesMethodArguments21 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments21[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments21);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties43 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType6);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(nullType);
        alternates3.add(voidType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -27402736);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(implicitPrototypeFallback3);
        alternates4.add(numberType);
        alternates4.add(returnType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1355809521);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(implicitPrototypeFallback3);
        alternates5.add(numberType);
        alternates5.add(returnType);
        alternates5.add(booleanType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -294904159);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates6 = new ArrayList();
        alternates6.add(numberType);
        alternates6.add(returnType);
        alternates6.add(booleanType);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -810075330);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates7 = new ArrayList();
        alternates7.add(numberType);
        alternates7.add(returnType);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates7);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1200643764);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[55] = ((JSType) unionType7);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates8 = new ArrayList();
        alternates8.add(functionType1);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates8);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType1);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap", multimapHeaderEntry);
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap", multimapHeaderEntry);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedRegistryInterfaceToImplementorsValueSetCapacity, actualRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "key");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "value");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue);
        
        int expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        int actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        assertEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash, actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "nextInValueSetHashRow");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap));
        
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, actualRegistryInterfaceToImplementorsMultimapHeaderEntry));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        Map expectedRegistryTemplateTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualRegistryTemplateTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedRegistryTemplateTypes, actualRegistryTemplateTypes));
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method collapseUnion()
    
    @Test
    public void testCollapseUnion1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.collapseUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.collapseUnion(UnionType.java:587) */
        unionType.collapseUnion();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.toStringHelper
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toStringHelper(boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#toStringHelper(boolean)}
     */
    @Test
    public void testToStringHelper() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        String actual = unionType.toStringHelper(false);
        
        String expected = "(*)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        boolean actual = unionType.isSubtype(unknownType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: that.isUnknownType()
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:448) */
        unionType.isSubtype(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsSubtype1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype4() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType9 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType10 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnresolvedTypeExpression referencedType11 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = unionType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype5() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType5.setReferencedType(referencedType5);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        unionType.isSubtype(parameterizedType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype6() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType7.setReferencedType(referencedType7);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        unionType.isSubtype(parameterizedType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype7() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType5 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType8 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType9.setReferencedType(referencedType9);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        unionType.isSubtype(parameterizedType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#builder()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        NamedType resolveResult = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.resolveInternal(UnionType.java:551) */
        unionType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testResolveInternal() throws Exception  {
    /* This block of code is 1400 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        UnionType actual = ((UnionType) unionType.resolveInternal(simpleErrorReporter1, null));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(expected, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(expected, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult", expected);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNamesType = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNamesType);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor1, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNamesType);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor1, setExtendedInterfacesMethodArguments);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor2, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor2, setExtendedInterfacesMethodArguments1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(last3, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType, setExtendedInterfacesMethodArguments2);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType1, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType1, setExtendedInterfacesMethodArguments3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType2, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType2, setExtendedInterfacesMethodArguments4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType3, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType3, setExtendedInterfacesMethodArguments5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType4, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType4, setExtendedInterfacesMethodArguments6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments7 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments7[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType5, setImplementedInterfacesMethodArguments7);
        java.lang.Object[] setExtendedInterfacesMethodArguments7 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments7[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType5, setExtendedInterfacesMethodArguments7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments8 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments8[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType6, setImplementedInterfacesMethodArguments8);
        java.lang.Object[] setExtendedInterfacesMethodArguments8 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments8[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType6, setExtendedInterfacesMethodArguments8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first4, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments9 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments9[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis7, setImplementedInterfacesMethodArguments9);
        java.lang.Object[] setExtendedInterfacesMethodArguments9 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments9[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis7, setExtendedInterfacesMethodArguments9);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments10 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments10[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis6, setImplementedInterfacesMethodArguments10);
        java.lang.Object[] setExtendedInterfacesMethodArguments10 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments10[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis6, setExtendedInterfacesMethodArguments10);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        java.lang.Object[] setImplementedInterfacesMethodArguments11 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments11[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments11);
        java.lang.Object[] setExtendedInterfacesMethodArguments11 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments11[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments11);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        java.lang.Object[] setImplementedInterfacesMethodArguments12 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments12[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor4, setImplementedInterfacesMethodArguments12);
        java.lang.Object[] setExtendedInterfacesMethodArguments12 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments12[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor4, setExtendedInterfacesMethodArguments12);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first7, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType1);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        java.lang.Object[] setImplementedInterfacesMethodArguments13 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments13[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments13);
        java.lang.Object[] setExtendedInterfacesMethodArguments13 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments13[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments13);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        java.lang.Object[] setImplementedInterfacesMethodArguments14 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments14[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments14);
        java.lang.Object[] setExtendedInterfacesMethodArguments14 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments14[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments14);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className17 = "RegExp";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        java.lang.Object[] setImplementedInterfacesMethodArguments15 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments15[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments15);
        java.lang.Object[] setExtendedInterfacesMethodArguments15 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments15[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments15);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className18 = "String";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType3);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className19 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType2);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType3);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) returnType8);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(typeOfThis9);
        alternates1.add(returnType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1706384260);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(instanceObjectType3);
        alternates2.add(numberType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1568730618);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType2);
        AllType allType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(allType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[42] = ((JSType) allType3);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        java.lang.Object[] setImplementedInterfacesMethodArguments16 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments16[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noType, setImplementedInterfacesMethodArguments16);
        java.lang.Object[] setExtendedInterfacesMethodArguments16 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments16[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noType, setExtendedInterfacesMethodArguments16);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        java.lang.Object[] setImplementedInterfacesMethodArguments17 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments17[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noResolvedType, setImplementedInterfacesMethodArguments17);
        java.lang.Object[] setExtendedInterfacesMethodArguments17 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments17[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noResolvedType, setExtendedInterfacesMethodArguments17);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        java.lang.Object[] setImplementedInterfacesMethodArguments18 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments18[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor5, setImplementedInterfacesMethodArguments18);
        java.lang.Object[] setExtendedInterfacesMethodArguments18 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments18[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor5, setExtendedInterfacesMethodArguments18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments19 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments19[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments19);
        java.lang.Object[] setExtendedInterfacesMethodArguments19 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments19[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties41 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", allType3);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments20 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments20[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments20);
        java.lang.Object[] setExtendedInterfacesMethodArguments20 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments20[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties42 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType3);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments21 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments21[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments21);
        java.lang.Object[] setExtendedInterfacesMethodArguments21 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments21[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments21);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties43 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType6);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(nullType);
        alternates3.add(voidType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1519205800);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(implicitPrototypeFallback3);
        alternates4.add(numberType);
        alternates4.add(returnType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 991465872);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(implicitPrototypeFallback3);
        alternates5.add(numberType);
        alternates5.add(returnType);
        alternates5.add(booleanType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1513198366);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates6 = new ArrayList();
        alternates6.add(numberType);
        alternates6.add(returnType);
        alternates6.add(booleanType);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -2028369537);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates7 = new ArrayList();
        alternates7.add(numberType);
        alternates7.add(returnType);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates7);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 836300115);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[55] = ((JSType) unionType7);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates8 = new ArrayList();
        alternates8.add(functionType1);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates8);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType1);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap", multimapHeaderEntry);
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap", multimapHeaderEntry);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Collection expectedAlternates = expected.alternates;
        Collection actualAlternates = actual.alternates;
        assertTrue(deepEquals(expectedAlternates, actualAlternates));
        
        int expectedHashcode = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(expectedHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertTrue(actualResolved);
        
        JSType expectedResolveResult = ((JSType) getFieldValue(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedResolveResult, actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedRegistryInterfaceToImplementorsValueSetCapacity, actualRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "key");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "value");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue);
        
        int expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        int actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        assertEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash, actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "nextInValueSetHashRow");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap));
        
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, actualRegistryInterfaceToImplementorsMultimapHeaderEntry));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        Map expectedRegistryTemplateTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualRegistryTemplateTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedRegistryTemplateTypes, actualRegistryTemplateTypes));
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveInternal1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        UnionType actual = ((UnionType) unionType.resolveInternal(null, null));
        
        Collection unionTypeAlternates = unionType.alternates;
        Collection actualAlternates = actual.alternates;
        assertTrue(deepEquals(unionTypeAlternates, actualAlternates));
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertTrue(actualResolved);
        
        JSType unionTypeResolveResult = ((JSType) getFieldValue(unionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(unionTypeResolveResult, actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        boolean finalUnionTypeResolved = ((Boolean) getFieldValue(unionType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalUnionTypeResolved);
    }
    
    @Test
    public void testResolveInternal2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        alternates.add(noType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        UnionType actual = ((UnionType) unionType.resolveInternal(null, null));
        
        Collection unionTypeAlternates = unionType.alternates;
        Collection actualAlternates = actual.alternates;
        assertTrue(deepEquals(unionTypeAlternates, actualAlternates));
        
        int unionTypeHashcode = ((Integer) getFieldValue(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        int actualHashcode = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnionType", "hashcode"));
        assertEquals(unionTypeHashcode, actualHashcode);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertTrue(actualResolved);
        
        JSType unionTypeResolveResult = ((JSType) getFieldValue(unionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(unionTypeResolveResult, actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        boolean finalUnionTypeResolved = ((Boolean) getFieldValue(unionType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalUnionTypeResolved);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveInternal3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        NoObjectType resolveResult = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.resolveInternal(UnionType.java:552) */
        unionType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal4() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(anonymousFunctionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        IndexedType resolveResult = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1198)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.UnionType.resolveInternal(UnionType.java:552) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = unionTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoErrorReporterType, staticScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoErrorReporter;
        resolveInternalMethodArguments[1] = ((Object) null);
        try {
            resolveInternalMethod.invoke(unionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal5() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(anonymousFunctionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1198)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.UnionType.resolveInternal(UnionType.java:552) */
        unionType.resolveInternal(simpleErrorReporter, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.setValidator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValidator(com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#setValidator(com.google.common.base.Predicate)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType a: alternates)
 *  */
    @Test
    public void testSetValidator_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.setValidator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.setValidator(UnionType.java:576) */
        unionType.setValidator(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setValidator(com.google.common.base.Predicate)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#setValidator(com.google.common.base.Predicate)}
     */
    @Test
    public void testSetValidatorThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.setValidator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1316)
            com.google.javascript.rhino.jstype.UnionType.setValidator(UnionType.java:577) */
        unionType.setValidator(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setValidator(com.google.common.base.Predicate)
    
    @Test
    public void testSetValidator1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.setValidator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.setValidator(UnionType.java:577) */
        unionType.setValidator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testGetRestrictedUnion_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:419) */
        unionType.getRestrictedUnion(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetRestrictedUnionThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1202)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1193)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:420) */
        unionType.getRestrictedUnion(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetRestrictedUnion1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:424) */
        unionType.getRestrictedUnion(null);
    }
    
    @Test
    public void testGetRestrictedUnion2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:420) */
        unionType.getRestrictedUnion(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchConstraint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchConstraint(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testMatchConstraint_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchConstraint(UnionType.java:615) */
        unionType.matchConstraint(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchConstraint(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testMatchConstraint() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        unionType.matchConstraint(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMatchConstraint1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        unionType.matchConstraint(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMatchConstraint2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchConstraint(UnionType.java:616) */
        unionType.matchConstraint(namedType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedTypeGivenToBooleanOutcome(boolean)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedTypeGivenToBooleanOutcome(boolean)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(UnionType.java:467) */
        unionType.getRestrictedTypeGivenToBooleanOutcome(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRestrictedTypeGivenToBooleanOutcome(boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedTypeGivenToBooleanOutcome(boolean)}
     */
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() throws Exception  {
    /* This block of code is 1380 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        AllType actual = ((AllType) unionType.getRestrictedTypeGivenToBooleanOutcome(false));
        
        AllType expected = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNamesType = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNamesType);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor1, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNamesType);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor1, setExtendedInterfacesMethodArguments);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor2, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor2, setExtendedInterfacesMethodArguments1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(last3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType, setExtendedInterfacesMethodArguments2);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType1, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType1, setExtendedInterfacesMethodArguments3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType2, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType2, setExtendedInterfacesMethodArguments4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType3, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType3, setExtendedInterfacesMethodArguments5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType4, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType4, setExtendedInterfacesMethodArguments6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments7 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments7[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType5, setImplementedInterfacesMethodArguments7);
        java.lang.Object[] setExtendedInterfacesMethodArguments7 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments7[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType5, setExtendedInterfacesMethodArguments7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments8 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments8[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType6, setImplementedInterfacesMethodArguments8);
        java.lang.Object[] setExtendedInterfacesMethodArguments8 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments8[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType6, setExtendedInterfacesMethodArguments8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first4, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments9 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments9[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis7, setImplementedInterfacesMethodArguments9);
        java.lang.Object[] setExtendedInterfacesMethodArguments9 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments9[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis7, setExtendedInterfacesMethodArguments9);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments10 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments10[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis6, setImplementedInterfacesMethodArguments10);
        java.lang.Object[] setExtendedInterfacesMethodArguments10 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments10[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis6, setExtendedInterfacesMethodArguments10);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        java.lang.Object[] setImplementedInterfacesMethodArguments11 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments11[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments11);
        java.lang.Object[] setExtendedInterfacesMethodArguments11 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments11[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments11);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        java.lang.Object[] setImplementedInterfacesMethodArguments12 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments12[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor4, setImplementedInterfacesMethodArguments12);
        java.lang.Object[] setExtendedInterfacesMethodArguments12 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments12[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor4, setExtendedInterfacesMethodArguments12);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first7, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType1);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        java.lang.Object[] setImplementedInterfacesMethodArguments13 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments13[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments13);
        java.lang.Object[] setExtendedInterfacesMethodArguments13 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments13[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments13);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        java.lang.Object[] setImplementedInterfacesMethodArguments14 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments14[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments14);
        java.lang.Object[] setExtendedInterfacesMethodArguments14 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments14[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments14);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className17 = "RegExp";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        java.lang.Object[] setImplementedInterfacesMethodArguments15 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments15[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments15);
        java.lang.Object[] setExtendedInterfacesMethodArguments15 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments15[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments15);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className18 = "String";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType3);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className19 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType2);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType3);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) returnType8);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(typeOfThis9);
        alternates1.add(returnType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1893425461);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(instanceObjectType3);
        alternates2.add(numberType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1624298654);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType2);
        nativeTypes[42] = ((JSType) expected);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        java.lang.Object[] setImplementedInterfacesMethodArguments16 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments16[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noType, setImplementedInterfacesMethodArguments16);
        java.lang.Object[] setExtendedInterfacesMethodArguments16 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments16[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noType, setExtendedInterfacesMethodArguments16);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        java.lang.Object[] setImplementedInterfacesMethodArguments17 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments17[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noResolvedType, setImplementedInterfacesMethodArguments17);
        java.lang.Object[] setExtendedInterfacesMethodArguments17 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments17[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noResolvedType, setExtendedInterfacesMethodArguments17);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        java.lang.Object[] setImplementedInterfacesMethodArguments18 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments18[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor5, setImplementedInterfacesMethodArguments18);
        java.lang.Object[] setExtendedInterfacesMethodArguments18 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments18[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor5, setExtendedInterfacesMethodArguments18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments19 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments19[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments19);
        java.lang.Object[] setExtendedInterfacesMethodArguments19 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments19[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties41 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments20 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments20[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments20);
        java.lang.Object[] setExtendedInterfacesMethodArguments20 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments20[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties42 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments21 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments21[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments21);
        java.lang.Object[] setExtendedInterfacesMethodArguments21 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments21[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments21);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties43 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType6);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(nullType);
        alternates3.add(voidType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1809552192);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(implicitPrototypeFallback3);
        alternates4.add(numberType);
        alternates4.add(returnType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1393851107);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(implicitPrototypeFallback3);
        alternates5.add(numberType);
        alternates5.add(returnType);
        alternates5.add(booleanType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1877400533);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates6 = new ArrayList();
        alternates6.add(numberType);
        alternates6.add(returnType);
        alternates6.add(booleanType);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1362229362);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates7 = new ArrayList();
        alternates7.add(numberType);
        alternates7.add(returnType);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates7);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1549016864);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[55] = ((JSType) unionType7);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates8 = new ArrayList();
        alternates8.add(functionType1);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates8);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType1);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap", multimapHeaderEntry);
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap", multimapHeaderEntry);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedRegistryInterfaceToImplementorsValueSetCapacity, actualRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "key");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "value");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue);
        
        int expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        int actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        assertEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash, actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "nextInValueSetHashRow");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap));
        
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, actualRegistryInterfaceToImplementorsMultimapHeaderEntry));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        Map expectedRegistryTemplateTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualRegistryTemplateTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedRegistryTemplateTypes, actualRegistryTemplateTypes));
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRestrictedTypeGivenToBooleanOutcome(boolean)
    
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(UnionType.java:471) */
        unionType.getRestrictedTypeGivenToBooleanOutcome(false);
    }
    
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(UnionType.java:469) */
        unionType.getRestrictedTypeGivenToBooleanOutcome(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isNullable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNullable()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isNullable()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNullable_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isNullable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNullable()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isNullable()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testIsNullable_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isNullable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isNullable(UnionType.java:251) */
        unionType.isNullable();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isNullable()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isNullable()}
     */
    @Test
    public void testIsNullableThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isNullable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:113)
            com.google.javascript.rhino.jstype.JSType.isNullable(JSType.java:860)
            com.google.javascript.rhino.jstype.UnionType.isNullable(UnionType.java:252) */
        unionType.isNullable();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isNullable()
    
    @Test
    public void testIsNullable1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        alternates.add(noResolvedType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.isNullable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isNullable()
    
    @Test
    public void testIsNullable2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isNullable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isNullable(UnionType.java:252) */
        unionType.isNullable();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateInternal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnyTemplateInternal()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAnyTemplateInternal()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasAnyTemplateInternal_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAnyTemplateInternal()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAnyTemplateInternal()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testHasAnyTemplateInternal_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateInternal(UnionType.java:622) */
        unionType.hasAnyTemplateInternal();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hasAnyTemplateInternal()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType alternate: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: alternate.hasAnyTemplate()
 *  */
    @Test
    public void testHasAnyTemplateInternal_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasAnyTemplateInternal(UnionType.java:623) */
        unionType.hasAnyTemplateInternal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasAnyTemplateInternal()
    
    @Test
    public void testHasAnyTemplateInternal1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        alternates.add(enumElementType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderInequality_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:508) */
        unionType.getTypesUnderInequality(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetTypesUnderInequalityThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:1097)
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:509) */
        unionType.getTypesUnderInequality(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetTypesUnderInequality1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:518) */
        unionType.getTypesUnderInequality(enumElementType);
    }
    
    @Test
    public void testGetTypesUnderInequality2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:509) */
        unionType.getTypesUnderInequality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderShallowInequality_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(UnionType.java:526) */
        unionType.getTypesUnderShallowInequality(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetTypesUnderShallowInequalityThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getTypesUnderShallowInequality(JSType.java:1142)
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(UnionType.java:527) */
        unionType.getTypesUnderShallowInequality(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetTypesUnderShallowInequality1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(UnionType.java:536) */
        unionType.getTypesUnderShallowInequality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.toDebugHashCodeString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toDebugHashCodeString()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#toDebugHashCodeString()}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType a: alternates)
 *  */
    @Test
    public void testToDebugHashCodeString_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.toDebugHashCodeString(UnionType.java:568) */
        unionType.toDebugHashCodeString();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toDebugHashCodeString()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#toDebugHashCodeString()}
     */
    @Test
    public void testToDebugHashCodeString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        String actual = unionType.toDebugHashCodeString();
        
        String expected = "{({1389652227},{1187891295},{484449231})}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDebugHashCodeString()
    
    @Test
    public void testToDebugHashCodeString1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        String actual = unionType.toDebugHashCodeString();
        
        String expected = "{()}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesNumberContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesNumberContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesNumberContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesNumberContext_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesNumberContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesNumberContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesNumberContext_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesNumberContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesNumberContext(UnionType.java:105) */
        unionType.matchesNumberContext();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesNumberContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType t: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.matchesNumberContext()
 *  */
    @Test
    public void testMatchesNumberContext_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesNumberContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesNumberContext(UnionType.java:106) */
        unionType.matchesNumberContext();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesNumberContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesNumberContext()}
     */
    @Test
    public void testMatchesNumberContextReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchesNumberContext()
    
    @Test
    public void testMatchesNumberContext1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        alternates.add(anonymousFunctionType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesNumberContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:174)
            com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty(FunctionType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:594)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:320)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:301)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.rhino.jstype.UnionType.matchesNumberContext(UnionType.java:106) */
        unionType.matchesNumberContext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesObjectContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesObjectContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesObjectContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesObjectContext_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.matchesObjectContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesObjectContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesObjectContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesObjectContext_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesObjectContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesObjectContext(UnionType.java:154) */
        unionType.matchesObjectContext();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesObjectContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesObjectContext()}
     */
    @Test
    public void testMatchesObjectContextReturnsTrue() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.matchesObjectContext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesStringContext_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.matchesStringContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesStringContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesStringContext_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesStringContext(UnionType.java:127) */
        unionType.matchesStringContext();
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(JSType t: alternates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.matchesStringContext()
 *  */
    @Test
    public void testMatchesStringContext_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesStringContext(UnionType.java:128) */
        unionType.matchesStringContext();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
     */
    @Test
    public void testMatchesStringContextReturnsTrue() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        boolean actual = unionType.matchesStringContext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchesStringContext()
    
    @Test
    public void testMatchesStringContext1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        alternates.add(anonymousFunctionType);
        alternates.add(unionType);
        alternates.add(unionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:174)
            com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty(FunctionType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:594)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:320)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext(PrototypeObjectType.java:308)
            com.google.javascript.rhino.jstype.FunctionType.matchesStringContext(FunctionType.java:66)
            com.google.javascript.rhino.jstype.UnionType.matchesStringContext(UnionType.java:128) */
        unionType.matchesStringContext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType, boolean)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType,boolean)}
 * @utbot.executesCondition {@code (!tolerateUnknowns): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: that.alternates)
 *  */
    @Test
    public void testCheckUnionEquivalenceHelper_ThrowNullPointerException_3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:339) */
        unionType.checkUnionEquivalenceHelper(null, true);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType,boolean)}
 * @utbot.executesCondition {@code (!tolerateUnknowns): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: that.alternates)
 *  */
    @Test
    public void testCheckUnionEquivalenceHelper_ThrowNullPointerException_2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:339) */
        unionType.checkUnionEquivalenceHelper(unionType1, true);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType,boolean)}
 * @utbot.executesCondition {@code (!tolerateUnknowns): True}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: alternates.size() != that.alternates.size()
 *  */
    @Test
    public void testCheckUnionEquivalenceHelper_ThrowNullPointerException_1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:336) */
        unionType.checkUnionEquivalenceHelper(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType,boolean)}
 * @utbot.executesCondition {@code (!tolerateUnknowns): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: alternates.size() != that.alternates.size()
 *  */
    @Test
    public void testCheckUnionEquivalenceHelper_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:336) */
        unionType.checkUnionEquivalenceHelper(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType,boolean)}
 * @utbot.executesCondition {@code (!tolerateUnknowns): True}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: alternates.size() != that.alternates.size()
 *  */
    @Test
    public void testCheckUnionEquivalenceHelper_ThrowNullPointerException_4() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:336) */
        unionType.checkUnionEquivalenceHelper(unionType1, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType, boolean)
    
    @Test
    public void testCheckUnionEquivalenceHelper1() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        boolean actual = unionType.checkUnionEquivalenceHelper(unionType, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckUnionEquivalenceHelper2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates1 = new ArrayList();
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        
        boolean actual = unionType.checkUnionEquivalenceHelper(unionType1, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType, boolean)
    
    @Test
    public void testCheckUnionEquivalenceHelper3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hasAlternate(UnionType.java:348)
            com.google.javascript.rhino.jstype.UnionType.checkUnionEquivalenceHelper(UnionType.java:340) */
        unionType.checkUnionEquivalenceHelper(unionType1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getPossibleToBooleanOutcomes()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return literals;}
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_CollectionIterator() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        BooleanLiteralSet actual = unionType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.EMPTY;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getPossibleToBooleanOutcomes()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes(UnionType.java:477) */
        unionType.getPossibleToBooleanOutcomes();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getPossibleToBooleanOutcomes()}
     */
    @Test
    public void testGetPossibleToBooleanOutcomes() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        BooleanLiteralSet actual = unionType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.BOTH;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderEquality_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality(UnionType.java:490) */
        unionType.getTypesUnderEquality(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetTypesUnderEqualityThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        AllType allType = new AllType(null);
        alternates.add(allType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getTypesUnderEquality(JSType.java:1064)
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality(UnionType.java:491) */
        unionType.getTypesUnderEquality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method restrictByNotNullOrUndefined()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#restrictByNotNullOrUndefined()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testRestrictByNotNullOrUndefined_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221) */
        unionType.restrictByNotNullOrUndefined();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method restrictByNotNullOrUndefined()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#restrictByNotNullOrUndefined()}
     */
    @Test
    public void testRestrictByNotNullOrUndefined() throws Exception  {
    /* This block of code is 1380 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(jSTypeRegistry, collection);
        ArrayList alternates = new ArrayList();
        AllType allType = new AllType(null);
        alternates.add(allType);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates.add(arrowType);
        AllType allType1 = new AllType(null);
        alternates.add(allType1);
        AllType allType2 = new AllType(null);
        alternates.add(allType2);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        alternates.add(arrowType1);
        unionType.alternates = alternates;
        
        AllType actual = ((AllType) unionType.restrictByNotNullOrUndefined());
        
        AllType expected = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNamesType = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNamesType);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor1, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNamesType);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor1, setExtendedInterfacesMethodArguments);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor2, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor2, setExtendedInterfacesMethodArguments1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(last3, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType, setExtendedInterfacesMethodArguments2);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType1, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType1, setExtendedInterfacesMethodArguments3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType2, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType2, setExtendedInterfacesMethodArguments4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType3, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType3, setExtendedInterfacesMethodArguments5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType4, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType4, setExtendedInterfacesMethodArguments6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments7 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments7[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType5, setImplementedInterfacesMethodArguments7);
        java.lang.Object[] setExtendedInterfacesMethodArguments7 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments7[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType5, setExtendedInterfacesMethodArguments7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments8 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments8[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(errorFunctionType6, setImplementedInterfacesMethodArguments8);
        java.lang.Object[] setExtendedInterfacesMethodArguments8 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments8[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(errorFunctionType6, setExtendedInterfacesMethodArguments8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first4, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments9 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments9[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis7, setImplementedInterfacesMethodArguments9);
        java.lang.Object[] setExtendedInterfacesMethodArguments9 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments9[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis7, setExtendedInterfacesMethodArguments9);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        java.lang.Object[] setImplementedInterfacesMethodArguments10 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments10[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(typeOfThis6, setImplementedInterfacesMethodArguments10);
        java.lang.Object[] setExtendedInterfacesMethodArguments10 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments10[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(typeOfThis6, setExtendedInterfacesMethodArguments10);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        java.lang.Object[] setImplementedInterfacesMethodArguments11 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments11[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments11);
        java.lang.Object[] setExtendedInterfacesMethodArguments11 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments11[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments11);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        java.lang.Object[] setImplementedInterfacesMethodArguments12 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments12[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor4, setImplementedInterfacesMethodArguments12);
        java.lang.Object[] setExtendedInterfacesMethodArguments12 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments12[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor4, setExtendedInterfacesMethodArguments12);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first7, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType1);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        java.lang.Object[] setImplementedInterfacesMethodArguments13 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments13[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments13);
        java.lang.Object[] setExtendedInterfacesMethodArguments13 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments13[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments13);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        java.lang.Object[] setImplementedInterfacesMethodArguments14 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments14[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments14);
        java.lang.Object[] setExtendedInterfacesMethodArguments14 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments14[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments14);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className17 = "RegExp";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        java.lang.Object[] setImplementedInterfacesMethodArguments15 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments15[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments15);
        java.lang.Object[] setExtendedInterfacesMethodArguments15 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments15[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments15);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className18 = "String";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType3);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className19 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType2);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType3);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) returnType8);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(typeOfThis9);
        alternates1.add(returnType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 50539988);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(instanceObjectType3);
        alternates2.add(numberType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 389735316);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType2);
        nativeTypes[42] = ((JSType) expected);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        java.lang.Object[] setImplementedInterfacesMethodArguments16 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments16[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noType, setImplementedInterfacesMethodArguments16);
        java.lang.Object[] setExtendedInterfacesMethodArguments16 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments16[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noType, setExtendedInterfacesMethodArguments16);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        java.lang.Object[] setImplementedInterfacesMethodArguments17 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments17[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(noResolvedType, setImplementedInterfacesMethodArguments17);
        java.lang.Object[] setExtendedInterfacesMethodArguments17 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments17[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(noResolvedType, setExtendedInterfacesMethodArguments17);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        java.lang.Object[] setImplementedInterfacesMethodArguments18 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments18[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(constructor5, setImplementedInterfacesMethodArguments18);
        java.lang.Object[] setExtendedInterfacesMethodArguments18 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments18[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(constructor5, setExtendedInterfacesMethodArguments18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments19 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments19[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments19);
        java.lang.Object[] setExtendedInterfacesMethodArguments19 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments19[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties41 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments20 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments20[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments20);
        java.lang.Object[] setExtendedInterfacesMethodArguments20 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments20[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties42 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        java.lang.Object[] setImplementedInterfacesMethodArguments21 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments21[0] = templateTypeNames;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments21);
        java.lang.Object[] setExtendedInterfacesMethodArguments21 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments21[0] = templateTypeNames;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments21);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties43 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType6);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(nullType);
        alternates3.add(voidType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1803095953);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(implicitPrototypeFallback3);
        alternates4.add(numberType);
        alternates4.add(returnType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1441472902);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(implicitPrototypeFallback3);
        alternates5.add(numberType);
        alternates5.add(returnType);
        alternates5.add(booleanType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1826099547);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates6 = new ArrayList();
        alternates6.add(numberType);
        alternates6.add(returnType);
        alternates6.add(booleanType);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1310928376);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates7 = new ArrayList();
        alternates7.add(numberType);
        alternates7.add(returnType);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates7);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1286307145);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[55] = ((JSType) unionType7);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates8 = new ArrayList();
        alternates8.add(functionType1);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates8);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType1);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap", multimapHeaderEntry);
        setField(multimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap", multimapHeaderEntry);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedRegistryInterfaceToImplementorsValueSetCapacity, actualRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "key");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryKey);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "value");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryValue);
        
        int expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        int actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash = ((Integer) getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "valueHash"));
        assertEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash, actualRegistryInterfaceToImplementorsMultimapHeaderEntryValueHash);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "nextInValueSetHashRow");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryNextInValueSetHashRow);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInValueSet);
        
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInValueSet");
        assertNull(actualRegistryInterfaceToImplementorsMultimapHeaderEntrySuccessorInValueSet);
        
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntry, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "predecessorInMultimap");
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap));
        Object expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        Object actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap = getFieldValue(actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimap, "com.google.common.collect.LinkedHashMultimap$ValueEntry", "successorInMultimap");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap, actualRegistryInterfaceToImplementorsMultimapHeaderEntryPredecessorInMultimapSuccessorInMultimap));
        
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMultimapHeaderEntry, actualRegistryInterfaceToImplementorsMultimapHeaderEntry));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        Map expectedRegistryTemplateTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualRegistryTemplateTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedRegistryTemplateTypes, actualRegistryTemplateTypes));
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields918811339308900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields918811339308900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass918811339314100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918811339308900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918811339314100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields918811340470200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields918811340470200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass918811340471500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918811340470200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918811340471500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

