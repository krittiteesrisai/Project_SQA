package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.SimpleErrorReporter;
import java.util.HashSet;
import java.util.Set;
import java.lang.reflect.Method;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.testing.TestErrorReporter;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptySet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_rhino_jstype_UnionTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof UnionType): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjectNotInstanceOfUnionType() {
        UnionType unionType = new UnionType(null, null);
        
        boolean actual = unionType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof UnionType): True}
 * @utbot.invokes {@link java.util.Set#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return alternates.equals(that.alternates);}
 *  */
    @Test
    public void testEquals_ObjectInstanceOfUnionType() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.equals(unionType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof UnionType): True}
 * @utbot.invokes {@link java.util.Set#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return alternates.equals(that.alternates);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        UnionType unionType1 = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.equals] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.equals(UnionType.java:308) */
        unionType.equals(unionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#toString()}
     */
    @Test
    public void testToString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        String actual = unionType1.toString();
        
        String expected = "(()|com.google.javascript.rhino.jstype.ArrowType@0)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hashCode()}
 * @utbot.invokes {@link java.util.Set#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return alternates.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.hashCode(UnionType.java:316) */
        unionType.hashCode();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#hashCode()}
     */
    @Test
    public void testHashCodeReturnsZero() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        int actual = unionType1.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#contains(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return alternates.contains(alternate);}
 *  */
    @Test
    public void testContains_SetContains() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.contains(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#contains(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return alternates.contains(alternate);
 *  */
    @Test
    public void testContains_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.contains] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.contains(UnionType.java:345) */
        unionType.contains(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.testForEquality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testTestForEquality_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.testForEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.testForEquality(UnionType.java:221) */
        unionType.testForEquality(null);
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
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_1() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_4() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_2() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseUnionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseUnionType_3() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        UnionType actual = ((UnionType) visitMethod.invoke(unionType, visitMethodArguments));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return visitor.caseUnionType(this);
 *  */
    @Test
    public void testVisit_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        UnionType unionType = new UnionType(null, null);
        Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
        NoObjectType this$0 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(leastSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor.caseUnionType(NoObjectType.java:120)
            com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor.caseUnionType(NoObjectType.java:75)
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:479) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class leastSupertypeVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", leastSupertypeVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = leastSupertypeVisitor;
        try {
            visitMethod.invoke(unionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return visitor.caseUnionType(this);
 *  */
    @Test
    public void testVisit_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        UnionType unionType = new UnionType(null, null);
        Object greatestSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
        NoType this$0 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(greatestSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor.caseUnionType(NoObjectType.java:187)
            com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor.caseUnionType(NoObjectType.java:146)
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:479) */
        Class unionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class greatestSupertypeVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = unionTypeClazz.getDeclaredMethod("visit", greatestSupertypeVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = greatestSupertypeVisitor;
        try {
            visitMethod.invoke(unionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseUnionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:479) */
        unionType.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseUnionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:512)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseUnionType(SemanticReverseAbstractInterpreter.java:503)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseUnionType(SemanticReverseAbstractInterpreter.java:472)
            com.google.javascript.rhino.jstype.UnionType.visit(UnionType.java:479) */
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
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test(expected = StackOverflowError.class)
    public void testVisit1() throws Throwable  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testVisit2() throws Throwable  {
        UnionType unionType = new UnionType(null, null);
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isObject()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isObject()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testIsObject_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:326) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.isObject();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isObject()
    
    @Test
    public void testIsObject1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.isObject();
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsObject2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        linkedHashSet.add(prototypeObjectType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.isObject();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isObject()
    
    @Test
    public void testIsObject3() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:327) */
        unionType.isObject();
    }
    
    @Test
    public void testIsObject4() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        linkedHashSet.add(functionType);
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:327) */
        unionType.isObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !that.isUnknownType()
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:262) */
        unionType.getLeastSupertype(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetLeastSupertype1() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(jSTypeRegistry, linkedHashSet);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        TemplateType actual = ((TemplateType) unionType.getLeastSupertype(templateType));
        
        // com.google.javascript.rhino.jstype.TemplateType has overridden equals method
        assertEquals(templateType, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testGetLeastSupertype2() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        unionType.getLeastSupertype(templateType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLeastSupertype3() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        unionType.getLeastSupertype(templateType);
    }
    
    @Test
    public void testGetLeastSupertype4() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:270) */
        unionType.getLeastSupertype(templateType);
    }
    
    @Test
    public void testGetLeastSupertype5() {
        UnionType unionType = new UnionType(null, null);
        UnknownType unknownType = new UnknownType(null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:270) */
        unionType.getLeastSupertype(unknownType);
    }
    
    @Test
    public void testGetLeastSupertype6() throws Exception  {
        UnionType unionType = new UnionType(null, null);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:270) */
        unionType.getLeastSupertype(templateType);
    }
    
    @Test
    public void testGetLeastSupertype7() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry, linkedHashSet);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:88)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:104)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:779)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.UnionType.getLeastSupertype(UnionType.java:270) */
        unionType.getLeastSupertype(templateType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isUnionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnionType()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnionType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsUnionType_ReturnTrue() {
        UnionType unionType = new UnionType(null, null);
        
        boolean actual = unionType.isUnionType();
        
        assertTrue(actual);
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
    public void testGetAlternates_ReturnAlternates() {
        UnionType unionType = new UnionType(null, null);
        
        Iterable actual = unionType.getAlternates();
        
        assertNull(actual);
        
        Set finalUnionTypeAlternates = unionType.alternates;
        
        assertNull(finalUnionTypeAlternates);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isUnknownType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isUnknownType()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isUnknownType()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:252) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.isUnknownType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    @Test
    public void testIsUnknownType1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.isUnknownType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsUnknownType2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        linkedHashSet.add(functionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.isUnknownType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isUnknownType()
    
    @Test
    public void testIsUnknownType3() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:253) */
        unionType.isUnknownType();
    }
    
    @Test
    public void testIsUnknownType4() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        linkedHashSet.add(anonymousFunctionType);
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:253) */
        unionType.isUnknownType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:392) */
        unionType.isSubtype(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsSubtype1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ParameterizedType parameterizedType = new ParameterizedType(null, null, null);
        linkedHashSet.add(parameterizedType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.isSubtype(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsSubtype2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:393) */
        unionType.isSubtype(anonymousFunctionType);
    }
    
    @Test
    public void testIsSubtype3() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        AllType allType = new AllType(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:393) */
        unionType.isSubtype(allType);
    }
    
    @Test
    public void testIsSubtype4() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(errorFunctionType);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:635)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:715)
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:393) */
        unionType.isSubtype(functionType);
    }
    
    @Test
    public void testIsSubtype5() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(anonymousFunctionType);
        FunctionType anonymousFunctionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        linkedHashSet.add(anonymousFunctionType1);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:718)
            com.google.javascript.rhino.jstype.UnionType.isSubtype(UnionType.java:393) */
        unionType.isSubtype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testGetRestrictedUnion_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:364) */
        unionType.getRestrictedUnion(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRestrictedUnion(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetRestrictedUnion1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:369) */
        unionType.getRestrictedUnion(null);
    }
    
    @Test
    public void testGetRestrictedUnion2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        linkedHashSet.add(noObjectType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:808)
            com.google.javascript.rhino.jstype.NoObjectType.isSubtype(NoObjectType.java:231)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:365) */
        unionType.getRestrictedUnion(null);
    }
    
    @Test
    public void testGetRestrictedUnion3() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:365) */
        unionType.getRestrictedUnion(null);
    }
    
    @Test
    public void testGetRestrictedUnion4() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:365) */
        unionType.getRestrictedUnion(enumType);
    }
    
    @Test
    public void testGetRestrictedUnion5() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(jSTypeRegistry, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:718)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:365) */
        unionType.getRestrictedUnion(null);
    }
    
    @Test
    public void testGetRestrictedUnion6() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        EnumType returnType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:635)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:715)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:365) */
        unionType.getRestrictedUnion(anonymousFunctionType);
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
    public void testFindPropertyType_IterableIterator() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        JSType actual = unionType.findPropertyType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#findPropertyType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: getAlternates())
 *  */
    @Test
    public void testFindPropertyType_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
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
    public void testFindPropertyTypeWithBlankString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType = new AllType(null);
        hashSet.add(allType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        unionType1.alternates = alternates1;
        
        JSType actual = unionType1.findPropertyType("\n\t\r");
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findPropertyType(java.lang.String)
    
    @Test
    public void testFindPropertyType1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:168) */
        unionType.findPropertyType(string);
    }
    
    @Test
    public void testFindPropertyType2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:133)
            com.google.javascript.rhino.jstype.FunctionType.hasProperty(FunctionType.java:409)
            com.google.javascript.rhino.jstype.ObjectType.findPropertyType(ObjectType.java:293)
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:172) */
        unionType.findPropertyType(string);
    }
    
    @Test
    public void testFindPropertyType3() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        linkedHashSet.add(noObjectType);
        linkedHashSet.add(noObjectType);
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.findPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.NoObjectType.getPropertyType(NoObjectType.java:303)
            com.google.javascript.rhino.jstype.ObjectType.findPropertyType(ObjectType.java:294)
            com.google.javascript.rhino.jstype.UnionType.findPropertyType(UnionType.java:172) */
        unionType.findPropertyType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.canAssignTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testCanAssignTo_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:190) */
        unionType.canAssignTo(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testCanAssignTo1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        boolean actual = unionType.canAssignTo(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testCanAssignTo2() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(null, linkedHashSet);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:191) */
        unionType.canAssignTo(anonymousFunctionType);
    }
    
    @Test
    public void testCanAssignTo3() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:409)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:194) */
        unionType.canAssignTo(recordType);
    }
    
    @Test
    public void testCanAssignTo4() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        RecordType returnType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:635)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:715)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:409)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:194) */
        unionType.canAssignTo(anonymousFunctionType);
    }
    
    @Test
    public void testCanAssignTo5() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:718)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:409)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:194) */
        unionType.canAssignTo(null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method canAssignTo(com.google.javascript.rhino.jstype.JSType)
    
    @Test(timeout = 1000L)
    public void testCanAssignTo6() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        linkedHashSet.add(errorFunctionType);
        UnionType unionType = new UnionType(null, linkedHashSet);
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        unionType.canAssignTo(enumType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#canBeCalled()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testCanBeCalled_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.canBeCalled] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canBeCalled(UnionType.java:201) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.canBeCalled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.meet
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method meet(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#meet(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testMeet_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.meet] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.meet(UnionType.java:275) */
        unionType.meet(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableSet#builder()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alternate: alternates)
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.resolveInternal(UnionType.java:488) */
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
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType = new AllType(null);
        hashSet.add(allType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        java.lang.String[] stringArray = {"#$\\\"'", "XZ", "10"};
        java.lang.String[] stringArray1 = {"XZ", "XZ", "XZ", "XZ", "XZ"};
        TestErrorReporter testErrorReporter = new TestErrorReporter(stringArray, stringArray1);
        
        UnionType actual = ((UnionType) unionType1.resolveInternal(testErrorReporter, null));
        
        UnionType expected = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(expected, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult", expected);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[54];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(constructor, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
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
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor);
        HashMap properties = new HashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        HashMap properties1 = new HashMap();
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototype.setImplicitPrototype(implicitPrototype);
        setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        String className = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        HashMap properties2 = new HashMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        HashMap properties3 = new HashMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        FunctionPrototypeType prototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype1, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor2);
        HashMap properties4 = new HashMap();
        setField(prototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        prototype1.setImplicitPrototype(implicitPrototype);
        setField(prototype1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        List implementedInterfaces1 = new ArrayList();
        constructor2.setImplementedInterfaces(implementedInterfaces1);
        String className1 = "Boolean";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        HashMap properties5 = new HashMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        HashMap properties6 = new HashMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor2);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        FunctionPrototypeType prototype2 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype2, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor3);
        HashMap properties7 = new HashMap();
        setField(prototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        prototype2.setImplicitPrototype(implicitPrototype);
        setField(prototype2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype2);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        List implementedInterfaces2 = new ArrayList();
        constructor3.setImplementedInterfaces(implementedInterfaces2);
        String className2 = "Date";
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        HashMap properties8 = new HashMap();
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        HashMap properties9 = new HashMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor3);
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
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
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
        HashMap properties10 = new HashMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        List implementedInterfaces3 = new ArrayList();
        errorFunctionType.setImplementedInterfaces(implementedInterfaces3);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        FunctionPrototypeType prototype3 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype3, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType1);
        HashMap properties11 = new HashMap();
        setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        prototype3.setImplicitPrototype(returnType1);
        setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        HashMap properties12 = new HashMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces4 = new ArrayList();
        errorFunctionType1.setImplementedInterfaces(implementedInterfaces4);
        String className3 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        HashMap properties13 = new HashMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        FunctionPrototypeType prototype4 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype4, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType2);
        HashMap properties14 = new HashMap();
        setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        prototype4.setImplicitPrototype(returnType1);
        setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        HashMap properties15 = new HashMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces5 = new ArrayList();
        errorFunctionType2.setImplementedInterfaces(implementedInterfaces5);
        String className4 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        HashMap properties16 = new HashMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        FunctionPrototypeType prototype5 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype5, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType3);
        HashMap properties17 = new HashMap();
        setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        prototype5.setImplicitPrototype(returnType1);
        setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        HashMap properties18 = new HashMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        List implementedInterfaces6 = new ArrayList();
        errorFunctionType3.setImplementedInterfaces(implementedInterfaces6);
        String className5 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        HashMap properties19 = new HashMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        FunctionPrototypeType prototype6 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype6, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType4);
        HashMap properties20 = new HashMap();
        setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        prototype6.setImplicitPrototype(returnType1);
        setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        HashMap properties21 = new HashMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        List implementedInterfaces7 = new ArrayList();
        errorFunctionType4.setImplementedInterfaces(implementedInterfaces7);
        String className6 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        HashMap properties22 = new HashMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        FunctionPrototypeType prototype7 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype7, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType5);
        HashMap properties23 = new HashMap();
        setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        prototype7.setImplicitPrototype(returnType1);
        setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        HashMap properties24 = new HashMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        List implementedInterfaces8 = new ArrayList();
        errorFunctionType5.setImplementedInterfaces(implementedInterfaces8);
        String className7 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        HashMap properties25 = new HashMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        FunctionPrototypeType prototype8 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype8, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType6);
        HashMap properties26 = new HashMap();
        setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        prototype8.setImplicitPrototype(returnType1);
        setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        HashMap properties27 = new HashMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        List implementedInterfaces9 = new ArrayList();
        errorFunctionType6.setImplementedInterfaces(implementedInterfaces9);
        String className8 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        HashMap properties28 = new HashMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        String className9 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        HashMap properties29 = new HashMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
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
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
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
        FunctionPrototypeType prototype9 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype9, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties30 = new HashMap();
        setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        prototype9.setImplicitPrototype(implicitPrototype);
        setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype9);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$3", "this$0", registry);
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
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
        setField(leastSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", typeOfThis7);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor);
        Object greatestSubtypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
        setField(greatestSubtypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", typeOfThis7);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor);
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", typeOfThis7);
        HashMap properties31 = new HashMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        List implementedInterfaces10 = new ArrayList();
        typeOfThis7.setImplementedInterfaces(implementedInterfaces10);
        HashMap properties32 = new HashMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        List implementedInterfaces11 = new ArrayList();
        typeOfThis6.setImplementedInterfaces(implementedInterfaces11);
        String className10 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        HashMap properties33 = new HashMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        typeOfThis6.setImplicitPrototype(prototype9);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        List implementedInterfaces12 = new ArrayList();
        functionType.setImplementedInterfaces(implementedInterfaces12);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        HashMap properties34 = new HashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) prototype9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters12.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters12, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters12, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        FunctionPrototypeType prototype10 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype10, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor4);
        HashMap properties35 = new HashMap();
        setField(prototype10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        prototype10.setImplicitPrototype(implicitPrototype);
        setField(prototype10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        List implementedInterfaces13 = new ArrayList();
        constructor4.setImplementedInterfaces(implementedInterfaces13);
        String className11 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        HashMap properties36 = new HashMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        HashMap properties37 = new HashMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototype);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first7, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters13);
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters13, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        FunctionPrototypeType prototype11 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype11, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType1);
        HashMap properties38 = new HashMap();
        setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        FunctionPrototypeType implicitPrototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        HashMap properties39 = new HashMap();
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototype11.setImplicitPrototype(implicitPrototype1);
        setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype11);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototype);
        List implementedInterfaces14 = new ArrayList();
        functionType1.setImplementedInterfaces(implementedInterfaces14);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType);
        subTypes1.add(constructor);
        subTypes1.add(constructor2);
        subTypes1.add(constructor3);
        subTypes1.add(constructor4);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSTypeRegistry$2", "this$0", registry);
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        FunctionPrototypeType prototype12 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype12, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", anonymousFunctionType);
        HashMap properties40 = new HashMap();
        setField(prototype12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        prototype12.setImplicitPrototype(implicitPrototype);
        setField(prototype12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototype12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype12);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", anonymousFunctionType);
        HashMap properties41 = new HashMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        List implementedInterfaces15 = new ArrayList();
        anonymousFunctionType.setImplementedInterfaces(implementedInterfaces15);
        String className12 = "RegExp";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        HashMap properties42 = new HashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(anonymousFunctionType);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        FunctionPrototypeType prototype13 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype13, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType2);
        HashMap properties43 = new HashMap();
        setField(prototype13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        prototype13.setImplicitPrototype(implicitPrototype);
        setField(prototype13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype13);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        HashMap properties44 = new HashMap();
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties44);
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis10);
        List implementedInterfaces16 = new ArrayList();
        functionType2.setImplementedInterfaces(implementedInterfaces16);
        String className13 = "String";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        HashMap properties45 = new HashMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties45);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType2);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        String className14 = "Object";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        HashMap properties46 = new HashMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties46);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType1);
        nativeTypes[21] = ((JSType) prototype11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis9);
        nativeTypes[27] = ((JSType) anonymousFunctionType);
        nativeTypes[28] = ((JSType) typeOfThis10);
        nativeTypes[29] = ((JSType) functionType2);
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
        nativeTypes[39] = ((JSType) implicitPrototype1);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates3 = new LinkedHashSet();
        alternates3.add(returnType);
        alternates3.add(typeOfThis10);
        unionType3.alternates = alternates3;
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates4 = new LinkedHashSet();
        alternates4.add(instanceObjectType3);
        alternates4.add(numberType);
        unionType4.alternates = alternates4;
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType4);
        AllType allType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(allType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[42] = ((JSType) allType2);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object leastSupertypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
        setField(leastSupertypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", noType);
        setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor1);
        Object greatestSubtypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
        setField(greatestSubtypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", noType);
        setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor1);
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", noType);
        HashMap properties47 = new HashMap();
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties47);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis11);
        List implementedInterfaces17 = new ArrayList();
        noType.setImplementedInterfaces(implementedInterfaces17);
        HashMap properties48 = new HashMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties48);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "global this";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        HashMap properties49 = new HashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties49);
        prototypeObjectType.setImplicitPrototype(returnType8);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) prototypeObjectType);
        nativeTypes[46] = ((JSType) typeOfThis6);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters16.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters16);
        setField(parameters16, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters16, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters16, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        List implementedInterfaces18 = new ArrayList();
        functionType3.setImplementedInterfaces(implementedInterfaces18);
        HashMap properties50 = new HashMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties50);
        functionType3.setImplicitPrototype(implicitPrototype);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[47] = ((JSType) functionType3);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", allType2);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        List implementedInterfaces19 = new ArrayList();
        functionType4.setImplementedInterfaces(implementedInterfaces19);
        HashMap properties51 = new HashMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties51);
        functionType4.setImplicitPrototype(typeOfThis6);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first10, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first10)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first10, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first10, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first10, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first10);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first10);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType2);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        List implementedInterfaces20 = new ArrayList();
        functionType5.setImplementedInterfaces(implementedInterfaces20);
        HashMap properties52 = new HashMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties52);
        functionType5.setImplicitPrototype(typeOfThis6);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType5);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates5 = new LinkedHashSet();
        alternates5.add(returnType);
        alternates5.add(implicitPrototype);
        alternates5.add(numberType);
        unionType5.alternates = alternates5;
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates6 = new LinkedHashSet();
        alternates6.add(booleanType);
        alternates6.add(returnType);
        alternates6.add(implicitPrototype);
        alternates6.add(numberType);
        unionType6.alternates = alternates6;
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates7 = new LinkedHashSet();
        alternates7.add(booleanType);
        alternates7.add(returnType);
        alternates7.add(numberType);
        unionType7.alternates = alternates7;
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType7);
        UnionType unionType8 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        Set alternates8 = new LinkedHashSet();
        alternates8.add(returnType);
        alternates8.add(numberType);
        unionType8.alternates = alternates8;
        setField(unionType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType8);
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
        namesToTypes.put(className5, typeOfThis2);
        namesToTypes.put(className12, typeOfThis9);
        namesToTypes.put(className9, returnType1);
        namesToTypes.put(className8, typeOfThis5);
        namesToTypes.put(className3, typeOfThis);
        namesToTypes.put(className13, typeOfThis10);
        namesToTypes.put(className2, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className10, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className11, instanceObjectType3);
        namesToTypes.put(className6, typeOfThis3);
        namesToTypes.put(className7, typeOfThis4);
        namesToTypes.put(className4, typeOfThis1);
        namesToTypes.put(className14, implicitPrototype);
        namesToTypes.put(className1, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet enumTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames", enumTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        String string8 = "prototype";
        HashSet hashSet2 = new HashSet();
        hashSet2.add(functionType1);
        typesIndexedByProperty.put(string8, hashSet2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        HashMultimap interfaceToImplementors = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        // com.google.javascript.rhino.jstype.UnionType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedTypeGivenToBooleanOutcome(boolean)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedTypeGivenToBooleanOutcome(boolean)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(UnionType.java:404) */
        unionType.getRestrictedTypeGivenToBooleanOutcome(false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getRestrictedTypeGivenToBooleanOutcome(boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getRestrictedTypeGivenToBooleanOutcome(boolean)}
     */
    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType = new AllType(null);
        hashSet.add(allType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        unionType1.alternates = alternates1;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.JSType.getRestrictedTypeGivenToBooleanOutcome(JSType.java:620)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedTypeGivenToBooleanOutcome(UnionType.java:406) */
        unionType1.getRestrictedTypeGivenToBooleanOutcome(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method restrictByNotNullOrUndefined()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#restrictByNotNullOrUndefined()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testRestrictByNotNullOrUndefined_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:212) */
        unionType.restrictByNotNullOrUndefined();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method restrictByNotNullOrUndefined()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#restrictByNotNullOrUndefined()}
     */
    @Test
    public void testRestrictByNotNullOrUndefinedThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:215)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:213) */
        unionType1.restrictByNotNullOrUndefined();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesNumberContext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesNumberContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesNumberContext()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesNumberContext_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesNumberContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesNumberContext(UnionType.java:105) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderEquality_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderEquality(UnionType.java:427) */
        unionType.getTypesUnderEquality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getPossibleToBooleanOutcomes()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return literals;}
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_SetIterator() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        BooleanLiteralSet actual = unionType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.EMPTY;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getPossibleToBooleanOutcomes()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getPossibleToBooleanOutcomes(UnionType.java:414) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        BooleanLiteralSet actual = unionType1.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.TRUE;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderShallowInequality_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderShallowInequality(UnionType.java:463) */
        unionType.getTypesUnderShallowInequality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesStringContext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesStringContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesStringContext_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.matchesStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.matchesStringContext(UnionType.java:127) */
        unionType.matchesStringContext();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesStringContext()}
     */
    @Test
    public void testMatchesStringContextReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.matchesStringContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.forgiveUnknownNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forgiveUnknownNames()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#forgiveUnknownNames()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 *  */
    @Test
    public void testForgiveUnknownNames_IterableIterator() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        unionType.forgiveUnknownNames();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forgiveUnknownNames()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#forgiveUnknownNames()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType type: getAlternates())
 *  */
    @Test
    public void testForgiveUnknownNames_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.forgiveUnknownNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.forgiveUnknownNames(UnionType.java:91) */
        unionType.forgiveUnknownNames();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method forgiveUnknownNames()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.UnionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#forgiveUnknownNames()}
     */
    @Test
    public void testForgiveUnknownNames() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        unionType1.forgiveUnknownNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.matchesObjectContext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesObjectContext()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#matchesObjectContext()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testMatchesObjectContext_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
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
    public void testMatchesObjectContextReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        boolean actual = unionType1.matchesObjectContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType element: alternates)
 *  */
    @Test
    public void testGetTypesUnderInequality_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:445) */
        unionType.getTypesUnderInequality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.UnionType.isNullable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNullable()
    
    /**
    @utbot.classUnderTest {@link UnionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.UnionType#isNullable()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType t: alternates)
 *  */
    @Test
    public void testIsNullable_ThrowNullPointerException() {
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isNullable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isNullable(UnionType.java:242) */
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
        HashSet hashSet = new HashSet();
        AllType allType = new AllType(null);
        hashSet.add(allType);
        Set set = emptySet();
        UnionType unionType = new UnionType(null, set);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        hashSet.add(unionType);
        AllType allType1 = new AllType(null);
        hashSet.add(allType1);
        UnionType unionType1 = new UnionType(jSTypeRegistry, hashSet);
        HashSet alternates1 = new HashSet();
        HashSet hashSet1 = new HashSet();
        UnionType unionType2 = new UnionType(null, hashSet1);
        HashSet alternates2 = new HashSet();
        unionType2.alternates = alternates2;
        alternates1.add(unionType2);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        alternates1.add(arrowType);
        unionType1.alternates = alternates1;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.UnionType.isNullable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.JSType.isNullable(JSType.java:516)
            com.google.javascript.rhino.jstype.UnionType.isNullable(UnionType.java:243) */
        unionType1.isNullable();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields902522087880300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields902522087880300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass902522087891100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields902522087880300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass902522087891100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

