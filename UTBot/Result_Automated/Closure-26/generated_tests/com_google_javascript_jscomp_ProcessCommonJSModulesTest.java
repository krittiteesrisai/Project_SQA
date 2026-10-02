package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.InputId;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_ProcessCommonJSModulesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeSourceName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.executesCondition {@code (filename.indexOf(filenamePrefix) == 0): False}
 * @utbot.returnsFrom {@code return filename;}
 *  */
    @Test
    public void testNormalizeSourceName_FilenameIndexOfNotEqualsZero() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "  ";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = " ";
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = string;
        String actual = ((String) normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.executesCondition {@code (filename.indexOf(filenamePrefix) == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return filename;}
 *  */
    @Test
    public void testNormalizeSourceName_FilenameIndexOfEqualsZero() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "";
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = string;
        String actual = ((String) normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeSourceName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: filename.indexOf(filenamePrefix) == 0
 *  */
    @Test
    public void testNormalizeSourceName_ThrowNullPointerException() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName(ProcessCommonJSModules.java:115) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = ((Object) null);
        try {
            normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toModuleName(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: requiredFilename = requiredFilename.replaceAll("\\.js$", "");
 *  */
    @Test
    public void testToModuleName_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(ProcessCommonJSModules.java:99) */
        ProcessCommonJSModules.toModuleName(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toModuleName(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String,java.lang.String)}
     */
    @Test
    public void testToModuleNameWithNonEmptyStrings() {
        String actual = ProcessCommonJSModules.toModuleName("\\.js$", "(abc");
        
        String expected = "module$$.js$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toModuleName(java.lang.String, java.lang.String)
    
    @Test
    public void testToModuleName1() {
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(ProcessCommonJSModules.java:100) */
        ProcessCommonJSModules.toModuleName(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toModuleName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String)}
     */
    @Test
    public void testToModuleNameWithNonEmptyString() {
        String actual = ProcessCommonJSModules.toModuleName("\u0084");
        
        String expected = "module$\u0084";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessCJSModuleName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#guessCJSModuleName(java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toModuleName(normalizeSourceName(filename));
 *  */
    @Test
    public void testGuessCJSModuleName_ThrowNullPointerException() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName(ProcessCommonJSModules.java:115)
            com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName(ProcessCommonJSModules.java:70) */
        processCommonJSModules.guessCJSModuleName(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method guessCJSModuleName(java.lang.String)
    
    @Test
    public void testGuessCJSModuleName1() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "\u0000\u0000";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "\u0001\u0001\u0001\u0000\u0000";
        
        String actual = processCommonJSModules.guessCJSModuleName(string);
        
        String expected = "module$\u0001\u0001\u0001\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGuessCJSModuleName2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "";
        
        String actual = processCommonJSModules.guessCJSModuleName(string);
        
        String expected = "module$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.getModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModule()
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#getModule()}
 * @utbot.returnsFrom {@code return module;}
 *  */
    @Test
    public void testGetModule_ReturnModule() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        JSModule actual = processCommonJSModules.getModule();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 *  */
    @Test
    public void testProcess_NodeTraversalTraverse() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(processCommonJSModules, processMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        processCommonJSModules.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_5() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(105);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethod.invoke(processCommonJSModules, processMethodArguments);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethod.invoke(processCommonJSModules, processMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess3() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(37);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:66) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess4() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields885348764875900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields885348764875900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass885348764881900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885348764875900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885348764881900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

