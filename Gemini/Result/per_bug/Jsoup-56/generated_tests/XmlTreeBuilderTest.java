package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testDefaultSettings() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = treeBuilder.defaultSettings();
        assertNotNull(settings);
        // Verify preserveCase is active
        assertEquals("TestTag", settings.normalizeTag("TestTag"));
    }

    @Test
    public void testParseSimpleXml() {
        String xml = "<Root><Child attr=\"val\">Text</Child></Root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("Root", doc.child(0).tagName());
        assertEquals("Child", doc.child(0).child(0).tagName());
        assertEquals("Text", doc.child(0).child(0).text());
        assertEquals("val", doc.child(0).child(0).attr("attr"));
    }

    @Test
    public void testSelfClosingKnownAndUnknownTags() {
        // Known self-closing tag (e.g., img or br if treated, or custom unknown tag)
        String xml = "<root><img/><customUnknownTag/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        Element root = doc.child(0);
        assertEquals(2, root.children().size());
        assertEquals("customUnknownTag", root.child(1).tagName());
    }

    @Test
    public void testXmlDeclarationAndBogusComments() {
        // Triggers XmlDeclaration parsing in insert(Token.Comment)
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><!-- normal comment --><!DOCTYPE note [<!ENTITY ent \"value\">]></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        // Verify XML declaration is parsed as XmlDeclaration node
        boolean foundDecl = false;
        boolean foundDoctype = false;
        for (Node node : doc.childNodes()) {
            if (node instanceof XmlDeclaration) {
                foundDecl = true;
                assertEquals("xml", ((XmlDeclaration) node).tagName());
                assertEquals("1.0", node.attr("version"));
            }
            if (node instanceof DocumentType) {
                foundDoctype = true;
            }
        }
        assertTrue("Should contain XML Declaration", foundDecl);
        assertTrue("Should contain Doctype", foundDoctype);
    }

    @Test
    public void testBogusCommentEdgeCases() {
        // Bogus comments that do not start with ! or ?, or length <= 1
        String xml = "<root><!--?--><!-!--></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals(2, doc.child(0.max(0)).childNodes().size());
    }

    @Test
    public void testPopStackToCloseNotFound() {
        // EndTag does not match any element on stack -> firstFound == null branch
        String xml = "<root><child></wrong></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        // Should handle gracefully without throwing exception
    }

    @Test
    public void testPopStackToCloseMultiple() {
        // Multiple elements on stack, closing an inner/nested or missing tag
        String xml = "<root><a><b></b></a></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
        assertEquals("a", doc.child(0).child(0).tagName());
    }

    @Test
    public void testParseFragment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String fragment = "<node1/><node2>Text</node2>";
        List<Node> nodes = treeBuilder.parseFragment(fragment, "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("node1", ((Element) nodes.get(0)).tagName());
        assertEquals("node2", ((Element) nodes.get(1)).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnexpectedTokenType() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("", "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        
        // Pass a dummy or null/unsupported token type to trigger default Validate.fail branch
        Token.TokenType unsupportedType = null; 
        // Since Token.TokenType is an enum, we can construct a Token with a manipulated type or pass a mock-like approach if possible,
        // Alternatively, use an EOF or valid token to test, but let's test via direct subclass or invalid token if accessible.
        // If direct instantiation of Token with custom type isn't straightforward due to package visibility, 
        // we can trigger it via a malformed structure or pass an EOF token properly.
        // For safety with strict classpath (no Mockito), we test standard EOF token processing:
        Token.EOF eofToken = new Token.EOF();
        boolean result = treeBuilder.process(eofToken);
        assertTrue(result);

        // Force an unexpected token or exception by passing a token with null type if setter allows, 
        // or trigger Validate.fail directly if reachable. 
        // Let's invoke process with a custom anonymous Token with a fake type if allowed, 
        // otherwise assert the default behavior handles standard tokens safely.
        Token bogusToken = new Token.Character("test");
        bogusToken.type = null; // triggers default switch branch
        treeBuilder.process(bogusToken);
    }
}