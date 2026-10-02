package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.EnumElementType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.TemplatizedType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NoObjectType;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Constructor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypeInferenceTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType())}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testTraverse_NodeGetType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(59);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = node;
        traverseMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseMethod.invoke(typeInference, traverseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = ((Object) null);
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#getTypeOfThis()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.THIS}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(scope.getTypeOfThis());
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:363) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = node;
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.branchedFlowThrough
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method branchedFlowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#branchedFlowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#getCfg()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<DiGraphEdge<Node, Branch>> branchEdges = getCfg().getOutEdges(source);
 *  */
    @Test
    public void testBranchedFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.branchedFlowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.branchedFlowThrough(TypeInference.java:205) */
        typeInference.branchedFlowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 *  */
    @Test
    public void testUpdateScopeForTypeChange_NodeGetType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = node;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(left.getType())
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:524) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(varName);
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:527) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (qualifiedName != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensurePropertyDefined(left, resultType);
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:570)
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:561) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = left.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = node;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = left.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(resultType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = ((Object) null);
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDefined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:570) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = ((Object) null);
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:570) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType nodeType = getJSType(obj);
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:572) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeType.restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:574) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDefined_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDefined_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:648) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", stringNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = stringNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:648) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = ((Object) null);
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:648) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:648) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ReturnFalse() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ReturnFalse_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:660) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = ((Object) null);
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:660) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (qName != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(qName);
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(42);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:663) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qName = getprop.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createInitialEstimateLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInitialEstimateLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createInitialEstimateLattice()}
 * @utbot.returnsFrom {@code return bottomScope;}
 *  */
    @Test
    public void testCreateInitialEstimateLattice_ReturnBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createInitialEstimateLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(bottomScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseArrayLiteral
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseArrayLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseArrayLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1255)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:736) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", nodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = ((Object) null);
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateTypeOfParameters
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int childCount = n.getChildCount();
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:1002) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = ((Object) null);
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node iParameter: fnType.getParameters())
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:1003) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node iParameter: fnType.getParameters())
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:1003) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.util.Map)}
 * @utbot.executesCondition {@code (paramType.isTemplateType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isTemplateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toMaybeTemplateType()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#resolvedTemplateType(java.util.Map,com.google.javascript.rhino.jstype.TemplateType,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolvedTemplateType(resolvedTypes, paramType.toMaybeTemplateType(), argType);
 *  */
    @Test
    public void testMaybeResolveTemplatedType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1146)
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1063) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templateTypeType, templateTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templateType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.util.Map)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isTemplateType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramType.isTemplateType()
 *  */
    @Test
    public void testMaybeResolveTemplatedType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1061) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", jSTypeType, jSTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(129);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(155);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(4);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(30);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(102);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:390)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:871)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:340)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(16);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseWithinShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(64);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableSortedAsList");
        Object delegate = createInstance("com.google.common.collect.EmptyImmutableSortedSet");
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        String string = "";
        setField(templateKeys, "com.google.common.collect.Lists$StringAsImmutableList", "string", string);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableAsList");
        Object delegate = createInstance("com.google.common.collect.ImmutableEnumSet");
        Object delegate1 = createInstance("java.util.JumboEnumSet");
        setField(delegate, "com.google.common.collect.ImmutableEnumSet", "delegate", delegate1);
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#isEmpty()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: keys.isEmpty()
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowClassCastException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", templateKeys);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.ClassCastException: class com.google.common.collect.ImmutableSortedAsList cannot be cast to class com.google.common.collect.ImmutableSortedSet (com.google.common.collect.ImmutableSortedAsList and com.google.common.collect.ImmutableSortedSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            com.google.common.collect.ImmutableSortedAsList.delegateCollection(ImmutableSortedAsList.java:41)
            com.google.common.collect.ImmutableSortedAsList.delegateCollection(ImmutableSortedAsList.java:30)
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1187) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ImmutableList<TemplateType> keys = fnType.getTemplateTypeMap().getTemplateKeys();
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1185) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = ((Object) null);
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTemplateKeys
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1186) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: keys.isEmpty()
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1187) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testInferTemplatedTypesForCall1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableAsList");
        Object delegate = createInstance("com.google.common.collect.ImmutableEnumSet");
        Object delegate1 = createInstance("java.util.JumboEnumSet");
        setField(delegate1, "java.util.JumboEnumSet", "size", 512);
        setField(delegate, "com.google.common.collect.ImmutableEnumSet", "delegate", delegate1);
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1040)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1193) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", stringNodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = stringNode;
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferTemplatedTypesForCall2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableAsList");
        Object delegate = createInstance("com.google.common.collect.ImmutableEnumSet");
        Object delegate1 = createInstance("java.util.RegularEnumSet");
        setField(delegate1, "java.util.RegularEnumSet", "elements", 2L);
        setField(delegate, "com.google.common.collect.ImmutableEnumSet", "delegate", delegate1);
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1040)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1193) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", numberNodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = numberNode;
        inferTemplatedTypesForCallMethodArguments[1] = functionType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1185)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:965) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = ((Object) null);
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1186)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:965) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateTypeOfParameters(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:1002)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:969) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1187)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:965) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testBackwardsInferenceFromCallSite1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateKeys, "com.google.common.collect.RegularImmutableList", "size", 1);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1040)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1193)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:965) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", numberNodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = numberNode;
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBackwardsInferenceFromCallSite2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:979)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:970) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBackwardsInferenceFromCallSite3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:979)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:970) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = functionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.returnsFrom {@code return new BooleanOutcomePair(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, flowScope, flowScope);}
 *  */
    @Test
    public void testNewBooleanOutcomePair_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", jSTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = ((Object) null);
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        Object actual = newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[12];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", unknownTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = unknownType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testNewBooleanOutcomePair1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[2] = ((JSType) errorFunctionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", unknownTypeType, linkedFlowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = unknownType;
        newBooleanOutcomePairMethodArguments[1] = linkedFlowScope;
        Object actual = newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope expectedLeftScope = ((FlowScope) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        Object actualLeftScopeCache = getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualLeftScopeCache);
        
        LinkedFlowScope actualLeftScopeParent = ((LinkedFlowScope) getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "parent"));
        assertNull(actualLeftScopeParent);
        
        int expectedLeftScopeDepth = ((Integer) getFieldValue(expectedLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualLeftScopeDepth = ((Integer) getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedLeftScopeDepth, actualLeftScopeDepth);
        
        Object actualLeftScopeFlattened = getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualLeftScopeFlattened);
        
        boolean actualLeftScopeFrozen = ((Boolean) getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualLeftScopeFrozen);
        
        Object actualLeftScopeLastSlot = getFieldValue(actualLeftScope, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualLeftScopeLastSlot);
        
        FlowScope expectedRightScope = ((FlowScope) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        assertTrue(deepEquals(expectedRightScope, actualRightScope));
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry typeInferenceRegistry2 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes3 = ((JSType) get(typeInferenceRegistry2RegistryNativeTypes, 3));
        JSTypeRegistry typeInferenceRegistry3 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes4 = ((JSType) get(typeInferenceRegistry3RegistryNativeTypes, 4));
        JSTypeRegistry typeInferenceRegistry4 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes5 = ((JSType) get(typeInferenceRegistry4RegistryNativeTypes, 5));
        JSTypeRegistry typeInferenceRegistry5 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes6 = ((JSType) get(typeInferenceRegistry5RegistryNativeTypes, 6));
        JSTypeRegistry typeInferenceRegistry6 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes7 = ((JSType) get(typeInferenceRegistry6RegistryNativeTypes, 7));
        JSTypeRegistry typeInferenceRegistry7 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes8 = ((JSType) get(typeInferenceRegistry7RegistryNativeTypes, 8));
        JSTypeRegistry typeInferenceRegistry8 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes9 = ((JSType) get(typeInferenceRegistry8RegistryNativeTypes, 9));
        JSTypeRegistry typeInferenceRegistry9 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes10 = ((JSType) get(typeInferenceRegistry9RegistryNativeTypes, 10));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
        
        assertNull(finalTypeInferenceRegistryNativeTypes3);
        
        assertNull(finalTypeInferenceRegistryNativeTypes4);
        
        assertNull(finalTypeInferenceRegistryNativeTypes5);
        
        assertNull(finalTypeInferenceRegistryNativeTypes6);
        
        assertNull(finalTypeInferenceRegistryNativeTypes7);
        
        assertNull(finalTypeInferenceRegistryNativeTypes8);
        
        assertNull(finalTypeInferenceRegistryNativeTypes9);
        
        assertNull(finalTypeInferenceRegistryNativeTypes10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testNewBooleanOutcomePair2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[2] = ((JSType) anonymousFunctionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:610)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:543)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1250)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:1024)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, linkedFlowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = linkedFlowScope;
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNewBooleanOutcomePair3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[10];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[2] = ((JSType) enumElementType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:610)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:543)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1250)
            com.google.javascript.rhino.jstype.EnumElementType.isSubtype(EnumElementType.java:164)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1562) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noResolvedTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noResolvedType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = callNode.getFirstChild();
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:887) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = ((Object) null);
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node firstParam = left.getNext();
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:888) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertionFunctionsMap.get(left.getQualifiedName())
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:890) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertionFunctionsMap.get(left.getQualifiedName())
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:890) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    @Test
    public void testTightenTypesAfterAssertions1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashMap assertionFunctionsMap = new LinkedHashMap();
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "assertionFunctionsMap", assertionFunctionsMap);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        FlowScope actual = ((FlowScope) tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTightenTypesAfterAssertions2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashMap assertionFunctionsMap = new LinkedHashMap();
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "assertionFunctionsMap", assertionFunctionsMap);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        LinkedFlowScope actual = ((LinkedFlowScope) tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments));
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(linkedFlowScope, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    @Test
    public void testTightenTypesAfterAssertions3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1578)
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:890) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTightenTypesAfterAssertions4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:890) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1389) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.createChildFlowScope()
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1395) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = node;
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testTraverseShortCircuitingBinOp1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1395) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = node;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1401) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:390)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:796)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1263)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:425)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(5);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1401) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:509)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:310)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:405)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:436)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(28);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:354)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:430)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:737)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:359)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1461)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1251)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1455)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1458)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseShortCircuitingBinOp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseObjectLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (objectType == null): True}
 *  */
    @Test
    public void testTraverseObjectLiteral_ObjectTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (objectType == null): False}
 * @utbot.executesCondition {@code (n.getBooleanProp(Node.REFLECTED_OBJECT)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getBooleanProp(int)}
 *  */
    @Test
    public void testTraverseObjectLiteral_NotNGetBooleanProp() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 57);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplatizedType jsType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testTraverseObjectLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:742) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = ((Object) null);
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node name = n.getFirstChild(); name != null; name = name.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverse(name.getFirstChild(), scope);
 *  */
    @Test
    public void testTraverseObjectLiteral_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:746) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", numberNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = numberNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(type);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseObjectLiteral_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, linkedFlowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, linkedFlowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(45);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, linkedFlowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, linkedFlowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.resolvedTemplateType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolvedTemplateType(java.util.Map, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#resolvedTemplateType(java.util.Map,com.google.javascript.rhino.jstype.TemplateType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType previous = map.get(template);
 *  */
    @Test
    public void testResolvedTemplateType_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.resolvedTemplateType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1146) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class mapType = Class.forName("java.util.Map");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method resolvedTemplateTypeMethod = typeInferenceClazz.getDeclaredMethod("resolvedTemplateType", mapType, templateTypeType, jSTypeType);
        resolvedTemplateTypeMethod.setAccessible(true);
        java.lang.Object[] resolvedTemplateTypeMethodArguments = new java.lang.Object[3];
        resolvedTemplateTypeMethodArguments[0] = ((Object) null);
        resolvedTemplateTypeMethodArguments[1] = ((Object) null);
        resolvedTemplateTypeMethodArguments[2] = ((Object) null);
        try {
            resolvedTemplateTypeMethod.invoke(null, resolvedTemplateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method resolvedTemplateType(java.util.Map, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypeInference}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#resolvedTemplateType(java.util.Map,com.google.javascript.rhino.jstype.TemplateType,com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testResolvedTemplateTypeThrowsNPE() throws Throwable  {
        HashMap hashMap = new HashMap();
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.resolvedTemplateType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1147) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class hashMapType = Class.forName("java.util.Map");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method resolvedTemplateTypeMethod = typeInferenceClazz.getDeclaredMethod("resolvedTemplateType", hashMapType, templateTypeType, jSTypeType);
        resolvedTemplateTypeMethod.setAccessible(true);
        java.lang.Object[] resolvedTemplateTypeMethodArguments = new java.lang.Object[3];
        resolvedTemplateTypeMethodArguments[0] = hashMap;
        resolvedTemplateTypeMethodArguments[1] = ((Object) null);
        resolvedTemplateTypeMethodArguments[2] = ((Object) null);
        try {
            resolvedTemplateTypeMethod.invoke(null, resolvedTemplateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolvedTemplateType(java.util.Map, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testResolvedTemplateType1() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.resolvedTemplateType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1147) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method resolvedTemplateTypeMethod = typeInferenceClazz.getDeclaredMethod("resolvedTemplateType", linkedHashMapType, templateTypeType, jSTypeType);
        resolvedTemplateTypeMethod.setAccessible(true);
        java.lang.Object[] resolvedTemplateTypeMethodArguments = new java.lang.Object[3];
        resolvedTemplateTypeMethodArguments[0] = linkedHashMap;
        resolvedTemplateTypeMethodArguments[1] = ((Object) null);
        resolvedTemplateTypeMethodArguments[2] = ((Object) null);
        try {
            resolvedTemplateTypeMethod.invoke(null, resolvedTemplateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableSortedAsList");
        Object delegate = createInstance("com.google.common.collect.EmptyImmutableSortedSet");
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        String string = "";
        setField(templateKeys, "com.google.common.collect.Lists$StringAsImmutableList", "string", string);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableAsList");
        Object delegate = createInstance("com.google.common.collect.ImmutableEnumSet");
        Object delegate1 = createInstance("java.util.RegularEnumSet");
        setField(delegate1, "java.util.RegularEnumSet", "elements", 0L);
        setField(delegate, "com.google.common.collect.ImmutableEnumSet", "delegate", delegate1);
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#isEmpty()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowClassCastException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", templateKeys);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.ClassCastException: class com.google.common.collect.ImmutableSortedAsList cannot be cast to class com.google.common.collect.ImmutableSortedSet (com.google.common.collect.ImmutableSortedAsList and com.google.common.collect.ImmutableSortedSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            com.google.common.collect.ImmutableSortedAsList.delegateCollection(ImmutableSortedAsList.java:41)
            com.google.common.collect.ImmutableSortedAsList.delegateCollection(ImmutableSortedAsList.java:30)
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1033) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1033) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = ((Object) null);
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1033) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1033) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    @Test
    public void testInferTemplateTypesFromParameters1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.RegularImmutableAsList");
        Object delegate = createInstance("com.google.common.collect.ImmutableEnumSet");
        Object delegate1 = createInstance("java.util.RegularEnumSet");
        setField(delegate1, "java.util.RegularEnumSet", "elements", 1L);
        setField(delegate, "com.google.common.collect.ImmutableEnumSet", "delegate", delegate1);
        setField(templateKeys, "com.google.common.collect.RegularImmutableAsList", "delegate", delegate);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1040) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noResolvedTypeType, numberNodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noResolvedType;
        inferTemplateTypesFromParametersMethodArguments[1] = numberNode;
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1473) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = ((Object) null);
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1473) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    @Test
    public void testGetBooleanOutcomePair1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        Object actual = getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    @Test
    public void testGetBooleanOutcomePair2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1476) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.util.Iterator, java.util.Iterator, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplateTypeFromNodes(java.util.Iterator,java.util.Iterator,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(declParams.hasNext() && callParams.hasNext())
 *  */
    @Test
    public void testMaybeResolveTemplateTypeFromNodes_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1127) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", iteratorType, iteratorType, mapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maybeResolveTemplateTypeFromNodes(java.util.Iterator, java.util.Iterator, java.util.Map)
    
    @Test
    public void testMaybeResolveTemplateTypeFromNodes1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", iteratorType, iteratorType, linkedHashMapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = iterator;
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = linkedHashMap;
        maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.lang.Iterable, java.lang.Iterable, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplateTypeFromNodes(java.lang.Iterable,java.lang.Iterable,java.util.Map)}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declParams.iterator()
 *  */
    @Test
    public void testMaybeResolveTemplateTypeFromNodes_ThrowNullPointerException1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1120) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class iterableType = Class.forName("java.lang.Iterable");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", iterableType, iterableType, mapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.lang.Iterable, java.lang.Iterable, java.util.Map)
    
    @Test
    public void testMaybeResolveTemplateTypeFromNodes2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1120) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class arrayListType = Class.forName("java.lang.Iterable");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", arrayListType, arrayListType, mapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = arrayList;
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintEqualsNull() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templateTypeType, templateTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templateType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_TypeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", jSTypeType, jSTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull() throws Exception  {
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", errorFunctionTypeType, errorFunctionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = errorFunctionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = templateType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull_1() throws Exception  {
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noResolvedTypeType, noResolvedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noResolvedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = enumElementType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull_2() throws Exception  {
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(referencedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = templateType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testInferPropertyTypesToMatchConstraint1() throws Exception  {
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", booleanTypeType, booleanTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = booleanType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = nullType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint2() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", anonymousFunctionTypeType, anonymousFunctionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = anonymousFunctionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = nullType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object namespaceType = createInstance("com.google.javascript.rhino.jstype.NamespaceType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(namespaceType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(namespaceType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = namespaceType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint5() throws Exception  {
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint6() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        NoObjectType referencedObjType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noTypeType, noTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint7() throws Exception  {
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noObjectTypeType, noObjectTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noObjectType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint8() throws Exception  {
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = templateType;
        inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testInferPropertyTypesToMatchConstraint9() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testInferPropertyTypesToMatchConstraint10() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", referencedObjType);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testInferPropertyTypesToMatchConstraint11() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object namespaceType = createInstance("com.google.javascript.rhino.jstype.NamespaceType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(namespaceType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(primitiveObjectType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", namespaceType);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        setField(namespaceType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = namespaceType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint12() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object recordType = createInstance("com.google.javascript.rhino.jstype.RecordType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames(ObjectType.java:454)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:455)
            com.google.javascript.rhino.jstype.FunctionType.matchRecordTypeConstraint(FunctionType.java:66)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:444)
            com.google.javascript.rhino.jstype.FunctionType.matchConstraint(FunctionType.java:66)
            com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(TypeInference.java:1302) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", functionTypeType, functionTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = functionType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = recordType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint13() throws Throwable  {
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object recordType = createInstance("com.google.javascript.rhino.jstype.RecordType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames(ObjectType.java:454)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:455)
            com.google.javascript.rhino.jstype.FunctionType.matchRecordTypeConstraint(FunctionType.java:66)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:444)
            com.google.javascript.rhino.jstype.FunctionType.matchConstraint(FunctionType.java:66)
            com.google.javascript.rhino.jstype.ProxyObjectType.matchConstraint(ProxyObjectType.java:354)
            com.google.javascript.rhino.jstype.TemplatizedType.matchConstraint(TemplatizedType.java:51)
            com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(TypeInference.java:1302) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = recordType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint14() throws Throwable  {
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        TemplatizedType referencedType2 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType3 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType(ProxyObjectType.java:210)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType(ProxyObjectType.java:210)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType(ProxyObjectType.java:210)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType(ProxyObjectType.java:210)
            com.google.javascript.rhino.jstype.JSType.isRecordType(JSType.java:387)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:443)
            com.google.javascript.rhino.jstype.FunctionType.matchConstraint(FunctionType.java:66)
            com.google.javascript.rhino.jstype.ProxyObjectType.matchConstraint(ProxyObjectType.java:354)
            com.google.javascript.rhino.jstype.TemplatizedType.matchConstraint(TemplatizedType.java:51)
            com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(TypeInference.java:1302) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferPropertyTypesToMatchConstraint15() throws Throwable  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.RecordType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        NoObjectType primitiveObjectType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(primitiveObjectType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType1);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames(ObjectType.java:454)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:455)
            com.google.javascript.rhino.jstype.FunctionType.matchRecordTypeConstraint(FunctionType.java:66)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:444)
            com.google.javascript.rhino.jstype.FunctionType.matchConstraint(FunctionType.java:66)
            com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(TypeInference.java:1302) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noTypeType, noTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = proxyObjectType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(null, inferPropertyTypesToMatchConstraintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferArguments(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testInferArguments() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testInferArguments_NodeGetNext() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", rootNode);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 *  */
    @Test
    public void testInferArguments_FunctionTypeGetParametersNode() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferArguments(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionNode = functionScope.getRootNode();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:125) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = ((Object) null);
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node astParameters = functionNode.getFirstChild().getNext();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:126) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node astParameters = functionNode.getFirstChild().getNext();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:126) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isCallOrNewTarget(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toMaybeFunctionType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node astParameter: astParameters.children())
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:139) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferArguments(com.google.javascript.jscomp.Scope)
    
    @Test
    public void testInferArguments1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    @Test
    public void testInferArguments2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    @Test
    public void testInferArguments3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", rootNode);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    @Test
    public void testInferArguments4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(30);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    @Test
    public void testInferArguments5() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferArguments(com.google.javascript.jscomp.Scope)
    
    @Test
    public void testInferArguments6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", rootNode);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:288)
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:136) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferArguments7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:139) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferArguments8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(30);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:288)
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:136) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferArguments(com.google.javascript.jscomp.Scope)
    
    @Test(expected = IllegalStateException.class)
    public void testInferArguments9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first1);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.flowThrough
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): True}
 * @utbot.returnsFrom {@code return input;}
 *  */
    @Test
    public void testFlowThrough_InputEqualsBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        FlowScope actual = typeInference.flowThrough(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope output = input.createChildFlowScope();
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:187) */
        typeInference.flowThrough(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testFlowThrough1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        LinkedFlowScope actual = ((LinkedFlowScope) flowThroughMethod.invoke(typeInference, flowThroughMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483396);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    @Test
    public void testFlowThrough2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(155);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        LinkedFlowScope actual = ((LinkedFlowScope) flowThroughMethod.invoke(typeInference, flowThroughMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483396);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    @Test
    public void testFlowThrough3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(71);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        LinkedFlowScope actual = ((LinkedFlowScope) flowThroughMethod.invoke(typeInference, flowThroughMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483396);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    @Test
    public void testFlowThrough4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.flowThrough(node, linkedFlowScope));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testFlowThrough5() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:187) */
        typeInference.flowThrough(null, linkedFlowScope);
    }
    
    @Test
    public void testFlowThrough6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(96);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:390)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(13);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(110);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:436)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:354)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:871)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:340)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:493)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:449)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:430)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(93);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:796)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:385)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:363)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:405)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlowThrough16() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:188) */
        typeInference.flowThrough(null, linkedFlowScope);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testFlowThrough17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method flowThroughMethod = typeInferenceClazz.getDeclaredMethod("flowThrough", numberNodeType, linkedFlowScopeType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = linkedFlowScope;
        try {
            flowThroughMethod.invoke(typeInference, flowThroughMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createEntryLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createEntryLattice()}
 * @utbot.returnsFrom {@code return functionScope;}
 *  */
    @Test
    public void testCreateEntryLattice_ReturnFunctionScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope functionScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "functionScope", functionScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createEntryLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(functionScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAssign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAssign(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAssign_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:505) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", nodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = ((Object) null);
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseAssign1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:363)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:835)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:332)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1278)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:318)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1263)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:425)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:510) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(96);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:390)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:871)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:340)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(51);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:400)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1395)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1251)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:322)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:509)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:310)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:510) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:430)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:510) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:354)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:436)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:394)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseAssign19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseCatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:497) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", stringNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = stringNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node name = catchNode.getFirstChild();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:489) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = ((Object) null);
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = name.getJSDocInfo();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:493) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:497) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", numberNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = numberNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = name.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseCatch_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseCatch1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[12];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 12]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:497) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCatch2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        nativeTypes[35] = ((JSType) proxyObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1574)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:499) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", numberNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = numberNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCatch3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:497) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, linkedFlowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = linkedFlowScope;
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = IllegalStateException.class)
    public void testTraverseCatch4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        Object recordType = createInstance("com.google.javascript.rhino.jstype.RecordType");
        nativeTypes[35] = ((JSType) recordType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(timeout = 1000L)
    public void testTraverseCatch5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", numberNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = numberNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String varName = n.getString();
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:680) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = ((Object) null);
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#getSlot(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(varName);
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:689) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String varName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseName_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = node;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String varName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseName_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(40);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = node;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseName1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:385)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:363)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(96);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:390)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(21);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:796)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(31);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:430)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:405)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(120);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:493)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:449)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1263)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:425)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(100);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:327)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:400)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:509)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:310)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(98);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:835)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:332)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:871)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:340)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1278)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:318)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:737)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:359)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1251)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:322)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(28);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:354)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        TemplatizedType jsType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:363)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:684) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:493)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:689) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseName20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTraverseName21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(4);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTraverseName22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(155);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTraverseName23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTraverseName24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(121);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.isAddedAsNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createUnionType(com.google.javascript.rhino.jstype.JSTypeNative[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1056)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:829) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createUnionType(com.google.javascript.rhino.jstype.JSTypeNative[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:829) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.narrowScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): True}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testNarrowScope_NodeIsThis() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = node;
        narrowScopeMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): False}
 * @utbot.executesCondition {@code (node.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#inferQualifiedSlot(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testNarrowScope_NodeIsGetProp() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        Scope functionScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope", functionScope);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = node;
        narrowScopeMethodArguments[2] = ((Object) null);
        LinkedFlowScope actual = ((LinkedFlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.isThis()
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = ((Object) null);
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = scope.createChildFlowScope();
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:929) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = node;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: node
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNarrowScope_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, numberNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = numberNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isGetProp()): False}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclareSimpleVar(scope, node, narrowed);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNarrowScope_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Node node = new Node(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = node;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:795) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", nodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = ((Object) null);
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node right = left.getNext();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:796) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", nodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = node;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateBind
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateBind(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().describeFunctionBind(n, true)
 *  */
    @Test
    public void testUpdateBind_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateBind] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:979) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[1];
        updateBindMethodArguments[0] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().describeFunctionBind(n, true)
 *  */
    @Test
    public void testUpdateBind_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateBind] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:979) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[1];
        updateBindMethodArguments[0] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseHook
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node condition = n.getFirstChild();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:834) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", nodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = ((Object) null);
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueNode = condition.getNext();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:835) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", nodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = node;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getPreciserScopeKnowingConditionOutcome
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(137);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:843) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", stringNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = stringNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testTraverseChildren_ReturnScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", nodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = node;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node el = n.getFirstChild(); el != null; el = el.getNext())
 *  */
    @Test
    public void testTraverseChildren_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", nodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = ((Object) null);
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAnd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1395)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1251) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1389)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1251) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = ((Object) null);
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getPropertyType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1332) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = ((Object) null);
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1333) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1333) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPropertyType_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseOr
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1395)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = node;
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1389)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = ((Object) null);
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = node;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1453)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1394)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1384) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", numberNodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = numberNode;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseNew
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseNew(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseNew(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseNew_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1255)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1213) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNewMethod = typeInferenceClazz.getDeclaredMethod("traverseNew", nodeType, flowScopeType);
        traverseNewMethod.setAccessible(true);
        java.lang.Object[] traverseNewMethodArguments = new java.lang.Object[2];
        traverseNewMethodArguments[0] = ((Object) null);
        traverseNewMethodArguments[1] = ((Object) null);
        try {
            traverseNewMethod.invoke(typeInference, traverseNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#get(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#intersection(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#union(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.returnsFrom {@code return right.union(left.intersection(BooleanLiteralSet.get(!condition)));}
 *  */
    @Test
    public void testGetBooleanOutcomes_RightUnion() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.BOTH;
        
        BooleanLiteralSet actual = TypeInference.getBooleanOutcomes(booleanLiteralSet, booleanLiteralSet, true);
        
        assertEquals(booleanLiteralSet, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_2() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.TRUE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_3() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.EMPTY;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_4() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494) */
        TypeInference.getBooleanOutcomes(null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_1() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1494) */
        TypeInference.getBooleanOutcomes(null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.dereferencePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = node;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = node;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", stringNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = stringNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isQualifiedName()
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1310) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = ((Object) null);
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (n.isQualifiedName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType narrowed = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1312) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = node;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDereferencePointer_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = node;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseGetProp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node objNode = n.getFirstChild();
 *  */
    @Test
    public void testTraverseGetProp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1272) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", nodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = ((Object) null);
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.isUnflowable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnflowable(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (v.getScope() == syntacticScope): True}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VGetScopeEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope syntacticScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScope, "com.google.javascript.jscomp.Scope", "parent", syntacticScope);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "syntacticScope", syntacticScope);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", syntacticScope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "markedEscaped", true);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (v.getScope() == syntacticScope): False}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VGetScopeNotEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope syntacticScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "syntacticScope", syntacticScope);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "markedEscaped", true);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varClazz);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.redeclareSimpleVar
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(nameNode.isName());
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1569) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, nodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = ((Object) null);
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isUnflowable(syntacticScope.getVar(varName))
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1574) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, templateTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = templateType;
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isUnflowable(syntacticScope.getVar(varName))
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1574) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(nameNode.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRedeclareSimpleVar_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, nodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = node;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = nameNode.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRedeclareSimpleVar_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, nodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = node;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.returnsFrom {@code return unknownType;}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        EnumElementType actual = ((EnumElementType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        JSType actualPrimitiveType = actual.getPrimitiveType();
        assertNull(actualPrimitiveType);
        
        ObjectType actualPrimitiveObjectType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType"));
        assertNull(actualPrimitiveObjectType);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "name"));
        assertNull(actualName);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        TemplateTypeMap actualTemplateTypeMap = actual.getTemplateTypeMap();
        assertNull(actualTemplateTypeMap);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1591) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return registry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1604) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields903853119856800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields903853119856800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass903853119863600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields903853119856800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass903853119863600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields903853122136900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields903853122136900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass903853122138800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields903853122136900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass903853122138800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

