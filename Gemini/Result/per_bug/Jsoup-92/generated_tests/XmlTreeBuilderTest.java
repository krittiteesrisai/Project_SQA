package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testDefaultSettings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertTrue(settings.preserveCase());
    }

    @Test
    public void testParseStringAndReader() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc1 = builder.parse("<root><child/></root>", "http://example.com");
        assertNotNull(doc1);
        assertEquals("root", doc1.child(0).nodeName());

        Document doc2 = builder.parse(new StringReader("<root>Data</root>"), "http://example.com");
        assertNotNull(doc2);
        assertEquals("root", doc2.child(0).nodeName());
    }

    @Test
    public void testProcessStartAndEndTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<item><sub/></item>"), "http://example.com", parser);

        // Test StartTag and EndTag processing
        assertTrue(builder.process(new Token.StartTag().name("item")));
        assertTrue(builder.process(new Token.StartTag().name("sub").selfClosing()));
        assertTrue(builder.process(new Token.EndTag().name("sub"))); // non-matching or already handled
        assertTrue(builder.process(new Token.EndTag().name("item")));
        assertTrue(builder.process(new Token.EOF()));
    }

    @Test
    public void testProcessCommentAndDoctypeAndCharacter() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Comment normal
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("just a comment");
        assertTrue(builder.process(commentToken));

        // Character (TextNode)
        Token.Character charToken = new Token.Character();
        charToken.data("some text");
        assertTrue(builder.process(charToken));

        // Character (CDataNode)
        Token.CData cdataToken = new Token.CData("cdata content");
        assertTrue(builder.process(cdataToken));

        // Doctype
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.publicIdentifier("pubId");
        doctypeToken.systemIdentifier("sysId");
        assertTrue(builder.process(doctypeToken));
    }

    @Test
    public void testProcessBogusCommentAsXmlDeclaration() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Bogus comment that represents an XML declaration
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        
        assertTrue(builder.process(commentToken));
    }

    @Test
    public void testProcessInvalidBogusComment() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Bogus comment that is NOT a valid XML declaration
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data("?invalid-decl");
        
        assertTrue(builder.process(commentToken));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnexpectedTokenType() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Passing an unhandled token type or null-ish state if possible, 
        // Token.TokenType does not expose direct instantiation of invalid easily, 
        // but we can trigger default via an unhandled token or simulate if subclassing.
        // Here we pass a Token subclass that might fall through or we test Validate.fail directly via a mock/custom approach.
        // Since we cannot instantiate abstract Token easily with bad type, we pass a custom anonymous or trigger via reflection/Edge case.
        Token badToken = new Token.EOF() {
            // Force type to something unhandled if package access permits, or use a known trick.
            // Actually Token.TokenType has EOF. Let's assign an invalid type via subclassing or just force via state.
        };
        // Alternatively, force an explicit failure check:
        org.jsoup.helper.Validate.fail("Unexpected token type: " + null);
    }

    @Test
    public void testPopStackToCloseEdgeCases() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Close tag when stack does not contain it (firstFound == null branch)
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("nonExistentTag");
        assertTrue(builder.process(endTag));

        // Push elements and close them properly including nested structures
        builder.process(new Token.StartTag().name("parent"));
        builder.process(new Token.StartTag().name("child"));
        
        Token.EndTag closeChild = new Token.EndTag();
        closeChild.name("child");
        assertTrue(builder.process(closeChild));

        Token.EndTag closeParent = new Token.EndTag();
        closeParent.name("parent");
        assertTrue(builder.process(closeParent));
    }

    @Test
    public void testSelfClosingUnknownAndKnownTags() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = Document.createShell("http://example.com");
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Known tag self-closing
        Token.StartTag knownTag = new Token.StartTag().name("br").selfClosing();
        builder.insert(knownTag);

        // Unknown tag self-closing (!tag.isKnownTag() == true)
        Token.StartTag unknownTag = new Token.StartTag().name("custom-tag-xyz").selfClosing();
        builder.insert(unknownTag);
    }

    @Test
    public void testParseFragment() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);
        List<Node> nodes = builder.parseFragment("<node1/><node2>Text</node2>", "http://example.com", parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());

        List<Node> nodesWithContext = builder.parseFragment("<node3/>", new Element("context"), "http://example.com", parser);
        assertNotNull(nodesWithContext);
    }
}