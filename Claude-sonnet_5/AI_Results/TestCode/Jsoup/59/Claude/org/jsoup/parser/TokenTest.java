package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

/**
 * Unit tests for org.jsoup.parser.Token (package-private class).
 * Test class must reside in the same package to access package-private members.
 */
public class TokenTest {

    // ---------- Token.reset(StringBuilder) static helper ----------

    @Test
    public void testStaticResetWithNullStringBuilder() {
        // branch: sb == null -> should not throw
        Token.reset(null);
    }

    @Test
    public void testStaticResetWithNonNullStringBuilder() {
        // branch: sb != null -> content cleared
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    // ---------- Doctype ----------

    @Test
    public void testDoctypeInitialState() {
        Token.Doctype d = new Token.Doctype();
        assertEquals(Token.TokenType.Doctype, d.type);
        assertEquals("", d.getName());
        assertNull(d.getPubSysKey());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctypeReset() {
        Token.Doctype d = new Token.Doctype();
        d.name.append("html");
        d.pubSysKey = "PUBLIC";
        d.publicIdentifier.append("pub");
        d.systemIdentifier.append("sys");
        d.forceQuirks = true;

        Token result = d.reset();

        assertSame(d, result);
        assertEquals("", d.getName());
        assertNull(d.getPubSysKey());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    // ---------- Tag.name() / name(String) ----------

    @Test
    public void testTagNameSetAndGet() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("DIV");
        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameThrowsWhenNull() {
        // tagName is null by default -> Validate.isFalse should throw
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameThrowsWhenEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        tag.name();
    }

    // ---------- appendTagName ----------

    @Test
    public void testAppendTagNameWhenTagNameNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("div");
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());
    }

    @Test
    public void testAppendTagNameWhenTagNameNotNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("di");
        tag.appendTagName("v");
        assertEquals("div", tag.name());
    }

