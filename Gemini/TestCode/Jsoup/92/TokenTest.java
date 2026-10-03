package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testResetStringBuilderNull() {
        // Test reset with null StringBuilder (Branch coverage: sb != null -> false)
        Token.reset(null);
        // Should not throw NullPointerException
    }

    @Test
    public void testResetStringBuilderValid() {
        // Test reset with valid StringBuilder (Branch coverage: sb != null -> true)
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
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());

        doctype.reset();
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameValidationNull() {
        Token.StartTag tag = new Token.StartTag();
        // tagName is null, should throw exception via Validate.isFalse
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameValidationEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        // tagName length is 0, should throw exception
        tag.name();
    }

    @Test
    public void testTagAttributesHandling() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");

        // 1. Test empty attribute value (hasEmptyAttributeValue = true)
        tag.appendAttributeName("disabled");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        // 2. Test pending attribute value with single String (hasPendingAttributeValue = true, pendingAttributeValueS != null)
        tag.appendAttributeName("class");
        tag.appendAttributeValue("container");
        tag.newAttribute();

        // 3. Test pending attribute value with multiple appends triggering ensureAttributeValue() transition
        tag.appendAttributeName("id");
        tag.appendAttributeValue("main-");
        tag.appendAttributeValue("content"); // triggers ensureAttributeValue branch
        tag.newAttribute();

        // 4. Test attribute with null value (no value set)
        tag.appendAttributeName("data-test");
        tag.newAttribute();

        // 5. Test whitespace-only attribute name (should be trimmed and ignored due to length == 0)
        tag.appendAttributeName("   ");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals("", attrs.get("disabled"));
        assertEquals("container", attrs.get("class"));
        assertEquals("main-content", attrs.get("id"));
        assertEquals("", attrs.get("data-test")); // null values in attributes might return empty or null depending on Attributes implementation
        assertFalse(attrs.hasKey("   "));

        // Test finaliseTag when pendingAttributeName != null
        tag.appendAttributeName("title");
        tag.appendAttributeValue("tooltip");
        tag.finaliseTag();
        assertEquals("tooltip", tag.getAttributes().get("title"));
    }

    @Test
    public void testTagAppendMethodsEdgeCases() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("span");

        // Test appendTagName with char and string
        tag.appendTagName('a');
        tag.appendTagName("r");
        assertEquals("ar", tag.name());
        assertEquals("ar", tag.normalName());

        // Test appendAttributeName with char
        tag.appendAttributeName('x');
        tag.appendAttributeValue(new char[]{'v', 'a', 'l'});
        tag.appendAttributeValue(new int[]{65, 66}); // "AB" via codepoints
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertEquals("valAB", attrs.get("x"));

        // Test reset on Tag
        tag.reset();
        assertNull(tag.getAttributes());
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testCommentToken() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertEquals("Comment", comment.tokenType());
        
        comment.data.append("test comment");
        comment.bogus = true;
        assertEquals("test comment", comment.getData());
        assertEquals("<!--test comment-->", comment.toString());

        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacterAndCDataToken() {
        Token.Character character = new Token.Character();
        character.data("hello");
        assertTrue(character.isCharacter());
        assertFalse(character.isCData());
        assertEquals("hello", character.getData());
        assertEquals("hello", character.toString());

        character.reset();
        assertNull(character.getData());

        Token.CData cdata = new Token.CData("content");
        assertTrue(character.isCharacter() || cdata.isCData());
        assertTrue(cdata.isCData());
        assertEquals("<![CDATA[content]]>", cdata.toString());
    }

    @Test
    public void testEndTagAndEOFToken() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertTrue(endTag.isEndTag());
        assertEquals("</div&gt;", endTag.toString().replace(">", "&gt;")); // Avoid strict XML escapes in assertion if needed, or standard:
        assertEquals("</div>", endTag.toString());

        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertEquals("EOF", eof.tokenType());
        assertSame(eof, eof.reset());
    }
}