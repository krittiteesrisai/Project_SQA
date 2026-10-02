package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.BasicNodeSet;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_compiler_CoreFunctionTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#toString()}
     */
    @Test
    public void testToString() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        String actual = coreFunction.toString();
        
        String expected = "unknownFunction0()()";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.compute
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method compute(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#compute(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testCompute() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(-1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(-1);
        
        Object actual = coreFunction.compute(predicateContext);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.computeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.activatesSwitch {@code switch(functionCode)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testComputeValue_ReturnNull() {
        CoreFunction coreFunction = new CoreFunction(-225, null);
        
        Object actual = coreFunction.computeValue(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getArgumentCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgumentCount()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArgumentCount()}
 * @utbot.executesCondition {@code (args == null): False}
 * @utbot.returnsFrom {@code return args.length;}
 *  */
    @Test
    public void testGetArgumentCount_ArgsNotEqualsNull() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        int actual = coreFunction.getArgumentCount();
        
        assertEquals(1, actual);
        
        Expression finalCoreFunctionArgs0 = coreFunction.args[0];
        
        assertNull(finalCoreFunctionArgs0);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArgumentCount()}
 * @utbot.executesCondition {@code (args == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetArgumentCount_ArgsEqualsNull() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        int actual = coreFunction.getArgumentCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArg3()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg3()}
 * @utbot.returnsFrom {@code return args[2];}
 *  */
    @Test
    public void testGetArg3_Return2OfArgs() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Expression actual = coreFunction.getArg3();
        
        assertNull(actual);
        
        Expression finalCoreFunctionArgs0 = coreFunction.args[0];
        Expression finalCoreFunctionArgs1 = coreFunction.args[1];
        Expression finalCoreFunctionArgs2 = coreFunction.args[2];
        Expression finalCoreFunctionArgs3 = coreFunction.args[3];
        Expression finalCoreFunctionArgs4 = coreFunction.args[4];
        Expression finalCoreFunctionArgs5 = coreFunction.args[5];
        Expression finalCoreFunctionArgs6 = coreFunction.args[6];
        Expression finalCoreFunctionArgs7 = coreFunction.args[7];
        Expression finalCoreFunctionArgs8 = coreFunction.args[8];
        Expression finalCoreFunctionArgs9 = coreFunction.args[9];
        Expression finalCoreFunctionArgs10 = coreFunction.args[10];
        
        assertNull(finalCoreFunctionArgs0);
        
        assertNull(finalCoreFunctionArgs1);
        
        assertNull(finalCoreFunctionArgs2);
        
        assertNull(finalCoreFunctionArgs3);
        
        assertNull(finalCoreFunctionArgs4);
        
        assertNull(finalCoreFunctionArgs5);
        
        assertNull(finalCoreFunctionArgs6);
        
        assertNull(finalCoreFunctionArgs7);
        
        assertNull(finalCoreFunctionArgs8);
        
        assertNull(finalCoreFunctionArgs9);
        
        assertNull(finalCoreFunctionArgs10);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getArg3()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg3()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return args[2];
 *  */
    @Test
    public void testGetArg3_ThrowArrayIndexOutOfBoundsException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3(CoreFunction.java:130) */
        coreFunction.getArg3();
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg3()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return args[2];
 *  */
    @Test
    public void testGetArg3_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3(CoreFunction.java:130) */
        coreFunction.getArg3();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionCode()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionCode()}
 * @utbot.returnsFrom {@code return functionCode;}
 *  */
    @Test
    public void testGetFunctionCode_ReturnFunctionCode() {
        CoreFunction coreFunction = new CoreFunction(-255, null);
        
        int actual = coreFunction.getFunctionCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArg1()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.returnsFrom {@code return args[0];}
 *  */
    @Test
    public void testGetArg1_Return0OfArgs() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Expression actual = coreFunction.getArg1();
        
        assertNull(actual);
        
        Expression finalCoreFunctionArgs0 = coreFunction.args[0];
        
        assertNull(finalCoreFunctionArgs0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getArg1()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return args[0];
 *  */
    @Test
    public void testGetArg1_ThrowArrayIndexOutOfBoundsException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1(CoreFunction.java:122) */
        coreFunction.getArg1();
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return args[0];
 *  */
    @Test
    public void testGetArg1_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1(CoreFunction.java:122) */
        coreFunction.getArg1();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArg2()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg2()}
 * @utbot.returnsFrom {@code return args[1];}
 *  */
    @Test
    public void testGetArg2_Return1OfArgs() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Expression actual = coreFunction.getArg2();
        
        assertNull(actual);
        
        Expression finalCoreFunctionArgs0 = coreFunction.args[0];
        Expression finalCoreFunctionArgs1 = coreFunction.args[1];
        
        assertNull(finalCoreFunctionArgs0);
        
        assertNull(finalCoreFunctionArgs1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getArg2()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg2()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return args[1];
 *  */
    @Test
    public void testGetArg2_ThrowArrayIndexOutOfBoundsException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2(CoreFunction.java:126) */
        coreFunction.getArg2();
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg2()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return args[1];
 *  */
    @Test
    public void testGetArg2_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2(CoreFunction.java:126) */
        coreFunction.getArg2();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionName()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_LAST}
 * @utbot.returnsFrom {@code return "last";}
 *  */
    @Test
    public void testGetFunctionName_ReturnLast() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "last";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_CEILING}
 * @utbot.returnsFrom {@code return "ceiling";}
 *  */
    @Test
    public void testGetFunctionName_ReturnCeiling() {
        CoreFunction coreFunction = new CoreFunction(26, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "ceiling";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_SUBSTRING_AFTER}
 * @utbot.returnsFrom {@code return "substring-after";}
 *  */
    @Test
    public void testGetFunctionName_ReturnSubstringafter() {
        CoreFunction coreFunction = new CoreFunction(13, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "substring-after";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_LANG}
 * @utbot.returnsFrom {@code return "lang";}
 *  */
    @Test
    public void testGetFunctionName_ReturnLang() {
        CoreFunction coreFunction = new CoreFunction(22, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "lang";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_CONTAINS}
 * @utbot.returnsFrom {@code return "contains";}
 *  */
    @Test
    public void testGetFunctionName_ReturnContains() {
        CoreFunction coreFunction = new CoreFunction(11, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "contains";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_KEY}
 * @utbot.returnsFrom {@code return "key";}
 *  */
    @Test
    public void testGetFunctionName_ReturnKey() {
        CoreFunction coreFunction = new CoreFunction(29, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "key";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_STARTS_WITH}
 * @utbot.returnsFrom {@code return "starts-with";}
 *  */
    @Test
    public void testGetFunctionName_ReturnStartswith() {
        CoreFunction coreFunction = new CoreFunction(10, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "starts-with";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_LOCAL_NAME}
 * @utbot.returnsFrom {@code return "local-name";}
 *  */
    @Test
    public void testGetFunctionName_ReturnLocalname() {
        CoreFunction coreFunction = new CoreFunction(5, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "local-name";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NOT}
 * @utbot.returnsFrom {@code return "not";}
 *  */
    @Test
    public void testGetFunctionName_ReturnNot() {
        CoreFunction coreFunction = new CoreFunction(19, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "not";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_FALSE}
 * @utbot.returnsFrom {@code return "false";}
 *  */
    @Test
    public void testGetFunctionName_ReturnFalse() {
        CoreFunction coreFunction = new CoreFunction(21, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "false";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_BOOLEAN}
 * @utbot.returnsFrom {@code return "boolean";}
 *  */
    @Test
    public void testGetFunctionName_ReturnBoolean() {
        CoreFunction coreFunction = new CoreFunction(18, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "boolean";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NORMALIZE_SPACE}
 * @utbot.returnsFrom {@code return "normalize-space";}
 *  */
    @Test
    public void testGetFunctionName_ReturnNormalizespace() {
        CoreFunction coreFunction = new CoreFunction(16, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "normalize-space";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_STRING_LENGTH}
 * @utbot.returnsFrom {@code return "string-length";}
 *  */
    @Test
    public void testGetFunctionName_ReturnStringlength() {
        CoreFunction coreFunction = new CoreFunction(15, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "string-length";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_FLOOR}
 * @utbot.returnsFrom {@code return "floor";}
 *  */
    @Test
    public void testGetFunctionName_ReturnFloor() {
        CoreFunction coreFunction = new CoreFunction(25, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "floor";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NUMBER}
 * @utbot.returnsFrom {@code return "number";}
 *  */
    @Test
    public void testGetFunctionName_ReturnNumber() {
        CoreFunction coreFunction = new CoreFunction(23, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "number";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_CONCAT}
 * @utbot.returnsFrom {@code return "concat";}
 *  */
    @Test
    public void testGetFunctionName_ReturnConcat() {
        CoreFunction coreFunction = new CoreFunction(9, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "concat";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_STRING}
 * @utbot.returnsFrom {@code return "string";}
 *  */
    @Test
    public void testGetFunctionName_ReturnString() {
        CoreFunction coreFunction = new CoreFunction(8, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "string";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NAMESPACE_URI}
 * @utbot.returnsFrom {@code return "namespace-uri";}
 *  */
    @Test
    public void testGetFunctionName_ReturnNamespaceuri() {
        CoreFunction coreFunction = new CoreFunction(6, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "namespace-uri";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_SUBSTRING_BEFORE}
 * @utbot.returnsFrom {@code return "substring-before";}
 *  */
    @Test
    public void testGetFunctionName_ReturnSubstringbefore() {
        CoreFunction coreFunction = new CoreFunction(12, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "substring-before";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_ID}
 * @utbot.returnsFrom {@code return "id";}
 *  */
    @Test
    public void testGetFunctionName_ReturnId() {
        CoreFunction coreFunction = new CoreFunction(4, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "id";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_ROUND}
 * @utbot.returnsFrom {@code return "round";}
 *  */
    @Test
    public void testGetFunctionName_ReturnRound() {
        CoreFunction coreFunction = new CoreFunction(27, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "round";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_POSITION}
 * @utbot.returnsFrom {@code return "position";}
 *  */
    @Test
    public void testGetFunctionName_ReturnPosition() {
        CoreFunction coreFunction = new CoreFunction(2, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "position";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_TRUE}
 * @utbot.returnsFrom {@code return "true";}
 *  */
    @Test
    public void testGetFunctionName_ReturnTrue() {
        CoreFunction coreFunction = new CoreFunction(20, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_FORMAT_NUMBER}
 * @utbot.returnsFrom {@code return "format-number";}
 *  */
    @Test
    public void testGetFunctionName_ReturnFormatnumber() {
        CoreFunction coreFunction = new CoreFunction(30, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "format-number";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_SUM}
 * @utbot.returnsFrom {@code return "sum";}
 *  */
    @Test
    public void testGetFunctionName_ReturnSum() {
        CoreFunction coreFunction = new CoreFunction(24, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "sum";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NAME}
 * @utbot.returnsFrom {@code return "name";}
 *  */
    @Test
    public void testGetFunctionName_ReturnName() {
        CoreFunction coreFunction = new CoreFunction(7, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "name";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_SUBSTRING}
 * @utbot.returnsFrom {@code return "substring";}
 *  */
    @Test
    public void testGetFunctionName_ReturnSubstring() {
        CoreFunction coreFunction = new CoreFunction(14, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "substring";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_COUNT}
 * @utbot.returnsFrom {@code return "count";}
 *  */
    @Test
    public void testGetFunctionName_ReturnCount() {
        CoreFunction coreFunction = new CoreFunction(3, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "count";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_TRANSLATE}
 * @utbot.returnsFrom {@code return "translate";}
 *  */
    @Test
    public void testGetFunctionName_ReturnTranslate() {
        CoreFunction coreFunction = new CoreFunction(17, null);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "translate";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFunctionName()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getFunctionName()}
     */
    @Test
    public void testGetFunctionName() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(-2147483625, expressionArray);
        
        String actual = coreFunction.getFunctionName();
        
        String expected = "unknownFunction-2147483625()";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionStringLength(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStringLength(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: s = InfoSetUtil.stringValue(context.getCurrentNodePointer());
 *  */
    @Test
    public void testFunctionStringLength_ThrowNullPointerException_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(CoreFunction.java:535) */
        coreFunction.functionStringLength(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStringLength(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: s = InfoSetUtil.stringValue(context.getCurrentNodePointer());
 *  */
    @Test
    public void testFunctionStringLength_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(CoreFunction.java:535) */
        coreFunction.functionStringLength(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionStringLength(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStringLength(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionStringLengthThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(CoreFunction.java:535) */
        coreFunction.functionStringLength(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.executesCondition {@code (ac != 2): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InfoSetUtil.doubleValue(getArg1().computeValue(context))
 *  */
    @Test
    public void testFunctionFormatNumber_ThrowNullPointerException() throws Throwable  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(CoreFunction.java:678) */
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class evalContextType = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Method functionFormatNumberMethod = coreFunctionClazz.getDeclaredMethod("functionFormatNumber", evalContextType);
        functionFormatNumberMethod.setAccessible(true);
        java.lang.Object[] functionFormatNumberMethodArguments = new java.lang.Object[1];
        functionFormatNumberMethodArguments[0] = ((Object) null);
        try {
            functionFormatNumberMethod.invoke(coreFunction, functionFormatNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.executesCondition {@code (ac != 2): True}
 * @utbot.executesCondition {@code (ac != 3): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InfoSetUtil.doubleValue(getArg1().computeValue(context))
 *  */
    @Test
    public void testFunctionFormatNumber_ThrowNullPointerException_1() throws Throwable  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(CoreFunction.java:678) */
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class evalContextType = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Method functionFormatNumberMethod = coreFunctionClazz.getDeclaredMethod("functionFormatNumber", evalContextType);
        functionFormatNumberMethod.setAccessible(true);
        java.lang.Object[] functionFormatNumberMethodArguments = new java.lang.Object[1];
        functionFormatNumberMethodArguments[0] = ((Object) null);
        try {
            functionFormatNumberMethod.invoke(coreFunction, functionFormatNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFormatNumberThrowsJXPISE() throws Throwable  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1027, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(2);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(0);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class predicateContextType = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Method functionFormatNumberMethod = coreFunctionClazz.getDeclaredMethod("functionFormatNumber", predicateContextType);
        functionFormatNumberMethod.setAccessible(true);
        java.lang.Object[] functionFormatNumberMethodArguments = new java.lang.Object[1];
        functionFormatNumberMethodArguments[0] = predicateContext;
        try {
            functionFormatNumberMethod.invoke(coreFunction, functionFormatNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.computeContextDependent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method computeContextDependent()
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_ROUND}
 *  */
    @Test
    public void testComputeContextDependent_SwitchFunctionCodeCaseCompilerFUNCTION_ROUND() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(14, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_ROUND}
 *  */
    @Test
    public void testComputeContextDependent_SwitchFunctionCodeCaseCompilerFUNCTION_ROUND_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = new Constant(((Number) null));
        expressionArray[0] = ((Expression) constant);
        CoreFunction coreFunction = new CoreFunction(20, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 *  */
    @Test
    public void testComputeContextDependent_ReturnFalse_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        VariableReference variableReference = new VariableReference(null);
        expressionArray[0] = ((Expression) variableReference);
        CoreFunction coreFunction = new CoreFunction(16, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 *  */
    @Test
    public void testComputeContextDependent_ReturnFalse() {
        CoreFunction coreFunction = new CoreFunction(16, null);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_POSITION}
 *  */
    @Test
    public void testComputeContextDependent_ReturnTrue() {
        CoreFunction coreFunction = new CoreFunction(2, null);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode)}
 *  */
    @Test
    public void testComputeContextDependent_ReturnFalse_1() {
        CoreFunction coreFunction = new CoreFunction(29, null);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method computeContextDependent()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return args == null || args.length == 0;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NUMBER}
 * @utbot.returnsFrom {@code return args == null || args.length == 0;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsEqualsNullOrArgsLengthEqualsZero_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(23, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NUMBER}
 * @utbot.returnsFrom {@code return args == null || args.length == 0;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsNotEqualsNullOrArgsLengthNotEqualsZero() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = new Constant(((Number) null));
        expressionArray[0] = ((Expression) constant);
        CoreFunction coreFunction = new CoreFunction(8, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.activatesSwitch {@code switch(functionCode) case: Compiler.FUNCTION_NUMBER}
 * @utbot.returnsFrom {@code return args == null || args.length == 0;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsEqualsNullOrArgsLengthEqualsZero() {
        CoreFunction coreFunction = new CoreFunction(18, null);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method computeContextDependent()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests activate {@code switch(functionCode) case: Compiler.FUNCTION_FORMAT_NUMBER}, return from: {@code return args != null && args.length == 2;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.returnsFrom {@code return args != null && args.length == 2;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsNotEqualsNullAndArgsLengthNotEquals2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(30, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.returnsFrom {@code return args != null && args.length == 2;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsEqualsNullAndArgsLengthEquals2_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        Constant constant = new Constant(((Number) null));
        expressionArray[0] = ((Expression) constant);
        VariableReference variableReference = new VariableReference(null);
        expressionArray[1] = ((Expression) variableReference);
        CoreFunction coreFunction = new CoreFunction(30, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
 * @utbot.returnsFrom {@code return args != null && args.length == 2;}
 *  */
    @Test
    public void testComputeContextDependent_ArgsEqualsNullAndArgsLengthEquals2() {
        CoreFunction coreFunction = new CoreFunction(30, null);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method computeContextDependent()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#computeContextDependent()}
     */
    @Test
    public void testComputeContextDependentReturnsFalse() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(Integer.MIN_VALUE, expressionArray);
        
        boolean actual = coreFunction.computeContextDependent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringBefore_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSubstringBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringBefore_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSubstringBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringBefore_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionSubstringBefore(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionSubstringBefore_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore(CoreFunction.java:465) */
        coreFunction.functionSubstringBefore(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringBeforeThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1024, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(Integer.MAX_VALUE);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(0);
        
        coreFunction.functionSubstringBefore(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = context.getCurrentNodePointer();
 *  */
    @Test
    public void testFunctionNamespaceURI_ThrowNullPointerException_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(CoreFunction.java:378) */
        coreFunction.functionNamespaceURI(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = context.getCurrentNodePointer();
 *  */
    @Test
    public void testFunctionNamespaceURI_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(CoreFunction.java:378) */
        coreFunction.functionNamespaceURI(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionNamespaceURIThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(CoreFunction.java:378) */
        coreFunction.functionNamespaceURI(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNormalizeSpace_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionNormalizeSpace(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNormalizeSpace_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionNormalizeSpace(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNormalizeSpace_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionNormalizeSpace(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionNormalizeSpace_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace(CoreFunction.java:546) */
        coreFunction.functionNormalizeSpace(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringAfter_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSubstringAfter(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringAfter_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSubstringAfter(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringAfter_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionSubstringAfter(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionSubstringAfter_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter(CoreFunction.java:476) */
        coreFunction.functionSubstringAfter(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringAfterThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1026, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(-1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        coreFunction.functionSubstringAfter(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionNot(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNot(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNot_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionNot(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNot(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNot_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionNot(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNot(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNot_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionNot(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionNot(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNot(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InfoSetUtil.booleanValue(getArg1().computeValue(context))
 *  */
    @Test
    public void testFunctionNot_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot(CoreFunction.java:606) */
        coreFunction.functionNot(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method functionNull(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNull(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFunctionNull_ReturnNull() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Object actual = coreFunction.functionNull(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNull(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFunctionNull_ReturnNull_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Object actual = coreFunction.functionNull(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionNull(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNull(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(0);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNull_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionNull(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSum(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSum(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSum_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSum(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSum(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSum_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionSum(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSum(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSum_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionSum(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionSum(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSum(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#compute(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object v = getArg1().compute(context);
 *  */
    @Test
    public void testFunctionSum_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum(CoreFunction.java:636) */
        coreFunction.functionSum(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionName(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionName(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = context.getCurrentNodePointer();
 *  */
    @Test
    public void testFunctionName_ThrowNullPointerException_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(CoreFunction.java:414) */
        coreFunction.functionName(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionName(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = context.getCurrentNodePointer();
 *  */
    @Test
    public void testFunctionName_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(CoreFunction.java:414) */
        coreFunction.functionName(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionName(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionName(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionNameThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(CoreFunction.java:414) */
        coreFunction.functionName(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionStartsWith_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionStartsWith(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionStartsWith_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionStartsWith(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionStartsWith_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionStartsWith(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionStartsWith_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith(CoreFunction.java:451) */
        coreFunction.functionStartsWith(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionStartsWithThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1026, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(Integer.MAX_VALUE);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(0);
        
        coreFunction.functionStartsWith(predicateContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionKey(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionKey(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionKey_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionKey(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionKey(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionKey_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionKey(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionKey(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionKey_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionKey(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionKey(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String key = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionKey_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionKey(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionKey(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionKeyThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1026, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(Integer.MAX_VALUE);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(0);
        
        coreFunction.functionKey(predicateContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionKey(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionKey1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(unionContext);
    }
    
    @Test
    public void testFunctionKey2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(rootContext);
    }
    
    @Test
    public void testFunctionKey3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(nodeSetContext);
    }
    
    @Test
    public void testFunctionKey4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(rootContext);
    }
    
    @Test
    public void testFunctionKey5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(unionContext);
    }
    
    @Test
    public void testFunctionKey6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(rootContext);
    }
    
    @Test
    public void testFunctionKey7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(unionContext);
    }
    
    @Test
    public void testFunctionKey8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(CoreFunction.java:351) */
        coreFunction.functionKey(rootContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionContains(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionContains(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionContains_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionContains(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionContains(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionContains_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[11];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionContains(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionContains(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionContains_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionContains(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionContains(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionContains(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionContains_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionContains(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionContains(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionContainsThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1026, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(-1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        coreFunction.functionContains(predicateContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionContains(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionContains1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(unionContext);
    }
    
    @Test
    public void testFunctionContains2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 33554432);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.IndexOutOfBoundsException: Index 33554431 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(nodeSetContext);
    }
    
    @Test
    public void testFunctionContains3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(rootContext);
    }
    
    @Test
    public void testFunctionContains4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(unionContext);
    }
    
    @Test
    public void testFunctionContains5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(rootContext);
    }
    
    @Test
    public void testFunctionContains6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(rootContext);
    }
    
    @Test
    public void testFunctionContains7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(CoreFunction.java:458) */
        coreFunction.functionContains(unionContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionTranslate(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTranslate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(3);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionTranslate_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionTranslate(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTranslate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(3);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionTranslate_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null, null, null, null, null, null, null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionTranslate(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTranslate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(3);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionTranslate_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionTranslate(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionTranslate(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTranslate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionTranslate_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionTranslate(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTranslate(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionTranslateThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(-1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(-1);
        
        coreFunction.functionTranslate(predicateContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionTranslate(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionTranslate1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(unionContext);
    }
    
    @Test
    public void testFunctionTranslate2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(rootContext);
    }
    
    @Test
    public void testFunctionTranslate3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 33554432);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.IndexOutOfBoundsException: Index 33554431 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(nodeSetContext);
    }
    
    @Test
    public void testFunctionTranslate4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(rootContext);
    }
    
    @Test
    public void testFunctionTranslate5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(unionContext);
    }
    
    @Test
    public void testFunctionTranslate6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.apache.commons.jxpath.BasicNodeSet.getPointers(BasicNodeSet.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(nodeSetContext);
    }
    
    @Test
    public void testFunctionTranslate7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(rootContext);
    }
    
    @Test
    public void testFunctionTranslate8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(rootContext);
    }
    
    @Test
    public void testFunctionTranslate9() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(CoreFunction.java:577) */
        coreFunction.functionTranslate(unionContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method functionPosition(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return new Integer(context.getCurrentPosition());}
 *  */
    @Test
    public void testFunctionPosition_Return() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        
        Integer actual = ((Integer) coreFunction.functionPosition(initialContext));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return new Integer(context.getCurrentPosition());}
 *  */
    @Test
    public void testFunctionPosition_Return_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        ParentContext parentContext = new ParentContext(null, null);
        
        Integer actual = ((Integer) coreFunction.functionPosition(parentContext));
        
        Integer expected = 1;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionPosition(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Integer(context.getCurrentPosition());
 *  */
    @Test
    public void testFunctionPosition_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(CoreFunction.java:301) */
        coreFunction.functionPosition(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Integer(context.getCurrentPosition());
 *  */
    @Test
    public void testFunctionPosition_ThrowNullPointerException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(CoreFunction.java:301) */
        coreFunction.functionPosition(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionPosition(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#getCurrentPosition()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return new Integer(context.getCurrentPosition());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFunctionPosition_ThrowUnsupportedOperationException() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        coreFunction.functionPosition(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionPosition(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(0);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionPosition_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionPosition(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionString(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionString(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArgumentCount()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#getCurrentNodePointer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return InfoSetUtil.stringValue(context.getCurrentNodePointer());
 *  */
    @Test
    public void testFunctionString_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(CoreFunction.java:431) */
        coreFunction.functionString(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionString(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionString(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionStringThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(CoreFunction.java:431) */
        coreFunction.functionString(predicateContext);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method functionString(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionString1() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        String actual = ((String) coreFunction.functionString(unionContext));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    @Test
    public void testFunctionString2() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        String actual = ((String) coreFunction.functionString(unionContext));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    @Test
    public void testFunctionString3() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        String actual = ((String) coreFunction.functionString(unionContext));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionString(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionString4() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(CoreFunction.java:431) */
        coreFunction.functionString(unionContext);
    }
    
    @Test
    public void testFunctionString5() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(CoreFunction.java:431) */
        coreFunction.functionString(nodeSetContext);
    }
    
    @Test
    public void testFunctionString6() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(CoreFunction.java:431) */
        coreFunction.functionString(unionContext);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionString(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionString7() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[17];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        
        coreFunction.functionString(ancestorContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTrue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method functionTrue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTrue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testFunctionTrue_ReturnBooleanTRUE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Boolean actual = ((Boolean) coreFunction.functionTrue(null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTrue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testFunctionTrue_ReturnBooleanTRUE_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Boolean actual = ((Boolean) coreFunction.functionTrue(null));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionTrue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionTrue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(0);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionTrue_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionTrue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method functionFalse(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFalse(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testFunctionFalse_ReturnBooleanFALSE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Boolean actual = ((Boolean) coreFunction.functionFalse(null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFalse(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void testFunctionFalse_ReturnBooleanFALSE_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Boolean actual = ((Boolean) coreFunction.functionFalse(null));
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionFalse(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFalse(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(0);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFalse_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionFalse(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNumber(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return InfoSetUtil.number(context.getCurrentNodePointer());
 *  */
    @Test
    public void testFunctionNumber_ThrowNullPointerException_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNumber(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return InfoSetUtil.number(context.getCurrentNodePointer());
 *  */
    @Test
    public void testFunctionNumber_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionNumber(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionNumberThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(predicateContext);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method functionNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionNumber1() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        Double actual = ((Double) coreFunction.functionNumber(unionContext));
        
        Double expected = java.lang.Double.NaN;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    @Test
    public void testFunctionNumber2() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        Double actual = ((Double) coreFunction.functionNumber(unionContext));
        
        Double expected = java.lang.Double.NaN;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionNumber3() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(unionContext);
    }
    
    @Test
    public void testFunctionNumber4() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(nodeSetContext);
    }
    
    @Test
    public void testFunctionNumber5() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(nodeSetContext);
    }
    
    @Test
    public void testFunctionNumber6() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(CoreFunction.java:628) */
        coreFunction.functionNumber(unionContext);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionNumber(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionNumber7() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[17];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        
        coreFunction.functionNumber(ancestorContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionLang(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLang(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLang_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionLang(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLang(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLang_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionLang(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLang(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLang_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionLang(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionLang(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLang(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String lang = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionLang_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionLang(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionLang1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(unionContext);
    }
    
    @Test
    public void testFunctionLang2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(nodeSetContext);
    }
    
    @Test
    public void testFunctionLang3() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(null);
    }
    
    @Test
    public void testFunctionLang4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(unionContext);
    }
    
    @Test
    public void testFunctionLang5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(rootContext);
    }
    
    @Test
    public void testFunctionLang6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(rootContext);
    }
    
    @Test
    public void testFunctionLang7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        DynamicPointer rootPointer = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(rootContext);
    }
    
    @Test
    public void testFunctionLang8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(unionContext);
    }
    
    @Test
    public void testFunctionLang9() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(CoreFunction.java:333) */
        coreFunction.functionLang(attributeContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionLast(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLast(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int old = context.getCurrentPosition();
 *  */
    @Test
    public void testFunctionLast_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:285) */
        coreFunction.functionLast(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLast(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int old = context.getCurrentPosition();
 *  */
    @Test
    public void testFunctionLast_ThrowNullPointerException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:285) */
        coreFunction.functionLast(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionLast(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLast(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#getCurrentPosition()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: int old = context.getCurrentPosition();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFunctionLast_ThrowUnsupportedOperationException() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        coreFunction.functionLast(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLast(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(0);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLast_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionLast(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionLast(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLast(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionLastThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1024, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(Integer.MAX_VALUE);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:288) */
        coreFunction.functionLast(predicateContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionLast(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test(expected = StackOverflowError.class)
    public void testFunctionLast1() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        PredicateContext predicateContext = ((PredicateContext) createInstance("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        PredicateContext parentContext = ((PredicateContext) createInstance("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(predicateContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        
        coreFunction.functionLast(predicateContext);
    }
    
    @Test
    public void testFunctionLast2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        PredicateContext predicateContext = ((PredicateContext) createInstance("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.PredicateContext.reset(PredicateContext.java:166)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:286) */
        coreFunction.functionLast(predicateContext);
    }
    
    @Test
    public void testFunctionLast3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        DescendantContext descendantContext = ((DescendantContext) createInstance("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.DescendantContext.nextNode(DescendantContext.java:90)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:288) */
        coreFunction.functionLast(descendantContext);
    }
    
    @Test
    public void testFunctionLast4() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        DescendantContext descendantContext = ((DescendantContext) createInstance("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.DescendantContext.nextNode(DescendantContext.java:90)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:288) */
        coreFunction.functionLast(descendantContext);
    }
    
    @Test
    public void testFunctionLast5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        ChildContext childContext = ((ChildContext) createInstance("org.apache.commons.jxpath.ri.axes.ChildContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:288) */
        coreFunction.functionLast(childContext);
    }
    
    @Test
    public void testFunctionLast6() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        ChildContext childContext = ((ChildContext) createInstance("org.apache.commons.jxpath.ri.axes.ChildContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(CoreFunction.java:288) */
        coreFunction.functionLast(childContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionBoolean(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionBoolean(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionBoolean_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionBoolean(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionBoolean(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionBoolean_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionBoolean(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionBoolean(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionBoolean_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionBoolean(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionBoolean(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionBoolean(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InfoSetUtil.booleanValue(getArg1().computeValue(context))
 *  */
    @Test
    public void testFunctionBoolean_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionBoolean(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionBoolean1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(unionContext);
    }
    
    @Test
    public void testFunctionBoolean2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(rootContext);
    }
    
    @Test
    public void testFunctionBoolean3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 8192);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.IndexOutOfBoundsException: Index 8191 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(nodeSetContext);
    }
    
    @Test
    public void testFunctionBoolean4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(unionContext);
    }
    
    @Test
    public void testFunctionBoolean5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.apache.commons.jxpath.BasicNodeSet.getPointers(BasicNodeSet.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(nodeSetContext);
    }
    
    @Test
    public void testFunctionBoolean6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(rootContext);
    }
    
    @Test
    public void testFunctionBoolean7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        DynamicPointer rootPointer = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(rootContext);
    }
    
    @Test
    public void testFunctionBoolean8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(unionContext);
    }
    
    @Test
    public void testFunctionBoolean9() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = new NodeSetContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(nodeSetContext);
    }
    
    @Test
    public void testFunctionBoolean10() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(attributeContext);
    }
    
    @Test
    public void testFunctionBoolean11() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(CoreFunction.java:599) */
        coreFunction.functionBoolean(attributeContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionConcat(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionConcat(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionConcat_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionConcat(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionConcat(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(2);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionConcat_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionConcat(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionConcat(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionConcat(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < args.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: buffer.append(InfoSetUtil.stringValue(args[i].compute(context)));
 *  */
    @Test
    public void testFunctionConcat_ThrowClassCastException() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionConcat(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < args.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(InfoSetUtil.stringValue(args[i].compute(context)));
 *  */
    @Test
    public void testFunctionConcat_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionConcat(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionConcat1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(unionContext);
    }
    
    @Test
    public void testFunctionConcat2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(nodeSetContext);
    }
    
    @Test
    public void testFunctionConcat3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(unionContext);
    }
    
    @Test
    public void testFunctionConcat4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(rootContext);
    }
    
    @Test
    public void testFunctionConcat5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(unionContext);
    }
    
    @Test
    public void testFunctionConcat6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JDOMNodePointer rootPointer = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(rootContext);
    }
    
    @Test
    public void testFunctionConcat7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(rootContext);
    }
    
    @Test
    public void testFunctionConcat8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(nodeSetContext);
    }
    
    @Test
    public void testFunctionConcat9() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        SelfContext selfContext = ((SelfContext) createInstance("org.apache.commons.jxpath.ri.axes.SelfContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(selfContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(selfContext);
    }
    
    @Test
    public void testFunctionConcat10() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[33];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        SelfContext selfContext = new SelfContext(rootContext, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(CoreFunction.java:444) */
        coreFunction.functionConcat(selfContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionSubstring(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstring(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionSubstring_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstring(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.executesCondition {@code (ac != 3): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s1 = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionSubstring_ThrowNullPointerException_1() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstring(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionSubstring(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstringThrowsJXPISE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(4);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(-1);
        
        coreFunction.functionSubstring(predicateContext);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionSubstring(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstring1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionSubstring(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionSubstring(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionSubstring2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(unionContext);
    }
    
    @Test
    public void testFunctionSubstring3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(rootContext);
    }
    
    @Test
    public void testFunctionSubstring4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 33554432);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.IndexOutOfBoundsException: Index 33554431 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(nodeSetContext);
    }
    
    @Test
    public void testFunctionSubstring5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        PrecedingOrFollowingContext precedingOrFollowingContext = ((PrecedingOrFollowingContext) createInstance("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(precedingOrFollowingContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(precedingOrFollowingContext);
    }
    
    @Test
    public void testFunctionSubstring6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(nodeSetContext);
    }
    
    @Test
    public void testFunctionSubstring7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(unionContext);
    }
    
    @Test
    public void testFunctionSubstring8() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(nodeSetContext);
    }
    
    @Test
    public void testFunctionSubstring9() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(initialContext);
    }
    
    @Test
    public void testFunctionSubstring10() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        VariablePointer rootPointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver(JXPathContextReferenceImpl.java:676)
            org.apache.commons.jxpath.ri.axes.RootContext.<init>(RootContext.java:49)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(rootContext);
    }
    
    @Test
    public void testFunctionSubstring11() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(unionContext);
    }
    
    @Test
    public void testFunctionSubstring12() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(rootContext);
    }
    
    @Test
    public void testFunctionSubstring13() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(nodeSetContext);
    }
    
    @Test
    public void testFunctionSubstring14() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext parentContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(initialContext);
    }
    
    @Test
    public void testFunctionSubstring15() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(rootContext);
    }
    
    @Test
    public void testFunctionSubstring16() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 33554432);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.apache.commons.jxpath.BasicNodeSet.getPointers(BasicNodeSet.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(nodeSetContext);
    }
    
    @Test
    public void testFunctionSubstring17() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(unionContext);
    }
    
    @Test
    public void testFunctionSubstring18() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        ChildContext childContext = new ChildContext(rootContext, null, false, false);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(CoreFunction.java:491) */
        coreFunction.functionSubstring(childContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionLocalName(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLocalName(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArgumentCount()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#getCurrentNodePointer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = context.getCurrentNodePointer();
 *  */
    @Test
    public void testFunctionLocalName_ThrowNullPointerException() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method functionLocalName(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionLocalName(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testFunctionLocalNameThrowsNPE() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1025, expressionArray);
        ChildContext childContext = new ChildContext(null, null, false, true);
        childContext.setPosition(1);
        Constant constant = new Constant(((Number) null));
        PredicateContext predicateContext = new PredicateContext(childContext, constant);
        predicateContext.setPosition(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.ChildContext.prepare(ChildContext.java:106)
            org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(ChildContext.java:97)
            org.apache.commons.jxpath.ri.axes.ChildContext.nextNode(ChildContext.java:85)
            org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode(PredicateContext.java:54)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(PredicateContext.java:181)
            org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(PredicateContext.java:135)
            org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer(PredicateContext.java:154)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(predicateContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionLocalName(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionLocalName1() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(unionContext);
    }
    
    @Test
    public void testFunctionLocalName2() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(nodeSetContext);
    }
    
    @Test
    public void testFunctionLocalName3() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(nodeSetContext);
    }
    
    @Test
    public void testFunctionLocalName4() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:397) */
        coreFunction.functionLocalName(unionContext);
    }
    
    @Test
    public void testFunctionLocalName5() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:398) */
        coreFunction.functionLocalName(unionContext);
    }
    
    @Test
    public void testFunctionLocalName6() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:398) */
        coreFunction.functionLocalName(unionContext);
    }
    
    @Test
    public void testFunctionLocalName7() throws Exception  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(CoreFunction.java:398) */
        coreFunction.functionLocalName(unionContext);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionLocalName(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLocalName8() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[17];
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        
        coreFunction.functionLocalName(ancestorContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionID(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionID(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionID_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionID(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionID(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionID_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionID(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionID(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionID_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionID(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionID(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionID(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String id = InfoSetUtil.stringValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionID_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method functionID(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testFunctionID1() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(rootContext);
    }
    
    @Test
    public void testFunctionID2() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 8192);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.IndexOutOfBoundsException: Index 8191 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(nodeSetContext);
    }
    
    @Test
    public void testFunctionID3() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(unionContext);
    }
    
    @Test
    public void testFunctionID4() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.apache.commons.jxpath.BasicNodeSet.getPointers(BasicNodeSet.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(nodeSetContext);
    }
    
    @Test
    public void testFunctionID5() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(rootContext);
    }
    
    @Test
    public void testFunctionID6() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        DynamicPointer rootPointer = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(Path.java:147)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:79)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(rootContext);
    }
    
    @Test
    public void testFunctionID7() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:77)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(unionContext);
    }
    
    @Test
    public void testFunctionID8() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        NodeSetContext nodeSetContext = new NodeSetContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(nodeSetContext);
    }
    
    @Test
    public void testFunctionID9() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(LocationPath.java:74)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(attributeContext);
    }
    
    @Test
    public void testFunctionID10() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        expressionArray[0] = ((Expression) expressionPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:140)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(ExpressionPath.java:130)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(CoreFunction.java:343) */
        coreFunction.functionID(attributeContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionCount(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCount(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCount_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionCount(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCount(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCount_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionCount(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCount(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCount_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionCount(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionCount(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCount(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#compute(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object value = arg1.compute(context);
 *  */
    @Test
    public void testFunctionCount_ThrowClassCastException() throws Exception  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = new LocationPath(true, null);
        expressionArray[0] = ((Expression) locationPath);
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(CoreFunction.java:308) */
        coreFunction.functionCount(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCount(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = arg1.compute(context);
 *  */
    @Test
    public void testFunctionCount_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(CoreFunction.java:308) */
        coreFunction.functionCount(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionCeiling(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCeiling(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCeiling_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionCeiling(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCeiling(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCeiling_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionCeiling(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCeiling(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionCeiling_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionCeiling(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionCeiling(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionCeiling(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double v = InfoSetUtil.doubleValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionCeiling_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling(CoreFunction.java:661) */
        coreFunction.functionCeiling(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assertArgCount(int)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)}
 *  */
    @Test
    public void testAssertArgCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgCountMethod = coreFunctionClazz.getDeclaredMethod("assertArgCount", intType);
        assertArgCountMethod.setAccessible(true);
        java.lang.Object[] assertArgCountMethodArguments = new java.lang.Object[1];
        assertArgCountMethodArguments[0] = 2;
        assertArgCountMethod.invoke(coreFunction, assertArgCountMethodArguments);
        
        Expression finalCoreFunctionArgs0 = coreFunction.args[0];
        Expression finalCoreFunctionArgs1 = coreFunction.args[1];
        
        assertNull(finalCoreFunctionArgs0);
        
        assertNull(finalCoreFunctionArgs1);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)}
 *  */
    @Test
    public void testAssertArgCount_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgCountMethod = coreFunctionClazz.getDeclaredMethod("assertArgCount", intType);
        assertArgCountMethod.setAccessible(true);
        java.lang.Object[] assertArgCountMethodArguments = new java.lang.Object[1];
        assertArgCountMethodArguments[0] = 0;
        assertArgCountMethod.invoke(coreFunction, assertArgCountMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assertArgCount(int)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgRange(count, count);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgCount_ThrowJXPathInvalidSyntaxException() throws Throwable  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgCountMethod = coreFunctionClazz.getDeclaredMethod("assertArgCount", intType);
        assertArgCountMethod.setAccessible(true);
        java.lang.Object[] assertArgCountMethodArguments = new java.lang.Object[1];
        assertArgCountMethodArguments[0] = 1;
        try {
            assertArgCountMethod.invoke(coreFunction, assertArgCountMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgRange(count, count);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgCount_ThrowJXPathInvalidSyntaxException_1() throws Throwable  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgCountMethod = coreFunctionClazz.getDeclaredMethod("assertArgCount", intType);
        assertArgCountMethod.setAccessible(true);
        java.lang.Object[] assertArgCountMethodArguments = new java.lang.Object[1];
        assertArgCountMethodArguments[0] = -1;
        try {
            assertArgCountMethod.invoke(coreFunction, assertArgCountMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionRound(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionRound(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionRound_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionRound(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionRound(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionRound_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionRound(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionRound(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionRound_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionRound(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionRound(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionRound(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double v = InfoSetUtil.doubleValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionRound_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound(CoreFunction.java:667) */
        coreFunction.functionRound(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method functionFloor(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFloor(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFloor_ThrowJXPathInvalidSyntaxException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionFloor(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFloor(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFloor_ThrowJXPathInvalidSyntaxException_2() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null, null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        coreFunction.functionFloor(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFloor(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} in: assertArgCount(1);
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFloor_ThrowJXPathInvalidSyntaxException_1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        coreFunction.functionFloor(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method functionFloor(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#functionFloor(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgCount(int)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArg1()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double v = InfoSetUtil.doubleValue(getArg1().computeValue(context));
 *  */
    @Test
    public void testFunctionFloor_ThrowNullPointerException() {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {null};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor(CoreFunction.java:655) */
        coreFunction.functionFloor(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgRange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assertArgRange(int, int)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgRange(int,int)}
 * @utbot.executesCondition {@code (ct < min): False}
 * @utbot.executesCondition {@code (ct > max): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#getArgumentCount()}
 *  */
    @Test
    public void testAssertArgRange_CtLessOrEqualMax() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgRangeMethod = coreFunctionClazz.getDeclaredMethod("assertArgRange", intType, intType);
        assertArgRangeMethod.setAccessible(true);
        java.lang.Object[] assertArgRangeMethodArguments = new java.lang.Object[2];
        assertArgRangeMethodArguments[0] = 0;
        assertArgRangeMethodArguments[1] = 0;
        assertArgRangeMethod.invoke(coreFunction, assertArgRangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assertArgRange(int, int)
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgRange(int,int)}
 * @utbot.executesCondition {@code (ct < min): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} when: ct < min || ct > max
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgRange_ThrowJXPathInvalidSyntaxException_2() throws Throwable  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(0, expressionArray);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgRangeMethod = coreFunctionClazz.getDeclaredMethod("assertArgRange", intType, intType);
        assertArgRangeMethod.setAccessible(true);
        java.lang.Object[] assertArgRangeMethodArguments = new java.lang.Object[2];
        assertArgRangeMethodArguments[0] = 1;
        assertArgRangeMethodArguments[1] = -255;
        try {
            assertArgRangeMethod.invoke(coreFunction, assertArgRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgRange(int,int)}
 * @utbot.executesCondition {@code (ct < min): False}
 * @utbot.executesCondition {@code (ct > max): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} when: ct < min || ct > max
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgRange_ThrowJXPathInvalidSyntaxException() throws Throwable  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgRangeMethod = coreFunctionClazz.getDeclaredMethod("assertArgRange", intType, intType);
        assertArgRangeMethod.setAccessible(true);
        java.lang.Object[] assertArgRangeMethodArguments = new java.lang.Object[2];
        assertArgRangeMethodArguments[0] = 0;
        assertArgRangeMethodArguments[1] = -1;
        try {
            assertArgRangeMethod.invoke(coreFunction, assertArgRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoreFunction}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgRange(int,int)}
 * @utbot.executesCondition {@code (ct < min): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidSyntaxException} when: ct < min || ct > max
 *  */
    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgRange_ThrowJXPathInvalidSyntaxException_1() throws Throwable  {
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgRangeMethod = coreFunctionClazz.getDeclaredMethod("assertArgRange", intType, intType);
        assertArgRangeMethod.setAccessible(true);
        java.lang.Object[] assertArgRangeMethodArguments = new java.lang.Object[2];
        assertArgRangeMethodArguments[0] = 1;
        assertArgRangeMethodArguments[1] = -255;
        try {
            assertArgRangeMethod.invoke(coreFunction, assertArgRangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method assertArgRange(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreFunction#assertArgRange(int,int)}
     */
    @Test
    public void testAssertArgRangeWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray = {};
        CoreFunction coreFunction = new CoreFunction(1, expressionArray);
        
        Class coreFunctionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class intType = int.class;
        Method assertArgRangeMethod = coreFunctionClazz.getDeclaredMethod("assertArgRange", intType, intType);
        assertArgRangeMethod.setAccessible(true);
        java.lang.Object[] assertArgRangeMethodArguments = new java.lang.Object[2];
        assertArgRangeMethodArguments[0] = -1073741824;
        assertArgRangeMethodArguments[1] = Integer.MAX_VALUE;
        assertArgRangeMethod.invoke(coreFunction, assertArgRangeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1046646718002700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1046646718002700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1046646718010900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046646718002700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046646718010900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1046646718451000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1046646718451000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1046646718453600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046646718451000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046646718453600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

