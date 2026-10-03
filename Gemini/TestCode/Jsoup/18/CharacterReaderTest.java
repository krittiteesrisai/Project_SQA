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

        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.consume());
        assertEquals(2, reader.pos());

        reader.unconsume();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.current());

        reader.mark();
        reader.advance();
        reader.advance();
        assertEquals(3, reader.pos());

        reader.rewindToMark();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.current());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("Abc");
        assertEquals("A", reader.consumeAsString());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsumeToCharFound() {
        CharacterReader reader = new CharacterReader("Hello, World!");
        String consumed = reader.consumeTo(',');
        assertEquals("Hello", consumed);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader reader = new CharacterReader("Hello");
        String consumed = reader.consumeTo('x');
        // สังเกตพฤติกรรม consumeToEnd() เดิมใน Jsoup-18 ที่ตัดตัวท้ายออก (-1)
        assertEquals("Hell", consumed);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testConsumeToStringFound() {
        CharacterReader reader = new CharacterReader("<html><body>");
        String consumed = reader.consumeTo("<body");
        assertEquals("<html>", consumed);
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeToStringNotFound() {
        CharacterReader reader = new CharacterReader("<html>");
        String consumed = reader.consumeTo("<head");
        assertEquals("<htm", consumed);
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("hello.world");
        String consumed = reader.consumeToAny('.', '!');
        assertEquals("hello", consumed);
        assertEquals(5, reader.pos());

        // Test when none matches (empty return)
        CharacterReader reader2 = new CharacterReader("helloworld");
        reader2.consumeToDecOrHexIfNeeded(); // dummy advance or skip
        assertEquals("", reader2.consumeToAny('!'));
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader reader = new CharacterReader("12345");
        String end = reader.consumeToEnd();
        // Defects4J Jsoup-18 bug demonstration: input.substring(0, 4) returns "1234" instead of "12345"
        assertEquals("1234", end);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("abc123XYZ");
        assertEquals("abc", reader.consumeLetterSequence());
        assertEquals(3, reader.pos());
        
        // Non-letter at current pos
        assertEquals("", reader.consumeLetterSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("0x1A2b3g");
        reader.consume(); // '0'
        reader.consume(); // 'x'
        assertEquals("1A2b3", reader.consumeHexSequence());
        assertEquals(7, reader.pos());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("456abc");
        assertEquals("456", reader.consumeDigitSequence());
        assertEquals(3, reader.pos());
        assertEquals("", reader.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("A");
        assertTrue(reader.matches('A'));
        assertFalse(reader.matches('B'));

        // Empty reader check
        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matches('A'));
    }

    @Test
    public void testMatchesString() {
        CharacterReader reader = new CharacterReader("HelloWorld");
        assertTrue(reader.matches("Hello"));
        assertFalse(reader.matches("world"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("HelloWorld");
        assertTrue(reader.matchesIgnoreCase("helloworld"));
        assertFalse(reader.matchesIgnoreCase("foo"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("XYZ");
        assertTrue(reader.matchesAny('A', 'X', 'Z'));
        assertFalse(reader.matchesAny('B', 'C'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('X'));
    }

    @Test
    public void testMatchesLetterAndDigit() {
        CharacterReader reader = new CharacterReader("A5!");
        assertTrue(reader.matchesLetter());
        assertFalse(reader.matchesDigit());

        reader.advance();
        assertFalse(reader.matchesLetter());
        assertTrue(reader.matchesDigit());

        reader.advance();
        assertFalse(reader.matchesLetter());
        assertFalse(reader.matchesDigit());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesLetter());
        assertFalse(emptyReader.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("JavaTest");
        assertTrue(reader.matchConsume("Java"));
        assertEquals(4, reader.pos());
        assertFalse(reader.matchConsume("Python"));
        assertEquals(4, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("JavaTest");
        assertTrue(reader.matchConsumeIgnoreCase("java"));
        assertEquals(4, reader.pos());
        assertFalse(reader.matchConsumeIgnoreCase("python"));
        assertEquals(4, reader.pos());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("<div>Hello World</TITLE></div>");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</DIV>"));
        assertFalse(reader.containsIgnoreCase("missing"));
    }

    @Test
    public void testToStringMethod() {
        CharacterReader reader = new CharacterReader("JsoupParser");
        reader.consume();
        reader.consume();
        assertEquals("oupParser", reader.toString());
    }
}