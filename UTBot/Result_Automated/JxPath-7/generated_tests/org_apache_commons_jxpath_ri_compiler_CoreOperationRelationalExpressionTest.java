package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationRelationalExpressionTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.isSymmetric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSymmetric()
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#isSymmetric()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSymmetric_ReturnFalse() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        boolean actual = coreOperationLessThan.isSymmetric();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.getPrecedence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrecedence()
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#getPrecedence()}
 * @utbot.returnsFrom {@code return 3;}
 *  */
    @Test
    public void testGetPrecedence_Return3() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        int actual = coreOperationLessThan.getPrecedence();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getPrecedence()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#getPrecedence()}
     */
    @Test(timeout = 1000L)
    public void testGetPrecedence() {
        Constant constant = new Constant(((Number) null));
        VariableReference variableReference = new VariableReference(null);
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(constant, variableReference);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        coreOperationLessThan.getPrecedence();
    }
    ///endregion
    
    ///endregion
}

