package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationLessThanOrEqualTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.computeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreOperationLessThanOrEqual}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double l = org.apache.commons.jxpath.ri.InfoSetUtil.doubleValue(args[0].computeValue(context));
 *  */
    @Test
    public void testComputeValue_ThrowNullPointerException() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.computeValue(CoreOperationLessThanOrEqual.java:33) */
        coreOperationLessThanOrEqual.computeValue(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testComputeValueThrowsNPE() {
        QName qName = new QName("\n\t\r", "#$\\\"'");
        VariableReference variableReference = new VariableReference(qName);
        QName qName1 = new QName("");
        VariableReference variableReference1 = new VariableReference(qName1);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(variableReference, variableReference1);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        ancestorContext.setPosition(0);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(-2147483647);
        ParentContext parentContext = new ParentContext(ancestorContext, nodeTypeTest);
        parentContext.setPosition(Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.EvalContext.getRootContext(EvalContext.java:250)
            org.apache.commons.jxpath.ri.compiler.VariableReference.computeValue(VariableReference.java:60)
            org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.computeValue(CoreOperationLessThanOrEqual.java:33) */
        coreOperationLessThanOrEqual.computeValue(parentContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual.getSymbol
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSymbol()
    
    /**
    @utbot.classUnderTest {@link CoreOperationLessThanOrEqual}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual#getSymbol()}
 * @utbot.returnsFrom {@code return "<=";}
 *  */
    @Test
    public void testGetSymbol_Return() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        String actual = coreOperationLessThanOrEqual.getSymbol();
        
        String expected = "<=";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
}

