package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder treeBuilder;
    private Parser parser;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
        parser = new Parser(treeBuilder);
    }

    @Test
    public void testInitialiseParseAndBasicState() {
        StringReader reader = new StringReader("<html><head><title>Test</title></head><body><p>Hello</p></body></html>");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);
        
        assertEquals(HtmlTreeBuilderState.Initial, treeBuilder.state());
        assertNull(treeBuilder.originalState());
        assertFalse(treeBuilder.isFragmentParsing());
        assertEquals("http://example.com", treeBuilder.getBaseUri());
        assertNotNull(treeBuilder.getDocument());
    }

    @Test
    public void testParseFragmentWithNullContext() {
        List<Node> nodes = treeBuilder.parseFragment("<div>Fragment Content</div>", null, "http://example.com", parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertTrue(treeBuilder.isFragmentParsing());
    }

    @Test
    public void testParseFragmentWithVariousContextTags() {
        // Test various context tags triggering different tokeniser transitions and form association
        String[] contextTags = {"title", "textarea", "iframe", "style", "script", "noscript", "plaintext", "div"};
        for (String tagName : contextTags) {
            Element context = new Element(Tag.valueOf(tagName, ParseSettings.htmlDefault), "");
            List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", parser);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormContextAncestor() {
        Document doc = Document.createShell("http://example.com");
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "", null);
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        form.appendChild(div);
        doc.body().appendChild(form);

        List<Node> nodes = treeBuilder.parseFragment("<input name='foo' />", div, "http://example.com", parser);
        assertNotNull(nodes);
    }

    @Test
    public void testMaybeSetBaseUriEdgeCases() {
        StringReader reader = new StringReader("<html><head></head><body></body></html>");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        Element baseElement = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        baseElement.attr("href", "http://new-example.com");
        
        treeBuilder.maybeSetBaseUri(baseElement);
        assertEquals("http://new-example.com", treeBuilder.getBaseUri());

        // Second call should be ignored due to baseUriSetFromDoc = true
        Element baseElement2 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        baseElement2.attr("href", "http://another-example.com");
        treeBuilder.maybeSetBaseUri(baseElement2);
        assertEquals("http://new-example.com", treeBuilder.getBaseUri());

        // Empty href length == 0
        Element baseEmpty = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "");
        treeBuilder.maybeSetBaseUri(baseEmpty);
        assertEquals("http://new-example.com", treeBuilder.getBaseUri());
    }

    @Test
    public void testInsertSelfClosingAndEmptyTags() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        Token.StartTag selfClosingTag = new Token.StartTag();
        selfClosingTag.name("br");
        selfClosingTag.selfClose();
        Element el = treeBuilder.insert(selfClosingTag);
        assertNotNull(el);

        // Unknown self-closing tag
        Token.StartTag unknownTag = new Token.StartTag();
        unknownTag.name("custom-tag");
        unknownTag.selfClose();
        Element elUnknown = treeBuilder.insert(unknownTag);
        assertNotNull(elUnknown);

        // Non-void self-closing tag triggering error condition in insertEmpty
        Token.StartTag divTag = new Token.StartTag();
        divTag.name("div");
        divTag.selfClose();
        Element elDiv = treeBuilder.insertEmpty(divTag);
        assertNotNull(elDiv);
    }

    @Test
    public void testInsertCharactersCDataAndScriptStyle() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        // Insert normal element stack
        Element html = treeBuilder.insertStartTag("html");
        Element script = treeBuilder.insertStartTag("script");

        // CData character token
        Token.Character cdataChar = new Token.Character();
        cdataChar.data("CData content");
        // Simulate CData via subclass or data type if applicable, or test script/style DataNode
        treeBuilder.insert(cdataChar);

        // Style tag content (DataNode)
        treeBuilder.pop(); // pop script
        Element style = treeBuilder.insertStartTag("style");
        Token.Character styleChar = new Token.Character();
        styleChar.data("body { color: red; }");
        treeBuilder.insert(styleChar);

        assertFalse(script.childNodes().isEmpty());
        assertFalse(style.childNodes().isEmpty());
    }

    @Test
    public void testFosterInsertsScenarios() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        treeBuilder.setFosterInserts(true);
        assertTrue(treeBuilder.isFosterInserts());

        // Case 1: Stack empty during insertNode
        TextNode node = new TextNode("foster text");
        // Should append to doc directly when stack is empty
        // We can test insertNode indirectly or via foster methods
        Element table = treeBuilder.insertStartTag("table");
        Element tr = treeBuilder.insertStartTag("tr");
        
        // table has parent (html/body)
        TextNode fosterNode = new TextNode("misplaced");
        treeBuilder.insertInFosterParent(fosterNode);

        // Case 2: table has no parent (lastTable.parent() == null)
        Document docWithoutParent = new Document("");
        // Manually push table without parent to stack
        treeBuilder.getStack().clear();
        Element orphanTable = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "");
        treeBuilder.push(orphanTable);
        treeBuilder.insertInFosterParent(new TextNode("orphan foster"));
    }

    @Test
    public void testStackOperationsAndSearchDepths() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        Element div = treeBuilder.insertStartTag("div");
        Element p = treeBuilder.insertStartTag("p");

        assertTrue(treeBuilder.onStack(div));
        assertTrue(treeBuilder.onStack(p));
        assertEquals(p, treeBuilder.currentElement());
        assertEquals(div, treeBuilder.aboveOnStack(p));
        assertNull(treeBuilder.aboveOnStack(div));

        // Test max scope search depth boundary and scope checks
        for (int i = 0; i < HtmlTreeBuilderMaxScopeDepthTestHelper.getMaxDepth() + 5; i++) {
            treeBuilder.push(new Element(Tag.valueOf("span", ParseSettings.htmlDefault), ""));
        }

        assertFalse(treeBuilder.inScope("div"));
        assertTrue(treeBuilder.inButtonScope("button"));
        assertTrue(treeBuilder.inListItemScope("li"));
        assertTrue(treeBuilder.inTableScope("table"));
    }

    @Test
    public void testSelectScopeAndEdgeStackMethods() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        treeBuilder.insertStartTag("select");
        treeBuilder.insertStartTag("option");

        assertTrue(treeBuilder.inSelectScope("option"));
        
        // Pop stack variations
        treeBuilder.popStackToClose("option");
        treeBuilder.popStackToBefore("select");
        treeBuilder.clearStackToTableContext();
        treeBuilder.clearStackToTableBodyContext();
        treeBuilder.clearStackToTableRowContext();
    }

    @Test(expected = AssertionError.class)
    public void testSelectScopeInvalidStateTriggersAssertion() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);
        treeBuilder.insertStartTag("div");
        // Should fail because 'div' is not valid in select scope without hitting select-specific tags
        treeBuilder.inSelectScope("target");
    }

    @Test
    public void testActiveFormattingElementsAndReconstruction() {
        StringReader reader = new StringReader("");
        treeBuilder.initialiseParse(reader, "http://example.com", parser);

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");

        // Push duplicate formatting elements to trigger removal when numSeen == 3
        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        treeBuilder.pushActiveFormattingElements(b4);

        assertNotNull(treeBuilder.lastFormattingElement());
        assertTrue(treeBuilder.isInActiveFormattingElements(b4));

        treeBuilder.insertMarkerToFormattingElements();
        assertNull(treeBuilder.getActiveFormattingElement("nonexistent"));
        assertNotNull(treeBuilder.getActiveFormattingElement("b"));

        treeBuilder.reconstructFormattingElements();
        treeBuilder.clearFormattingElementsToLastMarker();
        treeBuilder.removeFromActiveFormattingElements(b4);
    }

    @Test
    public void testResetInsertionModeVariations() {
        // Test various stack elements triggering resetInsertionMode transitions
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String tag : tags) {
            StringReader reader = new StringReader("");
            treeBuilder.initialiseParse(reader, "http://example.com", parser);
            treeBuilder.insertStartTag(tag);
            treeBuilder.resetInsertionMode();
            assertNotNull(treeBuilder.state());
        }
    }

    // Helper class to access package-private or static constants if needed
    private static class HtmlTreeBuilderMaxScopeDepthTestHelper {
        static int getMaxDepth() {
            return HtmlTreeBuilder.MaxScopeSearchDepth;
        }
    }
}