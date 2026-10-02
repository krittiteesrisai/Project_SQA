package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSType;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_ClosureCodingConventionTest {
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.isPrivate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrivate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPrivate(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPrivate_ReturnFalse() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        boolean actual = closureCodingConvention.isPrivate(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(null, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(null, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first1);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(node, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(functionNode, functionNode1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(functionNode, functionNode1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_5() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(functionNode, functionNode1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.require");}
 *  */
    @Test
    public void testExtractClassNameIfRequire_ReturnExtractClassNameIfGoog_6() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        String actual = closureCodingConvention.extractClassNameIfRequire(functionNode, functionNode1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return extractClassNameIfGoog(node, parent, "goog.require");
 *  */
    @Test
    public void testExtractClassNameIfRequire_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:192)
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire(ClosureCodingConvention.java:185) */
        closureCodingConvention.extractClassNameIfRequire(null, functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return extractClassNameIfGoog(node, parent, "goog.require");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfRequire_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfRequire(node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return extractClassNameIfGoog(node, parent, "goog.require");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfRequire_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfRequire(scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfRequire(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return extractClassNameIfGoog(node, parent, "goog.require");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExtractClassNameIfRequire_ThrowIllegalStateException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfRequire(node, functionNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testExtractClassNameIfRequire1() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first2, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first2)).setType(38);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(130);
        Object first3 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first3)).setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first3);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire] produces [java.lang.NullPointerException] */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfRequireMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfRequire", numberNodeType, numberNodeType);
        extractClassNameIfRequireMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfRequireMethodArguments = new java.lang.Object[2];
        extractClassNameIfRequireMethodArguments[0] = numberNode;
        extractClassNameIfRequireMethodArguments[1] = node;
        try {
            extractClassNameIfRequireMethod.invoke(closureCodingConvention, extractClassNameIfRequireMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractClassNameIfRequire2() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(42);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        Object first3 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first3)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first3);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire] produces [java.lang.NullPointerException] */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfRequireMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfRequire", numberNodeType, numberNodeType);
        extractClassNameIfRequireMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfRequireMethodArguments = new java.lang.Object[2];
        extractClassNameIfRequireMethodArguments[0] = numberNode;
        extractClassNameIfRequireMethodArguments[1] = scriptOrFnNode;
        try {
            extractClassNameIfRequireMethod.invoke(closureCodingConvention, extractClassNameIfRequireMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method extractClassNameIfGoog(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = ((Object) null);
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName_1() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = ((Object) null);
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName_3() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first1);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = node;
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName_2() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(37);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", scriptOrFnNodeType, scriptOrFnNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode1;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName_4() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first2);
        String string = " ";
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", functionNodeType, functionNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = functionNode;
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = string;
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_ReturnClassName_5() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first2);
        String string = "";
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", functionNodeType, functionNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = functionNode;
        extractClassNameIfGoogMethodArguments[1] = node;
        extractClassNameIfGoogMethodArguments[2] = string;
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testExtractClassNameIfGoog_NodeGetNext() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(node1, "com.google.javascript.rhino.Node", "first", first2);
        String string = ".null";
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = node;
        extractClassNameIfGoogMethodArguments[1] = node1;
        extractClassNameIfGoogMethodArguments[2] = string;
        String actual = ((String) extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extractClassNameIfGoog(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callee = node.getFirstChild();
 *  */
    @Test
    public void testExtractClassNameIfGoog_ThrowNullPointerException() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:192) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = ((Object) null);
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionName.equals(qualifiedName)
 *  */
    @Test
    public void testExtractClassNameIfGoog_ThrowNullPointerException_1() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:195) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", scriptOrFnNodeType, scriptOrFnNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode1;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionName.equals(qualifiedName)
 *  */
    @Test
    public void testExtractClassNameIfGoog_ThrowNullPointerException_2() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first2);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:195) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", functionNodeType, functionNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = functionNode;
        extractClassNameIfGoogMethodArguments[1] = scriptOrFnNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionName.equals(qualifiedName)
 *  */
    @Test
    public void testExtractClassNameIfGoog_ThrowNullPointerException_3() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:195) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", functionNodeType, functionNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = functionNode;
        extractClassNameIfGoogMethodArguments[1] = functionNode1;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extractClassNameIfGoog(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = callee.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfGoog_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", functionNodeType, functionNodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = functionNode;
        extractClassNameIfGoogMethodArguments[1] = functionNode1;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = callee.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfGoog_ThrowUnsupportedOperationException_1() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = node;
        extractClassNameIfGoogMethodArguments[1] = functionNode;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String qualifiedName = callee.getQualifiedName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExtractClassNameIfGoog_ThrowIllegalStateException() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(130);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(37);
        setField(node1, "com.google.javascript.rhino.Node", "first", first2);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method extractClassNameIfGoogMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfGoog", nodeType, nodeType, stringType);
        extractClassNameIfGoogMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfGoogMethodArguments = new java.lang.Object[3];
        extractClassNameIfGoogMethodArguments[0] = node;
        extractClassNameIfGoogMethodArguments[1] = node1;
        extractClassNameIfGoogMethodArguments[2] = ((Object) null);
        try {
            extractClassNameIfGoogMethod.invoke(null, extractClassNameIfGoogMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPropertyTestFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());}
 *  */
    @Test
    public void testIsPropertyTestFunction_ReturnPropertyTestFunctionsContains() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        LinkedHashSet propertyTestFunctions = new LinkedHashSet();
        setField(closureCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());}
 *  */
    @Test
    public void testIsPropertyTestFunction_ReturnPropertyTestFunctionsContains_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        LinkedHashSet propertyTestFunctions = new LinkedHashSet();
        String string = "";
        propertyTestFunctions.add(string);
        setField(closureCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(42);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = closureCodingConvention.isPropertyTestFunction(functionNode);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isPropertyTestFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(call.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsPropertyTestFunction_ThrowIllegalArgumentException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: call.getFirstChild().getQualifiedName()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsPropertyTestFunction_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyTestFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(call.getType() == Token.CALL);
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:285) */
        closureCodingConvention.isPropertyTestFunction(null);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:286) */
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:286) */
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.getFirstChild().getQualifiedName()
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:287) */
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException_4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:286) */
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isPropertyTestFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
 *  */
    @Test
    public void testIsPropertyTestFunction_ThrowNullPointerException_5() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:286) */
        closureCodingConvention.isPropertyTestFunction(scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.applySingletonGetter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: functionType.getSource()
 *  */
    @Test
    public void testApplySingletonGetter_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySingletonGetter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.applySingletonGetter(ClosureCodingConvention.java:268) */
        closureCodingConvention.applySingletonGetter(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.describeFunctionBind
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method describeFunctionBind(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDescribeFunctionBind_ReturnNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDescribeFunctionBind_ReturnNull_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(node);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDescribeFunctionBind_ReturnNull_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(node);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testDescribeFunctionBind_NodeGetNext() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDescribeFunctionBind_ReturnResult() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "bind";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(node);
        
        CodingConvention.Bind expected = new CodingConvention.Bind(first1, null, null);
        
        Node expectedTarget = expected.target;
        Node actualTarget = actual.target;
        String actualTargetFunctionName = (((FunctionNode) actualTarget)).getFunctionName();
        assertNull(actualTargetFunctionName);
        
        boolean actualTargetItsNeedsActivation = ((Boolean) getFieldValue(actualTarget, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualTargetItsNeedsActivation);
        
        int expectedTargetItsFunctionType = ((Integer) getFieldValue(expectedTarget, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualTargetItsFunctionType = ((Integer) getFieldValue(actualTarget, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(expectedTargetItsFunctionType, actualTargetItsFunctionType);
        
        boolean actualTargetItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualTarget, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualTargetItsIgnoreDynamicScope);
        
        int expectedTargetEncodedSourceStart = (((ScriptOrFnNode) expectedTarget)).getEncodedSourceStart();
        int actualTargetEncodedSourceStart = (((ScriptOrFnNode) actualTarget)).getEncodedSourceStart();
        assertEquals(expectedTargetEncodedSourceStart, actualTargetEncodedSourceStart);
        
        int expectedTargetEncodedSourceEnd = (((ScriptOrFnNode) expectedTarget)).getEncodedSourceEnd();
        int actualTargetEncodedSourceEnd = (((ScriptOrFnNode) actualTarget)).getEncodedSourceEnd();
        assertEquals(expectedTargetEncodedSourceEnd, actualTargetEncodedSourceEnd);
        
        String actualTargetSourceName = (((ScriptOrFnNode) actualTarget)).getSourceName();
        assertNull(actualTargetSourceName);
        
        int expectedTargetBaseLineno = (((ScriptOrFnNode) expectedTarget)).getBaseLineno();
        int actualTargetBaseLineno = (((ScriptOrFnNode) actualTarget)).getBaseLineno();
        assertEquals(expectedTargetBaseLineno, actualTargetBaseLineno);
        
        int expectedTargetEndLineno = (((ScriptOrFnNode) expectedTarget)).getEndLineno();
        int actualTargetEndLineno = (((ScriptOrFnNode) actualTarget)).getEndLineno();
        assertEquals(expectedTargetEndLineno, actualTargetEndLineno);
        
        ObjArray actualTargetFunctions = ((ObjArray) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualTargetFunctions);
        
        ObjArray actualTargetRegexps = ((ObjArray) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualTargetRegexps);
        
        ObjArray actualTargetItsVariables = ((ObjArray) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualTargetItsVariables);
        
        ObjArray actualTargetItsConst = ((ObjArray) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualTargetItsConst);
        
        ObjToIntMap actualTargetItsVariableNames = ((ObjToIntMap) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualTargetItsVariableNames);
        
        int expectedTargetVarStart = ((Integer) getFieldValue(expectedTarget, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualTargetVarStart = ((Integer) getFieldValue(actualTarget, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedTargetVarStart, actualTargetVarStart);
        
        Object actualTargetCompilerData = (((ScriptOrFnNode) actualTarget)).getCompilerData();
        assertNull(actualTargetCompilerData);
        
        int expectedTargetType = expectedTarget.getType();
        int actualTargetType = actualTarget.getType();
        assertEquals(expectedTargetType, actualTargetType);
        
        Node actualTargetNext = actualTarget.getNext();
        assertNull(actualTargetNext);
        
        Node actualTargetFirst = ((Node) getFieldValue(actualTarget, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualTargetFirst);
        
        Node actualTargetLast = ((Node) getFieldValue(actualTarget, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualTargetLast);
        
        Object actualTargetPropListHead = getFieldValue(actualTarget, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualTargetPropListHead);
        
        int expectedTargetSourcePosition = expectedTarget.getSourcePosition();
        int actualTargetSourcePosition = actualTarget.getSourcePosition();
        assertEquals(expectedTargetSourcePosition, actualTargetSourcePosition);
        
        JSType actualTargetJsType = ((JSType) getFieldValue(actualTarget, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualTargetJsType);
        
        Node actualTargetParent = actualTarget.getParent();
        assertNull(actualTargetParent);
        
        Node actualThisValue = actual.thisValue;
        assertNull(actualThisValue);
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method describeFunctionBind(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Bind result = super.describeFunctionBind(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDescribeFunctionBind_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.describeFunctionBind(node);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Bind result = super.describeFunctionBind(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDescribeFunctionBind_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.describeFunctionBind(node);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Bind result = super.describeFunctionBind(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDescribeFunctionBind_ThrowIllegalStateException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.describeFunctionBind(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Bind result = super.describeFunctionBind(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDescribeFunctionBind_ThrowIllegalStateException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.describeFunctionBind(node);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#describeFunctionBind(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Bind result = super.describeFunctionBind(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDescribeFunctionBind_ThrowUnsupportedOperationException_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.describeFunctionBind(functionNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method describeFunctionBind(com.google.javascript.rhino.Node)
    
    @Test
    public void testDescribeFunctionBind1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method describeFunctionBindMethod = closureCodingConventionClazz.getDeclaredMethod("describeFunctionBind", numberNodeType);
        describeFunctionBindMethod.setAccessible(true);
        java.lang.Object[] describeFunctionBindMethodArguments = new java.lang.Object[1];
        describeFunctionBindMethodArguments[0] = numberNode;
        CodingConvention.Bind actual = ((CodingConvention.Bind) describeFunctionBindMethod.invoke(closureCodingConvention, describeFunctionBindMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testDescribeFunctionBind2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.Bind actual = closureCodingConvention.describeFunctionBind(functionNode);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method describeFunctionBind(com.google.javascript.rhino.Node)
    
    @Test
    public void testDescribeFunctionBind3() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(42);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.describeFunctionBind] produces [java.lang.NullPointerException] */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method describeFunctionBindMethod = closureCodingConventionClazz.getDeclaredMethod("describeFunctionBind", stringNodeType);
        describeFunctionBindMethod.setAccessible(true);
        java.lang.Object[] describeFunctionBindMethodArguments = new java.lang.Object[1];
        describeFunctionBindMethodArguments[0] = stringNode;
        try {
            describeFunctionBindMethod.invoke(closureCodingConvention, describeFunctionBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getAssertionFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAssertionFunctions()
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getAssertionFunctions()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of(java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return ImmutableList.<AssertionFunctionSpec>of(new AssertionFunctionSpec("goog.asserts.assert"), new AssertionFunctionSpec("goog.asserts.assertNumber", JSTypeNative.NUMBER_TYPE), new AssertionFunctionSpec("goog.asserts.assertString", JSTypeNative.STRING_TYPE), new AssertionFunctionSpec("goog.asserts.assertFunction", JSTypeNative.FUNCTION_INSTANCE_TYPE), new AssertionFunctionSpec("goog.asserts.assertObject", JSTypeNative.OBJECT_TYPE), new AssertionFunctionSpec("goog.asserts.assertArray", JSTypeNative.ARRAY_TYPE), new AssertionFunctionSpec("goog.asserts.assertInstanceof", JSTypeNative.OBJECT_TYPE));}
 *  */
    @Test
    public void testGetAssertionFunctions_ImmutableListOf() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        List actual = ((List) closureCodingConvention.getAssertionFunctions());
        
        List expected = new ArrayList();
        String string = "goog.asserts.assert";
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec = new CodingConvention.AssertionFunctionSpec(string, null);
        expected.add(assertionFunctionSpec);
        String string1 = "goog.asserts.assertNumber";
        JSTypeNative jSTypeNative = JSTypeNative.NUMBER_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new CodingConvention.AssertionFunctionSpec(string1, jSTypeNative);
        expected.add(assertionFunctionSpec1);
        String string2 = "goog.asserts.assertString";
        JSTypeNative jSTypeNative1 = JSTypeNative.STRING_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new CodingConvention.AssertionFunctionSpec(string2, jSTypeNative1);
        expected.add(assertionFunctionSpec2);
        String string3 = "goog.asserts.assertFunction";
        JSTypeNative jSTypeNative2 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec3 = new CodingConvention.AssertionFunctionSpec(string3, jSTypeNative2);
        expected.add(assertionFunctionSpec3);
        String string4 = "goog.asserts.assertObject";
        JSTypeNative jSTypeNative3 = JSTypeNative.OBJECT_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec4 = new CodingConvention.AssertionFunctionSpec(string4, jSTypeNative3);
        expected.add(assertionFunctionSpec4);
        String string5 = "goog.asserts.assertArray";
        JSTypeNative jSTypeNative4 = JSTypeNative.ARRAY_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec5 = new CodingConvention.AssertionFunctionSpec(string5, jSTypeNative4);
        expected.add(assertionFunctionSpec5);
        String string6 = "goog.asserts.assertInstanceof";
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec6 = new CodingConvention.AssertionFunctionSpec(string6, jSTypeNative3);
        expected.add(assertionFunctionSpec6);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAssertionFunctions()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getAssertionFunctions()}
     */
    @Test
    public void testGetAssertionFunctions() {
        ClosureCodingConvention closureCodingConvention = new ClosureCodingConvention();
        
        List actual = ((List) closureCodingConvention.getAssertionFunctions());
        
        List expected = new ArrayList();
        String string = "goog.asserts.assert";
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec = new CodingConvention.AssertionFunctionSpec(string, null);
        expected.add(assertionFunctionSpec);
        String string1 = "goog.asserts.assertNumber";
        JSTypeNative jSTypeNative = JSTypeNative.NUMBER_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new CodingConvention.AssertionFunctionSpec(string1, jSTypeNative);
        expected.add(assertionFunctionSpec1);
        String string2 = "goog.asserts.assertString";
        JSTypeNative jSTypeNative1 = JSTypeNative.STRING_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new CodingConvention.AssertionFunctionSpec(string2, jSTypeNative1);
        expected.add(assertionFunctionSpec2);
        String string3 = "goog.asserts.assertFunction";
        JSTypeNative jSTypeNative2 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec3 = new CodingConvention.AssertionFunctionSpec(string3, jSTypeNative2);
        expected.add(assertionFunctionSpec3);
        String string4 = "goog.asserts.assertObject";
        JSTypeNative jSTypeNative3 = JSTypeNative.OBJECT_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec4 = new CodingConvention.AssertionFunctionSpec(string4, jSTypeNative3);
        expected.add(assertionFunctionSpec4);
        String string5 = "goog.asserts.assertArray";
        JSTypeNative jSTypeNative4 = JSTypeNative.ARRAY_TYPE;
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec5 = new CodingConvention.AssertionFunctionSpec(string5, jSTypeNative4);
        expected.add(assertionFunctionSpec5);
        String string6 = "goog.asserts.assertInstanceof";
        CodingConvention.AssertionFunctionSpec assertionFunctionSpec6 = new CodingConvention.AssertionFunctionSpec(string6, jSTypeNative3);
        expected.add(assertionFunctionSpec6);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetObjectLiteralCast_ReturnNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.ObjectLiteralCast actual = closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetObjectLiteralCast_ReturnNull_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.ObjectLiteralCast actual = closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetObjectLiteralCast_ReturnNull_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.ObjectLiteralCast actual = closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(callNode.getType() == Token.CALL);
 *  */
    @Test
    public void testGetObjectLiteralCast_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(ClosureCodingConvention.java:293) */
        closureCodingConvention.getObjectLiteralCast(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !"goog.reflect.object".equals(callName.getQualifiedName()) || callNode.getChildCount() != 3
 *  */
    @Test
    public void testGetObjectLiteralCast_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(ClosureCodingConvention.java:295) */
        closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(callNode.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectLiteralCast_ThrowIllegalArgumentException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !"goog.reflect.object".equals(callName.getQualifiedName()) || callNode.getChildCount() != 3
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetObjectLiteralCast_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetObjectLiteralCast1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(33);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.ObjectLiteralCast actual = closureCodingConvention.getObjectLiteralCast(null, functionNode);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testGetObjectLiteralCast2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getObjectLiteralCast(null, scriptOrFnNode);
    }
    
    @Test
    public void testGetObjectLiteralCast3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1946)
            com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(ClosureCodingConvention.java:295) */
        closureCodingConvention.getObjectLiteralCast(nodeTraversal, functionNode);
    }
    
    @Test
    public void testGetObjectLiteralCast4() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1946)
            com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(ClosureCodingConvention.java:295) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getObjectLiteralCastMethod = closureCodingConventionClazz.getDeclaredMethod("getObjectLiteralCast", nodeTraversalType, numberNodeType);
        getObjectLiteralCastMethod.setAccessible(true);
        java.lang.Object[] getObjectLiteralCastMethodArguments = new java.lang.Object[2];
        getObjectLiteralCastMethodArguments[0] = nodeTraversal;
        getObjectLiteralCastMethodArguments[1] = numberNode;
        try {
            getObjectLiteralCastMethod.invoke(closureCodingConvention, getObjectLiteralCastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.isOptionalParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOptionalParameter(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isOptionalParameter(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnFalse() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        boolean actual = closureCodingConvention.isOptionalParameter(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSingletonGetterClassName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSingletonGetterClassName_ReturnNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSingletonGetterClassName_ReturnNull_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSingletonGetterClassName_NodeGetChildCount() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSingletonGetterClassName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callArg = callNode.getFirstChild();
 *  */
    @Test
    public void testGetSingletonGetterClassName_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName(ClosureCodingConvention.java:251) */
        closureCodingConvention.getSingletonGetterClassName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String callName = callArg.getQualifiedName();
 *  */
    @Test
    public void testGetSingletonGetterClassName_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName(ClosureCodingConvention.java:252) */
        closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSingletonGetterClassName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String callName = callArg.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetSingletonGetterClassName_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String callName = callArg.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetSingletonGetterClassName_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String callName = callArg.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetSingletonGetterClassName_ThrowUnsupportedOperationException_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getSingletonGetterClassName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String callName = callArg.getQualifiedName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetSingletonGetterClassName_ThrowIllegalStateException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getSingletonGetterClassName(scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getExportPropertyFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExportPropertyFunction()
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getExportPropertyFunction()}
 * @utbot.returnsFrom {@code return "goog.exportProperty";}
 *  */
    @Test
    public void testGetExportPropertyFunction_ReturnGoogExportProperty() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        String actual = closureCodingConvention.getExportPropertyFunction();
        
        String expected = "goog.exportProperty";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method identifyTypeDeclarationCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ReturnNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        List actual = closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ReturnNull_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        List actual = closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ReturnNull_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        List actual = closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ReturnNull_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        List actual = closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ReturnNull_4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        List actual = closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method identifyTypeDeclarationCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callName = n.getFirstChild();
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall(ClosureCodingConvention.java:226) */
        closureCodingConvention.identifyTypeDeclarationCall(null);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: "goog.addDependency".equals(callName.getQualifiedName()) && n.getChildCount() >= 3
 *  */
    @Test
    public void testIdentifyTypeDeclarationCall_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall(ClosureCodingConvention.java:227) */
        closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method identifyTypeDeclarationCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: "goog.addDependency".equals(callName.getQualifiedName()) && n.getChildCount() >= 3
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIdentifyTypeDeclarationCall_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: "goog.addDependency".equals(callName.getQualifiedName()) && n.getChildCount() >= 3
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIdentifyTypeDeclarationCall_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#identifyTypeDeclarationCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: "goog.addDependency".equals(callName.getQualifiedName()) && n.getChildCount() >= 3
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIdentifyTypeDeclarationCall_ThrowUnsupportedOperationException_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.identifyTypeDeclarationCall(scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(null, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(null, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first1);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(node, functionNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(functionNode, functionNode1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog_4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(functionNode, functionNode1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return extractClassNameIfGoog(node, parent, "goog.provide");}
 *  */
    @Test
    public void testExtractClassNameIfProvide_ReturnExtractClassNameIfGoog_5() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first2);
        
        String actual = closureCodingConvention.extractClassNameIfProvide(functionNode, functionNode1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfGoog(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return extractClassNameIfGoog(node, parent, "goog.provide");
 *  */
    @Test
    public void testExtractClassNameIfProvide_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(ClosureCodingConvention.java:192)
            com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide(ClosureCodingConvention.java:175) */
        closureCodingConvention.extractClassNameIfProvide(null, functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return extractClassNameIfGoog(node, parent, "goog.provide");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfProvide_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfProvide(node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return extractClassNameIfGoog(node, parent, "goog.provide");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfProvide_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfProvide(scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#extractClassNameIfProvide(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return extractClassNameIfGoog(node, parent, "goog.provide");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExtractClassNameIfProvide_ThrowIllegalStateException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        closureCodingConvention.extractClassNameIfProvide(node, functionNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testExtractClassNameIfProvide1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(33);
        FunctionNode first3 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first3.setType(33);
        Object first4 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first4)).setType(33);
        Object first5 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first5)).setType(33);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first6)).setType(38);
        setField(first5, "com.google.javascript.rhino.Node", "first", first6);
        setField(first4, "com.google.javascript.rhino.Node", "first", first5);
        setField(first3, "com.google.javascript.rhino.Node", "first", first4);
        setField(first2, "com.google.javascript.rhino.Node", "first", first3);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        Node first7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first7.setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first7);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfProvideMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfProvide", numberNodeType, numberNodeType);
        extractClassNameIfProvideMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfProvideMethodArguments = new java.lang.Object[2];
        extractClassNameIfProvideMethodArguments[0] = numberNode;
        extractClassNameIfProvideMethodArguments[1] = functionNode;
        String actual = ((String) extractClassNameIfProvideMethod.invoke(closureCodingConvention, extractClassNameIfProvideMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testExtractClassNameIfProvide2() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(33);
        setField(first2, "com.google.javascript.rhino.Node", "first", first2);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        Object first3 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first3)).setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first3);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfProvideMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfProvide", stringNodeType, stringNodeType);
        extractClassNameIfProvideMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfProvideMethodArguments = new java.lang.Object[2];
        extractClassNameIfProvideMethodArguments[0] = stringNode;
        extractClassNameIfProvideMethodArguments[1] = functionNode;
        try {
            extractClassNameIfProvideMethod.invoke(closureCodingConvention, extractClassNameIfProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractClassNameIfProvide3() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first2, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first2)).setType(38);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        Object first3 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first3)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first3);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide] produces [java.lang.NullPointerException] */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfProvideMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfProvide", numberNodeType, numberNodeType);
        extractClassNameIfProvideMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfProvideMethodArguments = new java.lang.Object[2];
        extractClassNameIfProvideMethodArguments[0] = numberNode;
        extractClassNameIfProvideMethodArguments[1] = scriptOrFnNode;
        try {
            extractClassNameIfProvideMethod.invoke(closureCodingConvention, extractClassNameIfProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractClassNameIfProvide4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(33);
        Object first3 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first3)).setType(33);
        Object first4 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first4)).setType(33);
        ScriptOrFnNode first5 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first5.setType(42);
        setField(first4, "com.google.javascript.rhino.Node", "first", first5);
        setField(first3, "com.google.javascript.rhino.Node", "first", first4);
        setField(first2, "com.google.javascript.rhino.Node", "first", first3);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        Object first6 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first6)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first6);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide] produces [java.lang.NullPointerException] */
        closureCodingConvention.extractClassNameIfProvide(node, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testExtractClassNameIfProvide5() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        Object first2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first2)).setType(37);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first2);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractClassNameIfProvideMethod = closureCodingConventionClazz.getDeclaredMethod("extractClassNameIfProvide", numberNodeType, numberNodeType);
        extractClassNameIfProvideMethod.setAccessible(true);
        java.lang.Object[] extractClassNameIfProvideMethodArguments = new java.lang.Object[2];
        extractClassNameIfProvideMethodArguments[0] = numberNode;
        extractClassNameIfProvideMethodArguments[1] = functionNode;
        try {
            extractClassNameIfProvideMethod.invoke(closureCodingConvention, extractClassNameIfProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getAbstractMethodName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAbstractMethodName()
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getAbstractMethodName()}
 * @utbot.returnsFrom {@code return "goog.abstractMethod";}
 *  */
    @Test
    public void testGetAbstractMethodName_ReturnGoogAbstractMethod() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        String actual = closureCodingConvention.getAbstractMethodName();
        
        String expected = "goog.abstractMethod";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getExportSymbolFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExportSymbolFunction()
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getExportSymbolFunction()}
 * @utbot.returnsFrom {@code return "goog.exportSymbol";}
 *  */
    @Test
    public void testGetExportSymbolFunction_ReturnGoogExportSymbol() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        String actual = closureCodingConvention.getExportSymbolFunction();
        
        String expected = "goog.exportSymbol";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention$SubclassType)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.jscomp.CodingConvention.SubclassType)}
 * @utbot.executesCondition {@code (type == SubclassType.INHERITS): False}
 *  */
    @Test
    public void testApplySubclassRelationship_TypeNotEqualsSubclassTypeINHERITS() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        closureCodingConvention.applySubclassRelationship(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention$SubclassType)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.jscomp.CodingConvention.SubclassType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testApplySubclassRelationship_ThrowClassCastException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:118)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:56)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:63)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:279)
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:55) */
        closureCodingConvention.applySubclassRelationship(noObjectType, null, subclassType);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.jscomp.CodingConvention.SubclassType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testApplySubclassRelationship_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:118)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:56)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:63)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:279)
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:55) */
        closureCodingConvention.applySubclassRelationship(noObjectType, null, subclassType);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.jscomp.CodingConvention.SubclassType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentCtor.getPrototype()
 *  */
    @Test
    public void testApplySubclassRelationship_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:55) */
        closureCodingConvention.applySubclassRelationship(null, null, subclassType);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.jscomp.CodingConvention.SubclassType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSource()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#defineDeclaredProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childCtor.defineDeclaredProperty("superClass_", parentCtor.getPrototype(), parentCtor.getSource());
 *  */
    @Test
    public void testApplySubclassRelationship_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:54) */
        closureCodingConvention.applySubclassRelationship(functionType, null, subclassType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention$SubclassType)
    
    @Test
    public void testApplySubclassRelationship1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        FunctionType anonymousFunctionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(ObjectType.java:277)
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:54) */
        closureCodingConvention.applySubclassRelationship(anonymousFunctionType, anonymousFunctionType1, subclassType);
    }
    
    @Test
    public void testApplySubclassRelationship2() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMap typesIndexedByProperty = new LinkedHashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerPropertyOnType(JSTypeRegistry.java:627)
            com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(ObjectType.java:277)
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:54) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class subclassTypeType = Class.forName("com.google.javascript.jscomp.CodingConvention$SubclassType");
        Method applySubclassRelationshipMethod = closureCodingConventionClazz.getDeclaredMethod("applySubclassRelationship", errorFunctionTypeType, errorFunctionTypeType, subclassTypeType);
        applySubclassRelationshipMethod.setAccessible(true);
        java.lang.Object[] applySubclassRelationshipMethodArguments = new java.lang.Object[3];
        applySubclassRelationshipMethodArguments[0] = errorFunctionType;
        applySubclassRelationshipMethodArguments[1] = noResolvedType;
        applySubclassRelationshipMethodArguments[2] = subclassType;
        try {
            applySubclassRelationshipMethod.invoke(closureCodingConvention, applySubclassRelationshipMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testApplySubclassRelationship3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
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
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:54) */
        closureCodingConvention.applySubclassRelationship(noType, null, subclassType);
    }
    
    @Test
    public void testApplySubclassRelationship4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
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
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        nativeTypes[19] = ((JSType) unresolvedTypeExpression);
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
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        CodingConvention.SubclassType subclassType = CodingConvention.SubclassType.INHERITS;
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.clearCachedValues(FunctionType.java:949)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:332)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:279)
            com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(ClosureCodingConvention.java:55) */
        closureCodingConvention.applySubclassRelationship(noType, null, subclassType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassesDefinedByCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetClassesDefinedByCall_ReturnNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.SubclassRelationship actual = closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetClassesDefinedByCall_ReturnNull_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.SubclassRelationship actual = closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetClassesDefinedByCall_ReturnNull_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "$\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.SubclassRelationship actual = closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetClassesDefinedByCall_ReturnNull_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.SubclassRelationship actual = closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetClassesDefinedByCall_ReturnNull_4() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        CodingConvention.SubclassRelationship actual = closureCodingConvention.getClassesDefinedByCall(node);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getClassesDefinedByCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callName = callNode.getFirstChild();
 *  */
    @Test
    public void testGetClassesDefinedByCall_ThrowNullPointerException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:69) */
        closureCodingConvention.getClassesDefinedByCall(null);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test
    public void testGetClassesDefinedByCall_ThrowNullPointerException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:132)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:70) */
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test
    public void testGetClassesDefinedByCall_ThrowNullPointerException_2() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:133)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:70) */
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test
    public void testGetClassesDefinedByCall_ThrowNullPointerException_3() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:136)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:70) */
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getClassesDefinedByCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetClassesDefinedByCall_ThrowUnsupportedOperationException_1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetClassesDefinedByCall_ThrowUnsupportedOperationException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: SubclassType type = typeofClassDefiningName(callName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetClassesDefinedByCall_ThrowIllegalStateException() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        closureCodingConvention.getClassesDefinedByCall(scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method typeofClassDefiningName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (callName.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (methodName != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTypeofClassDefiningName_CallNameGetTypeNotEqualsTokenNAME() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", scriptOrFnNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = scriptOrFnNode;
        CodingConvention.SubclassType actual = ((CodingConvention.SubclassType) typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (callName.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (dollarIndex != -1): False}
 * @utbot.executesCondition {@code (methodName != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTypeofClassDefiningName_DollarIndexEqualsNegative1() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", stringNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = stringNode;
        CodingConvention.SubclassType actual = ((CodingConvention.SubclassType) typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (callName.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (dollarIndex != -1): True}
 * @utbot.executesCondition {@code (methodName != null): True}
 * @utbot.executesCondition {@code (methodName.equals("inherits")): False}
 * @utbot.executesCondition {@code (methodName.equals("mixin")): False}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTypeofClassDefiningName_NotMethodNameEquals() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "$";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", stringNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = stringNode;
        CodingConvention.SubclassType actual = ((CodingConvention.SubclassType) typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (methodName != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTypeofClassDefiningName_MethodNameEqualsNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", scriptOrFnNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = scriptOrFnNode;
        CodingConvention.SubclassType actual = ((CodingConvention.SubclassType) typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (methodName != null): True}
 * @utbot.executesCondition {@code (methodName.equals("inherits")): True}
 * @utbot.returnsFrom {@code return SubclassType.INHERITS;}
 *  */
    @Test
    public void testTypeofClassDefiningName_MethodNameEquals() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", scriptOrFnNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = scriptOrFnNode;
        CodingConvention.SubclassType actual = ((CodingConvention.SubclassType) typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method typeofClassDefiningName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: callName.getType() == Token.GETPROP
 *  */
    @Test
    public void testTypeofClassDefiningName_ThrowNullPointerException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:132) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", nodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = ((Object) null);
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: methodName = callName.getLastChild().getString();
 *  */
    @Test
    public void testTypeofClassDefiningName_ThrowNullPointerException_1() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:133) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", scriptOrFnNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = scriptOrFnNode;
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (callName.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int dollarIndex = name.lastIndexOf('$');
 *  */
    @Test
    public void testTypeofClassDefiningName_ThrowNullPointerException_2() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:136) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", stringNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = stringNode;
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method typeofClassDefiningName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (callName.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = callName.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTypeofClassDefiningName_ThrowUnsupportedOperationException_1() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", scriptOrFnNodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = scriptOrFnNode;
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: methodName = callName.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTypeofClassDefiningName_ThrowIllegalStateException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", nodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = node;
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#typeofClassDefiningName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callName.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: methodName = callName.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTypeofClassDefiningName_ThrowUnsupportedOperationException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method typeofClassDefiningNameMethod = closureCodingConventionClazz.getDeclaredMethod("typeofClassDefiningName", nodeType);
        typeofClassDefiningNameMethod.setAccessible(true);
        java.lang.Object[] typeofClassDefiningNameMethodArguments = new java.lang.Object[1];
        typeofClassDefiningNameMethodArguments[0] = node;
        try {
            typeofClassDefiningNameMethod.invoke(closureCodingConvention, typeofClassDefiningNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.isSuperClassReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSuperClassReference(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isSuperClassReference(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return "superClass_".equals(propertyName);}
 *  */
    @Test
    public void testIsSuperClassReference_StringEquals() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        boolean actual = closureCodingConvention.isSuperClassReference(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endsWithPrototype(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return qualifiedName.getType() == Token.GETPROP && qualifiedName.getLastChild().getString().equals("prototype");}
 *  */
    @Test
    public void testEndsWithPrototype_QualifiedNameGetTypeNotEqualsTokenGETPROPAndQualifiedNameGetLastChildGetStringEquals() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", scriptOrFnNodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (qualifiedName.getLastChild().getString().equals("prototype")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return qualifiedName.getType() == Token.GETPROP && qualifiedName.getLastChild().getString().equals("prototype");}
 *  */
    @Test
    public void testEndsWithPrototype_QualifiedNameGetLastChildGetStringEquals() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", scriptOrFnNodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endsWithPrototype(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return qualifiedName.getType() == Token.GETPROP && qualifiedName.getLastChild().getString().equals("prototype");
 *  */
    @Test
    public void testEndsWithPrototype_ThrowNullPointerException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype(ClosureCodingConvention.java:164) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", nodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = ((Object) null);
        try {
            endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: qualifiedName.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testEndsWithPrototype_ThrowNullPointerException_1() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype(ClosureCodingConvention.java:165) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", scriptOrFnNodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = scriptOrFnNode;
        try {
            endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: qualifiedName.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testEndsWithPrototype_ThrowNullPointerException_2() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype(ClosureCodingConvention.java:165) */
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", scriptOrFnNodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = scriptOrFnNode;
        try {
            endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method endsWithPrototype(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: qualifiedName.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEndsWithPrototype_ThrowIllegalStateException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", nodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = node;
        try {
            endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#endsWithPrototype(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: qualifiedName.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEndsWithPrototype_ThrowUnsupportedOperationException() throws Throwable  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method endsWithPrototypeMethod = closureCodingConventionClazz.getDeclaredMethod("endsWithPrototype", nodeType);
        endsWithPrototypeMethod.setAccessible(true);
        java.lang.Object[] endsWithPrototypeMethodArguments = new java.lang.Object[1];
        endsWithPrototypeMethodArguments[0] = node;
        try {
            endsWithPrototypeMethod.invoke(closureCodingConvention, endsWithPrototypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.getGlobalObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGlobalObject()
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#getGlobalObject()}
 * @utbot.returnsFrom {@code return "goog.global";}
 *  */
    @Test
    public void testGetGlobalObject_ReturnGoogGlobal() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        String actual = closureCodingConvention.getGlobalObject();
        
        String expected = "goog.global";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.isVarArgsParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVarArgsParameter(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#isVarArgsParameter(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVarArgsParameter_ReturnFalse() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        boolean actual = closureCodingConvention.isVarArgsParameter(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ClosureCodingConvention.safeNext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeNext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#safeNext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSafeNext_NEqualsNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method safeNextMethod = closureCodingConventionClazz.getDeclaredMethod("safeNext", nodeType);
        safeNextMethod.setAccessible(true);
        java.lang.Object[] safeNextMethodArguments = new java.lang.Object[1];
        safeNextMethodArguments[0] = ((Object) null);
        Node actual = ((Node) safeNextMethod.invoke(closureCodingConvention, safeNextMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureCodingConvention}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ClosureCodingConvention#safeNext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return n.getNext();}
 *  */
    @Test
    public void testSafeNext_NNotEqualsNull() throws Exception  {
        ClosureCodingConvention closureCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class closureCodingConventionClazz = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method safeNextMethod = closureCodingConventionClazz.getDeclaredMethod("safeNext", scriptOrFnNodeType);
        safeNextMethod.setAccessible(true);
        java.lang.Object[] safeNextMethodArguments = new java.lang.Object[1];
        safeNextMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) safeNextMethod.invoke(closureCodingConvention, safeNextMethodArguments));
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields893251355803100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields893251355803100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass893251355810600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields893251355803100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass893251355810600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields893251356232000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields893251356232000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass893251356233800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields893251356232000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass893251356233800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

