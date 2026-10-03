package org.jsoup.parser;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void testParseAndState() {
        Document doc = treeBuilder.parse("<html><head></head><body>Hello</body></html>", "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(doc);
        assertEquals(HtmlTreeBuilderState.Initial, treeBuilder.originalState());
    }

    @Test
    public void testParseFragmentWithContextNull() {
        List<Node> nodes = treeBuilder.parseFragment("<div>Test</div>", null, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithTitleContext() {
        Document contextDoc = Document.createShell("http://example.com");
        Element context = contextDoc.createElement("title");
        List<Node> nodes = treeBuilder.parseFragment("Hello Title", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithTextareaContext() {
        Element context = new Element(Tag.valueOf("textarea"), "http://example.com");
        List<Node> nodes = treeBuilder.parseFragment("Some text", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithIframeContext() {
        Element context = new Element(Tag.valueOf("iframe"), "http://example.com");
        List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithScriptContext() {
        Element context = new Element(Tag.valueOf("script"), "http://example.com");
        List<Node> nodes = treeBuilder.parseFragment("var a=1;", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithNoscriptContext() {
        Element context = new Element(Tag.valueOf("noscript"), "http://example.com");
        List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithPlaintextContext() {
        Element context = new Element(Tag.valueOf("plaintext"), "http://example.com");
        List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithFormParentContext() {
        Document contextDoc = Document.createShell("http://example.com");
        FormElement form = (FormElement) contextDoc.createElement("form");
        Element context = contextDoc.createElement("input");
        form.appendChild(context);
        
        List<Node> nodes = treeBuilder.parseFragment("<input type='text'/>", context, "http://example.com", ParseErrorList.tracking(10));
        assertNotNull(nodes);
    }

    @Test
    public void testMaybeSetBaseUriEdges() {
        treeBuilder.parse("<html><head><base href='http://foo.com'></head><body></body></html>", "http://example.com", ParseErrorList.tracking(10));
        Element baseEl = new Element(Tag.valueOf("base"), "http://example.com");
        baseEl.attr("href", "http://bar.com");
        
        treeBuilder.maybeSetBaseUri(baseEl); // should ignore due to baseUriSetFromDoc = true
        
        Element emptyHrefBase = new Element(Tag.valueOf("base"), "http://example.com");
        treeBuilder.maybeSetBaseUri(emptyHrefBase); // should ignore due to length 0
    }

    @Test
    public void testInsertSelfClosingTag() {
        treeBuilder.parse("<html><head></head><body><br /></body></html>", "http://example.com", ParseErrorList.tracking(10));
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing();
        Element el = treeBuilder.insert(startTag);
        assertNotNull(el);
    }

    @Test
    public void testInsertUnknownSelfClosingTag() {
        treeBuilder.parse("<html><head></head><body><custom-tag /></body></html>", "http://example.com", ParseErrorList.tracking(10));
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("custom-tag");
        startTag.selfClosing();
        Element el = treeBuilder.insertEmpty(startTag);
        assertNotNull(el);
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsertCharacterNodes() {
        treeBuilder.parse("<html><head><script>code</script><style>css</style><p>text</p></head><body></body></html>", "http://example.com", ParseErrorList.tracking(10));
        
        // Script character token
        treeBuilder.push(new Element(Tag.valueOf("script"), "http://example.com"));
        Token.Character scriptChar = new Token.Character();
        scriptChar.data("var x = 1;");
        treeBuilder.insert(scriptChar);

        // Style character token
        treeBuilder.replaceOnStack(treeBuilder.currentElement(), new Element(Tag.valueOf("style"), "http://example.com"));
        Token.Character styleChar = new Token.Character();
        styleChar.data("body { color: red; }");
        treeBuilder.insert(styleChar);

        // Regular text token
        treeBuilder.replaceOnStack(treeBuilder.currentElement(), new Element(Tag.valueOf("p"), "http://example.com"));
        Token.Character normalChar = new Token.Character();
        normalChar.data("Hello world");
        treeBuilder.insert(normalChar);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPopTdNotInCellValidation() {
        treeBuilder.parse("<html><head></head><body></body></html>", "http://example.com", ParseErrorList.tracking(10));
        treeBuilder.push(new Element(Tag.valueOf("td"), "http://example.com"));
        treeBuilder.pop(); // Throws because state is not InCell
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPopHtmlValidation() {
        treeBuilder.parse("<html><head></head><body></body></html>", "http://example.com", ParseErrorList.tracking(10));
        treeBuilder.popStackToClose("html");
        treeBuilder.pop(); // Tries to pop html, triggers Validate.isFalse
    }

    @Test
    public void testStackOperationsAndScopes() {
        Document doc = treeBuilder.parse("<html><head></head><body><table><caption>Cap</caption><tbody><tr><td><select><option>Opt</option></select></td></tr></tbody></table></body></html>", "http://example.com", ParseErrorList.tracking(10));
        
        Element table = treeBuilder.getFromStack("table");
        assertNotNull(table);
        assertTrue(treeBuilder.onStack(table));
        
        Element above = treeBuilder.aboveOnStack(table);
        assertNotNull(treeBuilder.inScope("table"));
        assertNotNull(treeBuilder.inTableScope("table"));
        assertNotNull(treeBuilder.inButtonScope("button"));
        assertNotNull(treeBuilder.inListItemScope("li"));
        assertNotNull(treeBuilder.inSelectScope("option"));
        
        assertTrue(treeBuilder.isSpecial(table));
        
        treeBuilder.removeFromStack(table);
        assertFalse(treeBuilder.onStack(table));
    }

    @Test
    public void testResetInsertionModeAllBranches() {
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String tag : tags) {
            treeBuilder.parse("<html><head></head><body><" + tag + "></" + tag + "></body></html>", "http://example.com", ParseErrorList.tracking(10));
            treeBuilder.resetInsertionMode();
        }
    }

    @Test
    public void testFormattingElements() {
        Element b1 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b2 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b3 = new Element(Tag.valueOf("b"), "http://example.com");
        Element b4 = new Element(Tag.valueOf("b"), "http://example.com");

        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        treeBuilder.pushActiveFormattingElements(b4); // Triggers limit condition (numSeen == 3)

        treeBuilder.insertMarkerToFormattingElements();
        assertNotNull(treeBuilder.getActiveFormattingElement("b"));
        assertTrue(treeBuilder.isInActiveFormattingElements(b4));

        treeBuilder.reconstructFormattingElements();

        treeBuilder.replaceActiveFormattingElement(b4, b1);
        treeBuilder.removeFromActiveFormattingElements(b1);
        treeBuilder.clearFormattingElementsToLastMarker();
    }

    @Test
    public void testFosterInserts() {
        treeBuilder.parse("<html><head></head><body><table><tr><td></td></tr></table></body></html>", "http://example.com", ParseErrorList.tracking(10));
        treeBuilder.setFosterInserts(true);
        assertTrue(treeBuilder.isFosterInserts());

        Token.Comment comment = new Token.Comment();
        comment.data("foster comment");
        treeBuilder.insert(comment);
    }
}