package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator;
import java.util.ArrayList;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import java.util.LinkedList;
import java.util.HashSet;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_CrossModuleMethodMotionTest {
    ///region Test suites for executable com.google.javascript.jscomp.CrossModuleMethodMotion.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (moduleGraph != null): False}
 *  */
    @Test
    public void testProcess_ModuleGraphEqualsNull() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        
        crossModuleMethodMotion.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (moduleGraph != null): True}
 * @utbot.executesCondition {@code (moduleGraph.getModuleCount() > 1): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModuleGraph#getModuleCount()}
 *  */
    @Test
    public void testProcess_ModuleGraphGetModuleCountLessOrEqual1() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        
        crossModuleMethodMotion.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: analyzer.process(externRoot, root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        JSModule jSModule1 = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule1);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        crossModuleMethodMotion.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: analyzer.process(externRoot, root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        AnalyzePrototypeProperties analyzer = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "analyzer", analyzer);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        modules.add(null);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148)
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        crossModuleMethodMotion.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: analyzer.process(externRoot, root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        AnalyzePrototypeProperties analyzer = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "analyzer", analyzer);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        modules.add(null);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148)
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = crossModuleMethodMotionClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(crossModuleMethodMotion, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: analyzer.process(externRoot, root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        AnalyzePrototypeProperties analyzer = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "analyzer", analyzer);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        modules.add(null);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148)
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = crossModuleMethodMotionClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(crossModuleMethodMotion, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: analyzer.process(externRoot, root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        AnalyzePrototypeProperties analyzer = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "analyzer", analyzer);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        modules.add(null);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148)
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = crossModuleMethodMotionClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(crossModuleMethodMotion, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        AnalyzePrototypeProperties analyzer = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(analyzer, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "canModifyExterns", true);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "analyzer", analyzer);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashSet modules = new LinkedHashSet();
        modules.add(null);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule);
        JSModule jSModule1 = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules.add(jSModule1);
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "modules", modules);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "moduleGraph", moduleGraph);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152)
            com.google.javascript.jscomp.CrossModuleMethodMotion.process(CrossModuleMethodMotion.java:88) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = crossModuleMethodMotionClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(crossModuleMethodMotion, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method moveMethods(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (!hasStubDeclaration): False}
 *  */
    @Test
    public void testMoveMethods_HasStubDeclaration() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (!hasStubDeclaration): True}
 * @utbot.executesCondition {@code (idGenerator.hasGeneratedAnyIds()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator#hasGeneratedAnyIds()}
 *  */
    @Test
    public void testMoveMethods_NotIdGeneratorHasGeneratedAnyIds() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (!hasStubDeclaration): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 *  */
    @Test
    public void testMoveMethods_NotNameInfoIsReferenced() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        arrayList.add(nameInfo);
        
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): True}
 * @utbot.executesCondition {@code (!hasStubDeclaration): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 *  */
    @Test
    public void testMoveMethods_NameInfoReadsClosureVariables() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "readClosureVariables", true);
        arrayList.add(nameInfo);
        
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.executesCondition {@code (!hasStubDeclaration): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo#getDeepestCommonModuleRef()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo#getDeclarations()}
 * @utbot.invokes {@link java.util.Deque#descendingIterator()}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 *  */
    @Test
    public void testMoveMethods_DeclarationsHasNext() throws Exception  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -256);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        LinkedList declarations = new LinkedList();
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "declarations", declarations);
        JSModule deepestCommonModuleRef = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", deepestCommonModuleRef);
        arrayList.add(nameInfo);
        
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method moveMethods(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(NameInfo nameInfo: allNameInfo)
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_1() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:98) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class collectionType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", collectionType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = ((Object) null);
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(NameInfo nameInfo: allNameInfo)
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_2() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:98) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class collectionType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", collectionType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = ((Object) null);
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator#hasGeneratedAnyIds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasStubDeclaration = idGenerator.hasGeneratedAnyIds();
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:97) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class collectionType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", collectionType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = ((Object) null);
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !nameInfo.isReferenced()
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_3() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -256);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:99) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class hashSetType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", hashSetType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = hashSet;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameInfo.getDeclarations().descendingIterator()
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_8() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        HashSet hashSet = new HashSet();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        JSModule deepestCommonModuleRef = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", deepestCommonModuleRef);
        hashSet.add(nameInfo);
        AnalyzePrototypeProperties.NameInfo nameInfo1 = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        hashSet.add(nameInfo1);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:117) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class hashSetType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", hashSetType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = hashSet;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameInfo.getDeclarations().descendingIterator()
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_4() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        JSModule deepestCommonModuleRef = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", deepestCommonModuleRef);
        arrayList.add(nameInfo);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:117) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.iterates iterate the loop {@code while(declarations.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node value = prop.getValue();
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_5() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        LinkedList declarations = new LinkedList();
        declarations.add(null);
        AnalyzePrototypeProperties.AssignmentProperty assignmentProperty = ((AnalyzePrototypeProperties.AssignmentProperty) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty"));
        declarations.add(assignmentProperty);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "declarations", declarations);
        JSModule deepestCommonModuleRef = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", deepestCommonModuleRef);
        arrayList.add(nameInfo);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty.getAssignNode(AnalyzePrototypeProperties.java:602)
            com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty.getValue(AnalyzePrototypeProperties.java:598)
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:142) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.iterates iterate the loop {@code while(declarations.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: moduleGraph.dependsOn(deepestCommonModuleRef, prop.getModule()) && value.isFunction()
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_7() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        LinkedList declarations = new LinkedList();
        declarations.add(null);
        AnalyzePrototypeProperties.LiteralProperty literalProperty = ((AnalyzePrototypeProperties.LiteralProperty) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty"));
        Node value = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(literalProperty, "com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty", "value", value);
        JSModule module = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(literalProperty, "com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty", "module", module);
        declarations.add(literalProperty);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "declarations", declarations);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", module);
        arrayList.add(nameInfo);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:143) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CrossModuleMethodMotion}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CrossModuleMethodMotion#moveMethods(java.util.Collection)}
 * @utbot.executesCondition {@code (nameInfo.readsClosureVariables()): False}
 * @utbot.executesCondition {@code (deepestCommonModuleRef == null): False}
 * @utbot.iterates iterate the loop {@code for(NameInfo nameInfo: allNameInfo)} once
 * @utbot.iterates iterate the loop {@code while(declarations.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: moduleGraph.dependsOn(deepestCommonModuleRef, prop.getModule()) && value.isFunction()
 *  */
    @Test
    public void testMoveMethods_ThrowNullPointerException_6() throws Throwable  {
        CrossModuleMethodMotion crossModuleMethodMotion = ((CrossModuleMethodMotion) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        CrossModuleMethodMotion.IdGenerator idGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(idGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId", -255);
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.CrossModuleMethodMotion", "idGenerator", idGenerator);
        ArrayList arrayList = new ArrayList();
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced", true);
        LinkedList declarations = new LinkedList();
        Object object = createInstance("java.lang.Object");
        declarations.add(object);
        AnalyzePrototypeProperties.AssignmentProperty assignmentProperty = ((AnalyzePrototypeProperties.AssignmentProperty) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty"));
        Node exprNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(exprNode, "com.google.javascript.rhino.Node", "first", first);
        setField(assignmentProperty, "com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", "exprNode", exprNode);
        JSModule module = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(assignmentProperty, "com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", "module", module);
        declarations.add(assignmentProperty);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "declarations", declarations);
        setField(nameInfo, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "deepestCommonModuleRef", module);
        arrayList.add(nameInfo);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(CrossModuleMethodMotion.java:143) */
        Class crossModuleMethodMotionClazz = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class arrayListType = Class.forName("java.util.Collection");
        Method moveMethodsMethod = crossModuleMethodMotionClazz.getDeclaredMethod("moveMethods", arrayListType);
        moveMethodsMethod.setAccessible(true);
        java.lang.Object[] moveMethodsMethodArguments = new java.lang.Object[1];
        moveMethodsMethodArguments[0] = arrayList;
        try {
            moveMethodsMethod.invoke(crossModuleMethodMotion, moveMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for moveMethods
    
    public void testMoveMethods_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields916179362248900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields916179362248900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass916179362257700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916179362248900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916179362257700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

