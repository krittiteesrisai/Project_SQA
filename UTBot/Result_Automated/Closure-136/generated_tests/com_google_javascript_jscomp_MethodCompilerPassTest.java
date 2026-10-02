package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.MethodCompilerPass.SignatureStore;
import com.google.common.collect.ArrayListMultimap;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_MethodCompilerPassTest {
    ///region Test suites for executable com.google.javascript.jscomp.MethodCompilerPass.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: externMethods.clear();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:68) */
        inlineGetters.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: externMethodsWithoutSignatures.clear();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        LinkedHashSet externMethods = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethods", externMethods);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:69) */
        methodCheck.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getSignatureStore().reset();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        LinkedHashSet externMethods = new LinkedHashSet();
        String string = "\u0000";
        externMethods.add(string);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethods", externMethods);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethods);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:70) */
        methodCheck.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MethodCompilerPass.SignatureStore#reset()}
 * @utbot.invokes {@link com.google.common.collect.Multimap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: methodDefinitions.clear();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        MethodCompilerPass.SignatureStore signatureCallback = ((MethodCompilerPass.SignatureStore) createInstance("com.google.javascript.jscomp.InlineGetters$1"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethods = new LinkedHashSet();
        String string = "";
        externMethods.add(string);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethods", externMethods);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethods);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:71) */
        methodCheck.process(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        ArrayListMultimap methodSignatures = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(methodSignatures, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(this$0, "com.google.javascript.jscomp.MethodCheck", "methodSignatures", methodSignatures);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethods = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethods", externMethods);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethods);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:71) */
        methodCheck.process(null, null);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        ArrayListMultimap methodSignatures = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        LinkedHashMap map = new LinkedHashMap();
        String string = "";
        map.put(string, null);
        setField(methodSignatures, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(this$0, "com.google.javascript.jscomp.MethodCheck", "methodSignatures", methodSignatures);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethods = new LinkedHashSet();
        externMethods.add(string);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethods", externMethods);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethods);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.process] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.clear(AbstractMultimap.java:323)
            com.google.common.collect.ArrayListMultimap.clear(ArrayListMultimap.java:61)
            com.google.javascript.jscomp.MethodCheck$Store.reset(MethodCheck.java:114)
            com.google.javascript.jscomp.MethodCompilerPass.process(MethodCompilerPass.java:70) */
        methodCheck.process(null, node);
    }
    ///endregion
    
    ///region Errors report for process
    
    public void testProcess_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MethodCompilerPass.addSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (externMethodsWithoutSignatures.contains(name)): True}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddSignature_ExternMethodsWithoutSignaturesContains() throws Exception  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        externMethodsWithoutSignatures.add(null);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = ((Object) null);
        addSignatureMethodArguments[2] = ((Object) null);
        addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: externMethodsWithoutSignatures.contains(name)
 *  */
    @Test
    public void testAddSignature_ThrowNullPointerException() throws Throwable  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:131) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = ((Object) null);
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(inlineGetters, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (externMethodsWithoutSignatures.contains(name)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getSignatureStore().addSignature(name, function, fnSourceName);
 *  */
    @Test
    public void testAddSignature_ThrowNullPointerException_1() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:135) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = ((Object) null);
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (externMethodsWithoutSignatures.contains(name)): False}
 * @utbot.invokes {@link com.google.common.collect.Multimap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: methodDefinitions.put(name, function);
 *  */
    @Test
    public void testAddSignature_ThrowNullPointerException_2() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        MethodCompilerPass.SignatureStore signatureCallback = ((MethodCompilerPass.SignatureStore) createInstance("com.google.javascript.jscomp.InlineGetters$1"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:136) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = ((Object) null);
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (externMethodsWithoutSignatures.contains(name)): False}
 * @utbot.invokes {@link com.google.common.collect.Multimap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: methodDefinitions.put(name, function);
 *  */
    @Test
    public void testAddSignature_ThrowNullPointerException_3() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        MethodCompilerPass.SignatureStore signatureCallback = ((MethodCompilerPass.SignatureStore) createInstance("com.google.javascript.jscomp.InlineGetters$1"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        ArrayListMultimap methodDefinitions = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "methodDefinitions", methodDefinitions);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addSignature] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:136) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = ((Object) null);
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (externMethodsWithoutSignatures.contains(name)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getSignatureStore().addSignature(name, function, fnSourceName);
 *  */
    @Test
    public void testAddSignature_ThrowNullPointerException_4() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        ArrayListMultimap methodSignatures = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(this$0, "com.google.javascript.jscomp.MethodCheck", "methodSignatures", methodSignatures);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(this$0, "com.google.javascript.jscomp.MethodCompilerPass", "compiler", compiler);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addSignature] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.jscomp.MethodCheck$Store.addSignature(MethodCheck.java:100)
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:135) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = node;
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: getSignatureStore().addSignature(name, function, fnSourceName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddSignature_ThrowIllegalStateException() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(this$0, "com.google.javascript.jscomp.MethodCompilerPass", "compiler", compiler);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        Node node = new Node(-255);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = node;
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: getSignatureStore().addSignature(name, function, fnSourceName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddSignature_ThrowIllegalStateException_1() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(this$0, "com.google.javascript.jscomp.MethodCompilerPass", "compiler", compiler);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = node;
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getSignatureStore().addSignature(name, function, fnSourceName);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddSignature_ThrowUnsupportedOperationException() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(this$0, "com.google.javascript.jscomp.MethodCompilerPass", "compiler", compiler);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addSignature", stringType, nodeType, stringType);
        addSignatureMethod.setAccessible(true);
        java.lang.Object[] addSignatureMethodArguments = new java.lang.Object[3];
        addSignatureMethodArguments[0] = ((Object) null);
        addSignatureMethodArguments[1] = node;
        addSignatureMethodArguments[2] = ((Object) null);
        try {
            addSignatureMethod.invoke(methodCheck, addSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for addSignature
    
    public void testAddSignature_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPossibleSignature(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (node.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (!signatureAdded): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link java.util.Set#add(java.lang.Object)}
 *  */
    @Test
    public void testAddPossibleSignature_NotSignatureAdded() throws Exception  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        LinkedHashSet nonMethodProperties = new LinkedHashSet();
        setField(inlineGetters, "com.google.javascript.jscomp.MethodCompilerPass", "nonMethodProperties", nonMethodProperties);
        String string = "";
        Node node = new Node(-255);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = string;
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        addPossibleSignatureMethod.invoke(inlineGetters, addPossibleSignatureMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (!signatureAdded): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.invokes com.google.javascript.jscomp.MethodCompilerPass#addSignature(java.lang.String,com.google.javascript.rhino.Node,java.lang.String)
 *  */
    @Test
    public void testAddPossibleSignature_SignatureAdded() throws Exception  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        externMethodsWithoutSignatures.add(null);
        setField(inlineGetters, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        Node node = new Node(105);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        addPossibleSignatureMethod.invoke(inlineGetters, addPossibleSignatureMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPossibleSignature(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getType() == Token.FUNCTION
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException() throws Throwable  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:103) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = ((Object) null);
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        try {
            addPossibleSignatureMethod.invoke(inlineGetters, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_1() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (node.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var v = t.getScope().getVar(functionName);
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_8() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:109) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, stringNodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = stringNode;
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (node.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (!signatureAdded): True}
 * @utbot.invokes {@link java.util.Set#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nonMethodProperties.add(name);
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_7() throws Throwable  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:126) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        try {
            addPossibleSignatureMethod.invoke(inlineGetters, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_2() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Node node = new Node(105);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:131)
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_3() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        String string = "";
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:135)
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, scriptOrFnNodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = string;
        addPossibleSignatureMethodArguments[1] = scriptOrFnNode;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_4() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        MethodCompilerPass.SignatureStore signatureCallback = ((MethodCompilerPass.SignatureStore) createInstance("com.google.javascript.jscomp.InlineGetters$1"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        String string = "";
        Node node = new Node(105);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:136)
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = string;
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_5() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        MethodCompilerPass.SignatureStore signatureCallback = ((MethodCompilerPass.SignatureStore) createInstance("com.google.javascript.jscomp.InlineGetters$1"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        ArrayListMultimap methodDefinitions = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "methodDefinitions", methodDefinitions);
        String string = "";
        Node node = new Node(105);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:136)
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = string;
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addSignature(name, node, t.getSourceName());
 *  */
    @Test
    public void testAddPossibleSignature_ThrowNullPointerException_6() throws Throwable  {
        MethodCheck methodCheck = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        Object signatureCallback = createInstance("com.google.javascript.jscomp.MethodCheck$Store");
        MethodCheck this$0 = ((MethodCheck) createInstance("com.google.javascript.jscomp.MethodCheck"));
        ArrayListMultimap methodSignatures = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(this$0, "com.google.javascript.jscomp.MethodCheck", "methodSignatures", methodSignatures);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(this$0, "com.google.javascript.jscomp.MethodCompilerPass", "compiler", compiler);
        setField(signatureCallback, "com.google.javascript.jscomp.MethodCheck$Store", "this$0", this$0);
        setField(methodCheck, "com.google.javascript.jscomp.MethodCheck", "signatureCallback", signatureCallback);
        LinkedHashSet externMethodsWithoutSignatures = new LinkedHashSet();
        setField(methodCheck, "com.google.javascript.jscomp.MethodCompilerPass", "externMethodsWithoutSignatures", externMethodsWithoutSignatures);
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.jscomp.MethodCheck$Store.addSignature(MethodCheck.java:100)
            com.google.javascript.jscomp.MethodCompilerPass.addSignature(MethodCompilerPass.java:135)
            com.google.javascript.jscomp.MethodCompilerPass.addPossibleSignature(MethodCompilerPass.java:105) */
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = string;
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = nodeTraversal;
        try {
            addPossibleSignatureMethod.invoke(methodCheck, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addPossibleSignature(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MethodCompilerPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MethodCompilerPass#addPossibleSignature(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (node.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (node.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String functionName = node.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddPossibleSignature_ThrowUnsupportedOperationException() throws Throwable  {
        InlineGetters inlineGetters = ((InlineGetters) createInstance("com.google.javascript.jscomp.InlineGetters"));
        Node node = new Node(38);
        
        Class methodCompilerPassClazz = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method addPossibleSignatureMethod = methodCompilerPassClazz.getDeclaredMethod("addPossibleSignature", stringType, nodeType, nodeTraversalType);
        addPossibleSignatureMethod.setAccessible(true);
        java.lang.Object[] addPossibleSignatureMethodArguments = new java.lang.Object[3];
        addPossibleSignatureMethodArguments[0] = ((Object) null);
        addPossibleSignatureMethodArguments[1] = node;
        addPossibleSignatureMethodArguments[2] = ((Object) null);
        try {
            addPossibleSignatureMethod.invoke(inlineGetters, addPossibleSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for addPossibleSignature
    
    public void testAddPossibleSignature_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields909763652893700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields909763652893700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass909763652903800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909763652893700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909763652903800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

