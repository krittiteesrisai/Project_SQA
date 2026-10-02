package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import java.text.MessageFormat;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.ArrayDeque;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.LinkedList;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.EnumElementType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_TypeCheckTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkPropertyAccess
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyAccess(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#dereference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = childType.dereference();
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1172) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = ((Object) null);
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.check
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method check(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#check(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: t.traverseWithScope(node, topScope);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheck_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(topScope, "com.google.javascript.jscomp.Scope", "parent", topScope);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        typeCheck.check(scriptOrFnNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#check(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(node);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCheck_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        typeCheck.check(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.LP}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() != Token.FUNCTION
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(83);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:460) */
        typeCheck.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.CASE}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType switchType = getJSType(parent.getFirstChild());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:714) */
        typeCheck.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.THIS}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, t.getScope().getTypeOfThis());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:477) */
        typeCheck.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:452) */
        typeCheck.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.NUMBER}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getParent().getType() != Token.OBJECTLIT
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:493) */
        typeCheck.visit(null, functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node externsAndJs = jsRoot.getParent();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.process(TypeCheck.java:334) */
        typeCheck.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsAndJs != null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(externsAndJs != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        typeCheck.process(null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsAndJs != null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsRoot == null || externsAndJs.hasChild(externsRoot));): True}
 * @utbot.executesCondition {@code (externsRoot == null || externsAndJs.hasChild(externsRoot)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChild(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(externsRoot == null || externsAndJs.hasChild(externsRoot));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        Node node = new Node(0);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        typeCheck.process(node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scopeCreator);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        typeCheck.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(topScope);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        typeCheck.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.report
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.executesCondition {@code (noTypeCheckSection == 0): False}
 *  */
    @Test
    public void testReport_NoTypeCheckSectionNotEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = ((Object) null);
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        reportMethod.invoke(typeCheck, reportMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReport_ThrowIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {-1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, functionNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = functionNode;
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReport_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = ((Object) null);
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, functionNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = functionNode;
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, functionNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = functionNode;
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:147)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:160)
            com.google.javascript.jscomp.JSError.make(JSError.java:116)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:622)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:403) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.processForTesting
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(scopeCreator == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        typeCheck.processForTesting(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(topScope == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        
        typeCheck.processForTesting(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot.getParent() != null);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot.getParent() != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        typeCheck.processForTesting(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(jsRoot.getParent() != null);
 *  */
    @Test
    public void testProcessForTesting_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.processForTesting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.processForTesting(TypeCheck.java:350) */
        typeCheck.processForTesting(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(-255);
        
        boolean actual = typeCheck.shouldTraverse(null, node, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        boolean actual = typeCheck.shouldTraverse(null, node, null);
        
        assertTrue(actual);
        
        TypeValidator typeCheckValidator = ((TypeValidator) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator"));
        boolean finalTypeCheckValidatorShouldReport = ((Boolean) getFieldValue(typeCheckValidator, "com.google.javascript.jscomp.TypeValidator", "shouldReport"));
        
        assertTrue(finalTypeCheckValidatorShouldReport);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowClassCastException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:387)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:381)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Scope outerScope = t.getScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:414) */
        typeCheck.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -1);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_6() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:409) */
        typeCheck.shouldTraverse(null, node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitAssign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = assign.getJSDocInfo();
 *  */
    @Test
    public void testVisitAssign_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.JSDocInfo ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:821) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = assign.getJSDocInfo();
 *  */
    @Test
    public void testVisitAssign_ThrowClassCastException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:821) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitAssign_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:916) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = assign.getJSDocInfo();
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:821) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = ((Object) null);
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(lvalue.getString());
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:907) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lvalue.getType() == Token.GETPROP
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:825) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lvalue.getType() == Token.GETPROP
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:825) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType rightType = getJSType(rightChild);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:918) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType objectJsType = getJSType(object);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:827) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String property = lvalue.getLastChild().getString();
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:828) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType objectJsType = getJSType(object);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:827) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String property = lvalue.getLastChild().getString();
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:828) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, scriptOrFnNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = scriptOrFnNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String property = lvalue.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitAssign_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, functionNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = functionNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitParameterList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitParameterList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitParameterList(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Node> arguments = call.children().iterator();
 *  */
    @Test
    public void testVisitParameterList_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitParameterList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitParameterList(TypeCheck.java:1401) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method visitParameterListMethod = typeCheckClazz.getDeclaredMethod("visitParameterList", nodeTraversalType, nodeType, functionTypeType);
        visitParameterListMethod.setAccessible(true);
        java.lang.Object[] visitParameterListMethodArguments = new java.lang.Object[3];
        visitParameterListMethodArguments[0] = ((Object) null);
        visitParameterListMethodArguments[1] = ((Object) null);
        visitParameterListMethodArguments[2] = ((Object) null);
        try {
            visitParameterListMethod.invoke(typeCheck, visitParameterListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.isPropertyTest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPropertyTest_ReturnTrue() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(32);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPropertyTest_ReturnFalse() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() != getProp && compiler.getCodingConvention().isPropertyTestFunction(parent);}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildEqualsGetPropAndCompilerGetCodingConventionIsPropertyTestFunction() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(101);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return parent.getParent().getType() == Token.OR && parent.getParent().getFirstChild() == parent;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetParentGetTypeNotEqualsTokenORAndParentGetParentGetFirstChildNotEqualsParent() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(26);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildNotEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(101);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (compiler.getCodingConvention().isPropertyTestFunction(parent)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() != getProp && compiler.getCodingConvention().isPropertyTestFunction(parent);}
 *  */
    @Test
    public void testIsPropertyTest_NotCompilerGetCodingConventionIsPropertyTestFunction() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isPropertyTest(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)} once
    /// return from: {@code return NodeUtil.getConditionExpression(parent) == getProp;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_NodeUtilGetConditionExpressionEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(114);
        setField(parent, "com.google.javascript.rhino.Node", "last", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_NodeUtilGetConditionExpressionNotEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(114);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_SwitchParentGetTypeCasedefault() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(108);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = getProp.getParent();
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1201) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = ((Object) null);
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(parent.getType())
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1202) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent.getParent().getType() == Token.OR && parent.getParent().getFirstChild() == parent;
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(26);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1222) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().isPropertyTestFunction(parent)
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1205) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().isPropertyTestFunction(parent)
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1205) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", functionNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = functionNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return NodeUtil.getConditionExpression(parent) == getProp;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsPropertyTest_ThrowIllegalArgumentException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(115);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", scriptOrFnNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = scriptOrFnNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitNew
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitNew_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = node;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitNew_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = node;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node constructor = n.getFirstChild();
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1288) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = ((Object) null);
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType type = getFunctionType(constructor);
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, scriptOrFnNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = scriptOrFnNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType type = getFunctionType(constructor);
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, functionNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = functionNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, functionNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = functionNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitNew1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[35] = ((JSType) voidType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, scriptOrFnNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = nodeTraversal;
        visitNewMethodArguments[1] = scriptOrFnNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitNew2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:219)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1289) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, scriptOrFnNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = nodeTraversal;
        visitNewMethodArguments[1] = scriptOrFnNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitGetElem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
 *  */
    @Test
    public void testVisitGetElem_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1236) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = ((Object) null);
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, scriptOrFnNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = scriptOrFnNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, functionNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = functionNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitGetElem1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[35] = ((JSType) unknownType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, functionNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = functionNode;
        visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 36));
        JSTypeRegistry typeCheckTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes37 = ((JSType) get(typeCheckTypeRegistry36TypeRegistryNativeTypes, 37));
        JSTypeRegistry typeCheckTypeRegistry37 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes38 = ((JSType) get(typeCheckTypeRegistry37TypeRegistryNativeTypes, 38));
        JSTypeRegistry typeCheckTypeRegistry38 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes39 = ((JSType) get(typeCheckTypeRegistry38TypeRegistryNativeTypes, 39));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes37);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes38);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes39);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitGetElem2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object jsType1 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:151)
            com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty(FunctionType.java:367)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:375)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:286)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:267)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:67)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:217)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:270)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.matchesNumberContext(ProxyObjectType.java:76)
            com.google.javascript.rhino.jstype.TemplateType.matchesNumberContext(TemplateType.java:49)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:217)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:270)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:269)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, functionNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = functionNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        nativeTypes[35] = ((JSType) unresolvedTypeExpression);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:151)
            com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty(FunctionType.java:367)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:375)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:286)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:267)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:67)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:217)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:270)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[0] = ((JSType) templateType);
        nativeTypes[1] = ((JSType) templateType);
        nativeTypes[2] = ((JSType) templateType);
        nativeTypes[3] = ((JSType) templateType);
        nativeTypes[4] = ((JSType) templateType);
        nativeTypes[5] = ((JSType) templateType);
        nativeTypes[6] = ((JSType) templateType);
        nativeTypes[7] = ((JSType) templateType);
        nativeTypes[8] = ((JSType) templateType);
        nativeTypes[9] = ((JSType) templateType);
        nativeTypes[10] = ((JSType) templateType);
        nativeTypes[11] = ((JSType) templateType);
        nativeTypes[12] = ((JSType) templateType);
        nativeTypes[13] = ((JSType) templateType);
        nativeTypes[14] = ((JSType) templateType);
        nativeTypes[15] = ((JSType) templateType);
        nativeTypes[16] = ((JSType) templateType);
        nativeTypes[17] = ((JSType) templateType);
        nativeTypes[18] = ((JSType) templateType);
        nativeTypes[19] = ((JSType) templateType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        nativeTypes[22] = ((JSType) templateType);
        nativeTypes[23] = ((JSType) templateType);
        nativeTypes[24] = ((JSType) templateType);
        nativeTypes[25] = ((JSType) templateType);
        nativeTypes[26] = ((JSType) templateType);
        nativeTypes[27] = ((JSType) templateType);
        nativeTypes[28] = ((JSType) templateType);
        nativeTypes[29] = ((JSType) templateType);
        nativeTypes[30] = ((JSType) templateType);
        nativeTypes[31] = ((JSType) templateType);
        nativeTypes[32] = ((JSType) templateType);
        nativeTypes[33] = ((JSType) templateType);
        nativeTypes[34] = ((JSType) templateType);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        nativeTypes[35] = ((JSType) unresolvedTypeExpression);
        nativeTypes[36] = ((JSType) templateType);
        nativeTypes[37] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:684)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:557)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:218)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:270)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:269)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1238) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitVar
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitVar(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n.getJSDocInfo()
 *  */
    @Test
    public void testVisitVar_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1253) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, scriptOrFnNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = scriptOrFnNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitVar(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.hasOneChild()
 *  */
    @Test
    public void testVisitVar_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1253) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = ((Object) null);
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitVar(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#children()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test
    public void testVisitVar_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1257) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, scriptOrFnNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = scriptOrFnNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitVar1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = functionNode;
        visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitVar2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1257) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = functionNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", functionNode);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1257) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = functionNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:569)
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1257) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = functionNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:570)
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1257) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = functionNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testVisitVar6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, functionNodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = functionNode;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenFUNCTION() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        boolean actual = typeCheck.visitName(null, null, functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.LP): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenLP() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(83);
        
        boolean actual = typeCheck.visitName(null, null, functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.LP): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenVAR() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        
        boolean actual = typeCheck.visitName(null, null, functionNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenCATCH() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        boolean actual = typeCheck.visitName(null, null, functionNode);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.LP): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1116) */
        typeCheck.visitName(null, null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int parentNodeType = parent.getType();
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1108) */
        typeCheck.visitName(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.LP): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-254);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1119) */
        typeCheck.visitName(null, scriptOrFnNode, scriptOrFnNode1);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.LP): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-128);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1118) */
        typeCheck.visitName(null, functionNode, functionNode1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitName1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = typeCheck.visitName(null, node, functionNode);
        
        assertTrue(actual);
    }
    
    @Test
    public void testVisitName2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = typeCheck.visitName(nodeTraversal, scriptOrFnNode, functionNode);
        
        assertTrue(actual);
    }
    
    @Test
    public void testVisitName3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = typeCheck.visitName(null, node, functionNode);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitName4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 10]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1118) */
        typeCheck.visitName(null, scriptOrFnNode, functionNode);
    }
    
    @Test
    public void testVisitName5() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1682)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1127) */
        typeCheck.visitName(null, node, functionNode);
    }
    
    @Test
    public void testVisitName6() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Node node = new Node(0);
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:570)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1119) */
        typeCheck.visitName(nodeTraversal, node, node1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 *  */
    @Test
    public void testVisitFunction_FunctionTypeIsConstructor() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testVisitFunction_ThrowClassCastException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1319) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, scriptOrFnNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = scriptOrFnNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType functionType = (FunctionType) n.getJSType();
 *  */
    @Test
    public void testVisitFunction_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1321) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType functionType = (FunctionType) n.getJSType();
 *  */
    @Test
    public void testVisitFunction_ThrowClassCastException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1321) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType functionType = (FunctionType) n.getJSType();
 *  */
    @Test
    public void testVisitFunction_ThrowClassCastException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1321) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1319) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = ((Object) null);
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1322) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, scriptOrFnNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = scriptOrFnNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionType.isInterface() || functionType.isConstructor()
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1323) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, scriptOrFnNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = scriptOrFnNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getPrototype
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1325) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType baseInterface: functionType.getImplementedInterfaces())
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1334) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisitFunction_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, scriptOrFnNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = scriptOrFnNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitFunction_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, scriptOrFnNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = scriptOrFnNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitFunction1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
    }
    
    @Test
    public void testVisitFunction2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitFunction3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 6]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:770)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1325) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1322) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1325) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1334) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1325) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitFunction8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testVisitFunction9() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, functionNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = functionNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitGetProp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisitGetProp_NodeGetType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = scriptOrFnNode;
        visitGetPropMethodArguments[2] = functionNode;
        visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getJSType() != null && parent.getType() == Token.ASSIGN
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1143) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = ((Object) null);
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getJSType() != null && parent.getType() == Token.ASSIGN
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1143) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(objNode);
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1153) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(objNode);
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1153) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = functionNode;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: "undefined has no properties"
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType1);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-254);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1158) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = functionNode;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitGetProp1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1153) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, functionNodeType, functionNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = nodeTraversal;
        visitGetPropMethodArguments[1] = functionNode;
        visitGetPropMethodArguments[2] = functionNode1;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetProp2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object jsType1 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1158) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, functionNodeType, functionNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = nodeTraversal;
        visitGetPropMethodArguments[1] = functionNode;
        visitGetPropMethodArguments[2] = functionNode;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetProp3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[21];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:552)
            com.google.javascript.jscomp.TypeValidator.expectNotVoid(TypeValidator.java:232)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1157) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = scriptOrFnNode;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetProp4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1153) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, numberNodeType, numberNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = nodeTraversal;
        visitGetPropMethodArguments[1] = numberNode;
        visitGetPropMethodArguments[2] = node;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetProp5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1153) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, stringNodeType, stringNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = nodeTraversal;
        visitGetPropMethodArguments[1] = stringNode;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetProp6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        nativeTypes[35] = ((JSType) nullType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1157) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitGetProp7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[21];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = node;
        visitGetPropMethodArguments[2] = scriptOrFnNode;
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitCall_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1366) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = node;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node child = n.getFirstChild();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1365) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = ((Object) null);
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1366) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, scriptOrFnNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = scriptOrFnNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1366) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, functionNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = functionNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1366) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, functionNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = functionNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitCall1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 17]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1366) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, numberNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = nodeTraversal;
        visitCallMethodArguments[1] = numberNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitCall2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.canBeCalled(ProxyObjectType.java:90)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1368) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, functionNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = nodeTraversal;
        visitCallMethodArguments[1] = functionNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.returnsFrom {@code return getNativeType(UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typeCheckTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry36TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", functionNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = functionNode;
        TemplateType actual = ((TemplateType) getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        ObjectType actualReferencedType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
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
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisitReturn_NodeTraversalGetEnclosingFunction() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node function = t.getEnclosingFunction();
 *  */
    @Test
    public void testVisitReturn_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1440) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = ((Object) null);
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitReturn1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitReturn2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        scopeRoots.add(functionNode);
        scopeRoots.add(nodeTraversal);
        scopeRoots.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1447) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitReturn3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction(NodeTraversal.java:527)
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1440) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getTypedPercent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypedPercent()
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getTypedPercent()}
 * @utbot.executesCondition {@code (total == 0): True}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testGetTypedPercent_TotalEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount", -1);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", 2);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", -1);
        
        double actual = typeCheck.getTypedPercent();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getTypedPercent()}
 * @utbot.executesCondition {@code (total == 0): False}
 * @utbot.returnsFrom {@code return (100.0 * typedCount) / total;}
 *  */
    @Test
    public void testGetTypedPercent_TotalNotEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount", -36);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", -37);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", -1);
        
        double actual = typeCheck.getTypedPercent();
        
        assertEquals(48.648648648648646, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (info != null): False},
    ///     {@code (n.getJSType() == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 *  */
    @Test
    public void testEnsureTyped_PreconditionsCheckState() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, noObjectTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = noObjectType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 *  */
    @Test
    public void testEnsureTyped_PreconditionsCheckState_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, noTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = noType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 *  */
    @Test
    public void testEnsureTyped_PreconditionsCheckState_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, noObjectTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = noObjectType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 *  */
    @Test
    public void testEnsureTyped_PreconditionsCheckState_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, unknownTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = unknownType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped_NodeSetJSType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        JSType initialFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, noTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = noType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSType finalFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        assertFalse(initialFunctionNodeJsType == finalFunctionNodeJsType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): False}
 *  */
    @Test
    public void testEnsureTyped_InExterns() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "inExterns", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testEnsureTyped_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.JSDocInfo ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1683) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, noTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = noType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.isUnknownType()
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1682) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1680) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() != Token.FUNCTION || type instanceof FunctionType || type.isUnknownType());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType infoType = info.getType().evaluate(t.getScope(), typeRegistry);
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, noTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = noType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isImplicitCast()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getLastChild().getString()
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1693) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testEnsureTyped1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, templateTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = templateType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, unresolvedTypeExpressionType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = unresolvedTypeExpression;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, unresolvedTypeExpressionType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = unresolvedTypeExpression;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped5() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, noObjectTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = noObjectType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testEnsureTyped6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1694) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, unresolvedTypeExpressionType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = unresolvedTypeExpression;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1695) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1694) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped9() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1694) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped10() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:570)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, unresolvedTypeExpressionType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = unresolvedTypeExpression;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped11() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:569)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped12() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1695) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped13() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped14() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped15() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:570)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped16() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:570)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1686) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureTyped17() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(timeout = 1000L)
    public void testEnsureTyped18() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, unresolvedTypeExpressionType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = unresolvedTypeExpression;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testEnsureTyped19() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.REGEXP_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1657) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_21() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1682)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1657) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_11() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1680)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1657) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1657) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testEnsureTyped20() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[4];
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[1] = ((JSType) unknownType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(105);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 3));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
    }
    
    @Test
    public void testEnsureTyped21() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testEnsureTyped22() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[8] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        JSType initialStringNodeJsType = ((JSType) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "jsType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 31));
        
        JSType finalStringNodeJsType = ((JSType) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "jsType"));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertFalse(initialStringNodeJsType == finalStringNodeJsType);
    }
    
    @Test
    public void testEnsureTyped23() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[8] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 31));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testEnsureTyped24() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[8] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 31));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testEnsureTyped25() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[10];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[8] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 9));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testEnsureTyped26() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[8] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSTypeNative objectValue = JSTypeNative.TYPE_ERROR_FUNCTION_TYPE;
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.JSTypeNative cannot be cast to class com.google.javascript.rhino.JSDocInfo (com.google.javascript.rhino.jstype.JSTypeNative and com.google.javascript.rhino.JSDocInfo are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1683)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1657) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_22() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1682)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = functionNode;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_12() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1680)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testEnsureTyped27() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    
    @Test
    public void testEnsureTyped28() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typeCheckTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry36TypeRegistryNativeTypes, 36));
        JSTypeRegistry typeCheckTypeRegistry37 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes37 = ((JSType) get(typeCheckTypeRegistry37TypeRegistryNativeTypes, 37));
        JSTypeRegistry typeCheckTypeRegistry38 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes38 = ((JSType) get(typeCheckTypeRegistry38TypeRegistryNativeTypes, 38));
        JSTypeRegistry typeCheckTypeRegistry39 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry39TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry39, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes39 = ((JSType) get(typeCheckTypeRegistry39TypeRegistryNativeTypes, 39));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes37);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes38);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes39);
    }
    
    @Test
    public void testEnsureTyped29() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[35] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
    }
    
    @Test
    public void testEnsureTyped30() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[35] = ((JSType) unknownType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
    }
    
    @Test
    public void testEnsureTyped31() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, functionNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = functionNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    
    @Test
    public void testEnsureTyped32() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[35] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, scriptOrFnNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = scriptOrFnNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
    }
    
    @Test
    public void testEnsureTyped33() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testEnsureTyped34() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[35] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSTypeNative objectValue = JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE;
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.JSTypeNative cannot be cast to class com.google.javascript.rhino.JSDocInfo (com.google.javascript.rhino.jstype.JSTypeNative and com.google.javascript.rhino.JSDocInfo are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1683)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped35() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.rhino.JSDocInfo (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1683)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1653) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = stringNode;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getFunctionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getFunctionType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetFunctionType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", scriptOrFnNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = scriptOrFnNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getFunctionType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testGetFunctionType_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", nodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = ((Object) null);
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getFunctionType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testGetFunctionType_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", functionNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = functionNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getFunctionType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testGetFunctionType_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", scriptOrFnNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = scriptOrFnNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFunctionType(com.google.javascript.rhino.Node)
    
    @Test
    public void testGetFunctionType1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:49)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1633) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", numberNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = numberNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetFunctionType2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:218)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", numberNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = numberNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetFunctionType3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.jscomp.TypeCheck.getFunctionType(TypeCheck.java:1632) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionTypeMethod = typeCheckClazz.getDeclaredMethod("getFunctionType", numberNodeType);
        getFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] getFunctionTypeMethodArguments = new java.lang.Object[1];
        getFunctionTypeMethodArguments[0] = numberNode;
        try {
            getFunctionTypeMethod.invoke(typeCheck, getFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.isReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isReference(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isReference(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsReference_ReturnTrue() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(35);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReferenceMethod = typeCheckClazz.getDeclaredMethod("isReference", functionNodeType);
        isReferenceMethod.setAccessible(true);
        java.lang.Object[] isReferenceMethodArguments = new java.lang.Object[1];
        isReferenceMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isReferenceMethod.invoke(null, isReferenceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isReference(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsReference_ReturnFalse() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReferenceMethod = typeCheckClazz.getDeclaredMethod("isReference", scriptOrFnNodeType);
        isReferenceMethod.setAccessible(true);
        java.lang.Object[] isReferenceMethodArguments = new java.lang.Object[1];
        isReferenceMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isReferenceMethod.invoke(null, isReferenceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isReference(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isReference(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testIsReference_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isReference(TypeCheck.java:1598) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReferenceMethod = typeCheckClazz.getDeclaredMethod("isReference", nodeType);
        isReferenceMethod.setAccessible(true);
        java.lang.Object[] isReferenceMethodArguments = new java.lang.Object[1];
        isReferenceMethodArguments[0] = ((Object) null);
        try {
            isReferenceMethod.invoke(null, isReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.propertyIsImplicitCast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPropertyIsImplicitCast_ReturnFalse() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method propertyIsImplicitCastMethod = typeCheckClazz.getDeclaredMethod("propertyIsImplicitCast", objectTypeType, stringType);
        propertyIsImplicitCastMethod.setAccessible(true);
        java.lang.Object[] propertyIsImplicitCastMethodArguments = new java.lang.Object[2];
        propertyIsImplicitCastMethodArguments[0] = ((Object) null);
        propertyIsImplicitCastMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) propertyIsImplicitCastMethod.invoke(typeCheck, propertyIsImplicitCastMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_Return() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_Return_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, noTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = noType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_Return_4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, noObjectTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = noObjectType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        
        boolean finalNoObjectTypeUnknown = ((Boolean) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalNoObjectTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_Return_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_Return_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctorType.hasUnknownSupertype()
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:955) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctorType.hasUnknownSupertype()
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:550)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:955) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#getAbstractMethodName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isOrdinaryFunction()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testVisitInterfaceGetprop_NodeGetType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, stringType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = scriptOrFnNode;
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = scriptOrFnNode;
        visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1047) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = scriptOrFnNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType rvalueType = getJSType(rvalue);
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1047) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = ((Object) null);
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1056) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().getType() == Token.FUNCTION && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1056) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1056) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().getType() == Token.FUNCTION && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().getType() == Token.FUNCTION && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, stringType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = scriptOrFnNode;
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rvalueType.isOrdinaryFunction() && !(rvalue.isQualifiedName() && rvalue.getQualifiedName().equals(abstractMethodName))
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1057) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = functionNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, noTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = noType;
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = scriptOrFnNode;
        visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        nativeTypes[35] = ((JSType) unresolvedTypeExpression);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Node node = new Node(0);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, noObjectTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = noObjectType;
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = node;
        visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[35] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateType1Type = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, templateType1Type, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = templateType1;
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = scriptOrFnNode;
        visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop(TypeCheck.java:1087) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, jSTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = functionNode;
        try {
            visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type, object, property);
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop(TypeCheck.java:1087) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, jSTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = scriptOrFnNode;
        try {
            visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type, object, property);
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop(TypeCheck.java:1087) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, jSTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = ((Object) null);
        try {
            visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type, object, property);
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop(TypeCheck.java:1087) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, jSTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = functionNode;
        try {
            visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type, object, property);
 *  */
    @Test
    public void testVisitAnnotatedAssignGetprop_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAnnotatedAssignGetprop(TypeCheck.java:1087) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method visitAnnotatedAssignGetpropMethod = typeCheckClazz.getDeclaredMethod("visitAnnotatedAssignGetprop", nodeTraversalType, nodeType, jSTypeType, nodeType, stringType, nodeType);
        visitAnnotatedAssignGetpropMethod.setAccessible(true);
        java.lang.Object[] visitAnnotatedAssignGetpropMethodArguments = new java.lang.Object[6];
        visitAnnotatedAssignGetpropMethodArguments[0] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[1] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[2] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[3] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[4] = ((Object) null);
        visitAnnotatedAssignGetpropMethodArguments[5] = node;
        try {
            visitAnnotatedAssignGetpropMethod.invoke(typeCheck, visitAnnotatedAssignGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDoPercentTypedAccounting() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", -255);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, scriptOrFnNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = scriptOrFnNode;
        doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        
        int finalTypeCheckNullCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        
        org.junit.Assert.assertEquals(-254, finalTypeCheckNullCount);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CheckLevel#isOn()}
 *  */
    @Test
    public void testDoPercentTypedAccounting_CheckLevelIsOn() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        CheckLevel reportUnknownTypes = CheckLevel.OFF;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes", reportUnknownTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", 1);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, scriptOrFnNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = scriptOrFnNode;
        doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        
        int finalTypeCheckUnknownCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        
        org.junit.Assert.assertEquals(2, finalTypeCheckUnknownCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:798) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = ((Object) null);
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reportUnknownTypes.isOn()
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:802) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, scriptOrFnNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = scriptOrFnNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reportUnknownTypes.isOn()
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:802) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, scriptOrFnNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = scriptOrFnNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testDoPercentTypedAccounting1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, functionNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = nodeTraversal;
        doPercentTypedAccountingMethodArguments[1] = functionNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoPercentTypedAccounting2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:801) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, functionNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = functionNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoPercentTypedAccounting3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:802) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, functionNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = nodeTraversal;
        doPercentTypedAccountingMethodArguments[1] = functionNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoPercentTypedAccounting4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        CheckLevel reportUnknownTypes = CheckLevel.WARNING;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes", reportUnknownTypes);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:804) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitBinaryOperator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitBinaryOperator(int, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1488) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, scriptOrFnNodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -254;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = scriptOrFnNode;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1487) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = ((Object) null);
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1615)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1488) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, scriptOrFnNodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = scriptOrFnNode;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(op) case: Token.BITOR}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectBitwiseable(t, left, leftType, "bad left operand to bitwise operator");
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1526) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = 89;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(op) case: Token.SUB}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectNumber(t, left, leftType, "left operand");
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1516) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = 25;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1488) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.reportMissingProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportMissingProperties(boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#reportMissingProperties(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReportMissingProperties_Return() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        TypeCheck actual = typeCheck.reportMissingProperties(false);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "compiler"));
        assertNull(actualCompiler);
        
        TypeValidator actualValidator = ((TypeValidator) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "validator"));
        assertNull(actualValidator);
        
        ReverseAbstractInterpreter actualReverseInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reverseInterpreter"));
        assertNull(actualReverseInterpreter);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Scope actualTopScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "topScope"));
        assertNull(actualTopScope);
        
        ScopeCreator actualScopeCreator = ((ScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "scopeCreator"));
        assertNull(actualScopeCreator);
        
        CheckLevel actualReportMissingOverride = ((CheckLevel) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportMissingOverride"));
        assertNull(actualReportMissingOverride);
        
        CheckLevel actualReportUnknownTypes = ((CheckLevel) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes"));
        assertNull(actualReportUnknownTypes);
        
        boolean actualReportMissingProperties = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties"));
        assertFalse(actualReportMissingProperties);
        
        InferJSDocInfo actualInferJSDocInfo = ((InferJSDocInfo) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "inferJSDocInfo"));
        assertNull(actualInferJSDocInfo);
        
        int typeCheckTypedCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount"));
        int actualTypedCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "typedCount"));
        org.junit.Assert.assertEquals(typeCheckTypedCount, actualTypedCount);
        
        int typeCheckNullCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        int actualNullCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        org.junit.Assert.assertEquals(typeCheckNullCount, actualNullCount);
        
        int typeCheckUnknownCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        int actualUnknownCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        org.junit.Assert.assertEquals(typeCheckUnknownCount, actualUnknownCount);
        
        boolean actualInExterns = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "inExterns"));
        assertFalse(actualInExterns);
        
        int typeCheckNoTypeCheckSection = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection"));
        int actualNoTypeCheckSection = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection"));
        org.junit.Assert.assertEquals(typeCheckNoTypeCheckSection, actualNoTypeCheckSection);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkEnumInitializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): True}
 *  */
    @Test
    public void testCheckEnumInitializer_ValueEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (value.getJSType() instanceof EnumType): False}
 *  */
    @Test
    public void testCheckEnumInitializer_NotValueGetJSTypeNotInstanceOfEnumType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 *  */
    @Test
    public void testCheckEnumInitializer_ValueNotEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (value.getJSType() instanceof EnumType): True}
 *  */
    @Test
    public void testCheckEnumInitializer_ValueGetJSTypeInstanceOfEnumType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        EnumType jsType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        EnumElementType elementsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnknownType primitiveType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(elementsType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        setField(jsType, "com.google.javascript.rhino.jstype.EnumType", "elementsType", elementsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 * @utbot.iterates iterate the loop {@code while(value != null)} once
 *  */
    @Test
    public void testCheckEnumInitializer_ValueEqualsNull_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, nodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = node;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (value.getJSType() instanceof EnumType): True}
 *  */
    @Test
    public void testCheckEnumInitializer_ValueGetJSTypeInstanceOfEnumType_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        EnumType jsType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        EnumElementType elementsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        TemplateType primitiveType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(elementsType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        setField(jsType, "com.google.javascript.rhino.jstype.EnumType", "elementsType", elementsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 * @utbot.iterates iterate the loop {@code while(value != null)} once
 *  */
    @Test
    public void testCheckEnumInitializer_ValueNotEqualsNull_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, nodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = node;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 * @utbot.iterates iterate the loop {@code while(value != null)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: validator.expectCanAssignTo(t, value, getJSType(value), primitiveType, "element type must match enum's type");
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:766)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:1718)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1621)
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1566) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, nodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = node;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.getType() == Token.OBJECTLIT
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1560) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, nodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = ((Object) null);
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (value.getJSType() instanceof EnumType): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueEnumType.getElementsType().getPrimitiveType()
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        EnumType jsType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1581) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 * @utbot.iterates iterate the loop {@code while(value != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignTo(t, value, getJSType(value), primitiveType, "element type must match enum's type");
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1566) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (value.getJSType() instanceof EnumType): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.EnumElementType#getPrimitiveType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignTo(t, value, valueEnumPrimitiveType, primitiveType, "incompatible enum element types");
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        EnumType jsType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        EnumElementType elementsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.EnumType", "elementsType", elementsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1582) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, functionNodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = functionNode;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumInitializer(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code ((value == null)): False}
 * @utbot.iterates iterate the loop {@code while(value != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectCanAssignTo(t, value, getJSType(value), primitiveType, "element type must match enum's type");
 *  */
    @Test
    public void testCheckEnumInitializer_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumInitializer(TypeCheck.java:1566) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkEnumInitializerMethod = typeCheckClazz.getDeclaredMethod("checkEnumInitializer", nodeTraversalType, nodeType, jSTypeType);
        checkEnumInitializerMethod.setAccessible(true);
        java.lang.Object[] checkEnumInitializerMethodArguments = new java.lang.Object[3];
        checkEnumInitializerMethodArguments[0] = ((Object) null);
        checkEnumInitializerMethodArguments[1] = node;
        checkEnumInitializerMethodArguments[2] = ((Object) null);
        try {
            checkEnumInitializerMethod.invoke(typeCheck, checkEnumInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testCheckNoTypeCheckSection_SwitchNGetTypeCasedefault() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#setShouldReport(boolean)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ValidatorSetShouldReport() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Node node = new Node(125);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1963)
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:387) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:381) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = ((Object) null);
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Node node = new Node(125);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(125);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): True}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): True}
 * @utbot.executesCondition {@code (enterSection): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): True}
 * @utbot.executesCondition {@code (enterSection): True}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = true;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:395) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields901724114108900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields901724114108900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass901724114117100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901724114108900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901724114117100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields901724114667800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields901724114667800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass901724114670000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901724114667800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901724114670000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

