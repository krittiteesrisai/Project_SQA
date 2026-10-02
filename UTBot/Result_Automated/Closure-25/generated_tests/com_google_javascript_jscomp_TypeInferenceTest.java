package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_TypeInferenceTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverse
    
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
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252) */
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
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
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
 * @utbot.executesCondition {@code (objectType.hasReferenceName()): True}
 * @utbot.executesCondition {@code (!hasLendsName): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasReferenceName()}
 *  */
    @Test
    public void testTraverseObjectLiteral_NotHasLendsName() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        String className = "";
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
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
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:649) */
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
    public void testTraverseObjectLiteral_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, numberNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = numberNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = enumElementType;
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
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:468) */
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:471) */
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
        updateScopeForTypeChangeMethodArguments[3] = enumElementType;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:514)
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:505) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, numberNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = numberNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
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
        updateScopeForTypeChangeMethodArguments[3] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
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
        updateScopeForTypeChangeMethodArguments[3] = enumElementType;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateTypeOfParameters(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:916)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:882) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateTypeOfParameters(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:917)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:882) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", numberNodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = numberNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateTypeOfParameters(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:917)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:882) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", stringNodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = stringNode;
        backwardsInferenceFromCallSiteMethodArguments[1] = ((Object) null);
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1267) */
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
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1270) */
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
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1270) */
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
    public void testGetBooleanOutcomePair_ThrowNullPointerException_4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1270) */
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1267) */
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
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1070)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:643) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1183) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.createChildFlowScope()
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", stringNodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = stringNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithinShortCircuitingBinOp(left, scope.createChildFlowScope())
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", stringNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithinShortCircuitingBinOp(left, scope.createChildFlowScope())
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188) */
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
            com.google.javascript.jscomp.TypeInference.branchedFlowThrough(TypeInference.java:150) */
        typeInference.branchedFlowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:569) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", numberNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = numberNode;
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
    public void testEnsurePropertyDeclared_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:569) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:569) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", numberNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = numberNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:569) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:569) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
    public void testEnsurePropertyDeclaredHelper_ReturnFalse_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:581) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:581) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(qName);
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:584) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testEnsurePropertyDeclaredHelper2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope syntacticScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(syntacticScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "syntacticScope", syntacticScope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(42);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
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
    
    @Test
    public void testEnsurePropertyDeclaredHelper3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope syntacticScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(syntacticScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "syntacticScope", syntacticScope);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1571)
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1571)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:582) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", stringNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = stringNode;
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
        
        FlowScope actual = typeInference.createInitialEstimateLattice();
        
        assertNull(actual);
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.executesCondition {@code (registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#getPossibleToBooleanOutcomes()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return new BooleanOutcomePair(jsType.getPossibleToBooleanOutcomes(), registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType) ? BooleanLiteralSet.BOTH : BooleanLiteralSet.EMPTY, flowScope, flowScope);}
 *  */
    @Test
    public void testNewBooleanOutcomePair_RegistryGetNativeTypeBOOLEAN_TYPEIsSubtype() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[2] = ((JSType) unknownType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        Object actual = newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
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
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
        
        assertNull(finalTypeInferenceRegistryNativeTypes3);
        
        assertNull(finalTypeInferenceRegistryNativeTypes4);
        
        assertNull(finalTypeInferenceRegistryNativeTypes5);
        
        assertNull(finalTypeInferenceRegistryNativeTypes6);
        
        assertNull(finalTypeInferenceRegistryNativeTypes7);
        
        assertNull(finalTypeInferenceRegistryNativeTypes8);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1356) */
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
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1356) */
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
    public void testNewBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1356) */
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
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1356) */
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
    
    ///region OTHER: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testNewBooleanOutcomePair1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[2] = ((JSType) anonymousFunctionType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:982)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1356) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverse(n, scope);
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247) */
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseAnd(n, scope);
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1249) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(81);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
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
    public void testTraverseWithinShortCircuitingBinOp4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
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
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(46);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(89);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(93);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:453)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:254)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(28);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1095)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:262)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1255) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1252) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:412)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1249) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp25() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:412)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1252) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp26() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1249) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp27() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1252) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseWithinShortCircuitingBinOp28() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
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
    
    @Test(expected = NullPointerException.class)
    public void testTraverseWithinShortCircuitingBinOp29() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", stringNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfThisOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateTypeOfThisOnClosure_FunctionTypeGetTemplateTypeName() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfThisOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeName() == null
 *  */
    @Test
    public void testUpdateTypeOfThisOnClosure_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:949) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfThisOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int childCount = n.getChildCount();
 *  */
    @Test
    public void testUpdateTypeOfThisOnClosure_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:954) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfThisOnClosure1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", stringNodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = stringNode;
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfThisOnClosure2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", stringNodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = stringNode;
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfThisOnClosure3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", stringNodeType, anonymousFunctionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = stringNode;
        updateTypeOfThisOnClosureMethodArguments[1] = anonymousFunctionType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfThisOnClosure4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", stringNodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = stringNode;
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfThisOnClosure5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:958) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = node;
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateTypeOfThisOnClosure6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        String templateTypeName = "";
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:230)
            com.google.javascript.rhino.jstype.FunctionType.getParameters(FunctionType.java:220)
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:956) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, noObjectTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = node;
        updateTypeOfThisOnClosureMethodArguments[1] = noObjectType;
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:916) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:917) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:917) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", numberNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = numberNode;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfParameters1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
        updateTypeOfParametersMethodArguments[1] = functionType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noResolvedTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noResolvedType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, noResolvedTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
        updateTypeOfParametersMethodArguments[1] = noResolvedType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, noResolvedTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
        updateTypeOfParametersMethodArguments[1] = noResolvedType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters5() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noResolvedTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noResolvedType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters6() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, noResolvedTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
        updateTypeOfParametersMethodArguments[1] = noResolvedType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test(timeout = 1000L)
    public void testUpdateTypeOfParameters7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", stringNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = stringNode;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:803) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:804) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:806) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:806) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
        FlowScope actual = ((FlowScope) tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    @Test
    public void testTightenTypesAfterAssertions2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1571)
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:806) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:515) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
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
    public void testEnsurePropertyDefined_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:514) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:514) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType nodeType = getJSType(getprop.getFirstChild());
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:515) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeType.restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:517) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testEnsurePropertyDefined1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:285)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared(PrototypeObjectType.java:184)
            com.google.javascript.rhino.jstype.FunctionType.isPropertyTypeDeclared(FunctionType.java:65)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:525) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsurePropertyDefined2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[35] = ((JSType) voidType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:517) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", stringNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = stringNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsurePropertyDefined3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:517) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsurePropertyDefined4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:515) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
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
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noTypeType, noTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_TypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", jSTypeType, jSTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testInferPropertyTypesToMatchConstraint1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object instanceObjectType = createInstance("com.google.javascript.rhino.jstype.InstanceObjectType");
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class instanceObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", instanceObjectTypeType, instanceObjectTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = instanceObjectType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = numberType;
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testInferPropertyTypesToMatchConstraint2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object namedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(TypeInference.java:1120) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", namedTypeType, namedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = namedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = voidType;
        try {
            inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:132) */
        typeInference.flowThrough(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testFlowThrough1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
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
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    @Test
    public void testFlowThrough2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
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
        (((Node) numberNode)).setType(105);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testFlowThrough4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:412)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:132) */
        typeInference.flowThrough(null, linkedFlowScope);
    }
    
    @Test
    public void testFlowThrough5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(25);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
    public void testFlowThrough6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(28);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(83);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(14);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(33);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1095)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:262)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(63);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(30);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
        (((Node) numberNode)).setType(21);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
    public void testFlowThrough16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
    public void testFlowThrough17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(110);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
    public void testFlowThrough18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
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
    public void testFlowThrough19() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:133) */
        typeInference.flowThrough(null, linkedFlowScope);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testFlowThrough20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
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
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:449) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:380)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", numberNodeType, linkedFlowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = numberNode;
        traverseAssignMethodArguments[1] = linkedFlowScope;
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:266)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:454) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(13);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(24);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:454) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:454) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
    public void testTraverseAssign19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
    public void testTraverseAssign20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(28);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:451) */
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
    public void testTraverseAssign21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:453) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", stringNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = stringNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseReturn
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseReturn(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseReturn1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", nodeType, linkedFlowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = node;
        traverseReturnMethodArguments[1] = linkedFlowScope;
        LinkedFlowScope actual = ((LinkedFlowScope) traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments));
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(linkedFlowScope, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseReturn(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseReturn2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:380)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, linkedFlowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = linkedFlowScope;
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1070)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", nodeType, linkedFlowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = ((Object) null);
        traverseReturnMethodArguments[1] = linkedFlowScope;
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(78);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:424) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(93);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1095)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:262)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:266)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(24);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(45);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:424) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseReturn24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseReturn(TypeInference.java:420) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseReturn(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseReturn25() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseReturnMethod = typeInferenceClazz.getDeclaredMethod("traverseReturn", numberNodeType, flowScopeType);
        traverseReturnMethod.setAccessible(true);
        java.lang.Object[] traverseReturnMethodArguments = new java.lang.Object[2];
        traverseReturnMethodArguments[0] = numberNode;
        traverseReturnMethodArguments[1] = ((Object) null);
        try {
            traverseReturnMethod.invoke(typeInference, traverseReturnMethodArguments);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node name = n.getFirstChild();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:441) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.setJSType(type);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:443) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclareSimpleVar(scope, name, type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseCatch_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseHook
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node condition = n.getFirstChild();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:749) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueNode = condition.getNext();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750) */
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
    
    ///region OTHER: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseHook1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(23);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:453)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:254)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:758) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(17);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:758) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:754) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testNarrowScope_NodeIsThis() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, numberNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = numberNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = scope.createChildFlowScope();
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:846) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, numberNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.isThis()
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:841) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testNarrowScope1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        Scope functionScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(flattened, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope", functionScope);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        LinkedFlowScope actual = ((LinkedFlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testNarrowScope2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:849) */
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
    
    @Test
    public void testNarrowScope3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:849) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNarrowScope4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:849) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, numberNodeType, functionTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = numberNode;
        narrowScopeMethodArguments[2] = functionType;
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNarrowScope5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1366)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:851) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNarrowScope6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.allFlowSlots(LinkedFlowScope.java:355)
            com.google.javascript.jscomp.LinkedFlowScope.access$500(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:413)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:846) */
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
    
    @Test
    public void testNarrowScope7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1575)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:849) */
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
    
    @Test
    public void testNarrowScope8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.inferQualifiedSlot(LinkedFlowScope.java:115)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:848) */
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
    
    @Test
    public void testNarrowScope9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 411);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedFlowScope linkedEquivalent = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(flattened, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "linkedEquivalent", linkedEquivalent);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.inferQualifiedSlot(LinkedFlowScope.java:115)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:848) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNarrowScope10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        Scope functionScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionScope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(flattened, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope", functionScope);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:540)
            com.google.javascript.jscomp.LinkedFlowScope.inferQualifiedSlot(LinkedFlowScope.java:116)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:848) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNarrowScope11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:849) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, numberNodeType, templateTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = numberNode;
        narrowScopeMethodArguments[2] = templateType;
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNarrowScope12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
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
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNarrowScope13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, numberNodeType, functionTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = numberNode;
        narrowScopeMethodArguments[2] = functionType;
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNarrowScope14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1008)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:744) */
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
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:744) */
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
    
    ///region OTHER: ERROR SUITE for method isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsAddedAsNumber1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[38] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:124)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1008)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:744) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", stringTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = stringType;
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsAddedAsNumber2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        Object namedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        nativeTypes[38] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:127)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:124)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1008)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:744) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", noObjectTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = noObjectType;
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:710) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node right = left.getNext();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", stringNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = stringNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseAdd1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:380)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, linkedFlowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = linkedFlowScope;
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:266)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:442)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:393)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:453)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:254)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(24);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(13);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(93);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:712) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseAdd22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCall(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseCall_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1070)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = ((Object) null);
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCall(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseCall_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", stringNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = stringNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCall(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionType = getJSType(left).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testTraverseCall_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseCall1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(46);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(87);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:644)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:284)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1079)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:369)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:344)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:258)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(57);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(66);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getBestLValue(NodeUtil.java:3039)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:674)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:280)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:271)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1095)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:262)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1038)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:288)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:750)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:276)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(28);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:380)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:252)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall25() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        Scope functionScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope", functionScope);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, linkedFlowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = linkedFlowScope;
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall26() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:266)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall27() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:453)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:254)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1071)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:783) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseCall28() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", numberNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = numberNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:601) */
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
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:610) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(26);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:365)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(99);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:607) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(89);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:334)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:349)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(93);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:711)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:374)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1095)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:262)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:605) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseOr
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1183)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178) */
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
    public void testTraverseOr_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", stringNodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = stringNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178) */
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
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1247)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1188)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1178) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node constructor = n.getFirstChild();
 *  */
    @Test
    public void testTraverseNew_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1037) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
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
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1131) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391)
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1132) */
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (n.isQualifiedName()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType narrowed = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1133) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", stringNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = stringNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateBind
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateBind(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().describeFunctionBind(n, true)
 *  */
    @Test
    public void testUpdateBind_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateBind] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:893) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType, functionTypeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[2];
        updateBindMethodArguments[0] = ((Object) null);
        updateBindMethodArguments[1] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
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
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:893) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType, functionTypeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[2];
        updateBindMethodArguments[0] = ((Object) null);
        updateBindMethodArguments[1] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1145) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, stringNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = stringNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1145) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, stringNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = stringNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1144) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, numberNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = numberNode;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
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
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1090) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", stringNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = stringNode;
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
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1070) */
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
    public void testTraverseAnd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1183)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066) */
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1189)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1066) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", stringNodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = stringNode;
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398) */
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
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398) */
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
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1363) */
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1368) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, noTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = noType;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1366) */
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): True}
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
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1368) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, numberNodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = numberNode;
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
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.returnsFrom {@code return getNativeType(UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", numberNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = numberNode;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry typeInferenceRegistry2 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes2 = ((JSType) get(typeInferenceRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry typeInferenceRegistry3 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes3 = ((JSType) get(typeInferenceRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry typeInferenceRegistry4 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes4 = ((JSType) get(typeInferenceRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry typeInferenceRegistry5 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes5 = ((JSType) get(typeInferenceRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry typeInferenceRegistry6 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes6 = ((JSType) get(typeInferenceRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry typeInferenceRegistry7 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes7 = ((JSType) get(typeInferenceRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry typeInferenceRegistry8 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes8 = ((JSType) get(typeInferenceRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry typeInferenceRegistry9 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes9 = ((JSType) get(typeInferenceRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry typeInferenceRegistry10 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes10 = ((JSType) get(typeInferenceRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry typeInferenceRegistry11 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes11 = ((JSType) get(typeInferenceRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry typeInferenceRegistry12 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes12 = ((JSType) get(typeInferenceRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry typeInferenceRegistry13 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes13 = ((JSType) get(typeInferenceRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry typeInferenceRegistry14 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes14 = ((JSType) get(typeInferenceRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry typeInferenceRegistry15 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes15 = ((JSType) get(typeInferenceRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry typeInferenceRegistry16 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes16 = ((JSType) get(typeInferenceRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry typeInferenceRegistry17 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes17 = ((JSType) get(typeInferenceRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry typeInferenceRegistry18 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes18 = ((JSType) get(typeInferenceRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry typeInferenceRegistry19 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes19 = ((JSType) get(typeInferenceRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry typeInferenceRegistry20 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes20 = ((JSType) get(typeInferenceRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry typeInferenceRegistry21 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes21 = ((JSType) get(typeInferenceRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry typeInferenceRegistry22 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes22 = ((JSType) get(typeInferenceRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry typeInferenceRegistry23 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes23 = ((JSType) get(typeInferenceRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry typeInferenceRegistry24 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes24 = ((JSType) get(typeInferenceRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry typeInferenceRegistry25 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes25 = ((JSType) get(typeInferenceRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry typeInferenceRegistry26 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes26 = ((JSType) get(typeInferenceRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry typeInferenceRegistry27 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes27 = ((JSType) get(typeInferenceRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry typeInferenceRegistry28 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes28 = ((JSType) get(typeInferenceRegistry28RegistryNativeTypes, 28));
        JSTypeRegistry typeInferenceRegistry29 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes29 = ((JSType) get(typeInferenceRegistry29RegistryNativeTypes, 29));
        JSTypeRegistry typeInferenceRegistry30 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes30 = ((JSType) get(typeInferenceRegistry30RegistryNativeTypes, 30));
        JSTypeRegistry typeInferenceRegistry31 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes31 = ((JSType) get(typeInferenceRegistry31RegistryNativeTypes, 31));
        JSTypeRegistry typeInferenceRegistry32 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes32 = ((JSType) get(typeInferenceRegistry32RegistryNativeTypes, 32));
        JSTypeRegistry typeInferenceRegistry33 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes33 = ((JSType) get(typeInferenceRegistry33RegistryNativeTypes, 33));
        JSTypeRegistry typeInferenceRegistry34 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes34 = ((JSType) get(typeInferenceRegistry34RegistryNativeTypes, 34));
        JSTypeRegistry typeInferenceRegistry35 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes35 = ((JSType) get(typeInferenceRegistry35RegistryNativeTypes, 35));
        JSTypeRegistry typeInferenceRegistry36 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes36 = ((JSType) get(typeInferenceRegistry36RegistryNativeTypes, 36));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
        
        assertNull(finalTypeInferenceRegistryNativeTypes2);
        
        assertNull(finalTypeInferenceRegistryNativeTypes3);
        
        assertNull(finalTypeInferenceRegistryNativeTypes4);
        
        assertNull(finalTypeInferenceRegistryNativeTypes5);
        
        assertNull(finalTypeInferenceRegistryNativeTypes6);
        
        assertNull(finalTypeInferenceRegistryNativeTypes7);
        
        assertNull(finalTypeInferenceRegistryNativeTypes8);
        
        assertNull(finalTypeInferenceRegistryNativeTypes9);
        
        assertNull(finalTypeInferenceRegistryNativeTypes10);
        
        assertNull(finalTypeInferenceRegistryNativeTypes11);
        
        assertNull(finalTypeInferenceRegistryNativeTypes12);
        
        assertNull(finalTypeInferenceRegistryNativeTypes13);
        
        assertNull(finalTypeInferenceRegistryNativeTypes14);
        
        assertNull(finalTypeInferenceRegistryNativeTypes15);
        
        assertNull(finalTypeInferenceRegistryNativeTypes16);
        
        assertNull(finalTypeInferenceRegistryNativeTypes17);
        
        assertNull(finalTypeInferenceRegistryNativeTypes18);
        
        assertNull(finalTypeInferenceRegistryNativeTypes19);
        
        assertNull(finalTypeInferenceRegistryNativeTypes20);
        
        assertNull(finalTypeInferenceRegistryNativeTypes21);
        
        assertNull(finalTypeInferenceRegistryNativeTypes22);
        
        assertNull(finalTypeInferenceRegistryNativeTypes23);
        
        assertNull(finalTypeInferenceRegistryNativeTypes24);
        
        assertNull(finalTypeInferenceRegistryNativeTypes25);
        
        assertNull(finalTypeInferenceRegistryNativeTypes26);
        
        assertNull(finalTypeInferenceRegistryNativeTypes27);
        
        assertNull(finalTypeInferenceRegistryNativeTypes28);
        
        assertNull(finalTypeInferenceRegistryNativeTypes29);
        
        assertNull(finalTypeInferenceRegistryNativeTypes30);
        
        assertNull(finalTypeInferenceRegistryNativeTypes31);
        
        assertNull(finalTypeInferenceRegistryNativeTypes32);
        
        assertNull(finalTypeInferenceRegistryNativeTypes33);
        
        assertNull(finalTypeInferenceRegistryNativeTypes34);
        
        assertNull(finalTypeInferenceRegistryNativeTypes35);
        
        assertNull(finalTypeInferenceRegistryNativeTypes36);
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", numberNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = numberNode;
        TemplateType actual = ((TemplateType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
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
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", numberNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = numberNode;
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
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
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1385) */
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
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1398)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1391) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", stringNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = stringNode;
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
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
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_1() throws Exception  {
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
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_2() throws Exception  {
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
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
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
        TypeInference.getBooleanOutcomes(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_1() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
        TypeInference.getBooleanOutcomes(null, null, true);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypeInference}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
     */
    @Test
    public void testGetBooleanOutcomesThrowsNPE() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1288) */
        TypeInference.getBooleanOutcomes(null, booleanLiteralSet, true);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields885134806856200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields885134806856200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass885134806861000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885134806856200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885134806861000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields885134807291900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields885134807291900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass885134807293700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885134807291900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885134807293700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

