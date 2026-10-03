package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test
    public void testConstructorAndBasicNavigation() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
        assertEquals('a', reader.current());
        
        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
        
        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());

        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());

        reader.mark();
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertTrue(reader.matches('c') || !reader.isEmpty()); // just state check
        
        reader.rewindToMark();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullInput() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorReaderNoMark() {
        Reader unmarkable = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) {
                return -1;
            }
            @Override
            public void close() {}
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(unmarkable, 100);
    }

    @Test
    public void testLargeBufferAndSzParameter() {
        // sz > maxBufferLen branch
        CharacterReader reader = new CharacterReader(new StringReader("hello"), CharacterReader.maxBufferLen + 1000);
        assertEquals('h', reader.consume());
    }

    @Test
    public void testBufferUpBranchPosLessThanSplitPoint() {
        CharacterReader reader = new CharacterReader("test buffer up optimization");
        // Read a few chars, bufferUp should return early if bufPos < bufSplitPoint
        assertEquals('t', reader.consume());
        assertEquals('e', reader.consume());
    }

    @Test(expected = UncheckedIOException.class)
    public void testBufferUpIOException() {
        Reader faultyReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO error");
            }
            @Override
            public void close() {}
            @Override
            public boolean markSupported() {
                return true;
            }
        };
        CharacterReader reader = new CharacterReader(faultyReader, 100);
        reader.consume();
    }

    @Test
    public void testNextIndexOfChar() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals(4, reader.nextIndexOf('o'));
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void testNextIndexOfCharSequence() {
        CharacterReader reader = new CharacterReader("jsoup html parser");
        assertEquals(5, reader.nextIndexOf("html"));
        assertEquals(-1, reader.nextIndexOf("missing"));
        assertEquals(0, reader.nextIndexOf("js"));
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("name=value");
        assertEquals("name", reader.consumeTo('='));
        assertEquals('=', reader.consume());
        assertEquals("value", reader.consumeTo('x')); // consumeToEnd branch
    }

    @Test
    public void testConsumeToString() {
        CharacterReader reader = new CharacterReader("start->end");
        assertEquals("start", reader.consumeTo("->"));
        assertEquals("->end", reader.consumeToEnd());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("hello, world;test");
        assertEquals("hello", reader.consumeToAny(',', ';'));
        assertEquals(',', reader.consume());
        assertEquals(" world", reader.consumeToAny(';', ','));
        assertEquals(';', reader.consume());
        assertEquals("test", reader.consumeToAny('x'));
    }

    @Test
    public void testConsumeToAnySorted() {
        char[] sorted = new char[]{',', ';'};
        Arrays.sort(sorted);
        CharacterReader reader = new CharacterReader("abc,def;ghi");
        assertEquals("abc", reader.consumeToAnySorted(sorted));
    }

    @Test
    public void testConsumeDataAndTagName() {
        CharacterReader reader = new CharacterReader("div&nbsp;<span");
        assertEquals("div", reader.consumeTagName());
        assertEquals('&', reader.consume());
        assertEquals("nbsp;", reader.consumeData());
        assertEquals('<', reader.consume());
        assertEquals("span", reader.consumeTagName());
    }

    @Test
    public void testSequenceConsumers() {
        CharacterReader reader = new CharacterReader("ABC123abc 456 0AF789 notdigit");
        
        // consumeLetterSequence
        assertEquals("ABC", reader.consumeLetterSequence());
        assertEquals("123", reader.consumeDigitSequence());
        assertEquals("abc", reader.consumeLetterSequence());
        reader.consume(); // space

        // consumeLetterThenDigitSequence
        assertEquals("456", reader.consumeLetterThenDigitSequence());
        reader.consume(); // space

        // consumeHexSequence
        assertEquals("0AF789", reader.consumeHexSequence());
    }

    @Test
    public void testMatchesVariations() {
        CharacterReader reader = new CharacterReader("Test123");

        assertTrue(reader.matches('T'));
        assertFalse(reader.matches('t'));

        assertTrue(reader.matches("Test"));
        assertFalse(reader.matches("test"));
        assertFalse(reader.matches("Toolongstringtestmatch")); // scanLength > bufLength - bufPos

        assertTrue(reader.matchesIgnoreCase("test"));
        assertFalse(reader.matchesIgnoreCase("toast"));

        assertTrue(reader.matchesAny('X', 'T', 'Y'));
        assertFalse(reader.matchesAny('A', 'B'));

        char[] sortedChars = new char[]{'T', 'A', 'B'};
        Arrays.sort(sortedChars);
        assertTrue(reader.matchesAnySorted(sortedChars));

        assertTrue(reader.matchesLetter());
        reader.consumeTo('1');
        assertFalse(reader.matchesLetter());
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertFalse(reader.matchConsume("xyz"));
        assertTrue(reader.matchConsumeIgnoreCase("DEF"));
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello </TITLE> World");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("missing"));
    }

    @Test
    public void testToStringAndCachingAndRangeEquals() {
        // String length > maxStringCacheLen (12 chars) to test cache bypass
        String longStr = "123456789012345";
        CharacterReader reader = new CharacterReader(longStr);
        assertEquals(longStr, reader.toString());

        // Test caching and hash collision / rangeEquals paths
        CharacterReader readerCache = new CharacterReader("short short short");
        String s1 = readerCache.consumeTo(' ');
        readerCache.consume();
        String s2 = readerCache.consumeTo(' ');
        assertEquals(s1, s2); // Hits cache or triggers rangeEquals

        // Direct test for rangeEquals method
        assertTrue(readerCache.rangeEquals(0, 5, "short"));
        assertFalse(readerCache.rangeEquals(0, 4, "short"));
        assertFalse(readerCache.rangeEquals(0, 5, "wrong"));
    }

    @Test
    public void testEmptyReaderMatchesAndConsumes() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals("", reader.consumeToEnd());
        assertFalse(reader.matches('a'));
        assertFalse(reader.matchesAny('a'));
        assertFalse(reader.matchesLetter());
        assertFalse(reader.matchesDigit());
    }
}