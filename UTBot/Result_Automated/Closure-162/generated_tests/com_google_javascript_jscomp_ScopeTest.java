package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.StaticScope;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.Scope.Arguments;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_ScopeTest {
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScope(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getScope(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return var.scope;}
 *  */
    @Test
    public void testGetScope_ReturnVarScope() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        StaticScope actual = scope.getScope(var);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScope(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getScope(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return var.scope;
 *  */
    @Test
    public void testGetScope_ThrowNullPointerException() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getScope(Scope.java:576) */
        scope.getScope(((Scope.Var) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.isDeclared
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDeclared(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (scope.vars.containsKey(name)): False}
 * @utbot.executesCondition {@code (scope.parent != null): True}
 * @utbot.executesCondition {@code (recurse): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDeclared_NotRecurse() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        String string = "";
        
        boolean actual = scope.isDeclared(string, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (scope.vars.containsKey(name)): False}
 * @utbot.executesCondition {@code (scope.parent != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDeclared_ScopeParentEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "";
        
        boolean actual = scope.isDeclared(string, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (scope.parent != null): True}
 * @utbot.executesCondition {@code (recurse): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.triggersRecursion isDeclared, where the test execute conditions:
 *     {@code (scope.parent != null): False}
 * return from: {@code return false;}
 * @utbot.returnsFrom {@code return scope.parent.isDeclared(name, recurse);}
 *  */
    @Test
    public void testIsDeclared_Recurse() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        boolean actual = scope.isDeclared(null, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (scope.vars.containsKey(name)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsDeclared_ScopeVarsContainsKey() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        boolean actual = scope.isDeclared(string, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDeclared(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scope.vars.containsKey(name)
 *  */
    @Test
    public void testIsDeclared_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.isDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.isDeclared(Scope.java:549) */
        scope.isDeclared(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getRootNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRootNode()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.returnsFrom {@code return rootNode;}
 *  */
    @Test
    public void testGetRootNode_ReturnRootNode() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Node actual = scope.getRootNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getDepth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDepth()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getDepth()}
 * @utbot.returnsFrom {@code return depth;}
 *  */
    @Test
    public void testGetDepth_ReturnDepth() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -255);
        
        int actual = scope.getDepth();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.isLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLocal()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isLocal()}
 * @utbot.returnsFrom {@code return !isGlobal();}
 *  */
    @Test
    public void testIsLocal_NotIsGlobal() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        boolean actual = scope.isLocal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isLocal()}
 * @utbot.returnsFrom {@code return !isGlobal();}
 *  */
    @Test
    public void testIsLocal_NotIsGlobal_1() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        boolean actual = scope.isLocal();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getTypeOfThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getTypeOfThis()}
 * @utbot.returnsFrom {@code return thisType;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnThisType() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        ObjectType actual = scope.getTypeOfThis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.isBottom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBottom()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isBottom()}
 * @utbot.returnsFrom {@code return isBottom;}
 *  */
    @Test
    public void testIsBottom_ReturnIsBottom() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        boolean actual = scope.isBottom();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getParentScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParentScope()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getParentScope()}
 * @utbot.returnsFrom {@code return parent;}
 *  */
    @Test
    public void testGetParentScope_ReturnParent() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        StaticScope actual = scope.getParentScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getGlobalScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGlobalScope()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getGlobalScope()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetGlobalScope_ReturnResult() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Scope actual = scope.getGlobalScope();
        
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertNull(actualVars);
        
        Scope actualParent = actual.getParent();
        assertNull(actualParent);
        
        int scopeDepth = scope.getDepth();
        int actualDepth = actual.getDepth();
        assertEquals(scopeDepth, actualDepth);
        
        Node actualRootNode = actual.getRootNode();
        assertNull(actualRootNode);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope.Var actualArguments = ((Scope.Var) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualArguments);
        
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getGlobalScope()}
 * @utbot.iterates iterate the loop {@code while(result.getParent() != null)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetGlobalScope_ResultGetParentNotEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        Scope actual = scope.getGlobalScope();
        
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertNull(actualVars);
        
        Scope actualParent = actual.getParent();
        assertNull(actualParent);
        
        int parentDepth = parent.getDepth();
        int actualDepth = actual.getDepth();
        assertEquals(parentDepth, actualDepth);
        
        Node actualRootNode = actual.getRootNode();
        assertNull(actualRootNode);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope.Var actualArguments = ((Scope.Var) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualArguments);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getVars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVars()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return vars.values().iterator();}
 *  */
    @Test
    public void testGetVars_CollectionIterator() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Object actual = scope.getVars();
        
        Object expected = createInstance("java.util.LinkedHashMap$LinkedValueIterator");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVars()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return vars.values().iterator();
 *  */
    @Test
    public void testGetVars_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVars(Scope.java:562) */
        scope.getVars();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getVarCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVarCount()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVarCount()}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.returnsFrom {@code return vars.size();}
 *  */
    @Test
    public void testGetVarCount_MapSize() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        int actual = scope.getVarCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVarCount()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVarCount()}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return vars.size();
 *  */
    @Test
    public void testGetVarCount_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getVarCount] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVarCount(Scope.java:588) */
        scope.getVarCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.undeclare
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method undeclare(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#undeclare(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(var.scope == this);
 *  */
    @Test
    public void testUndeclare_ThrowNullPointerException() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.undeclare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.undeclare(Scope.java:505) */
        scope.undeclare(null);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#undeclare(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (Preconditions.checkState(var.scope == this);): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(vars.get(var.name) == var);
 *  */
    @Test
    public void testUndeclare_ThrowNullPointerException_1() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.undeclare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.undeclare(Scope.java:506) */
        scope.undeclare(var);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method undeclare(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#undeclare(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (Preconditions.checkState(var.scope == this);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(vars.get(var.name) == var);): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(vars.get(var.name) == var);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUndeclare_ThrowIllegalStateException_1() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "";
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = string;
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        scope.undeclare(var);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#undeclare(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (Preconditions.checkState(var.scope == this);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(var.scope == this);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUndeclare_ThrowIllegalStateException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        scope.undeclare(var);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getAllSymbols
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getAllSymbols()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(vars.values());}
 *  */
    @Test
    public void testGetAllSymbols_CollectionsUnmodifiableCollection() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Object actual = scope.getAllSymbols();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getAllSymbols()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableCollection(vars.values());
 *  */
    @Test
    public void testGetAllSymbols_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getAllSymbols] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getAllSymbols(Scope.java:581) */
        scope.getAllSymbols();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferences(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of(java.lang.Object)}
 * @utbot.returnsFrom {@code return ImmutableList.of(var);}
 *  */
    @Test
    public void testGetReferences_ImmutableListOf() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        Scope.Arguments arguments = new Scope.Arguments(null);
        
        List actual = ((List) scope.getReferences(arguments));
        
        List expected = new ArrayList();
        expected.add(arguments);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReferences(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ImmutableList.of(var);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetReferences_ThrowNullPointerException() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        scope.getReferences(((Scope.Var) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.isGlobal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobal()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isGlobal()}
 * @utbot.returnsFrom {@code return parent == null;}
 *  */
    @Test
    public void testIsGlobal_ParentNotEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        boolean actual = scope.isGlobal();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#isGlobal()}
 * @utbot.returnsFrom {@code return parent == null;}
 *  */
    @Test
    public void testIsGlobal_ParentEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        boolean actual = scope.isGlobal();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getOwnSlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getOwnSlot(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return vars.get(name);}
 *  */
    @Test
    public void testGetOwnSlot_MapGet() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "";
        
        StaticSlot actual = scope.getOwnSlot(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getOwnSlot(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return vars.get(name);
 *  */
    @Test
    public void testGetOwnSlot_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getOwnSlot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getOwnSlot(Scope.java:517) */
        scope.getOwnSlot(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getArgumentsVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgumentsVar()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getArgumentsVar()}
 * @utbot.executesCondition {@code (arguments == null): False}
 * @utbot.returnsFrom {@code return arguments;}
 *  */
    @Test
    public void testGetArgumentsVar_ArgumentsNotEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope.Var arguments = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(scope, "com.google.javascript.jscomp.Scope", "arguments", arguments);
        
        Scope.Var actual = scope.getArgumentsVar();
        
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var expected = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        // com.google.javascript.jscomp.Scope.Var has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getArgumentsVar()}
 * @utbot.executesCondition {@code (arguments == null): True}
 * @utbot.returnsFrom {@code return arguments;}
 *  */
    @Test
    public void testGetArgumentsVar_ArgumentsEqualsNull() throws Exception  {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Scope.Var initialScopeArguments = ((Scope.Var) getFieldValue(scope, "com.google.javascript.jscomp.Scope", "arguments"));
        
        Scope.Arguments actual = ((Scope.Arguments) scope.getArgumentsVar());
        
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope1, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope1, "com.google.javascript.jscomp.Scope", "isBottom", true);
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        String name = "arguments";
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "name", name);
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "index", -1);
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope1);
        setField(scope1, "com.google.javascript.jscomp.Scope", "arguments", arguments);
        Scope.Arguments expected = new Scope.Arguments(scope1);
        
        // com.google.javascript.jscomp.Scope.Arguments has overridden equals method
        assertEquals(expected, actual);
        
        Scope.Var finalScopeArguments = ((Scope.Var) getFieldValue(scope, "com.google.javascript.jscomp.Scope", "arguments"));
        
        assertFalse(initialScopeArguments == finalScopeArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVar(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.executesCondition {@code (var != null): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetVar_ParentEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "";
        
        Scope.Var actual = scope.getVar(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.executesCondition {@code (var != null): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testGetVar_VarNotEqualsNull() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Scope.Arguments actual = ((Scope.Arguments) scope.getVar(string));
        
        Scope.Arguments expected = new Scope.Arguments(null);
        
        // com.google.javascript.jscomp.Scope.Arguments has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVar(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = vars.get(name);
 *  */
    @Test
    public void testGetVar_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.getVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:524) */
        scope.getVar(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.declare
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declare(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.CompilerInput)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeclare_ThrowUnsupportedOperationException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        scope.declare(string, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return declare(name, nameNode, type, input, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclare_ThrowIllegalStateException() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        scope.declare(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return declare(name, nameNode, type, input, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclare_ThrowIllegalStateException_1() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        
        scope.declare(string, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.declare
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declare(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.CompilerInput, boolean)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(vars.get(name) == null);): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getInfoForNameNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = NodeUtil.getInfoForNameNode(nameNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeclare_ThrowUnsupportedOperationException1() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        scope.declare(string, functionNode, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name != null && name.length() > 0);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclare_ThrowIllegalStateException1() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        scope.declare(null, null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name != null && name.length() > 0);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclare_ThrowIllegalStateException_11() {
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        
        scope.declare(string, null, null, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declare(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.CompilerInput, boolean)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(name != null && name.length() > 0);): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(vars.get(name) == null);
 *  */
    @Test
    public void testDeclare_ThrowNullPointerException() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.Scope.declare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.declare(Scope.java:487) */
        scope.declare(string, null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParent()
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getParent()}
 * @utbot.returnsFrom {@code return parent;}
 *  */
    @Test
    public void testGetParent_ReturnParent() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Scope actual = scope.getParent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Scope.getSlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getSlot(java.lang.String)}
 * @utbot.returnsFrom {@code return getVar(name);}
 *  */
    @Test
    public void testGetSlot_ReturnGetVar() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "";
        
        StaticSlot actual = scope.getSlot(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Scope}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Scope#getSlot(java.lang.String)}
 * @utbot.returnsFrom {@code return getVar(name);}
 *  */
    @Test
    public void testGetSlot_ReturnGetVar_1() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(null, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Scope.Arguments actual = ((Scope.Arguments) scope.getSlot(null));
        
        Scope.Arguments expected = new Scope.Arguments(null);
        
        // com.google.javascript.jscomp.Scope.Arguments has overridden equals method
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields915701371033400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields915701371033400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass915701371039700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915701371033400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915701371039700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields915701371508700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields915701371508700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass915701371512400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915701371508700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915701371512400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

