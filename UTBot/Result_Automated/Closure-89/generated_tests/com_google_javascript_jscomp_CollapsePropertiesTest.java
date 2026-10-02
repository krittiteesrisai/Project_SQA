package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.GlobalNamespace.Name.Type;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CollapsePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateSimpleDeclaration(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:478) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ((Object) null);
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:478) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node gramps = parent.getParent();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:480) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node greatGramps = gramps.getParent();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:481) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node greatGreatGramps = greatGramps.getParent();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:482) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:487) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: refName.fullName()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_6() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:488) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = ((Object) null);
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#fullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newName(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node nameNode = NodeUtil.newName(compiler.getCodingConvention(), alias, gramps.getFirstChild(), refName.fullName());
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_7() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u8000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1889)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1850)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1870)
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:486) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = string;
        updateSimpleDeclarationMethodArguments[1] = name;
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateSimpleDeclaration(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#fullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newName(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node nameNode = NodeUtil.newName(compiler.getCodingConvention(), alias, gramps.getFirstChild(), refName.fullName());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateSimpleDeclaration_ThrowIllegalArgumentException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method updateSimpleDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateSimpleDeclaration", stringType, nameType, refType);
        updateSimpleDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateSimpleDeclarationMethodArguments = new java.lang.Object[3];
        updateSimpleDeclarationMethodArguments[0] = ((Object) null);
        updateSimpleDeclarationMethodArguments[1] = name;
        updateSimpleDeclarationMethodArguments[2] = ref;
        try {
            updateSimpleDeclarationMethod.invoke(collapseProperties, updateSimpleDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.inlineAliases
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inlineAliases(com.google.javascript.jscomp.GlobalNamespace)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliases(com.google.javascript.jscomp.GlobalNamespace)}
 *  */
    @Test
    public void testInlineAliases_NotWorkListIsEmpty() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        ArrayList globalNames = new ArrayList();
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "globalNames", globalNames);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasesMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliases", globalNamespaceType);
        inlineAliasesMethod.setAccessible(true);
        java.lang.Object[] inlineAliasesMethodArguments = new java.lang.Object[1];
        inlineAliasesMethodArguments[0] = globalNamespace;
        inlineAliasesMethod.invoke(collapseProperties, inlineAliasesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliases(com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.iterates iterate the loop {@code while(!workList.isEmpty())} once
 *  */
    @Test
    public void testInlineAliases_NotWorkListIsEmpty_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        ArrayList globalNames = new ArrayList();
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        globalNames.add(name);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "globalNames", globalNames);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasesMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliases", globalNamespaceType);
        inlineAliasesMethod.setAccessible(true);
        java.lang.Object[] inlineAliasesMethodArguments = new java.lang.Object[1];
        inlineAliasesMethodArguments[0] = globalNamespace;
        inlineAliasesMethod.invoke(collapseProperties, inlineAliasesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inlineAliases(com.google.javascript.jscomp.GlobalNamespace)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliases(com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Deque<Name> workList = new ArrayDeque<Name>(namespace.getNameForest());
 *  */
    @Test
    public void testInlineAliases_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliases] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliases(CollapseProperties.java:160) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasesMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliases", globalNamespaceType);
        inlineAliasesMethod.setAccessible(true);
        java.lang.Object[] inlineAliasesMethodArguments = new java.lang.Object[1];
        inlineAliasesMethodArguments[0] = ((Object) null);
        try {
            inlineAliasesMethod.invoke(collapseProperties, inlineAliasesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliases(com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Deque<Name> workList = new ArrayDeque<Name>(namespace.getNameForest());
 *  */
    @Test
    public void testInlineAliases_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        ArrayList globalNames = new ArrayList();
        globalNames.add(null);
        globalNames.add(null);
        globalNames.add(null);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "globalNames", globalNames);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliases] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addLast(ArrayDeque.java:303)
            java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            java.base/java.util.ArrayDeque.copyElements(ArrayDeque.java:329)
            java.base/java.util.ArrayDeque.<init>(ArrayDeque.java:210)
            com.google.javascript.jscomp.CollapseProperties.inlineAliases(CollapseProperties.java:160) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasesMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliases", globalNamespaceType);
        inlineAliasesMethod.setAccessible(true);
        java.lang.Object[] inlineAliasesMethodArguments = new java.lang.Object[1];
        inlineAliasesMethodArguments[0] = globalNamespace;
        try {
            inlineAliasesMethod.invoke(collapseProperties, inlineAliasesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenPrefixes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, int)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (n.declaration != null): False}
 * @utbot.executesCondition {@code (n.refs != null): False}
 *  */
    @Test
    public void testFlattenPrefixes_NRefsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = name;
        flattenPrefixesMethodArguments[2] = -255;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        
        List finalNameProps = name.props;
        List finalNameRefs = name.refs;
        
        assertNull(finalNameProps);
        
        assertNull(finalNameRefs);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (n.declaration != null): True}
 * @utbot.executesCondition {@code (n.declaration.node != null): True}
 * @utbot.executesCondition {@code (n.declaration.node.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (n.refs != null): False}
 *  */
    @Test
    public void testFlattenPrefixes_NDeclarationNodeGetTypeNotEqualsTokenGETPROP() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(-255);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = name;
        flattenPrefixesMethodArguments[2] = -255;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        
        List finalNameProps = name.props;
        List finalNameRefs = name.refs;
        
        assertNull(finalNameProps);
        
        assertNull(finalNameRefs);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (n.declaration != null): False}
 * @utbot.executesCondition {@code (n.refs != null): True}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testFlattenPrefixes_NRefsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList refs = new ArrayList();
        name.refs = refs;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = name;
        flattenPrefixesMethodArguments[2] = -255;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (n.declaration != null): True}
 * @utbot.executesCondition {@code (n.declaration.node != null): False}
 * @utbot.executesCondition {@code (n.refs != null): False}
 *  */
    @Test
    public void testFlattenPrefixes_NDeclarationNodeEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = name;
        flattenPrefixesMethodArguments[2] = -255;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        
        List finalNameProps = name.props;
        List finalNameRefs = name.refs;
        
        assertNull(finalNameProps);
        
        assertNull(finalNameRefs);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (n.declaration != null): True}
 * @utbot.executesCondition {@code (n.declaration.node != null): True}
 * @utbot.executesCondition {@code (n.declaration.node.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (n.refs != null): False}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)
 *  */
    @Test
    public void testFlattenPrefixes_NDeclarationNodeGetTypeEqualsTokenGETPROP() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(33);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = name;
        flattenPrefixesMethodArguments[2] = 1;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        
        List finalNameProps = name.props;
        List finalNameRefs = name.refs;
        
        assertNull(finalNameProps);
        
        assertNull(finalNameRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, int)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#fullName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String originalName = n.fullName();
 *  */
    @Test
    public void testFlattenPrefixes_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(CollapseProperties.java:356) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, nameType, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = ((Object) null);
        flattenPrefixesMethodArguments[1] = ((Object) null);
        flattenPrefixesMethodArguments[2] = -255;
        try {
            flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenNameRef
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenNameRef(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testFlattenNameRef_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:427) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = ((Object) null);
        flattenNameRefMethodArguments[1] = ((Object) null);
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlattenNameRef_ThrowNullPointerException_1() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u8000";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1889)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1850)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1870)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:426) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = ((Object) null);
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlattenNameRef_ThrowNullPointerException_2() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u0410";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1889)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1850)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:1870)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:426) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = ((Object) null);
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flattenNameRef(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node ref = NodeUtil.newName(compiler.getCodingConvention(), alias, n, originalName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFlattenNameRef_ThrowIllegalArgumentException_1() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = ((Object) null);
        flattenNameRefMethodArguments[1] = ((Object) null);
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node ref = NodeUtil.newName(compiler.getCodingConvention(), alias, n, originalName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFlattenNameRef_ThrowIllegalArgumentException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = ((Object) null);
        flattenNameRefMethodArguments[1] = ((Object) null);
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flattenNameRef(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testFlattenNameRef1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, numberNodeType, numberNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = numberNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef2() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = scriptOrFnNode;
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef4() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, numberNodeType, numberNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = numberNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef5() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef6() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = string1;
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef7() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef8() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        Object objectValue = createInstance("java.lang.Object");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, numberNodeType, numberNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = numberNode;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRef9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next4, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        Object objectValue = createInstance("java.lang.Object");
        setField(next4, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:1697)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:428) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, stringNodeType, stringNodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = stringNode;
        flattenNameRefMethodArguments[2] = numberNode;
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.checkNamespaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNamespaces()
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkNamespaces()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 *  */
    @Test
    public void testCheckNamespaces_CollectionIterator() throws Exception  {
        CollapseProperties collapseProperties = ((CollapseProperties) createInstance("com.google.javascript.jscomp.CollapseProperties"));
        LinkedHashMap nameMap = new LinkedHashMap();
        setField(collapseProperties, "com.google.javascript.jscomp.CollapseProperties", "nameMap", nameMap);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Method checkNamespacesMethod = collapsePropertiesClazz.getDeclaredMethod("checkNamespaces");
        checkNamespacesMethod.setAccessible(true);
        java.lang.Object[] checkNamespacesMethodArguments = new java.lang.Object[0];
        checkNamespacesMethod.invoke(collapseProperties, checkNamespacesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNamespaces()
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkNamespaces()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Name name: nameMap.values())
 *  */
    @Test
    public void testCheckNamespaces_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkNamespaces] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.checkNamespaces(CollapseProperties.java:243) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Method checkNamespacesMethod = collapsePropertiesClazz.getDeclaredMethod("checkNamespaces");
        checkNamespacesMethod.setAccessible(true);
        java.lang.Object[] checkNamespacesMethodArguments = new java.lang.Object[0];
        try {
            checkNamespacesMethod.invoke(collapseProperties, checkNamespacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkNamespaces()
    
    @Test
    public void testCheckNamespaces1() throws Exception  {
        CollapseProperties collapseProperties = ((CollapseProperties) createInstance("com.google.javascript.jscomp.CollapseProperties"));
        LinkedHashMap nameMap = new LinkedHashMap();
        String string = "";
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        nameMap.put(string, name);
        setField(collapseProperties, "com.google.javascript.jscomp.CollapseProperties", "nameMap", nameMap);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Method checkNamespacesMethod = collapsePropertiesClazz.getDeclaredMethod("checkNamespaces");
        checkNamespacesMethod.setAccessible(true);
        java.lang.Object[] checkNamespacesMethodArguments = new java.lang.Object[0];
        checkNamespacesMethod.invoke(collapseProperties, checkNamespacesMethodArguments);
    }
    
    @Test
    public void testCheckNamespaces2() throws Exception  {
        CollapseProperties collapseProperties = ((CollapseProperties) createInstance("com.google.javascript.jscomp.CollapseProperties"));
        LinkedHashMap nameMap = new LinkedHashMap();
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        nameMap.put(null, name);
        String string = "";
        nameMap.put(string, name);
        setField(collapseProperties, "com.google.javascript.jscomp.CollapseProperties", "nameMap", nameMap);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Method checkNamespacesMethod = collapsePropertiesClazz.getDeclaredMethod("checkNamespaces");
        checkNamespacesMethod.setAccessible(true);
        java.lang.Object[] checkNamespacesMethodArguments = new java.lang.Object[0];
        checkNamespacesMethod.invoke(collapseProperties, checkNamespacesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkNamespaces()
    
    @Test
    public void testCheckNamespaces3() throws Throwable  {
        CollapseProperties collapseProperties = ((CollapseProperties) createInstance("com.google.javascript.jscomp.CollapseProperties"));
        LinkedHashMap nameMap = new LinkedHashMap();
        String string = "";
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        nameMap.put(string, name);
        char[] charArray = {};
        nameMap.put(null, charArray);
        setField(collapseProperties, "com.google.javascript.jscomp.CollapseProperties", "nameMap", nameMap);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkNamespaces] produces [java.lang.ClassCastException: class [C cannot be cast to class com.google.javascript.jscomp.GlobalNamespace$Name ([C is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.GlobalNamespace$Name is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @65a57aed)]
            com.google.javascript.jscomp.CollapseProperties.checkNamespaces(CollapseProperties.java:243) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Method checkNamespacesMethod = collapsePropertiesClazz.getDeclaredMethod("checkNamespaces");
        checkNamespacesMethod.setAccessible(true);
        java.lang.Object[] checkNamespacesMethodArguments = new java.lang.Object[0];
        try {
            checkNamespacesMethod.invoke(collapseProperties, checkNamespacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.appendPropForAlias
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendPropForAlias(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#appendPropForAlias(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.indexOf('$') != -1
 *  */
    @Test
    public void testAppendPropForAlias_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.appendPropForAlias] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:845) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Method appendPropForAliasMethod = collapsePropertiesClazz.getDeclaredMethod("appendPropForAlias", stringType, stringType);
        appendPropForAliasMethod.setAccessible(true);
        java.lang.Object[] appendPropForAliasMethodArguments = new java.lang.Object[2];
        appendPropForAliasMethodArguments[0] = ((Object) null);
        appendPropForAliasMethodArguments[1] = ((Object) null);
        try {
            appendPropForAliasMethod.invoke(null, appendPropForAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendPropForAlias(java.lang.String, java.lang.String)
    
    @Test
    public void testAppendPropForAlias1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\u0000\u0000";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Method appendPropForAliasMethod = collapsePropertiesClazz.getDeclaredMethod("appendPropForAlias", stringType, stringType);
        appendPropForAliasMethod.setAccessible(true);
        java.lang.Object[] appendPropForAliasMethodArguments = new java.lang.Object[2];
        appendPropForAliasMethodArguments[0] = ((Object) null);
        appendPropForAliasMethodArguments[1] = string;
        String actual = ((String) appendPropForAliasMethod.invoke(null, appendPropForAliasMethodArguments));
        
        String expected = "null$\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAppendPropForAlias2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\u0000$";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Method appendPropForAliasMethod = collapsePropertiesClazz.getDeclaredMethod("appendPropForAlias", stringType, stringType);
        appendPropForAliasMethod.setAccessible(true);
        java.lang.Object[] appendPropForAliasMethodArguments = new java.lang.Object[2];
        appendPropForAliasMethodArguments[0] = ((Object) null);
        appendPropForAliasMethodArguments[1] = string;
        String actual = ((String) appendPropForAliasMethod.invoke(null, appendPropForAliasMethodArguments));
        
        String expected = "null$\u0000\u0000$0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(125);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(node, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.declaration;
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:703) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = ((Object) null);
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = ref.node.getString();
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:704) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = ref.node.getString();
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:704) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        GlobalNamespace.Name name1 = new GlobalNamespace.Name(null, null, false);
        name1.globalSets = 0;
        name1.localSets = 1;
        props.add(name1);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(node, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:845)
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:823)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String fnName = ref.node.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(40);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalArgumentException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "\u0000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) node)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "parent", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        name.globalSets = 0;
        name.localSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:830)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:822)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        GlobalNamespace.Name name1 = new GlobalNamespace.Name(null, null, false);
        name1.globalSets = Integer.MIN_VALUE;
        props.add(name1);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) node)).setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:822)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        GlobalNamespace.Name name1 = new GlobalNamespace.Name(null, null, false);
        name1.globalSets = 0;
        name1.localSets = 0;
        props.add(name1);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) node)).setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:822)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        String string = "\u0000$\u0000";
        GlobalNamespace.Name name1 = new GlobalNamespace.Name(string, null, false);
        name1.globalSets = 0;
        name1.localSets = 1;
        props.add(name1);
        props.add(null);
        props.add(null);
        name.props = props;
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:830)
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:705) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[1];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.declaration;
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:580) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:581) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:581) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.aliasingGets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.aliasingGets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type1;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_8() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.totalGets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_10() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type;
        name.globalSets = 1;
        name.aliasingGets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        name.docInfo = docInfo;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_9() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        name.docInfo = docInfo;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.localSets = -255;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ref.node.getParent().removeChild(rvalue);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_11() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.localSets = 0;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        name.globalSets = 1;
        name.totalGets = -2147483647;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:589) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", declaration);
        parent.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.globalSets = 1;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration1 = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration1, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type1;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:597) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        parent.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.globalSets = 1;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration1 = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration1, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type1;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:589) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        parent.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        setField(parent, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        parent.globalSets = 1;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration1 = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration1, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type1;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:589) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:585) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        name.docInfo = null;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:594) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        name.docInfo = docInfo;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:594) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode8() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        props.add(null);
        props.add(null);
        props.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.aliasingGets = -2147483647;
        name.totalGets = -2147483647;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace$Name.canEliminate(GlobalNamespace.java:882)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:587) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    @Test(expected = NullPointerException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode9() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.globalSets = 1;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type1;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode10() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        parent.globalSets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        name.globalSets = 1;
        name.aliasingGets = -2147483647;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (if (n.canCollapse() && canCollapseChildNames) {
 *     updateObjLitOrFunctionDeclaration(n, alias);
 * }): False}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_NCanCollapseAndCanCollapseChildNames() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        name.globalSets = 1;
        name.localSets = -255;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (if (n.canCollapse() && canCollapseChildNames) {
 *     updateObjLitOrFunctionDeclaration(n, alias);
 * }): False}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_NCanCollapseAndCanCollapseChildNames_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.localSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        name.globalSets = 1;
        name.inExterns = true;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#canCollapseUnannotatedChildNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canCollapseChildNames = n.canCollapseUnannotatedChildNames();
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:442) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        try {
            collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants2() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants3() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants4() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        name.globalSets = 1;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants5() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants6() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants7() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        name.globalSets = 1;
        name.localSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants8() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        name.globalSets = -2147483647;
        name.localSets = 2;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants9() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        name.globalSets = 1;
        name.localSets = 2;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants10() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        name.globalSets = 2;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants11() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type;
        name.globalSets = 1;
        name.inExterns = true;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants12() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        name.globalSets = 1;
        name.aliasingGets = 1;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants13() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.aliasingGets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants14() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants15() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        name.globalSets = 1;
        name.aliasingGets = 1;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants16() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        ArrayList props = new ArrayList();
        name.props = props;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants17() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", declaration);
        name.declaration = declaration;
        name.type = null;
        name.globalSets = 1;
        name.localSets = 0;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants18() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        ArrayList props = new ArrayList();
        name.props = props;
        name.type = null;
        name.globalSets = 0;
        String string = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = string;
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants19() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "isClassOrEnum", true);
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553)
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:446) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        try {
            collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants20() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553)
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:446) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        try {
            collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCollapseDeclarationOfNameAndDescendants21() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553)
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:446) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        try {
            collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.props == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames_NPropsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.props == null): False}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames_NPropsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        name.props = props;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.props == null
 *  */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:296) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = ((Object) null);
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.props == null): False}
 * @utbot.iterates iterate the loop {@code for(Name p: n.props)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propAlias = appendPropForAlias(alias, p.name);
 *  */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:845)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:299) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.props == null): False}
 * @utbot.iterates iterate the loop {@code for(Name p: n.props)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propAlias = appendPropForAlias(alias, p.name);
 *  */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:299) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testFlattenReferencesToCollapsibleDescendantNames1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "\u0000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFlattenReferencesToCollapsibleDescendantNames2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = string;
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNames3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "\u0000$\u0000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames] produces [java.util.regex.PatternSyntaxException: Stack overflow during pattern compilation
        \$]
            java.base/java.util.regex.Pattern.error(Pattern.java:2028)
            java.base/java.util.regex.Pattern.<init>(Pattern.java:1432)
            java.base/java.util.regex.Pattern.compile(Pattern.java:1069)
            java.base/java.lang.String.replaceAll(String.java:2946)
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:849)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:299)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:305) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFlattenReferencesToCollapsibleDescendantNames4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (isObjLit): False}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): False}
 * @utbot.executesCondition {@code (numChanges > 0): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_NumChangesLessOrEqualZero() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(node, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.declaration;
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:661) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ref.node.getString();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:662) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ref.node.getString();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:662) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildBefore(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:672) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node gramps = varNode.getParent();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:665) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isObjLit = rvalue.getType() == Token.OBJECTLIT;
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:667) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = ref.node.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(40);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildBefore(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n
 *  */
    @Test(expected = RuntimeException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowRuntimeException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", node);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[1];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#shouldKeepKeys()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return numVars;}
 *  */
    @Test
    public void testDeclareVarsForObjLitValues_BooleanDiscardKeysInitializedByNotObjlitNameShouldKeepKeys() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        Node node = new Node(0);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = node;
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        int actual = ((Integer) declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#shouldKeepKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean discardKeys = !objlitName.shouldKeepKeys();
 *  */
    @Test
    public void testDeclareVarsForObjLitValues_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:727) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node key = objlit.getFirstChild(), nextKey; key != null; key = nextKey)
 *  */
    @Test
    public void testDeclareVarsForObjLitValues_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:729) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node key = objlit.getFirstChild(), nextKey; key != null; key = nextKey)
 *  */
    @Test
    public void testDeclareVarsForObjLitValues_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:729) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node key = objlit.getFirstChild(), nextKey; key != null; key = nextKey)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TokenStream.isJSIdentifier(key.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = functionNode;
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node key = objlit.getFirstChild(), nextKey; key != null; key = nextKey)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TokenStream.isJSIdentifier(key.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues_ThrowIllegalStateException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = node;
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(n.declaration.node.getParent().getType()) case: default}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_SwitchNDeclarationNodeGetParentGetTypeCasedefault() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name)
 * @utbot.activatesSwitch {@code switch(n.declaration.node.getParent().getType()) case: default}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_CollapsePropertiesUpdateObjLitOrFunctionDeclarationAtVarNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.declaration.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.declaration.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.declaration.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.declaration.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:553) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateObjLitOrFunctionDeclarationAtVarNode(n);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:672)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:558) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateObjLitOrFunctionDeclarationAtVarNode(n);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:667)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:558) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name)
 * @utbot.activatesSwitch {@code switch(n.declaration.node.getParent().getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateFunctionDeclarationAtFunctionNode(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        node.setType(40);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: updateObjLitOrFunctionDeclarationAtVarNode(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        ScriptOrFnNode node = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: updateObjLitOrFunctionDeclarationAtVarNode(n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalArgumentException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: updateObjLitOrFunctionDeclarationAtVarNode(n);
 *  */
    @Test(expected = RuntimeException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowRuntimeException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(64);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        name.declaration = declaration;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkForHosedThisReferences(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): False}
 *  */
    @Test
    public void testCheckForHosedThisReferences_NotDocInfoIsConstructorAndNotDocInfoHasThisType() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[1] = jSDocInfo;
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): True}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasThisType()}
 *  */
    @Test
    public void testCheckForHosedThisReferences_NotDocInfoIsConstructorAndNotDocInfoHasThisType_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[1] = jSDocInfo;
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkForHosedThisReferences(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (docInfo == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, function.getLastChild(), new NodeTraversal.AbstractShallowCallback() {
 * 
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.getType() == Token.THIS) {
 *             compiler.report(JSError.make(name.declaration.sourceName, n, UNSAFE_THIS, name.fullName()));
 *         }
 *     }
 * });
 *  */
    @Test
    public void testCheckForHosedThisReferences_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[1] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        try {
            checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (docInfo == null): False}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): True}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, function.getLastChild(), new NodeTraversal.AbstractShallowCallback() {
 * 
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.getType() == Token.THIS) {
 *             compiler.report(JSError.make(name.declaration.sourceName, n, UNSAFE_THIS, name.fullName()));
 *         }
 *     }
 * });
 *  */
    @Test
    public void testCheckForHosedThisReferences_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[1] = jSDocInfo;
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        try {
            checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (docInfo == null): False}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): True}
 * @utbot.executesCondition {@code ((!docInfo.isConstructor() && !docInfo.hasThisType())): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, function.getLastChild(), new NodeTraversal.AbstractShallowCallback() {
 * 
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.getType() == Token.THIS) {
 *             compiler.report(JSError.make(name.declaration.sourceName, n, UNSAFE_THIS, name.fullName()));
 *         }
 *     }
 * });
 *  */
    @Test
    public void testCheckForHosedThisReferences_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", scriptOrFnNodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = scriptOrFnNode;
        checkForHosedThisReferencesMethodArguments[1] = jSDocInfo;
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        try {
            checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method checkForHosedThisReferences(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#checkForHosedThisReferences(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo,com.google.javascript.jscomp.GlobalNamespace.Name)}
     */
    @Test
    public void testCheckForHosedThisReferencesThrowsNPE() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        Node node = new Node(Integer.MAX_VALUE, Integer.MIN_VALUE, -1);
        node.setType(2);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:640) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = node;
        checkForHosedThisReferencesMethodArguments[1] = ((Object) null);
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        try {
            checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.props != null): False}
 * @utbot.returnsFrom {@code return numStubs;}
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_NPropsEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode;
        int actual = ((Integer) addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments));
        
        assertEquals(0, actual);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.props != null): True}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return numStubs;}
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_NPropsNotEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        name.props = props;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode1;
        int actual = ((Integer) addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.props != null
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:820) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.props != null
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:820) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.props != null): True}
 * @utbot.iterates iterate the loop {@code for(Name p: n.props)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.needsToBeStubbed()
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:822) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode1;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.props != null): True}
 * @utbot.iterates iterate the loop {@code for(Name p: n.props)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propAlias = appendPropForAlias(alias, p.name);
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        props.add(null);
        name.props = props;
        name.globalSets = 0;
        name.localSets = 1;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:845)
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:823) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = functionNode1;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(NodeUtil.isStatementBlock(parent));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddStubsForUndeclaredProperties_ThrowIllegalArgumentException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(addAfter);
 *  */
    @Test(expected = NullPointerException.class)
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(addAfter);
 *  */
    @Test(expected = NullPointerException.class)
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, functionNodeType, functionNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = functionNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace$Ref, com.google.javascript.jscomp.GlobalNamespace)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.executesCondition {@code (aliasParent.getType() == Token.NAME): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInlineAliasIfPossible_AliasParentGetTypeNotEqualsTokenNAME() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ref;
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace$Ref, com.google.javascript.jscomp.GlobalNamespace)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node aliasParent = alias.node.getParent();
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:196) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ((Object) null);
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        try {
            inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node aliasParent = alias.node.getParent();
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:196) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ref;
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        try {
            inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: aliasParent.getType() == Token.NAME
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:197) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ref;
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        try {
            inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.executesCondition {@code (aliasParent.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var aliasVar = scope.getVar(aliasParent.getString());
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:200) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ref;
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        try {
            inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace$Ref, com.google.javascript.jscomp.GlobalNamespace)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref,com.google.javascript.jscomp.GlobalNamespace)}
 * @utbot.executesCondition {@code (aliasParent.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var aliasVar = scope.getVar(aliasParent.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineAliasIfPossible_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        node.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Class globalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method inlineAliasIfPossibleMethod = collapsePropertiesClazz.getDeclaredMethod("inlineAliasIfPossible", refType, globalNamespaceType);
        inlineAliasIfPossibleMethod.setAccessible(true);
        java.lang.Object[] inlineAliasIfPossibleMethodArguments = new java.lang.Object[2];
        inlineAliasIfPossibleMethodArguments[0] = ref;
        inlineAliasIfPossibleMethodArguments[1] = ((Object) null);
        try {
            inlineAliasIfPossibleMethod.invoke(collapseProperties, inlineAliasIfPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: UNSAFE_NAMESPACE_WARNING
 *  */
    @Test
    public void testWarnAboutNamespaceAliasing_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:270) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceAliasingMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceAliasing", nameType, refType);
        warnAboutNamespaceAliasingMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceAliasingMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceAliasingMethodArguments[0] = ((Object) null);
        warnAboutNamespaceAliasingMethodArguments[1] = ((Object) null);
        try {
            warnAboutNamespaceAliasingMethod.invoke(collapseProperties, warnAboutNamespaceAliasingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    @Test
    public void testWarnAboutNamespaceAliasing1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        String sourceName = "";
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:270) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceAliasingMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceAliasing", nameType, refType);
        warnAboutNamespaceAliasingMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceAliasingMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceAliasingMethodArguments[0] = name;
        warnAboutNamespaceAliasingMethodArguments[1] = ref;
        try {
            warnAboutNamespaceAliasingMethod.invoke(collapseProperties, warnAboutNamespaceAliasingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWarnAboutNamespaceAliasing2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:270) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceAliasingMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceAliasing", nameType, refType);
        warnAboutNamespaceAliasingMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceAliasingMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceAliasingMethodArguments[0] = name;
        warnAboutNamespaceAliasingMethodArguments[1] = ref;
        try {
            warnAboutNamespaceAliasingMethod.invoke(collapseProperties, warnAboutNamespaceAliasingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): False}
 * @utbot.executesCondition {@code (isQName): False}
 *  */
    @Test
    public void testFlattenNameRefAtDepth_BooleanIsObjKeyInitializedByNTypeEqualsTokenSTRINGOrNTypeEqualsTokenNUMBER() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = -255;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): False}
 * @utbot.executesCondition {@code (isQName): False}
 *  */
    @Test
    public void testFlattenNameRefAtDepth_BooleanIsObjKeyInitializedByNTypeEqualsTokenSTRINGOrNTypeEqualsTokenNUMBER_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = -255;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 *  */
    @Test
    public void testFlattenNameRefAtDepth_BooleanIsQNameInitializedByNTypeEqualsTokenNAMEOrNTypeEqualsTokenGETPROP() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < depth && n.hasChildren(); i++)} once
 *  */
    @Test
    public void testFlattenNameRefAtDepth_IsQName() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = 2;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < depth && n.hasChildren(); i++)} once
 *  */
    @Test
    public void testFlattenNameRefAtDepth_NodeGetFirstChild() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, functionNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = functionNode;
        flattenNameRefAtDepthMethodArguments[2] = 2;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nType = n.getType();
 *  */
    @Test
    public void testFlattenNameRefAtDepth_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:394) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[2] = -255;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flattenNameRef(alias, n.getFirstChild(), n, originalName);
 *  */
    @Test
    public void testFlattenNameRefAtDepth_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:427)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:403) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, functionNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = functionNode;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isObjKey || isQName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFlattenNameRefAtDepth_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = -255;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: flattenNameRef(alias, n.getFirstChild(), n, originalName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFlattenNameRefAtDepth_ThrowIllegalArgumentException_1() throws Throwable  {
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
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.executesCondition {@code (isQName): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: flattenNameRef(alias, n.getFirstChild(), n, originalName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFlattenNameRefAtDepth_ThrowIllegalArgumentException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, scriptOrFnNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = scriptOrFnNode;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NAMESPACE_REDEFINED_WARNING
 *  */
    @Test
    public void testWarnAboutNamespaceRedefinition_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:282) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceRedefinitionMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceRedefinition", nameType, refType);
        warnAboutNamespaceRedefinitionMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceRedefinitionMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceRedefinitionMethodArguments[0] = ((Object) null);
        warnAboutNamespaceRedefinitionMethodArguments[1] = ((Object) null);
        try {
            warnAboutNamespaceRedefinitionMethod.invoke(collapseProperties, warnAboutNamespaceRedefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    @Test
    public void testWarnAboutNamespaceRedefinition1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        FunctionNode node = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        String sourceName = "";
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:282) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceRedefinitionMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceRedefinition", nameType, refType);
        warnAboutNamespaceRedefinitionMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceRedefinitionMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceRedefinitionMethodArguments[0] = name;
        warnAboutNamespaceRedefinitionMethodArguments[1] = ref;
        try {
            warnAboutNamespaceRedefinitionMethod.invoke(collapseProperties, warnAboutNamespaceRedefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWarnAboutNamespaceRedefinition2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:282) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class refType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Method warnAboutNamespaceRedefinitionMethod = collapsePropertiesClazz.getDeclaredMethod("warnAboutNamespaceRedefinition", nameType, refType);
        warnAboutNamespaceRedefinitionMethod.setAccessible(true);
        java.lang.Object[] warnAboutNamespaceRedefinitionMethodArguments = new java.lang.Object[2];
        warnAboutNamespaceRedefinitionMethodArguments[0] = name;
        warnAboutNamespaceRedefinitionMethodArguments[1] = ref;
        try {
            warnAboutNamespaceRedefinitionMethod.invoke(collapseProperties, warnAboutNamespaceRedefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.refs != null): False}
 * @utbot.executesCondition {@code (n.props != null): False}
 *  */
    @Test
    public void testFlattenReferencesTo_NPropsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        
        List finalNameProps = name.props;
        List finalNameRefs = name.refs;
        
        assertNull(finalNameProps);
        
        assertNull(finalNameRefs);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.refs != null): True}
 * @utbot.executesCondition {@code (n.props != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#fullName()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testFlattenReferencesTo_NRefsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList refs = new ArrayList();
        name.refs = refs;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (n.refs != null): False}
 * @utbot.executesCondition {@code (n.props != null): True}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testFlattenReferencesTo_NPropsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        ArrayList props = new ArrayList();
        name.props = props;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        
        List finalNameRefs = name.refs;
        
        assertNull(finalNameRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.refs != null
 *  */
    @Test
    public void testFlattenReferencesTo_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:317) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = ((Object) null);
        flattenReferencesToMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields900361967795400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields900361967795400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass900361967800200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900361967795400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900361967800200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

