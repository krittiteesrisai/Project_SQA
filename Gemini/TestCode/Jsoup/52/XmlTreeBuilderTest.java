package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testInitialiseParseAndBasicStructure() {
        String xml = "<root><child/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertNotNull(doc.child(0));
        assertEquals("root", doc.child(0).nodeName());
    }

    @Test
    public void testProcessStartTagAndEndTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("<root>Text</root>", "", ParseErrorList.noTracking());
        
        // StartTag
        Token.StartTag start = new Token.StartTag();
        start.name("root");
        assertTrue(builder.process(start));

        // Character
        Token.Character ch = new Token.Character();
        ch.data("Hello XML");
        assertTrue(builder.process(ch));

        // EndTag
        Token.EndTag end = new Token.EndTag();
        end.name("root");
        assertTrue(builder.process(end));

        List<Node> nodes = builder.doc.childNodes();
        assertEquals(1, nodes.size());
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void testProcessCommentAndDoctype() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("<!DOCTYPE html><!-- Comment -->", "", ParseErrorList.noTracking());

        // Doctype
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        assertTrue(builder.process(doctype));

        // Comment
        Token.Comment comment = new Token.Comment();
        comment.comment("A comment");
        assertTrue(builder.process(comment));

        // EOF
        Token.EOF eof = new Token.EOF();
        assertTrue(builder.process(eof));

        assertEquals(2, builder.doc.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnexpectedTokenType() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("", "", ParseErrorList.noTracking());
        
        // Pass a bogus/unsupported token or create an anonymous token with invalid type
        Token badToken = new Token.Character() {
            @Override
            public TokenType type() {
                return null; // Triggers default branch Validate.fail
            }
        };
        badToken.type = null;
        builder.process(badToken);
    }

    @Test
    public void testInsertSelfClosingKnownAndUnknownTag() {
        // Unknown self-closing tag
        Document docUnknown = Jsoup.parse("<unknown_tag_xyz/>", "", Parser.xmlParser());
        Element elUnknown = docUnknown.child(0);
        assertTrue(elUnknown.tag().isSelfClosing());

        // Known self-closing tag (e.g., br or img if treated, or custom handled)
        Document docKnown = Jsoup.parse("<br/>", "", Parser.xmlParser());
        assertNotNull(docKnown);
    }

    @Test
    public void testInsertBogusCommentsXmlDeclarations() {
        // 1. Bogus comment starting with '?' (Processing Instruction / xml declaration)
        Document doc1 = Jsoup.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "", Parser.xmlParser());
        assertEquals(1, doc1.childNodes().size());
        assertTrue(doc1.childNode(0) instanceof XmlDeclaration);
        
        // 2. Bogus comment starting with '!'
        Document doc2 = Jsoup.parse("<!DOCTYPE note>", "", Parser.xmlParser());
        // Depending on parser, doctype or comment handling: test explicit bogus comment via fragment or direct insert if accessible
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("", "", ParseErrorList.noTracking());
        
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.comment("!DOCTYPE test");
        builder.insert(commentToken);
        
        assertTrue(builder.doc.childNode(0) instanceof XmlDeclaration);
    }

    @Test
    public void testInsertBogusCommentEdgeCases() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("", "", ParseErrorList.noTracking());

        // Bogus comment with length <= 1
        Token.Comment c1 = new Token.Comment();
        c1.bogus = true;
        c1.comment("!");
        builder.insert(c1);

        // Bogus comment not starting with '!' or '?'
        Token.Comment c2 = new Token.Comment();
        c2.bogus = true;
        c2.comment("hello");
        builder.insert(c2);

        // Normal non-bogus comment
        Token.Comment c3 = new Token.Comment();
        c3.bogus = false;
        c3.comment("normal");
        builder.insert(c3);

        assertEquals(3, builder.doc.childNodes().size());
        assertTrue(builder.doc.childNode(0) instanceof Comment);
        assertTrue(builder.doc.childNode(1) instanceof Comment);
        assertTrue(builder.doc.childNode(2) instanceof Comment);
    }

    @Test
    public void testPopStackToCloseNotFound() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse("<root></root>", "", ParseErrorList.noTracking());
        
        // Try to close a tag that is not in the stack
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("nonexistent");
        
        // Should execute 'if (firstFound == null) return;' safely without exception
        builder.process(endTag);
        assertFalse(builder.stack.isEmpty());
    }

    @Test
    public void testParseFragment() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<item>A</item><item>B</item>", "", ParseErrorList.noTracking());
        assertEquals(2, nodes.size());
        assertEquals("item", nodes.get(0).nodeName());
    }
}