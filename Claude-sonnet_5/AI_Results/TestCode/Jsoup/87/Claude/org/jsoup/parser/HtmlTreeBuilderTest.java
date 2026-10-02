package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for HtmlTreeBuilder (Defects4J Jsoup-87b).
 * Placed in the same package to exercise package-private API directly.
 *
 * หมายเหตุทั่วไป: บาง assertion อิงตาม HTML5 "reset the insertion mode" spec ซึ่งเป็น public spec
 * ไม่ใช่การเดา behavior ของคลาส และถูกออกแบบมาเพื่อ "ดักจับข้อบกพร่อง" (precedence bug ใน td/th branch)
 */
public class HtmlTreeBuilderTest {

    // ---------- helpers ----------

    private Element el(String tagName) {
        return new Element(Tag.valueOf(tagName), "http://example.com/");
    }

    private HtmlTreeBuilder freshBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com/", Parser.htmlParser());
        return tb;
    }

    private void setContextElement(HtmlTreeBuilder tb, Element context) throws Exception {
        Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
        f.setAccessible(true);
        f.set(tb, context);
    }

    private HtmlTreeBuilder resetWithStack(Element context, Element... stackEls) throws Exception {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        for (Element e : stackEls) tb.getStack().add(e);
        setContextElement(tb, context);
        tb.resetInsertionMode();
        return tb;
    }

    // ---------- defaultSettings / basic smoke ----------

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertEquals(ParseSettings.htmlDefault, tb.defaultSettings());
    }

    @Test
    public void testFullParse_smoke() {
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body><p>Hello</p></body></html>",
            "http://example.com/");
        assertEquals("T", doc.title());
        assertEquals("Hello", doc.select("p").first().text());
    }

    @Test
    public void testToString_noException() {
        HtmlTreeBuilder tb = freshBuilder();
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder{"));
    }

    // ---------- state / markInsertionMode / framesetOk ----------

    @Test
    public void testMarkInsertionModeAndFramesetOk() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.markInsertionMode();
        tb.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        assertTrue(tb.framesetOk()); // default true after initialiseParse
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testIsFragmentParsing_defaultFalse() {
        assertFalse(freshBuilder().isFragmentParsing());
    }

    // ---------- maybeSetBaseUri branches ----------

    @Test
    public void testMaybeSetBaseUri_setsOnFirstValidBase() {
        HtmlTreeBuilder tb = freshBuilder();
        String original = tb.getBaseUri();
        Element base = el("base");
        base.attr("href", "http://other.com/");
        tb.maybeSetBaseUri(base);
        assertEquals("http://other.com/", tb.getBaseUri());
        assertNotEquals(original, tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_ignoresSecondBase() {
        HtmlTreeBuilder tb = freshBuilder();
        Element base1 = el("base");
        base1.attr("href", "http://first.com/");
        tb.maybeSetBaseUri(base1);

        Element base2 = el("base");
        base2.attr("href", "http://second.com/");
        tb.maybeSetBaseUri(base2);

        assertEquals("http://first.com/", tb.getBaseUri()); // early-return branch
    }

    @Test
    public void testMaybeSetBaseUri_emptyHrefIgnored() {
        HtmlTreeBuilder tb = freshBuilder();
        String original = tb.getBaseUri();
        Element base = el("base"); // no href attribute -> absUrl("href") == ""
        tb.maybeSetBaseUri(base);
        assertEquals(original, tb.getBaseUri());
    }

    // ---------- error() branches ----------

    @Test
    public void testError_addedWhenTrackingEnabled() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        tb.initialiseParse(new StringReader("abc"), "http://example.com/", parser);
        tb.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, parser.getErrors().size());
    }

    @Test
    public void testError_notAddedWhenTrackingDisabled() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser(); // default: tracking disabled
        tb.initialiseParse(new StringReader("abc"), "http://example.com/", parser);
        tb.error(HtmlTreeBuilderState.Initial);
        assertEquals(0, parser.getErrors().size());
    }

    // ---------- insert(Element) / insertStartTag / insertNode branches ----------

    @Test
    public void testInsertStartTag_emptyStack_appendsToDoc() {
        HtmlTreeBuilder tb = freshBuilder();
        Element e = tb.insertStartTag("div");
        assertEquals("div", e.tagName());
        assertTrue(tb.onStack(e));
        assertSame(e, tb.getDocument().childNode(0));
    }

    @Test
    public void testInsertStartTag_nonEmptyStack_appendsToCurrentElement() {
        HtmlTreeBuilder tb = freshBuilder();
        Element parent = tb.insertStartTag("div");
        Element child = tb.insertStartTag("span");
        assertEquals(1, parent.childNodeSize());
        assertSame(child, parent.childNode(0));
    }

    @Test
    public void testInsertNode_fosterInserts_noTableOnStack() {
        HtmlTreeBuilder tb = freshBuilder();
        Element root = tb.insertStartTag("div");
        tb.setFosterInserts(true);
        Element table = tb.insertStartTag("table"); // no "table" yet on stack when inserted -> foster to stack.get(0)
        assertEquals(1, root.childNodeSize());
        assertSame(table, root.childNode(0));
    }

    // ---------- insertInFosterParent direct branch tests ----------

    @Test
    public void testInsertInFosterParent_noTableOnStack_fragBranch() {
        HtmlTreeBuilder tb = freshBuilder();
        Element onlyEl = el("div");
        tb.push(onlyEl);
        tb.setFosterInserts(true);
        Node text = new TextNode("baz");
        tb.insertInFosterParent(text);
        assertEquals(1, onlyEl.childNodeSize());
        assertSame(text, onlyEl.childNode(0));
    }

    @Test
    public void testInsertInFosterParent_tableWithoutParent_aboveOnStackBranch() {
        HtmlTreeBuilder tb = freshBuilder();
        Element root = el("div");
        Element table = el("table"); // not attached to any Document -> table.parent() == null
        tb.push(root);
        tb.push(table);
        tb.setFosterInserts(true);
        Node text = new TextNode("foo");
        tb.insertInFosterParent(text);
        assertEquals(1, root.childNodeSize());
        assertSame(text, root.childNode(0));
    }

    @Test
    public void testInsertInFosterParent_tableWithParent_isLastTableParentBranch() {
        Document doc = new Document("http://example.com/");
        Element container = el("div");
        doc.appendChild(container);
        Element table = el("table");
        container.appendChild(table); // table.parent() != null now

        HtmlTreeBuilder tb = freshBuilder();
        tb.push(table);
        tb.setFosterInserts(true);
        Node text = new TextNode("bar");
        tb.insertInFosterParent(text);

        assertEquals(2, container.childNodeSize());
        assertSame(text, container.childNode(0)); // inserted before table
        assertSame(table, container.childNode(1));
    }

    // ---------- stack manipulation ----------

    @Test
    public void testPushPopOnStack() {
        HtmlTreeBuilder tb = freshBuilder();
        Element e1 = el("div"), e2 = el("p");
        tb.push(e1);
        tb.push(e2);
        assertEquals(2, tb.getStack().size());
        assertTrue(tb.onStack(e2));
        Element popped = tb.pop();
        assertSame(e2, popped);
        assertEquals(1, tb.getStack().size());
        assertFalse(tb.onStack(e2));
    }

    @Test
    public void testGetFromStack_foundAndNotFound() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("div"));
        tb.push(el("span"));
        assertNotNull(tb.getFromStack("div"));
        assertNull(tb.getFromStack("table"));
    }

    @Test
    public void testRemoveFromStack_foundAndNotFound() {
        HtmlTreeBuilder tb = freshBuilder();
        Element e = el("div");
        tb.push(e);
        assertTrue(tb.removeFromStack(e));
        assertFalse(tb.onStack(e));
        assertFalse(tb.removeFromStack(el("p"))); // not on stack
    }

    @Test
    public void testPopStackToClose_singleName_found() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("table")); tb.push(el("tr")); tb.push(el("td"));
        tb.popStackToClose("tr");
        assertEquals(1, tb.getStack().size());
        assertEquals("table", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testPopStackToClose_singleName_notFound_popsAll() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("div"));
        tb.push(el("span"));
        tb.popStackToClose("table");
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testPopStackToClose_varargs_found() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("table")); tb.push(el("tbody")); tb.push(el("tr"));
        tb.popStackToClose(new String[]{"tr"}); // force varargs overload
        assertEquals(2, tb.getStack().size());
        assertEquals("tbody", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testPopStackToClose_varargs_notFound_popsAll() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("div"));
        tb.popStackToClose(new String[]{"zzz"});
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testPopStackToBefore_found() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("table")); tb.push(el("tbody")); tb.push(el("tr")); tb.push(el("td"));
        tb.popStackToBefore("tbody");
        assertEquals(2, tb.getStack().size());
        assertEquals("tbody", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testPopStackToBefore_notFound_popsAll() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("div"));
        tb.popStackToBefore("nonexistent");
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html")); tb.push(el("table")); tb.push(el("tr")); tb.push(el("td"));
        tb.clearStackToTableContext();
        assertEquals("table", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testClearStackToTableBodyContext_fallbackToHtml() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html")); tb.push(el("div")); // no tbody/tfoot/thead/template present
        tb.clearStackToTableBodyContext();
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html")); tb.push(el("table")); tb.push(el("tr")); tb.push(el("td"));
        tb.clearStackToTableRowContext();
        assertEquals("tr", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testAboveOnStack_normal() {
        HtmlTreeBuilder tb = freshBuilder();
        Element a = el("html"), b = el("body");
        tb.push(a); tb.push(b);
        assertSame(a, tb.aboveOnStack(b));
    }

    @Test
    public void testAboveOnStack_notOnStack_returnsNull() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html"));
        assertNull(tb.aboveOnStack(el("div"))); // not on stack -> loop falls through, returns null
    }

    @Test
    public void testAboveOnStack_bottomElement_throws() {
        // Derived directly from source: stack.get(pos-1) when pos == 0 -> IndexOutOfBoundsException.
        HtmlTreeBuilder tb = freshBuilder();
        Element only = el("html");
        tb.push(only);
        try {
            tb.aboveOnStack(only);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // expected per source logic
        }
    }

    @Test
    public void testInsertOnStackAfter_normalAndFailure() {
        HtmlTreeBuilder tb = freshBuilder();
        Element a = el("html"), b = el("body"), c = el("div");
        tb.push(a); tb.push(b);
        tb.insertOnStackAfter(a, c);
        ArrayList<Element> stack = tb.getStack();
        assertEquals(3, stack.size());
        assertSame(a, stack.get(0));
        assertSame(c, stack.get(1));
        assertSame(b, stack.get(2));

        try {
            tb.insertOnStackAfter(el("span"), el("em")); // 'after' not on stack
            fail("Expected exception due to Validate.isTrue failure");
        } catch (RuntimeException expected) {
            // Validate.isTrue throws when lastIndexOf == -1; exact type not asserted
        }
    }

    @Test
    public void testReplaceOnStack_normalAndFailure() {
        HtmlTreeBuilder tb = freshBuilder();
        Element a = el("div");
        tb.push(a);
        Element b = el("p");
        tb.replaceOnStack(a, b);
        assertSame(b, tb.getStack().get(0));

        try {
            tb.replaceOnStack(el("span"), el("em")); // not on stack
            fail("Expected exception due to Validate.isTrue failure");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    // ---------- resetInsertionMode branch coverage ----------

    @Test
    public void testResetInsertionMode_select() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("select"));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionMode_td_lastFalse() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("td"));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_th_lastFalse() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("th"));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_tr() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("tr"));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionMode_tbody() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("tbody"));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_caption() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("caption"));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionMode_colgroup() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("colgroup"));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionMode_table() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("html"), el("table"));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionMode_head() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("div"), el("head"));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_body() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("div"), el("body"));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_frameset() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("div"), el("frameset"));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionMode_html_nonBottomPosition() throws Exception {
        HtmlTreeBuilder tb = resetWithStack(null, el("div"), el("html"));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionMode_defaultLastFallback() throws Exception {
        // context tag matches none of the named cases -> falls through to "else if (last)" -> InBody
        HtmlTreeBuilder tb = resetWithStack(el("div"), el("placeholder"));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_th_last_true_isCorrect() throws Exception {
        // th correctly includes "&& !last" grouping -> with last==true this condition is false,
        // so it should fall through to InBody (control test, should PASS even on the buggy source).
        HtmlTreeBuilder tb = resetWithStack(el("th"), el("placeholder"));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_td_last_true_KNOWN_DEFECT_PROBE() throws Exception {
        // Per HTML5 "reset the insertion mode appropriately" algorithm, a td/th node only maps
        // to InCell when `last` is false. The source has:
        //     ("td".equals(name) || "th".equals(name) && !last)
        // Due to operator precedence (&& binds tighter than ||), "td" ALWAYS matches regardless
        // of `last`, which is a known defect (missing parentheses around the OR).
        // The spec-correct expectation is InBody (falls through to the final "last" branch).
        // This test is intentionally written to the CORRECT expected behavior, so it is expected
        // to FAIL against this buggy source (Jsoup-87b) -- demonstrating the fault is caught.
        HtmlTreeBuilder tb = resetWithStack(el("td"), el("placeholder"));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // ---------- isSpecial ----------

    @Test
    public void testIsSpecial() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(tb.isSpecial(el("div")));
        assertTrue(tb.isSpecial(el("table")));
        assertFalse(tb.isSpecial(el("span")));
    }

    // ---------- generateImpliedEndTags ----------

    @Test
    public void testGenerateImpliedEndTags_popsMatchingTags() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html"));
        tb.push(el("p")); // in TagSearchEndTags
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTags_stopsAtNonMatching() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html"));
        tb.push(el("div")); // not in TagSearchEndTags
        tb.generateImpliedEndTags();
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTags_withExcludeTag() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html"));
        tb.push(el("li")); // in list, but excluded
        tb.generateImpliedEndTags("li");
        assertEquals(2, tb.getStack().size());
    }

    // ---------- active formatting elements ----------

    @Test
    public void testPushActiveFormattingElements_noahsArkClause() {
        HtmlTreeBuilder tb = freshBuilder();
        Element b1 = el("b"), b2 = el("b"), b3 = el("b"), b4 = el("b");
        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3);
        tb.pushActiveFormattingElements(b4); // 4th identical -> earliest (b1) removed

        assertFalse(tb.isInActiveFormattingElements(b1));
        assertTrue(tb.isInActiveFormattingElements(b2));
        assertTrue(tb.isInActiveFormattingElements(b3));
        assertTrue(tb.isInActiveFormattingElements(b4));
        assertSame(b4, tb.lastFormattingElement());
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.pushActiveFormattingElements(el("b"));
        tb.insertMarkerToFormattingElements();
        assertNull(tb.lastFormattingElement()); // last entry is the marker (null)
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = freshBuilder();
        Element a1 = el("b");
        tb.pushActiveFormattingElements(a1);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(el("i"));
        tb.clearFormattingElementsToLastMarker();
        assertSame(a1, tb.lastFormattingElement()); // marker and entries above it removed
    }

    @Test
    public void testRemoveLastFormattingElement_emptyReturnsNull() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testGetActiveFormattingElement_stopsAtMarker() {
        HtmlTreeBuilder tb = freshBuilder();
        Element bEl = el("b");
        tb.pushActiveFormattingElements(bEl);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(el("i"));
        // searching for "b" must stop at marker before reaching bEl
        assertNull(tb.getActiveFormattingElement("b"));
        assertNotNull(tb.getActiveFormattingElement("i"));
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = freshBuilder();
        Element bEl = el("b");
        tb.pushActiveFormattingElements(bEl);
        assertTrue(tb.isInActiveFormattingElements(bEl));
        tb.removeFromActiveFormattingElements(bEl);
        assertFalse(tb.isInActiveFormattingElements(bEl));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = freshBuilder();
        Element bEl = el("b");
        tb.pushActiveFormattingElements(bEl);
        Element iEl = el("i");
        tb.replaceActiveFormattingElement(bEl, iEl);
        assertFalse(tb.isInActiveFormattingElements(bEl));
        assertTrue(tb.isInActiveFormattingElements(iEl));
    }

    @Test
    public void testReconstructFormattingElements_viaRealParse() {
        // Classic HTML5 "adoption agency"/formatting reconstruction example:
        // formatting element <b> must be reconstructed inside the second <p>.
        Document doc = Jsoup.parse("<p>One<b>Two<p>Three</b>Four</p>");
        assertEquals(2, doc.select("b").size());
    }

    // ---------- headElement / formElement getters-setters ----------

    @Test
    public void testHeadElementGetterSetter() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNull(tb.getHeadElement());
        Element head = el("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testFormElementGetterSetter() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNull(tb.getFormElement());
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        tb.setFormElement(form);
        assertSame(form, tb.getFormElement());
    }

    @Test
    public void testPendingTableCharacters_newAndGet() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNotNull(tb.getPendingTableCharacters());
        assertEquals(0, tb.getPendingTableCharacters().size());
        tb.getPendingTableCharacters().add("abc");
        assertEquals(1, tb.getPendingTableCharacters().size());
        tb.newPendingTableCharacters();
        assertEquals(0, tb.getPendingTableCharacters().size());
    }

    // ---------- inScope family ----------

    @Test
    public void testInScope_trueAndFalse() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html")); tb.push(el("body")); tb.push(el("div"));
        assertTrue(tb.inScope("div"));
        assertFalse(tb.inScope("span"));
    }

    @Test
    public void testInScope_stopsAtBaseType() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.push(el("html")); tb.push(el("table")); tb.push(el("td"));
        assertFalse(tb.inScope("div")); // hits "td" (a base type) before ever finding "div"
    }

    @Test
    public void testInScope_finalFallbackFalse_noMatchNoBaseType() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("div"));
        tb.push(el("span"));
        assertFalse(tb.inScope("xyz")); // exhausts stack, no target, no base type found
    }

    @Test
    public void testInScope_maxDepthBoundary_unreachableTarget() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("section")); // index 0 - target, but beyond search depth
        for (int i = 0; i < 150; i++) tb.push(el("div"));
        assertFalse(tb.inScope("section")); // bottom index unreachable due to MaxScopeSearchDepth
    }

    @Test
    public void testInScope_withinDepthBoundary_reachableTarget() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("section"));
        for (int i = 0; i < 50; i++) tb.push(el("div"));
        assertTrue(tb.inScope("section"));
    }

    @Test
    public void testInScope_arrayOverload() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("span"));
        assertTrue(tb.inScope(new String[]{"div", "span"}));
        assertFalse(tb.inScope(new String[]{"div", "p"}));
    }

    @Test
    public void testInListItemScope() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("html")); tb.push(el("ul")); tb.push(el("li"));
        assertTrue(tb.inListItemScope("li"));

        HtmlTreeBuilder tb2 = freshBuilder();
        tb2.getStack().clear();
        tb2.push(el("html")); tb2.push(el("ul")); tb2.push(el("div"));
        assertFalse(tb2.inListItemScope("li")); // hits "ul" extra type before finding target
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("html")); tb.push(el("button")); tb.push(el("div"));
        assertTrue(tb.inButtonScope("div"));

        HtmlTreeBuilder tb2 = freshBuilder();
        tb2.getStack().clear();
        tb2.push(el("html")); tb2.push(el("button"));
        assertFalse(tb2.inButtonScope("div")); // hits "button" extra type first
    }

    @Test
    public void testInTableScope() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("table")); tb.push(el("tr")); tb.push(el("td"));
        assertTrue(tb.inTableScope("table"));

        HtmlTreeBuilder tb2 = freshBuilder();
        tb2.getStack().clear();
        tb2.push(el("table")); tb2.push(el("tr"));
        assertFalse(tb2.inTableScope("caption")); // hits "table" base type first
    }

    @Test
    public void testInSelectScope_trueAndFalse() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("option")); tb.push(el("optgroup"));
        assertTrue(tb.inSelectScope("optgroup"));

        HtmlTreeBuilder tb2 = freshBuilder();
        tb2.getStack().clear();
        tb2.push(el("select")); tb2.push(el("option"));
        assertFalse(tb2.inSelectScope("missing")); // hits "select" (non optgroup/option) -> false
    }

    @Test
    public void testInSelectScope_exhaustedStack_throws() {
        // Derived directly from source: Validate.fail("Should not be reachable") when the entire
        // stack consists only of optgroup/option elements and the target is never found.
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("option"));
        tb.push(el("optgroup"));
        try {
            tb.inSelectScope("missingTarget");
            fail("Expected exception from Validate.fail()");
        } catch (RuntimeException expected) {
            // expected per source
        }
    }

    // ---------- parseFragment ----------

    @Test
    public void testParseFragment_nullContext_returnsDocChildren() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = Parser.htmlParser();
        List<Node> nodes = tb.parseFragment("<p>One</p><p>Two</p>", null, "http://example.com/", parser);
        assertTrue(tb.isFragmentParsing());
        assertNull(tb.getFormElement());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragment_formElementFoundInContextChain() {
        Document doc = Jsoup.parse("<form id=f1><div id=d1><span id=s1></span></div></form>");
        Element context = doc.getElementById("s1");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>x</p>", context, "http://example.com/", Parser.htmlParser());
        assertNotNull(tb.getFormElement());
        assertEquals("f1", tb.getFormElement().id());
    }

    @Test
    public void testParseFragment_formElementIsContextItself() {
        Document doc = Jsoup.parse("<form id=f1></form>");
        Element context = doc.getElementById("f1");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>x</p>", context, "http://example.com/", Parser.htmlParser());
        assertNotNull(tb.getFormElement());
        assertEquals("f1", tb.getFormElement().id());
    }

    @Test
    public void testParseFragment_noFormAncestor_formElementNull() {
        Document doc = Jsoup.parse("<div id=d2></div>");
        Element context = doc.getElementById("d2");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>x</p>", context, "http://example.com/", Parser.htmlParser());
        assertNull(tb.getFormElement());
    }

    @Test
    public void testParseFragment_quirksModePropagatesFromContextOwnerDoc() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body><div id=d></div></body></html>");
        Element context = doc.getElementById("d");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>hi</p>", context, "http://example.com/", Parser.htmlParser());
        assertEquals(doc.quirksMode(), tb.getDocument().quirksMode());
    }

    @Test
    public void testParseFragment_contextTagTriggersTokeniserTransitions_noException() {
        // NOTE: the tokeniser's internal state has no getter exposed, so we only verify that each
        // branch of the if/else chain executes without throwing and returns a non-null result.
        String[] contextTags = {"title", "textarea", "iframe", "noembed", "noframes", "style",
            "xmp", "script", "noscript", "plaintext", "div"};
        for (String tag : contextTags) {
            Element context = new Element(Tag.valueOf(tag), "http://example.com/");
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            List<Node> nodes = tb.parseFragment("<b>content</b>", context, "http://example.com/", Parser.htmlParser());
            assertNotNull("context=" + tag, nodes);
        }
    }

    @Test
    public void testParseFragment_titleContext_contentTreatedAsRawText() {
        // Known jsoup/HTML5 behavior: title/textarea content is tokenised as RCDATA, so no child
        // elements are created; the markup appears literally as a single text node.
        Element context = new Element(Tag.valueOf("title"), "http://example.com/");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context, "http://example.com/", Parser.htmlParser());
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof TextNode);
        assert