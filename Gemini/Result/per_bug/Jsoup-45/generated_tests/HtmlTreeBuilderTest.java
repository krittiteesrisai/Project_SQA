package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void testParseAndInitialState() {
        ParseErrorList errors = ParseErrorList.noTracking();
        Document doc = treeBuilder.parse("<html><head></head><body>Hello</body></html>", "http://example.com", errors);
        assertNotNull(doc);
        assertEquals(HtmlTreeBuilderState.Initial, treeBuilder.state());
        assertFalse(treeBuilder.isFragmentParsing());
        assertEquals("http://example.com", treeBuilder.getBaseUri());
    }

    @Test
    public void testParseFragmentNullContext() {
        ParseErrorList errors = ParseErrorList.noTracking();
        List<Node> nodes = treeBuilder.parseFragment("<div>Test</div>", null, "http://example.com", errors);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithContextAndTokeniserTransitions() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        
        // Test various context tags triggering different tokeniser states
        String[] contextTags = {"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tagName : contextTags) {
            Document ownerDoc = new Document("http://example.com");
            Element context = new Element(Tag.valueOf(tagName), "http://example.com");
            ownerDoc.appendChild(context);
            
            List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", errors);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormContextAncestor() {
        ParseErrorList errors = ParseErrorList.noTracking();
        Document ownerDoc = new Document("http://example.com");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", null);
        Element context = new Element(Tag.valueOf("input"), "http://example.com");
        form.appendChild(context);
        ownerDoc.appendChild(form);

        List<Node> nodes = treeBuilder.parseFragment("<span>text</span>", context, "http://example.com", errors);
        assertNotNull(nodes);
        assertNotNull(treeBuilder.getFormElement());
    }

    @Test
    public void testMaybeSetBaseUriEdgeCases() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body></body></html>", "http://example.com", errors);

        Element base1 = new Element(Tag.valueOf("base"), "http://example.com");
        base1.attr("href", "http://new-base.com");
        
        treeBuilder.maybeSetBaseUri(base1);
        assertEquals("http://new-base.com", treeBuilder.getBaseUri());

        // Second base should be ignored due to baseUriSetFromDoc = true
        Element base2 = new Element(Tag.valueOf("base"), "http://example.com");
        base2.attr("href", "http://ignored-base.com");
        treeBuilder.maybeSetBaseUri(base2);
        assertEquals("http://new-base.com", treeBuilder.getBaseUri());

        // Base with empty href
        Element baseEmpty = new Element(Tag.valueOf("base"), "http://example.com");
        baseEmpty.attr("href", "");
        treeBuilder.maybeSetBaseUri(baseEmpty);
    }

    @Test
    public void testInsertStartTagSelfClosingAndNormal() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body></body></html>", "http://example.com", errors);

        Token.StartTag selfClosingTag = new Token.StartTag();
        selfClosingTag.name("br");
        selfClosingTag.selfClose();
        Element el1 = treeBuilder.insert(selfClosingTag);
        assertNotNull(el1);

        Token.StartTag normalTag = new Token.StartTag();
        normalTag.name("div");
        Element el2 = treeBuilder.insert(normalTag);
        assertNotNull(el2);
    }

    @Test
    public void testInsertCharacterNodes() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head><script>var a=1;</script><style>.a{}</style><body>Text</body></html>", "http://example.com", errors);

        // Test script/style character insertion (DataNode) vs normal text (TextNode)
        Element scriptEl = treeBuilder.getFromStack("script");
        if (scriptEl != null) {
            treeBuilder.getStack().add(scriptEl);
            Token.Character charToken = new Token.Character("alert(1);");
            treeBuilder.insert(charToken);
            assertTrue(scriptEl.childNode(0) instanceof DataNode);
        }

        Element bodyEl = treeBuilder.getFromStack("body");
        if (bodyEl != null) {
            treeBuilder.getStack().clear();
            treeBuilder.getStack().add(bodyEl);
            Token.Character charToken = new Token.Character("Normal Text");
            treeBuilder.insert(charToken);
            assertTrue(bodyEl.childNode(bodyEl.childNodeSize() - 1) instanceof TextNode);
        }
    }

    @Test
    public void testInsertFormAndEmpty() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body></body></html>", "http://example.com", errors);

        Token.StartTag tag = new Token.StartTag();
        tag.name("form");
        FormElement formEl = treeBuilder.insertForm(tag, true);
        assertNotNull(formEl);
        assertEquals(formEl, treeBuilder.getFormElement());

        Token.StartTag unknownTag = new Token.StartTag();
        unknownTag.name("custom-tag");
        unknownTag.selfClose();
        Element emptyEl = treeBuilder.insertEmpty(unknownTag);
        assertNotNull(emptyEl);
    }

    @Test
    public void testStackOperationsAndScopes() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body><table><caption>Cap</caption><tbody><tr><td><select><option>Opt</option></select></td></tr></tbody></table></body></html>", "http://example.com", errors);

        Element div = treeBuilder.insertStartTag("div");
        assertTrue(treeBuilder.onStack(div));
        assertEquals(div, treeBuilder.aboveOnStack(div));

        Element popped = treeBuilder.pop();
        assertEquals(div, popped);

        treeBuilder.push(div);
        assertTrue(treeBuilder.removeFromStack(div));
        assertFalse(treeBuilder.onStack(div));

        treeBuilder.push(div);
        treeBuilder.popStackToClose("div");

        treeBuilder.push(new Element(Tag.valueOf("p"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("div"), "http://example.com"));
        treeBuilder.popStackToClose("p", "div");

        treeBuilder.push(new Element(Tag.valueOf("span"), "http://example.com"));
        treeBuilder.push(new Element(Tag.valueOf("target"), "http://example.com"));
        treeBuilder.popStackToBefore("target");

        // Scope checks
        assertFalse(treeBuilder.inScope("div"));
        assertFalse(treeBuilder.inListItemScope("li"));
        assertFalse(treeBuilder.inButtonScope("button"));
        assertFalse(treeBuilder.inTableScope("table"));
        assertFalse(treeBuilder.inSelectScope("option"));
    }

    @Test
    public void testClearStackContextMethods() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body><table><tbody>tr></table></body></html>", "http://example.com", errors);
        
        treeBuilder.clearStackToTableContext();
        treeBuilder.clearStackToTableBodyContext();
        treeBuilder.clearStackToTableRowContext();
    }

    @Test
    public void testResetInsertionModeAllBranches() {
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String tag : tags) {
            treeBuilder.getStack().clear();
            treeBuilder.getStack().add(new Element(Tag.valueOf(tag), "http://example.com"));
            treeBuilder.resetInsertionMode();
        }

        // Test last element branch in fragment parsing
        treeBuilder.getStack().clear();
        Element dummyContext = new Element(Tag.valueOf("div"), "http://example.com");
        // Using reflection or state setting via parseFragment to cover last = true
        treeBuilder.parseFragment("test", dummyContext, "http://example.com", ParseErrorList.noTracking());
    }

    @Test
    public void testActiveFormattingElementsAndReconstruction() {
        Element el1 = new Element(Tag.valueOf("b"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("b"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("b"), "http://example.com");
        Element el4 = new Element(Tag.valueOf("b"), "http://example.com");

        treeBuilder.pushActiveFormattingElements(el1);
        treeBuilder.pushActiveFormattingElements(el2);
        treeBuilder.pushActiveFormattingElements(el3);
        // Push 4th same formatting element to trigger numSeen == 3 branch removal
        treeBuilder.pushActiveFormattingElements(el4);

        assertTrue(treeBuilder.isInActiveFormattingElements(el4));
        assertNotNull(treeBuilder.getLastFormattingElement());
        assertNotNull(treeBuilder.getActiveFormattingElement("b"));

        treeBuilder.reconstructFormattingElements();

        treeBuilder.removeFromActiveFormattingElements(el4);
        treeBuilder.clearFormattingElementsToLastMarker();

        treeBuilder.insertMarkerToFormattingElements();
        assertNull(treeBuilder.removeLastFormattingElement());
    }

    @Test
    public void testFosterInsertsScenarios() {
        ParseErrorList errors = ParseErrorList.noTracking();
        treeBuilder.parse("<html><head></head><body><table></table></body></html>", "http://example.com", errors);
        treeBuilder.setFosterInserts(true);

        Element table = treeBuilder.getFromStack("table");
        if (table != null) {
            Element div = new Element(Tag.valueOf("div"), "http://example.com");
            treeBuilder.insert(div);
        }

        // Test foster parent when table has no parent (stack index 0)
        treeBuilder.getStack().clear();
        Element html = new Element(Tag.valueOf("html"), "http://example.com");
        treeBuilder.getStack().add(html);
        treeBuilder.insertInFosterParent(new TextNode("foster", "http://example.com"));
    }

    @Test
    public void testMiscellaneousGettersAndSetters() {
        treeBuilder.state(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, treeBuilder.state());

        treeBuilder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, treeBuilder.originalState());

        treeBuilder.framesetOk(false);
        assertFalse(treeBuilder.framesetOk());

        assertNotNull(treeBuilder.getDocument());

        treeBuilder.setHeadElement(new Element(Tag.valueOf("head"), "http://example.com"));
        assertNotNull(treeBuilder.getHeadElement());

        treeBuilder.newPendingTableCharacters();
        assertNotNull(treeBuilder.getPendingTableCharacters());
        treeBuilder.setPendingTableCharacters(new ArrayList<String>());

        treeBuilder.error(HtmlTreeBuilderState.InBody);
        assertNotNull(treeBuilder.toString());
    }
}