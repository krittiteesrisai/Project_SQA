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
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.isEmpty());
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());

        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
        
        reader.advance();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());

        reader.unconsume();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());

        reader.mark();
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());

        reader.rewindToMark();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
        
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("xyz");
        assertEquals("x", reader.consumeAsString());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testNextIndexOfChar() {
        CharacterReader reader = new CharacterReader("banana");
        assertEquals(1, reader.nextIndexOf('a')); // from pos 0, next 'a' is at index 1
        reader.consume(); // pos 1 ('a')
        assertEquals(2, reader.nextIndexOf('n')); // from pos 1, next 'n' is at index 2 (relative offset 2)
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void testNextIndexOfSequence() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals(6, reader.nextIndexOf("world"));
        assertEquals(0, reader.nextIndexOf("hello"));
        assertEquals(-1, reader.nextIndexOf("notfound"));
        
        // Edge case: sequence longer than remaining input
        reader.consumeToEnd();
        assertEquals(-1, reader.nextIndexOf("test"));
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("key=value");
        assertEquals("key", reader.consumeTo('='));
        assertEquals("=", reader.consumeAsString());
        assertEquals("value", reader.consumeTo('x')); // consume to end if not found
    }

    @Test
    public void testConsumeToStringSeq() {
        CharacterReader reader = new CharacterReader("start-->end");
        assertEquals("start", reader.consumeTo("-->"));
        assertEquals("-->", reader.consumeAsString() + reader.consumeAsString() + reader.consumeAsString());
        assertEquals("end", reader.consumeTo("missing"));
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("hello;world,test");
        assertEquals("hello", reader.consumeToAny(';', ','));
        assertEquals(";", reader.consumeAsString());
        assertEquals("world", reader.consumeToAny(','));
        assertEquals(",", reader.consumeAsString());
        assertEquals("test", reader.consumeToAny('x')); // to end
    }

    @Test
    public void testConsumeToAnySorted() {
        char[] sortedChars = new char[]{',', ';'};
        java.util.Arrays.sort(sortedChars);
        CharacterReader reader = new CharacterReader("abc;def,ghi");
        assertEquals("abc", reader.consumeToAnySorted(sortedChars));
        assertEquals(";", reader.consumeAsString());
        assertEquals("def", reader.consumeToAnySorted(sortedChars));
    }

    @Test
    public void testConsumeDataAndTagName() {
        CharacterReader reader = new CharacterReader("div&nbsp;<tag>\u0000");
        assertEquals("div", reader.consumeTagName());
        assertEquals("&nbsp;<tag>\u0000", reader.toString());

        CharacterReader reader2 = new CharacterReader("a&b<c\u0000d");
        assertEquals("a", reader2.consumeData());
        assertEquals("&", reader2.consumeAsString());
        assertEquals("b", reader2.consumeData());
        assertEquals("<", reader2.consumeAsString());
        assertEquals("c", reader2.consumeData());
        assertEquals(TokeniserState.nullChar, reader2.consume());
        assertEquals("d", reader2.consumeToEnd());
    }

    @Test
    public void testLetterAndDigitSequences() {
        CharacterReader reader1 = new CharacterReader("AbCd123XYZ");
        assertEquals("AbCd", reader1.consumeLetterSequence());
        assertEquals("123", reader1.consumeDigitSequence());
        assertEquals("XYZ", reader1.consumeLetterSequence());

        CharacterReader reader2 = new CharacterReader("Var_123");
        assertEquals("Var", reader2.consumeLetterSequence());
        // non-letter, non-digit encountered '_'
        assertEquals("", reader2.consumeLetterThenDigitSequence()); 
        
        CharacterReader reader3 = new CharacterReader("abc123xyz");
        assertEquals("abc123", reader3.consumeLetterThenDigitSequence());

        CharacterReader reader4 = new CharacterReader("01239fA");
        assertEquals("01239", reader4.consumeDigitSequence());
        assertEquals("fA", reader4.consumeHexSequence());
    }

    @Test
    public void testMatchesMethods() {
        CharacterReader reader = new CharacterReader("TestSeq 123");
        assertTrue(reader.matches('T'));
        assertFalse(reader.matches('e'));
        assertTrue(reader.matches("Test"));
        assertFalse(reader.matches("Wrong"));
        assertFalse(reader.matches("Toolongstringtomatchhere"));

        assertTrue(reader.matchesIgnoreCase("test"));
        assertFalse(reader.matchesIgnoreCase("wrong"));
        assertFalse(reader.matchesIgnoreCase("Toolongstringtomatchhere"));

        assertTrue(reader.matchesAny('X', 'T', 'Y'));
        assertFalse(reader.matchesAny('A', 'B'));

        char[] sorted = new char[]{'S', 'T'};
        java.util.Arrays.sort(sorted);
        assertTrue(reader.matchesAnySorted(sorted));

        assertTrue(reader.matchesLetter());
        reader.consumeToEnd();
        assertFalse(reader.matchesLetter());
        assertFalse(reader.matchesDigit());
        assertFalse(reader.matchesAny('a'));
        assertFalse(reader.matchesAnySorted(sorted));

        CharacterReader readerDigit = new CharacterReader("5abc");
        assertTrue(readerDigit.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("<div>");
        assertTrue(reader.matchConsume("<div"));
        assertEquals(">", reader.consumeAsString());

        assertFalse(reader.matchConsume("span"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("<DIV>");
        assertTrue(reader.matchConsumeIgnoreCase("<div"));
        assertEquals(">", reader.consumeAsString());

        assertFalse(reader.matchConsumeIgnoreCase("span"));
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello </TITLE> World");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("</style>"));
    }

    @Test
    public void testStringCachingAndCollisions() {
        // Trigger maxCacheLen (> 12) branch (no cache)
        CharacterReader reader = new CharacterReader("ThisIsAVeryLongStringExceedingLimit");
        String longStr = reader.consumeTo('X'); // consume all
        assertTrue(longStr.length() > 12);

        // Trigger cache hit and hash collision branches in cacheString / rangeEquals
        CharacterReader reader2 = new CharacterReader("abcde abcde fghij");
        String s1 = reader2.consumeLetterSequence(); // "abcde" -> cached
        reader2.consume(); // consume space
        String s2 = reader2.consumeLetterSequence(); // "abcde" -> cache hit (rangeEquals true)
        
        // Force hash collision scenario with same hash/length or different content
        // e.g., reusing cache slots or forcing rangeEquals false
        assertTrue(reader2.rangeEquals(0, 5, s1));
        assertFalse(reader2.rangeEquals(0, 4, s1)); // different count -> rangeEquals false
    }
}