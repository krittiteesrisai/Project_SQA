package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Function;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_ClosureReverseAbstractInterpreterTest {
    ///region Test suites for executable com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope, com.google.common.base.Function, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testRestrictParameter_TypeEqualsNull_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, flowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = true;
        FlowScope actual = ((FlowScope) restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testRestrictParameter_TypeEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, jSTypeType, flowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = ((Object) null);
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        FlowScope actual = ((FlowScope) restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#createChildFlowScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testRestrictParameter_TypeNotEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(flattened, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", stringNodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = stringNode;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        LinkedFlowScope actual = ((LinkedFlowScope) restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 1);
        Object lastSlot = createInstance("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot");
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "name", str);
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "type", anonymousFunctionType);
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "inferred", true);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot", lastSlot);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope, com.google.common.base.Function, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = restriction.apply(new TypeRestriction(type, outcome));
 *  */
    @Test
    public void testRestrictParameter_ThrowClassCastException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object liveVariableJoinOp = createInstance("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction cannot be cast to class java.util.List (com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableJoinOp.apply(LiveVariablesAnalysis.java:53)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:231) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class liveVariableJoinOpType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, jSTypeType, flowScopeType, liveVariableJoinOpType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = ((Object) null);
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = liveVariableJoinOp;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = restriction.apply(new TypeRestriction(type, outcome));
 *  */
    @Test
    public void testRestrictParameter_ThrowClassCastException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object reachingUsesJoinOp = createInstance("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUsesJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction cannot be cast to class java.util.List (com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUsesJoinOp.apply(MaybeReachingVariableUse.java:119)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:231) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class reachingUsesJoinOpType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, jSTypeType, flowScopeType, reachingUsesJoinOpType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = ((Object) null);
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = reachingUsesJoinOp;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = restriction.apply(new TypeRestriction(type, outcome));
 *  */
    @Test
    public void testRestrictParameter_ThrowClassCastException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Function anonymousFunction = ((Function) createInstance("com.google.common.collect.Iterables$3"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction cannot be cast to class java.lang.Iterable (com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e; java.lang.Iterable is in module java.base of loader 'bootstrap')]
            com.google.common.collect.Iterables$3.apply(Iterables.java:424)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:231) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, jSTypeType, flowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = ((Object) null);
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testRestrictParameter_ThrowNullPointerException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:235) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, flowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = restriction.apply(new TypeRestriction(type, outcome));
 *  */
    @Test
    public void testRestrictParameter_ThrowNullPointerException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:231) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, jSTypeType, flowScopeType, functionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = ((Object) null);
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = ((Object) null);
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testRestrictParameter_ThrowNullPointerException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:235) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, namedTypeType, flowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = namedType;
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testRestrictParameter_ThrowNullPointerException_3() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:235) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, namedTypeType, flowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = namedType;
        restrictParameterMethodArguments[2] = ((Object) null);
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testRestrictParameter_ThrowNullPointerException_4() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object lastSlot = createInstance("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot", lastSlot);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.allFlowSlots(LinkedFlowScope.java:358)
            com.google.javascript.jscomp.LinkedFlowScope.access$500(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:416)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:164)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.restrictParameter(ClosureReverseAbstractInterpreter.java:235) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = ((Object) null);
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope, com.google.common.base.Function, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: declareNameInScope(informed, parameter, type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRestrictParameter_ThrowIllegalArgumentException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", functionNodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = functionNode;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, parameter, type);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRestrictParameter_ThrowUnsupportedOperationException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = new Node(38);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNameInScope(informed, parameter, type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRestrictParameter_ThrowIllegalStateException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = new Node(-255);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRestrictParameter_ThrowUnsupportedOperationException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNameInScope(informed, parameter, type);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRestrictParameter_ThrowNullPointerException_6() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", scriptOrFnNodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = scriptOrFnNode;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#restrictParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope,com.google.common.base.Function,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNameInScope(informed, parameter, type);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRestrictParameter_ThrowNullPointerException_5() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType1 = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, anonymousFunctionTypeType, linkedFlowScopeType, anonymousFunctionType1, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = anonymousFunctionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope, com.google.common.base.Function, boolean)
    
    @Test
    public void testRestrictParameter1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Object initialLinkedFlowScopeFlattened = getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", stringNodeType, functionTypeType, linkedFlowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = stringNode;
        restrictParameterMethodArguments[1] = functionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        LinkedFlowScope actual = ((LinkedFlowScope) restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache1 = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(cache1, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "linkedEquivalent", linkedFlowScope);
        HashMap symbols1 = new HashMap();
        setField(cache1, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols1);
        HashSet dirtySymbols = new HashSet();
        dirtySymbols.add(null);
        setField(cache1, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache1);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 1);
        Object lastSlot = createInstance("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot");
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "type", functionType);
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "inferred", true);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot", lastSlot);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        Object finalLinkedFlowScopeFlattened = getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertFalse(initialLinkedFlowScopeFlattened == finalLinkedFlowScopeFlattened);
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method restrictParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope, com.google.common.base.Function, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testRestrictParameter2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, functionTypeType, linkedFlowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = functionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testRestrictParameter3() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = new Node(38);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", this$0);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Class booleanType = boolean.class;
        Method restrictParameterMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("restrictParameter", nodeType, functionTypeType, linkedFlowScopeType, anonymousFunctionType, booleanType);
        restrictParameterMethod.setAccessible(true);
        java.lang.Object[] restrictParameterMethodArguments = new java.lang.Object[5];
        restrictParameterMethodArguments[0] = node;
        restrictParameterMethodArguments[1] = functionType;
        restrictParameterMethodArguments[2] = linkedFlowScope;
        restrictParameterMethodArguments[3] = anonymousFunction;
        restrictParameterMethodArguments[4] = false;
        try {
            restrictParameterMethod.invoke(closureReverseAbstractInterpreter, restrictParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_5() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = new Node(-255);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): True}
 * @utbot.executesCondition {@code (condition.getChildCount() == 2): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetChildCountNotEquals2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(37);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(16);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(51);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_6() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(functionNode, null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetTypeNotEqualsCALL_7() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(functionNode, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): True}
 * @utbot.executesCondition {@code (condition.getChildCount() == 2): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ConditionGetChildCountNotEquals2_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (condition.getType() == CALL): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getChildCount()} once
    /// execute conditions:
    ///     {@code (condition.getChildCount() == 2): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getLastChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): True}
 * @utbot.executesCondition {@code (param.isQualifiedName()): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NotParamIsQualifiedName() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(scriptOrFnNode, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): True}
 * @utbot.executesCondition {@code (param.isQualifiedName()): True}
 * @utbot.executesCondition {@code (paramType != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ParamTypeEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(scriptOrFnNode, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_CalleeGetTypeNotEqualsGETPROP() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): True}
 * @utbot.executesCondition {@code (param.isQualifiedName()): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NotParamIsQualifiedName_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        FlowScope actual = closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: condition.getType() == CALL && condition.getChildCount() == 2
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:203) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): True}
 * @utbot.executesCondition {@code (condition.getChildCount() == 2): True}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: callee.getType() == GETPROP && param.isQualifiedName()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:206) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:365)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:169)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:108)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:223) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:365)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:178)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:108)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:223) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(38);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowIllegalStateException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_5() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): True}
 * @utbot.executesCondition {@code (condition.getChildCount() == 2): True}
 * @utbot.executesCondition {@code (callee.getType() == GETPROP): True}
 * @utbot.executesCondition {@code (param.isQualifiedName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType paramType = getTypeIfRefinable(param, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(scriptOrFnNode, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getType() == CALL): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(15);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(scriptOrFnNode, null, true);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:494)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:149)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:310)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:175)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:108)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:223) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(15);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:494)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:149)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:269)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:262)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:230)
            com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:108)
            com.google.javascript.jscomp.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:223) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(functionNode, linkedFlowScope, true);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields910115733755800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields910115733755800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass910115733764300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910115733755800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910115733764300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields910115734766500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields910115734766500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass910115734770400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910115734766500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910115734770400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

