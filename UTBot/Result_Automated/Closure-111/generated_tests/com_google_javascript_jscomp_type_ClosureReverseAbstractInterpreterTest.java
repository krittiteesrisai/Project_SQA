package com.google.javascript.jscomp.type;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.common.collect.Interner;
import java.util.concurrent.ConcurrentSkipListMap;
import org.mockito.MockedStatic;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mockStatic;

public final class com_google_javascript_jscomp_type_ClosureReverseAbstractInterpreterTest {
    ///region Test suites for executable com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_5() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_6() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_7() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ReturnNextPreciserScopeKnowingConditionOutcome_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NodeIsGetProp() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: condition.isCall() && condition.getChildCount() == 2
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:219) */
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: callee.isGetProp() && param.isQualifiedName()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:222) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(38);
        
        closureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClosureReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome3() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:357)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:174)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome4() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(45);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:149)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:227)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome5() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:223)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:227)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome6() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:146)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:222)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome7() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:133)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:432)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:217)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:227)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome8() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(32);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:146)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:227)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome9() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(52);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:357)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:183)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome10() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(14);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:357)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:174)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome11() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(14);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:274)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:267)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:235)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:222)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome12() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:355)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:174)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:227)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome13() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:309)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:171)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:355)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:183)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110)
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:237) */
        Class closureReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = closureReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.restrictParameter
    
    ///region Errors report for restrictParameter
    
    public void testRestrictParameter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        /* Cannot mock static method java.util.concurrent.ThreadLocalRandom.nextSecondarySeed as it is not accessible
        from package com.google.javascript.jscomp.type */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields903593874693200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields903593874693200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass903593874701300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields903593874693200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass903593874701300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

