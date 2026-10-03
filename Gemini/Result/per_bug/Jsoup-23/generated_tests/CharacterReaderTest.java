package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullInput() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructorAndCarriageReturnNormalization() {
        CharacterReader reader = new CharacterReader("a\r\nb\rc\n");
        assertEquals("a\nb\nc\n", reader.toString());
        assertEquals(4, reader.toString().length());
    }

    @Test
    public void testBasicNavigationAndState() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.isEmpty());
        assertEquals(0, reader.pos());

        assertEquals('a', reader.current());
        assertEquals(0, reader.pos());

        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());

        reader.advance();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());

        reader.unconsume();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());

        reader.mark();
        reader.consume();
        assertEquals('c', reader.current());
        reader.rewindToMark();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test
    public void testEofBehaviors() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());

        CharacterReader reader2 = new CharacterReader("a");
        reader2.consume();
        assertTrue(reader2.isEmpty());
        assertEquals(CharacterReader.EOF, reader2.current());
        assertEquals(CharacterReader.EOF, reader2.consume());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("abc");
        String s = reader.consumeAsString();
        assertEquals("a", s);
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsumeToCharFoundAndNotFound() {
        CharacterReader reader = new CharacterReader("a-b-c");
        String consumed = reader.consumeTo('-');
        assertEquals("a", consumed);
        assertEquals(1, reader.pos());

        // Not found -> consumeToEnd
        CharacterReader reader2 = new CharacterReader("abc");
        String consumed2 = reader2.consumeTo('z');
        assertEquals("abc", consumed2);
        assertTrue(reader2.isEmpty());
    }

    @Test
    public void testConsumeToStringFoundAndNotFound() {
        CharacterReader reader = new CharacterReader("a/b/c");
        String consumed = reader.consumeTo("/b");
        assertEquals("a", consumed);
        
        CharacterReader reader2 = new CharacterReader("abc");
        String consumed2 = reader2.consumeTo("xyz");
        assertEquals("abc", consumed2);
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("hello world");
        String consumed = reader.consumeToAny('o', ' ');
        assertEquals("hell", consumed);

        // NotFound case
        CharacterReader reader2 = new CharacterReader("abcdef");
        String consumed2 = reader2.consumeToAny('z', 'y');
        assertEquals("abcdef", consumed2);
    }

    @Test
    public void testConsumeSequences() {
        CharacterReader reader = new CharacterReader("AbC123_456aF");
        assertEquals("AbC", reader.consumeLetterSequence());
        assertEquals("123", reader.consumeDigitSequence());
        assertEquals("_", reader.consumeAsString()); // Non-matching single char
        assertEquals("456", reader.consumeDigitSequence());
        assertEquals("aF", reader.consumeHexSequence());
    }

    @Test
    public void testMatchesAndMatchConsume() {
        CharacterReader reader = new CharacterReader("TestString");
        assertTrue(reader.matches('T'));
        assertFalse(reader.matches('e'));
        assertTrue(reader.matches("Test"));
        assertFalse(reader.matches("test"));

        assertTrue(reader.matchesIgnoreCase("teststring"));
        
        assertTrue(reader.matchConsume("Tes"));
        assertEquals('t', reader.current());

        assertTrue(reader.matchConsumeIgnoreCase("tst")); // doesn't match
        assertFalse(reader.matchConsumeIgnoreCase("tSt")); 
        assertTrue(reader.matchConsumeIgnoreCase("tStS"));
    }

    @Test
    public void testMatchesAnyAndLetterDigitEdges() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a'));
        assertFalse(reader.matchesLetter());
        assertFalse(reader.matchesDigit());

        CharacterReader reader2 = new CharacterReader("A9-");
        assertTrue(reader2.matchesAny('B', 'A'));
        assertTrue(reader2.matchesLetter());
        assertFalse(reader2.matchesDigit());

        reader2.consume();
        assertTrue(reader2.matchesDigit());
        assertFalse(reader2.matchesLetter());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello </TITLE> World");
        assertTrue(reader.containsIgnoreCase("</title>"));
        
        CharacterReader readerEmpty = new CharacterReader("");
        assertFalse(readerEmpty.containsIgnoreCase("test"));
    }
}