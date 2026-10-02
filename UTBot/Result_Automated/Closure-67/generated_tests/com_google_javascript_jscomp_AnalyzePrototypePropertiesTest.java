package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_AnalyzePrototypePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        analyzePrototypeProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        analyzePrototypeProperties.process(functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        analyzePrototypeProperties.process(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        JSModule firstModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "firstModule", firstModule);
        AnalyzePrototypeProperties.NameInfo externNode = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "externNode", externNode);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        analyzePrototypeProperties.process(scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        JSModule firstModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "firstModule", firstModule);
        AnalyzePrototypeProperties.NameInfo externNode = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "externNode", externNode);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        analyzePrototypeProperties.process(functionNode, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:147) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "compiler", compiler);
        JSModule firstModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "firstModule", firstModule);
        AnalyzePrototypeProperties.NameInfo externNode = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "externNode", externNode);
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        propertyNameInfo.put(null, nameInfo);
        String string = "";
        LinkedList linkedList = new LinkedList();
        propertyNameInfo.put(string, linkedList);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", functionNodeType, functionNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = functionNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.returnsFrom {@code return map.get(name);}
 *  */
    @Test
    public void testGetNameInfoForName_TypeEqualsPROPERTY() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        propertyNameInfo.put(null, null);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        AnalyzePrototypeProperties.NameInfo actual = ((AnalyzePrototypeProperties.NameInfo) getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): False}
 * @utbot.returnsFrom {@code return map.get(name);}
 *  */
    @Test
    public void testGetNameInfoForName_TypeNotEqualsPROPERTY() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        LinkedHashMap varNameInfo = new LinkedHashMap();
        varNameInfo.put(null, null);
        String string = "";
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        varNameInfo.put(string, nameInfo);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "varNameInfo", varNameInfo);
        
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        AnalyzePrototypeProperties.NameInfo actual = ((AnalyzePrototypeProperties.NameInfo) getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.executesCondition {@code (map.containsKey(name)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.LinkedDirectedGraph#createNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: symbolGraph.createNode(nameInfo);
 *  */
    @Test
    public void testGetNameInfoForName_ThrowClassCastException() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        NameReferenceGraph symbolGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "symbolGraph", symbolGraph);
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo cannot be cast to class com.google.javascript.jscomp.NameReferenceGraph$Name (com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo and com.google.javascript.jscomp.NameReferenceGraph$Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.NameReferenceGraph.createNode(NameReferenceGraph.java:59)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:183) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: map.containsKey(name)
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:178) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: map.containsKey(name)
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException_1() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:178) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.executesCondition {@code (map.containsKey(name)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.LinkedDirectedGraph#createNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: symbolGraph.createNode(nameInfo);
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException_2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:183) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllNameInfo()
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getAllNameInfo()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<NameInfo> result = Lists.newArrayList(propertyNameInfo.values());
 *  */
    @Test
    public void testGetAllNameInfo_ThrowNullPointerException() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo(AnalyzePrototypeProperties.java:163) */
        analyzePrototypeProperties.getAllNameInfo();
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getAllNameInfo()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Iterable)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.addAll(varNameInfo.values());
 *  */
    @Test
    public void testGetAllNameInfo_ThrowNullPointerException_1() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo(AnalyzePrototypeProperties.java:164) */
        analyzePrototypeProperties.getAllNameInfo();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields895265868003400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields895265868003400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass895265868009600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields895265868003400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass895265868009600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

