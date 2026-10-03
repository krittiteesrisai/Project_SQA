import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeConsumerTest {

    private StringBuilder sb;
    private CodeConsumer consumer;

    @Before
    public void setUp() {
        sb = new StringBuilder();
        consumer = new CodeConsumer() {
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
        };
    }

    @Test
    public void testContinueProcessingAndDefaults() {
        assertTrue(consumer.continueProcessing());
        assertFalse(consumer.shouldPreserveExtraBlocks());
        assertFalse(consumer.breakAfterBlockFor(null, false));
        assertTrue(consumer.breakAfterBlockFor(null, true));
        
        consumer.startSourceMapping(null);
        consumer.endSourceMapping(null);
        consumer.startNewLine();
        consumer.maybeLineBreak();
        consumer.maybeCutLine();
        consumer.endLine();
        consumer.notePreferredLineBreak();
        consumer.endCaseBody();
        consumer.appendOp("+", false);
        consumer.endFile();
    }

    @Test
    public void testBeginBlockWithStatementNeedsEnded() {
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals("{", sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testBeginBlockWithoutStatementNeedsEnded() {
        consumer.statementNeedsEnded = false;
        consumer.beginBlock();
        assertEquals("{", sb.toString());
    }

    @Test
    public void testEndBlockOverloads() {
        consumer.endBlock();
        assertEquals("}", sb.toString());

        sb.setLength(0);
        consumer.endBlock(true);
        assertEquals("}", sb.toString());
    }

    @Test
    public void testEndStatementBranches() {
        // Branch: needSemiColon = true
        consumer.endStatement(true);
        assertEquals(";", sb.toString());
        assertFalse(consumer.statementNeedsEnded);

        // Branch: needSemiColon = false, statementStarted = true
        sb.setLength(0);
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);

        // Branch: needSemiColon = false, statementStarted = false
        consumer.statementStarted = false;
        consumer.statementNeedsEnded = false;
        consumer.endStatement(false);
        assertFalse(consumer.statementNeedsEnded);
        
        // Test no-arg endStatement()
        consumer.endStatement();
    }

    @Test
    public void testMaybeEndStatement() {
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", sb.toString());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);

        sb.setLength(0);
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", sb.toString());
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunctionBranches() {
        consumer.endFunction();
        assertTrue(consumer.sawFunction);

        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testCaseBody() {
        consumer.beginCaseBody();
        assertEquals(":", sb.toString());
    }

    @Test
    public void testAddIdentifierAndListSeparator() {
        consumer.addIdentifier("myVar");
        assertEquals("myVar", sb.toString());

        sb.setLength(0);
        consumer.listSeparator();
        assertEquals(",", sb.toString());
    }

    @Test
    public void testAddEmptyString() {
        consumer.add("");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAddWordCharSpacing() {
        consumer.add("return");
        consumer.add("foo");
        assertEquals("return foo", sb.toString());

        sb.setLength(0);
        consumer.add("a\\");
        consumer.add("b");
        assertEquals("a\\ b", sb.toString());

        sb.setLength(0);
        consumer.add("1");
        consumer.add("2");
        assertEquals("12", sb.toString()); // Not both word chars in a way that triggers space if not letters/backslash
    }

    @Test
    public void testAddOpRules() {
        // Plus/Minus collision: x + ++y
        consumer.add("+");
        consumer.addOp("+", false);
        assertEquals("++", sb.toString());

        sb.setLength(0);
        consumer.add("-");
        consumer.addOp("-", false);
        assertEquals("--", sb.toString()); // triggers space since prev == first ('-' and '-')

        sb.setLength(0);
        consumer.add("typeof");
        consumer.addOp("instanceof", true);
        assertEquals("typeof instanceof", sb.toString()); // Letter after word char

        sb.setLength(0);
        consumer.add("-");
        consumer.addOp(">", true);
        assertEquals("- >", sb.toString()); // prevent -->
    }

    @Test
    public void testAddNumberEdgeCases() {
        // Negative number after minus: x- -4
        consumer.add("-");
        consumer.addNumber(-4.0);
        assertEquals("- -4", sb.toString());

        // Integer scientific notation loop: >= 100 with mantissa division
        sb.setLength(0);
        consumer.addNumber(1200.0);
        assertEquals("12E2", sb.toString());

        // Normal integer
        sb.setLength(0);
        consumer.addNumber(42.0);
        assertEquals("42", sb.toString());

        // Non-integer / float
        sb.setLength(0);
        consumer.addNumber(3.14);
        assertEquals("3.14", sb.toString());
    }

    @Test
    public void testIsNegativeZero() {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
        assertFalse(CodeConsumer.isNegativeZero(0.0));
        assertFalse(CodeConsumer.isNegativeZero(5.0));
    }

    @Test
    public void testIsWordChar() {
        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('9'));
        assertFalse(CodeConsumer.isWordChar('+'));
        assertFalse(CodeConsumer.isWordChar(' '));
    }
}