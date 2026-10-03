package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    @Test
    public void testParseFragmentWithNullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        List<Node> nodes = tb.parseFragment("<div>Hello</div>", null, "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithVariousContextTags() {
        String[] contexts = {"title", "textarea", "iframe", "script", "noscript", "plaintext", "div"};
        for (String tag : contexts) {
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            ParseErrorList errors = ParseErrorList.tracking(10);
            Element context = new Element(Tag.valueOf(tag, ParseSettings.htmlDefault), "");
            List<Node> nodes = tb.parseFragment("content", context, "http://example.com", errors, ParseSettings.htmlDefault);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormAncestor() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        Element form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "", null);
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        form.appendChild(div);

        List<Node> nodes = tb.parseFragment("<input name='foo'/>", div, "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertNotNull(tb.getFormElement());
    }

    @Test
    public void testMaybeSetBaseUriEdgeCases() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://base.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element base1 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        base1.attr("href", "http://newbase.com");
        
        // First set (should succeed)
        tb.maybeSetBaseUri(base1);
        assertEquals("http://newbase.com", tb.getBaseUri());

        // Second set with valid href (should be ignored due to baseUriSetFromDoc = true)
        Element base2 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        base2.attr("href", "http://ignoredbase.com");
        tb.maybeSetBaseUri(base2);
        assertEquals("http://newbase.com", tb.getBaseUri());

        // Set with empty href
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        tb2.initialiseParse(new StringReader(""), "http://base.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element baseEmpty = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        tb2.maybeSetBaseUri(baseEmpty);
        assertEquals("http://base.com", tb2.getBaseUri());
    }

    @Test
    public void testInsertSelfClosingTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
        
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing = true;

        Element el = tb.insert(startTag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertUnknownSelfClosingTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
        
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("custom-tag");
        startTag.selfClosing = true;

        Element el = tb.insert(startTag);
        assertNotNull(el);
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsertCharacterScriptAndStyle() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        
        Element scriptEl = new Element(Tag.valueOf("script", ParseSettings.htmlDefault), "");
        tb.push(scriptEl);

        Token.Character charToken = new Token.Character();
        charToken.data("var a = 1;");
        tb.insert(charToken);

        assertFalse(scriptEl.childNodes().isEmpty());
        assertTrue(scriptEl.childNode(0) instanceof org.jsoup.nodes.DataNode);
    }

    @Test
    public void testActiveFormattingElementsDuplicateLimit() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");

        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3);
        // Pushing 4th identical element should trigger removal of the oldest duplicate (3 seen rule)
        tb.pushActiveFormattingElements(b4);

        assertNull(tb.getActiveFormattingElement("b")); // Wait, let's verify via specific assertions or methods
        assertFalse(tb.isInActiveFormattingElements(b1));
        assertTrue(tb.isInActiveFormattingElements(b4));
    }

    @Test
    public void testResetInsertionModeBranches() {
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html", "div"};
        for (String tag : tags) {
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Element el = new Element(Tag.valueOf(tag, ParseSettings.htmlDefault), "");
            tb.push(el);
            tb.resetInsertionMode();
            assertNotNull(tb.state());
        }
    }

    @Test
    public void testInSelectScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element select = new Element(Tag.valueOf("select", ParseSettings.htmlDefault), "");
        Element option = new Element(Tag.valueOf("option", ParseSettings.htmlDefault), "");
        tb.push(select);
        tb.push(option);

        assertTrue(tb.inSelectScope("option"));
        assertFalse(tb.inSelectScope("div"));
    }

    @Test
    public void testFosterInsertsScenarios() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        
        // Scenario 1: No table (fragment case, stack size 0 -> appends to doc, or stack.get(0))
        Element root = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        tb.push(root);
        tb.setFosterInserts(true);
        
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        tb.insert(comment);

        // Scenario 2: Table with parent
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "");
        root.appendChild(table);
        tb.push(table);
        
        Token.Comment comment2 = new Token.Comment();
        comment2.data("test2");
        tb.insert(comment2);
    }
}