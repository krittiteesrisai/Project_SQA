package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses;
import com.google.common.collect.HashMultimap;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.jscomp.Scope.Var;
import java.util.LinkedHashSet;
import com.google.common.collect.ImmutableListMultimap;
import com.google.javascript.rhino.Node;
import com.google.common.collect.ArrayListMultimap;
import com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_MaybeReachingVariableUseTest {
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.createInitialEstimateLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInitialEstimateLattice()
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#createInitialEstimateLattice()}
 * @utbot.returnsFrom {@code return new ReachingUses();}
 *  */
    @Test
    public void testCreateInitialEstimateLattice_Return() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        MaybeReachingVariableUse.ReachingUses actual = maybeReachingVariableUse.createInitialEstimateLattice();
        
        MaybeReachingVariableUse.ReachingUses expected = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        HashMultimap mayUseMap = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(mayUseMap, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(mayUseMap, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(expected, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        // com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.hasExceptionHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasExceptionHandler(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#hasExceptionHandler(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasExceptionHandler_ReturnFalse() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasExceptionHandlerMethod = maybeReachingVariableUseClazz.getDeclaredMethod("hasExceptionHandler", nodeType);
        hasExceptionHandlerMethod.setAccessible(true);
        java.lang.Object[] hasExceptionHandlerMethodArguments = new java.lang.Object[1];
        hasExceptionHandlerMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) hasExceptionHandlerMethod.invoke(maybeReachingVariableUse, hasExceptionHandlerMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeFromUseIfLocal(java.lang.String, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveFromUseIfLocal_VarEqualsNull() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        String string = "";
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveFromUseIfLocal_VarScopeNotEqualsJsScope() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeFromUseIfLocal(java.lang.String, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = jsScope.getVar(name);
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:271) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = ((Object) null);
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !escaped.contains(var)
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException_1() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:275) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.executesCondition {@code (!escaped.contains(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.removeAll(var);
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException_2() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:276) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.executesCondition {@code (!escaped.contains(var)): True}
 * @utbot.invokes {@link com.google.common.collect.Multimap#removeAll(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.removeAll(var);
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException_3() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:276) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = reachingUses;
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.executesCondition {@code (!escaped.contains(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.removeAll(var);
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException_5() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Object nameNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode1);
        escaped.add(arguments);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:276) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.executesCondition {@code (!escaped.contains(var)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testRemoveFromUseIfLocal_ThrowNullPointerException_4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        escaped.add(arguments);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:328)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            java.base/java.util.HashSet.contains(HashSet.java:205)
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:275) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = ((Object) null);
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeFromUseIfLocal(java.lang.String, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#removeFromUseIfLocal(java.lang.String,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.executesCondition {@code (!escaped.contains(var)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.collect.Multimap#removeAll(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: use.mayUseMap.removeAll(var);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveFromUseIfLocal_ThrowUnsupportedOperationException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        ImmutableListMultimap mayUseMap = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        setField(reachingUses, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method removeFromUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("removeFromUseIfLocal", stringType, reachingUsesType);
        removeFromUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] removeFromUseIfLocalMethodArguments = new java.lang.Object[2];
        removeFromUseIfLocalMethodArguments[0] = string;
        removeFromUseIfLocalMethodArguments[1] = reachingUses;
        try {
            removeFromUseIfLocalMethod.invoke(maybeReachingVariableUse, removeFromUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.isForward
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isForward()
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#isForward()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsForward_ReturnFalse() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        boolean actual = maybeReachingVariableUse.isForward();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.createEntryLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#createEntryLattice()}
 * @utbot.returnsFrom {@code return new ReachingUses();}
 *  */
    @Test
    public void testCreateEntryLattice_Return() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        MaybeReachingVariableUse.ReachingUses actual = maybeReachingVariableUse.createEntryLattice();
        
        MaybeReachingVariableUse.ReachingUses expected = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        HashMultimap mayUseMap = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(mayUseMap, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(mayUseMap, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(expected, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        // com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addToUseIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddToUseIfLocal_Return() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        String string = "";
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = string;
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 *  */
    @Test
    public void testAddToUseIfLocal_VarScopeEqualsJsScope() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        escaped.add(var);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addToUseIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = jsScope.getVar(name);
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:256) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !escaped.contains(var)
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException_1() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:260) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.put(var, node);
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException_2() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.put(var, node);
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException_3() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = reachingUses;
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.invokes {@link com.google.common.collect.Multimap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: use.mayUseMap.put(var, node);
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException_4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        ArrayListMultimap mayUseMap = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(reachingUses, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:212)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:201)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:95)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:62)
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = reachingUses;
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddToUseIfLocal_ThrowNullPointerException_5() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        escaped.add(arguments);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:328)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            java.base/java.util.HashSet.contains(HashSet.java:205)
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:260) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addToUseIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    @Test
    public void testAddToUseIfLocal1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = reachingUses;
        addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
    }
    
    @Test
    public void testAddToUseIfLocal2() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        String string1 = "";
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class string1Type = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", string1Type, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = string1;
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = reachingUses;
        addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
    }
    
    @Test
    public void testAddToUseIfLocal3() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        escaped.add(null);
        escaped.add(arguments);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, stringNodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = stringNode;
        addToUseIfLocalMethodArguments[2] = reachingUses;
        addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addToUseIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    @Test(expected = StackOverflowError.class)
    public void testAddToUseIfLocal4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "parent", jsScope);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        String string = "";
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = string;
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAddToUseIfLocal5() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(null, null);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "parent", jsScope);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = ((Object) null);
        addToUseIfLocalMethodArguments[2] = reachingUses;
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddToUseIfLocal6() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        ArrayListMultimap mayUseMap = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(mayUseMap, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(reachingUses, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:328)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:215)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:201)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:95)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:62)
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, stringNodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = stringNode;
        addToUseIfLocalMethodArguments[2] = reachingUses;
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddToUseIfLocal7() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        Scope.Var var1 = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var1, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode1);
        escaped.add(var1);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, stringNodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = stringNode;
        addToUseIfLocalMethodArguments[2] = reachingUses;
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddToUseIfLocal8() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(null, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        LinkedHashSet escaped = new LinkedHashSet();
        escaped.add(null);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        escaped.add(var);
        escaped.add(null);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "escaped", escaped);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:261) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Method addToUseIfLocalMethod = maybeReachingVariableUseClazz.getDeclaredMethod("addToUseIfLocal", stringType, nodeType, reachingUsesType);
        addToUseIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToUseIfLocalMethodArguments = new java.lang.Object[3];
        addToUseIfLocalMethodArguments[0] = ((Object) null);
        addToUseIfLocalMethodArguments[1] = node;
        addToUseIfLocalMethodArguments[2] = ((Object) null);
        try {
            addToUseIfLocalMethod.invoke(maybeReachingVariableUse, addToUseIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMayUse_Return() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()) {
 *     Node name = n.getFirstChild();
 *     if (!conditional) {
 *         removeFromUseIfLocal(name.getString(), output);
 *     }
 *     if (!n.isAssign()) {
 *         addToUseIfLocal(name.getString(), cfgNode, output);
 *     }
 *     computeMayUse(name.getNext(), cfgNode, output, conditional);
 * } else {
 *     for (Node c = n.getLastChild(); c != null; c = n.getChildBefore(c)) {
 *         computeMayUse(c, cfgNode, output, conditional);
 *     }
 * }): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getLastChild(); c != null; c = n.getChildBefore(c))} once
 *  */
    @Test
    public void testComputeMayUse_NodeUtilIsAssignmentOpAndNGetFirstChildIsName_1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(91);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion computeMayUse, where the test return from: {@code return;}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMayUse_NodeUtilGetConditionExpression() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): False}
 *  */
    @Test
    public void testComputeMayUse_NodeUtilIsAssignmentOpAndNGetFirstChildIsName() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-158);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion computeMayUse, where the test return from: {@code return;}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMayUse_MaybeReachingVariableUseComputeMayUse() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (varName.hasChildren()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMayUse_NotVarNameHasChildren() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMayUse_MaybeReachingVariableUseAddToUseIfLocal() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = ((Object) null);
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_1() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(87);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:225) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_2() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(93);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:225) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion computeMayUse, where the test invoke:
 *     com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMayUse(n.getLastChild(), cfgNode, output, true);
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:202) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion computeMayUse, where the test invoke:
 *     com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMayUse(NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_6() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:178) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion computeMayUse, where the test activate {@code switch(n.getType()) case: default}, return from: {@code return;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMayUse(n.getFirstChild().getNext(), cfgNode, output, true);
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_5() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:208) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addToUseIfLocal(n.getString(), cfgNode, output);
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_7() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:256)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:172) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()) {
 *     Node name = n.getFirstChild();
 *     if (!conditional) {
 *         removeFromUseIfLocal(name.getString(), output);
 *     }
 *     if (!n.isAssign()) {
 *         addToUseIfLocal(name.getString(), cfgNode, output);
 *     }
 *     computeMayUse(name.getNext(), cfgNode, output, conditional);
 * } else {
 *     for (Node c = n.getLastChild(); c != null; c = n.getChildBefore(c)) {
 *         computeMayUse(c, cfgNode, output, conditional);
 *     }
 * }): True}
 * @utbot.executesCondition {@code (!conditional): False}
 * @utbot.executesCondition {@code (!n.isAssign()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.MaybeReachingVariableUse#addToUseIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addToUseIfLocal(name.getString(), cfgNode, output);
 *  */
    @Test
    public void testComputeMayUse_ThrowNullPointerException_3() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(90);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:256)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:233) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", numberNodeType, numberNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = numberNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = true;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: addToUseIfLocal(n.getString(), cfgNode, output);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testComputeMayUse_ThrowUnsupportedOperationException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Node node = new Node(38);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = node;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()) {
 *     Node name = n.getFirstChild();
 *     if (!conditional) {
 *         removeFromUseIfLocal(name.getString(), output);
 *     }
 *     if (!n.isAssign()) {
 *         addToUseIfLocal(name.getString(), cfgNode, output);
 *     }
 *     computeMayUse(name.getNext(), cfgNode, output, conditional);
 * } else {
 *     for (Node c = n.getLastChild(); c != null; c = n.getChildBefore(c)) {
 *         computeMayUse(c, cfgNode, output, conditional);
 *     }
 * }): True}
 * @utbot.executesCondition {@code (!conditional): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: removeFromUseIfLocal(name.getString(), output);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testComputeMayUse_ThrowUnsupportedOperationException_1() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(91);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()) {
 *     Node name = n.getFirstChild();
 *     if (!conditional) {
 *         removeFromUseIfLocal(name.getString(), output);
 *     }
 *     if (!n.isAssign()) {
 *         addToUseIfLocal(name.getString(), cfgNode, output);
 *     }
 *     computeMayUse(name.getNext(), cfgNode, output, conditional);
 * } else {
 *     for (Node c = n.getLastChild(); c != null; c = n.getChildBefore(c)) {
 *         computeMayUse(c, cfgNode, output, conditional);
 *     }
 * }): True}
 * @utbot.executesCondition {@code (!conditional): False}
 * @utbot.executesCondition {@code (!n.isAssign()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: addToUseIfLocal(name.getString(), cfgNode, output);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testComputeMayUse_ThrowUnsupportedOperationException_2() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(90);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = true;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasChildren(), "AST should be normalized");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testComputeMayUse_ThrowIllegalStateException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (!NodeUtil.isForIn(n)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isForIn(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.getConditionExpression(n)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse_ThrowIllegalArgumentException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#computeMayUse(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getLastChild(); c != null; c = n.getChildBefore(c))} once
 * @utbot.throwsException {@link java.lang.RuntimeException} in: for(Node c = n.getLastChild(); c != null; c = n.getChildBefore(c))
 *  */
    @Test(expected = RuntimeException.class)
    public void testComputeMayUse_ThrowRuntimeException() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-158);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = node;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    @Test
    public void testComputeMayUse1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    
    @Test
    public void testComputeMayUse2() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = stringNode1;
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testComputeMayUse3() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testComputeMayUse4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = node;
        computeMayUseMethodArguments[1] = stringNode;
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testComputeMayUse5() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(115);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", numberNodeType, numberNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = numberNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse6() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(96);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:225)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:203) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse7() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:271)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:219) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse8() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(91);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(MaybeReachingVariableUse.java:256)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:233)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:202) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = node;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse9() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(114);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:178)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:208) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse10() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(88);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(MaybeReachingVariableUse.java:271)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:228) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse11() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:236) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = true;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse12() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(90);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:236) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", numberNodeType, numberNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = numberNode;
        computeMayUseMethodArguments[1] = numberNode1;
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeMayUse13() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(null, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.MaybeReachingVariableUse", "jsScope", jsScope);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(96);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:165)
            com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(MaybeReachingVariableUse.java:236) */
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = stringNode1;
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse14() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(99);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(115);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", numberNodeType, numberNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = numberNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse15() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse16() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testComputeMayUse17() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(93);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = stringNode1;
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testComputeMayUse18() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testComputeMayUse19() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(91);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", nodeType, nodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = node;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = reachingUses;
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse20() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(87);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(115);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = stringNode;
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testComputeMayUse21() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(99);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", numberNodeType, numberNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = numberNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMayUse22() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class reachingUsesType = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Class booleanType = boolean.class;
        Method computeMayUseMethod = maybeReachingVariableUseClazz.getDeclaredMethod("computeMayUse", stringNodeType, stringNodeType, reachingUsesType, booleanType);
        computeMayUseMethod.setAccessible(true);
        java.lang.Object[] computeMayUseMethodArguments = new java.lang.Object[4];
        computeMayUseMethodArguments[0] = stringNode;
        computeMayUseMethodArguments[1] = ((Object) null);
        computeMayUseMethodArguments[2] = ((Object) null);
        computeMayUseMethodArguments[3] = false;
        try {
            computeMayUseMethod.invoke(maybeReachingVariableUse, computeMayUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ReachingUses output = new ReachingUses(input);
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough] produces [java.lang.NullPointerException]
            com.google.common.collect.HashMultimap.<init>(HashMultimap.java:101)
            com.google.common.collect.HashMultimap.create(HashMultimap.java:87)
            com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses.<init>(MaybeReachingVariableUse.java:98)
            com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough(MaybeReachingVariableUse.java:148) */
        maybeReachingVariableUse.flowThrough(null, reachingUses);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException_1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        MaybeReachingVariableUse.ReachingUses reachingUses = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object mayUseMap = createInstance("com.google.common.collect.Synchronized$SynchronizedListMultimap");
        byte[] delegate = {};
        setField(mayUseMap, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        setField(reachingUses, "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "mayUseMap", mayUseMap);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough] produces [java.lang.NullPointerException]
            com.google.common.collect.Synchronized$SynchronizedMultimap.keySet(Synchronized.java:619)
            com.google.common.collect.HashMultimap.<init>(HashMultimap.java:101)
            com.google.common.collect.HashMultimap.create(HashMultimap.java:87)
            com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses.<init>(MaybeReachingVariableUse.java:98)
            com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough(MaybeReachingVariableUse.java:148) */
        maybeReachingVariableUse.flowThrough(null, reachingUses);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MaybeReachingVariableUse.getUses
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getUses(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FlowState<ReachingUses> state = n.getAnnotation();
 *  */
    @Test
    public void testGetUses_ThrowClassCastException() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object annotatedLinkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        DataFlowAnalysis.BranchedFlowState annotation = ((DataFlowAnalysis.BranchedFlowState) createInstance("com.google.javascript.jscomp.DataFlowAnalysis$BranchedFlowState"));
        setField(annotatedLinkedDirectedGraphNode, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", "annotation", annotation);
        nodes.put(null, annotatedLinkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.DataFlowAnalysis$BranchedFlowState cannot be cast to class com.google.javascript.jscomp.DataFlowAnalysis$FlowState (com.google.javascript.jscomp.DataFlowAnalysis$BranchedFlowState and com.google.javascript.jscomp.DataFlowAnalysis$FlowState are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:293) */
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return state.getOut().mayUseMap.get(jsScope.getVar(name));
 *  */
    @Test
    public void testGetUses_ThrowClassCastException_1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object annotatedLinkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        DataFlowAnalysis.FlowState annotation = ((DataFlowAnalysis.FlowState) createInstance("com.google.javascript.jscomp.DataFlowAnalysis$FlowState"));
        ConcreteType.ConcreteInstanceType out = ((ConcreteType.ConcreteInstanceType) createInstance("com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType"));
        Class flowStateClazz = Class.forName("com.google.javascript.jscomp.DataFlowAnalysis$FlowState");
        Class outType = Class.forName("com.google.javascript.jscomp.graph.LatticeElement");
        Method setOutMethod = flowStateClazz.getDeclaredMethod("setOut", outType);
        setOutMethod.setAccessible(true);
        java.lang.Object[] setOutMethodArguments = new java.lang.Object[1];
        setOutMethodArguments[0] = out;
        setOutMethod.invoke(annotation, setOutMethodArguments);
        setField(annotatedLinkedDirectedGraphNode, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", "annotation", annotation);
        nodes.put(null, annotatedLinkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType cannot be cast to class com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses (com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType and com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:294) */
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: GraphNode<Node, Branch> n = getCfg().getNode(defNode);
 *  */
    @Test
    public void testGetUses_ThrowNullPointerException() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:291) */
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.DataFlowAnalysis.FlowState#getOut()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.getOut().mayUseMap.get(jsScope.getVar(name));
 *  */
    @Test
    public void testGetUses_ThrowNullPointerException_1() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object annotatedLinkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        nodes.put(null, annotatedLinkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:294) */
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.getOut().mayUseMap.get(jsScope.getVar(name));
 *  */
    @Test
    public void testGetUses_ThrowNullPointerException_2() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object annotatedLinkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        DataFlowAnalysis.FlowState annotation = ((DataFlowAnalysis.FlowState) createInstance("com.google.javascript.jscomp.DataFlowAnalysis$FlowState"));
        setField(annotatedLinkedDirectedGraphNode, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", "annotation", annotation);
        nodes.put(null, annotatedLinkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:294) */
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.getOut().mayUseMap.get(jsScope.getVar(name));
 *  */
    @Test
    public void testGetUses_ThrowNullPointerException_3() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object annotatedLinkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        DataFlowAnalysis.FlowState annotation = ((DataFlowAnalysis.FlowState) createInstance("com.google.javascript.jscomp.DataFlowAnalysis$FlowState"));
        MaybeReachingVariableUse.ReachingUses out = ((MaybeReachingVariableUse.ReachingUses) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        annotation.setOut(out);
        setField(annotatedLinkedDirectedGraphNode, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", "annotation", annotation);
        nodes.put(null, annotatedLinkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        /* This test fails because method [com.google.javascript.jscomp.MaybeReachingVariableUse.getUses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(MaybeReachingVariableUse.java:294) */
        maybeReachingVariableUse.getUses(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getUses(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.GraphNode#getAnnotation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: FlowState<ReachingUses> state = n.getAnnotation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetUses_ThrowUnsupportedOperationException() throws Exception  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        Object linkedDirectedGraphNode = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode");
        nodes.put(null, linkedDirectedGraphNode);
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        maybeReachingVariableUse.getUses(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MaybeReachingVariableUse}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MaybeReachingVariableUse#getUses(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(n);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetUses_ThrowNullPointerException_4() throws Throwable  {
        MaybeReachingVariableUse maybeReachingVariableUse = ((MaybeReachingVariableUse) createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(maybeReachingVariableUse, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class maybeReachingVariableUseClazz = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getUsesMethod = maybeReachingVariableUseClazz.getDeclaredMethod("getUses", stringType, numberNodeType);
        getUsesMethod.setAccessible(true);
        java.lang.Object[] getUsesMethodArguments = new java.lang.Object[2];
        getUsesMethodArguments[0] = ((Object) null);
        getUsesMethodArguments[1] = numberNode;
        try {
            getUsesMethod.invoke(maybeReachingVariableUse, getUsesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields882222061994400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields882222061994400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass882222062006100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields882222061994400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass882222062006100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

