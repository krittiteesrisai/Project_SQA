package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeConsumerTest {

    private TestCodeConsumer consumer;

    // Concrete implementation for testing abstract class CodeConsumer
    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();
        private boolean lineBreakCalled = false;
        private boolean cutLineCalled = false;
        private boolean endLineCalled = false;

        @Override
        char getLastChar() {
            if (sb.length() == 0) {
                return '\0';
            }
            return sb.charAt(sb.length() - 1);
        }

        @Override
        void append(String str) {
            sb.append(str);
        }

        @Override
        void startNewLine() {
            lineBreakCalled = true;
        }

        @Override
        void maybeLineBreak() {
            lineBreakCalled = true;
        }

        @Override
        void maybeCutLine() {
            cutLineCalled = true;
        }

        @Override
        void endLine() {
            endLineCalled = true;
        }

        public String getOutput() {
            return sb.toString();
        }

        public void resetFlags() {
            lineBreakCalled = false;
            cutLineCalled = false;
            endLineCalled = false;
        }
    }

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
    }

    @Test
    public void testContinueProcessingAndSourceMapping() {
        assertTrue(consumer.continueProcessing());
        // Dummy calls for coverage of no-op methods
        consumer.startSourceMapping(null);
        consumer.endSourceMapping(null);
        consumer.startNewLine();
        consumer.maybeLineBreak();
        consumer.maybeCutLine();
        consumer.endLine();
        consumer.notePreferredLineBreak();
        consumer.endFile();
        assertFalse(consumer.shouldPreserveExtraBlocks());
        assertFalse(consumer.breakAfterBlockFor(null, false));
        assertTrue(consumer.breakAfterBlockFor(null, true));
    }

    @Test
    public void testIdentifiersAndBlocks() {
        consumer.addIdentifier("myVar");
        assertEquals("myVar", consumer.getOutput());

        consumer.appendBlockStart();
        consumer.appendBlockEnd();
        assertEquals("myVar{}", consumer.getOutput());

        // beginBlock with statementNeedsEnded = true
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals("myVar{};{", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);

        // endBlock with shouldEndLine = true
        consumer.endBlock(true);
        assertEquals("myVar{};{};", consumer.getOutput()); // endLine sets flag in our spy
        assertTrue(consumer.endLineCalled);

        // endBlock default (false)
        consumer.endBlock();
        assertEquals("myVar{};{};{}", consumer.getOutput());
    }

    @Test
    public void testListSeparatorAndCaseBody() {
        consumer.listSeparator();
        assertEquals(",", consumer.getOutput());

        consumer.beginCaseBody();
        consumer.endCaseBody();
        assertEquals(",:", consumer.getOutput());
    }

    @Test
    public void testEndStatementBranches() {
        // needSemiColon = true
        consumer.endStatement(true);
        assertEquals(";", consumer.getOutput());

        // needSemiColon = false, statementStarted = true -> statementNeedsEnded = true
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);

        // default endStatement() -> endStatement(false)
        consumer.statementNeedsEnded = false;
        consumer.statementStarted = false;
        consumer.endStatement();
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testMaybeEndStatement() {
        consumer.statementNeedsEnded = true;
        consumer.statementStarted = false;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.getOutput());
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunction() {
        consumer.endFunction(false);
        assertTrue(consumer.sawFunction);
        assertFalse(consumer.endLineCalled);

        consumer.endFunction(true);
        assertTrue(consumer.endLineCalled);

        consumer.endFunction(); // calls endFunction(false)
    }

    @Test
    public void testAddEdgeCasesAndSpacing() {
        // Empty string code
        consumer.add("");
        assertEquals("", consumer.getOutput());

        // Word char + Word char -> adds space
        consumer.add("foo");
        consumer.add("bar");
        assertEquals("foo bar", consumer.getOutput());

        // Backslash word char handling
        consumer.add("\\");
        consumer.add("x");
        // '\' and 'x' are word chars
        assertEquals("foo bar\\ x", consumer.getOutput());

        // Slash after slash (DIV prevention)
        consumer = new TestCodeConsumer();
        consumer.append("/");
        consumer.add("/");
        assertEquals("/ /", consumer.getOutput());
    }

    @Test
    public void testAddOpBranches() {
        // '+' or '-' with same prev char
        consumer.append("+");
        consumer.addOp("+", false);
        assertEquals("++ ", consumer.getOutput());

        consumer = new TestCodeConsumer();
        consumer.append("-");
        consumer.addOp("-", false);
        assertEquals("-- ", consumer.getOutput());

        // Letter op after word char (e.g., typeof, instanceof)
        consumer = new TestCodeConsumer();
        consumer.add("foo");
        consumer.addOp("typeof", false);
        assertEquals("foo typeof", consumer.getOutput());

        // Arrow operator prevention "-->"
        consumer = new TestCodeConsumer();
        consumer.append("-");
        consumer.addOp(">", false);
        assertEquals("-> ", consumer.getOutput());

        // Binary operator triggers cut line
        consumer = new TestCodeConsumer();
        consumer.addOp("+", true);
        assertTrue(consumer.cutLineCalled);
    }

    @Test
    public void testAddNumberBranches() {
        // Negative number when prev is '-'
        consumer.append("-");
        consumer.addNumber(-5.0);
        assertEquals("- -5", consumer.getOutput());

        // Negative zero
        consumer = new TestCodeConsumer();
        consumer.addNumber(-0.0);
        assertEquals("-0.0", consumer.getOutput()); // handled as non-integer or special check

        // Integer with scientific notation (mantissa / 10 * Math.pow(10, exp + 1) == value, exp > 2)
        consumer = new TestCodeConsumer();
        consumer.addNumber(12000.0);
        assertEquals("12E3", consumer.getOutput());

        // Normal integer
        consumer = new TestCodeConsumer();
        consumer.addNumber(42.0);
        assertEquals("42", consumer.getOutput());

        // Non-integer double
        consumer = new TestCodeConsumer();
        consumer.addNumber(3.14);
        assertEquals("3.14", consumer.getOutput());
    }

    @Test
    public void testStaticHelpers() {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
        assertFalse(CodeConsumer.isNegativeZero(0.0));
        assertFalse(CodeConsumer.isNegativeZero(5.0));

        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('5'));
        assertFalse(CodeConsumer.isWordChar('+'));
    }

    @Test
    public void appendOpDirect() {
        consumer.appendOp("op", false);
        assertEquals("op", consumer.getOutput());
    }
}