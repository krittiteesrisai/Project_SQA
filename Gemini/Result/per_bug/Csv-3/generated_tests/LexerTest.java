package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class LexerTest {

    // Helper concrete subclass for testing abstract Lexer
    private static class ConcreteLexer extends Lexer {
        ConcreteLexer(CSVFormat format, ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(Token reusableToken) throws IOException {
            return null; // Not used for direct helper tests
        }
    }

    private ConcreteLexer createLexer(CSVFormat format, String content) {
        return new ConcreteLexer(format, new ExtendedBufferedReader(new StringReader(content)));
    }

    @Test
    public void testConstructorWithNullFormattingChars() {
        // Test mapNullToDisabled branches where escape, quote, and comment are null
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape(null)
                .withQuoteChar(null)
                .withCommentStart(null);
        ConcreteLexer lexer = createLexer(format, "");
        
        assertTrue(lexer.isEscape('x')); // should match DISABLED
        assertTrue(lexer.isQuoteChar('x'));
        assertTrue(lexer.isCommentStart('x'));
    }

    @Test
    public void testGetLineNumber() throws IOException {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "line1\nline2");
        assertEquals(0, lexer.getLineNumber());
        lexer.in.readLine();
        assertEquals(1, lexer.getLineNumber());
    }

    @Test
    public void testReadEscapeCharacters() throws IOException {
        // Testing all switch cases in readEscape()
        // 'r' -> CR, 'n' -> LF, 't' -> TAB, 'b' -> BACKSPACE, 'f' -> FF
        // CR, LF, FF, TAB, BACKSPACE -> themselves
        // default -> c
        String input = "rntbf\r\n\f\t\u0008x";
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, input);

        assertEquals(Constants.CR, lexer.readEscape());
        assertEquals(Constants.LF, lexer.readEscape());
        assertEquals(Constants.TAB, lexer.readEscape());
        assertEquals(Constants.BACKSPACE, lexer.readEscape());
        assertEquals(Constants.FF, lexer.readEscape());
        assertEquals(Constants.CR, lexer.readEscape());
        assertEquals(Constants.LF, lexer.readEscape());
        assertEquals(Constants.FF, lexer.readEscape());
        assertEquals(Constants.TAB, lexer.readEscape());
        assertEquals(Constants.BACKSPACE, lexer.readEscape());
        assertEquals('x', lexer.readEscape()); // default branch
    }

    @Test(expected = IOException.class)
    public void testReadEscapeEOF() throws IOException {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "");
        lexer.readEscape(); // Should throw IOException for END_OF_STREAM
    }

    @Test
    public void testTrimTrailingSpaces() {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "");

        // Empty buffer
        StringBuilder sb1 = new StringBuilder("");
        lexer.trimTrailingSpaces(sb1);
        assertEquals("", sb1.toString());

        // No trailing spaces
        StringBuilder sb2 = new StringBuilder("abc");
        lexer.trimTrailingSpaces(sb2);
        assertEquals("abc", sb2.toString());

        // With trailing spaces
        StringBuilder sb3 = new StringBuilder("abc   ");
        lexer.trimTrailingSpaces(sb3);
        assertEquals("abc", sb3.toString());

        // Only spaces
        StringBuilder sb4 = new StringBuilder("   ");
        lexer.trimTrailingSpaces(sb4);
        assertEquals("", sb4.toString());
    }

    @Test
    public void testReadEndOfLine() throws IOException {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "\n");

        // \r followed by \n
        ConcreteLexer lexerCRLF = createLexer(CSVFormat.DEFAULT, "\n");
        assertTrue(lexerCRLF.readEndOfLine(Constants.CR));

        // Just LF
        assertTrue(lexer.readEndOfLine(Constants.LF));

        // Just CR without lookahead LF
        ConcreteLexer lexerCR = createLexer(CSVFormat.DEFAULT, "a");
        assertTrue(lexerCR.readEndOfLine(Constants.CR));

        // Neither CR nor LF
        assertFalse(lexer.readEndOfLine('a'));
    }

    @Test
    public void testIsWhitespace() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        ConcreteLexer lexer = createLexer(format, "");

        assertTrue(lexer.isWhitespace(' '));
        assertTrue(lexer.isWhitespace('\t'));
        // Whitespace character that is equal to delimiter
        assertFalse(lexer.isWhitespace(','));
        // Non-whitespace
        assertFalse(lexer.isWhitespace('a'));
    }

    @Test
    public void testIsStartOfLine() {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "");

        assertTrue(lexer.isStartOfLine(Constants.LF));
        assertTrue(lexer.isStartOfLine(Constants.CR));
        assertTrue(lexer.isStartOfLine(Constants.UNDEFINED));
        assertFalse(lexer.isStartOfLine('a'));
    }

    @Test
    public void testIsEndOfFile() {
        ConcreteLexer lexer = createLexer(CSVFormat.DEFAULT, "");

        assertTrue(lexer.isEndOfFile(Constants.END_OF_STREAM));
        assertFalse(lexer.isEndOfFile('a'));
    }

    @Test
    public void testUtilityCheckers() {
        CSVFormat format = CSVFormat.DEFAULT
                .withDelimiter(',')
                .withEscape('\\')
                .withQuoteChar('"')
                .withCommentStart('#');
        ConcreteLexer lexer = createLexer(format, "");

        assertTrue(lexer.isDelimiter(','));
        assertFalse(lexer.isDelimiter('a'));

        assertTrue(lexer.isEscape('\\'));
        assertFalse(lexer.isEscape('a'));

        assertTrue(lexer.isQuoteChar('"'));
        assertFalse(lexer.isQuoteChar('a'));

        assertTrue(lexer.isCommentStart('#'));
        assertFalse(lexer.isCommentStart('a'));
    }
}