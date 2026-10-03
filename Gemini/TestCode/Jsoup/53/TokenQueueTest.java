package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenQueueTest {

    @Test
    public void testConstructorAndBasicNavigation() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.isEmpty());
        assertEquals('a', tq.peek());
        
        tq.advance();
        assertEquals('b', tq.peek());
        
        assertEquals('b', tq.consume());
        assertEquals('c', tq.peek());
        
        // Consume last char
        assertEquals('c', tq.consume());
        assertTrue(tq.isEmpty());
        assertEquals(0, tq.peek());
        
        // Advance on empty queue should be safe
        tq.advance();
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testAddFirst() {
        TokenQueue tq = new TokenQueue("c");
        tq.addFirst('b');
        tq.addFirst(Character.valueOf('a'));
        assertEquals("abc", tq.toString());
        assertEquals('a', tq.consume());
        assertEquals("bc", tq.toString());
    }

    @Test
    public void testMatchesVariants() {
        TokenQueue tq = new TokenQueue("Hello World");
        
        // matches (case-insensitive)
        assertTrue(tq.matches("hello"));
        assertFalse(tq.matches("world"));
        
        // matchesCS (case-sensitive)
        assertTrue(tq.matchesCS("Hello"));
        assertFalse(tq.matchesCS("hello"));
        
        // matchesAny String...
        assertTrue(tq.matchesAny("foo", "Hello"));
        assertFalse(tq.matchesAny("foo", "bar"));
        
        // matchesAny char...
        assertTrue(tq.matchesAny('H', 'X'));
        assertFalse(tq.matchesAny('X', 'Y'));
        
        // matchesAny on empty queue
        TokenQueue emptyTq = new TokenQueue("");
        assertFalse(emptyTq.matchesAny('H'));
    }

    @Test
    public void testMatchesStartTag() {
        TokenQueue tq1 = new TokenQueue("<div");
        assertTrue(tq1.matchesStartTag());

        TokenQueue tq2 = new TokenQueue("<1"); // Not a letter after <
        assertFalse(tq2.matchesStartTag());

        TokenQueue tq3 = new TokenQueue("a<div"); // Doesn't start with <
        assertFalse(tq3.matchesStartTag());

        TokenQueue tq4 = new TokenQueue("<"); // Too short
        assertFalse(tq4.matchesStartTag());
    }

    @Test
    public void testMatchChomp() {
        TokenQueue tq = new TokenQueue("prefix_suffix");
        assertTrue(tq.matchChomp("prefix"));
        assertEquals("_suffix", tq.toString());
        
        assertFalse(tq.matchChomp("notfound"));
        assertEquals("_suffix", tq.toString());
    }

    @Test
    public void testConsumeStringValidAndInvalid() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("hello");
        assertEquals(" world", tq.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeStringMismatch() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("world"); // Should throw IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeStringTooLong() {
        TokenQueue tq = new TokenQueue("hi");
        tq.consume("hello"); // Should throw IllegalStateException (not long enough)
    }

    @Test
    public void testConsumeToAndIgnoreCase() {
        TokenQueue tq = new TokenQueue("one,two;three");
        assertEquals("one", tq.consumeTo(","));
        assertEquals(",two;three", tq.toString());

        // ConsumeTo when not found returns remainder
        TokenQueue tq2 = new TokenQueue("abcdef");
        tq2.consumeTo("z");
        assertEquals("abcdef", tq2.remainder());

        // consumeToIgnoreCase
        TokenQueue tq3 = new TokenQueue("ABC def");
        assertEquals("ABC ", tq3.consumeToIgnoreCase("DEF"));
    }

    @Test
    public void testConsumeToAny() {
        TokenQueue tq = new TokenQueue("hello[world]");
        assertEquals("hello", tq.consumeToAny("[", "("));
        assertEquals("[world]", tq.toString());
    }

    @Test
    public void testChompToAndIgnoreCase() {
        TokenQueue tq = new TokenQueue("title: here");
        assertEquals("title", tq.chompTo(":"));
        assertEquals(" here", tq.toString());

        TokenQueue tq2 = new TokenQueue("TITLE: here");
        assertEquals("TITLE", tq2.chompToIgnoreCase(":"));
        assertEquals(" here", tq2.toString());
    }

    @Test
    public void testChompBalanced() {
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", tq.chompBalanced('(', ')'));
        assertEquals(" four", tq.toString());

        // Edge case: Escaped characters and empty or unbalance
        TokenQueue tq2 = new TokenQueue("((a\\(b))");
        assertEquals("(a\\(b)", tq2.chompBalanced('(', ')'));

        TokenQueue tq3 = new TokenQueue("no match");
        assertEquals("", tq3.chompBalanced('(', ')'));
        
        TokenQueue tq4 = new TokenQueue("");
        assertEquals("", tq4.chompBalanced('(', ')'));
    }

    @Test
    public void testUnescape() {
        assertEquals("a\\b", TokenQueue.unescape("a\\\\b"));
        assertEquals("ab", TokenQueue.unescape("ab"));
    }

    @Test
    public void testConsumeWhitespaceAndWord() {
        TokenQueue tq = new TokenQueue("   word123   ");
        assertTrue(tq.consumeWhitespace());
        assertFalse(tq.consumeWhitespace()); // Already consumed
        
        assertEquals("word123", tq.consumeWord());
        assertTrue(tq.consumeWhitespace());
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testSpecificConsumes() {
        // Tag Name: word or :, _, -
        TokenQueue tqTag = new TokenQueue("div-tag_name:sub");
        assertEquals("div-tag_name:sub", tqTag.consumeTagName());

        // Element Selector: word or |, _, -
        TokenQueue tqEl = new TokenQueue("div|tag_name-sub");
        assertEquals("div|tag_name-sub", tqEl.consumeElementSelector());

        // CSS Identifier: word or -, _
        TokenQueue tqCss = new TokenQueue("class-name_id");
        assertEquals("class-name_id", tqCss.consumeCssIdentifier());

        // Attribute Key: word or -, _, :
        TokenQueue tqAttr = new TokenQueue("data-attr_key:val");
        assertEquals("data-attr_key:val", tqAttr.consumeAttributeKey());
    }
}