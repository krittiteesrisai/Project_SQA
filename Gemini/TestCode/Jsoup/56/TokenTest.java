package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testTokenResetStringBuilderNull() {
        // Branch: sb != null -> false
        Token.reset(null);
        // ไม่มี Exception ถือว่าผ่าน
    }

    @Test
    public void testTokenResetStringBuilderNotNull() {
        // Branch: sb != null -> true
        StringBuilder sb = new StringBuilder("test");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void testDoctypeToken() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertEquals("Doctype", doctype.tokenType());

        doctype.name.append("html");
        doctype.publicIdentifier.append("pub");
        doctype.systemIdentifier.append("sys");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("pub", doctype.getPublicIdentifier());
        assertEquals("sys", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());

        doctype.reset();
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testStartTagAndNameValidation() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        assertEquals("StartTag", startTag.tokenType());

        // Test name() valid
        startTag.name("div");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
        assertTrue(startTag.isSelfClosing() == false);
        assertNotNull(startTag.getAttributes());

        // Test toString with attributes
        assertEquals("<div>", startTag.toString());
        startTag.getAttributes().put("class", "container");
        assertEquals("<div class=\"container\">", startTag.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameNullValidation() {
        Token.StartTag startTag = new Token.StartTag();
        // tagName is null -> triggers Validate.isFalse in name()
        startTag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "";
        // tagName length is 0 -> triggers Validate.isFalse in name()
        startTag.name();
    }

    @Test
    public void testEndTagToken() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        assertEquals("EndTag", endTag.tokenType());

        endTag.name("span");
        assertEquals("</span>", endTag.toString());
    }

    @Test
    public void testCommentToken() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertEquals("Comment", comment.tokenType());

        comment.data.append("hello");
        comment.bogus = true;
        assertEquals("hello", comment.getData());
        assertEquals("<!--hello-->", comment.toString());

        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacterToken() {
        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        assertEquals("Character", character.tokenType());

        character.data("sample text");
        assertEquals("sample text", character.getData());
        assertEquals("sample text", character.toString());

        character.reset();
        assertNull(character.getData());
    }

    @Test
    public void testEOFToken() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertEquals("EOF", eof.tokenType());

        Token resetEof = eof.reset();
        assertNotNull(resetEof);
    }

    @Test
    public void testTagAppendMethods() {
        Token.StartTag tag = new Token.StartTag();
        // appendTagName when tagName == null (Branch: true)
        tag.appendTagName("div");
        // appendTagName when tagName != null (Branch: false)
        tag.appendTagName('s');
        assertEquals("divs", tag.name());

        // appendAttributeName when pendingAttributeName == null (Branch: true)
        tag.appendAttributeName("id");
        // appendAttributeName when pendingAttributeName != null (Branch: false)
        tag.appendAttributeName('1');
        
        // appendAttributeValue with String (first hit: pendingAttributeValueS != null)
        tag.appendAttributeValue("val1");
        // appendAttributeValue second hit (triggers ensureAttributeValue branch where pendingAttributeValueS != null)
        tag.appendAttributeValue("val2");

        // appendAttributeValue with char
        tag.appendAttributeValue('3');
        // appendAttributeValue with char[]
        tag.appendAttributeValue(new char[]{ '4', '5' });
        // appendAttributeValue with int[] codepoints
        tag.appendAttributeValue(new int[]{ 65, 66 }); // AB

        tag.newAttribute();
        assertNotNull(tag.getAttributes().get("id1"));
    }

    @Test
    public void testTagAttributeVariations() {
        // 1. Boolean attribute (no value, no empty value)
        Token.StartTag tag1 = new Token.StartTag();
        tag1.name("input");
        tag1.appendAttributeName("disabled");
        tag1.newAttribute();
        assertTrue(tag1.getAttributes().hasKey("disabled"));

        // 2. Empty attribute value
        Token.StartTag tag2 = new Token.StartTag();
        tag2.name("input");
        tag2.appendAttributeName("value");
        tag2.setEmptyAttributeValue();
        tag2.newAttribute();
        assertEquals("", tag2.getAttributes().get("value"));

        // 3. Attribute value with length == 0 but pendingAttributeValueS present
        Token.StartTag tag3 = new Token.StartTag();
        tag3.name("div");
        tag3.appendAttributeName("class");
        // appendAttributeValue sets pendingAttributeValueS = "foo", length of pendingAttributeValue is 0
        tag3.appendAttributeValue("foo");
        tag3.newAttribute();
        assertEquals("foo", tag3.getAttributes().get("class"));
        
        // 4. finaliseTag with pendingAttributeName not null
        tag3.appendAttributeName("title");
        tag3.appendAttributeValue("bar");
        tag3.finaliseTag();
        assertEquals("bar", tag3.getAttributes().get("title"));
    }

    @Test
    public void testTagResetAndCasting() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());

        Token resetToken = tag.reset();
        assertNull(resetToken.asStartTag().tagName);
        assertFalse(resetToken.asStartTag().isSelfClosing());
    }
}