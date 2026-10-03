package org.apache.commons.jxpath.ri.compiler;

import junit.framework.TestCase;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.RIUtil;

import java.util.Locale;

public class CoreFunctionTest extends TestCase {

    private JXPathContext jxpathContext;
    private EvalContext evalContext;

    public CoreFunctionTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
        // สร้าง Context พื้นฐานสำหรับการทดสอบ
        jxpathContext = JXPathContext.newContext(new TestBean("root"));
        RootContext rootContext = new RootContext(jxpathContext, new BeanPointer(null, jxpathContext.getContextPointer().getName(), jxpathContext.getContextBean(), Locale.getDefault()));
        evalContext = new InitialContext(rootContext);
    }

    public void testGetFunctionNameAndCode() {
        CoreFunction cfLast = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals(Compiler.FUNCTION_LAST, cfLast.getFunctionCode());
        assertEquals("last", cfLast.getFunctionName());

        // ทดสอบ Unknown function branch
        CoreFunction cfUnknown = new CoreFunction(9999, null);
        assertEquals("unknownFunction9999()", cfUnknown.getFunctionName());
    }

    public void testComputeContextDependent() {
        // FUNCTION_LAST
        CoreFunction cfLast = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertTrue(cfLast.computeContextDependent());

        // FUNCTION_BOOLEAN with args == null
        CoreFunction cfBooleanNull = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertTrue(cfBooleanNull.computeContextDependent());

        // FUNCTION_BOOLEAN with args present
        Expression[] args = new Expression[] { new Constant("test") };
        CoreFunction cfBooleanArgs = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        assertFalse(cfBooleanArgs.computeContextDependent());

        // FUNCTION_FORMAT_NUMBER with 2 args
        CoreFunction cfFormat = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { new Constant(1), new Constant("0") });
        assertTrue(cfFormat.computeContextDependent());
    }

    public void testArgumentGettersAndCount() {
        Constant c1 = new Constant("1");
        Constant c2 = new Constant("2");
        Constant c3 = new Constant("3");
        Expression[] args = new Expression[] { c1, c2, c3 };
        
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        assertEquals(3, cf.getArgumentCount());
        assertEquals(c1, cf.getArg1());
        assertEquals(c2, cf.getArg2());
        assertEquals(c3, cf.getArg3());

        CoreFunction cfNullArgs = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(0, cfNullArgs.getArgumentCount());
    }

    public void testToStringRepresentation() {
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true()", cf.toString());

        CoreFunction cfConcat = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] { new Constant("a"), new Constant("b") });
        assertEquals("concat(a, b)", cfConcat.toString());
    }

    public void testFunctionTrueFalseNull() {
        CoreFunction cfTrue = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(Boolean.TRUE, cfTrue.computeValue(evalContext));

        CoreFunction cfFalse = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        assertEquals(Boolean.FALSE, cfFalse.computeValue(evalContext));

        CoreFunction cfNull = new CoreFunction(Compiler.FUNCTION_NULL, null);
        assertNull(cfNull.computeValue(evalContext));
    }

    public void testFunctionSubstringEdgeCases() {
        // Substring with 2 arguments: substring("12345", 2) -> "2345"
        CoreFunction cf2 = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("12345"), new Constant(new Double(2)) });
        assertEquals("2345", cf2.computeValue(evalContext));

        // Substring with from < 1: substring("12345", -1) -> from becomes 1 -> "12345"
        CoreFunction cfNegFrom = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("12345"), new Constant(new Double(-1)) });
        assertEquals("12345", cfNegFrom.computeValue(evalContext));

        // Substring with NaN: substring("12345", NaN) -> ""
        CoreFunction cfNaN = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("12345"), new Constant(new Double(Double.NaN)) });
        assertEquals("", cfNaN.computeValue(evalContext));

        // Substring with from > length + 1: substring("123", 10) -> ""
        CoreFunction cfOutOfBounds = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("123"), new Constant(new Double(10)) });
        assertEquals("", cfOutOfBounds.computeValue(evalContext));

        // Substring with 3 arguments and negative length: substring("12345", 2, -1) -> ""
        CoreFunction cfNegLen = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("12345"), new Constant(new Double(2)), new Constant(new Double(-1)) });
        assertEquals("", cfNegLen.computeValue(evalContext));

        // Substring with 3 arguments normal: substring("12345", 2, 2) -> "23"
        CoreFunction cf3Args = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new Constant("12345"), new Constant(new Double(2)), new Constant(new Double(2)) });
        assertEquals("23", cf3Args.computeValue(evalContext));
    }

    public void testFunctionNormalizeSpace() {
        // Test various whitespace characters (0x20, 0x9, 0xD, 0xA) and phase transitions
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[] { new Constant("  hello \t\r\n world  ") });
        assertEquals("hello world", cf.computeValue(evalContext));
    }

    public void testFunctionSumInvalidType() {
        // Passing non-eval context / non-null invalid argument to sum() should throw JXPathException
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[] { new Constant("invalid") });
        try {
            cf.computeValue(evalContext);
            fail("Expected JXPathException for invalid sum argument type");
        } catch (JXPathException e) {
            // Expected
        }
    }

    public void testFunctionConcatInvalidArgCount() {
        // Concat requires at least 2 arguments
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] { new Constant("onlyOne") });
        try {
            cf.computeValue(evalContext);
            fail("Expected JXPathInvalidSyntaxException for concat with 1 argument");
        } catch (JXPathInvalidSyntaxException e) {
            // Expected
        }
    }

    public static class TestBean {
        private String name;
        public TestBean(String name) { this.name = name; }
        public String getName() { return name; }
    }
}