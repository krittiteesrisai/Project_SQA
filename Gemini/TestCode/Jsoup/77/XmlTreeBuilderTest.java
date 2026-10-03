package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testDefaultSettingsAndParsers() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertEquals(ParseSettings.preserveCase, builder.defaultSettings());

        Document docFromString = builder.parse("<root>Data</root>", "http://example.com");
        assertNotNull(docFromString);
        assertEquals("root", docFromString.child(0).tagName());

        Document docFromReader = builder.parse(new StringReader("<root>Reader</root>"), "http://example.com");
        assertNotNull(docFromReader);
        assertEquals("root", docFromReader.child(0).tagName());
        assertEquals(Document.OutputSettings.Syntax.xml, docFromReader.outputSettings().syntax());
    }

    @Test
    public void testProcessStartAndEndTags() {
        String xml = "<root><child>Text</child></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals("root", doc.child(0).nodeName());
        assertEquals("child", doc.child(0).child(0).nodeName());
        assertEquals("Text", doc.child(0).child(0).text());
    }

    @Test
    public void testProcessCommentsAndDoctype() {
        String xml = "<!DOCTYPE note SYSTEM 'Note.dtd'><root><!-- Comment --></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc.documentType());
        assertEquals("note", doc.documentType().name());
        
        // Check comment node exists
        boolean foundComment = false;
        for (Node node : doc.child(0).childNodes()) {
            if (node instanceof Comment) {
                foundComment = true;
                assertEquals(" Comment ", ((Comment) node).getData());
            }
        }
        assertTrue("Comment should be present", foundComment);
    }

    @Test
    public void testBogusCommentsAndXmlDeclaration() {
        // XML declaration is parsed as bogus comment in Jsoup XML parser
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        boolean foundXmlDecl = false;
        for (Node node : doc.childNodes()) {
            if (node instanceof XmlDeclaration) {
                foundXmlDecl = true;
                assertEquals("xml", ((XmlDeclaration) node).tagName());
                assertEquals("1.0", node.attr("version"));
            }
        }
        assertTrue("XmlDeclaration should be parsed from bogus comment", foundXmlDecl);

        // Test bogus comment with exclamation start (![if ...]) or invalid length
        String xmlInvalidBogus = "<?><!><!a><root/>";
        Document doc2 = Jsoup.parse(xmlInvalidBogus, "", Parser.xmlParser());
        assertNotNull(doc2);
    }

    @Test
    public void testCDataNodeInsertion() {
        String xml = "<root><![CDATA[CData content & <tag>]]></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals(1, root.childNodeSize());
        Node child = root.childNode(0);
        assertTrue(child instanceof CDataNode);
        assertEquals("CData content & <tag>", ((CDataNode) child).text());
    }

    @Test
    public void testSelfClosingTags() {
        // Known tag self-closing vs Unknown tag self-closing
        String xml = "<root><br/><unknown-custom-tag attr=\"val\"/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        
        assertEquals(2, root.childNodeSize());
        assertTrue(root.child(0).tag().isSelfClosing());
        assertTrue(root.child(1).tag().isSelfClosing());
    }

    @Test
    public void testPopStackToCloseEdgeCases() {
        // Case 1: End tag does not match anything on stack (should skip gracefully)
        // Case 2: Nested mismatched tags or closing tags not in stack
        String xml = "<root><child></child></root></orphan>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void testParseFragment() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<item>A</item><item>B</item>", "http://example.com", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        assertEquals("item", nodes.get(0).nodeName());
        assertEquals("item", nodes.get(1).nodeName());
    }
}