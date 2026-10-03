package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test
    public void testConstructorsAndBufferLimits() {
        // ทดสอบ sz > maxBufferLen และ sz <= maxBufferLen รวมถึง markSupported = true
        String testStr = "Hello, Defects4J!";
        CharacterReader reader1 = new CharacterReader(new StringReader(testStr), CharacterReader.maxBufferLen + 100);
        assertFalse(reader1.isEmpty());
        assertEquals('H', reader1.current());

        CharacterReader reader2 = new CharacterReader(testStr);
        assertEquals(0, reader2.pos());
        assertFalse(reader2.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullInput() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMarkNotSupported() {
        // Reader ที่ไม่มี markSupported จะต้องโยน IllegalArgumentException จาก Validate.isTrue
        Reader unsupportedReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return -1;
            }
            @Override
            public void close() throws IOException {}
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(unsupportedReader);
    }

    @Test
    public void testNavigationAndConsuming() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
        reader.unconsume();
        assertEquals('a', reader.current());
        reader.advance();
        assertEquals('b', reader.current());
        
        reader.mark();
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertTrue(reader.matches('c') || !reader.isEmpty()); // Trigger matches(char)
        reader.rewindToMark();
        assertEquals('b', reader.current());
    }

    @Test
    public void testNextIndexOfCharAndSequence() {
        CharacterReader reader = new CharacterReader("abcdefabcdef");
        assertEquals(2, reader.nextIndexOf('c'));
        assertEquals(2, reader.nextIndexOf("cde"));
        assertEquals(-1, reader.nextIndexOf('z'));
        assertEquals(-1, reader.nextIndexOf("xyz"));
    }

    @Test
    public void testConsumeToCharAndString() {
        CharacterReader reader = new CharacterReader("key=value;");
        assertEquals("key", reader.consumeTo('='));
        assertEquals('=', reader.consume());
        assertEquals("value;", reader.consumeTo("NOT_EXIST")); // ทดสอบกรณี offset == -1 (consumeToEnd)
    }

    @Test
    public void testConsumeToAnyAndSorted() {
        CharacterReader reader = new CharacterReader("hello world!");
        assertEquals("hello ", reader.consumeToAny('w', 'o'));
        
        CharacterReader reader2 = new CharacterReader("abc123xyz");
        char[] sortedChars = new char[]{'1', '2', '3'};
        java.util.Arrays.sort(sortedChars);
        assertEquals("abc", reader2.consumeToAnySorted(sortedChars));
    }

    @Test
    public void testConsumeSpecialSequences() {
        CharacterReader reader = new CharacterReader("abc&<123 tag/>");
        // consumeData stops at &, <, nullChar
        CharacterReader cr1 = new CharacterReader("data&more");
        assertEquals("data", cr1.consumeData());

        CharacterReader cr2 = new CharacterReader("tagname ");
        assertEquals("tagname", cr2.consumeTagName());

        CharacterReader cr3 = new CharacterReader("ABC123xyz");
        assertEquals("ABC", cr3.consumeLetterSequence());
        
        CharacterReader cr4 = new CharacterReader("Abc123xyz");
        assertEquals("Abc123", cr4.consumeLetterThenDigitSequence());

        CharacterReader cr5 = new CharacterReader("A1B2F3g");
        assertEquals("A1B2F3", cr5.consumeHexSequence());

        CharacterReader cr6 = new CharacterReader("98765abc");
        assertEquals("98765", cr6.consumeDigitSequence());
    }

    @Test
    public void testMatchesVariants() {
        CharacterReader reader = new CharacterReader("TestString");
        assertTrue(reader.matches('T'));
        assertFalse(reader.matches('x'));
        assertTrue(reader.matches("Test"));
        assertFalse(reader.matches("LongerStringThanBufferOrRemaining"));
        
        assertTrue(reader.matchesIgnoreCase("test"));
        assertFalse(reader.matchesIgnoreCase("wrong"));

        assertTrue(reader.matchesAny('X', 'T', 'Y'));
        assertFalse(reader.matchesAny('a', 'b'));

        char[] sorted = new char[]{'S', 'T', 'U'};
        java.util.Arrays.sort(sorted);
        assertFalse(reader.matchesAnySorted(sorted)); // เนื่องจากตัวแรกคือ 'T' อยู่ใน sorted แต่ต้องเช็ค index 0 ของ reader ซึ่งคือ 'T'
        
        CharacterReader readerNum = new CharacterReader("123");
        assertTrue(readerNum.matchesDigit());
        assertFalse(readerNum.matchesLetter());

        CharacterReader readerLetter = new CharacterReader("abc");
        assertTrue(readerLetter.matchesLetter());
        assertFalse(readerLetter.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("<div>");
        assertTrue(reader.matchConsume("<div>"));
        assertFalse(reader.matchConsume("span"));

        CharacterReader readerIgnoreCase = new CharacterReader("<DIV>");
        assertTrue(readerIgnoreCase.matchConsumeIgnoreCase("<div>"));
        assertFalse(readerIgnoreCase.matchConsumeIgnoreCase("span"));
    }

    @Test
    public void containsIgnoreCaseTest() {
        CharacterReader reader = new CharacterReader("Hello </TITLE> World");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("</style>"));
    }

    @Test
    public void testCacheStringAndRangeEqualsEdges() {
        // ทดสอบ cacheString ขอบเขต count > maxStringCacheLen (หลุดจากการแคช)
        CharacterReader reader = new CharacterReader("123456789012345"); // 15 chars > 12
        String longStr = reader.consumeToEnd();
        assertEquals(15, longStr.length());

        // ทดสอบ cacheString count < 1 และ Cache Hit / Collision / rangeEquals
        CharacterReader cacheReader = new CharacterReader("abc abc xyz xyz");
        String s1 = cacheReader.consumeTo(' ');
        cacheReader.consume(); // ข้าม space
        String s2 = cacheReader.consumeTo(' '); // Hash collision หรือ Cache hit ซ้ำ
        assertEquals("abc", s1);
        assertEquals("abc", s2);

        // ทดสอบ rangeEquals ตรงๆ ผ่านเมธอด helper ภายใน
        assertTrue(cacheReader.rangeEquals(0, 3, "abc"));
        assertFalse(cacheReader.rangeEquals(0, 4, "abc")); // count != cached.length()
        assertFalse(cacheReader.rangeEquals(0, 3, "xyz")); // ตัวอักษรไม่ตรงกัน (range mismatch)
    }

    @Test
    public void testUncheckedIOExceptionHandling() {
        // จำลอง IOException ตอนอ่านข้อมูล เพื่อให้ catch (IOException e) ทำงานและโยน UncheckedIOException
        Reader faultyReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO Error");
            }
            @Override
            public void close() throws IOException {}
            @Override
            public boolean markSupported() {
                return true;
            }
        };

        try {
            new CharacterReader(faultyReader, 100);
            fail("Expected UncheckedIOException");
        } catch (UncheckedIOException e) {
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testToStringOutput() {
        CharacterReader reader = new CharacterReader("Hello");
        reader.consume();
        assertEquals("ello", reader.toString());
    }
}