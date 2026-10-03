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
        
        reader.advance();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());
        
        assertEquals('c', reader.consume());
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.consume());
        reader.unconsume();
        assertEquals('a', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testUnconsumeException() {
        CharacterReader reader = new CharacterReader("ab");
        reader.unconsume(); // bufPos < 1 throws exception
    }

    @Test
    public void testMarkAndRewind() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        
        reader.mark();
        assertEquals('c', reader.consume());
        assertEquals('d', reader.consume());
        
        reader.rewindToMark();
        assertEquals('c', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testRewindWithoutMarkException() {
        CharacterReader reader = new CharacterReader("abc");
        reader.rewindToMark(); // bufMark is -1
    }

    @Test
    public void testNextIndexOfChar() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals(4, reader.nextIndexOf('o'));
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void testNextIndexOfSequence() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals(6, reader.nextIndexOf("world"));
        assertEquals(0, reader.nextIndexOf("hell"));
        assertEquals(-1, reader.nextIndexOf("notfound"));
        assertEquals(-1, reader.nextIndexOf("hellos")); // Sequence longer or mismatch
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("key=value");
        assertEquals("key", reader.consumeTo('='));
        assertEquals('=', reader.consume());
        assertEquals("value", reader.consumeTo('z')); // to end
    }

    @Test
    public void testConsumeToString() {
        CharacterReader reader = new CharacterReader("start_end");
        assertEquals("start", reader.consumeTo("_end"));
        assertEquals("_end", reader.consumeToEnd());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("abc;def,ghi");
        assertEquals("abc", reader.consumeToAny(';', ','));
        assertEquals(';', reader.consume());
        assertEquals("def", reader.consumeToAny(';', ','));
    }

    @Test
    public void testConsumeToAnySorted() {
        CharacterReader reader = new CharacterReader("abcXdef");
        char[] sortedChars = new char[]{'X', 'Y', 'Z'};
        java.util.Arrays.sort(sortedChars);
        assertEquals("abc", reader.consumeToAnySorted(sortedChars));
        assertEquals('X', reader.consume());
    }

    @Test
    public void testConsumeData() {
        CharacterReader reader = new CharacterReader("data&more<tag>\0end");
        assertEquals("data", reader.consumeData());
        assertEquals('&', reader.consume());
        assertEquals("more", reader.consumeData());
        assertEquals('<', reader.consume());
        assertEquals("tag", reader.consumeData());
        assertEquals('>', reader.consume());
        assertEquals("", reader.consumeData()); // nullChar hits
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testConsumeTagName() {
        CharacterReader reader = new CharacterReader("div class/></");
        assertEquals("div", reader.consumeTagName());
        assertEquals(' ', reader.consume());
        assertEquals("class", reader.consumeTagName());
        assertEquals('/', reader.consume());
    }

    @Test
    public void testSequencesConsumption() {
        CharacterReader reader = new CharacterReader("ABCabc1234567890DEFabcdef_!@#");
        
        // Letter sequence
        assertEquals("ABCabc", reader.consumeLetterSequence());
        
        // Letter then digit sequence
        CharacterReader reader2 = new CharacterReader("abc123xyz");
        assertEquals("abc123", reader2.consumeLetterThenDigitSequence());

        // Hex sequence
        CharacterReader reader3 = new CharacterReader("19fA0z");
        assertEquals("19fA0", reader3.consumeHexSequence());

        // Digit sequence
        CharacterReader reader4 = new CharacterReader("45678a");
        assertEquals("45678", reader4.consumeDigitSequence());
    }

    @Test
    public void testMatches() {
        CharacterReader reader = new CharacterReader("test");
        assertTrue(reader.matches('t'));
        assertFalse(reader.matches('e'));
        assertTrue(reader.matches("tes"));
        assertFalse(reader.matches("not"));
        assertFalse(reader.matches("toolongstring"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("TestString");
        assertTrue(reader.matchesIgnoreCase("TEST"));
        assertFalse(reader.matchesIgnoreCase("TING"));
        assertFalse(reader.matchesIgnoreCase("toolongstringtest"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'y', 'a'));
        assertFalse(reader.matchesAny('z', 'w'));
    }

    @Test
    public void testMatchesAnySorted() {
        CharacterReader reader = new CharacterReader("abc");
        char[] arr = {'a', 'b', 'c'};
        assertTrue(reader.matchesAnySorted(arr));
        
        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAnySorted(arr));
    }

    @Test
    public void testMatchesLetterAndDigit() {
        CharacterReader reader = new CharacterReader("A9_");
        assertTrue(reader.matchesLetter());
        reader.advance();
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
        CharacterReader reader = new CharacterReader("foobar");
        assertTrue(reader.matchConsume("foo"));
        assertFalse(reader.matchConsume("bar"));
        assertTrue(reader.matchConsume("bar"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("FooBar");
        assertTrue(reader.matchConsumeIgnoreCase("fOo"));
        assertTrue(reader.matchConsumeIgnoreCase("bAr"));
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello WORLD Content");
        assertTrue(reader.containsIgnoreCase("world"));
        assertTrue(reader.containsIgnoreCase("HELLO"));
        assertFalse(reader.containsIgnoreCase("missing"));
    }

    @Test
    public void testToStringAndCachingEdgeCases() {
        // String length > maxStringCacheLen (12) to test bypass cache
        CharacterReader reader = new CharacterReader("thisisverylongstringmorethantwelvechars");
        String longStr = reader.consumeToEnd();
        assertTrue(longStr.length() > 12);

        // Empty count caching
        CharacterReader reader2 = new CharacterReader("abc");
        assertEquals("", reader2.consumeTo('z')); // covers count < 1 in cacheString

        // Cache hit & collision testing via rangeEquals
        CharacterReader reader3 = new CharacterReader("cache_hit cache_hit other_str");
        assertEquals("cache_hit", reader3.consumeTo(' '));
        reader3.advance();
        assertEquals("cache_hit", reader3.consumeTo(' ')); // Should hit cache
    }

    @Test
    public void testIOExceptionHandling() {
        Reader faultyReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO Error");
            }
            @Override
            public void close() {}
            @Override
            public boolean markSupported() {
                return true;
            }
            @Override
            public void mark(int readAheadLimit) {}
        };

        try {
            new CharacterReader(faultyReader, 100);
            fail("Expected UncheckedIOException");
        } catch (UncheckedIOException e) {
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testBufferSplitAndSizeLimitation() {
        // Test sz > maxBufferLen condition in constructor
        StringReader strReader = new StringReader("test buffer sizing");
        CharacterReader reader = new CharacterReader(strReader, CharacterReader.maxBufferLen + 100);
        assertFalse(reader.isEmpty());
    }
}