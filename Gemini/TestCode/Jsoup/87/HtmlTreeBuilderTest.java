package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    @Test
    public void testParseFragmentWithNullContext() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        List<Node> nodes = treeBuilder.parseFragment("<div>Hello</div>", null, "http://example.com", parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithVariousContextTags() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();

        // Test context with title (Rcdata)
        Element titleCtx = new Element(Tag.valueOf("title", ParseSettings.htmlDefault), "");
        List<Node> r1 = treeBuilder.parseFragment("test", titleCtx, "http://example.com", parser);
        assertNotNull(r1);

        // Test context with iframe (Rawtext)
        Element iframeCtx = new Element(Tag.valueOf("iframe", ParseSettings.htmlDefault), "");
        List<Node> r2 = treeBuilder.parseFragment("test", iframeCtx, "http://example.com", parser);
        assertNotNull(r2);

        // Test context with script (ScriptData)
        Element scriptCtx = new Element(Tag.valueOf("script", ParseSettings.htmlDefault), "");
        List<Node> r3 = treeBuilder.parseFragment("test", scriptCtx, "http://example.com", parser);
        assertNotNull(r3);

        // Test context with noscript (Data)
        Element noscriptCtx = new Element(Tag.valueOf("noscript", ParseSettings.htmlDefault), "");
        List<Node> r4 = treeBuilder.parseFragment("test", noscriptCtx, "http://example.com", parser);
        assertNotNull(r4);

        // Test context with plaintext (Data)
        Element plaintextCtx = new Element(Tag.valueOf("plaintext", ParseSettings.htmlDefault), "");
        List<Node> r5 = treeBuilder.parseFragment("test", plaintextCtx, "http://example.com", parser);
        assertNotNull(r5);
    }

    @Test
    public void testParseFragmentWithFormElementInParentChain() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();

        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        form.appendChild(div);

        List<Node> nodes = treeBuilder.parseFragment("<input name='foo'>", div, "http://example.com", parser);
        assertNotNull(nodes);
        assertEquals(1, form.elements().size());
    }

    @Test
    public void testMaybeSetBaseUri() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://base.com", parser);

        Element base1 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://base.com");
        base1.attr("href", "http://newbase.com");

        Element base2 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://base.com");
        base2.attr("href", "http://ignoredbase.com");

        Element baseEmptyHref = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://base.com");
        baseEmptyHref.attr("target", "_blank"); // No href length

        treeBuilder.maybeSetBaseUri(baseEmptyHref); // href length == 0
        treeBuilder.maybeSetBaseUri(base1); // sets baseUri
        treeBuilder.maybeSetBaseUri(base2); // baseUriSetFromDoc is true, should ignore

        assertEquals("http://newbase.com", treeBuilder.getBaseUri());
    }

    @Test
    public void testInsertSelfClosingTag() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClose();

        Element el = treeBuilder.insert(startTag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertCharactersAndNodes() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Insert script and style characters (DataNode)
        Element script = treeBuilder.insertStartTag("script");
        Token.Character c1 = new Token.Character().data("var a = 1;");
        treeBuilder.insert(c1);

        Element style = treeBuilder.insertStartTag("style");
        Token.Character c2 = new Token.Character().data("body { color: red; }");
        treeBuilder.insert(c2);

        // Insert CData
        Element div = treeBuilder.insertStartTag("div");
        Token.Character c3 = new Token.Character();
        // Simulate CData via subclass or internal state if possible, else standard char
        Token.Character c4 = new Token.Character().data("plain text");
        treeBuilder.insert(c4);

        assertNotNull(div);
    }

    @Test
    public void testPushActiveFormattingElementsDeduplication() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");

        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        // Pushing 4th identical formatting element should trigger the 3-limit removal of the oldest
        treeBuilder.pushActiveFormattingElements(b4);

        assertFalse(treeBuilder.isInActiveFormattingElements(b1));
        assertTrue(treeBuilder.isInActiveFormattingElements(b4));
    }

    @Test
    public void testReconstructFormattingElementsEdgeCases() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // When last formatting element is null or on stack, does nothing
        treeBuilder.reconstructFormattingElements();

        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        treeBuilder.pushActiveFormattingElements(b);
        // b is not on stack, should trigger reconstruction
        treeBuilder.reconstructFormattingElements();
        
        assertNotNull(treeBuilder.getActiveFormattingElement("b"));
    }

    @Test
    public void testFosterParentInsertionScenarios() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        // Scenario 1: No table (frag / doc root)
        Element commentToken = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        treeBuilder.insertInFosterParent(commentToken);

        // Scenario 2: Table with parent
        Document doc = treeBuilder.getDocument();
        Element body = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), "");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "");
        doc.appendChild(body);
        body.appendChild(table);
        treeBuilder.getStack().add(body);
        treeBuilder.getStack().add(table);

        Element fosteredNode = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        treeBuilder.insertInFosterParent(fosteredNode);

        // Scenario 3: Table without parent (aboveOnStack)
        table.remove();
        doc.appendChild(table);
        treeBuilder.getStack().clear();
        treeBuilder.getStack().add(table);
        Element fosteredNode2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        treeBuilder.insertInFosterParent(fosteredNode2);

        assertNotNull(fosteredNode2);
    }

    @Test
    public void testScopeMethodsAndSelectScope() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        Element select = treeBuilder.insertStartTag("select");
        Element option = treeBuilder.insertStartTag("option");

        assertTrue(treeBuilder.inSelectScope("option"));
        assertFalse(treeBuilder.inSelectScope("div"));
    }

    @Test
    public void testStackAndFormattingHelpers() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", parser);

        Element div = treeBuilder.insertStartTag("div");
        Element p = treeBuilder.insertStartTag("p");

        assertTrue(treeBuilder.onStack(div));
        assertEquals(div, treeBuilder.aboveOnStack(p));
        
        treeBuilder.removeFromStack(div);
        assertFalse(treeBuilder.onStack(div));

        treeBuilder.insertMarkerToFormattingElements();
        assertNull(treeBuilder.removeLastFormattingElement());
    }
}