package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullInput() {
        new CharacterReader(null);
    }

    @Test
    public void testBasicNavigationAndState() {
        CharacterReader reader = new CharacterReader("Test");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
        assertEquals('T', reader.current());

        // consume()
        assertEquals('T', reader.consume());
        assertEquals(1, reader.pos());

        // advance()
        reader.advance();
        assertEquals(2, reader.pos());
        assertEquals('s', reader.current());

        // unconsume()
        reader.unconsume();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.current());

        // mark and rewind
        reader.mark();
        assertEquals('e', reader.consume());
        assertEquals('t', reader.consume());
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());

        reader.rewindToMark();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.current());

        assertEquals("et", reader.toString());
    }

    @Test
    public void testNextIndexOfChar() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals(1, reader.nextIndexOf('e'));
        assertEquals(4, reader.nextIndexOf('o'));
        assertEquals(-1, reader.nextIndexOf('z'));

        reader.consumeAsString(); // pos = 1 ('e')
        assertEquals(3, reader.nextIndexOf('o')); // next 'o' from pos 1
    }

    @Test
    public void testNextIndexOfCharSequence() {
        CharacterReader reader = new CharacterReader("abcdefg abcdefg");
        assertEquals(3, reader.nextIndexOf("def"));
        assertEquals(-1, reader.nextIndexOf("xyz"));

        // Test when startChar does not match initially, entering while loop
        CharacterReader reader2 = new CharacterReader("xxabcdefg");
        assertEquals(2, reader2.nextIndexOf("abc"));

        // Test seq longer than remaining
        CharacterReader reader3 = new CharacterReader("abc");
        assertEquals(-1, reader3.nextIndexOf("abcd"));
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("name=value");
        assertEquals("name", reader.consumeTo('='));
        assertEquals('=', reader.consume());
        assertEquals("value", reader.consumeTo('?')); // Not found -> consumeToEnd
    }

    @Test
    public void testConsumeToStringSeq() {
        CharacterReader reader = new CharacterReader("start--end");
        assertEquals("start", reader.consumeTo("--"));
        assertEquals("--", reader.consumeToAsString() + reader.consumeToAsString());
        assertEquals("end", reader.consumeTo("missing")); // Not found -> consumeToEnd
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("hello, world;test");
        assertEquals("hello", reader.consumeToAny(',', ';', ' '));
        assertEquals(',', reader.consume());
        assertEquals(" world", reader.consumeToAny(';'));
        
        // Test when none matches until end
        CharacterReader reader2 = new CharacterReader("abc");
        assertEquals("abc", reader2.consumeToAny('z'));
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("AbCdEf123XYZ");
        assertEquals("AbCdEf", reader.consumeLetterSequence());
        assertEquals("", reader.consumeLetterSequence()); // non-letter at current pos ('1')
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("Tag123End");
        assertEquals("Tag123", reader.consumeLetterThenDigitSequence());
        
        CharacterReader reader2 = new CharacterReader("123OnlyDigits");
        assertEquals("", reader2.consumeLetterThenDigitSequence());
        assertEquals("123", reader2.consumeDigitSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("1aF9x0");
        assertEquals("1aF9", reader.consumeHexSequence());
        assertEquals("", reader.consumeHexSequence()); // 'x' is not hex
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("45678abc");
        assertEquals("45678", reader.consumeDigitSequence());
        assertEquals("", reader.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("A");
        assertTrue(reader.matches('A'));
        assertFalse(reader.matches('B'));

        // Empty reader
        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matches('A'));
    }

    @Test
    public void testMatchesStringSeq() {
        CharacterReader reader = new CharacterReader("Hello World");
        assertTrue(reader.matches("Hello"));
        assertFalse(reader.matches("World"));
        assertFalse(reader.matches("Hello World Too Long")); // scanLength > length - pos
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("HtmlTag");
        assertTrue(reader.matchesIgnoreCase("html"));
        assertTrue(reader.matchesIgnoreCase("HTMLTAG"));
        assertFalse(reader.matchesIgnoreCase("body"));
        assertFalse(reader.matchesIgnoreCase("HtmlTagLonger"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("xyz");
        assertTrue(reader.matchesAny('a', 'x', 'z'));
        assertFalse(reader.matchesAny('b', 'c'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('x'));
    }

    @Test
    public void testMatchesLetterAndDigit() {
        CharacterReader readerLetter = new CharacterReader("Z9");
        assertTrue(readerLetter.matchesLetter());
        assertFalse(readerLetter.matchesDigit());

        readerLetter.advance(); // now at '9'
        assertFalse(readerLetter.matchesLetter());
        assertTrue(readerLetter.matchesDigit());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesLetter());
        assertFalse(emptyReader.matchesDigit());
    }

    @Test
    public void testMatchConsumeAndIgnoreCase() {
        CharacterReader reader = new CharacterReader("<span>");
        assertTrue(reader.matchConsume("<SPAN>")); // false due to case sensitivity
        assertEquals(0, reader.pos());

        assertTrue(reader.matchConsumeIgnoreCase("<SPAN>"));
        assertEquals(6, reader.pos());

        CharacterReader reader2 = new CharacterReader("<div>");
        assertTrue(reader2.matchConsume("<div>"));
        assertEquals(5, reader2.pos());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Test </TITLE> String");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("</style>"));
    }
}