package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.PhaseOptimizer.NamedPass;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_UnreachableCodeEliminationTest {
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.process
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess_ThrowUnsupportedOperationException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        
        unreachableCodeElimination.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess_ThrowUnsupportedOperationException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(null, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        
        unreachableCodeElimination.process(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 2;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", -2147483645);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        compiler.jsRoot = jsRoot;
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 2;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = Integer.MIN_VALUE;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 56);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = Integer.MIN_VALUE;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        
        unreachableCodeElimination.process(node, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = Integer.MIN_VALUE;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        
        unreachableCodeElimination.process(node, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        compiler.jsRoot = jsRoot;
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        
        unreachableCodeElimination.process(node, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess7() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        PhaseOptimizer.NamedPass namedPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        Integer integer = 1;
        lastRuns.put(namedPass, integer);
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess8() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = Integer.MIN_VALUE;
        lastRuns.put(currentPass, integer);
        PhaseOptimizer.NamedPass namedPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        lastRuns.put(namedPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node node = new Node(0);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess10() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(currentPass, integer);
        lastRuns.put(null, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(currentPass, integer);
        PhaseOptimizer.NamedPass namedPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        lastRuns.put(namedPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        Node node1 = new Node(0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        unreachableCodeElimination.process(node, node1);
    }
    
    @Test(timeout = 1000L)
    public void testProcess12() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(jsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        compiler.jsRoot = jsRoot;
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        LinkedHashMap lastRuns = new LinkedHashMap();
        Integer integer = 1;
        lastRuns.put(null, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess13() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(ControlFlowAnalysis.java:797)
            com.google.javascript.jscomp.ControlFlowAnalysis.process(ControlFlowAnalysis.java:154)
            com.google.javascript.jscomp.UnreachableCodeElimination$1.visit(UnreachableCodeElimination.java:72)
            com.google.javascript.jscomp.NodeTraversal.traverseChangedFunctions(NodeTraversal.java:469)
            com.google.javascript.jscomp.UnreachableCodeElimination.process(UnreachableCodeElimination.java:66) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess14() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        PhaseOptimizer.NamedPass namedPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        Integer integer = 0;
        lastRuns.put(namedPass, integer);
        lastRuns.put(currentPass, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(ControlFlowAnalysis.java:797)
            com.google.javascript.jscomp.ControlFlowAnalysis.process(ControlFlowAnalysis.java:154)
            com.google.javascript.jscomp.UnreachableCodeElimination$1.visit(UnreachableCodeElimination.java:72)
            com.google.javascript.jscomp.NodeTraversal.traverseChangedFunctions(NodeTraversal.java:469)
            com.google.javascript.jscomp.UnreachableCodeElimination.process(UnreachableCodeElimination.java:66) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = unreachableCodeEliminationClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(unreachableCodeElimination, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess15() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        PhaseOptimizer.NamedPass currentPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentPass", currentPass);
        LinkedHashMap lastRuns = new LinkedHashMap();
        PhaseOptimizer.NamedPass namedPass = ((PhaseOptimizer.NamedPass) createInstance("com.google.javascript.jscomp.PhaseOptimizer$NamedPass"));
        Integer integer = 0;
        lastRuns.put(namedPass, integer);
        lastRuns.put(null, integer);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "lastRuns", lastRuns);
        compiler.setPhaseOptimizer(phaseOptimizer);
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(compiler, false);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PhaseOptimizer.hasScopeChanged(PhaseOptimizer.java:324)
            com.google.javascript.jscomp.Compiler.hasScopeChanged(Compiler.java:2011)
            com.google.javascript.jscomp.NodeTraversal.traverseChangedFunctions(NodeTraversal.java:468)
            com.google.javascript.jscomp.UnreachableCodeElimination.process(UnreachableCodeElimination.java:66) */
        unreachableCodeElimination.process(null, node);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields907431289679500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields907431289679500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass907431289686100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields907431289679500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass907431289686100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

