package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.util.Map;
import java.util.Set;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.HashSet;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.SpecializeModule.SpecializationState;
import com.google.javascript.jscomp.InlineFunctions.Reference;
import java.util.LinkedList;
import java.util.ArrayDeque;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSType;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_InlineFunctionsTest {
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.process(InlineFunctions.java:107) */
        inlineFunctions.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.process(InlineFunctions.java:107) */
        inlineFunctions.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage#isNormalized()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        
        inlineFunctions.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.trimCanidatesNotMeetingMinimumRequirements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trimCanidatesNotMeetingMinimumRequirements()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#trimCanidatesNotMeetingMinimumRequirements()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testTrimCanidatesNotMeetingMinimumRequirements() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Method trimCanidatesNotMeetingMinimumRequirementsMethod = inlineFunctionsClazz.getDeclaredMethod("trimCanidatesNotMeetingMinimumRequirements");
        trimCanidatesNotMeetingMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] trimCanidatesNotMeetingMinimumRequirementsMethodArguments = new java.lang.Object[0];
        trimCanidatesNotMeetingMinimumRequirementsMethod.invoke(inlineFunctions, trimCanidatesNotMeetingMinimumRequirementsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trimCanidatesNotMeetingMinimumRequirements()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#trimCanidatesNotMeetingMinimumRequirements()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(i = fns.entrySet().iterator(); i.hasNext(); )
 *  */
    @Test
    public void testTrimCanidatesNotMeetingMinimumRequirements_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.trimCanidatesNotMeetingMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.trimCanidatesNotMeetingMinimumRequirements(InlineFunctions.java:643) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Method trimCanidatesNotMeetingMinimumRequirementsMethod = inlineFunctionsClazz.getDeclaredMethod("trimCanidatesNotMeetingMinimumRequirements");
        trimCanidatesNotMeetingMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] trimCanidatesNotMeetingMinimumRequirementsMethodArguments = new java.lang.Object[0];
        try {
            trimCanidatesNotMeetingMinimumRequirementsMethod.invoke(inlineFunctions, trimCanidatesNotMeetingMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.enableSpecialization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enableSpecialization(com.google.javascript.jscomp.SpecializeModule$SpecializationState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState)}
 *  */
    @Test
    public void testEnableSpecialization() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        inlineFunctions.enableSpecialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.getOrCreateFunctionState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOrCreateFunctionState(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getOrCreateFunctionState(java.lang.String)}
 * @utbot.executesCondition {@code (fs == null): True}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return fs;}
 *  */
    @Test
    public void testGetOrCreateFunctionState_FsEqualsNull() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        String string = "";
        
        Object actual = inlineFunctions.getOrCreateFunctionState(string);
        
        Object expected = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        setField(expected, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "inline", true);
        setField(expected, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "remove", true);
        
        Object actualFn = getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "fn");
        assertNull(actualFn);
        
        Node actualSafeFnNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "safeFnNode"));
        assertNull(actualSafeFnNode);
        
        boolean actualInline = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "inline"));
        assertTrue(actualInline);
        
        boolean actualRemove = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "remove"));
        assertTrue(actualRemove);
        
        boolean actualInlineDirectly = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "inlineDirectly"));
        assertFalse(actualInlineDirectly);
        
        boolean actualReferencesThis = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "referencesThis"));
        assertFalse(actualReferencesThis);
        
        boolean actualHasInnerFunctions = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "hasInnerFunctions"));
        assertFalse(actualHasInnerFunctions);
        
        Map actualReferences = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references"));
        assertNull(actualReferences);
        
        JSModule actualModule = ((JSModule) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "module"));
        assertNull(actualModule);
        
        Set actualNamesToAlias = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "namesToAlias"));
        assertNull(actualNamesToAlias);
        
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getOrCreateFunctionState(java.lang.String)}
 * @utbot.executesCondition {@code (fs == null): False}
 * @utbot.returnsFrom {@code return fs;}
 *  */
    @Test
    public void testGetOrCreateFunctionState_FsNotEqualsNull() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(null, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        Object actual = inlineFunctions.getOrCreateFunctionState(null);
        
        Object actualFn = getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "fn");
        assertNull(actualFn);
        
        Node actualSafeFnNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "safeFnNode"));
        assertNull(actualSafeFnNode);
        
        boolean actualInline = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "inline"));
        assertFalse(actualInline);
        
        boolean actualRemove = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "remove"));
        assertFalse(actualRemove);
        
        boolean actualInlineDirectly = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "inlineDirectly"));
        assertFalse(actualInlineDirectly);
        
        boolean actualReferencesThis = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "referencesThis"));
        assertFalse(actualReferencesThis);
        
        boolean actualHasInnerFunctions = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "hasInnerFunctions"));
        assertFalse(actualHasInnerFunctions);
        
        Map actualReferences = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references"));
        assertNull(actualReferences);
        
        JSModule actualModule = ((JSModule) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "module"));
        assertNull(actualModule);
        
        Set actualNamesToAlias = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "namesToAlias"));
        assertNull(actualNamesToAlias);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOrCreateFunctionState(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getOrCreateFunctionState(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionState fs = fns.get(fnName);
 *  */
    @Test
    public void testGetOrCreateFunctionState_ThrowNullPointerException() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.getOrCreateFunctionState] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.getOrCreateFunctionState(InlineFunctions.java:92) */
        inlineFunctions.getOrCreateFunctionState(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.findCalledFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findCalledFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return changed;}
 *  */
    @Test
    public void testFindCalledFunctions_ReturnChanged() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        HashSet actual = ((HashSet) findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments));
        
        HashSet expected = new HashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return changed;}
 *  */
    @Test
    public void testFindCalledFunctions_ReturnChanged_1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        HashSet actual = ((HashSet) findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments));
        
        HashSet expected = new HashSet();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findCalledFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: findCalledFunctions(NodeUtil.getFunctionBody(node), changed);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindCalledFunctions_ThrowIllegalArgumentException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: findCalledFunctions(NodeUtil.getFunctionBody(node), changed);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindCalledFunctions_ThrowUnsupportedOperationException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findCalledFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findCalledFunctions(NodeUtil.getFunctionBody(node), changed);
 *  */
    @Test
    public void testFindCalledFunctions_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.findCalledFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:777)
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:766) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findCalledFunctions(NodeUtil.getFunctionBody(node), changed);
 *  */
    @Test
    public void testFindCalledFunctions_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.findCalledFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:779)
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:785)
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:766) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", scriptOrFnNodeType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[1];
        findCalledFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.findCalledFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findCalledFunctions(com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 *  */
    @Test
    public void testFindCalledFunctions() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = new Node(-255);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = node;
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.iterates iterate the loop {@code for(Node c = node.getFirstChild(); c != null; c = c.getNext())} once
 *  */
    @Test
    public void testFindCalledFunctions_InlineFunctionsFindCalledFunctions() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = node;
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findCalledFunctions(com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getType() == Token.CALL
 *  */
    @Test
    public void testFindCalledFunctions_ThrowNullPointerException1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.findCalledFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:777) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = ((Object) null);
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (child.getType() == Token.NAME): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.iterates iterate the loop {@code for(Node c = node.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findCalledFunctions(c, changed);
 *  */
    @Test
    public void testFindCalledFunctions_ThrowNullPointerException_11() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.findCalledFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:779)
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:785) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = node;
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (node.getType() == Token.CALL): False}
 * @utbot.iterates iterate the loop {@code for(Node c = node.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findCalledFunctions(c, changed);
 *  */
    @Test
    public void testFindCalledFunctions_ThrowNullPointerException_2() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.findCalledFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:779)
            com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(InlineFunctions.java:785) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = node;
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findCalledFunctions(com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(changed != null);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(changed != null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindCalledFunctions_ThrowIllegalArgumentException1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, setType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = ((Object) null);
        findCalledFunctionsMethodArguments[1] = ((Object) null);
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#findCalledFunctions(com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(changed != null);): True}
 * @utbot.executesCondition {@code (node.getType() == Token.CALL): True}
 * @utbot.executesCondition {@code (child.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: changed.add(child.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindCalledFunctions_ThrowUnsupportedOperationException1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method findCalledFunctionsMethod = inlineFunctionsClazz.getDeclaredMethod("findCalledFunctions", nodeType, linkedHashSetType);
        findCalledFunctionsMethod.setAccessible(true);
        java.lang.Object[] findCalledFunctionsMethodArguments = new java.lang.Object[2];
        findCalledFunctionsMethodArguments[0] = node;
        findCalledFunctionsMethodArguments[1] = linkedHashSet;
        try {
            findCalledFunctionsMethod.invoke(inlineFunctions, findCalledFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.resolveInlineConflicts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveInlineConflicts()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflicts()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 *  */
    @Test
    public void testResolveInlineConflicts_CollectionIterator() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Method resolveInlineConflictsMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflicts");
        resolveInlineConflictsMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsMethodArguments = new java.lang.Object[0];
        resolveInlineConflictsMethod.invoke(inlineFunctions, resolveInlineConflictsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInlineConflicts()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflicts()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(FunctionState fs: fns.values())
 *  */
    @Test
    public void testResolveInlineConflicts_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.resolveInlineConflicts] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.resolveInlineConflicts(InlineFunctions.java:725) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Method resolveInlineConflictsMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflicts");
        resolveInlineConflictsMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsMethodArguments = new java.lang.Object[0];
        try {
            resolveInlineConflictsMethod.invoke(inlineFunctions, resolveInlineConflictsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.isCandidateFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCandidateFunction(com.google.javascript.jscomp.InlineFunctions$Function)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.Function#getName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isExported(java.lang.String)}
 *  */
    @Test
    public void testIsCandidateFunction_CodingConventionIsExported() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "_";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        boolean actual = ((Boolean) isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isCandidateFunction(com.google.javascript.jscomp.InlineFunctions$Function)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = fn.getName();
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:329) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", functionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = ((Object) null);
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getCodingConvention().isExported(fnName)
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException_3() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionExpression = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionExpression");
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:330) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionExpressionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", functionExpressionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = functionExpression;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException_5() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
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
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        Object functionExpression = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionExpression");
        String fakeName = "";
        setField(functionExpression, "com.google.javascript.jscomp.InlineFunctions$FunctionExpression", "fakeName", fakeName);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:352) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionExpressionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", functionExpressionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = functionExpression;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getCodingConvention().isExported(fnName)
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:330) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException_4() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:352) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getCodingConvention().isExported(fnName)
 *  */
    @Test
    public void testIsCandidateFunction_ThrowNullPointerException_2() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(InlineFunctions.java:330) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isCandidateFunction(com.google.javascript.jscomp.InlineFunctions$Function)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String fnName = fn.getName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsCandidateFunction_ThrowUnsupportedOperationException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = fn.getName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsCandidateFunction_ThrowIllegalStateException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.executesCondition {@code (specializationState != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.Function#getFunctionNode()}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return injector.doesFunctionMeetMinimumRequirements(fnName, fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsCandidateFunction_ThrowIllegalArgumentException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        FunctionInjector injector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "injector", injector);
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)}
 * @utbot.executesCondition {@code (specializationState != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.Function#getFunctionNode()}
 * @utbot.invokes {@link com.google.javascript.jscomp.SpecializeModule.SpecializationState#canFixupFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !specializationState.canFixupFunction(fn.getFunctionNode())
 *  */
    @Test(expected = NullPointerException.class)
    public void testIsCandidateFunction_ThrowNullPointerException_6() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        SpecializeModule.SpecializationState specializationState = ((SpecializeModule.SpecializationState) createInstance("com.google.javascript.jscomp.SpecializeModule$SpecializationState"));
        SimpleFunctionAliasAnalysis initialModuleAliasAnalysis = ((SimpleFunctionAliasAnalysis) createInstance("com.google.javascript.jscomp.SimpleFunctionAliasAnalysis"));
        setField(specializationState, "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "initialModuleAliasAnalysis", initialModuleAliasAnalysis);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "specializationState", specializationState);
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        fn.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Method isCandidateFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("isCandidateFunction", namedFunctionType);
        isCandidateFunctionMethod.setAccessible(true);
        java.lang.Object[] isCandidateFunctionMethodArguments = new java.lang.Object[1];
        isCandidateFunctionMethodArguments[0] = namedFunction;
        try {
            isCandidateFunctionMethod.invoke(inlineFunctions, isCandidateFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.decomposeExpressions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decomposeExpressions(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#decomposeExpressions(java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getUniqueNameIdSupplier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test
    public void testDecomposeExpressions_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.decomposeExpressions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.decomposeExpressions(InlineFunctions.java:795) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class setType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", setType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = ((Object) null);
        try {
            decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#decomposeExpressions(java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getUniqueNameIdSupplier()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(FunctionState fs: fns.values())
 *  */
    @Test
    public void testDecomposeExpressions_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.decomposeExpressions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.decomposeExpressions(InlineFunctions.java:797) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", linkedHashSetType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = linkedHashSet;
        try {
            decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decomposeExpressions(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#decomposeExpressions(java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getUniqueNameIdSupplier()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler
 *  */
    @Test(expected = NullPointerException.class)
    public void testDecomposeExpressions_ThrowNullPointerException_2() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class setType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", setType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = ((Object) null);
        try {
            decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decomposeExpressions(java.util.Set)
    
    @Test
    public void testDecomposeExpressions1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(null, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", linkedHashSetType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = linkedHashSet;
        decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decomposeExpressions(java.util.Set)
    
    @Test
    public void testDecomposeExpressions2() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        String string = "";
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(string, functionState);
        String string1 = "";
        Object object = createInstance("java.lang.Object");
        fns.put(string1, object);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.decomposeExpressions] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.jscomp.InlineFunctions$FunctionState (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.InlineFunctions$FunctionState is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)]
            com.google.javascript.jscomp.InlineFunctions.decomposeExpressions(InlineFunctions.java:797) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", linkedHashSetType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = linkedHashSet;
        try {
            decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDecomposeExpressions3() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        String string = "";
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(string, functionState);
        fns.put(null, null);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "compiler", compiler);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.decomposeExpressions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.decomposeExpressions(InlineFunctions.java:798) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method decomposeExpressionsMethod = inlineFunctionsClazz.getDeclaredMethod("decomposeExpressions", linkedHashSetType);
        decomposeExpressionsMethod.setAccessible(true);
        java.lang.Object[] decomposeExpressionsMethodArguments = new java.lang.Object[1];
        decomposeExpressionsMethodArguments[0] = linkedHashSet;
        try {
            decomposeExpressionsMethod.invoke(inlineFunctions, decomposeExpressionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#getReferences()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Reference ref: fs.getReferences())
 *  */
    @Test
    public void testVerifyAllReferencesInlined_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined(InlineFunctions.java:835) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method verifyAllReferencesInlinedMethod = inlineFunctionsClazz.getDeclaredMethod("verifyAllReferencesInlined", functionStateType);
        verifyAllReferencesInlinedMethod.setAccessible(true);
        java.lang.Object[] verifyAllReferencesInlinedMethodArguments = new java.lang.Object[1];
        verifyAllReferencesInlinedMethodArguments[0] = ((Object) null);
        try {
            verifyAllReferencesInlinedMethod.invoke(inlineFunctions, verifyAllReferencesInlinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    @Test
    public void testVerifyAllReferencesInlined1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method verifyAllReferencesInlinedMethod = inlineFunctionsClazz.getDeclaredMethod("verifyAllReferencesInlined", functionStateType);
        verifyAllReferencesInlinedMethod.setAccessible(true);
        java.lang.Object[] verifyAllReferencesInlinedMethodArguments = new java.lang.Object[1];
        verifyAllReferencesInlinedMethodArguments[0] = functionState;
        verifyAllReferencesInlinedMethod.invoke(inlineFunctions, verifyAllReferencesInlinedMethodArguments);
        
        Map finalFunctionStateReferences = ((Map) getFieldValue(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references"));
        
        assertNull(finalFunctionStateReferences);
    }
    
    @Test
    public void testVerifyAllReferencesInlined2() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        LinkedHashMap references = new LinkedHashMap();
        setField(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references", references);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method verifyAllReferencesInlinedMethod = inlineFunctionsClazz.getDeclaredMethod("verifyAllReferencesInlined", functionStateType);
        verifyAllReferencesInlinedMethod.setAccessible(true);
        java.lang.Object[] verifyAllReferencesInlinedMethodArguments = new java.lang.Object[1];
        verifyAllReferencesInlinedMethodArguments[0] = functionState;
        verifyAllReferencesInlinedMethod.invoke(inlineFunctions, verifyAllReferencesInlinedMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    @Test
    public void testVerifyAllReferencesInlined3() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        LinkedHashMap references = new LinkedHashMap();
        InlineFunctions.Reference reference = ((InlineFunctions.Reference) createInstance("com.google.javascript.jscomp.InlineFunctions$Reference"));
        references.put(null, reference);
        setField(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references", references);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined(InlineFunctions.java:838) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method verifyAllReferencesInlinedMethod = inlineFunctionsClazz.getDeclaredMethod("verifyAllReferencesInlined", functionStateType);
        verifyAllReferencesInlinedMethod.setAccessible(true);
        java.lang.Object[] verifyAllReferencesInlinedMethodArguments = new java.lang.Object[1];
        verifyAllReferencesInlinedMethodArguments[0] = functionState;
        try {
            verifyAllReferencesInlinedMethod.invoke(inlineFunctions, verifyAllReferencesInlinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trimCanidatesUsingOnCost()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#trimCanidatesUsingOnCost()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testTrimCanidatesUsingOnCost() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        inlineFunctions.trimCanidatesUsingOnCost();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trimCanidatesUsingOnCost()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#trimCanidatesUsingOnCost()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(i = fns.entrySet().iterator(); i.hasNext(); )
 *  */
    @Test
    public void testTrimCanidatesUsingOnCost_ThrowNullPointerException() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost(InlineFunctions.java:656) */
        inlineFunctions.trimCanidatesUsingOnCost();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method trimCanidatesUsingOnCost()
    
    @Test
    public void testTrimCanidatesUsingOnCost1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(null, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        inlineFunctions.trimCanidatesUsingOnCost();
    }
    
    @Test
    public void testTrimCanidatesUsingOnCost2() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(null, functionState);
        String string = "";
        fns.put(string, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        inlineFunctions.trimCanidatesUsingOnCost();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method trimCanidatesUsingOnCost()
    
    @Test
    public void testTrimCanidatesUsingOnCost3() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        String string = "";
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(string, functionState);
        fns.put(null, null);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost(InlineFunctions.java:658) */
        inlineFunctions.trimCanidatesUsingOnCost();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeInlinedFunctions()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#removeInlinedFunctions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 *  */
    @Test
    public void testRemoveInlinedFunctions_CollectionIterator() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        inlineFunctions.removeInlinedFunctions();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeInlinedFunctions()
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#removeInlinedFunctions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(FunctionState fs: fns.values())
 *  */
    @Test
    public void testRemoveInlinedFunctions_ThrowNullPointerException() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions(InlineFunctions.java:812) */
        inlineFunctions.removeInlinedFunctions();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeInlinedFunctions()
    
    @Test
    public void testRemoveInlinedFunctions1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(string, functionState);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        fns.put(string1, null);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions(InlineFunctions.java:813) */
        inlineFunctions.removeInlinedFunctions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.getContainingFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContainingFunction(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getContainingFunction(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code ((t.inGlobalScope())): True}
 * @utbot.returnsFrom {@code return (t.inGlobalScope()) ? null : t.getScopeRoot();}
 *  */
    @Test
    public void testGetContainingFunction_TInGlobalScope() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getContainingFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("getContainingFunction", nodeTraversalType);
        getContainingFunctionMethod.setAccessible(true);
        java.lang.Object[] getContainingFunctionMethodArguments = new java.lang.Object[1];
        getContainingFunctionMethodArguments[0] = nodeTraversal;
        Node actual = ((Node) getContainingFunctionMethod.invoke(null, getContainingFunctionMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getContainingFunction(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code ((t.inGlobalScope())): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.returnsFrom {@code return (t.inGlobalScope()) ? null : t.getScopeRoot();}
 *  */
    @Test
    public void testGetContainingFunction_NotTInGlobalScope() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        ScriptOrFnNode rootNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getContainingFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("getContainingFunction", nodeTraversalType);
        getContainingFunctionMethod.setAccessible(true);
        java.lang.Object[] getContainingFunctionMethodArguments = new java.lang.Object[1];
        getContainingFunctionMethodArguments[0] = nodeTraversal;
        ScriptOrFnNode actual = ((ScriptOrFnNode) getContainingFunctionMethod.invoke(null, getContainingFunctionMethodArguments));
        
        int rootNodeEncodedSourceStart = rootNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(rootNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int rootNodeEncodedSourceEnd = rootNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(rootNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int rootNodeBaseLineno = rootNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(rootNodeBaseLineno, actualBaseLineno);
        
        int rootNodeEndLineno = rootNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(rootNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int rootNodeVarStart = ((Integer) getFieldValue(rootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(rootNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int rootNodeType = rootNode.getType();
        int actualType = actual.getType();
        assertEquals(rootNodeType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int rootNodeSourcePosition = rootNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(rootNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContainingFunction(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getContainingFunction(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (t.inGlobalScope())
 *  */
    @Test
    public void testGetContainingFunction_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.getContainingFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.getContainingFunction(InlineFunctions.java:320) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getContainingFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("getContainingFunction", nodeTraversalType);
        getContainingFunctionMethod.setAccessible(true);
        java.lang.Object[] getContainingFunctionMethodArguments = new java.lang.Object[1];
        getContainingFunctionMethodArguments[0] = ((Object) null);
        try {
            getContainingFunctionMethod.invoke(null, getContainingFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#getContainingFunction(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code ((t.inGlobalScope())): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.returnsFrom {@code return (t.inGlobalScope()) ? null : t.getScopeRoot();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (t.inGlobalScope()) ? null : t.getScopeRoot();
 *  */
    @Test
    public void testGetContainingFunction_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.getContainingFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:585)
            com.google.javascript.jscomp.InlineFunctions.getContainingFunction(InlineFunctions.java:320) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getContainingFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("getContainingFunction", nodeTraversalType);
        getContainingFunctionMethod.setAccessible(true);
        java.lang.Object[] getContainingFunctionMethodArguments = new java.lang.Object[1];
        getContainingFunctionMethodArguments[0] = nodeTraversal;
        try {
            getContainingFunctionMethod.invoke(null, getContainingFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testResolveInlineConflictsForFunction_Return() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method resolveInlineConflictsForFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflictsForFunction", functionStateType);
        resolveInlineConflictsForFunctionMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsForFunctionMethodArguments = new java.lang.Object[1];
        resolveInlineConflictsForFunctionMethodArguments[0] = functionState;
        resolveInlineConflictsForFunctionMethod.invoke(inlineFunctions, resolveInlineConflictsForFunctionMethodArguments);
        
        Map finalFunctionStateReferences = ((Map) getFieldValue(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references"));
        
        assertNull(finalFunctionStateReferences);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testResolveInlineConflictsForFunction_Return_1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        LinkedHashMap references = new LinkedHashMap();
        setField(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references", references);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method resolveInlineConflictsForFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflictsForFunction", functionStateType);
        resolveInlineConflictsForFunctionMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsForFunctionMethodArguments = new java.lang.Object[1];
        resolveInlineConflictsForFunctionMethodArguments[0] = functionState;
        resolveInlineConflictsForFunctionMethod.invoke(inlineFunctions, resolveInlineConflictsForFunctionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#hasReferences()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fs.hasReferences()
 *  */
    @Test
    public void testResolveInlineConflictsForFunction_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction(InlineFunctions.java:735) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method resolveInlineConflictsForFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflictsForFunction", functionStateType);
        resolveInlineConflictsForFunctionMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsForFunctionMethodArguments = new java.lang.Object[1];
        resolveInlineConflictsForFunctionMethodArguments[0] = ((Object) null);
        try {
            resolveInlineConflictsForFunctionMethod.invoke(inlineFunctions, resolveInlineConflictsForFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.executesCondition {@code (!fs.hasReferences()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#hasReferences()}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#getFn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node fnNode = fs.getFn().getFunctionNode();
 *  */
    @Test
    public void testResolveInlineConflictsForFunction_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        LinkedHashMap references = new LinkedHashMap();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        InlineFunctions.Reference reference = ((InlineFunctions.Reference) createInstance("com.google.javascript.jscomp.InlineFunctions$Reference"));
        references.put(numberNode, reference);
        setField(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "references", references);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction(InlineFunctions.java:739) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method resolveInlineConflictsForFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("resolveInlineConflictsForFunction", functionStateType);
        resolveInlineConflictsForFunctionMethod.setAccessible(true);
        java.lang.Object[] resolveInlineConflictsForFunctionMethodArguments = new java.lang.Object[1];
        resolveInlineConflictsForFunctionMethodArguments[0] = functionState;
        try {
            resolveInlineConflictsForFunctionMethod.invoke(inlineFunctions, resolveInlineConflictsForFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.inliningLowersCost
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inliningLowersCost(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#inliningLowersCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#getModule()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fs.getModule()
 *  */
    @Test
    public void testInliningLowersCost_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(InlineFunctions.java:699) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method inliningLowersCostMethod = inlineFunctionsClazz.getDeclaredMethod("inliningLowersCost", functionStateType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[1];
        inliningLowersCostMethodArguments[0] = ((Object) null);
        try {
            inliningLowersCostMethod.invoke(inlineFunctions, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#inliningLowersCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#getModule()}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#getFn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fs.getFn().getFunctionNode()
 *  */
    @Test
    public void testInliningLowersCost_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(InlineFunctions.java:700) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method inliningLowersCostMethod = inlineFunctionsClazz.getDeclaredMethod("inliningLowersCost", functionStateType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[1];
        inliningLowersCostMethodArguments[0] = functionState;
        try {
            inliningLowersCostMethod.invoke(inlineFunctions, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.isCandidateUsage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCandidateUsage(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
 *  */
    @Test
    public void testIsCandidateUsage_ParentGetTypeEqualsTokenVAR() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): True}
 *  */
    @Test
    public void testIsCandidateUsage_ParentGetTypeEqualsTokenFUNCTION() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): True}
 * @utbot.executesCondition {@code (parent.getFirstChild() == name): True}
 *  */
    @Test
    public void testIsCandidateUsage_ParentGetFirstChildEqualsName() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): True}
 * @utbot.executesCondition {@code (name.getNext().getType() == Token.STRING): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCandidateUsage_NameGetNextGetTypeNotEqualsTokenSTRING() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCandidateUsage_NameNotEqualsParentGetFirstChild() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(35);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): True}
 * @utbot.executesCondition {@code (parent.getFirstChild() == name): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCandidateUsage_NotNodeUtilIsGet() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): True}
 * @utbot.executesCondition {@code (name.getNext().getType() == Token.STRING): True}
 * @utbot.executesCondition {@code (name.getNext().getString().equals("call")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCandidateUsage_NotNameGetNextGetStringEquals() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = InlineFunctions.isCandidateUsage(functionNode);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isCandidateUsage(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = name.getParent();
 *  */
    @Test
    public void testIsCandidateUsage_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateUsage] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(InlineFunctions.java:419) */
        InlineFunctions.isCandidateUsage(null);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.getType() == Token.NAME);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() == Token.VAR || parent.getType() == Token.FUNCTION
 *  */
    @Test
    public void testIsCandidateUsage_ThrowNullPointerException_1() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateUsage] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(InlineFunctions.java:421) */
        InlineFunctions.isCandidateUsage(functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.getType() == Token.NAME);): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.getNext().getType() == Token.STRING
 *  */
    @Test
    public void testIsCandidateUsage_ThrowNullPointerException_2() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateUsage] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(InlineFunctions.java:442) */
        InlineFunctions.isCandidateUsage(functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.getType() == Token.NAME);): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): True}
 * @utbot.executesCondition {@code (name.getNext().getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.getNext().getString().equals("call")
 *  */
    @Test
    public void testIsCandidateUsage_ThrowNullPointerException_3() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.isCandidateUsage] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(InlineFunctions.java:443) */
        InlineFunctions.isCandidateUsage(functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isCandidateUsage(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.getType() == Token.NAME);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.getType() == Token.NAME);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsCandidateUsage_ThrowIllegalStateException() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        InlineFunctions.isCandidateUsage(functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#isCandidateUsage(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.getType() == Token.NAME);): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.CALL): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(parent)): True}
 * @utbot.executesCondition {@code (name == parent.getFirstChild()): True}
 * @utbot.executesCondition {@code (name.getNext().getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isGet(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: name.getNext().getString().equals("call")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsCandidateUsage_ThrowIllegalStateException_1() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        InlineFunctions.isCandidateUsage(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.maybeAddFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeAddFunction(com.google.javascript.jscomp.InlineFunctions$Function, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function,com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (fs.hasExistingFunctionDefinition()): False}
 * @utbot.executesCondition {@code (fs.canInline()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#canInline()}
 *  */
    @Test
    public void testMaybeAddFunction_NotFsCanInline() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        fns.put(null, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        Object functionExpression = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionExpression");
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionExpressionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method maybeAddFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("maybeAddFunction", functionExpressionType, jSModuleType);
        maybeAddFunctionMethod.setAccessible(true);
        java.lang.Object[] maybeAddFunctionMethodArguments = new java.lang.Object[2];
        maybeAddFunctionMethodArguments[0] = functionExpression;
        maybeAddFunctionMethodArguments[1] = ((Object) null);
        maybeAddFunctionMethod.invoke(inlineFunctions, maybeAddFunctionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function,com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (fs.hasExistingFunctionDefinition()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.FunctionState#setInline(boolean)}
 *  */
    @Test
    public void testMaybeAddFunction_FsHasExistingFunctionDefinition() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        LinkedHashMap fns = new LinkedHashMap();
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object fn = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionExpression");
        setField(functionState, "com.google.javascript.jscomp.InlineFunctions$FunctionState", "fn", fn);
        fns.put(null, functionState);
        setField(inlineFunctions, "com.google.javascript.jscomp.InlineFunctions", "fns", fns);
        Object functionExpression = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionExpression");
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionExpressionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method maybeAddFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("maybeAddFunction", functionExpressionType, jSModuleType);
        maybeAddFunctionMethod.setAccessible(true);
        java.lang.Object[] maybeAddFunctionMethodArguments = new java.lang.Object[2];
        maybeAddFunctionMethodArguments[0] = functionExpression;
        maybeAddFunctionMethodArguments[1] = ((Object) null);
        maybeAddFunctionMethod.invoke(inlineFunctions, maybeAddFunctionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeAddFunction(com.google.javascript.jscomp.InlineFunctions$Function, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function,com.google.javascript.jscomp.JSModule)}
 * @utbot.invokes {@link com.google.javascript.jscomp.InlineFunctions.Function#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = fn.getName();
 *  */
    @Test
    public void testMaybeAddFunction_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.maybeAddFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.maybeAddFunction(InlineFunctions.java:235) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method maybeAddFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("maybeAddFunction", functionType, jSModuleType);
        maybeAddFunctionMethod.setAccessible(true);
        java.lang.Object[] maybeAddFunctionMethodArguments = new java.lang.Object[2];
        maybeAddFunctionMethodArguments[0] = ((Object) null);
        maybeAddFunctionMethodArguments[1] = ((Object) null);
        try {
            maybeAddFunctionMethod.invoke(inlineFunctions, maybeAddFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeAddFunction(com.google.javascript.jscomp.InlineFunctions$Function, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = fn.getName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeAddFunction_ThrowIllegalStateException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method maybeAddFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("maybeAddFunction", namedFunctionType, jSModuleType);
        maybeAddFunctionMethod.setAccessible(true);
        java.lang.Object[] maybeAddFunctionMethodArguments = new java.lang.Object[2];
        maybeAddFunctionMethodArguments[0] = namedFunction;
        maybeAddFunctionMethodArguments[1] = ((Object) null);
        try {
            maybeAddFunctionMethod.invoke(inlineFunctions, maybeAddFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = fn.getName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeAddFunction_ThrowUnsupportedOperationException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object namedFunction = createInstance("com.google.javascript.jscomp.InlineFunctions$NamedFunction");
        ScriptOrFnNode fn = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(fn, "com.google.javascript.rhino.Node", "first", first);
        setField(namedFunction, "com.google.javascript.jscomp.InlineFunctions$NamedFunction", "fn", fn);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class namedFunctionType = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method maybeAddFunctionMethod = inlineFunctionsClazz.getDeclaredMethod("maybeAddFunction", namedFunctionType, jSModuleType);
        maybeAddFunctionMethod.setAccessible(true);
        java.lang.Object[] maybeAddFunctionMethodArguments = new java.lang.Object[2];
        maybeAddFunctionMethodArguments[0] = namedFunction;
        maybeAddFunctionMethodArguments[1] = ((Object) null);
        try {
            maybeAddFunctionMethod.invoke(inlineFunctions, maybeAddFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.mimimizeCost
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mimimizeCost(com.google.javascript.jscomp.InlineFunctions$FunctionState)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#mimimizeCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !inliningLowersCost(fs)
 *  */
    @Test
    public void testMimimizeCost_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.mimimizeCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(InlineFunctions.java:699)
            com.google.javascript.jscomp.InlineFunctions.mimimizeCost(InlineFunctions.java:679) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method mimimizeCostMethod = inlineFunctionsClazz.getDeclaredMethod("mimimizeCost", functionStateType);
        mimimizeCostMethod.setAccessible(true);
        java.lang.Object[] mimimizeCostMethodArguments = new java.lang.Object[1];
        mimimizeCostMethodArguments[0] = ((Object) null);
        try {
            mimimizeCostMethod.invoke(inlineFunctions, mimimizeCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#mimimizeCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !inliningLowersCost(fs)
 *  */
    @Test
    public void testMimimizeCost_ThrowNullPointerException_1() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Object functionState = createInstance("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.mimimizeCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(InlineFunctions.java:700)
            com.google.javascript.jscomp.InlineFunctions.mimimizeCost(InlineFunctions.java:679) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionStateType = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Method mimimizeCostMethod = inlineFunctionsClazz.getDeclaredMethod("mimimizeCost", functionStateType);
        mimimizeCostMethod.setAccessible(true);
        java.lang.Object[] mimimizeCostMethodArguments = new java.lang.Object[1];
        mimimizeCostMethodArguments[0] = functionState;
        try {
            mimimizeCostMethod.invoke(inlineFunctions, mimimizeCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineFunctions.hasLocalNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasLocalNames(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", nodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = node;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_1() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(126);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(105);
        setField(last, "com.google.javascript.rhino.Node", "parent", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_3() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(105);
        setField(last, "com.google.javascript.rhino.Node", "parent", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_2() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_6() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "parent", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_5() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(118);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "first", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(126);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_4() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "parent", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_7() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "parent", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());}
 *  */
    @Test
    public void testHasLocalNames_ReturnNodeUtilGetFnParametersFnNodeHasChildrenOrNodeUtilHas_8() throws Exception  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(125);
        setField(last, "com.google.javascript.rhino.Node", "first", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasLocalNames(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node block = NodeUtil.getFunctionBody(fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasLocalNames_ThrowIllegalArgumentException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        try {
            hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFnParameters(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#has(com.google.javascript.rhino.Node,com.google.common.base.Predicate,com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHasLocalNames_ThrowIllegalStateException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(125);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        try {
            hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasLocalNames(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link InlineFunctions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.InlineFunctions#hasLocalNames(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionBody(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFnParameters(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NodeUtil.getFnParameters(fnNode).hasChildren() || NodeUtil.has(block, new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());
 *  */
    @Test
    public void testHasLocalNames_ThrowNullPointerException() throws Throwable  {
        InlineFunctions inlineFunctions = ((InlineFunctions) createInstance("com.google.javascript.jscomp.InlineFunctions"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineFunctions.hasLocalNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineFunctions.hasLocalNames(InlineFunctions.java:308) */
        Class inlineFunctionsClazz = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hasLocalNamesMethod = inlineFunctionsClazz.getDeclaredMethod("hasLocalNames", functionNodeType);
        hasLocalNamesMethod.setAccessible(true);
        java.lang.Object[] hasLocalNamesMethodArguments = new java.lang.Object[1];
        hasLocalNamesMethodArguments[0] = functionNode;
        try {
            hasLocalNamesMethod.invoke(inlineFunctions, hasLocalNamesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields915021431929000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields915021431929000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass915021431936500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915021431929000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915021431936500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields915021432210200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields915021432210200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass915021432212300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915021432210200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915021432212300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

