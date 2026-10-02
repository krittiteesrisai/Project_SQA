package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import java.util.HashMap;
import com.google.javascript.jscomp.Scope.Arguments;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_MustBeReachingVariableDefTest {
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isParameter(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isParameter(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v.getParentNode().isParamList();}
 *  */
    @Test
    public void testIsParameter_ReturnVGetParentNodeIsParamList() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", numberNode);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, numberNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = numberNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Method isParameterMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("isParameter", varClazz);
        isParameterMethod.setAccessible(true);
        java.lang.Object[] isParameterMethodArguments = new java.lang.Object[1];
        isParameterMethodArguments[0] = var;
        boolean actual = ((Boolean) isParameterMethod.invoke(mustBeReachingVariableDef, isParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isParameter(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v.getParentNode().isParamList();}
 *  */
    @Test
    public void testIsParameter_ReturnVGetParentNodeIsParamList_1() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", numberNode);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, numberNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = numberNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Method isParameterMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("isParameter", varClazz);
        isParameterMethod.setAccessible(true);
        java.lang.Object[] isParameterMethodArguments = new java.lang.Object[1];
        isParameterMethodArguments[0] = var;
        boolean actual = ((Boolean) isParameterMethod.invoke(mustBeReachingVariableDef, isParameterMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isParameter(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isParameter(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v.getParentNode().isParamList();
 *  */
    @Test
    public void testIsParameter_ThrowNullPointerException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isParameterMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("isParameter", varType);
        isParameterMethod.setAccessible(true);
        java.lang.Object[] isParameterMethodArguments = new java.lang.Object[1];
        isParameterMethodArguments[0] = ((Object) null);
        try {
            isParameterMethod.invoke(mustBeReachingVariableDef, isParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isParameter(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v.getParentNode().isParamList();
 *  */
    @Test
    public void testIsParameter_ThrowNullPointerException_2() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
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
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Method isParameterMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("isParameter", varClazz);
        isParameterMethod.setAccessible(true);
        java.lang.Object[] isParameterMethodArguments = new java.lang.Object[1];
        isParameterMethodArguments[0] = var;
        try {
            isParameterMethod.invoke(mustBeReachingVariableDef, isParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isParameter(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v.getParentNode().isParamList();
 *  */
    @Test
    public void testIsParameter_ThrowNullPointerException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, numberNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = numberNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Method isParameterMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("isParameter", varClazz);
        isParameterMethod.setAccessible(true);
        java.lang.Object[] isParameterMethodArguments = new java.lang.Object[1];
        isParameterMethodArguments[0] = var;
        try {
            isParameterMethod.invoke(mustBeReachingVariableDef, isParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.createEntryLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#createEntryLattice()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.returnsFrom {@code return new MustDef(jsScope.getVars());}
 *  */
    @Test
    public void testCreateEntryLattice_ScopeGetVars() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        MustBeReachingVariableDef.MustDef actual = mustBeReachingVariableDef.createEntryLattice();
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#createEntryLattice()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new MustDef(jsScope.getVars());
 *  */
    @Test
    public void testCreateEntryLattice_ThrowNullPointerException() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.createEntryLattice] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.createEntryLattice(MustBeReachingVariableDef.java:199) */
        mustBeReachingVariableDef.createEntryLattice();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeMustDef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef, boolean)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMustDef_Return() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(105);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMustDef_Return_1() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(118);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.IF}
 * @utbot.triggersRecursion computeMustDef, where the test return from: {@code return;}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMustDef_NodeUtilGetConditionExpression() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): False}
 * @utbot.executesCondition {@code (n.isName() && "arguments".equals(n.getString())): False}
 * @utbot.executesCondition {@code (n.isDec() || n.isInc()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isDec()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isInc()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testComputeMustDef_NIsDecOrNIsInc() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(-30);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.OR}
 * @utbot.triggersRecursion computeMustDef, where the test activate {@code switch(n.getType()) case: Token.FUNCTION}, return from: {@code return;}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMustDef_MustBeReachingVariableDefComputeMustDef() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): False}
 * @utbot.executesCondition {@code (n.isName() && "arguments".equals(n.getString())): True}
 * @utbot.executesCondition {@code (if (n.isName() && "arguments".equals(n.getString())) {
 *     escapeParameters(output);
 * }): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)
 *  */
    @Test
    public void testComputeMustDef_NIsNameAndArgumentsEquals() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", stringNodeType, stringNodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = stringNode;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeMustDef_NotCHasChildren() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeMustDef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef, boolean)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = ((Object) null);
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().isName()
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(88);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:280) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().isName()
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_2() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(97);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:280) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): False}
 * @utbot.executesCondition {@code (n.isName() && "arguments".equals(n.getString())): False}
 * @utbot.executesCondition {@code (n.isDec() || n.isInc()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isDec()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isInc()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: target.isName()
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_4() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(102);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:306) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.IF}
 * @utbot.triggersRecursion computeMustDef, where the test invoke:
 *     com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMustDef(NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_7() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(113);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:235) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): True}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.triggersRecursion computeMustDef, where the test invoke:
 *     com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMustDef(name.getNext(), cfgNode, output, conditional);
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_3() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(90);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:282) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.OR}
 * @utbot.triggersRecursion computeMustDef, where the test return from: {@code return;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMustDef(n.getLastChild(), cfgNode, output, true);
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_5() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:259) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.HOOK}
 * @utbot.triggersRecursion computeMustDef, where the test does not iterate {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())}, return from: {@code return;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: computeMustDef(n.getFirstChild().getNext(), cfgNode, output, true);
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_6() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(98);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:264) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgNode
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_8() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(MustBeReachingVariableDef.java:328)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:272) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", numberNodeType, numberNodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = numberNode;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = true;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgNode
 *  */
    @Test
    public void testComputeMustDef_ThrowNullPointerException_9() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(MustBeReachingVariableDef.java:328)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:272) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", numberNodeType, numberNodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = numberNode;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeMustDef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef, boolean)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (!NodeUtil.isForIn(n)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.getConditionExpression(n)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMustDef_ThrowIllegalArgumentException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(115);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(n)): False}
 * @utbot.executesCondition {@code (n.isName() && "arguments".equals(n.getString())): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isAssignmentOp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isName() && "arguments".equals(n.getString())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testComputeMustDef_ThrowUnsupportedOperationException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(38);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: conditional
 *  */
    @Test(expected = IllegalStateException.class)
    public void testComputeMustDef_ThrowIllegalStateException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: conditional
 *  */
    @Test(expected = IllegalStateException.class)
    public void testComputeMustDef_ThrowIllegalStateException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeMustDef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef,boolean)}
 * @utbot.executesCondition {@code (!NodeUtil.isForIn(n)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.getConditionExpression(n)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testComputeMustDef_ThrowIllegalArgumentException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Class booleanType = boolean.class;
        Method computeMustDefMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeMustDef", nodeType, nodeType, mustDefType, booleanType);
        computeMustDefMethod.setAccessible(true);
        java.lang.Object[] computeMustDefMethodArguments = new java.lang.Object[4];
        computeMustDefMethodArguments[0] = node;
        computeMustDefMethodArguments[1] = ((Object) null);
        computeMustDefMethodArguments[2] = ((Object) null);
        computeMustDefMethodArguments[3] = false;
        try {
            computeMustDefMethod.invoke(mustBeReachingVariableDef, computeMustDefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.isForward
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isForward()
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#isForward()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsForward_ReturnTrue() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        boolean actual = mustBeReachingVariableDef.isForward();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addToDefIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.executesCondition {@code (var == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddToDefIfLocal_VarEqualsNull() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = ((Object) null);
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = ((Object) null);
        addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.executesCondition {@code (var == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddToDefIfLocal_VarEqualsNull_1() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = ((Object) null);
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = ((Object) null);
        addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddToDefIfLocal_VarScopeNotEqualsJsScope() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = string;
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = ((Object) null);
        addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addToDefIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = jsScope.getVar(name);
 *  */
    @Test
    public void testAddToDefIfLocal_ThrowNullPointerException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(MustBeReachingVariableDef.java:328) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = ((Object) null);
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = ((Object) null);
        try {
            addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Var other: def.reachingDef.keySet())
 *  */
    @Test
    public void testAddToDefIfLocal_ThrowNullPointerException_2() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(MustBeReachingVariableDef.java:336) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = string;
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = ((Object) null);
        try {
            addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#addToDefIfLocal(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.executesCondition {@code (var == null): False}
 * @utbot.executesCondition {@code (var.scope != jsScope): False}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Var other: def.reachingDef.keySet())
 *  */
    @Test
    public void testAddToDefIfLocal_ThrowNullPointerException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", jsScope);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(MustBeReachingVariableDef.java:336) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method addToDefIfLocalMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("addToDefIfLocal", stringType, nodeType, nodeType, mustDefType);
        addToDefIfLocalMethod.setAccessible(true);
        java.lang.Object[] addToDefIfLocalMethodArguments = new java.lang.Object[4];
        addToDefIfLocalMethodArguments[0] = string;
        addToDefIfLocalMethodArguments[1] = ((Object) null);
        addToDefIfLocalMethodArguments[2] = ((Object) null);
        addToDefIfLocalMethodArguments[3] = mustDef;
        try {
            addToDefIfLocalMethod.invoke(mustBeReachingVariableDef, addToDefIfLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:360) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Entry<Var, Definition> pair: output.reachingDef.entrySet())
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:370) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Entry<Var, Definition> pair: output.reachingDef.entrySet())
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_2() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:370) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = mustDef;
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isParameter(v)
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_4() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        vars.put(string, null);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384)
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:362) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: output.reachingDef.put(v, null);
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_6() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) nameNode)).setType(83);
        setField(nameNode, "com.google.javascript.rhino.Node", "parent", nameNode);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:365) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Entry<Var, Definition> pair: output.reachingDef.entrySet())
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_8() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nameNode, "com.google.javascript.rhino.Node", "parent", nameNode);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:370) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isParameter(v)
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_3() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384)
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:362) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isParameter(v)
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_5() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(MustBeReachingVariableDef.java:384)
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:362) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = ((Object) null);
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> i = jsScope.getVars(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: output.reachingDef.put(v, null);
 *  */
    @Test
    public void testEscapeParameters_ThrowNullPointerException_7() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Scope jsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(83);
        setField(nameNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        vars.put(string, arguments);
        setField(jsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "jsScope", jsScope);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(MustBeReachingVariableDef.java:365) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method escapeParametersMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("escapeParameters", mustDefType);
        escapeParametersMethod.setAccessible(true);
        java.lang.Object[] escapeParametersMethodArguments = new java.lang.Object[1];
        escapeParametersMethodArguments[0] = mustDef;
        try {
            escapeParametersMethod.invoke(mustBeReachingVariableDef, escapeParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef$Definition, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeDependence_ThrowNullPointerException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, nodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = ((Object) null);
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeDependence_ThrowNullPointerException_2() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, stringNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = stringNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeDependence_ThrowNullPointerException_1() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeDependence_ThrowNullPointerException_3() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef$Definition, com.google.javascript.rhino.Node)
    
    @Test
    public void testComputeDependence1() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object definition = createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = definition;
        computeDependenceMethodArguments[1] = numberNode;
        computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
    }
    
    @Test
    public void testComputeDependence2() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
    }
    
    @Test
    public void testComputeDependence3() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
    }
    
    @Test
    public void testComputeDependence4() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef$Definition, com.google.javascript.rhino.Node)
    
    @Test
    public void testComputeDependence5() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, nodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = node;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeDependence6() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComputeDependence7() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(MustBeReachingVariableDef.java:392) */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef$Definition, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testComputeDependence8() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.MustBeReachingVariableDef", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, stringNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = stringNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef$Definition, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testComputeDependence9() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class definitionType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeDependenceMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("computeDependence", definitionType, numberNodeType);
        computeDependenceMethod.setAccessible(true);
        java.lang.Object[] computeDependenceMethodArguments = new java.lang.Object[2];
        computeDependenceMethodArguments[0] = ((Object) null);
        computeDependenceMethodArguments[1] = numberNode;
        try {
            computeDependenceMethod.invoke(mustBeReachingVariableDef, computeDependenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MustDef output = new MustDef(input);
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough] produces [java.lang.NullPointerException]
            java.base/java.util.HashMap.putMapEntries(HashMap.java:495)
            java.base/java.util.HashMap.<init>(HashMap.java:484)
            com.google.common.collect.Maps.newHashMap(Maps.java:138)
            com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef.<init>(MustBeReachingVariableDef.java:136)
            com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(MustBeReachingVariableDef.java:211) */
        mustBeReachingVariableDef.flowThrough(null, mustDef);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    @Test
    public void testFlowThrough1() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(122);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        MustBeReachingVariableDef.MustDef actual = mustBeReachingVariableDef.flowThrough(node, mustDef);
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef1 = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef1);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFlowThrough2() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(125);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        MustBeReachingVariableDef.MustDef actual = mustBeReachingVariableDef.flowThrough(node, mustDef);
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef1 = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef1);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFlowThrough3() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Object object = createInstance("java.lang.Object");
        reachingDef.put(arguments, object);
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method flowThroughMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("flowThrough", numberNodeType, mustDefType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = mustDef;
        MustBeReachingVariableDef.MustDef actual = ((MustBeReachingVariableDef.MustDef) flowThroughMethod.invoke(mustBeReachingVariableDef, flowThroughMethodArguments));
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef1 = new HashMap();
        reachingDef1.put(arguments, object);
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef1);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFlowThrough4() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        Object object = createInstance("java.lang.Object");
        reachingDef.put(var, object);
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class mustDefType = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Method flowThroughMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("flowThrough", numberNodeType, mustDefType);
        flowThroughMethod.setAccessible(true);
        java.lang.Object[] flowThroughMethodArguments = new java.lang.Object[2];
        flowThroughMethodArguments[0] = numberNode;
        flowThroughMethodArguments[1] = mustDef;
        MustBeReachingVariableDef.MustDef actual = ((MustBeReachingVariableDef.MustDef) flowThroughMethod.invoke(mustBeReachingVariableDef, flowThroughMethodArguments));
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef1 = new HashMap();
        reachingDef1.put(var, object);
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef1);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef)
    
    @Test
    public void testFlowThrough5() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(98);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:263)
            com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(MustBeReachingVariableDef.java:215) */
        mustBeReachingVariableDef.flowThrough(node, mustDef);
    }
    
    @Test
    public void testFlowThrough6() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Node node = new Node(101);
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:258)
            com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(MustBeReachingVariableDef.java:215) */
        mustBeReachingVariableDef.flowThrough(node, mustDef);
    }
    
    @Test
    public void testFlowThrough7() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        MustBeReachingVariableDef.MustDef mustDef = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        LinkedHashMap reachingDef = new LinkedHashMap();
        setField(mustDef, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(MustBeReachingVariableDef.java:226)
            com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(MustBeReachingVariableDef.java:215) */
        mustBeReachingVariableDef.flowThrough(null, mustDef);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.getDef
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDef(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getDef(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getCfg()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(getCfg().hasNode(useNode));
 *  */
    @Test
    public void testGetDef_ThrowNullPointerException() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.getDef] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.getDef(MustBeReachingVariableDef.java:414) */
        mustBeReachingVariableDef.getDef(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDef(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getDef(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getCfg()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#hasNode(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(getCfg().hasNode(useNode));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDef_ThrowIllegalArgumentException() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        
        mustBeReachingVariableDef.getDef(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.dependsOnOuterScopeVars
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dependsOnOuterScopeVars(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#dependsOnOuterScopeVars(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getCfg()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(getCfg().hasNode(useNode));
 *  */
    @Test
    public void testDependsOnOuterScopeVars_ThrowNullPointerException() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        /* This test fails because method [com.google.javascript.jscomp.MustBeReachingVariableDef.dependsOnOuterScopeVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MustBeReachingVariableDef.dependsOnOuterScopeVars(MustBeReachingVariableDef.java:426) */
        mustBeReachingVariableDef.dependsOnOuterScopeVars(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dependsOnOuterScopeVars(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#dependsOnOuterScopeVars(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MustBeReachingVariableDef#getCfg()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#hasNode(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(getCfg().hasNode(useNode));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDependsOnOuterScopeVars_ThrowIllegalArgumentException() throws Throwable  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        ControlFlowGraph cfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        setField(cfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(mustBeReachingVariableDef, "com.google.javascript.jscomp.DataFlowAnalysis", "cfg", cfg);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class mustBeReachingVariableDefClazz = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method dependsOnOuterScopeVarsMethod = mustBeReachingVariableDefClazz.getDeclaredMethod("dependsOnOuterScopeVars", stringType, numberNodeType);
        dependsOnOuterScopeVarsMethod.setAccessible(true);
        java.lang.Object[] dependsOnOuterScopeVarsMethodArguments = new java.lang.Object[2];
        dependsOnOuterScopeVarsMethodArguments[0] = ((Object) null);
        dependsOnOuterScopeVarsMethodArguments[1] = numberNode;
        try {
            dependsOnOuterScopeVarsMethod.invoke(mustBeReachingVariableDef, dependsOnOuterScopeVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MustBeReachingVariableDef.createInitialEstimateLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInitialEstimateLattice()
    
    /**
    @utbot.classUnderTest {@link MustBeReachingVariableDef}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MustBeReachingVariableDef#createInitialEstimateLattice()}
 * @utbot.returnsFrom {@code return new MustDef();}
 *  */
    @Test
    public void testCreateInitialEstimateLattice_Return() throws Exception  {
        MustBeReachingVariableDef mustBeReachingVariableDef = ((MustBeReachingVariableDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        
        MustBeReachingVariableDef.MustDef actual = mustBeReachingVariableDef.createInitialEstimateLattice();
        
        MustBeReachingVariableDef.MustDef expected = ((MustBeReachingVariableDef.MustDef) createInstance("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        HashMap reachingDef = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "reachingDef", reachingDef);
        
        // com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef has overridden equals method
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
        
                java.lang.reflect.Method methodForGetDeclaredFields886595514641400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields886595514641400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass886595514648700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields886595514641400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass886595514648700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

