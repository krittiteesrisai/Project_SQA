package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testTokenTypeAndCasting() {
        // Doctype
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertEquals(doctype, doctype.asDoctype());
        assertEquals("Doctype", doctype.tokenType());

        // StartTag
        Token.StartTag startTag = new Token.StartTag("div");
        assertTrue(startTag.isStartTag());
        assertEquals(startTag, startTag.asStartTag());
        assertEquals("StartTag", startTag.tokenType());

        // EndTag
        Token.EndTag endTag = new Token.EndTag("div");
        assertTrue(endTag.isEndTag());
        assertEquals(endTag, endTag.asEndTag());
        assertEquals("EndTag", endTag.tokenType());

        // Comment
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertEquals(comment, comment.asComment());
        assertEquals("Comment", comment.tokenType());

        // Character
        Token.Character character = new Token.Character("test");
        assertTrue(character.isCharacter());
        assertEquals(character, character.asCharacter());
        assertEquals("Character", character.tokenType());

        // EOF
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testDoctypeGetters() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameValidationEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name(""); // Should trigger Validate.isFalse(tagName.length() == 0)
    }

    @Test
    public void testTagAttributeHandling() {
        Token.StartTag tag = new Token.StartTag("a");

        // 1. attributes == null (Force null via direct manipulation or test branch where attributes is initialized)
        // StartTag constructor initializes attributes, let's test tag lifecycle
        tag.attributes = null;
        tag.newAttribute(); // Should initialize attributes since it's null
        assertNotNull(tag.getAttributes());

        // 2. pendingAttributeName != null, pendingAttributeValue == null -> defaults to ""
        tag.appendAttributeName("href");
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("href"));

        // 3. pendingAttributeName != null, pendingAttributeValue != null
        tag.appendAttributeName("class");
        tag.appendAttributeValue("btn");
        tag.appendAttributeValue(' ');
        tag.appendAttributeValue("primary");
        tag.newAttribute();
        assertEquals("btn primary", tag.getAttributes().get("class"));

        // 4. finaliseTag with pendingAttributeName
        tag.appendAttributeName("id");
        tag.finaliseTag();
        assertEquals("", tag.getAttributes().get("id"));
    }

    @Test
    public void testTagAppendersBranchCoverage() {
        Token.StartTag tag = new Token.StartTag();
        
        // appendTagName null to not-null
        tag.appendTagName("span");
        assertEquals("span", tag.name());
        // appendTagName not-null concat
        tag.appendTagName('2');
        assertEquals("span2", tag.name());

        // appendAttributeName null to not-null & char overload
        tag.appendAttributeName("data-");
        tag.appendAttributeName('id');
        
        // appendAttributeValue null to not-null & char overload
        tag.appendAttributeValue("val");
        tag.appendAttributeValue('1');
        
        tag.newAttribute();
        assertEquals("val1", tag.getAttributes().get("data-id"));
    }

    @Test
    public void testTagSelfClosingAndGetters() {
        Token.StartTag tag = new Token.StartTag("br");
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testStartTagToStringVariants() {
        // Without attributes
        Token.StartTag tag1 = new Token.StartTag("br");
        assertEquals("<br>", tag1.toString());

        // With attributes
        Token.StartTag tag2 = new Token.StartTag("div");
        tag2.appendAttributeName("id");
        tag2.appendAttributeValue("main");
        tag2.newAttribute();
        assertEquals("<div id=\"main\">", tag2.toString());
    }

    @Test
    public void testEndTagToString() {
        Token.EndTag endTag = new Token.EndTag("div");
        assertEquals("</div>", endTag.toString());
    }

    @Test
    public void testCommentAndCharacterToString() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("comment text");
        assertEquals("<!--comment text-->", comment.toString());
        assertEquals("comment text", comment.getData());

        Token.Character character = new Token.Character("hello");
        assertEquals("hello", character.toString());
        assertEquals("hello", character.getData());
    }
}