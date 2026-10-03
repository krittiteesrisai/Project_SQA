package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNull() {
        new TokenQueue(null);
    }

    @Test
    public void testIsEmptyAndPeekAndAdvance() {
        TokenQueue tq = new TokenQueue("ab");
        assertFalse(tq.isEmpty());
        assertEquals('a', tq.peek());
        
        tq.advance();
        assertFalse(tq.isEmpty());
        assertEquals('b', tq.peek());
        
        tq.advance();
        assertTrue(tq.isEmpty());
        assertEquals(0, tq.peek());
        
        // Advancing an already empty queue should do nothing safely
        tq.advance();
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testAddFirst() {
        TokenQueue tq = new TokenQueue("world");
        tq.addFirst("Hello ");
        assertEquals("Hello world", tq.remainder());

        TokenQueue tqChar = new TokenQueue("bar");
        tqChar.addFirst(Character.valueOf('foo'.charAt(0))); // 'f'
        // Let's use direct char
        tqChar.addFirst('f');
        assertEquals("fbar", tqChar.remainder());
    }

    @Test
    public void testMatches() {
        TokenQueue tq = new TokenQueue("TestString");
        assertTrue(tq.matches("test"));
        assertTrue(tq.matchesCS("Test"));
        assertFalse(tq.matchesCS("test"));
        assertFalse(tq.matches("NotMatch"));
    }

    @Test
    public void testMatchesAnyStrings() {
        TokenQueue tq = new TokenQueue("apple");
        assertTrue(tq.matchesAny("banana", "app", "pear"));
        assertFalse(tq.matchesAny("banana", "orange"));
    }

    @Test
    public void testMatchesAnyChars() {
        TokenQueue tqEmpty = new TokenQueue("");
        assertFalse(tqEmpty.matchesAny('a', 'b'));

        TokenQueue tq = new TokenQueue("cat");
        assertTrue(tq.matchesAny('c', 'd', 'e'));
        assertFalse(tq.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesStartTag() {
        TokenQueue tq1 = new TokenQueue("<a");
        assertTrue(tq1.matchesStartTag());

        TokenQueue tq2 = new TokenQueue("<1"); // Not a letter after '<'
        assertFalse(tq2.matchesStartTag());

        TokenQueue tq3 = new TokenQueue("a"); // Too short
        assertFalse(tq3.matchesStartTag());

        TokenQueue tq4 = new TokenQueue("<<"); // '<' followed by non-letter
        assertFalse(tq4.matchesStartTag());
    }

    @Test
    public void testMatchChomp() {
        TokenQueue tq = new TokenQueue("<div>");
        assertTrue(tq.matchChomp("<div"));
        assertEquals(">", tq.remainder());

        assertFalse(tq.matchChomp("span"));
    }

    @Test
    public void testMatchesWhitespaceAndWord() {
        TokenQueue tq = new TokenQueue(" \t1a_");
        assertTrue(tq.matchesWhitespace());
        tq.consumeWhitespace();
        
        assertTrue(tq.matchesWord());
        assertEquals("1a_", tq.consumeWord());
    }

    @Test
    public void testConsumeValidAndExceptions() {
        TokenQueue tq = new TokenQueue("hello");
        tq.consume("hel");
        assertEquals("lo", tq.remainder());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeNotMatchException() {
        TokenQueue tq = new TokenQueue("hello");
        tq.consume("xyz");
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeTooLongException() {
        TokenQueue tq = new TokenQueue("hi");
        tq.consume("hello");
    }

    @Test
    public void testConsumeTo() {
        TokenQueue tq = new TokenQueue("one,two,three");
        assertEquals("one", tq.consumeTo(","));
        assertEquals(",", tq.consume( "," )); // consume the comma
        assertEquals("two,three", tq.consumeTo("nonexistent")); // should return remainder
    }

    @Test
    public void testConsumeToIgnoreCase() {
        TokenQueue tq = new TokenQueue("AbCdEf");
        assertEquals("AbC", tq.consumeToIgnoreCase("d"));
        
        // Test canScan branches (e.g. non-cased first char or skip logic)
        TokenQueue tq2 = new TokenQueue("123456");
        assertEquals("123", tq2.consumeToIgnoreCase("4"));

        TokenQueue tq3 = new TokenQueue("abc");
        assertEquals("abc", tq3.consumeToIgnoreCase("z")); // skip < 0
        
        TokenQueue tq4 = new TokenQueue("aaa");
        assertEquals("a", tq4.consumeToIgnoreCase("a")); // skip == 0 forcing advance
    }

    @Test
    public void testConsumeToAny() {
        TokenQueue tq = new TokenQueue("hello.world?java");
        assertEquals("hello", tq.consumeToAny(".", "?"));
    }

    @Test
    public void testChompToAndIgnoreCase() {
        TokenQueue tq = new TokenQueue("prefix:suffix");
        assertEquals("prefix", tq.chompTo(":"));
        assertEquals("suffix", tq.remainder());

        TokenQueue tq2 = new TokenQueue("Prefix:Suffix");
        assertEquals("Prefix", tq2.chompToIgnoreCase(":"));
    }

    @Test
    public void testChompBalanced() {
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", tq.chompBalanced('(', ')'));
        assertEquals(" four", tq.remainder());

        // Test quotes and escapes inside balanced chomping
        TokenQueue tqEsc = new TokenQueue("(\"nested (quote)\") remainder");
        assertEquals("\"nested (quote)\"", tqEsc.chompBalanced('(', ')'));
    }

    @Test
    public void testUnescape() {
        assertEquals("abc", TokenQueue.unescape("abc"));
        assertEquals("\\", TokenQueue.unescape("\\\\"));
        assertEquals("a\\b", TokenQueue.unescape("a\\b"));
    }

    @Test
    public void testConsumeTagNameAndSelectors() {
        TokenQueue tqTag = new TokenQueue("div-tag_name:sub");
        assertEquals("div-tag_name:sub", tqTag.consumeTagName());

        TokenQueue tqElem = new TokenQueue("*|tag_name|sub");
        assertEquals("*|tag_name|sub", tqElem.consumeElementSelector());

        TokenQueue tqCss = new TokenQueue("my-id_class123");
        assertEquals("my-id_class123", tqCss.consumeCssIdentifier());

        TokenQueue tqAttr = new TokenQueue("attr-name_key:ns");
        assertEquals("attr-name_key:ns", tqAttr.consumeAttributeKey());
    }

    @Test
    public void testToStringOverride() {
        TokenQueue tq = new TokenQueue("testing");
        tq.advance();
        assertEquals("esting", tq.toString());
    }
}