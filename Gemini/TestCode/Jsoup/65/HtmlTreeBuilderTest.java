import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    @Test
    public void testParseFragmentWithNullContext() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        ParseErrorList errorList = ParseErrorList.noTracking();
        List<Node> nodes = treeBuilder.parseFragment("<div>Hello</div>", null, "http://example.com", errorList, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertFalse(treeBuilder.isFragmentParsing());
    }

    @Test
    public void testParseFragmentWithVariousContextTags() {
        String[] contextTags = {"title", "textarea", "iframe", "style", "script", "noscript", "plaintext", "div"};
        for (String tagName : contextTags) {
            HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
            ParseErrorList errorList = ParseErrorList.noTracking();
            Element context = new Element(Tag.valueOf(tagName), "");
            Document doc = Document.createShell("");
            doc.appendChild(context);
            
            List<Node> nodes = treeBuilder.parseFragment("content", context, "http://example.com", errorList, ParseSettings.htmlDefault);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragmentWithFormContext() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        ParseErrorList errorList = ParseErrorList.noTracking();
        FormElement form = new FormElement(Tag.valueOf("form"), "");
        Element context = new Element(Tag.valueOf("input"), "");
        form.appendChild(context);
        
        List<Node> nodes = treeBuilder.parseFragment("<input type='text'/>", context, "http://example.com", errorList, ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertNotNull(treeBuilder.getFormElement());
    }

    @Test
    public void testMaybeSetBaseUriEdgeCases() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://base.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element base1 = new Element(Tag.valueOf("base"), "");
        // Empty href length == 0
        treeBuilder.maybeSetBaseUri(base1);

        Element base2 = new Element(Tag.valueOf("base"), "");
        base2.attr("href", "http://newbase.com");
        treeBuilder.maybeSetBaseUri(base2);
        assertEquals("http://newbase.com", treeBuilder.getBaseUri());

        // Second base should be ignored because baseUriSetFromDoc is true
        Element base3 = new Element(Tag.valueOf("base"), "");
        base3.attr("href", "http://ignoredbase.com");
        treeBuilder.maybeSetBaseUri(base3);
        assertEquals("http://newbase.com", treeBuilder.getBaseUri());
    }

    @Test
    public void testInsertSelfClosingTag() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing();

        Element el = treeBuilder.insert(startTag);
        assertNotNull(el);
        assertEquals("img", el.tagName());
    }

    @Test
    public void testInsertEmptyKnownAndUnknownTags() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        // Known void tag self-closing
        Token.StartTag voidTag = new Token.StartTag();
        voidTag.name("br");
        voidTag.selfClosing();
        Element el1 = treeBuilder.insertEmpty(voidTag);
        assertNotNull(el1);

        // Known non-void tag self-closing (triggers error)
        Token.StartTag nonVoidTag = new Token.StartTag();
        nonVoidTag.name("div");
        nonVoidTag.selfClosing();
        Element el2 = treeBuilder.insertEmpty(nonVoidTag);
        assertNotNull(el2);

        // Unknown tag self-closing
        Token.StartTag unknownTag = new Token.StartTag();
        unknownTag.name("custom-tag");
        unknownTag.selfClosing();
        Element el3 = treeBuilder.insertEmpty(unknownTag);
        assertNotNull(el3);
    }

    @Test
    public void testInsertCharacterNodes() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        
        Element scriptEl = treeBuilder.insertStartTag("script");
        Token.Character scriptChar = new Token.Character();
        scriptChar.data("var a = 1;");
        treeBuilder.insert(scriptChar);
        assertTrue(scriptEl.childNode(0) instanceof DataNode);

        treeBuilder.pop();
        Element divEl = treeBuilder.insertStartTag("div");
        Token.Character textChar = new Token.Character();
        textChar.data("Hello World");
        treeBuilder.insert(textChar);
        assertTrue(divEl.childNode(0) instanceof TextNode);
    }

    @Test
    public void testStackAndQueueOperations() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        
        treeBuilder.push(el1);
        treeBuilder.push(el2);

        assertTrue(treeBuilder.onStack(el1));
        assertTrue(treeBuilder.onStack(el2));
        assertEquals(el2, treeBuilder.getFromStack("span"));
        assertEquals(el1, treeBuilder.aboveOnStack(el2));

        Element el3 = new Element(Tag.valueOf("p"), "");
        treeBuilder.replaceOnStack(el2, el3);
        assertFalse(treeBuilder.onStack(el2));
        assertTrue(treeBuilder.onStack(el3));

        assertTrue(treeBuilder.removeFromStack(el3));
        assertFalse(treeBuilder.removeFromStack(el2));

        treeBuilder.push(el1);
        treeBuilder.push(el3);
        treeBuilder.popStackToClose("div");
    }

    @Test
    public void testPopStackVariants() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        treeBuilder.push(new Element(Tag.valueOf("div"), ""));
        treeBuilder.push(new Element(Tag.valueOf("p"), ""));
        treeBuilder.push(new Element(Tag.valueOf("span"), ""));

        treeBuilder.popStackToClose("p");
        
        treeBuilder.push(new Element(Tag.valueOf("ul"), ""));
        treeBuilder.push(new Element(Tag.valueOf("li"), ""));
        treeBuilder.popStackToClose("ul", "ol");

        treeBuilder.push(new Element(Tag.valueOf("div"), ""));
        treeBuilder.push(new Element(Tag.valueOf("span"), ""));
        treeBuilder.popStackToBefore("div");
    }

    @Test
    public void testClearStackContexts() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        treeBuilder.push(new Element(Tag.valueOf("table"), ""));
        treeBuilder.push(new Element(Tag.valueOf("tbody"), ""));
        treeBuilder.push(new Element(Tag.valueOf("tr"), ""));
        treeBuilder.clearStackToTableRowContext();

        treeBuilder.push(new Element(Tag.valueOf("tbody"), ""));
        treeBuilder.clearStackToTableBodyContext();

        treeBuilder.push(new Element(Tag.valueOf("table"), ""));
        treeBuilder.clearStackToTableContext();
    }

    @Test
    public void testResetInsertionModeAllBranches() {
        String[] tags = {"select", "td", "tr", "tbody", "caption", "colgroup", "table", "head", "body", "frameset", "html", "unknown"};
        for (String tag : tags) {
            HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
            treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            if (tag.equals("unknown")) {
                treeBuilder.push(new Element(Tag.valueOf("div"), ""));
            } else {
                treeBuilder.push(new Element(Tag.valueOf(tag), ""));
            }
            treeBuilder.resetInsertionMode();
        }
    }

    @Test
    public void testScopesAndSpecialElements() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element div = new Element(Tag.valueOf("div"), "");
        treeBuilder.push(div);

        assertTrue(treeBuilder.inScope("div"));
        assertTrue(treeBuilder.inScope(new String[]{"div"}));
        assertTrue(treeBuilder.inListItemScope("div"));
        assertTrue(treeBuilder.inButtonScope("div"));
        assertTrue(treeBuilder.inTableScope("div"));
        assertTrue(treeBuilder.isSpecial(div));

        // Test select scope
        Element option = new Element(Tag.valueOf("option"), "");
        treeBuilder.push(option);
        assertTrue(treeBuilder.inSelectScope("option"));
    }

    @Test
    public void testActiveFormattingElementsTriplicate() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element b1 = new Element(Tag.valueOf("b"), "");
        Element b2 = new Element(Tag.valueOf("b"), "");
        Element b3 = new Element(Tag.valueOf("b"), "");
        Element b4 = new Element(Tag.valueOf("b"), "");

        treeBuilder.pushActiveFormattingElements(b1);
        treeBuilder.pushActiveFormattingElements(b2);
        treeBuilder.pushActiveFormattingElements(b3);
        // Adding 4th identical element should trigger the removal of the oldest duplicate (numSeen == 3 logic)
        treeBuilder.pushActiveFormattingElements(b4);

        assertNotNull(treeBuilder.getActiveFormattingElement("b"));
        treeBuilder.insertMarkerToFormattingElements();
        assertNull(treeBuilder.lastFormattingElement());
        treeBuilder.clearFormattingElementsToLastMarker();
    }

    @Test
    public void testReconstructFormattingElements() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Element b = new Element(Tag.valueOf("b"), "");
        treeBuilder.pushActiveFormattingElements(b);
        treeBuilder.reconstructFormattingElements();
    }

    @Test
    public void testFosterInsertsScenarios() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        // Scenario 1: table with parent
        Element table = new Element(Tag.valueOf("table"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        body.appendChild(table);
        treeBuilder.push(body);
        treeBuilder.push(table);
        
        treeBuilder.setFosterInserts(true);
        TextNode node = new TextNode("fostered");
        treeBuilder.insert(node);

        // Scenario 2: table without parent (aboveOnStack)
        HtmlTreeBuilder treeBuilder2 = new HtmlTreeBuilder();
        treeBuilder2.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element div = new Element(Tag.valueOf("div"), "");
        Element table2 = new Element(Tag.valueOf("table"), "");
        treeBuilder2.push(div);
        treeBuilder2.push(table2);
        treeBuilder2.setFosterInserts(true);
        treeBuilder2.insert(new TextNode("fostered2"));
    }

    @Test
    public void testToStringAndErrorHandling() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
        
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        treeBuilder.error(HtmlTreeBuilderState.Initial);
        
        assertNotNull(treeBuilder.toString());
    }
}