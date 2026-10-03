package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void testInitialiseParse() {
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.htmlDefault;
        treeBuilder.initialiseParse(new StringReader("<html></html>"), "http://example.com", errors, settings);

        assertNotNull(treeBuilder.state());
        assertEquals("http://example.com", treeBuilder.getBaseUri());
        assertFalse(treeBuilder.isFragmentParsing());
        assertNull(treeBuilder.getHeadElement());
        assertNull(treeBuilder.getFormElement());
    }

    @Test
    public void testParseFragmentWithNullContext() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        List<Node> nodes = treeBuilder.parseFragment("<div>Hello</div>", null, "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertFalse(treeBuilder.isFragmentParsing()); // reset after run or handled
    }

    @Test
    public void testParseFragmentWithVariousContextTags() {
        ParseErrorList errors = ParseErrorList.noTracking();
        
        // Test context tags mapping to different tokeniser states
        String[] contextTags = {"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tagName : contextTags) {
            Element context = new Element(Tag.valueOf(tagName), "http://example.com");
            List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", errors, ParseSettings.htmlDefault);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormContext() {
        ParseErrorList errors = ParseErrorList.noTracking();
        Document doc = Document.createShell("http://example.com");
        FormElement form = (FormElement) doc.createElement("form");
        Element input = doc.createElement("input");
        form.appendChild(input);

        List<Node> nodes = treeBuilder.parseFragment("<span>text</span>", input, "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertNotNull(treeBuilder.getFormElement());
    }

    @Test
    public void testProcessTokenAndState() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        boolean result = treeBuilder.process(startTag);
        assertTrue(result);

        // Test process with explicit state
        boolean stateResult = treeBuilder.process(startTag, HtmlTreeBuilderState.InBody);
        assertTrue(stateResult);
    }

    @Test
    public void testStateTransitionsAndSetters() {
        treeBuilder.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InTable, treeBuilder.state());

        treeBuilder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, treeBuilder.originalState());

        treeBuilder.framesetOk(false);
        assertFalse(treeBuilder.framesetOk());

        treeBuilder.setFosterInserts(true);
        assertTrue(treeBuilder.isFosterInserts());

        FormElement formEl = new FormElement(Tag.valueOf("form"), "http://example.com", null);
        treeBuilder.setFormElement(formEl);
        assertEquals(formEl, treeBuilder.getFormElement());

        Element headEl = new Element(Tag.valueOf("head"), "http://example.com");
        treeBuilder.setHeadElement(headEl);
        assertEquals(headEl, treeBuilder.getHeadElement());
    }

    @Test
    public void testMaybeSetBaseUri() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        Element base1 = new Element(Tag.valueOf("base"), "http://example.com");
        base1.attr("href", "http://new-base.com");

        treeBuilder.maybeSetBaseUri(base1);
        assertEquals("http://new-base.com", treeBuilder.getBaseUri());

        // Try setting another base uri, should be ignored because baseUriSetFromDoc is true
        Element base2 = new Element(Tag.valueOf("base"), "http://example.com");
        base2.attr("href", "http://ignored-base.com");
        treeBuilder.maybeSetBaseUri(base2);
        assertEquals("http://new-base.com", treeBuilder.getBaseUri());

        // Test with empty href length
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        tb2.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        Element baseEmpty = new Element(Tag.valueOf("base"), "http://example.com");
        baseEmpty.attr("href", "");
        tb2.maybeSetBaseUri(baseEmpty);
        assertEquals("http://example.com", tb2.getBaseUri());
    }

    @Test
    public void testErrorHandling() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        treeBuilder.currentToken = tag;
        
        treeBuilder.error(HtmlTreeBuilderState.InBody);
        assertFalse(errors.isEmpty());
    }

    @Test
    public void testInsertStartTagAndSelfClosing() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        Element el = treeBuilder.insertStartTag("span");
        assertNotNull(el);
        assertEquals("span", el.tagName());

        // Self-closing start tag
        Token.StartTag selfClosingTag = new Token.StartTag();
        selfClosingTag.name("br");
        selfClosingTag.selfClose();
        Element scEl = treeBuilder.insert(selfClosingTag);
        assertNotNull(scEl);
        assertEquals("br", scEl.tagName());

        // Unknown self-closing tag
        Token.StartTag unknownScTag = new Token.StartTag();
        unknownScTag.name("custom-tag");
        unknownScTag.selfClose();
        Element ucEl = treeBuilder.insert(unknownScTag);
        assertNotNull(ucEl);
        assertTrue(ucEl.tag().isSelfClosing());
    }

    @Test
    public void testInsertCommentAndCharacters() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        // Insert into doc when stack is empty
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        treeBuilder.insert(commentToken);

        // Push an element for character insertion
        Element div = treeBuilder.insertStartTag("div");
        Token.Character charToken = new Token.Character();
        charToken.data("Hello World");
        treeBuilder.insert(charToken);
        assertEquals(1, div.childNodeSize());

        // Insert into script/style tag (DataNode)
        Element script = treeBuilder.insertStartTag("script");
        Token.Character scriptToken = new Token.Character();
        scriptToken.data("var a = 1;");
        treeBuilder.insert(scriptToken);
        assertTrue(script.childNode(0) instanceof org.jsoup.nodes.DataNode);
    }

    @Test
    public void testStackOperations() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");

        treeBuilder.push(div);
        treeBuilder.push(span);

        assertTrue(treeBuilder.onStack(div));
        assertTrue(treeBuilder.onStack(span));
        assertEquals(span, treeBuilder.currentElement());

        assertEquals(span, treeBuilder.getFromStack("span"));
        assertNull(treeBuilder.getFromStack("p"));

        assertEquals(div, treeBuilder.aboveOnStack(span));

        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        treeBuilder.replaceOnStack(span, p);
        assertFalse(treeBuilder.onStack(span));
        assertTrue(treeBuilder.onStack(p));

        assertTrue(treeBuilder.removeFromStack(p));
        assertFalse(treeBuilder.removeFromStack(p));

        treeBuilder.push(div);
        treeBuilder.push(p);
        treeBuilder.popStackToClose("div");
        assertFalse(treeBuilder.onStack(div));

        // Test popStackToClose with array
        treeBuilder.push(new Element(Tag.valueOf("ul"), "http://example.com"));
        treeBuilder.popStackToClose(new String[]{"ul", "ol"});

        // Test popStackToBefore
        treeBuilder.push(new Element(Tag.valueOf("table"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("tr"), "http://example.com"));
        treeBuilder.popStackToBefore("table");
        assertTrue(treeBuilder.onStack(div));
    }

    @Test
    public void testClearContexts() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        treeBuilder.push(new Element(Tag.valueOf("html"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("table"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("tr"), "http://example.com"));

        treeBuilder.clearStackToTableContext();
        treeBuilder.clearStackToTableBodyContext();
        treeBuilder.clearStackToTableRowContext();
    }

    @Test
    public void testResetInsertionModeAllBranches() {
        ParseErrorList errors = ParseErrorList.noTracking();
        
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String tag : tags) {
            treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
            treeBuilder.push(new Element(Tag.valueOf(tag), "http://example.com"));
            treeBuilder.resetInsertionMode();
        }

        // Test last element branch
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        Element context = new Element(Tag.valueOf("div"), "http://example.com");
        // We can simulate contextElement being set
        List<Node> nodes = treeBuilder.parseFragment("test", context, "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testScopes() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        treeBuilder.push(new Element(Tag.valueOf("div"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("table"), "http://example.com"));

        assertTrue(treeBuilder.inScope("div"));
        assertTrue(treeBuilder.inScope(new String[]{"div"}));
        assertTrue(treeBuilder.inListItemScope("div"));
        assertTrue(treeBuilder.inButtonScope("div"));
        assertTrue(treeBuilder.inTableScope("table"));

        // Select scope test
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        treeBuilder.push(new Element(Tag.valueOf("select"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("option"), "http://example.com"));
        assertTrue(treeBuilder.inSelectScope("option"));
    }

    @Test
    public void testImpliedEndTags() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        treeBuilder.push(new Element(Tag.valueOf("li"), "http://example.com"));
        treeBuilder.generateImpliedEndTags("p");
        treeBuilder.generateImpliedEndTags();
    }

    @Test
    public void testIsSpecial() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(treeBuilder.isSpecial(el));

        Element normalEl = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(treeBuilder.isSpecial(normalEl));
    }

    @Test
    public void testFormattingElements() {
        assertNull(treeBuilder.lastFormattingElement());
        assertNull(treeBuilder.removeLastFormattingElement());

        Element b1 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b2 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b3 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b4 = new Element(Tag.valueOf("b"), "http://example.com");

        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        // Push fourth identical element to trigger the 3-seen limit removal branch
        treeBuilder.pushActiveFormattingElements(b4);

        assertTrue(treeBuilder.isInActiveFormattingElements(b4));
        assertEquals(b4, treeBuilder.getActiveFormattingElement("b"));

        treeBuilder.insertMarkerToFormattingElements();
        assertNotNull(treeBuilder.getActiveFormattingElement("nonexistent"));

        treeBuilder.removeFromActiveFormattingElements(b4);
        treeBuilder.clearFormattingElementsToLastMarker();

        // Reconstruct formatting elements
        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.reconstructFormattingElements();
    }

    @Test
    public void testFosterParenting() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);

        Element table = new Element(Tag.valueOf("table"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        body.appendChild(table);
        treeBuilder.push(body);
        treeBuilder.push(table);

        treeBuilder.setFosterInserts(true);
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode("foster text");
        
        // This will trigger insertInFosterParent where lastTable has parent
        treeBuilder.insert(textNode);
        assertTrue(body.childNodes().contains(textNode));
    }

    @Test
    public void testToString() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", errors, ParseSettings.htmlDefault);
        assertNotNull(treeBuilder.toString());
    }
}