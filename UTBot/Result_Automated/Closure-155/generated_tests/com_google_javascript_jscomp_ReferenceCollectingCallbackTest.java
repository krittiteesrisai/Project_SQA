package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import java.util.ArrayList;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.ArrayDeque;
import java.util.LinkedList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.InlineVariables.Mode;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_ReferenceCollectingCallbackTest {
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.addReference
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ReferenceCollection referenceInfo = referenceMap.get(v);
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:201) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethodArguments[2] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.executesCondition {@code (referenceInfo == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection#add(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException_1() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
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
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:276)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:204) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = var;
        addReferenceMethodArguments[2] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    @Test
    public void testAddReference1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = nodeTraversal;
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethodArguments[2] = reference;
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    @Test
    public void testAddReference2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        ArrayList references = new ArrayList();
        setField(referenceCollection, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", "references", references);
        referenceMap.put(null, referenceCollection);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethodArguments[2] = reference;
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    @Test
    public void testAddReference3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        referenceMap.put(var, null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nameNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nameNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = nameNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = nodeTraversal;
        addReferenceMethodArguments[1] = var1;
        addReferenceMethodArguments[2] = reference;
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    @Test
    public void testAddReference4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        referenceMap.put(null, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, stringNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = stringNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = nodeTraversal;
        addReferenceMethodArguments[1] = var1;
        addReferenceMethodArguments[2] = reference;
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    @Test
    public void testAddReference5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        ArrayList references = new ArrayList();
        setField(referenceCollection, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", "references", references);
        referenceMap.put(var, referenceCollection);
        Scope.Var var1 = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var1, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode1);
        referenceMap.put(var1, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nameNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nameNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = nameNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var2 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = var2;
        addReferenceMethodArguments[2] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    @Test
    public void testAddReference6() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
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
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:276)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:201) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = nodeTraversal;
        addReferenceMethodArguments[1] = var1;
        addReferenceMethodArguments[2] = reference;
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    @Test
    public void testEnterScope1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(nodeTraversal);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        scopeRoots.add(stringNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        scopes1.put(stringNode, null);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        SyntacticScopeCreator delegate = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object oldErrorReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter", oldErrorReporter);
        setField(delegate, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        String sourceName = "";
        setField(delegate, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.NodeTraversal cannot be cast to class com.google.javascript.rhino.Node (com.google.javascript.jscomp.NodeTraversal and com.google.javascript.rhino.Node are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:563)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(referenceCollectingCallback);
        scopes.add(referenceCollectingCallback);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:140) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(NodeUtil.java:1875)
            com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(NodeUtil.java:1884)
            com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock.<init>(ReferenceCollectingCallback.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:141) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopeRoots.add(scope);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:563)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        scopeRoots.add(objectArray);
        scopeRoots.add(objectArray);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        MemoizedScopeCreator delegate = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(delegate, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:563)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope6() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:563)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope7() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        scopeRoots.add(stringNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        TypedScopeCreator delegate = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:324)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:235)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:188)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:563)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:139) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    @Test(expected = IllegalStateException.class)
    public void testEnterScope8() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes1.put(null, scope);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scopes1.put(scriptOrFnNode, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsBlockBoundary_ReturnTrue() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.getType() == Token.CASE;}
 *  */
    @Test
    public void testIsBlockBoundary_NGetTypeNotEqualsTokenCASE() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", functionNodeType, functionNodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = functionNode;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.getType() == Token.CASE;}
 *  */
    @Test
    public void testIsBlockBoundary_NGetTypeEqualsTokenCASE() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(111);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", scriptOrFnNodeType, scriptOrFnNodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = scriptOrFnNode;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.returnsFrom {@code return n != parent.getFirstChild();}
 *  */
    @Test
    public void testIsBlockBoundary_NNotEqualsParentGetFirstChild() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(98);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.returnsFrom {@code return n != parent.getFirstChild();}
 *  */
    @Test
    public void testIsBlockBoundary_NEqualsParentGetFirstChild() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(98);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getType() == Token.CASE;
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException_1() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:196) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        try {
            isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getType() == Token.CASE;
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:196) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        try {
            isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: blockStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:148) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:148) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior#afterExitScope(com.google.javascript.jscomp.NodeTraversal,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: behavior.afterExitScope(t, referenceMap);
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object behavior = createInstance("com.google.javascript.jscomp.InlineVariables$InliningBehavior");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        InlineVariables.Mode mode = InlineVariables.Mode.CONSTANTS_ONLY;
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        setField(behavior, "com.google.javascript.jscomp.InlineVariables$InliningBehavior", "this$0", this$0);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "behavior", behavior);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.doInlinesForScope(InlineVariables.java:199)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.afterExitScope(InlineVariables.java:162)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:149) */
        referenceCollectingCallback.exitScope(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, null, functionNode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(114);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(113);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(119);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(113);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_6() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(113);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(100);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", parent);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_7() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(100);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", parent);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlockBoundary(n, parent)
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:196)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:158) */
        referenceCollectingCallback.shouldTraverse(null, null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlockBoundary(n, parent)
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:196)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:158) */
        referenceCollectingCallback.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(115);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:159) */
        referenceCollectingCallback.shouldTraverse(null, null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:159) */
        referenceCollectingCallback.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:159) */
        referenceCollectingCallback.shouldTraverse(null, null, functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(119);
        
        referenceCollectingCallback.shouldTraverse(null, functionNode, functionNode1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getReferencedVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferencedVariables()
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferencedVariables()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.returnsFrom {@code return referenceMap.keySet();}
 *  */
    @Test
    public void testGetReferencedVariables_MapKeySet() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        
        Set actual = referenceCollectingCallback.getReferencedVariables();
        
        Set expected = new LinkedHashSet();
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nameNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nameNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = nameNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        expected.add(var1);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferencedVariables()
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferencedVariables()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return referenceMap.keySet();
 *  */
    @Test
    public void testGetReferencedVariables_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getReferencedVariables] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getReferencedVariables(ReferenceCollectingCallback.java:107) */
        referenceCollectingCallback.getReferencedVariables();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenceCollection(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferenceCollection_ReturnReferenceMapGet() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        referenceMap.put(null, null);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferenceCollection(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferenceCollection_ReturnReferenceMapGet_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, functionNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = functionNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferenceCollection(var1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferenceCollection(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return referenceMap.get(v);
 *  */
    @Test
    public void testGetReferenceCollection_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection(ReferenceCollectingCallback.java:114) */
        referenceCollectingCallback.getReferenceCollection(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        referenceCollectingCallback.visit(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        referenceCollectingCallback.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (isBlockBoundary(n, parent)): True}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNoSuchElementException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(115);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:131) */
        referenceCollectingCallback.visit(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.NAME
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:122) */
        referenceCollectingCallback.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = new Node(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:123) */
        referenceCollectingCallback.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (isBlockBoundary(n, parent)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = new Node(-256);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-256);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:131) */
        referenceCollectingCallback.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (isBlockBoundary(n, parent)): True}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:131) */
        referenceCollectingCallback.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:123) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        referenceCollectingCallback.visit(nodeTraversal, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes1.put(null, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        Node node = new Node(38);
        
        referenceCollectingCallback.visit(nodeTraversal, node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, root, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.ReferenceCollectingCallback.process(ReferenceCollectingCallback.java:100) */
        referenceCollectingCallback.process(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields913476672001400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields913476672001400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass913476672007600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields913476672001400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass913476672007600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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

