package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
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
        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
    }

    @Test
    public void testInitialiseParseAndBasicGetters() {
        assertNotNull(treeBuilder.getDocument());
        assertEquals("", treeBuilder.getBaseUri());
        assertFalse(treeBuilder.isFragmentParsing());
        assertNull(treeBuilder.getHeadElement());
        assertNull(treeBuilder.getFormElement());
        assertFalse(treeBuilder.isFosterInserts());
        assertNotNull(treeBuilder.getPendingTableCharacters());
        
        treeBuilder.framesetOk(false);
        assertFalse(treeBuilder.framesetOk());
        
        treeBuilder.setFosterInserts(true);
        assertTrue(treeBuilder.isFosterInserts());
    }

    @Test
    public void testParseFragmentNullContext() {
        List<Node> nodes = treeBuilder.parseFragment("<div>Hello</div>", null, "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(treeBuilder.isFragmentParsing()); // note: fragmentParsing is true during, but returns what? wait, let's verify doc nodes
    }

    @Test
    public void testParseFragmentWithDifferentContextTags() {
        String[] tags = {"title", "textarea", "iframe", "style", "script", "noscript", "plaintext", "div"};
        for (String tag : tags) {
            Element context = new Element(Tag.valueOf(tag), "");
            List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormContextAncestor() {
        Document doc = Document.createShell("http://example.com");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com");
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        form.appendChild(div);
        doc.body().appendChild(form);

        List<Node> nodes = treeBuilder.parseFragment("<input name='test'/>", div, "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertNotNull(treeBuilder.getFormElement());
    }

    @Test
    public void testInsertSelfClosingStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing();
        
        Element el = treeBuilder.insert(startTag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertCharactersScriptAndStyle() {
        Element scriptEl = new Element(Tag.valueOf("script"), "");
        treeBuilder.push(scriptEl);

        Token.Character charToken = new Token.Character();
        charToken.data("var a = 1;");
        treeBuilder.insert(charToken);

        assertEquals(1, scriptEl.childNodeSize());
        assertTrue(scriptEl.childNode(0) instanceof DataNode);

        // Test Style
        Element styleEl = new Element(Tag.valueOf("style"), "");
        treeBuilder.push(styleEl);
        treeBuilder.insert(charToken);
        assertTrue(styleEl.childNode(0) instanceof DataNode);

        // Test Normal Text
        Element divEl = new Element(Tag.valueOf("div"), "");
        treeBuilder.push(divEl);
        treeBuilder.insert(charToken);
        assertTrue(divEl.childNode(0) instanceof TextNode);
    }

    @Test
    public void testStackOperationsAndSearch() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);

        assertTrue(treeBuilder.onStack(el1));
        assertTrue(treeBuilder.onStack(el2));
        assertEquals(el2, treeBuilder.getFromStack("span"));
        assertEquals(el1, treeBuilder.aboveOnStack(el2));

        assertTrue(treeBuilder.removeFromStack(el2));
        assertFalse(treeBuilder.onStack(el2));

        Element popped = treeBuilder.pop();
        assertEquals(el1, popped);
    }

    @Test
    public void testPopStackToCloseAndBefore() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");
        Element span = new Element(Tag.valueOf("span"), "");

        treeBuilder.push(div);
        treeBuilder.push(p);
        treeBuilder.push(span);

        treeBuilder.popStackToClose("p");
        assertFalse(treeBuilder.onStack(p));
        assertFalse(treeBuilder.onStack(span));
        assertTrue(treeBuilder.onStack(div));

        treeBuilder.push(p);
        treeBuilder.push(span);
        treeBuilder.popStackToClose("div", "p"); // varargs version

        treeBuilder.push(div);
        treeBuilder.push(p);
        treeBuilder.push(span);
        treeBuilder.popStackToBefore("div");
    }

    @Test
    public void clearStackContexts() {
        Element table = new Element(Tag.valueOf("table"), "");
        Element tbody = new Element(Tag.valueOf("tbody"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");

        treeBuilder.push(table);
        treeBuilder.clearStackToTableContext();

        treeBuilder.push(table);
        treeBuilder.push(tbody);
        treeBuilder.clearStackToTableBodyContext();

        treeBuilder.push(tr);
        treeBuilder.clearStackToTableRowContext();
    }

    @Test
    public void testResetInsertionModeAllBranches() {
        String[] names = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html", "unknown"};
        for (String name : names) {
            treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Element el = new Element(Tag.valueOf(name), "");
            treeBuilder.push(el);
            treeBuilder.resetInsertionMode();
        }
    }

    @Test
    public void testScopesAndSpecialElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        treeBuilder.push(div);

        assertFalse(treeBuilder.inScope("div"));
        assertFalse(treeBuilder.inListItemScope("div"));
        assertFalse(treeBuilder.inButtonScope("div"));
        assertFalse(treeBuilder.inTableScope("div"));
        
        Element select = new Element(Tag.valueOf("select"), "");
        treeBuilder.push(select);
        assertTrue(treeBuilder.inSelectScope("select"));

        assertTrue(treeBuilder.isSpecial(div));
    }

    @Test(expected = AssertionError.class)
    public void testInSelectScopeFail() {
        Element div = new Element(Tag.valueOf("div"), "");
        treeBuilder.push(div);
        treeBuilder.inSelectScope("nonexistent");
    }

    @Test
    public void testFormattingElements() {
        Element b1 = new Element(Tag.valueOf("b"), "");
        Element b2 = new Element(Tag.valueOf("b"), "");
        Element b3 = new Element(Tag.valueOf("b"), "");
        Element b4 = new Element(Tag.valueOf("b"), "");

        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        // 4th same element triggers removal of the first occurrence (numSeen == 3)
        treeBuilder.pushActiveFormattingElements(b4);

        assertNotNull(treeBuilder.lastFormattingElement());
        assertTrue(treeBuilder.isInActiveFormattingElements(b4));

        treeBuilder.removeFromActiveFormattingElements(b4);
        assertFalse(treeBuilder.isInActiveFormattingElements(b4));

        assertNotNull(treeBuilder.getActiveFormattingElement("b"));

        treeBuilder.insertMarkerToFormattingElements();
        Element markerElem = new Element(Tag.valueOf("i"), "");
        treeBuilder.pushActiveFormattingElements(markerElem);
        
        treeBuilder.clearFormattingElementsToLastMarker();
        treeBuilder.removeLastFormattingElement();
    }

    @Test
    public void testReconstructFormattingElements() {
        Element b = new Element(Tag.valueOf("b"), "");
        treeBuilder.pushActiveFormattingElements(b);
        // Not on stack yet, should attempt reconstruction
        treeBuilder.reconstructFormattingElements();
    }

    @Test
    public void testFosterInsertsScenarios() {
        Element table = new Element(Tag.valueOf("table"), "");
        Document doc = Document.createShell("");
        doc.body().appendChild(table);

        treeBuilder.push(doc.body());
        treeBuilder.push(table);

        treeBuilder.setFosterInserts(true);
        Element p = new Element(Tag.valueOf("p"), "");
        
        // Triggers insertInFosterParent where lastTable has parent
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        treeBuilder.insert(tag);
    }
}