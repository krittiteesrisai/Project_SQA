package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeConsumerTest {

    private TestCodeConsumer consumer;

    // Concrete implementation of abstract CodeConsumer for testing
    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();

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

        public String getOutput() {
            return sb.toString();
        }

        public void clear() {
            sb.setLength(0);
            statementNeedsEnded = false;
            statementStarted = false;
            sawFunction = false;
        }
    }

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
    }

    @Test
    public void testBasicUtilitiesAndDefaults() {
        // Test no-op methods and simple getters
        consumer.startSourceMapping(null);
        consumer.endSourceMapping(null);
        assertTrue(consumer.continueProcessing());
        assertFalse(consumer.shouldPreserveExtraBlocks());
        assertFalse(consumer.breakAfterBlockFor(null, false));
        assertTrue(consumer.breakAfterBlockFor(null, true));
        consumer.endFile();
        consumer.endCaseBody();
        consumer.notePreferredLineBreak();
        consumer.endLine();
        consumer.maybeLineBreak();
        consumer.maybeCutLine();
        consumer.startNewLine();
    }

    @Test
    public void testAddIdentifierAndBlocks() {
        consumer.addIdentifier("myVar");
        assertEquals("myVar", consumer.getOutput());

        consumer.clear();
        consumer.appendBlockStart();
        consumer.appendBlockEnd();
        assertEquals("{}", consumer.getOutput());

        consumer.clear();
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals(";{}", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);

        consumer.clear();
        consumer.endBlock(true);
        assertEquals("}", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);

        consumer.clear();
        consumer.endBlock(false);
        assertEquals("}", consumer.getOutput());
    }

    @Test
    public void testListSeparatorAndFunctions() {
        consumer.listSeparator();
        assertEquals(",", consumer.getOutput());

        consumer.clear();
        consumer.endFunction();
        assertTrue(consumer.sawFunction);

        consumer.clear();
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);

        consumer.clear();
        consumer.beginCaseBody();
        assertEquals(":", consumer.getOutput());
    }

    @Test
    public void testEndStatementBranches() {
        // Branch: needSemiColon = true
        consumer.endStatement(true);
        assertEquals(";", consumer.getOutput());

        // Branch: needSemiColon = false, statementStarted = true
        consumer.clear();
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);

        // Branch: needSemiColon = false, statementStarted = false
        consumer.clear();
        consumer.statementStarted = false;
        consumer.endStatement(false);
        assertFalse(consumer.statementNeedsEnded);

        // Default endStatement()
        consumer.clear();
        consumer.statementStarted = true;
        consumer.endStatement();
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testMaybeEndStatement() {
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.getOutput());
        assertTrue(consumer.statementStarted);
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testAddWithEmptyString() {
        consumer.add("");
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddSpacingBetweenWordChars() {
        // First word char
        consumer.add("foo");
        assertEquals("foo", consumer.getOutput());

        // Second word char -> should insert space: "foo bar"
        consumer.add("bar");
        assertEquals("foo bar", consumer.getOutput());

        // Backslash case: c == '\\' and isWordChar(getLastChar())
        consumer.clear();
        consumer.add("a");
        consumer.add("\\");
        assertEquals("a \\", consumer.getOutput());

        // Non-word char combination (no space needed)
        consumer.clear();
        consumer.add("foo");
        consumer.add("+");
        assertEquals("foo+", consumer.getOutput());
    }

    @Test
    public void testAddOpBranches() {
        // Plus/Minus collision: (first == '+' || first == '-') && prev == first
        consumer.add("+");
        consumer.add("+");
        assertEquals("++ ", consumer.getOutput()); // Space added

        consumer.clear();
        consumer.add("-");
        consumer.add("-");
        assertEquals("-- ", consumer.getOutput()); // Space added

        // Letter operator after word char: Character.isLetter(first) && isWordChar(prev)
        consumer.clear();
        consumer.add("foo");
        consumer.addOp("instanceof", false);
        assertEquals("foo instanceof", consumer.getOutput()); // Space added

        // Arrow operator edge case: prev == '-' && first == '>'
        consumer.clear();
        consumer.add("-");
        consumer.addOp(">", false);
        assertEquals("- >", consumer.getOutput()); // Space added to prevent -->

        // binOp = true branch
        consumer.clear();
        consumer.addOp("+", true);
        assertEquals("+", consumer.getOutput());
    }

    @Test
    public void testAddNumberBranches() {
        // Negative number with negative previous char (x < 0 && prev == '-')
        consumer.clear();
        consumer.add("-");
        consumer.addNumber(-5.0);
        assertEquals("- -5", consumer.getOutput());

        // Integer vs Float and Scientific Notation (exp > 2)
        consumer.clear();
        consumer.addNumber(1000.0); // 1000 -> mantissa/exp logic
        assertEquals("1E3", consumer.getOutput());

        consumer.clear();
        consumer.addNumber(50.0); // abs(x) < 100
        assertEquals("50", consumer.getOutput());

        consumer.clear();
        consumer.addNumber(123.45); // Non-integer ((long) x != x)
        assertEquals("123.45", consumer.getOutput());
    }

    @Test
    public void testIsWordChar() {
        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('Z'));
        assertTrue(CodeConsumer.isWordChar('9'));
        assertFalse(CodeConsumer.isWordChar(' '));
        assertFalse(CodeConsumer.isWordChar('+'));
        assertFalse(CodeConsumer.isWordChar(';'));
    }
}