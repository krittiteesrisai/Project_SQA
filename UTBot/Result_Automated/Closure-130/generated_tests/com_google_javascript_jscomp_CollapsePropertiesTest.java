package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.GlobalNamespace.Name.Type;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.util.LinkedList;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.jscomp.CodingConventions.Proxy;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.NoSuchElementException;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_CollapsePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (!canCollapseChildNames): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_NotCanCollapseChildNames() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = false;
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getDeclaration()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.getDeclaration();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:763) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ref.node.getString();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:764) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ref.node.getString();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:764) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isObjectLit()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildBefore(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:774) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node gramps = varNode.getParent();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:767) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isObjLit = rvalue.isObjectLit();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:769) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n
 *  */
    @Test(expected = RuntimeException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowRuntimeException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: numChanges += addStubsForUndeclaredProperties(n, name, gramps, varNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: numChanges += addStubsForUndeclaredProperties(n, name, gramps, varNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: numChanges += addStubsForUndeclaredProperties(n, name, gramps, varNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: numChanges += addStubsForUndeclaredProperties(n, name, gramps, varNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtVarNode_ThrowIllegalStateException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", parent);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtVarNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtVarNode", nameType, booleanType);
        updateObjLitOrFunctionDeclarationAtVarNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments = new java.lang.Object[2];
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments[1] = true;
        try {
            updateObjLitOrFunctionDeclarationAtVarNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtVarNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.executesCondition {@code (!canCollapseChildNames): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_NotCanCollapseChildNames() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = ((Object) null);
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = false;
        updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.getDeclaration();
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:810) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = ((Object) null);
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = ref.node.getString();
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:811) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = ref.node.getString();
 *  */
    @Test
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(CollapseProperties.java:811) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace$Name, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = ref.node.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        name.globalSets = 1;
        name.deleteProps = -255;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateFunctionDeclarationAtFunctionNode_ThrowIllegalStateException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        parent.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type1;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class booleanType = boolean.class;
        Method updateFunctionDeclarationAtFunctionNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateFunctionDeclarationAtFunctionNode", nameType, booleanType);
        updateFunctionDeclarationAtFunctionNodeMethod.setAccessible(true);
        java.lang.Object[] updateFunctionDeclarationAtFunctionNodeMethodArguments = new java.lang.Object[2];
        updateFunctionDeclarationAtFunctionNodeMethodArguments[0] = name;
        updateFunctionDeclarationAtFunctionNodeMethodArguments[1] = true;
        try {
            updateFunctionDeclarationAtFunctionNodeMethod.invoke(collapseProperties, updateFunctionDeclarationAtFunctionNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
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
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
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
        
        List finalNameProps = name.props;
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = -255;
        
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
    public void testCollapseDeclarationOfNameAndDescendants_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
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
    public void testCollapseDeclarationOfNameAndDescendants_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, true);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.localSets = 0;
        name.deleteProps = -255;
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#isGetOrSetDefinition()} twice
    /// invoke:
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#isGetOrSetDefinition()} twice,
    ///     {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)} twice,
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Ref#getTwin()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_7() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", declaration);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.globalSets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "inExterns", true);
        
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
    public void testCollapseDeclarationOfNameAndDescendants_5() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type1;
        name.globalSets = 1;
        name.aliasingGets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "inExterns", true);
        
        GlobalNamespace.Name.Type initialNameParentType = name.parent.type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", nameType, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = ((Object) null);
        collapseDeclarationOfNameAndDescendantsMethod.invoke(collapseProperties, collapseDeclarationOfNameAndDescendantsMethodArguments);
        
        GlobalNamespace.Name.Type finalNameParentType = name.parent.type;
        List finalNameProps = name.props;
        
        assertFalse(initialNameParentType == finalNameParentType);
        
        assertNull(finalNameProps);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_6() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "inExterns", true);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#isGetOrSetDefinition()} twice
    /// execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 *  */
    @Test
    public void testCollapseDeclarationOfNameAndDescendants_8() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        name.localSets = 1;
        name.deleteProps = 1;
        
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
    public void testCollapseDeclarationOfNameAndDescendants_9() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        name.globalSets = 1;
        name.deleteProps = 1;
        
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
    public void testCollapseDeclarationOfNameAndDescendants_10() throws Exception  {
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
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:498) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#canCollapseUnannotatedChildNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canCollapseChildNames = n.canCollapseUnannotatedChildNames();
 *  */
    @Test(expected = NullPointerException.class)
    public void testCollapseDeclarationOfNameAndDescendants_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.localSets = 0;
        name.deleteProps = 0;
        
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
    
    ///region FUZZER: ERROR SUITE for method collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
     */
    @Test
    public void testCollapseDeclarationOfNameAndDescendantsThrowsNPEWithEmptyString() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.deleteProps = Integer.MIN_VALUE;
        List props = emptyList();
        name.props = props;
        name.callGets = Integer.MIN_VALUE;
        name.globalSets = Integer.MAX_VALUE;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.totalGets = Integer.MIN_VALUE;
        name.localSets = 1;
        name.aliasingGets = 1;
        name.docInfo = null;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, false);
        name1.totalGets = 0;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.globalSets = -1;
        name1.aliasingGets = 1;
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setAssociatedNode(null);
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.INHERITED;
        docInfo.setVisibility(visibility);
        name1.docInfo = docInfo;
        name1.callGets = 1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name1.type = type1;
        name1.localSets = Integer.MAX_VALUE;
        name1.deleteProps = -1;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("XZ", name1, false);
        name2.deleteProps = Integer.MAX_VALUE;
        name2.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(-1, ((Node) null), 1, 1);
        node.setType(Integer.MAX_VALUE);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.PROTECTED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.callGets = -1;
        name2.aliasingGets = Integer.MIN_VALUE;
        List props2 = emptyList();
        name2.props = props2;
        name2.globalSets = Integer.MAX_VALUE;
        name2.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type2 = GlobalNamespace.Name.Type.OBJECTLIT;
        name2.type = type2;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("\n\t\r", name2, false);
        name3.deleteProps = 0;
        name3.type = type2;
        name3.callGets = -1;
        name3.totalGets = -1;
        name3.aliasingGets = -1;
        JSDocInfo docInfo2 = new JSDocInfo();
        Node node1 = new Node(0, null, null, null, null, 0, 0);
        node1.setType(0);
        Node node2 = new Node(1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        node2.setType(1);
        Node node3 = new Node(-1, node1, node2, Integer.MAX_VALUE, -1);
        node3.setType(0);
        docInfo2.setAssociatedNode(node3);
        docInfo2.setVisibility(visibility1);
        name3.docInfo = docInfo2;
        ArrayList props3 = new ArrayList();
        GlobalNamespace.Name name4 = new GlobalNamespace.Name("", null, false);
        name4.aliasingGets = 0;
        name4.type = type1;
        name4.globalSets = -1;
        name4.deleteProps = Integer.MIN_VALUE;
        name4.localSets = Integer.MIN_VALUE;
        name4.callGets = -1;
        name4.totalGets = -1;
        ArrayList props4 = new ArrayList();
        name4.props = props4;
        name4.docInfo = null;
        GlobalNamespace.Name name5 = new GlobalNamespace.Name("#$\\\"'", name4, false);
        name5.type = type1;
        name5.globalSets = 1;
        name5.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo3 = new JSDocInfo();
        docInfo3.setAssociatedNode(null);
        docInfo3.setVisibility(visibility);
        name5.docInfo = docInfo3;
        name5.deleteProps = -1;
        name5.totalGets = Integer.MAX_VALUE;
        name5.callGets = -1;
        name5.aliasingGets = 1;
        ArrayList props5 = new ArrayList();
        props5.add(null);
        props5.add(null);
        props5.add(null);
        name5.props = props5;
        props3.add(name5);
        GlobalNamespace.Name name6 = new GlobalNamespace.Name("", null, false);
        name6.callGets = 0;
        ArrayList props6 = new ArrayList();
        name6.props = props6;
        name6.aliasingGets = Integer.MIN_VALUE;
        name6.totalGets = Integer.MIN_VALUE;
        name6.globalSets = 0;
        name6.docInfo = null;
        GlobalNamespace.Name.Type type3 = GlobalNamespace.Name.Type.OTHER;
        name6.type = type3;
        name6.localSets = 1;
        name6.deleteProps = 0;
        GlobalNamespace.Name name7 = new GlobalNamespace.Name("abc", name6, false);
        name7.deleteProps = 0;
        name7.type = type;
        name7.globalSets = -1;
        name7.localSets = Integer.MIN_VALUE;
        name7.callGets = 0;
        name7.totalGets = Integer.MIN_VALUE;
        List props7 = emptyList();
        name7.props = props7;
        name7.aliasingGets = -1;
        JSDocInfo docInfo4 = new JSDocInfo();
        docInfo4.setAssociatedNode(null);
        JSDocInfo.Visibility visibility2 = JSDocInfo.Visibility.PRIVATE;
        docInfo4.setVisibility(visibility2);
        name7.docInfo = docInfo4;
        props3.add(name7);
        GlobalNamespace.Name name8 = new GlobalNamespace.Name("-3", null, true);
        name8.deleteProps = -1;
        name8.callGets = -1;
        List props8 = emptyList();
        name8.props = props8;
        name8.aliasingGets = 0;
        name8.localSets = 1;
        name8.type = type;
        name8.docInfo = null;
        name8.globalSets = Integer.MAX_VALUE;
        name8.totalGets = 0;
        GlobalNamespace.Name name9 = new GlobalNamespace.Name("\n\t\r", name8, true);
        name9.globalSets = Integer.MIN_VALUE;
        JSDocInfo docInfo5 = new JSDocInfo();
        docInfo5.setAssociatedNode(null);
        docInfo5.setVisibility(visibility);
        name9.docInfo = docInfo5;
        name9.deleteProps = -1;
        name9.aliasingGets = Integer.MIN_VALUE;
        name9.totalGets = 0;
        name9.localSets = Integer.MAX_VALUE;
        name9.callGets = -1;
        name9.type = type;
        LinkedList props9 = new LinkedList();
        props9.add(null);
        name9.props = props9;
        props3.add(name9);
        GlobalNamespace.Name name10 = new GlobalNamespace.Name("10", null, false);
        name10.localSets = Integer.MAX_VALUE;
        name10.totalGets = 1;
        name10.globalSets = Integer.MIN_VALUE;
        name10.docInfo = null;
        List props10 = emptyList();
        name10.props = props10;
        name10.deleteProps = 1;
        name10.aliasingGets = 1;
        GlobalNamespace.Name.Type type4 = GlobalNamespace.Name.Type.SET;
        name10.type = type4;
        name10.callGets = 0;
        GlobalNamespace.Name name11 = new GlobalNamespace.Name("#$\\\"'", name10, true);
        name11.callGets = Integer.MAX_VALUE;
        JSDocInfo docInfo6 = new JSDocInfo();
        docInfo6.setVisibility(visibility);
        docInfo6.setAssociatedNode(null);
        name11.docInfo = docInfo6;
        name11.localSets = 1;
        name11.deleteProps = -1;
        name11.globalSets = Integer.MIN_VALUE;
        name11.type = type3;
        name11.totalGets = 1;
        List props11 = emptyList();
        name11.props = props11;
        name11.aliasingGets = 0;
        props3.add(name11);
        name3.props = props3;
        name3.globalSets = 0;
        name3.localSets = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:509)
            com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(CollapseProperties.java:508) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method collapseDeclarationOfNameAndDescendantsMethod = collapsePropertiesClazz.getDeclaredMethod("collapseDeclarationOfNameAndDescendants", name3Type, stringType);
        collapseDeclarationOfNameAndDescendantsMethod.setAccessible(true);
        java.lang.Object[] collapseDeclarationOfNameAndDescendantsMethodArguments = new java.lang.Object[2];
        collapseDeclarationOfNameAndDescendantsMethodArguments[0] = name3;
        collapseDeclarationOfNameAndDescendantsMethodArguments[1] = "";
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
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:313) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propAlias = appendPropForAlias(alias, p.getBaseName());
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
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:961)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:316) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propAlias = appendPropForAlias(alias, p.getBaseName());
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
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:316) */
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
    
    ///region FUZZER: ERROR SUITE for method flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
     */
    @Test
    public void testFlattenReferencesToCollapsibleDescendantNamesThrowsNPEWithEmptyString() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.deleteProps = Integer.MIN_VALUE;
        List props = emptyList();
        name.props = props;
        name.callGets = Integer.MIN_VALUE;
        name.globalSets = Integer.MAX_VALUE;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.totalGets = Integer.MIN_VALUE;
        name.localSets = 1;
        name.aliasingGets = 1;
        name.docInfo = null;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, false);
        name1.totalGets = 0;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.globalSets = -1;
        name1.aliasingGets = 1;
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setAssociatedNode(null);
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.INHERITED;
        docInfo.setVisibility(visibility);
        name1.docInfo = docInfo;
        name1.callGets = 1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name1.type = type1;
        name1.localSets = Integer.MAX_VALUE;
        name1.deleteProps = -1;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("XZ", name1, false);
        name2.deleteProps = Integer.MAX_VALUE;
        name2.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(-1, ((Node) null), 1, 1);
        node.setType(Integer.MAX_VALUE);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.PROTECTED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.callGets = -1;
        name2.aliasingGets = Integer.MIN_VALUE;
        List props2 = emptyList();
        name2.props = props2;
        name2.globalSets = Integer.MAX_VALUE;
        name2.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type2 = GlobalNamespace.Name.Type.OBJECTLIT;
        name2.type = type2;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("\n\t\r", name2, false);
        name3.deleteProps = 0;
        name3.type = type2;
        name3.callGets = -1;
        name3.totalGets = -1;
        name3.aliasingGets = -1;
        JSDocInfo docInfo2 = new JSDocInfo();
        Node node1 = new Node(0, null, null, null, null, 0, 0);
        node1.setType(0);
        Node node2 = new Node(1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        node2.setType(1);
        Node node3 = new Node(-1, node1, node2, Integer.MAX_VALUE, -1);
        node3.setType(0);
        docInfo2.setAssociatedNode(node3);
        docInfo2.setVisibility(visibility1);
        name3.docInfo = docInfo2;
        ArrayList props3 = new ArrayList();
        GlobalNamespace.Name name4 = new GlobalNamespace.Name("", null, false);
        name4.aliasingGets = 0;
        name4.type = type1;
        name4.globalSets = -1;
        name4.deleteProps = Integer.MIN_VALUE;
        name4.localSets = Integer.MIN_VALUE;
        name4.callGets = -1;
        name4.totalGets = -1;
        ArrayList props4 = new ArrayList();
        name4.props = props4;
        name4.docInfo = null;
        GlobalNamespace.Name name5 = new GlobalNamespace.Name("#$\\\"'", name4, false);
        name5.type = type1;
        name5.globalSets = 1;
        name5.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo3 = new JSDocInfo();
        docInfo3.setAssociatedNode(null);
        docInfo3.setVisibility(visibility);
        name5.docInfo = docInfo3;
        name5.deleteProps = -1;
        name5.totalGets = Integer.MAX_VALUE;
        name5.callGets = -1;
        name5.aliasingGets = 1;
        ArrayList props5 = new ArrayList();
        props5.add(null);
        props5.add(null);
        props5.add(null);
        name5.props = props5;
        props3.add(name5);
        GlobalNamespace.Name name6 = new GlobalNamespace.Name("", null, false);
        name6.callGets = 0;
        ArrayList props6 = new ArrayList();
        name6.props = props6;
        name6.aliasingGets = Integer.MIN_VALUE;
        name6.totalGets = Integer.MIN_VALUE;
        name6.globalSets = 0;
        name6.docInfo = null;
        GlobalNamespace.Name.Type type3 = GlobalNamespace.Name.Type.OTHER;
        name6.type = type3;
        name6.localSets = 1;
        name6.deleteProps = 0;
        GlobalNamespace.Name name7 = new GlobalNamespace.Name("abc", name6, false);
        name7.deleteProps = 0;
        name7.type = type;
        name7.globalSets = -1;
        name7.localSets = Integer.MIN_VALUE;
        name7.callGets = 0;
        name7.totalGets = Integer.MIN_VALUE;
        List props7 = emptyList();
        name7.props = props7;
        name7.aliasingGets = -1;
        JSDocInfo docInfo4 = new JSDocInfo();
        docInfo4.setAssociatedNode(null);
        JSDocInfo.Visibility visibility2 = JSDocInfo.Visibility.PRIVATE;
        docInfo4.setVisibility(visibility2);
        name7.docInfo = docInfo4;
        props3.add(name7);
        GlobalNamespace.Name name8 = new GlobalNamespace.Name("-3", null, true);
        name8.deleteProps = -1;
        name8.callGets = -1;
        List props8 = emptyList();
        name8.props = props8;
        name8.aliasingGets = 0;
        name8.localSets = 1;
        name8.type = type;
        name8.docInfo = null;
        name8.globalSets = Integer.MAX_VALUE;
        name8.totalGets = 0;
        GlobalNamespace.Name name9 = new GlobalNamespace.Name("\n\t\r", name8, true);
        name9.globalSets = Integer.MIN_VALUE;
        JSDocInfo docInfo5 = new JSDocInfo();
        docInfo5.setAssociatedNode(null);
        docInfo5.setVisibility(visibility);
        name9.docInfo = docInfo5;
        name9.deleteProps = -1;
        name9.aliasingGets = Integer.MIN_VALUE;
        name9.totalGets = 0;
        name9.localSets = Integer.MAX_VALUE;
        name9.callGets = -1;
        name9.type = type;
        LinkedList props9 = new LinkedList();
        props9.add(null);
        name9.props = props9;
        props3.add(name9);
        GlobalNamespace.Name name10 = new GlobalNamespace.Name("10", null, false);
        name10.localSets = Integer.MAX_VALUE;
        name10.totalGets = 1;
        name10.globalSets = Integer.MIN_VALUE;
        name10.docInfo = null;
        List props10 = emptyList();
        name10.props = props10;
        name10.deleteProps = 1;
        name10.aliasingGets = 1;
        GlobalNamespace.Name.Type type4 = GlobalNamespace.Name.Type.SET;
        name10.type = type4;
        name10.callGets = 0;
        GlobalNamespace.Name name11 = new GlobalNamespace.Name("#$\\\"'", name10, true);
        name11.callGets = Integer.MAX_VALUE;
        JSDocInfo docInfo6 = new JSDocInfo();
        docInfo6.setVisibility(visibility);
        docInfo6.setAssociatedNode(null);
        name11.docInfo = docInfo6;
        name11.localSets = 1;
        name11.deleteProps = -1;
        name11.globalSets = Integer.MIN_VALUE;
        name11.type = type3;
        name11.totalGets = 1;
        List props11 = emptyList();
        name11.props = props11;
        name11.aliasingGets = 0;
        props3.add(name11);
        name3.props = props3;
        name3.globalSets = 0;
        name3.localSets = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:316)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(CollapseProperties.java:324) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", name3Type, stringType);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name3;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = "";
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
    
    @Test(expected = StackOverflowError.class)
    public void testFlattenReferencesToCollapsibleDescendantNames2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "\u0000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(collapseProperties);
        props.add(collapseProperties);
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
    public void testFlattenReferencesToCollapsibleDescendantNames3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        String string = "\u0000";
        GlobalNamespace.Name name = new GlobalNamespace.Name(string, null, false);
        ArrayList props = new ArrayList();
        props.add(name);
        props.add(null);
        props.add(null);
        name.props = props;
        String string1 = "";
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class string1Type = Class.forName("java.lang.String");
        Method flattenReferencesToCollapsibleDescendantNamesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesToCollapsibleDescendantNames", nameType, string1Type);
        flattenReferencesToCollapsibleDescendantNamesMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToCollapsibleDescendantNamesMethodArguments = new java.lang.Object[2];
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[0] = name;
        flattenReferencesToCollapsibleDescendantNamesMethodArguments[1] = string1;
        try {
            flattenReferencesToCollapsibleDescendantNamesMethod.invoke(collapseProperties, flattenReferencesToCollapsibleDescendantNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#getDeclaration()} twice,
    ///     {@link com.google.javascript.rhino.Node#getNext()} twice,
    ///     {@link com.google.javascript.rhino.Node#getAncestor(int)} 4 times,
    ///     {@link com.google.javascript.rhino.Node#isObjectLit()} twice
    /// execute conditions:
    ///     {@code (isObjLit && n.canEliminate()): True}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#canEliminate()} twice,
    ///     {@link com.google.javascript.jscomp.GlobalNamespace.Name#isSimpleName()} twice
    /// execute conditions:
    ///     {@code (canCollapseChildNames): False},
    ///     {@code (insertedVarNode): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_2() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_3() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = -255;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): False}
 * @utbot.executesCondition {@code (canCollapseChildNames): False}
 * @utbot.executesCondition {@code (insertedVarNode): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getDeclaration()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isObjectLit()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#isSimpleName()}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_NotInsertedVarNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = n.getDeclaration();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:664) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:665) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rvalue = ref.node.getNext();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:665) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.executesCondition {@code (canCollapseChildNames): True}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varNode
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:712) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.executesCondition {@code (canCollapseChildNames): True}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varNode
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.deleteProps = -255;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:712) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.executesCondition {@code (canCollapseChildNames): True}
 * @utbot.executesCondition {@code (isObjLit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varNode
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:712) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varParent.replaceChild(gramps, varNode);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowNullPointerException_6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.FUNCTION;
        name.type = type;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:674) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (isObjLit && n.canEliminate()): False}
 * @utbot.executesCondition {@code (canCollapseChildNames): True}
 * @utbot.executesCondition {@code (isObjLit): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getDeclaration()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getAncestor(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isObjectLit()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#isSimpleName()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addStubsForUndeclaredProperties(n, alias, varParent, varNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.globalSets = 1;
        name.localSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:669) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
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
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        name.docInfo = docInfo;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
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
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        name.docInfo = docInfo;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:736)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:681) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        parent.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        name.aliasingGets = -2147483647;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
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
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        name.docInfo = docInfo;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:736)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:681) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode9() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.aliasingGets = 2;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode10() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        parent.aliasingGets = -2147483647;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        name.aliasingGets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode11() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:684) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode12() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        props.add(null);
        props.add(null);
        props.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaredType", true);
        name.globalSets = 1;
        name.totalGets = -2147483647;
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace$Name.canEliminate(GlobalNamespace.java:1024)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(CollapseProperties.java:672) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = string;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclarationAtAssignNode13() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        declaration.node = node;
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationAtAssignNodeMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclarationAtAssignNode", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationAtAssignNodeMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationAtAssignNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean discardKeys = !objlitName.shouldKeepKeys();
 *  */
    @Test
    public void testDeclareVarsForObjLitValues_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:834) */
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
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:836) */
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
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:836) */
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
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#shouldKeepKeys()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TokenStream.isJSIdentifier(key.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testDeclareVarsForObjLitValues1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(148);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(147);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        int actual = ((Integer) declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testDeclareVarsForObjLitValues2() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        name.type = null;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(148);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(147);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
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
        declareVarsForObjLitValuesMethodArguments[3] = stringNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        int actual = ((Integer) declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testDeclareVarsForObjLitValues3() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(147);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(148);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        int actual = ((Integer) declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testDeclareVarsForObjLitValues4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeclareVarsForObjLitValues5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        name.type = null;
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(39);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
        declareVarsForObjLitValuesMethodArguments[2] = node;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeclareVarsForObjLitValues6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
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
    
    @Test
    public void testDeclareVarsForObjLitValues7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
        declareVarsForObjLitValuesMethodArguments[3] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeclareVarsForObjLitValues8() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        name.type = null;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
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
    
    @Test
    public void testDeclareVarsForObjLitValues9() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(CollapseProperties.java:858) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, numberNodeType, numberNodeType, numberNodeType, numberNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[2] = numberNode;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
        declareVarsForObjLitValuesMethodArguments[4] = ((Object) null);
        declareVarsForObjLitValuesMethodArguments[5] = ((Object) null);
        try {
            declareVarsForObjLitValuesMethod.invoke(collapseProperties, declareVarsForObjLitValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues10() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(147);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
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
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues11() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = 1;
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(148);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
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
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues12() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(147);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
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
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues13() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(148);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, nodeType, nodeType, nodeType, nodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
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
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues14() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        name.type = null;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(148);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
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
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareVarsForObjLitValues15() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        name.type = null;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(147);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
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
    
    ///region OTHER: TIMEOUTS for method declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testDeclareVarsForObjLitValues16() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.aliasingGets = -2147483647;
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(147);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(147);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method declareVarsForObjLitValuesMethod = collapsePropertiesClazz.getDeclaredMethod("declareVarsForObjLitValues", nameType, stringType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        declareVarsForObjLitValuesMethod.setAccessible(true);
        java.lang.Object[] declareVarsForObjLitValuesMethodArguments = new java.lang.Object[6];
        declareVarsForObjLitValuesMethodArguments[0] = name;
        declareVarsForObjLitValuesMethodArguments[1] = string;
        declareVarsForObjLitValuesMethodArguments[2] = stringNode;
        declareVarsForObjLitValuesMethodArguments[3] = numberNode;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.canCollapseUnannotatedChildNames());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredProperties_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", declaration);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.canCollapseUnannotatedChildNames());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredProperties_ThrowIllegalStateException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.canCollapseUnannotatedChildNames());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredProperties_ThrowIllegalStateException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#canCollapseUnannotatedChildNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.canCollapseUnannotatedChildNames());
 *  */
    @Test
    public void testAddStubsForUndeclaredProperties_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(CollapseProperties.java:932) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredPropertiesByFuzzer() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.deleteProps = 1;
        List props = emptyList();
        name.props = props;
        name.callGets = Integer.MAX_VALUE;
        name.globalSets = 1;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.totalGets = 43;
        name.localSets = Integer.MIN_VALUE;
        name.aliasingGets = 43;
        name.docInfo = null;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, false);
        name1.totalGets = Integer.MIN_VALUE;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.globalSets = 0;
        name1.aliasingGets = 0;
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setAssociatedNode(null);
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.INHERITED;
        docInfo.setVisibility(visibility);
        name1.docInfo = docInfo;
        name1.callGets = Integer.MAX_VALUE;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name1.type = type1;
        name1.localSets = 0;
        name1.deleteProps = Integer.MAX_VALUE;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("XZ", name1, false);
        name2.deleteProps = Integer.MIN_VALUE;
        name2.localSets = 1;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(-1, ((Node) null), 1, 0);
        node.setType(1);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.PROTECTED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.callGets = Integer.MAX_VALUE;
        name2.aliasingGets = 0;
        List props2 = emptyList();
        name2.props = props2;
        name2.globalSets = 0;
        name2.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type2 = GlobalNamespace.Name.Type.OBJECTLIT;
        name2.type = type2;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("\n\t\r", name2, false);
        name3.type = type2;
        name3.callGets = -1;
        ArrayList props3 = new ArrayList();
        GlobalNamespace.Name name4 = new GlobalNamespace.Name("", null, false);
        name4.aliasingGets = 1;
        name4.type = type1;
        name4.globalSets = Integer.MAX_VALUE;
        name4.deleteProps = 0;
        name4.localSets = Integer.MAX_VALUE;
        name4.callGets = 1;
        name4.totalGets = 0;
        ArrayList props4 = new ArrayList();
        name4.props = props4;
        name4.docInfo = null;
        GlobalNamespace.Name name5 = new GlobalNamespace.Name("#$\\\"'", name4, false);
        name5.type = type1;
        name5.globalSets = 1;
        name5.localSets = 43;
        JSDocInfo docInfo2 = new JSDocInfo();
        docInfo2.setAssociatedNode(null);
        docInfo2.setVisibility(visibility);
        name5.docInfo = docInfo2;
        name5.deleteProps = 43;
        name5.totalGets = -1;
        name5.callGets = -1;
        name5.aliasingGets = 0;
        ArrayList props5 = new ArrayList();
        props5.add(null);
        props5.add(null);
        props5.add(null);
        name5.props = props5;
        props3.add(name5);
        GlobalNamespace.Name name6 = new GlobalNamespace.Name("", null, false);
        name6.callGets = 1;
        ArrayList props6 = new ArrayList();
        name6.props = props6;
        name6.aliasingGets = -1;
        name6.totalGets = 43;
        name6.globalSets = 0;
        name6.docInfo = null;
        GlobalNamespace.Name.Type type3 = GlobalNamespace.Name.Type.OTHER;
        name6.type = type3;
        name6.localSets = 0;
        name6.deleteProps = Integer.MAX_VALUE;
        GlobalNamespace.Name name7 = new GlobalNamespace.Name("abc", name6, false);
        name7.deleteProps = Integer.MAX_VALUE;
        name7.type = type;
        name7.globalSets = 43;
        name7.localSets = Integer.MAX_VALUE;
        name7.callGets = -1;
        name7.totalGets = 43;
        List props7 = emptyList();
        name7.props = props7;
        name7.aliasingGets = 43;
        JSDocInfo docInfo3 = new JSDocInfo();
        docInfo3.setAssociatedNode(null);
        JSDocInfo.Visibility visibility2 = JSDocInfo.Visibility.PRIVATE;
        docInfo3.setVisibility(visibility2);
        name7.docInfo = docInfo3;
        props3.add(name7);
        GlobalNamespace.Name name8 = new GlobalNamespace.Name("-3", null, true);
        name8.deleteProps = -1;
        name8.callGets = -1;
        List props8 = emptyList();
        name8.props = props8;
        name8.aliasingGets = 0;
        name8.localSets = Integer.MAX_VALUE;
        name8.type = type;
        name8.docInfo = null;
        name8.globalSets = Integer.MIN_VALUE;
        name8.totalGets = 1;
        GlobalNamespace.Name name9 = new GlobalNamespace.Name("\n\t\r", name8, true);
        name9.globalSets = 0;
        JSDocInfo docInfo4 = new JSDocInfo();
        docInfo4.setAssociatedNode(null);
        docInfo4.setVisibility(visibility);
        name9.docInfo = docInfo4;
        name9.deleteProps = 0;
        name9.aliasingGets = Integer.MAX_VALUE;
        name9.totalGets = Integer.MIN_VALUE;
        name9.localSets = Integer.MIN_VALUE;
        name9.callGets = -1;
        name9.type = type;
        LinkedList props9 = new LinkedList();
        props9.add(null);
        name9.props = props9;
        props3.add(name9);
        GlobalNamespace.Name name10 = new GlobalNamespace.Name("10", null, false);
        name10.localSets = 43;
        name10.totalGets = 0;
        name10.globalSets = -1;
        name10.docInfo = null;
        List props10 = emptyList();
        name10.props = props10;
        name10.deleteProps = Integer.MAX_VALUE;
        name10.aliasingGets = -1;
        GlobalNamespace.Name.Type type4 = GlobalNamespace.Name.Type.SET;
        name10.type = type4;
        name10.callGets = 1;
        GlobalNamespace.Name name11 = new GlobalNamespace.Name("#$\\\"'", name10, true);
        name11.callGets = 1;
        JSDocInfo docInfo5 = new JSDocInfo();
        docInfo5.setVisibility(visibility);
        docInfo5.setAssociatedNode(null);
        name11.docInfo = docInfo5;
        name11.localSets = Integer.MIN_VALUE;
        name11.deleteProps = Integer.MIN_VALUE;
        name11.globalSets = 1;
        name11.type = type3;
        name11.totalGets = Integer.MIN_VALUE;
        List props11 = emptyList();
        name11.props = props11;
        name11.aliasingGets = 0;
        props3.add(name11);
        name3.props = props3;
        name3.localSets = 43;
        name3.aliasingGets = 43;
        name3.globalSets = 0;
        Node node1 = new Node(43);
        node1.setType(Integer.MIN_VALUE);
        Node node2 = new Node(Integer.MAX_VALUE, node1, 43, -1);
        node2.setType(0);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", name3Type, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name3;
        addStubsForUndeclaredPropertiesMethodArguments[1] = "";
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[3] = node2;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAddStubsForUndeclaredProperties1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaredType", true);
        name.globalSets = 1;
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Node node = new Node(0);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, stringNodeType, stringNodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = string;
        addStubsForUndeclaredPropertiesMethodArguments[2] = stringNode;
        addStubsForUndeclaredPropertiesMethodArguments[3] = node;
        int actual = ((Integer) addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testAddStubsForUndeclaredProperties2() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList props = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "props", props);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        name.aliasingGets = -2147483644;
        Node node = new Node(125);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = node;
        addStubsForUndeclaredPropertiesMethodArguments[3] = numberNode;
        int actual = ((Integer) addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddStubsForUndeclaredProperties3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaredType", true);
        name.globalSets = 1;
        String string = "";
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = string;
        addStubsForUndeclaredPropertiesMethodArguments[2] = node;
        addStubsForUndeclaredPropertiesMethodArguments[3] = numberNode;
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredProperties4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        parent.type = type;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddStubsForUndeclaredProperties5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Name parent = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "parent", parent);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        name.globalSets = 1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[2] = ((Object) null);
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testAddStubsForUndeclaredProperties6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaredType", true);
        name.globalSets = 1;
        String string = "";
        Node node = new Node(125);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addStubsForUndeclaredPropertiesMethod = collapsePropertiesClazz.getDeclaredMethod("addStubsForUndeclaredProperties", nameType, stringType, nodeType, nodeType);
        addStubsForUndeclaredPropertiesMethod.setAccessible(true);
        java.lang.Object[] addStubsForUndeclaredPropertiesMethodArguments = new java.lang.Object[4];
        addStubsForUndeclaredPropertiesMethodArguments[0] = name;
        addStubsForUndeclaredPropertiesMethodArguments[1] = string;
        addStubsForUndeclaredPropertiesMethodArguments[2] = node;
        addStubsForUndeclaredPropertiesMethodArguments[3] = ((Object) null);
        try {
            addStubsForUndeclaredPropertiesMethod.invoke(collapseProperties, addStubsForUndeclaredPropertiesMethodArguments);
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
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < depth && n.hasChildren(); i++)} once
 *  */
    @Test
    public void testFlattenNameRefAtDepth_PreconditionsCheckState() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = new Node(38);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = 2;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 *  */
    @Test
    public void testFlattenNameRefAtDepth_BooleanIsQNameInitializedByNTypeNotEqualsTokenNAMEOrNTypeNotEqualsTokenGETPROP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = new Node(154);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = -255;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 *  */
    @Test
    public void testFlattenNameRefAtDepth_BooleanIsQNameInitializedByNTypeEqualsTokenNAMEOrNTypeEqualsTokenGETPROP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = new Node(33);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isObjKey || isQName);): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < depth && n.hasChildren(); i++)} once
 *  */
    @Test
    public void testFlattenNameRefAtDepth_NodeGetFirstChild() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = 2;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
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
        Node node = new Node(-255);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFlattenNameRefAtDepth_ThrowIllegalArgumentException() throws Throwable  {
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, stringNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = stringNode;
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFlattenNameRefAtDepth_ThrowUnsupportedOperationException() throws Throwable  {
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
        String string = " ";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nType = n.getType();
 *  */
    @Test
    public void testFlattenNameRefAtDepth_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:440) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flattenNameRef(alias, n.getFirstChild(), n, originalName);
 *  */
    @Test
    public void testFlattenNameRefAtDepth_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:473)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = ((Object) null);
        flattenNameRefAtDepthMethodArguments[1] = node;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flattenNameRef(alias, n.getFirstChild(), n, originalName);
 *  */
    @Test
    public void testFlattenNameRefAtDepth_ThrowNullPointerException_2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2375)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2392)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2411)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:472)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = 1;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testFlattenNameRefAtDepthByFuzzer() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        Node node = new Node(0, 0, Integer.MIN_VALUE);
        node.setType(-1);
        Node node1 = new Node(39, node, 39, 39);
        node1.setType(Integer.MIN_VALUE);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class node1Type = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, node1Type, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = "XZ";
        flattenNameRefAtDepthMethodArguments[1] = node1;
        flattenNameRefAtDepthMethodArguments[2] = -1;
        flattenNameRefAtDepthMethodArguments[3] = "XZ";
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testFlattenNameRefAtDepth1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", codingConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = -2147483646;
        flattenNameRefAtDepthMethodArguments[3] = string;
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRefAtDepth2() throws Throwable  {
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
        String string = "$\u0000\u0000";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:2257)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:474)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = -2147483646;
        flattenNameRefAtDepthMethodArguments[3] = string1;
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRefAtDepth3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:2257)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:474)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = -2147483646;
        flattenNameRefAtDepthMethodArguments[3] = string1;
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRefAtDepth4() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:2257)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:474)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, stringNodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = stringNode;
        flattenNameRefAtDepthMethodArguments[2] = -2147483646;
        flattenNameRefAtDepthMethodArguments[3] = string1;
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFlattenNameRefAtDepth5() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(NodeUtil.java:2257)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:474)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method flattenNameRefAtDepthMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRefAtDepth", stringType, nodeType, intType, stringType);
        flattenNameRefAtDepthMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefAtDepthMethodArguments = new java.lang.Object[4];
        flattenNameRefAtDepthMethodArguments[0] = string;
        flattenNameRefAtDepthMethodArguments[1] = node;
        flattenNameRefAtDepthMethodArguments[2] = -2147483646;
        flattenNameRefAtDepthMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefAtDepthMethod.invoke(collapseProperties, flattenNameRefAtDepthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getRefs()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getRefs()}
 * @utbot.invokes {@link com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable)}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.invokes {@link com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator)}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.invokes {@link com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator)}
 * @utbot.invokes {@link com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: Ref ref = Iterables.getOnlyElement(name.getRefs());
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testFlattenSimpleStubDeclaration_ThrowNoSuchElementException() throws Throwable  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        Class iteratorsClazz = Class.forName("com.google.common.collect.Iterators");
        UnmodifiableListIterator prevEMPTY_LIST_ITERATOR = ((UnmodifiableListIterator) getStaticFieldValue(iteratorsClazz, "EMPTY_LIST_ITERATOR"));
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            UnmodifiableListIterator emptyListIterator = ((UnmodifiableListIterator) createInstance("com.google.common.collect.Iterators$1"));
            setStaticField(iteratorsClazz, "EMPTY_LIST_ITERATOR", emptyListIterator);
            CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
            GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
            
            Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
            Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
            Class stringType = Class.forName("java.lang.String");
            Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
            flattenSimpleStubDeclarationMethod.setAccessible(true);
            java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
            flattenSimpleStubDeclarationMethodArguments[0] = name;
            flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
            try {
                flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
            setStaticField(com.google.common.collect.Iterators.class, "EMPTY_LIST_ITERATOR", prevEMPTY_LIST_ITERATOR);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: Ref ref = Iterables.getOnlyElement(name.getRefs());
 *  */
    @Test
    public void testFlattenSimpleStubDeclaration_ThrowNoSuchElementException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList refs = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
            com.google.common.collect.Iterators.getOnlyElement(Iterators.java:325)
            com.google.common.collect.Iterables.getOnlyElement(Iterables.java:271)
            com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(CollapseProperties.java:334) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = name;
        flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref ref = Iterables.getOnlyElement(name.getRefs());
 *  */
    @Test
    public void testFlattenSimpleStubDeclaration_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(CollapseProperties.java:334) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = ((Object) null);
        flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testFlattenSimpleStubDeclaration_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList refs = new ArrayList();
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(CollapseProperties.java:336) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = name;
        flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.getFullName()
 *  */
    @Test
    public void testFlattenSimpleStubDeclaration_ThrowNullPointerException_2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        JqueryCodingConvention codingConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList refs = new ArrayList();
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(CollapseProperties.java:336) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = name;
        flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.getFullName()
 *  */
    @Test
    public void testFlattenSimpleStubDeclaration_ThrowNullPointerException_3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList refs = new ArrayList();
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(CollapseProperties.java:336) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", nameType, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = name;
        flattenSimpleStubDeclarationMethodArguments[1] = ((Object) null);
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
     */
    @Test(expected = NoSuchElementException.class)
    public void testFlattenSimpleStubDeclarationThrowsNSEEWithEmptyString() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.deleteProps = Integer.MIN_VALUE;
        List props = emptyList();
        name.props = props;
        name.callGets = Integer.MIN_VALUE;
        name.globalSets = Integer.MAX_VALUE;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.totalGets = Integer.MIN_VALUE;
        name.localSets = 1;
        name.aliasingGets = 1;
        name.docInfo = null;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, false);
        name1.totalGets = 0;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.globalSets = -1;
        name1.aliasingGets = 1;
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setAssociatedNode(null);
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.INHERITED;
        docInfo.setVisibility(visibility);
        name1.docInfo = docInfo;
        name1.callGets = 1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name1.type = type1;
        name1.localSets = Integer.MAX_VALUE;
        name1.deleteProps = -1;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("XZ", name1, false);
        name2.deleteProps = Integer.MAX_VALUE;
        name2.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(-1, ((Node) null), 1, 1);
        node.setType(Integer.MAX_VALUE);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.PROTECTED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.callGets = -1;
        name2.aliasingGets = Integer.MIN_VALUE;
        List props2 = emptyList();
        name2.props = props2;
        name2.globalSets = Integer.MAX_VALUE;
        name2.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type2 = GlobalNamespace.Name.Type.OBJECTLIT;
        name2.type = type2;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("\n\t\r", name2, false);
        name3.deleteProps = 0;
        name3.type = type2;
        name3.callGets = -1;
        name3.totalGets = -1;
        name3.aliasingGets = -1;
        JSDocInfo docInfo2 = new JSDocInfo();
        Node node1 = new Node(0, null, null, null, null, 0, 0);
        node1.setType(0);
        Node node2 = new Node(1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        node2.setType(1);
        Node node3 = new Node(-1, node1, node2, Integer.MAX_VALUE, -1);
        node3.setType(0);
        docInfo2.setAssociatedNode(node3);
        docInfo2.setVisibility(visibility1);
        name3.docInfo = docInfo2;
        ArrayList props3 = new ArrayList();
        GlobalNamespace.Name name4 = new GlobalNamespace.Name("", null, false);
        name4.aliasingGets = 0;
        name4.type = type1;
        name4.globalSets = -1;
        name4.deleteProps = Integer.MIN_VALUE;
        name4.localSets = Integer.MIN_VALUE;
        name4.callGets = -1;
        name4.totalGets = -1;
        ArrayList props4 = new ArrayList();
        name4.props = props4;
        name4.docInfo = null;
        GlobalNamespace.Name name5 = new GlobalNamespace.Name("#$\\\"'", name4, false);
        name5.type = type1;
        name5.globalSets = 1;
        name5.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo3 = new JSDocInfo();
        docInfo3.setAssociatedNode(null);
        docInfo3.setVisibility(visibility);
        name5.docInfo = docInfo3;
        name5.deleteProps = -1;
        name5.totalGets = Integer.MAX_VALUE;
        name5.callGets = -1;
        name5.aliasingGets = 1;
        ArrayList props5 = new ArrayList();
        props5.add(null);
        props5.add(null);
        props5.add(null);
        name5.props = props5;
        props3.add(name5);
        GlobalNamespace.Name name6 = new GlobalNamespace.Name("", null, false);
        name6.callGets = 0;
        ArrayList props6 = new ArrayList();
        name6.props = props6;
        name6.aliasingGets = Integer.MIN_VALUE;
        name6.totalGets = Integer.MIN_VALUE;
        name6.globalSets = 0;
        name6.docInfo = null;
        GlobalNamespace.Name.Type type3 = GlobalNamespace.Name.Type.OTHER;
        name6.type = type3;
        name6.localSets = 1;
        name6.deleteProps = 0;
        GlobalNamespace.Name name7 = new GlobalNamespace.Name("abc", name6, false);
        name7.deleteProps = 0;
        name7.type = type;
        name7.globalSets = -1;
        name7.localSets = Integer.MIN_VALUE;
        name7.callGets = 0;
        name7.totalGets = Integer.MIN_VALUE;
        List props7 = emptyList();
        name7.props = props7;
        name7.aliasingGets = -1;
        JSDocInfo docInfo4 = new JSDocInfo();
        docInfo4.setAssociatedNode(null);
        JSDocInfo.Visibility visibility2 = JSDocInfo.Visibility.PRIVATE;
        docInfo4.setVisibility(visibility2);
        name7.docInfo = docInfo4;
        props3.add(name7);
        GlobalNamespace.Name name8 = new GlobalNamespace.Name("-3", null, true);
        name8.deleteProps = -1;
        name8.callGets = -1;
        List props8 = emptyList();
        name8.props = props8;
        name8.aliasingGets = 0;
        name8.localSets = 1;
        name8.type = type;
        name8.docInfo = null;
        name8.globalSets = Integer.MAX_VALUE;
        name8.totalGets = 0;
        GlobalNamespace.Name name9 = new GlobalNamespace.Name("\n\t\r", name8, true);
        name9.globalSets = Integer.MIN_VALUE;
        JSDocInfo docInfo5 = new JSDocInfo();
        docInfo5.setAssociatedNode(null);
        docInfo5.setVisibility(visibility);
        name9.docInfo = docInfo5;
        name9.deleteProps = -1;
        name9.aliasingGets = Integer.MIN_VALUE;
        name9.totalGets = 0;
        name9.localSets = Integer.MAX_VALUE;
        name9.callGets = -1;
        name9.type = type;
        LinkedList props9 = new LinkedList();
        props9.add(null);
        name9.props = props9;
        props3.add(name9);
        GlobalNamespace.Name name10 = new GlobalNamespace.Name("10", null, false);
        name10.localSets = Integer.MAX_VALUE;
        name10.totalGets = 1;
        name10.globalSets = Integer.MIN_VALUE;
        name10.docInfo = null;
        List props10 = emptyList();
        name10.props = props10;
        name10.deleteProps = 1;
        name10.aliasingGets = 1;
        GlobalNamespace.Name.Type type4 = GlobalNamespace.Name.Type.SET;
        name10.type = type4;
        name10.callGets = 0;
        GlobalNamespace.Name name11 = new GlobalNamespace.Name("#$\\\"'", name10, true);
        name11.callGets = Integer.MAX_VALUE;
        JSDocInfo docInfo6 = new JSDocInfo();
        docInfo6.setVisibility(visibility);
        docInfo6.setAssociatedNode(null);
        name11.docInfo = docInfo6;
        name11.localSets = 1;
        name11.deleteProps = -1;
        name11.globalSets = Integer.MIN_VALUE;
        name11.type = type3;
        name11.totalGets = 1;
        List props11 = emptyList();
        name11.props = props11;
        name11.aliasingGets = 0;
        props3.add(name11);
        name3.props = props3;
        name3.globalSets = 0;
        name3.localSets = Integer.MIN_VALUE;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenSimpleStubDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("flattenSimpleStubDeclaration", name3Type, stringType);
        flattenSimpleStubDeclarationMethod.setAccessible(true);
        java.lang.Object[] flattenSimpleStubDeclarationMethodArguments = new java.lang.Object[2];
        flattenSimpleStubDeclarationMethodArguments[0] = name3;
        flattenSimpleStubDeclarationMethodArguments[1] = "";
        try {
            flattenSimpleStubDeclarationMethod.invoke(collapseProperties, flattenSimpleStubDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
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
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:536) */
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
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:536) */
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:538) */
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
 * @utbot.executesCondition {@code (rvalue != null): True}
 * @utbot.executesCondition {@code (rvalue.isFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:547) */
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
 * @utbot.executesCondition {@code (rvalue != null): True}
 * @utbot.executesCondition {@code (rvalue.isFunction()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkForHosedThisReferences(rvalue, refName.docInfo, refName);
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:542) */
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
 * @utbot.executesCondition {@code (rvalue != null): True}
 * @utbot.executesCondition {@code (rvalue.isFunction()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_8() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        name.docInfo = docInfo;
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:547) */
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
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node greatGramps = gramps.getParent();
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:539) */
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
 * @utbot.executesCondition {@code (rvalue != null): True}
 * @utbot.executesCondition {@code (rvalue.isFunction()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        name.docInfo = docInfo;
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:547) */
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
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateSimpleDeclaration(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.executesCondition {@code (rvalue != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: refName.getFullName()
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_5() throws Throwable  {
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
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:548) */
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
 * @utbot.executesCondition {@code (rvalue != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newName(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node nameNode = NodeUtil.newName(compiler.getCodingConvention(), alias, gramps.getFirstChild(), refName.getFullName());
 *  */
    @Test
    public void testUpdateSimpleDeclaration_ThrowNullPointerException_9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2375)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2392)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2411)
            com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(CollapseProperties.java:546) */
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
 * @utbot.executesCondition {@code (rvalue != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newName(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node nameNode = NodeUtil.newName(compiler.getCodingConvention(), alias, gramps.getFirstChild(), refName.getFullName());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateSimpleDeclaration_ThrowIllegalArgumentException() throws Throwable  {
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
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
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
 *     @Override
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.isThis()) {
 *             compiler.report(JSError.make(name.getDeclaration().getSourceName(), n, UNSAFE_THIS, name.getFullName()));
 *         }
 *     }
 * });
 *  */
    @Test
    public void testCheckForHosedThisReferences_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:736) */
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
 *     @Override
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.isThis()) {
 *             compiler.report(JSError.make(name.getDeclaration().getSourceName(), n, UNSAFE_THIS, name.getFullName()));
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
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:736) */
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
 *     @Override
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         if (n.isThis()) {
 *             compiler.report(JSError.make(name.getDeclaration().getSourceName(), n, UNSAFE_THIS, name.getFullName()));
 *         }
 *     }
 * });
 *  */
    @Test
    public void testCheckForHosedThisReferences_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        Node node = new Node(0);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(CollapseProperties.java:736) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Method checkForHosedThisReferencesMethod = collapsePropertiesClazz.getDeclaredMethod("checkForHosedThisReferences", nodeType, jSDocInfoType, nameType);
        checkForHosedThisReferencesMethod.setAccessible(true);
        java.lang.Object[] checkForHosedThisReferencesMethodArguments = new java.lang.Object[3];
        checkForHosedThisReferencesMethodArguments[0] = node;
        checkForHosedThisReferencesMethodArguments[1] = jSDocInfo;
        checkForHosedThisReferencesMethodArguments[2] = ((Object) null);
        try {
            checkForHosedThisReferencesMethod.invoke(collapseProperties, checkForHosedThisReferencesMethodArguments);
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
 * @utbot.executesCondition {@code (aliasParent.isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInlineAliasIfPossible_NotAliasParentIsName() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        ref.node = node;
        
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
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:204) */
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
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:204) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: aliasParent.isName()
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:205) */
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
 * @utbot.executesCondition {@code (aliasParent.isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var aliasVar = scope.getVar(aliasParent.getString());
 *  */
    @Test
    public void testInlineAliasIfPossible_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(CollapseProperties.java:208) */
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
 * @utbot.executesCondition {@code (aliasParent.isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var aliasVar = scope.getVar(aliasParent.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineAliasIfPossible_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        ref.node = node;
        
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
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace$Name, com.google.javascript.jscomp.GlobalNamespace$Ref)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace.Name,com.google.javascript.jscomp.GlobalNamespace.Ref)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Ref#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError.make(ref.getSourceName(), ref.node, NAMESPACE_REDEFINED_WARNING, nameObj.getFullName())
 *  */
    @Test
    public void testWarnAboutNamespaceRedefinition_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:300) */
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
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:299) */
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
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SourceFile source = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:2092)
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:299) */
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
    public void testWarnAboutNamespaceRedefinition3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SimpleSourceFile source = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:299) */
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
    public void testWarnAboutNamespaceRedefinition4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SourceFile source = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(CollapseProperties.java:299) */
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
 * @utbot.executesCondition {@code (n.props != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getRefs()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testFlattenReferencesTo_NPropsEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        ArrayList refs = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String originalName = n.getFullName();
 *  */
    @Test
    public void testFlattenReferencesTo_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:357) */
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
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Ref r: n.getRefs())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rParent = r.node.getParent();
 *  */
    @Test
    public void testFlattenReferencesTo_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        ArrayList refs = new ArrayList();
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:364) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.iterates iterate the loop {@code for(Ref r: n.getRefs())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rParent = r.node.getParent();
 *  */
    @Test
    public void testFlattenReferencesTo_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        ArrayList refs = new ArrayList();
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        refs.add(ref);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:364) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
 * @utbot.executesCondition {@code (!NodeUtil.isObjectLitKey(r.node)): True}
 * @utbot.executesCondition {@code ((r.getTwin() == null || r.isSet())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isObjectLitKey(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Ref#getTwin()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)
 * @utbot.iterates iterate the loop {@code for(Ref r: n.getRefs())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flattenNameRef(alias, r.node, rParent, originalName);
 *  */
    @Test
    public void testFlattenReferencesTo_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        ArrayList refs = new ArrayList();
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ref.node = node;
        refs.add(ref);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        refs.add(null);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:473)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:373) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", nameType, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name;
        flattenReferencesToMethodArguments[1] = ((Object) null);
        try {
            flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String)}
     */
    @Test
    public void testFlattenReferencesToThrowsNPEWithEmptyString() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.deleteProps = 0;
        List props = emptyList();
        name.props = props;
        name.callGets = 0;
        name.globalSets = 1;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        name.totalGets = Integer.MAX_VALUE;
        name.localSets = 0;
        name.aliasingGets = 0;
        name.docInfo = null;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, false);
        name1.totalGets = 1;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.globalSets = -1;
        name1.aliasingGets = 1;
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setAssociatedNode(null);
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.INHERITED;
        docInfo.setVisibility(visibility);
        name1.docInfo = docInfo;
        name1.callGets = 1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.FUNCTION;
        name1.type = type1;
        name1.localSets = 1;
        name1.deleteProps = 1;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("XZ", name1, false);
        name2.deleteProps = 1;
        name2.localSets = 1;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(1, ((Node) null), 1, Integer.MIN_VALUE);
        node.setType(Integer.MIN_VALUE);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.PROTECTED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.callGets = 1;
        name2.aliasingGets = Integer.MIN_VALUE;
        List props2 = emptyList();
        name2.props = props2;
        name2.globalSets = Integer.MAX_VALUE;
        name2.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type2 = GlobalNamespace.Name.Type.OBJECTLIT;
        name2.type = type2;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("\n\t\r", name2, false);
        name3.deleteProps = Integer.MIN_VALUE;
        name3.type = type2;
        name3.callGets = Integer.MIN_VALUE;
        name3.totalGets = 0;
        name3.aliasingGets = 1;
        JSDocInfo docInfo2 = new JSDocInfo();
        Node node1 = new Node(1, null, null, null, null, Integer.MIN_VALUE, 1);
        node1.setType(-1);
        Node node2 = new Node(Integer.MIN_VALUE, 1, 0);
        node2.setType(Integer.MAX_VALUE);
        Node node3 = new Node(-1, node1, node2, 0, 1);
        node3.setType(Integer.MAX_VALUE);
        docInfo2.setAssociatedNode(node3);
        docInfo2.setVisibility(visibility1);
        name3.docInfo = docInfo2;
        ArrayList props3 = new ArrayList();
        GlobalNamespace.Name name4 = new GlobalNamespace.Name("", null, false);
        name4.aliasingGets = 0;
        name4.type = type1;
        name4.globalSets = 1;
        name4.deleteProps = 1;
        name4.localSets = Integer.MIN_VALUE;
        name4.callGets = 1;
        name4.totalGets = 1;
        ArrayList props4 = new ArrayList();
        name4.props = props4;
        name4.docInfo = null;
        GlobalNamespace.Name name5 = new GlobalNamespace.Name("#$\\\"'", name4, false);
        name5.type = type1;
        name5.globalSets = -1;
        name5.localSets = Integer.MIN_VALUE;
        JSDocInfo docInfo3 = new JSDocInfo();
        docInfo3.setAssociatedNode(null);
        docInfo3.setVisibility(visibility);
        name5.docInfo = docInfo3;
        name5.deleteProps = 0;
        name5.totalGets = Integer.MAX_VALUE;
        name5.callGets = 0;
        name5.aliasingGets = Integer.MAX_VALUE;
        ArrayList props5 = new ArrayList();
        props5.add(null);
        props5.add(null);
        props5.add(null);
        name5.props = props5;
        props3.add(name5);
        GlobalNamespace.Name name6 = new GlobalNamespace.Name("", null, false);
        name6.callGets = Integer.MAX_VALUE;
        ArrayList props6 = new ArrayList();
        name6.props = props6;
        name6.aliasingGets = Integer.MIN_VALUE;
        name6.totalGets = 1;
        name6.globalSets = 1;
        name6.docInfo = null;
        GlobalNamespace.Name.Type type3 = GlobalNamespace.Name.Type.OTHER;
        name6.type = type3;
        name6.localSets = Integer.MAX_VALUE;
        name6.deleteProps = 1;
        GlobalNamespace.Name name7 = new GlobalNamespace.Name("abc", name6, false);
        name7.deleteProps = Integer.MIN_VALUE;
        name7.type = type;
        name7.globalSets = Integer.MIN_VALUE;
        name7.localSets = Integer.MIN_VALUE;
        name7.callGets = 1;
        name7.totalGets = Integer.MAX_VALUE;
        List props7 = emptyList();
        name7.props = props7;
        name7.aliasingGets = 0;
        JSDocInfo docInfo4 = new JSDocInfo();
        docInfo4.setAssociatedNode(null);
        JSDocInfo.Visibility visibility2 = JSDocInfo.Visibility.PRIVATE;
        docInfo4.setVisibility(visibility2);
        name7.docInfo = docInfo4;
        props3.add(name7);
        GlobalNamespace.Name name8 = new GlobalNamespace.Name("-3", null, true);
        name8.deleteProps = -1;
        name8.callGets = Integer.MIN_VALUE;
        List props8 = emptyList();
        name8.props = props8;
        name8.aliasingGets = 0;
        name8.localSets = 0;
        name8.type = type;
        name8.docInfo = null;
        name8.globalSets = 0;
        name8.totalGets = Integer.MAX_VALUE;
        GlobalNamespace.Name name9 = new GlobalNamespace.Name("\n\t\r", name8, true);
        name9.globalSets = Integer.MIN_VALUE;
        JSDocInfo docInfo5 = new JSDocInfo();
        docInfo5.setAssociatedNode(null);
        docInfo5.setVisibility(visibility);
        name9.docInfo = docInfo5;
        name9.deleteProps = 1;
        name9.aliasingGets = 1;
        name9.totalGets = -1;
        name9.localSets = Integer.MAX_VALUE;
        name9.callGets = 0;
        name9.type = type;
        LinkedList props9 = new LinkedList();
        props9.add(null);
        name9.props = props9;
        props3.add(name9);
        GlobalNamespace.Name name10 = new GlobalNamespace.Name("10", null, false);
        name10.localSets = 0;
        name10.totalGets = 0;
        name10.globalSets = Integer.MAX_VALUE;
        name10.docInfo = null;
        List props10 = emptyList();
        name10.props = props10;
        name10.deleteProps = -1;
        name10.aliasingGets = Integer.MIN_VALUE;
        GlobalNamespace.Name.Type type4 = GlobalNamespace.Name.Type.SET;
        name10.type = type4;
        name10.callGets = 1;
        GlobalNamespace.Name name11 = new GlobalNamespace.Name("#$\\\"'", name10, true);
        name11.callGets = -1;
        JSDocInfo docInfo6 = new JSDocInfo();
        docInfo6.setVisibility(visibility);
        docInfo6.setAssociatedNode(null);
        name11.docInfo = docInfo6;
        name11.localSets = 1;
        name11.deleteProps = 1;
        name11.globalSets = 1;
        name11.type = type3;
        name11.totalGets = 1;
        List props11 = emptyList();
        name11.props = props11;
        name11.aliasingGets = Integer.MIN_VALUE;
        props3.add(name11);
        name3.props = props3;
        name3.globalSets = 1;
        name3.localSets = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(CollapseProperties.java:399)
            com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(CollapseProperties.java:421)
            com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(CollapseProperties.java:382) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Method flattenReferencesToMethod = collapsePropertiesClazz.getDeclaredMethod("flattenReferencesTo", name3Type, stringType);
        flattenReferencesToMethod.setAccessible(true);
        java.lang.Object[] flattenReferencesToMethodArguments = new java.lang.Object[2];
        flattenReferencesToMethodArguments[0] = name3;
        flattenReferencesToMethodArguments[1] = "";
        try {
            flattenReferencesToMethod.invoke(collapseProperties, flattenReferencesToMethodArguments);
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
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Ref#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError.make(ref.getSourceName(), ref.node, UNSAFE_NAMESPACE_WARNING, nameObj.getFullName())
 *  */
    @Test
    public void testWarnAboutNamespaceAliasing_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:288) */
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
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:287) */
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
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SourceFile source = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:2092)
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:287) */
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
    public void testWarnAboutNamespaceAliasing3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SimpleSourceFile source = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:287) */
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
    public void testWarnAboutNamespaceAliasing4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        GlobalNamespace.Ref ref = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        SourceFile source = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(ref, "com.google.javascript.jscomp.GlobalNamespace$Ref", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(CollapseProperties.java:287) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_Return_1() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        GlobalNamespace.Ref twin = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "twin", twin);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.activatesSwitch {@code switch(decl.node.getParent().getType()) case: default}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_SwitchDeclNodeGetParentGetTypeCasedefault() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)
 * @utbot.activatesSwitch {@code switch(decl.node.getParent().getType()) case: default}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_CollapsePropertiesUpdateFunctionDeclarationAtFunctionNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name,boolean)
 * @utbot.activatesSwitch {@code switch(decl.node.getParent().getType()) case: default}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_CollapsePropertiesUpdateObjLitOrFunctionDeclarationAtVarNode() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_Return() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Ref decl = n.getDeclaration();
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:623) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(decl.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:636) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(decl.node.getParent().getType())
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:636) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = false;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:774)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:642) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test
    public void testUpdateObjLitOrFunctionDeclaration_ThrowNullPointerException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(CollapseProperties.java:769)
            com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(CollapseProperties.java:642) */
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace$Name, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateFunctionDeclarationAtFunctionNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateFunctionDeclarationAtFunctionNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_2() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_3() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OTHER;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = RuntimeException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowRuntimeException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_4() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_5() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = 1;
        name.localSets = -255;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_6() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.OBJECTLIT;
        name.type = type;
        name.globalSets = -255;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name,java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUpdateObjLitOrFunctionDeclaration_ThrowIllegalStateException_7() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object node = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        setField(declaration, "com.google.javascript.jscomp.GlobalNamespace$Ref", "node", node);
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.GET;
        name.type = type;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class nameType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method updateObjLitOrFunctionDeclarationMethod = collapsePropertiesClazz.getDeclaredMethod("updateObjLitOrFunctionDeclaration", nameType, stringType, booleanType);
        updateObjLitOrFunctionDeclarationMethod.setAccessible(true);
        java.lang.Object[] updateObjLitOrFunctionDeclarationMethodArguments = new java.lang.Object[3];
        updateObjLitOrFunctionDeclarationMethodArguments[0] = name;
        updateObjLitOrFunctionDeclarationMethodArguments[1] = ((Object) null);
        updateObjLitOrFunctionDeclarationMethodArguments[2] = true;
        try {
            updateObjLitOrFunctionDeclarationMethod.invoke(collapseProperties, updateObjLitOrFunctionDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseProperties.inlineAliases
    
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
            com.google.javascript.jscomp.CollapseProperties.inlineAliases(CollapseProperties.java:163) */
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
            com.google.javascript.jscomp.CollapseProperties.inlineAliases(CollapseProperties.java:163) */
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
            com.google.javascript.jscomp.CollapseProperties.checkNamespaces(CollapseProperties.java:250) */
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
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:473) */
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
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newName(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node ref = NodeUtil.newName(compiler.getCodingConvention(), alias, n, originalName);
 *  */
    @Test
    public void testFlattenNameRef_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenNameRef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2375)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2392)
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2411)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:472) */
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFlattenNameRef_ThrowUnsupportedOperationException() throws Throwable  {
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
        String string = "\u0000";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = node;
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
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
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenNameRef(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFlattenNameRef_ThrowUnsupportedOperationException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        GoogleCodingConvention nextConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u0000";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = node;
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFlattenNameRef_ThrowUnsupportedOperationException_2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        CollapseProperties collapseProperties = new CollapseProperties(compiler, false, false);
        String string = "\u0000";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method flattenNameRefMethod = collapsePropertiesClazz.getDeclaredMethod("flattenNameRef", stringType, nodeType, nodeType, stringType);
        flattenNameRefMethod.setAccessible(true);
        java.lang.Object[] flattenNameRefMethodArguments = new java.lang.Object[4];
        flattenNameRefMethodArguments[0] = string;
        flattenNameRefMethodArguments[1] = node;
        flattenNameRefMethodArguments[2] = ((Object) null);
        flattenNameRefMethodArguments[3] = ((Object) null);
        try {
            flattenNameRefMethod.invoke(collapseProperties, flattenNameRefMethodArguments);
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
 * @utbot.executesCondition {@code (decl != null): False}
 *  */
    @Test
    public void testFlattenPrefixes_DeclEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        ArrayList refs = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
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
 * @utbot.executesCondition {@code (decl != null): True}
 * @utbot.executesCondition {@code (decl.node != null): False}
 *  */
    @Test
    public void testFlattenPrefixes_DeclNodeEqualsNull() throws Exception  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        String baseName = "";
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "baseName", baseName);
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        ArrayList refs = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, int)
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String originalName = n.getFullName();
 *  */
    @Test
    public void testFlattenPrefixes_ThrowNullPointerException() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(CollapseProperties.java:399) */
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
    
    /**
    @utbot.classUnderTest {@link CollapseProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
 * @utbot.executesCondition {@code (decl != null): True}
 * @utbot.executesCondition {@code (decl.node != null): True}
 * @utbot.executesCondition {@code (decl.node.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getFullName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getDeclaration()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes com.google.javascript.jscomp.CollapseProperties#flattenNameRefAtDepth(java.lang.String,com.google.javascript.rhino.Node,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: flattenNameRefAtDepth(alias, decl.node, depth, originalName);
 *  */
    @Test
    public void testFlattenPrefixes_ThrowNullPointerException_1() throws Throwable  {
        CollapseProperties collapseProperties = new CollapseProperties(null, false, false);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        GlobalNamespace.Ref declaration = ((GlobalNamespace.Ref) createInstance("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", node);
        declaration.node = node;
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "declaration", declaration);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseProperties.flattenPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseProperties.flattenNameRef(CollapseProperties.java:473)
            com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(CollapseProperties.java:449)
            com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(CollapseProperties.java:403) */
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
        try {
            flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace$Name, int)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CollapseProperties}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseProperties#flattenPrefixes(java.lang.String,com.google.javascript.jscomp.GlobalNamespace.Name,int)}
     */
    @Test
    public void testFlattenPrefixesWithNonEmptyStringAndCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CollapseProperties collapseProperties = new CollapseProperties(null, true, true);
        GlobalNamespace.Name name = new GlobalNamespace.Name("\n\t\r", null, true);
        name.docInfo = null;
        name.aliasingGets = 0;
        LinkedList props = new LinkedList();
        name.props = props;
        name.deleteProps = Integer.MIN_VALUE;
        name.globalSets = Integer.MAX_VALUE;
        name.localSets = 0;
        GlobalNamespace.Name.Type type = GlobalNamespace.Name.Type.SET;
        name.type = type;
        name.callGets = Integer.MAX_VALUE;
        name.totalGets = Integer.MIN_VALUE;
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("\n\t\r", name, true);
        name1.aliasingGets = -1;
        name1.totalGets = 0;
        JSDocInfo docInfo = new JSDocInfo();
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.PROTECTED;
        docInfo.setVisibility(visibility);
        docInfo.setAssociatedNode(null);
        name1.docInfo = docInfo;
        name1.deleteProps = 0;
        name1.callGets = 0;
        name1.globalSets = Integer.MIN_VALUE;
        ArrayList props1 = new ArrayList();
        props1.add(null);
        props1.add(null);
        name1.props = props1;
        name1.type = type;
        name1.localSets = -1;
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("-3", name1, true);
        name2.totalGets = 1;
        JSDocInfo docInfo1 = new JSDocInfo();
        Node node = new Node(1, null, null, null, 1, Integer.MIN_VALUE);
        node.setType(-1);
        docInfo1.setAssociatedNode(node);
        JSDocInfo.Visibility visibility1 = JSDocInfo.Visibility.INHERITED;
        docInfo1.setVisibility(visibility1);
        name2.docInfo = docInfo1;
        name2.deleteProps = Integer.MIN_VALUE;
        name2.callGets = Integer.MIN_VALUE;
        List props2 = emptyList();
        name2.props = props2;
        name2.localSets = Integer.MIN_VALUE;
        name2.globalSets = Integer.MAX_VALUE;
        name2.aliasingGets = -1;
        GlobalNamespace.Name.Type type1 = GlobalNamespace.Name.Type.OTHER;
        name2.type = type1;
        GlobalNamespace.Name name3 = new GlobalNamespace.Name("abc", name2, true);
        name3.callGets = 0;
        JSDocInfo docInfo2 = new JSDocInfo();
        docInfo2.setVisibility(visibility1);
        Node node1 = new Node(Integer.MAX_VALUE, ((Node) null), ((Node) null), ((Node) null), ((Node) null));
        node1.setType(0);
        Node node2 = new Node(1, node1, Integer.MIN_VALUE, 1);
        node2.setType(-1);
        docInfo2.setAssociatedNode(node2);
        name3.docInfo = docInfo2;
        name3.localSets = Integer.MIN_VALUE;
        name3.globalSets = Integer.MIN_VALUE;
        List props3 = emptyList();
        name3.props = props3;
        name3.deleteProps = 1;
        name3.totalGets = 1;
        name3.aliasingGets = Integer.MAX_VALUE;
        name3.type = type1;
        
        Class collapsePropertiesClazz = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class stringType = Class.forName("java.lang.String");
        Class name3Type = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Class intType = int.class;
        Method flattenPrefixesMethod = collapsePropertiesClazz.getDeclaredMethod("flattenPrefixes", stringType, name3Type, intType);
        flattenPrefixesMethod.setAccessible(true);
        java.lang.Object[] flattenPrefixesMethodArguments = new java.lang.Object[3];
        flattenPrefixesMethodArguments[0] = "XZ";
        flattenPrefixesMethodArguments[1] = name3;
        flattenPrefixesMethodArguments[2] = Integer.MAX_VALUE;
        flattenPrefixesMethod.invoke(collapseProperties, flattenPrefixesMethodArguments);
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
            com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(CollapseProperties.java:961) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields908141287981300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields908141287981300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass908141287986800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields908141287981300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass908141287986800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields908141288361700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields908141288361700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass908141288364000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields908141288361700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass908141288364000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields908141289019500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields908141289019500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass908141289021300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields908141289019500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass908141289021300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