    @Test
    public void testAppendTagNameCharConvenience() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('x');
        assertEquals("x", tag.name());
    }

    // ---------- appendAttributeName ----------

    @Test
    public void testAppendAttributeNameWhenNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("class");
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testAppendAttributeNameConcat() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("cla");
        tag.appendAttributeName("ss");
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("class", attr.getKey());
    }

    @Test
    public void testAppendAttributeNameCharConvenience() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName('a');
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("a", attr.getKey());
    }

    @Test
    public void testAttributeNameIsTrimmedOnNewAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName(" foo ");
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("foo", attr.getKey());
    }

    // ---------- newAttribute() branches ----------

    @Test
    public void testNewAttributeWithNullAttributesCreatesAttributes() {
        Token.EndTag tag = new Token.EndTag();
        assertNull(tag.getAttributes());
        tag.appendAttributeName("foo");
        tag.newAttribute();
        assertNotNull(tag.getAttributes());
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testNewAttributeWithNoPendingNameDoesNothing() {
        Token.StartTag tag = new Token.StartTag();
        tag.newAttribute(); // no pending name set
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testNewAttributeBooleanAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("disabled");
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertTrue(attr instanceof BooleanAttribute);
        assertEquals("disabled", attr.getKey());
    }

    @Test
    public void testNewAttributeEmptyValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("alt");
        tag.setEmptyAttributeValue();
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertFalse(attr instanceof BooleanAttribute);
        assertEquals("", attr.getValue());
    }

    @Test
    public void testNewAttributeWithValueFromSingleShotString() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("href");
        tag.appendAttributeValue("foo");
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("foo", attr.getValue());
    }

    @Test
    public void testNewAttributeWithValueFromBuilderAfterSecondAppend() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("href");
        tag.appendAttributeValue("foo");
        tag.appendAttributeValue("bar");
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("foobar", attr.getValue());
    }

    // ---------- appendAttributeValue overloads ----------

    @Test
    public void testAppendAttributeValueChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue('a');
        tag.appendAttributeValue('b');
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("ab", attr.getValue());
    }

    @Test
    public void testAppendAttributeValueCharArray() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue(new char[]{'a', 'b', 'c'});
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("abc", attr.getValue());
    }

    @Test
    public void testAppendAttributeValueCodepointsMultiple() {
        // loop runs multiple iterations
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue(new int[]{'a', 'b', 'c'});
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("abc", attr.getValue());
    }

    @Test
    public void testAppendAttributeValueCodepointsEmptyArrayNoOp() {
        // loop runs zero iterations (boundary)
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue("start"); // sets pendingAttributeValueS
        tag.appendAttributeValue(new int[]{}); // triggers ensureAttributeValue() move, then no-op loop
        tag.newAttribute();
        Attribute attr = firstAttribute(tag.getAttributes());
        assertEquals("start", attr.getValue());
    }

    // ---------- finaliseTag ----------

    @Test
    public void testFinaliseTagWithPendingAttributeName() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("foo");
        tag.finaliseTag();
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testFinaliseTagWithoutPendingAttributeName() {
        Token.StartTag tag = new Token.StartTag();
        tag.finaliseTag();
        assertEquals(0, tag.getAttributes().size());
    }

    // ---------- Tag.reset() ----------

    @Test
    public void testStartTagResetRecreatesAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("foo");
        tag.newAttribute();
        tag.name("div");
        tag.selfClosing = true;

        Token result = tag.reset();

        assertSame(tag, result);
        assertNull(tag.tagName);
        assertNull(tag.normalName);
        assertFalse(tag.isSelfClosing());
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testEndTagResetLeavesAttributesNull() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("foo");
        tag.newAttribute();
        assertNotNull(tag.getAttributes());

        tag.reset();

        assertNull(tag.getAttributes());
    }

    // ---------- StartTag specific ----------

    @Test
    public void testStartTagConstructorInitialState() {
        Token.StartTag tag = new Token.StartTag();
        assertEquals(Token.TokenType.StartTag, tag.type);
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testStartTagNameAttr() {
        Token.StartTag tag = new Token.StartTag();
        Attributes attrs = new Attributes();
        Token.StartTag result = tag.nameAttr("DIV", attrs);
        assertSame(tag, result);
        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
        assertSame(attrs, tag.getAttributes());
    }

    @Test
    public void testStartTagToStringWithAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("main");
        tag.newAttribute();
        String s = tag.toString();
        assertTrue(s.startsWith("<div "));
        assertTrue(s.endsWith(">"));
    }

    @Test
    public void testStartTagToStringWithEmptyAttributesSizeZero() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        // attributes non-null but size == 0
        String s = tag.toString();
        assertEquals("<div>", s);
    }

    @Test
    public void testStartTagToStringWithNullAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.attributes = null;
        String s = tag.toString();
        assertEquals("<div>", s);
    }

    // ---------- EndTag specific ----------

    @Test
    public void testEndTagConstructorInitialState() {
        Token.EndTag tag = new Token.EndTag();
        assertEquals(Token.TokenType.EndTag, tag.type);
        assertNull(tag.getAttributes());
    }

    @Test
    public void testEndTagToString() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("div");
        assertEquals("</div>", tag.toString());
    }

    // ---------- Comment ----------

    @Test
    public void testCommentInitialState() {
        Token.Comment c = new Token.Comment();
        assertEquals(Token.TokenType.Comment, c.type);
        assertEquals("", c.getData());
        assertFalse(c.bogus);
    }

    @Test
    public void testCommentReset() {
        Token.Comment c = new Token.Comment();
        c.data.append("hello");
        c.bogus = true;
        Token result = c.reset();
        assertSame(c, result);
        assertEquals("", c.getData());
        assertFalse(c.bogus);
    }

    @Test
    public void testCommentToString() {
        Token.Comment c = new Token.Comment();
        c.data.append("hi");
        assertEquals("<!--hi-->", c.toString());
    }

    // ---------- Character ----------

    @Test
    public void testCharacterInitialState() {
        Token.Character ch = new Token.Character();
        assertEquals(Token.TokenType.Character, ch.type);
        assertNull(ch.getData());
    }

    @Test
    public void testCharacterDataSetAndGet() {
        Token.Character ch = new Token.Character();
        Token.Character result = ch.data("abc");
        assertSame(ch, result);
        assertEquals("abc", ch.getData());
    }

    @Test
    public void testCharacterReset() {
        Token.Character ch = new Token.Character();
        ch.data("abc");
        Token result = ch.reset();
        assertSame(ch, result);
        assertNull(ch.getData());
    }

    @Test
    public void testCharacterToString() {
        Token.Character ch = new Token.Character();
        ch.data("xyz");
        assertEquals("xyz", ch.toString());
    }

    // ---------- EOF ----------

    @Test
    public void testEOFConstructorInitialState() {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    @Test
    public void testEOFReset() {
        Token.EOF eof = new Token.EOF();
        Token result = eof.reset();
        assertSame(eof, result);
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    // ---------- type check / as* methods ----------

    @Test
    public void testIsDoctypeAndAsDoctype() {
        Token.Doctype d = new Token.Doctype();
        assertTrue(d.isDoctype());
        assertSame(d, d.asDoctype());
        assertFalse(d.isStartTag());
        assertFalse(d.isEndTag());
        assertFalse(d.isComment());
        assertFalse(d.isCharacter());
        assertFalse(d.isEOF());
    }

    @Test
    public void testIsStartTagAndAsStartTag() {
        Token.StartTag t = new Token.StartTag();
        assertTrue(t.isStartTag());
        assertSame(t, t.asStartTag());
        assertFalse(t.isDoctype());
        assertFalse(t.isEndTag());
    }

    @Test
    public void testIsEndTagAndAsEndTag() {
        Token.EndTag t = new Token.EndTag();
        assertTrue(t.isEndTag());
        assertSame(t, t.asEndTag());
        assertFalse(t.isStartTag());
    }

    @Test
    public void testIsCommentAndAsComment() {
        Token.Comment c = new Token.Comment();
        assertTrue(c.isComment());
        assertSame(c, c.asComment());
        assertFalse(c.isCharacter());
    }

    @Test
    public void testIsCharacterAndAsCharacter() {
        Token.Character ch = new Token.Character();
        assertTrue(ch.isCharacter());
        assertSame(ch, ch.asCharacter());
        assertFalse(ch.isComment());
    }

    @Test
    public void testIsEOF() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
    }

    // ---------- tokenType() ----------

    @Test
    public void testTokenTypeReturnsSimpleClassName() {
        assertEquals("Doctype", new Token.Doctype().tokenType());
        assertEquals("StartTag", new Token.StartTag().tokenType());
        assertEquals("EndTag", new Token.EndTag().tokenType());
        assertEquals("Comment", new Token.Comment().tokenType());
        assertEquals("Character", new Token.Character().tokenType());
        assertEquals("EOF", new Token.EOF().tokenType());
    }

    // ---------- helper ----------

    private Attribute firstAttribute(Attributes attrs) {
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        return it.next();
    }
}
