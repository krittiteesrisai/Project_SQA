package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationNotEqualTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.computeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreOperationNotEqual}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: equal(context, args[0], args[1])
 *  */
    @Test
    public void testComputeValue_ThrowNullPointerException() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60)
            org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.computeValue(CoreOperationNotEqual.java:32) */
        coreOperationNotEqual.computeValue(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testComputeValueThrowsNPE() {
        QName qName = new QName("\n\t\r", "#$\\\"'");
        VariableReference variableReference = new VariableReference(qName);
        QName qName1 = new QName("");
        VariableReference variableReference1 = new VariableReference(qName1);
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(variableReference, variableReference1);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        ancestorContext.setPosition(Integer.MIN_VALUE);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Integer.MIN_VALUE);
        ParentContext parentContext = new ParentContext(ancestorContext, nodeTypeTest);
        parentContext.setPosition(1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.VariableReference.computeValue(VariableReference.java:60)
            org.apache.commons.jxpath.ri.compiler.VariableReference.compute(VariableReference.java:53)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60)
            org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.computeValue(CoreOperationNotEqual.java:32) */
        coreOperationNotEqual.computeValue(parentContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual.getSymbol
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSymbol()
    
    /**
    @utbot.classUnderTest {@link CoreOperationNotEqual}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual#getSymbol()}
 * @utbot.returnsFrom {@code return "!=";}
 *  */
    @Test
    public void testGetSymbol_Return() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        
        String actual = coreOperationNotEqual.getSymbol();
        
        String expected = "!=";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
}

